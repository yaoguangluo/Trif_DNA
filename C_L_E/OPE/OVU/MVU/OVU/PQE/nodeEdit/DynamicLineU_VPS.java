package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.DynamicLine_U;

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
public class DynamicLineU_VPS implements DynamicLine_U {
    public void exec(LinkNode first, LinkNode node) {
        LinkNode linkNode = first;
        while (null != linkNode) {
            linkNode = linkNode.next;
        }
        linkNode = null;
    }
}
/*
*
* public class DynamicLineU_VPS implements DynamicLine_U {
    public void exec(LinkNode first, LinkNode node) {
        LinkNode linkNode = first;
        while (null != linkNode) {
            if (linkNode.primaryKey.equalsIgnoreCase(node.tBeconnectPrimaryKey)) {
//				node.tBeconnectX= linkNode.x;
//				node.tBeconnectY= linkNode.y;
            }
            if (linkNode.tBeconnectPrimaryKey.equalsIgnoreCase(node.primaryKey)) {
//				linkNode.tBeconnectX= node.x;
//				linkNode.tBeconnectY= node.y;
            }
            if (linkNode.primaryKey.equalsIgnoreCase(node.mBeconnectPrimaryKey)) {
//				node.mBeconnectX= linkNode.x;
//				node.mBeconnectY= linkNode.y;
            }
            if (linkNode.mBeconnectPrimaryKey.equalsIgnoreCase(node.primaryKey)) {
//				linkNode.mBeconnectX= node.x;
//				linkNode.mBeconnectY= node.y;
            }
            if (linkNode.primaryKey.equalsIgnoreCase(node.dBeconnectPrimaryKey)) {
//				node.dBeconnectX= linkNode.x;
//				node.dBeconnectY= linkNode.y;
            }
            if (linkNode.dBeconnectPrimaryKey.equalsIgnoreCase(node.primaryKey)) {
//				linkNode.dBeconnectX= node.x;
//				linkNode.dBeconnectY= node.y;
            }
            linkNode = linkNode.next;
        }
        linkNode = null;
    }
}
*
* */