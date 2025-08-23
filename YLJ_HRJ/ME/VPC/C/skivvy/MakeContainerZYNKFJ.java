package ME.VPC.C.skivvy;

import ME.VPC.E.sleeper.ZynkxPage;
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
public class MakeContainerZYNKFJ extends MakeContainer_X_S_s {

    public MakeContainerZYNKFJ(App app_NE) {
        super(app_NE);
        NE = app_NE;
    }

    public void run() {
        jTabbedpane.validate();
        DetaThread.sleepDeta(1000 * 2);
        app_S.zynkxPage = new ZynkxPage(app_S.text, NE);
        app_S.zynkxPage.setName("中医方剂");
        jTabbedpane.addTab("中医方剂", new ImageIcon()
            , app_S.zynkxPage, "中医方剂");// 加入第一个页面
        Color[] colors = TableRender.getTableCellRender();
        jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1
            , colors[jTabbedpane.getTabCount() % 3]);
        jTabbedpane.validate();
    }
}

//@SuppressWarnings("deprecation")
//@Override
//public void mouseClicked(MouseEvent arg0) {
//	
//	//
//	if(3== arg0.getButton()) {
//		int index= jTabbedpane.getSelectedIndex();
//		Component component= jTabbedpane.getComponentAt(index);
//		String name= component.getName();
//		if(name.contains("鏈崏")) {
//			return;
//		}
//		//寮瑰嚭
//		JFrame frameTag= new JFrame(name);
//		//frame.setLayout(null);
//		frameTag.setSize(1330, 720);
//		Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
//		//
//		frameTag.setLocation(point.x, point.y);
//		frameTag.setResizable(false);
//		//frameTag.add(app_S.zynkx);
//		frameTag.add(jTabbedpane.getSelectedComponent());
//		frameTag.setVisible(true);
//		frameTag.show();
//	//	frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
//		frameTag.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent windowevent) {
//				//String command= "taskkill /im dm_new.exe /f";  
//				jTabbedpane.addTab(name, new ImageIcon(), component, name);// 鍔犲叆绗竴涓〉锟???
//				jTabbedpane.validate();
//			}
//		});
//		//娓呯┖
//		jTabbedpane.remove(component);	
//	}
//}
//@Override
//public void mouseEntered(MouseEvent arg0) {
//	
//	
//}
//@Override
//public void mouseExited(MouseEvent arg0) {
//	
//	
//}
//@Override
//public void mousePressed(MouseEvent arg0) {
//	
//	
//}
//@Override
//public void mouseReleased(MouseEvent arg0) {
//	
//	
//}
