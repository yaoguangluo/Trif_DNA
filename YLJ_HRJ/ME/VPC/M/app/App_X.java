package ME.VPC.M.app;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;

import java.io.IOException;

import A_V.E.RatioMap_E;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.X.AppInit_XCDX;
import ME.VPC.M.X.App_XCDX;
import ME.VPC.M.X.App_X_getBox;
import O_V.OSM.shell.CommandClass;
import V_A.SQ.ReadPinYinBihua;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import P_V.PEQ.OPM.VEC.test.SuccessICATest;
import S_A.SVQ.stable.S_Colors;
import S_A.SixActionMap.CreativeVerbalMap;
import S_A.SixActionMap.HelpVerbalMap;
import S_A.SixActionMap.StudyVerbalMap;
import S_A.SixActionMap.WorkVerbalMap;
import S_A.VSQ.parser.EmotionSample;
import S_A.linePage.PageQ;
import VSQ.parser.FMHMMListOneTime_E_X_S;
import jniLYGAFDCDFFT.LYGAFDCTDFFT;
import jniLYGAFDCDFFT.LYGAFDCTDFFT_F;
import jnisort.LYGSortESU9D;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
@SuppressWarnings("serial")
public class App_X extends App {
	@SuppressWarnings("unchecked")
	public void init(App NE) throws IOException, InterruptedException {
		// */
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000006");
		NE.app_S.studyVerbalMap = new StudyVerbalMap();
		//新增
		NE.app_S.studyVerbalMap.initChineseNumberSets();
		NE.app_S.helpVerbalMap = new HelpVerbalMap();
		NE.app_S.lYGAFDCTDFFT = new LYGAFDCTDFFT();
		NE.app_S.lYGAFDCTDFFT.initk();
		NE.app_S.lYGAFDCTDFFT_F = new LYGAFDCTDFFT_F();
		NE.app_S.lYGAFDCTDFFT_F.initk();
		// */
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000007");
		NE.app_S.flowerAction.initFlowerSixDomainActions();
		NE.app_S.flowerAction.initFlowerP_E_KernelActions();
		// */
		U_A.PEU.P.wave.Guassian.initKernel(5, 1.7);// later in golbal
		U_A.PEU.P.wave.Guassian_F.initKernel(5, 1.7);// later in golbal
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000008");
		NE.app_S.pageQ = new PageQ();
		NE.app_S.pageQ.lYGAFDCTDFFT = NE.app_S.lYGAFDCTDFFT;
		NE.app_S.pageQ.lYGAFDCTDFFT_F = NE.app_S.lYGAFDCTDFFT_F;
		NE.app_S.studyVerbalMap.putObject("pageQ", NE.app_S.pageQ);
		/* basic init */
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000009");
		NE.app_S._S_MapsInitons.init();
		S_Colors.initFlowers3D();
		// initon plugin types without OSGI
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000010");
		CreativeVerbalMap.initInitonActions(NE);
		//--later
		NE.app_S.studyVerbalMap.initInitonDelegate();
		/* sort init */
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000011");
		NE.app_S.quick6DLuoYaoguangSort3DMap_E = new Quick6DLuoYaoguangSort3DMap_E();
		NE.app_S.studyVerbalMap.putObject("quick6DLuoYaoguangSort3DMap_E",
			NE.app_S.quick6DLuoYaoguangSort3DMap_E);
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000012");
		NE.app_S.lYGSortESU9D = new LYGSortESU9D();
		NE.app_S.studyVerbalMap.putObject("lYGSortESU9D", NE.app_S.lYGSortESU9D);
		// literature init*/
		ReadPinYinBihua.getPinYinBihuaMap(NE);
		NE.app_S.lenovoInit = new LenovoInit();
		NE.app_S.studyVerbalMap.putObject("lenovoInit", NE.app_S.lenovoInit);
		NE.app_S.environmentInit = new EnvironmentInit();
		NE.app_S.studyVerbalMap.putObject("environmentInit", NE.app_S.environmentInit);
		NE.app_S.emotionInit = new EmotionInit();
		NE.app_S.studyVerbalMap.putObject("emotionInit", NE.app_S.emotionInit);
		NE.app_S.ratioMap_E = new RatioMap_E();// 350m 70m*/
		NE.app_S.studyVerbalMap.putObject("ratioMap_E", NE.app_S.ratioMap_E);
		NE.app_S.ratioMap = NE.app_S.ratioMap_E;
		NE.app_S.studyVerbalMap.putObject("ratioMap", NE.app_S.ratioMap);
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000013");
		NE.app_S.emotionSample = new EmotionSample();// later..*/
		NE.app_S.studyVerbalMap.putObject("emotionSample", NE.app_S.emotionSample);
		NE.app_S.sensingTest = new SensingTest();
		NE.app_S.studyVerbalMap.putObject("sensingTest", NE.app_S.sensingTest);
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000014");
		NE.app_S.successICATest = new SuccessICATest();
		NE.app_S.studyVerbalMap.putObject("successICATest", NE.app_S.successICATest);
		NE.app_S.sensingMap_E = new SensingMap_E();
		NE.app_S.studyVerbalMap.putObject("sensingMap_E", NE.app_S.sensingMap_E);
		NE.app_S.emotionMap_E = new EmotionMap_E();
		NE.app_S.studyVerbalMap.putObject("emotionMap_E", NE.app_S.emotionMap_E);
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000015");
		NE.app_S.emotionMap_E.IV_MotivationMap(NE);
		NE.app_S.studyVerbalMap.putObject("emotionMap_E", NE.app_S.emotionMap_E);
		NE.app_S.emotionMap_E.IV_TrendingMap(NE);
		NE.app_S.studyVerbalMap.putObject("emotionMap_E", NE.app_S.emotionMap_E);
		NE.app_S.emotionMap_E.IV_PredictionMap(NE);
		NE.app_S.studyVerbalMap.putObject("emotionMap_E", NE.app_S.emotionMap_E);
		NE.app_S.emotionMap_E.IV_DistinctionMap(NE);
		NE.app_S.studyVerbalMap.putObject("emotionMap_E", NE.app_S.emotionMap_E);
		NE.app_S.emotionMap_E.IV_NegativeMap(NE);
		NE.app_S.studyVerbalMap.putObject("emotionMap_E", NE.app_S.emotionMap_E);
		NE.app_S.emotionMap_E.IV_PositiveMap(NE);
		NE.app_S.studyVerbalMap.putObject("emotionMap_E", NE.app_S.emotionMap_E);
		// cnn*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000016");
		NE.app_S.dNNTest = new DNNTest();
		NE.app_S.studyVerbalMap.putObject("dNNTest", NE.app_S.dNNTest);
		NE.app_S.aNNTest = new ANNTest();
		NE.app_S.studyVerbalMap.putObject("aNNTest", NE.app_S.aNNTest);
		NE.app_S.rNN_IDETest = new RNN_IDETest();
		NE.app_S.studyVerbalMap.putObject("rNN_IDETest", NE.app_S.rNN_IDETest);
		// 6 actions map*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000017");
		NE.app_S.workVerbalMap = new WorkVerbalMap();
		NE.app_S.studyVerbalMap.putObject("workVerbalMap", NE.app_S.workVerbalMap);
		CommandClass command_V = new CommandClass();
		NE.app_S.workVerbalMap.initActionMap(command_V);
		NE.app_S.studyVerbalMap.putObject("workVerbalMap", NE.app_S.workVerbalMap);
		// bloosm init*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000018");
		NE.app_S.app_XCDX = new App_XCDX();
		NE.app_S.studyVerbalMap.putObject("app_XCDX", NE.app_S.app_XCDX);
		NE.app_S.app_XCDX.IV_(this);
		NE.app_S.studyVerbalMap.putObject("app_XCDX", NE.app_S.app_XCDX);
		// POS init*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000019");
		NE.app_S.nERO_C_OneTime_E = new NERO_C_OneTime_E();
		NE.app_S.studyVerbalMap.putObject("nERO_C_OneTime_E",
			NE.app_S.nERO_C_OneTime_E);
		NE.app_S.fMHMMListOneTime_E = new FMHMMListOneTime_E();
		NE.app_S.studyVerbalMap.putObject("fMHMMListOneTime_E",
			NE.app_S.fMHMMListOneTime_E);
		NE.app_S._A = new CogsBinaryForest_AE();// 300mb*/
		NE.app_S._A.IV_Mixed(NE);// 1.5gm*/
		NE.app_S.studyVerbalMap.putObject("_A", NE.app_S._A);
		// 700mb*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000020");
		NE.app_S.fMHMMListOneTime_E_X_S = (FMHMMListOneTime_E_X_S) NE.app_S._A.fHMMList;
		NE.app_S.studyVerbalMap.putObject("fMHMMListOneTime_E_X_S",
			NE.app_S.fMHMMListOneTime_E_X_S);
		NE.app_S._A.forestRoots = NE.app_S._A.fHMMList.getMap();
		NE.app_S.studyVerbalMap.putObject("_A.forestRoots ", NE.app_S._A.forestRoots);
		NE.app_S.pos_X_P = new Pos_X_P();
		NE.app_S.studyVerbalMap.putObject("pos_X_P", NE.app_S.pos_X_P);
		NE.app_S.nlp_CE_X_S = new Nlp_CE_X_S();
		NE.app_S.studyVerbalMap.putObject("nlp_CE_X_S", NE.app_S.nlp_CE_X_S);
		// register*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000021");
		NE.app_S.pos_X_P.wordsForest = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		NE.app_S.studyVerbalMap.putObject("pos_X_P.wordsForest",
			NE.app_S.pos_X_P.wordsForest);
		NE.app_S.nlp_CE_X_S.wordsForest = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		NE.app_S.studyVerbalMap.putObject("nlp_CE_X_S.wordsForest",
			NE.app_S.nlp_CE_X_S.wordsForest);
		NE.app_S._A.wordsForest = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		NE.app_S.studyVerbalMap.putObject("_A.wordsForest", NE.app_S._A.wordsForest);
		//
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000022");
		NE.app_S._A.nlp_C = NE.app_S.nlp_CE_X_S;// later..*/
		NE.app_S.studyVerbalMap.putObject("_A.nlp_C", NE.app_S._A.nlp_C);
		NE.app_S._A.nlp_C.pos_X_P = NE.app_S.pos_X_P;// 注意不要出现嵌套计算环境。*/
		NE.app_S.studyVerbalMap.putObject("_A.nlp_C.pos_X_P",
			NE.app_S._A.nlp_C.pos_X_P);
		NE.app_S._A.pos_C = NE.app_S.pos_X_P;
		NE.app_S.studyVerbalMap.putObject("_A.pos_C", NE.app_S._A.pos_C);
		// pheromone intu*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000023");
		NE._I_U = NE.app_S;// later in format.*/
		NE.app_S._AE = NE.app_S._A;
		NE.app_S.studyVerbalMap.putObject("_I_U", _I_U);
		// init 6 base initons
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000024");
		//函数中的注释行涉及重要信息的进行描述 + 时间标识，避免疏忽和莫名slash被去掉--20251012。
		//NE.app_S.studyVerbalMap = new StudyVerbalMap();
		NE.app_S.studyVerbalMap.putObject("studyVerbalMap", NE.app_S.studyVerbalMap);
		// GUI*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000025");
		NE.app_S.app_X_getBox = new App_X_getBox();
		NE.app_S.studyVerbalMap.putObject("app_X_getBox", NE.app_S.app_X_getBox);
		NE.app_S.app_X_getBox.IV_(this);
		NE.app_S.studyVerbalMap.putObject("app_X_getBox", NE.app_S.app_X_getBox);
		// start*/
		S_logger.Log.logger.info("" + "启动400编码调试开始-00000026");
		NE.app_S.appInit = new AppInit_XCDX();
		NE.app_S.studyVerbalMap.putObject("appInit", NE.app_S.appInit);
		NE.app_S.appInit.IV_(this);
		NE.app_S.studyVerbalMap.putObject("appInit", NE.app_S.appInit);
	}
}
/*
 * p1 p2 p3 p3p p4 p5 i31 i31p - i1 - 3p i32 i32p - i2 - 3p
 * i33 i33p - i3 - 3p
 */