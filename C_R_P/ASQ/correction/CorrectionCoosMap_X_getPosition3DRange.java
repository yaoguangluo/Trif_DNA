//package ASQ.correction;
//
//import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//
//import java.util.Iterator;
//import java.util.List;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
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
//public class CorrectionCoosMap_X_getPosition3DRange{
//	//这个函数用于坐标集的计算观测优化。
//	//思想 坐标系 平移 欧基里德, 笛卡尔
//	//实现 罗瑶光
//	//range数组 0 为 x轴 , 1 为 y轴 , 2 为z轴 。
//	public static double[] _E(List<AMV_MVS_VSQ_3D> inputs) {
//		Iterator<AMV_MVS_VSQ_3D> iterator= inputs.iterator();
//		double xMax= 0.0;
//		double yMax= 0.0;
//		double xMin= 0.0;
//		double yMin= 0.0;
//		double zMax= 0.0;
//		double zMin= 0.0;
//		double[] range= new double[3];
//		if(iterator.hasNext()) {
//			AMV_MVS_VSQ_3D position3D= iterator.next();
//			xMax= position3D.getX();
//			xMin= position3D.getX();
//			yMax= position3D.getY();
//			yMin= position3D.getY();
//			zMax= position3D.getZ();
//			zMin= position3D.getZ();
//		}
//		while(iterator.hasNext()) {
//			AMV_MVS_VSQ_3D position3D= iterator.next();
//			if(position3D.getX()> xMax) {
//				xMax= position3D.getX();
//			}
//			if(position3D.getX()< xMin) {
//				xMin= position3D.getX();
//			}
//			if(position3D.getY()> yMax) {
//				yMax= position3D.getY();
//			}
//			if(position3D.getY()< yMin) {
//				yMin= position3D.getY();
//			}
//			if(position3D.getZ()> zMax) {
//				zMax= position3D.getZ();
//			}
//			if(position3D.getZ()< zMin) {
//				zMin= position3D.getZ();
//			}
//		}
//		range[0]= xMax- xMin;
//		range[1]= yMax- yMin;
//		range[2]= zMax- zMin;
//		return range;
//	}
//}
