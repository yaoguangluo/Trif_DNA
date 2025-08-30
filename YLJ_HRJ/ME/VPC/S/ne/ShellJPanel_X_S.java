package ME.VPC.S.ne;
//import java.beans.Beans;

import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import ME.VPC.M.app.App;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("serial")
public class ShellJPanel_X_S extends JPanel {
	/**
	 * 稍后进行优化成 申请版权的格式。 罗瑶光
	 */

	public LinkNode thisNodeInfo;
	public JCheckBox jlabel_box[];
	public boolean[] tabNamesHook = new boolean[30];
	public boolean isConfig = true;
	public JTextPane jTextPane;
	public StringBuilder stringBuilder = new StringBuilder();

	public String getStringFromStringBuilder() {
		if (stringBuilder.length() > 0) {
			return this.stringBuilder.toString();
		}
		return "";
	}

	public JTextPane outputjTextPane;
	public String plsearch;
	public TinMap output;// 准备做文章流计算的内存 罗瑶光20211008
	public M_V.MVQ.button.DetaButton jlabel_button_clear, jlabel_button,
			jlabel_init_button, jlabel_debug_button, jlabel_flush_button;
	public App NE;
	public JCheckBox jlabel_peizhi_di2515;
}
