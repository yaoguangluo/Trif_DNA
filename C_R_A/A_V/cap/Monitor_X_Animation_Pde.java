package A_V.cap;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;
import O_V.OSI.AOP.freetts.thread.read.ReadEnglish;
import P.image.Emboss;
import P.image.Guassian;
import P.image.Laplacian;
import P.image.Sobel;
import VSQ.ICAQDTVMQVM.Monitor_X_S;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Monitor_X_Animation_Pde {
    @SuppressWarnings("deprecation")
    public static void X_paint_pde(Monitor_X_S monitor, Monitor_X_ monitor_XCDX
        , Graphics g, BufferedImage image) {
        if (monitor.isbt62Stop) {
            monitor.rp = Emboss.P(monitor.rp);
            monitor.gp = Emboss.P(monitor.gp);
            monitor.bp = Emboss.P(monitor.bp);
        }
        if (monitor.isbt113Stop) {
            monitor.rp = Sobel.P(monitor.rp, 1);
            monitor.gp = Sobel.P(monitor.gp, 1);
            monitor.bp = Sobel.P(monitor.bp, 1);
        }
        if (monitor.isbt43Stop) {
            monitor.rp = Guassian.P_1D(monitor.rp, 3, 3, 1.66);
            monitor.gp = Guassian.P_1D(monitor.gp, 3, 3, 1.66);
            monitor.bp = Guassian.P_1D(monitor.bp, 3, 3, 1.66);
        }
        if (monitor.isbt41Stop) {
            monitor.rp = Laplacian.P(monitor.rp);
            monitor.gp = Laplacian.P(monitor.gp);
            monitor.bp = Laplacian.P(monitor.bp);
        }
        if (monitor.isbt41Stop) {
            monitor.rp = Laplacian.P(monitor.rp);
            monitor.gp = Laplacian.P(monitor.gp);
            monitor.bp = Laplacian.P(monitor.bp);
        }
        if (monitor.isbt114Stop) {
            RangePDI.IOE(monitor.rp, monitor.fact);
            RangePDI.IOE(monitor.gp, monitor.fact);
            RangePDI.IOE(monitor.bp, monitor.fact);
        }
        if (monitor.isbt121Stop) {
            RangePDI.IPE(monitor.rp, monitor.facy);
            RangePDI.IPE(monitor.gp, monitor.facy);
            RangePDI.IPE(monitor.bp, monitor.facy);
        }
        if (monitor.isbt124Stop) {
            RangePDI.IPE_AOPM_VECS_IDUQ_TXH(monitor.rp, monitor.facy);
            RangePDI.IPE_AOPM_VECS_IDUQ_TXH(monitor.gp, monitor.facy);
            RangePDI.IPE_AOPM_VECS_IDUQ_TXH(monitor.bp, monitor.facy);
        }
        if (monitor.isbt132Stop) {
            RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(monitor.rp, monitor.facy);
            RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(monitor.gp, monitor.facy);
            RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(monitor.bp, monitor.facy);
        }
        if (monitor.isbt122Stop) {
            RangePDI.QPE(monitor.rp, monitor.facx);
            RangePDI.QPE(monitor.gp, monitor.facx);
            RangePDI.QPE(monitor.bp, monitor.facx);
        }
        if (monitor.isbt123Stop) {
            double facxd = ((double) monitor.facx) / 360;
            monitor.rp = monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, monitor.rp, facxd);
            monitor.gp = monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, monitor.gp, facxd);
            monitor.bp = monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, monitor.bp, facxd);
        }
        for (int i = 0; i < image.getHeight(); ++i) {
            for (int j = 0; j < image.getWidth(); ++j) {
                int pixel = (monitor.rp[j][i] << 16) | (monitor.gp[j][i] << 8) | (monitor.bp[j][i]);
                if (monitor.showOCLDr[j][i] == 255) {
                    if (monitor.r2r[j][i] > 30) {
                        pixel = (monitor.r2r[j][i] << 16);
                    }
                }
                if (monitor.showOCLDg[j][i] == 255) {
                    if (monitor.r2g[j][i] > 30) {
                        pixel = pixel | (monitor.r2g[j][i] << 8);
                    }
                }
                if (monitor.showOCLDb[j][i] == 255) {
                    if (monitor.r2b[j][i] > 30) {
                        pixel = pixel | monitor.r2b[j][i];
                    }
                }
                image.setRGB(j, i, pixel);
            }
        }
        if (!monitor.recordStop) {
            if (monitor.imageList.size() < 32 * 60 * 60) {
                //20230106-System.out.println(1);
                int width = image.getWidth();
                int height = image.getHeight();
                int[][] flips = new int[width][height];
                for (int i = 0; i < image.getHeight(); ++i) {
                    for (int j = 0; j < image.getWidth(); ++j) {
                        flips[j][i] = image.getRGB(j, i);
                    }
                }
                monitor.imageList.add(flips);
            }
        }
        g.drawImage(image, 0, 0, 900, 650, monitor_XCDX);// 绘出图形文件
        monitor.imageForOutput = image;
        if (monitor.findr == 2) {
            if (monitor.readEnglish.finish == 1) {
                monitor.readEnglish = new ReadEnglish();
                monitor.readEnglish.I_PreReadText("attension please");
                monitor.readEnglish.start();
            }
            //write
            Date d = new Date();
            monitor.newtime = "" + d.getDay() + d.getHours() + d.getMinutes();
            monitor.newmi = d.getTime();
            long v = Math.abs(monitor.newmi - monitor.mi);
            if (monitor.newtime.equalsIgnoreCase(monitor.time) && v > 3000) {
                File outputBin = new File("C:\\Users\\Administrator\\Desktop\\monit\\rec"
                    + monitor.newtime + monitor.newmi + ".jpg");
                try {
                    ImageIO.write(image, "png", outputBin);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                monitor.mi = monitor.newmi;
            }
            monitor.time = monitor.newtime;
        }
    }
}
