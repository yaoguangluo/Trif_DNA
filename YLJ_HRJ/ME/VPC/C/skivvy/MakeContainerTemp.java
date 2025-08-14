package ME.VPC.C.skivvy;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import ME.VPC.S.ne.Page_X_S_VSE;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class MakeContainerTemp extends MakeContainer_X_S_s {

    public MakeContainerTemp(Container container, App app_NE) {
        super(app_NE);
        NE = app_NE;
        this.containerPanel = container;
    }

    public void run() {
        //jTabbedpane.updateUI();
        DetaThread.sleepDeta(1000 * 2);
        Page_X_S_VSE page_X_S_VSE = new Page_X_S_VSE();

        String pageName = "临时空";
        page_X_S_VSE.setName(pageName);
        containerPanel = page_X_S_VSE;
        if (null == jTabbedpane) {
            return;//fatal trif
        }
        jTabbedpane.addTab(containerPanel.getName(), new ImageIcon()
            , page_X_S_VSE, containerPanel.getName());// 加入第一个页面
        Color[] colors = TableRender.getTableCellRender();
        jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1
            , colors[jTabbedpane.getTabCount() % 3]);
        jTabbedpane.validate();
    }
}