package OSI.OSU.SI.PSQ.OEI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.editPanelReaderH;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.*;
import java.awt.*;

public class EditPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{
	public EditPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(JTextPane text) {
		this.text= text;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("读取编辑页处方生成列");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();  
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	public EditPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("读取编辑页处方生成列");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();  
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	public void MEI_MSU(JTextPane rightBotJTextPane, ThisCanvas canvas) {
		try {
			_SQ__OVQ_OSQ_VSQ= new EditPanelReaderHView();
			_SQ__OPE_OPC_ECI= new EditPanelReaderHRun();
			_SQ__AOU_AOQ_VES= new EditPanelReaderHPanel((EditPanelReaderHRun) _SQ__OPE_OPC_ECI, this.text);
			_SQ__AOU_AOQ_VES.config();
			showed= false;
		}catch(Exception e1) {
			rightBotJTextPane.setText("<读取编辑页处方生成列> 节点配置失败请注意是否链接正确。");
			rightBotJTextPane.validate();
		} 
	}
	public void OPE_E(JTextPane rightBotJTextPane) {
		try {
			((EditPanelReaderHRun) _SQ__OPE_OPC_ECI).run((EditPanelReaderHView) _SQ__OVQ_OSQ_VSQ);
		}catch(Exception e1) {
			rightBotJTextPane.setText("<读取编辑页处方生成列> 节点运行失败请注意是否配置正确。");
			rightBotJTextPane.validate();
		} 
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane rightBotJTextPane, App NE) {
		try {
			_SQ__OVQ_OSQ_VSQ.view(NE);
			showed= true;
		}catch(Exception e1) {
			rightBotJTextPane.setText("<读取编辑页处方生成列> 节点查看失败请注意是否运行正确。");
			rightBotJTextPane.validate();
		} 
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new EditPanelReaderHNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.text);   
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
