package P.PDEMask;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Btest {

    public static void main(String[] argv) {
        int n = 10;
        int m = 11;
        int[][] sample = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sample[i][j] = (int) (Math.random() * 10000);
            }
        }
//
        //w1内核 幂级微分流形
        //不会在电脑上出现，不惹事

        //w2内核 对数高斯模糊
        //不会在电脑上出现，不惹事

        //w3内核 量子系数叠积
        //W3= Wn/N， W3n=sigma（WnIJ+）* W3ij

        //不会在电脑上出现，不惹事，
        //w4内核 +-红黑树递归
        //不会在电脑上出现，不惹事
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sample[i][j] + "  ");
            }
            System.out.println("--");
        }
    }
}
//    public void doSp() {
//
//    }