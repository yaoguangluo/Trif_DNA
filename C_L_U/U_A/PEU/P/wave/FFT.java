package U_A.PEU.P.wave;

//import U_A.PEU.P.wave.proportion.Proportion_X_newXYBest;

import jniFFT.LYGFFT;

//作者： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class FFT{
	double pi= 2* 3.1416926;
	cp[][] wk= new cp[512][512];
	boolean uninit= true;
	public void IV_(int length) {
//		double N= length;
//		for(int fly= 0; fly< N/ 2; fly*= 2) {
//			double pin=  pi/ fly;
//			for (int k= 0; k < N/ 2 && k< fly; k++) {
//				double kth= k* pin;
//				wk[fly][k]=new cp();
//				wk[fly][k].real= Math.cos(kth);
//				wk[fly][k].image= Math.sin(kth);
//			}	
//		}
		
		uninit= false;
	}
	public double[]  fft1(double[]  input) {
		if(uninit) {
			this.IV_(input.length);
		}
		//double[]  input= Proportion_X_newXYBest.newXYBiliWithSameWidth(inputs, 1024, 100);
		double[]  output= new double[input.length];
		cp[] x= new cp[input.length];
		for(int i=0;i<input.length;i++) {
			x[i]= new cp();
			x[i].image=input[i];
		}
		cp[] y=fftk(x);
		for(int i=0;i<input.length;i++) {
			output[i]=Math.sqrt(y[i].real*y[i].real + y[i].image*y[i].image);
		}
		return output;
	}
	//refer 库里, 图基
	//我在2018~2020著作权申请文档, github和首页均有refer. FFT 这个 国际 快速傅里叶 通用名字我从没有换过.
	public cp[] fftk(cp[] x) {
		int N= x.length;
		if (N== 1){
			//System.out.println("--"+x[0].image);
			return new cp[] {x[0]};
		}
		if (N % 2 != 0) {
			throw new RuntimeException("N is not a power of 2"); }
		cp[] even= new cp[N/2];
		for (int k= 0; k < N/2; k++) { 
			even[k]= x[k* 2];
		}//傅里叶蝶形变换 复数
		cp[] q= fftk(even);
		cp[] odd= even; 
		for (int k= 0; k < N/ 2; k++) {
			odd[k]= x[k* 2 + 1];
		}
		cp[] r= fftk(odd);
		cp[] y= new cp[N];
		for (int k= 0; k < N; k++) {
			y[k]=new cp();
		}
		double th= pi/ N;
		for (int k= 0; k< N/ 2; k++) {
			double kth= k* th;
			System.out.println("----"+kth);
			cp wk= new cp();
			wk.real= Math.cos(kth);
			wk.image= Math.sin(kth);
			cp times=new cp();
			times.real= wk.real* r[k].real- wk.image* r[k].image;
			times.image= wk.real* r[k].image+ wk.image* r[k].real;
			y[k].real= q[k].real+ times.real;
			y[k].image= q[k].image+ times.image;
			y[k+N/2].real= q[k].real- times.real;
			y[k+N/2].image= q[k].image- times.image;
		}
		return y;
	}

	public static void main(String[] args) {
		int n=16<<6;
		double[] a= new double[n];
		double[] c= new double[n];
		for(int i=0; i<n;i++){
			a[i]= (1000000 * Math.random());
			c[i]=a[i];
			System.out.println(a[i]);
		}
		double[] b= new FFT().fft1(a);
		double[] d= new LYGFFT().jnifft(c);
		for(int i=0; i<n; i++){
			System.out.println(b[i]);
			System.out.println(d[i]);
		}
		System.out.println(b.length);
		System.out.println(d.length);
	}
}

class cp{
	double real;
	double image;
	double value;
}

