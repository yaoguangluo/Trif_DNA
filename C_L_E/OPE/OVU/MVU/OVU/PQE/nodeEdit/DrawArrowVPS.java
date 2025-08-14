package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.DrawArrow;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DrawArrowVPS implements DrawArrow {
    public void doDrawArrow(Graphics2D graphics2D, int x, int y, int connectX, int connectY) {
        x += 10;
        connectX -= 10;
        graphics2D.setStroke(new BasicStroke(2, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));
        drawCurve(graphics2D, x, y, connectX, connectY, 6.0);
        DrawSinLineVPS.drawHead(connectX - 8, connectY - 3, graphics2D);
    }

    //下面这个化三角箭头函数是JAVA2D awt demo
    //罗瑶光先生进行了2次修改.
    public void drawCurve(Graphics2D graphics2D, int x, int y
        , int connectX, int connectY, double scale) {
        double distanceX = (double) Math.abs(x - connectX);
        double distanceY = (double) Math.abs(y - connectY);
        double signOfPointX = (x - connectX < 0) ? 1.0 : -1;
        double signOfPointY = (y - connectY < 0) ? 1.0 : -1;
        double averageOfDistanceY = (distanceX == 0) ? 0 : distanceY / distanceX;
        double signOfPointYWithaverageOfDistanceY = averageOfDistanceY * signOfPointY;
        double oldRegisterY = 0.0;
        boolean firstTime = true;
        double signOfPointYWithaverageOfDistanceYKernel = signOfPointYWithaverageOfDistanceY * 8;
        double averageOfDistanceYKernel = averageOfDistanceY * 8 / 6;
        double signOfPointYWithaverageOfDistanceYCount = signOfPointYWithaverageOfDistanceYKernel;
        double averageOfDistanceYCount = averageOfDistanceYKernel;
        if (1 == signOfPointX) {
            double registerY = (double) y;
            int endX = x;
            for (int i = x; i < connectX - 16; i += 8) {
                registerY = y + signOfPointYWithaverageOfDistanceYCount + scale
                    * Math.sin(averageOfDistanceYCount);
                graphics2D.drawLine(i, true == firstTime ? (int) registerY
                    : (int) oldRegisterY, i + 8, (int) registerY);
                oldRegisterY = registerY;
                endX = i + 8;
                firstTime = false;
                signOfPointYWithaverageOfDistanceYCount += signOfPointYWithaverageOfDistanceYKernel;
                averageOfDistanceYCount += averageOfDistanceYKernel;
            }
            graphics2D.drawLine(endX, (int) registerY, connectX - 8, connectY);
            return;
        }
        if (-1 == signOfPointX) {
            for (int i = x; i > connectX + 2; i -= 8) {
                double registerY = y + signOfPointYWithaverageOfDistanceYCount + scale
                    * Math.sin(averageOfDistanceYCount);
                graphics2D.drawLine(i, true == firstTime ? (int) registerY
                    : (int) oldRegisterY, i - 8, (int) registerY);
                oldRegisterY = registerY;
                firstTime = false;
                signOfPointYWithaverageOfDistanceYCount += signOfPointYWithaverageOfDistanceYKernel;
                averageOfDistanceYCount += averageOfDistanceYKernel;
            }
        }
    }
}
