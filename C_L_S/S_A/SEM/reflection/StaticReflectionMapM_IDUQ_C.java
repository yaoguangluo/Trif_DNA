package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapM_IDUQ_E;
import S_A.pheromone.IMV_SIQ;

import java.util.Map;

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
public class StaticReflectionMapM_IDUQ_C {
    public static Map<String, String> annotationMap = new IMV_SIQ();

    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        Object map = null;
        if (callFunctionKey.contains("getQ_OulerRing", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_IDUQ_C.getQ_OulerRing();
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getQ_OulerRing");
        }
        ;
        if (callFunctionKey.contains("getQ_OulerRing16", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_IDUQ_C.getQ_OulerRing16();
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getQ_OulerRing16");
        }
        ;
        if (callFunctionKey.contains("getDecadeToPDS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_IDUQ_C.getDecadeToPDS();
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDecadeToPDS");
        }
        ;
        if (callFunctionKey.contains("getDecadeToPDS16", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_IDUQ_C.getDecadeToPDS16();
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDecadeToPDS16");
        }
        ;
        if (callFunctionKey.contains("getPDE_PDS_DL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_IDUQ_C.getPDE_PDS_DL();
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPDE_PDS_DL");
        }
        ;
        if (callFunctionKey.contains("getPDE_PDS_DL16", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_IDUQ_C.getPDE_PDS_DL16();
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPDE_PDS_DL16");
        }
        ;
    }
}
