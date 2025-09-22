package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapE_AOPM_E;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticReflectionMapE_AOPM_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_C, IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        Object map = null;
        if (callFunctionKey.contains("getSensingMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getSensingMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getSensingMap");
        }
        ;
        if (callFunctionKey.contains("getEmotionMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getEmotionMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getEmotionMap");
        }
        ;
        if (callFunctionKey.contains("getCogsBinaryForest_A", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getCogsBinaryForest_A(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCogsBinaryForest_A");
        }
        ;
        if (callFunctionKey.contains("getEuclid_C", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getEuclid_C(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getEuclid_C");
        }
        ;

        if (callFunctionKey.contains("getQuick6DLuoYaoguangSort", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getQuick6DLuoYaoguangSort(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getQuick6DLuoYaoguangSort");
        }
        ;
        if (callFunctionKey.contains("getNERO_C_OneTime", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getNERO_C_OneTime(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNERO_C_OneTime");
        }
        ;
        if (callFunctionKey.contains("getNERO_C", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getNERO_C(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNERO_C");
        }
        ;
//		if(callFunctionKey.contains("getNLP_C")){ 
//			IMV_SIQ inputValues= StaticFunctionMap.preValues(output, 传参因子);
//			if(inputValues.getBoolean("find")) {
//				map= staticFunctionMapE_AOPM_C.getNLP_C(NE);
//			}
//			StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
//					, callFunctionKey);
//		}; 退化
        if (callFunctionKey.contains("getBehaviorMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getBehaviorMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getBehaviorMap");
        }
        ;
        if (callFunctionKey.contains("getFMHMMList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getFMHMMList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getFMHMMList");
        }
        ;
        if (callFunctionKey.contains("getPos_C_X_P", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getPos_C_X_P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPos_C_X_P");
        }
        ;
        if (callFunctionKey.contains("getPos_C_X_E", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getPos_C_X_E(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPos_C_X_E");
        }
        ;
        if (callFunctionKey.contains("getPos_C_X_O", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getPos_C_X_O(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPos_C_X_O");
        }
        ;
        if (callFunctionKey.contains("getNlp_C_X_S", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getNlp_C_X_S(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNlp_C_X_S");
        }
        ;
        if (callFunctionKey.contains("getNlp_C_X_A_doPOSAndEMMCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getNlp_C_X_A_doPOSAndEMMCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNlp_C_X_A_doPOSAndEMMCheck");
        }
        ;
        if (callFunctionKey.contains("getNlp_C_X_A_doSlangPartAndPOSCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getNlp_C_X_A_doSlangPartAndPOSCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNlp_C_X_A_doSlangPartAndPOSCheck");
        }
        ;
        if (callFunctionKey.contains("getA_X_Map", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getA_X_Map(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getA_X_Map");
        }
        ;
        if (callFunctionKey.contains("getA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getA");
        }
        ;
        if (callFunctionKey.contains("getBinaryForest_A", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_AOPM_C.getBinaryForest_A(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getBinaryForest_A");
        }
        ;
    }
}
