package ASQ.classification.AMV.MVS.VSQ;

import ASQ.basic.Distance_X_getDistance2D;
import ASQ.euclid.Euclid_X_findHeartPosition2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//这个函数用于通过重心位移距离来进行坐标分类
//思想：欧基里德
//实现：罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Classification_X_addNewPositionWithoutHeart {
    public static Map<Double, List<AMV_MVS_VSQ_2D>> _E(Map<Double
        , List<AMV_MVS_VSQ_2D>> groups, AMV_MVS_VSQ_2D position2D, double scaleDistance) {
        double groupKey = 0.0;
        for (double aDouble : groups.keySet()) {
            groupKey = aDouble;
            List<AMV_MVS_VSQ_2D> group = groups.get(groupKey);
            AMV_MVS_VSQ_2D heart = Euclid_X_findHeartPosition2D._E(group);
            double distance = Distance_X_getDistance2D._E(heart, position2D);
            if (scaleDistance < distance) {
                group.add(position2D);
                groups.put(groupKey, group);
                return groups;
            }
        }
        List<AMV_MVS_VSQ_2D> group = new ArrayList<>();
        group.add(position2D);
        groups.put(groupKey + 1, group);
        return groups;
    }
}
