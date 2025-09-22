package OSI.OSU.SI.OVI.OSQ.AVQ.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.chuFangDNN3DShow;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;
//该节点所有java文件等，作者 罗瑶光，浏阳，因为当年是仿照 knime的结点结构， 就不涉及著作权了。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class ChuFangDNN3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
//	JTextPane text;
//	Object[][] tableData_old;
//	public App u;
//	public Analyzer _A;
//	public Map<String, String> pos;
	
	public ChuFangDNN3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
			, "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("处方DNN功效计算三维显示");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public ChuFangDNN3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old
		, JTextPane text, App NE) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
			, "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("处方DNN功效计算三维显示");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
		this.u= NE.app_S;
		this._A= NE.app_S._A;
		this.pos= NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ= new ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new ChuFangDNN3DShowOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new ChuFangDNN3DShowOSU_MSQ_AOI_AOD_AOU_AOQ_VES((ChuFangDNN3DShowOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void OPE_E(JTextPane jTextPane) {
		((ChuFangDNN3DShowOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((ChuFangDNN3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext= ((ChuFangDNN3DShowOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new ChuFangDNN3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, NE);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
