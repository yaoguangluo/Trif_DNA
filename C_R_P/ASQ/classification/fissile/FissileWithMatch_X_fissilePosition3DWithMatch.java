package ASQ.classification.fissile;

import ASQ.euclid.Euclid_X_findCryptionPosition3D;
import ASQ.basic.Distance_X_getDistance3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;

//task 20191219 daytime
//通过scale 距离来进行 坐标团切裂, 并匹配最短最近重心域融入。
//算法 耗时更长, 准确度再增加。
//Theory yaoguang.luo 20191219~23, 欧基里德
//Application yaoguang.luo
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class FissileWithMatch_X_fissilePosition3DWithMatch {
    public static IMV_SIQ _E(ArrayList<AMV_MVS_VSQ_3D> groups
        , double scale) {
        IMV_SIQ distanceGroups = new IMV_SIQ();
        IMV_SIQ distanceHeart = new IMV_SIQ();
        Iterator<AMV_MVS_VSQ_3D> iterator = groups.iterator();
        double i = 0.0;
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_3D position3D = iterator.next();
            if (distanceGroups.isEmpty()) {
                ArrayList<AMV_MVS_VSQ_3D> ArrayList = new ArrayList<>();
                ArrayList.add(position3D);
                distanceGroups.put(i, ArrayList);
                distanceHeart.put(i, position3D);
            } else {
                //遍历所有团
                //团重心匹配如果超精度新存, 不是就融入。
                Iterator<Double> iteratorScale = distanceHeart.keySet().iterator();
                double shortest = 0.0;
                double shortestDoubleScale = 0.0;
                boolean isFind = false;
                while (iteratorScale.hasNext()) {
                    double doubleScale = iteratorScale.next();
                    AMV_MVS_VSQ_3D currenctHeart = distanceHeart.get_AMV_MVS_VSQ_3D(doubleScale);
                    double distance = Distance_X_getDistance3D._E(currenctHeart, position3D);
                    if (distance < scale) {
                        if (!isFind) {
                            isFind = true;
                            shortest = distance;
                            shortestDoubleScale = doubleScale;
                        } else {
                            if (shortest < distance) {
                                shortest = distance;
                                shortestDoubleScale = doubleScale;
                            }
                        }
                    }
                }
                if (isFind) {
                    AMV_MVS_VSQ_3D currenctHeart = distanceHeart.get_AMV_MVS_VSQ_3D(shortestDoubleScale);
                    //融入得到新的重心
                    AMV_MVS_VSQ_3D newHeart = Euclid_X_findCryptionPosition3D._E(currenctHeart
                        , position3D);
                    //删除当前增加坐标集, 更新坐标集
                    ArrayList<AMV_MVS_VSQ_3D> ArrayList = distanceGroups
											.getArrayList_AMV_MVS_VSQ_3D(shortestDoubleScale);
                    ArrayList.add(position3D);
                    distanceGroups.put(shortestDoubleScale, ArrayList);
                    //删除当前重心数据, 更新重心数据
                    distanceHeart.put(shortestDoubleScale, newHeart);
                } else {
                    ArrayList<AMV_MVS_VSQ_3D> ArrayList = new ArrayList<>();
                    ArrayList.add(position3D);
                    distanceGroups.put(++i, ArrayList);
                    distanceHeart.put(i, position3D);
                }
            }
        }
        return distanceGroups;
    }
}
