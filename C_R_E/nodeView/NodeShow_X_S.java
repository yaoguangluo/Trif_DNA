package nodeView;

import ME.VPC.S.ne.App_S;
import C_A.ME.analysis.C.A;
import OPE.OEQ.MCQ.OVU.PQE.osgi.LinkOSGI;
import OPE.OEQ.MCQ.OVU.PQE.osgi.NodeOSGI;
import S_A.pheromone.IMV_SIQ;
import OSI.OPE.OVU.PQE.flash.GUISample;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.PopupMenu;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class NodeShow_X_S extends JScrollPane {
    public JTree tree;
    public NodeOSGI first;
    public LinkOSGI link;
    public GUISample gUISample;
    public DefaultTreeModel treeModel;
    public DefaultMutableTreeNode root;
    public ImageIcon test;
    public JTextPane text;
    public Object[][] tableData_old;
    public PopupMenu popupMenu;
    public App_S u;
    public A _A;
    public IMV_SIQ pos;
}
//	public String labelname;
//