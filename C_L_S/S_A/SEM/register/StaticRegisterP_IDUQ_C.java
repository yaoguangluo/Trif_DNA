package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapP_IDUQ_C;
import S_A.SEM.bloom.StaticFunctionMapP_IDUQ_E;
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
public class StaticRegisterP_IDUQ_C {
	public static void load(StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_E) {
		
		//稍后封装

		StaticFunctionMapP_IDUQ_C.annotationMap.put("copy", "dna");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("copyMap", "functionLineDeque");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("mask", "originDeque:newDeque:maskOutput");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("copy", "maskLineDeque");

		StaticFunctionMapP_IDUQ_C.annotationMap.put("mutationCopy", "dna");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("dating", "father:mother");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("inheritance", "father:mother");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("born", "void");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("mutation", "father:mother");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("separater", "original");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("swap", "original");
		
		Iterator<String> iterators= StaticFunctionMapP_IDUQ_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "P_IDUQ");
		}
	}
}
