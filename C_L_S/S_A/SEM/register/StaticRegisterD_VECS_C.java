package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapD_VECS_C;
import S_A.SEM.bloom.StaticFunctionMapD_VECS_E;
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
public class StaticRegisterD_VECS_C {
	public static void load(StaticFunctionMapD_VECS_E staticFunctionMapD_VECS_E) {
		
		//稍后封装
		Iterator<String> iterators= StaticFunctionMapD_VECS_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "D_VECS");
		}
	}
}
