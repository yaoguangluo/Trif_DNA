package ME.VPC.C.skivvy;

import ME.VPC.S.ne.App_S;
import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import DVIAQVIMIV.SkinPathDetectTrip_E;
import DVIAQVIMIV.SkinPathDoubleDetectTripFix2D_E;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.IOException;
import java.util.Iterator;
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
public class MakeContainerZNXZ_X_ButtonsDNA {
	@SuppressWarnings("deprecation")
	public static void createButtons(App NE) throws InterruptedException {
		App_S app_S = NE.app_S;
		app_S.monitor.monitor_X_S.bt114 = new DetaButton("肽特征关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt114.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt114Stop == false) {
				app_S.monitor.monitor_X_S.isbt114Stop = true;
				app_S.monitor.monitor_X_S.bt114.setLabel("肽特征开");
			} else {
				app_S.monitor.monitor_X_S.isbt114Stop = false;
				app_S.monitor.monitor_X_S.bt114.setLabel("肽特征关");
			}
		});

		app_S.monitor.monitor_X_S.bt121 = new DetaButton("肽腐蚀关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt121.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt121Stop == false) {
				app_S.monitor.monitor_X_S.isbt121Stop = true;
				app_S.monitor.monitor_X_S.bt121.setLabel("肽腐蚀开");
			} else {
				app_S.monitor.monitor_X_S.isbt121Stop = false;
				app_S.monitor.monitor_X_S.bt121.setLabel("肽腐蚀关");
			}
		});
		app_S.monitor.monitor_X_S.bt122 = new DetaButton("肽催化关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt122.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt122Stop == false) {
				app_S.monitor.monitor_X_S.isbt122Stop = true;
				app_S.monitor.monitor_X_S.bt122.setLabel("肽催化开");
			} else {
				app_S.monitor.monitor_X_S.isbt122Stop = false;
				app_S.monitor.monitor_X_S.bt122.setLabel("肽催化关");
			}
		});
		app_S.monitor.monitor_X_S.bt123 = new DetaButton("肽丝化关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt123.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt123Stop == false) {
				app_S.monitor.monitor_X_S.isbt123Stop = true;
				app_S.monitor.monitor_X_S.bt123.setLabel("肽丝化开");
			} else {
				app_S.monitor.monitor_X_S.isbt123Stop = false;
				app_S.monitor.monitor_X_S.bt123.setLabel("肽丝化关");
			}
		});
		app_S.monitor.monitor_X_S.bt124 = new DetaButton("八元腐蚀", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt124.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt124Stop == false) {
				app_S.monitor.monitor_X_S.isbt124Stop = true;
				app_S.monitor.monitor_X_S.bt124.setLabel("八元蚀开");
			} else {
				app_S.monitor.monitor_X_S.isbt124Stop = false;
				app_S.monitor.monitor_X_S.bt124.setLabel("八元蚀关");
			}
		});

		app_S.monitor.monitor_X_S.bt131 = new DetaButton("相似图片", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt131.addActionListener(e -> {
			// 获取图片
			if (null != app_S.monitor.monitor_X_S.img) {
				// 编辑页
				// List<String> pathRankList=
				// SkinPathDetectTrip_E.doTestWithImage(
				// app_S.monitor.monitor_X_S.img);
				List<String> pathRankList = SkinPathDetectTrip_E
						.doTestWithImageAPP(app_S);
				if (null != app_S.text && null != pathRankList) {
					StringBuilder page = new StringBuilder();
					Iterator<String> iterator = pathRankList.iterator();
					while (iterator.hasNext()) {
						String setOfi = iterator.next();
						page.append("\r\n\r\n" + setOfi);
					}
					if (!app_S.text.getText().isEmpty()) {
						app_S.text.setText(app_S.text.getText() + "\r\n\r\n"
								+ page.toString());
					} else {
						app_S.text.setText(page.toString());
					}
					app_S.text.validate();
				}
				// 图片搜索页
				if (null != app_S.searchList) {
					for (int i = 0; i < app_S.searchList.size(); i++) {
						OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI = app_S.searchList
								.get(i);
						if (_OSU_MCI_MCU_MSI.pageName.equals("图片搜索")) {
							_OSU_MCI_MCU_MSI.AOP_VEC_SQ_PDE(null, pathRankList);
						}
					}
				}
			}
			// 肽计算
			// 输出
			// 界面展示
		});
		app_S.monitor.monitor_X_S.bt132 = new DetaButton("十六元关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt132.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt132Stop == false) {
				app_S.monitor.monitor_X_S.isbt132Stop = true;
				app_S.monitor.monitor_X_S.bt132.setLabel("十六元开");
			} else {
				app_S.monitor.monitor_X_S.isbt132Stop = false;
				app_S.monitor.monitor_X_S.bt132.setLabel("十六元关");
			}
		});
		app_S.monitor.monitor_X_S.bt133 = new DetaButton("图相读脏", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt133.addActionListener(e -> {
			// 获取图片
			if (null != app_S.monitor.monitor_X_S.img) {
				// 编辑页
				// List<String> pathRankList=
				// SkinPathDetectTrip_E.doTestWithImage(
				// app_S.monitor.monitor_X_S.img);
				List<String> pathRankList = SkinPathDoubleDetectTripFix2D_E
						.doTestWithImageAPP(app_S);
				// List<String> pathRankList=
				// SkinPathDetectTrip_E.doTestWithImageAPP(u);
				if (null != app_S.text && null != pathRankList) {
					StringBuilder page = new StringBuilder();
					Iterator<String> iterator = pathRankList.iterator();
					while (iterator.hasNext()) {
						String setOfi = iterator.next();
						page.append("\r\n\r\n" + setOfi);
					}
					if (!app_S.text.getText().isEmpty()) {
						app_S.text.setText(app_S.text.getText() + "\r\n\r\n"
								+ page.toString());
					} else {
						app_S.text.setText(page.toString());
					}
					app_S.text.validate();
				}
				// 图片搜索页
				if (null != app_S.searchList) {
					for (int i = 0; i < app_S.searchList.size(); i++) {
						OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI = app_S.searchList
								.get(i);
						if (_OSU_MCI_MCU_MSI.pageName.equals("图片搜索")) {
							_OSU_MCI_MCU_MSI.AOP_VEC_SQ_PDE(null, pathRankList);
						}
					}
				}
			}
			// 肽计算
			// 输出
			// 界面展示
		});

		app_S.monitor.monitor_X_S.bt134 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt134.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt141 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt141.addActionListener(e -> {

		});
		app_S.monitor.monitor_X_S.bt142 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt142.addActionListener(e -> {

		});
		app_S.monitor.monitor_X_S.bt143 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt143.addActionListener(e -> {

		});
		app_S.monitor.monitor_X_S.bt144 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt144.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt151 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt151.addActionListener(e -> {

		});
		app_S.monitor.monitor_X_S.bt152 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt152.addActionListener(e -> {

		});
		app_S.monitor.monitor_X_S.bt153 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt153.addActionListener(e -> {

		});
		app_S.monitor.monitor_X_S.bt154 = new DetaButton("待添功能", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt154.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt92 = new DetaButton("播放媒体", 100, 50,
				Color.orange);
		app_S.monitor.monitor_X_S.bt92.addActionListener(e -> {
			FileDialog filedialog = new FileDialog(new Frame(), "播放多媒体",
					FileDialog.LOAD);
			// filedialog.setFilenameFilter(new TXTFilter("lyg"));
			filedialog.setVisible(true);
			String filepath = filedialog.getDirectory() + filedialog.getFile();
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText("" + filepath);
			// File inputBin= new File(filepath);
			//
			try {
				Runtime.getRuntime().exec(
						"rundll32 url.dll, FileProtocolHandler " + filepath);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}

		});

		app_S.monitor.monitor_X_S.bt2 = new DetaButton("线性腐蚀", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt2.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt3 = new DetaButton("独立成份", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt3.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt4 = new DetaButton("特征成份", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt4.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt5 = new DetaButton("向量成份", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt5.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.btr = new DetaButton("荧光谱红", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.btr.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.btg = new DetaButton("荧光谱绿", 100, 50,
				Color.green);
		app_S.monitor.monitor_X_S.btg.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.btb = new DetaButton("荧光谱蓝", 100, 50,
				Color.blue);
		app_S.monitor.monitor_X_S.btb.addActionListener(e -> {
		});
	}
}
