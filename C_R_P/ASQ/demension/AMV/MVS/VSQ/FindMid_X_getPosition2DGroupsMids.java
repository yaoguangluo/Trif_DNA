package ASQ.demension.AMV.MVS.VSQ;

import ASQ.euclid.Euclid_X_findMidPosition2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class FindMid_X_getPosition2DGroupsMids {
    //求坐标团的中心。
    public static IMV_SIQ _E(Map<Double, ArrayList<AMV_MVS_VSQ_2D>> groups) {
        IMV_SIQ output = new IMV_SIQ();
        for (double value : (Iterable<Double>) output.keySet()) {
            output.put(value, Euclid_X_findMidPosition2D._E(groups.get(value)));
        }
        return output;
    }
}
