package S_A.SEM.bloom;

import OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.CheckRange;
import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.ChooseCheck;
import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.DrawArrow;
import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.DynamicLine_U;
import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.Sort;
import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.U_RelatedLine;
import OPE.OEQ.MCQ.OVU.PQE.osgi.LinkOSGI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.NodeOSGI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import ME.VPC.M.app.App;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornSplitPaneUI;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeCellRenderer;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeUI;
import OPE.OVU.MVQ.OVU.PQE.nodeView.CacuString;
import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.CheckRangeVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.ChooseQ_VPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawArrowVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawFlashSide;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawSinLineVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DynamicLineU_VPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;
import OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer;
import OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapE_IDUQ_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    //etl engine
    public NodeInfo getNodeInfo(App NE);

    public NodeProject getNodeProject(App NE);

    public CheckRange getCheckRange(App NE);

    public ChooseCheck getChooseCheck(App NE);

    public DrawArrow getDrawArrow(App NE);

    public DynamicLine_U getDynamicLine_U(App NE);

    public U_RelatedLine getU_RelatedLine(App NE);

    public LinkOSGI getLinkOSGI(App NE);

    public NodeOSGI getNodeOSGI(App NE);

    //	public OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES _OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES(App NE);// protected
    public OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI(App NE);

    public OSU_OVQ_OSQ_VSQ _OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ(App NE);

    public OSU_OPE_OPC_ECI _OSU_AVQ_ASQ_OPE_OPC_ECI(App NE);
    //DrawArrowHead
    //DrawNeroCellMask31
    //DrawNeroCellMask32
    //DrawNeroCellMask33

    public UnicornJSplitPane getUnicornJSplitPane(App NE);

    public UnicornScrollBarUI getUnicornScrollBarUI(App NE);

    public UnicornSplitPaneUI getUnicornSplitPaneUI(App NE);

    public UnicornTreeCellRenderer getUnicornTreeCellRenderer(App NE);

    public UnicornTreeUI getUnicornTreeUI(App NE);

    public CacuString getCacuString(App NE);

    public NodeShow getNodeShow(App NE);

    public CheckRangeVPS getCheckRangeVPS(App NE);

    public ChooseQ_VPS getChooseQ_VPS(App NE);

    public DrawArrowVPS getDrawArrowVPS(App NE);

    public DrawFlashSide getDrawFlashSide(App NE);

    public DrawSinLineVPS getDrawSinLineVPS(App NE);

    public DynamicLineU_VPS getDynamicLineU_VPS(App NE);

    public LinkList getLinkList(App NE);

    public LinkNode getLinkNode(App NE);

    public Sort getSort(App NE);

    public U_RelatedLineVPS getU_RelatedLineVPS(App NE);

    public OSGI_chansfer getOSGI_chansfer(App NE);

    public OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register
    _OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(App NE);
}
