package ME.VPC.M.X;

//import ME.VPC.C.skivvy.MakeContainerZNXZ;
import ME.VPC.M.app.App;
import ME.VPC.M.app.AppHospital;
import M_V.MVQ.button.HrjButton;
import O_V.OPM.ESU.admin.VPCSRestPanel;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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
public class AppInit_X_PageLoad_SD {

	protected void doAmedicinefilter(App NE)
			throws InterruptedException, IOException {
		App app = NE;
		VPCSRestPanel vPCSRestPanel = app.app_S.appConfig.vPCSRestPanel;
		// --------------------------------------------------------------------------------
		JLabel yxsxLabel = new JLabel("面向医学特殊筛选" + ":");
		yxsxLabel.setForeground(Color.red);
		yxsxLabel.setBounds(10 + 0 * 130, 20 + 25 * 8, 150, 25);
		vPCSRestPanel.add(yxsxLabel);
		int x = 350;
		int y = 237;
		app.app_S.jlabel_filter_button = new M_V.MVQ.button.DetaButton("滤:");
		app.app_S.jlabel_filter_button.setBounds(972 - 10 - x, 8 + y, 50, 22);
		app.app_S.jlabel_filter_button.setBackground(Color.green);
		app.app_S.jlabel_filter_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (null == app.app_S.appFilter) {
					app.app_S.appFilter = new AppFilter_X_IV_();
					app.app_S.appFilter.IV_(app.app_S.name_filter,
							app.app_S.nameFeelFilter,
							app.app_S.name_filter_not_have);
					app.app_S.appFilter.setBounds(0, 0, 785, 655);
					app.app_S.appFilter.setVisible(true);
					app.app_S.appFilter.show();
					app.app_S.frameFilter = new JFrame("电子护理站 过滤词汇 V1.2.3");
					// frame.setLayout(null);
					app.app_S.frameFilter.setSize(780, 650);
					app.app_S.frameFilter.setLocation(300, 300);
					app.app_S.frameFilter.setResizable(false);
					app.app_S.frameFilter.add(app.app_S.appFilter);
					app.app_S.frameFilter.setVisible(true);
					app.app_S.frameFilter.show();
					app.app_S.frameFilter
							.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				} else {
					app.app_S.frameFilter.setVisible(true);
					app.app_S.frameFilter.show();
				}
			}
		});
		app.app_S.jsp_name_filter = null;
		app.app_S.jsp_name_filter = new JScrollPane(
				app.app_S.app_XCDX.name_filter(NE));
		app.app_S.jsp_name_filter.setBounds(1020 - 3 - x, 8 + y, 580 - 455 - 40,
				22);

		app.app_S.jlabel_filter_not_have = new JLabel("relatiedJingLuoFilter:");
		app.app_S.jlabel_filter_not_have.setForeground(Color.yellow);
		app.app_S.jlabel_filter_not_have.setBounds(719 - x, 20 + y, 100, 50);

		app.app_S.jsp_name_filter_not_have = null;
		app.app_S.jsp_name_filter_not_have = new JScrollPane(
				app.app_S.app_XCDX.name_filter_not_have(NE));
		app.app_S.jsp_name_filter_not_have.setBounds(779 - x, 6 + 28 + y,
				580 - 459, 22);

		app.app_S.risk_filter = new JLabel("fatarFilter:");
		app.app_S.risk_filter.setForeground(Color.green);
		app.app_S.risk_filter.setBounds(10 + 350 - x, 6 + y, 100, 25);

		app.app_S.feel_filter = new JLabel("有关性味:");
		app.app_S.feel_filter.setForeground(Color.pink);
		app.app_S.feel_filter.setBounds(60 + 15 + 7 + 585 + 100 + 152 - x,
				20 + y, 100, 50);

		app.app_S.jsp_nameFeelFilter = null;// 有关性味 先测试下20061
		app.app_S.jsp_nameFeelFilter = new JScrollPane(
				app.app_S.app_XCDX.nameFeelFilter(NE));
		app.app_S.jsp_nameFeelFilter.setBounds(
				60 + 15 + 30 + 580 + 100 + 40 + 152 - x, 6 + 28 + y, 580 - 455,
				22);

		app.app_S.xingwei_filter = new JLabel("healthyFilter:");
		app.app_S.xingwei_filter.setForeground(Color.green);
		app.app_S.xingwei_filter.setBounds(60 + 15 + 7 + 585 - x, -6 + y, 100,
				50);

		app.app_S.luo_filter = new JLabel("经络过滤:");
		app.app_S.luo_filter.setForeground(Color.green);
		app.app_S.luo_filter.setBounds(60 + 15 + 7 + 585 + 200 - x, -6 + y, 100,
				50);

		app.app_S.wei_filter = new JLabel("性味过滤:");
		app.app_S.wei_filter.setForeground(Color.green);
		app.app_S.wei_filter.setBounds(60 + 15 + 7 + 585 + 100 - x, -6 + y, 100,
				50);

		app.app_S.zonghe_filter = new JLabel("inClusterFilter:");
		app.app_S.zonghe_filter.setForeground(Color.green);
		app.app_S.zonghe_filter.setBounds(50 + 15 + 7 + 485 + 7 - x, -6 + y,
				100, 50);

		app.app_S.shuming_filter = new JLabel("professionNameFilter:");
		app.app_S.shuming_filter.setForeground(Color.green);
		app.app_S.shuming_filter.setBounds(1 + 350 + 100 + 10 - x, -6 + y, 100,
				50);

		app.app_S.zonghe_filter_box = new JCheckBox();
		app.app_S.zonghe_filter_box.setBounds(50 + 15 + 7 + 485 + 60 + 7 - x,
				8 + y, 20, 20);
		app.app_S.zonghe_filter_box.setBackground(Color.ORANGE);

		app.app_S.zonghe_filter_box.addActionListener(app);

		app.app_S.shuming_filter_box = new JCheckBox();
		app.app_S.shuming_filter_box.setBounds(1 + 350 + 100 + 60 + 10 - x,
				8 + y, 20, 20);
		app.app_S.shuming_filter_box.setBackground(Color.GREEN);

		app.app_S.luo_filter_box = new JCheckBox();
		app.app_S.luo_filter_box.setBounds(60 + 15 + 30 + 580 + 40 + 200 - x,
				8 + y, 20, 20);
		app.app_S.luo_filter_box.setBackground(Color.GREEN);

		app.app_S.feel_filter_box = new JCheckBox();
		app.app_S.feel_filter_box.setBounds(60 + 15 + 30 + 580 + 40 - x, 8 + y,
				20, 20);
		app.app_S.feel_filter_box.setBackground(Color.MAGENTA);

		app.app_S.wei_filter_box = new JCheckBox();
		app.app_S.wei_filter_box.setBounds(60 + 15 + 30 + 580 + 100 + 40 - x,
				8 + y, 20, 20);
		app.app_S.wei_filter_box.setBackground(Color.MAGENTA);

		app.app_S.risk_filter_box = new JCheckBox();
		app.app_S.risk_filter_box.setBounds(10 + 350 + 60 - x, 8 + y, 20, 20);
		app.app_S.risk_filter_box.setBackground(Color.RED);
		//
		vPCSRestPanel.add(app.app_S.jsp_name_filter);
		vPCSRestPanel.add(app.app_S.jlabel_filter_button);
		vPCSRestPanel.add(app.app_S.jsp_name_filter_not_have);// relatiedJingLuoFilter
		vPCSRestPanel.add(app.app_S.jlabel_filter_not_have);// relatiedJingLuoFilter
		vPCSRestPanel.add(app.app_S.risk_filter);// fatarFilter
		vPCSRestPanel.add(app.app_S.feel_filter);// unrelatiedXingWeiFilter
		vPCSRestPanel.add(app.app_S.xingwei_filter);// healthyFilter
		vPCSRestPanel.add(app.app_S.wei_filter);// 性味过滤
		vPCSRestPanel.add(app.app_S.luo_filter);// 脉络过滤
		vPCSRestPanel.add(app.app_S.luo_filter_box);// 脉络过滤
		vPCSRestPanel.add(app.app_S.wei_filter_box);// 性味过滤box
		vPCSRestPanel.add(app.app_S.risk_filter_box);// fatarFilter

		vPCSRestPanel.add(app.app_S.jsp_nameFeelFilter);// unrelatiedXingWeiFilter200061改
		vPCSRestPanel.add(app.app_S.feel_filter_box);// healthyFilter
		// jPanel.add(jingmai_filter_box);
		vPCSRestPanel.add(app.app_S.zonghe_filter);// inClusterFilter
		vPCSRestPanel.add(app.app_S.shuming_filter);// professionNameFilter
		vPCSRestPanel.add(app.app_S.zonghe_filter_box);// inClusterFilter
		vPCSRestPanel.add(app.app_S.shuming_filter_box);// professionNameFilter

		// --
		// --------------------------------------------------------------------------------
		JLabel dzyyLabel = new JLabel("电子医院" + ":");
		dzyyLabel.setForeground(Color.red);
		dzyyLabel.setBounds(10 + 0 * 130, 20 + 25 * 12, 150, 25);
		vPCSRestPanel.add(dzyyLabel);

		HrjButton jbutton_detao_zai_xian = new HrjButton("德塔在线", 100, 50,
				Color.cyan);
		// jbutton_detao_zai_xian.setBounds(30+60+760+130+130+130-100-50,
		// 6, 100, 50);
		jbutton_detao_zai_xian.setBounds(10 + 1 * 130, 20 + 25 * 13, 100, 50);
		jbutton_detao_zai_xian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String link = "http://tinos.qicp.vip/data.html";
					Runtime.getRuntime().exec(
							"rundll32 url.dll, FileProtocolHandler " + link);
				} catch (IOException e1) {
					app.app_S.jTabbedpane.validate();
				}
			}
		});
		vPCSRestPanel.add(jbutton_detao_zai_xian);

		HrjButton addChuFang = new HrjButton("电子医院", 100, 50, Color.pink);
		// addChuFang.setBounds(50+50+760+130+130-100-50, 6, 100,
		// 50);
		addChuFang.setBounds(10 + 0 * 130, 20 + 25 * 13, 100, 50);
		addChuFang.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				//
				String preAdd = "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, "
						+ "来做证候分析。谢谢!";
				preAdd += "\r\n\r\n *************************\r\n\r\n";
				preAdd += "大综合证候分析：";
				preAdd += "\r\n\r\n *************************\r\n\r\n";
				// 中医诊断：
				preAdd += "中医诊断：\r\n\r\n";
				for (int i = 0; i < 5; i++) {
					preAdd += "证候名：" + (null == app.app_S.zyzdxPage.table
							.getValueAt(i, 2) ? ""
									: app.app_S.zyzdxPage.table.getValueAt(i, 2)
											.toString())
					// + "证候内容："+ (null==zyzdx.table.getValueAt(i, 5)
					// ?"":zyzdx.table.getValueAt(i, 5).toString())
							+ "可能性："
							+ (null == app.app_S.zyzdxPage.table
									.getValueAt(i, 1)
											? ""
											: app.app_S.zyzdxPage.table
													.getValueAt(i, 1)
													.toString());
					preAdd += "\r\n\r\n";
				}
				preAdd += "内科诊断：\r\n\r\n";
				// 内科分析：
				for (int i = 0; i < 5; i++) {
					preAdd += "证候名："
							+ (null == app.app_S.xynkPage.table.getValueAt(i, 2)
									? ""
									: app.app_S.xynkPage.table.getValueAt(i, 2)
											.toString())
					// + "证候意义："+ (null==xynkPage.table.getValueAt(i, 9)
					// ?"":xynkPage.table.getValueAt(i, 9).toString())
							+ "可能性："
							+ (null == app.app_S.xynkPage.table.getValueAt(i, 1)
									? ""
									: app.app_S.xynkPage.table.getValueAt(i, 1)
											.toString());
					preAdd += "\r\n\r\n";
				}
				preAdd += "西医诊断：\r\n\r\n";
				// 西医急诊：
				for (int i = 0; i < 5; i++) {
					preAdd += "证候名："
							+ (null == app.app_S.jzkxPage.table.getValueAt(i, 2)
									? ""
									: app.app_S.jzkxPage.table
											.getValueAt(i, 2).toString())
							+ "可能性："
							+ (null == app.app_S.jzkxPage.table.getValueAt(i, 1)
									? ""
									: app.app_S.jzkxPage.table.getValueAt(i, 1)
											.toString());
					preAdd += "\r\n\r\n";
				}
				preAdd += "外科诊断：\r\n\r\n";
				// 外科分析：
				for (int i = 0; i < 5; i++) {
					preAdd += "证候内容："
							+ (null == app.app_S.wkxPage.table.getValueAt(i, 2)
									? ""
									: app.app_S.wkxPage.table
											.getValueAt(i, 2).toString())
							+ "可能性："
							+ (null == app.app_S.wkxPage.table.getValueAt(i, 1)
									? ""
									: app.app_S.wkxPage.table.getValueAt(i, 1)
											.toString());
					preAdd += "\r\n\r\n";
				}
				preAdd += "\r\n\r\n *************************\r\n\r\n";
				preAdd += "小专科系统组合诊断（可选）：";
				preAdd += "\r\n\r\n *************************\r\n\r\n";
				preAdd += "妇幼诊断：\r\n\r\n";
				// 妇幼分析：
				for (int i = 0; i < 5; i++) {
					preAdd += "证候内容："
							+ (null == app.app_S.fckxPage.table.getValueAt(i, 2)
									? ""
									: app.app_S.fckxPage.table
											.getValueAt(i, 2).toString())
							+ "可能性："
							+ (null == app.app_S.fckxPage.table.getValueAt(i, 1)
									? ""
									: app.app_S.fckxPage.table.getValueAt(i, 1)
											.toString());
					preAdd += "\r\n\r\n";
				}

				preAdd += "伤科：\r\n\r\n";
				// 伤科分析：
				for (int i = 0; i < 5; i++) {
					preAdd += "证候内容："
							+ (null == app.app_S.wskxPage.table.getValueAt(i, 2)
									? ""
									: app.app_S.wskxPage.table
											.getValueAt(i, 2).toString())
							+ "可能性："
							+ (null == app.app_S.wskxPage.table.getValueAt(i, 1)
									? ""
									: app.app_S.wskxPage.table.getValueAt(i, 1)
											.toString());
					preAdd += "\r\n\r\n";
				}

				String xiYaoTuiJian = "";
				xiYaoTuiJian += "*************************\r\n\r\n";
				xiYaoTuiJian += "中西医结合用药打分排序（可选）：";
				xiYaoTuiJian += "\r\n\r\n *************************\r\n\r\n";
				xiYaoTuiJian += "西药推荐：\r\n\r\n";
				// 分析：
				for (int i = 0; i < 20; i++) {
					xiYaoTuiJian += "推荐名："
							+ (null == app.app_S.xyscPage.table.getValueAt(i, 2)
									? ""
									: app.app_S.xyscPage.table
											.getValueAt(i, 2).toString())
							+ "适应内容："
							+ (null == app.app_S.xyscPage.table.getValueAt(i, 8)
									? ""
									: app.app_S.xyscPage.table
											.getValueAt(i, 8).toString())
							+ "可能性："
							+ (null == app.app_S.xyscPage.table.getValueAt(i, 1)
									? ""
									: app.app_S.xyscPage.table.getValueAt(i, 1)
											.toString());
					xiYaoTuiJian += "\r\n\r\n";
				}
				preAdd += xiYaoTuiJian;
				preAdd += "方剂推荐：\r\n\r\n";
				// 方剂分析：
				for (int i = 0; i < 5; i++) {
					preAdd += "推荐名：" + (null == app.app_S.zynkxPage.table
							.getValueAt(i, 2)
									? ""
									: app.app_S.zynkxPage.table
											.getValueAt(i, 2).toString())
							+ "推荐内容："
							+ (null == app.app_S.zynkxPage.table
									.getValueAt(i, 4)
											? ""
											: app.app_S.zynkxPage.table
													.getValueAt(i,
															4)
													.toString())
							+ "可能性："
							+ (null == app.app_S.zynkxPage.table
									.getValueAt(i, 1)
											? ""
											: app.app_S.zynkxPage.table
													.getValueAt(i, 1)
													.toString());
					preAdd += "\r\n\r\n";
				}
				preAdd += "\r\n\r\n";
				String zhongYaoTuiJian = "";
				//
				zhongYaoTuiJian += "*************************";
				zhongYaoTuiJian += "\r\n\r\n";
				zhongYaoTuiJian += "仅作中药推荐, 不做处方权分析, 请拥有处方权职业药师慎重分析药理"
						+ "根据病情搭配修改。谢谢!";
				zhongYaoTuiJian += "\r\n\r\n *************************";
				zhongYaoTuiJian += "\r\n\r\n";
				for (int r = 0; r < (app.app_S.newTableModel.getRowCount() < 30
						? app.app_S.newTableModel.getRowCount()
						: 30); r++) {
					if (app.app_S.newTableModel.getValueAt(r, 2) != null
							&& !app.app_S.newTableModel.getValueAt(r, 2)
									.toString().isEmpty()) {
						zhongYaoTuiJian += app.app_S.newTableModel.getValueAt(r,
								2);
					}
					zhongYaoTuiJian += "/";
					if (app.app_S.newTableModel.getValueAt(r, 6) != null
							&& !app.app_S.newTableModel.getValueAt(r, 6)
									.toString().isEmpty()) {
						String temp = app.app_S.newTableModel.getValueAt(r, 6)
								.toString();
						String value = "";
						for (int i = 0; i < temp.length(); i++) {
							if (temp.charAt(i) < 128 || temp.charAt(i) == '~') {
								value += temp.charAt(i);
							} else {
								value += " ";
							}
						}
						String[] temps = value.replaceAll("\\s+", " ")
								.split(" ");
						if (temps.length > 0
								&& temps[0].split("~").length > 1) {
							// value= temps[0].split("~")[1];
							value = temps[0].split("~")[0].charAt(
									temps[0].split("~")[0].length() - 1) + "~";
							value += temps[0].split("~")[1].replaceAll("g+",
									"");
							value += "g;";
						} else {
							value = "请酌情添加;";
						}
						zhongYaoTuiJian += value;
					} else {
						zhongYaoTuiJian += "请酌情添加;";
					}
					if (r % 2 != 0) {
						zhongYaoTuiJian += "\r\n\r\n";
					} else {
						zhongYaoTuiJian += "\r\n\r\n";
					}
				}
				preAdd += zhongYaoTuiJian;
				if (app.app_S.text.getText().length() < 8000) {
					if (preAdd.length() < 8000) {
						if (!app.app_S.text.getText().isEmpty()) {
							app.app_S.text.setText(preAdd + "\r\n\r\n"
									+ app.app_S.text.getText());
						} else {
							app.app_S.text.setText(preAdd);
						}
					}
				} else {
					app.app_S.text.setText(preAdd);
				}
				app.app_S.text.validate();

				if (app.app_S.jText.getText().length() < 8000) {
					if (zhongYaoTuiJian.length() < 8000) {
						if (!app.app_S.jText.getText().isEmpty()) {
							app.app_S.jText.setText(zhongYaoTuiJian + "\r\n\r\n"
									+ app.app_S.jText.getText());
						} else {
							app.app_S.jText.setText(zhongYaoTuiJian);
						}
					}
				} else {
					app.app_S.jText.setText(zhongYaoTuiJian);
				}
				app.app_S.jText.validate();

				if (app.app_S.jxText.getText().length() < 8000) {
					if (xiYaoTuiJian.length() < 8000) {
						if (!app.app_S.jxText.getText().isEmpty()) {
							app.app_S.jxText.setText(xiYaoTuiJian + "\r\n\r\n"
									+ app.app_S.jxText.getText());
						} else {
							app.app_S.jxText.setText(xiYaoTuiJian);
						}
					}
				} else {
					app.app_S.jxText.setText(xiYaoTuiJian);
				}
				app.app_S.jxText.validate();

				try {
					if (null == app.app_S.frameHospital) {
						app.app_S.appHospital = new AppHospital();
						app.app_S.appHospital.IV_(app.app_S.jText, app);
						app.app_S.appHospital.setBounds(0, 0, 1145, 455);
						app.app_S.appHospital.setVisible(true);
						app.app_S.appHospital.show();
						app.app_S.frameHospital = new JFrame(
								"电子医院诊断推荐报告 V0.0.3");
						// frame.setLayout(null);
						app.app_S.frameHospital.setSize(1140, 650);
						app.app_S.frameHospital.setLocation(300, 300);
						app.app_S.frameHospital.setResizable(false);
						app.app_S.frameHospital.add(app.app_S.appHospital);
						app.app_S.frameHospital.setVisible(true);
						app.app_S.frameHospital.show();
						app.app_S.frameHospital
								.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					} else {
						app.app_S.appHospital = new AppHospital();
						app.app_S.appHospital.IV_(app.app_S.jText, app);
						app.app_S.appHospital.setBounds(0, 0, 1145, 455);
						app.app_S.appHospital.setVisible(true);
						app.app_S.appHospital.show();
						app.app_S.frameHospital = new JFrame(
								"电子医院诊断推荐报告 V0.0.3");
						// frame.setLayout(null);
						app.app_S.frameHospital.setSize(1140, 650);
						app.app_S.frameHospital.setLocation(300, 300);
						app.app_S.frameHospital.setResizable(false);
						app.app_S.frameHospital.add(app.app_S.appHospital);
						app.app_S.frameHospital.setVisible(true);
						app.app_S.frameHospital.show();
						app.app_S.frameHospital
								.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					}
				} catch (Exception exceptione) {
					exceptione.printStackTrace();
				}
				app.app_S.jText.validate();
			}
		});
		vPCSRestPanel.add(addChuFang);
	}
}
//		System.out.println("启动400编码调试开始-00000061");
//DetaThread.sleepDeta(300);
//if (app.appConfig.vPCSRestPanel.tabNamesHook[16]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 哈里森医典 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerHLS makeContainerHLS = new MakeContainerHLS(NE);
//	makeContainerHLS.start();
//}
//if (app.appConfig.vPCSRestPanel.tabNamesHook[5]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入西医内科页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXYNK makeContainerXYNK = new MakeContainerXYNK(NE);
//	makeContainerXYNK.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[7]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入中医诊断页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerZYZD makeContainerZYZD = new MakeContainerZYZD(NE);
//	makeContainerZYZD.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[8]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入古籍页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerGJJD makeContainerGJJD = new MakeContainerGJJD(NE);
//	makeContainerGJJD.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[9]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入中医妇产页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerZYFC makeContainerZYFC = new MakeContainerZYFC(NE);
//	makeContainerZYFC.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[10]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 西医妇产 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXXFC makeContainerXXFC = new MakeContainerXXFC(NE);
//	makeContainerXXFC.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[11]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 西医急诊 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXYJZ makeContainerXYJZ = new MakeContainerXYJZ(NE);
//	makeContainerXYJZ.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[12]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 西医外科 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerXYWK makeContainerXYWK = new MakeContainerXYWK(NE);
//	makeContainerXYWK.start();
//	DetaThread.sleepDeta(300);
//}
//
//if (app.appConfig.vPCSRestPanel.tabNamesHook[13]) {
//	if (app.appConfig.SectionJPanel.jTextPane != null) {
//		String text = app.appConfig.SectionJPanel.jTextPane.getText();
//		text = "\r\n" + "----正在载入 中医外伤 页面！" + text;
//		text = "\r\n" + "..." + text;
//		app.appConfig.SectionJPanel.jTextPane.setText(text);
//	}
//	MakeContainerZYWS makeContainerZYWS = new MakeContainerZYWS(NE);
//	makeContainerZYWS.start();
//	DetaThread.sleepDeta(300);
//}
//DetaThread.sleepDeta(300);
//// }