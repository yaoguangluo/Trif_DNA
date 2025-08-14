package ME.VPC.M.X;
import ME.VPC.S.ne.App_S;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;

import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class AppSearch_X_DetaSearchWithDNN extends ScrollPane {
    

    //later do cartesian actions interaction.
    public int detaSimpleSearch(int[] score_code, String[] score
        , DefaultTableModel newTableModel, String key, boolean keyIsPCA, int[] identifyColumns
        , String fileNamePrefix, String[] scoreOutput, List<Object> tableData_oldListObjects
        , String identifyParser, App NE) {
        int count = 0;
        App_S u = NE.app_S;
        try {
            boolean dnnIsSelected = u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected();
            int[] reg = new int[tableData_oldListObjects.size()];
            String trimKey = key.replace(" ", "").trim();
            int keyLength = key.length();
            IMV_SIQ_SS mapSearchWithoutSort = null;
            mapSearchWithoutSort = u._A.parserMixStringByReturnFrequencyMap(key, NE);
            u._A.initPCAWordPOS(mapSearchWithoutSort, NE);
            int copyCount = 0;
            StringBuilder[] stringReg = new StringBuilder[keyLength / 3];
            for (int i = 0; i < stringReg.length; i++) {
                stringReg[i] = new StringBuilder();
                int i3 = i / 3;
                stringReg[i].append(key.substring(i3, (i3 + 3) < keyLength ? (i3 + 3) : keyLength - 1));
            }
            Iterator<Object> iterators = tableData_oldListObjects.iterator();
            while (iterators.hasNext()) {
                int tempLookrot = u.lookrot >> 1;
                String iteratorForCopyString = iterators.next().toString();
                StringBuilder identifyString = new StringBuilder();
                String[] columns = iteratorForCopyString.split(identifyParser);
                for (int i = 0; i < identifyColumns.length; i++) {
                    identifyString.append(columns[i + 1]);
                }
                scoreOutput[copyCount] = iteratorForCopyString;
                Map<String, Double> dnnSet = new IMV_SIQ();
                double perRatio = 0.0;
                if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {//DNN分析
                    if (u.DNNmap.containsKey(identifyString.toString())) {
                        dnnSet = u.DNNmap.get(identifyString.toString());
                        double zongfen = dnnSet.get("总分");
                        perRatio = zongfen;//.isInfinite() ? 1 : zongfen;
                    }
                }
                Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
                Map<String, Double> DNNcountBonus = new IMV_SIQ();
                double BonusFullRatio = 0.0;
                Here:
                while (iteratorWordFrequency.hasNext()) {
                    String mapSearchaAtII = iteratorWordFrequency.next();
                    WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                    String posString = wordFrequencySearch.get_pos();
                    if (dnnIsSelected) {
                        if (dnnSet.containsKey(mapSearchaAtII)) {
                            double BonusRatio = dnnSet.get(mapSearchaAtII).doubleValue();
                            double BonusPerRatio = BonusRatio / perRatio;
                            if (BonusPerRatio > 0.1 - (tempLookrot >> 7)) {
                                BonusPerRatio = 2.0;
                            }
                            if (!DNNcountBonus.containsKey(mapSearchaAtII)) {
                                BonusFullRatio += BonusPerRatio;
                            }
                            DNNcountBonus.put(mapSearchaAtII, BonusPerRatio);
                        }
                    }
                    boolean temp = iteratorForCopyString.contains(mapSearchaAtII);
                    if (temp) {
                        if (reg[copyCount] == 0) {
                            count += 1;
                        }
                        score[copyCount] = iteratorForCopyString;
                        if (keyIsPCA) {
                            if (iteratorForCopyString.contains(trimKey)) {
                                reg[copyCount] += 500;
                            }
                            if (key.contains(iteratorForCopyString)) {
                                reg[copyCount] += 500;
                            }
                        }
                        if (null == posString || posString.isEmpty()) {
                            reg[copyCount] += 1;
                            int wfs = (int)wordFrequencySearch.get_frequency();
                            wfs = wfs > 5 ? 5 : wfs;
                            score_code[copyCount] += 1 << mapSearchaAtII.length() << wfs;
                            continue Here;
                        }
                        if (posString.contains("名") || posString.contains("动")
                            || posString.contains("形") || posString.contains("谓")) {
                            reg[copyCount] += 2;
                        }
                        reg[copyCount] += 1;
                        int wfs = (int)wordFrequencySearch.get_frequency();
                        wfs = wfs > 5 ? 5 : wfs;
                        score_code[copyCount] += (!posString.contains("名")
                            ? posString.contains("动") ? 45 : 1 : 50) << (temp ? 2 : 1)
                            << mapSearchaAtII.length() + wfs;
                        continue Here;
                    }
                    if (mapSearchaAtII.length() > 1) {
                        for (int j = 0; j < mapSearchaAtII.length(); j++) {
                            String stringTemp = "" + mapSearchaAtII.charAt(j);
                            if (iteratorForCopyString.contains(stringTemp)) {
                                if (reg[copyCount] == 0) {
                                    count += 1;
                                }
                                score[copyCount] = iteratorForCopyString;
                                score_code[copyCount] += 1;
                                reg[copyCount] += 1;
                                if (S_Maps.CiOne.containsKey(stringTemp)
                                    && (S_Maps.mingCi.containsKey(stringTemp)
                                    || S_Maps.dongCi.containsKey(stringTemp)
                                    || S_Maps.xingRongCi.containsKey(stringTemp)
                                    || S_Maps.weiCi.containsKey(stringTemp)
                                )) {
                                    reg[copyCount] += 2;
                                }
                                continue Here;
                            }
                        }
                    }
                }
                if (dnnIsSelected) {
                    if (!DNNcountBonus.isEmpty()) {
                        score_code[copyCount] *= (1 + DNNcountBonus.size());
                        score_code[copyCount] *= BonusFullRatio;
                    }
                }
                score_code[copyCount] = score_code[copyCount] * reg[copyCount];
                //词距
                int last = -1;
                int has = 0;
                int code = 100;
                int jing_du_sou_suo_suan_zi = 0;
                int zhi_hui_sou_suo_suan_zi = score_code[copyCount];
                tempLookrot = u.lookrot + 2;
                if (iteratorForCopyString.contains(trimKey)) {
                    jing_du_sou_suo_suan_zi += code << tempLookrot;
                }
                for (int i = 1; i <= stringReg.length; i++) {//断句
                    if (iteratorForCopyString.contains(stringReg[i - 1].toString())) {
                        last = last == i - 1 ? has++ : 0;
                        jing_du_sou_suo_suan_zi += code << (tempLookrot + last);
                        last = i;
                    }
                }
                if (0 != jing_du_sou_suo_suan_zi) {
                    score_code[copyCount] = (zhi_hui_sou_suo_suan_zi >> (tempLookrot - 2)
                        + jing_du_sou_suo_suan_zi << (tempLookrot - 1));
                }
                copyCount++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            u.hook.hookFrequentException("搜索问题", System.currentTimeMillis(), e);
        }
        return count;
    }
}