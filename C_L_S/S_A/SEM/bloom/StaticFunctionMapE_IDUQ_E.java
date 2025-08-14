package S_A.SEM.bloom;

import C_A.ME.analysis.C.A;
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
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;import ME.VPC.M.app.App;;
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
import OSI.OPE.OVU.PQE.flash.GUISample;

import javax.swing.JTextPane;
import java.awt.PopupMenu;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapE_IDUQ_E implements StaticFunctionMapE_IDUQ_C{
	public IMV_SIQ annotationMap= new IMV_SIQ();
	@Override
	public NodeInfo getNodeInfo(App NE)  {
		return new NodeInfo();
	}

	@Override
	public NodeProject getNodeProject(App NE)  {
		
		return new NodeProject();
	}

	@Override
	public CheckRange getCheckRange(App NE) {
		
		return new CheckRangeVPS();
	}

	@Override
	public ChooseCheck getChooseCheck(App NE) {
		
		return new ChooseQ_VPS();
	}

	@Override
	public DrawArrow getDrawArrow(App NE) {
		return new DrawArrowVPS();
	}

	@Override
	public DynamicLine_U getDynamicLine_U(App NE) {
		return new DynamicLineU_VPS();
	}

	@Override
	public U_RelatedLine getU_RelatedLine(App NE) {
		return new U_RelatedLineVPS();
	}

	@Override
	public LinkOSGI getLinkOSGI(App NE) {
		return new LinkOSGI();
	}

	@Override
	public NodeOSGI getNodeOSGI(App NE) {
		return new NodeOSGI();
	}

	@Override
	public OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI(App NE) {
		return new OSU_MCI_MCU_MSI();
	}

	@Override
	public OSU_OVQ_OSQ_VSQ _OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ(App NE) {
		return new OSU_OVQ_OSQ_VSQ();
	}
	@Override
	public OSU_OPE_OPC_ECI _OSU_AVQ_ASQ_OPE_OPC_ECI(App NE) {
		return new OSU_OPE_OPC_ECI();
	}

	@Override
	public UnicornJSplitPane getUnicornJSplitPane(App NE) {
		return new UnicornJSplitPane();
	}

	@Override
	public UnicornScrollBarUI getUnicornScrollBarUI(App NE) {
		return new UnicornScrollBarUI();
	}

	@Override
	public UnicornSplitPaneUI getUnicornSplitPaneUI(App NE) {
		return new UnicornSplitPaneUI();
	}

	@Override
	public UnicornTreeCellRenderer getUnicornTreeCellRenderer(App NE) {
		return new UnicornTreeCellRenderer();
	}

	@Override
	public UnicornTreeUI getUnicornTreeUI(App NE) {
		return new UnicornTreeUI();
	}

	@Override
	public CacuString getCacuString(App NE) {
		return new CacuString();
	}

	@Override
	public NodeShow getNodeShow(App NE) {
		GUISample gUISample= NE._I_U.gUISample;
		Object[][] tableData_old= NE._I_U.tableData_old;
		JTextPane text= NE._I_U.text;
		PopupMenu popupMenu= NE._I_U.popupMenu;
		App app= NE._I_U.app;
		A _A= NE._I_U._A;
		IMV_SIQ pos= NE._I_U.pos;
		return new NodeShow(gUISample, tableData_old, text, popupMenu, NE);
	}

	@Override
	public CheckRangeVPS getCheckRangeVPS(App NE) {
		return new CheckRangeVPS();
	}

	@Override
	public ChooseQ_VPS getChooseQ_VPS(App NE) {
		return new ChooseQ_VPS();
	}

	@Override
	public DrawArrowVPS getDrawArrowVPS(App NE) {
		return new DrawArrowVPS();
	}

	@Override
	public DrawFlashSide getDrawFlashSide(App NE) {
		return new DrawFlashSide();
	}

	@Override
	public DrawSinLineVPS getDrawSinLineVPS(App NE) {
		return new DrawSinLineVPS();
	}

	@Override
	public DynamicLineU_VPS getDynamicLineU_VPS(App NE) {
		return new DynamicLineU_VPS();
	}

	@Override
	public LinkList getLinkList(App NE) {
		return new LinkList();
	}

	@Override
	public LinkNode getLinkNode(App NE) {
		return new LinkNode();
	}

	@Override
	public Sort getSort(App NE) {//稍后
		return null;
	}

	@Override
	public U_RelatedLineVPS getU_RelatedLineVPS(App NE) {
		return new U_RelatedLineVPS();
	}

	@Override
	public OSGI_chansfer getOSGI_chansfer(App NE) {
		LinkNode node= NE._I_U.node;
		LinkNode first= NE._I_U.first;
		return new OSGI_chansfer(node, first);
	}

	@Override
	public OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register
	_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(App NE) {
		Object[][] tableData_old = NE._I_U.tableData_old;
		JTextPane text = NE._I_U.text;
		App app=NE._I_U.app;
		A _A=NE._I_U._A;
		IMV_SIQ pos=NE._I_U.pos;
		return new OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(tableData_old, text, NE);
	}
}
