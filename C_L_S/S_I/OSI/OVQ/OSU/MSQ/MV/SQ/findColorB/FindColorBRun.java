package S_I.OSI.OVQ.OSU.MSQ.MV.SQ.findColorB;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.movie.LYGFileIO;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class FindColorBRun extends OSU_OPE_OPC_ECI{

	public int value= 0;
	public String filepath;
	public FindColorBRun() {	
		super();
 	}
	public void run(final FindColorBView _SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+ value); 
		_SQ__OVQ_OSQ_VSQ.path= new String(filepath);
		BufferedImage image= null;
		try {
			image = ImageIO.read(new File(filepath));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		_SQ__OVQ_OSQ_VSQ.lygout= new LYGFileIO();
	    _SQ__OVQ_OSQ_VSQ.lygout.image= image;
	}
}
