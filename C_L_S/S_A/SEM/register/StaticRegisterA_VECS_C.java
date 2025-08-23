package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapA_VECS_C;
import S_A.SEM.bloom.StaticFunctionMapA_VECS_E;
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
public class StaticRegisterA_VECS_C {
	public static void load(StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_E) {
		//扫描插件
		//扫描接口
		//扫描继承
		//稍后封装
		StaticFunctionMapA_VECS_C.annotationMap.put("parserMixedString", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("parserMixedStringToList", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("posReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("dnnReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("mindReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("emotionReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("educationReader", "inputString");
		StaticFunctionMapA_VECS_C.annotationMap.put("environmentReader"
				, "inputString:environmentInit:emotionMap_E:ratioMap_E:_AE");
		StaticFunctionMapA_VECS_C.annotationMap.put("lenovoReader"
				, "inputString:environmentInit:emotionMap_E:ratioMap_E:_AE");
		StaticFunctionMapA_VECS_C.annotationMap.put("frequencyReader", "inputString");
		
		Iterator<String> iterators= StaticFunctionMapA_VECS_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "A_VECS");
		}
	}
}
