package O_V.OPE.SVU.OSU.dct;

//20210406 
//double t= 2*Pi/N;
//cos(2knPi/N)= cos(k* n* t) ;
//0~1024 0~1024
//之后我会再来挑战下余弦化简, 别急
//refer 傅里叶,
//编码 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class YaoGuangLuoFDT{
	public final double pi= 3.1415926;
	public final int N= 1024;
	double cos[][]= new double [N][N] ;
	double sin[][]= new double [N][N] ;
	public void kernel() {
		for(int k= 0; k< N; k++){
			double v1= 2* pi* k/ N;
			for(int n= 0; n< N; n++){
				double v= v1* n;
				cos[k][n]= Math.cos(v);
				//20230106-System.out.println(""+ k+ " "+n+ " "+ cos[k][n]);
				sin[k][n]= Math.sin(v);
			}
		} 
	}
	
	public double[] [] caculate(double[] [] input) {
		for(int k= 0; k< N; k++){
			for(int n= 0; n< N; n++){
				input[k][n]= Math.pow(input[k][n]* cos[k][n], 2)+ Math.pow(input[k][n]* sin[k][n], 2);
				input[k][n]= Math.sqrt(input[k][n]);
			}
		}
		return input; 
	}
	
	public static void main(String[] Args) {
		YaoGuangLuoFDT yaoGuangLuo的FDT= new YaoGuangLuoFDT();
		double input[][]= new double [1024][1024];
		yaoGuangLuo的FDT.kernel();
		yaoGuangLuo的FDT.caculate(input);
		
	}
}
