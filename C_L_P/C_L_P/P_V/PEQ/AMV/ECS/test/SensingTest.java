/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package P_V.PEQ.AMV.ECS.test;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Pos;
import S_A.SVQ.stable.S_String;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_S_;
import S_A.pheromone.IMV_SIQ_X_;

import java.util.Iterator;
import java.util.List;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class SensingTest {
    private String text = S_String.text1;

    public List<String> getSets() {
        return sets;
    }

    public void I_Sets(List<String> sets) {
        this.sets = sets;
    }

    public IMV_SIQ getPosCnToCn() {
        return this.pos;
    }

    private List<String> sets;
    private IMV_SIQ pos;

    public String[][] getMatrix(String text, App NE) {
        this.text = text;
        return this.getMatrix(NE);
    }

    public String[][] getMatrix(App NE) {
        //初始化函数
        CogsBinaryForest_AE _A = NE.app_S._A;
        //_A.IV_Mixed();
        //初始化表
        pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        IMV_SIQ positive = NE.app_S.emotionMap_E.getPositiveMap();
        IMV_SIQ negative = NE.app_S.emotionMap_E.getNegativeMap();
        IMV_SIQ motivation = NE.app_S.emotionMap_E.getMotivationMap();
        IMV_SIQ trending = NE.app_S.emotionMap_E.getTrendingMap();
        IMV_SIQ prediction = NE.app_S.emotionMap_E.getPredictionMap();
        //进行输入分词
        sets = _A.parserMixedString(this.text);
        IMV_SIQ_S_ wordFrequencyMap = _A.getWordFrequencyByReturnSortMap(sets, NE);
        //RatioMap rationMap= new RatioMap_E();
        //获取一个表集列准备init
        IMV_SIQ_X_ emotionSampleMap = NE.app_S.ratioMap
            .getEmotionSampleMap(wordFrequencyMap, positive, negative, NE);
        //获取表集的总属性
        double positiveCount = NE.app_S.ratioMap.findTotalPositiveCount(emotionSampleMap);
        double negativeCount = NE.app_S.ratioMap.findTotalNegativeCount(emotionSampleMap);
        double totalCount = NE.app_S.ratioMap.findTotalKeyCount(emotionSampleMap);
        double medCount = totalCount - (positiveCount + negativeCount);
        //表集的内部关联总注册。
        NE.app_S.ratioMap.IQ_Motivation(emotionSampleMap, motivation);
        NE.app_S.ratioMap.IQ_Trending(emotionSampleMap, trending);
        NE.app_S.ratioMap.IQ_Prediction(emotionSampleMap, prediction);
        NE.app_S.ratioMap.IQ_EmotionRatio(emotionSampleMap, positiveCount, negativeCount, medCount);
        NE.app_S.ratioMap.IQ_MotivationRatio(emotionSampleMap, totalCount);
        NE.app_S.ratioMap.IQ_CorrelationRatio(emotionSampleMap, totalCount);
        double emotionRatio = Math.abs(positiveCount / negativeCount - negativeCount / positiveCount);
        NE.app_S.ratioMap.IQ_ContinusRatio(emotionSampleMap, emotionRatio);
        NE.app_S.ratioMap.IQ_TrendsRatio(emotionSampleMap);
        NE.app_S.ratioMap.IQ_PredictionRatio(emotionSampleMap);
        NE.app_S.ratioMap.IQ_GuessRatio(emotionSampleMap);
        NE.app_S.ratioMap.IQ_SensingRatio(emotionSampleMap);
        //
        String[][] DNNMatrix = new String[emotionSampleMap.size()][15];
        Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
        int count = S_Pos.INT_ZERO;
        //内部计算
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            NE.app_S.emotionSample = emotionSampleMap.get_S(word);
            DNNMatrix[count][S_Pos.INT_ZERO] = word;
            DNNMatrix[count][S_Pos.INT_ONE] = NE.app_S.emotionSample.getMotivation();
            DNNMatrix[count][S_Pos.INT_TWO] = NE.app_S.emotionSample.getTrending();
            DNNMatrix[count][S_Pos.INT_THREE] = NE.app_S.emotionSample.getPrediction();
            DNNMatrix[count][S_Pos.INT_FOUR] = S_Pos.EMPTY_STRING
                + NE.app_S.emotionSample.getPositiveCount();
            DNNMatrix[count][S_Pos.INT_FIVE] = S_Pos.EMPTY_STRING
                + NE.app_S.emotionSample.getMedCount();
            DNNMatrix[count][S_Pos.INT_SIX] = S_Pos.EMPTY_STRING
                + NE.app_S.emotionSample.getNegativeCount();
            DNNMatrix[count][S_Pos.INT_SEVEN] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getEmotionRatio() * 10000);
            DNNMatrix[count][S_Pos.INT_EIGHT] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getMotivationRatio() * 100000);
            DNNMatrix[count][S_Pos.INT_NINE] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getCorrelationRatio() * 10000);
            DNNMatrix[count][S_Pos.INT_TEN] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getContinusRatio() * 10);
            DNNMatrix[count][S_Pos.INT_ELEVEN] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getTrendsRatio() * 100000);
            DNNMatrix[count][S_Pos.INT_TWELVE] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getPredictionRatio() * 10000 * 1000);
            DNNMatrix[count][S_Pos.INT_THIRTEEN] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getGuessRatio() * 100000 * 100000);
            DNNMatrix[count][S_Pos.INT_FOURTEEN] = S_Pos.EMPTY_STRING
                + (int) (NE.app_S.emotionSample.getSensingRatio() * 100000);
            count++;
        }
        return DNNMatrix;
    }

    public static void main(String[] argv) {
        App NE = new App();
        SensingTest sensingTest = new SensingTest();
        sensingTest.getMatrix(NE);
    }
}
//49         //EmotionMap emotionMap= new EmotionMap_E();
////        emotionMap.IV_MotivationMap();
////        emotionMap.IV_NegativeMap();
////        emotionMap.IV_PositiveMap();
////        emotionMap.IV_TrendingMap();
////        emotionMap.IV_PredictionMap();
//        //A _A= new CogsBinaryForest_AE();

