//package P.image;
//
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * 授课 reinhart，思想 computer vision绿皮书
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class Sobel_X_P {
//    public static int[][] P(int[][] g, int choice) {
//        int[][] refG = Reflection.PadImage(g, 3, 3);
//        int[] size = {g.length, g[0].length};
//        double[][] Gx = new double[size[0]][size[1]];
//        double[][] Gy = new double[size[0]][size[1]];
//        int[][] gxk = new int[][]{{-1, 0, 1}, {-2, 0, 2}, {-1, 0, 1}};
//        ;
//        int[][] gyk = new int[][]{{-1, -2, -1}, {0, 0, 0}, {1, 2, 1}};
//        //GROUP OPERATION
//        Gx = Group_O.GO(gxk, refG, size);
//        Gy = Group_O.GO(gyk, refG, size);
//        //MAG operation
//        int[][] outmag = Sobel_X_mag.mag(Gx, Gy, size);
//        //DIR operation
//        int[][] outdir = Sobel_X_dir.dir(Gx, Gy, size);
//        switch (choice) {
//            case 1:
//                return outmag;
//            case 2:
//                return outdir;
//            default:
//                return null;
//        }
//    }
//
//    public static int[][] P_WithMask(int[][] g, int choice, int mask) {
//        int[][] refG = Reflection.PadImage(g, 3, 3);
//        int[] size = {g.length, g[0].length};
//        double[][] Gx = new double[size[0]][size[1]];
//        double[][] Gy = new double[size[0]][size[1]];
//        int[][] gxk = new int[][]{{-1, 0, 1}, {-2, 0, 2}, {-1, 0, 1}};
//        ;
//        int[][] gyk = new int[][]{{-1, -2, -1}, {0, 0, 0}, {1, 2, 1}};
//        //GROUP OPERATION
//        Gx = Group_O.GO(gxk, refG, size);
//        Gy = Group_O.GO(gyk, refG, size);
//        //MAG operation
//        int[][] outmag = Sobel_X_mag.mag(Gx, Gy, size);
//        //DIR operation
//        int[][] outdir = Sobel_X_dir.dir(Gx, Gy, size);
//        switch (choice) {
//            case 1:
//                return outmag;
//            case 2:
//                return outdir;
//            default:
//                return null;
//        }
//    }
//}
