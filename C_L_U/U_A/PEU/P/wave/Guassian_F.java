package U_A.PEU.P.wave;

//作者： 罗瑶光, 浏阳,
//按reinhart教授上课给的数据ppt写
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Guassian_F {
    public static float[] kernel;

    public static void initKernel(int scale_kernels, double scale_ratio) {
        if (null == kernel) {
            kernel = new float[scale_kernels];
            double t = 0.0;
            double sumhere = 0.0;
            for (int l = 0; l < scale_kernels; ++l) {
                t = (Math.pow(l - (scale_kernels / 2), 2)) / (Math.pow(scale_ratio, 2));
                t = Math.exp(-t);
                t = (1 * t) / (2 * Math.PI * Math.pow(scale_ratio, 2));
                kernel[l] = (float) t;
                sumhere = sumhere + kernel[l];
            }
            double sum1 = 0.0;
            for (int j = 0; j < scale_kernels; ++j) {
                kernel[j] = (float) (kernel[j] / sumhere);
                sum1 = sum1 + kernel[j];
            }
        }
    }

    public static float[] guassian1d(float[] input) {
        float[] output = new float[input.length];
        float sum = 0;
        for (int i = 2; i < input.length - 2; i++) {
            sum = 0;
            for (int j = -2; j < 3; j++) {
                sum = sum + (input[i + j] * kernel[j + 2]);
            }
            output[i] = sum;
        }
        return output;
    }

    public static double[] guassian1d(double[] input, double scale) {
        double[] output = new double[input.length];
        double[] gua = new double[5];
        double sig = scale; //default 1.6
        double t = 0.0;
        double sumhere = 0.0;
        for (int l = 0; l < 5; ++l) {
            t = (Math.pow(l - (5 / 2), 2)) / (Math.pow(sig, 2));
            t = Math.exp(-t);
            t = (1 * t) / (2 * Math.PI * Math.pow(sig, 2));
            gua[l] = t;
            sumhere = sumhere + gua[l];
        }
        //   //20230106-System.out.println("--->"+sumhere);
        //--normalization
        double sum1 = 0.0;
        for (int j = 0; j < 5; ++j) {
            gua[j] = gua[j] / sumhere;
            sum1 = sum1 + gua[j];
        }
        //--end of producing gaussian matrix
        // //20230106-System.out.println("gaussian sum: " + sum1);
        double sum = 0.0;
        for (int i = 2; i < input.length - 2; i++) {
            sum = 0.0;
            for (int j = -2; j < 3; j++) {
                //input[i + j] = null == input[i + j] ? 0.0 : input[i + j];
                sum = sum + (input[i + j] * gua[j + 2]);
            }
            output[i] = sum;
        }
        return output;
    }
}
