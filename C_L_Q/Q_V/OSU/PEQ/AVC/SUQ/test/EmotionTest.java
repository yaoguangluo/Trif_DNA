package Q_V.OSU.PEQ.AVC.SUQ.test;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class EmotionTest {
    @SuppressWarnings("unused")
    public static void main(String[] argv) {
        App NE= new App();
        //EmotionInit emotionInit= new EmotionInit();
        NE.app_S.emotionInit.IV_(S_String.text1, NE);
        //reduce
        double positiveCount = NE.app_S.emotionInit.getPositiveCount();
        double negativeCount = NE.app_S.emotionInit.getNegativeCount();
        double totalCount = NE.app_S.emotionInit.getTotalCount();
        //20230106-System.out.println("正面数：" + positiveCount);
        //20230106-System.out.println("负面数：" + negativeCount);
        if (positiveCount == 0) {
            positiveCount = 1.0;
        }
        if (negativeCount == 0) {
            negativeCount = 1.0;
        }
        double adjRatio = Math.abs(positiveCount / negativeCount - negativeCount / positiveCount);
        //20230106-System.out.println("渲染比率：" + adjRatio);
        double phychologicRatio = (positiveCount + negativeCount) / totalCount;
        //20230106-System.out.println("情绪比率：" + phychologicRatio);
        double infectionRatio = adjRatio * phychologicRatio;
        //20230106-System.out.println("感染比率：" + infectionRatio);
    }
}
