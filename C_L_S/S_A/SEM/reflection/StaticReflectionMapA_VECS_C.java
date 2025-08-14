package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapA_VECS_C;
import S_A.SEM.bloom.StaticFunctionMapA_VECS_E;
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
public class StaticReflectionMapA_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("parserMixedString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_VECS_C.parserMixedString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "parserMixedString");
        }
        ;
        if (callFunctionKey.contains("parserMixedStringToList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.parserMixedStringToList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "parserMixedStringToList");
        }
        ;
        if (callFunctionKey.contains("posReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.posReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "posReader");
        }
        ;
        if (callFunctionKey.contains("dnnReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.dnnReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "dnnReader");
        }
        ;
        if (callFunctionKey.contains("mindReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.mindReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "mindReader");
        }
        ;
        if (callFunctionKey.contains("emotionReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.emotionReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "emotionReader");
        }
        ;
        if (callFunctionKey.contains("educationReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.educationReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "educationReader");
        }
        ;
        if (callFunctionKey.contains("environmentReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.environmentReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "environmentReader");
        }
        ;
        if (callFunctionKey.contains("lenovoReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.lenovoReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "lenovoReader");
        }
        ;
        if (callFunctionKey.contains("frequencyReader", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapA_VECS_C.frequencyReader(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "frequencyReader");
        }
        ;
    }
}
