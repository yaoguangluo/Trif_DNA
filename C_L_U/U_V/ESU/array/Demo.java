package U_V.ESU.array;

import U_A.PEU.P.time.TimeCheck;

//import parserProcessor.timeCheck;
//作者+ 个人著作权人： 罗瑶光, 浏阳,
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class Demo extends Thread {
    public static void main(String args[]) {
        //init array
        double[] array = arrayInit();
//        double []array1= array.clone();
        double[] array2 = new double[8];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[2] = array[2];
        array2[3] = array[3];
        array2[4] = array[4];
        array2[5] = array[5];
        array2[6] = array[6];
        array2[7] = array[7];
        //20230106-S_logger.Log.logger.info("" + " ");
        //20230106-S_logger.Log.logger.info("" + "罗瑶光小高峰过滤快速排序4代：");
        TimeCheck imeCheck2 = new TimeCheck();
        imeCheck2.begin();
        array2 = new LYG9DWithDoubleQuickSort4D().sort(array, 7, 70);
        imeCheck2.end();
        imeCheck2.duration();
        // print(array);
    }

    @SuppressWarnings("unused")
    private static void print(double[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            ////20230106-S_logger.Log.logger.info("" + a[i]);
            //if(a[i]>a[i+1]){
            //	count++;
            //20230106-S_logger.Log.logger.info("" + a[i]);
            //}
        }
        //20230106-S_logger.Log.logger.info("" + count);
    }

    private static double[] arrayInit() {
        double[] array = new double[5119];
        //	java.util.Random r= new java.util.Random();
        for (int i = 5119, j = 0; i > 0; i--, j++) {
            //array[j]= r.nextInt();
            array[j] = (double) j % 8;
            ////20230106-S_logger.Log.logger.info("" + array[j]);
        }
        return array;
    }
}
