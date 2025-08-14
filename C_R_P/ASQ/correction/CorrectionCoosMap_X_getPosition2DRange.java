//package ASQ.correction;
//
//import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
//
//import java.util.Iterator;
//import java.util.List;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class CorrectionCoosMap_X_getPosition2DRange{
//	//这个函数用于坐标集的计算观测优化。
//	//思想 坐标系 平移 欧基里德, 笛卡尔
//	//实现 罗瑶光
//	//range数组 0 为 x轴 , 1 为 y轴 , 2 为z轴 。
//	public static double[] _E(List<AMV_MVS_VSQ_2D> inputs) {
//		Iterator<AMV_MVS_VSQ_2D> iterator= inputs.iterator();
//		double xMax= 0.0;
//		double yMax= 0.0;
//		double xMin= 0.0;
//		double yMin= 0.0;
//		double[]  range= new double[2];
//		if(iterator.hasNext()) {
//			AMV_MVS_VSQ_2D position2D= iterator.next();
//			xMax= position2D.getX();
//			xMin= position2D.getX();
//			yMax= position2D.getY();
//			yMin= position2D.getY();
//		}
//		while(iterator.hasNext()) {
//			AMV_MVS_VSQ_2D position2D= iterator.next();
//			if(position2D.getX()> xMax) {
//				xMax= position2D.getX();
//			}
//			if(position2D.getX()< xMin) {
//				xMin= position2D.getX();
//			}
//			if(position2D.getY()> yMax) {
//				yMax= position2D.getY();
//			}
//			if(position2D.getY()< yMin) {
//				yMin= position2D.getY();
//			}
//		}
//		range[0]= xMax- xMin;
//		range[1]= yMax- yMin;
//		return range;
//	}
//}
