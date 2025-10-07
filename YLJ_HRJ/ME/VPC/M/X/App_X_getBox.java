package ME.VPC.M.X;

import ME.VPC.S.ne.App_S;
import DSU.V.VtoV;

import ME.VPC.M.app.App;
import ME.VPC.V.search.TagSearch;
import M_V.MVQ.button.DetaButton;
import O_V.OSI.AOP.neo.tts.ReadChinese;
import O_V.OSI.AOP.rest.medicine.RestMedicinePort_E;
import P.image.Color_P;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.SVQ.stable.S_Tag;
import S_A.pheromone.IMV_SQI_SS;
import S_A.pheromone.IMV_SQI_S_;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import exception.thread.DetaThread;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.BadLocationException;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class App_X_getBox {
	public App_S app;

	public void IV_(App app) {
		this.app = app.app_S;
	}

	//.........161...
	//本函数的hyperlinkUpdate 格式
	// 查阅了https://blog.csdn.net/nullpointer2008/article/details/7998986 文章。
	//20200323 罗瑶光修改
	//版权声明：本文为CSDN博主「空指针1996」的原创文章, 遵循 CC 4.0 BY-SA 版权协议,
	//转载请附上原文出处链接及本声明。
	//原文链接：https://blog.csdn.net/nullpointer2008/article/details/7998986);
	//.........、
	//191摘自第37行 https://blog.csdn.net/code_better/article/details/53505962
	public Box getBox(App NE) {
		app.buttonADD = new DetaButton(S_Tag.TIAN_JIA_DAO_BIAN_JI_YE,
			100, 50, Color.pink);
		app.buttonADD.setBounds(295 - 15, 0, 135, 30);
		app.buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (app.sets == null) {
					return;
				}
				if (app.text.getText().length() > 5000) {
					return;
				}
				StringBuilder page = new StringBuilder();
				List<String> setsForGet = app.sets;
				Iterator<String> iterator = setsForGet.iterator();
				while (iterator.hasNext()) {
					String setOfi = iterator.next();
					page.append(setOfi);
				}
				if (!app.text.getText().isEmpty()) {
					app.text.setText(app.text.getText() + "\r\n\r\n"
						+ page.toString());
				} else {
					app.text.setText(page.toString());
				}
				app.text.validate();
			}
		});
		app.buttonCTE = new DetaButton("英", 60, 50, Color.orange);
		app.buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (app.sets == null) {
					return;
				}
				doButtonCTE(NE);
			}
		});

		app.buttonFRS = new DetaButton("还原", 90, 50, Color.green);
		app.buttonFRS.setBounds(0, 0, 120, 50);
		app.buttonFRS.setForeground(Color.green);
		app.buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (app.sets == null) {
					return;
				}
				doButtonFRS(NE);
			}
		});
		app.buttonETC = new DetaButton("同义词描述", 100, 50, Color.pink);
		app.buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (app.sets == null) {
					return;
				}
				doButtonETC();
			}
		});
		app.buttonGXB = new JButton("更新到表格");
		app.buttonETC.setBounds(200 - 15, 0, 88, 30);
		app.buttonGXB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (app.sets == null) {
					return;
				}
				String temp = null;
				try {
					temp = app.data.getDocument().getText(0, app.data
						.getDocument().getLength());
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
				app.table.setValueAt(temp, app.row, app.col);
				//System.out.println(temp);
				app.appConfig.SectionJPanel.jTextPane.setText(temp);
			}
		});
		app.button12Jingmai = new DetaButton("十二经", 90, 50,
			Color.pink);
		app.button12Jingmai.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (null == app.frameJingmai) {
					app.frameJingmai = new JFrame("十二经络");
					//frame.setLayout(null);
					app.frameJingmai.setSize(800, 600);
					Point point = java.awt.MouseInfo.getPointerInfo()
						.getLocation();
					app.frameJingmai.setLocation(point.x, point.y);
					app.frameJingmai.setResizable(true);
					app.jScrollPaneJingmai = new JScrollPane(
						app.panel);
					app.frameJingmai.add(app.jScrollPaneJingmai);
					app.frameJingmai.setVisible(true);
					app.frameJingmai.show();
					app.frameJingmai.setDefaultCloseOperation(
						JFrame.HIDE_ON_CLOSE);
				} else if (!app.frameJingmai.isShowing()) {
					Point point = java.awt.MouseInfo.getPointerInfo()
						.getLocation();
					app.frameJingmai.setLocation(point.x, point.y);
					app.frameJingmai.setVisible(true);
					app.frameJingmai.show();
					app.panel.validate();
					NE.validate();
					//app.validate();
				}
			}
		});

		app.buttonZiWu = new DetaButton("子午象", 90, 50, Color.pink);
		//app.buttonETC.setBounds(200 - 15, 0, 88, 30);
		app.buttonZiWu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (null == app.frameJingmaiZiWu) {
					app.frameJingmaiZiWu = new JFrame("子午象");
					app.frameJingmaiZiWu.setSize(800, 600);
					Point point = java.awt.MouseInfo.getPointerInfo()
						.getLocation();
					app.frameJingmaiZiWu.setLocation(point.x,
						point.y);
					app.frameJingmaiZiWu.setResizable(true);
					JLabel labelziwuxiang = new JLabel(app.ziwuxiang);
					app.panelZiWu.add(labelziwuxiang);
					app.jScrollPaneJingmaiZiWu = new JScrollPane(
						app.panelZiWu);
					app.frameJingmaiZiWu.add(
						app.jScrollPaneJingmaiZiWu);
					app.frameJingmaiZiWu.setVisible(true);
					app.frameJingmaiZiWu.show();
					app.frameJingmaiZiWu.setDefaultCloseOperation(
						JFrame.HIDE_ON_CLOSE);
				} else if (!app.frameJingmaiZiWu.isShowing()) {
					Point point = java.awt.MouseInfo.getPointerInfo()
						.getLocation();
					app.frameJingmaiZiWu.setLocation(point.x,
						point.y);
					app.frameJingmaiZiWu.setVisible(true);
					app.frameJingmaiZiWu.show();
					app.panelZiWu.validate();
					NE.validate();
					//app.validate();
				}
			}
		});

		app.buttonCTV = new DetaButton("阅读关");
		app.readChinese = new ReadChinese(app.buttonCTV, NE.app_S);
		app.buttonCTV.setBounds(740, 0, 100, 30);
		app.buttonCTV.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app.buttonCTV.getText().equalsIgnoreCase("阅读开")) {
					app.readChinese.waitString = true;
					app.readChinese.waitWord = true;
					return;
				}
				if (app.readChinese.getState().toString()
					.equalsIgnoreCase("TERMINATED")) {
					app.readChinese.I_NullSap();
					app.readChinese = new ReadChinese(app.buttonCTV,
						NE.app_S);
				}
				if (app.sets == null) {
					return;
				}
				if (app.readChinese.finish == 0) {
					if (!app.readChinese.isAlive()) {
						app.buttonCTV.setLabel("阅读开");
						app.buttonCTV.updateUI();
						DetaThread.sleepDeta(200);
						app.readChinese.I_PreReadList(app.sets, NE);
						if (app.readChinese.finish == 2) {
							app.readChinese.start();
						}
					}
				}
			}
		});

		app.buttonSum = new DetaButton("共 " + (app.sets == null ? 0
			: (1 + app.sets.size() / 501)) + " 页");
		app.buttonSum.setBounds(0, 0, 100, 30);
		app.buttonCrt = new DetaButton("当前：" + (app.currentPage + 1));
		app.buttonCrt.setBounds(120, 0, 150, 30);
		DetaButton buttonPrev = new DetaButton("<-");
		buttonPrev.setBounds(290, 0, 100, 30);
		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doButtonPrev(NE);
			}
		});

		DetaButton buttonNext = new DetaButton("->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doButtonNext(NE);
			}
		});
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		Box buttonBox1 = new Box(BoxLayout.X_AXIS);
		Box buttonBox2 = new Box(BoxLayout.X_AXIS);
		buttonBox1.add(app.buttonSum);
		buttonBox1.add(app.buttonCrt);
		buttonBox1.add(buttonPrev);
		buttonBox1.add(buttonNext);
		buttonBox1.add(app.buttonCTE);
		buttonBox1.add(app.buttonFRS);
		buttonBox1.add(app.buttonCTV);
		buttonBox1.add(app.buttonADD);
		buttonBox2.add(app.button12Jingmai);
		buttonBox2.add(app.buttonZiWu);
		buttonBox.add(buttonBox1);
		buttonBox.add(buttonBox2);
		//buttonBox.setBounds(0, 0, 800, 20);
		return buttonBox;
	}

	private void doButtonNext(App NE) {
		IMV_SQI_SS map = new IMV_SQI_SS();
		try {
			app.currentPage += 1;
			app.currentPage = (app.currentPage > (app.sets == null ? 0
				: app.sets.size()) / 501 ? app.currentPage - 1
					: app.currentPage);
			StringBuilder page = new StringBuilder().append("");
			List<String> setsForGet = app.sets.subList(app.currentPage
				* 500, (app.currentPage + 1) * 500 < app.sets.size()
					? (app.currentPage + 1) * 500
					: app.sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			NE.app_S.listCharPosition = 0;
			Here: while (iterator.hasNext()) {
				NE.app_S.listCharPosition++;
				String setOfi = iterator.next();
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.get(
					setOfi) == null) {
					page.append("<span style=\"background:").append(
						Color_P.P(0, 0, 0)).append("\"><font color=")
						.append(Color_P.P(255, 255, 255)).append(
							" size=\"").append(NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							"</font></span>");
					continue Here;
				}
				if (S_Maps.mingCi.containsKey(setOfi) || S_Maps.dongCi
					.containsKey(setOfi) || S_Maps.xingRongCi
						.containsKey(setOfi)) {
					if (map.containsKey(setOfi)) {
						WordFrequency wordFrequency = map.getW(
							setOfi);
						wordFrequency.I_frequency(wordFrequency
							.get_frequency() + S_Pos.INT_ONE);
						wordFrequency.positions.add(
							NE.app_S.listCharPosition);
						map.put(setOfi, wordFrequency);
					} else {
						WordFrequency wordFrequency = new WordFrequency(
							1.0, setOfi);
						wordFrequency.positions.add(
							NE.app_S.listCharPosition);
						//WordFrequency wordFrequency = new WordFrequency();
						//wordFrequency.I_frequency(1.0);
						//wordFrequency.I_Word(setOfi);
						map.put(setOfi, wordFrequency);
					}
				}
				/*
				 * Sonar-S3024协议，append的拆解，方便之后进行统一 util 操作
				 * 将相同的片段进行条件和函数封装。稍后处理Sonar-S1192 问题。
				 * --罗瑶光
				 * */
				if (!setOfi.equals("")) {
					if (app.key.contains(setOfi) && (S_Maps.mingCi
						.containsKey(setOfi) || S_Maps.dongCi
							.containsKey(setOfi) || S_Maps.xingRongCi
								.containsKey(setOfi))) {
						page.append("<span style=\"background:red\">")
							.append("<font color=\"white\">").append(
								setOfi).append("</font></span>");
						continue Here;
					}
					if (S_Maps.mingCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255, 255 - 100, 255)).append(
										" size=\"").append(
											NE.app_S.size_font_rot)
							.append("\">").append(setOfi).append(
								"</font></span>");
						continue Here;
					}
					if (S_Maps.dongCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255 - 100, 255, 255 - 100))
							.append(" size=\"").append(
								NE.app_S.size_font_rot).append("\">")
							.append(setOfi).append("</font></span>");
						continue Here;
					}
					if (S_Maps.xingRongCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255, 255, 255 - 100)).append(
										" size=\"").append(
											NE.app_S.size_font_rot)
							.append("\">").append(setOfi).append(
								"</font></span>");
						continue Here;
					}
					if (S_Maps.fuCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255, 255, 255)).append(" size=\"")
							.append(NE.app_S.size_font_rot).append(
								"\">").append(setOfi).append(
									"</font></span>");
						continue Here;
					}
					page.append("<span style=\"background:").append(
						Color_P.P(0, 0, 0)).append("\"><font color=")
						.append(Color_P.P(255, 255, 255)).append(
							" size=\"").append(NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							"</font></span>");
				}
			}
			app.buttonCrt.setText("当前：" + (app.currentPage + 1));
			app.data.setText(page.toString());
			app.data.setSelectionStart(0);
			app.data.setSelectionEnd(0);
			//app.data.validate();
		} catch (Exception e1) {
			//app.data.validate();
			app.jTabbedpane.validate();
		}
		try {
			app.statistic.setSize(500, 800);
			IMV_SQI_S_ fwa = app._A.sortWordFrequencyMapToSortMap(
				map);
			app.statistic.setContentType("text/html");
			StringBuilder page = new StringBuilder();
			Here: for (int i = fwa.size() - 1; i >= 0; i--) {
				if (fwa.get(i) != null) {
					if (app.fMHMMListOneTime_E_X_S.posCnToCn
						.getString(fwa.getW(i).get_word()) == null) {
						page.append(
							"<div style=\"background:black\">")
							.append("<font color=\"white\">").append(
								fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
						continue Here;
					}
					if (S_Maps.mingCi.containsKey(fwa.getW(i)
						.get_word())) {
						page.append(
							"<div style=\"background:#FF44FF\">")
							.append("<font color=\"white\">").append(
								fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
						continue Here;
					}
					if (S_Maps.dongCi.containsKey(fwa.getW(i)
						.get_word())) {
						page.append(
							"<div style=\"background:#8CEA00\">")
							.append(
								"<font color=\"black\" size=\"5\">")
							.append(fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
						continue Here;
					}
					if (S_Maps.xingRongCi.containsKey(fwa.getW(i)
						.get_word())) {
						page.append(
							"<div style=\"background:#FF9224\">")
							.append(
								"<font color=\"black\" size=\"5\">")
							.append(fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
					}
				}
			}
			app.statistic.setText(page.toString());
			app.statistic.setSelectionStart(0);
			app.statistic.setSelectionEnd(0);
			//app.statistic.validate();
		} catch (Exception e1) {
			//app.statistic.validate();
			app.jTabbedpane.validate();
			System.gc();
		}
	}

	/*
	 * 这是我最近全网找到最早3358协议的描述，关于ternary分解。我于是在思考，
	 * 2018 01 09 --https://github.com/SonarSource/sonar-dotnet/issues/1073
	 * Sonar S3358 我发现一个问题，Sonar 规范如果不提供每一个协议定义时的时间戳，
	 * 这样做的后果会混淆所有优化协议的来源问题。因为优化方法是一个庞大的体系工程和领域。
	 * 有很多不同团队的工程师在参与。而Sonar并不能完整地代表这个领域。容易造成各种侵权问题。
	 * 我不想发生一些问题，比如以后因为这个思想规范问题属于sonar的争议问题，而导致我修改
	 * 的源码。被一个别人非议。因为sonar的协议条数这些年越来越多。因为用了sonar优化，我都会
	 * refer和注释中严谨标注是哪一条S协议。所以我希望sonar体系的著作权权属关系也是完整安全的。
	 * --罗瑶光
	 */
	private void doButtonETC() {
		StringBuilder page = new StringBuilder();
		List<String> setsForGet = app.sets;
		Iterator<String> iterator = setsForGet.iterator();
		Here: while (iterator.hasNext()) {
			String setOfi = iterator.next();
			if (app.fMHMMListOneTime_E_X_S.posCnToCn.get(
				setOfi) == null) {
				boolean ternaryL = app.fMHMMListOneTime_E_X_S.fullCnToEn
					.containsKey(setOfi);
				boolean ternaryM = app.fMHMMListOneTime_E_X_S.enToCn
					.containsKey(app.fMHMMListOneTime_E_X_S.fullCnToEn
						.get(setOfi));
				String ternaryML = ":("
					+ app.fMHMMListOneTime_E_X_S.enToCn.get(
						app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
							setOfi)) + ")";
				page.append("<span style=\"background:#F1F1F1\">")
					.append("<font color=\"black\" ").append(
						"size=\"5\">").append(setOfi).append(ternaryL
							? ternaryM ? ternaryML
								: S_Tag.STRING_EMPTY
							: S_Tag.STRING_EMPTY).append(
								"</font></span>");
				continue Here;
			}
			if (!setOfi.equals(S_Tag.STRING_EMPTY)) {
				if (app.key.contains(setOfi)
					&& (app.fMHMMListOneTime_E_X_S.posCnToCn
						.getString(setOfi).contains(S_Tag.ZI_MING)
						|| app.fMHMMListOneTime_E_X_S.posCnToCn
							.getString(setOfi).contains(S_Tag.ZI_DONG)
						|| app.fMHMMListOneTime_E_X_S.posCnToCn
							.getString(setOfi).contains(
								S_Tag.ZI_XING))) {
					boolean ternaryL = app.fMHMMListOneTime_E_X_S.fullCnToEn
						.containsKey(setOfi);
					boolean ternaryM = app.fMHMMListOneTime_E_X_S.enToCn
						.containsKey(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi));
					String ternaryML = ":("
						+ app.fMHMMListOneTime_E_X_S.enToCn.get(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi)) + ")";
					page.append(
						"<span style=\"background:red\"><font color=\"white\">")
						.append(setOfi).append(ternaryL ? ternaryM
							? ternaryML
							: S_Tag.STRING_EMPTY : S_Tag.STRING_EMPTY)
						.append("</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_MING)) {

					boolean ternaryL = app.fMHMMListOneTime_E_X_S.fullCnToEn
						.containsKey(setOfi);
					boolean ternaryM = app.fMHMMListOneTime_E_X_S.enToCn
						.containsKey(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi));
					String ternaryML = ":("
						+ app.fMHMMListOneTime_E_X_S.enToCn.get(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi)) + ")";

					page.append("<span style=\"background:").append(
						Color_P.P(255 - 255, 255 - 245, 255 - 255))
						.append(
							"\"><font color=\"black\" size=\"5\">")
						.append(setOfi).append(ternaryL ? ternaryM
							? ternaryML
							: S_Tag.STRING_EMPTY : S_Tag.STRING_EMPTY)
						.append("</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_DONG)) {
					boolean ternaryL = app.fMHMMListOneTime_E_X_S.fullCnToEn
						.containsKey(setOfi);
					boolean ternaryM = app.fMHMMListOneTime_E_X_S.enToCn
						.containsKey(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi));
					String ternaryML = ":("
						+ app.fMHMMListOneTime_E_X_S.enToCn.get(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi)) + ")";

					page.append("<span style=\"background:").append(
						Color_P.P(255 - 245, 255 - 255, 255 - 245))
						.append(
							"\"><font color=\"black\" size=\"5\">")
						.append(setOfi).append(ternaryL ? ternaryM
							? ternaryML
							: S_Tag.STRING_EMPTY : S_Tag.STRING_EMPTY)
						.append("</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_XING)) {

					boolean ternaryL = app.fMHMMListOneTime_E_X_S.fullCnToEn
						.containsKey(setOfi);
					boolean ternaryM = app.fMHMMListOneTime_E_X_S.enToCn
						.containsKey(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi));
					String ternaryML = ":("
						+ app.fMHMMListOneTime_E_X_S.enToCn.get(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi)) + ")";

					page.append("<span style=\"background:").append(
						Color_P.P(255 - 255, 255 - 255, 255 - 245))
						.append(
							"\"><font color=\"black\" size=\"5\">")
						.append(setOfi).append(ternaryL ? ternaryM
							? ternaryML
							: S_Tag.STRING_EMPTY : S_Tag.STRING_EMPTY)
						.append("</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_FU)) {

					boolean ternaryL = app.fMHMMListOneTime_E_X_S.fullCnToEn
						.containsKey(setOfi);
					boolean ternaryM = app.fMHMMListOneTime_E_X_S.enToCn
						.containsKey(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi));
					String ternaryML = ":("
						+ app.fMHMMListOneTime_E_X_S.enToCn.get(
							app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
								setOfi)) + ")";

					page.append(
						"<span style=\"background:#F1FFFF\"><font color=\"black\" ")
						.append("size=\"5\">").append(setOfi).append(
							ternaryL ? ternaryM ? ternaryML
								: S_Tag.STRING_EMPTY
								: S_Tag.STRING_EMPTY).append(
									"</font></span>");
					continue Here;
				}

				boolean ternaryL = app.fMHMMListOneTime_E_X_S.fullCnToEn
					.containsKey(setOfi);
				boolean ternaryM = app.fMHMMListOneTime_E_X_S.enToCn
					.containsKey(app.fMHMMListOneTime_E_X_S.fullCnToEn
						.get(setOfi));
				String ternaryML = ":("
					+ app.fMHMMListOneTime_E_X_S.enToCn.get(
						app.fMHMMListOneTime_E_X_S.fullCnToEn.get(
							setOfi)) + ")";

				page.append(
					"<span style=\"background:white\"><font color=\"black\" size=\"5\">")
					.append(setOfi).append((ternaryL ? ternaryM
						? ternaryML
						: S_Tag.STRING_EMPTY : S_Tag.STRING_EMPTY))
					.append("</font></span>");
			}
		}
		app.data.setText(page.toString());
		app.data.setSelectionStart(0);
		app.data.setSelectionEnd(0);
		app.data.validate();
	}

	private void doButtonPrev(App NE) {
		IMV_SQI_SS map = new IMV_SQI_SS();
		try {
			app.currentPage -= 1;
			app.currentPage = (app.currentPage < 0 ? 0
				: app.currentPage);
			StringBuilder page = new StringBuilder().append("");
			List<String> setsForGet = app.sets.subList(app.currentPage
				* 500, (app.currentPage + 1) * 500 < app.sets.size()
					? (app.currentPage + 1) * 500
					: app.sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			NE.app_S.listCharPosition = 0;
			Here: while (iterator.hasNext()) {
				NE.app_S.listCharPosition++;
				String setOfi = iterator.next();
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.get(
					setOfi) == null) {
					page.append("<span style=\"background:").append(
						Color_P.P(0, 0, 0)).append("\"><font color=")
						.append(Color_P.P(255, 255, 255)).append(
							" size=\"").append(NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							"</font></span>");
					continue Here;
				} //later do
				if (S_Maps.mingCi.containsKey(setOfi) || S_Maps.dongCi
					.containsKey(setOfi) || S_Maps.xingRongCi
						.containsKey(setOfi)) {
					if (map.containsKey(setOfi)) {
						WordFrequency wordFrequency = map.getW(
							setOfi);
						wordFrequency.I_frequency(wordFrequency
							.get_frequency() + S_Pos.INT_ONE);
						wordFrequency.positions.add(
							NE.app_S.listCharPosition);
						map.put(setOfi, wordFrequency);
					} else {
						WordFrequency wordFrequency = new WordFrequency(
							1.0, setOfi);
						wordFrequency.positions.add(
							NE.app_S.listCharPosition);
						//WordFrequency wordFrequency = new WordFrequency();
						//wordFrequency.I_frequency(1.0);
						//wordFrequency.I_Word(setOfi);
						map.put(setOfi, wordFrequency);
					}
				}
				if (!setOfi.equals("")) {
					if (app.key.contains(setOfi) && (S_Maps.mingCi
						.containsKey(setOfi) || S_Maps.dongCi
							.containsKey(setOfi) || S_Maps.xingRongCi
								.containsKey(setOfi))) {
						page.append("<span style=\"background:red\">")
							.append("<font color=\"white\">").append(
								setOfi).append("</font></span>");
						continue Here;
					}
					if (S_Maps.mingCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255, 255 - 100, 255)).append(
										" size=\"").append(
											NE.app_S.size_font_rot)
							.append("\">").append(setOfi).append(
								"</font></span>");
						continue Here;
					}
					if (S_Maps.dongCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255 - 100, 255, 255 - 100))
							.append(" size=\"").append(
								NE.app_S.size_font_rot).append("\">")
							.append(setOfi).append("</font></span>");
						continue Here;
					}
					if (S_Maps.xingRongCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255, 255, 255 - 100)).append(
										" size=\"").append(
											NE.app_S.size_font_rot)
							.append("\">").append(setOfi).append(
								"</font></span>");
						continue Here;
					}
					if (S_Maps.fuCi.containsKey(setOfi)) {
						page.append("<span style=\"background:")
							.append(Color_P.P(0, 0, 0)).append(
								"\"><font color=").append(Color_P.P(
									255, 255, 255)).append(" size=\"")
							.append(NE.app_S.size_font_rot).append(
								"\">").append(setOfi).append(
									"</font></span>");
						continue Here;
					}
					page.append("<span style=\"background:").append(
						Color_P.P(0, 0, 0)).append("\"><font color=")
						.append(Color_P.P(255, 255, 255)).append(
							" size=\"").append(NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							"</font></span>");
				}
			}
			app.buttonCrt.setText("当前：" + (app.currentPage + 1));
			app.data.setText(page.toString());
			app.data.setSelectionStart(0);
			app.data.setSelectionEnd(0);
			//app.data.validate();
		} catch (Exception e1) {
			//app.data.validate();
			app.jTabbedpane.validate();
		}
		try {
			app.statistic.setSize(500, 800);
			IMV_SQI_S_ fwa = app._A.sortWordFrequencyMapToSortMap(
				map);
			app.statistic.setContentType("text/html");
			StringBuilder page = new StringBuilder();
			Here: for (int i = fwa.size() - 1; i >= 0; i--) {
				if (fwa.get(i) != null) {//later..
					if (app.fMHMMListOneTime_E_X_S.posCnToCn
						.getString(fwa.getW(i).get_word()) == null) {
						page.append(
							"<div style=\"background:black\">")
							.append("<font color=\"white\">").append(
								fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
						continue Here;
					}
					if (S_Maps.mingCi.containsKey(fwa.getW(i)
						.get_word())) {
						page.append(
							"<div style=\"background:#FF44FF\">")
							.append("<font color=\"white\">").append(
								fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
						continue Here;
					}
					if (S_Maps.dongCi.containsKey(fwa.getW(i)
						.get_word())) {
						page.append(
							"<div style=\"background:#8CEA00\">")
							.append(
								"<font color=\"black\" size=\"5\">")
							.append(fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
						continue Here;
					}
					if (S_Maps.xingRongCi.containsKey(fwa.getW(i)
						.get_word())) {
						page.append(
							"<div style=\"background:#FF9224\">")
							.append(
								"<font color=\"black\" size=\"5\">")
							.append(fwa.getW(i).get_word()).append("")
							.append(fwa.getW(i).get_frequency())
							.append("</font></div>");
					}
				}
			}
			app.statistic.setText(page.toString());
			app.statistic.setSelectionStart(0);
			app.statistic.setSelectionEnd(0);
			//app.statistic.validate();
		} catch (Exception e1) {
			//app.statistic.validate();
			app.jTabbedpane.validate();
		}
	}

	private void doButtonFRS(App NE) {
		StringBuilder page = new StringBuilder();
		List<String> setsForGet = app.sets;
		Iterator<String> iterator = setsForGet.iterator();
		Here: while (iterator.hasNext()) {
			String setOfi = iterator.next();
			if (app.fMHMMListOneTime_E_X_S.posCnToCn.get(
				setOfi) == null) {
				page.append("<span style=\"background:#ffffff\">")
					.append("<font color=\"black\" size=\"5\">")
					.append(setOfi).append("</font></span>");
				continue Here;
			}
			if (!setOfi.equals(S_Tag.STRING_EMPTY)) {
				if (app.key.contains(setOfi)
					&& (app.fMHMMListOneTime_E_X_S.posCnToCn
						.getString(setOfi).contains(S_Tag.ZI_MING)
						|| app.fMHMMListOneTime_E_X_S.posCnToCn
							.getString(setOfi).contains(S_Tag.ZI_DONG)
						|| app.fMHMMListOneTime_E_X_S.posCnToCn
							.getString(setOfi).contains(
								S_Tag.ZI_XING))) {
					page.append("<span style=\"background:red\">")
						.append("<font color=\"white\">").append(
							setOfi).append("</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_MING)) {
					page.append("<span style=\"background:").append(
						Color_P.P(255, 245 - 40 - app.raterot << 3,
							255)).append("\"><font color=").append(
								Color_P.P(0, 0, 0)).append(" size=\"")
						.append(NE.app_S.size_font_rot).append("\">")
						.append(setOfi).append("</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_DONG)) {
					page.append("<span style=\"background:").append(
						Color_P.P(245 - app.raterot << 3, 255, 205
							- app.raterot << 3)).append(
								"\"><font color=").append(Color_P.P(0,
									0, 0)).append(" size=\"").append(
										NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							"</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_XING)) {
					page.append("<span style=\"background:").append(
						Color_P.P(255, 255, 245 - 40
							- app.raterot << 3)).append(
								"\"><font color=").append(Color_P.P(0,
									0, 0)).append(" size=\"").append(
										NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							"</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_FU)) {
					page.append("<span style=\"background:").append(
						Color_P.P(245 - app.raterot << 3, 255, 255))
						.append("\"><font color=").append(Color_P.P(0,
							0, 0)).append(" size=\"").append(
								NE.app_S.size_font_rot).append("\">")
						.append(setOfi).append("</font></span>");
					continue Here;
				}
				page.append("<span style=\"background:white\">")
					.append("<font color=\"black\" size=\"5\">")
					.append(setOfi).append("</font></span>");
			}
		}
		app.data.setText(page.toString());
		app.data.setSelectionStart(0);
		app.data.setSelectionEnd(0);
		app.data.validate();
	}

	private void doButtonCTE(App NE) {
		StringBuilder page = new StringBuilder();
		List<String> setsForGet = app.sets;
		Iterator<String> iterator = setsForGet.iterator();
		Here: while (iterator.hasNext()) {
			String setOfi = iterator.next();
			if (app.fMHMMListOneTime_E_X_S.posCnToCn.get(
				setOfi) == null) {
				page.append("<span style=\"background:").append(
					Color_P.P(255, 245 - 40 - app.raterot << 3, 255))
					.append("\"><font color=").append(Color_P.P(0, 0,
						0)).append(" size=\"").append(
							NE.app_S.size_font_rot).append("\">")
					.append(setOfi).append(
						(app.fMHMMListOneTime_E_X_S.fullCnToEn
							.containsKey(setOfi) ? ":("
								+ app.fMHMMListOneTime_E_X_S.fullCnToEn
									.get(setOfi) + ")"
								: S_Tag.STRING_EMPTY)).append(
									"</font></span>");
				continue Here;
			}
			if (!setOfi.equals(S_Tag.STRING_EMPTY)) {
				if (app.key.contains(setOfi)
					&& (app.fMHMMListOneTime_E_X_S.posCnToCn
						.getString(setOfi)//later..
						.contains(S_Tag.ZI_MING)
						|| app.fMHMMListOneTime_E_X_S.posCnToCn
							.getString(setOfi).contains(S_Tag.ZI_DONG)
						|| app.fMHMMListOneTime_E_X_S.posCnToCn
							.getString(setOfi).contains(
								S_Tag.ZI_XING))) {
					page.append("<span style=\"background:red\">")
						.append("<font color=\"white\" ").append(
							"size=\"5\">").append(setOfi).append(
								(app.fMHMMListOneTime_E_X_S.fullCnToEn
									.containsKey(setOfi) ? ":("
										+ app.fMHMMListOneTime_E_X_S.fullCnToEn
											.get(setOfi) + ")"
										: S_Tag.STRING_EMPTY)).append(
											"</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_MING)) {
					page.append("<span style=\"background:").append(
						Color_P.P(255, 245 - 40 - app.raterot << 3,
							255)).append("\"><font color=").append(
								Color_P.P(0, 0, 0)).append(" size=\"")
						.append(NE.app_S.size_font_rot).append("\">")
						.append(
							"<A href=\"http://localhost:8000/search?word=")
						.append(setOfi).append("\">").append(setOfi)
						.append("</A>").append(
							(app.fMHMMListOneTime_E_X_S.fullCnToEn
								.containsKey(setOfi) ? ":("
									+ app.fMHMMListOneTime_E_X_S.fullCnToEn
										.get(setOfi) + ")"
									: S_Tag.STRING_EMPTY)).append(
										"</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_DONG)) {
					page.append("<span style=\"background:").append(
						Color_P.P(245 - app.raterot << 3, 255, 205
							- app.raterot << 3)).append(
								"\"><font color=").append(Color_P.P(0,
									0, 0)).append(" size=\"").append(
										NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							(app.fMHMMListOneTime_E_X_S.fullCnToEn
								.containsKey(setOfi) ? ":("
									+ app.fMHMMListOneTime_E_X_S.fullCnToEn
										.get(setOfi) + ")"
									: S_Tag.STRING_EMPTY)).append(
										"</font></span>");
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_XING)) {
					page.append("<span style=\"background:").append(
						Color_P.P(255, 245, 245 - 40
							- app.raterot << 3)).append(
								"\"><font color=").append(Color_P.P(0,
									0, 0)).append(" size=\"").append(
										NE.app_S.size_font_rot)
						.append("\">").append(setOfi).append(
							(app.fMHMMListOneTime_E_X_S.fullCnToEn
								.containsKey(setOfi) ? ":("
									+ app.fMHMMListOneTime_E_X_S.fullCnToEn
										.get(setOfi) + ")"
									: S_Tag.STRING_EMPTY)).append(
										"</font></span>");//too long later.
					continue Here;
				}
				if (app.fMHMMListOneTime_E_X_S.posCnToCn.getString(
					setOfi).contains(S_Tag.ZI_FU)) {
					page.append("<span style=\"background:").append(
						Color_P.P(255, 245, 255)).append(
							"\"><font color=").append(Color_P.P(0, 0,
								0)).append(" size=\"").append(
									NE.app_S.size_font_rot).append(
										"\">").append(setOfi).append(
											(app.fMHMMListOneTime_E_X_S.fullCnToEn
												.containsKey(setOfi)
													? ":("
														+ app.fMHMMListOneTime_E_X_S.fullCnToEn
															.get(
																setOfi)
														+ ")"
													: S_Tag.STRING_EMPTY))
						.append("</font></span>");
					continue Here;
				}
				page.append("<span style=\"background:").append(
					Color_P.P(255 - 10 - app.raterot << 3, 255, 255))
					.append("\"><font color=").append(Color_P.P(0, 0,
						0)).append(" size=\"").append(
							NE.app_S.size_font_rot).append("\">")
					.append(setOfi).append(
						(app.fMHMMListOneTime_E_X_S.fullCnToEn
							.containsKey(setOfi) ? ":("
								+ app.fMHMMListOneTime_E_X_S.fullCnToEn
									.get(setOfi) + ")"
								: S_Tag.STRING_EMPTY)).append(
									"</font></span>");
			}
		}
		app.data.setText(page.toString());
		app.data.addHyperlinkListener(new HyperlinkListener() {
			@SuppressWarnings({ "hiding", "deprecation" })
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				if (e
					.getEventType() != HyperlinkEvent.EventType.ACTIVATED) {
					return;
				}
				URL linkUrl = e.getURL();
				String string;
				//System.out.println(linkUrl.getFile());
				app.appConfig.SectionJPanel.jTextPane.setText(linkUrl
					.getFile());
				string = String_ESU_X_charsetSwap._E(linkUrl.getFile()
					.toString(), "UTF8", "UTF8");
				String[] value = string.split("=");
				if (value.length > 1) {
					VtoV.ObjectToJsonString(RestMedicinePort_E
						.doSearch(NE, value[1]));
				}
				if (null == app.frameTag) {
					app.tagSearch = new TagSearch();
					app.tagSearch.IV_(app.name);
					app.tagSearch.setBounds(0, 0, 435, 355);
					app.tagSearch.setVisible(true);
					app.tagSearch.show();
					app.frameTag = new JFrame("提示栏");
					app.frameTag.setSize(430, 350);
					Point point = java.awt.MouseInfo.getPointerInfo()
						.getLocation();
					app.frameTag.setLocation(point.x, point.y);
					app.frameTag.setResizable(false);
					app.frameTag.add(app.tagSearch);
					app.frameTag.setVisible(true);
					app.frameTag.show();
					app.frameTag.setDefaultCloseOperation(
						JFrame.HIDE_ON_CLOSE);
				} else {
					Point point = java.awt.MouseInfo.getPointerInfo()
						.getLocation();
					app.frameTag.setLocation(point.x, point.y);
					app.frameTag.setVisible(true);
					app.frameTag.show();
				}
			}
		});
		app.data.setEditable(false);
		app.data.setSelectionStart(0);
		app.data.setSelectionEnd(0);
		app.data.validate();
	}
}