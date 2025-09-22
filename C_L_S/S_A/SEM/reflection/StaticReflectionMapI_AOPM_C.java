package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapI_AOPM_E;
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
public class StaticReflectionMapI_AOPM_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_C, IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("getBigWord", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getBigWord(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getBigWord");
        }
        ;
        if (callFunctionKey.contains("getClassify", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getClassify(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getClassify");
        }
        ;
        if (callFunctionKey.contains("getCoAuthor", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getCoAuthor(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCoAuthor");
        }
        ;
        if (callFunctionKey.contains("getCoAuthorForWord", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getCoAuthorForWord(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCoAuthorForWord");
        }
        ;
        if (callFunctionKey.contains("getCoDNAAuthorForWord", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getCoDNAAuthorForWord(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCoDNAAuthorForWord");
        }
        ;
        if (callFunctionKey.contains("getHistogram", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getHistogram(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getHistogram");
        }
        ;
        if (callFunctionKey.contains("getLineMed", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getLineMed(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getLineMed");
        }
        ;
        if (callFunctionKey.contains("getJpv", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getJpv(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getJpv");
        }
        ;

        if (callFunctionKey.contains("getRecoder", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getRecoder(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getRecoder");
        }
        ;

        if (callFunctionKey.contains("getVoicejPanel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getVoicejPanel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getVoicejPanel");
        }
        ;

        if (callFunctionKey.contains("getLYGFileIO", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_AOPM_C.getLYGFileIO(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getLYGFileIO");
        }
        ;
    }
}
