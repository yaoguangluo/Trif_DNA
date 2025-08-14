package ASQ.trace.AMV.MVS.VSQ;

import ASQ.euclid.Euclid_X_findCryptionPosition3D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;

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
public class Hearts_X_trackTracePosition3DHeartsWithSingerGroup {
    //Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
    //出版日期2019 年 12 月 21 日  作品说明Gitee, Github, DetaOSS
    //作品说明适用于 坐标团 动态分析, 增量轨迹分析, 熵增信息单元记录。
    //作者 罗瑶光
    public static List<AMV_MVS_VSQ_3D> _E(List<AMV_MVS_VSQ_3D> coods) {
        List<AMV_MVS_VSQ_3D> hearts = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_3D> iterator = coods.iterator();
        boolean isFirst = true;
        while (iterator.hasNext()) {
            if (isFirst) {
                isFirst = false;
                hearts.add(iterator.next());
            } else {
                AMV_MVS_VSQ_3D position3D = iterator.next();
                AMV_MVS_VSQ_3D CryptHeart
                    = Euclid_X_findCryptionPosition3D._E(hearts.get(hearts.size() - 1), position3D);
                hearts.add(CryptHeart);
            }
        }
        return hearts;
    }
}
