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

import A_V.ica.InitBehaviorICAKernel;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Pos;
import S_A.SVQ.stable.S_String;
import S_A.VSQ.parser.EmotionSample;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LiterarinessLevelTest {
    public double[]  literarinessLevel;
    public double literarinessDuration;

    public void IQ_EducationLevel(double[][] measurement) {
        literarinessLevel = new double[measurement.length];
        for (int i = S_Pos.INT_ZERO; i < measurement.length; i++) {
            literarinessLevel[i] = (measurement[i][S_Pos.INT_ZERO]
                    * measurement[i][S_Pos.INT_THREE])
                    / measurement[i][S_Pos.INT_ONE];
            literarinessDuration += literarinessLevel[i];
            //20230106-System.out.println("literarinessLevel:" +literarinessLevel[i]);
        }
        literarinessDuration /= literarinessLevel.length;
        //20230106-System.out.println("literarinessDuration:" + literarinessDuration);
    }

    public static void main(String[] argv, CogsBinaryForest_AE _AE
            , EmotionSample emotionSample) {
        App NE=new App();
        //ICA kernel
        double[] [] kernel = new double[3][];
        kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text1, NE);
        kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text2, NE);
        kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(S_String.text3, NE);
        LiterarinessLevelTest educationLevelTest = new LiterarinessLevelTest();
        educationLevelTest.IQ_EducationLevel(kernel);
    }
}
