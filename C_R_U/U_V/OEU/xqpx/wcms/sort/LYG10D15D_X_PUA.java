package U_V.OEU.xqpx.wcms.sort;
//20200314 集成了最新的小高峰过滤催化排序5代思想。
//20200818 集成了最新的小高峰过滤催化排序9代思想。
//增加同拼音同笔画的字按char的int大小区分20210529
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
//public class LYG10D15D_X_PUA extends LYG10D13D_X_PA
//        implements LYG10D13D_X_PUA_C {
//
//    public void processKernel2D(String[][] kernel, int leftPosition
//            , int rightPosition, int scale, int point, int culumn) {
//        int rightPositionReflection = rightPosition;
//        if (point > scale) {
//            return;
//        }
//        processQS4DLYG9D2D(kernel, leftPosition, rightPosition, scale, point, 0, culumn);
//        int i;
//        for (i = leftPosition; i <= rightPosition; i++) {
//            if (!(kernel[i][culumn].length() <= point
//                    || kernel[leftPosition][culumn].length() <= point)) {
//                if (kernel[i][culumn].charAt(point)
//                        != kernel[leftPosition][culumn].charAt(point)) {
//                    rightPositionReflection = i - 1;
//                    processKernel2D(kernel, leftPosition, rightPositionReflection
//                            , scale, point + 1, culumn);
//                    leftPosition = i;
//                }
//            }
//        }
//        if (leftPosition != rightPosition) {
//            processKernel2D(kernel, leftPosition, i - 1, scale, point + 1, culumn);
//        }
//    }
//
//    public void processQS4DLYG9D2D(String[][] kernel, int leftPosition
//            , int rightPosition, int scale, int point, int deep, int culumn) {
//        if (leftPosition < rightPosition) {
//            int c = rightPosition - leftPosition + 1;
//            if (!(c < this.range || deep > this.deeps)) {//增加了deep
//                int pos = partition2D(kernel, leftPosition, rightPosition, scale
//                        , point, culumn);
//                if (leftPosition < pos - 1) {
//                    processQS4DLYG9D2D(kernel, leftPosition, pos - 1, scale, point
//                            , deep + 1, culumn);
//                }
//                if (pos + 1 < rightPosition) {
//                    processQS4DLYG9D2D(kernel, pos + 1, rightPosition, scale, point
//                            , deep + 1, culumn);
//                }
//                return;
//            }
//            processSort2D(kernel, leftPosition, rightPosition, scale, point, culumn);
//            return;
//        }
//    }
//
//    public int partition2D(String[][] array, int leftPosition, int rightPosition
//            , int scale, int point, int culumn) {
//        String[] x = findSmall2D(array, scale, point, leftPosition, rightPosition
//                , rightPosition, culumn)
//                ? array[rightPosition] : array[leftPosition];
//        int leftPositionReflection = leftPosition;
//        while (leftPositionReflection < rightPosition) {
//            while (!(findSmallWithTwoChar(array[leftPositionReflection][culumn]
//                    , x[culumn], scale, point)
//                    || leftPositionReflection++ >= rightPosition)) {
//            }
//            while (findSmallWithTwoChar(array[rightPosition--][culumn]
//                    , x[culumn], scale, point)) {
//            }
//            if (leftPositionReflection < ++rightPosition) {
//                String[] temp = array[rightPosition].clone();
//                ;
//                array[rightPosition] = array[leftPositionReflection].clone();
//                ;
//                array[leftPositionReflection] = temp.clone();
//            }
//        }
//        array[leftPosition] = array[rightPosition].clone();
//        array[rightPosition] = x.clone();
//        return rightPosition;
//    }
//
//    public void processSort2D(String[][] kernel, int leftPosition
//            , int rightPosition, int scale, int point, int culumn) {
//        if (point > scale) {
//            return;
//        }
//        for (int i = leftPosition; i <= rightPosition; i++) {
//            Here:
//            for (int j = i; j <= rightPosition; j++) {
//                if (i == j) {
//                    continue Here;
//                }
//                if (kernel[i][culumn].length() <= point
//                        || kernel[j][culumn].length() <= point) {
//                    if (kernel[i][culumn].length() < kernel[j][culumn].length()) {
//                        for (int p = 0; p < scale; p++) {
//                            if (!(kernel[i][culumn].length() <= p
//                                    || kernel[j][culumn].length() <= p)) {
//                                if (kernel[i][culumn].charAt(p)
//                                        != kernel[j][culumn].charAt(p)) {
//                                    continue Here;
//                                }
//                            }
//                        }
//                        String[] temp = kernel[i].clone();
//                        ;
//                        kernel[i] = kernel[j].clone();
//                        ;
//                        kernel[j] = temp.clone();
//                    }
//                    continue Here;
//                } else {
//                    boolean hasXi = pinyin.containsKey(""
//                            + kernel[i][culumn].charAt(point));
//                    boolean hasXj = pinyin.containsKey(""
//                            + kernel[j][culumn].charAt(point));
//                    if (!(!hasXi || !hasXj)) {
//                        String[] js = new String[2];
//                        js[0] = this.pinyin.get("" + kernel[i][culumn].charAt(point));
//                        js[1] = this.pinyin.get("" + kernel[j][culumn].charAt(point));
//                        boolean change = processSortpinyin(js, 3);
//                        if (!(!change || i >= j)) {
//                            String[] temp = kernel[i].clone();
//                            kernel[i] = kernel[j].clone();
//                            kernel[j] = temp.clone();
//                        }
//                        continue Here;
//                    } else if (!(hasXi || !hasXj)) {
//                        if (i < j) {
//                            if (!(i == rightPosition + 1 || j == rightPosition + 1)) {
//                                String[] temp = kernel[i].clone();
//                                kernel[i] = kernel[j].clone();
//                                kernel[j] = temp.clone();
//                            }
//                        }
//                        continue Here;
//                    } else if (!(hasXi || hasXj)) {
//                        if (kernel[i][culumn].toLowerCase().charAt(point)
//                                > kernel[j][culumn].toLowerCase().charAt(point)) {
//                            if (i < j) {
//                                String[] temp = kernel[i].clone();
//                                kernel[i] = kernel[j].clone();
//                                kernel[j] = temp.clone();
//                            }
//                            continue Here;
//                        }
//                        if (kernel[i][culumn].toLowerCase().charAt(point)
//                                == kernel[j][culumn].toLowerCase().charAt(point)) {
//                            if (kernel[i][culumn].charAt(point) > kernel[j][culumn].charAt(point)) {
//                                if (i < j) {
//                                    String[] temp = kernel[i].clone();
//                                    kernel[i] = kernel[j].clone();
//                                    kernel[j] = temp.clone();
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
