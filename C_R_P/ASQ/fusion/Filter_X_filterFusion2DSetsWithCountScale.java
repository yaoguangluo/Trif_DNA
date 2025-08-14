package ASQ.fusion;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import S_A.pheromone.IMV_SIQ;

import java.util.List;
import java.util.Map;

//这个函数用于坐标融聚团的主要条件过滤。
//思想：统计与概率论, 立体几何, 数据挖掘
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
public class Filter_X_filterFusion2DSetsWithCountScale {
    public static IMV_SIQ _E(Map<Double, List<AMV_MVS_VSQ_2D>> groups, double countScale) {
        IMV_SIQ output = new IMV_SIQ();
        for (double value : groups.keySet()) {
            if (groups.get(value).size() >= countScale) {
                output.put(value, groups.get(value));
            }
        }
        return output;
    }
}
