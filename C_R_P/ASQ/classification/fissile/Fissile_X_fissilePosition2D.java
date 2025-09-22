package ASQ.classification.fissile;

import ASQ.basic.Distance_X_getDistance2D;
import ASQ.euclid.Euclid_X_findCryptionPosition2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//task 20191219 daytime
//通过scale 距离来进行 坐标团切裂。
//Theory yaoguang.luo 20191219, 欧基里德
//Application yaoguang.luo
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */

public class Fissile_X_fissilePosition2D {
    public static Map<Double, List<AMV_MVS_VSQ_2D>> _E(List<AMV_MVS_VSQ_2D> groups
        , double scale) {
        IMV_SIQ distanceGroups = new IMV_SIQ();
        Map<Double, AMV_MVS_VSQ_2D> distanceHeart = new IMV_SIQ();
        Iterator<AMV_MVS_VSQ_2D> iterator = groups.iterator();
        double i = 0.0;//设置总分类数
        Here:
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_2D position2D = iterator.next();
            if (distanceGroups.isEmpty()) {
                List<AMV_MVS_VSQ_2D> list = new ArrayList<>();
                list.add(position2D);
                distanceGroups.put(i, list);
                distanceHeart.put(i, position2D);
            } else {
                //遍历所有团的重心
                //团重心匹配如果超精度新存, 不是就融入。
                Iterator<Double> iteratorScale = distanceHeart.keySet().iterator();
                boolean isFind = false;
                while (iteratorScale.hasNext()) {
                    double doubleScale = iteratorScale.next();
                    AMV_MVS_VSQ_2D currenctHeart = distanceHeart.get(doubleScale);
                    double distance = Distance_X_getDistance2D._E(currenctHeart, position2D);
                    if (distance < scale) {
                        //融入得到新的重心
                        AMV_MVS_VSQ_2D newHeart
                            = Euclid_X_findCryptionPosition2D._E(currenctHeart, position2D);
                        //删除当前增加坐标集, 更新坐标集
                        List<AMV_MVS_VSQ_2D> list = distanceGroups.get_List_AMV_MVS_VSQ_2D(doubleScale);
                        list.add(position2D);
                        distanceGroups.put(doubleScale, list);
                        //删除当前重心数据, 更新重心数据
                        distanceHeart.put(doubleScale, newHeart);
                        //找到
                        //如果预测 坐标适应状态 可以把 continue 省略。
                        continue Here;
                    }
                }
                //新存
                if (!isFind) {
                    List<AMV_MVS_VSQ_2D> list = new ArrayList<>();
                    list.add(position2D);
                    distanceGroups.put(++i, list);
                    distanceHeart.put(i, position2D);
                }
            }
        }
        return distanceGroups;
    }
}
