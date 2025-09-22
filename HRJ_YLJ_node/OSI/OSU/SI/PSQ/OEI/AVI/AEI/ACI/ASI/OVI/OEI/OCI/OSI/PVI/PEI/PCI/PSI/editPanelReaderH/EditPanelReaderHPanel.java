package OSI.OSU.SI.PSQ.OEI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.editPanelReaderH;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
public class EditPanelReaderHPanel extends OSU_AOU_AOQ_VES{

	private JTextPane textTemp;
	public EditPanelReaderHPanel(final EditPanelReaderHRun _SQ__OPE_OPC_ECI, JTextPane text){
		this.textTemp= text;
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
		JButton readfile= new JButton("读取编辑页");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {		
				try {
					textPane= textTemp.getText();
					if(textPane.equalsIgnoreCase("")) {
						return;
					}
					String[] textsPane= textPane.split("!");
					textsPane= textsPane[textsPane.length - 1].split(";");
					Map<Integer, String> medcine= new IMV_SIQ();
					int i1= 0;
					for(int i= 0; i < textsPane.length; i++) {
						if(textsPane[i].split("/").length > 1) {
							medcine.put(i1++, textsPane[i]);
						}
					}
					String[][] content= new String[medcine.size()][2];
					String[] spec= new String[] {"String", "String"};
					for(int i= 0; i< medcine.size(); i++) {
						String temp= medcine.get(i).toString();
						content[i][0]= temp.split("/")[0].replace("\r\n\r\n", "").replace(" ", "");
						content[i][1]= temp.split("/")[1].replace("g", "");
					}
					_SQ__OPE_OPC_ECI.toptablein= new JTable(content, spec);
					_SQ__OPE_OPC_ECI.toptablein.setBounds(0, 100, 400, 400);
					_SQ__OPE_OPC_ECI.toptablein.setVisible(true);
				}catch(Exception e) {		
				}
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close=false;
		
	}
	public void config(){
		System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG); 
	}
}
