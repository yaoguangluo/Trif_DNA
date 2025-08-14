package S_A.SEM.bloom;

import A_V.IVDTIXQCTIV.EmotionInit;
import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
import A_V.E.RatioMap_E;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.SVQ.stable.S_Common;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_S_;
import S_A.pheromone.IMV_SIQ_X_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//用来索引函数 注册类
//罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticFunctionMapA_VECS_E implements StaticFunctionMapA_VECS_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    @Override
    public List<String> parserMixedStringToList(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
        SensingTest sensingTest = NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
        _A.IV_Mixed(NE);
        List<String> sets = new ArrayList<>();
        sets = _A.parserMixedString(inputString._S_);
        //罗瑶光
        return sets;
    }

    @Override
    public List<String> posReader(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
        SensingTest sensingTest = NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
        _A.IV_Mixed(NE);
        IMV_SIQ pos = _A.getPosCnToCn();
        List<String> sets = new ArrayList<>();
        sets = _A.parserMixedString(inputString._S_);
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (!string.replaceAll("\\s+", "").equals("")) {
                list.add(string + "/" + pos.get(string));
            } else {
                list.add(string + "/" + "未知");
            }
        }
        return list;
    }

    @Override
    public List<String> dnnReader(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        //dnn不属于这个元基组, 稍后并出去。
        return null;
    }

    @Override
    public List<String> mindReader(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        return null;
    }

    //先把main test 加进来, 稍后整改 输出。
    @Override
    public List<String> emotionReader(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        EmotionInit emotionInit = new EmotionInit();
        emotionInit.IV_(inputString._S_, NE);
        return null;
    }

    @Override
    public List<String> educationReader(App NE) {
        return null;
    }

    @Override
    public IMV_SIQ_X_ environmentReader(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        EnvironmentInit environmentInit = NE._I_U.environmentInit;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        //EnvironmentInit environmentInit= new EnvironmentInit();
        environmentInit.IV_(inputString._S_, NE);
        IMV_SIQ_X_ environmentSampleMap = environmentInit.getEmotionSampleMap();
        return environmentSampleMap;
    }

    // 词库计算在C aopm 中, 稍后并出去。
    @Override
    public IMV_SIQ lenovoReader(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        RatioMap_E ratioMap_E = NE._I_U.ratioMap_E;
        EnvironmentInit environmentInit = NE._I_U.environmentInit;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        EmotionSample emotionSample = NE._I_U.emotionSample;
        SensingMap_E sensingMap_E = NE._I_U.sensingMap_E;
        LenovoInit lenovoInit = NE._I_U.lenovoInit;//later..
        //LenovoInit lenovoInit= new LenovoInit();
        lenovoInit.IV_(inputString._S_, NE);
        //Map<String, EmotionSample> environmentSampleMap
        // = lenovoInit.getEnvironmentInit().getEmotionSampleMap();
        IMV_SIQ lenovo = lenovoInit.getSensingMap().getLenovoMap();
        return lenovo;
    }

    @Override
    public List<String> frequencyReader(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
        SensingTest sensingTest = NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        CogsBinaryForest_AE _A = new CogsBinaryForest_AE();//shaohou qu mixed iv
        _A.IV_Mixed(NE);
        List<String> sets = new ArrayList<>();
        sets = _A.parserMixedString(inputString._S_);
        IMV_SIQ_S_ fwa = _A.getWordFrequencyByReturnSortMap(sets, NE);
        List<String> list = new ArrayList<>();
        Iterator<Integer> iterator = fwa.keySet().iterator();
        while (iterator.hasNext()) {
            int intValue = iterator.next();//32bit 上限 65535
            list.add(fwa.getW(intValue).get_word()
                + S_Common.STRING_SYMBOL_PER + fwa.getW(intValue).get_frequency());
        }
        return list;//是前序遍历, 应用记得从大到小。
    }

    public static void main(String[] argv, EmotionMap_E emotionMap_E
        , NERO_C_OneTime_E nERO_C_OneTime_E
        , Nlp_CE_X_S nlp_CE_X_S, Pos_X_P pos_X_P, SensingTest sensingTest
        , FMHMMListOneTime_E fMHMMListOneTime_E
        , Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E) {
//        List<String> list = new StaticFunctionMapA_VECS_E()
//                .frequencyReader("君不见黄河之水天上来, 奔流到海不复还"
//                        , emotionMap_E, nERO_C_OneTime_E
//                        , nlp_CE_X_S, pos_X_P, sensingTest
//                        , fMHMMListOneTime_E
//                        , quick6DLuoYaoguangSort3DMap_E);
//        Iterator<String> iteraor = list.iterator();
//        while (iteraor.hasNext()) {
//            //20230106-System.out.println(iteraor.next());
//        }
//
//        list = new StaticFunctionMapA_VECS_E()
//                .posReader("君不见黄河之水天上来, 奔流到海不复还"
//                        , emotionMap_E, nERO_C_OneTime_E
//                        , nlp_CE_X_S, pos_X_P, sensingTest
//                        , fMHMMListOneTime_E
//                        , quick6DLuoYaoguangSort3DMap_E);
//        iteraor = list.iterator();
//        while (iteraor.hasNext()) {
//            //20230106-System.out.println(iteraor.next());
//        }
//
//        list = new StaticFunctionMapA_VECS_E()
//                .frequencyReader("君不见黄河之水天上来, 奔流到海不复还"
//                        , emotionMap_E, nERO_C_OneTime_E
//                        , nlp_CE_X_S, pos_X_P, sensingTest
//                        , fMHMMListOneTime_E
//                        , quick6DLuoYaoguangSort3DMap_E);
//        iteraor = list.iterator();
//        while (iteraor.hasNext()) {
//            //20230106-System.out.println(iteraor.next());
//        }
//		IMV_SIQ map= new StaticFunctionMapA_VECS_E()
//		.lenovoReader("C AOPM组, 以后并出去 ");
//		iteraor= map.keySet().iterator();
//		while(iteraor.hasNext()) {
//			//IMV_SIQ hash= (IMV_SIQ)iteraor.next();
//			//20230106-System.out.println(iteraor.next());
//		}

//		Map<String, EmotionSample> map= new StaticFunctionMapA_VECS_E()
//		.environmentReader("SensingTest 函数 在P VECS组, 稍后并出去");
//		iteraor= map.keySet().iterator();
//		while(iteraor.hasNext()) {
//			EmotionSample hash= map.get(iteraor.next());
//			////20230106-System.out.println(hash);
//		}
    }
}
