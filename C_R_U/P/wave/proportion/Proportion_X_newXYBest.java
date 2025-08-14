package P.wave.proportion;

import P.wave.maxAndMin.MaxAndMin_X_max_v;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */

public class Proportion_X_newXYBest {
    //当年用联想电脑写的调试都是ok的，现在用戴尔就报错。所以重写检测下。20230723
    public static double[] newXYBest(double[] input
        , double width, double hight) {
        double[] output = new double[(int) width];
        double max = MaxAndMin_X_max_v.max_abs_v(input);
        double biliy = hight / max;
        double bilix = width / input.length;
        for (int i = 0; i < input.length - 1; i++) {
            double dc = (input[i + 1] - input[i]) / bilix;
            for (int j = 0; j < bilix; j++) {
                output[(int) (i * bilix) + j] = (input[i] + dc * j) * biliy;
            }
        }
        return output;
    }
//later with max= stable v

    public static double[] newXYBiliWithSameWidth(double[] input
        , double width, double hight) {
        double[] output = new double[(int) width];
        double max = MaxAndMin_X_max_v.max_abs_v(input);
        max = max == 0 ? 1 : max;
        double biliy = max / hight;
        for (int i = 0; i < input.length - 1; i++) {//2024--
            output[i] = input[i] / biliy;
        }
        output[input.length - 1] = 0.0;
        return output;
    }

    public static float[] newXYBestAllStableMax_f(float[] input
        , double width, float hight, double maxV) {
        float[] output = new float[(int) width];
        float max = (float) maxV;
        max = max == 0 ? 1 : max;
        float biliy = hight / max;
        double bilix = width / input.length;
        for (int i = 0; i < input.length - 1; i++) {
            double dc = (input[i + 1] - input[i]) / bilix;
            for (int j = 0; j < bilix; j++) {
                output[(int) (i * bilix) + j] = (float) ((input[i] + dc * j) * biliy);
            }
        }
        return output;
    }

    public static double[] newXYBestAllStableMax(double[] input
        , double width, double hight, double maxV) {
        double[] output = new double[(int) width];
        double max = maxV;
        max = max == 0 ? 1 : max;
        double biliy = hight / max;
        double bilix = width / input.length;
        for (int i = 0; i < input.length - 1; i++) {
            double dc = (input[i + 1] - input[i]) / bilix;
            for (int j = 0; j < bilix; j++) {
                output[(int) (i * bilix) + j] = (input[i] + dc * j) * biliy;
            }
        }
        return output;
    }

    public static double[] newXYBestAll(double[] input
        , double width, double hight) {
        double[] output = new double[(int) width];
        double max = MaxAndMin_X_max_v.max_abs_v(input);
        max = max == 0 ? 1 : max;
        double biliy = hight / max;
        double bilix = width / input.length;
        for (int i = 0; i < input.length - 1; i++) {
            double dc = (input[i + 1] - input[i]) / bilix;
            for (int j = 0; j < bilix; j++) {
                int temp = (int) (i * bilix) + j;
                output[temp] = (input[i] + dc * j) * biliy;
            }
        }
        return output;
    }

    public static float[] newXYBestAll(float[] input
        , float width, float hight) {
        float[] output = new float[(int) width];
        float max = MaxAndMin_X_max_v.max_abs_v(input);
        max = max == 0 ? 1 : max;
        float biliy = hight / max;
        float bilix = width / input.length;
        for (int i = 0; i < input.length - 1; i++) {
            float dc = (input[i + 1] - input[i]) / bilix;
            for (int j = 0; j < bilix; j++) {
                int temp = (int) (i * bilix) + j;
                output[temp] = (input[i] + dc * j) * biliy;
            }
        }
        return output;
    }
}
//    public static double[] newXYBiliWithSameWidthStableMax(double[] input
//        , double width, double hight, double maxV) {
//        double[] output = new double[width];
//        double max = MaxAndMin_X_max_v.max_abs_v(input);
//        max = maxV;
//        double biliy = max / hight;
//        for (int i = 0; i < input.length - 1; i++) {//2024--
//            output[i] = input[i] / biliy;
//        }
//        output[input.length - 1] = 0.0;
//        return output;
//    }

//  public static double[] newXYBestWithWidth(double[] input
//        , double width) {
//        double[] output = new double[width];
//        double bilix = width / input.length;
//        for (int i = 0; i < input.length - 1; i++) {
//            double dc = (input[i + 1] - input[i]) / bilix;
//            for (int j = 0; j < bilix; j++) {
//                int temp = (int) (i * bilix) + j;
//                output[temp] = (input[i] + dc * j);
//            }
//        }
//        output[width - 1] = null == output[width - 1] ? 0
//            : output[width - 1];//range tail lose.
//        return output;
//    }