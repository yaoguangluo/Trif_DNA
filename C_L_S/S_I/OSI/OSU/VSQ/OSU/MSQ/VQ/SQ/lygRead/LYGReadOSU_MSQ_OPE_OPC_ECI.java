package S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygRead;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.movie.LYGFileIO;

public class LYGReadOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {

	public int value= 0;
	public String filepath;
	public LYGReadOSU_MSQ_OPE_OPC_ECI(){
 	}
	public void run(final LYGReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) {
		toplygin= new LYGFileIO();
		toplygin.reset();
		toplygin.lygRead(filepath);
		//IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg");
		toplygin.IV_();
	    _SQ__OVQ_OSQ_VSQ.lygout=toplygin;
	    //20230106-System.out.println("run end");
	}
}
