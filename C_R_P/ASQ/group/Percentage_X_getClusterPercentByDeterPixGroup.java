package ASQ.group;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;

import java.util.List;
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

public class Percentage_X_getClusterPercentByDeterPixGroup {
    //思想：统计与概率论
    //作者：罗瑶光
    //目的：用于像素 筛选, 过滤 和 主要成分 分析。
    //这个函数用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的簇数量占比。
    public static double _E(
        Map<Double, List<AMV_MVS_VSQ_2D>> imagePix, int scaleSUM) {
        double output = 0.0;
        for (double aDouble : imagePix.keySet()) {
            List<AMV_MVS_VSQ_2D> list = imagePix.get(aDouble);
            if (list.size() > scaleSUM) {
                output++;
            }
        }
        return output / imagePix.size();
    }
}
