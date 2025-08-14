package P.wave.quantification;

import java.util.Objects;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
//去量化并行帧区间render
public class Quantification_X_liangHuaEqualDelete {
    public static double[] liangHuaEqualDelete(double[] input) {
        double[] output = new double[input.length];
        double pre = 0.0;
        double next;
        for (int i = 0; i < input.length; i++) {
            next = input[i];
            if (!Objects.equals(next, pre)) {//later
                output[i] = input[i];
            } else {
                output[i] = 0.0;
            }
            pre = next;
        }

        return output;
    }
}
