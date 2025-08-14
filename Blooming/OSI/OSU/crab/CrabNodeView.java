package OSI.OSU.crab;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import ME.VPC.M.app.App;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;

;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class CrabNodeView extends OSU_OVQ_OSQ_VSQ {
    //
    public JButton button;
    public String path;

    public CrabNodeView() {
        super();
    }

    public void view(App NE) {
        try {
            scrollPane = new ScrollPane();
            panel = new Panel();
            panel.setBackground(Color.yellow);
            JScrollPane j = new JScrollPane();
            tableout.setBackground(new Color(240, 128, 128));
            tableout.setPreferredSize(new Dimension(200, 800));
            tableout.setVisible(true);
            j.setViewportView(tableout);
            panel.add(j);
            scrollPane.add(panel);
            add(scrollPane);
            close = false;
        } catch (Exception e) {
        }

    }

    @Override
    public OSU_OVQ_OSQ_VSQ clone() {
        objectView = (OSU_OVQ_OSQ_VSQ) super.clone();
        return objectView;
    }
}
