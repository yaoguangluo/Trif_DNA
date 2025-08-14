package OSI.OPE.OVU.PQE.flash;

import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.CheckRangeVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.ChooseQ_VPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawArrowVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawFlashSide;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawSinLineVPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.DynamicLineU_VPS;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
import S_A.SVQ.stable.S_Annotation;
import exception.thread.DetaThread;

import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//作者: 罗瑶光
//作者 +著作权人： 罗瑶光, 浏阳
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ThisCanvas extends ThisCanvas_X_S_ArrowTarget
        implements MouseMotionListener, MouseListener, ItemListener, Runnable {
    
    public ThisCanvas(Thread threadApplet, LinkList first, NodeShow nodeView
            , PopupMenu nodeMenu, JTextPane rightBotJTextPane) {
        this.setLayout(null);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.start();
        this.setOpaque(false);
        this.setBackground(new Color(255, 255, 255));
        this.threadApplet = threadApplet;
        this.first = first;
        this.nodeView = nodeView;
        this.nodeMenu = nodeMenu;
        this.rightBotJTextPane = rightBotJTextPane;
        chooseCheck = new ChooseQ_VPS();
        dynamicLineUpdater = new DynamicLineU_VPS();
        drawArrow = new DrawArrowVPS();
        checkRange = new CheckRangeVPS();
        this.setBackground(Color.white);
        DrawSinLineVPS.fastDraw();
    }
    public void run() {
        while (true) {
            DetaThread.sleepDeta(80);
            this.updateUI();
        }
    }
    public void start() {
        if (null == threadApplet) {
            threadApplet = new Thread(this);
            threadApplet.start();
        }
    }
    @SuppressWarnings(S_Annotation.TAG_DEPRECATION)
    public void stop() {
        //threadApplet.destroy(); //jdk16 没有了destroy
        threadApplet.stop();
    }

    public void actionPerformed() {
    }

    public void itemStateChanged(ItemEvent arg0) {
    }

    public void mouseClicked(MouseEvent arg0) {
    }

    public void mouseEntered(MouseEvent arg0) {
    }

    public void mouseExited(MouseEvent arg0) {
    }

    public void mousePressed(MouseEvent arg0) {
        is_O = 1;
        oldX = arg0.getX();
        oldY = arg0.getY();
        currentX = arg0.getX();
        currentY = arg0.getY();
        Object[] node = chooseCheck.chooseCheckNode(first.first, arg0);
        currentNodeName = (String) node[0];
        currentNodeID = (int) node[1];
        currentNodePrimaryKey = (String) node[2];
        rightBotJTextPane.setText("坐标位：" + arg0.getX() + "|" + arg0.getY());
        rightBotJTextPane.validate();
    }

    public void mouseReleased(MouseEvent arg0) {
        is_O = 0;
        is_OS = 0;
        currentX = arg0.getX();
        currentY = arg0.getY();
        LinkNode node = first.first;
        while (null != node) {
            if (node.rightChoose && !node.leftChoose) {
                if (oldX == arg0.getX() && oldY == arg0.getY()) {
                    nodeMenu.show(this, arg0.getX(), arg0.getY());
                } else {
                    checkRange.doCheckRange(first.first, node, arg0);
                }
            }
            node.I_choose(false);
            node.rightChoose = false;
            node.actionNodeLeft = false;
            node.actionNodeRight = false;
            node = node.next;
        }
    }

    public void mouseDragged(MouseEvent e) {
        is_O = 1;
        is_OS = 1;
        DetaThread.sleepDeta(32);//1000/25=40
        currentX = e.getX();
        currentY = e.getY();
        LinkNode node = first.first;
        Graphics g = getGraphics();
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(Color.black);
        boolean needUpdate = false;
        LinkNode actionNode = null;
        while (null != node) {
            if (node.rightChoose) {//准备用255，255，255，不然总觉得不好看 罗瑶光20230612
                graphics2D.setColor(new Color(255, 255, 255));
                g.fillRect(node.x + 19, node.y + 12, 30, 30);
            }
            if (node.leftChoose || node.rightChoose) {
                needUpdate = true;
            }
            if (node.leftChoose && !node.rightChoose) {
                node.actionNodeLeft = true;
                node.actionNodeRight = false;
                node.I_xy(e.getX(), e.getY());
                actionNode = node;
                //移动后 节点输出坐标和连线更新
            } else {
                node.actionNodeLeft = false;
                node.actionNodeRight = true;
            }
            node = node.next;
        }
        if (needUpdate) {
            this.paintNeed(g);
            g.dispose();
            if (null != actionNode) {
                actionNode.actionNodeLeft = false;
                actionNode.actionNodeRight = false;
            }
        }
        newx = currentX;
        newy = currentY;
    }
    public void mouseMoved(MouseEvent arg0) {
    }
    public void paint(Graphics g) {
        try {
            nodeView.validate();
            Graphics2D graphics2D = (Graphics2D) g;
            graphics2D.setColor(new Color(255, 255, 255));
            graphics2D.clearRect(0, 0, this.getWidth(), this.getHeight());
            paintKernel(graphics2D, g);
        } catch (Exception ignored) {
        }
    }
    public void paintKernel(Graphics2D graphics2D, Graphics g) {
        first.first = Sort.sort(first.first);
        LinkNode node = first.first;
        while (node != null) {
            node.x = node.x < 0 ? 10 : node.x;
            node.x = Math.min(node.x, this.getWidth() - 100);
            node.y = node.y < 0 ? 10 : node.y;
            node.y = Math.min(node.y, this.getHeight() - 100);
            if (!node.actionNodeLeft && !node.leftChoose) {
                g.drawImage(node.thisFace.thisImage, node.x + 19, node.y + 12
                        , this);
            }
            node.flash = node.flash > 100 ? 0 : node.flash;
            //如果一个节点是移动节点 或者这个节点的连接前序节点是移动节点
            if (node.actionNodeLeft) {
                DrawFlashSide.D_FlashSide(graphics2D, node.oldx, node.oldy);
            }
            if (0 == is_O) {
                DrawFlashSide.drawFlashSide(graphics2D, node.x, node.y
                        , node.flash++ % 3);
            } else {
                DrawFlashSide.drawFlashSide(graphics2D, node.x, node.y
                        , node.flash);
            }
            if (node.actionNodeLeft) {
                graphics2D.setColor(new Color(255, 255, 255));
                g.drawString(node.name + "->" + node.ID, node.oldx - 5
                        , node.oldy - 20);
            }
            graphics2D.setColor(Color.black);
            g.drawString(node.name + "->" + node.ID, node.x - 5, node.y - 20);
            graphics2D.setColor(new Color(25, 25, 112));
            if (node.beconnect) {
                if (node.tBeconnect) {
                    arrowTargetTop(node, graphics2D);
                }
                if (node.mBeconnect) {
                    arrowTargetMed(node, graphics2D);
                }
                if (node.dBeconnect) {
                    arrowTargetBot(node, graphics2D);
                }
            } else if (!node.leftChoose && node.rightChoose) {
                arrowTargetLink(graphics2D, oldX, oldY, newx, newy, currentX, currentY);
            }
            if (node.actionNodeLeft) {
                node.oldx = node.x;
                node.oldy = node.y;
            }
            node = node.next;
        }
    }
    public void paintNeed(Graphics g) {
        try {
            nodeView.validate();
            Graphics2D graphics2D = (Graphics2D) g;
            first.first = Sort.sort(first.first);
            paintKernel(graphics2D, g);
        } catch (Exception ignored) {
        }
    }
    //下面 这些函数是 已调试通过的 按sonar qube最高认证编写方法进行ThisCanvas函数迭代化简
    //, 因为函数call 严重消耗指令计算时间
    //, 浪费算能, 大家可以继续用原来的ThisCanvasBackup函数替换,
    //作者罗瑶光
}
