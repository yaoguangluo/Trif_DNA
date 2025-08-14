package S_A.SEM.register;

import java.util.Iterator;

import S_A.SEM.bloom.StaticFunctionMapV_AOPM_C;
import S_A.SEM.bloom.StaticFunctionMapV_AOPM_E;
import S_A.SEM.bloom.StaticRootMap;

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
	public static void load(StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_E) {
		
		//稍后封装
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPde", "pdc:lock:de:ds:ie:is");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPds", "pdc:lock:de:ds:ie:is");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdeToPds", "pds:lock:de:ds:ie:is");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdsToPde", "pds:lock:de:ds:ie:is");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPde", "pdc:lock:de:ds:ie:is");

		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPds", "pdc:lock:de:ds:ie:is");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdeToPds", "pds:lock:de:ds:ie:is");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdsToPde", "pds:lock:de:ds:ie:is");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixtextToPdw"
				, "pDE_RNA_FullFormular:password");
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdwToPdc", "pDE_RNA_FullFormular");
		
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilDBRequest", "request");
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilbackEndRequest", "request");
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilcacheRequest", "request");

		StaticFunctionMapV_AOPM_C.annotationMap.put("IV_CulumnNameType", "void");
		StaticFunctionMapV_AOPM_C.annotationMap.put("withoutCulumnNameType", "culumnTypeString");

		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilbackEndRequest", "request");
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilhuaRuiJiRequest", "request");
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilcacheRequest", "request");
		StaticFunctionMapV_AOPM_C.annotationMap.put("IV_DB", "request");
		StaticFunctionMapV_AOPM_C.annotationMap.put("compress", "data");
		StaticFunctionMapV_AOPM_C.annotationMap.put("uncompress", "data");
		
		Iterator<String> iterators= StaticFunctionMapV_AOPM_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "V_AOPM");
		}
	}
}
