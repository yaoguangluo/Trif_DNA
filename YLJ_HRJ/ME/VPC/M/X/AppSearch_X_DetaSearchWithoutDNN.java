package ME.VPC.M.X;//package ME.VPC.M.app.X;
//
//import ME.VPC.M.app.App;
//import ME.VPC.S.App_S;
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
//public class AppSearch_X_DetaSearchWithoutDNN extends ScrollPane {
//    
//
//    //later pos
//    public int detaSearch(int[] score_code, String[] score
//        , DefaultTableModel newTableModel, Object[][] tableData_old, List<String> copy
//        , String key, IMV_SIQ dic_map, IMV_SIQ pos, App_S u, boolean keyIsPCA, App NE) {
//        u = NE.app_S;
//        boolean nullCheck = false;//今天优化下这个jingDuSouSuo函数。
//        //nullcheck一遍
//        if (null == key) {//把null key check提前, 搜索加快
//            nullCheck = true;
//        } else if (key.isEmpty()) {
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
//        int[] reg = new int[tableData_old.length];
//        int count = 0;
//        String trimKey = key.replace(" ", "");
//        int keyLength = key.length();
//        IMV_SIQ_SS mapSearchWithoutSort = null;
//        mapSearchWithoutSort = NE.app_S._A.parserMixStringByReturnFrequencyMap(key, NE);
//        List<String> list = new ArrayList<>();
//        int copyCount = 0;
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
//        for (int line = 0; line < tableData_old.length; line++) {
//            String stringTemp = new String();
//            for (int j = 0; j < tableData_old[0].length; j++) {
//                if (null != tableData_old[line][j]) {
//                    stringTemp += "_-_" + tableData_old[line][j].toString();
//                } else {
//                    stringTemp += "_-_ ";
//                }
//            }
//            String iteratorForCopyString = stringTemp.toString();
//            score[copyCount] = iteratorForCopyString;
//            String 待搜索词典 = stringTemp.toString();
//            Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
//            Here:
//            while (iteratorWordFrequency.hasNext()) {
//                String mapSearchaAtII = iteratorWordFrequency.next();
//                WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
//                if (待搜索词典.contains(mapSearchaAtII)) {
//                    if (reg[copyCount] == 0) {
//                        count += 1;
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
//                    if (!pos.containsKey(mapSearchaAtII)) {
//                        reg[copyCount] += 1;
//                        int wfs = wordFrequencySearch.get_frequency();
//                        wfs = wfs > 5 ? 5 : wfs;
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
//                    int wfs = wordFrequencySearch.get_frequency();
//                    wfs = wfs > 5 ? 5 : wfs;
//                    score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1)
//                        * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
//                        ? S_Maps.dongCi.containsKey(mapSearchaAtII) ? 45 : 1 : 50)
//                        << mapSearchaAtII.length() + wfs;
//                    continue Here;
//                }
//                if (mapSearchaAtII.length() > 1) {
//                    for (int j = 0; j < mapSearchaAtII.length(); j++) {
//                        String temp = "" + mapSearchaAtII.charAt(j);
//                        if (待搜索词典.contains(String.valueOf(temp))) {
//                            if (reg[copyCount] == 0) {
//                                count += 1;
//                            }
//                            score[copyCount] = iteratorForCopyString;
//                            score_code[copyCount] += 1;
//                            if (S_Maps.CiOne.containsKey(temp) && (
//                                S_Maps.mingCi.containsKey(temp)//later..
//                                    || S_Maps.dongCi.containsKey(temp)
//                                    || S_Maps.xingRongCi.containsKey(temp)
//                                    || S_Maps.weiCi.containsKey(temp)
//                            )) {
//                                reg[copyCount] += 2;
//                            }
//                            reg[copyCount] += 1;
//                            continue Here;
//                        }
//                    }
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
//89 //						if(u.shuming_filter_box.isSelected()) {
////							String temp= u.name_filter.getText().trim();
////							if(待搜索词典.contains(temp)) {
////								reg[copyCount]+= 0;
////								score_code[copyCount]+= 0;
////								continue Here;
////							}
////						}