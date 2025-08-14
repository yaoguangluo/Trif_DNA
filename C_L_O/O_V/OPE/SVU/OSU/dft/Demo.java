package O_V.OPE.SVU.OSU.dft;

//思想 refer 傅里叶
//编码 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Demo {

    public static void main(String[] args) {
        final double pi = 3.14159265;
        final int N = 8;
        //made origen
        double[] p = new double[8];
        double[] f = new double[8];
        for (int n = 0; n < 8; n++) {
            p[n] = Math.sin(2 * pi * n / N);
            //20230106-System.out.println(":"+p[n]);
        }
        //dft
        for (int k = 0; k < N; k++) {
            double r = 0.0, i = 0.0;
            for (int n = 0; n < N; n++) {
                r = r + p[n] * Math.cos(2 * pi * k * n / N);
                i = i + p[n] * Math.sin(2 * pi * k * n / N);
            }
            //	//20230106-System.out.println(":"+r+":"+i);
            f[k] = Math.sqrt(r * r + i * i);
            //20230106-System.out.println("::"+f[k]);
        }
        //f[1]=0;  0   1   0    -1   0
        //idft     1   0   -1    0   1
        for (int k = 0; k < N; k++) {
            double r = 0.0, i = 0.0;
            for (int n = 0; n < N; n++) {
                r = r + f[n] * Math.cos(2 * pi * k * (n) / N);
                i = i + f[n] * Math.sin(2 * pi * k * (n) / N);
            }
            //	//20230106-System.out.println(":"+r+":"+i);
            p[k] = (r - i) / 8;
            ////20230106-System.out.println(":::"+p[k]);
        }
    }
}
