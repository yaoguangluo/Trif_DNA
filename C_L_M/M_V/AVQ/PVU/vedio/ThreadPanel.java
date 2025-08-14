package M_V.AVQ.PVU.vedio;

import exception.thread.DetaThread;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class ThreadPanel extends Panel implements Runnable {
    
    int widthInt;
    int heightInt;
    int[] control;
    PlayerControl playerControl;
    Map<Integer, BufferedImage> flipImage;
    BufferedImage flip;

    public ThreadPanel(PlayerControl playerControl, int widthInt, int heightInt
        , Map<Integer, BufferedImage> flipImage, int[] control) {
        this.setBounds(0, 0, widthInt, heightInt);
        this.setVisible(true);
        this.widthInt = widthInt;
        this.heightInt = heightInt;
        this.flipImage = flipImage;
        this.control = control;
        this.playerControl = playerControl;
    }

    public void run() {
        //init;
        control[6] = 0;
        int j = flipImage.size();
        Graphics g = this.getGraphics();
        while (true) {
            if (control[6] < 0 || control[6] > j) {
                control[6] = 0;
            }
            DetaThread.sleepDeta(50);
            if (1 == control[0]) {//确定播放
                if (1 == control[7]) {
                    g.drawImage(flipImage.get(control[6]), 0, 0, this);
                    control[0] = 0;
                    control[7] = 0;
                }
                if (1 == control[1]) {//确定倒放
                    control[6]--;
                    if (control[6] < 0) {//停止条件
                        control[0] = 0;
                        control[6] = 0;
                    }
                    if (0 < control[3]) {//确定加速放
                        DetaThread.sleepDeta(300 / control[3]);
                        if (flipImage.containsKey(control[6])) {
                            if (null != playerControl.sliderx) {
                                playerControl.sliderx.setValue(control[6]);
                            }
                            g.drawImage(flipImage.get(control[6]), 0, 0, this);
                        }
                    } else if (0 < control[4]) {//确定减速速放
                        DetaThread.sleepDeta(300 + 200 * control[4]);
                        if (flipImage.containsKey(control[6])) {
                            if (null != playerControl.sliderx) {
                                playerControl.sliderx.setValue(control[6]);
                            }
                            g.drawImage(flipImage.get(control[6]), 0, 0, this);
                        }
                    }
                } else if (1 == control[2]) {//确定正放
                    control[6]++;
                    if (control[6] >= j) {//停止条件
                        control[0] = 0;
                        control[6] = 0;
                    }
                    if (0 < control[3]) {//确定加速放
                        DetaThread.sleepDeta(300 / control[3]);
                        if (flipImage.containsKey(control[6])) {
                            if (null != playerControl.sliderx) {
                                playerControl.sliderx.setValue(control[6]);
                            }
                            g.drawImage(flipImage.get(control[6]), 0, 0, this);
                        }
                    } else if (0 < control[4]) {//确定减速速放
                        DetaThread.sleepDeta(300 + 200 * control[4]);
                        if (flipImage.containsKey(control[6])) {
                            if (null != playerControl.sliderx) {
                                playerControl.sliderx.setValue(control[6]);
                            }
                            g.drawImage(flipImage.get(control[6]), 0, 0, this);
                        }
                    }
                }
            }
        }
    }

    public void paint(int x, int y) {
        Graphics g = this.getGraphics();
        g.drawLine(x, y, x + 1, y + 1);
        g.drawLine(x, y + 1, x + 1, y);
        Graphics gf = flipImage.get(control[6]).getGraphics();
        gf.drawLine(x, y, x + 1, y + 1);
        gf.drawLine(x, y + 1, x + 1, y);
    }
}
