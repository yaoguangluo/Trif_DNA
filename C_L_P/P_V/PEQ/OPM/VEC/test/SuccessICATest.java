/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package P_V.PEQ.OPM.VEC.test;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.E.RatioMap_E;
import A_V.ica.InitBehaviorICAKernel;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;
import S_A.VSQ.parser.EmotionSample;
import U_A.PEU.P.matrix.CnnMeasure;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class SuccessICATest {
    public double[][] kernelCNN;

    public void IQ_KernelCNN(double[][] kernel) {
        kernelCNN = new CnnMeasure().getCnnMeansure(kernel);
    }

    public static void main(String[] argv, EmotionMap_E emotionMap_E
        , EmotionInit emotionInit, RatioMap_E ratioMap_E
        , SuccessICATest successICATest, CogsBinaryForest_AE _AE
        , EmotionSample emotionSample) {
        App NE = new App();
        //ICA kernel
        double[][] kernel = new double[3][];
        kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text1, NE
//				, emotionMap_E, emotionInit, ratioMap_E, _AE, emotionSample//later
        );
        kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text2, NE);
        kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text3, NE);
        successICATest.IQ_KernelCNN(kernel);
        for (int i = 0; i < successICATest.kernelCNN.length; i++) {
            for (int j = 0; j < successICATest.kernelCNN[0].length; j++) {
                //20230106-System.out.print(successICATest.kernelCNN[i][j] + " ");
            }
            //20230106-System.out.println();
        }
        //do ICA normalization
        //do ROBUST ICA
        //do map
        //do reduce sets
        //sets Turing
    }
}
