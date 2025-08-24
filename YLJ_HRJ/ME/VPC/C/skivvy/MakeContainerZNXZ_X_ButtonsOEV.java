package ME.VPC.C.skivvy;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import M_V.AVQ.PVU.vedio.PlayerControl;
import M_V.AVQ.PVU.vedio.PlayerShow;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.filenameFilter.TXTFilter;
import S_A.pheromone.IMV_SIQ;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class MakeContainerZNXZ_X_ButtonsOEV {
	public static void createButtons(App NE) throws InterruptedException {
		App_S app_S = NE.app_S;
		app_S.monitor.monitor_X_S.bt00 = new DetaButton("初始重置", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt00.addActionListener(e -> {
			app_S.monitor.monitor_X_S.isRedButton = false;
			app_S.monitor.monitor_X_S.isGreenButton = false;
			app_S.monitor.monitor_X_S.isBlueButton = false;
			app_S.monitor.monitor_X_S.isStreButton = false;
			app_S.monitor.monitor_X_S.isSblButton = false;
			app_S.monitor.monitor_X_S.isRcaButton = false;
			app_S.monitor.monitor_X_S.isPcaButton = false;
			app_S.monitor.monitor_X_S.isPcfButton = false;
			app_S.monitor.monitor_X_S.isStop = false;
			app_S.monitor.monitor_X_S.recordStop = true;
			app_S.monitor.monitor_X_S.imageList.clear();
			app_S.monitor.monitor_X_S.bt01.setLabel("红色光谱");
			app_S.monitor.monitor_X_S.bt02.setLabel("绿色光谱");
			app_S.monitor.monitor_X_S.bt03.setLabel("蓝色光谱");
			app_S.monitor.monitor_X_S.bt10.setLabel("锐化关闭");
			app_S.monitor.monitor_X_S.bt11.setLabel("纹理检测");
			app_S.monitor.monitor_X_S.bt12.setLabel("熵增过滤");
			app_S.monitor.monitor_X_S.bt13.setLabel("成份分析");
			app_S.monitor.monitor_X_S.bt20.setLabel("成份过滤");
			app_S.monitor.monitor_X_S.bt20.setLabel("暂停视屏");
			app_S.monitor.monitor_X_S.bt31.setLabel("开始录制");
			app_S.monitor.monitor_X_S.facx = 7;
			app_S.monitor.monitor_X_S.facy = 100;
			app_S.monitor.monitor_X_S.facz = 0;
			app_S.monitor.monitor_X_S.fact = 0;
			app_S.monitor.monitor_X_S.facl = 3;
			app_S.monitor.monitor_X_S.facr = 0;
			app_S.monitor.monitor_X_S.facg = 0;
			app_S.monitor.monitor_X_S.facb = 0;
		});

		app_S.monitor.monitor_X_S.bt01 = new DetaButton("红色光谱", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt01.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isRedButton == false) {
				app_S.monitor.monitor_X_S.isRedButton = true;
				app_S.monitor.monitor_X_S.bt01.setLabel("红光谱开");
			} else {
				app_S.monitor.monitor_X_S.isRedButton = false;
				app_S.monitor.monitor_X_S.bt01.setLabel("红光谱关");
			}
		});

		app_S.monitor.monitor_X_S.bt02 = new DetaButton("绿色光谱", 100, 50,
				Color.green);
		app_S.monitor.monitor_X_S.bt02.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isGreenButton == false) {
					app_S.monitor.monitor_X_S.isGreenButton = true;
					app_S.monitor.monitor_X_S.bt02.setLabel("绿光谱开");
				} else {
					app_S.monitor.monitor_X_S.isGreenButton = false;
					app_S.monitor.monitor_X_S.bt02.setLabel("绿光谱关");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt03 = new DetaButton("蓝色光谱", 100, 50,
				Color.blue);
		app_S.monitor.monitor_X_S.bt03.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isBlueButton == false) {
					app_S.monitor.monitor_X_S.isBlueButton = true;
					app_S.monitor.monitor_X_S.bt03.setLabel("蓝光谱开");
				} else {
					app_S.monitor.monitor_X_S.isBlueButton = false;
					app_S.monitor.monitor_X_S.bt03.setLabel("蓝光谱关");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt10 = new DetaButton("锐化项关", 100, 50,
				Color.magenta);
		app_S.monitor.monitor_X_S.bt10.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isStreButton == false) {
					app_S.monitor.monitor_X_S.isStreButton = true;
					app_S.monitor.monitor_X_S.bt10.setLabel("锐化开启");
				} else {
					app_S.monitor.monitor_X_S.isStreButton = false;
					app_S.monitor.monitor_X_S.bt10.setLabel("锐化关闭");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt11 = new DetaButton("纹理检关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt11.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isSblButton == false) {
					app_S.monitor.monitor_X_S.isSblButton = true;
					app_S.monitor.monitor_X_S.bt11.setLabel("纹理检开");
				} else {
					app_S.monitor.monitor_X_S.isSblButton = false;
					app_S.monitor.monitor_X_S.bt11.setLabel("纹理检关");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt12 = new DetaButton("熵增滤关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt12.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isRcaButton == false) {
					app_S.monitor.monitor_X_S.isRcaButton = true;
					app_S.monitor.monitor_X_S.bt12.setLabel("熵增滤开");
				} else {
					app_S.monitor.monitor_X_S.isRcaButton = false;
					app_S.monitor.monitor_X_S.bt12.setLabel("熵增滤关");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt13 = new DetaButton("成份分析", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt13.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isPcaButton == false) {
					app_S.monitor.monitor_X_S.isPcaButton = true;
					app_S.monitor.monitor_X_S.bt13.setLabel("成份析开");
				} else {
					app_S.monitor.monitor_X_S.isPcaButton = false;
					app_S.monitor.monitor_X_S.bt13.setLabel("成份析关");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt20 = new DetaButton("成份滤关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt20.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isPcfButton == false) {
					app_S.monitor.monitor_X_S.isPcfButton = true;
					app_S.monitor.monitor_X_S.bt20.setLabel("成份滤开");
				} else {
					app_S.monitor.monitor_X_S.isPcfButton = false;
					app_S.monitor.monitor_X_S.bt20.setLabel("成份滤关");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt21 = new DetaButton("动态裁面", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		app_S.monitor.monitor_X_S.bt22 = new DetaButton("暂停视屏", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt22.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isStop == false) {
					app_S.monitor.monitor_X_S.isStop = true;
					app_S.monitor.monitor_X_S.bt22.setLabel("视频开启");
				} else {
					app_S.monitor.monitor_X_S.isStop = false;
					app_S.monitor.monitor_X_S.bt22.setLabel("视频关闭");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt23 = new DetaButton("保存该图", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 获取图片
				// 弹出保存框
				if (null == app_S.monitor.monitor_X_S.imageForOutput) {
					return;
				}
				// get path
				FileDialog filedialog = new FileDialog(new Frame(), "导入到这里",
						FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter("png"));
				filedialog.setVisible(true);
				String filepath = filedialog.getDirectory()
						+ filedialog.getFile();
				System.out.println(filepath);
				try {
					File outputBin = new File(filepath + ".png");
					if (null == app_S.monitor.monitor_X_S.imageForOutput) {
						return;
					}
					ImageIO.write(app_S.monitor.monitor_X_S.imageForOutput,
							"png", outputBin);
				} catch (IOException writePngError) {
					NE.app_S.appConfig.SectionJPanel.jTextPane
							.setText("" + filepath);
				}
				// 输出图片
			}
		});

		app_S.monitor.monitor_X_S.bt30 = new DetaButton("录制配置", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		app_S.monitor.monitor_X_S.bt31 = new DetaButton("开始录制", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt31.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.recordStop == true) {
					app_S.monitor.monitor_X_S.recordStop = false;
					app_S.monitor.monitor_X_S.bt31.setLabel("暂停录制");
				} else {
					app_S.monitor.monitor_X_S.recordStop = true;
					app_S.monitor.monitor_X_S.bt31.setLabel("开始录制");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt32 = new DetaButton("保存视屏", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.imageList.size() <= 0
						|| !app_S.monitor.monitor_X_S.recordStop) {
					return;
				}
				FileDialog filedialog = new FileDialog(new Frame(), "导入到这里",
						FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter("lyg"));
				filedialog.setVisible(true);
				String filepath = filedialog.getDirectory()
						+ filedialog.getFile();
				NE.app_S.appConfig.SectionJPanel.jTextPane
						.setText("" + filepath);
				File outputBin = new File(filepath + ".lyg");
				Iterator<int[][]> iterator = app_S.monitor.monitor_X_S.imageList
						.iterator();
				try {
					FileOutputStream wr = new FileOutputStream(outputBin);
					// 写头， 宽，长
					if (iterator.hasNext()) {
						int[][] bufferedImage = iterator.next();
						int width = bufferedImage.length;
						int height = bufferedImage[0].length;
						int flips = app_S.monitor.monitor_X_S.imageList.size();
						byte[] flipBytes = new byte[height * width * 4];

						byte[] widthBytes = new byte[4];
						widthBytes[0] = (byte) (width & 0xff);
						widthBytes[1] = (byte) (width >> 8 & 0xff);
						widthBytes[2] = (byte) (width >> 16 & 0xff);
						widthBytes[3] = (byte) (width >> 24 & 0xff);
						wr.write(widthBytes);

						byte[] heightBytes = new byte[4];
						heightBytes[0] = (byte) (height & 0xff);
						heightBytes[1] = (byte) (height >> 8 & 0xff);
						heightBytes[2] = (byte) (height >> 16 & 0xff);
						heightBytes[3] = (byte) (height >> 24 & 0xff);
						wr.write(heightBytes);

						byte[] flipsBytes = new byte[4];
						flipsBytes[0] = (byte) (flips & 0xff);
						flipsBytes[1] = (byte) (flips >> 8 & 0xff);
						flipsBytes[2] = (byte) (flips >> 16 & 0xff);
						flipsBytes[3] = (byte) (flips >> 24 & 0xff);
						wr.write(flipsBytes);
						// 写头桢
						for (int i = 0; i < height; i++) {
							for (int j = 0; j < width; j++) {
								int pix = bufferedImage[j][i];
								flipBytes[i * (width * 4) + j * 4
										+ 0] = (byte) (pix & 0xff);
								flipBytes[i * (width * 4) + j * 4
										+ 1] = (byte) (pix >> 8 & 0xff);
								flipBytes[i * (width * 4) + j * 4
										+ 2] = (byte) (pix >> 16 & 0xff);
								flipBytes[i * (width * 4) + j * 4
										+ 3] = (byte) (pix >> 24 & 0xff);
							}
						}
						wr.write(flipBytes);
						wr.flush();
						// 写身体
						while (iterator.hasNext()) {
							// 写身体每一帧
							int[][] flipImage = iterator.next();
							for (int i = 0; i < height; i++) {
								for (int j = 0; j < width; j++) {
									int pix = flipImage[j][i];
									// byte[] flip=new byte[4];
									flipBytes[i * (width * 4) + j * 4
											+ 0] = (byte) (pix & 0xff);
									flipBytes[i * (width * 4) + j * 4
											+ 1] = (byte) (pix >> 8 & 0xff);
									flipBytes[i * (width * 4) + j * 4
											+ 2] = (byte) (pix >> 16 & 0xff);
									flipBytes[i * (width * 4) + j * 4
											+ 3] = (byte) (pix >> 24 & 0xff);
								}
							}
							wr.write(flipBytes);
							wr.flush();
						}
					}
					wr.close();
					app_S.monitor.monitor_X_S.imageList.clear();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		app_S.monitor.monitor_X_S.bt33 = new DetaButton("读取录制", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt33.addActionListener(e -> {
			FileDialog filedialog = new FileDialog(new Frame(), "读取lyg 视频文件",
					FileDialog.LOAD);
			filedialog.setFilenameFilter(new TXTFilter("lyg"));
			filedialog.setVisible(true);
			String filepath = filedialog.getDirectory() + filedialog.getFile();
			NE.app_S.appConfig.SectionJPanel.jTextPane.setText("" + filepath);
			File inputBin = new File(filepath);
			// 读取头
			// ArrayList<BufferedImage> arrayList=new ArrayList<>();
			// 读取宽
			try {
				@SuppressWarnings("resource")
				RandomAccessFile randomAccessFile = new RandomAccessFile(
						inputBin, "r");
				byte[] width = new byte[4];
				int w3 = 0;
				int w2 = 0;
				int w1 = 0;
				int w0 = 0;
				if (randomAccessFile.read(width) != 0) {
					// bytes to int
					w3 = (int) width[3] << 24 & 0xff000000;
					w2 = (int) width[2] << 16 & 0x00ff0000;
					w1 = (int) width[1] << 8 & 0x0000ff00;
					w0 = (int) width[0] & 0x000000ff;
				}
				final int widthInt = w3 | w2 | w1 | w0;
				// 读取长
				byte[] height = new byte[4];
				int h3 = 0;
				int h2 = 0;
				int h1 = 0;
				int h0 = 0;
				if (randomAccessFile.read(height) != 0) {
					// bytes to int
					h3 = (int) height[3] << 24 & 0xff000000;
					h2 = (int) height[2] << 16 & 0x00ff0000;
					h1 = (int) height[1] << 8 & 0x0000ff00;
					h0 = (int) height[0] & 0x000000ff;

				}
				final int heightInt = h3 | h2 | h1 | h0;
				// 读取帧数
				byte[] flips = new byte[4];
				int f3 = 0;
				int f2 = 0;
				int f1 = 0;
				int f0 = 0;
				if (randomAccessFile.read(flips) != 0) {
					// bytes to int
					f3 = (int) flips[3] << 24 & 0xff000000;
					f2 = (int) flips[2] << 16 & 0x00ff0000;
					f1 = (int) flips[1] << 8 & 0x0000ff00;
					f0 = (int) flips[0] & 0x000000ff;
				}
				final int flipsInt = f3 | f2 | f1 | f0;
				// 初始桢
				Map<Integer, BufferedImage> flipImage = new IMV_SIQ();
				for (int i = 0; i < flipsInt; i++) {
					byte[] filp = new byte[widthInt * heightInt * 4];
					try {
						if (randomAccessFile.read(filp) != 0) {
							// filp to image
							BufferedImage image = new BufferedImage(widthInt,
									heightInt, BufferedImage.TYPE_INT_RGB);
							for (int h = 0; h < heightInt; h++) {
								for (int w = 0; w < widthInt; w++) {
									int p3 = (int) filp[h * (widthInt * 4)
											+ w * 4 + 3] << 24 & 0xff000000;
									int p2 = (int) filp[h * (widthInt * 4)
											+ w * 4 + 2] << 16 & 0x00ff0000;
									int p1 = (int) filp[h * (widthInt * 4)
											+ w * 4 + 1] << 8 & 0x0000ff00;
									int p0 = (int) filp[h * (widthInt * 4)
											+ w * 4 + 0] & 0x000000ff;
									int pix = p3 | p2 | p1 | p0;
									image.setRGB(w, h, pix);
								}
							}
							flipImage.put(i, image);
						}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				int[] control = new int[8];
				control[5] = flipImage.size();
				PlayerControl playerControl = new PlayerControl(control,
						flipImage);
				playerControl.run();
				PlayerShow playerShow = new PlayerShow(playerControl, widthInt,
						heightInt, flipImage, control);
				playerShow.start();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});

		app_S.monitor.monitor_X_S.bt43 = new DetaButton("高斯分析", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt43.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (app_S.monitor.monitor_X_S.isbt43Stop == false) {
					app_S.monitor.monitor_X_S.isbt43Stop = true;
					app_S.monitor.monitor_X_S.bt43.setLabel("高斯谱开");
				} else {
					app_S.monitor.monitor_X_S.isbt43Stop = false;
					app_S.monitor.monitor_X_S.bt43.setLabel("高斯谱关");
				}
			}
		});

		app_S.monitor.monitor_X_S.bt42 = new DetaButton("巴特沃斯流", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt42.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt41 = new DetaButton("拉普拉斯", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt41.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt41Stop == false) {
				app_S.monitor.monitor_X_S.isbt41Stop = true;
				app_S.monitor.monitor_X_S.bt41.setLabel("拉普开启");
			} else {
				app_S.monitor.monitor_X_S.isbt41Stop = false;
				app_S.monitor.monitor_X_S.bt41.setLabel("拉普关闭");
			}
		});

		app_S.monitor.monitor_X_S.bt40 = new DetaButton("线性傅氏", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt40.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt50 = new DetaButton("欧基里德", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt50.addActionListener(e -> {
		});

		app_S.monitor.monitor_X_S.bt113 = new DetaButton("索贝尔关", 100, 50,
				Color.pink);
		app_S.monitor.monitor_X_S.bt113.addActionListener(e -> {
			if (app_S.monitor.monitor_X_S.isbt113Stop == false) {
				app_S.monitor.monitor_X_S.isbt113Stop = true;
				app_S.monitor.monitor_X_S.bt113.setLabel("索贝尔开");
			} else {
				app_S.monitor.monitor_X_S.isbt113Stop = false;
				app_S.monitor.monitor_X_S.bt113.setLabel("索贝尔关");
			}
		});
	}
}
