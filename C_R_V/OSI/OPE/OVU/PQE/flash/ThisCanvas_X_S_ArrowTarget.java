package OSI.OPE.OVU.PQE.flash;

import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import VSQ.etl.ThisCanvas_X_S;

import java.awt.Color;
import java.awt.Graphics2D;

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
public class ThisCanvas_X_S_ArrowTarget extends ThisCanvas_X_S {
    

    //下面 这些函数是 已调试通过的 按sonar qube最高认证编写方法进行ThisCanvas函数迭代化简
    //, 因为函数call 严重消耗指令计算时间
    //, 浪费算能, 大家可以继续用原来的ThisCanvasBackup函数替换,
    //作者罗瑶光
    public void arrowTargetTop(LinkNode node, Graphics2D graphics2D) {
        //记录arrow 同时 下一次画图, 清除该上一次 arrow
        arrowTargetThis(node, graphics2D, node.tBeconnectX + 62, node.tBeconnectY + 28
            , node.oldx + 14, node.oldy - 6, node.x + 14, node.y - 6);
        if (node.tNode.actionNodeLeft) {
            arrowTargetNext(graphics2D, node.tBeconnectX + 62, node.tBeconnectY + 28
                , node.x + 14, node.y - 6);
            node.tBeconnectX = node.tNode.x;
            node.tBeconnectY = node.tNode.y;
        }
        if (!node.leftChoose && node.rightChoose) {
            arrowTargetLink(graphics2D, oldX, oldY, newx, newy, currentX, currentY);
        }
    }

    public void arrowTargetMed(LinkNode node, Graphics2D graphics2D) {
        arrowTargetThis(node, graphics2D, node.mBeconnectX + 62, node.mBeconnectY + 28
            , node.oldx - 4, node.oldy + 25, node.x - 4, node.y + 25);
        if (node.mNode.actionNodeLeft) {
            arrowTargetNext(graphics2D, node.mBeconnectX + 62, node.mBeconnectY + 28
                , node.x - 4, node.y + 25);
            node.mBeconnectX = node.mNode.x;
            node.mBeconnectY = node.mNode.y;
        }
        if (!node.leftChoose && node.rightChoose) {
            arrowTargetLink(graphics2D, oldX, oldY, newx, newy, currentX, currentY);
        }
    }

    public void arrowTargetBot(LinkNode node, Graphics2D graphics2D) {
        arrowTargetThis(node, graphics2D, node.dBeconnectX + 62, node.dBeconnectY + 28
            , node.oldx + 6, node.oldy + 55, node.x + 6, node.y + 55);
        if (node.dNode.actionNodeLeft) {
            arrowTargetNext(graphics2D, node.dBeconnectX + 62, node.dBeconnectY + 28
                , node.x + 6, node.y + 55);
            node.dBeconnectX = node.dNode.x;
            node.dBeconnectY = node.dNode.y;
        }
        if (!node.leftChoose && node.rightChoose) {
            arrowTargetLink(graphics2D, oldX, oldY, newx, newy, currentX, currentY);
        }
    }

    public void arrowTargetThis(LinkNode node, Graphics2D graphics2D, int tX
        , int tY, int oX, int oY, int x, int y) {
        if (node.actionNodeLeft) {
            graphics2D.setColor(new Color(255, 255, 255));
            drawArrow.doDrawArrow(graphics2D, tX, tY, oX, oY);
            graphics2D.setColor(new Color(25, 25, 112));
        }
        drawArrow.doDrawArrow(graphics2D, tX, tY, x, y);
    }

    public void arrowTargetNext(Graphics2D graphics2D, int tX, int tY, int oX, int oY) {
        graphics2D.setColor(new Color(255, 255, 255));
        drawArrow.doDrawArrow(graphics2D, tX, tY, oX, oY);
        graphics2D.setColor(new Color(25, 25, 112));
        drawArrow.doDrawArrow(graphics2D, tX, tY, oX, oY);
    }

    public void arrowTargetLink(Graphics2D graphics2D, int oX, int oY, int nX
        , int nY, int cX, int cY) {
        graphics2D.setColor(new Color(255, 255, 255));
        drawArrow.doDrawArrow(graphics2D, oX, oY, nX, nY);
        graphics2D.setColor(Color.black);
        drawArrow.doDrawArrow(graphics2D, oX, oY, cX, cY);
        graphics2D.setColor(new Color(25, 25, 112));
    }
}
