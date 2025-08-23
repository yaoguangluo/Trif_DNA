package OSI.OPE.gui;

import OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OPE.OEQ.MCQ.OVU.PQE.osgi.NodeOSGI;
import OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;
import ME.VPC.utils.DetaBuy;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.filenameFilter.TXTFilter;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.File_X_Load;
import OPE.MSI.OEI.SOI.SMQ.save.SaveAnd_U_File;
import OPE.MSI.OEI.SOI.SMQ.save.SaveAs_I_File;
import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
import S_A.SVQ.stable.S_Annotation;
import OSI.OPE.OVU.PQE.flash.GUISample;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Sample_X_I_Map {
	@SuppressWarnings("deprecation")
	public void CreatMap(App NE) {
		NE.app_S.gUISample.w = 1446 - 130;
		NE.app_S.gUISample.h = 820 - 110 - 70;
		NE.app_S.gUISample.updateRelatedLine = new U_RelatedLineVPS();
		NE.app_S.gUISample.getContentPane().setLayout(null);
		System.out.println("启动400编码调试开始-00000055-001-02-01");
		UIManager.put("SplitPaneUI",
				"OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornSplitPaneUI");
		UIManager.put("ScrollBarUI",
				"OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");
		UIManager.put("TreeUI", "OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeUI");
		System.out.println("启动400编码调试开始-00000055-001-02-02");
		NE.app_S.gUISample.currentNodeName = new String("");
		NE.app_S.gUISample.first = new LinkList();
		System.out.println("启动400编码调试开始-00000055-001-02-03");
		NE.app_S.gUISample.popupMenu = new PopupMenu();
		NE.app_S.gUISample.menuItem = new MenuItem();
		NE.app_S.gUISample.menuItem.setLabel("add");
		NE.app_S.gUISample.popupMenu.add(NE.app_S.gUISample.menuItem);
		System.out.println("启动400编码调试开始-00000055-001-02-04");
		NE.app_S.gUISample.nodeInfo = new NodeInfo();
		System.out.println("启动400编码调试开始-00000055-001-02-04-01");
		NE.app_S.gUISample.nodeView = new NodeShow(NE.app_S.gUISample,
				NE.app_S.gUISample.tableData_old, NE.app_S.gUISample.text,
				NE.app_S.gUISample.popupMenu, NE);
		System.out.println("启动400编码调试开始-00000055-001-02-04-02");
		NE.app_S.gUISample.nodeView.tree.setBackground(Color.white);
		NE.app_S.gUISample.nodeView.setBounds(10, 168, 137, 222);
		NE.app_S.gUISample.nodeProject = new NodeProject();
		NE.app_S.gUISample.nodeProject.setBounds(10, 38, 137, 124);
		NE.app_S.gUISample.mainSplitPane = new UnicornJSplitPane();
		NE.app_S.gUISample.mainSplitPane.setAutoscrolls(true);
		// mainSplitPane.setEnabled(false);//
		System.out.println("启动400编码调试开始-00000055-001-02-05");
		NE.app_S.gUISample.mainSplitPane.setBounds(10, 50,
				NE.app_S.gUISample.w - 20, NE.app_S.gUISample.h - 80);
		NE.app_S.gUISample.mainSplitPane.setVisible(true);
		NE.app_S.gUISample.getContentPane()
				.add(NE.app_S.gUISample.mainSplitPane);
		NE.app_S.gUISample.leftSplitPane = new UnicornJSplitPane();
		NE.app_S.gUISample.leftSplitPane
				.setOrientation(JSplitPane.VERTICAL_SPLIT);
		NE.app_S.gUISample.mainSplitPane
				.setLeftComponent(NE.app_S.gUISample.leftSplitPane);
		NE.app_S.gUISample.leftSplitPane
				.setLeftComponent(NE.app_S.gUISample.nodeProject);
		NE.app_S.gUISample.leftSplitPane
				.setRightComponent(NE.app_S.gUISample.nodeView);
		NE.app_S.gUISample.rightSplitPane = new UnicornJSplitPane();
		NE.app_S.gUISample.rightSplitPane
				.setOrientation(JSplitPane.VERTICAL_SPLIT);
		NE.app_S.gUISample.mainSplitPane
				.setRightComponent(NE.app_S.gUISample.rightSplitPane);
		NE.app_S.gUISample.righttopSplitPane = new UnicornJSplitPane();
		NE.app_S.gUISample.rightSplitPane
				.setLeftComponent(NE.app_S.gUISample.righttopSplitPane);
		NE.app_S.gUISample.rightBotJTextPane = new JTextPane();
		NE.app_S.gUISample.rightBotJTextPane.setText("你好, 亲~");
		System.out.println("启动400编码调试开始-00000055-001-02-06");
		NE.app_S.gUISample.nodeMenu = new PopupMenu();
		NE.app_S.gUISample.canvas = new ThisCanvas(
				NE.app_S.gUISample.threadApplet, NE.app_S.gUISample.first,
				NE.app_S.gUISample.nodeView, NE.app_S.gUISample.nodeMenu,
				NE.app_S.gUISample.rightBotJTextPane);
		NE.app_S.gUISample.canvas.setPreferredSize(new Dimension(1500, 1000));
		NE.app_S.gUISample.canvas.setEnabled(true);
		NE.app_S.gUISample.righttopScrollPane = new JScrollPane();
		NE.app_S.gUISample.righttopScrollPane
				.setViewportView(NE.app_S.gUISample.canvas);
		NE.app_S.gUISample.righttopSplitPane
				.setLeftComponent(NE.app_S.gUISample.righttopScrollPane);
		NE.app_S.gUISample.rightrightScrollPane = new JScrollPane();
		NE.app_S.gUISample.righttopSplitPane
				.setRightComponent(NE.app_S.gUISample.nodeInfo);
		NE.app_S.gUISample.rightdownScrollPane = new JScrollPane(
				NE.app_S.gUISample.rightBotJTextPane);
		NE.app_S.gUISample.rightSplitPane
				.setRightComponent(NE.app_S.gUISample.rightdownScrollPane);
		System.out.println("启动400编码调试开始-00000055-001-02-07");
		NE.app_S.gUISample.configre = new MenuItem();
		NE.app_S.gUISample.configre.setLabel("配置");
		NE.app_S.gUISample.run = new MenuItem();
		NE.app_S.gUISample.run.setLabel("运行");
		NE.app_S.gUISample.show = new MenuItem();
		NE.app_S.gUISample.show.setLabel("显示");
		NE.app_S.gUISample.dNode = new MenuItem();
		NE.app_S.gUISample.dNode.setLabel("删除该节");
		NE.app_S.gUISample.dLine = new MenuItem();
		NE.app_S.gUISample.dLine.setLabel("删除链接");
		NE.app_S.gUISample.nodeMenu.add(NE.app_S.gUISample.configre);
		NE.app_S.gUISample.nodeMenu.add(NE.app_S.gUISample.run);
		NE.app_S.gUISample.nodeMenu.add(NE.app_S.gUISample.show);
		NE.app_S.gUISample.nodeMenu.add(NE.app_S.gUISample.dNode);
		NE.app_S.gUISample.nodeMenu.add(NE.app_S.gUISample.dLine);
		NE.app_S.gUISample.getContentPane().add(NE.app_S.gUISample.popupMenu);
		NE.app_S.gUISample.getContentPane().add(NE.app_S.gUISample.nodeMenu);
		NE.app_S.gUISample.engineMenu = new PopupMenu();
		NE.app_S.gUISample.load = new MenuItem();
		NE.app_S.gUISample.load.setLabel(S_Annotation.CONFIG_LOAD);
		NE.app_S.gUISample.save = new MenuItem();
		NE.app_S.gUISample.save.setLabel(S_Annotation.CONFIG_UPDATE);
		NE.app_S.gUISample.saveAs = new MenuItem();
		NE.app_S.gUISample.saveAs.setLabel(S_Annotation.CONFIG_SAVE);
		NE.app_S.gUISample.delete = new MenuItem();
		NE.app_S.gUISample.delete.setLabel(S_Annotation.CONFIG_DELETE);
		NE.app_S.gUISample.boot = new MenuItem();
		NE.app_S.gUISample.boot.setLabel(S_Annotation.CONFIG_BOOT);
		NE.app_S.gUISample.bootETL = new MenuItem();
		NE.app_S.gUISample.bootETL.setLabel(S_Annotation.CONFIG_BOOT_ETL);
		NE.app_S.gUISample.osgis = new MenuItem();
		NE.app_S.gUISample.osgis.setLabel(S_Annotation.CONFIG_OSGIS);
		System.out.println("启动400编码调试开始-00000055-001-02-08");
		NE.app_S.gUISample.engineMenu.add(NE.app_S.gUISample.load);
		NE.app_S.gUISample.engineMenu.add(NE.app_S.gUISample.save);
		NE.app_S.gUISample.engineMenu.add(NE.app_S.gUISample.saveAs);
		NE.app_S.gUISample.engineMenu.add(NE.app_S.gUISample.delete);
		NE.app_S.gUISample.engineMenu.add(NE.app_S.gUISample.boot);
		NE.app_S.gUISample.engineMenu.add(NE.app_S.gUISample.bootETL);
		NE.app_S.gUISample.engineMenu.add(NE.app_S.gUISample.osgis);
		System.out.println("启动400编码调试开始-00000055-001-02-09");
		NE.app_S.gUISample.getContentPane().add(NE.app_S.gUISample.engineMenu);
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		DetaButton loadButton = new DetaButton("导入文档");
		loadButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		loadButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane = new JOptionPane(
							S_Annotation.ATTENSION_LOAD_ENSURE);
					int confirm = jOptionPane.showConfirmDialog(
							NE.app_S.gUISample.canvas,
							S_Annotation.ATTENSION_LOAD_ENSURE);
					if (0 != confirm) {
						NE.app_S.gUISample.rightBotJTextPane.setText(
								S_Annotation.ATTENSION_CANCELLED_OPERATION);
						NE.app_S.gUISample.rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog = new FileDialog(new Frame(),
							S_Annotation.ATTENSION_LOAD_HISTORY,
							FileDialog.LOAD);
					filedialog.setFilenameFilter(
							new TXTFilter(S_Annotation.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					NE.app_S.gUISample.fileCurrentpath = filedialog
							.getDirectory() + filedialog.getFile();
					// 20230106-System.out.println(NE.app_S.gUISample.fileCurrentpath);
					if (null == NE.app_S.gUISample.fileCurrentpath
							|| NE.app_S.gUISample.fileCurrentpath.isEmpty()
							|| !NE.app_S.gUISample.fileCurrentpath
									.contains(S_Annotation.FILE_FORMAT_ETL)) {
						// 20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
						return;
					}
					File file = new File(NE.app_S.gUISample.fileCurrentpath);
					if (!file.isFile()) {
						// 20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode = NE.app_S.gUISample.first.first;
					while (needDeleteNode != null) {
						NE.app_S.gUISample.first.first = NE.app_S.gUISample.first
								.deletNode(NE.app_S.gUISample.first.first,
										needDeleteNode.name, needDeleteNode.ID,
										needDeleteNode.primaryKey);
						if (null == needDeleteNode.next) {
							break;
						}
						needDeleteNode = needDeleteNode.next;
					}
					NE.app_S.gUISample.canvas.repaint(); // 稍后hook 进行 异常修整
														 // 20230218
					NE.app_S.gUISample.first.first = File_X_Load._E(
							NE.app_S.gUISample.first.first,
							NE.app_S.gUISample.nodeView, file,
							NE.app_S.gUISample.first, NE);
				} catch (Exception loadE) {
					loadE.printStackTrace();
				}
				NE.app_S.gUISample.canvas.repaint();
				NE.app_S.gUISample.righttopScrollPane.validate();
			}
		});
		buttonBox.add(loadButton);
		//
		System.out.println("启动400编码调试开始-00000055-001-02-10");
		DetaButton saveButton = new DetaButton("保存文档");
		saveButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SaveAs_I_File.Save(NE.app_S.gUISample.first.first);
			}
		});
		buttonBox.add(saveButton);
		DetaButton runButton = new DetaButton("更新执行");
		runButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		runButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane = new JOptionPane(
							S_Annotation.ATTENSION_LOAD_ENSURE);
					int confirm = jOptionPane.showConfirmDialog(
							NE.app_S.gUISample.canvas,
							S_Annotation.ATTENSION_LOAD_ENSURE);
					if (0 != confirm) {
						NE.app_S.gUISample.rightBotJTextPane.setText(
								S_Annotation.ATTENSION_CANCELLED_OPERATION);
						NE.app_S.gUISample.rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog = new FileDialog(new Frame(),
							S_Annotation.ATTENSION_LOAD_HISTORY,
							FileDialog.LOAD);
					filedialog.setFilenameFilter(
							new TXTFilter(S_Annotation.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					NE.app_S.gUISample.fileCurrentpath = filedialog
							.getDirectory() + filedialog.getFile();
					System.out.println(NE.app_S.gUISample.fileCurrentpath);
					if (null == NE.app_S.gUISample.fileCurrentpath
							|| NE.app_S.gUISample.fileCurrentpath.isEmpty()
							|| !NE.app_S.gUISample.fileCurrentpath
									.contains(S_Annotation.FILE_FORMAT_ETL)) {
						System.out.println(S_Annotation.ATTENSION_RECHOICE);
						return;
					}
					File file = new File(NE.app_S.gUISample.fileCurrentpath);
					if (!file.isFile()) {
						System.out.println(S_Annotation.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode = NE.app_S.gUISample.first.first;
					while (needDeleteNode != null) {
						NE.app_S.gUISample.first.first = NE.app_S.gUISample.first
								.deletNode(NE.app_S.gUISample.first.first,
										needDeleteNode.name, needDeleteNode.ID,
										needDeleteNode.primaryKey);
						if (null == needDeleteNode.next) {
							break;
						}
						needDeleteNode = needDeleteNode.next;
					}
					NE.app_S.gUISample.canvas.repaint();
					NE.app_S.gUISample.first.first = File_X_Load._E(
							NE.app_S.gUISample.first.first,
							NE.app_S.gUISample.nodeView, file,
							NE.app_S.gUISample.first, NE);
				} catch (Exception loadE) {
					loadE.printStackTrace();
				}
				NE.app_S.gUISample.canvas.repaint();
				NE.app_S.gUISample.righttopScrollPane.validate();
				BootNeroCell.bootCell(NE.app_S.gUISample.first.first,
						NE.app_S.gUISample.rightBotJTextPane,
						NE.app_S.gUISample.canvas, NE);
				NE.app_S.gUISample.rightBotJTextPane
						.setText(S_Annotation.NODE_EXEC_SUCCESS);
				NE.app_S.gUISample.rightBotJTextPane.validate();
			}
		});
		System.out.println("启动400编码调试开始-00000055-001-02-11");
		buttonBox.add(runButton);
		DetaButton updateButton = new DetaButton("更新文档");
		updateButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		updateButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (null == NE.app_S.gUISample.fileCurrentpath) {
					// 20230106-System.out.println(S_Annotation.ATTENSION_UNCURRENT_CHOICE);
					return;
				}
				javax.swing.JOptionPane jOptionPane = new JOptionPane(
						S_Annotation.ATTENSION_UPDATE_ENSURE
								+ NE.app_S.gUISample.fileCurrentpath
								+ S_Annotation.MARK_QUESTION);
				int confirm = jOptionPane.showConfirmDialog(
						NE.app_S.gUISample.canvas,
						S_Annotation.ATTENSION_UPDATE_ENSURE
								+ NE.app_S.gUISample.fileCurrentpath
								+ S_Annotation.MARK_QUESTION);
				if (0 != confirm) {
					NE.app_S.gUISample.rightBotJTextPane.setText(
							S_Annotation.ATTENSION_CANCELLED_OPERATION);
					NE.app_S.gUISample.rightBotJTextPane.validate();
					return;
				}
				SaveAnd_U_File.U_(NE.app_S.gUISample.fileCurrentpath,
						NE.app_S.gUISample.first.first);
			}
		});
		buttonBox.add(updateButton);
		//
		DetaButton deleteButton = new DetaButton("删除文档");
		deleteButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		deleteButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane = new JOptionPane(
							S_Annotation.ATTENSION_CANCEL_ENSURE);
					int confirm = jOptionPane.showConfirmDialog(
							NE.app_S.gUISample.canvas,
							S_Annotation.ATTENSION_CANCEL_ENSURE);
					if (0 != confirm) {
						NE.app_S.gUISample.rightBotJTextPane.setText(
								S_Annotation.ATTENSION_CANCELLED_OPERATION);
						NE.app_S.gUISample.rightBotJTextPane.validate();
						return;
					}
					LinkNode node = NE.app_S.gUISample.first.first;
					while (node != null) {
						NE.app_S.gUISample.first.first = NE.app_S.gUISample.first
								.deletNode(NE.app_S.gUISample.first.first,
										node.name, node.ID, node.primaryKey);
						if (null == node.next) {
							break;
						}
						node = node.next;
					}
					node = node.next;
					NE.app_S.gUISample.canvas.repaint();
				} catch (Exception E) {
					NE.app_S.gUISample.canvas.repaint();
				}
				NE.app_S.gUISample.rightBotJTextPane
						.setText(S_Annotation.ATTENSION_DELETE);
				NE.app_S.gUISample.rightBotJTextPane.validate();
			}
		});
		buttonBox.add(deleteButton);
		//
		DetaButton addButton = new DetaButton("添加插件");
		addButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Sample_X_I_MapAddPlugin._E(NE.app_S.gUISample, NE);
			}
		});
		buttonBox.add(addButton);
		//
		DetaButton execButton = new DetaButton("一键执行");
		execButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		execButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				BootNeroCell.bootCell(NE.app_S.gUISample.first.first,
						NE.app_S.gUISample.rightBotJTextPane,
						NE.app_S.gUISample.canvas, NE);
				NE.app_S.gUISample.rightBotJTextPane
						.setText(S_Annotation.NODE_EXEC_SUCCESS);
				NE.app_S.gUISample.rightBotJTextPane.validate();
			}
		});
		buttonBox.add(execButton);
		//
		DetaButton execButton1 = new DetaButton("记忆键一");
		execButton1.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		execButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		buttonBox.add(execButton1);
		//
		DetaButton execButton2 = new DetaButton("记忆键二");
		execButton2.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		execButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		buttonBox.add(execButton2);
		//
		DetaButton execButton3 = new DetaButton("记忆键三");
		execButton3.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		execButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		buttonBox.add(execButton3);
		//
		DetaButton execButton6 = new DetaButton("卸载节点");
		execButton6.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		execButton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 确认是否卸载
				javax.swing.JOptionPane jOptionPane = new JOptionPane(
						"确认是否卸载？");
				@SuppressWarnings("static-access")
				int confirm = jOptionPane
						.showConfirmDialog(NE.app_S.gUISample.canvas, "确认卸载吗？");
				if (0 != confirm) {
					NE.app_S.gUISample.rightBotJTextPane.setText(
							S_Annotation.ATTENSION_CANCELLED_OPERATION);
					NE.app_S.gUISample.rightBotJTextPane.validate();
					return;
				}
				// 卸载
				// NE.app_S.gUISample.first.first
				NodeOSGI linkNode = NE.app_S.gUISample.nodeView.first;
				while (linkNode.next != null) {// daodi
					linkNode = linkNode.next;
				}
				Here: while (linkNode != null) {// benshen
					if (NE.app_S.gUISample.nodeReflection.containsKey(
							linkNode._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
						NE.app_S.gUISample.nodeReflection.remove(
								linkNode._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
						if (linkNode.pre != null) {
							linkNode = linkNode.pre;
							if (linkNode.next.next != null) {
								linkNode.next = linkNode.next.next;
							} else {
								linkNode.next = null;
							}
						} else if (linkNode.next != null) {
							linkNode = linkNode.next;
							linkNode.pre = null;
						}
						continue Here;
					}
					if (linkNode.pre == null) {
						break;
					}
					linkNode = linkNode.pre;
				}
				NE.app_S.gUISample.nodeView.first = linkNode;
				NE.app_S.gUISample.nodeView.U_Tree();
				NE.app_S.gUISample.rightBotJTextPane.setText("卸载成功!");
				NE.app_S.gUISample.rightBotJTextPane.validate();
			}
		});
		buttonBox.add(execButton6);
		//
		DetaButton execButton7 = new DetaButton("购买节点");
		execButton7.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		execButton7.addActionListener(new ActionListener() {
			DetaBuy detaBuy;
			JFrame jFrame;

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (null == jFrame) {
					detaBuy = new DetaBuy();
					detaBuy.IV_(null);
					detaBuy.setBounds(0, 0, 785, 655);
					detaBuy.setVisible(true);
					detaBuy.show();
					jFrame = new JFrame("购买信息 V1.0.0");
					// frame.setLayout(null);
					jFrame.setSize(780, 650);
					jFrame.setLocation(300, 300);
					jFrame.setResizable(false);
					jFrame.add(detaBuy);
					jFrame.setVisible(true);
					jFrame.show();
					jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				} else {
					jFrame.setVisible(true);
					jFrame.show();
				}
			}
		});
		buttonBox.add(execButton7);

		//
		DetaButton execButton8 = new DetaButton("配置面板");
		execButton8.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
		execButton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				NE.app_S.gUISample.engineMenu.show(NE.app_S.gUISample.canvas, 0,
						0);
			}
		});
		buttonBox.add(execButton8);
		buttonBox.setBounds(10, 0, 1400, 50);
		NE.app_S.gUISample.getContentPane().add(buttonBox);
		NE.app_S.gUISample.getContentPane().setVisible(true);
	}
}

//397
//
//		DetaButton execButton4= new DetaButton("记忆键四");
//		execButton4.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
//		execButton4.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//
//			}
//		});
//		buttonBox.add(execButton4);

//
//		DetaButton execButton5= new DetaButton("记忆键五");
//		execButton5.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
//		execButton5.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//
//			}
//		});
//		buttonBox.add(execButton5);
