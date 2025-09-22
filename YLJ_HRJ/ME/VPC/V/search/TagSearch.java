package ME.VPC.V.search;

import ME.VPC.S.ne.WindowsUI;
import M_V.ME.APM.VSQ.ESI.SVQ.search.CaiJPanel;
import M_V.MVQ.tabbedpane.DetabbedPane;
import S_A.SVQ.stable.S_File;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.KeyEvent;

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
public class TagSearch extends ScrollPane {
	//

	@SuppressWarnings("unchecked")
	public void IV_(JTextField name) {
		S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		DetabbedPane jTabbedpane = new DetabbedPane();
		Container duo_guo_yu_yuanContainer = new Container();
		CaiJPanel duo_guo_yu_yuanJPanel = new CaiJPanel(name);
		duo_guo_yu_yuanContainer.setLayout(null);
		duo_guo_yu_yuanContainer.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		duo_guo_yu_yuanContainer.add(duo_guo_yu_yuanJPanel);
		jTabbedpane.addTab("多国语言", new ImageIcon(), duo_guo_yu_yuanContainer,
				"做词汇的解释详细解释。");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0);

		Container cai_cai_wo_xinContainer = new Container();
		CaiJPanel cai_cai_wo_xinJPanel = new CaiJPanel(name);
		cai_cai_wo_xinContainer.setLayout(null);
		cai_cai_wo_xinContainer.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		cai_cai_wo_xinContainer.add(cai_cai_wo_xinJPanel);
		jTabbedpane.addTab("猜猜我心", new ImageIcon(), cai_cai_wo_xinContainer,
				"猜猜我心");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1);

		Container zai_xian_sou_suoContainer = new Container();
		CaiJPanel zai_xian_sou_suoJPanel = new CaiJPanel(name);
		zai_xian_sou_suoContainer.setLayout(null);
		zai_xian_sou_suoContainer.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		zai_xian_sou_suoContainer.add(zai_xian_sou_suoJPanel);
		jTabbedpane.addTab("在线搜索", new ImageIcon(), zai_xian_sou_suoContainer,
				"在线搜索");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2);

		Container ci_yu_lian_xiangContainer = new Container();
		CaiJPanel ci_yu_lian_xiangJPanel = new CaiJPanel(name);
		ci_yu_lian_xiangContainer.setLayout(null);
		ci_yu_lian_xiangContainer.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		ci_yu_lian_xiangContainer.add(ci_yu_lian_xiangJPanel);
		jTabbedpane.addTab("词语联想", new ImageIcon(), ci_yu_lian_xiangContainer,
				"词语联想");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3);

		Container duo_guo_yu_yinContainer = new Container();
		CaiJPanel duo_guo_yu_yinJPanel = new CaiJPanel(name);
		duo_guo_yu_yinContainer.setLayout(null);
		duo_guo_yu_yinContainer.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		duo_guo_yu_yinContainer.add(duo_guo_yu_yinJPanel);
		jTabbedpane.addTab("多国语音", new ImageIcon(), duo_guo_yu_yinContainer,
				"多国语音");
		jTabbedpane.setMnemonicAt(4, KeyEvent.VK_4);

		this.setPreferredSize(new Dimension(450, 300));
		this.add(jTabbedpane);
		this.setBounds(0, 0, 455, 305);
		this.setVisible(true);
		this.validate();
	}
}