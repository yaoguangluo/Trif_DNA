package OSI.OSU.addAction;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import OSI.OSU.crab.CrabInterface;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//稍后封装成一个统一的傻瓜接口。
public class AddParserMixedStringToListClass implements CrabInterface {
    String callFunctionKey;

    //public IMV_SIQ chromosomeRoot= new IMV_SIQ();
    //public IMV_SIQ chromosomeFlower= new IMV_SIQ();
    //public IMV_SIQ chromosomeLeaf= new IMV_SIQ();
    //public IMV_SIQ chromosomeBlooming= new IMV_SIQ();
    //public IMV_SIQ chromosomeMetabolism= new IMV_SIQ();
    //public IMV_SIQ chromosomePDE= new IMV_SIQ();
    //public IMV_SIQ chromosomeDNA= new IMV_SIQ();
    //public IMV_SIQ chromosomeNode= new IMV_SIQ();
    /*
     * 用于表达元基花的链接
     * */
    //确定元基花的染色体位置
    //确定元基花的染色体调用细节
    //确定染色体的粘合机制
    //确定染色体的剥离机制
    //确定染色体的静态执行
    //StaticRootMap.chromosomeRoot.put("crab", null);
    //StaticRootMap.chromosomeLeaf.put("crab", null);
    //StaticRootMap.chromosomeDNA.put("crab", null);
    public void chromosomes() {
        StaticRootMap.initMap();
        callFunctionKey = "callFunctionKey";
        //20230207 走统计新陈代谢
        StaticRootMap.staticBloomingTimes.put(callFunctionKey, (long) 0);
        StaticRootMap.staticBloomingTime.put(callFunctionKey, System.currentTimeMillis());//增加记忆时间。20241013
        StaticRootMap.staticClass_XE_Map.put(callFunctionKey, "S_AOPM");
        StaticRootMap.chromosomeNode.put(callFunctionKey, new AddParserMixedStringToListClass());//20241001准备把这行移出去。
        StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKey, "inputValues:传参因子:因子");
        //String callFunctionKey= "callFunctionKey";
        //StaticRootMap.initMap();
    }

    /*
     * 用于表达花语的链接
     * */
    //确定花语的入参模式
    //确定花语的绽放次数
    //确定花语的最优选择
    //确定花语的映射记忆
    //StaticRootMap.chromosomeFlower.put("crab", null);
    //StaticRootMap.chromosomeBlooming.put("crab", null);
    //StaticRootMap.chromosomeMetabolism.put("crab", null);
    public void bloomings() {
        StaticRootMap.chromosomeBlooming.put(callFunctionKey, this.getClass());
    }

    /*
     * 用于表达执行方式和函数内容
     * */
    //确定函数的dna编码方式和名称
    //确定输入的计算参数名称
    //确定输出的结果对象类型
    //确定函数的三方资源
    //确定函数的加密形式
    //确定函数的运算周期
    //StaticRootMap.chromosomeNode.put("crab", null);
    //StaticRootMap.chromosomePDE.put("crab", null);
    public void neroCells() {
    }

    /*
     * 用于表达执行主体
     * */
    //
    //StaticRootMap.chromosomeBlooming.put("crab", null);
    //StaticRootMap.chromosomeRNA.put("crab", null);
    //System.out.println("Hello Word!");
    //return null;
    public Object logic(IMV_SIQ inputValues, String[] 传参因子, int 因子, App NE) {
        System.out.println("Hello Word!");
        inputValues = StaticFunctionMap.preValues(NE.app_S.outputMap, 传参因子);
        Object map = null;
        if (inputValues.getBoolean("find")) {
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
            map = sets;
        }
        StaticFunctionMap.postValues(NE.app_S.outputMap
            , inputValues.getBoolean("find"), map
            , "parserMixedStringToList");
        return null;
    }
}