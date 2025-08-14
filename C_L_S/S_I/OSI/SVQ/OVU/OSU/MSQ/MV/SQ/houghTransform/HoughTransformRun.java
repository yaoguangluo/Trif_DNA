package S_I.OSI.OVU.OSU.MSQ.MV.SQ.houghTransform;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.image.*;
public class HoughTransformRun extends OSU_OPE_OPC_ECI {

	public int value=0;
	public String filepath;
	public HoughTransformRun( ) {	
		super();
	}
	public void run(final HoughTransformView _SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+value); 
		int out[][]= new int[topgin.length][topgin[0].length];
		for (int i= 0; i < topgin.length; i++) {
			for (int j= 0; j < topgin[0].length; j++) {
				out[i][j]=topgin[i][j];
			}
		}		
		RegionGet thisfile=new RegionGet(out);
		int []region=thisfile.new_region;
		HoughTransform ht= new HoughTransform();
		ht.IV_HTMatrix(out);
		for(int i=1;i<region.length;i++){
			ht.HoughTransformLoop(out, region[i], 1);
		}
		_SQ__OVQ_OSQ_VSQ.gout=ht.HTMatrix;
	}
}
