package P_V.PCI.ASQ.statistic;

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
public class FindSum {
    public static double findSumOfDoubleArray(double[] input) {
        double output = 0.0;
        for (int i = 0; i < input.length; i++) {
            output += input[i];
        }
        return output;
    }

    public static double[] findSumOfTwoDoubleArray(double[] origin, double[] input) {
        double[] output = new double[origin.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = origin[i] + input[i];
        }
        return output;
    }

    public static double[][] findSumOfTwoDoubleArray2D(double[][] origin, double[][] input) {
        double[][] output = new double[origin.length][origin[0].length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                output[i][j] = origin[i][j] + input[i][j];
            }
        }
        return output;
    }

    public static double findSumOfDoubleMatrix2D(double[][] input) {
        double output = 0.0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                output += input[i][j];
            }
        }
        return output;
    }

    public static double[] findRowSumOfDoubleMatrix2D(double[][] input) {
        double[] output = new double[input[0].length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                output[j] += input[i][j];
            }
        }
        return output;
    }

    public static double[] findCulumnSumOfDoubleMatrix2D(double[][] input) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                output[i] += input[i][j];
            }
        }
        return output;
    }

    public static double findSumOfDoubleMatrix3D(double[][][] input) {
        double output = 0.0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                for (int k = 0; k < input[0][0].length; k++) {
                    output += input[i][j][k];
                }
            }
        }
        return output;
    }

    public static double findSumOfDoubleList(List<Double> input) {
        double output = 0.0;
        Iterator<Double> iterator = input.iterator();
        while (iterator.hasNext()) {
            output += iterator.next();
        }
        return output;
    }

    public static double[] findSumOfMartrix1DList(List<double[]> input) {
        double[] output = new double[input.get(0).length];
        Iterator<double[]> iterator = input.iterator();
        while (iterator.hasNext()) {
            double[] table = iterator.next();
            output = findSumOfTwoDoubleArray(output, table);
        }
        return output;
    }

    public static double[][] findSumOfMartrix2DList(List<double[][]> input) {
        double[][] output = new double[input.get(0).length][input.get(0)[0].length];
        Iterator<double[][]> iterator = input.iterator();
        while (iterator.hasNext()) {
            double[][] table = iterator.next();
            output = findSumOfTwoDoubleArray2D(output, table);
        }
        return output;
    }
}
