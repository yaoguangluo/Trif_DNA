package C_A.OSI.AOP.MS.VPC.server;

import C_A.OSI.AOP.MS.VPC.S.hall.DatabaseLog_H;
import DetaSrc.org.deta.boot.sets.StableBlob;
import DetaSrc.org.deta.boot.sets.StableSets;
//import DetaSrc.org.deta.boot.sets.VPCSRequest;
//import DetaSrc.org.deta.boot.sets.VPCSResponse;
import DetaSrc.org.deta.boot.vpc.process.TimeProcess;
import DetaSrc.org.deta.boot.vpc.sleeper.SleeperHall;
import DetaSrc.org.deta.boot.vpc.sleeper.Sleeper_X;
import DetaSrc.org.deta.boot.vpc.sleeper.TimeHall;
import ME.VPC.M.app.App;
import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import M_V.MS.VPC.PP.Time_P;
//import S_A.SVQ.stable.S_HTTP;
//import S_A.SVQ.stable.S_Web;
import utils.DetaUtil;
import YLJ_HRJ.ME.VPC.S.configs.ConfigIndex;

import javax.swing.JTextPane;
import java.io.IOException;
import java.net.ServerSocket;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ServerInit_C {
	private ServerSocket server;
	// private static Properties properties;
	private static int port;
	private static String dbConfigPath;

	public void IV_Service(JTextPane jTextPane, String frontendTxt) {
		try {
			// port=
			// Integer.parseInt(properties.getProperty(S_Data.TCP_PORT));
			// port = 3306;
			port = Integer.valueOf(frontendTxt);
			System.out.println("启动400编码调试开始-00000054-" + port);
			// port= Config.detaVPCSDBPort;
			server = new ServerSocket(port);
			// 20230106-System.out.println("----德塔VPCS数据库服务器端口启动:" +
			// port);
			if (jTextPane != null) {
				String text = jTextPane.getText();
				text = "\r\n" + "----德塔VPCS数据库服务器端口启动:" + port + text;
				text = "\r\n" + "..." + text;
				jTextPane.setText(text);
			}
			if (null != dbConfigPath && !dbConfigPath.isEmpty()) {
				dbConfigPath.replace("\\", "/"); // 支持 linux reg 格式
				DetaUtil.IV_DB(dbConfigPath);
			} else {
				dbConfigPath = ConfigIndex.detaDBPath;
				DetaUtil.IV_DB(dbConfigPath);
			}
			System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
			if (jTextPane != null) {
				String text = jTextPane.getText();
				text = "\r\n" + "----德塔VPCS数据库服务器DMA确认:成功！" + text;
				text = "\r\n" + "...";
				jTextPane.setText(text);
			}
			RequestFilter_C.IV_BlockList();
			System.out.println("----德塔VPCS数据库服务器IP过滤服务启动:成功！");
			if (jTextPane != null) {
				String text = jTextPane.getText();
				text = "\r\n" + "----德塔VPCS数据库服务器IP过滤服务启动:成功！" + text;
				text = "\r\n" + "...";
				jTextPane.setText(text);
			}
			DetaDBBufferCache_M.reflection();
			// 20230106-System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
			if (jTextPane != null) {
				String text = jTextPane.getText();
				text = "\r\n" + "----德塔VPCS数据库服务器启动整库过程映射服务:成功！" + text;
				text = "\r\n" + "...";
				jTextPane.setText(text);
			}
			DatabaseLog_H.I_BinLog_H();
			// 20230106-System.out.println("----德塔VPCS数据库服务器启动整库过程映射服务:成功！");
			if (jTextPane != null) {
				String text = jTextPane.getText();
				text = "\r\n" + "----德塔VPCS数据库服务器启动整库过程映射服务:成功！" + text;
				text = "\r\n" + "...";
				jTextPane.setText(text);
			}
			// BootBackup.bootBackupByUsingGzip(Cache_M
			// .getCacheInfo("LogPath").getValue().toString()+"/zipCover");
			// UnZip.unZipWithPath("C:/DetaLog/zipCover/zip_1549583065203.zip"
			// , "C:/DetaLog/zipCover/cover");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private void haoHiYooFaker(SleeperHall sleeper_H) {
		sleeper_H.callSkivvy();
	}

	@SuppressWarnings("unused")
	public void IV_Server(App app) throws InterruptedException, IOException {
		dbConfigPath = app.app_S.dbConfigPath;
		// 20230106-System.out.println("----DETA VPCS--2.0");
		// 20230106-System.out.println("----Author: 罗瑶光");
		// 20230106-System.out.println("----浏阳德塔软件开发有限公司开源项目");
		if (app.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = app.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "载入德塔 PLSQL数据库 映射添加完毕！" + text;
			text = "\r\n" + "----Author: 罗瑶光" + text;
			text = "\r\n" + "----浏阳德塔软件开发有限公司开源项目" + text;
			text = "\r\n" + "..." + text;
			app.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		Time_P time_P = new Time_P();
		time_P.begin();
		SleeperHall sleeper_H = new SleeperHall();
		IV_Service(app.app_S.appConfig.SectionJPanel.jTextPane,
				app.app_S.databasePortTxt);
		time_P.end();
		if (app.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = app.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----德塔VPCS数据库服务器启动一切正常-总耗时:" + time_P.duration()
					+ "毫秒" + text;
			text = "\r\n" + "..." + text;
			app.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		// 20230106-System.out.println("----德塔VPCS数据库服务器启动一切正常-总耗时:"
		// + time_P.duration()+ "毫秒");
		app.app_S.ready = true;

		App appReg = app;
		System.out.flush();
		System.out.println("----DETA HVPCS--1.9070");
		System.out.flush();
		System.out.println("----Author: 罗瑶光");
		System.out.flush();
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		TimeProcess timeProcess = new TimeProcess();
		timeProcess.begin();
		SleeperHall sleeperHall = new SleeperHall();

		port = 8000;
		System.out.flush();
		System.out.println("----德塔VPCS数据库服务器端口启动:" + port);
		// DetaUtil.initDB();
		System.out.flush();
		System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");
		System.out.println("----初始大文件:成功！");
		StableBlob.initBlobLimit();
		System.out.println("----初始固定数据:成功！");
		StableSets.intListPartBytes();
		System.out.println("----初始http数据:成功！");
		StableSets.initHttpContentTypeMap();

		timeProcess.end();
		System.out.flush();
		System.out.println(
				"----德塔VPCS前端服务器启动一切正常-总耗时:" + timeProcess.duration() + "毫秒");
		// ServerSocket server = new ServerSocket(port);
		long clearTime = System.currentTimeMillis();
		TimeHall timeHall = new TimeHall();
		timeHall.registerServer(server);
		timeHall.registerSleeperHall(sleeperHall);
		timeHall.start();

		Here: while (true) {// later do 6 dead id filter
			if (sleeper_H.getThreadsCount() > 2) {
				sleeper_H.callSkivvy();
				Thread.sleep(3000);
				continue Here;
			}
			if (0 >= timeHall.getMaxLimist()) {
				System.out.flush();
				System.out.println(sleeper_H.getThreadsCount());
				timeHall.resetLimists();// 20250523
				continue Here;
			}
			Sleeper_X sleeper = new Sleeper_X();
			if (!server.isClosed()) {
				sleeper.pillows.vPCSResponse.socket = server.accept();
			}
			if (!server.isClosed()
					&& null != sleeper.pillows.vPCSResponse.socket) {
				sleeper_H.addExecSleeper(sleeper.hashCode(), sleeper);
				sleeper.start();
			}
		}
	}
}

//	private App app;
//	static {
//		//properties= new Properties();
////		try {
////			properties.load(new FileInputStream
////					(new File("src/main/resources/property.proterties")));
////			//20230106-System.out.println("----德塔VPCS数据库服务器资源载入:成功！");
////		}catch (IOException e) {
////			e.printStackTrace();
////		}
//	}

//138
//while (true) {
//if (sleeper_H.getThreadsCount() < S_Web.SLEEPERS_RANGE) {
//  VPCSRequest vPCSRequest = new VPCSRequest();
//  VPCSResponse vPCSResponse = new VPCSResponse();
//  Sleeper_X sleeper = new Sleeper_X();
//  sleeper.goToBedroom(S_HTTP.PORT_DATABASE, vPCSRequest, vPCSResponse);
//  try {
//      sleeper.hugPillow(sleeper_H, server.accept(), sleeper.hashCode());
//      sleeper.sleeping();
//  } catch (IOException e) {
//      e.printStackTrace();
//  }
//} else {
//  haoHiYooFaker(sleeper_H);
//}
//}