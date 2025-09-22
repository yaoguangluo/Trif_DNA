package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapV_IDUQ_E;
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
public class StaticReflectionMapV_IDUQ_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_C
        , IMV_SIQ output, App NE) {//shao hou xiuzheng
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("initETL", NE)) {
            String trif = "initETL";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_IDUQ_C.initETLWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        if (callFunctionKey.contains("onlyInitETL", NE)) {
            String trif = "onlyInitETL";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_IDUQ_C.onlyInitETLWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        if (callFunctionKey.contains("demoETL", NE)) {
            String trif = "demoETL";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapV_IDUQ_C.demoETLWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        if (callFunctionKey.contains("ETLDocLoader", NE)) {
            String trif = "ETLDocLoader";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapV_IDUQ_C.ETLDocLoaderWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        if (callFunctionKey.contains("ETLDocExec", NE)) {
            String trif = "ETLDocExec";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapV_IDUQ_C.ETLDocExecWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        if (callFunctionKey.contains("ETLDocSave", NE)) {
            String trif = "ETLDocSave";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapV_IDUQ_C.ETLDocSaveWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        if (callFunctionKey.contains("getOrigianlTextByLock", NE)) {
            String trif = "getOrigianlTextByLock";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_IDUQ_C.getOrigianlTextByLockWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        if (callFunctionKey.contains("Load", NE)) {
            String trif = "Load";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_IDUQ_C.LoadWithInitons(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
    }
}
