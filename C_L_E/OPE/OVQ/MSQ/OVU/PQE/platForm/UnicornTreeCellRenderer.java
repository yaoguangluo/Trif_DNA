package OPE.OVQ.MSQ.OVU.PQE.platForm;

import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.Component;
/**  
 *  作者对jdk 开源插件进行2次开发。不在个人著作申请范围内。
 * @author LYG refer JDK authors from SUN Tech, 。
 *//*
 *  作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */

public class UnicornTreeCellRenderer extends DefaultTreeCellRenderer {

	public Component getTreeCellRendererComponent(JTree tree, Object value
			, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
		DefaultMutableTreeNode node= (DefaultMutableTreeNode)value;
		Object obj= node.getUserObject();
		if(obj instanceof JLabel) {
			JLabel label= (JLabel)obj;
			DefaultTreeCellRenderer tempCellRenderer= new DefaultTreeCellRenderer();
			tempCellRenderer.setLeafIcon(label.getIcon());
			return  tempCellRenderer.getTreeCellRendererComponent(tree, label.getText()
					, selected, expanded, true, row, hasFocus);
		}
		return super.getTreeCellRendererComponent(tree, value, selected
				, expanded, leaf, row, hasFocus);
	}
}
