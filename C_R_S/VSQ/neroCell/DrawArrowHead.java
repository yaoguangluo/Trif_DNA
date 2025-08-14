package VSQ.neroCell;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DrawArrowHead {
    public static int[][] coords;

    //将bitmap的矩阵有效坐标值 swap成 坐标队列array。
    //DNA元基催化与肽计算 著作权文件有申明该算法加速思想。
    //罗瑶光
    public static int[][] coordSwap(int[][] inputs) {
        int x = inputs.length;
        int y = inputs[0].length;
        int count = 0;
        coords = new int[2][x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (1 == inputs[i][j]) {
                    coords[0][count] = j;
                    coords[1][count++] = i;
                }
            }
        }
        coords[0][count] = -1;
        return coords;
    }

    public static final int[][] neroShape = {
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
        {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
        {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
    };

}
