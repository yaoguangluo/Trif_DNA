package S_A.SEM.bloom;

import C_A.OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import C_A.ME.analysis.C.A;
import C_A.OCI.ME.analysis.C.A_X_Map;
import C_A.ME.analysis.C.BinaryForest_A;
import C_A.ME.analysis.C.CogsBinaryForest_A;
import C_A.ME.euclid.C.Euclid_C;
import C_A.ME.liner.C.Quick6DLuoYaoguangSort;
import C_A.ME.nero.C.NERO_C;
import C_A.ME.nero.C.NERO_C_OneTime;
import C_A.OCI.ME.nlp.C.Nlp_C_X_A_doPOSAndEMMCheck;
import C_A.OCI.ME.nlp.C.Nlp_C_X_A_doSlangPartAndPOSCheck;
import C_A.OCI.ME.nlp.C.Nlp_C_X_S_doSlangCheck;
import C_A.OCI.ME.pos.C.X_E;
import C_A.OCI.ME.pos.C.X_O_parserFirst;
import C_A.OCI.ME.pos.CP.X_P;
import C_A.OCI.OPM.VEC.SVQ.MPC.fhmm.C.BehaviorMap;
import C_A.OCI.SVQ.MPC.fhmm.C.FMHMMList;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
//今天看见 大量的原函数新陈代谢化和 碎片化继承, 于是将函数设为类函数class接口
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapE_AOPM_C {
	public static IMV_SIQ annotationMap= new IMV_SIQ();

	//SensingMap,
	public SensingMap getSensingMap(App NE);
	//EmotionMap,
	public EmotionMap getEmotionMap(App NE);
	//CogsBinaryForest_A,
	public CogsBinaryForest_A getCogsBinaryForest_A(App NE);
	//Euclid_C,
	public Euclid_C getEuclid_C(App NE);
	//Quick6DLuoYaoguangSort,
	public Quick6DLuoYaoguangSort getQuick6DLuoYaoguangSort(App NE);
	//NERO_C_OneTime,
	public NERO_C_OneTime getNERO_C_OneTime(App NE);
	//NERO_C
	public NERO_C getNERO_C(App NE);
//	//NLP_C,
//	public Nlp_C_X_ getNLP_C(App NE);退化掉
	//BehaviorMap,
	public BehaviorMap getBehaviorMap(App NE);
	//FMHMMList
	public FMHMMList getFMHMMList(App NE);
	
	//Pos_C_X_P
	public X_P getPos_C_X_P(App NE);
	//Pos_C_X_E
	public X_E getPos_C_X_E(App NE);
	//Pos_C_X_O
	public X_O_parserFirst getPos_C_X_O(App NE);//进化
	//Nlp_C_X_S
	public Nlp_C_X_S_doSlangCheck getNlp_C_X_S(App NE);
	//Nlp_C_X_A
	public Nlp_C_X_A_doPOSAndEMMCheck getNlp_C_X_A_doPOSAndEMMCheck(App NE);
	//Nlp_C_X_A
	public Nlp_C_X_A_doSlangPartAndPOSCheck getNlp_C_X_A_doSlangPartAndPOSCheck(App NE);
	//A_X_Map
	public A_X_Map getA_X_Map(App NE);
	//A
	public A getA(App NE);
	//BinaryForest_A
	public BinaryForest_A getBinaryForest_A(App NE);
}
