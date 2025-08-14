/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package P_V.PEQ.AMV.ECS.test;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;
import U_A.PEU.P.nlp.DETA_ANN_HMM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ANNTest {
    private String text = S_String.text1;

    public static void main(String[] argv, String text, String string, ANNTest aNNTest, App NE) {
        String[][] annMatrix = aNNTest.getANNMatrix(S_String.text1, NE);
        for (int j = 0; j < annMatrix.length; j++) {
            double sum = 0.0;
            for (int i = 7; i < annMatrix[0].length; i++) {
                sum += Double.valueOf(annMatrix[j][i]);
            }
            if (sum >= 0.6) {
                //20230106-System.out.println(AnnMatrix[j][0]+AnnMatrix[j][1]
                // + AnnMatrix[j][2] + AnnMatrix[j][3] + "ANN:" + sum);
            }
        }
    }
//
//    public String[][] getANNMatrix(CogsBinaryForest_AE _A, EmotionSample emotionSample
//            , RatioMap_E ratioMap) {
//        SensingTest sensingTest = new SensingTest();
//        //SUM OF ANN MAP CULUMN KERNEL
//        String[][] preAnnMatrix = sensingTest.getMatrix(text, _A, emotionSample, ratioMap);
//        String[][] AnnMatrix = new DETA_ANN_HMM().summing_P(preAnnMatrix);
//        return AnnMatrix;
//    }

    public String[][] getANNMatrix(String text, App NE) {
        this.text = text;
        //string = text;//check later..
        return getANNMatrix(NE);
    }

//    public String[][] getANNMatrix(String string) {
//        SensingTest sensingTest = new SensingTest();
//        //SUM OF ANN MAP CULUMN KERNEL
//        String[][] preAnnMatrix = sensingTest.getMatrix(string);
//        String[][] AnnMatrix = new DETA_ANN_HMM().summing_P(preAnnMatrix);
//        String[][] POSPCAAnnMatrix = getPOSPCAAnnMatrix(AnnMatrix, NE.app_S._A.getPosCnToCn());
//        return POSPCAAnnMatrix;
//        //	return POSPCAAnnMatrix= AnnMatrix;
//    }

    public String[][] getPOSPCAAnnMatrix(String[][] AnnMatrix, App NE) {
        List<String[]> list = new ArrayList<>();
        for (int j = 0; j < AnnMatrix.length; j++) {
            if (NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn
                .containsKey(AnnMatrix[j][0])) {
                String string = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn
                    .getString(AnnMatrix[j][0]);
                if (string.contains("名")
                    || string.contains("动")
                    || string.contains("医")
                    || string.contains("谓")
                    || string.contains("形")) {
                    list.add(AnnMatrix[j]);
                }
            }
        }
        String[][] PCANLP = new String[list.size()][15];
        Iterator<String[]> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            PCANLP[i++] = iterator.next();
        }
        return PCANLP;
    }

    public String[][] getANNMatrix(App NE) {
        String string = this.text;
        //SUM OF ANN MAP CULUMN KERNEL
        String[][] preAnnMatrix = NE.app_S.sensingTest.getMatrix(string, NE);
        if (null == preAnnMatrix) {
            return null;
        }
        String[][] AnnMatrix = new DETA_ANN_HMM().summing_P(preAnnMatrix);
        if (null == AnnMatrix) {
            return null;
        }
        String[][] POSPCAAnnMatrix = getPOSPCAAnnMatrix(AnnMatrix, NE);
        return POSPCAAnnMatrix;
    }
}
