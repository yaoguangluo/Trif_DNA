package ME.VPC.M.X;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;

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
public class AppInit_X_PageLoad extends AppInit_X_PageLoad_S {

	public void IV_(App_S app, App NE) {
		System.out.println("启动400编码调试开始-00000051");
		// front later to hvpcs
		bootDetaFrontEnd(NE);
		// backend
		bootDetaBackEnd(NE);
		// SJFX
		bootDetaSJFX(NE);
		// trif
		bootDetaZNSZ(NE);
		// trif
		bootDetaQMDJ(NE);
		//
		bootDetaXYCF(NE);
		//
		bootDetaLSYM(NE);
		//
		bootDetaBJY(NE);
		//
		bootDetaZNXZ(NE);
		//
		bootDetaZYFJ(NE);

		if (app.appConfig.SectionJPanel.jTextPane != null) {
			String text = app.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正常载入完毕 欢迎使用 养疗经 大数据医学辅助, 诊疗, 电子医院系统！" + text;
			text = "\r\n" + "..." + text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		app.disableCursor = false;
		app.jTabbedpane.validate();
		app.appConfig.SectionJPanel.jTextPane
				.setText(app.appConfig.SectionJPanel.jTextPane.getText()
						+ "\r\n\r\n" + "cursor inject");
	}

}
//		System.out.println("启动400编码调试开始-00000061");
//DetaThread.sleepDeta(300);
//if (app.appConfig.vPCSRestPanel.tabNamesHook[16]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 哈里森医典 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerHLS makeContainerHLS = new MakeContainerHLS(NE);
//	makeContainerHLS.start();
//}
//if (app.appConfig.vPCSRestPanel.tabNamesHook[5]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入西医内科页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXYNK makeContainerXYNK = new MakeContainerXYNK(NE);
//	makeContainerXYNK.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[7]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入中医诊断页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerZYZD makeContainerZYZD = new MakeContainerZYZD(NE);
//	makeContainerZYZD.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[8]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入古籍页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerGJJD makeContainerGJJD = new MakeContainerGJJD(NE);
//	makeContainerGJJD.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[9]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入中医妇产页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerZYFC makeContainerZYFC = new MakeContainerZYFC(NE);
//	makeContainerZYFC.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[10]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 西医妇产 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXXFC makeContainerXXFC = new MakeContainerXXFC(NE);
//	makeContainerXXFC.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[11]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 西医急诊 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXYJZ makeContainerXYJZ = new MakeContainerXYJZ(NE);
//	makeContainerXYJZ.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[12]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 西医外科 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXYWK makeContainerXYWK = new MakeContainerXYWK(NE);
//	makeContainerXYWK.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[13]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 中医外伤 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerZYWS makeContainerZYWS = new MakeContainerZYWS(NE);
//	makeContainerZYWS.start();
//	DetaThread.sleepDeta(300);
//}
//DetaThread.sleepDeta(300);
//// }
