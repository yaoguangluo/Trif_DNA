package jniFFT;

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
public class LYGFFT {
    static {
        System.setProperty("java.library.path", ".");
        //System.loadLibrary("HelloLYGFFT");
    }

    public native double[] jnifft(double[] a);

    public static void main(String[] args) {
        double[] a= new double[128];
        for(int i=0; i<128; i++){
            a[i]= (1000000 * Math.random());
            System.out.println(a[i]);
        }
        double[]  b= new LYGFFT().jnifft(a);
        for(int i=0; i<128;i++){
            System.out.println(b[i]);
        }
    }
}