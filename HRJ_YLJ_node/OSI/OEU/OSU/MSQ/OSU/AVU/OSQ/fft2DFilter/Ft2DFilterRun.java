package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.fft2DFilter;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;

public class Ft2DFilterRun extends OSU_OPE_OPC_ECI
{
	
	public int value=0;
	public String filepath;
	public Ft2DFilterRun( ) 
 	{	
 	}
	public void run(final Ft2DFilterView _SQ__OVQ_OSQ_VSQ) 
	{
	    toplygin.toHead();
		
		FastFourierTransformer fft= new FastFourierTransformer();
		double matrix[][]=new double[500][500];
		
		
		
		int section= toplygin.adataFrame.fftarray.length/1024;
		
		if(toplygin.adataFrame.fftarray.length%1024 > 0)
		{
			section += 1;
		}
		
        int comp=100;   
		
		toplygin.adataFrame.audiofft= new Complex[section][1024];
		double[] [] fftp= new double[section][1024];
		for(int i= 0;i < section;i++)
		{
			for(int j=0;j<1024;j++)
			{
				if(j+i*1024 >= toplygin.adataFrame.fftlooparray.length )
				{
					fftp[i][j]=0.0;
				}
				else
				{
					fftp[i][j]= toplygin.adataFrame.fftlooparray[j+i*1024];	
				}
			}
			toplygin.adataFrame.audiofft[i]= fft.transform(fftp[i]);
			for(int j=0;j<1024;j++)
			{
						int ho=(int) (toplygin.adataFrame.audiofft[i][j].getReal());
					int wo=(int) (toplygin.adataFrame.audiofft[i][j].getImaginary());
							int h=ho/comp;
					int w=wo/comp;
									if(h>249 ||h<-250)
					{
						h=0;
					}
					if(w>249 ||w<-250)
					{
						w=0;
					}
					h=250+h;
					w=250+w;
									if(matrix[h][w]<155)
						matrix[h][w]+=1;
							if(Math.abs(ho)<=comp||  Math.abs(wo)<=comp)
					{
						toplygin.adataFrame.fftlooparray[i*j]=toplygin.adataFrame.fftarray[i*j];
								}
					else
					{
									toplygin.adataFrame.fftlooparray[i*j]=0.0;
						toplygin.adataFrame.fftarray[i*j]=0.0;
					}
								}
		}
		
		
		
		
		//toplygin.adataFrame.fftarray=toplygin.adataFrame.fftlooparray;
		
	    while(toplygin.adataFrame.next!=null)
	    {
	    	toplygin.adataFrame=toplygin.adataFrame.next;
	     	
	    	section= toplygin.adataFrame.fftarray.length/1024;
					if(toplygin.adataFrame.fftarray.length%1024 > 0)
			{
				section += 1;
			}

			toplygin.adataFrame.audiofft= new Complex[section][1024];
			fftp= new double[section][1024];
			for(int i= 0;i < section;i++)
			{
				for(int j=0;j<1024;j++)
				{
					if(j+i*1024 >= toplygin.adataFrame.fftlooparray.length )
					{
						fftp[i][j]=0.0;
					}
					else
					{
						fftp[i][j]= toplygin.adataFrame.fftlooparray[j+i*1024];	
					}
				}
				toplygin.adataFrame.audiofft[i]= fft.transform(fftp[i]);
				for(int j=0;j<1024;j++)
				{
								int ho=(int) (toplygin.adataFrame.audiofft[i][j].getReal());
						int wo=(int) (toplygin.adataFrame.audiofft[i][j].getImaginary());
									int h=ho/comp;
						int w=wo/comp;
												if(h>249 ||h<-250)
						{
							h=0;
						}
						if(w>249 ||w<-250)
						{
							w=0;
						}
						h=250+h;
						w=250+w;
									if(matrix[h][w]<155)
							matrix[h][w]+=100;
									if(Math.abs(ho)<=comp||  Math.abs(wo)<=comp) {
							toplygin.adataFrame.fftlooparray[i*j]=toplygin.adataFrame.fftarray[i*j];
						} else {
											toplygin.adataFrame.fftlooparray[i*j]=0.0;
							toplygin.adataFrame.fftarray[i*j]=0.0;
						}
												}
							}
	    	
	    	
			//toplygin.adataFrame.fftarray=toplygin.adataFrame.fftlooparray;
	    	
	    	
	    	
	    	
	    }
		
	    
	    
	    
	    
		
		
		
		
		toplygin.fftmatrix=matrix;
		
		
		
		
		_SQ__OVQ_OSQ_VSQ.lygout=toplygin;	 
	}
}
