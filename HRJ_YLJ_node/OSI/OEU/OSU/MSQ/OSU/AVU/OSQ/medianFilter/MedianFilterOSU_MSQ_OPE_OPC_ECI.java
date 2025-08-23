package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.medianFilter;






import java.util.Vector;


import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.sound.MedianPro;


public class MedianFilterOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI
{

	public int value=0;
	public String filepath;
	public MedianFilterOSU_MSQ_OPE_OPC_ECI( )
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final MedianFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) 
	{
	  		
				 //anasys
				 MedianPro gs= new MedianPro();
				 Vector lines= gs.getVectorLines(toplygin);
				 _SQ__OVQ_OSQ_VSQ.lygout= toplygin;
	}
}
