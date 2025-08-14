package ASQ.nlp;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.list.List_ESU_X_listToArray;

import java.util.List;

//import OEU.LYG4DQS4D.LYG9DWithDoubleQuickSort4D;
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

public class NLPTopicMatch_X_NLPBestSentenceMatch {
    //<<NLP Algorithm of Matching The POS Scored Sentence>>.
    //This prediction algorithm mostly used for matching the best sample sentence by using score method.
    //Theory: Yaoguang.Luo 20191228
    //Application: Yaoguang.Luo
    //Attention: need Deta Parser API OSS
    public static String _E(String searchString, String[] sampleSentences, App NE) {
        //init the deta mixed parser engine.
        CogsBinaryForest_AE _A = NE.app_S._A;
//        _A.IV_Mixed(
////            emotionMap_E, nERO_C_OneTime_E
////                , nlp_CE_X_S, pos_X_P, sensingTest
////                , fMHMMListOneTime_E
////                , quick6DLuoYaoguangSort3DMap_E
//        );
        //init the nlp POS(part of speech) functions.
        IMV_SIQ nlp = _A.getPosCnToCn();
        List<String> keys = _A.parserMixedString(searchString);
        //find a appear frequency from the keys of search string.
        IMV_SIQ_SS keyMap = _A.getWordFrequencyMap(keys, NE);
        //get a POS score rights array from keyMap.
        String[] stringKeys = List_ESU_X_listToArray._E(keys);
        // I create a new algorithm of 'list to array' in my Data Swap Project.
        // 20191228 Yaoguang. Luo
        //	public static String[] listToArray(List<String> list) {
        //		String[] output= new String[list.size()];
        //		int outputPoint= 0;
        //		Iterator<String> iterator= list.iterator();
        //		while(iterator.hasNext()) {
        //			output[outputPoint++]= iterator.next();
        //		}
        //		return output;
        //	}
        double[] scoreRights
            = NLPTopicMatch_X_getNLPBestSentencesMatchScoreRights._E(nlp, keyMap);
        //loop score array
        double[] matchScore = new double[sampleSentences.length];
        double max = 0.0;
        int maxPoint = 0;
        for (int i = 0; i < sampleSentences.length; i++) {
            List<String> matchList = _A.parserMixedString(sampleSentences[i]);
            IMV_SIQ_SS matchMap = _A.getWordFrequencyMap(matchList, NE);
            for (int j = 0; j < stringKeys.length; j++) {
                if (matchMap.containsKey(stringKeys[j])) {
                    matchScore[i] += scoreRights[j] * matchMap.getW(stringKeys[j]).get_frequency();
                }
            }
            if (max < matchScore[i]) {
                max = matchScore[i];
                maxPoint = i;
            }
        }
        //output
        return sampleSentences[maxPoint];
    }
}
