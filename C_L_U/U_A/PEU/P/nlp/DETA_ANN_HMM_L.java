package U_A.PEU.P.nlp;

//作者 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class DETA_ANN_HMM_L {
    //笛卡尔内积时函数求解
    public double[]  dik(double[] [] input) {
        double[]  dik = new double[input.length];
        double k = 0.0;
        for(int i = 0; i < input.length; i++){
            k += input[i][0];
        }
        for(int i = 0; i < input.length; i++){
            double p = 0.0;
            for(int j = 0; j < input[0].length; j++){
                p += input[i][j];
            }
           dik[i] = p * k;
        }
        return dik;
    }
    public String[][] summing_P(String[][] inputNLP) {
        String[][] outNLP = inputNLP.clone();
        if (0 == inputNLP.length) {
            return outNLP;
        }
        for (int i = 7; i < inputNLP[0].length; i++) {
            double sum = 0.0;
            for (int k = 0; k < inputNLP.length; k++) {
                sum += Double.valueOf(inputNLP[k][i]);
            }
            for (int j = 0; j < inputNLP.length; j++) {
                ////20230106-System.out.println(sum);
                outNLP[j][i] = "" + Double.valueOf(inputNLP[j][i]) / sum;
            }
        }
        return outNLP;
    }
}	
