package ME.VPC.C.skivvy;

import ME.VPC.E.sleeper.WkxPage;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import java.awt.Color;

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
public class MakeContainerXYWK extends MakeContainer_X_S_s {

    public MakeContainerXYWK(App app_NE) {
        super(app_NE);
        NE = app_NE;
    }

    public void run() {
        jTabbedpane.validate();
        DetaThread.sleepDeta(1000 * 5);
        app_S.wkxPage = new WkxPage(app_S.text, NE);
        app_S.wkxPage.setName("大外科概论");
        jTabbedpane.addTab("大外科概论", new ImageIcon()
            , app_S.wkxPage, "大外科概论");// 加入第一个页面
        Color[] colors = TableRender.getTableCellRender();
        jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1
            , colors[jTabbedpane.getTabCount() % 3]);
        jTabbedpane.validate();
    }
}
