package ASQ.find.mean;

import ASQ.basic.Distance_X_getDistance2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;

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
public class Distance_X_findPascalMeanDistanceByEachPositions2D {
    //observerPCAScale：确定主要有效最短路径的观测数
    //sortRangeScale：确定坐标距离排序时的相似成份多少来确定堆栈冗余比, 避免堆栈溢出。
    //求坐标团的主要有效距离成份集的平均压强算法
    //适用于 观测/预测坐标集中某精度邻接坐标集的 平均距离 来确定 紧凑度, 压力, 压强, 斥力等。
    //思想：罗瑶光 20191225
    //实现：罗瑶光
    //2D坐标团中 每一个坐标的斥力预测算法。
    public static double[] _E(List<AMV_MVS_VSQ_2D> position2Ds
        , double observerPCAScale, int sortRangeScale) {
        double[] pascal = new double[position2Ds.size()];
        Iterator<AMV_MVS_VSQ_2D> outPosition2DIterator = position2Ds.iterator();
        double outMean = 0.0;
        int positionPoint = 0;
        while (outPosition2DIterator.hasNext()) {
            AMV_MVS_VSQ_2D outPosition2D = outPosition2DIterator.next();
            double[] distance = new double[position2Ds.size()];
            int i = 0;
            //取坐标点所有距离集合先
            for (AMV_MVS_VSQ_2D inPosition2D : position2Ds) {
                distance[i++] = Distance_X_getDistance2D._E(outPosition2D, inPosition2D);
            }
            //距离非对称缺陷小高峰过滤极速快排 从小到大
            //distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
            distance = new LYG9DWithDoubleTopSort4D().sort(distance, sortRangeScale, 4);//算法应用更新
            //仅仅取精度内坐标点距离求平均值, 0 为本身所以从 1 开始
            double inMean = 0.0;
            observerPCAScale = observerPCAScale >= position2Ds.size()
                ? position2Ds.size() - 1 : observerPCAScale;
            observerPCAScale = observerPCAScale < 0 ? 0 : observerPCAScale;
            for (i = 1; i <= observerPCAScale; i++) {
                inMean += distance[i];
            }
            inMean /= observerPCAScale;
            outMean += inMean;
            //采集坐标点形成斥力参照的主要最短路径成份。
            pascal[positionPoint++] = inMean;
        }
        outMean /= position2Ds.size();
        for (int i = 0; i < pascal.length; i++) {
            //比值获取 不稳定 观测数据。
            pascal[i] /= outMean;
        }
        return pascal;
    }
}
