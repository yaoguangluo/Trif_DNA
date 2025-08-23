package A_V.IVDTIXQCTIV;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;
import VSQ.parser.EmotionInit_X_S;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class EmotionInit extends EmotionInit_X_S {
    public static void main(String[] argv) {
        EmotionInit emotionInit = new EmotionInit();
        emotionInit.IV_(S_String.text1, new App());
    }

    public void IV_(String text, App NE) {
        emotionMap = NE.app_S.emotionMap_E;
        _A = NE.app_S._A;
        positive = emotionMap.getPositiveMap();
        negative = emotionMap.getNegativeMap();
        sets = _A.parserMixedString(text);
        wordFrequencyMap = _A.getWordFrequencyByReturnSortMap(sets, NE);
        rationMap = NE.app_S.ratioMap_E;
        emotionSampleMap = rationMap.getEmotionSampleMap(wordFrequencyMap
                , positive, negative, NE);
        positiveCount = rationMap.findTotalPositiveCount(emotionSampleMap);
        negativeCount = rationMap.findTotalNegativeCount(emotionSampleMap);
        totalCount = rationMap.findTotalKeyCount(emotionSampleMap);
    }
}
//
//public void IV_Exclude_A(String text, App NE) {
//    emotionMap = NE.app_S.emotionMap_E;
//    _A = NE.app_S._A;
//    positive = emotionMap.getPositiveMap();
//    negative = emotionMap.getNegativeMap();
//    sets = _A.parserMixedString(text);
//    wordFrequencyMap = _A.getWordFrequencyByReturnSortMap(sets, NE);
//    rationMap = NE.app_S.ratioMap_E;
//    emotionSampleMap = rationMap.getEmotionSampleMap(wordFrequencyMap
//        , positive, negative, NE);
//    positiveCount = rationMap.findTotalPositiveCount(emotionSampleMap);
//    negativeCount = rationMap.findTotalNegativeCount(emotionSampleMap);
//    totalCount = rationMap.findTotalKeyCount(emotionSampleMap);
//}