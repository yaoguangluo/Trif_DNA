package U_V.OEU.xqpx.wcms.sort;
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//20200314 集成了最新的小高峰过滤催化排序5代思想。
//20200818 集成了最新的小高峰过滤催化排序9代思想。
//增加同拼音同笔画的字按char的int大小区分20210529
//罗瑶光

import java.util.Map;
//import SVQ.stable.S_File;
//import PEU.S.verbal.VerbalSource;
//今天将新陈代谢技术应用到 chinesePinYin笔画分词上.

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */

public interface LYG10D13D_X_CAS_C {
    int quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(String[] strings, int leftPosition
            , int rightPosition, int scale, Map<String, String> map
            , Map<String, Integer> bihua, int range, int deeps);
}
//
//    boolean findSmallWithTwoCharWithpinyin(Map<String, String> pinyinMap, String x1, String x2
//            , int scale, int point);
//    void quick4DChineseStringArray1D(String[] strings, int scale, Map<String, String> map
//        , int range, int deeps, Map<String, Integer> bihua);
//
//    boolean quick4DChineseStringArrayWithSmallInTwoChar(String[] strings, int leftPosition
//        , int rightPosition, int scale, Map<String, String> map, int range, int deeps);
//
//    int quick4DChineseStringArrayWithSmallInTwoChar3Returns(String[] strings, int leftPosition
//        , int rightPosition, int scale, Map<String, String> map, int range, int deeps);

