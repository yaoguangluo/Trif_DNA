package S_A.SEM.register;

import java.util.Iterator;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.StaticFunctionMapI_VECS_E;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterI_VECS_C {
	@SuppressWarnings("unchecked")
	public static void load(StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_E, App NE) {
		
		//稍后封装
		staticFunctionMapI_VECS_E.annotationMap.put("main", "main");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithImageAPP", "app");
		staticFunctionMapI_VECS_E.annotationMap.put("doFourJianPDErosion"
				, "erosion:pixGate:pixRatioScale:pixDistinctScale:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("doFourSuanPDErosion"
				, "erosion:pixGate:pixRatioScale:pixDistinctScale:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("doEightSuanPDErosion"
				, "erosion:pixGate:pixRatioScale:pixDistinctScale:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("doEightJianPDErosion"
				, "erosion:pixGate:pixRatioScale:pixDistinctScale:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("doFirstPDErosionWithTop"
				, "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:bufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("doSecondPDErosionWithTop"
				, "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:times:bufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("doThirdPDErosionWithTop"
				, "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:times:output:bufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("initDeciphring", "string, type");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithFilePath", "testImagePath");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithImage", "testImagePath");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithBufferedImage", "testImagePath");
		staticFunctionMapI_VECS_E.annotationMap.put("staticMain", "string");
		staticFunctionMapI_VECS_E.annotationMap.put("doPDERangePDI16", "input:酸碱scale");
		
		Iterator<String> iterators= staticFunctionMapI_VECS_E.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp, (long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp, "I_VECS");
		}
	}
}
