package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYZDBook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;
import S_A.SVQ.stable.S_ShellETL;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class AddZYZDBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AOU_AOQ_VES {

	private JTextPane textTemp;
	private Object[][] tableData_old;
	public String DNNtext;
	public AddZYZDBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final AddZYZDBookOSU_MSQ_OPE_OPC_ECI _SQ__OPE_OPC_ECI, JTextPane text
			, Object[][] tableData_old){
		this.textTemp= text;
		this.tableData_old= tableData_old;
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel= new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button= new JButton(S_ShellETL.SHELL_ETL_FINISH);
		button.setBounds(0, 0, 150, 30);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(e.getSource());
				close= true;
				_SQ__OPE_OPC_ECI.value= 1;
			}
		});
		panel.add(button);
		JButton readfile= new JButton("处方DNN配置生成");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					DNNtext= "";
					for(int i= 0; i< _SQ__OPE_OPC_ECI.toptablein.getRowCount(); i++) {
						if(i< 20
								&& null!= _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 0)) {
							DNNtext+= " "+ _SQ__OPE_OPC_ECI.toptablein.getValueAt(i, 0).toString();
						}
					}
				}catch(Exception e) {		
				}
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close= false;
		
	}
	public void config(){
		System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG); 
	}
}
