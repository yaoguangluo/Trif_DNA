package P_V.PCI.ASQ.probability;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Percentage {
    public static List<Double> getPercentListByOuterKey(List<Double> list, double key) {
        List<Double> output = new ArrayList<>();
        Iterator<Double> iterator = list.iterator();
        while (iterator.hasNext()) {
            output.add(iterator.next() * key);
        }
        return output;
    }

    public static double[] getPercentArrayByOuterKey(double[] array, double key) {
        double[] output = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i] * key;
        }
        return output;
    }

    public static double[] getEachPercentSetOfArray(double[] array) {
        double[] output = new double[array.length];
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i] / sum;
        }
        return output;
    }

    public static double[][] getPercentArrayByOuterKey(double[][] array, double key) {
        double[][] output = new double[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                output[i][j] = array[i][j] * key;
            }
        }
        return output;
    }

    public static double[][] getEachPercentSetOfArray(double[][] array) {
        double[][] output = new double[array.length][array[0].length];
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                output[i][j] = array[i][j] / sum;
            }
        }
        return output;
    }
}
