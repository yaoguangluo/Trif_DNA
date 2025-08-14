package A_V.cap;

import ASQ.filter.Filter_X_getImagePix2DGroupFilter;
import P.image.Guassian;
import P.image.Mask;
import P.image.Sobel;
import P.image.Strech;
import S_A.SVQ.stable.S_Vision;
import VSQ.ICAQDTVMQVM.Monitor_X_S;
import P.image.Threshold_X_P;
import P.image.Threshold_X_P_Section;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Objects;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Monitor_X_Animation_EyeScan {
    @SuppressWarnings("unused")
    public static void X_paint_eyeScan(Monitor_X_S monitor, Monitor_X_ monitor_XCDX
        , Graphics g, BufferedImage image) {
        if (!monitor.isbt88Stop) {
            for (int i = 0; i < image.getHeight(); ++i) {
                for (int j = 0; j < image.getWidth(); ++j) {
                    if (monitor.isRedButton) {
                        monitor.rp[j][i] = (image.getRGB(j, i) >> 16 & 0xFF);
                        if (monitor.isbt53Stop && monitor.rp[j][i] < 100) {
                            monitor.rp[j][i] = 0;
                        } else if (monitor.rp[j][i] < monitor.facr) {
                            monitor.rp[j][i] = 0;
                        }
                    }
                    if (monitor.isGreenButton) {
                        monitor.gp[j][i] = (image.getRGB(j, i) >> 8 & 0xFF);
                        if (monitor.isbt53Stop && monitor.gp[j][i] < 150) {
                            monitor.gp[j][i] = 0;
                        } else if (monitor.gp[j][i] < monitor.facg) {
                            monitor.gp[j][i] = 0;
                        }
                    }
                    if (monitor.isBlueButton) {
                        monitor.bp[j][i] = (image.getRGB(j, i) & 0xFF);
                        if (monitor.isbt53Stop && monitor.bp[j][i] < 100) {
                            monitor.bp[j][i] = 0;
                        } else if (monitor.bp[j][i] < monitor.facb) {
                            monitor.bp[j][i] = 0;
                        }
                    }
                }
            }
            return;
        }
        for (int i = 0; i < image.getHeight(); ++i) {
            for (int j = 0; j < image.getWidth(); ++j) {
                if (monitor.isRedButton) {
                    monitor.rp[j][i] = (image.getRGB(j, i) >> 16 & 0xFF);
                }
                if (monitor.isGreenButton) {
                    monitor.gp[j][i] = (image.getRGB(j, i) >> 8 & 0xFF);
                }
                if (monitor.isBlueButton) {
                    monitor.bp[j][i] = (image.getRGB(j, i) & 0xFF);
                }
            }
        }
        monitor.rp = Strech.P(monitor.rp, 0.05, 0.95);
        monitor.rp = Guassian.P_1D(monitor.rp, 3
            , 3, 1.66);
        int[][] mag = Sobel.P(monitor.rp, 1);
        int[][] dir = Sobel.P(monitor.rp, 2);
        assert mag != null;
        mag = Threshold_X_P.P(mag, 7);
        mag = Mask.P(mag, dir);
        assert mag != null;
        mag = Threshold_X_P_Section.P_Section(Objects.requireNonNull(mag), 25, 110);
        //将梯度的索贝尔分层后进行距离为2的 128像色素团小于1 大于50的像色素团噪声过滤输出。
        Filter_X_getImagePix2DGroupFilter._E(mag, 128, 2, 1, 50);
        //将梯度的索贝尔分层后进行距离为2的 255像色素团小于1 大于50的像色素团噪声过滤输出。
        Filter_X_getImagePix2DGroupFilter._E(mag, 255, 2, 1, 50);
        int[][] rp1 = mag;
        int w = rp1.length;
        int h = rp1[0].length;
        int hy = S_Vision.eyeHeart.length;
        int wy = S_Vision.eyeHeart[0].length;
        int[][] output = new int[w][h];
        for (int i = 50; i < w - 50; i++) {
            for (int j = 50; j < h - 150; j++) {
                int find997 = 0;
                int find996 = 0;
                int find995 = 0;
                int find998 = 0;
                if (i + wy < w - 1 && j + hy < h - 1) {
                    for (int p = 0; p < wy; p++) {
                        for (int q = 0; q < hy; q++) {
                            if (S_Vision.eyeHeart[q][p] == 1) {
                                if (rp1[i + p][j + q] == 128) {
                                    find997++;
                                }
                                if (rp1[i + p][j + q] != 0) {
                                    find995++;
                                }
                            }
                            if (S_Vision.eyeHeart[q][p] == 0) {
                                if (rp1[i + p][j + q] == 255) {
                                    find996++;
                                }
                                if (rp1[i + p][j + q] != 0) {
                                    find998++;
                                }
                            }
                        }
                    }
                    if (find995 >= 13 - 4 && find995 < 13 + 3
                        && find996 > 12 - 1 && find996 < 12 + 1
                        && find997 > 9 - 1 && find997 < 9 + 1
                        && find998 > 13 - 1 && find998 < 13 + 1) {
                        int w1 = 50;
                        int h1 = 50;
                        int hy1 = S_Vision.eye.length;
                        int wy1 = S_Vision.eye[0].length;
                        int find1 = 0;
                        int find2 = 0;
                        int find3 = 0;
                        int find4 = 0;
                        int find5 = 0;
                        int find6 = 0;
                        int find7 = 0;
                        int find8 = 0;
                        int find9 = 0;
                        int find10 = 0;
                        int find11 = 0;
                        int find12 = 0;
                        int find13 = 0;
                        int find14 = 0;
                        int find15 = 0;
                        int find16 = 0;
                        int find17 = 0;
                        int find18 = 0;
                        int find19 = 0;
                        int find20 = 0;
                        int find21 = 0;
                        int find22 = 0;
                        for (int p = -wy1 / 2; p < wy1 / 2; p++) {
                            for (int q = -hy1 / 2; q < hy1 / 2; q++) {
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 1) {
                                    if (rp1[i + p][j + q] == 128) {
                                        find1++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 20) {
                                    if (rp1[i + p][j + q] == 255) {
                                        find2++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 10) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find3++;
                                    }
                                    if (rp1[i + p][j + q] != 0) {
                                        find15++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 15) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find4++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 14) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find5++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 13) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find6++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 2) {
                                    if (rp1[i + p][j + q] == 128) {
                                        find7++;
                                    }
                                    if (rp1[i + p][j + q] == 255) {
                                        find21++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 3) {
                                    if (rp1[i + p][j + q] == 255) {
                                        find8++;
                                    }
                                    if (rp1[i + p][j + q] == 128) {
                                        find16++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 9) {
                                    if (rp1[i + p][j + q] == 255) {
                                        find9++;
                                    }
                                    if (rp1[i + p][j + q] == 128) {
                                        find20++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 19) {
                                    if (rp1[i + p][j + q] == 255) {
                                        find10++;
                                    }
                                    if (rp1[i + p][j + q] == 0) {
                                        find17++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 12) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find11++;
                                    }
                                    if (rp1[i + p][j + q] == 255) {
                                        find18++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 5) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find12++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 7) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find13++;
                                    }
                                    if (rp1[i + p][j + q] == 128) {
                                        find19++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 11) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find14++;
                                    }
                                }
                                if (S_Vision.eye[q + hy1 / 2][p + wy1 / 2] == 22) {
                                    if (rp1[i + p][j + q] == 0) {
                                        find22++;
                                    }
                                }
                            }
                        }
                        int n = 5;
                        int nn = 5;
                        int m = 5;
                        int mm = 25;
                        if (
                            find1 >= 0
                                && find1 < 10 + m
                                && find2 < 13 + m
                                && find3 >= 12 - n && find3 < 50 + m
                                && find4 >= 3 && find4 < 20 + m
                                && find5 >= 19 - n && find5 < 22 + m
                                && find6 >= 8 - nn && find6 < 19
                                && find7 > 10 - nn && find7 < 35 + m
                                && find8 > 20 - n && find8 < 75 + m
                                && find9 < 10 + m
                                && find10 < 1
                                && find11 >= 66 - n && find11 < 72 + m
                                && find12 >= 10 - n && find12 < 30 + m
                                && find13 >= 5 && find13 < 15 + m
                                && find14 >= 7 - nn && find14 < 9 + m
                                && find15 >= 15 - nn && find15 < 35 + m
                                && find16 >= 1 && find16 < 20 + m
                                && find17 >= 50 - nn && find17 <= 60 + m
                                && find18 < 10 + m
                                && find19 < 10 + m
                                && find20 < 1
                                && find21 < 40 + m
                                && find22 >= 0
                                && find22 < 20 + m) {
                            if (i > 50 && i < 550 && j > 50 && j < 400) {
                                //20230106-System.out.println(find6);
                                for (int m1 = -wy1 / 2 - 20; m1 < wy1 / 2 + 20; m1++) {
                                    for (int n1 = -hy1 / 2; n1 < hy1 / 2 + 10; n1++) {
                                        output[i + m1][j + n1] = 255;
                                    }
                                }
                            }
                        }
                    }//59
                }//59
            }//59
        }
        rp1 = output;
        Mask.P(rp1, monitor.rp);//easy fatal..later
        Mask.P(rp1, monitor.gp);
        Mask.P(rp1, monitor.bp);
        int[][] temp = Mask.P(rp1, mag);
        for (int i = 0; i < image.getHeight(); ++i) {
            for (int j = 0; j < image.getWidth(); ++j) {
                int pixel = (monitor.rp[j][i] << 16) | (monitor.gp[j][i] << 8)
                    | (monitor.bp[j][i]);
                image.setRGB(j, i, pixel);
            }
        }
        g.drawImage(image, 0, 0, 900
            , 680, monitor_XCDX);// 绘出图形文件
    }
}
