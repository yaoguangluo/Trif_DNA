package OSI.OSU.SI.OSU.PEU.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.updateToEditPane;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;import ME.VPC.M.app.App;

public class UpdateToEditPaneView extends OSU_OVQ_OSQ_VSQ{

	public JButton button;
	public String path;
	public UpdateToEditPaneView(){
		super();
	}
	public void view(App NE) {
		try {
			scrollPane= new ScrollPane();
			panel= new Panel();
			panel.setBackground(Color.yellow);	
			JScrollPane j= new JScrollPane();
			tableout.setBackground(new Color(240, 128, 128));
			tableout.setPreferredSize(new Dimension(200, 800));
			tableout.setVisible(true);
			j.setViewportView(tableout);
			panel.add(j);
			scrollPane.add(panel);
			add(scrollPane);
			close= false;
		}catch(Exception e) {
		}
		
	}
	@Override
	public OSU_OVQ_OSQ_VSQ clone() {
		objectView= (OSU_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
