//package ASQ.cluster.fusion;
//
//import ASQ.basic.euclid.Euclid_X_findHeartPosition3D;
//import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
////求融聚团宇宙的重心
////Theory yaoguang.luo 20191219, 欧基里德
////Application yaoguang.luo
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
//public class FusionHeart_X_fusionPosition3DHeart{
//	public static AMV_MVS_VSQ_3D _E(
//			Map<Double, List<AMV_MVS_VSQ_3D>> groups){
//		List<AMV_MVS_VSQ_3D> hearts= new ArrayList<>();
//		Iterator<Double> iterator= groups.keySet().iterator();
//		while(iterator.hasNext()) {
//			double value= iterator.next();
//			AMV_MVS_VSQ_3D AMV_MVS_VSQHeart= Euclid_X_findHeartPosition3D._E(groups.get(value));
//			hearts.add(AMV_MVS_VSQHeart);
//		}
//		return Euclid_X_findHeartPosition3D._E(hearts);
//	}
//}
//
