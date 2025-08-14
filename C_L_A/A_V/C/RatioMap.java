package A_V.C;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
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
public interface RatioMap {
    double findTotalPositiveCount(IMV_SIQ_X_ emotionSampleMap);

    double findTotalNegativeCount(IMV_SIQ_X_ emotionSampleMap);

    double findTotalKeyCount(IMV_SIQ_X_ emotionSampleMap);

    void IQ_Motivation(IMV_SIQ_X_ emotionSampleMap, IMV_SIQ motivation);

    void IQ_Trending(IMV_SIQ_X_ emotionSampleMap, IMV_SIQ trending);

    void IQ_Prediction(IMV_SIQ_X_ emotionSampleMap, IMV_SIQ prediction);

    void IQ_Distinction(IMV_SIQ_X_ emotionSampleMap, IMV_SIQ distinction);

    IMV_SIQ_X_ getEnvironmentSampleMap(IMV_SIQ_S_ wordFrequencyMap);

    IMV_SIQ_X_ getEmotionSampleMap(IMV_SIQ_S_ wordFrequencyMap
        , IMV_SIQ positive, IMV_SIQ negative, App NE);

    void IQ_EmotionRatio(IMV_SIQ_X_ emotionSampleMap, double positiveCount
        , double negativeCount, double medCount);

    void IQ_MotivationRatio(IMV_SIQ_X_ emotionSampleMap, double sumOfEmotion);

    void IQ_CorrelationRatio(IMV_SIQ_X_ emotionSampleMap, double sumOfEmotion);

    void IQ_ContinusRatio(IMV_SIQ_X_ emotionSampleMap, double emotionRatio);

    void IQ_TrendsRatio(IMV_SIQ_X_ emotionSampleMap);

    void IQ_PredictionRatio(IMV_SIQ_X_ emotionSampleMap);

    void IQ_GuessRatio(IMV_SIQ_X_ emotionSampleMap);

    void IQ_SensingRatio(IMV_SIQ_X_ emotionSampleMap);
}
