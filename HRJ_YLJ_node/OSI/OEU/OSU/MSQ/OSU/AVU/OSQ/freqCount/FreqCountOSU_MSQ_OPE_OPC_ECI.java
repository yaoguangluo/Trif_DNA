package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.freqCount;


import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;


public class FreqCountOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI
{

	public int value=0;
	public String filepath;
	public FreqCountOSU_MSQ_OPE_OPC_ECI( )
 	{	
 	}
	public void run(final FreqCountOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) 
	{
	  		
				 //anasys
		         int size[]= new int[9999];
		         int cacucount= 0;
                 double []reg= toplygin.adataFrame.master;
                 for(int i= 1;i<reg.length-1;i++)
                 {
                	 //find high
                	 if(reg[i]<reg[i+1]&&reg[i]<reg[i-1])
                	 {
                			 size[cacucount]++;
                			 cacucount=0;	 
                     }                	 
                     cacucount++; 
                 }
					 
				 _SQ__OVQ_OSQ_VSQ.lygout=toplygin;
				 _SQ__OVQ_OSQ_VSQ.lygout.fsize=size;
	}
}
