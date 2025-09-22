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
public class PrintMoments {
    public static void PrintCurrent(int[][] g, int pix) {
        double m00 = 0.0, m01 = 0.0, m02 = 0.0, m10 = 0.0, m11 = 0.0, m20 = 0.0;
        double p00 = 0.0, p01 = 0.0, p02 = 0.0, p10 = 0.0, p11 = 0.0, p20 = 0.0;
        for (int q = 0; q < g.length; q++) {
            for (int p = 0; p < g[0].length; p++) {
                if (g[q][p] == pix) {
                    m00 = m00 + Math.pow(q, 0) * Math.pow(p, 0);
                    m01 = m01 + Math.pow(q, 0) * Math.pow(p, 1);
                    m02 = m02 + Math.pow(q, 0) * Math.pow(p, 2);
                    m10 = m10 + Math.pow(q, 1) * Math.pow(p, 0);
                    m11 = m11 + Math.pow(q, 1) * Math.pow(p, 1);
                    m20 = m20 + Math.pow(q, 2) * Math.pow(p, 0);
                }
            }
        }
        double mean_x = m10 / m00, mean_y = m01 / m00;
        for (int q = 0; q < g.length; q++) {
            for (int p = 0; p < g[0].length; p++) {
                if (g[q][p] == pix) {
                    p00 = (p00 + Math.pow(q - mean_x, 0) * Math.pow(p - mean_y, 0));
                    p01 = (p01 + Math.pow(q - mean_x, 0) * Math.pow(p - mean_y, 1));
                    p02 = (p02 + Math.pow(q - mean_x, 0) * Math.pow(p - mean_y, 2));
                    p10 = (p10 + Math.pow(q - mean_x, 1) * Math.pow(p - mean_y, 0));
                    p11 = (p11 + Math.pow(q - mean_x, 1) * Math.pow(p - mean_y, 1));
                    p20 = (p20 + Math.pow(q - mean_x, 2) * Math.pow(p - mean_y, 0));
                }
            }
        }
    }
}
//20230106-System.out.println("region--->"+pix);
//20230106-System.out.println("p00------>"+p00);
//20230106-System.out.println("p01------>"+p01);
//20230106-System.out.println("p02------>"+p02);
//20230106-System.out.println("p10------>"+p10);
//20230106-System.out.println("p11------>"+p11);
//20230106-System.out.println("p20------>"+p20);
