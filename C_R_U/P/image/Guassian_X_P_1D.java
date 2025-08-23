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
//public class Guassian_X_P_1D {
//
//	public static int[][] P_1D(int[][] g, int frection, int kernel, double sig)  {
//		int d= frection;
//		int e= kernel;
//		int[][] flac_grn= Reflection.PadImage(g, d, e);
//		double kenel[][]= new double[d][e];
//		double sumrow= 0.0;
//		double sumcol= 0.0;
//		double t= 0.0;
//		for(int k= 0; k<d; ++k){
//			for(int l= e/2; l<e/2+1; ++l){
//				t= (Math.pow(k-d/2, 2)+Math.pow(l-e/2, 2))/(2*Math.pow(sig, 2));
//				t= Math.exp(-t);
//				t= (1*t)/(2*Math.PI*Math.pow(sig, 2));
//				kenel[k][l]= t;
//				sumrow= sumrow + kenel[k][l];
//			}
//		}
//		double sum1=0.0;
//		for(int i=0; i<d; ++i){
//			for(int j=e/2; j<e/2+1; ++j){
//				kenel[i][j]= kenel[i][j]/sumrow;
//				sum1= sum1 + kenel[i][j];
//			}
//		}
//		////20230106-System.out.println("gaussian sum: " + sum1);
//		////GAUSSIAN KENEL col
//		for(int k= d/2; k<d/2+1; ++k){
//			for(int l= 0; l<e; ++l){
//				t= (Math.pow(k-d/2, 2)+Math.pow(l-e/2, 2))/(2*Math.pow(sig, 2));
//				t= Math.exp(-t);
//				t= (1*t)/(2*Math.PI*Math.pow(sig, 2));
//				kenel[k][l]= t;
//				sumcol= sumcol + kenel[k][l];
//			}
//		}
//		////20230106-System.out.println("--->"+sumcol);
//		//--normalization col
//		double sum2=0.0;
//		for(int i=d/2; i<d/2+1; ++i){
//			for(int j=0; j<e; ++j){
//				kenel[i][j]= kenel[i][j]/sumcol;
//				sum2= sum2 + kenel[i][j];
//			}
//		}
//		//--end of producing gaussian matrix
//		////20230106-System.out.println("gaussian sum: " + sum2);
//		//GAUSSIAN pro for row
//		for (int i=d/2;i<g.length+d/2;i++) {
//			for(int j=e/2;j<g[0].length+e/2;j++) {
//				double sum=0.0;
//				for(int k=0;k<d;k++) {
//					for(int l=e/2;l<e/2+1;l++) {
//						sum=(sum+flac_grn[i+k-d/2][j+l-e/2]*kenel[k][l]);
//					}
//				}
//				// //20230106-System.out.println(sum+"|");
//				// //20230106-System.out.println(i-d/2);
//				// //20230106-System.out.println(j-e/2);
//				////20230106-System.out.println(g.length);
//				//if(j-e/2>)
//				g[i-d/2][j-e/2]=sum;
//				// 	flac_grn[i][j]=(int)sum;
//			}
//		}
//		//REFLACTION a new of rowed grn
//		flac_grn= Reflection.PadImage(g, d, e);
//		//GAUSSIAN pro for col
//		for (int i=d/2;i<g.length+d/2;i++){
//			for(int j=e/2;j<g[0].length+e/2;j++){
//				double sum=0.0;
//				for(int k=d/2;k<d/2+1;k++){
//					for(int l=0;l<e;l++){
//						sum=sum+flac_grn[i+k-d/2][j+l-e/2]*kenel[k][l];
//					}
//				}
//				// //20230106-System.out.println(sum);
//				g[i-d/2][j-e/2]=sum;
//			}
//		}
//		return CheckRange.P(g);
//	}
//}
