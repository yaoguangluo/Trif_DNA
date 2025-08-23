package ASQ.cluster;

import ASQ.basic.Distance_X_getDistance2D;
import ASQ.euclid.Euclid_X_findHeartPosition2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
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

public class SideEnd_X_getSideEnd2D {
    public static List<AMV_MVS_VSQ_2D> _E(List<AMV_MVS_VSQ_2D> list, double scale) {
        AMV_MVS_VSQ_2D heart = Euclid_X_findHeartPosition2D._E(list);
        IMV_SIQ ratioSide = new IMV_SIQ();
        for (AMV_MVS_VSQ_2D AMV_MVS_VSQ2D : list) {
            double ratio = DistanceRatio.getDistanceRatio2D_Z(heart, AMV_MVS_VSQ2D);
            double newDistance = Distance_X_getDistance2D._E(heart, AMV_MVS_VSQ2D);
            if (ratioSide.containsKey(ratio)) {
                AMV_MVS_VSQ_2D _AMV_MVS_VSQ_2D = ratioSide.get_AMV_MVS_VSQ_2D(Double.valueOf(ratio));
                double oldDistance = Distance_X_getDistance2D._E(heart, _AMV_MVS_VSQ_2D);
                if (newDistance > oldDistance) {
                    if (newDistance > scale) {
                        ratioSide.put(ratio, AMV_MVS_VSQ2D);
                    }
                }
            } else {
                if (newDistance > scale) {
                    ratioSide.put(ratio, AMV_MVS_VSQ2D);
                }
            }
        }
        //转换
        //之前用了java的自动sorthashmap加值排序，现在用元基编码后，成了普通hashmap，边界点没了自动连圈功能。
        List<AMV_MVS_VSQ_2D> output = new ArrayList<>();
        for (double aDouble : (Iterable<Double>) ratioSide.keySet()) {
            System.out.println(aDouble);//aDouble排序可连线画圆。注意infinit 等。
            output.add(ratioSide.get_AMV_MVS_VSQ_2D(aDouble));
        }
        return output;
    }
}
