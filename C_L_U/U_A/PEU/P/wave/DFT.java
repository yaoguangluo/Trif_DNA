package U_A.PEU.P.wave;

import P.wave.proportion.Proportion_X_newXYBest;
import org.python.modules.math;

//作者： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DFT {
    public double cos[][];
    public double sin[][];
    public double coss[];
    public double sins[];
    public double crow[][][];
    public double srow[][][];
    public int height = 202;
    double Pi = 3.1415926;
    public double init;

    public void IV_(int size) {
        init = 2 * Pi / size;
        cos = this.ft_cos(size);
        sin = this.ft_sin(size);
        //row= this.ft_row(size);
    }

    public double[] ft(double input[]) {
        double output[] = new double[input.length];
//		double cos[][]=this.ft_cos(input.length);
//		double sin[][]=this.ft_sin(input.length);
        for (int k = 0; k < input.length; k++) {
            double r = 0.0, i = 0.0;
            for (int n = 0; n < input.length; n++) {
                r += input[n] * cos[k][n];
                i += input[n] * sin[k][n];
            }
            output[k] = Math.sqrt(r * r + i * i);
        }
        return output;
    }

    public double[] fct(double input[]) {
        double output[] = new double[input.length];
//		double cos[][]=this.ft_cos(input.length);
//		double sin[][]=this.ft_sin(input.length);
        for (int k = 0; k < input.length; k++) {
            double r = 0.0, i = 0.0;
            for (int n = 0; n < input.length; n++) {
                r += input[n] * cos[k][n];
            }
            output[k] = math.fabs(r);
        }
        return output;
    }

    //integer加速
    //integer加速
    public boolean ft_row(int size) {
        //默认100高度 -100~100
        crow = new double[height][size][size];
        //srow= new double[height][size][size];
        for (int v = -height / 2; v < height / 2; v++) {
            for (int k = 0; k < size; k++) {
                //double r= 0, i= 0;
                for (int n = 0; n < size; n++) {
                    crow[v + height / 2][k][n] = v * cos[k][n];
                    //srow[v+ height/ 2][k][n]= v* sin[k][n];
                }
            }
        }
        return true;
    }

    public double[] ft_fast(double inputs[]) {
        double[] input = Proportion_X_newXYBest.newXYBiliWithSameWidth(inputs
            , 1024.0, 100.0);
        return this.ft(input);
    }

//	double output[]= new double[input.length];
//	for(int k= 0; k< input.length; k++){
//		output[k]= input[k]*row[(int)input[k]+ height/ 2][k];
//	}
////	return output;

    //	return Proportion_X_newXYBest.newXYBiliWithSameWidth(output, 1024, 100);
    public double[][] ft_cos(int size) {
        double cos[][] = new double[size][size];
        for (int k = 0; k < size; k++) {
            for (int n = 0; n < size; n++) {
                cos[k][n] = Math.cos(k * n * init);
            }
        }
        return cos;
    }

    public double[][] ft_sin(int size) {
        double sin[][] = new double[size][size];
        for (int k = 0; k < size; k++) {
            for (int n = 0; n < size; n++) {
                sin[k][n] = Math.sin(k * n * init);
            }
        }
        return sin;
    }
}
