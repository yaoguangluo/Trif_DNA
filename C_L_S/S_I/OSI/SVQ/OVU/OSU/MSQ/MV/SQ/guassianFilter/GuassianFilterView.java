package S_I.OSI.OVU.OSU.MSQ.MV.SQ.guassianFilter;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;import ME.VPC.M.app.App;
import javax.swing.JButton;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;

public class GuassianFilterView extends OSU_OVQ_OSQ_VSQ {

	public JButton button;
	public String path;
	public GuassianFilterView(){
		super();
	}

	public void view(App NE) {
		scrollPane= new ScrollPane();
		panel=new Panel(){

			public void paint(Graphics g){
				Image im=(Image)lygout.image;
				g.drawImage(im, 0, 0, this);	  					}
		};	
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
