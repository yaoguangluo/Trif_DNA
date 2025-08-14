package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapV_AOPM_E;
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
public class StaticReflectionMapV_AOPM_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("PdeSwapPdcToPde", NE)) {
            String trif = "PdeSwapPdcToPde";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapPdcToPde(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapPdcToPds", NE)) {
            String trif = "PdeSwapPdcToPds";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapPdcToPds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapPdeToPds", NE)) {
            String trif = "PdeSwapPdeToPds";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapPdeToPds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapPdsToPde", NE)) {
            String trif = "PdeSwapPdsToPde";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapPdsToPde(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapFixpdcToPde", NE)) {
            String trif = "PdeSwapFixpdcToPde";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapFixpdcToPde(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapFixpdcToPds", NE)) {
            String trif = "PdeSwapFixpdcToPds";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapFixpdcToPds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapFixpdsToPde", NE)) {
            String trif = "PdeSwapFixpdsToPde";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapFixpdsToPde(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapFixpdeToPds", NE)) {
            String trif = "PdeSwapFixpdeToPds";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapFixpdeToPds(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapFixtextToPdw", NE)) {
            String trif = "PdeSwapFixtextToPdw";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapFixtextToPdw(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;

        if (callFunctionKey.contains("PdeSwapFixtextToPdw", NE)) {
            String trif = "PdeSwapFixtextToPdw";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapFixtextToPdw(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("PdeSwapFixpdwToPdc", NE)) {
            String trif = "PdeSwapFixpdwToPdc";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.PdeSwapFixpdwToPdc(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("DetaDBUtilDBRequest", NE)) {
            String trif = "DetaDBUtilDBRequest";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.DetaDBUtilDBRequest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("DetaDBUtilbackEndRequest", NE)) {
            String trif = "DetaDBUtilbackEndRequest";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.DetaDBUtilbackEndRequest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("DetaDBUtilcacheRequest", NE)) {
            String trif = "DetaDBUtilcacheRequest";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.DetaDBUtilcacheRequest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("IV_CulumnNameType", NE)) {
            String trif = "IV_CulumnNameType";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapV_AOPM_C.IV_CulumnNameType(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;

        if (callFunctionKey.contains("withoutCulumnNameType", NE)) {
            String trif = "withoutCulumnNameType";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.withoutCulumnNameType(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("DetaFrontEndUtilbackEndRequest", NE)) {
            String trif = "DetaFrontEndUtilbackEndRequest";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.DetaFrontEndUtilbackEndRequest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("DetaFrontEndUtilbackEndRequest", NE)) {
            String trif = "DetaFrontEndUtilbackEndRequest";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.DetaFrontEndUtilbackEndRequest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;

        if (callFunctionKey.contains("DetaFrontEndUtilhuaRuiJiRequest", NE)) {
            String trif = "DetaFrontEndUtilhuaRuiJiRequest";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.DetaFrontEndUtilhuaRuiJiRequest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("DetaFrontEndUtilcacheRequest", NE)) {
            String trif = "DetaFrontEndUtilcacheRequest";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.DetaFrontEndUtilcacheRequest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("IV_DB", NE)) {
            String trif = "IV_DB";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapV_AOPM_C.IV_DB(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;

        if (callFunctionKey.contains("compress", NE)) {
            String trif = "compress";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.compress(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
        if (callFunctionKey.contains("uncompress", NE)) {
            String trif = "uncompress";
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapV_AOPM_C.uncompress(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , trif);
        }
        ;
    }
}
