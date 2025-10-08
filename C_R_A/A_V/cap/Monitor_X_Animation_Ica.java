package A_V.cap;

import S_A.pheromone.IMV_SQI;
import VSQ.ICAQDTVMQVM.Monitor_X_S;

import java.awt.image.BufferedImage;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */

public class Monitor_X_Animation_Ica {
    public static void X_paint_ica(Monitor_X_S monitor, Monitor_X_ monitor_XCDX
        , BufferedImage image) {
        try {
            //ICA
            monitor.mskr = new int[image.getHeight()][image.getWidth()];
            monitor.mskg = new int[image.getHeight()][image.getWidth()];
            monitor.mskb = new int[image.getHeight()][image.getWidth()];
            monitor.gpcar = new int[image.getHeight()][image.getWidth()];
            monitor.gpcag = new int[image.getHeight()][image.getWidth()];
            monitor.gpcab = new int[image.getHeight()][image.getWidth()];
            IMV_SQI map = new IMV_SQI();
            if (monitor.isRcaButton) {
                for (int i = 0; i < image.getHeight(); ++i) {
                    for (int j = 0; j < image.getWidth(); ++j) {
                        ifButtonKernel(monitor.isRedButton, monitor.mskr, monitor.diffr
                            , i, j, monitor_XCDX, monitor);
                        ifButtonKernel(monitor.isGreenButton, monitor.mskg, monitor.diffg
                            , i, j, monitor_XCDX, monitor);
                        ifButtonKernel(monitor.isBlueButton, monitor.mskb, monitor.diffb
                            , i, j, monitor_XCDX, monitor);
                    }
                }
            } else {
                monitor.gpcar = monitor.diffr;
                monitor.gpcag = monitor.diffg;
                monitor.gpcab = monitor.diffb;
            }
        } catch (Exception e) {
            //e.printStackTrace();
            ////20230106-S_logger.Log.logger.info("" + e.getMessage());
        }
    }

    private static void ifButtonKernel(boolean a, int[][] b, int[][] c, int i, int j
        , Monitor_X_ monitor_XCDX, Monitor_X_S monitor) {
        if (a) {
            if (b[j][i] == 0) {
                IMV_SQI map = new IMV_SQI();
                int size = monitor_XCDX.getMskFilter(c, b, i, j, 0, map);
                if (size > monitor.facy) {
                    for (String temp : (Iterable<String>) map.keySet()) {
                        if (size > monitor.facy) {
                            int x = Integer.parseInt(temp.split(", ")[0]);
                            int y = Integer.parseInt(temp.split(", ")[1]);
                            monitor.gpcab[x][y] = 255;
                        }
                    }
                }
            }
        }
    }
}
