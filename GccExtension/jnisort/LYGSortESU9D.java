package jnisort;

import U_V.ESU.sort.Quick9DLYGWithString_ESU;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */
//demo调通。准备接口化编码。明年，华瑞集3.0
public class LYGSortESU9D {
    static {
        System.setProperty("java.library.path", ".");
        //System.loadLibrary("HelloLYGSortESU9D");
    }

    Quick9DLYGWithString_ESU quick9DLYGWithString_ESU = new Quick9DLYGWithString_ESU();

    public native int[] jnisort(int[] a, String[] sa);

    public int[] javaSort(int[] a, String[] sa) {
        return quick9DLYGWithString_ESU.sort(a, sa);
    }
}
/**
 *
 *
 *
 * public static void main(String[] args) {
 * //        int[] a = new int[99];
 * //        String[] sa = new String[99];
 * //        for (int i = 0; i < 99; i++) {
 * //            a[i] = (int) (1000000 * Math.random());
 * //            sa[i] = "" + a[i];
 * //        }
 * //        int v[] = new LYGSortESU9D().javaSort(a, sa);
 * //        for (int i = 0; i < 99; i++) {
 * //            System.out.print(a[i]);
 * //            System.out.print("-");
 * //            System.out.print(sa[i]);
 * //            System.out.println("--");
 * //        }
 * //    }
 */
