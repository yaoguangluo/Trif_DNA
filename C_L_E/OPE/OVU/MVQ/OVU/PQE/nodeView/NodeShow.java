package OPE.OVU.MVQ.OVU.PQE.nodeView;

import OPE.OEQ.MCQ.OVU.PQE.osgi.LinkOSGI;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeCellRenderer;
import OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.GUISample;
import nodeView.NodeShow_X_S;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import java.awt.Font;
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
@SuppressWarnings("serial")
public class NodeShow extends NodeShow_X_S {

	public NodeShow(GUISample gUISample, Object[][] tableData_old,
			JTextPane text, PopupMenu popupMenu, App NE) {
		this.text = text;
		this.tableData_old = tableData_old;
		this.popupMenu = popupMenu;
		this.gUISample = gUISample;
		this.u = NE.app_S;
		this._A = NE.app_S._A;
		this.pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		link = new LinkOSGI();
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-01");
		first = new OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(
				this.tableData_old, this.text, NE).Rigester(first, link, NE);
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-02");
		U_Tree();
		System.out.println("启动400编码调试开始-00000055-001-02-04-01-03");
	}

	public void U_Tree() {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Node");
		treeModel = new DefaultTreeModel(root);
		if (null == tree) {
			tree = new JTree(treeModel);
		} else {
			tree.clearSelection();
			tree.removeAll();
		}
		tree.setModel(treeModel);
		// tree= new JTree(treeModel);
		tree.setExpandsSelectedPaths(true);
		tree.getSelectionModel()
				.setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tree.putClientProperty("JTree.lineStyle", "Horizontal");
		tree.setEditable(false);
		UnicornTreeCellRenderer myCellRenderer = new UnicornTreeCellRenderer();
		myCellRenderer.setFont(new Font("Serif", Font.ITALIC, 12));
		tree.setCellRenderer(myCellRenderer);
		DefaultMutableTreeNode BI = new DefaultMutableTreeNode("BI");
		DefaultMutableTreeNode SOUND = new DefaultMutableTreeNode("SOUND");
		DefaultMutableTreeNode IMAGE = new DefaultMutableTreeNode("IMAGE");
		DefaultMutableTreeNode MOVIE = new DefaultMutableTreeNode("MOVIE");
		root.add(BI);
		root.add(SOUND);
		root.add(IMAGE);
		root.add(MOVIE);
		while (null != first) {
			if (null == first.currentFace.AMV_MVS_VSQ) {
				JLabel label;
				label = new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node = new DefaultMutableTreeNode(label);
				root.add(node);
			} else if (first.currentFace.AMV_MVS_VSQ.equals("BI")) {
				JLabel label;
				label = new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node = new DefaultMutableTreeNode(label);
				BI.add(node);
			} else if (first.currentFace.AMV_MVS_VSQ.equals("SOUND")) {
				JLabel label;
				label = new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node = new DefaultMutableTreeNode(label);
				SOUND.add(node);
			} else if (first.currentFace.AMV_MVS_VSQ.equals("IMAGE")) {
				JLabel label;
				label = new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node = new DefaultMutableTreeNode(label);
				IMAGE.add(node);
			} else if (first.currentFace.AMV_MVS_VSQ.equals("MOVIE")) {
				JLabel label;
				label = new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node = new DefaultMutableTreeNode(label);
				MOVIE.add(node);
			} else {
				JLabel label;
				label = new JLabel();
				label.setIcon(first.thisIcon);
				label.setText(first._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
				DefaultMutableTreeNode node = new DefaultMutableTreeNode(label);
				root.add(node);
			}
			if (null == first.next) {
				break;
			}
			first = first.next;
		}
		// tree.addMouseListener(gUISample);
		this.setViewportView(tree);
	}
}
