package ME.VPC.C.skivvy;

import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.button.YLJShowButton;
import M_V.MVQ.filenameFilter.TXTFilter;
import OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addPGSearchPage.DemoPanel;
import S_A.SVQ.stable.S_Annotation;
import exception.thread.DetaThread;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class MakeContainerYXTP extends MakeContainerYXTP_X {

	public MakeContainerYXTP(Container jpanelFourth, List<String> tabNames2,
			App NE) {
		super(jpanelFourth, tabNames2, NE);
	}

	public void run() {
		try {
			// jpanelFourth= new JPanel();
			jTabbedpane.validate();
			DetaThread.sleepDeta(10 * 60);
			jpanelFourth.setLayout(null);
			jpanelFourth.setBounds(0, 0, 1446, 980);
			//
			JPanel actionPanel = new JPanel();
			actionPanel.setLayout(null);
			actionPanel.setBounds(5, 0, 1300 - 30, 410);
			actionPanel.setBackground(Color.BLUE);
			// 1 PANEL
			DemoPanel leftPanel = new DemoPanel();
			leftPanel.setBounds(5 + 5, 15, 615, 380);
			leftPanel.setBackground(Color.magenta);
			cacuMap.putIfAbsent("", null);
			// icon set img
			// button add
			JPanel buttom = new JPanel();
			buttom.setBounds(5, 420, 1300 - 30, 185);
			buttom.setBackground(Color.PINK);
			buttom.setLayout(null);
			// bufferImage read
			// 显示文件夹root页面窗
			DetaButton fileButton = new DetaButton("文件夹浏览", 100, 50,
					Color.YELLOW);
			fileButton.addActionListener(e -> {
				// 选中一个root文件夹然后导入所有待搜索资源。
				int x = 117;
				// init
				jpanelFourth.removeAll();
				actionPanel.removeAll();
				//
				try {
					String pgCategoryLink = "";
					FileDialog filedialog = new FileDialog(new Frame(),
							"请选中null图片", FileDialog.LOAD);
					filedialog.setFilenameFilter(
							new TXTFilter(S_Annotation.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					pgCategoryLink = filedialog.getDirectory();
					// String root = pgCategoryLink.split("pgSearch")[0] +
					// "pgSearch/";
					String root = pgCategoryLink + "";
					System.out.println(root);
					nullPG = root + "nullPG.jpg";
					bufferedImageNullPG = ImageIO.read(new File(nullPG));// later
																		 // trif
					File rootFile = new File(root);
					if (rootFile.exists() && rootFile.isDirectory()) {
						String[] strings = rootFile.list();
						for (String string : strings) {
							// System.out.println(string);
							File subRoot = new File(root + string);
							if (subRoot.exists() && subRoot.isDirectory()) {
								String[] subStrings = subRoot.list();
								LinkedList<String> tongueList = new LinkedList<>();
								for (String subString : subStrings) {
									if (subString.contains("jpg")) {
										tongueList.add(root + string + "/"
												+ subString);
									}
								}
								listMap.put(string, tongueList);
								showMap.put(string, tongueList);
								typeList.add(string);
							}
						}
					}
					if (typeList.isEmpty()) {
						return;
					}
					if (!listMap.containsKey(typeList.get(0))) {
						return;
					}
					BufferedImage image = ImageIO.read(
							new File(listMap.get(typeList.get(0)).get(0)));
					// image format
					leftPanel.removeAll();
					leftPanel.img = image.getScaledInstance(605, 365,
							java.awt.Image.SCALE_SMOOTH);
					leftPanel.icon = new ImageIcon();
					leftPanel.icon.setImage(leftPanel.img);
					leftPanel.button = new YLJShowButton(null);
					leftPanel.button.bufferedImage = image;
					app.tempBufferedImage = leftPanel.button.bufferedImage;
					leftPanel.button.setIcon(leftPanel.icon);
					leftPanel.add(leftPanel.button);
					actionPanel.setLayout(null);
					actionPanel.add(leftPanel);

					JPanel topLeftPanel = new JPanel();
					topLeftPanel.setBounds(5 + 5 + 600 + 20 + 10, 0 + 15, 300,
							160);
					topLeftPanel.setBackground(Color.ORANGE);

					DetaButton buttonTopLeftPanel = new DetaButton(null);
					if (cacuPip.size() < 500) {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(0))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(0));
							cacuMap.put(listMap.get(typeList.get(0)).get(0),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(0))));
						}
					} else {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(0))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(0));
							String theFirst = cacuPip.get(0);
							cacuMap.remove(theFirst);
							cacuPip.remove(theFirst);
							cacuMap.put(listMap.get(typeList.get(0)).get(0),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(0))));
						}
					}
					// buttonTopLeftPanel.bufferedImage= ImageIO.read(new
					// File(listMap.get(typeList.get(0)).get(0)));
					buttonTopLeftPanel.bufferedImage = cacuMap
							.get(listMap.get(typeList.get(0)).get(0));
					// image format
					Image imgTopLeftPanel = buttonTopLeftPanel.bufferedImage
							.getScaledInstance(292, 146,
									java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconTopLeftPanel = new ImageIcon();
					iconTopLeftPanel.setImage(imgTopLeftPanel);
					buttonTopLeftPanel.setIcon(iconTopLeftPanel);

					buttonTopLeftPanel.addActionListener(e12 -> {
						leftPanel.button.bufferedImage = buttonTopLeftPanel.bufferedImage;
						Image imag = leftPanel.button.bufferedImage
								.getScaledInstance(605, 365,
										Image.SCALE_SMOOTH);
						ImageIcon bufferIcon = new ImageIcon();
						bufferIcon.setImage(imag);
						leftPanel.button.setIcon(bufferIcon);
						leftPanel.removeAll();
						leftPanel.add(leftPanel.button);
						leftPanel.button.fix();
						app.tempBufferedImage = leftPanel.button.bufferedImage;
					});
					topLeftPanel.removeAll();
					topLeftPanel.add(buttonTopLeftPanel);
					actionPanel.add(topLeftPanel);

					// 3 PANEL
					JPanel topRightPanel = new JPanel();
					topRightPanel.setBounds(5 + 5 + 600 + 20 + 300 + 20 + 5,
							0 + 15, 300, 160);
					topRightPanel.setBackground(Color.YELLOW);
					DetaButton buttontopRightPanel = new DetaButton(null);
					if (cacuPip.size() < 500) {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(1))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(1));
							cacuMap.put(listMap.get(typeList.get(0)).get(1),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(1))));
						}
					} else {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(1))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(1));
							String theFirst = cacuPip.get(0);
							cacuMap.remove(theFirst);
							cacuPip.remove(theFirst);
							cacuMap.put(listMap.get(typeList.get(0)).get(1),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(1))));
						}
					}
					buttontopRightPanel.bufferedImage = cacuMap
							.get(listMap.get(typeList.get(0)).get(1));
					// ImageIO.read(new
					// File(listMap.get(typeList.get(0)).get(1)));
					// image format
					Image imgtopRightPanel = buttontopRightPanel.bufferedImage
							.getScaledInstance(292, 146,
									java.awt.Image.SCALE_SMOOTH);
					ImageIcon icontopRightPanel = new ImageIcon();
					icontopRightPanel.setImage(imgtopRightPanel);
					buttontopRightPanel.setIcon(icontopRightPanel);

					buttontopRightPanel.addActionListener(e13 -> {
						leftPanel.button.bufferedImage = buttontopRightPanel.bufferedImage;
						Image imag = leftPanel.button.bufferedImage
								.getScaledInstance(605, 365,
										Image.SCALE_SMOOTH);
						ImageIcon bufferIcon = new ImageIcon();
						bufferIcon.setImage(imag);
						leftPanel.button.setIcon(bufferIcon);
						leftPanel.removeAll();
						leftPanel.add(leftPanel.button);
						leftPanel.button.fix();
						app.tempBufferedImage = leftPanel.button.bufferedImage;
					});
					topRightPanel.removeAll();
					topRightPanel.add(buttontopRightPanel);
					actionPanel.add(topRightPanel);

					// 4 PANEL
					JPanel botLeftPanel = new JPanel();
					botLeftPanel.setBounds(5 + 5 + 600 + 20 + 10, 0 + 15 + 175,
							300, 160);
					botLeftPanel.setBackground(Color.BLACK);

					DetaButton buttonbotLeftPanel = new DetaButton(null);
					if (cacuPip.size() < 500) {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(2))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(2));
							cacuMap.put(listMap.get(typeList.get(0)).get(2),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(2))));
						}
					} else {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(2))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(2));
							String theFirst = cacuPip.get(0);
							cacuMap.remove(theFirst);
							cacuPip.remove(theFirst);
							cacuMap.put(listMap.get(typeList.get(0)).get(2),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(2))));
						}
					}
					buttonbotLeftPanel.bufferedImage = cacuMap
							.get(listMap.get(typeList.get(0)).get(2));
					// ImageIO.read(new
					// File(listMap.get(typeList.get(0)).get(2)));
					// image format
					Image imgbotLeftPanel = buttonbotLeftPanel.bufferedImage
							.getScaledInstance(292, 146,
									java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconbotLeftPanel = new ImageIcon();
					iconbotLeftPanel.setImage(imgbotLeftPanel);
					buttonbotLeftPanel.setIcon(iconbotLeftPanel);

					buttonbotLeftPanel.addActionListener(e14 -> {
						leftPanel.button.bufferedImage = buttonbotLeftPanel.bufferedImage;
						Image imag = leftPanel.button.bufferedImage
								.getScaledInstance(605, 365,
										Image.SCALE_SMOOTH);
						ImageIcon bufferIcon = new ImageIcon();
						bufferIcon.setImage(imag);
						leftPanel.button.setIcon(bufferIcon);
						leftPanel.removeAll();
						leftPanel.add(leftPanel.button);
						leftPanel.button.fix();
						app.tempBufferedImage = leftPanel.button.bufferedImage;
					});
					botLeftPanel.removeAll();
					botLeftPanel.add(buttonbotLeftPanel);
					actionPanel.add(botLeftPanel);

					// 5 PANEL
					JPanel botRightPanel = new JPanel();
					botRightPanel.setBounds(5 + 5 + 600 + 20 + 300 + 20 + 5,
							0 + 15 + 175, 300, 160);
					botRightPanel.setBackground(Color.GREEN);

					DetaButton buttonbotRightPanel = new DetaButton(null);
					if (cacuPip.size() < 500) {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(3))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(3));
							cacuMap.put(listMap.get(typeList.get(0)).get(3),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(3))));
						}
					} else {
						if (!cacuMap.containsKey(
								listMap.get(typeList.get(0)).get(3))) {
							cacuPip.add(listMap.get(typeList.get(0)).get(3));
							String theFirst = cacuPip.get(0);
							cacuMap.remove(theFirst);
							cacuPip.remove(theFirst);
							cacuMap.put(listMap.get(typeList.get(0)).get(3),
									ImageIO.read(new File(listMap
											.get(typeList.get(0)).get(3))));
						}
					}
					buttonbotRightPanel.bufferedImage = cacuMap
							.get(listMap.get(typeList.get(0)).get(3));
					// ImageIO.read(new
					// File(listMap.get(typeList.get(0)).get(3)));
					// image format
					Image imgbotRightPanel = buttonbotRightPanel.bufferedImage
							.getScaledInstance(292, 146,
									java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconbotRightPanel = new ImageIcon();
					iconbotRightPanel.setImage(imgbotRightPanel);
					buttonbotRightPanel.setIcon(iconbotRightPanel);
					buttonbotRightPanel.addActionListener(e15 -> {
						leftPanel.button.bufferedImage = buttonbotRightPanel.bufferedImage;
						Image imag = leftPanel.button.bufferedImage
								.getScaledInstance(605, 365,
										Image.SCALE_SMOOTH);
						ImageIcon bufferIcon = new ImageIcon();
						bufferIcon.setImage(imag);
						leftPanel.button.setIcon(bufferIcon);
						leftPanel.removeAll();
						leftPanel.add(leftPanel.button);
						leftPanel.button.fix();
						app.tempBufferedImage = leftPanel.button.bufferedImage;
					});
					botRightPanel.removeAll();
					botRightPanel.add(buttonbotRightPanel);
					actionPanel.add(botRightPanel);
					// BUTTON
					// BUTTON
					// ONCLICK
					//
					buttom.removeAll();

					// 1 PANEL
					JPanel bot1Panel = new JPanel();
					bot1Panel.setBounds(5 + 5, 0 + 5, 300, 175);
					bot1Panel.setBackground(Color.RED);

					BufferedImage imagebot1Panel;
					if (listMap.get(typeList.get(0)).size() > 0) {
						if (cacuPip.size() < 500) {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(0)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(0)).get(0));
								cacuMap.put(listMap.get(typeList.get(0)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(0)).get(0))));
							}
						} else {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(0)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(0)).get(0));
								String theFirst = cacuPip.get(0);
								cacuMap.remove(theFirst);
								cacuPip.remove(theFirst);
								cacuMap.put(listMap.get(typeList.get(0)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(0)).get(0))));
							}
						}
						imagebot1Panel = cacuMap
								.get(listMap.get(typeList.get(0)).get(0));
						// buttonTopLeftPanel.bufferedImage= ImageIO.read(new
						// File(listMap.get(typeList.get(1)).get(0)));
					} else {
						imagebot1Panel = bufferedImageNullPG;
					}
					// image format
					Image imgbot1Panel = imagebot1Panel.getScaledInstance(300,
							165, java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconbot1Panel = new ImageIcon();
					iconbot1Panel.setImage(imgbot1Panel);
					DetaButton buttonbot1Panel = new DetaButton(null);
					buttonbot1Panel.setIcon(iconbot1Panel);
					buttonbot1Panel.addActionListener(e16 -> {
						try {
							flip = 0;
							flop = 0;
							BufferedImage bufferImage;
							if (listMap.get(typeList.get(0)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								}
								bufferImage = cacuMap.get(
										listMap.get(typeList.get(0)).get(0));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(1)).get(0)));
							} else {
								bufferImage = bufferedImageNullPG;
							}
							Image imag = bufferImage.getScaledInstance(605, 365,
									Image.SCALE_SMOOTH);
							ImageIcon bufferIcon = new ImageIcon();
							bufferIcon.setImage(imag);
							leftPanel.button.setIcon(bufferIcon);
							leftPanel.removeAll();
							leftPanel.add(leftPanel.button);
							//
							if (listMap.get(typeList.get(0)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								}
								buttonTopLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(0)).get(0));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(0)).get(0)));
							} else {
								buttonTopLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag1 = buttonTopLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonTopLeftPanel.setIcon(bufferIcon1);
							topLeftPanel.removeAll();
							topLeftPanel.add(buttonTopLeftPanel);
							///
							if (listMap.get(typeList.get(0)).size() > 1) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(1));
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(1))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(1));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(1))));
									}
								}
								buttontopRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(0)).get(1));
								// buttontopRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(0)).get(1)));
							} else {
								buttontopRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag2 = buttontopRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttontopRightPanel.setIcon(bufferIcon2);
							topRightPanel.removeAll();
							topRightPanel.add(buttontopRightPanel);
							///
							if (listMap.get(typeList.get(0)).size() > 2) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(2));
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(2))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(2));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(2))));
									}
								}
								buttonbotLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(0)).get(2));
								// buttonbotLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(0)).get(2)));
							} else {
								buttonbotLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag3 = buttonbotLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbotLeftPanel.setIcon(bufferIcon3);
							botLeftPanel.removeAll();
							botLeftPanel.add(buttonbotLeftPanel);
							//
							if (listMap.get(typeList.get(0)).size() > 3) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(3));
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(3))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(3));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(3))));
									}
								}
								buttonbotRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(0)).get(3));
								// buttonbotRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(0)).get(3)));
							} else {
								buttonbotRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag4 = buttonbotRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbotRightPanel.setIcon(bufferIcon4);
							botRightPanel.removeAll();
							botRightPanel.add(buttonbotRightPanel);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});
					bot1Panel.add(buttonbot1Panel);
					buttom.add(bot1Panel);

					// 2 PANEL
					JPanel bot1Panel2 = new JPanel();
					bot1Panel2.setBounds(5 + 5 + 300 + 15, 0 + 5, 300, 175);
					bot1Panel2.setBackground(Color.CYAN);

					BufferedImage imagebot1Panel2;
					if (listMap.get(typeList.get(1)).size() > 0) {
						if (cacuPip.size() < 500) {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(1)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(1)).get(0));
								cacuMap.put(listMap.get(typeList.get(1)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(1)).get(0))));
							}
						} else {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(1)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(1)).get(0));
								String theFirst = cacuPip.get(0);
								cacuMap.remove(theFirst);
								cacuPip.remove(theFirst);
								cacuMap.put(listMap.get(typeList.get(1)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(1)).get(0))));
							}
						}
						imagebot1Panel2 = cacuMap
								.get(listMap.get(typeList.get(1)).get(0));
						// buttonTopLeftPanel.bufferedImage= ImageIO.read(new
						// File(listMap.get(typeList.get(1)).get(0)));
					} else {
						imagebot1Panel2 = bufferedImageNullPG;
					}
					// image format
					Image imgbot1Panel2 = imagebot1Panel2.getScaledInstance(300,
							165, java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconbot1Panel2 = new ImageIcon();
					iconbot1Panel2.setImage(imgbot1Panel2);
					DetaButton buttonbot1Panel2 = new DetaButton(null);
					buttonbot1Panel2.setIcon(iconbot1Panel2);
					buttonbot1Panel2.addActionListener(e17 -> {
						try {
							flip = 1;
							flop = 0;
							BufferedImage bufferImage;
							if (listMap.get(typeList.get(1)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								}
								bufferImage = cacuMap.get(
										listMap.get(typeList.get(1)).get(0));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(1)).get(0)));
							} else {
								bufferImage = bufferedImageNullPG;
							}
							Image imag = bufferImage.getScaledInstance(605, 365,
									Image.SCALE_SMOOTH);
							ImageIcon bufferIcon = new ImageIcon();
							bufferIcon.setImage(imag);
							leftPanel.button.setIcon(bufferIcon);
							leftPanel.removeAll();
							leftPanel.add(leftPanel.button);
							//
							if (listMap.get(typeList.get(1)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								}
								buttonTopLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(1)).get(0));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(1)).get(0)));
							} else {
								buttonTopLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag1 = buttonTopLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonTopLeftPanel.setIcon(bufferIcon1);
							topLeftPanel.removeAll();
							topLeftPanel.add(buttonTopLeftPanel);
							///
							if (listMap.get(typeList.get(1)).size() > 1) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(1));
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(1))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(1));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(1))));
									}
								}
								buttontopRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(1)).get(1));
								// buttontopRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(1)).get(1)));
							} else {
								buttontopRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag2 = buttontopRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttontopRightPanel.setIcon(bufferIcon2);
							topRightPanel.removeAll();
							topRightPanel.add(buttontopRightPanel);
							if (listMap.get(typeList.get(1)).size() > 2) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(2));
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(2))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(2));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(2))));
									}
								}
								buttonbotLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(1)).get(2));
								// buttonbotLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(1)).get(2)));
							} else {
								buttonbotLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag3 = buttonbotLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbotLeftPanel.setIcon(bufferIcon3);
							botLeftPanel.removeAll();
							botLeftPanel.add(buttonbotLeftPanel);
							if (listMap.get(typeList.get(1)).size() > 3) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(3));
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(3))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(3));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(3))));
									}
								}
								buttonbotRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(1)).get(3));
								// buttonbotRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(1)).get(3)));
							} else {
								buttonbotRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag4 = buttonbotRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbotRightPanel.setIcon(bufferIcon4);
							botRightPanel.removeAll();
							botRightPanel.add(buttonbotRightPanel);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});
					bot1Panel2.add(buttonbot1Panel2);
					buttom.add(bot1Panel2);
					// 3 PANEL
					JPanel bot1Panel3 = new JPanel();
					bot1Panel3.setBounds(5 + 5 + 300 + 15 + 300 + 15, 0 + 5,
							300, 175);
					bot1Panel3.setBackground(Color.YELLOW);
					BufferedImage imagebot1Panel3;
					if (listMap.get(typeList.get(2)).size() > 0) {
						if (cacuPip.size() < 500) {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(2)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(2)).get(0));
								cacuMap.put(listMap.get(typeList.get(2)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(2)).get(0))));
							}
						} else {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(2)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(2)).get(0));
								String theFirst = cacuPip.get(0);
								cacuMap.remove(theFirst);
								cacuPip.remove(theFirst);
								cacuMap.put(listMap.get(typeList.get(2)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(2)).get(0))));
							}
						}
						imagebot1Panel3 = cacuMap
								.get(listMap.get(typeList.get(2)).get(0));
					} else {
						imagebot1Panel3 = bufferedImageNullPG;
					}
					// image format
					Image imgbot1Panel3 = imagebot1Panel3.getScaledInstance(300,
							165, java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconbot1Panel3 = new ImageIcon();
					iconbot1Panel3.setImage(imgbot1Panel3);
					DetaButton buttonbot1Panel3 = new DetaButton(null);
					buttonbot1Panel3.setIcon(iconbot1Panel3);
					buttonbot1Panel3.addActionListener(e113 -> {
						try {
							flip = 2;
							flop = 0;
							BufferedImage bufferImage;
							if (listMap.get(typeList.get(2)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								}
								bufferImage = cacuMap.get(
										listMap.get(typeList.get(2)).get(0));
							} else {
								bufferImage = bufferedImageNullPG;
							}
							Image imag = bufferImage.getScaledInstance(605, 365,
									Image.SCALE_SMOOTH);
							ImageIcon bufferIcon = new ImageIcon();
							bufferIcon.setImage(imag);
							leftPanel.button.setIcon(bufferIcon);
							leftPanel.removeAll();
							leftPanel.add(leftPanel.button);
							//
							if (listMap.get(typeList.get(2)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								}
								buttonTopLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(2)).get(0));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(2)).get(0)));
							} else {
								buttonTopLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag1 = buttonTopLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonTopLeftPanel.setIcon(bufferIcon1);
							topLeftPanel.removeAll();
							topLeftPanel.add(buttonTopLeftPanel);
							///
							if (listMap.get(typeList.get(2)).size() > 1) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(1));
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(1))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(1));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(1))));
									}
								}
								buttontopRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(2)).get(1));
								// buttontopRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(2)).get(1)));
							} else {
								buttontopRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag2 = buttontopRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttontopRightPanel.setIcon(bufferIcon2);
							topRightPanel.removeAll();
							topRightPanel.add(buttontopRightPanel);
							///
							if (listMap.get(typeList.get(2)).size() > 2) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(2));
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(2))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(2));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(2))));
									}
								}
								buttonbotLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(2)).get(2));
								// buttonbotLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(2)).get(2)));
							} else {
								buttonbotLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag3 = buttonbotLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbotLeftPanel.setIcon(bufferIcon3);
							botLeftPanel.removeAll();
							botLeftPanel.add(buttonbotLeftPanel);

							//
							if (listMap.get(typeList.get(2)).size() > 3) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(3));
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(3))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(3));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(3))));
									}
								}
								buttonbotRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(2)).get(3));
								// buttonbotRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(2)).get(3)));
							} else {
								buttonbotRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag4 = buttonbotRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbotRightPanel.setIcon(bufferIcon4);
							botRightPanel.removeAll();
							botRightPanel.add(buttonbotRightPanel);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});
					bot1Panel3.add(buttonbot1Panel3);
					buttom.add(bot1Panel3);
					// 4 PANEL
					JPanel bot1Panel4 = new JPanel();
					bot1Panel4.setBounds(5 + 5 + 300 + 15 + 300 + 15 + 300 + 15,
							0 + 5, 300, 175);
					bot1Panel4.setBackground(Color.BLUE);
					BufferedImage imagebot1Panel4;
					if (listMap.get(typeList.get(3)).size() > 0) {
						if (cacuPip.size() < 500) {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(3)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(3)).get(0));
								cacuMap.put(listMap.get(typeList.get(3)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(3)).get(0))));
							}
						} else {
							if (!cacuMap.containsKey(
									listMap.get(typeList.get(3)).get(0))) {
								cacuPip.add(
										listMap.get(typeList.get(3)).get(0));
								String theFirst = cacuPip.get(0);
								cacuMap.remove(theFirst);
								cacuPip.remove(theFirst);
								cacuMap.put(listMap.get(typeList.get(3)).get(0),
										ImageIO.read(new File(listMap
												.get(typeList.get(3)).get(0))));
							}
						}
						imagebot1Panel4 = cacuMap
								.get(listMap.get(typeList.get(3)).get(0));
					} else {
						imagebot1Panel4 = bufferedImageNullPG;
					}
					// image format
					Image imgbot1Panel4 = imagebot1Panel4.getScaledInstance(300,
							165, java.awt.Image.SCALE_SMOOTH);
					ImageIcon iconbot1Panel4 = new ImageIcon();
					iconbot1Panel4.setImage(imgbot1Panel4);
					DetaButton buttonbot1Panel4 = new DetaButton(null);
					buttonbot1Panel4.setIcon(iconbot1Panel4);
					buttonbot1Panel4.addActionListener(e18 -> {
						try {
							flip = 3;
							flop = 0;
							BufferedImage bufferImage;
							if (listMap.get(typeList.get(3)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								}
								bufferImage = cacuMap.get(
										listMap.get(typeList.get(3)).get(0));
							} else {
								bufferImage = bufferedImageNullPG;
							}
							// BufferedImage bufferImage= ImageIO.read(new
							// File(listMap.get(typeList.get(3)).get(0)));
							Image imag = bufferImage.getScaledInstance(605, 365,
									Image.SCALE_SMOOTH);
							ImageIcon bufferIcon = new ImageIcon();
							bufferIcon.setImage(imag);
							leftPanel.button.setIcon(bufferIcon);
							leftPanel.removeAll();
							leftPanel.add(leftPanel.button);
							//
							if (listMap.get(typeList.get(3)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								}
								buttonTopLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(3)).get(0));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(3)).get(0)));
							} else {
								buttonTopLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag1 = buttonTopLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonTopLeftPanel.setIcon(bufferIcon1);
							topLeftPanel.removeAll();
							topLeftPanel.add(buttonTopLeftPanel);
							///
							if (listMap.get(typeList.get(3)).size() > 1) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(1));
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(1))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(1))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(1));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(1),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(1))));
									}
								}
								buttontopRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(3)).get(1));
								// buttontopRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(3)).get(1)));
							} else {
								buttontopRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag2 = buttontopRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttontopRightPanel.setIcon(bufferIcon2);
							topRightPanel.removeAll();
							topRightPanel.add(buttontopRightPanel);
							///
							if (listMap.get(typeList.get(3)).size() > 2) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(2));
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(2))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(2))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(2));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(2),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(2))));
									}
								}
								buttonbotLeftPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(3)).get(2));
								// buttonbotLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(3)).get(2)));
							} else {
								buttonbotLeftPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag3 = buttonbotLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbotLeftPanel.setIcon(bufferIcon3);
							botLeftPanel.removeAll();
							botLeftPanel.add(buttonbotLeftPanel);

							//
							if (listMap.get(typeList.get(3)).size() > 3) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(3));
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(3))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(3))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(3));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(3),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(3))));
									}
								}
								buttonbotRightPanel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(3)).get(3));
								// buttonbotRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(3)).get(3)));
							} else {
								buttonbotRightPanel.bufferedImage = bufferedImageNullPG;
							}
							Image imag4 = buttonbotRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbotRightPanel.setIcon(bufferIcon4);
							botRightPanel.removeAll();
							botRightPanel.add(buttonbotRightPanel);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});
					bot1Panel4.add(buttonbot1Panel4);
					buttom.add(bot1Panel4);
					// BUTTON
					// BUTTON
					// MOTION
					//
					topButton = new DetaButton("上↑", 100, 50, Color.pink);
					topButton.addActionListener(e19 -> {
						try {
							flop = flop - 1 < 0 ? 0 : flop - 1;
							if (listMap.get(typeList.get(flip)).size() < 1) {
								buttonTopLeftPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 0) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 0)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 0) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 0)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttonTopLeftPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 0)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag1 = buttonTopLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonTopLeftPanel.setIcon(bufferIcon1);
							topLeftPanel.removeAll();
							topLeftPanel.add(buttonTopLeftPanel);
							///
							if (listMap.get(typeList.get(flip)).size() < 2) {
								buttontopRightPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 1) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 1)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 1) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 1)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttontopRightPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttontopRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 1)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag2 = buttontopRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttontopRightPanel.setIcon(bufferIcon2);
							topRightPanel.removeAll();
							topRightPanel.add(buttontopRightPanel);
							///
							if (listMap.get(typeList.get(flip)).size() < 3) {
								buttonbotLeftPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 2) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 2)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 2) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 2)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttonbotLeftPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttonbotLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 2)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag3 = buttonbotLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbotLeftPanel.setIcon(bufferIcon3);
							botLeftPanel.removeAll();
							botLeftPanel.add(buttonbotLeftPanel);
							//
							if (listMap.get(typeList.get(flip)).size() < 4) {
								buttonbotRightPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 3) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 3)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 3) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 3)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttonbotRightPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttonbotRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 3)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag4 = buttonbotRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbotRightPanel.setIcon(bufferIcon4);
							botRightPanel.removeAll();
							botRightPanel.add(buttonbotRightPanel);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});
					DetaButton downButton = new DetaButton("下↓", 100, 50,
							Color.white);
					downButton.addActionListener(e110 -> {
						flop = flop + 1;
						try {
							if (listMap.get(typeList.get(flip)).size() < 1) {
								buttonTopLeftPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 0) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 0)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 0) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 0)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttonTopLeftPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 0) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttonTopLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 0)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag1 = buttonTopLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonTopLeftPanel.setIcon(bufferIcon1);
							topLeftPanel.removeAll();
							topLeftPanel.add(buttonTopLeftPanel);
							///
							if (listMap.get(typeList.get(flip)).size() < 2) {
								buttontopRightPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 1) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 1)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 1) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 1)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttontopRightPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 1) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttontopRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 1)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag2 = buttontopRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttontopRightPanel.setIcon(bufferIcon2);
							topRightPanel.removeAll();
							topRightPanel.add(buttontopRightPanel);
							///
							if (listMap.get(typeList.get(flip)).size() < 3) {
								buttonbotLeftPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 2) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 2)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 2) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 2)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttonbotLeftPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 2) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttonbotLeftPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 2)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag3 = buttonbotLeftPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbotLeftPanel.setIcon(bufferIcon3);
							botLeftPanel.removeAll();
							botLeftPanel.add(buttonbotLeftPanel);
							//
							if (listMap.get(typeList.get(flip)).size() < 4) {
								buttonbotRightPanel.bufferedImage = bufferedImageNullPG;
							} else {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 3) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()));
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 3)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(flip))
											.get((flop + 3) % listMap
													.get(typeList.get(flip))
													.size()))) {
										cacuPip.add(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(listMap
												.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()),
												ImageIO.read(new File(listMap
														.get(typeList.get(flip))
														.get((flop + 3)
																% listMap.get(
																		typeList.get(
																				flip))
																		.size()))));
									}
								}
								buttonbotRightPanel.bufferedImage = cacuMap
										.get(listMap.get(typeList.get(flip))
												.get((flop + 3) % listMap
														.get(typeList.get(flip))
														.size()));
								// buttonbotRightPanel.bufferedImage=
								// ImageIO.read(new
								// File(listMap.get(typeList.get(flip)).get((flop+
								// 3)%
								// listMap.get(typeList.get(flip)).size())));
							}
							Image imag4 = buttonbotRightPanel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbotRightPanel.setIcon(bufferIcon4);
							botRightPanel.removeAll();
							botRightPanel.add(buttonbotRightPanel);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});

					leftButton = new DetaButton("左←", 100, 50, Color.GREEN);
					leftButton.addActionListener(e111 -> {
						String string = typeList.get(0);
						for (int i = 0; i < typeList.size() - 1; i++) {
							typeList.set(i, typeList.get(i + 1));
						}
						typeList.set(typeList.size() - 1, string);
						try {
							if (listMap.get(typeList.get(0)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								}
								buttonbot1Panel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(0)).get(0));
							} else {
								buttonbot1Panel.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel.bufferedImage= ImageIO.read(new
							// File(listMap.get(typeList.get(0)).get(0)));
							Image imag1 = buttonbot1Panel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonbot1Panel.setIcon(bufferIcon1);
							bot1Panel.removeAll();
							bot1Panel.add(buttonbot1Panel);

							if (listMap.get(typeList.get(1)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								}
								buttonbot1Panel2.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(1)).get(0));
							} else {
								buttonbot1Panel2.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel2.bufferedImage=
							// cacuMap.get(listMap.get(typeList.get(1)).get(0));
							// buttonbot1Panel2.bufferedImage= ImageIO.read(new
							// File(listMap.get(typeList.get(1)).get(0)));
							Image imag2 = buttonbot1Panel2.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttonbot1Panel2.setIcon(bufferIcon2);
							bot1Panel2.removeAll();
							bot1Panel2.add(buttonbot1Panel2);

							if (listMap.get(typeList.get(2)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								}
								buttonbot1Panel3.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(2)).get(0));
							} else {
								buttonbot1Panel3.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel3.bufferedImage=
							// cacuMap.get(listMap.get(typeList.get(2)).get(0));
							Image imag3 = buttonbot1Panel3.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbot1Panel3.setIcon(bufferIcon3);
							bot1Panel3.removeAll();
							bot1Panel3.add(buttonbot1Panel3);

							if (listMap.get(typeList.get(3)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								}
								buttonbot1Panel4.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(3)).get(0));
							} else {
								buttonbot1Panel4.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel4.bufferedImage=
							// cacuMap.get(listMap.get(typeList.get(3)).get(0));
							// buttonbot1Panel4.bufferedImage= ImageIO.read(new
							// File(listMap.get(typeList.get(3)).get(0)));
							Image imag4 = buttonbot1Panel4.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbot1Panel4.setIcon(bufferIcon4);
							bot1Panel4.removeAll();
							bot1Panel4.add(buttonbot1Panel4);
						} catch (IOException e1) {
							e1.printStackTrace();
						}

					});

					DetaButton rightButton = new DetaButton("右→", 100, 50,
							Color.YELLOW);
					rightButton.addActionListener(e112 -> {
						String string = typeList.get(typeList.size() - 1);
						for (int i = typeList.size() - 1; i > 0; i--) {
							typeList.set(i, typeList.get(i - 1));
						}
						typeList.set(0, string);
						try {
							if (listMap.get(typeList.get(0)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(0)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(0))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(0))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(0))
														.get(0))));
									}
								}
								buttonbot1Panel.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(0)).get(0));
							} else {
								buttonbot1Panel.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel.bufferedImage=
							// cacuMap.get(listMap.get(typeList.get(0)).get(0));
							// buttonbot1Panel.bufferedImage= ImageIO.read(new
							// File(listMap.get(typeList.get(0)).get(0)));
							Image imag1 = buttonbot1Panel.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon1 = new ImageIcon();
							bufferIcon1.setImage(imag1);
							buttonbot1Panel.setIcon(bufferIcon1);
							bot1Panel.removeAll();
							bot1Panel.add(buttonbot1Panel);

							if (listMap.get(typeList.get(1)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(1)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(1))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(1))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(1))
														.get(0))));
									}
								}
								buttonbot1Panel2.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(1)).get(0));
							} else {
								buttonbot1Panel2.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel2.bufferedImage=
							// cacuMap.get(listMap.get(typeList.get(1)).get(0));
							// buttonbot1Panel2.bufferedImage= ImageIO.read(new
							// File(listMap.get(typeList.get(1)).get(0)));
							Image imag2 = buttonbot1Panel2.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon2 = new ImageIcon();
							bufferIcon2.setImage(imag2);
							buttonbot1Panel2.setIcon(bufferIcon2);
							bot1Panel2.removeAll();
							bot1Panel2.add(buttonbot1Panel2);

							if (listMap.get(typeList.get(2)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(2)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(2))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(2))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(2))
														.get(0))));
									}
								}
								buttonbot1Panel3.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(2)).get(0));
							} else {
								buttonbot1Panel3.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel3.bufferedImage=
							// cacuMap.get(listMap.get(typeList.get(2)).get(0));
							// buttonbot1Panel3.bufferedImage= ImageIO.read(new
							// File(listMap.get(typeList.get(2)).get(0)));
							Image imag3 = buttonbot1Panel3.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon3 = new ImageIcon();
							bufferIcon3.setImage(imag3);
							buttonbot1Panel3.setIcon(bufferIcon3);
							bot1Panel3.removeAll();
							bot1Panel3.add(buttonbot1Panel3);

							if (listMap.get(typeList.get(3)).size() > 0) {
								if (cacuPip.size() < 500) {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								} else {
									if (!cacuMap.containsKey(listMap
											.get(typeList.get(3)).get(0))) {
										cacuPip.add(listMap.get(typeList.get(3))
												.get(0));
										String theFirst = cacuPip.get(0);
										cacuMap.remove(theFirst);
										cacuPip.remove(theFirst);
										cacuMap.put(
												listMap.get(typeList.get(3))
														.get(0),
												ImageIO.read(new File(listMap
														.get(typeList.get(3))
														.get(0))));
									}
								}
								buttonbot1Panel4.bufferedImage = cacuMap.get(
										listMap.get(typeList.get(3)).get(0));
							} else {
								buttonbot1Panel4.bufferedImage = bufferedImageNullPG;
							}
							// buttonbot1Panel4.bufferedImage=
							// cacuMap.get(listMap.get(typeList.get(3)).get(0));
							// buttonbot1Panel4.bufferedImage= ImageIO.read(new
							// File(listMap.get(typeList.get(3)).get(0)));
							Image imag4 = buttonbot1Panel4.bufferedImage
									.getScaledInstance(292, 146,
											Image.SCALE_SMOOTH);
							ImageIcon bufferIcon4 = new ImageIcon();
							bufferIcon4.setImage(imag4);
							buttonbot1Panel4.setIcon(bufferIcon4);
							bot1Panel4.removeAll();
							bot1Panel4.add(buttonbot1Panel4);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					});
					topButton.setBounds(640, 365, x, 30);
					downButton.setBounds(640 + x + 5 + 3, 365, x, 30);
					leftButton.setBounds(640 + x + 5 + 3 + x + 5 + 2, 365, x,
							30);
					rightButton.setBounds(
							640 + x + 5 + 3 + x + 5 + 3 + x + 5 + 2, 365, x,
							30);
					//
					actionPanel.add(topButton);
					actionPanel.add(downButton);
					actionPanel.add(leftButton);
					actionPanel.add(rightButton);
					actionPanel.add(fileButton);// later
					jpanelFourth.add(actionPanel);
					jpanelFourth.add(buttom);
					buttom.updateUI();
					actionPanel.updateUI();
					jpanelFourth.update(jpanelFourth.getGraphics());
					jpanelFourth.validate();
					jTabbedpane.updateUI();
					jTabbedpane.validate();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			});

			int x = 117;
			fileButton.setBounds(
					640 + x + 5 + 3 + x + 5 + 3 + x + 5 + 3 + x + 5 + 2, 365, x,
					30);
			actionPanel.add(fileButton);
			jpanelFourth.add(actionPanel);
			jpanelFourth.add(buttom);
			jpanelFourth.setName("图片搜索");
			jTabbedpane.addTab("图片搜索", new ImageIcon(), jpanelFourth, "");//
			Color[] colors = new Color[3];
			colors[0] = new Color(253, 233, 254);
			colors[1] = new Color(233, 254, 234);
			colors[2] = new Color(255, 251, 232);
			int TabCount = jTabbedpane.getTabCount();
			jTabbedpane.setBackgroundAt(TabCount - 1, colors[TabCount % 3]);
			jTabbedpane.validate();
			// -----------------------------
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	public static void main(String[] argv) {
		App NE = new App();
		MakeContainerYXTP_X makeContainerYXTP = new MakeContainerYXTP_X(null,
				null, NE);
		makeContainerYXTP.run();// .start();
		JFrame jframe = new JFrame();
		jframe.setLayout(null);
		jframe.setLocation(200, 200);
		jframe.setSize(1300, 660);
		jframe.setResizable(true);

		jframe.add(makeContainerYXTP.jpanelFourth);
		jframe.setBackground(Color.BLUE);
		jframe.setVisible(true);
		jframe.validate();
	}
}