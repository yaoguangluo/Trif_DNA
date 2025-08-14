package ASQ.YaoguangLuoEulerRing.tsp;

import ASQ.basic.Distance_X_getDistance2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.Line2D;
import S_A.pheromone.IMV_SIQ;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class TSP3D_X_getYaoguangLuo2DEulerRingTSP3D {
    //Foundation: Euler
    //Theory: Yaoguang.Luo
    //Application: Yaoguang.Luo 20200317
    public static List<Line2D> _E(List<AMV_MVS_VSQ_2D> positions
        , int sortRangeScale, int sortDeepsScale) {
        //1 annotations
        List<AMV_MVS_VSQ_2D> position2DTag = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_2D> iterator = positions.iterator();
        int i = 0;
        String tag = "tag";
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_2D position2D = iterator.next();
            position2D.I_Tag(tag + i++);
            position2DTag.add(position2D);
        }
        positions = position2DTag;
        //2 get all lines
        List<Line2D> linesMap = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_2D> iteratorOuter = positions.iterator();
        IMV_SIQ indexMap = new IMV_SIQ();
        while (iteratorOuter.hasNext()) {
            AMV_MVS_VSQ_2D position2DOuter = iteratorOuter.next();
            Iterator<AMV_MVS_VSQ_2D> iteratorInner = positions.iterator();
            while (iteratorInner.hasNext()) {
                AMV_MVS_VSQ_2D position2DInner = iteratorOuter.next();
                Line2D line2D = new Line2D();
                line2D.I_Begin(position2DOuter);
                line2D.I_End(position2DInner);
                //2.1 delete the De-reflection redundant lines
                if (indexMap.containsKey(position2DInner.getTag())) {
                    continue;
                }
                //2.2 delete self positions lines
                if (!(!Objects.equals(position2DOuter.getX(), position2DInner.getX())
                    || !Objects.equals(position2DOuter.getY(), position2DInner.getY()))) {
                    continue;
                }
                Map<String, String> map;
                if (indexMap.containsKey(position2DOuter.getTag())) {
                    map = indexMap.getStringMap(position2DOuter.getTag());
                } else {
                    map = new IMV_SIQ();
                }
                map.put(position2DInner.getTag(), "");
                indexMap.put(position2DOuter.getTag(), map);
                linesMap.add(line2D);
            }
        }
        //3 sort line2D
        double[] distance = new double[positions.size()];
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
        distance = new LYG9DWithDoubleTopSort4D().sort(distance, sortRangeScale, sortDeepsScale);//算法应用更新
        //7 From small to big loop the distance and make a condition tree.
        List<Line2D> outputLine2D = new ArrayList<>();
        IMV_SIQ outputDouble2D = new IMV_SIQ();
        for (i = 0; i < distance.length; i++) {
            List<Line2D> list = uniqueLines.getListLine2D(distance[i]);
            Iterator<Line2D> iteratorLines = list.iterator();
            while (iteratorLines.hasNext()) {
                Line2D line2D = iteratorLines.next();
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
//92 //int sortRangeScale= 4; //my default is 4. you should change it as your want.
//		//distance= new LYG5DWithDoubleQuickSort4D().sort(distance, sortRangeScale, sortDeepsScale);
//