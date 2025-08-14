package M_V.AVQ.PVU.vedio;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PlayerShow extends Thread implements Runnable, MouseMotionListener {
    int widthInt;
    int heightInt;
    int[] crontol;
    PlayerControl playerControl;
    Map<Integer, BufferedImage> flipImage;
    ThreadPanel panel;

    public PlayerShow(PlayerControl playerControl, int widthInt, int heightInt
        , Map<Integer, BufferedImage> flipImage, int[] crontol) {
        this.widthInt = widthInt;
        this.heightInt = heightInt;
        this.flipImage = flipImage;
        this.crontol = crontol;
        this.playerControl = playerControl;
    }

    public void run() {
        JFrame jframe = new JFrame();
        jframe.setLayout(null);
        jframe.setLocation(200, 200);
        jframe.setSize(widthInt, heightInt);
        jframe.setResizable(true);
        panel = new ThreadPanel(playerControl, widthInt, heightInt, flipImage, crontol);
        panel.setLayout(null);
        jframe.add(panel);
        //panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        //jframe.addMouseListener(this);
        jframe.setBackground(Color.BLUE);
        jframe.setVisible(true);
        jframe.validate();
        panel.run();
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        int x = arg0.getX();
        int y = arg0.getY();
        panel.paint(x, y);
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
    }
}
