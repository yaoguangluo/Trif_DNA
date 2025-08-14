package ASQ.basic;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;

//Theory: 勾股定理
//一种仅仅通过坐标差值叠加来计算距离向量的使用方法。
//Application: Yaoguang.luo
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Distance_X_getDistance2D {
    public static double _E(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
        double x = begin.getX() - end.getX();
        double y = begin.getY() - end.getY();
        return Math.abs(x) + Math.abs(y);
    }
}
