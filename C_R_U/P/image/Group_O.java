package P.image;

//这个函数片段就不在第四版本919著作权申请范围内
//我当年写作业的时候刚好在写这段时候, 罗阳莫名靠近我,
//打我电话说和我一起写, 然后用qq加了我, 然后qq和高顺讨论了, 我觉得因为有讨论的思维痕迹,
//所以我不能申请著作权,
/*
 * 作者 罗瑶光，罗阳，高顺
 * 授课 reinhart，思想 computer vision绿皮书
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Group_O {
    public static double[][] GO(int[][] kener, int[][] refG, int[] size) {
        double[][] Imagex = new double[size[0]][size[1]];
        double sum;
        int filterHeight = kener.length;
        int filterWidth = kener[0].length;
        for (int i = filterHeight / 2, p = 0; i < refG.length - filterHeight / 2; ++i, ++p) {
            for (int j = filterWidth / 2, q = 0; j < refG[0].length - filterWidth / 2; ++j
                , ++q) {
                sum = 0.0;
                for (int k = -filterHeight / 2; k <= filterHeight / 2; ++k) {
                    for (int l = -filterWidth / 2; l <= filterWidth / 2; ++l) {
                        sum = sum + (refG[i + k][j + l] * kener[k + filterHeight / 2][l
                            + filterWidth / 2]);
                    }
                }
                Imagex[p][q] = sum;
            }
        }
        return Imagex;
    }
}
