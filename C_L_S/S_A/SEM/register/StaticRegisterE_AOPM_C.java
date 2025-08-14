package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapE_AOPM_C;
import S_A.SEM.bloom.StaticFunctionMapE_AOPM_E;
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
public class StaticRegisterE_AOPM_C {
	public static void load(StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_E) {
		
		//稍后封装
		StaticFunctionMapE_AOPM_C.annotationMap.put("getSensingMap", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getEmotionMap", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getCogsBinaryForest_A", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getEuclid_C", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getQuick6DLuoYaoguangSort", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNERO_C_OneTime", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNERO_C", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNLP_C", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getBehaviorMap", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getFMHMMList", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getPos_C_X_P", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getPos_C_X_E", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getPos_C_X_O", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNlp_C_X_S", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNlp_C_X_A", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getA_X_Map", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getA", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getBinaryForest_A", "void");
		
		Iterator<String> iterators= StaticFunctionMapE_AOPM_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "E_AOPM");
		}
	}
}
