package M_V.ME.APM.VSQ.xlx;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CoAuthorForWord_A extends CoAuthorForWord_X_Slider {

    public void mouseDragged(java.awt.event.MouseEvent arg0) {
        int registX = arg0.getX();
        if (registX > mousex) {
            zrot += (arg0.getX() + 10) / 70;
        } else {
            zrot -= (arg0.getX() + 10) / 70;
        }
        mousex = registX;
    }

    public void mouseMoved(java.awt.event.MouseEvent arg0) {

    }

    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode() == 38) {
            brot += 0.5;
        }
        if (arg0.getKeyCode() == 37) {
            lrot -= 0.5;
        }
        if (arg0.getKeyCode() == 40) {
            brot -= 0.5;
        }
        if (arg0.getKeyCode() == 39) {
            lrot += 0.5;
        }
    }

    public void keyReleased(KeyEvent arg0) {
    }

    public void keyTyped(KeyEvent arg0) {
    }

    public void mouseWheelMoved(MouseWheelEvent arg0) {
        trot += arg0.getWheelRotation() * 2;
    }

    public void mouseClicked(MouseEvent arg0) {
    }

    public void mouseEntered(MouseEvent arg0) {
        clicked = false;
    }

    public void mouseExited(MouseEvent arg0) {
        clicked = false;
    }

    public void mousePressed(MouseEvent arg0) {
        mousex = arg0.getX();
        mousey = arg0.getY();
    }

    public void mouseReleased(MouseEvent arg0) {
    }
}
