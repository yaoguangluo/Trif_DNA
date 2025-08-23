/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package OPE.SI.MCI.OEI.OVU.PQE.extOSGI;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
//作者 罗瑶光
public class OSGI_findNode implements Cloneable{
	private LinkNode findNode;
	public OSGI_findNode() {

	}
	public LinkNode getFindNode() {
		return findNode;
	}
	//增加tin shell output map, 罗瑶光20211008
	public LinkNode findNode(String primaryKeyID, LinkNode first)
			{
		LinkNode linkNode= first.clone();
		while(null!= linkNode) {
			if(null!= linkNode.primaryKey) {
				if(linkNode.primaryKey.equalsIgnoreCase(primaryKeyID)) {
					findNode= linkNode.clone();
					return findNode;
				}
			}
			linkNode= linkNode.next;
		}
		return null;
	}
}
