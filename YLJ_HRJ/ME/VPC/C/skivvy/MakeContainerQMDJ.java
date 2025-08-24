package ME.VPC.C.skivvy;

import E_A.ME.analysis.E.AE;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import ME.VPC.S.ne.WindowsUI;
import M_V.ME.APM.VSQ.xlx.CoAuthorForWord;
import M_V.MVQ.button.DetaButton;
import S_A.SVQ.stable.S_ShellETL;
import exception.thread.DetaThread;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

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
public class MakeContainerQMDJ extends MakeContainer_X_S_s
		implements MouseMotionListener {
	public MakeContainerQMDJ(Container jpanel5, App app_NE) {
		super(app_NE);
		NE = app_NE;
		this.containerPanel = jpanel5;
		if (null == NE.app_S) {
			return;// mock trif
		}
		this._A = (AE) NE.app_S.studyVerbaMap.getObject("_A");
		// this._A = NE.app_S._A;
	}

	public void run() {
		if (null == jTabbedpane) {
			return;// mock trif
		}
		jTabbedpane.validate();
		DetaThread.sleepDeta(1000 * 2);
		panel_bg = new JPanel();
		panel_bg.setSize(460, 460);
		JLabel label88 = new JLabel(app_S.imageIndex.png88);
		// app_S.panel.setLayout(new GridLayout(20, 1));
		panel_bg.add(label88);
		panel_bg.addMouseMotionListener(this);
		JScrollPane jsp_bagua = new JScrollPane(panel_bg);
		jsp_bagua.setBounds(10, 60, 635, 410);

		JPanel panel_shun = new JPanel();
		panel_shun.setSize(460, 460);
		JLabel jshun = new JLabel(app_S.imageIndex.shun);
		// app_S.panel.setLayout(new GridLayout(20, 1));
		panel_shun.add(jshun);
		JScrollPane jsp_shun = new JScrollPane(panel_shun);
		jsp_shun.setBounds(10, 10 + 410 + 40 + 20, 635, 190 - 38);

		JPanel panel_wsp = new JPanel();
		panel_wsp.setSize(460, 460);
		JLabel jwsp = new JLabel(app_S.imageIndex.wsp);
		// app_S.panel.setLayout(new GridLayout(20, 1));
		panel_wsp.add(jwsp);
		JScrollPane jsp_wsp = new JScrollPane(panel_wsp);
		jsp_wsp.setBounds(WindowsUI.makeContainerQMDJBasicWidth + 10, 10, 320,
				320);

		JPanel panel_wxp = new JPanel();
		panel_wxp.setSize(460, 460);
		JLabel jwxp = new JLabel(app_S.imageIndex.wxp);
		// app_S.panel.setLayout(new GridLayout(20, 1));
		panel_wxp.add(jwxp);
		JScrollPane jsp_wxp = new JScrollPane(panel_wxp);
		jsp_wxp.setBounds(WindowsUI.makeContainerQMDJBasicWidth + 320 + 20, 10,
				320, 320);

		JPanel panel_qp4 = new JPanel();
		panel_qp4.setSize(360, 360);
		JLabel jqp4 = new JLabel(app_S.imageIndex.qp4);
		app_S.panel.setLayout(new GridLayout(13, 1));
		panel_qp4.add(jqp4);
		JScrollPane jsp_qp4 = new JScrollPane(panel_qp4);
		jsp_qp4.setBounds(WindowsUI.makeContainerQMDJBasicWidth + 10,
				10 + 320 + 20, 320, 320 - 38);

		JPanel panel_wwp = new JPanel();
		panel_wwp.setSize(460, 460);
		JLabel jwwp = new JLabel(app_S.imageIndex.wwp);
		// app_S.panel.setLayout(new GridLayout(20, 1));
		panel_wwp.add(jwwp);
		JScrollPane jsp_wwp = new JScrollPane(panel_wwp);
		jsp_wwp.setBounds(WindowsUI.makeContainerQMDJBasicWidth + 320 + 20,
				10 + 320 + 20, 320, 320 - 38);

		Box buttonVecBox = new Box(BoxLayout.X_AXIS);
		buttonVecBox.setBounds(10, 10, 630, 22);
		DetaButton bt_skch = new DetaButton("生克乘诲");
		bt_skch.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_skch);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_skch), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_bgxs = new DetaButton("八酉钥匙");
		bt_bgxs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_gzxs);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_gzxs), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});
		buttonVecBox.add(bt_bgxs);

		DetaButton bt_bgbz = new DetaButton("八纲");
		bt_bgbz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_bgbz);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_bgbz), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_ljbz = new DetaButton("六经");
		bt_ljbz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_ljbz);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_ljbz), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_sjbz = new DetaButton("三焦综合");
		bt_sjbz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_sjbz);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_sjbz), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_qxbz = new DetaButton("子午要穴");
		bt_qxbz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_qxbz);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_qxbz), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});
		DetaButton bt_jlbz = new DetaButton("天星辩证");
		bt_jlbz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.png88);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.png88), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		buttonVecBox.add(bt_bgbz);
		buttonVecBox.add(bt_ljbz);
		buttonVecBox.add(bt_sjbz);
		buttonVecBox.add(bt_qxbz);
		buttonVecBox.add(bt_jlbz);
		buttonVecBox.add(bt_skch);
		buttonVecBox.add(bt_bgxs);

		Box buttonSecondVecBox = new Box(BoxLayout.X_AXIS);
		buttonSecondVecBox.setBounds(10, 35, 630, 22);

		DetaButton bt_jlbz1 = new DetaButton("堪舆定藏");
		bt_jlbz1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_KYCQ);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_KYCQ), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_jlbz2 = new DetaButton("易数");
		bt_jlbz2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_MHYS);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_MHYS), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_jlbz3 = new DetaButton("子午全象");
		bt_jlbz3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_YHZP);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_YHZP), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_jlbz4 = new DetaButton("流注因果");
		bt_jlbz4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_QNZS);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_QNZS), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_jlbz5 = new DetaButton("六壬");
		bt_jlbz5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_YDLR);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_YDLR), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});

		DetaButton bt_jlbz6 = new DetaButton("元基罗盘");
		bt_jlbz6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_ZSBZ);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_ZSBZ), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});
		DetaButton bt_jlbz7 = new DetaButton("河洛理数");
		bt_jlbz7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label88 = new JLabel(app_S.imageIndex.bagua_HLLS);
				panel_bg.removeAll();
				panel_bg.add(label88);
				panel_bg.updateUI();
				panel_wsp.removeAll();
				panel_wsp.add(panel_wwp.getComponents()[0], 0);
				panel_wsp.updateUI();
				panel_wwp.add(panel_qp4.getComponents()[0], 0);
				panel_wwp.updateUI();
				panel_qp4.add(panel_wxp.getComponents()[0], 0);
				panel_qp4.updateUI();
				panel_wxp.add(new JLabel(app_S.imageIndex.bagua_HLLS), 0);
				panel_wxp.updateUI();
				jTabbedpane.validate();
			}
		});
		buttonSecondVecBox.add(bt_jlbz1);
		buttonSecondVecBox.add(bt_jlbz2);
		buttonSecondVecBox.add(bt_jlbz3);
		buttonSecondVecBox.add(bt_jlbz4);
		buttonSecondVecBox.add(bt_jlbz5);
		buttonSecondVecBox.add(bt_jlbz6);
		buttonSecondVecBox.add(bt_jlbz7);

		DetaButton bt_3d = new DetaButton(S_ShellETL.SHELL_ETL_GREATER);
		bt_3d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoAuthorForWord app;
				app = new CoAuthorForWord(NE);// need init scope later..
				app.setSize(1050, 800);
				app.setVisible(true);
				JFrame f = new JFrame();
				f.add(app);
				f.setTitle("三维奇门");
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				f.setSize(WindowsUI.makeContainerQMDJ3D, 800);
				f.setVisible(true);
			}
		});
		bt_3d.setBounds(612 + 20, 10, 30, 47);

		containerPanel.add(bt_3d);
		containerPanel.add(buttonVecBox);
		containerPanel.add(buttonSecondVecBox);
		containerPanel.add(jsp_bagua);
		containerPanel.add(jsp_wwp);
		containerPanel.add(jsp_wxp);
		containerPanel.add(jsp_wsp);
		containerPanel.add(jsp_qp4);
		containerPanel.add(jsp_shun);
		containerPanel.setLayout(null);
		containerPanel.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		containerPanel.setName("位术数");
		jTabbedpane.addTab(containerPanel.getName(), new ImageIcon(),
				containerPanel, containerPanel.getName());
		Color[] colors = TableRender.getTableCellRender();
		jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1,
				colors[jTabbedpane.getTabCount() % 3]);
		jTabbedpane.validate();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (null == e) {
			return;// fatal trif
		}
		if (currentX == 0 && currentY == 0) {
			currentX = e.getX();
			currentY = e.getY();
		}
		panel_bg.getComponent(0);

		// new BufferedImage();
		currentX = e.getX();
		currentY = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}
}