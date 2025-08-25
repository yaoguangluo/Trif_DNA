package ME.VPC.M.X;

import ME.VPC.C.skivvy.MakeContainer_ZHONG_YAO;
import ME.VPC.H.hospital.DetaLabelS_s;
import ME.VPC.M.X.V.AppInit_XCDX_engine;
import ME.VPC.M.X.V.AppInit_XCDX_frame;
import ME.VPC.M.app.App;
import M_V.MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import M_V.MVQ.label.DetaLabelConjunction;
import M_V.MVQ.tabbedpane.DetabbedPane;
import O_V.OSI.AOP.VPC.server.RestServer;
import S_A.SVQ.stable.S_File;
import exception.thread.DetaThread;
//import DetaSrc.org.deta.boot.vpc.controller.ServerInitController;
//import DetaSrc.org.html5.upload.FileUploaderSimpleDNA;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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
public class AppInit_XCDX {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public void IV_(App NE) throws IOException, InterruptedException {
		// Register Medicine Report
		DetaLabelConjunction.detaLabelConjunction = new DetaLabelConjunction();
		DetaLabelConjunction.detaLabelConjunction.IV_();
		// Register ELEC hospital global actions clean
		if (null == DetaLabelS_s.stableImages) {
			DetaLabelS_s.stableImages = new DetaLabelS_s();
		}
		DetaLabelS_s.stableImages.setS_Images();
		DetaLabelS_s.stableImages.setTarget(false);
		// Register DNA
		System.out.println("启动400编码调试开始-00000027");
		S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		// 当一个函数在编码过程中很长很长，首先的优化思路是如何变短。
		// 强价值的源码篇幅优化变短，体现在算法改进，如果能在算法层缩进函数，是最好的方式。
		// 中价值体现在片段分层。这种如sonar优化方式和源码规范，不建议在实时系统上研发因为
		// 汇编指令jump call会极大降低计算效率。
		// 不过，在其他的场合价值就体现出来了，易阅读，易重用，易管理，等等等。
		AppInit_XCDX_engine.creatFrameConfig(NE);
		System.out.println("启动400编码调试开始-00000028");
		// app.app_S.appInstance= app;
		NE.app_S.appConfig.IV_(NE);
		// stop cursor
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----当前版本有效期100天." + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		NE.app_S.jTabbedpane = new DetabbedPane(1000 - 60, 20, Color.black, NE);
		System.out.println("启动400编码调试开始-00000029");
		// 存放选项卡的组件
		// front later to hvpcs
		RestServer rest = new RestServer(NE);// 300mb
		rest.start();
//		FileUploaderSimpleDNA.newADNAMap(app);
//		ServerInitController serverInitController= new ServerInitController();
//		serverInitController.initServer(app);

