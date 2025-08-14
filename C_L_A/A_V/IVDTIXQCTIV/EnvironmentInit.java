package A_V.IVDTIXQCTIV;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;
import VSQ.parser.EnvironmentInit_X_S;
import S_A.pheromone.IMV_SIQ_S_;
import S_A.pheromone.IMV_SIQ_X_;

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
public class EnvironmentInit extends EnvironmentInit_X_S {
    @SuppressWarnings("unused")
    public static void main(String[] argv) {
        EnvironmentInit environmentInit = new EnvironmentInit();
        environmentInit.IV_(S_String.text1, new App());
        IMV_SIQ_X_ environmentSampleMap = environmentInit.getEmotionSampleMap();
    }

    public void IV_(String text, App NE) {
        emotionMap = NE.app_S.emotionMap_E;
        _A = NE.app_S._A;
        motivation = emotionMap.getMotivationMap();
        trending = emotionMap.getTrendingMap();
        prediction = emotionMap.getPredictionMap();
        distinction = emotionMap.getDistinctionMap();
        //sets= _A.parserMixedString(text);//稍后统一更新下接口为parserMixedString
        sets = _A.parserMixedString(text);//
        wordFrequencyMap = _A.getWordFrequencyByReturnSortMap(sets, NE);
        rationMap = NE.app_S.ratioMap_E;//later。。局部对象需要重新单例 iv text，不能apps取。
        emotionSampleMap = rationMap.getEnvironmentSampleMap(wordFrequencyMap);
        rationMap.IQ_Motivation(emotionSampleMap, motivation);
        rationMap.IQ_Trending(emotionSampleMap, trending);
        rationMap.IQ_Prediction(emotionSampleMap, prediction);
        rationMap.IQ_Distinction(emotionSampleMap, distinction);
    }

    public void IV_Exclude_A(String text, App NE) {
        emotionMap = NE.app_S.emotionMap_E;
        _A = NE.app_S._A;
        motivation = emotionMap.getMotivationMap();//later
        trending = emotionMap.getTrendingMap();
        prediction = emotionMap.getPredictionMap();
        distinction = emotionMap.getDistinctionMap();
        sets = _A.parserString(text);
        wordFrequencyMap = _A.getWordFrequencyByReturnSortMap(sets, NE);
        rationMap = NE.app_S.ratioMap_E;
        emotionSampleMap = rationMap.getEnvironmentSampleMap(wordFrequencyMap);
        rationMap.IQ_Motivation(emotionSampleMap, motivation);
        rationMap.IQ_Trending(emotionSampleMap, trending);
        rationMap.IQ_Prediction(emotionSampleMap, prediction);
        rationMap.IQ_Distinction(emotionSampleMap, distinction);
    }

    public void IV_FromEmotion(IMV_SIQ_S_ getWordFrequencyMap, App NE) {
        emotionMap = NE.app_S.emotionMap_E;
        //parser sentence
        motivation = emotionMap.getMotivationMap();
        trending = emotionMap.getTrendingMap();
        prediction = emotionMap.getPredictionMap();
        distinction = emotionMap.getDistinctionMap();
        //map
        rationMap = NE.app_S.ratioMap_E;
        emotionSampleMap = rationMap.getEnvironmentSampleMap(getWordFrequencyMap);
        rationMap.IQ_Motivation(emotionSampleMap, motivation);
        rationMap.IQ_Trending(emotionSampleMap, trending);
        rationMap.IQ_Prediction(emotionSampleMap, prediction);
        rationMap.IQ_Distinction(emotionSampleMap, distinction);
    }
}

//
//public void IV_FromEmotionExcludeEmotion(IMV_SIQ_S_ getWordFrequencyMap, App NE) {
//    emotionMap = NE.app_S.emotionMap_E;
//    motivation = emotionMap.getMotivationMap();
//    trending = emotionMap.getTrendingMap();
//    prediction = emotionMap.getPredictionMap();
//    distinction = emotionMap.getDistinctionMap();
//    rationMap = NE.app_S.ratioMap_E;
//    emotionSampleMap = rationMap.getEnvironmentSampleMap(getWordFrequencyMap);
//    rationMap.IQ_Motivation(emotionSampleMap, motivation);
//    rationMap.IQ_Trending(emotionSampleMap, trending);
//    rationMap.IQ_Prediction(emotionSampleMap, prediction);
//    rationMap.IQ_Distinction(emotionSampleMap, distinction);
//}

//        emotionMap.IV_MotivationMap();
//        emotionMap.IV_TrendingMap();
//        emotionMap.IV_PredictionMap();
//        emotionMap.IV_DistinctionMap();

//        emotionMap.IV_MotivationMap();
//        emotionMap.IV_TrendingMap();
//        emotionMap.IV_PredictionMap();
//        emotionMap.IV_DistinctionMap();