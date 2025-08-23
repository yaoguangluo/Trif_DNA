package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.wekaPilot2D;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.*;
import java.awt.*;

public class WekaPilot2DNodeInterface extends OSU_MCI_MCU_MSI{
	public WekaPilot2DNodeInterface() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("WekaPilot2D");
		AMV_MVS_VSQ= new String("BI");
		Image img= ((ImageIcon) thisIcon).getImage();  
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ= new WekaPilot2DOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new WekaPilot2DOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new WekaPilot2DOSU_MSQ_AOI_AOD_AOU_AOQ_VES((WekaPilot2DOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void OPE_E(JTextPane jTextPane) {
		((WekaPilot2DOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((WekaPilot2DOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed=true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ()  {  
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new WekaPilot2DNodeInterface();   
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
