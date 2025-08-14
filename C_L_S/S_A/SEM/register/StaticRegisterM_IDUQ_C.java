package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapM_IDUQ_C;
import S_A.SEM.bloom.StaticFunctionMapM_IDUQ_E;
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
public class StaticRegisterM_IDUQ_C {
	public static void load(StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_E) {
		
		//稍后封装
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getQ_OulerRing", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getQ_OulerRing16", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getDecadeToPDS", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getDecadeToPDS16", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getPDE_PDS_DL", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getPDE_PDS_DL16", "void");
		
		Iterator<String> iterators= StaticFunctionMapM_IDUQ_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "M_IDUQ");
		}
	}
}
