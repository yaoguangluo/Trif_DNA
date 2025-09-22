package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapE_IDUQ_C;
import S_A.SEM.bloom.StaticFunctionMapE_IDUQ_E;
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
public class StaticRegisterE_IDUQ_C {
	public static void load(StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_E) {
		
		//稍后封装
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeInfo", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeProject", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getCheckRange", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getChooseCheck", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawArrow", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDynamicLine_U", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getU_RelatedLine", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getLinkOSGI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeOSGI", "void");
		//之后变量名通通都会进行元基肽化
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSU_MCI_MCU_MSI"
				, "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSU_AVQ_ASQ_OPE_OPC_ECI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornJSplitPane", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornScrollBarUI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornSplitPaneUI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornTreeCellRenderer", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornTreeUI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getCacuString", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeShow"
				, "gUISample:tableData_old:text:popupMenu:app:_A:pos");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getCheckRangeVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getChooseQ_VPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawArrowVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawFlashSide", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawSinLineVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDynamicLineU_VPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getLinkList", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getLinkNode", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getSort", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getU_RelatedLineVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getOSGI_chansfer", "node:first");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register"
				, "tableData_old:text:app:_A:pos");
		
		Iterator<String> iterators= StaticFunctionMapE_IDUQ_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "E_IDUQ");
		}
	}
}
