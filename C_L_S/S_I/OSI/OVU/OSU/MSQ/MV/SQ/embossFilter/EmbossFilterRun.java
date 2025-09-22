package S_I.OSI.OVU.OSU.MSQ.MV.SQ.embossFilter;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import P.image.Emboss;

public class EmbossFilterRun extends OSU_OPE_OPC_ECI {

	public int value=0;
	public String filepath;
	public EmbossFilterRun( ) {	
		super();
	}
	public void run(final EmbossFilterView _SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+value); 
		//_SQ__OVQ_OSQ_VSQ.path=new String(filepath); 
		int out[][]= new int[topgin.length][topgin[0].length];
		for (int i= 0; i < topgin.length; i++) {
			for (int j= 0; j < topgin[0].length; j++) 
			{
				out[i][j]=topgin[i][j];
			}
		}		    	
		out= Emboss.P(out);
		//gin= new Strech().P(out, 0.1, 0.9);
		_SQ__OVQ_OSQ_VSQ.gout=out;	
	}
}
