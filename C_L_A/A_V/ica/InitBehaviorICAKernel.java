package A_V.ica;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_X_;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
public class InitBehaviorICAKernel {
    private double[] kernel;

    public double[] getKernel() {
        return kernel;
    }

    public List<String> getForRestReturn() {
        return forRestReturn;
    }

    private List<String> forRestReturn;

    public double getTrustRate(String text, App NE) {
        EmotionInit emotionInitEnvironment = NE.app_S.emotionInit;
        emotionInitEnvironment.IV_(text, NE);
        double positiveCountEnvironment = emotionInitEnvironment.getPositiveCount();
        double totalCountEnvironment = emotionInitEnvironment.getTotalCount();
        positiveCountEnvironment += S_Pos.INT_ONE;
        return positiveCountEnvironment / totalCountEnvironment;
    }

    public double[] getBehaviorICAKernel(String text, App NE) {
        forRestReturn = new LinkedList<>();
        kernel = new double[S_Pos.INT_SEVEN];
        //EmotionInit emotionInit= emotionInit;
        NE.app_S.emotionInit.IV_(text, NE);
        double positiveCount = NE.app_S.emotionInit.getPositiveCount();
        double negativeCount = NE.app_S.emotionInit.getNegativeCount();
        double totalCount = NE.app_S.emotionInit.getTotalCount();
        forRestReturn.add("正面情感：" + positiveCount);
        forRestReturn.add("负面情感：" + negativeCount);
        if (positiveCount == S_Pos.INT_ZERO) {
            positiveCount = 1.0;
        }
        if (negativeCount == S_Pos.INT_ZERO) {
            negativeCount = 1.0;
        }
        double adjRatio = Math.abs(positiveCount / negativeCount
            - negativeCount / positiveCount);
        forRestReturn.add("渲染比率：" + adjRatio);
        double phychologicRatio = (positiveCount + negativeCount) / totalCount;
        forRestReturn.add("情绪比率：" + phychologicRatio);
        double infectionRatio = adjRatio * phychologicRatio;
        forRestReturn.add("感染比率：" + infectionRatio);
        kernel[S_Pos.INT_ZERO] = adjRatio;
        kernel[S_Pos.INT_ONE] = phychologicRatio;
        kernel[S_Pos.INT_TWO] = infectionRatio;
        EnvironmentInit environmentInit = NE.app_S.environmentInit;//new EnvironmentInit();//later
        environmentInit.IV_FromEmotion(NE.app_S.emotionInit.getWordFrequencyMap(), NE);
        IMV_SIQ_X_ environmentSampleMap = environmentInit.getEmotionSampleMap();
        forRestReturn.add("观测角度：");
        String environmentText = "";
        Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);//later..
            if (null != NE.app_S.emotionSample.getDistinction()) {
                environmentText += NE.app_S.emotionSample.getDistinction()
                    + S_Pos.SPACE_STRING;
            }
        }
        forRestReturn.add(environmentText);
        kernel[S_Pos.INT_THREE] = getTrustRate(environmentText, NE);
        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_THREE]);
        forRestReturn.add("信任比率：");
        String motivationText = S_Pos.EMPTY_STRING;
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);//later s-w
            if (null != NE.app_S.emotionSample.getMotivation()) {
                if (NE.app_S.emotionSample.getMotivation().contains("语料库")) {
                    continue;
                }
                motivationText += NE.app_S.emotionSample.getMotivation()
                    + S_Pos.SPACE_STRING;
            }
        }
        forRestReturn.add(motivationText);
        kernel[S_Pos.INT_FOUR] = getTrustRate(motivationText, NE);//distincguide with old version later
        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_FOUR]);
        forRestReturn.add("执行比率：");
        String trendingText = S_Pos.EMPTY_STRING;
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != NE.app_S.emotionSample.getTrending()) {
                if (NE.app_S.emotionSample.getTrending().contains("语料库")) {
                    continue;
                }
                trendingText += NE.app_S.emotionSample.getTrending()
                    + S_Pos.SPACE_STRING;
            }
        }
        forRestReturn.add(trendingText);
        kernel[S_Pos.INT_FIVE] = getTrustRate(trendingText, NE);
        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_FIVE]);
        forRestReturn.add("成功比率：");
        String predictionText = S_Pos.EMPTY_STRING;
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = environmentSampleMap.get_S(word);
            if (null != NE.app_S.emotionSample.getPrediction()) {
                if (NE.app_S.emotionSample.getPrediction().contains("语料库")) {
                    continue;
                }
                predictionText += NE.app_S.emotionSample.getPrediction()
                    + S_Pos.SPACE_STRING;
            }
        }
        forRestReturn.add(predictionText);
        kernel[S_Pos.INT_SIX] = getTrustRate(predictionText, NE);
        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_SIX]);
        return kernel;
    }
}
//    public double[]  getBehaviorICAKernel(String text) {
//        forRestReturn = new LinkedList<>();
//        kernel = new double[S_Pos.INT_SEVEN];
//        NE.app_S.emotionInit.IV_Exclude_A(text);
//        double positiveCount = NE.app_S.emotionInit.getPositiveCount();
//        double negativeCount = NE.app_S.emotionInit.getNegativeCount();
//        double totalCount = NE.app_S.emotionInit.getTotalCount();
//        forRestReturn.add("正面情感：" + positiveCount);
//        forRestReturn.add("负面情感：" + negativeCount);
//        if (positiveCount == S_Pos.INT_ZERO) {
//            positiveCount = 1.0;
//        }
//        if (negativeCount == S_Pos.INT_ZERO) {
//            negativeCount = 1.0;
//        }
//        double adjRatio = Math.abs(positiveCount / negativeCount
//                - negativeCount / positiveCount);
//        forRestReturn.add("渲染比率：" + adjRatio);
//        double phychologicRatio = (positiveCount + negativeCount) / totalCount;
//        forRestReturn.add("情绪比率：" + phychologicRatio);
//        double infectionRatio = adjRatio * phychologicRatio;
//        forRestReturn.add("感染比率：" + infectionRatio);
//        kernel[S_Pos.INT_ZERO] = adjRatio;
//        kernel[S_Pos.INT_ONE] = phychologicRatio;
//        kernel[S_Pos.INT_TWO] = infectionRatio;
//        NE.app_S.environmentInit.IV_FromEmotionExcludeEmotion(NE.app_S.emotionInit.getWordFrequencyMap());
//        Map<String, EmotionSample> environmentSampleMap
//                = NE.app_S.environmentInit.getEmotionSampleMap();
//        forRestReturn.add("观测角度：");
//        String environmentText = S_Pos.EMPTY_STRING;
//        Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
//        while (Iterator.hasNext()) {
//            String word = Iterator.next();
//            NE.app_S.emotionSample = environmentSampleMap.get(word);
//            if (null != NE.app_S.emotionSample.getDistinction()) {
//                environmentText += NE.app_S.emotionSample.getDistinction() + S_Pos.SPACE_STRING;
//            }
//        }
//        forRestReturn.add(environmentText);
//        kernel[S_Pos.INT_THREE] = getTrustRate(environmentText);
//        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_THREE]);
//        forRestReturn.add("信任比率：");
//        String motivationText = S_Pos.EMPTY_STRING;
//        Iterator = environmentSampleMap.keySet().iterator();
//        while (Iterator.hasNext()) {
//            String word = Iterator.next();
//            NE.app_S.emotionSample = environmentSampleMap.get(word);
//            if (null != NE.app_S.emotionSample.getMotivation()) {
//                motivationText += NE.app_S.emotionSample.getMotivation()
//                    + S_Pos.SPACE_STRING;
//            }
//        }
//        forRestReturn.add(motivationText);
//        kernel[S_Pos.INT_FOUR] = getTrustRate(motivationText);
//        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_FOUR]);
//        forRestReturn.add("执行比率：");
//        String trendingText = S_Pos.EMPTY_STRING;
//        Iterator = environmentSampleMap.keySet().iterator();
//        while (Iterator.hasNext()) {
//            String word = Iterator.next();
//            NE.app_S.emotionSample = environmentSampleMap.get(word);
//            if (null != NE.app_S.emotionSample.getTrending()) {
//                trendingText += NE.app_S.emotionSample.getTrending()
//                    + S_Pos.SPACE_STRING;
//            }
//        }
//        forRestReturn.add(trendingText);
//        kernel[S_Pos.INT_FIVE] = getTrustRate(trendingText);
//        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_FIVE]);
//        forRestReturn.add("成功比率：");
//        String predictionText = S_Pos.EMPTY_STRING;
//        Iterator = environmentSampleMap.keySet().iterator();
//        while (Iterator.hasNext()) {
//            String word = Iterator.next();
//            NE.app_S.emotionSample = environmentSampleMap.get(word);
//            if (null != NE.app_S.emotionSample.getPrediction()) {
//                predictionText += NE.app_S.emotionSample.getPrediction()
//                    + S_Pos.SPACE_STRING;
//            }
//        }
//        forRestReturn.add(predictionText);
//        kernel[S_Pos.INT_SIX] = getTrustRate(predictionText);
//        forRestReturn.add(S_Pos.EMPTY_STRING + kernel[S_Pos.INT_SIX]);
//        return kernel;
//    }
//45

//reduce later.
//    public double getTrustRate(String text) {
//        EmotionInit emotionInitEnvironment = NE.app_S.emotionInit;
//        emotionInitEnvironment.IV_Exclude_A(text);
//        //reduce
//        double positiveCountEnvironment = emotionInitEnvironment.getPositiveCount();
//        double totalCountEnvironment = emotionInitEnvironment.getTotalCount();
//        positiveCountEnvironment += S_Pos.INT_ONE;
//        return positiveCountEnvironment / totalCountEnvironment;
//    }

//32
//    public void I_Kernel(double[]  kernel) {
//        this.kernel = kernel;
//    }
//    public void I_ForRestReturn(List<String> forRestReturn) {
//        this.forRestReturn = forRestReturn;
//    }