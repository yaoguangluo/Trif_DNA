package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapA_IDUQ_E;

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
public class StaticRegisterA_IDUQ_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_E, App NE) {
		//稍后封装
		staticFunctionMapA_IDUQ_E.annotationMap.put("getPDW",
			"string");
		staticFunctionMapA_IDUQ_E.annotationMap.put("getLock",
			"void");
		staticFunctionMapA_IDUQ_E.annotationMap.put("getCode",
			"lock:pdw");
		staticFunctionMapA_IDUQ_E.annotationMap.put("doPDE",
			"pDE_RNA_FullFormular");
		staticFunctionMapA_IDUQ_E.annotationMap.put("doPrefixPDE",
			"pDE_RNA_FullFormular");
		staticFunctionMapA_IDUQ_E.annotationMap.put("doPostfixPDE",
			"pDE_RNA_FullFormular:pDE_RNA_FullFormularNew");
		staticFunctionMapA_IDUQ_E.annotationMap.put("doSurffixPDE",
			"pDE_RNA_FullFormular:pDE_RNA_FullFormularNew"); //之后这些123 我都会重新命名。

		Iterator<String> iterators = staticFunctionMapA_IDUQ_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"A_IDUQ");
		}
	}
}
