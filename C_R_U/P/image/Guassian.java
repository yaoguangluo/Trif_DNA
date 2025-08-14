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
public class Guassian {
    public static int[][] P_2D(int[][] g, int d, int e, double sig) {
        int[][] flac_grn = Reflection.PadImage(g, d, e);
        double[][] kenel = new double[d][e];
        double sumhere = 0.0;
        double t;
        for (int k = 0; k < d; ++k) {
            for (int l = 0; l < e; ++l) {
                t = (Math.pow(k - (d >> 1), 2) + Math.pow(l - (e >> 1), 2)) / (2 * Math.pow(sig, 2));
                t = Math.exp(-t);
                t = (t) / (Math.PI * Math.pow(sig, 2) * 2);
                kenel[k][l] = t;
                sumhere = sumhere + kenel[k][l];
            }
        }
        double sum1 = 0.0;
        for (int i = 0; i < d; ++i) {
            for (int j = 0; j < e; ++j) {
                kenel[i][j] = kenel[i][j] / sumhere;
                sum1 = sum1 + kenel[i][j];
            }
        }
        for (int i = d >> 1; i < g.length + d >> 1; i++) {
            for (int j = e >> 1; j < g[0].length + e >> 1; j++) {
                double sum = 0.0;
                for (int k = 0; k < d; k++) {
                    for (int l = 0; l < e; l++) {
                        sum = (sum + flac_grn[i + k - (d >> 1)][j + l - (e >> 1)] * kenel[k][l]);
                    }
                }
                g[i - (d >> 1)][j - (e >> 1)] = ((int) sum);
            }
        }
        return CheckRange.P(g);
    }

    public static int[][] P_1D(int[][] g, int frection, int kernel, double sig) {
        int[][] flac_grn = Reflection.PadImage(g, frection, kernel);
        double[][] kenel = new double[frection][kernel];
        double sumrow = 0.0;
        double sumcol = 0.0;
        double t;
        for (int k = 0; k < frection; ++k) {
            for (int l = kernel / 2; l < kernel / 2 + 1; ++l) {
                int frectionReg = frection >> 1;
                int kernelReg = kernel >> 1;
                t = (Math.pow(k - frectionReg, 2) + Math.pow(l - kernelReg, 2)) / (2 * Math.pow(sig, 2));
                t = Math.exp(-t);
                t = (1 * t) / (2 * Math.PI * Math.pow(sig, 2));
                kenel[k][l] = t;
                sumrow = sumrow + kenel[k][l];
            }
        }
        double sum1 = 0.0;
        for (int i = 0; i < frection; ++i) {
            for (int j = kernel / 2; j < kernel / 2 + 1; ++j) {
                kenel[i][j] = kenel[i][j] / sumrow;
                sum1 = sum1 + kenel[i][j];
            }
        }
        ////20230106-System.out.println("gaussian sum: " + sum1);
        ////GAUSSIAN KENEL col
        for (int k = frection / 2; k < frection / 2 + 1; ++k) {
            for (int l = 0; l < kernel; ++l) {
                int frectionReg = frection >> 1;
                int kernelReg = kernel >> 1;
                t = (Math.pow(k - frectionReg, 2) + Math.pow(l - kernelReg, 2))
                    / (2 * Math.pow(sig, 2));
                t = Math.exp(-t);
                t = (1 * t) / (2 * Math.PI * Math.pow(sig, 2));
                kenel[k][l] = t;
                sumcol = sumcol + kenel[k][l];
            }
        }
        ////20230106-System.out.println("--->"+sumcol);
        //--normalization col
        double sum2 = 0.0;
        for (int i = frection / 2; i < frection / 2 + 1; ++i) {
            for (int j = 0; j < kernel; ++j) {
                kenel[i][j] = kenel[i][j] / sumcol;
                sum2 = sum2 + kenel[i][j];
            }
        }
        //--end of producing gaussian matrix
        ////20230106-System.out.println("gaussian sum: " + sum2);
        //GAUSSIAN pro for row
        for (int i = frection / 2; i < g.length + frection / 2; i++) {
            for (int j = kernel / 2; j < g[0].length + kernel / 2; j++) {
                double sum = 0.0;
                for (int k = 0; k < frection; k++) {
                    for (int l = kernel / 2; l < kernel / 2 + 1; l++) {
                        sum = (sum + flac_grn[i + k - frection / 2][j + l - kernel / 2] * kenel[k][l]);
                    }
                }
                // //20230106-System.out.println(sum+"|");
                // //20230106-System.out.println(i-d/2);
                // //20230106-System.out.println(j-e/2);
                ////20230106-System.out.println(g.length);
                //if(j-e/2>)
                g[i - frection / 2][j - kernel / 2] = ((int) sum);
                // 	flac_grn[i][j]=(int)sum;
            }
        }
        //REFLACTION a new of rowed grn
        flac_grn = Reflection.PadImage(g, frection, kernel);
        //GAUSSIAN pro for col
        for (int i = frection / 2; i < g.length + frection / 2; i++) {
            for (int j = kernel / 2; j < g[0].length + kernel / 2; j++) {
                double sum = 0.0;
                for (int k = frection / 2; k < frection / 2 + 1; k++) {
                    for (int l = 0; l < kernel; l++) {
                        sum = (sum + flac_grn[i + k - frection / 2][j + l - kernel / 2] * kenel[k][l]);
                    }
                }
                // //20230106-System.out.println(sum);
                g[i - frection / 2][j - kernel / 2] = ((int) sum);
            }
        }
        return CheckRange.P(g);
    }

    public static BufferedImage P(BufferedImage lygimage, double d, double e, double k) {
        int[][] r = new ReadWritePng().REDpngRead(lygimage);
        int[][] g = new ReadWritePng().GRNpngRead(lygimage);
        int[][] b = new ReadWritePng().BLUpngRead(lygimage);
        //r[][]
        r = P_2D(r, (int)d, (int)e, k);
        //g[][]
        g = P_2D(g, (int)d, (int)e, k);
        //b[][]
        b = P_2D(b, (int)d, (int)e, k);
        //r[][]g[][]b[][] to image
        lygimage = new ReadWritePng().createBufferImage(r, g, b);
        return lygimage;
    }
}
