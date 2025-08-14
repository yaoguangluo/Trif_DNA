package S_I.OSI.OVU.OSU.MSQ.MV.SQ.imageStrech;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import P.image.Strech;
import U_A.PEU.P.movie.LYGFileIO;
public class ImageStrechOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {

	public int value=0;
	public String filepath;
	public ImageStrechOSU_MSQ_OPE_OPC_ECI( ) {
	}
	public void run(final ImageStrechOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ 
			_SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+value);   
		_SQ__OVQ_OSQ_VSQ.lygout=new LYGFileIO();
		_SQ__OVQ_OSQ_VSQ.lygout.image
		=Strech.P(this.toplygin.image, 0.1, 0.9);
	}
}
