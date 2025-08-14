package A_V.IVDTIXQCTIV;

import A_V.E.RatioMap_E;
import C_A.OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.BinaryForest_AE;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_X_;

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
public class LenovoInit {
    public SensingMap getSensingMap() {
        return sensingMap;
    }

    public void I_SensingMap(SensingMap sensingMap) {
        this.sensingMap = sensingMap;
    }

    public EnvironmentInit getEnvironmentInit() {
        return environmentInit;
    }

    //	public void I_EnvironmentInit(EnvironmentInit environmentInit) {
//		this.environmentInit= environmentInit;
//	}
    private SensingMap sensingMap;
    private EnvironmentInit environmentInit;

    @SuppressWarnings("unused")
    public static void main(String[] argv, EnvironmentInit environmentInit
        , EmotionMap_E emotionMap_E, RatioMap_E ratioMap_E, CogsBinaryForest_AE _AE
        , SensingMap_E sensingMap_E, EmotionSample emotionSample) {
        LenovoInit lenovoInit = new LenovoInit();
        lenovoInit.IV_(S_String.text1, new App());
        IMV_SIQ_X_ environmentSampleMap
            = lenovoInit.getEnvironmentInit().getEmotionSampleMap();
        IMV_SIQ lenovo = lenovoInit.getSensingMap().getLenovoMap();
    }

    public void IV_(String text, App NE) {
        environmentInit.IV_(text, NE);
        this.environmentInit = environmentInit;
        sensingMap = NE.app_S.sensingMap_E;
        sensingMap.IV_LenovoMap(((BinaryForest_AE) environmentInit.get_A()));
    }

    public void IV_Exclude_A(String text, App NE) {
        NE.app_S.environmentInit.IV_Exclude_A(text, NE);
        this.environmentInit = NE.app_S.environmentInit;
        sensingMap = NE.app_S.sensingMap_E;
        sensingMap.IV_LenovoMap(((BinaryForest_AE) environmentInit.get_A()));
    }
}
