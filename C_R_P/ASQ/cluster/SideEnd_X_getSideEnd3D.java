package ASQ.cluster;

import ASQ.basic.Distance_X_getDistance3D;
import ASQ.euclid.Euclid_X_findHeartPosition3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import P_V.PCI.ASQ.ratio.DistanceRatio;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

//Theory: Yaoguang.luo 20191216：12：06
//一种仅仅通过坐标重心来描绘射极边缘面探测使用方法。
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

public class SideEnd_X_getSideEnd3D {
    public static List<AMV_MVS_VSQ_3D> _E(List<AMV_MVS_VSQ_3D> list, double scale) {
        AMV_MVS_VSQ_3D heart = Euclid_X_findHeartPosition3D._E(list);
        IMV_SIQ ratioSide = new IMV_SIQ();
        for (AMV_MVS_VSQ_3D AMV_MVS_VSQ3D : list) {
            double ratio = DistanceRatio.getDistanceRatio3D(heart, AMV_MVS_VSQ3D);
            if (ratioSide.containsKey(ratio)) {
                double newDistance = Distance_X_getDistance3D._E(heart, AMV_MVS_VSQ3D);
                double oldDistance = Distance_X_getDistance3D._E(heart, ratioSide.get_AMV_MVS_VSQ_3D(ratio));
                if (newDistance > oldDistance) {
                    if (newDistance > scale) {
                        ratioSide.put(ratio, AMV_MVS_VSQ3D);
                    }
                }
            } else {
                double newDistance = Distance_X_getDistance3D._E(heart, AMV_MVS_VSQ3D);
                if (newDistance > scale) {
                    ratioSide.put(ratio, AMV_MVS_VSQ3D);
                }
            }
        }
        //转换
        List<AMV_MVS_VSQ_3D> output = new ArrayList<>();
        for (Object aDouble : ratioSide.keySet()) {
            output.add(ratioSide.get_AMV_MVS_VSQ_3D((Double) aDouble));//later..
        }
        return output;
    }
}
