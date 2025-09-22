package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.fFT;


import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;


public class FFTFilterOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI
{
	
	public int value=0;
	public String filepath;
	public FFTFilterOSU_MSQ_OPE_OPC_ECI( )
 	{	
 	}
	@SuppressWarnings("unused")
	public void run(final FFTFilterOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) 
	{
	  		
				 //anasys
		toplygin.toHead();
		
		FastFourierTransformer fft= new FastFourierTransformer();
		double matrix[][]=new double[500][500];
		
		
		
		int section= toplygin.adataFrame.audioArray.length/1024;
		toplygin.adataFrame.fftarray=new double[toplygin.adataFrame.audioArray.length];
		toplygin.adataFrame.fftlooparray=new double[toplygin.adataFrame.fftarray.length];

		
		double comp=10000.0;
		if(toplygin.adataFrame.audioArray.length%1024 > 0)
		{
			section += 1;
		}

		toplygin.adataFrame.audiofft= new Complex[section][1024];
		toplygin.adataFrame.logfftarray=new int[section][1024];

		double[] [] fftp= new double[section][1024];
		for(int i= 0;i < section;i++) {
			for(int j=0;j<1024;j++) {
				if(j+i*1024 >= toplygin.adataFrame.audioArray.length ) {
					fftp[i][j]=0.0;
				} else {
					fftp[i][j]= toplygin.adataFrame.audioArray[j+i*1024];	
				}
			}
			toplygin.adataFrame.audiofft[i]= fft.transform(fftp[i]);
			for(int j=0;j<1024;j++) {
				    double p1=toplygin.adataFrame.audiofft[i][j].abs();
					    toplygin.adataFrame.logfftarray[i][j]=(int) (10*Math.log10(p1*p1+1));
								double ho=(double) (toplygin.adataFrame.audiofft[i][j].getReal());
					double wo=(double) (toplygin.adataFrame.audiofft[i][j].getImaginary());
							int h=(int) (ho/comp);
					int w=(int) (wo/comp);
							int t=0;
					if((h>249 ||h<-250)) {
							h=0;
					}
					if((w>249 ||w<-250)) {
						w=0;
					}
					h=250+h;
					w=250+w;
							if(matrix[h][w]<245)
					   matrix[h][w]+=10;
							if(Math.abs(ho)<=comp||  Math.abs(wo)<=comp) {
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					}
					toplygin.adataFrame.fftlooparray[i]=toplygin.adataFrame.fftarray[i];
			}
		}
	    while(toplygin.adataFrame.next!=null) {
	    	toplygin.adataFrame=toplygin.adataFrame.next;
	    	section= toplygin.adataFrame.audioArray.length/1024;
	    	toplygin.adataFrame.fftarray=new double[toplygin.adataFrame.audioArray.length];
	    	toplygin.adataFrame.fftlooparray=new double[toplygin.adataFrame.fftarray.length];
			if(toplygin.adataFrame.audioArray.length%1024 > 0) {
				section += 1;
			}
			toplygin.adataFrame.audiofft= new Complex[section][1024];
			fftp= new double[section][1024];
			toplygin.adataFrame.logfftarray=new int[section][1024];
			for(int i= 0;i < section;i++) {
				for(int j=0;j<1024;j++) {
					if(j+i*1024 >= toplygin.adataFrame.audioArray.length ) {
						fftp[i][j]=0;
					} else {
						fftp[i][j]= toplygin.adataFrame.audioArray[j+i*1024];	
					}
				}
				toplygin.adataFrame.audiofft[i]= fft.transform(fftp[i]);
				for(int j=0;j<1024;j++) {
					 double p1=toplygin.adataFrame.audiofft[i][j].abs();
								    toplygin.adataFrame.logfftarray[i][j]=(int) (10*Math.log10(p1*p1+1));
							double ho=(double) (toplygin.adataFrame.audiofft[i][j].getReal());
					double wo=(double) (toplygin.adataFrame.audiofft[i][j].getImaginary());
							int h=(int) (ho/comp);
					int w=(int) (wo/comp);
					if(h>249 ||h<-250) {
						h=0;
					}
					if(w>249 ||w<-250) {
						w=0;
					}
					h=250+h;
					w=250+w;
					if(matrix[h][w]<245)
						matrix[h][w]+=10;
							if(Math.abs(ho)<=comp||  Math.abs(wo)<=comp)
					{
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					}
					toplygin.adataFrame.fftlooparray[i]=toplygin.adataFrame.fftarray[i];
				}	
			}
	    		
	    }
		
	    
	    
	    
	    
		
		
		
		
		toplygin.fftmatrix=matrix;
		
		
		
		
		_SQ__OVQ_OSQ_VSQ.lygout=toplygin;
	}
}
