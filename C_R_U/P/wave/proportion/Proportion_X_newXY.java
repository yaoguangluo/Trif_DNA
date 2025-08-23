package P.wave.proportion;

import P.wave.maxAndMin.MaxAndMin_X_max_v;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Proportion_X_newXY {
    public static double[] newXY(double[] input
        , double width, double hight) {
        double[] output = new double[(int) width];
        double max = MaxAndMin_X_max_v.max_abs_v(input);
        if (0 == max) {
            max = 1.0;
        }
        double biliy = hight / max;
        double bilix = input.length / width;
        for (int i = 0; i < output.length; i++) {
            double temp = i * bilix;
            output[i] = input[(int) temp] * biliy;
        }
        return output;
    }

    public static float[] newXY(float[] input
        , float width, float hight) {
        float[] output = new float[(int) width];
        float max = MaxAndMin_X_max_v.max_abs_v(input);
        if (0 == max) {
            max = 1;
        }
        float biliy = hight / max;
        float bilix = input.length / width;
        for (int i = 0; i < output.length; i++) {
            float temp = i * bilix;
            output[i] = input[(int) temp] * biliy;
        }
        return output;
    }
}
