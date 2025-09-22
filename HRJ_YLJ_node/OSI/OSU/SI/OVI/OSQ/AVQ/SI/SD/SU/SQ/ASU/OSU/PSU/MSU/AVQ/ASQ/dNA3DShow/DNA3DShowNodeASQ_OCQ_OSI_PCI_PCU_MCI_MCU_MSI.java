package OSI.OSU.SI.OVI.OSQ.AVQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dNA3DShow;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;
public class DNA3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
//	JTextPane text;
//	Object[][] tableData_old;
//	public App u;
//	public Analyzer _A;
//	public Map<String, String> pos;
	
	public DNA3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
			, "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("DNA染色体 三维显示");
		AMV_MVS_VSQ= new String("HUMANOID");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public DNA3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old
		, JTextPane text, App NE) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
			, "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("DNA染色体 三维显示");
		AMV_MVS_VSQ= new String("HUMANOID");
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
		_SQ__OVQ_OSQ_VSQ= new DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new DNA3DShowOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new DNA3DShowOSU_MSQ_AOI_AOD_AOU_AOQ_VES((DNA3DShowOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI
			, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void OPE_E(JTextPane jTextPane) {
		((DNA3DShowOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext
			= ((DNA3DShowOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI
			= new DNA3DShowNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, NE);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
