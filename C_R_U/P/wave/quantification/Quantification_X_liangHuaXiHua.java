package P.wave.quantification;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Quantification_X_liangHuaXiHua {
    public static double[] liangHuaXiHua(double[] input, double scale) {
        double[] output = new double[input.length];
        double sum = (double) input.length;
        int find = 0;
        for (int i = 1; i <= scale; i++) {
            if (input[0] > input[i]) {
                find += 1;
            }
        }
        if (find == scale) {
            output[0] = input[0];
        }
        for (int i = ((int) scale); i < (sum - (scale)); i++) {
            find = 0;
            for (int j = 1; j <= scale; j++) {
                if (input[i] > input[i + j]) {
                    find += 1;
                }
                if (input[i] > input[i - j]) {
                    find += 1;
                }
            }
            if (find == scale * 2) {
                output[i] = input[i];
            }

        }
        return output;
    }
}
