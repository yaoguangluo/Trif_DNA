package S_I.OSI.OVU.OSU.MSQ.MV.SQ.morphologyFilter;



import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;

public class MorphologyFilterRun extends OSU_OPE_OPC_ECI
{

	public int value=0;
	public String filepath;
	public MorphologyFilterRun( )
 	{	
 	}
	public void run(final MorphologyFilterView _SQ__OVQ_OSQ_VSQ)

	{
		//20230106-System.out.println("runed"+value);   
		  int out[][]= new int[topgin.length][topgin[0].length];
		  int mor[][]= new int[topgin.length][topgin[0].length];
		  
		  double t=Math.PI/6;
	       for (int i= 0; i < topgin.length; i++) 
	       {
	           for (int j= 0; j < topgin[0].length; j++) 
	           {
	            out[i][j]=topgin[i][j];
	            
	            int temp= (int)(i-j*Math.tan(t));
	            if(temp<topgin.length)
	            	if(temp>=0)
	                 mor[temp][j]=topgin[i][j];
	           }
	       }		    	
	 
	      
	       
	       
	       
	       
		_SQ__OVQ_OSQ_VSQ.gout=mor;
		
		
		
		
	}
}
