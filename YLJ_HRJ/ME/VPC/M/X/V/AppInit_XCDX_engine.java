package ME.VPC.M.X.V;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import DVIAQVIMIV.SkinPathDetectTrip_E;
import ME.VPC.M.app.App;
import ME.VPC.M.app.AppConfig;
import exception.thread.DetaThread;

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
public class AppInit_XCDX_engine {
	@SuppressWarnings("deprecation")
	public static void creatFrameConfig(App NE) {
		NE.app_S.frameConfig = new JFrame("软件配置面板");
		NE.app_S.frameConfig.setIconImage(NE.app_S.logo.getImage());
		NE.app_S.frameConfig.setLayout(null);
		NE.app_S.frameConfig.setSize(800, 750);
		NE.app_S.frameConfig.resize(800, 750);
		NE.app_S.frameConfig.setResizable(false);
		//
		NE.app_S.appConfig = new AppConfig();
		NE.app_S.frameConfig.getContentPane().add(NE.app_S.appConfig);
		if (NE.tempString.contains("测试") || NE.tempString.contains("test")) {
		} else {
			NE.app_S.frameConfig.setVisible(true);
			// app.app_S.frameConfig.show();
		}
		NE.app_S.frameConfig.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		NE.app_S.frameConfig.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				// String command= "taskkill /im dm_new.exe /f";
				if (NE.app_S.appConfig.SectionJPanel.isConfig) {
					NE.app_S.frameConfig.removeAll();
					NE.app_S.frameConfig.disable();
					System.gc();
					System.exit(0);
				}
			}
		});
	}

	public static void creatTabName(App NE, int leftRange) {
		NE.app_S.tabNames = new ArrayList<>();
		NE.app_S.tabNames.add("中药本草");
		NE.app_S.tabNames.add("数据分析");
		NE.app_S.tabNames.add("智能相诊");
		NE.app_S.tabNames.add("智能声诊");
		NE.app_S.tabNames.add("位术数");
		NE.app_S.tabNames.add("西医内科");
		NE.app_S.tabNames.add("中医方剂");
		NE.app_S.tabNames.add("中医诊断");
		NE.app_S.tabNames.add("古籍");
		NE.app_S.tabNames.add("中医生殖");
		NE.app_S.tabNames.add("西医生殖");
		NE.app_S.tabNames.add("西医急诊");
		NE.app_S.tabNames.add("大外科");
		NE.app_S.tabNames.add("中医外伤");
		NE.app_S.tabNames.add("西药处方");
		NE.app_S.tabNames.add("编辑页");
		NE.app_S.tabNames.add("哈里森内科");
	}

	public static void creatYLJUtilsZYBC(App NE, Container jpanelFirst) {
		NE.app_S.jTabbedpane.addTab("药食同源", new ImageIcon(), jpanelFirst,
				"药食同源");
		NE.app_S.jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0);
		NE.app_S.jTabbedpane.setBackgroundAt(0, new Color(253, 233, 254));
		NE.app_S.jTabbedpane.setBackground(Color.black);
	}

	public static void creatYLJUtilsTPSB(App NE) {
		SkinPathDetectTrip_E.initDeciphring(NE.app_S.fourInitonJianTxt.isEmpty()
				? NE.app_S.fourInitonJianTxt
				: "F_DB5.txt", 5);
		SkinPathDetectTrip_E.initDeciphring(NE.app_S.fourInitonSuanTxt.isEmpty()
				? NE.app_S.fourInitonSuanTxt
				: "F_DB6.txt", 6);
		SkinPathDetectTrip_E
				.initDeciphring(NE.app_S.sixteenInitonJianTxt.isEmpty()
						? NE.app_S.sixteenInitonJianTxt
						: "F_DB6_jian_17.txt", 17);
		SkinPathDetectTrip_E
				.initDeciphring(NE.app_S.sixteenInitonJianTxt.isEmpty()
						? NE.app_S.sixteenInitonSuanTxt
						: "F_DB6_suan_17.txt", 18);
	}

	public static void creatStatusDetermination(App NE) {
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----当前版本有效期100天." + text;
			text = "\r\n" + "..." + text;
			text = "\r\n" + "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！" + text;
			text = "\r\n" + "..." + text;
			text = "\r\n" + "----载入德塔中文分词分析子系统完毕！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		System.out.println("启动400编码调试开始-00000030");
		DetaThread.sleepDeta(2000);// 分词初始
		if (NE.app_S.appConfig.SectionJPanel.jTextPane != null) {
			String text = NE.app_S.appConfig.SectionJPanel.jTextPane.getText();
			text = "\r\n" + "----当前版本有效期100天." + text;
			text = "\r\n" + "..." + text;
			text = "\r\n" + "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！" + text;
			text = "\r\n" + "..." + text;
			text = "\r\n" + "----载入德塔中文分词分析子系统完毕！" + text;
			text = "\r\n" + "..." + text;
			text = "\r\n" + "----载入德塔 多国语言词库 映射添加完毕！" + text;
			text = "\r\n" + "..." + text;
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
		}
	}

	public static void creatPanelCombination(App NE) {
		NE.app_S.jPanel.add(NE.app_S.jsp_name);
		NE.app_S.jPanel.add(NE.app_S.jTabbedpane);//
		// NE.app_S.jPanel.add(NE.app_S.page_filter);//所有页面过滤
		// NE.app_S.jPanel.add(NE.app_S.page_filter_box);//所有页面过滤
		NE.app_S.jPanel.add(NE.app_S.color_text);
		NE.app_S.jPanel.add(NE.app_S.size_font);
		NE.app_S.jPanel.add(NE.app_S.density_bloosm);
		NE.app_S.jPanel.add(NE.app_S.size_font_slider);
		NE.app_S.jPanel.add(NE.app_S.color_bg);
		NE.app_S.jPanel.add(NE.app_S.read_speed);
		NE.app_S.jPanel.add(NE.app_S.color_bg_slider);
		NE.app_S.jPanel.add(NE.app_S.read_speed_slider);
		NE.app_S.jPanel.add(NE.app_S.look);// 游标
		NE.app_S.jPanel.add(NE.app_S.rate);// 游标
		NE.app_S.jPanel.add(NE.app_S.leaf);// 游标
		NE.app_S.jPanel.add(NE.app_S.jingmai_filter);// 线性enter
	}
}