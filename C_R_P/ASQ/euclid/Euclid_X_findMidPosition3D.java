package ASQ.euclid;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;

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
public class Euclid_X_findMidPosition3D {
    public static AMV_MVS_VSQ_3D _E(List<AMV_MVS_VSQ_3D> list) {
        double xMax = 0.0;
        double yMax = 0.0;
        double xMin = 0.0;
        double yMin = 0.0;
        double zMax = 0.0;
        double zMin = 0.0;
        Iterator<AMV_MVS_VSQ_3D> iterator = list.iterator();
        if (iterator.hasNext()) {
            AMV_MVS_VSQ_3D position3D = iterator.next();
            xMax = position3D.getX();
            xMin = position3D.getX();
            yMax = position3D.getY();
            yMin = position3D.getY();
            zMax = position3D.getZ();
            zMin = position3D.getZ();
        }
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_3D position3D = iterator.next();
            if (position3D.getX() > xMax) {
                xMax = position3D.getX();
            }
            if (position3D.getX() < xMin) {
                xMin = position3D.getX();
            }
            if (position3D.getY() > yMax) {
                yMax = position3D.getY();
            }
            if (position3D.getY() < yMin) {
                yMin = position3D.getY();
            }
            if (position3D.getZ() > zMax) {
                zMax = position3D.getZ();
            }
            if (position3D.getZ() < zMin) {
                zMin = position3D.getZ();
            }
        }
        AMV_MVS_VSQ_3D mid = new AMV_MVS_VSQ_3D();
        mid.I_X((xMin + xMax) / 2);
        mid.I_Y((yMin + yMax) / 2);
        mid.I_Z((zMin + zMax) / 2);
        return mid;
    }
}
