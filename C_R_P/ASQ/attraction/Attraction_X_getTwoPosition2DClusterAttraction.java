//package ASQ.cluster.attraction;
//
//import ASQ.basic.Distance_X_getDistance2D;
//import ASQ.basic.euclid.Euclid_X_findHeartPosition2D;
//import ASQ.basic.euclid.Euclid_X_findMidPosition2D;
//import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
//
//import java.util.List;
//
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
//public class Attraction_X_getTwoPosition2DClusterAttraction{
//	//临近2个坐标团的相互引力比算法建模观测, 小于1 吸引, 大于1 排斥。
//	//思想： 罗瑶光, 欧基里德, 立体几何, 20191227
//	//实现： 罗瑶光
//	public static double _E(List<AMV_MVS_VSQ_2D> clusterOne
//			, List<AMV_MVS_VSQ_2D> clusterTwo) {
//		AMV_MVS_VSQ_2D midOne= Euclid_X_findMidPosition2D._E(clusterOne);
//		AMV_MVS_VSQ_2D midTwo= Euclid_X_findMidPosition2D._E(clusterTwo);
//		AMV_MVS_VSQ_2D heartOne= Euclid_X_findHeartPosition2D._E(clusterOne);
//		AMV_MVS_VSQ_2D heartTwo= Euclid_X_findHeartPosition2D._E(clusterTwo);
//		double midDistance= Distance_X_getDistance2D._E(midOne, midTwo);
//		double heartDistance= Distance_X_getDistance2D._E(heartOne, heartTwo);
//		return heartDistance/ midDistance;
//	}
//}
