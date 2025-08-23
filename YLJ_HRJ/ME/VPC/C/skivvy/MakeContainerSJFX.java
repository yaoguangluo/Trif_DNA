package ME.VPC.C.skivvy;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import ME.VPC.S.ne.WindowsUI;
import OSI.OPE.OVU.PQE.flash.GUISample;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Container;

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
public class MakeContainerSJFX extends MakeContainer_X_S_s {

	public MakeContainerSJFX(Object[][] tableData_old, JTextPane text,
			Container containerPanel, App app_NE) {
		super(app_NE);
		NE = app_NE;
		this.containerPanel = containerPanel;
		this.text = text;
		this.tableData_old = tableData_old;
	}

	public void run() {
		if (null == jTabbedpane) {
			return;// mock trif
		}
		jTabbedpane.validate();
		DetaThread.sleepDeta(1000);
		containerPanel.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		System.out.println("启动400编码调试开始-00000055-001");
		app_S.gUISample = new GUISample();
		app_S.gUISample.IV_(this.tableData_old, this.text, NE);
		System.out.println("启动400编码调试开始-00000055-001-03");
		app_S.gUISample.start();
		containerPanel.add(app_S.gUISample);
		containerPanel.setName("数据分析");
		System.out.println("启动400编码调试开始-00000055-002");
		jTabbedpane.addTab(containerPanel.getName(), new ImageIcon(),
				containerPanel, containerPanel.getName());// 加入第一个页面
		Color[] colors = TableRender.getTableCellRender();
		int count = jTabbedpane.getTabCount();
		jTabbedpane.setBackgroundAt(count - 1, colors[count % 3]);
		System.out.println("启动400编码调试开始-00000055-003");
		app_S.gUISample.validate();
		jTabbedpane.validate();
		isFinished = true;
		System.out.println("启动400编码调试开始-00000055-004");
		// app_S.validate();
	}
}
