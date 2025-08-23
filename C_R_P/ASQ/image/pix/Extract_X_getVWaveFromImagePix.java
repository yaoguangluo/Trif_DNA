package ASQ.image.pix;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Extract_X_getVWaveFromImagePix {
    //思想：平面几何, 模式识别
    //作者：罗瑶光
    //适用于波形图变换数列.
    //将像素矩阵指定的RBG颜色值拿出来形成波形数列输出
    public static int[] _E(int[][] pixMap, int RGB) {
        int[] output = new int[pixMap.length];
        Next:
        for (int i = 0; i < pixMap.length; i++) {
            for (int j = 0; j < pixMap[0].length; j++) {
                if (RGB == pixMap[i][j]) {
                    output[i] = j;
                    continue Next;
                }
            }
        }
        return output;
    }
}
