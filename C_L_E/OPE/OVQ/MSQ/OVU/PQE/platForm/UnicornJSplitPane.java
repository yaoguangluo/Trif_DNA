package OPE.OVQ.MSQ.OVU.PQE.platForm;

import javax.swing.JSplitPane;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.Rectangle;

/**
 * 作者对jdk 开源插件进行2次开发。不在个人著作申请范围内。
 *
 * @author LYG refer JDK authors from SUN Tech, 。
 *//*
 *  作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */

public class UnicornJSplitPane extends JSplitPane {
    
    private int dividerDragSize = 3;
    private int dividerDragOffset = 3;

    public UnicornJSplitPane() {
        setDividerSize(0);
        setContinuousLayout(true);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void layout() {
        super.layout();
        BasicSplitPaneDivider divider = ((BasicSplitPaneUI) getUI()).getDivider();
        Rectangle bounds = divider.getBounds();
        if (orientation == HORIZONTAL_SPLIT) {
            bounds.x -= dividerDragOffset;
            bounds.width = dividerDragSize;
        } else {
            bounds.y -= dividerDragOffset;
            bounds.height = dividerDragSize;
        }
        divider.setBounds(bounds);
    }
}
