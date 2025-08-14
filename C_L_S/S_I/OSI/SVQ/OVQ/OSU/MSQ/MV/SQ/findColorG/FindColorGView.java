package S_I.OSI.OVQ.OSU.MSQ.MV.SQ.findColorG;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;import ME.VPC.M.app.App;
import java.awt.image.BufferedImage;
import javax.swing.JButton;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;

public class FindColorGView extends OSU_OVQ_OSQ_VSQ {

	public JButton button;
	public String path;
	public FindColorGView(){
		super();
	}
	public void view(App NE) {
		scrollPane= new ScrollPane();
		panel=new Panel(){

			public void paint(Graphics g){
				BufferedImage image= lygout.image;
				for (int i= 0; i < image.getHeight(); ++i) {
					for (int j= 0; j < image.getWidth(); ++j) {
						int gg= image.getRGB(j, i) >> 8 & 0xFF;
					int rr= 0;
					int bb= 0;
					int pixel= (rr << 16) | (gg << 8) | (bb);
					image.setRGB(j, i, pixel);
					}
				}
				Image im=(Image)image;
				g.drawImage(im, 0, 0, this);	  			}
		};	
		scrollPane.add(panel);
		add(scrollPane);
		close= false;
	}
	@Override
	public OSU_OVQ_OSQ_VSQ clone() {   
		objectView= (OSU_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}
}
