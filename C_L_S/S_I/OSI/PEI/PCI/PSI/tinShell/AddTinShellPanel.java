package S_I.OSI.PEI.PCI.PSI.tinShell;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;

import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Panel;
import java.awt.ScrollPane;
@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class AddTinShellPanel extends OSU_AOU_AOQ_VES {
	
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public AddTinShellPanel(final AddTinShellRun _SQ__OPE_OPC_ECI, JTextPane text
			, Object[][] tableData_old){
		this.textTemp= text;
		this.tableData_old= tableData_old;
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel= new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
//		ShellJPanel ShellJPanel= new ShellJPanel(HRJFrame.NE);
//		
//		scrollPane.add(ShellJPanel);
		close=false;
	}
	public void config(){
		//20230106-System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG); 
	}
}
