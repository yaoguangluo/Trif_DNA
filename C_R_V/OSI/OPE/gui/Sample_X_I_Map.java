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
    public void CreatMap(GUISample gUISample, App NE) {
        gUISample.w = 1446 - 130;
        gUISample.h = 820 - 110 - 70;
        gUISample.updateRelatedLine = new U_RelatedLineVPS();
        gUISample.getContentPane().setLayout(null);
        UIManager.put("SplitPaneUI"
                , "OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornSplitPaneUI");
        UIManager.put("ScrollBarUI"
                , "OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");
        UIManager.put("TreeUI", "OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeUI");
        gUISample.currentNodeName = new String("");
        gUISample.first = new LinkList();

        gUISample.popupMenu = new PopupMenu();
        gUISample.menuItem = new MenuItem();
        gUISample.menuItem.setLabel("add");
        gUISample.popupMenu.add(gUISample.menuItem);

        gUISample.nodeInfo = new NodeInfo();
        gUISample.nodeView = new NodeShow(gUISample, gUISample.tableData_old
                , gUISample.text, gUISample.popupMenu, NE);
        gUISample.nodeView.tree.setBackground(Color.white);
        gUISample.nodeView.setBounds(10, 168, 137, 222);
        gUISample.nodeProject = new NodeProject();
        gUISample.nodeProject.setBounds(10, 38, 137, 124);
        gUISample.mainSplitPane = new UnicornJSplitPane();
        gUISample.mainSplitPane.setAutoscrolls(true);
        //mainSplitPane.setEnabled(false);//
        gUISample.mainSplitPane.setBounds(10, 50, gUISample.w - 20, gUISample.h - 80);
        gUISample.mainSplitPane.setVisible(true);
        gUISample.getContentPane().add(gUISample.mainSplitPane);
        gUISample.leftSplitPane = new UnicornJSplitPane();
        gUISample.leftSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        gUISample.mainSplitPane.setLeftComponent(gUISample.leftSplitPane);
        gUISample.leftSplitPane.setLeftComponent(gUISample.nodeProject);
        gUISample.leftSplitPane.setRightComponent(gUISample.nodeView);
        gUISample.rightSplitPane = new UnicornJSplitPane();
        gUISample.rightSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        gUISample.mainSplitPane.setRightComponent(gUISample.rightSplitPane);
        gUISample.righttopSplitPane = new UnicornJSplitPane();
        gUISample.rightSplitPane.setLeftComponent(gUISample.righttopSplitPane);
        gUISample.rightBotJTextPane = new JTextPane();
        gUISample.rightBotJTextPane.setText("你好, 亲~");
        gUISample.nodeMenu = new PopupMenu();
        gUISample.canvas = new ThisCanvas(gUISample.threadApplet, gUISample.first
                , gUISample.nodeView, gUISample.nodeMenu, gUISample.rightBotJTextPane);
        gUISample.canvas.setPreferredSize(new Dimension(1500, 1000));
        gUISample.canvas.setEnabled(true);
        gUISample.righttopScrollPane = new JScrollPane();
        gUISample.righttopScrollPane.setViewportView(gUISample.canvas);
        gUISample.righttopSplitPane.setLeftComponent(gUISample.righttopScrollPane);
        gUISample.rightrightScrollPane = new JScrollPane();
        gUISample.righttopSplitPane.setRightComponent(gUISample.nodeInfo);
        gUISample.rightdownScrollPane = new JScrollPane(gUISample.rightBotJTextPane);
        gUISample.rightSplitPane.setRightComponent(gUISample.rightdownScrollPane);

        gUISample.configre = new MenuItem();
        gUISample.configre.setLabel("配置");
        gUISample.run = new MenuItem();
        gUISample.run.setLabel("运行");
        gUISample.show = new MenuItem();
        gUISample.show.setLabel("显示");
        gUISample.dNode = new MenuItem();
        gUISample.dNode.setLabel("删除该节");
        gUISample.dLine = new MenuItem();
        gUISample.dLine.setLabel("删除链接");
        gUISample.nodeMenu.add(gUISample.configre);
        gUISample.nodeMenu.add(gUISample.run);
        gUISample.nodeMenu.add(gUISample.show);
        gUISample.nodeMenu.add(gUISample.dNode);
        gUISample.nodeMenu.add(gUISample.dLine);
        gUISample.getContentPane().add(gUISample.popupMenu);
        gUISample.getContentPane().add(gUISample.nodeMenu);
        gUISample.engineMenu = new PopupMenu();
        gUISample.load = new MenuItem();
        gUISample.load.setLabel(S_Annotation.CONFIG_LOAD);
        gUISample.save = new MenuItem();
        gUISample.save.setLabel(S_Annotation.CONFIG_UPDATE);
        gUISample.saveAs = new MenuItem();
        gUISample.saveAs.setLabel(S_Annotation.CONFIG_SAVE);
        gUISample.delete = new MenuItem();
        gUISample.delete.setLabel(S_Annotation.CONFIG_DELETE);
        gUISample.boot = new MenuItem();
        gUISample.boot.setLabel(S_Annotation.CONFIG_BOOT);
        gUISample.bootETL = new MenuItem();
        gUISample.bootETL.setLabel(S_Annotation.CONFIG_BOOT_ETL);
        gUISample.osgis = new MenuItem();
        gUISample.osgis.setLabel(S_Annotation.CONFIG_OSGIS);

        gUISample.engineMenu.add(gUISample.load);
        gUISample.engineMenu.add(gUISample.save);
        gUISample.engineMenu.add(gUISample.saveAs);
        gUISample.engineMenu.add(gUISample.delete);
        gUISample.engineMenu.add(gUISample.boot);
        gUISample.engineMenu.add(gUISample.bootETL);
        gUISample.engineMenu.add(gUISample.osgis);

        gUISample.getContentPane().add(gUISample.engineMenu);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        DetaButton loadButton = new DetaButton("导入文档");
        loadButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
        loadButton.addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    javax.swing.JOptionPane jOptionPane
                            = new JOptionPane(S_Annotation.ATTENSION_LOAD_ENSURE);
                    int confirm = jOptionPane.showConfirmDialog(gUISample.canvas
                            , S_Annotation.ATTENSION_LOAD_ENSURE);
                    if (0 != confirm) {
                        gUISample.rightBotJTextPane.setText
                                (S_Annotation.ATTENSION_CANCELLED_OPERATION);
                        gUISample.rightBotJTextPane.validate();
                        return;
                    }
                    FileDialog filedialog = new FileDialog(new Frame(), S_Annotation
                        .ATTENSION_LOAD_HISTORY, FileDialog.LOAD);
                    filedialog.setFilenameFilter(new TXTFilter(S_Annotation
                        .FILE_FORMAT_ETL));
                    filedialog.setVisible(true);
                    gUISample.fileCurrentpath = filedialog.getDirectory()
                            + filedialog.getFile();
                    //20230106-System.out.println(gUISample.fileCurrentpath);
                    if (null == gUISample.fileCurrentpath || gUISample.fileCurrentpath
                        .isEmpty() || !gUISample.fileCurrentpath.contains(S_Annotation
                        .FILE_FORMAT_ETL)) {
                        //20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
                        return;
                    }
                    File file = new File(gUISample.fileCurrentpath);
                    if (!file.isFile()) {
                        //20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
                        return;
                    }
                    LinkNode needDeleteNode = gUISample.first.first;
                    while (needDeleteNode != null) {
                        gUISample.first.first = gUISample.first.deletNode(gUISample.first
                                .first, needDeleteNode.name, needDeleteNode.ID
                                        , needDeleteNode.primaryKey);
                        if (null == needDeleteNode.next) {
                            break;
                        }
                        needDeleteNode = needDeleteNode.next;
                    }
                    gUISample.canvas.repaint();    //稍后hook 进行 异常修整 20230218
                    gUISample.first.first = File_X_Load._E(gUISample.first.first
                            , gUISample.nodeView, file, gUISample.first, NE);
                } catch (Exception loadE) {
                    loadE.printStackTrace();
                }
                gUISample.canvas.repaint();
                gUISample.righttopScrollPane.validate();
            }
        });
        buttonBox.add(loadButton);
        //
        DetaButton saveButton = new DetaButton("保存文档");
        saveButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                SaveAs_I_File.Save(gUISample.first.first);
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
                    javax.swing.JOptionPane jOptionPane = new JOptionPane(S_Annotation
                        .ATTENSION_LOAD_ENSURE);
                    int confirm = jOptionPane.showConfirmDialog(gUISample.canvas
                            , S_Annotation.ATTENSION_LOAD_ENSURE);
                    if (0 != confirm) {
                        gUISample.rightBotJTextPane.setText(S_Annotation
                            .ATTENSION_CANCELLED_OPERATION);
                        gUISample.rightBotJTextPane.validate();
                        return;
                    }
                    FileDialog filedialog = new FileDialog(new Frame(), S_Annotation
                        .ATTENSION_LOAD_HISTORY, FileDialog.LOAD);
                    filedialog.setFilenameFilter(new TXTFilter(S_Annotation
                        .FILE_FORMAT_ETL));
                    filedialog.setVisible(true);
                    gUISample.fileCurrentpath = filedialog.getDirectory()
                        + filedialog.getFile();
                    System.out.println(gUISample.fileCurrentpath);
                    if (null == gUISample.fileCurrentpath || gUISample.fileCurrentpath
                        .isEmpty() || !gUISample.fileCurrentpath.contains(S_Annotation
                        .FILE_FORMAT_ETL)) {
                        System.out.println(S_Annotation.ATTENSION_RECHOICE);
                        return;
                    }
                    File file = new File(gUISample.fileCurrentpath);
                    if (!file.isFile()) {
                        System.out.println(S_Annotation.ATTENSION_RECHOICE);
                        return;
                    }
                    LinkNode needDeleteNode = gUISample.first.first;
                    while (needDeleteNode != null) {
                        gUISample.first.first = gUISample.first.deletNode(gUISample.first
                                .first, needDeleteNode.name, needDeleteNode.ID
                            , needDeleteNode.primaryKey);
                        if (null == needDeleteNode.next) {
                            break;
                        }
                        needDeleteNode = needDeleteNode.next;
                    }
                    gUISample.canvas.repaint();
                    gUISample.first.first = File_X_Load._E(gUISample.first.first
                            , gUISample.nodeView, file, gUISample.first, NE);
                } catch (Exception loadE) {
                    loadE.printStackTrace();
                }
                gUISample.canvas.repaint();
                gUISample.righttopScrollPane.validate();
                BootNeroCell.bootCell(gUISample.first.first, gUISample.rightBotJTextPane
                    , gUISample.canvas, NE);
                gUISample.rightBotJTextPane.setText(S_Annotation.NODE_EXEC_SUCCESS);
                gUISample.rightBotJTextPane.validate();
            }
        });
        buttonBox.add(runButton);
        DetaButton updateButton = new DetaButton("更新文档");
        updateButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
        updateButton.addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (null == gUISample.fileCurrentpath) {
                    //20230106-System.out.println(S_Annotation.ATTENSION_UNCURRENT_CHOICE);
                    return;
                }
                javax.swing.JOptionPane jOptionPane = new JOptionPane(S_Annotation
                    .ATTENSION_UPDATE_ENSURE + gUISample.fileCurrentpath + S_Annotation
                    .MARK_QUESTION);
                int confirm = jOptionPane.showConfirmDialog(gUISample.canvas
                        , S_Annotation.ATTENSION_UPDATE_ENSURE + gUISample
                        .fileCurrentpath + S_Annotation.MARK_QUESTION);
                if (0 != confirm) {
                    gUISample.rightBotJTextPane.setText(S_Annotation
                        .ATTENSION_CANCELLED_OPERATION);
                    gUISample.rightBotJTextPane.validate();
                    return;
                }
                SaveAnd_U_File.U_(gUISample.fileCurrentpath, gUISample.first.first);
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
                    javax.swing.JOptionPane jOptionPane
                            = new JOptionPane(S_Annotation.ATTENSION_CANCEL_ENSURE);
                    int confirm = jOptionPane.showConfirmDialog(gUISample.canvas
                            , S_Annotation.ATTENSION_CANCEL_ENSURE);
                    if (0 != confirm) {
                        gUISample.rightBotJTextPane.setText
                                (S_Annotation.ATTENSION_CANCELLED_OPERATION);
                        gUISample.rightBotJTextPane.validate();
                        return;
                    }
                    LinkNode node = gUISample.first.first;
                    while (node != null) {
                        gUISample.first.first = gUISample.first.deletNode(gUISample.first
                                .first, node.name, node.ID, node.primaryKey);
                        if (null == node.next) {
                            break;
                        }
                        node = node.next;
                    }
                    node = node.next;
                    gUISample.canvas.repaint();
                } catch (Exception E) {
                    gUISample.canvas.repaint();
                }
                gUISample.rightBotJTextPane.setText(S_Annotation.ATTENSION_DELETE);
                gUISample.rightBotJTextPane.validate();
            }
        });
        buttonBox.add(deleteButton);
        //
        DetaButton addButton = new DetaButton("添加插件");
        addButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Sample_X_I_MapAddPlugin._E(gUISample, NE);
            }
        });
        buttonBox.add(addButton);
        //
        DetaButton execButton = new DetaButton("一键执行");
        execButton.setBounds(5 + 105 + 105 + 105 + 105, 3, 100, 20);
        execButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                BootNeroCell.bootCell(gUISample.first.first, gUISample.rightBotJTextPane
                    , gUISample.canvas, NE);
                gUISample.rightBotJTextPane.setText(S_Annotation.NODE_EXEC_SUCCESS);
                gUISample.rightBotJTextPane.validate();
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
                //确认是否卸载
                javax.swing.JOptionPane jOptionPane = new JOptionPane("确认是否卸载？");
                @SuppressWarnings("static-access")
                int confirm = jOptionPane.showConfirmDialog
                        (gUISample.canvas, "确认卸载吗？");
                if (0 != confirm) {
                    gUISample.rightBotJTextPane.setText
                            (S_Annotation.ATTENSION_CANCELLED_OPERATION);
                    gUISample.rightBotJTextPane.validate();
                    return;
                }
                //卸载
                //gUISample.first.first
                NodeOSGI linkNode = gUISample.nodeView.first;
                while (linkNode.next != null) {//daodi
                    linkNode = linkNode.next;
                }
                Here:
                while (linkNode != null) {//benshen
                    if (gUISample.nodeReflection.containsKey
                            (linkNode._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
                        gUISample.nodeReflection.remove
                                (linkNode._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
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
                gUISample.nodeView.first = linkNode;
                gUISample.nodeView.U_Tree();
                gUISample.rightBotJTextPane.setText("卸载成功!");
                gUISample.rightBotJTextPane.validate();
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
                    //frame.setLayout(null);
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
                gUISample.engineMenu.show(gUISample.canvas, 0, 0);
            }
        });
        buttonBox.add(execButton8);
        buttonBox.setBounds(10, 0, 1400, 50);
        gUISample.getContentPane().add(buttonBox);
        gUISample.getContentPane().setVisible(true);
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
