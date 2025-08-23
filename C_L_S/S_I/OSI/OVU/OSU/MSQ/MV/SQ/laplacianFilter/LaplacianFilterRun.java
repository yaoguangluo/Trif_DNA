package S_I.OSI.OVU.OSU.MSQ.MV.SQ.laplacianFilter;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import P.image.Laplacian;

public class LaplacianFilterRun extends OSU_OPE_OPC_ECI {
	
	public int value=0;
	public String filepath;
	public LaplacianFilterRun( ) {
		super();
	}
	public void run(final LaplacianFilterView _SQ__OVQ_OSQ_VSQ)
			{
		//20230106-System.out.println("runed"+value); 
		//_SQ__OVQ_OSQ_VSQ.path=new String(filepath); 
		int out[][]= new int[topgin.length][topgin[0].length];
		for (int i= 0; i < topgin.length; i++) {
			for (int j= 0; j < topgin[0].length; j++) {
				out[i][j]=topgin[i][j];
			}
		}		    	
		out= Laplacian.P(out);
		_SQ__OVQ_OSQ_VSQ.gout=out;
	}
}
