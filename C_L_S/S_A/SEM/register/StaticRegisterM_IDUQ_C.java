package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapM_IDUQ_E;

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
public class StaticRegisterM_IDUQ_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_E, App NE) {

		//稍后封装
		staticFunctionMapM_IDUQ_E.annotationMap.put("getQ_OulerRing",
			"void");
		staticFunctionMapM_IDUQ_E.annotationMap.put(
			"getQ_OulerRing16", "void");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getDecadeToPDS",
			"void");
		staticFunctionMapM_IDUQ_E.annotationMap.put(
			"getDecadeToPDS16", "void");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getPDE_PDS_DL",
			"void");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getPDE_PDS_DL16",
			"void");

		Iterator<String> iterators = staticFunctionMapM_IDUQ_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"M_IDUQ");
		}
	}
}
