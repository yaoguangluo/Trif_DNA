package S_I.OSI.OVQ.OSU.MSQ.MV.SQ.show3D;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;

public class Show3DRun extends OSU_OPE_OPC_ECI {
	
	public int value= 0;
	public String filepath;
	public Show3DRun() {
		super();
 	}
	public void run(final Show3DView _SQ__OVQ_OSQ_VSQ) {
		//20230106-System.out.println("runed"+value); 
  		//_SQ__OVQ_OSQ_VSQ.path=new String(filepath); 
	 	  int out[][]= new int[topgin.length][topgin[0].length];
	       for (int i= 0; i < topgin.length; i++) {
	           for (int j= 0; j < topgin[0].length; j++)  {
	            out[i][j]=topgin[i][j];
	           }
	       }		    	
		//gin= new Strech().P(out, 0.1, 0.9);
		_SQ__OVQ_OSQ_VSQ.gout=out;
	  //_SQ__OVQ_OSQ_VSQ.out=new JTable(content, spec);
		  //_SQ__OVQ_OSQ_VSQ.out=new JTable(content, spec);
	}
}
