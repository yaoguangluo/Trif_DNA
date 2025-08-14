package ASQ.classification.AMV.MVS.VSQ;

import ASQ.basic.Distance_X_getDistance3D;
import ASQ.euclid.Euclid_X_findHeartPosition3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;

import java.util.List;
import java.util.Map;

//这个函数用于坐标集团距离采样匹配输出
//思想: 欧基里德 
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

public class HeartsSample_X_getShortestSamplePosition3DGroup {
    public static List<AMV_MVS_VSQ_3D> _E(AMV_MVS_VSQ_3D inputHeart
        , Map<Double, List<AMV_MVS_VSQ_3D>> groups) {
        double shortestDistance = 0.0;
        boolean isFirst = true;
        double key = 0.0;
        for (double mapKey : groups.keySet()) {
            List<AMV_MVS_VSQ_3D> positions = groups.get(mapKey);
            AMV_MVS_VSQ_3D heart = Euclid_X_findHeartPosition3D._E(positions);
            double distance = Distance_X_getDistance3D._E(inputHeart, heart);
            if (isFirst) {
                isFirst = false;
                shortestDistance = distance;
                key = mapKey;
            } else {
                if (shortestDistance > distance) {
                    shortestDistance = distance;
                    key = mapKey;
                }
            }
        }
        return groups.get(key);
    }

}
