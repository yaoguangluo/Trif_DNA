package ME.VPC.S.ne;

import M_V.MVQ.button.DetaButton;
import M_V.MVQ.tabbedpane.DetabbedPane;
import M_V.MVQ.textfield.CfxTextField;
import S_A.linePage.Line2025;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.image.BufferedImage;

//import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * * 作者的家庭是父亲 罗荣武，母亲 刘瑞珍，女儿 christina.yaja.luo/罗雅佳, 前妻ringli/李妙环。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class App_S_Guies extends App_S_Values {
	public JPanel jPanel;
	public JPanel panel_yt;
	public JPanel panel = new JPanel();
	public CfxTextField name_filter_not_have;
	public CfxTextField nameFeelFilter;
	public JButton buttonCTE;
	public JButton buttonFRS;
	public JButton buttonETC;
	public JButton buttonADD;
	public JFrame frameHospital;
	public JFrame frameFilter;
	public JFrame frameConfig;
	public JFrame frameTag;
	public JFrame frameJingmai;
	public JFrame frameJingmaiZiWu;
	public JTextPane jText;
	public JTextPane data;
	public JTextPane jxText;
	public JTextPane statistic;
	public DetabbedPane jTabbedpane;
	public JSlider size_font_slider;
	public JSlider color_bg_slider;
	public JSlider read_speed_slider;
	public BufferedImage tempBufferedImage;
	// public PageP_M pageP_M;
	public JCheckBox risk_filter_box;
	public JCheckBox feel_filter_box;
	public JCheckBox zonghe_filter_box;
	public JCheckBox shuming_filter_box;
	//
	public JLabel yaoCaiLabel;// later do
	public JLabel jingmai_filter;
	public JLabel color_text;
	public JLabel size_font;
	public JLabel density_bloosm;
	public JLabel read_speed;
	public JLabel color_bg;// later do
	public JLabel zonghe_filter;
	public JLabel shuming_filter;
	public JLabel jlabel_filter_not_have;
	public JLabel risk_filter;
	public JLabel feel_filter;
	public JLabel xingwei_filter;
	public JLabel wei_filter;
	public JLabel luo_filter;
	// guies
	public JFrame frame;
	public JScrollPane jScrollPaneJingmai;
	public JScrollPane jScrollPaneJingmaiZiWu;
	public JScrollPane jsp_name;
	public JScrollPane jsp_name_filter;
	public JScrollPane jsp_name_filter_not_have;
	public JScrollPane jsp_nameFeelFilter;
	public JScrollPane jScrollPane;
	public JPanel panelZiWu = new JPanel();
	public Line2025 line2025;
	@SuppressWarnings("rawtypes")
	public JComboBox newFilterLine = new JComboBox();
	public JTextPane text;
	public JCheckBox wei_filter_box;
	public JCheckBox luo_filter_box;
	public CfxTextField name;
	public JTextField nameHospital;
	public JTextField name_filter;
	public JButton buttonGXB;
	public JButton button12Jingmai;
	public JButton buttonZiWu;
	public DetaButton buttonCTV;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public DetaButton jlabel_filter_button;
	public DetaButton clearButton;
	public JSlider look;
	public JSlider rate;
	public JSlider leaf;

	public App_S_Guies() {
		super();
	}
}