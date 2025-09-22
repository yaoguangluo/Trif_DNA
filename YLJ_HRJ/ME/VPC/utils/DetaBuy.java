package ME.VPC.utils;

import ME.VPC.M.app.App;
import ME.VPC.V.config.DetaJPanel;
import M_V.MVQ.tabbedpane.DetabbedPane;
import S_A.SVQ.stable.S_File;

import javax.swing.ImageIcon;
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
public class DetaBuy extends ScrollPane {
	//
	public boolean isConfig = true;
	public DetaJPanel SectionJPanel;

	@SuppressWarnings("unchecked")
	public void IV_(App app) {
		S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		DetabbedPane jTabbedpane = new DetabbedPane();
		Container SectionJPanelContainer = new Container();
		SectionJPanel = new DetaJPanel(app);
		SectionJPanel.setLayout(null);
		SectionJPanel.setBounds(0, 0, 800, 750);
		SectionJPanelContainer.add(SectionJPanel);
		jTabbedpane.addTab("购买版面", new ImageIcon(), SectionJPanelContainer,
				"购买版面");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0);
		// this.setLayout(null);
		this.setPreferredSize(new Dimension(800, 750));
		// jTabbedpane.setBounds(0, 0, 805, 505);
		this.add(jTabbedpane);
		this.setBounds(0, 0, 793, 753);
		this.setVisible(true);
		this.validate();
	}
}