package S_A.SEM.bloom;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_X_;

import java.util.ArrayList;
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
public interface StaticFunctionMapA_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    //分词
    public static List<String> parserMixedString(App NE) {
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
        _A.IV_Mixed(NE);//shaohou
        List<String> sets = new ArrayList<>();
        sets = _A.parserMixedString(inputString._S_);
        //罗瑶光
        return sets;
    }

    public List<String> parserMixedStringToList(App NE);

    //文本分析
    public List<String> posReader(App NE);

    //文本分析
    public List<String> dnnReader(App NE);

    //读心术
    public List<String> mindReader(App NE);

    //情感分析,
    public List<String> emotionReader(App NE);

    //教育分析
    public List<String> educationReader(App NE);

    //环境分析
    public IMV_SIQ_X_ environmentReader(App NE);

    //联想分析
    public IMV_SIQ lenovoReader(App NE);

    //词频分析
    public List<String> frequencyReader(App NE);

    //视觉动画
    //
    //
    //
}
