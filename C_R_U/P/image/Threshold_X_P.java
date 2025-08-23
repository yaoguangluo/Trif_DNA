package P.image;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Threshold_X_P {
    public static int[][] P(int[][] g, int Td) {
        int[][] out = new int[g.length][g[0].length];
        for (int i = 0; i < g[0].length; ++i) {
            for (int j = 0; j < g.length; ++j) {
                if (g[j][i] > Td) {
                    out[j][i] = 255;
                }
            }
        }
        return out;
    }
}
