package ME.VPC.H.hospital;

import ME.VPC.S.ne.WindowsUI;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.ScrollPane;

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
public class ZhongYaoJPanel extends JPanel {

	public ZhongYaoJPanel(JTextField name) {
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);
		name.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		// 推荐的话\
		this.removeAll();
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(0, 0, 1180, 610);
		scrollPane.add(name);
		this.add(scrollPane);
		// this.add(name);
		// 加处方
	}

	public ZhongYaoJPanel(JTextPane name) {
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);
		name.setBounds(0, 0, 1180, 1480);
		// 推荐的话\
		this.removeAll();
		// this.add(name);
		// 加处方
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(0, 0, 1130, 580);
		scrollPane.add(name);
		this.add(scrollPane);
	}
}
