package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapE_IDUQ_E;
import S_A.pheromone.IMV_SIQ;

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
public class StaticReflectionMapE_IDUQ_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_C, IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("getNodeInfo", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getNodeInfo(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNodeInfo");
        }
        ;
        if (callFunctionKey.contains("getNodeProject", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getNodeProject(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNodeProject");
        }
        ;
        if (callFunctionKey.contains("getCheckRange", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getCheckRange(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCheckRange");
        }
        ;
        if (callFunctionKey.contains("getChooseCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getChooseCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getChooseCheck");
        }
        ;
        if (callFunctionKey.contains("getDrawArrow", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getDrawArrow(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDrawArrow");
        }
        ;
        if (callFunctionKey.contains("getDynamicLine_U", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getDynamicLine_U(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDynamicLine_U");
        }
        ;
        if (callFunctionKey.contains("getU_RelatedLine", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getU_RelatedLine(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getU_RelatedLine");
        }
        ;
        if (callFunctionKey.contains("getU_RelatedLine", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getU_RelatedLine(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getU_RelatedLine");
        }
        ;
        if (callFunctionKey.contains("getLinkOSGI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getLinkOSGI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getLinkOSGI");
        }
        ;
        if (callFunctionKey.contains("getNodeOSGI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getNodeOSGI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getNodeOSGI");
        }
        ;
        if (callFunctionKey.contains("_OSU_MCI_MCU_MSI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C._OSU_MCI_MCU_MSI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "_OSU_MCI_MCU_MSI");
        }
        ;
        if (callFunctionKey.contains("_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ");
        }
        ;
        if (callFunctionKey.contains("_OSU_AVQ_ASQ_OPE_OPC_ECI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_OPE_OPC_ECI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "_OSU_AVQ_ASQ_OPE_OPC_ECI");
        }
        ;
        if (callFunctionKey.contains("getUnicornJSplitPane", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getUnicornJSplitPane(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getUnicornJSplitPane");
        }
        ;
        if (callFunctionKey.contains("getUnicornSplitPaneUI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getUnicornSplitPaneUI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getUnicornSplitPaneUI");
        }
        ;
        if (callFunctionKey.contains("getUnicornScrollBarUI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getUnicornScrollBarUI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getUnicornScrollBarUI");
        }
        ;
        if (callFunctionKey.contains("getUnicornTreeCellRenderer", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getUnicornTreeCellRenderer(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getUnicornTreeCellRenderer");
        }
        ;
        if (callFunctionKey.contains("getUnicornTreeUI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getUnicornTreeUI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getUnicornTreeUI");
        }
        ;
        if (callFunctionKey.contains("getCacuString", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getCacuString(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCacuString");
        }
        ;
        if (callFunctionKey.contains("getUnicornSplitPaneUI", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getUnicornSplitPaneUI(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getUnicornSplitPaneUI");
        }
        ;
        if (callFunctionKey.contains("getCheckRangeVPS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getCheckRangeVPS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCheckRangeVPS");
        }
        ;
        if (callFunctionKey.contains("getChooseQ_VPS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getChooseQ_VPS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getChooseQ_VPS");
        }
        ;
        if (callFunctionKey.contains("getDrawArrowVPS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getDrawArrowVPS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDrawArrowVPS");
        }
        ;
        if (callFunctionKey.contains("getDrawFlashSide", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getDrawFlashSide(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDrawFlashSide");
        }
        ;
        if (callFunctionKey.contains("getDrawSinLineVPS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getDrawSinLineVPS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDrawSinLineVPS");
        }
        ;
        if (callFunctionKey.contains("getDynamicLineU_VPS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getDynamicLineU_VPS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getDynamicLineU_VPS");
        }
        ;
        if (callFunctionKey.contains("getLinkList", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getLinkList(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getLinkList");
        }
        ;
        if (callFunctionKey.contains("getLinkNode", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getLinkNode(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getLinkNode");
        }
        ;
        if (callFunctionKey.contains("getSort", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getSort(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getSort");
        }
        ;
        if (callFunctionKey.contains("getU_RelatedLineVPS", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getU_RelatedLineVPS(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getU_RelatedLineVPS");
        }
        ;
        if (callFunctionKey.contains("getOSGI_chansfer", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C.getOSGI_chansfer(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getOSGI_chansfer");
        }
        ;
        if (callFunctionKey.contains("_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapE_IDUQ_C._OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register");
        }
        ;
    }
}
