package ASQ.martrix;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class MartrixFilter_X_getIsolationFilterMartix3D {
    //带精度 多维矩阵中非有效成份筛选过滤算法
    //Theory, 模式识别, 专家系统, 罗瑶光Yaoguang.Luo
    //Application 罗瑶光
    //scaleDistance 为 卷积筛选的精度, PCARatio为有效邻接总数的量比
    //适用于 索贝尔 emboss等卷积处理过滤后, 进行噪声过滤。增加精准度。

    public int[][][] _E(int[][][] input, int scaleDistance, double PCARatio) {
        double compareRate = Math.pow(1 + scaleDistance * 2, 3) * PCARatio;
        int[][][] output = new int[input.length][input[0].length][input[0][0].length];
        for (int i = scaleDistance; i < input.length - scaleDistance; i++) {
            for (int j = scaleDistance; j < input[0].length - scaleDistance; j++) {
                for (int k = scaleDistance; k < input[0].length - scaleDistance; k++) {
                    if (0 < input[i][j][k]) {
                        int PCA = 0;
                        for (int p = -scaleDistance; p < scaleDistance; p++) {
                            for (int q = -scaleDistance; q < scaleDistance; q++) {
                                for (int r = -scaleDistance; r < scaleDistance; r++) {
                                    if (input[p][q][r] == input[i][j][r]) {
                                        PCA++;
                                    }
                                }
                            }
                        }
                        //筛选过滤
                        if (PCA > compareRate) {
                            output[i][j][k] = input[i][j][k];
                        }
                    }
                }
            }
        }
        return output;
    }
}
