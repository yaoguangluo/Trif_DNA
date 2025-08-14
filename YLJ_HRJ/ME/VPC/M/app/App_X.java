package ME.VPC.M.app;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
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
import V_A.SQ.ReadPinYinBihua;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import P_V.PEQ.OPM.VEC.test.SuccessICATest;
import S_A.SVQ.stable.S_Colors;
import S_A.SVQ.stable.S_MapsInitons;
import S_A.SixActionMap.CreativeVerbaMap;
import S_A.SixActionMap.FlowerAction;
import S_A.SixActionMap.HelpVerbaMap;
import S_A.SixActionMap.StudyVerbaMap;
import S_A.SixActionMap.WorkVerbaMap;
import S_A.VSQ.parser.EmotionSample;
import S_A.linePage.PageQ;
import VSQ.parser.FMHMMListOneTime_E_X_S;
import jniLYGAFDCDFFT.LYGAFDCTDFFT;
import jniLYGAFDCDFFT.LYGAFDCTDFFT_F;
import jnisort.LYGSortESU9D;

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
public class App_X extends App {
    public void init(App NE) {
        //*/
        app_S.studyVerbaMap = new StudyVerbaMap();
        app_S.helpVerbaMap = new HelpVerbaMap();
        app_S.lYGAFDCTDFFT = new LYGAFDCTDFFT();
        app_S.lYGAFDCTDFFT.initk();
        app_S.lYGAFDCTDFFT_F = new LYGAFDCTDFFT_F();
        app_S.lYGAFDCTDFFT_F.initk();
        //*/
        FlowerAction.initFlowerSixDomainActions();
        FlowerAction.initFlowerP_E_KernelActions();
        //*/
        U_A.PEU.P.wave.Guassian.initKernel(5, 1.7);//later in golbal
        U_A.PEU.P.wave.Guassian_F.initKernel(5, 1.7);//later in golbal

        app_S.pageQ = new PageQ();
        app_S.pageQ.lYGAFDCTDFFT= app_S.lYGAFDCTDFFT;
        app_S.pageQ.lYGAFDCTDFFT_F= app_S.lYGAFDCTDFFT_F;
        app_S.studyVerbaMap.putObject("pageQ", app_S.pageQ);
        /*basic init*/
        S_MapsInitons.init();
        S_Colors.initFlowers3D();
        //initon plugin types without OSGI
        CreativeVerbaMap.initInitonActions();
        StudyVerbaMap.initInitonDelegate();
        /*sort init*/
        app_S.quick6DLuoYaoguangSort3DMap_E = new Quick6DLuoYaoguangSort3DMap_E();
        app_S.studyVerbaMap.putObject("quick6DLuoYaoguangSort3DMap_E"
            , app_S.quick6DLuoYaoguangSort3DMap_E);

        app_S.lYGSortESU9D = new LYGSortESU9D();
        app_S.studyVerbaMap.putObject("lYGSortESU9D", app_S.lYGSortESU9D);
        //literature init*/
        ReadPinYinBihua.getPinYinBihuaMap(NE);
        app_S.lenovoInit = new LenovoInit();
        app_S.studyVerbaMap.putObject("lenovoInit", app_S.lenovoInit);
        app_S.environmentInit = new EnvironmentInit();
        app_S.studyVerbaMap.putObject("environmentInit", app_S.environmentInit);
        app_S.emotionInit = new EmotionInit();
        app_S.studyVerbaMap.putObject("emotionInit", app_S.emotionInit);
        app_S.ratioMap_E = new RatioMap_E();//350m 70m*/
        app_S.studyVerbaMap.putObject("ratioMap_E", app_S.ratioMap_E);
        app_S.ratioMap = app_S.ratioMap_E;
        app_S.studyVerbaMap.putObject("ratioMap", app_S.ratioMap);

        app_S.emotionSample = new EmotionSample();//later..*/
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
        //cnn*/
        app_S.dNNTest = new DNNTest();
        app_S.studyVerbaMap.putObject("dNNTest", app_S.dNNTest);
        app_S.aNNTest = new ANNTest();
        app_S.studyVerbaMap.putObject("aNNTest", app_S.aNNTest);
        app_S.rNN_IDETest = new RNN_IDETest();
        app_S.studyVerbaMap.putObject("rNN_IDETest", app_S.rNN_IDETest);
        //6 actions map*/
        app_S.workVerbaMap = new WorkVerbaMap();
        app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
        app_S.workVerbaMap.initActionMap();
        app_S.studyVerbaMap.putObject("workVerbaMap", app_S.workVerbaMap);
        //bloosm init*/
        app_S.app_XCDX = new App_XCDX();
        app_S.studyVerbaMap.putObject("app_XCDX", app_S.app_XCDX);
        app_S.app_XCDX.IV_(this);
        app_S.studyVerbaMap.putObject("app_XCDX", app_S.app_XCDX);
        //POS init*/
        app_S.nERO_C_OneTime_E = new NERO_C_OneTime_E();
        app_S.studyVerbaMap.putObject("nERO_C_OneTime_E", app_S.nERO_C_OneTime_E);
        app_S.fMHMMListOneTime_E = new FMHMMListOneTime_E();
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E", app_S.fMHMMListOneTime_E);
        app_S._A = new CogsBinaryForest_AE();//300mb*/
        app_S._A.IV_Mixed(NE);//1.5gm*/
        app_S.studyVerbaMap.putObject("_A", app_S._A);
        //700mb*/
        app_S.fMHMMListOneTime_E_X_S = (FMHMMListOneTime_E_X_S) app_S._A.fHMMList;
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E_X_S"
            , app_S.fMHMMListOneTime_E_X_S);
        app_S._A.forestRoots = app_S._A.fHMMList.getMap();
        app_S.studyVerbaMap.putObject("_A.forestRoots ", app_S._A.forestRoots);
        app_S.pos_X_P = new Pos_X_P();
        app_S.studyVerbaMap.putObject("pos_X_P", app_S.pos_X_P);
        app_S.nlp_CE_X_S = new Nlp_CE_X_S();
        app_S.studyVerbaMap.putObject("nlp_CE_X_S", app_S.nlp_CE_X_S);
        //register*/
        app_S.pos_X_P.wordsForest = this.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("pos_X_P.wordsForest", app_S.pos_X_P.wordsForest);
        app_S.nlp_CE_X_S.wordsForest = this.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("nlp_CE_X_S.wordsForest"
            , app_S.nlp_CE_X_S.wordsForest);
        app_S._A.wordsForest = this.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        app_S.studyVerbaMap.putObject("_A.wordsForest", app_S._A.wordsForest);
        //
        app_S._A.nlp_C = app_S.nlp_CE_X_S;//later..*/
        app_S.studyVerbaMap.putObject("_A.nlp_C", app_S._A.nlp_C);
        app_S._A.nlp_C.pos_X_P = app_S.pos_X_P;//注意不要出现嵌套计算环境。*/
        app_S.studyVerbaMap.putObject("_A.nlp_C.pos_X_P", app_S._A.nlp_C.pos_X_P);
        app_S._A.pos_C = app_S.pos_X_P;
        app_S.studyVerbaMap.putObject("_A.pos_C", app_S._A.pos_C);
        //pheromone intu*/
        _I_U = this.app_S;//later in format.*/
        app_S.studyVerbaMap.putObject("_I_U", _I_U);
        //init 6 base initons
        app_S.studyVerbaMap = new StudyVerbaMap();
        app_S.studyVerbaMap.putObject("studyVerbaMap", app_S.studyVerbaMap);
        //GUI*/
        app_S.app_X_getBox = new App_X_getBox();
        app_S.studyVerbaMap.putObject("app_X_getBox", app_S.app_X_getBox);
        app_S.app_X_getBox.IV_(this);
        app_S.studyVerbaMap.putObject("app_X_getBox", app_S.app_X_getBox);
        //start*/
        app_S.appInit = new AppInit_XCDX();
        app_S.studyVerbaMap.putObject("appInit", app_S.appInit);
        app_S.appInit.IV_(this, NE);
        app_S.studyVerbaMap.putObject("appInit", app_S.appInit);
    }
}
/*
p1 p2 p3 p3p p4 p5
i31 i31p - i1 - 3p
i32 i32p - i2 - 3p
i33 i33p - i3 - 3p
 */