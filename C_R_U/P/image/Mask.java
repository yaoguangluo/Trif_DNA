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
public class Mask {
    public static int[][] P(int[][] mag, int[][] dir) {
        for (int i = 0; i < mag.length; i++) {
            for (int j = 0; j < mag[0].length; j++) {
                if (mag[i][j] == 0) {
                    dir[i][j] = 0;
                }
            }
        }
        return dir;
    }
}
