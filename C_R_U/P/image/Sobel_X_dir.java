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
public class Sobel_X_dir {
    public static int[][] dir(double[][] gx, double[][] gy, int[] size) {
        double[][] dir = new double[size[0]][size[1]];
        int[][] outdir = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                dir[i][j] = Math.atan2(gy[i][j], gx[i][j]);
                outdir[i][j] = (int) ((dir[i][j] + Math.PI) / (2 * Math.PI) * 32) * 8;
                if (outdir[i][j] > 255) {
                    outdir[i][j] = 255;
                }
            }
        }
        return CheckRange.P(outdir);
    }
}
