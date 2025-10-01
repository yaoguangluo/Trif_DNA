package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapP_IDUQ_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterP_IDUQ_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_E, App NE) {

		//稍后封装

		staticFunctionMapP_IDUQ_E.annotationMap.put("copy", "dna");
		staticFunctionMapP_IDUQ_E.annotationMap.put("copyMap",
			"functionLineDeque");
		staticFunctionMapP_IDUQ_E.annotationMap.put("mask",
			"originDeque:newDeque:maskOutput");
		staticFunctionMapP_IDUQ_E.annotationMap.put("copy",
			"maskLineDeque");

		staticFunctionMapP_IDUQ_E.annotationMap.put("mutationCopy",
			"dna");
		staticFunctionMapP_IDUQ_E.annotationMap.put("dating",
			"father:mother");
		staticFunctionMapP_IDUQ_E.annotationMap.put("inheritance",
			"father:mother");
		staticFunctionMapP_IDUQ_E.annotationMap.put("born", "void");
		staticFunctionMapP_IDUQ_E.annotationMap.put("mutation",
			"father:mother");
		staticFunctionMapP_IDUQ_E.annotationMap.put("separater",
			"original");
		staticFunctionMapP_IDUQ_E.annotationMap.put("swap",
			"original");

		Iterator<String> iterators = staticFunctionMapP_IDUQ_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"P_IDUQ");
		}
	}
}
