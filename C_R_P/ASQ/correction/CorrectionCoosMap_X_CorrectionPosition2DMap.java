//package ASQ.correction;
//
//import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
//
//import java.util.ArrayList;
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
//public class CorrectionCoosMap_X_CorrectionPosition2DMap{
//	//这个函数用于坐标集的计算观测优化。
//	//思想 坐标系 平移 欧基里德, 笛卡尔
//	//实现 罗瑶光
//	//range数组 0 为 x轴 , 1 为 y轴 , 2 为z轴 。
//	public static List<AMV_MVS_VSQ_2D> _E(List<AMV_MVS_VSQ_2D> inputs, double xRange
//		, double yRange){
//		List<AMV_MVS_VSQ_2D> output= new ArrayList<>();
//		Iterator<AMV_MVS_VSQ_2D> iterator= inputs.iterator();
//		while(iterator.hasNext()) {
//			AMV_MVS_VSQ_2D position2D= iterator.next();
//			position2D.I_X(position2D.getX()+ xRange);
//			position2D.I_Y(position2D.getY()+ yRange);
//			output.add(position2D);
//		}
//		return output;
//	}
//}
