package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapE_IDUQ_E;

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
public class StaticRegisterE_IDUQ_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_E, App NE) {

		//稍后封装
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeInfo",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeProject",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCheckRange",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getChooseCheck",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawArrow",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getDynamicLine_U", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getU_RelatedLine", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkOSGI",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeOSGI",
			"void");
		//之后变量名通通都会进行元基肽化
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"_OSU_MCI_MCU_MSI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"_OSU_AVQ_ASQ_OPE_OPC_ECI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getUnicornJSplitPane", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getUnicornScrollBarUI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getUnicornSplitPaneUI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getUnicornTreeCellRenderer", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getUnicornTreeUI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCacuString",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeShow",
			"gUISample:tableData_old:text:popupMenu:app:_A:pos");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getCheckRangeVPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getChooseQ_VPS",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawArrowVPS",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getDrawFlashSide", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getDrawSinLineVPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getDynamicLineU_VPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkList",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkNode",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getSort",
			"void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getU_RelatedLineVPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"getOSGI_chansfer", "node:first");
		staticFunctionMapE_IDUQ_E.annotationMap.put(
			"_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register",
			"tableData_old:text:app:_A:pos");

		Iterator<String> iterators = staticFunctionMapE_IDUQ_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"E_IDUQ");
		}
	}
}
