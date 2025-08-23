package ASQ.find.AMV.MVS.VSQ;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.Line2D;
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
public class GroupPascalHearts_X_getPosition2DsGroupPascalDirection {
    //通过坐标团的 精度匹配分割的内部坐标聚类团 进行 每个聚类团的 重心和中心距离 求解 获取有效的团稳定观测数据模型
    //思想 帕斯卡, 欧基里德, 数据挖掘, 贝叶斯, 立体几何, 流体力学, 量化拓扑力学, 离散数学, 统计与概率论 20191227
    //实现 罗瑶光
    public static IMV_SIQ _E(
        Map<Double, AMV_MVS_VSQ_2D> pascalHearts, Map<Double, AMV_MVS_VSQ_2D> pascalMids) {
        IMV_SIQ pascalDirections = new IMV_SIQ();
        for (double key : pascalHearts.keySet()) {
            Line2D value = new Line2D();
            value.I_Begin(pascalMids.get(key));
            value.I_End(pascalHearts.get(key));
            pascalDirections.put(key, value);
        }
        return pascalDirections;
    }

    public static IMV_SIQ _E(
        ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
        return _E(
            GroupPascalHearts_X_getPosition2DsGroupPascalHearts._E(groups, scale)
            , GroupPascalHearts_X_getPosition2DsGroupPascalMids._E(groups, scale));
    }
}
