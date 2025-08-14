package ASQ.pca;

import ASQ.basic.Distance_X_getDistance3D;
import ASQ.euclid.Euclid_X_findHeartPosition3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//这个函数用于坐标类的 主要成份分析与提取
//思想：欧基里德 平面, 立体几何
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

public class AMV_MVS_VSQ_Filter_X_filterPosition3DsWithScaledDistance {
    public static List<AMV_MVS_VSQ_3D> _E(List<AMV_MVS_VSQ_3D> input
        , AMV_MVS_VSQ_3D heart, double scaleDistacne) {
        List<AMV_MVS_VSQ_3D> output = new ArrayList<>();
        for (AMV_MVS_VSQ_3D position3D : input) {
            double distance = Distance_X_getDistance3D._E(heart, position3D);
            if (distance < scaleDistacne) {
                output.add(position3D);
            }
        }
        return output;
    }

    public static IMV_SIQ _E(Map<Double
        , List<AMV_MVS_VSQ_3D>> input
        , AMV_MVS_VSQ_3D heart, double scaleDistacne) {
        IMV_SIQ output = new IMV_SIQ();
        for (double mapKey : input.keySet()) {
            List<AMV_MVS_VSQ_3D> position3DList = input.get(mapKey);
            AMV_MVS_VSQ_3D tempHeart = Euclid_X_findHeartPosition3D._E(position3DList);
            double distance = Distance_X_getDistance3D._E(heart, tempHeart);
            if (distance < scaleDistacne) {
                output.put(mapKey, position3DList);
            }
        }
        return output;
    }
}
