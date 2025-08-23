package P.wave.maxAndMin;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class MaxAndMin_X_max_v {
    public static double max_abs_v(double[] input) {
        double max = -99999.0;
        for (int i = 0; i < input.length; i++) {
            if (Math.abs(input[i]) > max) {
                max = Math.abs(input[i]);
            }
        }
        return max;
    }
    public static float max_abs_v(float[] input) {
        float max = -99999;
        for (int i = 0; i < input.length; i++) {
            if (Math.abs(input[i]) > max) {
                max = Math.abs(input[i]);
            }
        }
        return max;
    }
    public static double max_v(double[] input) {
        double max = -99999.0;
        for (double aDouble : input) {
            if (Math.abs(aDouble) > max) {
                max = Math.abs(aDouble);
            }
        }
        return max;
    }
}
// public static double max_second_abs_v_and_filter (double[] input) {
//        double max = -99999.0;
//        for (int i = 0; i < input.length; i++) {
//            input[i] = null == input[i] ? 0 : input[i];
//            if (Math.abs(input[i]) > max) {
//                max = Math.abs(input[i]);
//            }
//        }
//        double maxSecond = -99999.0;
//        for (int i = 0; i < input.length; i++) {
//            input[i] = null == input[i] ? 0 : input[i];
//            if (Math.abs(input[i]) > maxSecond) {
//                if (Math.abs(input[i]) < max) {
//                    maxSecond = Math.abs(input[i]);
//                }else{
//                    input[i] = maxSecond;
//                }
//            }
//        }
//        return maxSecond;
//    }