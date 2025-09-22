package ME.VPC.M.X;//package ME.VPC.M.app.X;
//
//import ME.VPC.H.dnn.GetDNNMap;
//import ME.VPC.M.app.App;
//import ME.VPC.S.App_S;
//import P_V.PEQ.AMV.ECS.test.ANNTest;
//import P_V.PEQ.AMV.ECS.test.DNNTest;
//import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
//import P_V.PEQ.AMV.ECS.test.SensingTest;
//import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
//import S_A.SVQ.stable.S_Maps;
//import S_A.pheromone.IMV_SIQ;
//import S_A.pheromone.IMV_SIQ_SS;
//import U_V.ESU.list.List_ESU_X_listToArray;
//
//import javax.swing.table.DefaultTableModel;
//import java.awt.ScrollPane;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
///*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
// （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 // 208号 阳光家园别墅小区 第十栋别墅
// * */
////新增DNN搜索加权, 自带索引仅仅第一次运行耗时需要2分钟。之后保持在1秒内。
////DNN+前10-25 PCA算法优化 加精度调节
////179行加全文professionNameFilter
//public class AppFilter_X_detaSearch extends ScrollPane {
//    
//
//    //把德塔jingDuSouSuo的函数进行函数片段化去重,
//    //罗瑶光 202110121
//    public int detaSearch(int[] score_code, String[] score
//        , DefaultTableModel newTableModel, Object[][] tableData_old
//        , List<String> copy, String key, IMV_SIQ dic_map
//        , App_S u, boolean keyIsPCA, App NE) {
//        SensingTest sensingTest = null;
//        DNNTest dNNTest = null;
//        ANNTest aNNTest = null;
//        RNN_IDETest rNN_IDETest = null;
//        if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {
//            //DNN初始
//            sensingTest = u._A.getSensingTest();
//            dNNTest = new DNNTest();
//            aNNTest = new ANNTest();
//            rNN_IDETest = new RNN_IDETest();
//        }
//        boolean nullCheck = false;//今天优化下这个jingDuSouSuo函数。
//        //nullcheck一遍
//        if (null == key) {//把null key check提前, 搜索加快
//            nullCheck = true;
//        } else if (key.isEmpty()) {
//            nullCheck = true;
//        } else if (null == copy) {
//            nullCheck = true;
//        } else if (copy.isEmpty()) {
//            nullCheck = true;
//        } else if (null == dic_map) {
//            nullCheck = true;
//        } else if (dic_map.isEmpty()) {
//            nullCheck = true;
//        }
//        if (nullCheck) {
//            newTableModel.getDataVector().clear();
//            for (int i = 0; i < tableData_old.length; i++) {
//                newTableModel.insertRow(i, tableData_old[i]);
//            }
//            newTableModel.fireTableDataChanged();
//            return -1;
//        }
//        //
//        int[] reg = new int[copy.size()];
//        int count = 0;
//        String trimKey = key.replace(" ", "");
//        int keyLength = key.length();
//        IMV_SIQ_SS mapSearchWithoutSort = null;
//        mapSearchWithoutSort = u._A.parserMixStringByReturnFrequencyMap(key, NE);
//        Iterator<String> iteratorForCopy = copy.iterator();
//        int copyCount = 0;
//        //List<String> list= u._A.parserMixedString(key);
//        //这里用不到 list更多操作, 准备把frequencymap的key搞成list
//        List<String> list = new ArrayList<>();
//        Iterator<String> iterator = mapSearchWithoutSort.keySet().iterator();
//        while (iterator.hasNext()) {
//            list.add(iterator.next());
//        }
//        String[] string = List_ESU_X_listToArray._E(list);
//        StringBuilder[] stringReg = new StringBuilder[keyLength / 3];
//        for (int i = 0; i < stringReg.length; i++) {
//            stringReg[i] = new StringBuilder();
//            stringReg[i].append(key.substring(i * 3, (i * 3 + 3)
//                < keyLength ? (i * 3 + 3) : keyLength - 1));
//        }
//        while (iteratorForCopy.hasNext()) {
//            String iteratorForCopyString = iteratorForCopy.next();
//            score[copyCount] = iteratorForCopyString;
//            String 待搜索词典 = dic_map.get(iteratorForCopyString).toString();
//            IMV_SIQ dnnSet = new IMV_SIQ();
//            double perRatio = 0.0;
//            if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {
//                //DNN分析
//                try {
//                    if (null == u.DNNmap || u.DNNmap.isEmpty()) {
//                        u.DNNmap = GetDNNMap.doGetDNNMap(u, NE);
//                    }
//                    if (u.DNNmap.containsKey(iteratorForCopyString)) {
//                        dnnSet = u.DNNmap.get(iteratorForCopyString);
//                        double zongfen = dnnSet.getDouble("总分");
//                        perRatio = zongfen.isInfinite() ? 1 : zongfen;
//                        //dnnSet.remove("总分");//不参与搜索算子；
//                    }
//                    if (null == dnnSet || dnnSet.isEmpty()) {
//                        System.out.println("文档不完整--");
//                        String[][] ann = aNNTest.getANNMatrix(待搜索词典, NE);
//                        String[][] dnn = dNNTest.getDNNMatrix(ann, 待搜索词典, NE);
//                        for (String[] dnnTupe : dnn) {
//                            double ratio = Double.valueOf(dnnTupe[1]);
//                            dnnSet.put(dnnTupe[0], ratio);
//                            perRatio += ratio;
//                        }
//                        u.DNNmap.put(iteratorForCopyString, dnnSet);
//                    }
//                } catch (Exception e) {
//                    u.hook.hookFrequentException("DNN分析"
//                        , System.currentTimeMillis(), e);
//                }
//            }
//            Iterator<String> iteratorWordFrequency = mapSearchWithoutSort
//                .keySet().iterator();
//            Map<String, Double> DNNcountBonus = new IMV_SIQ();
//            double BonusFullRatio = 0.0;
//            Here:
//            while (iteratorWordFrequency.hasNext()) {
//                String mapSearchaAtII = iteratorWordFrequency.next();
//                WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
//                if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {
//                    //DNN计算
//                    if (dnnSet.containsKey(mapSearchaAtII)) {
//                        double BonusRatio = dnnSet.getDouble(mapSearchaAtII);
//                        double BonusPerRatio = BonusRatio / perRatio;
//                        if (BonusPerRatio > 0.1 - (u.lookrot * 0.003)) {
//                            BonusPerRatio = 2.0;
//                        }
//                        if (!DNNcountBonus.containsKey(mapSearchaAtII)) {
//                            BonusFullRatio += BonusPerRatio;
//                        }
//                        DNNcountBonus.put(mapSearchaAtII, BonusPerRatio);
//                    }
//                }
//                if (待搜索词典.contains(mapSearchaAtII)) {
//                    if (reg[copyCount] == 0) {
//                        count += 1;
//                    }
//                    if (u.shuming_filter_box.isSelected()) {
//                        String temp = u.name_filter.getText().trim();
//                        if (待搜索词典.contains(temp)) {
//                            reg[copyCount] += 0;
//                            score_code[copyCount] += 0;
//                            continue Here;
//                        }
//                    }
//                    score[copyCount] = iteratorForCopyString;
//                    if (keyIsPCA) {
//                        if (score[copyCount].contains(trimKey)) {
//                            reg[copyCount] += 500;
//                        }
//                        if (key.contains(score[copyCount].replace(" "
//                            , ""))) {
//                            reg[copyCount] += 500;
//                        }
//                    }
//                    int wfs = wordFrequencySearch.get_frequency();
//                    wfs = wfs > 5 ? 5 : wfs;
//                    if (!u.fMHMMListOneTime_E_X_S.posCnToCn.containsKey(mapSearchaAtII)) {
//                        reg[copyCount] += 1;
//                        score_code[copyCount] += 1 << mapSearchaAtII.length() << wfs;
//                        continue Here;
//                    }
//                    if (S_Maps.mingCi.containsKey(mapSearchaAtII)
//                        || S_Maps.dongCi.containsKey(mapSearchaAtII)
//                        || S_Maps.xingRongCi.containsKey(mapSearchaAtII)
//                        || S_Maps.weiCi.containsKey(mapSearchaAtII)) {
//                        reg[copyCount] += 2;
//                    }
//                    reg[copyCount] += 1;
//                    score_code[copyCount] += (iteratorForCopyString
//                        .contains(mapSearchaAtII) ? 2 : 1)
//                        * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
//                        ? S_Maps.dongCi.containsKey(mapSearchaAtII)
//                        ? 45 : 1 : 50) << mapSearchaAtII.length() + wfs;
//                    continue Here;
//                }
//                if (mapSearchaAtII.length() > 1) {
//                    for (int j = 0; j < mapSearchaAtII.length(); j++) {
//                        String stringTemp = "" + mapSearchaAtII.charAt(j);
//                        if (待搜索词典.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
//                            if (reg[copyCount] == 0) {
//                                count += 1;
//                            }
//                            score[copyCount] = iteratorForCopyString;
//                            score_code[copyCount] += 1;
//                            if (S_Maps.CiOne.containsKey(stringTemp) && (
//                                S_Maps.mingCi.containsKey(stringTemp)
//                                    || S_Maps.dongCi.containsKey(stringTemp)
//                                    || S_Maps.xingRongCi.containsKey(stringTemp)
//                                    || S_Maps.weiCi.containsKey(stringTemp)
//                            )) {
//                                reg[copyCount] += 2;
//                            }
//                            reg[copyCount] += 1;
//                            continue Here;
//                        }
//                    }
//                }
//            }
//            if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {
//                //DNN计算
//                if (!DNNcountBonus.isEmpty()) {
//                    score_code[copyCount] *= (1 + DNNcountBonus.size());
//                    score_code[copyCount] *= BonusFullRatio;
//                }
//            }
//            score_code[copyCount] = score_code[copyCount] * reg[copyCount];
//            //词距
//            int code = 100;
//            int jing_du_sou_suo_suan_zi = 0;
//            int zhi_hui_sou_suo_suan_zi = score_code[copyCount];
//            boolean 精度搜索 = false;
//            if (keyLength > 4) {
//                //全词
//                for (int i = 0; i < string.length; i++) {
//                    if (待搜索词典.contains(string[i])) {//因为用FrequencyMap代替, 所以要乘以频率。
//                        jing_du_sou_suo_suan_zi += code * mapSearchWithoutSort.getW(string[i]).get_frequency();
//                    }
//                }
//                for (int i = 0; i < stringReg.length; i++) {//断句
//                    if (待搜索词典.contains(stringReg[i].toString())) {
//                        jing_du_sou_suo_suan_zi += code;
//                    }
//                }
//                精度搜索 = true;
//            }
//            if (trimKey.length() > 1 && trimKey.length() < 5) {
//                if (待搜索词典.contains(trimKey)) {
//                    jing_du_sou_suo_suan_zi += code << 7;
//                }
//                精度搜索 = true;
//            }
//            if (精度搜索) {
//                double valuea = zhi_hui_sou_suo_suan_zi / Math.pow(u.lookrot + 1, 4);
//                double valueb = jing_du_sou_suo_suan_zi * Math.pow(u.lookrot + 1, 2);
//                valuea = valuea + valueb;
//                score_code[copyCount] = valuea;
////                score_code[copyCount] = (int) (zhi_hui_sou_suo_suan_zi / Math.pow(u.lookrot + 1, 4)
////                        + jing_du_sou_suo_suan_zi * Math.pow(u.lookrot + 1, 2));
//            }
//            copyCount++;
//        }
//        return count;
//    }
//}

//129- dnn 不同核心词汇bouns。
//罗瑶光先生定义dnn bonus由3个部分组成, 1 核心词汇数量, 2核心词汇的比值,
//3 核心词汇的频率（常规已经包含, 于是略）, 于是公式为 核心词汇的比值为其
//DNN的分数/DNN核心词汇总分, 核心词汇数量为 核心词汇的比值相加；
//获取dnn词汇原文分数
//原文分数的总分比值
//比值分数PCA前10~25
//总分比值的叠加, 只加第一次
//dnn 不同核心词汇bouns。
//reg[copyCount]+= DNNcountBonus.size();

//for(int j=0;j<temp.length();j++) {
//if(待搜索词典.contains(""+ temp.charAt(j))) {
//	reg[copyCount]+= 1;
//	score_code[copyCount]+= 1;
//	continue Here;
//}	
//}