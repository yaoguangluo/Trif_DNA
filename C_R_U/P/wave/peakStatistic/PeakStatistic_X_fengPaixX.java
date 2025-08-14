package P.wave.peakStatistic;

import P.wave.copy.Copy_X_copy2d;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class PeakStatistic_X_fengPaixX {
    public static double[][] fengPaixX(double[][] input) {
        double[][] output = Copy_X_copy2d.copy2d(input, (double) input.length);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (output[i][0] < output[j][0]) {
                    double[] tempc = new double[2];
                    tempc[0] = output[i][0];
                    tempc[1] = output[i][1];
                    output[i][0] = output[j][0];
                    output[i][1] = output[j][1];
                    output[j][0] = tempc[0];
                    output[j][1] = tempc[1];
                }
            }
        }
        return output;
    }

    public static double[][] fengPaiXx(double[][] input) {
        double[][] output = Copy_X_copy2d.copy2d(input, (double) input.length);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (output[i][0] > output[j][0]) {
                    double[] tempc = new double[2];
                    tempc[0] = output[i][0];
                    tempc[1] = output[i][1];
                    output[i][0] = output[j][0];
                    output[i][1] = output[j][1];
                    output[j][0] = tempc[0];
                    output[j][1] = tempc[1];
                }
            }
        }
        return output;
    }
}
