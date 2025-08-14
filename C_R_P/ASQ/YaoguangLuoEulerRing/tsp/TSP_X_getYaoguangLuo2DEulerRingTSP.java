package ASQ.YaoguangLuoEulerRing.tsp;

import ASQ.basic.Distance_X_getDistance2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.Line2D;
import S_A.pheromone.IMV_SIQ;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;

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
public class TSP_X_getYaoguangLuo2DEulerRingTSP {
    //Before I left L.A and went to Folsom, I did a quick TSP version at that time
    //at rosemead, it seems not fast. but now will be the best around this real world.
    //This Algorithm Theory as a new year gift to my CHRISTINA.
    //Foundation: Euler
    //Theory: Yaoguang.Luo
    //Application: Yaoguang.Luo 20200112
    public static List<Line2D> _E(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs) {
        //1 annotations
        List<AMV_MVS_VSQ_2D> AMV_MVS_VSQ2DTag = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_2D> iterator = AMV_MVS_VSQs.iterator();
        int i = 0;
        String tag = "tag";
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_2D AMV_MVS_VSQ2D = iterator.next();
            AMV_MVS_VSQ2D.I_Tag(tag + i++);
            AMV_MVS_VSQ2DTag.add(AMV_MVS_VSQ2D);
        }
        AMV_MVS_VSQs = AMV_MVS_VSQ2DTag;
        //2 get all lines
        List<Line2D> linesMap = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_2D> iteratorOuter = AMV_MVS_VSQs.iterator();
        while (iteratorOuter.hasNext()) {
            AMV_MVS_VSQ_2D AMV_MVS_VSQ2DOuter = iteratorOuter.next();
            Iterator<AMV_MVS_VSQ_2D> iteratorInner = AMV_MVS_VSQs.iterator();
            while (iteratorInner.hasNext()) {
                AMV_MVS_VSQ_2D AMV_MVS_VSQ2DInner = iteratorOuter.next();
                Line2D line2D = new Line2D();
                line2D.I_Begin(AMV_MVS_VSQ2DOuter);
                line2D.I_End(AMV_MVS_VSQ2DInner);
                linesMap.add(line2D);
            }
        }
        //3 sort line2D
        double[] distance = new double[AMV_MVS_VSQs.size()];
        Iterator<Line2D> linesKeySets = linesMap.iterator();
        //4 get each distance of line.
        i = 0;
        IMV_SIQ uniqueLines = new IMV_SIQ();
        while (linesKeySets.hasNext()) {
            Line2D line2D = linesKeySets.next();
            double distanceDouble = Distance_X_getDistance2D._E(line2D.getBegin(), line2D.getEnd());
            List<Line2D> list;
            if (uniqueLines.containsKey(distanceDouble)) {
                list = uniqueLines.getListLine2D(distanceDouble);
            } else {
                list = new ArrayList<>();
                //5 normalization the unique key of the distance
                distance[i++] = distanceDouble;
            }
            list.add(line2D);
            uniqueLines.put(distanceDouble, list);
        }
        //6 Yaoguangluo's 4D Peak filter Theory Quick Sort the Distance Array
        int sortRangeScale = 4; //my default is 4. you should change it as your want.
        //distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
        distance = new LYG9DWithDoubleTopSort4D().sort(distance, sortRangeScale, 4);//算法应用更新
        //7 From small to big loop the distance and make a condition tree.
        List<Line2D> outputLine2D = new ArrayList<>();
        IMV_SIQ outputDouble2D = new IMV_SIQ();
        for (i = 0; i < distance.length; i++) {
            List<Line2D> list = uniqueLines.getListLine2D(distance[i]);
            for (Line2D line2D : list) {
                AMV_MVS_VSQ_2D begin = line2D.getBegin();
                AMV_MVS_VSQ_2D end = line2D.getEnd();
                //8 decision tree add rights line
                if (outputDouble2D.containsKey(begin.getTag())) {
                    double beginTimes = outputDouble2D.getDouble(begin.getTag());
                    if (outputDouble2D.containsKey(end.getTag())) {
                        double endTimes = outputDouble2D.getDouble(end.getTag());
                        if (beginTimes > 1 || endTimes > 1) {
                            continue;
                        }
                        outputDouble2D.put(begin.getTag(), beginTimes + 1);
                        outputDouble2D.put(end.getTag(), endTimes + 1);
                    } else {
                        if (beginTimes > 1) {
                            continue;
                        }
                        outputDouble2D.put(begin.getTag(), beginTimes + 1);
                        outputDouble2D.put(end.getTag(), 1.0);
                    }
                } else {
                    if (outputDouble2D.containsKey(end.getTag())) {
                        double endTimes = outputDouble2D.getDouble(end.getTag());
                        if (endTimes > 1) {
                            continue;
                        }
                        outputDouble2D.put(begin.getTag(), 1.0);
                        outputDouble2D.put(end.getTag(), endTimes + 1);
                    } else {
                        outputDouble2D.put(begin.getTag(), 1.0);
                        outputDouble2D.put(end.getTag(), 1.0);
                    }
                }
                outputLine2D.add(line2D);
            }
        }
        return outputLine2D;
    }
}
