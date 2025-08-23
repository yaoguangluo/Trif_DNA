package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addPGSearchPage;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.C.skivvy.MakeContainerYXTP;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;
import S_A.pheromone.IMV_SIQ;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Container;
import java.awt.Image;
import java.util.List;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * * 作者的家庭是父亲 罗荣武，母亲 刘瑞珍，女儿 christina.yaja.luo/罗雅佳, 前妻ringli/李妙环。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class AddPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
		extends OSU_MCI_MCU_MSI {
	MakeContainerYXTP c4;// test first, later all in osgi again. trif

	public AddPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg",
				"DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("图片搜索节点");
		AMV_MVS_VSQ = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();
		Image newimg = img.getScaledInstance(30, 30,
				java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisIcon = new ImageIcon(newimg);
		//
	}

	public AddPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(
			Object[][] tableData_old, JTextPane text, App_S u,
			CogsBinaryForest_AE _A, IMV_SIQ pos) {
		this.text = text;
		this.tableData_old = tableData_old;
		thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg",
				"DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("图片搜索节点");
		AMV_MVS_VSQ = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();
		Image newimg = img.getScaledInstance(30, 30,
				java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisIcon = new ImageIcon(newimg);
		//
		this.u = u;
		this._A = _A;
		this.pos = pos;
	}

	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ = new AddPGSearchPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI = new AddPGSearchPageOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES = new AddPGSearchPageOSU_MSQ_AOI_AOD_AOU_AOQ_VES(
				(AddPGSearchPageOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI,
				this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed = false;
	}

	public void IMP_PSU(App NE) {
		Container jpanelFourth = new Container();
		c4 = new MakeContainerYXTP(jpanelFourth, u.tabNames, NE);
		c4.start();
		DetaThread.sleepDeta(2000);
		u.jTabbedpane.validate();
	}

	public void AOP_VEC_SQ(JTextPane rightBotJTextPane, String input, App NE) {
		c4.AOP_VEC_SQ(input, NE);
	}

	public void AOP_VEC_SQ_PDE(JTextPane rightBotJTextPane,
			List<String> pathRankList) {
		c4.AOP_VEC_SQ_PDE(pathRankList);
	}

	public void OPE_E(JTextPane jTextPane) {
		((AddPGSearchPageOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run(
				(AddPGSearchPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}

	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE) {
		((AddPGSearchPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A = _A;
		((AddPGSearchPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u = u;
		((AddPGSearchPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos = pos;
		((AddPGSearchPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext = ((AddPGSearchPageOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed = true;
	}

	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new AddPGSearchPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(
				this.tableData_old, this.text, this.u, this._A, this.pos);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
	}
}
