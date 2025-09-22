package ASQ.filter;

import ASQ.classification.fissile.FissileWithMatch_X_fissilePosition2DWithMatch;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.image.ImagePixClassification;

import java.util.ArrayList;
import java.util.Iterator;
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

public class Filter_X_getImagePix2DGroupFilter {
    //思想：罗瑶光
    //作者：罗瑶光
    //将shareholder分层处理的图片像素数据 按指定的精度和对应像素进行按像素团的大小进行特定过滤。
    public static int[][] _E(int[][] inputPixMatrix
        , int RBG, int distanceScale, int max, int min) {
        //像素分类
        Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> map = ImagePixClassification
            .getImagePixClassificationMap(inputPixMatrix);
        //获取分类后的团簇
        Map<Double, ArrayList<AMV_MVS_VSQ_2D>> mid
            = FissileWithMatch_X_fissilePosition2DWithMatch
            ._E(map.get(RBG), (double) distanceScale);
        //筛选团簇, 过滤团簇
        Iterator<Double> iteratorMid = mid.keySet().iterator();
        while (iteratorMid.hasNext()) {
            ArrayList<AMV_MVS_VSQ_2D> list = mid.get(iteratorMid.next());
            if (null != list) {
                if (list.size() < min || list.size() > max) {
                    Iterator<AMV_MVS_VSQ_2D> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        AMV_MVS_VSQ_2D position2D = iterator.next();
                        inputPixMatrix[(int) position2D.getX()]
                            [(int) position2D.getY()] = 0;
                    }
                }
            }
        }
        return inputPixMatrix;
    }
}
