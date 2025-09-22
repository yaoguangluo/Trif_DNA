package ME.VPC.C.skivvy;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.filenameFilter.TXTFilter;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
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
public class MakeContainerZNXZ_X_ButtonsMedicalOEV {
	@SuppressWarnings("deprecation")
	public static void createButtons(App NE) throws InterruptedException {
		App_S app_S = NE.app_S;
		app_S.monitor.monitor_X_S.bt51 = new DetaButton("皮脂层透显", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt51.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt52 = new DetaButton("木像处理", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt52.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt52Stop == false) {
				app_S.monitor.monitor_X_S.isbt52Stop = true;
				app_S.monitor.monitor_X_S.bt52.setLabel("木相屏开");
				app_S.monitor.monitor_X_S.facr = 130;
				app_S.monitor.monitor_X_S.facg = 110;
				app_S.monitor.monitor_X_S.facb = 160;
			} else {
				app_S.monitor.monitor_X_S.isbt52Stop = false;
				app_S.monitor.monitor_X_S.bt52.setLabel("木相屏关");
				app_S.monitor.monitor_X_S.facr = 0;
				app_S.monitor.monitor_X_S.facg = 0;
				app_S.monitor.monitor_X_S.facb = 0;
			}
		});

		app_S.monitor.monitor_X_S.bt53 = new DetaButton("火相屏关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt53.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt53Stop == false) {
				app_S.monitor.monitor_X_S.isbt53Stop = true;
				app_S.monitor.monitor_X_S.bt53.setLabel("火视屏开");
			} else {
				app_S.monitor.monitor_X_S.isbt53Stop = false;
				app_S.monitor.monitor_X_S.bt53.setLabel("火视屏关");
			}
		});

		app_S.monitor.monitor_X_S.bt60 = new DetaButton("水色处理", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt60.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt60Stop == false) {
				app_S.monitor.monitor_X_S.isbt60Stop = true;
				app_S.monitor.monitor_X_S.bt60.setLabel("水视屏开");
				app_S.monitor.monitor_X_S.facr = 146;
				app_S.monitor.monitor_X_S.facg = 126;
				app_S.monitor.monitor_X_S.facb = 126;
			} else {
				app_S.monitor.monitor_X_S.isbt60Stop = false;
				app_S.monitor.monitor_X_S.bt60.setLabel("水视屏关");
				app_S.monitor.monitor_X_S.facr = 0;
				app_S.monitor.monitor_X_S.facg = 0;
				app_S.monitor.monitor_X_S.facb = 0;
			}
		});

		app_S.monitor.monitor_X_S.bt61 = new DetaButton("伤口炎症状", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt61.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt1 = new DetaButton("催化成份", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt1.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt62 = new DetaButton("因博思关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt62.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt62Stop == false) {
				app_S.monitor.monitor_X_S.isbt62Stop = true;
				app_S.monitor.monitor_X_S.bt62.setLabel("因博思开");
			} else {
				app_S.monitor.monitor_X_S.isbt62Stop = false;
				app_S.monitor.monitor_X_S.bt62.setLabel("因博思关");
			}
		});

		app_S.monitor.monitor_X_S.bt63 = new DetaButton("鼻相分析", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt63.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt70 = new DetaButton("眼相分析", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt70.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt71 = new DetaButton("耳相分析", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt71.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt72 = new DetaButton("唇相分析", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt72.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt73 = new DetaButton("白色相关", 100, 50,
				new Color(210, 210, 210));
		app_S.monitor.monitor_X_S.bt73.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt73Stop == false) {
				app_S.monitor.monitor_X_S.isbt73Stop = true;
				app_S.monitor.monitor_X_S.bt73.setLabel("白色相开");
				app_S.monitor.monitor_X_S.facr = 145;
				app_S.monitor.monitor_X_S.facg = 115;
				app_S.monitor.monitor_X_S.facb = 95;
			} else {
				app_S.monitor.monitor_X_S.isbt73Stop = false;
				app_S.monitor.monitor_X_S.bt73.setLabel("白色相关");
				app_S.monitor.monitor_X_S.facr = 0;
				app_S.monitor.monitor_X_S.facg = 0;
				app_S.monitor.monitor_X_S.facb = 0;
			}
		});

		app_S.monitor.monitor_X_S.bt80 = new DetaButton("青色相关", 100, 50,
				Color.blue);
		app_S.monitor.monitor_X_S.bt80.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt80Stop == false) {
				app_S.monitor.monitor_X_S.isbt80Stop = true;
				app_S.monitor.monitor_X_S.bt80.setLabel("青色相开");
				app_S.monitor.monitor_X_S.facr = 205;
				app_S.monitor.monitor_X_S.facg = 125;
				app_S.monitor.monitor_X_S.facb = 140;
			} else {
				app_S.monitor.monitor_X_S.isbt80Stop = false;
				app_S.monitor.monitor_X_S.bt80.setLabel("青色相关");
				app_S.monitor.monitor_X_S.facr = 0;
				app_S.monitor.monitor_X_S.facg = 0;
				app_S.monitor.monitor_X_S.facb = 0;
			}
		});

		app_S.monitor.monitor_X_S.bt81 = new DetaButton("紫色相关", 100, 50,
				Color.magenta);
		app_S.monitor.monitor_X_S.bt81.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt81Stop == false) {
				app_S.monitor.monitor_X_S.isbt81Stop = true;
				app_S.monitor.monitor_X_S.bt81.setLabel("紫色相开");
				app_S.monitor.monitor_X_S.facr = 140;
				app_S.monitor.monitor_X_S.facg = 200;
				app_S.monitor.monitor_X_S.facb = 135;
			} else {
				app_S.monitor.monitor_X_S.isbt81Stop = false;
				app_S.monitor.monitor_X_S.bt81.setLabel("紫色相关");
				app_S.monitor.monitor_X_S.facr = 0;
				app_S.monitor.monitor_X_S.facg = 0;
				app_S.monitor.monitor_X_S.facb = 0;
			}
		});

		app_S.monitor.monitor_X_S.bt82 = new DetaButton("黄色相关", 100, 50,
				Color.yellow);
		app_S.monitor.monitor_X_S.bt82.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt82Stop == false) {
				app_S.monitor.monitor_X_S.isbt82Stop = true;
				app_S.monitor.monitor_X_S.bt82.setLabel("黄色相开");
				app_S.monitor.monitor_X_S.facr = 160;
				app_S.monitor.monitor_X_S.facg = 110;
				app_S.monitor.monitor_X_S.facb = 160;
			} else {
				app_S.monitor.monitor_X_S.isbt82Stop = false;
				app_S.monitor.monitor_X_S.bt82.setLabel("黄舌相关");
				app_S.monitor.monitor_X_S.facr = 0;
				app_S.monitor.monitor_X_S.facg = 0;
				app_S.monitor.monitor_X_S.facb = 0;
			}
		});

		app_S.monitor.monitor_X_S.bt83 = new DetaButton("红色相关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt83.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt83Stop == false) {
				app_S.monitor.monitor_X_S.isbt83Stop = true;
				app_S.monitor.monitor_X_S.bt83.setLabel("红色相开");
				app_S.monitor.monitor_X_S.facr = 100;
				app_S.monitor.monitor_X_S.facg = 125;
				app_S.monitor.monitor_X_S.facb = 135;
			} else {
				app_S.monitor.monitor_X_S.isbt83Stop = false;
				app_S.monitor.monitor_X_S.bt83.setLabel("红色相关");
				app_S.monitor.monitor_X_S.facr = 0;
				app_S.monitor.monitor_X_S.facg = 0;
				app_S.monitor.monitor_X_S.facb = 0;
			}
		});

		app_S.monitor.monitor_X_S.bt84 = new DetaButton("上传视频", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt84.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt85 = new DetaButton("上传声频", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt85.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt86 = new DetaButton("上传图片", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt86.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt87 = new DetaButton("上传文档", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt87.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt88 = new DetaButton("眼识别关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt88.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt88Stop == false) {
				app_S.monitor.monitor_X_S.isbt88Stop = true;
				app_S.monitor.monitor_X_S.bt88.setLabel("眼识别开");
			} else {
				app_S.monitor.monitor_X_S.isbt88Stop = false;
				app_S.monitor.monitor_X_S.bt88.setLabel("眼识别关");
			}
		});

		app_S.monitor.monitor_X_S.bt89 = new DetaButton("识别鼻关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt89.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt90 = new DetaButton("识别五官", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt90.addActionListener(e -> {

		});

		app_S.monitor.monitor_X_S.bt91 = new DetaButton("识别嘴关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt91.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt111 = new DetaButton("导入图关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt111.addActionListener(e -> {
			try {
				if (app_S.monitor.monitor_X_S.isStop == false) {
					app_S.monitor.monitor_X_S.isStop = true;
					app_S.monitor.monitor_X_S.bt111.setLabel("导入图开");
					FileDialog filedialog = new FileDialog(new Frame(),
							"打开图片文件", FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter("jpg"));
					filedialog.setVisible(true);
					String filepath = filedialog.getDirectory()
							+ filedialog.getFile();
					NE.app_S.appConfig.SectionJPanel.jTextPane
							.setText("" + filepath);
					File inputBin = new File(filepath);
					app_S.tempBufferedImage = ImageIO.read(inputBin);
					if (null == app_S.tempBufferedImage) {
						return;
					}
					app_S.monitor.monitor_X_S.stopBufferedImage = app_S.tempBufferedImage;
					app_S.monitor.monitor_X_S.img = app_S.monitor.monitor_X_S.stopBufferedImage
							.getScaledInstance(
									app_S.monitor.monitor_X_S.imageForOutput
											.getWidth(),
									app_S.monitor.monitor_X_S.imageForOutput
											.getHeight(),
									java.awt.Image.SCALE_SMOOTH);
					app_S.monitor.monitor_X_S.imageForOutput.getGraphics()
							.drawImage(app_S.monitor.monitor_X_S.img, 0, 0,
									null);
					app_S.monitor.getGraphics().drawImage(
							app_S.monitor.monitor_X_S.img, 0, 0, 900, 680,
							app_S.monitor);// 绘出图形文件
				} else {
					app_S.monitor.monitor_X_S.isStop = false;
					app_S.monitor.monitor_X_S.bt111.setLabel("导入图关");
				}
			} catch (IOException ex) {
				throw new RuntimeException(ex);
				// ..SIVQ..
				// e1.printStackTrace();
			}
		});
		app_S.monitor.monitor_X_S.bt112 = new DetaButton("图片关联", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt112.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isStop == false) {
				app_S.monitor.monitor_X_S.isStop = true;
				app_S.monitor.monitor_X_S.lendImage = true;
				app_S.monitor.monitor_X_S.bt22.setLabel("导入图开");
				if (null == app_S.tempBufferedImage) {
					return;
				}
				app_S.monitor.monitor_X_S.stopBufferedImage = app_S.tempBufferedImage;
				app_S.monitor.monitor_X_S.img = app_S.monitor.monitor_X_S.stopBufferedImage
						.getScaledInstance(
								app_S.monitor.monitor_X_S.imageForOutput
										.getWidth(),
								app_S.monitor.monitor_X_S.imageForOutput
										.getHeight(),
								java.awt.Image.SCALE_SMOOTH);
				app_S.monitor.monitor_X_S.imageForOutput.getGraphics()
						.drawImage(app_S.monitor.monitor_X_S.img, 0, 0, null);
				app_S.monitor.getGraphics().drawImage(
						app_S.monitor.monitor_X_S.img, 0, 0, 900, 680,
						app_S.monitor);
				// 绘出图形文件
			} else {
				app_S.monitor.monitor_X_S.isStop = false;
				app_S.monitor.monitor_X_S.lendImage = false;
				app_S.monitor.monitor_X_S.bt22.setLabel("导入图关");
			}
		});
	}

	// 370
	// Image img= image.getScaledInstance(
	// app_S.monitor.monitor_X_S.imageForOutput.getWidth()
	// , app_S.monitor.monitor_X_S.imageForOutput.getHeight()
	// , java.awt.Image.SCALE_SMOOTH);
	// app_S.monitor.monitor_X_S.imageForOutput.getGraphics()
	// .drawImage(img, 0, 0, null);
	// app_S.monitor.monitor_X_S.getGraphics().drawImage(img
	// , 0, 0, 900, 680, app_S.monitor);// 绘出图形文件
}