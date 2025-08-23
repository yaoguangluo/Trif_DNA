package ASQ.euclid;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;

import java.util.Iterator;
import java.util.List;

//Theory: Euclid
//Application: Yaoguang.luo
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Euclid_X_findMidPosition2D {
    public static AMV_MVS_VSQ_2D _E(List<AMV_MVS_VSQ_2D> list) {
        double xMax = 0.0;
        double yMax = 0.0;
        double xMin = 0.0;
        double yMin = 0.0;
        Iterator<AMV_MVS_VSQ_2D> iterator = list.iterator();
        if (iterator.hasNext()) {
            AMV_MVS_VSQ_2D position2D = iterator.next();
            xMax = position2D.getX();
            xMin = position2D.getX();
            yMax = position2D.getY();
            yMin = position2D.getY();
        }
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_2D position2D = iterator.next();
            if (position2D.getX() > xMax) {
                xMax = position2D.getX();
            }
            if (position2D.getX() < xMin) {
                xMin = position2D.getX();
            }
            if (position2D.getY() > yMax) {
                yMax = position2D.getY();
            }
            if (position2D.getY() < yMin) {
                yMin = position2D.getY();
            }
        }
        AMV_MVS_VSQ_2D mid = new AMV_MVS_VSQ_2D();
        mid.I_X((xMin + xMax) / 2);
        mid.I_Y((yMin + yMax) / 2);
        return mid;
    }
}
