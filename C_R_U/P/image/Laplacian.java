package P.image;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 reinhart，思想 computer vision绿皮书
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Laplacian {
    public static int[][] P(int[][] g) {
        int[][] refG = Reflection.PadImage(g, 3, 3);
        int[] size = {g.length, g[0].length};
        double[][] Gx;
        int[][] gxk = new int[][]{
            {0, 1, 0},
            {1, -4, 1},
            {0, 1, 0}};
        //GROUP OPERATION
        Gx = Group_O.GO(gxk, refG, size);
        for (int i = 0; i < Gx.length; i++) {
            for (int j = 0; j < Gx[0].length; j++) {
                g[i][j] = (int) (Gx[i][j] / 8 + 127);
            }
        }
        return CheckRange.P(g);
    }
}	
