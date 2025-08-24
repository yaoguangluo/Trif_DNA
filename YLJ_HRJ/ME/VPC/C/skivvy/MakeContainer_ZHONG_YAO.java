package ME.VPC.C.skivvy;

import A_V.ATIPDAXQDTIV.TaskMakeCoWorker;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import ME.VPC.S.ne.WindowsUI;
import ME.VPC.V.table.ZhongYaoTableSimple;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
//zhongyaoPage
@SuppressWarnings("unused")
public class MakeContainer_ZHONG_YAO extends MakeContainer_X_S_s
		implements MouseListener {
	public long timeStop = 0;
	public boolean firstTime = true;
	public ZhongYaoTableSimple zhongYaoTableSimple;
	public JScrollPane jsp_table;

	public MakeContainer_ZHONG_YAO(Container jpanelFirst, App app_NE) {
		super(app_NE);
		NE = app_NE;
		this.containerPanel = jpanelFirst;
		jpanelFirst.setLayout(null);
		jpanelFirst.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		jsp_table = null;
		zhongYaoTableSimple = new ZhongYaoTableSimple();
		jsp_table = new JScrollPane(zhongYaoTableSimple.jTable(app_S, NE));
		jsp_table.setBounds(5, 0, WindowsUI.commonWidth - 20, 275);// 中药表
		jpanelFirst.add(jsp_table);
	}

	public void start() {
		try {
			if (null == NE || null == app_S) {
				return;
			}
			JScrollPane jsp_data = new JScrollPane(app_S.app_XCDX.data(NE));
			jsp_data.setBounds(5, 299 + 30, 685, 169);
			app_S.panel.setSize(500, 500);
			app_S.panel.setBackground(new Color(210, 210, 210));
			app_S.panel.setLayout(new GridLayout(1, 1));
			JScrollPane jsp_yaotu = new JScrollPane(app_S.app_XCDX.panel());
			jsp_yaotu.setBounds(5, 468 + 30, 685, 162);
			jsp_yaotu.setBackground(new Color(210, 210, 210));
			buttonBox = app_S.app_X_getBox.getBox(NE);
			buttonBox.setBackground(new Color(210, 210, 210));// 子午控件行
			buttonBox.setBounds(5, 274, 685, 22 + 30);
			containerPanel.add(jsp_yaotu);
			containerPanel.add(jsp_data);
			containerPanel.add(buttonBox);
			containerPanel.validate();
			containerPanel.setName("药食同源");
			jTabbedpane.addMouseListener(this);
			taskMakeCoWorker = new TaskMakeCoWorker(app_S, containerPanel, _AE,
					pos, NE);
			taskMakeCoWorker.start();
		} catch (Exception e) {
			if (null == jTabbedpane) {
				e.printStackTrace();
				return;// mock trif
			}
			jTabbedpane.validate();
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (null == arg0) {
			return;// fatal error;
		}
		if (1 == arg0.getButton()) {
			timeStop = System.currentTimeMillis() - timeStop;
			if (firstTime && timeStop > 2000) {
				firstTime = false;
				jTabbedpane.stateChanged(null);
				firstTime = true;
				timeStop = System.currentTimeMillis();
			}
		}
		if (3 == arg0.getButton()) {
			int index = jTabbedpane.getSelectedIndex();
			Component component = jTabbedpane.getComponentAt(index);
			doJump(component, component.getName());
		}
	}

	public void doJump(Component component, String name) {
		if (name == null || name.contains("本草")) {
			return;
		}
		JFrame frameTag = new JFrame(name);
		frameTag.setSize(1330, 720);
		Point point = java.awt.MouseInfo.getPointerInfo().getLocation();
		frameTag.setLocation(point.x, point.y);
		frameTag.setResizable(false);
		frameTag.add(jTabbedpane.getSelectedComponent());
		frameTag.setVisible(true);
		frameTag.show();
		frameTag.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				if (null == NE.app_S) {
					return;
				}
				if (null != NE.app_S.line2025) {
					if (null != NE.app_S.line2025.detaButton) {
						if (NE.app_S.jTabbedpane.lastName.contains("智能声学")) {
							NE.app_S.line2025.detaButton.doClick();
						}
					}
				}
				if (null != NE.app_S.monitor) {
					if (null != NE.app_S.monitor.monitor_X_S) {
						if (null != NE.app_S.monitor.monitor_X_S.bt00) {
							if (NE.app_S.jTabbedpane.lastName
									.contains("智能视觉")) {
								NE.app_S.monitor.monitor_X_S.bt00.doClick();
							}
						}
					}
				}
				NE.app_S.jTabbedpane.updateUI();
				jTabbedpane.addTab(name, new ImageIcon(), component, name);
				Color[] colors = TableRender.getTableCellRender();
				jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1,
						colors[jTabbedpane.getTabCount() % 3]);
				jTabbedpane.validate();
			}
		});
		//
		if (null != component) {
			jTabbedpane.remove(component);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
//        super(app_S, jTabbedpane, _A, pos, null, null
//                , null, null, null, null);
//127
//                    if (null != NE.app_S.soundWaveJPanelNew) {
//                        if (NE.app_S.reg != 0) {
//                            NE.app_S.reg = 0;
//                            if (null != NE.app_S.soundWaveJPanelNew.detaButton) {
//                                NE.app_S.soundWaveJPanelNew.detaButton.doClick();
//                            }
//                        }
//                    }
//                    if (null != NE.app_S.monitor) {
//                        if (null != NE.app_S.monitor.monitor_X_S) {
//                            if (null != NE.app_S.monitor.monitor_X_S.bt00) {
//                                NE.app_S.monitor.monitor_X_S.bt00.doClick();
//                            }
//                        }
//                    }