package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapO_IDUQ_C;
import S_A.SEM.bloom.StaticFunctionMapO_IDUQ_E;
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
public class StaticRegisterO_IDUQ_C {
	public static void load(StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_E) {
		
		//稍后封装
		StaticFunctionMapO_IDUQ_C.annotationMap.put("U_", "fileCurrentpath:first");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("getRandomDNAkey", "sessionValidation:password");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("Save", "first");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("bootCell", "linkNode:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("BootNeroDoc"
				, "first:fileCurrentpath:nodeView:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("vpcsRegister"
				, "first:fileCurrentpath:nodeView:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("register", "bootNeroDoc");
		
		Iterator<String> iterators= StaticFunctionMapO_IDUQ_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "O_IDUQ");
		}
	}
}
