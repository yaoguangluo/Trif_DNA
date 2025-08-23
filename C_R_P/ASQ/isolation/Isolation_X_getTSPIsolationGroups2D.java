package ASQ.isolation;

import ASQ.basic.Distance_X_getDistance2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Isolation_X_getTSPIsolationGroups2D {
    //带精度 2维(非欧拉权距)商旅路径团簇 隔离 算法
    //Theory 《神经网络: 权距》, 欧基里德, Yaoguang.Luo 20191220
    //Application Yaoguang.Luo
    //适用于 最短路径, 最小距离, 商旅分析预测, 等项目中
    public static IMV_SIQ _E(
        List<AMV_MVS_VSQ_2D> groups, double scale) {
        boolean[][] isDelete = new boolean[groups.size()][groups.size()];
        IMV_SIQ output = new IMV_SIQ();
        Iterator<AMV_MVS_VSQ_2D> iterator = groups.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            i++;
            AMV_MVS_VSQ_2D AMV_MVS_VSQ2D = iterator.next();
            Iterator<AMV_MVS_VSQ_2D> inIterator = groups.iterator();
            int j = 0;
            while (inIterator.hasNext()) {
                j++;
                AMV_MVS_VSQ_2D inPosition2D = inIterator.next();
                //计算
                if (isDelete[i - 1][(int) j - 1] || i == j) {
                    continue;
                }
                //轭消
                isDelete[i - 1][(int) j - 1] = true;
                isDelete[(int) j - 1][i - 1] = true;
                double distance = Distance_X_getDistance2D._E(AMV_MVS_VSQ2D, inPosition2D);
                if (distance > scale) {
                    continue;
                }
                //添加
                List<AMV_MVS_VSQ_2D> list;
                double _i = i;
                if (output.containsKey(_i)) {
                    list = output.get_List_AMV_MVS_VSQ_2D(_i);
                } else {
                    list = new ArrayList<>();
                    list.add(AMV_MVS_VSQ2D);
                }
                list.add(inPosition2D);
                output.put(_i, list);
            }
        }
        return output;
    }
}
