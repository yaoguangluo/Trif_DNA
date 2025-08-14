package S_I.OSI.OVU.OSU.MSQ.MV.SQ.sobelFilter;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import P.image.Mask;
import P.image.Sobel;
import P.image.Threshold_X_P;

public class SobelFilterOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {
	
	public int value=0;
	public String filepath;
	public SobelFilterOSU_MSQ_OPE_OPC_ECI( ) {
	}
	public void run(final SobelFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ 
			_SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+value); 
		//_SQ__OVQ_OSQ_VSQ.path=new String(filepath); 
		int[][] mag= Sobel.P(topgin, 1);	    //1 for mag 2 for dir
		int[][] dir= Sobel.P(topgin, 2);
		mag= Threshold_X_P.P(mag, 12);      //bina value= 20
		dir= Mask.P(mag, dir);           // mag as mask
		topgin=dir;
		_SQ__OVQ_OSQ_VSQ.gout=topgin;
		//_SQ__OVQ_OSQ_VSQ.out=new JTable(content, spec);
		//_SQ__OVQ_OSQ_VSQ.out=new JTable(content, spec);
	}
}
