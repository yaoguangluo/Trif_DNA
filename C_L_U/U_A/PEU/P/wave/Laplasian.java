package U_A.PEU.P.wave;
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
public class Laplasian{
	@SuppressWarnings("unused")
	public double[]  laplasian1d(double[] input, double scale) {
		double [] output= new double [input.length];
		double []lap=new double[5];
		double sig= scale; //default 1.6
		double t= 0.0;
		double sumhere= 0.0;
		lap[0]=0.0;
		lap[1]=-3.0;
		lap[2]=scale;//default=7
		lap[3]=-3.0;
		lap[4]=0.0;
		for(int l= 0; l<5; ++l){    	    
			sumhere= sumhere + lap[l];
		}	   
		//   //20230106-System.out.println("--->"+sumhere);	
		//--normalization      
		double sum1= 0.0;
		for(int j= 0; j< 5; ++j){
			lap[j]= lap[j]/sumhere;
			sum1= sum1 + lap[j];
		}  
		//--end of producing gaussian matrix
		// //20230106-System.out.println("gaussian sum: " + sum1);
		double sum= 0.0;
		for(int i= 2; i< input.length- 2; i++){
			sum= 0.0;
			for(int j= -2; j< 3; j++){
				sum= sum + (input[i+j]* lap[j+2]);	
			}
			output[i]=sum;
		}
		return output;
	};
}
