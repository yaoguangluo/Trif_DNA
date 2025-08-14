package S_A.SEM.register;

import java.util.Iterator;

import S_A.SEM.bloom.StaticFunctionMapV_IDUQ_C;
import S_A.SEM.bloom.StaticFunctionMapV_IDUQ_E;
import S_A.SEM.bloom.StaticRootMap;
import S_A.Stable.bloom.S_V_IDUQ;

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
public class StaticRegisterV_IDUQ_C {
	public static void load(StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_E) {
		//稍后封装
		StaticFunctionMapV_IDUQ_C.annotationMap.put("初始ETL", "app:jpanelSecond");
		StaticFunctionMapV_IDUQ_C.annotationMap.put("仅仅初始ETL", "tableData_old:text:app:_A:pos");
		StaticFunctionMapV_IDUQ_C.annotationMap.put("展示ETL", "void");
		StaticFunctionMapV_IDUQ_C.annotationMap.put("ETL文档读取", "void");
		StaticFunctionMapV_IDUQ_C.annotationMap.put("ETL文档执行", "void");
		StaticFunctionMapV_IDUQ_C.annotationMap.put("ETL文档保存", "void");
		StaticFunctionMapV_IDUQ_C.annotationMap.put("getOrigianlTextByLock"
				, "inputString:lockString");
		StaticFunctionMapV_IDUQ_C.annotationMap.put("Load", "first:nodeView:file:thislist");
		
		Iterator<String> iterators= StaticFunctionMapV_IDUQ_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "V_IDUQ");
		}
		S_V_IDUQ.load(staticFunctionMapV_IDUQ_E);
		//
		//..
	}
}
