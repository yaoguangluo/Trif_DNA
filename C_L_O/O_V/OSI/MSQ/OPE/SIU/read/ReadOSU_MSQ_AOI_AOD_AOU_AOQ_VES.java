/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package O_V.OSI.MSQ.OPE.SIU.read;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;
import S_A.SVQ.stable.S_Annotation;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Frame;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ReadOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AOU_AOQ_VES {

	public JLabel labelWords;
	public String fileCurrentpath= "";
	public JTextField filterWords;
	public ReadOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final ReadOSU_MSQ_OPE_OPC_ECI _SQ__OPE_OPC_ECI, ThisCanvas canvas){
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel= new Panel();
		panel.setLayout(null);
		
		panel.setBackground(Color.white);
		JButton button= new JButton("确定");
		button.setBounds(0, 120, 150, 30);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	//20230106-System.out.println(e.getSource());
                	close= true;
                	_SQ__OPE_OPC_ECI.value= 1;
                	_SQ__OPE_OPC_ECI.searchString= filterWords.getText();
                	String value= labelWords.getText();
                	_SQ__OPE_OPC_ECI.addressString= value;
                	}
        });   
		panel.add(button);
		
		labelWords= new JLabel("Null");
		labelWords.setBounds(155, 0, 100, 30);
		panel.add(labelWords);
		
		JButton buttonRoot= new JButton("选择搜索根目录");
		buttonRoot.setBounds(0, 0, 150, 30);
		buttonRoot.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	//20230106-System.out.println(e.getSource());
            	String fileCurrentpath= "";
//        		javax.swing.JOptionPane jOptionPane= new JOptionPane(S_Data.ATTENSION_SELECT_ENSURE
//        				+ fileCurrentpath+ S_Data.MARK_QUESTION);
//				int confirm= jOptionPane.showConfirmDialog(canvas, S_Data.ATTENSION_SELECT_ENSURE
//        				+ fileCurrentpath+ S_Data.MARK_QUESTION);
//				FileDialog filedialog= new FileDialog(new Frame(), S_Data.ATTENSION_LOAD_HISTORY
//						, FileDialog.LOAD);
//				filedialog.setFilenameFilter(new TXTFilter(S_Data.FILE_FORMAT_ETL));
//				filedialog.setVisible(true);
//				fileCurrentpath= filedialog.getDirectory();
					JFileChooser jFileChooser= new JFileChooser();
				jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				jFileChooser.setFileHidingEnabled(false);
				jFileChooser.showDialog(new Frame(), S_Annotation.ATTENSION_SELECT_ENSURE);
				File file= jFileChooser.getSelectedFile();
				fileCurrentpath= file.getAbsolutePath();
	        		//20230106-System.out.println(fileCurrentpath);
        		labelWords.setText(fileCurrentpath);
            }
        });   
		panel.add(buttonRoot);
		
		filterWords= new JTextField("请在此输入需要搜索的内容！");
		filterWords.setBounds(0, 35, 220, 70);
		panel.add(filterWords);
		
		scrollPane.add(panel);
		close= false;
 	}
	public void config(){    
		//20230106-System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG);       
	}
}
