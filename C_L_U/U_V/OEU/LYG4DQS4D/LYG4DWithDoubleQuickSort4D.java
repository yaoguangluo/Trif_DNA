package U_V.OEU.LYG4DQS4D;

//基于算法导论快排4衍生极速小高峰缺陷过滤理论快速排序第4代 线性数字数组排序法函数Java完整版本实现。
//思想：算法导论快排4理论, 罗瑶光小高峰过滤理论。
//实现：罗瑶光
//时间：20140101~ 20191105
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LYG4DWithDoubleQuickSort4D {
    int range;

    public double[] sort(double[] array, int range) {
        this.range = Math.max(range, 1);
        processDouble(array, 0, array.length - 1);
        return array;
    }

    private void processDouble(double[] array, int leftPoint, int rightPoint) {
        if (leftPoint < rightPoint) {
            int c = rightPoint - leftPoint;
            if (c < this.range) {
                int j;
                for (int i = 1 + leftPoint; i <= leftPoint + c; i++) {
                    j = i;
                    while (j >= 1 + leftPoint) {
                        if (array[j] < array[j - 1]) {
                            double temp = array[j];
                            array[j] = array[j - 1];
                            array[j - 1] = temp;
                        }
                        j--;
                    }
                }
                return;
            }
            int pos = partition(array, leftPoint, rightPoint);
            processDouble(array, leftPoint, pos - 1);
            processDouble(array, pos + 1, rightPoint);
        }
    }

    private int partition(double[] array, int leftPoint, int rightPoint) {
        double x = array[leftPoint] < array[rightPoint] ? array[leftPoint] : array[rightPoint];
        int leftPointReflection = leftPoint;
        while (leftPointReflection < rightPoint) {
            while (!(array[leftPointReflection] > x || leftPointReflection >= rightPoint)) {
                leftPointReflection++;
            }
            while (array[rightPoint] > x) {
                rightPoint--;
            }
            if (leftPointReflection < rightPoint) {
                double temp = array[rightPoint];
                array[rightPoint] = array[leftPointReflection];
                array[leftPointReflection] = temp;
            }
        }
        array[leftPoint] = array[rightPoint];
        array[rightPoint] = x;
        return rightPoint;
    }
}
