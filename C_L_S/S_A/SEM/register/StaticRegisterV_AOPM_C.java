package S_A.SEM.register;

import java.util.Iterator;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.StaticFunctionMapV_AOPM_E;

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
public class StaticRegisterV_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_E, App NE) {

		//稍后封装
		staticFunctionMapV_AOPM_E.annotationMap.put("PdeSwapPdcToPde",
			"pdc:lock:de:ds:ie:is");
		staticFunctionMapV_AOPM_E.annotationMap.put("PdeSwapPdcToPds",
			"pdc:lock:de:ds:ie:is");
		staticFunctionMapV_AOPM_E.annotationMap.put("PdeSwapPdeToPds",
			"pds:lock:de:ds:ie:is");
		staticFunctionMapV_AOPM_E.annotationMap.put("PdeSwapPdsToPde",
			"pds:lock:de:ds:ie:is");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"PdeSwapFixpdcToPde", "pdc:lock:de:ds:ie:is");

		staticFunctionMapV_AOPM_E.annotationMap.put(
			"PdeSwapFixpdcToPds", "pdc:lock:de:ds:ie:is");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"PdeSwapFixpdeToPds", "pds:lock:de:ds:ie:is");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"PdeSwapFixpdsToPde", "pds:lock:de:ds:ie:is");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"PdeSwapFixtextToPdw", "pDE_RNA_FullFormular:password");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"PdeSwapFixpdwToPdc", "pDE_RNA_FullFormular");

		staticFunctionMapV_AOPM_E.annotationMap.put(
			"DetaDBUtilDBRequest", "request");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"DetaDBUtilbackEndRequest", "request");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"DetaDBUtilcacheRequest", "request");

		staticFunctionMapV_AOPM_E.annotationMap.put(
			"IV_CulumnNameType", "void");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"withoutCulumnNameType", "culumnTypeString");

		staticFunctionMapV_AOPM_E.annotationMap.put(
			"DetaFrontEndUtilbackEndRequest", "request");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"DetaFrontEndUtilhuaRuiJiRequest", "request");
		staticFunctionMapV_AOPM_E.annotationMap.put(
			"DetaFrontEndUtilcacheRequest", "request");
		staticFunctionMapV_AOPM_E.annotationMap.put("IV_DB",
			"request");
		staticFunctionMapV_AOPM_E.annotationMap.put("compress",
			"data");
		staticFunctionMapV_AOPM_E.annotationMap.put("uncompress",
			"data");

		Iterator<String> iterators = staticFunctionMapV_AOPM_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"V_AOPM");
		}
	}
}
