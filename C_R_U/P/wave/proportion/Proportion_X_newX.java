package P.wave.proportion;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Proportion_X_newX{
	public static double[]  newX(double[]  input, double width) {//128 32
		double [] output= new double [(int)width];
		double bilix= input.length/width;//4
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<bilix;j++) {
				output[i]+=input[(int)(i*bilix+j)];	
			}
		}
		return output;
	}
}
