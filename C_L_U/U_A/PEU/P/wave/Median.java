package U_A.PEU.P.wave;

//作者： 罗瑶光, 浏阳,
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
public class Median {
    public static float[] median1d(float[] input, float scale) {
        float[] output = new float[input.length];
        for (int i = (int)scale; i < input.length - scale; i++) {
            float sum = input[i];
            for (int j = 1; j < scale; j++) {
                sum += input[i + j];
                sum += input[i - j];
            }
            sum /= scale * 2 + 1;
            output[i] = sum;
        }
        return output;
    }
    public static double[] median1d(double[] input, double scale) {
        double[] output = new double[input.length];
        for (int i = (int)scale; i < input.length - scale; i++) {
            double sum = input[i];
            for (int j = 1; j < scale; j++) {
                sum += input[i + j];
                sum += input[i - j];
            }
            sum /= scale * 2 + 1;
            output[i] = sum;
        }
        return output;
    }
}
