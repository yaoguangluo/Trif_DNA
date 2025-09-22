package ASQ.nlp;

import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.Iterator;
import java.util.Map;

//import OSI.PCI.ASQ.statistic.LYG4DWithDoubleQuickSort4D;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class NLPTopicMatch_X_getNLPBestSentencesMatchScoreRights {
    public static double[] _E(Map<String, String> nlp, IMV_SIQ_SS keyMap) {
        double[] scoreRights = new double[keyMap.size()];
        int scoreRightsPoint = 0;
        Iterator<String> keyIterator = keyMap.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            if (nlp.containsKey(key)) {
                String pos = nlp.get(key);
                //init rights of POS {30, 20, 10, 3, 1}
                if (pos.contains(S_Pos.NLP_CI_MING)) {// n.
                    scoreRights[scoreRightsPoint] = 30 * keyMap.getW(key).get_frequency();
                } else if (pos.contains(S_Pos.NLP_CI_DONG)) {//v
                    scoreRights[scoreRightsPoint] = 20 * keyMap.getW(key).get_frequency();
                } else if (pos.contains(S_Pos.NLP_CI_XING_RONG)) {//adj
                    scoreRights[scoreRightsPoint] = 10 * keyMap.getW(key).get_frequency();
                } else {
                    scoreRights[scoreRightsPoint] = 3 * keyMap.getW(key).get_frequency();
                }
            } else {
                scoreRights[scoreRightsPoint] = 1 * keyMap.getW(key).get_frequency();
            }
            scoreRightsPoint++;
        }
        return scoreRights;
    }
}
