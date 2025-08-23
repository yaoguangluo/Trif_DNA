package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.U_RelatedLine;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class U_RelatedLineVPS implements U_RelatedLine {
    public void doUpdateRelatedLine(LinkNode first, String currentNodeName
        , int currentNodeID, String currentNodePrimaryKey) {
        first = Sort.sort(first);
        while (null != first) {
            if (first.tBeconnect && first.tBeconnectName.equals(currentNodeName)
                && first.tBeconnectID == currentNodeID
                && first.tBeconnectPrimaryKey.equalsIgnoreCase(currentNodePrimaryKey)) {
                first.tBeconnect = false;
            }
            if (first.mBeconnect && first.mBeconnectName.equals(currentNodeName)
                && first.mBeconnectID == currentNodeID
                && first.mBeconnectPrimaryKey.equalsIgnoreCase(currentNodePrimaryKey)) {
                first.mBeconnect = false;
            }
            if (first.dBeconnect && first.dBeconnectName.equals(currentNodeName)
                && first.dBeconnectID == currentNodeID
                && first.dBeconnectPrimaryKey.equalsIgnoreCase(currentNodePrimaryKey)) {
                first.dBeconnect = false;
            }
            if (null == first.next) {
                break;
            }
            first = first.next;
        }
    }
}
