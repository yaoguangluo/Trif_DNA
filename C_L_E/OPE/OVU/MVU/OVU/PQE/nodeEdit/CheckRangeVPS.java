package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.CheckRange;

import java.awt.event.MouseEvent;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CheckRangeVPS implements CheckRange {
	public void doCheckRange(LinkNode first, LinkNode node, MouseEvent arg0) {
		LinkNode linkNode= first;
		int x, y;
		x= arg0.getX();
		y= arg0.getY();
		while(null!= linkNode){
			if((x> linkNode.x- 20)&& (x< linkNode.x+ 100)&& (y> linkNode.y- 100)&& (y< linkNode.y+ 16)
					&& (!node.primaryKey.equalsIgnoreCase(linkNode.primaryKey))){
				linkNode.beconnect= true;
				linkNode.tBeconnect= true;
				linkNode.tBeconnectX= node.x;
				linkNode.tBeconnectY= node.y;
				linkNode.tBeconnectID= node.ID;
				linkNode.tBeconnectPrimaryKey= node.primaryKey;
				linkNode.tBeconnectName= new String(node.name);
				linkNode.tNode= node;
				return;
			}
			if((x> linkNode.x- 20)&& (x< linkNode.x+ 50)&& (y> linkNode.y+ 16)&& (y< linkNode.y+ 32)
					&& (!node.primaryKey.equalsIgnoreCase(linkNode.primaryKey))){
				linkNode.beconnect= true;
				linkNode.mBeconnect= true;
				linkNode.mBeconnectX= node.x;
				linkNode.mBeconnectY= node.y;
				linkNode.mBeconnectID= node.ID;
				linkNode.mBeconnectPrimaryKey= node.primaryKey;
				linkNode.mBeconnectName= new String(node.name);
				linkNode.mNode= node;
				return;
			}	
			if((x> linkNode.x- 20)&& (x< linkNode.x+ 50)&& (y> linkNode.y+ 32)&& (y< linkNode.y+ 100)
					&& (!node.primaryKey.equalsIgnoreCase(linkNode.primaryKey))){
				linkNode.beconnect= true;
				linkNode.dBeconnect= true;
				linkNode.dBeconnectX= node.x;
				linkNode.dBeconnectY= node.y;
				linkNode.dBeconnectID= node.ID;
				linkNode.dBeconnectPrimaryKey= node.primaryKey;
				linkNode.dBeconnectName= new String(node.name);
				linkNode.dNode= node;
				return;
			}	
			linkNode= linkNode.next;
		}
	}
}
