package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import VSQ.neroCell.DrawArrowHead;
import VSQ.neroCell.DrawNeroCellMask31;
import VSQ.neroCell.DrawNeroCellMask32;
import VSQ.neroCell.DrawNeroCellMask33;

import java.awt.Graphics2D;

//作者罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DrawSinLineVPS {

    public static void fastDraw() {
        DrawNeroCellMask31.coordSwap(DrawNeroCellMask31.neroShape);
        DrawNeroCellMask32.coordSwap(DrawNeroCellMask32.neroShape);
        DrawNeroCellMask33.coordSwap(DrawNeroCellMask33.neroShape);
        DrawArrowHead.coordSwap(DrawArrowHead.neroShape);

    }

    //快速计算改写
    public static void drawCosLine(int x0, int y0, Graphics2D graphics2D) {
        //DrawSinLineVPS.fastDraw();
        for (int y = 0; y < DrawNeroCellMask31.coords[0].length; y++) {
            if (-1 == DrawNeroCellMask31.coords[0][y]) {
                return;
            }
            graphics2D.drawLine(DrawNeroCellMask31.coords[0][y] + x0,
                DrawNeroCellMask31.coords[1][y] + y0,
                DrawNeroCellMask31.coords[0][y] + x0,
                DrawNeroCellMask31.coords[1][y] + y0);
        }
    }

    public static void drawSinLine(int x0, int y0, Graphics2D graphics2D) {
        for (int y = 0; y < DrawNeroCellMask32.coords[0].length; y++) {
            if (-1 == DrawNeroCellMask32.coords[0][y]) {
                return;
            }
            graphics2D.drawLine(DrawNeroCellMask32.coords[0][y] + x0,
                DrawNeroCellMask32.coords[1][y] + y0,
                DrawNeroCellMask32.coords[0][y] + x0,
                DrawNeroCellMask32.coords[1][y] + y0);
        }
    }

    public static void drawHead(int x0, int y0, Graphics2D graphics2D) {
        for (int y = 0; y < DrawArrowHead.coords[0].length; y++) {
            if (-1 == DrawArrowHead.coords[0][y]) {
                return;
            }
            graphics2D.drawLine(DrawArrowHead.coords[0][y] + x0,
                DrawArrowHead.coords[1][y] + y0,
                DrawArrowHead.coords[0][y] + x0,
                DrawArrowHead.coords[1][y] + y0);
        }
    }
}

//public static void drawCosLine(int x0, int y0, Graphics2D graphics2D) {
//	for(int y= 0; y< DrawNeroCellMask31.neroShape.length; y++) {
//		for(int x= 0; x< DrawNeroCellMask31.neroShape[0].length; x++) {
//			if(1== DrawNeroCellMask31.neroShape[y][x]) {
//				graphics2D.drawLine(x + x0, y + y0, x + x0, y + y0);
//			}
//		}
//	}
//}
//
//public static void drawSinLine(int x0, int y0, Graphics2D graphics2D) {
//	for(int y= 0; y< DrawNeroCellMask32.neroShape.length; y++) {
//		for(int x= 0; x< DrawNeroCellMask32.neroShape[0].length; x++) {
//			if(1== DrawNeroCellMask32.neroShape[y][x]) {
//				graphics2D.drawLine(x + x0, y + y0, x + x0, y + y0);
//			}
//		}
//	}
//}
//
//public static void drawHead(int x0, int y0, Graphics2D graphics2D) {
//	for(int y= 0; y< DrawArrowHead.neroShape.length; y++) {
//		for(int x= 0; x< DrawArrowHead.neroShape[0].length; x++) {
//			if(1== DrawArrowHead.neroShape[y][x]) {
//				graphics2D.drawLine(x + x0, y + y0, x + x0, y + y0);
//			}
//		}
//	}
//}
