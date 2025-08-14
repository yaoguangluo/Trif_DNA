package P.image;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 reinhart，思想 computer vision绿皮书
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class GetMean {
    public static double print_Mean(int[][] outDIR) {
        double sum = 0.0;
        double meanValue;
        for (int[] ints : outDIR) {
            for (int j = 0; j < outDIR[0].length; j++) {
                sum += ints[j];
            }
        }
        meanValue = sum / (outDIR.length * outDIR[0].length);
        return meanValue;
    }

    public static double print_Mean(double[][] outDIR) {
        double sum = 0.0;
        double meanValue;
        for (double[] doubles : outDIR) {
            for (int j = 0; j < outDIR[0].length; j++) {
                sum += doubles[j];
            }
        }
        meanValue = sum / (outDIR.length * outDIR[0].length);
        return meanValue;
    }
}
