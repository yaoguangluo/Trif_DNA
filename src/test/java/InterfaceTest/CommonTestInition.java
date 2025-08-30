package test.java.InterfaceTest;

import A_V.E.RatioMap_E;
import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
import E.Nlp_CE_X_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import P.Pos_X_P;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import P_V.PEQ.OPM.VEC.test.SuccessICATest;
import S_A.SVQ.stable.S_Colors;
import S_A.SVQ.stable.S_MapsInitons;
import S_A.SixActionMap.StudyVerbaMap;
import S_A.SixActionMap.WorkVerbaMap;
import S_A.VSQ.parser.EmotionSample;
import S_A.linePage.PageQ;
import VSQ.parser.FMHMMListOneTime_E_X_S;
import V_A.SQ.ReadPinYinBihua;
import jnisort.LYGSortESU9D;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 这是一个 功能测试的环境函数提出项，用于测试源码去重。 测试main函数demo的test版本。
 * --罗瑶光
 * */
@SuppressWarnings({ "unchecked" })
public class CommonTestInition {
	public App NE;

	public App_S initBasic(String stringConfigUI) {
		System.out.println("*环境初始化*");
		NE = new App();
		NE.tempString = stringConfigUI.toString();// 注意哦，这行别乱用
		NE.app_S = new App_S();
		App_S app_S = NE.app_S;
		app_S.studyVerbaMap = new StudyVerbaMap();
		return app_S;
	}

	public void initConvolution(App_S app_S) {
		System.out.println("*卷积环境 init*");
		U_A.PEU.P.wave.Guassian.initKernel(5, 1.7);// later in golbal
		app_S.pageQ = new PageQ();
		app_S.studyVerbaMap.putObject("pageQ", app_S.pageQ);
	}

	public void initPDE(App_S app_S) {
		System.out.println("*PDE环境 init*");
		S_MapsInitons.init();
		S_Colors.initFlowers3D();
	}

	public void initSort(App_S app_S) {
		System.out.println("*排序环境 init*");
		app_S.quick6DLuoYaoguangSort3DMap_E = new Quick6DLuoYaoguangSort3DMap_E();
		app_S.studyVerbaMap.putObject("quick6DLuoYaoguangSort3DMap_E",
				app_S.quick6DLuoYaoguangSort3DMap_E);
		app_S.lYGSortESU9D = new LYGSortESU9D();
		app_S.studyVerbaMap.putObject("lYGSortESU9D", app_S.lYGSortESU9D);
	}

	public void initOrtho(App_S app_S) {
		System.out.println("*语料库表环境 init*");
		ReadPinYinBihua.getPinYinBihuaMap(NE);
		app_S.lenovoInit = new LenovoInit();
		app_S.studyVerbaMap.putObject("lenovoInit", app_S.lenovoInit);
		app_S.environmentInit = new EnvironmentInit();
		app_S.studyVerbaMap.putObject("environmentInit", app_S.environmentInit);
		app_S.emotionInit = new EmotionInit();
		app_S.studyVerbaMap.putObject("emotionInit", app_S.emotionInit);
		app_S.ratioMap_E = new RatioMap_E();// 350m 70m*/
		app_S.studyVerbaMap.putObject("ratioMap_E", app_S.ratioMap_E);
		app_S.ratioMap = app_S.ratioMap_E;
		app_S.studyVerbaMap.putObject("ratioMap", app_S.ratioMap);
		app_S.emotionSample = new EmotionSample();// later..*/
		app_S.studyVerbaMap.putObject("emotionSample", app_S.emotionSample);
		app_S.sensingTest = new SensingTest();
		app_S.studyVerbaMap.putObject("sensingTest", app_S.sensingTest);
		app_S.successICATest = new SuccessICATest();
		app_S.studyVerbaMap.putObject("successICATest", app_S.successICATest);
		app_S.sensingMap_E = new SensingMap_E();
		app_S.studyVerbaMap.putObject("sensingMap_E", app_S.sensingMap_E);
		app_S.emotionMap_E = new EmotionMap_E();
		app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
		app_S.emotionMap_E.IV_MotivationMap(NE);
		app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
		app_S.emotionMap_E.IV_TrendingMap(NE);
		app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
		app_S.emotionMap_E.IV_PredictionMap(NE);
		app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
		app_S.emotionMap_E.IV_DistinctionMap(NE);
		app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
		app_S.emotionMap_E.IV_NegativeMap(NE);
		app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
		app_S.emotionMap_E.IV_PositiveMap(NE);
		app_S.studyVerbaMap.putObject("emotionMap_E", app_S.emotionMap_E);
	}

