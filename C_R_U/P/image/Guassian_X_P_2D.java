//package P.image;
//
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * 授课 reinhart，思想 computer vision绿皮书
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class Guassian_X_P_2D {
//	public static int[][] P_2D(int[][] g, int d, int e, double sig)  {
//		int [][]flac_grn= Reflection.PadImage(g, d, e);
//		double kenel[][]= new double[d][e];
//		double sumhere= 0.0;
//		double t= 0.0;
//		for(int k= 0; k<d; ++k){
//			for(int l= 0; l<e; ++l){
//				t= (Math.pow(k-(d>>1), 2) + Math.pow(l - (e>>1), 2))/(2*Math.pow(sig, 2));
//				t= Math.exp(-t);
//				t= (t)/(Math.PI*Math.pow(sig, 2)*2);
//				kenel[k][l]= t;
//				sumhere= sumhere + kenel[k][l];
//			}
//		}
//		double sum1=0.0;
//		for(int i=0; i<d; ++i){
//			for(int j=0; j<e; ++j){
//				kenel[i][j]= kenel[i][j]/sumhere;
//				sum1= sum1 + kenel[i][j];
//			}
//		}
//		for (int i=d>>1;i<g.length+d>>1;i++){
//			for(int j=e>>1;j<g[0].length+e>>1;j++){
//				double sum=0.0;
//				for(int k=0;k<d;k++){
//					for(int l=0;l<e;l++){
//						sum=sum+flac_grn[i+k-(int)(d>>1)][j+l-(int)(e>>1)]*kenel[k][l];
//					}
//				}
//				g[i-(int)(d>>1)][j-(int)(e>>1)]=sum;
//			}
//		}
//		return  CheckRange.P(g);
//	}
//}