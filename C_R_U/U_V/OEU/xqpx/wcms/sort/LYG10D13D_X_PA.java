package U_V.OEU.xqpx.wcms.sort;
////import java.io.BufferedReader;
////import java.io.InputStream;
////import java.io.InputStreamReader;
////import java.util.HashMap;
////20200314 集成了最新的小高峰过滤催化排序5代思想。
//
////20200818 集成了最新的小高峰过滤催化排序9代思想。
////增加同拼音同笔画的字按char的int大小区分20210529
////罗瑶光
//import java.util.Map;
//import SVQ.stable.S_File;
//import PEU.S.verbal.VerbalSource;
//今天将新陈代谢技术应用到 chinesePinYin笔画分词上.

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

//public class LYG10D13D_X_PA extends LYG10D13D_X_S
//        implements LYG10D13D_X_PAC {
//
//    public boolean findSmall2D(String[][] kernel, int scale, int point
//            , int i, int j, int rightPosition, int culumn) {
//        if (kernel[i][culumn].length() <= point
//                || kernel[j][culumn].length() <= point) {
//            if (kernel[i][culumn].length() < kernel[j][culumn].length()) {
//                for (int p = 0; p < scale; p++) {
//                    if (!(kernel[i][culumn].length() <= p || kernel[j][culumn].length() <= p)) {
//                        if (kernel[i][culumn].charAt(p) != kernel[j][culumn].charAt(p)) {
//                            return false;
//                        }
//                    }
//                }
//                return true;
//            }
//            return false;
//        } else {
//            boolean hasXi = pinyin.containsKey("" + kernel[i][culumn].charAt(point));
//            boolean hasXj = pinyin.containsKey("" + kernel[j][culumn].charAt(point));
//            if (!(!hasXi || !hasXj)) {
//                String[] js = new String[2];
//                js[0] = this.pinyin.get("" + kernel[i][culumn].charAt(point));
//                js[1] = this.pinyin.get("" + kernel[j][culumn].charAt(point));
//                boolean change = processSortpinyin(js, 3);
//                if (!(!change || i >= j)) {
//                    return true;
//                }
//                return false;
//            } else if (!(hasXi || hasXj)) {
//                if (kernel[i][culumn].toLowerCase().charAt(point)
//                        > kernel[j][culumn].toLowerCase().charAt(point)) {
//                    if (i < j) {
//                        return true;
//                    }
//                    return false;
//                } else if (kernel[i][culumn].toLowerCase().charAt(point)
//                        == kernel[j][culumn].toLowerCase().charAt(point)) {
//                    if (kernel[i][culumn].charAt(point)
//                            > kernel[j][culumn].charAt(point)) {
//                        if (i < j) {
//                            return true;
//                        }
//                        return false;
//                    }
//                    return false;
//                }
//                return false;
//            } else if (!(hasXi || !hasXj)) {
//                if (i < j) {
//                    if (!(i == rightPosition || j == rightPosition)) {
//                        return true;
//                    }
//                    return false;
//                }
//                return false;
//            }
//        }
//        return false;
//    }
//}
