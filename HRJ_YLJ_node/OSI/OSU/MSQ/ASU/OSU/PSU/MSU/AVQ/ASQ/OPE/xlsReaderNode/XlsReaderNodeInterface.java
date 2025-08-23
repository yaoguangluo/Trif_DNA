package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.xlsReaderNode;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.*;
import java.awt.*;

//作者 +著作权人： 罗瑶光, 浏阳
/*
* 著作权人, 作者 罗瑶光, 浏阳
* yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
* 15116110525-
* 430181198505250014, G24402609, EB0581342
* 204925063, 389418686, F2406501, 0626136
* 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
* */
public class XlsReaderNodeInterface extends OSU_MCI_MCU_MSI {

	public XlsReaderNodeInterface() {
		// thisIcon= new
		// ImageIcon(this.getClass().getResource("image.jpg"));
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-02-00");
		thisIcon = FastReadProjectFile.getDetaImageIconReader("image.jpg",
				"DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("XlsReader");
		AMV_MVS_VSQ = new String("BI");
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-02-01");
		Image img = ((ImageIcon) thisIcon).getImage();
		Image newimg = img.getScaledInstance(30, 30,
				java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisIcon = new ImageIcon(newimg);
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01-02-02");
	}

	// config 元基节点配置// 因为 节点更新加入cavas的消息对象 和validation,
	// 已经集成的节点都修正下.
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ = new XlsReaderOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI = new XlsReaderOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES = new XlsReaderOSU_MSQ_AOI_AOD_AOU_AOQ_VES(
				(XlsReaderOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI);
		_SQ__AOU_AOQ_VES.config();
		showed = false;
	}

	// execute 元基节点执行
	public void OPE_E(JTextPane jTextPane) {
		((XlsReaderOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI)
				.run((XlsReaderOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}

	// execute 元基节点查阅
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE) {
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed = true;
	}

	// execute 元基节点复制
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new XlsReaderNodeInterface();
		// this.MEI_MSU(null, null);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
	}
}