	public void initCNN(App_S app_S) {
		System.out.println("*CNN type init*");
		System.out.println("*ANN RNN DNN init*");
		app_S.dNNTest = new DNNTest();
		app_S.studyVerbaMap.putObject("dNNTest", app_S.dNNTest);
		app_S.aNNTest = new ANNTest();
		app_S.studyVerbaMap.putObject("aNNTest", app_S.aNNTest);
		app_S.rNN_IDETest = new RNN_IDETest();
		app_S.studyVerbaMap.putObject("rNN_IDETest", app_S.rNN_IDETest);
	}

	public void initCatalytic(App_S app_S) {
		System.out.println("*六元催化 map*");
		app_S.workVerbaMap = new WorkVerbaMap();
		app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
		app_S.workVerbaMap.initActionMap();
		app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
	}

	public void initPOS(App_S app_S) {
		System.out.println("*词性环境 init*");
		app_S.nERO_C_OneTime_E = new NERO_C_OneTime_E();
		app_S.studyVerbaMap.putObject("nERO_C_OneTime_E",
				app_S.nERO_C_OneTime_E);
		app_S.fMHMMListOneTime_E = new FMHMMListOneTime_E();
		app_S.studyVerbaMap.putObject("fMHMMListOneTime_E",
				app_S.fMHMMListOneTime_E);
	}

	public void initParser(App_S app_S) {
		System.out.println("*分词引擎 init*");
		app_S._A = new CogsBinaryForest_AE();
		app_S._A.fHMMList = app_S.fMHMMListOneTime_E;
		app_S._A.pos_C = app_S.pos_X_P;
		app_S._A.nlp_C = app_S.nlp_CE_X_S;
		app_S._A.nero_C = app_S.nERO_C_OneTime_E;
		app_S._A.emotionMap = app_S.emotionMap_E;
		app_S._A.sensingTest = app_S.sensingTest;
		app_S._A.quick6DLuoYaoguangSort = app_S.quick6DLuoYaoguangSort3DMap_E;
	}

	public void initSegment(App_S app_S) {
		System.out.println("*自然语言环境 init*");
		app_S._A.IV_Mixed(NE);
		app_S.fMHMMListOneTime_E_X_S = (FMHMMListOneTime_E_X_S) app_S._A.fHMMList;
		app_S.studyVerbaMap.putObject("fMHMMListOneTime_E_X_S",
				app_S.fMHMMListOneTime_E_X_S);
		app_S._A.forestRoots = app_S._A.fHMMList.getMap();
		app_S.studyVerbaMap.putObject("_A.forestRoots ", app_S._A.forestRoots);
		app_S.pos_X_P = new Pos_X_P();
		app_S.studyVerbaMap.putObject("pos_X_P", app_S.pos_X_P);
		app_S.nlp_CE_X_S = new Nlp_CE_X_S();
		app_S.studyVerbaMap.putObject("nlp_CE_X_S", app_S.nlp_CE_X_S);
	}

	public void initInitonRoots(App_S app_S) {
		System.out.println("*其他枝叶 register*");
		app_S.pos_X_P.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		app_S.studyVerbaMap.putObject("pos_X_P.wordsForest",
				app_S.pos_X_P.wordsForest);
		app_S.nlp_CE_X_S.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		app_S.studyVerbaMap.putObject("nlp_CE_X_S.wordsForest",
				app_S.nlp_CE_X_S.wordsForest);
		app_S._A.wordsForest = app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		app_S.studyVerbaMap.putObject("_A.wordsForest", app_S._A.wordsForest);
		app_S._A.nlp_C = app_S.nlp_CE_X_S;// later..*/
		app_S.studyVerbaMap.putObject("_A.nlp_C", app_S._A.nlp_C);
		app_S._A.nlp_C.pos_X_P = app_S.pos_X_P;// 注意不要出现嵌套计算环境。*/
		app_S.studyVerbaMap.putObject("_A.nlp_C.pos_X_P",
				app_S._A.nlp_C.pos_X_P);
		app_S._A.pos_C = app_S.pos_X_P;
		app_S.studyVerbaMap.putObject("_A.pos_C", app_S._A.pos_C);
		NE._I_U = app_S;
		app_S._AE = app_S._A;// 注意接口注册关系
	}

	public void initEnvironment(String stringConfigUI) {
		if (null != NE) {
			return;
		}
		// 环境初始化。
		App_S app_S = initBasic(stringConfigUI);
		// */
		initConvolution(app_S);
		/* basic init */
		initPDE(app_S);
		/* sort init */
		initSort(app_S);
		// literature init*/
		initOrtho(app_S);
		// cnn*/
		initCNN(app_S);
		// 6 actions map*/
		initCatalytic(app_S);
		// bloosm init*/
		System.out.println("*花孢环境 init*");
		System.out.println("*略先 init*");
		// POS init*/
		initPOS(app_S);
		// 分词引擎初始化
		initParser(app_S);
		// 分词初始化
		initSegment(app_S);
		// 枝叶 register*/
		initInitonRoots(app_S);
	}

	public void endEnvironment() {
		if (null == NE) {
			return;
		}
		NE.stop();
	}
}