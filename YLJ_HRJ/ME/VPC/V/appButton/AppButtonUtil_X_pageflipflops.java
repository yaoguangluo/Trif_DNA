//YLJ_HRJ/ME/APM/VSQ/AppButtonUtil.java
package ME.VPC.V.appButton;

import ME.VPC.M.app.App;
import ME.VPC.S.pillow.PageWords;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.List;
//把通用节点的 按钮操作提取出来 统一化管理去重。

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//20211022 
public class AppButtonUtil_X_pageflipflops {
    //	StringBuilder page= new StringBuilder().append("");
    //	AppPageUtil.pageSIMILAR(page, etc, cte, key, pos, sets, currentPage);

    //	StringBuilder page= new StringBuilder().append("");
    //	AppPageUtil.pageflipPages(page, map, key, pos, sets, currentPage);
    public static void pageflipPages(StringBuilder page, IMV_SIQ_SS map
            , String key, List<String> sets, int currentPage, App NE) {
        List<String> setsForGet = sets.subList(currentPage * 2000
                , (currentPage + 1) * 2000 < sets.size()
                        ? (currentPage + 1) * 2000 : sets.size());
        PageWords.renderWordLoopPOS(page, setsForGet, map, key, true, NE);
    }
}
