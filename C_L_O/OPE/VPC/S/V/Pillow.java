/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package OPE.VPC.S.V;

import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import S_A.pheromone.IMV_SIQ;

import java.util.Map;

//作者 +著作权人： 罗瑶光, 浏阳
public class Pillow{
	public static Map<Long, Object> pillowBase;
	public static void register(BootNeroDoc bootNeroDoc) {
		//bootNeroDoc 需要拿出来的数据资源, 比如可重用数据, 运维数据, 可控数据等。
		IMV_SIQ map= new IMV_SIQ();
		//...
		bootNeroDoc.I_Pillow(map);
		pillowBase.put(bootNeroDoc.getId(), map);
	}
}
