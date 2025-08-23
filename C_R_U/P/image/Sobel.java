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
public class Sobel {
    public static int[][] P(int[][] g, int choice) {
        int[][] refG = Reflection.PadImage(g, 3, 3);
        int[] size = {g.length, g[0].length};
        double[][] Gx;
        double[][] Gy;
        int[][] gxk = new int[][]{
            {-1, 0, 1},
            {-2, 0, 2},
            {-1, 0, 1}};
        int[][] gyk = new int[][]{
            {-1, -2, -1},
            {+0, +0, +0},
            {+1, +2, +1}};
        //GROUP OPERATION
        Gx = Group_O.GO(gxk, refG, size);
        Gy = Group_O.GO(gyk, refG, size);
        //MAG operation
        int[][] outmag = mag(Gx, Gy, size);
        //DIR operation
        int[][] outdir = dir(Gx, Gy, size);
        switch (choice) {
            case 1:
                return outmag;
            case 2:
                return outdir;
            default:
                return null;
        }
    }

    private static int[][] dir(double[][] gx, double[][] gy, int[] size) {
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

    public static int[][] P_WithMask(int[][] g, int choice) {
        int[][] refG = Reflection.PadImage(g, 3, 3);
        int[] size = {g.length, g[0].length};
        double[][] Gx;
        double[][] Gy;
        int[][] gxk = new int[][]{{-1, 0, 1}, {-2, 0, 2}, {-1, 0, 1}};
        int[][] gyk = new int[][]{{-1, -2, -1}, {0, 0, 0}, {1, 2, 1}};
        //GROUP OPERATION
        Gx = Group_O.GO(gxk, refG, size);
        Gy = Group_O.GO(gyk, refG, size);
        //MAG operation
        int[][] outmag = mag(Gx, Gy, size);
        //DIR operation
        int[][] outdir = dir(Gx, Gy, size);
        switch (choice) {
            case 1:
                return outmag;
            case 2:
                return outdir;
            default:
                return null;
        }
    }

    private static int[][] mag(double[][] gx, double[][] gy, int[] size) {
        double[][] mag = new double[size[0]][size[1]];
        int[][] outmag = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                mag[i][j] = Math.sqrt(Math.pow(gx[i][j], 2) + Math.pow(gy[i][j], 2));
                outmag[i][j] = (int) (mag[i][j] / (1020 * Math.sqrt(2)) * 255);
                if (outmag[i][j] > 10) {
                    outmag[i][j] = 255;
                } else {
                    outmag[i][j] = 0;
                }
            }
        }
        return CheckRange.P(outmag);
    }
}
//42
//    private static int[][] mag(double[][] gx, double[][] gy, int[] size) {
//        double[][] mag = new double[size[0]][size[1]];
//        int[][] outmag = new int[size[0]][size[1]];
//        for (int i = 0; i < size[0]; i++) {
//            for (int j = 0; j < size[1]; j++) {
//                mag[i][j] = Math.sqrt(Math.pow(gx[i][j], 2) + Math.pow(gy[i][j], 2));
//                outmag[i][j] = (int) (mag[i][j] / (1020 * Math.sqrt(2)) * 255);
//            }
//        }
//        return CheckRange.P(outmag);
//    }