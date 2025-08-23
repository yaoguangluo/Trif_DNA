package OSI.OPE.OEI.PVI.SOI.SMQ.load;

import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class File_X_linkNode{
	public static void _E(LinkNode first, IMV_SIQ nodeMap) {
		while(first!= null) {
			if(first.beconnect) {
				if(first.tBeconnect) {
					first.tNode= nodeMap.getLinkNode(first.tBeconnectPrimaryKey);
				}
				if(first.mBeconnect) {
					first.mNode= nodeMap.getLinkNode(first.mBeconnectPrimaryKey);
				}
				if(first.dBeconnect) {
					first.dNode= nodeMap.getLinkNode(first.dBeconnectPrimaryKey);
				}
			}
			first= first.next;
		}
	}
}
