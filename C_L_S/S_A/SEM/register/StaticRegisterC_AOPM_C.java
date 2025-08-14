package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapC_AOPM_C;
import S_A.SEM.bloom.StaticFunctionMapC_AOPM_E;
import S_A.SEM.bloom.StaticRootMap;

import java.util.Iterator;

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
public class StaticRegisterC_AOPM_C {
	public static void load(StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E) {
		
		//稍后封装
		StaticFunctionMapC_AOPM_C.annotationMap.put("BootVPCSBackEnd", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("BootVPCSBackEndWithValues", "//later");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpFilter", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkFilter", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_BlockList", "void");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpFix", "vPCSRequest:vPCSResponse");//到时候这些传参名要唯一化, 方便tinshell查询缓存, 不能这样单一。
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkFix", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpRecoder", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkRecoder", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IQ_ForwardType", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("forwardToRestMap", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_ServerInit_C_VPCSFrontEnd", "void");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_Server", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_Service", "jTextPane:frontendTxt");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_ServerServerInit_C", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IQ_Response", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("returnResponse", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_Rest", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_View", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_Bytes", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_Buffer", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_BufferBytes", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_BytesWithoutZip", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("hugPillow", " sleeper_H:accept:hashCode");
		StaticFunctionMapC_AOPM_C.annotationMap.put("forward", "string:data");
		StaticFunctionMapC_AOPM_C.annotationMap.put("getFilePath", "string");
		StaticFunctionMapC_AOPM_C.annotationMap.put("getCode", "filePath");
		
		Iterator<String> iterators= StaticFunctionMapC_AOPM_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "C_AOPM");
		}
	}
}
