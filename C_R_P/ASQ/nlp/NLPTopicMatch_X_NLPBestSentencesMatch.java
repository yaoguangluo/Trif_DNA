package ASQ.nlp;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;

import java.util.ArrayList;
import java.util.List;

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

public class NLPTopicMatch_X_NLPBestSentencesMatch {
    //<<NLP Algorithm of Matching The POS Scored Sentences>>.
    //This prediction algorithm mostly used for matching the ranged sample sentences by using score method.
    //Theory: Yaoguang.Luo 20191229
    //Application: Yaoguang.Luo
    //Attention: need Deta Parser API OSS
    //sortStackRange: for the sort stacks filter scale
    //filterRate: for how many sets need to delete
    public static List<String> _E(String searchString, String[] sampleSentences
        , int sortStackRange, double filterRate, App NE) {
        double[] matchScore = NLPTopicMatch_X_getNLPBestSentencesMatchScore
            ._E(searchString, sampleSentences, NE);
        //get iden key
        IMV_SIQ tempBase = new IMV_SIQ();
        for (int i = 0; i < matchScore.length; i++) {
            List<String> tempList;
            if (tempBase.containsKey(matchScore[i])) {
                tempList = tempBase.getListString(matchScore[i]);
            } else {
                tempList = new ArrayList<>();
            }
            tempList.add(sampleSentences[i]);
            tempBase.put(matchScore[i], tempList);
        }
        matchScore = new LYG9DWithDoubleTopSort4D().sort(matchScore, sortStackRange
            , 4);//算法应用更新
        double filterCount = filterRate * matchScore.length;
        //filter
        List<String> output = new ArrayList<>();
        for (int i = (int) filterCount; i < matchScore.length; i++) {
            if (tempBase.containsKey(matchScore[i])) {
                List<String> list = tempBase.getListString(matchScore[i]);
                output.addAll(list);
                tempBase.remove(matchScore[i]);
            }
        }
        //output
        return output;
    }
}
//44 //sort
//        //matchScore= new LYG4DWithDoubleQuickSort4D().sort(matchScore, sortStackRange);