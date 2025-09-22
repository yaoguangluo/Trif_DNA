package A_V.cap;

import S_A.SVQ.stable.S_Vision;
import VSQ.ICAQDTVMQVM.Monitor_X_S;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Monitor_X_Animation_PcfButton {
    @SuppressWarnings({"unused"})
    public static void X_paint_PcfButton(Monitor_X_S monitor, Monitor_X_ monitor_XCDX
        , Graphics g, BufferedImage image) {
        int[][] diff2r;
        int[][] diff2g;
        int[][] diff2b;
        //CCA 关联成分分析
        if (monitor.isPcaButton) {
            if (monitor.isRedButton) {
                diff2r = monitor_XCDX.findDiff(monitor.gpcar, monitor.out_old2r);
                monitor.ccar = U_A.PEU.P.image.Dilation.P(diff2r, S_Vision.diaMask);
            }
            if (monitor.isGreenButton) {
                diff2g = monitor_XCDX.findDiff(monitor.gpcag, monitor.out_old2g);
                monitor.ccag = U_A.PEU.P.image.Dilation.P(diff2g, S_Vision.diaMask);
            }
            if (monitor.isBlueButton) {
                diff2b = monitor_XCDX.findDiff(monitor.gpcab, monitor.out_old2b);
                monitor.ccab = U_A.PEU.P.image.Dilation.P(diff2b, S_Vision.diaMask);
            }
        } else {
            monitor.ccar = monitor.gpcar;
            monitor.ccag = monitor.gpcag;
            monitor.ccab = monitor.gpcab;
        }
        //OJLID
        int cxr = 0;
        int cyr = 0;
        monitor.showOCLDr = new int[image.getHeight()][image.getHeight()];//5年没看，一看哇靠，一群贱逼。
        monitor.showORGNr = new int[image.getHeight()][image.getHeight()];
        int cxg = 0;
        int cyg = 0;
        int findg = 0;
        monitor.showOCLDg = new int[image.getHeight()][image.getHeight()];
        monitor.showORGNg = new int[image.getHeight()][image.getHeight()];
        int cxb = 0;
        int cyb = 0;
        int findb = 0;
        monitor.showOCLDb = new int[image.getHeight()][image.getHeight()];
        monitor.showORGNb = new int[image.getHeight()][image.getHeight()];
        if (!monitor.isPcfButton) {//麻痹加!*/
            monitor.showOCLDr = monitor.ccar;
            monitor.showORGNr = monitor.ccar;
            monitor.showOCLDg = monitor.ccag;
            monitor.showORGNg = monitor.ccag;
            monitor.showOCLDb = monitor.ccab;
            monitor.showORGNb = monitor.ccab;
            return;
        }
        for (int i = 0; i < image.getHeight(); ++i) {
            for (int j = 0; j < image.getWidth(); ++j) {
                if (monitor.isRedButton) {
                    if (monitor.ccar[j][i] > 0) {
                        if (cxr == 0 && cyr == 0) {
                            cxr = cxr + j;
                            cyr = cyr + i;
                        }
                        cxr = cxr + j;
                        cyr = cyr + i;
                        monitor.findr = 1;
                        monitor.showOCLDr[j][i] = 255;
                        monitor.showORGNr[j][i] = 255;
                        cxr = cxr >> 1;
                        cyr = cyr >> 1;
                        float dx = cxr - j;
                        float dy = cyr - i;
                        float co = dy / dx;
                        int dis = Math.abs(cxr - j);
                        //欧基里德填充
                        for (int k = 0; k < dis; k++) {
                            if (cxr >= j && cyr >= i) {
                                monitor.showOCLDr[j + k][i + (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDr, j + k
                                    , i + (int) (k * co), monitor.fact, 1);
                            }
                            if (cxr < j && cyr >= i) {
                                monitor.showOCLDr[j - k][i - (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDr, j - k
                                    , i - (int) (k * co), monitor.fact, 2);
                            }
                            if (cxr >= j && cyr < i) {
                                monitor.showOCLDr[j + k][i + (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDr, j + k
                                    , i + (int) (k * co), monitor.fact, 3);
                            }
                            if (cxr < j && cyr < i) {
                                monitor.showOCLDr[j - k][i - (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDr, j - k
                                    , i - (int) (k * co), monitor.fact, 4);
                            }
                        }
                    }
                }
                if (monitor.isGreenButton) {
                    if (monitor.ccag[j][i] > 0) {
                        if (cxg == 0 && cyg == 0) {
                            cxg = cxg + j;
                            cyg = cyg + i;
                        }
                        cxg = cxg + j;
                        cyg = cyg + i;
                        monitor.showOCLDg[j][i] = 255;
                        monitor.showORGNg[j][i] = 255;
                        cxg = cxg >> 1;
                        cyg = cyg >> 1;
                        float dx = cxg - j;
                        float dy = cyg - i;
                        float co = dy / dx;
                        int dis = Math.abs(cxg - j);
                        //欧基里德填充
                        for (int k = 0; k < dis; k++) {
                            if (cxg >= j && cyg >= i) {
                                monitor.showOCLDg[j + k][i + (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDg, j + k
                                    , i + (int) (k * co), monitor.fact, 1);
                            }
                            if (cxg < j && cyg >= i) {
                                monitor.showOCLDg[j - k][i - (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDg, j - k
                                    , i - (int) (k * co), monitor.fact, 2);
                            }
                            if (cxg >= j && cyg < i) {
                                monitor.showOCLDg[j + k][i + (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDg, j + k
                                    , i + (int) (k * co), monitor.fact, 3);
                            }
                            if (cxg < j && cyg < i) {
                                monitor.showOCLDg[j - k][i - (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDg, j - k
                                    , i - (int) (k * co), monitor.fact, 4);
                            }
                        }
                    }
                }
                if (monitor.isBlueButton) {
                    if (monitor.ccab[j][i] > 0) {
                        if (cxb == 0 && cyb == 0) {
                            cxb = cxb + j;
                            cyb = cyb + i;
                        }
                        cxb = cxb + j;
                        cyb = cyb + i;
                        monitor.showOCLDb[j][i] = 255;
                        monitor.showORGNb[j][i] = 255;
                        cxb = cxb >> 1;
                        cyb = cyb >> 1;
                        float dx = cxb - j;
                        float dy = cyb - i;
                        float co = dy / dx;
                        int dis = Math.abs(cxb - j);
                        //欧基里德填充
                        for (int k = 0; k < dis; k++) {
                            if (cxb >= j && cyb >= i) {
                                monitor.showOCLDb[j + k][i + (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDb, j + k
                                    , i + (int) (k * co), monitor.fact, 1);
                            }
                            if (cxb < j && cyb >= i) {
                                monitor.showOCLDb[j - k][i - (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDb, j - k
                                    , i - (int) (k * co), monitor.fact, 2);
                            }
                            if (cxb >= j && cyb < i) {
                                monitor.showOCLDb[j + k][i + (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDb, j + k
                                    , i + (int) (k * co), monitor.fact, 3);
                            }
                            if (cxb < j && cyb < i) {
                                monitor.showOCLDb[j - k][i - (int) (k * co)] = 255;
                                monitor_XCDX.expand(monitor.showOCLDb, j - k
                                    , i - (int) (k * co), monitor.fact, 4);
                            }
                        }
                    }
                }
            }
        }
    }
}
