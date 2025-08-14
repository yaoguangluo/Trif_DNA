package U_V.ESU.matrix3D;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Matrix3D_ESU_X_matrixReverseSwapXY{
	public static Object[][][] _E(Object[][][] objects){
		Object[][][] output= new Object[objects.length][objects[0].length][];
		for(int i= 0; i< objects.length; i++) {
			for(int j= 0; j< objects[0].length; j++) {
				for(int k= 0; k< objects[0][0].length; k++) {
					output[objects.length- i][objects[0].length- j][k]
							= objects[i][j][k];
				}
			}
		}
		return output;
	}
}