		NE.app_S.appConfig.SectionJPanel.jTextPane.setText("rest inject");
		AppInit_XCDX_engine.creatStatusDetermination(NE);
		while (!NE.app_S.ready) {
			DetaThread.sleepDeta(300);
		}
		System.out.println("启动400编码调试开始-00000031");
		while (NE.app_S.appConfig.SectionJPanel.isConfig) {
			if (null != NE.app_S.appConfig.SectionJPanel.boot_button) {
				NE.app_S.appConfig.SectionJPanel.boot_button.doClick();
			}
			DetaThread.sleepDeta(300);
		}
		NE.app_S.translator = new Translator_E();
		NE.app_S.translator.IV_(NE.app_S._A);
		NE.app_S.text = new JTextPane();
		NE.app_S.jText = new JTextPane();
		NE.app_S.jxText = new JTextPane();
		NE.app_S.text.setBackground(new Color(210, 210, 210));
		NE.app_S.jText.setBackground(new Color(210, 210, 210));
		NE.app_S.jxText.setBackground(new Color(210, 210, 210));
		System.out.println("启动400编码调试开始-00000032");
		UIManager.put("ScrollBarUI",
				"OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");
		NE.app_S.jTabbedpane.setBounds(0, 60, 1345, 980);
		AppInit_XCDX_engine.creatTabName(NE, 0);
		System.out.println("启动400编码调试开始-00000033");
		int leftRange = 10;
		JTextField jTextField = NE.app_S.app_XCDX.name(NE);
		JScrollPane jScrollPane = new JScrollPane(jTextField);
		NE.app_S.jsp_name = jScrollPane;
		NE.app_S.jsp_name.setBounds(60, 6, 280, 50);
		//
		System.out.println("启动400编码调试开始-00000034");
		AppInit_XCDX_frame.creatScaleSearchUI(NE, leftRange);
		System.out.println("启动400编码调试开始-00000036");
		AppInit_XCDX_frame.creatColorTextUI(NE, leftRange);
		System.out.println("启动400编码调试开始-00000038");
		AppInit_XCDX_frame.creatCharSizeUI(NE, leftRange);
		System.out.println("启动400编码调试开始-00000040");
		AppInit_XCDX_frame.creatFlowerDensityUI(NE, leftRange);
		System.out.println("启动400编码调试开始-00000042");
		AppInit_XCDX_frame.creatColorSetUI(NE, leftRange);
		System.out.println("启动400编码调试开始-00000043");
		AppInit_XCDX_frame.creatTalkSpeedSetUI(NE, leftRange);
		System.out.println("启动400编码调试开始-00000045");
		NE.app_S.read_speed_slider.setBounds(674 - (leftRange << 2), 8, 50, 20);
		NE.app_S.jPanel = new JPanel();
		NE.app_S.jPanel.setLayout(null);
		NE.app_S.jPanel.setBounds(0, 0, 1470, 930 + NE.app_S.rangeHigh);
		NE.app_S.jPanel.setBackground(Color.BLACK);
		new APPInit_X_AddMainButton().IV_(NE, NE.app_S.jPanel);// la
		System.out.println("启动400编码调试开始-00000045-01");
		AppInit_XCDX_engine.creatPanelCombination(NE);
		System.out.println("启动400编码调试开始-00000046");
		new CommonFilterTool().initCommonFilterTool(740, 6, NE);
		NE.app_S.jPanel.setPreferredSize(
				new Dimension(1330, 770 + NE.app_S.rangeHigh));
		NE.app_S.jScrollPane = new JScrollPane(NE.app_S.jPanel);
		NE.app_S.jScrollPane.setBounds(0, 0, 1335, 780 + NE.app_S.rangeHigh);
		NE.app_S.appConfig.SectionJPanel.jTextPane
				.setText(NE.app_S.appConfig.SectionJPanel.jTextPane.getText()
						+ "trap NE.app_S.rangeHigh" + NE.app_S.rangeHigh);
		System.out.println("启动400编码调试开始-00000047");
		NE.setLayout(null);
		NE.getContentPane().add(NE.app_S.jScrollPane);
		NE.app_S.jScrollPane.setViewportView(NE.app_S.jPanel);
		NE.setBounds(0, 0, 1345, 795 + NE.app_S.rangeHigh);
		NE.setVisible(true);
		Container jpanelFirst = new Container();
		NE.app_S.makeContainer_ZHONG_YAO = null;
		NE.app_S.makeContainer_ZHONG_YAO = new MakeContainer_ZHONG_YAO(
				jpanelFirst, NE);
		// p1
		System.out.println("启动400编码调试开始-00000048");
		NE.app_S.makeContainer_ZHONG_YAO.start();
		NE.app_S.appConfig.SectionJPanel.jTextPane
				.setText(NE.app_S.appConfig.SectionJPanel.jTextPane.getText()
						+ "trap inject zhongyao");
		//// p1 trif
		AppInit_XCDX_engine.creatYLJUtilsZYBC(NE, jpanelFirst);
		DetaThread.sleepDeta(300);
		System.out.println("启动400编码调试开始-00000049");
		NE.mouseClicked(null);
		NE.app_S.appConfig.SectionJPanel.jTextPane
				.setText(NE.app_S.appConfig.SectionJPanel.jTextPane.getText()
						+ "\r\n\r\n" + "server inject");
		System.out.println("启动400编码调试开始-00000050");
		new AppInit_X_PageLoad().IV_(NE.app_S, NE);
		AppInit_XCDX_engine.creatYLJUtilsTPSB(NE);
	}
}

//69
//330
//NE.app_S.leaf.setBounds(553 - leftRange * 3, 8, 50, 20);
//NE.app_S.color_bg = new JLabel("背景颜色:");
//NE.app_S.color_bg.setForeground(Color.yellow);
//NE.app_S.color_bg.setBounds(614 - (leftRange << 2), 21, 100, 50);
//NE.app_S.color_bg_slider = new DetaSlider(0, 200);
//NE.app_S.color_bg_slider.setSnapToTicks(true);
//NE.app_S.color_bg_slider.setPaintTicks(true);
//NE.app_S.color_bg_slider.setMajorTickSpacing(5);
//NE.app_S.color_bg_slider.setMinorTickSpacing(1);
//NE.app_S.color_bg_slider.setValue(0);
//NE.app_S.color_bg_slider.addChangeListener(event -> {
//});
//NE.app_S.color_bg_slider.addMouseListener(new MouseListener() {// later
//																// in
//																// new
//																// panel.
//	@Override
//	public void mouseReleased(MouseEvent arg0) {
//		JSlider source = (JSlider) arg0.getSource();
//		NE.app_S.color_bg_rot = source.getValue();
//		NE.app_S.jTabbedpane.updateUI();
//	}
//
//	@Override
//	public void mouseClicked(MouseEvent arg0) {
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent arg0) {
//	}
//
//	@Override
//	public void mouseExited(MouseEvent arg0) {
//	}
//
//	@Override
//	public void mousePressed(MouseEvent arg0) {
//	}
//});
