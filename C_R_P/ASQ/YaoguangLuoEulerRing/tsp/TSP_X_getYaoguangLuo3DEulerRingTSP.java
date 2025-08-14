package ASQ.YaoguangLuoEulerRing.tsp;

import ASQ.basic.Distance_X_getDistance3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import P_V.PCI.ASQ.demension.Line3D;
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
public class TSP_X_getYaoguangLuo3DEulerRingTSP {
    //Before I left L.A and went to Folsom, I did a quick TSP version at that time
    //at rosemead, it seems not fast. but now will be the best around this real world.
    //This Algorithm Theory as a new year gift to my CHRISTINA.
    //Foundation: Euler
    //Theory: Yaoguang.Luo
    //Application: Yaoguang.Luo 20200112
    public static List<Line3D> _E(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs) {
        //1 annotations
        List<AMV_MVS_VSQ_3D> AMV_MVS_VSQ3DTag = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_3D> iterator = AMV_MVS_VSQs.iterator();
        int i = 0;
        String tag = "tag";
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_3D AMV_MVS_VSQ3D = iterator.next();
            AMV_MVS_VSQ3D.I_Tag(tag + i++);
            AMV_MVS_VSQ3DTag.add(AMV_MVS_VSQ3D);
        }
        AMV_MVS_VSQs = AMV_MVS_VSQ3DTag;
        //2 get all lines
        List<Line3D> linesMap = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_3D> iteratorOuter = AMV_MVS_VSQs.iterator();
        while (iteratorOuter.hasNext()) {
            AMV_MVS_VSQ_3D AMV_MVS_VSQ3DOuter = iteratorOuter.next();
            Iterator<AMV_MVS_VSQ_3D> iteratorInner = AMV_MVS_VSQs.iterator();
            while (iteratorInner.hasNext()) {
                AMV_MVS_VSQ_3D AMV_MVS_VSQ3DInner = iteratorOuter.next();
                Line3D line3D = new Line3D();
                line3D.I_Begin(AMV_MVS_VSQ3DOuter);
                line3D.I_End(AMV_MVS_VSQ3DInner);
                linesMap.add(line3D);
            }
        }
        //3 sort line3D
        double[] distance = new double[AMV_MVS_VSQs.size()];
        Iterator<Line3D> linesKeySets = linesMap.iterator();
        //4 get each distance of line.
        i = 0;
        IMV_SIQ uniqueLines = new IMV_SIQ();
        while (linesKeySets.hasNext()) {
            Line3D line3D = linesKeySets.next();
            double distanceDouble = Distance_X_getDistance3D._E(line3D.getBegin(), line3D.getEnd());
            List<Line3D> list;
            if (uniqueLines.containsKey(distanceDouble)) {
                list = uniqueLines.getListLine3D(distanceDouble);
            } else {
                list = new ArrayList<>();
                //5 normalization the unique key of the distance
                distance[i++] = distanceDouble;
            }
            list.add(line3D);
            uniqueLines.put(distanceDouble, list);
        }
        //6 Yaoguangluo's 4D Peak filter Theory Quick Sort the Distance Array
        int sortRangeScale = 4; //my default is 4. you should change it as your want.
        //distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
        distance = new LYG9DWithDoubleTopSort4D().sort(distance, sortRangeScale, 4);//算法应用更新
        //7 From small to big loop the distance and make a condition tree.
        List<Line3D> outputLine3D = new ArrayList<>();
        IMV_SIQ outputDouble3D = new IMV_SIQ();
        for (i = 0; i < distance.length; i++) {
            List<Line3D> list = uniqueLines.getListLine3D(distance[i]);
            for (Line3D line3D : list) {
                AMV_MVS_VSQ_3D begin = line3D.getBegin();
                AMV_MVS_VSQ_3D end = line3D.getEnd();
                //8 decision tree add rights line
                if (outputDouble3D.containsKey(begin.getTag())) {
                    double beginTimes = outputDouble3D.getDouble(begin.getTag());
                    if (outputDouble3D.containsKey(end.getTag())) {
                        double endTimes = outputDouble3D.getDouble(end.getTag());
                        if (beginTimes > 1 || endTimes > 1) {
                            continue;
                        }
                        outputDouble3D.put(begin.getTag(), beginTimes + 1);
                        outputDouble3D.put(end.getTag(), endTimes + 1);
                    } else {
                        if (beginTimes > 1) {
                            continue;
                        }
                        outputDouble3D.put(begin.getTag(), beginTimes + 1);
                        outputDouble3D.put(end.getTag(), 1.0);
                    }
                } else {
                    if (outputDouble3D.containsKey(end.getTag())) {
                        double endTimes = outputDouble3D.getDouble(end.getTag());
                        if (endTimes > 1) {
                            continue;
                        }
                        outputDouble3D.put(begin.getTag(), 1.0);
                        outputDouble3D.put(end.getTag(), endTimes + 1);
                    } else {
                        outputDouble3D.put(begin.getTag(), 1.0);
                        outputDouble3D.put(end.getTag(), 1.0);
                    }
                }
                outputLine3D.add(line3D);
            }
        }
        return outputLine3D;
    }
}
