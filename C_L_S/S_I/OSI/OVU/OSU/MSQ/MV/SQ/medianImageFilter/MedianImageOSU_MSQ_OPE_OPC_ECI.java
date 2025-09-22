package S_I.OSI.OVU.OSU.MSQ.MV.SQ.medianImageFilter;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import P.image.Median;
import U_A.PEU.P.movie.LYGFileIO;
public class MedianImageOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {

	public int value=0;
	public String filepath;
	public MedianImageOSU_MSQ_OPE_OPC_ECI( ) {	
 	}
	public void run(final MedianImageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ 
			_SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+value);   
		_SQ__OVQ_OSQ_VSQ.lygout=new LYGFileIO();
	    _SQ__OVQ_OSQ_VSQ.lygout.image
	   =Median.P(this.toplygin.image, 3, 3);
	}
}
