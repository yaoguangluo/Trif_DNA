package P.image;

import U_A.PEU.P.image.ReadWritePng;

import java.awt.image.BufferedImage;

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
public class Median {
    public static int[][] P(int[][] g, int d, int e) {
        int[][] refG = Reflection.PadImage(g, d, e);
        int[] neib = new int[d * e];//for sort
        for (int i = d / 2; i < g.length + d / 2; i++) {
            for (int j = e / 2; j < g[0].length + e / 2; j++) {
                int q = 0;
                for (int k = 0; k < d; k++) {
                    for (int l = 0; l < e; l++) {
                        //find 3*3
                        neib[q++] = refG[i + k - d / 2][j + l - e / 2];
                        //sort 3*3 bbsort
                    }
                }
                for (int o = 0; o < 9; o++) {
                    for (int p = 0; p < 9; p++) {
                        if (neib[o] > neib[p]) {
                            int temp = neib[o];
                            neib[o] = neib[p];
                            neib[p] = temp;
                        }
                    }
                }
                //get median
                g[i - d / 2][j - e / 2] = neib[(d * e) / 2];// 4 is middle valueof sort 9
            }
        }
        return CheckRange.P(g);
    }

    public static BufferedImage P(BufferedImage lygimage, int d, int e) {
        int[][] r = new ReadWritePng().REDpngRead(lygimage);
        int[][] g = new ReadWritePng().GRNpngRead(lygimage);
        int[][] b = new ReadWritePng().BLUpngRead(lygimage);
        //r[][]
        r = P(r, d, e);
        //g[][]
        g = P(g, d, e);
        //b[][]
        b = P(b, d, e);
        //r[][]g[][]b[][] to image
        lygimage = new ReadWritePng().createBufferImage(r, g, b);
        return lygimage;
    }
}
