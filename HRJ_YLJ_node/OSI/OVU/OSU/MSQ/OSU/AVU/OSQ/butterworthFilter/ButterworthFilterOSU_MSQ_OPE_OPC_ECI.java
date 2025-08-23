package OSI.OVU.OSU.MSQ.OSU.AVU.OSQ.butterworthFilter;


import java.util.Vector;

import javax.sound.sampled.AudioInputStream;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.sound.*;

public class ButterworthFilterOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {
	
	public int value=0;
	public String filepath;
	public ButterworthFilterOSU_MSQ_OPE_OPC_ECI( ) {
	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final ButterworthFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) {
		//anasys
		ButterworthPro Bs= new ButterworthPro();
		Vector lines= Bs.getVectorLines(topaisin);
		topaisin= new BytestoAIS().getAIS(Bs.butterworth, topaisin);
		AudioInputStream cp= new BytestoAIS().getAIS(Bs.butterworth, topaisin);
		_SQ__OVQ_OSQ_VSQ.aisout=cp;
	}
}
