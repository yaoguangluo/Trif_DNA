package ME.VPC.M.X;

import ME.VPC.C.skivvy.MakeContainerBJY;
import ME.VPC.C.skivvy.MakeContainerQMDJ;
import ME.VPC.C.skivvy.MakeContainerSJFX;
import ME.VPC.C.skivvy.MakeContainerTemp;
import ME.VPC.C.skivvy.MakeContainerXYCF;
//import ME.VPC.C.skivvy.MakeContainerZNXZ;
//import ME.VPC.C.skivvy.MakeContainerZNXZ;
import ME.VPC.C.skivvy.MakeContainerZYNKFJ;
import ME.VPC.M.app.App;
//import ME.VPC.M.app.AppHospital;
//import M_V.MVQ.button.HrjButton;
//import O_V.OPM.ESU.admin.VPCSRestPanel;
//import O_V.OSI.AOP.VPC.server.BootVPCSFrontEnd;
import O_V.OSI.AOP.VPC.server.RestServer;
//import P_V.PCS.thread.SocketThreadPool;
import S_A.pheromone.MSI_EVD_SVX_TVS_DAH;
import exception.thread.DetaThread;

//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JScrollPane;
//
//import C_A.OSI.AOP.MS.VPC.server.BootVPCSBackEnd;
//
//import java.awt.Color;
import java.awt.Container;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.io.IOException;
//import ME.VPC.S.ne.App_S;
//import ME.VPC.C.skivvy.MakeContainerZYWS;
//import ME.VPC.C.skivvy.MakeContainerZYZD;
//import ME.VPC.C.skivvy.MakeContainerZYFC;
//import ME.VPC.C.skivvy.MakeContainerXYJZ;
//import ME.VPC.C.skivvy.MakeContainerXYNK;
//import ME.VPC.C.skivvy.MakeContainerXYWK;
//import ME.VPC.C.skivvy.MakeContainerXXFC;
//import ME.VPC.C.skivvy.MakeContainerGJJD;
//import ME.VPC.C.skivvy.MakeContainerHLS;

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
public class AppInit_X_PageLoad_S extends AppInit_X_PageLoad_SD{
	protected void bootDetaHVPCS(App NE) {
		RestServer rest = new RestServer(NE);// 300mb
		rest.start();
	}
	
	protected void bootDetaFrontEnd(App NE) {
//		new BootVPCSFrontEnd(NE.app_S).start();
//		DetaThread.sleepDeta(5);
//		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
//			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
//			text = "\r\n" + "----载入德塔 前端服务器 完毕！" + text;
//			text = "\r\n" + "..." + text;
//			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
//		}
	}

	// Trif later
	protected void bootDetaBackEnd(App NE) {
		System.out.println("启动400编码调试开始-00000052");
//		SocketThreadPool socketThreadPool = new SocketThreadPool();
//		new BootVPCSBackEnd(NE.app_S, NE).bootBackEnd(socketThreadPool, NE);
//		;
//		DetaThread.sleepDeta(6);
//		System.out.println("启动400编码调试开始-00000052-01-05");
//		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
//			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
//			text = "\r\n" + "----载入德塔 后端服务器 完毕！" + text;
//			text = "\r\n" + "..." + text;
//			text = "\r\n" + "----载入德塔 数据分析引擎 完毕！" + text;
//			text = "\r\n" + "..." + text;
//			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
//		}
	}

	protected void bootDetaSJFX(App NE) {
		System.out.println("启动400编码调试开始-00000052-01-06");
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入数据分析页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		System.out.println("启动400编码调试开始-00000055");
		Container containerPanel = new Container();
		MakeContainerSJFX makeContainerSJFX = new MakeContainerSJFX(
				NE.app_S.tableData_old, NE.app_S.text, containerPanel, NE);
		makeContainerSJFX.start();
		while (!makeContainerSJFX.isFinished) {
			System.out.println("启动400编码调试开始-00000055-1");
			DetaThread.sleepDeta(500);
		}
	}

	protected void bootDetaZNSZ(App NE) {
		System.out.println("启动400编码调试开始-00000056");
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入智能声诊页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		Container jpanelFourth = new Container();
		NE._I_U.makeContainerZNSZ = new MSI_EVD_SVX_TVS_DAH(jpanelFourth, NE);
		NE._I_U.makeContainerZNSZ.start();
		DetaThread.sleepDeta(300);
	}

	protected void bootDetaQMDJ(App NE) {
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入位术数页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		Container jpanel5 = new Container();
		MakeContainerQMDJ makeContainerQMDJ = new MakeContainerQMDJ(jpanel5,
				NE);
		makeContainerQMDJ.start();
		DetaThread.sleepDeta(300);
	}

	protected void bootDetaXYCF(App NE) {
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入 西医处方 页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		MakeContainerXYCF makeContainerXYCF = new MakeContainerXYCF(NE);
		makeContainerXYCF.start();
	}

	protected void bootDetaLSYM(App NE) {
		System.out.println("启动400编码调试开始-00000057");
		DetaThread.sleepDeta(300);
		//
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入临时页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		System.out.println("启动400编码调试开始-00000058");
		Container container = new Container();
		MakeContainerTemp makeContainerTemp = new MakeContainerTemp(container,
				NE);
		makeContainerTemp.start();
		DetaThread.sleepDeta(300);
	}

	protected void bootDetaBJY(App NE) {
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入 编辑页 页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		MakeContainerBJY makeContainerBJY = new MakeContainerBJY(NE);
		makeContainerBJY.start();
		DetaThread.sleepDeta(300);
	}

	protected void bootDetaZNXZ(App NE) throws InterruptedException, IOException {
		System.out.println("启动400编码调试开始-00000059");
		doAmedicinefilter(NE);
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入智能相诊页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		System.out.println("启动400编码调试开始-00000060");
		// 稍后
		if (NE.tempString.contains("测试") || NE.tempString.contains("test")) {
		} else {
//			Container jpanelThird = new Container();
//			MakeContainerZNXZ makeContainerZNXZ = new MakeContainerZNXZ(
//					jpanelThird, NE);
//			makeContainerZNXZ.start();
//			while (!makeContainerZNXZ.isFinished) {
//				DetaThread.sleepDeta(500);
//			}
//			Container component = jpanelThird;
//			NE.app_S.jTabbedpane.setSelectedComponent(jpanelThird);
//			NE.app_S.makeContainer_ZHONG_YAO.doJump(component,
//					component.getName());
		}
	}

	protected void bootDetaZYFJ(App NE) {
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----正在载入中医方剂页面！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		MakeContainerZYNKFJ makeContainerZYNKFJ = new MakeContainerZYNKFJ(NE);
		makeContainerZYNKFJ.start();
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