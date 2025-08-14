package ASQ.trace.fissile.AMV.MVS.VSQ;

import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;

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
public class ByHearts_X_trackTracePosition2DByHearts {
    //Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
    //创作日期2020 年 04 月 14 日 作品说明Gitee, Github, DetaOSS
    //这个算法之前个人软著申请有相关的根据坐标计算重心轨迹的算法
    //, 这个函数是其反演函数, 根据坐标的重心轨迹来求解其坐标集。
    //作品说明适用于 坐标团 动态分析, 增量轨迹分析, 熵增信息单元记录。
    //作者 罗瑶光
    public static List<AMV_MVS_VSQ_2D> _E(List<AMV_MVS_VSQ_2D> hearts) {
        List<AMV_MVS_VSQ_2D> trackTracePositions = new ArrayList<>();
        Iterator<AMV_MVS_VSQ_2D> iterator = hearts.iterator();
        AMV_MVS_VSQ_2D lastPosition2D = null;
        if (iterator.hasNext()) {
            lastPosition2D = iterator.next();
            trackTracePositions.add(lastPosition2D);
        }
        while (iterator.hasNext()) {
            AMV_MVS_VSQ_2D heartPostion = iterator.next();
            //position2D.setX((heart.getX()+ oneMore.getX())/ 2);
            //newHeart= (lastHeart+ newp)/2   =>  newp= newHeart*2 -lastHeart
            //add section 1234
            AMV_MVS_VSQ_2D newPosition2D
                = new AMV_MVS_VSQ_2D(heartPostion.getX() * 2 - lastPosition2D.getX()
                , heartPostion.getY() * 2 - lastPosition2D.getY());
            trackTracePositions.add(newPosition2D);
            lastPosition2D = heartPostion;
        }
        return trackTracePositions;
    }
}
