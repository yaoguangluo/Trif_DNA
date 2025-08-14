package DetaSrc.org.deta.boot.vpc.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;

import DetaSrc.org.deta.boot.sets.StableBlob;
import DetaSrc.org.deta.boot.sets.StableSets;
import DetaSrc.org.deta.boot.vpc.process.TimeProcess;
import DetaSrc.org.deta.boot.vpc.sleeper.SleeperHall;
import DetaSrc.org.deta.boot.vpc.sleeper.Sleeper_X;
import DetaSrc.org.deta.boot.vpc.sleeper.TimeHall;
import src.java.org.lyg.common.utils.DetaUtil;
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段208号 阳光家园别墅小区 第十栋
 * */
public class ServerInitController {
	private static Properties properties;
	private static int port;
	static {
		properties= new Properties();
		System.out.flush();
		System.out.println("----德塔VPCS数据库服务器资源载入:成功！");

	}

	public static void init() throws IOException {
		port = 8000;
		System.out.flush();
		System.out.println("----德塔VPCS数据库服务器端口启动:" + port);
		DetaUtil.initDB();
		System.out.flush();
		System.out.println("----德塔VPCS数据库服务器DMA确认:成功！");	
		System.out.println("----初始大文件:成功！");	
		StableBlob.initBlobLimit();
		System.out.println("----初始固定数据:成功！");	
		StableSets.intListPartBytes();
		System.out.println("----初始http数据:成功！");	
		StableSets.initHttpContentTypeMap();
	}

	public static void initServer() throws IOException
	, InterruptedException {
		System.out.flush();
		System.out.println("----DETA HVPCS--1.9070");
		System.out.flush();
		System.out.println("----Author: 罗瑶光");
		System.out.flush();
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		TimeProcess timeProcess= new TimeProcess();
		timeProcess.begin();
		SleeperHall sleeperHall = new SleeperHall();
		init();
		timeProcess.end();
		System.out.flush();
		System.out.println("----德塔VPCS前端服务器启动一切正常-总耗时:"
				+ timeProcess.duration()+ "毫秒");
		ServerSocket server = new ServerSocket(port);
		long clearTime= System.currentTimeMillis();
		TimeHall timeHall=new TimeHall();
		timeHall.registerServer(server);
		timeHall.registerSleeperHall(sleeperHall);
		timeHall.start();
		runServer(server, sleeperHall, clearTime, timeHall);
	}

	public static void runServer(ServerSocket server, SleeperHall sleeperHall
			, long clearTime, TimeHall timeHall) throws InterruptedException
	, IOException {
		Here:
			while(true){// later do 6 dead id filter 
				if(sleeperHall.getThreadsCount() > 2) {
					sleeperHall.callSkivvy();
					Thread.sleep(3000);
					continue Here;
				}
				if(0 >= timeHall.getMaxLimist()) {
					System.out.flush();
					System.out.println(sleeperHall.getThreadsCount()); 
					timeHall.resetLimists();//20250523
					continue Here;
				}
				Sleeper_X sleeper= new Sleeper_X();
				if(!server.isClosed()) {
					sleeper.pillows.vPCSResponse.socket = server.accept();
				}
				if(!server.isClosed()&&null!= sleeper.pillows.vPCSResponse.socket) {
					sleeperHall.addExecSleeper(sleeper.hashCode(), sleeper);
					sleeper.start();
				} 
			}
	}
}