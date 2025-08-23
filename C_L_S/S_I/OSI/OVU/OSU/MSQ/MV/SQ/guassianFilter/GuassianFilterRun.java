package S_I.OSI.OVU.OSU.MSQ.MV.SQ.guassianFilter;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import P.image.Guassian;
import U_A.PEU.P.movie.LYGFileIO;
public class GuassianFilterRun extends OSU_OPE_OPC_ECI{
	
	public int value=0;
	public String filepath;
	public GuassianFilterRun( ) {	
		super();
 	}
	
	public void run(final GuassianFilterView _SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+value); 
		_SQ__OVQ_OSQ_VSQ.lygout=new LYGFileIO();
	    _SQ__OVQ_OSQ_VSQ.lygout.image= Guassian.P(toplygin.image, 3.0, 3.0, 1.6);
	}
}
