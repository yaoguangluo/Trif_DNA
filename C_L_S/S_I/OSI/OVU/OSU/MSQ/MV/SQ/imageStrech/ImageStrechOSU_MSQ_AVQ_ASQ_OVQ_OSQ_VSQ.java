package S_I.OSI.OVU.OSU.MSQ.MV.SQ.imageStrech;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import ME.VPC.M.app.App;

import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ImageStrechOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ
extends OSU_OVQ_OSQ_VSQ{
	
	public JButton button;
	public String path;
	public ImageStrechOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
	}
	public void view(App NE) {
		scrollPane= new ScrollPane();
		panel=new Panel(){
			
			public void paint(Graphics g){
				Image im=(Image)lygout.image;
				g.drawImage(im, 0, 0, this);	  					}
		};	
		//
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
