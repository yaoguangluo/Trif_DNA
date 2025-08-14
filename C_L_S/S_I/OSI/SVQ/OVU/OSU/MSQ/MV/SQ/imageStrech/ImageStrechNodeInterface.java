package S_I.OSI.OVU.OSU.MSQ.MV.SQ.imageStrech;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.*;
import java.awt.*;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class ImageStrechNodeInterface extends OSU_MCI_MCU_MSI{	
	public ImageStrechNodeInterface() {
		//thisIcon=new ImageIcon(this.getClass().getResource("strench.jpg"));//shaohou
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS=new String("ImageStrech");
		AMV_MVS_VSQ=new String("IMAGE");
		Image img= ((ImageIcon) thisIcon).getImage();  
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ
		=new ImageStrechOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI=new ImageStrechOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES
		=new ImageStrechOSU_MSQ_AOI_AOD_AOU_AOQ_VES((ImageStrechOSU_MSQ_OPE_OPC_ECI)
				_SQ__OPE_OPC_ECI);
		_SQ__AOU_AOQ_VES.config();
		showed=false;
	}
	public void OPE_E(JTextPane jTextPane)  {
		((ImageStrechOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((ImageStrechOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed=true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {  
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI 
		= new ImageStrechNodeInterface();   
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