//120 //    public String[][] getMatrix(String text) {
////        pos = NE.app_S._A.getPosCnToCn();
////        EmotionMap emotionMap = NE.app_S._A.getEmotionMap();
////        IMV_SIQ positive = emotionMap.getPositiveMap();
////        IMV_SIQ negative = emotionMap.getNegativeMap();
////        IMV_SIQ motivation = emotionMap.getMotivationMap();
////        IMV_SIQ trending = emotionMap.getTrendingMap();
////        IMV_SIQ prediction = emotionMap.getPredictionMap();
////        sets = NE.app_S._A.parserMixedString(text);
////        Map<Integer, WordFrequency> wordFrequencyMap
////                = NE.app_S._A.getWordFrequencyByReturnSortMap(sets);
////        //RatioMap rationMap = new RatioMap_E();
////        Map<String, EmotionSample> emotionSampleMap
////                = NE.app_S.ratioMap.getEmotionSampleMap(wordFrequencyMap
////                , positive, negative);
////        double positiveCount = NE.app_S.ratioMap.findTotalPositiveCount(emotionSampleMap);
////        double negativeCount = NE.app_S.ratioMap.findTotalNegativeCount(emotionSampleMap);
////        double totalCount = NE.app_S.ratioMap.findTotalKeyCount(emotionSampleMap);
////        double medCount = totalCount - (positiveCount + negativeCount);
////        NE.app_S.ratioMap.IQ_Motivation(emotionSampleMap, motivation);
////        NE.app_S.ratioMap.IQ_Trending(emotionSampleMap, trending);
////        NE.app_S.ratioMap.IQ_Prediction(emotionSampleMap, prediction);
////        NE.app_S.ratioMap.IQ_EmotionRatio(emotionSampleMap, positiveCount
////                , negativeCount, medCount);
////        NE.app_S.ratioMap.IQ_MotivationRatio(emotionSampleMap, totalCount);
////        NE.app_S.ratioMap.IQ_CorrelationRatio(emotionSampleMap, totalCount);
////        double emotionRatio = Math.abs(positiveCount / negativeCount
////                - negativeCount / positiveCount);
////        NE.app_S.ratioMap.IQ_ContinusRatio(emotionSampleMap, emotionRatio);
////        NE.app_S.ratioMap.IQ_TrendsRatio(emotionSampleMap);
////        NE.app_S.ratioMap.IQ_PredictionRatio(emotionSampleMap);
////        NE.app_S.ratioMap.IQ_GuessRatio(emotionSampleMap);
////        NE.app_S.ratioMap.IQ_SensingRatio(emotionSampleMap);
////        String[][] DNNMatrix = new String[emotionSampleMap.size()][15];
////        Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
////        int count = S_Pos.INT_ZERO;
////        while (Iterator.hasNext()) {
////            String word = Iterator.next();
////            NE.app_S.emotionSample = emotionSampleMap.get(word);
////            DNNMatrix[count][S_Pos.INT_ZERO] = word;
////            DNNMatrix[count][S_Pos.INT_ONE] = NE.app_S.emotionSample.getMotivation();
////            DNNMatrix[count][S_Pos.INT_TWO] = NE.app_S.emotionSample.getTrending();
////            DNNMatrix[count][S_Pos.INT_THREE] = NE.app_S.emotionSample.getPrediction();
////            DNNMatrix[count][S_Pos.INT_FOUR] = S_Pos.EMPTY_STRING
////                    + NE.app_S.emotionSample.getPositiveCount();
////            DNNMatrix[count][S_Pos.INT_FIVE] = S_Pos.EMPTY_STRING
////                    + NE.app_S.emotionSample.getMedCount();
////            DNNMatrix[count][S_Pos.INT_SIX] = S_Pos.EMPTY_STRING
////                    + NE.app_S.emotionSample.getNegativeCount();
////            DNNMatrix[count][S_Pos.INT_SEVEN] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getEmotionRatio() * 10000);
////            DNNMatrix[count][S_Pos.INT_EIGHT] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getMotivationRatio() * 100000);
////            DNNMatrix[count][S_Pos.INT_NINE] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getCorrelationRatio() * 10000);
////            DNNMatrix[count][S_Pos.INT_TEN] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getContinusRatio() * 10);
////            DNNMatrix[count][S_Pos.INT_ELEVEN] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getTrendsRatio() * 100000);
////            DNNMatrix[count][S_Pos.INT_TWELVE] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getPredictionRatio() * 10000 * 1000);
////            DNNMatrix[count][S_Pos.INT_THIRTEEN] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getGuessRatio() * 10000 * 10000);
////            DNNMatrix[count][S_Pos.INT_FOURTEEN] = S_Pos.EMPTY_STRING
////                    + (int) (NE.app_S.emotionSample.getSensingRatio() * 100000);
////            count++;
////        }
////        return DNNMatrix;
////    }
