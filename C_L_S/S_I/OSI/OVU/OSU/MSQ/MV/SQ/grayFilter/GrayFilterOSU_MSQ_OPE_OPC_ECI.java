package S_I.OSI.OVU.OSU.MSQ.MV.SQ.grayFilter;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.image.*;
public class GrayFilterOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {

	public int value=0;
	public String filepath;
	public GrayFilterOSU_MSQ_OPE_OPC_ECI( ) {
 	}
	public void run(final GrayFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ)
			{
		//20230106-System.out.println("runed"+value);   
		topgin=new ReadWritePng().GRNpngRead(toplygin.image);
		_SQ__OVQ_OSQ_VSQ.gout=topgin;	
	}
}
