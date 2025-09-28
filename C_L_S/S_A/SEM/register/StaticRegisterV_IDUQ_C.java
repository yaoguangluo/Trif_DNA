package S_A.SEM.register;

import java.util.Iterator;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.StaticFunctionMapV_IDUQ_E;
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
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_E, App NE) {
		//稍后封装
		staticFunctionMapV_IDUQ_E.annotationMap.put("初始ETL",
			"app:jpanelSecond");
		staticFunctionMapV_IDUQ_E.annotationMap.put("仅仅初始ETL",
			"tableData_old:text:app:_A:pos");
		staticFunctionMapV_IDUQ_E.annotationMap.put("展示ETL", "void");
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档读取",
			"void");
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档执行",
			"void");
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档保存",
			"void");
		staticFunctionMapV_IDUQ_E.annotationMap.put(
			"getOrigianlTextByLock", "inputString:lockString");
		staticFunctionMapV_IDUQ_E.annotationMap.put("Load",
			"first:nodeView:file:thislist");

		Iterator<String> iterators = staticFunctionMapV_IDUQ_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"V_IDUQ");
		}
		S_V_IDUQ.load(staticFunctionMapV_IDUQ_E, NE);
		//
		//..
	}
}
