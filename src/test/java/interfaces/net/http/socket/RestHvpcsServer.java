package test.java.interfaces.net.http.socket;

import java.io.IOException;

import C_A.OSI.AOP.MS.VPC.server.ServerInit_C;
import I_Q.hvpcs.boot.vpc.controller.ServerInitController;
import ME.VPC.M.app.App;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class RestHvpcsServer extends Thread implements Runnable {
	private App app;
	public boolean ready = false;

	public RestHvpcsServer(App app) {
		// balabala here;
		this.app = app;
	}

	public void run() {
		try {
			ServerInitController serverInitController= new ServerInitController();
			serverInitController.initServer(app);
			S_logger.Log.logger.info("--boot");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			FileUploaderSimpleDNA.newADNAMap(this.app);
//			ServerInitController serverInitController = new ServerInitController();
//			serverInitController.initServer(this.app);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
