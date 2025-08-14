package U_V.OEU.LYG4DQS4D;

//作者+ 著作权人： 罗瑶光, 浏阳,
////左右比对法开始
////思想: 快速排序4d思想, 罗瑶光小高峰过滤思想
////作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Quick_6D_AOP_MVE_CSI_DUQ_Sort {
    public int[] sort(int[] a) {
        quick2ds(a, 0, a.length - 1);
        return a;
    }

    private void quick2ds(int[] a, int lp, int rp) {
        if (lp < rp) {
            int c = rp - lp + 1;
            if (c < 7) {
                int j;
                for (int i = 1 + lp; i < lp + c; i++) {
                    j = i;
                    while (j >= 1 + lp) {
                        if (a[j] < a[j - 1]) {
                            int temp = a[j];
                            a[j] = a[j - 1];
                            a[j - 1] = temp;
                        }
                        j--;
                    }
                }
                return;
            }
            int pos = partition(a, lp, rp);
            quick2ds(a, lp, pos - 1);
            quick2ds(a, pos + 1, rp);
        }
    }

    private int partition(int[] a, int lp, int rp) {
        int x = a[lp];
        int rp1 = rp;
        int lp1 = lp;
        if (x > a[rp]) {
            x = a[rp];
        }
        while (lp1 < rp1) {
            while ((a[lp1] <= x) && (lp1 < rp1)) {
                lp1++;
            }
            while (a[rp1] > x) {
                rp1--;
            }
            if (lp1 < rp1) {
                int temp = a[rp1];
                a[rp1] = a[lp1];
                a[lp1] = temp;
            }
        }
        a[lp] = a[rp1];
        a[rp1] = x;
        return rp1;
    }

    public String[][] sort(String[][] a) {
        quick2dsString(a, 0, a.length - 1);
        return a;
    }

    private void quick2dsString(String[][] a, int lp, int rp) {
        if (lp < rp) {
            int c = rp - lp;
            if (c < 7) {
                int j;
                for (int i = 1 + lp; i <= lp + c; i++) {
                    j = i;
                    while (j >= 1 + lp) {
                        if (Double.valueOf(a[j][1]) < Double.valueOf(a[j - 1][1])) {
                            String[] temp = a[j];
                            a[j] = a[j - 1];
                            a[j - 1] = temp;
                        }
                        j--;
                    }
                }
                return;
            }
            int pos = partitionString(a, lp, rp);
            quick2dsString(a, lp, pos - 1);
            quick2dsString(a, pos + 1, rp);
        }
    }

    private int partitionString(String[][] a, int lp, int rp) {
        String[] x = a[lp];
        int rp1 = rp;
        int lp1 = lp;
        if (Double.valueOf(x[1]) >= Double.valueOf(a[rp][1])) {
            x = a[rp];
        }
        while (lp1 < rp1) {
            while ((Double.valueOf(a[lp1][1]) <= Double.valueOf(x[1])) && (lp1 < rp1)) {
                lp1++;
            }
            while (Double.valueOf(a[rp1][1]) > Double.valueOf(x[1])) {
                rp1--;
            }
            if (lp1 < rp1) {
                String[] temp = a[rp1];
                a[rp1] = a[lp1];
                a[lp1] = temp;
            }
        }
        a[lp] = a[rp1];
        a[rp1] = x;
        return rp1;
    }
}
