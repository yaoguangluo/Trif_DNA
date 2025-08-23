package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapI_VECS_E;
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
public class StaticReflectionMapI_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C, IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("main", NE)) {
            StaticFunctionMapI_VECS_E.main(null);//稍后分出去
            output.put("I_VECS_main", "void");//非void接口就直接put进去即可。
        }
        ;
        if (callFunctionKey.contains("doTestWithImageAPP", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_VECS_C.doTestWithImageAPP(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doTestWithImageAPP");
        }
        ;
        if (callFunctionKey.contains("doFourJianPDErosion", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                //24组设计完后统一用 linked map 以后接口写法传参只有linked map 一个变量
                map = staticFunctionMapI_VECS_C.doFourJianPDErosion(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doFourJianPDErosion");
        }
        ;
        if (callFunctionKey.contains("doFourSuanPDErosion", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_VECS_C.doFourSuanPDErosion(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doFourSuanPDErosion");
        }
        ;
        if (callFunctionKey.contains("doEightSuanPDErosion", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_VECS_C.doEightSuanPDErosion(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doEightSuanPDErosion");
        }
        ;
        if (callFunctionKey.contains("doEightJianPDErosion", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_VECS_C.doEightJianPDErosion(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doEightJianPDErosion");
        }
        ;
        if (callFunctionKey.contains("doFirstPDErosionWithTop", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapI_VECS_C.doFirstPDErosionWithTop(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doFirstPDErosionWithTop");
        }
        ;
        if (callFunctionKey.contains("doSecondPDErosionWithTop", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapI_VECS_C.doSecondPDErosionWithTop(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doSecondPDErosionWithTop");
        }
        ;
        if (callFunctionKey.contains("doThirdPDErosionWithTop", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapI_VECS_C.doThirdPDErosionWithTop(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doThirdPDErosionWithTop");
        }
        ;
        if (callFunctionKey.contains("initDeciphring", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapI_VECS_C.initDeciphring(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "initDeciphring");
        }
        ;
        if (callFunctionKey.contains("doTestWithFilePath", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapI_VECS_C.doTestWithFilePath(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doTestWithFilePath");
        }
        ;
        if (callFunctionKey.contains("doTestWithImage", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_VECS_C.doTestWithImage(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doTestWithImage");
        }
        ;
        if (callFunctionKey.contains("doTestBufferedImagePath", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapI_VECS_C.doTestWithBufferedImage(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doTestBufferedImagePath");
        }
        ;
        if (callFunctionKey.contains("staticMain", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapI_VECS_C.staticMain(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "staticMain");
        }
        ;
        if (callFunctionKey.contains("doPDERangePDI16", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapI_VECS_C.doPDERangePDI16(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "doPDERangePDI16");
        }
        ;
    }
}
