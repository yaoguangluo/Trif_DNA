package ASQ.group;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Percentage_X_getPixPercentByDeterPix {
    //思想：统计与概率论
    //作者：罗瑶光
    //目的：用于像素 筛选, 过滤 和 主要成分 分析。
    //这个函数用于求指定像素在图片中的像素占比。
    public static double _E(int[][] imagePix, int scaleRBG) {
        double output = 0.0;
        for (int[] pix : imagePix) {
            for (int j = 0; j < imagePix[0].length; j++) {
                if (scaleRBG == pix[j]) {
                    output++;
                }
            }
        }
        return output / (imagePix.length * imagePix[0].length);
    }
}
