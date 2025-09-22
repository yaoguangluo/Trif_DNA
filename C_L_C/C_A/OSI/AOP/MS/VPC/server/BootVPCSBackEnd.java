package C_A.OSI.AOP.MS.VPC.server;

import ME.VPC.S.ne.App_S;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.E.RatioMap_E;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import exception.thread.DetaThread;
import P_V.PCS.thread.SocketThread;
import P_V.PCS.thread.SocketThreadPool;
import P_V.PEQ.AMV.ECS.test.SensingTest;

import java.net.ServerSocket;
import java.util.Properties;
import java.util.Random;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("unused")
public class BootVPCSBackEnd extends Thread {
	private ServerSocket server;
	private Properties properties;
	private CogsBinaryForest_AE _A;
	private EmotionMap emotionMap;// later remove
	private RatioMap_E ratioMap_E;
	private EnvironmentInit environmentInit;
	public App_S app;

	public BootVPCSBackEnd(App_S app, App NE) {
		properties = new Properties();
		this.app = app;
		System.out.println("启动400编码调试开始-00000052");
		if (null == app._A) {
			this._A = new CogsBinaryForest_AE();
			this._A.IV_Mixed(NE);
		} else {
			this._A = app._A;
		}
		System.out.println("启动400编码调试开始-00000052-01");
	}

	public BootVPCSBackEnd() {
	}

	public void IV_(App NE) {// 代入逻辑必定都是E实体。不确定的具体引用加Q
		try {
			System.out.println("启动400编码调试开始-00000052-02");
			// port= Integer.parseInt(properties.getProperty("port"));
			int port = Integer.parseInt(app.backendTxt);
			System.out.println("启动400编码调试开始-00000053-" + port);
			// port= Config.detaVPCSBackEndPort;
			server = new ServerSocket(port);
			if (null == this._A) {
				this._A = new CogsBinaryForest_AE();
				this._A.IV_Mixed(NE);
			}
			emotionMap = NE.app_S.emotionMap_E;
			ratioMap_E = NE.app_S.ratioMap_E;// later。。局部对象需要单例，不能apps取。
			environmentInit = NE.app_S.environmentInit;// later。。局部对象需要单例，不能apps取。
			// 20230106-System.out.println();
			// 20230106-System.out.println("----德塔VPCS后端服务器端口启动:" +
			// port);
			// MrTin.born.start();
			// 20230106-System.out.println("----Tin神 VPCS-AOPM-IDUQ
			// 第一代类人催化生命特征开启:" + port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public void bootBackEnd(SocketThreadPool socketThreadPool, App NE) {
		// SocketThreadPool socketThreadPool = new
		// SocketThreadPool();
		long before = System.currentTimeMillis();
		System.out.println("启动400编码调试开始-00000052-01-02");
		IV_(NE);
		System.out.println("启动400编码调试开始-00000052-01-03");
		I_RestService();
		System.out.println("启动400编码调试开始-00000052-01-04");
		long now = System.currentTimeMillis();
		System.out.println("----DETA VPCS BackEnd--2.0");
		System.out.println("----Author: 罗瑶光");
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		System.out.println("----德塔VPCS后端服务器----");
		System.out
				.println("----德塔VPCS后端服务器启动一切正常-总耗时:" + (now - before) + "毫秒");
		System.out.println("启动400编码调试开始-00000052-01-04-01");
		while (true) {
			try {
				if (socketThreadPool.getThreadsCount() < 300) {
					System.out.println("启动400编码调试开始-00000052-01-04-02");
					SocketThread clientSocket = new SocketThread(
							socketThreadPool, server.accept(),
							System.currentTimeMillis() + ""
									+ new Random().nextLong(),
							NE);
					System.out.println("启动400编码调试开始-00000052-01-04-03");
					socketThreadPool.I_E_Socket(clientSocket.getSid(),
							clientSocket);
					clientSocket.start();
					System.out.println("启动400编码调试开始-00000052-01-04-04");
					DetaThread.sleepDeta(30);// lag limited
				}
			} catch (Exception e) {
				break;
			}
		}
	}

	public static void main(String[] args, EnvironmentInit environmentInit,
			EmotionMap_E emotionMap_E, RatioMap_E ratioMap_QE,
			EnvironmentInit environmentInit_QE,
			SocketThreadPool socketThreadPool,
			NERO_C_OneTime_E nERO_C_OneTime_E, Nlp_CE_X_S nlp_CE_X_S,
			Pos_X_P pos_X_P, SensingTest sensingTest,
			FMHMMListOneTime_E fMHMMListOneTime_E,
			Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E,
			App NE) {
		new BootVPCSBackEnd().bootBackEnd(socketThreadPool, NE);
	}

	public void run(SocketThreadPool socketThreadPool, App NE) {
		System.out.println("启动400编码调试开始-00000052-01-01");
		bootBackEnd(socketThreadPool, NE);
	}

	private void I_RestService() {
	}
}
//55
// 因为首页已经init了, 我之后会改成_A带入就是了. 罗瑶光20210420
//        EmotionMap_E emotionMap_E, RatioMap_E ratioMap_QE
//            , EnvironmentInit environmentInit_QE, NERO_C_OneTime_E nERO_C_OneTime_E
//            , Nlp_CE_X_S nlp_CE_X_S, Pos_X_P pos_X_P, SensingTest sensingTest
//            , FMHMMListOneTime_E fMHMMListOneTime_E
//            , Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E

//                    emotionMap_E, nERO_C_OneTime_E, nlp_CE_X_S, pos_X_P
//                        , sensingTest, fMHMMListOneTime_E
//                        , quick6DLuoYaoguangSort3DMap_E
//78
//            emotionMap.IV_NegativeMap();
//            emotionMap.IV_PositiveMap();
//            emotionMap.IV_MotivationMap();
//            emotionMap.IV_TrendingMap();
//            emotionMap.IV_PredictionMap();
//            emotionMap.IV_DistinctionMap();
