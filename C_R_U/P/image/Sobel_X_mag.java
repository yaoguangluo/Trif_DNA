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
public class Sobel_X_mag {

    public static int[][] mag(double[][] gx, double[][] gy, int[] size) {
        double[][] mag = new double[size[0]][size[1]];
        int[][] outmag = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                mag[i][j] = Math.sqrt(Math.pow(gx[i][j], 2) + Math.pow(gy[i][j], 2));
                outmag[i][j] = (int) (mag[i][j] / (1020 * Math.sqrt(2)) * 255);
                if (outmag[i][j] > 20) {
                    outmag[i][j] = 255;
                } else {
                    outmag[i][j] = 0;
                }
            }
        }
        return CheckRange.P(outmag);
    }
}
// public static int[][] mag(double[][] gx, double[][] gy, int[] size) {
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