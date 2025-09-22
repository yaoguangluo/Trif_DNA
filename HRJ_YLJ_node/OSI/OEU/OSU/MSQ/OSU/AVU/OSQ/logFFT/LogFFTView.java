package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.logFFT;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;


import java.awt.Panel;
import java.awt.ScrollPane;


import java.util.Vector;

import javax.swing.JButton;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import U_A.PEU.P.sound.SoundWaveVector;
public class LogFFTView extends OSU_OVQ_OSQ_VSQ
{

	public JButton button;
	public String path;
	@SuppressWarnings("rawtypes")
	public Vector lines= new Vector();
	public LogFFTView()
	{
 	}
	public void view() 
	{
		scrollPane= new ScrollPane();
		//show graph
		SoundWaveVector sv= new SoundWaveVector();
		lines= sv.getVectorLines(lygout);

		panel=new Panel()
		{


			@SuppressWarnings("unused")
			public void paint(Graphics g) {

		     	  Dimension d= this.getSize();
		          int w= 1024;
		          int h= 600;
		         // System.out.println(d.width+"**"+d.height);
		          int INFOPAD= 15;
		          //Graphics g= getGraphics();  
		          Graphics2D g2= (Graphics2D) g;
		          g2.setBackground(Color.white);
		          g2.clearRect(0, 0, w, h);
		          g2.setColor(Color.white);
		          g2.fillRect(0, h-INFOPAD, w, INFOPAD);
		          if (lygout != null) {
	                  // .. render sampling graph ..
	                
	                  for (int i= 1; i < lygout.adataFrame.logfftarray[0].length; i++)
	                  {
	                	  //for (int j= 1; i < lygout.adataFrame.logfftarray[i].length; i++)
		                  {  
	                	  
	                	  g2.setColor(Color.black);
	                	  g2.drawLine((i-1), 300-(int)lygout.adataFrame.logfftarray[0][i-1],
	                			          i, 300-(int)lygout.adataFrame.logfftarray[0][i]);
	                	  
		                  }
	                  
	                  }
	              }
		     }
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
