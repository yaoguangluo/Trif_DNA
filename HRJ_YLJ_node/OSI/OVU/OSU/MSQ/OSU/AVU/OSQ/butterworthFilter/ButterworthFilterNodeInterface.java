package OSI.OVU.OSU.MSQ.OSU.AVU.OSQ.butterworthFilter;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.*;
import java.awt.*;

public class ButterworthFilterNodeInterface extends OSU_MCI_MCU_MSI{
	public ButterworthFilterNodeInterface() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=new String("ButterworthFilter");
		AMV_MVS_VSQ=new String("SOUND");
		Image img= ((ImageIcon) thisIcon).getImage();  
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
 	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ=new ButterworthFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI=new ButterworthFilterOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES
		=new ButterworthFilterOSU_MSQ_AOI_AOD_AOU_AOQ_VES((ButterworthFilterOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI);
		_SQ__AOU_AOQ_VES.config();
		showed=false;
	}
	public void OPE_E(JTextPane jTextPane)  {
		((ButterworthFilterOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI)
		.run((ButterworthFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed=true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ()  {  
	        _SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new ButterworthFilterNodeInterface();   
	        return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
