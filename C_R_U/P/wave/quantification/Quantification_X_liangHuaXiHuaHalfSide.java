package P.wave.quantification;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Quantification_X_liangHuaXiHuaHalfSide{
	public static double[]  liangHuaXiHuaHalfSide(double[]  input) {
		double[]  output= new double[input.length];
		for(int i=1;i<input.length-1;i++){
			if(input[i]/input[i+1]<=1&&input[i]/input[i+1]>=0.5) {
				if(input[i]/input[i-1]<=1&&input[i]/input[i-1]>=0.5) {
					output[i]=input[i];
				}	
			}

		}
		return output;
	}
}
