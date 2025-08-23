package U_A.PEU.P.wave;

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Tailor {
    public static float[] caiJian1(float[] input, float left, float right) {
        float w = right - left;
        float[] output = new float[(int)w];
        for (int i = (int)left; i < right - 1; i++) {
            if (i < input.length) {
                output[(i - (int)left)] = input[i];//优化之后慢慢剔除
            }
        }
        return output;
    }
    public static double[] caiJian1(double[] input, double left, double right) {
        double w = right - left;
        double[] output = new double[(int)w];
        for (int i = (int)left; i < right - 1; i++) {
            if (i < input.length) {
                output[(i - (int)left)] = input[i];//优化之后慢慢剔除
            }
        }
        return output;
    }
}
