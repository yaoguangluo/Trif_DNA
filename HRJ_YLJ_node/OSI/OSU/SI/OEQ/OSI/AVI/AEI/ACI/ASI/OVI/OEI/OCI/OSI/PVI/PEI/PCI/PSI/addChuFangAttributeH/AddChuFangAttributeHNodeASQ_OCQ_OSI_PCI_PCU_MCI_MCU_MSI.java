package OSI.OSU.SI.OEQ.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addChuFangAttributeH;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.*;
import java.awt.*;

public class AddChuFangAttributeHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{
	public AddChuFangAttributeHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text)
			{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("处方药重要属性补充");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	
	public AddChuFangAttributeHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("处方药重要属性补充");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	
	
	
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ= new AddChuFangAttributeHView();
		_SQ__OPE_OPC_ECI= new AddChuFangAttributeHRun();
		_SQ__AOU_AOQ_VES= new AddChuFangAttributeHPanel(
				(AddChuFangAttributeHRun) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void OPE_E(JTextPane jTextPane)  {
		((AddChuFangAttributeHRun) _SQ__OPE_OPC_ECI)
		.run((AddChuFangAttributeHView) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() 
			{
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI
		= new AddChuFangAttributeHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
