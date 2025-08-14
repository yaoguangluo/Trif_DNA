package S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygRead;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;

import java.awt.Color;
public class LYGReadOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AOU_AOQ_VES
{

	private FileDialog filedialog;
	public LYGReadOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final LYGReadOSU_MSQ_OPE_OPC_ECI _SQ__OPE_OPC_ECI)
	{
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel=new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button= new JButton("Finish");
		button.setBounds(0, 0, 100, 30);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	//20230106-System.out.println(e.getSource());
                	close=true;
                	_SQ__OPE_OPC_ECI.value=1;
            }
        });   
		panel.add(button);
		JButton readfile= new JButton("Read lyg");
		readfile.setBounds(0, 35, 100, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog=new FileDialog(new Frame(), "filechoose", FileDialog.LOAD);
				 filedialog.setVisible(true);
				 _SQ__OPE_OPC_ECI.filepath=filedialog.getDirectory()+filedialog.getFile();
			     //20230106-System.out.println(_SQ__OPE_OPC_ECI.filepath);

				}
			});
		panel.add(readfile);
		scrollPane.add(panel);
		close=false;
 	}
	public void config()
	{    
		//20230106-System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG);       
	}
}
