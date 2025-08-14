package S_I.OSI.OVQ.OSU.MSQ.MV.SQ.show3D;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;import ME.VPC.M.app.App;;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;

public class Show3DView extends OSU_OVQ_OSQ_VSQ{

	public JButton button;
	public String path;
	public Show3DView(){
		super();
	}
	public void view(App NE) {
		scrollPane= new ScrollPane();
		panel=new Panel();
		JScrollPane j=new JScrollPane();

		test app= new test(gout);  
		app.setPreferredSize(new Dimension(800, 500));
		app.setVisible(true);

		j.setViewportView(app);
		panel.add(j);
		scrollPane.add(panel);
		add(scrollPane);
		close=false;
	}
	@Override  
	public OSU_OVQ_OSQ_VSQ clone() {   
		objectView= (OSU_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
