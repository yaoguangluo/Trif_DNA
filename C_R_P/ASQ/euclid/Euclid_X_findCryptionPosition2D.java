package ASQ.euclid;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;

//Theory: Euclid
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
public class Euclid_X_findCryptionPosition2D {
    public static AMV_MVS_VSQ_2D _E(AMV_MVS_VSQ_2D heart
        , AMV_MVS_VSQ_2D oneMore) {
        AMV_MVS_VSQ_2D position2D = new AMV_MVS_VSQ_2D();
        position2D.I_X((heart.getX() + oneMore.getX()) / 2);
        position2D.I_Y((heart.getY() + oneMore.getY()) / 2);
        return position2D;
    }
}
