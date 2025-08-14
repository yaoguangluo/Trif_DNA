package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapC_AOPM_E;
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
public class StaticReflectionMapC_AOPM_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("BootVPCSBackEndWithValues", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.BootVPCSBackEndWithValues(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "BootVPCSBackEndWithValues");
        }
        if (callFunctionKey.contains("BootVPCSBackEnd", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.BootVPCSBackEnd(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "BootVPCSBackEnd");
        }
        ;
        if (callFunctionKey.contains("requestIpFilter", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.requestIpFilter(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "requestIpFilter");
        }
        ;
        if (callFunctionKey.contains("requestLinkFilter", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.requestLinkFilter(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "requestLinkFilter");
        }
        ;
        if (callFunctionKey.contains("requestIpFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.requestIpFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "requestIpFix");
        }
        if (callFunctionKey.contains("requestIpFixVPCS", NE)) {//later obsession
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.requestIpFixVPCS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "requestIpFixVPCS");
        }
        ;
        if (callFunctionKey.contains("requestLinkFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.requestLinkFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "requestLinkFix");
        }
        ;
        if (callFunctionKey.contains("IV_BlockList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.IV_BlockList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IV_BlockList");
        }
        ;
        if (callFunctionKey.contains("requestLinkRecoder", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.requestLinkRecoder(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "requestLinkRecoder");
        }
        ;
        if (callFunctionKey.contains("IQ_ForwardType", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.IQ_ForwardType(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IQ_ForwardType");
        }
        ;
        if (callFunctionKey.contains("forwardToRestMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.forwardToRestMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "forwardToRestMap");
        }
        ;
        if (callFunctionKey.contains("IV_ServerInit_C_VPCSFrontEnd", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.IV_ServerInit_C_VPCSFrontEnd(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IV_ServerInit_C_VPCSFrontEnd");
        }
        ;
        if (callFunctionKey.contains("IV_Server", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.IV_Server(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IV_Server");
        }
        ;
        if (callFunctionKey.contains("IV_Service", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.IV_Service(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IV_Service");
        }
        ;
        if (callFunctionKey.contains("IV_ServerServerInit_C", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.IV_ServerServerInit_C(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IV_ServerServerInit_C");
        }
        ;

        if (callFunctionKey.contains("IQ_Response", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.IQ_Response(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IQ_Response");
        }
        ;
        if (callFunctionKey.contains("returnResponse", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.returnResponse(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "returnResponse");
        }
        ;

        if (callFunctionKey.contains("P_Rest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.P_Rest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Rest");
        }
        ;
        if (callFunctionKey.contains("P_View", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.P_View(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_View");
        }
        ;

        if (callFunctionKey.contains("P_Bytes", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.P_Bytes(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Bytes");
        }
        ;

        if (callFunctionKey.contains("P_Buffer", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.P_Buffer(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Buffer");
        }
        ;
        if (callFunctionKey.contains("P_BufferBytes", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.P_BufferBytes(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_BufferBytes");
        }
        ;

        if (callFunctionKey.contains("P_BytesWithoutZip", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.P_BytesWithoutZip(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_BytesWithoutZip");
        }
        ;
        if (callFunctionKey.contains("hugPillow", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapC_AOPM_C.hugPillow(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "hugPillow");
        }
        ;

        if (callFunctionKey.contains("forward", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapC_AOPM_C.forward(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "forward");
        }
        ;
        if (callFunctionKey.contains("getFilePath", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapC_AOPM_C.getFilePath(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getFilePath");
        }
        ;
        if (callFunctionKey.contains("getCode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapC_AOPM_C.getCode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCode");
        }
        ;
    }
}
