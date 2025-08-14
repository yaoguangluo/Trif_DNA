package O_V.OPE.SVU.OSU.dft;

import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;

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
public class Jp extends Panel implements Runnable {

    //
    public final double pi = 3.14159265;
    public final int N = 32 + 128;

    @SuppressWarnings("unused")
    public void paint(Graphics g) {
        Dimension d = this.getSize();
        int w = 1600;
        int h = 600;
        // //20230106-System.out.println(d.width+"**"+d.height);
        int INFOPAD = 15;
        //Graphics g= getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, w, h);
        g2.setColor(Color.white);
        g2.fillRect(0, h - INFOPAD, w, INFOPAD);

        double[] p = new double[32 + 128];
        double[] f = new double[32 + 128];
//		for(int n=0;n<32;n++){
//			p[n]=Math.sin(2*pi*n/32);
//			//20230106-System.out.println(":"+p[n]);
//		}
//		for(int n=0;n<128;n++){
//			p[n+32]=Math.sin(2*pi*n/128);
//			//20230106-System.out.println(":"+p[n]);
//		}
        double pi2 = 2 * pi;
        for (int n = 0; n < 32; n++) {
            double pi2n = pi2 * n;
            p[n] = Math.sin(pi2n / 32);
            p[n + 32] = Math.sin(pi2n / 128);
        }
        for (int n = 32; n < 128; n++) {
            p[n + 32] = Math.sin(pi2 * n / 128);
        }//类似这类优化一大把。
        g2.setColor(Color.RED);
        for (int i = 0; i < (32 + 128 - 1); i++) {
            g2.drawLine(i, (int) (p[i] * 100) + 100, i + 1, (int) (p[i + 1] * 100) + 100);
        }


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

        g2.setColor(Color.blue);

        for (int i = 200; i < (200 + 32 + 128 - 1); i++) {

            g2.drawLine(i, (int) (f[i - 200] * 1) + 100, i + 1, (int) (f[i - 200 + 1] * 1) + 100);
        }


        for (int k = 0; k < N; k++) {
            double r = 0.0, i = 0.0;
            for (int n = 0; n < N; n++) {
                r = r + f[n] * Math.cos(2 * pi * k * (n) / N);
                i = i + f[n] * Math.sin(2 * pi * k * (n) / N);
            }
            //	//20230106-System.out.println(":"+r+":"+i);

            p[k] = Math.sqrt(r * r + i * i);
            //p[k]=(r-i)/6;
            //20230106-System.out.println(":::"+p[k]);
        }

        g2.setColor(Color.black);

        for (int i = 400; i < (400 + 32 + 128 - 1); i++) {

            g2.drawLine(i, (int) (p[i - 400] * 1) + 100, i + 1, (int) (p[i - 400 + 1] * 1) + 100);
        }

    }

    @Override
    public void run() {


    }

}
