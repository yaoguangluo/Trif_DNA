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

public class LYG10D15D_X_CUA extends LYG10D13D_X_CA
        implements LYG10D13D_X_CUA_C {

    public void processKernel(String[] kernel, int leftPosition
            , int rightPosition, int scale, int point) {
        int rightPositionReflection = rightPosition;
        if (point > scale) {
            return;
        }
        processQS4DLYG9D(kernel, leftPosition, rightPosition, scale, point, 0);
        int i;
        for (i = leftPosition; i <= rightPosition; i++) {
            if (!(kernel[i].length() <= point || kernel[leftPosition].length() <= point)) {
                if (kernel[i].charAt(point) != kernel[leftPosition].charAt(point)) {
                    rightPositionReflection = i - 1;
                    processKernel(kernel, leftPosition, rightPositionReflection, scale, point + 1);
                    leftPosition = i;
                }
            }
        }
        if (leftPosition != rightPosition) {
            processKernel(kernel, leftPosition, i - 1, scale, point + 1);
        }
    }

    //80-根据前面select的sort定义来规范, 盲目改成大于会出错.
    //96-其中一个有拼音
    //115-都没有拼音
    public void processSort(String[] kernel, int leftPosition
            , int rightPosition, int scale, int point) {
        if (point > scale) {
            return;
        }
        for (int i = leftPosition; i <= rightPosition; i++) {
            Here:
            for (int j = i; j <= rightPosition; j++) {
                if (i == j) {
                    continue Here;
                }
                if (kernel[i].length() <= point || kernel[j].length() <= point) {
                    if (kernel[i].length() > kernel[j].length()) {
                        for (int p = 0; p < scale; p++) {
                            if (!(kernel[i].length() <= p || kernel[j].length() <= p)) {
                                if (kernel[i].charAt(p) != kernel[j].charAt(p)) {
                                    continue Here;
                                }
                            }
                        }
                        String temp = kernel[i].toString();
                        kernel[i] = kernel[j].toString();
                        kernel[j] = temp;
                    }
                    continue Here;
                } else {
                    boolean hasXi = pinyin.containsKey("" + kernel[i].charAt(point));
                    boolean hasXj = pinyin.containsKey("" + kernel[j].charAt(point));
                    boolean hasBi = bihua.containsKey("" + kernel[i].charAt(point));
                    boolean hasBj = bihua.containsKey("" + kernel[j].charAt(point));
                    if (!(!hasXi || !hasXj)) {//都有拼音
                        String[] js = new String[2];
                        js[0] = this.pinyin.get("" + kernel[i].charAt(point));
                        js[1] = this.pinyin.get("" + kernel[j].charAt(point));
                        if (js[0].equalsIgnoreCase(js[1])) {
                            if (!(!hasBi || !hasBj)) {//都有笔画
                                if (this.bihua.get("" + kernel[i].charAt(point))
                                        > this.bihua.get("" + kernel[j].charAt(point))) {
                                    String temp = kernel[i].toString();
                                    kernel[i] = kernel[j].toString();
                                    kernel[j] = temp;
                                    continue Here;
                                }
                                else if (this.bihua.get("" + kernel[i].charAt(point))
                                        == this.bihua.get("" + kernel[j].charAt(point))) {
                                    int asci = kernel[i].charAt(point);
                                    int ascj = kernel[j].charAt(point);
                                    if (asci > ascj) {
                                        String temp = kernel[i].toString();
                                        kernel[i] = kernel[j].toString();
                                        kernel[j] = temp;
                                        continue Here;
                                    }
                                }
                            }
                        }
                        boolean change = processSortpinyin(js, 3);
                        if (!(!change || i >= j)) {
                            String temp = kernel[i].toString();
                            kernel[i] = kernel[j].toString();
                            kernel[j] = temp;
                        }
                        continue Here;
                    } else if (!(hasXi || !hasXj)) {
                        if (i < j) {
                            if (!(i == rightPosition + 1 || j == rightPosition + 1)) {
                                String temp = kernel[i].toString();
                                kernel[i] = kernel[j].toString();
                                kernel[j] = temp;
                            }
                        }
                        continue Here;
                    } else if (!(!hasXi || hasXj)) {
                        if (i > j) {
                            if (!(i == rightPosition + 1 || j == rightPosition + 1)) {
                                String temp = kernel[i].toString();
                                kernel[i] = kernel[j].toString();
                                kernel[j] = temp;
                            }
                        }
                        continue Here;
                    } else if (!(hasXi || hasXj)) {
                        if (kernel[i].toLowerCase().charAt(point)
                                > kernel[j].toLowerCase().charAt(point)) {
                            if (i < j) {
                                String temp = kernel[i].toString();
                                kernel[i] = kernel[j].toString();
                                kernel[j] = temp;
                            }
                            continue Here;
                        }
                        if (kernel[i].toLowerCase().charAt(point)
                                == kernel[j].toLowerCase().charAt(point)) {
                            if (kernel[i].charAt(point) > kernel[j].charAt(point)) {
                                if (i < j) {
                                    String temp = kernel[i].toString();
                                    kernel[i] = kernel[j].toString();
                                    kernel[j] = temp;
                                }
                            }
                            continue Here;
                        }
                    }
                }
            }
        }
    }

    //147-增加了deep
    public void processQS4DLYG9D(String[] kernel, int leftPosition
            , int rightPosition, int scale, int point, int deep) {
        if (leftPosition < rightPosition) {
            int c = rightPosition - leftPosition + 1;
            if (!(c < this.range || deep > this.deeps)) {
                int pos = partition(kernel, leftPosition, rightPosition, scale, point);
                if (leftPosition < pos - 1) {
                    processQS4DLYG9D(kernel, leftPosition, pos - 1, scale, point, deep + 1);
                }
                if (pos + 1 < rightPosition) {
                    processQS4DLYG9D(kernel, pos + 1, rightPosition, scale, point, deep + 1);
                }
                return;
            }
            processSort(kernel, leftPosition, rightPosition, scale, point);
            return;
        }
    }

    public int partition(String[] array, int leftPosition, int rightPosition, int scale, int point) {
        String x = findSmall(array, scale, point, leftPosition, rightPosition, rightPosition)
                ? array[rightPosition] : array[leftPosition];
        int leftPositionReflection = leftPosition;
        while (leftPositionReflection < rightPosition) {
            while (!(findSmallWithTwoChar(array[leftPositionReflection]
                    , x, scale, point) || leftPositionReflection++ >= rightPosition)) {
            }
            while (findSmallWithTwoChar(array[rightPosition--], x, scale, point)) {
            }
            if (leftPositionReflection < ++rightPosition) {
                String temp = array[rightPosition].toString();
                array[rightPosition] = array[leftPositionReflection].toString();
                array[leftPositionReflection] = temp;
            }
        }
        array[leftPosition] = array[rightPosition].toString();
        array[rightPosition] = x.toString();
        return rightPosition;
    }
}
