package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapC_AOPM_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterC_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E, App NE) {

		//稍后封装
		staticFunctionMapC_AOPM_E.annotationMap.put("BootVPCSBackEnd",
			"app");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"BootVPCSBackEndWithValues", "//later");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpFilter",
			"socket");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"requestLinkFilter", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_BlockList",
			"void");
		staticFunctionMapC_AOPM_E.annotationMap.put("requestIpFix",
			"vPCSRequest:vPCSResponse");//到时候这些传参名要唯一化, 方便tinshell查询缓存, 不能这样单一。
		staticFunctionMapC_AOPM_E.annotationMap.put("requestLinkFix",
			"vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"requestIpRecoder", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"requestLinkRecoder", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("IQ_ForwardType",
			"socket");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"forwardToRestMap", "socket");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"IV_ServerInit_C_VPCSFrontEnd", "void");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_Server",
			"app");
		staticFunctionMapC_AOPM_E.annotationMap.put("IV_Service",
			"jTextPane:frontendTxt");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"IV_ServerServerInit_C", "app");
		staticFunctionMapC_AOPM_E.annotationMap.put("IQ_Response",
			"socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("returnResponse",
			"socket");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Rest",
			"vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_View",
			"vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Bytes",
			"vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_Buffer",
			"vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("P_BufferBytes",
			"vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put(
			"P_BytesWithoutZip", "vPCSRequest:vPCSResponse");
		staticFunctionMapC_AOPM_E.annotationMap.put("hugPillow",
			" sleeper_H:accept:hashCode");
		staticFunctionMapC_AOPM_E.annotationMap.put("forward",
			"string:data");
		staticFunctionMapC_AOPM_E.annotationMap.put("getFilePath",
			"string");
		staticFunctionMapC_AOPM_E.annotationMap.put("getCode",
			"filePath");

		Iterator<String> iterators = staticFunctionMapC_AOPM_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"C_AOPM");
		}
	}
}
