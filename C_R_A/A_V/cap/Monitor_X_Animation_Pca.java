package A_V.cap;

import P.image.Sobel;
import P.image.Strech;
import P.image.Threshold_X_P;
import VSQ.ICAQDTVMQVM.Monitor_X_S;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Monitor_X_Animation_Pca {
    public static void X_paint_pca(Monitor_X_S monitor, Monitor_X_ monitor_XCDX) {
        try {
            //PCA
            int[][] str = monitor.rp;
            int[][] stg = monitor.gp;
            int[][] stb = monitor.bp;
            if (monitor.isStreButton) {
                if (monitor.isRedButton) {
                    str = Strech.P(monitor.rp, 0.1, 0.9);
                }
                if (monitor.isGreenButton) {
                    stg = Strech.P(monitor.gp, 0.1, 0.9);
                }
                if (monitor.isBlueButton) {
                    stb = Strech.P(monitor.bp, 0.1, 0.9);
                }
            }
            monitor.r2r = str;
            monitor.r2g = stg;
            monitor.r2b = stb;
            if (monitor.isSblButton) {
                if (monitor.isRedButton) {
                    monitor.r2r = Sobel.P(str, 1);
                }
                if (monitor.isGreenButton) {
                    monitor.r2g = Sobel.P(stg, 1);
                }
                if (monitor.isBlueButton) {
                    monitor.r2b = Sobel.P(stb, 1);
                }
            }
            int[][] gthdr = monitor.r2r;
            int[][] gthdg = monitor.r2g;
            int[][] gthdb = monitor.r2b;
            monitor.diffr = monitor.out_oldr;
            monitor.diffg = monitor.out_oldg;
            monitor.diffb = monitor.out_oldb;
            if (monitor.isSblButton) {
                if (monitor.isRedButton) {
                    assert monitor.r2r != null;
                    gthdr = Threshold_X_P.P(monitor.r2r, monitor.facx);
                }
                if (monitor.isGreenButton) {
                    assert monitor.r2g != null;
                    gthdg = Threshold_X_P.P(monitor.r2g, monitor.facx);
                }
                if (monitor.isBlueButton) {
                    assert monitor.r2b != null;
                    gthdb = Threshold_X_P.P(monitor.r2b, monitor.facx);
                }
                assert gthdr != null;
                monitor.diffr = monitor_XCDX.findDiff(gthdr, monitor.out_oldr);
                assert gthdg != null;
                monitor.diffg = monitor_XCDX.findDiff(gthdg, monitor.out_oldg);
                assert gthdb != null;
                monitor.diffb = monitor_XCDX.findDiff(gthdb, monitor.out_oldb);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ////20230106-System.out.println(e.getMessage());
        }
    }
}
