//package P.image;
//
//import U_A.PEU.P.image.ReadWritePng;
//
//import java.awt.image.BufferedImage;
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
//public class Guassian_X_P {
//	public static BufferedImage P(BufferedImage lygimage, double d, double e, double k)
//			 {
//		int r[][]=new ReadWritePng().REDpngRead(lygimage);
//		int g[][]=new ReadWritePng().GRNpngRead(lygimage);
//		int b[][]=new ReadWritePng().BLUpngRead(lygimage);
//		//r[][]
//		r= Guassian_X_P_2D.P_2D(r, d, e, k);
//		//g[][]
//		g= Guassian_X_P_2D.P_2D(g, d, e, k);
//		//b[][]
//		b= Guassian_X_P_2D.P_2D(b, d, e, k);
//		//r[][]g[][]b[][] to image
//		lygimage=new ReadWritePng().createBufferImage(r, g, b);
//		return lygimage;
//	}
//}
