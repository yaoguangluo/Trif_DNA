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

public class DETA_ANN_HMM {
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
                //System.out.println(sum);
                outNLP[j][i] = "" + Double.valueOf(inputNLP[j][i]) / sum;
            }
        }
        return outNLP;
    }
}

//    public String[][] summing_P(String[][] inputNLP) {
//        String[][] outNLP = inputNLP.clone();
//        if (0 == inputNLP.length) {
//            return outNLP;
//        }
//        for (int i = 7; i < inputNLP[0].length; i++) {
//            for (int j = 0; j < inputNLP.length; j++) {
//                double sum = 0;
//                for (int k = 0; k < inputNLP.length; k++) {
//                    sum += Double.valueOf(inputNLP[k][i]);
//                }
//                ////20230106-System.out.println(sum);
//                outNLP[j][i] = "" + Double.valueOf(inputNLP[j][i]) / sum;
//            }
//        }
//        return outNLP;
//    }
//20240530-luoyaoguang