package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapE_AOPM_C;
import S_A.SEM.bloom.StaticFunctionMapE_AOPM_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

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
public class StaticRegisterE_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_E, App NE) {

		//稍后封装
		staticFunctionMapE_AOPM_E.annotationMap.put("getSensingMap",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getEmotionMap",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put(
			"getCogsBinaryForest_A", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getEuclid_C",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put(
			"getQuick6DLuoYaoguangSort", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put(
			"getNERO_C_OneTime", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNERO_C",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNLP_C",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getBehaviorMap",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getFMHMMList",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getPos_C_X_P",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getPos_C_X_E",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getPos_C_X_O",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNlp_C_X_S",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getNlp_C_X_A",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getA_X_Map",
			"void");
		staticFunctionMapE_AOPM_E.annotationMap.put("getA", "void");
		staticFunctionMapE_AOPM_E.annotationMap.put(
			"getBinaryForest_A", "void");

		Iterator<String> iterators = staticFunctionMapE_AOPM_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"E_AOPM");
		}
	}
}
