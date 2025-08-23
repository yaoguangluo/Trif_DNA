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

public class Strech {
    public static int[][] P(int[][] g, double d, double e) {
        //输入变量
        int[] histgram = new int[256];
        //统计像素分布
        for (int[] ints : g) {//逐行
            for (int j = 0; j < g[0].length; j++) {
                ++histgram[ints[j]];
            }
        }
        //分布表达
        float p = 0;
        int br = 0, dr = 0;
        for (int i = 0; i < 256; i++) {
            p = p + histgram[i];//总数
            if (p > d * g.length * g[0].length) {
                dr = i;
                break;
            }
        }
        ////20230106-System.out.println("dr:"+dr);
        p = 0;
        for (int i = 0; i < 256; i++) {
            p = p + histgram[i];
            if (p > e * g.length * g[0].length) {
                br = i;
                break;
            }
        }
        ////20230106-System.out.println("br:"+br);
        //整合
        int[][] out = new int[g.length][g[0].length];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                if (br - dr != 0) {
                    out[i][j] = (g[i][j] - dr) * 255 / (br - dr);
                }
            }
        }
        return CheckRange.P(out);
    }

    public static BufferedImage P(BufferedImage lygimage, double d, double e) {
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
