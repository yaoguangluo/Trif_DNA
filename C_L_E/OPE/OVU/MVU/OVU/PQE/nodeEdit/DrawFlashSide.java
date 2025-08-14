package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import java.awt.Color;
import java.awt.Graphics2D;

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
public class DrawFlashSide {
    public static void drawFlashSide(Graphics2D graphics2D, int x, int y, int flash) {
        if (0 >= flash) {
            graphics2D.setColor(Color.blue);
            DrawSinLineVPS.drawCosLine(x, y, graphics2D);
            graphics2D.setColor(Color.pink);
            DrawSinLineVPS.drawSinLine(x, y, graphics2D);
        }
        if (1 == flash) {
            graphics2D.setColor(Color.ORANGE);
            DrawSinLineVPS.drawCosLine(x, y, graphics2D);
            graphics2D.setColor(Color.blue);
            DrawSinLineVPS.drawSinLine(x, y, graphics2D);
        }
        if (2 <= flash) {
            graphics2D.setColor(Color.ORANGE);
            DrawSinLineVPS.drawCosLine(x, y, graphics2D);
            graphics2D.setColor(Color.RED);
            DrawSinLineVPS.drawSinLine(x, y, graphics2D);
        }
        drawConnect(graphics2D, x, y);
    }

    //for cell postfix
    private static void drawConnect(Graphics2D graphics2D, int x, int y) {
        graphics2D.drawOval(x + 10, y - 8, 4, 4);
        graphics2D.drawOval(x - 8, y + 22, 4, 4);
        graphics2D.drawOval(x + 2, y + 52, 4, 4);
        graphics2D.drawOval(x + 62, y + 26, 4, 4);
    }

    public static void D_FlashSide(Graphics2D graphics2D, int x, int y) {
        graphics2D.setColor(new Color(255, 255, 255));
        DrawSinLineVPS.drawCosLine(x, y, graphics2D);
        graphics2D.setColor(new Color(255, 255, 255));
        DrawSinLineVPS.drawSinLine(x, y, graphics2D);
        drawConnect(graphics2D, x, y);
    }
}
