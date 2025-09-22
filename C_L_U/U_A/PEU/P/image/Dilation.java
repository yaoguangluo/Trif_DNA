package U_A.PEU.P.image;

import P.image.Reflection;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * 授课 reinhart 加州路德大学 课后作业。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Dilation {
    int[][] kernel;
    int[][] GetRegion;
    int[][] tempG;

    private static int[][] IV_Temp(int[][] thisG) {
        int[][] tempG = new int[thisG.length][thisG[0].length];
        for (int i = 0; i < thisG.length; i++) {
            for (int j = 0; j < thisG[0].length; j++) {
                tempG[i][j] = 0;
            }
        }
        return tempG;
    }

    public static int[][] P(int[][] g, int[][] kenel) {
        int thisw = g.length;
        int thish = g[0].length;
        int[][] thisG = null;
        if ((kenel.length % 2 == 0) && (kenel[0].length % 2 == 0))
            thisG = Reflection.PadImage(g, kenel.length + 1, kenel[0].length + 1);
        if ((kenel.length % 2 == 0) && (kenel[0].length % 2 == 1))
            thisG = Reflection.PadImage(g, kenel.length + 1, kenel[0].length);
        if ((kenel.length % 2 == 1) && (kenel[0].length % 2 == 0))
            thisG = Reflection.PadImage(g, kenel.length, kenel[0].length + 1);
        if ((kenel.length % 2 == 1) && (kenel[0].length % 2 == 1))
            thisG = Reflection.PadImage(g, kenel.length, kenel[0].length);
        int[][] tempG = IV_Temp(thisG);
        int w = kenel.length;
        int h = kenel[0].length;
        for (int i = w / 2; i < thisw + w / 2; i++) {
            for (int j = h / 2; j < thish + h / 2; j++) {
                for (int p = 0; p < w; p++) {
                    for (int q = 0; q < h; q++) {
                        if (kenel[p][q] == 1) {
                            if (thisG[i][j] > 0) {
                                tempG[i - w / 2 + p][j - h / 2 + q] = thisG[i][j];
                            }
                        }
                    }
                }
            }
        }
        int[][] out = new int[g.length][g[0].length];
        for (int i = 0; i < out[0].length; ++i) {
            for (int j = 0; j < out.length; ++j) {
                out[j][i] = tempG[j][i];
            }
        }
        return out;
    }
}
