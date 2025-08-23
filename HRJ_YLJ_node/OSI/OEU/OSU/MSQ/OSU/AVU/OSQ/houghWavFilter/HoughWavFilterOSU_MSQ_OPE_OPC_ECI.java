package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.houghWavFilter;


import java.util.Vector;


import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.sound.*;


public class HoughWavFilterOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI
{
	
	public int value=0;
	public String filepath;
	public HoughWavFilterOSU_MSQ_OPE_OPC_ECI( )
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final HoughWavFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) 
	{
	  		
				 //anasys
		 HoughPro gs=new HoughPro();
		 Vector lines= gs.getVectorLines(topaisin);
		 topaisin= new BytestoAIS().getAIS(gs.audioData, topaisin);
				 //play
				 //new soundPlay().Play(ais1);
		 _SQ__OVQ_OSQ_VSQ.aisout=topaisin;
	}
}
