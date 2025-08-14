package A_V.cap;

import VSQ.ICAQDTVMQVM.Monitor_X_S;
import U_V.ESU.toolkitImageToBufferImage.U_X_toolkitImageToBufferImage;
import org.bytedeco.javacv.FrameGrabber;

import java.awt.Graphics;
import java.awt.Image;
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

public class Monitor_X_Animation {//later do

    public static void X_paint(Monitor_X_S monitor, Monitor_X_ monitor_XCDX, Graphics g) {
        //图片进来，如果是关联的那么就不读图片，如果不是关联的就grabber
        if (monitor.isStop) {
            return;
        }
        int x = 650;// configuration sets
        int y = 900;
        if (!monitor.lendImage) {
            if (null != monitor.grabber) {
                try {
                    monitor.frame = monitor.grabber.grab();
                } catch (FrameGrabber.Exception e) {
                    throw new RuntimeException(e);
                }
                if (null != monitor.frame) {
                    monitor.frame.imageWidth = y;
                    monitor.frame.imageHeight = x;
                    monitor.difImage = monitor.paintConverter
                        .getBufferedImage(monitor.frame, 1);
                }
            }
        }
        Image image = (monitor.lendImage) ? monitor.img : monitor.difImage;
        BufferedImage bufferedImage = U_X_toolkitImageToBufferImage._E(image
            , 0, 0, x, y, monitor_XCDX);
        monitor.rp = new int[x][y];
        monitor.gp = new int[x][y];
        monitor.bp = new int[x][y];
        //later opt
        Monitor_X_Animation_EyeScan.X_paint_eyeScan(monitor
            , monitor_XCDX, g, bufferedImage);
        Monitor_X_Animation_Pca.X_paint_pca(monitor, monitor_XCDX
        );
        Monitor_X_Animation_Ica.X_paint_ica(monitor, monitor_XCDX
            , bufferedImage);
        Monitor_X_Animation_PcfButton.X_paint_PcfButton(monitor
            , monitor_XCDX, g, bufferedImage);
        Monitor_X_Animation_Pde.X_paint_pde(monitor, monitor_XCDX
            , g, bufferedImage);
        monitor.q += 1;
        if (monitor.q >= monitor.encry_c) {
            monitor.q = 0;
        }
        monitor.q_new += 1;
        if (monitor.q_new >= monitor.encry_c_new) {
            monitor.q_new = 0;
        }
        monitor.q_fs += 1;
        if (monitor.q_fs >= monitor.encry_c_fs) {
            monitor.q_fs = 0;
        }
    }
}
