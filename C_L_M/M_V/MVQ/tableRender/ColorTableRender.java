package M_V.MVQ.tableRender;

import ME.VPC.M.app.App;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.Component;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class ColorTableRender extends DefaultTableCellRenderer {
    
    App NE;

    public ColorTableRender(App app_NE) {
        NE = app_NE;
    }

    public Component getTableCellRendererComponent(JTable table, Object value
        , boolean isSelected, boolean hasFocus, int row,
                                                   int column) {
        if (isSelected && hasFocus && row == table.getSelectedRow()
            && column == table.getSelectedColumn()) {
            //2.设置当前Cell的颜色
            Component c = super.getTableCellRendererComponent(table, value, isSelected
                , hasFocus, row, column);
            c.setBackground(Color.CYAN);//设置背景色
            c.setForeground(Color.gray);//设置前景色
            return c;
        } else {
            //3.设置单数行, 偶数行的颜色
            if (row % 3 == 0) {//偶数行时的颜色 罗瑶光
                setBackground(new Color(253
                    , 255 - NE.app_S.color_bg_rot
                    , 254));
            } else if (row % 3 == 1) {//设置单数行的颜色
                setBackground(new Color(255 - NE.app_S.color_bg_rot
                    , 254
                    , 255 - NE.app_S.color_bg_rot));
            } else if (row % 3 == 2) {//设置单数行的颜色
                setBackground(new Color(255
                    , 251
                    , 255 - NE.app_S.color_bg_rot));
            }
            return super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
        }
    }
}
