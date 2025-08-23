package U_V.OEU.LYG4DQS4D;

import A_V.ASQ.PSU.test.TimeCheck;

//基于算法导论快排4衍生极速小高峰缺陷过滤理论快速排序第8代 线性数字数组排序法函数Java完整版本实现。
//思想：算法导论快排4理论, 罗瑶光小高峰过滤理论。
//实现：罗瑶光
//时间：20140101~ 20200711
//复制一份 稍后准备 元基新陈代谢优化
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
public class LYG9DWithIntTopSort4D {
    int range;
    int deeps;

    public int[] sort(int[] array, int range, int deeps) {
        this.range = range;
        this.deeps = deeps;
        processInt(array, 0, array.length - 1, 0);
        return array;
    }

    private void processInt(int[] array, int leftPoint, int rightPoint, int deep) {
        int c = rightPoint - leftPoint + 1;
        if (!(c < this.range || deep > this.deeps)) {//增加了deep
            int pos = partition(array, leftPoint, rightPoint);
            if (leftPoint < pos - 1) {
                processInt(array, leftPoint, pos - 1, deep + 1);
            }
            if (pos + 1 < rightPoint) {
                processInt(array, pos + 1, rightPoint, deep + 1);
            }
            return;
        }
        int i = leftPoint;
        for (int j = i + 1; j < leftPoint + c; j = i++) {
            while (j > leftPoint) {
                if (array[j] < array[--j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private int partition(int[] array, int leftPoint, int rightPoint) {
        int x = Math.min(array[leftPoint], array[rightPoint]);
        int leftPointReflection = leftPoint;
        while (leftPointReflection < rightPoint) {//我设立个top2D, --细节竟然没有一个人关注这些细节...20210716
            while (!(array[leftPointReflection] > x || leftPointReflection++ >= rightPoint)) {
            }
            while (array[rightPoint--] > x) {
            }
            if (leftPointReflection < ++rightPoint) {
                int temp = array[rightPoint];
                array[rightPoint] = array[leftPointReflection];
                array[leftPointReflection] = temp;
            }
        }
        array[leftPoint] = array[rightPoint];
        array[rightPoint] = x;
        return rightPoint;
    }

    public static void main(String[] argv) {
        int[] doubles = new int[99999];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = (int) (Math.random() * 1000000);
        }
        LYG9DWithIntTopSort4D lYG9DWithDoubleTopSort2D = new LYG9DWithIntTopSort4D();
        TimeCheck timecheck = new TimeCheck();
        timecheck.begin();
        lYG9DWithDoubleTopSort2D.sort(doubles, 7, 70);
        timecheck.end();
        timecheck.duration();
        for (int i = 0; i < doubles.length - 1; i++) {
            if (doubles[i] > doubles[i + 1]) {
                //20230106-System.out.println(i+"->"+ doubles[i]);
            }
        }
        //20230106-System.out.println("end");
    }
}
