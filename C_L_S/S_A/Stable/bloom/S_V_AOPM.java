package S_A.Stable.bloom;

import S_A.SEM.bloom.StaticFunctionMapV_AOPM_E;
import S_A.SEM.bloom.StaticRootMap;
	/*
	 * 著作权人 ，作者 罗瑶光, 浏阳
	 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
	 ** 15116110525-
	 * 430181198505250014, G24402609, EB0581342
	 * 204925063, 389418686, F2406501, 0626136
	 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
	 * */
	public class S_V_AOPM {
		//稍后合并
		public static void load(StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_E) {
			//写法
			StaticRootMap.chromosomeBlooming.put("PdeSwapPdcToPde", "V_A.VPC.transaction.PdeSwap");
			StaticRootMap.chromosomeBlooming.put("PdeSwapPdcToPds", "V_A.VPC.transaction.PdeSwap");
			StaticRootMap.chromosomeBlooming.put("PdeSwapPdeToPds", "V_A.VPC.transaction.PdeSwap");
			StaticRootMap.chromosomeBlooming.put("PdeSwapPdsToPde", "V_A.VPC.transaction.PdeSwap");
			StaticRootMap.chromosomeBlooming.put("PdeSwapFixpdcToPde", "V_A.VPC.transaction.PdeSwapFix");
			StaticRootMap.chromosomeBlooming.put("PdeSwapFixpdcToPds", "V_A.VPC.transaction.PdeSwapFix");
			StaticRootMap.chromosomeBlooming.put("PdeSwapFixpdeToPds", "V_A.VPC.transaction.PdeSwapFix");
			StaticRootMap.chromosomeBlooming.put("PdeSwapFixpdsToPde", "V_A.VPC.transaction.PdeSwapFix");
			StaticRootMap.chromosomeBlooming.put("PdeSwapFixtextToPdw", "V_A.VPC.transaction.PdeSwapFix");
			StaticRootMap.chromosomeBlooming.put("PdeSwapFixpdwToPdc", "V_A.VPC.transaction.PdeSwapFix"
					+ ";A_I.OPE.ASQ.ASU.MPE.procedure.pde.full.FullDNATokenPDI");//可拆分到leaf
			StaticRootMap.chromosomeBlooming.put("DetaDBUtilDBRequest", "V_A.VPC.VQS.DSU.utils.DetaDB");
			StaticRootMap.chromosomeBlooming.put("DetaDBUtilbackEndRequest", "V_A.VPC.VQS.DSU.utils.DetaDB");
			StaticRootMap.chromosomeBlooming.put("DetaDBUtilcacheRequest", "V_A.VPC.VQS.DSU.utils.DetaDB");
			StaticRootMap.chromosomeBlooming.put("IV_CulumnNameType", "V_A.VPC.VQS.DSU.utils.DetaDB");
			StaticRootMap.chromosomeBlooming.put("withoutCulumnNameType", "V_A.VPC.VQS.DSU.utils.DetaDB");
			StaticRootMap.chromosomeBlooming.put("DetaFrontEndUtilbackEndRequest", "V_A.VPC.VQS.DSU.utils.DetaFrontEnd");
			StaticRootMap.chromosomeBlooming.put("DetaFrontEndUtilhuaRuiJiRequest", "V_A.VPC.VQS.DSU.utils.DetaFrontEnd");
			StaticRootMap.chromosomeBlooming.put("DetaFrontEndUtilcacheRequest", "V_A.VPC.VQS.DSU.utils.DetaFrontEnd");
			StaticRootMap.chromosomeBlooming.put("IV_DB", "V_A.VPC.VQS.DSU.utils");
			StaticRootMap.chromosomeBlooming.put("compress", "U_A.PEU.P.zip");
			StaticRootMap.chromosomeBlooming.put("uncompress", "U_A.PEU.P.zip");
			//
		}
	}
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPde", "pdc:lock:de:ds:ie:is");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPds", "pdc:lock:de:ds:ie:is");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdeToPds", "pds:lock:de:ds:ie:is");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdsToPde", "pds:lock:de:ds:ie:is");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPde", "pdc:lock:de:ds:ie:is");
//
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPds", "pdc:lock:de:ds:ie:is");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdeToPds", "pds:lock:de:ds:ie:is");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdsToPde", "pds:lock:de:ds:ie:is");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixtextToPdw"
//			, "pDE_RNA_FullFormular:password");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdwToPdc", "pDE_RNA_FullFormular");
//	
//	StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilDBRequest", "request");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilbackEndRequest", "request");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilcacheRequest", "request");
//
//	StaticFunctionMapV_AOPM_C.annotationMap.put("IV_CulumnNameType", "void");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("withoutCulumnNameType", "culumnTypeString");
//
//	StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilbackEndRequest", "request");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilhuaRuiJiRequest", "request");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilcacheRequest", "request");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("IV_DB", "request");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("compress", "data");
//	StaticFunctionMapV_AOPM_C.annotationMap.put("uncompress", "data");