package ME.VPC.C.skivvy;

import C_A.ME.analysis.C.A;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import ME.VPC.S.ne.WindowsUI;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.tabbedpane.DetabbedPane;
import S_A.linePage.Line2025;
import S_A.linePage.PageP_M;
import S_A.pheromone.IMV_SIQ;
import exception.thread.DetaThread;
import jniFFT.LYGFFT;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

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
public class MakeContainerZNSZ extends MakeContainerZNSZ_X_S {
	public MakeContainerZNSZ(Container jpanelFourth, App app_NE) {
		super(app_NE);
		NE = app_NE;
		this.containerPanel = jpanelFourth;
	}

	public MakeContainerZNSZ(A _A, Container jpanelFourth, App_S u2,
			DetabbedPane jTabbedpane, List<String> tabNames2, IMV_SIQ pos,
			IMV_SIQ pose, IMV_SIQ etc, IMV_SIQ cte, App app_NE) {
		super(app_NE);
		NE = app_NE;
		this.jpanelFourth = jpanelFourth;
		// this.u = u2;
		this.tabNames = tabNames2;
		this.jTabbedpane = jTabbedpane;
		this._A = _A;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
	}

	public void run() {
		// conf
		// */
		jTabbedpane.validate();
		DetaThread.sleepDeta(1000);
		containerPanel.setLayout(null);
		containerPanel.setBounds(0, 0, WindowsUI.basicWidth + 6,
				WindowsUI.makeContainerHeight);
		slider2.setSnapToTicks(true);
		slider2.setPaintTicks(true);
		slider2.setMajorTickSpacing(5);
		slider2.setMinorTickSpacing(1);
		slider2.setBackground(Color.black);
		slider2.setForeground(Color.gray);
		slider2.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source2 = source.getValue();
		});
		slider3.setSnapToTicks(true);
		slider3.setPaintTicks(true);
		slider3.setMajorTickSpacing(5);
		slider3.setMinorTickSpacing(1);
		slider3.setBackground(Color.black);
		slider3.setForeground(Color.gray);
		slider3.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source3 = source.getValue();
		});
		slider4.setSnapToTicks(true);
		slider4.setPaintTicks(true);
		slider4.setMajorTickSpacing(5);
		slider4.setMinorTickSpacing(1);
		slider4.setBackground(Color.black);
		slider4.setForeground(Color.gray);
		slider4.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source4 = source.getValue();
		});
		slider5.setSnapToTicks(true);
		slider5.setPaintTicks(true);
		slider5.setMajorTickSpacing(5);
		slider5.setMinorTickSpacing(1);
		slider5.setBackground(Color.black);
		slider5.setForeground(Color.gray);
		slider5.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source5 = source.getValue();
		});
		slider6.setSnapToTicks(true);
		slider6.setPaintTicks(true);
		slider6.setMajorTickSpacing(5);
		slider6.setMinorTickSpacing(1);
		slider6.setBackground(Color.black);
		slider6.setForeground(Color.gray);
		slider6.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source6 = source.getValue();
		});
		slider7.setSnapToTicks(true);
		slider7.setPaintTicks(true);
		slider7.setMajorTickSpacing(5);
		slider7.setMinorTickSpacing(1);
		slider7.setBackground(Color.black);
		slider7.setForeground(Color.gray);
		slider7.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source7 = source.getValue();
		});
		slider8.setSnapToTicks(true);
		slider8.setPaintTicks(true);
		slider8.setMajorTickSpacing(5);
		slider8.setMinorTickSpacing(1);
		slider8.setBackground(Color.black);
		slider8.setForeground(Color.gray);
		slider8.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source8 = source.getValue();
		});
		slider16.setSnapToTicks(true);
		slider16.setPaintTicks(true);
		slider16.setMajorTickSpacing(5);
		slider16.setMinorTickSpacing(1);
		slider16.setBackground(Color.black);
		slider16.setForeground(Color.gray);
		slider16.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source16 = source.getValue();
		});
		slider32.setSnapToTicks(true);
		slider32.setPaintTicks(true);
		slider32.setMajorTickSpacing(5);
		slider32.setMinorTickSpacing(1);
		slider32.setBackground(Color.black);
		slider32.setForeground(Color.gray);
		slider32.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source32 = source.getValue();
		});
		slider64.setSnapToTicks(true);
		slider64.setPaintTicks(true);
		slider64.setMajorTickSpacing(5);
		slider64.setMinorTickSpacing(1);
		slider64.setBackground(Color.black);
		slider64.setForeground(Color.gray);
		slider64.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source64 = source.getValue();
		});
		slider128.setSnapToTicks(true);
		slider128.setPaintTicks(true);
		slider128.setMajorTickSpacing(5);
		slider128.setMinorTickSpacing(1);
		slider128.setBackground(Color.black);
		slider128.setForeground(Color.gray);
		slider128.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source128 = source.getValue();
		});
		slider256.setSnapToTicks(true);
		slider256.setPaintTicks(true);
		slider256.setMajorTickSpacing(5);
		slider256.setMinorTickSpacing(1);
		slider256.setBackground(Color.black);
		slider256.setForeground(Color.gray);
		slider256.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source256 = source.getValue();
		});
		slider512.setSnapToTicks(true);
		slider512.setPaintTicks(true);
		slider512.setMajorTickSpacing(5);
		slider512.setMinorTickSpacing(1);
		slider512.setBackground(Color.black);
		slider512.setForeground(Color.gray);
		slider512.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			source512 = source.getValue();
		});
		Box sliderBox2 = new Box(BoxLayout.X_AXIS);
		Box sliderBox3 = new Box(BoxLayout.X_AXIS);
		Box sliderBox4 = new Box(BoxLayout.X_AXIS);
		Box sliderBox5 = new Box(BoxLayout.X_AXIS);
		Box sliderBox6 = new Box(BoxLayout.X_AXIS);
		Box sliderBox8 = new Box(BoxLayout.X_AXIS);
		Box sliderBox16 = new Box(BoxLayout.X_AXIS);
		Box sliderBox32 = new Box(BoxLayout.X_AXIS);
		Box sliderBox64 = new Box(BoxLayout.X_AXIS);
		Box sliderBox128 = new Box(BoxLayout.X_AXIS);
		Box sliderBox256 = new Box(BoxLayout.X_AXIS);
		Box sliderBox512 = new Box(BoxLayout.X_AXIS);
		sliderBox2.add(new Label("002HZ"));
		sliderBox3.add(new Label("004HZ"));
		sliderBox4.add(new Label("008HZ"));
		sliderBox5.add(new Label("016HZ"));
		sliderBox6.add(new Label("032HZ"));
		sliderBox8.add(new Label("064HZ"));
		sliderBox16.add(new Label("128HZ"));
		sliderBox32.add(new Label("200HZ"));
		sliderBox64.add(new Label("256HZ"));
		sliderBox128.add(new Label("300HZ"));
		sliderBox256.add(new Label("400HZ"));
		sliderBox512.add(new Label("512HZ"));
		sliderBox2.add(slider2);
		sliderBox3.add(slider3);
		sliderBox4.add(slider4);
		sliderBox5.add(slider5);
		sliderBox6.add(slider6);
		sliderBox8.add(slider8);
		sliderBox16.add(slider16);
		sliderBox32.add(slider32);
		sliderBox64.add(slider64);
		sliderBox128.add(slider128);
		sliderBox256.add(slider256);
		sliderBox512.add(slider512);
		Box sliderBox = new Box(BoxLayout.Y_AXIS);
		sliderBox.add(sliderBox2);
		sliderBox.add(sliderBox3);
		sliderBox.add(sliderBox4);
		sliderBox.add(sliderBox5);
		sliderBox.add(sliderBox6);
		sliderBox.add(sliderBox8);
		sliderBox.add(sliderBox16);
		sliderBox.add(sliderBox32);
		sliderBox.add(sliderBox64);
		sliderBox.add(sliderBox128);
		sliderBox.add(sliderBox256);
		sliderBox.add(sliderBox512);
		sliderBox.setBounds(500, 0, 50, 400);
		JPanel panel_sc = new JPanel();
		panel_sc.add(sliderBox);
		// line page
		Box sliderPageBox = new Box(BoxLayout.X_AXIS);
		Box faPageBox = new Box(BoxLayout.X_AXIS);
		Box paPageBox = new Box(BoxLayout.X_AXIS);
		Box frPageBox = new Box(BoxLayout.X_AXIS);
		Box pdePageBox = new Box(BoxLayout.X_AXIS);
		//
		faPageBox.add(new JLabel("FA Ratio:"));
		faPageBox.add(faSliderPage);
		//
		paPageBox.add(new JLabel("PA Ratio:"));
		paPageBox.add(paSliderPage);
		//
		frPageBox.add(new JLabel("FR Ratio:"));
		frPageBox.add(frSliderPage);
		//
		pdePageBox.add(new JLabel("Pn Ratio:"));
		pdePageBox.add(pdeSliderPage);

		sliderPageBox.add(new JLabel("Records:"));
		sliderPageBox.add(sliderPage);

		Box sliderBoxUtil = new Box(BoxLayout.Y_AXIS);
		// 时间
		JLabel timeLabel = new JLabel("时间:");
		Box timeLabelBox = new Box(BoxLayout.X_AXIS);
		NE.app_S.pageQ.timeLabelV = new JLabel();
		app_S.studyVerbaMap.putObject("pageQ.timeLabelV",
				NE.app_S.pageQ.timeLabelV);
		NE.app_S.pageQ.timeLabelV.setSize(120, 50);
		timeLabelBox.add(timeLabel);
		timeLabelBox.add(NE.app_S.pageQ.timeLabelV);
		// 序号
		JLabel idLabel = new JLabel("序号:");
		Box idLabelBox = new Box(BoxLayout.X_AXIS);
		NE.app_S.pageQ.idLabelV = new JLabel();
		app_S.studyVerbaMap.putObject("pageQ.idLabelV",
				NE.app_S.pageQ.idLabelV);
		NE.app_S.pageQ.idLabelV.setSize(120, 50);
		idLabelBox.add(idLabel);
		idLabelBox.add(NE.app_S.pageQ.idLabelV);
		// 最大值
		JLabel ratioLabel = new JLabel("比域:");
		Box ratioLabelBox = new Box(BoxLayout.X_AXIS);
		NE.app_S.pageQ.ratioLabelV = new JLabel();
		app_S.studyVerbaMap.putObject("pageQ.ratioLabelV",
				NE.app_S.pageQ.ratioLabelV);
		NE.app_S.pageQ.ratioLabelV.setSize(120, 50);
		ratioLabelBox.add(ratioLabel);
		ratioLabelBox.add(NE.app_S.pageQ.ratioLabelV);
		//
		JLabel jumpLabel = new JLabel("跳转到第:");
		Box jumpLabelBox = new Box(BoxLayout.X_AXIS);
		JTextField flipText = new JTextField("0");
		flipText.setSize(70, 20);
		JLabel flipLabel = new JLabel("帧");
		jumpLabelBox.add(jumpLabel);
		jumpLabelBox.add(flipText);
		jumpLabelBox.add(flipLabel);
		sliderBoxUtil.add(jumpLabelBox);// later
		//
		flipText.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				String string = flipText.getText();
				try {
					int flipInt = Integer.valueOf(string);
					if (flipInt > NE.app_S.pageQ.count) {
						flipInt = NE.app_S.pageQ.count;
						sliderPage.setValue(flipInt);
					}
					NE.app_S.pageQ.sourcePage = flipInt;
					if (null != NE.app_S.pageQ.head) {
						NE.app_S.pageQ.doClt4WithPage(NE);
					}
					sliderPage.setValue(flipInt);
					sliderPage.updateUI();
				} catch (Exception ex) {
				}
			}
		});
		// 保存
		DetaButton saveButton = new DetaButton("保存");
		DetaButton loadButton = new DetaButton("读取");
		NE.app_S.clearButton = new DetaButton("清空");
		app_S.studyVerbaMap.putObject("clearButton", NE.app_S.clearButton);
		NE.app_S.clearButton.addActionListener(e -> {
			NE.app_S.pageQ.doClear();
			if (null != NE.app_S.pageQ.mainPaint) {
				NE.app_S.pageQ.mainPaint.paintClean();
			}
		});
		Box saveButtonBox = new Box(BoxLayout.X_AXIS);
		saveButtonBox.add(saveButton);
		saveButtonBox.add(loadButton);
		saveButtonBox.add(NE.app_S.clearButton);

		DetaButton faButton = new DetaButton("FA关");
		DetaButton paButton = new DetaButton("PA关");
		DetaButton saButton = new DetaButton("SA关");
		Box outsideButtonBox = new Box(BoxLayout.X_AXIS);

		faButton.addActionListener(e -> {
			if (null != NE.app_S.pageQ.mainPaint) {
				NE.app_S.pageQ.mainPaint.paintClean();
			}
			if (NE.app_S.isCloseFA == false) {
				NE.app_S.isCloseFA = true;
				faButton.setText("FA开");
				// ..
			} else {
				NE.app_S.isCloseFA = false;
				faButton.setText("FA关");
				// ..
			}
		});
		paButton.addActionListener(e -> {
			if (NE.app_S.isClosePA == false) {
				NE.app_S.isClosePA = true;
				paButton.setText("PA开");
				// ..
			} else {
				NE.app_S.isClosePA = false;
				paButton.setText("PA关");
				// ..
			}
		});
		saButton.addActionListener(e -> {
			if (NE.app_S.isCloseSA == false) {
				NE.app_S.isCloseSA = true;
				saButton.setText("SA开");
				// ..
			} else {
				NE.app_S.isCloseSA = false;
				saButton.setText("SA关");
				// ..
			}
		});
		outsideButtonBox.add(faButton);
		outsideButtonBox.add(paButton);
		outsideButtonBox.add(saButton);
		//
		sliderBoxUtil.add(sliderPageBox);// later
		//
		sliderBoxUtil.setBounds(10, 0, 220, 50);
		//
		timeLabelBox.setBounds(10, 30 * 1 + 20, 220, 50);
		idLabelBox.setBounds(10, 30 * 2 + 20, 110, 50);
		ratioLabelBox.setBounds(115, 30 * 2 + 20, 220, 50);

		saveButtonBox.setBounds(10, 30 * 6 + 20, 220, 50);
		frPageBox.setBounds(10, 30 * 7 + 20, 220, 50);
		pdePageBox.setBounds(10, 30 * 8 + 20, 220, 50);
		//
		faPageBox.setBounds(10, 30 * 3 + 20, 220, 50);
		paPageBox.setBounds(10, 30 * 4 + 20, 220, 50);
		outsideButtonBox.setBounds(10, 30 * 5 + 20, 220, 50);

		JScrollPane jsp_panel_sc = new JScrollPane(panel_sc);
		JScrollPane jsp_panel_scm = new JScrollPane();
		jsp_panel_scm.setLayout(null);
		jsp_panel_scm.add(sliderBoxUtil);

		jsp_panel_scm.add(timeLabelBox);
		jsp_panel_scm.add(idLabelBox);
		jsp_panel_scm.add(ratioLabelBox);
		jsp_panel_scm.add(saveButtonBox);
		jsp_panel_scm.add(faPageBox);
		jsp_panel_scm.add(paPageBox);
		jsp_panel_scm.add(frPageBox);
		jsp_panel_scm.add(pdePageBox);

		jsp_panel_scm.add(outsideButtonBox);
		int temp = 10;
		jsp_panel_sc.setBounds(1080, 15, 235, 320 - temp);
		jsp_panel_scm.setBounds(1080, 340 - temp, 235, 310 + temp);
		LYGFFT fFt = new LYGFFT();
		app_S.line2025 = new Line2025(containerPanel, fFt, app_S.text, NE);
		app_S.line2025.setVisible(true);
		app_S.line2025.setBounds(10, 15, 1060, 460);

		if (null == NE.app_S.pageQ.mainPaint) {
			NE.app_S.pageQ.mainPaint = NE.app_S.jp3n;
		}
		NE.app_S.pageQ.mainPaint.pageP_M = new PageP_M();
		NE.app_S.pageP_M = NE.app_S.pageQ.mainPaint.pageP_M;//
		NE.app_S.pageQ.pageP_M = NE.app_S.pageP_M;//
		app_S.studyVerbaMap.putObject("pageP_M",
				NE.app_S.pageQ.mainPaint.pageP_M);

		containerPanel.add(app_S.line2025);
		containerPanel.add(jsp_panel_sc);
		containerPanel.add(jsp_panel_scm);
		JPanel jsp_panel_bot = new JPanel();
		// jsp_panel_bot.setLayout(null);
		jsp_panel_bot.setBounds(10, 490, 1060, 160);

		DetaButton button1 = new DetaButton("读电磁波", 80, 50, Color.pink);
		DetaButton button2 = new DetaButton("读电流波", 80, 50, Color.pink);
		DetaButton button3 = new DetaButton("读相位波", 80, 50, Color.pink);
		DetaButton button4 = new DetaButton("读场强波", 80, 50, Color.pink);
		DetaButton button5 = new DetaButton("读压强波", 80, 50, Color.pink);
		DetaButton button6 = new DetaButton("陀螺仪横", 80, 50, Color.pink);
		DetaButton button7 = new DetaButton("陀螺仪纵", 80, 50, Color.pink);
		DetaButton button8 = new DetaButton("陀螺仪深", 80, 50, Color.pink);
		DetaButton button9 = new DetaButton("传感器一", 80, 50, Color.pink);
		DetaButton button10 = new DetaButton("传感器二", 80, 50, Color.pink);
		DetaButton button11 = new DetaButton("传感器三", 80, 50, Color.pink);
		DetaButton button12 = new DetaButton("传感器四", 80, 50, Color.pink);
		DetaButton button13 = new DetaButton("传感器五", 80, 50, Color.pink);
		DetaButton button14 = new DetaButton("传感器六", 80, 50, Color.pink);
		DetaButton button15 = new DetaButton("传感器七", 80, 50, Color.pink);
		DetaButton button16 = new DetaButton("传感器八", 80, 50, Color.pink);
		DetaButton button17 = new DetaButton("高斯关闭", 80, 50, Color.pink);
		button17.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isGussian) {
					NE.app_S.isGussian = false;
					button17.setText("高斯关闭");
				} else {
					NE.app_S.isGussian = true;
					button17.setText("高斯开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});
		DetaButton button18 = new DetaButton("中值滤波", 80, 50, Color.pink);
		button18.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isMedian) {
					NE.app_S.isMedian = false;
					button18.setText("中值关闭");
				} else {
					NE.app_S.isMedian = true;
					button18.setText("中值开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		}

		);
		DetaButton button19 = new DetaButton("带通滤波", 80, 50, Color.pink);
		DetaButton button20 = new DetaButton("带阻滤波", 80, 50, Color.pink);
		DetaButton button21 = new DetaButton("简谐滤波", 80, 50, Color.pink);
		DetaButton button22 = new DetaButton("高通滤波", 80, 50, Color.pink);
		DetaButton button23 = new DetaButton("低通滤波", 80, 50, Color.pink);
		DetaButton button24 = new DetaButton("区间滤波", 80, 50, Color.pink);
		DetaButton button25 = new DetaButton("特征滤波", 80, 50, Color.pink);
		DetaButton button26 = new DetaButton("PCA滤波", 80, 50, Color.pink);
		DetaButton button27 = new DetaButton("分段滤波", 80, 50, Color.pink);
		DetaButton button28 = new DetaButton("盲分滤波", 80, 50, Color.pink);
		DetaButton button29 = new DetaButton("算鸡尾酒", 80, 50, Color.pink);
		DetaButton button30 = new DetaButton("频率区间", 80, 50, Color.pink);
		DetaButton button31 = new DetaButton("分贝区间", 80, 50, Color.pink);
		DetaButton button32 = new DetaButton("能量区间", 80, 50, Color.pink);
		DetaButton button33 = new DetaButton("量化观测", 80, 50, Color.pink);
		button33.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isLianghua) {
					NE.app_S.isLianghua = false;
					button33.setText("量化关闭");
				} else {
					NE.app_S.isLianghua = true;
					button33.setText("量化开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		DetaButton button34 = new DetaButton("广角视野", 80, 50, Color.pink);
		button34.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.full1024) {
					NE.app_S.full1024 = false;
					button34.setText("广角关闭");
					// app_S.lYGAFDCTDFFT.initk();
				} else {
					NE.app_S.full1024 = true;
					button34.setText("广角开启");
					// app_S.lYGAFDCTDFFT.initk();
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});
		DetaButton button35 = new DetaButton("快速FFT", 80, 50, Color.pink);
		button35.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isFFT) {
					NE.app_S.isFFT = false;
					button35.setText("FFT关闭");
				} else {
					NE.app_S.isFFT = true;
					button35.setText("FFT开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});
		DetaButton button36 = new DetaButton("虚构时能", 80, 50, Color.pink);
		button36.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isIFFT) {
					NE.app_S.isIFFT = false;
					button36.setText("虚构关闭");
				} else {
					NE.app_S.isIFFT = true;
					button36.setText("虚构开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		DetaButton button37 = new DetaButton("虚度时能", 80, 50, Color.pink);
		button37.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isLFFT) {
					NE.app_S.isLFFT = false;
					button37.setText("虚度关闭");
				} else {
					NE.app_S.isLFFT = true;
					button37.setText("虚度开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		DetaButton button38 = new DetaButton("时量函数", 80, 50, Color.pink);
		button38.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isTFT) {
					NE.app_S.isTFT = false;
					button38.setText("时量关闭");
				} else {
					NE.app_S.isTFT = true;
					button38.setText("时量开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

		DetaButton button39 = new DetaButton("记录关闭", 80, 50, Color.pink);
		button39.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isRecoding) {
					NE.app_S.isRecoding = false;
					button39.setText("记录关闭");
				} else {
					NE.app_S.isRecoding = true;
					button39.setText("记录开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		DetaButton button40 = new DetaButton("极值统计", 80, 50, Color.pink);
		button40.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (NE.app_S.isPdn) {
					NE.app_S.isPdn = false;
					button40.setText("极值关闭");
				} else {
					NE.app_S.isPdn = true;
					button40.setText("极值开启");
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		jsp_panel_bot.add(button1);
		jsp_panel_bot.add(button2);
		jsp_panel_bot.add(button3);
		jsp_panel_bot.add(button4);
		jsp_panel_bot.add(button5);
		jsp_panel_bot.add(button6);
		jsp_panel_bot.add(button7);
		jsp_panel_bot.add(button8);
		jsp_panel_bot.add(button9);
		jsp_panel_bot.add(button10);
		jsp_panel_bot.add(button11);
		jsp_panel_bot.add(button12);
		jsp_panel_bot.add(button13);
		jsp_panel_bot.add(button14);
		jsp_panel_bot.add(button15);
		jsp_panel_bot.add(button16);
		jsp_panel_bot.add(button17);
		jsp_panel_bot.add(button18);
		jsp_panel_bot.add(button19);
		jsp_panel_bot.add(button20);
		jsp_panel_bot.add(button21);
		jsp_panel_bot.add(button22);
		jsp_panel_bot.add(button23);
		jsp_panel_bot.add(button24);
		jsp_panel_bot.add(button25);
		jsp_panel_bot.add(button26);
		jsp_panel_bot.add(button27);
		jsp_panel_bot.add(button28);
		jsp_panel_bot.add(button29);
		jsp_panel_bot.add(button30);
		jsp_panel_bot.add(button31);
		jsp_panel_bot.add(button32);
		jsp_panel_bot.add(button33);
		jsp_panel_bot.add(button34);
		jsp_panel_bot.add(button35);
		jsp_panel_bot.add(button36);
		jsp_panel_bot.add(button37);
		jsp_panel_bot.add(button38);
		jsp_panel_bot.add(button39);
		jsp_panel_bot.add(button40);

		containerPanel.add(jsp_panel_bot);
		containerPanel.setName("智能声学");
		jTabbedpane.addTab(containerPanel.getName(), new ImageIcon(),
				containerPanel, containerPanel.getName());// 加入第一个页面
		Color[] colors = TableRender.getTableCellRender();
		jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1,
				colors[jTabbedpane.getTabCount() % 3]);
		jTabbedpane.validate();
	}
}
