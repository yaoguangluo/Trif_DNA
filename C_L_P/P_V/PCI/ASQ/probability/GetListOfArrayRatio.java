package P_V.PCI.ASQ.probability;

import java.util.ArrayList;
import java.util.List;

//稍后用于肽展处理后的 PCA 颜色比率
//罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class GetListOfArrayRatio {
    public static List<Double> getPercentListByOuterKey(double[] array) {
        List<Double> output = new ArrayList<>();
        kernelFix(output, array, 0);
        return output;
    }

    public static void kernel(List<Double> output, double[] array, int j) {
        for (int i = j; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                output.add(array[j] / array[i]);
            }
        }
        if (j < array.length) {
            kernel(output, array, j + 1);
        }
    }

    public static void kernelFix(List<Double> output, double[] array, int j) {
        for (int i = j; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                output.add(0 == array[i] ? 0 : array[k] / array[i]);
            }
        }
        if (j < array.length) {
            kernelFix(output, array, j + 1);
        }
    }
}
