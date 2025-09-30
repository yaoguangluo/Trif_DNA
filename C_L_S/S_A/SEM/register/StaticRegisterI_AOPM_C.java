package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapI_AOPM_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterI_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_E, App NE) {

		//稍后封装
		staticFunctionMapI_AOPM_E.annotationMap.put("getBigWord",
			"void");
		staticFunctionMapI_AOPM_E.annotationMap.put("getClassify",
			"void");
		staticFunctionMapI_AOPM_E.annotationMap.put("getCoAuthor",
			"dic_li:_A:pos");
		staticFunctionMapI_AOPM_E.annotationMap.put(
			"getCoAuthorForWord", "app:_A:pos");
		//稍后优化传参变量名的 传参因子格式。
		staticFunctionMapI_AOPM_E.annotationMap.put(
			"getCoDNAAuthorForWord", "app:_A:pos");
		staticFunctionMapI_AOPM_E.annotationMap.put("getHistogram",
			"void");
		staticFunctionMapI_AOPM_E.annotationMap.put("getLineMed",
			"void");
		staticFunctionMapI_AOPM_E.annotationMap.put("getJpv", "void");
		staticFunctionMapI_AOPM_E.annotationMap.put("getRecoder",
			"void");
		staticFunctionMapI_AOPM_E.annotationMap.put("getVoicejPanel",
			"void");
		staticFunctionMapI_AOPM_E.annotationMap.put("getLYGFileIO",
			"void");

		Iterator<String> iterators = staticFunctionMapI_AOPM_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"I_AOPM");
		}
	}
}
