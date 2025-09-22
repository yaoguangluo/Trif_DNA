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
public class Euclid_X_findHeartPosition3D {
    public static AMV_MVS_VSQ_3D _E(List<AMV_MVS_VSQ_3D> List) {
        Iterator<AMV_MVS_VSQ_3D> iterator = List.iterator();
        double sumOfX = 0.0;
        double sumOfY = 0.0;
        double sumOfZ = 0.0;
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_3D position3D = iterator.next();
            sumOfX += position3D.getX();
            sumOfY += position3D.getY();
            sumOfZ += position3D.getZ();
        }
        AMV_MVS_VSQ_3D position3D = new AMV_MVS_VSQ_3D();
        position3D.I_X(sumOfX / List.size());
        position3D.I_Y(sumOfY / List.size());
        position3D.I_Z(sumOfZ / List.size());
        return position3D;
    }
}
