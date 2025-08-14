package ASQ.trace.fissile.AMV.MVS.VSQ;

import ASQ.euclid.Euclid_X_findCryptionPosition3D;
import ASQ.basic.Distance_X_getDistance3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 *  * 增量轨迹 涉及欧基里德路径思想， 授课卡拉森，书籍 数据挖掘 绿皮书 pang.ningtan
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Hearts_X_trackTracePosition3DHeartsWithFissileGroups {
    //Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
    //创作日期2019 年 12 月 21 日  作品说明Gitee, Github, DetaOSS
    //作品说明适用于 坐标团 动态分析, 增量轨迹分析, 熵增信息单元记录。
    //作者 罗瑶光
    public static IMV_SIQ
    _E(List<AMV_MVS_VSQ_3D> coods, double distanceScale) {
        IMV_SIQ output = new IMV_SIQ();
        IMV_SIQ distanceGroups = new IMV_SIQ();
        Iterator<AMV_MVS_VSQ_3D> iterator = coods.iterator();
        double i = 0.0;
        Here:
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_3D position3D = iterator.next();
            if (distanceGroups.isEmpty()) {
                List<AMV_MVS_VSQ_3D> list = new ArrayList<>();
                list.add(position3D);
                distanceGroups.put(i, list);
                //
                List<AMV_MVS_VSQ_3D> listHeartsTrace = output.getArrayList_AMV_MVS_VSQ_3D(i);
                listHeartsTrace.add(position3D);
                output.put(i, listHeartsTrace);
            } else {
                //遍历所有团
                //团重心匹配如果超精度新存, 不是就融入。
                Iterator<Double> iteratorScale = output.keySet().iterator();
                boolean isFind = false;
                while (iteratorScale.hasNext()) {
                    double doubleScale = iteratorScale.next();
                    AMV_MVS_VSQ_3D currenctHeart
                        = output.getArrayList_AMV_MVS_VSQ_3D(doubleScale).
                        get(output.getArrayList_AMV_MVS_VSQ_3D(doubleScale).size() - 1);
                    double distance = Distance_X_getDistance3D._E(currenctHeart, position3D);
                    if (distance < distanceScale) {
                        //融入得到新的重心
                        AMV_MVS_VSQ_3D newHeart
                            = Euclid_X_findCryptionPosition3D._E(currenctHeart, position3D);
                        //删除当前增加坐标集, 更新坐标集
                        List<AMV_MVS_VSQ_3D> list = distanceGroups.getArrayList_AMV_MVS_VSQ_3D(doubleScale);
                        list.add(position3D);
                        distanceGroups.put(doubleScale, list);
                        //删除当前重心数据, 更新重心数据轨迹
                        List<AMV_MVS_VSQ_3D> listHeartsTrace = output.getArrayList_AMV_MVS_VSQ_3D(doubleScale);
                        listHeartsTrace.add(newHeart);
                        output.put(doubleScale, listHeartsTrace);
                        //找到
                        //如果预测 坐标适应状态 可以把 continue 省略。
                        continue Here;
                    }
                }
                //新存
                List<AMV_MVS_VSQ_3D> list = new ArrayList<>();
                list.add(position3D);
                distanceGroups.put(++i, list);
                //加新hearts
                List<AMV_MVS_VSQ_3D> listHeartsTrace = output.getArrayList_AMV_MVS_VSQ_3D(i);
                listHeartsTrace.add(position3D);
                output.put(i, listHeartsTrace);
            }
        }
        return output;
    }
}
