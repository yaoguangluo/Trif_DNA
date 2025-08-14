package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapA_IDUQ_C;
import S_A.SEM.bloom.StaticFunctionMapA_IDUQ_E;
import S_A.pheromone.IMV_SIQ;

import java.util.Map;

//将dna加密的 main test 进行封装成函数。准备优化下。
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
public class StaticReflectionMapA_IDUQ_C {
    public static Map<String, String> annotationMap = new IMV_SIQ();

    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_E, IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("getPDW", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_IDUQ_C.getPDW(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getPDW");
        }
        ;
        if (callFunctionKey.contains("getLock", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_IDUQ_C.getLock(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getLock");
        }
        ;
        if (callFunctionKey.contains("getCode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_IDUQ_C.getCode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCode");
        }
        ;
        if (callFunctionKey.contains("doPDE", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_IDUQ_C.doPDE(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doPDE");
        }
        ;
        if (callFunctionKey.contains("doPrefixPDE", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_IDUQ_C.doPrefixPDE(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doPrefixPDE");
        }
        ;
        if (callFunctionKey.contains("doPostfixPDE", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_IDUQ_C.doPostfixPDE(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doPostfixPDE");
        }
        ;
        if (callFunctionKey.contains("doSurffixPDE", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = StaticFunctionMapA_IDUQ_C.doSurffixPDE(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doSurffixPDE");
        }
        ;
    }
}
