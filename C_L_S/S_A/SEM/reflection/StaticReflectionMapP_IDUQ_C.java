package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapP_IDUQ_E;
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
public class StaticReflectionMapP_IDUQ_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("copyMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.copyMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "copyMap");
        }
        ;
        if (callFunctionKey.contains("mask", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.mask(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mask");
        }
        ;
        if (callFunctionKey.contains("copy", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.copy(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "copy");
        }
        ;
        if (callFunctionKey.contains("mutationCopy", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.mutationCopy(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mutationCopy");
        }
        ;
        if (callFunctionKey.contains("dating", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.dating(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dating");
        }
        ;
        if (callFunctionKey.contains("inheritance", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.inheritance(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "inheritance");
        }
        ;
        if (callFunctionKey.contains("born", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapP_IDUQ_C.born(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "born");
        }
        ;
        if (callFunctionKey.contains("mutation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.mutation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mutation");
        }
        ;
        if (callFunctionKey.contains("separater", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.separater(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "separater");
        }
        ;
        if (callFunctionKey.contains("swap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapP_IDUQ_C.swap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "swap");
        }
        ;
    }
}
