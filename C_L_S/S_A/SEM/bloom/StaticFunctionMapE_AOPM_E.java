package S_A.SEM.bloom;

import C_A.ME.analysis.C.A;
import C_A.ME.analysis.C.BinaryForest_A;
import C_A.ME.analysis.C.CogsBinaryForest_A;
import C_A.ME.euclid.C.Euclid_C;
import C_A.ME.liner.C.Quick6DLuoYaoguangSort;
import C_A.ME.nero.C.NERO_C;
import C_A.ME.nero.C.NERO_C_OneTime;
import C_A.OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import C_A.OCI.ME.analysis.C.A_X_Map;
import C_A.OCI.ME.nlp.C.Nlp_C_X_A_doPOSAndEMMCheck;
import C_A.OCI.ME.nlp.C.Nlp_C_X_A_doSlangPartAndPOSCheck;
import C_A.OCI.ME.nlp.C.Nlp_C_X_S_doSlangCheck;
import C_A.OCI.ME.pos.C.X_E;
import C_A.OCI.ME.pos.C.X_O_parserFirst;
import C_A.OCI.ME.pos.CP.X_P;
import C_A.OCI.OPM.VEC.SVQ.MPC.fhmm.C.BehaviorMap;
import C_A.OCI.SVQ.MPC.fhmm.C.FMHMMList;
import E.Nlp_CE_X_A_doPOSAndEMMCheck;
import E.Nlp_CE_X_A_doSlangPartAndPOSCheck;
import E.Nlp_CE_X_S;
import EAE.X_Map;
import P.Pos_X_P;
import ECE.Pos_X_E;
import ECE.Pos_X_O;
import E_A.ME.analysis.E.AE;
import E_A.ME.analysis.E.BinaryForest_AE;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.euclid.E.Euclid_CE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort_E;
import E_A.ME.nero.E.NERO_CE;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.OEI.OPM.VEC.SVQ.MPC.fhmm.E.BehaviorMap_E;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMList_E;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapE_AOPM_E implements StaticFunctionMapE_AOPM_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    @Override
    public SensingMap getSensingMap(App NE){
        return new SensingMap_E();
    }

    @Override
    public EmotionMap getEmotionMap(App NE){
        return new EmotionMap_E();
    }

    @Override
    public CogsBinaryForest_A getCogsBinaryForest_A(App NE){
        return new CogsBinaryForest_AE();
    }

    @Override
    public Euclid_C getEuclid_C(App NE){
        return new Euclid_CE();
    }

    @Override
    public Quick6DLuoYaoguangSort getQuick6DLuoYaoguangSort(App NE){
        return new Quick6DLuoYaoguangSort_E();
    }

    @Override
    public NERO_C_OneTime getNERO_C_OneTime(App NE){
        return new NERO_C_OneTime_E();
    }

    @Override
    public NERO_C getNERO_C(App NE){
        return new NERO_CE();
    }

//	@Override 退化掉
//	public NLP_C getNLP_C(App NE){
//		return new Nlp_CE_X_();
//	}

    @Override
    public BehaviorMap getBehaviorMap(App NE){
        return new BehaviorMap_E();
    }

    @Override
    public FMHMMList getFMHMMList(App NE){
        return new FMHMMList_E();
    }

    @Override
    public X_P getPos_C_X_P(App NE){
        return new Pos_X_P();
    }

    @Override
    public X_E getPos_C_X_E(App NE){
        return new Pos_X_E();
    }

    @Override
    public X_O_parserFirst getPos_C_X_O(App NE){
        return new Pos_X_O();
    }

    @Override
    public Nlp_C_X_S_doSlangCheck getNlp_C_X_S(App NE){
        return new Nlp_CE_X_S();
    }

    @Override
    public Nlp_C_X_A_doPOSAndEMMCheck getNlp_C_X_A_doPOSAndEMMCheck(App NE){
        return new Nlp_CE_X_A_doPOSAndEMMCheck();
    }

    @Override
    public Nlp_C_X_A_doSlangPartAndPOSCheck getNlp_C_X_A_doSlangPartAndPOSCheck(App NE){
        return new Nlp_CE_X_A_doSlangPartAndPOSCheck();
    }

    @Override
    public A_X_Map getA_X_Map(App NE){
        return new X_Map();
    }

    @Override
    public A getA(App NE){
        return new AE();
    }

    @Override
    public BinaryForest_A getBinaryForest_A(App NE){
        return new BinaryForest_AE();
    }

    public static void main(String[] argv) {
        App NE = new App();
//        CogsBinaryForest_AE _A = new CogsBinaryForest_AE();//获取分词引擎
//        _A.IV_All(NE);
//        List<String> sets = new ArrayList<>();
//        sets = _A.parserMixedString("你好, 世界！請在這輸入廣告詞優化");//分词
//        Iterator<String> iterator = sets.iterator(); //得到分词的Iterator数列
//        while (iterator.hasNext()) {
//            iterator.next();
//            //20230106-//20230106-System.out.println(iterator.next());
//        }
    }
}
