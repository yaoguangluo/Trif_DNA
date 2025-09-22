package OPE.OVU.MVU.OVU.PQE.nodeEdit;

import OPE.MVU.OVU.OVU.PQE.nodeEdit.C.ChooseCheck;

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
public class ChooseQ_VPS implements ChooseCheck {
    public Object[] chooseCheckNode(LinkNode first, MouseEvent arg0) {
        LinkNode node = first;
        int x, y;
        while (null != node) {
            x = arg0.getX();
            y = arg0.getY();
            if ((x > node.x) && (x < node.x + 50) && (y > node.y) && (y < node.y + 50)) {
                if (1 == arg0.getButton()) {
                    node.leftChoose = true;
                }
                if (3 == arg0.getButton()) {
                    node.rightChoose = true;
                }
                Object[] object = new Object[3];
                object[0] = node.name;
                object[1] = node.ID;
                object[2] = node.primaryKey;
                return object;
            }
            if (null == node.next) {
                break;
            }
            node = node.next;
        }
        Object[] object = new Object[3];
        object[0] = "";
        object[1] = 0;
        object[2] = "";
        return object;
    }
}
