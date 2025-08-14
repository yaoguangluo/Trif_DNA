package OSI.OPE.gui;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OPE.OVU.MVQ.OVU.PQE.nodeView.CacuString;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
import ME.VPC.M.app.App;
import M_V.MVQ.filenameFilter.TXTFilter;
import OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer;
import OPE.MSI.OEI.SOI.SMQ.save.SaveAnd_U_File;
import OPE.MSI.OEI.SOI.SMQ.save.SaveAs_I_File;
import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
import S_A.SVQ.stable.S_Annotation;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.File_X_Load;
import OSI.OPE.OVU.PQE.flash.GUISample;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

@SuppressWarnings("deprecation")

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Sample_X_Register {
    public void Register(GUISample gUISample, App NE) {
        gUISample.load.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings({S_Annotation.TAG_STATIC_ACCESS})
            public void actionPerformed(ActionEvent e) {
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
                    FileDialog filedialog = new FileDialog(new Frame()
                        , S_Annotation.ATTENSION_LOAD_HISTORY
                        , FileDialog.LOAD);
                    filedialog.setFilenameFilter(new TXTFilter
                        (S_Annotation.FILE_FORMAT_ETL));
                    filedialog.setVisible(true);
                    gUISample.fileCurrentpath = filedialog.getDirectory()
                        + filedialog.getFile();
                    //20230106-System.out.println(gUISample.fileCurrentpath);
                    if (null == gUISample.fileCurrentpath
                        || gUISample.fileCurrentpath.isEmpty()
                        || !gUISample.fileCurrentpath.contains
                        (S_Annotation.FILE_FORMAT_ETL)) {
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
                    gUISample.canvas.repaint();
                    gUISample.first.first = File_X_Load._E(gUISample.first.first
                        , gUISample.nodeView, file, gUISample.first, NE);
                } catch (Exception loadE) {
                    loadE.printStackTrace();
                }
                gUISample.canvas.repaint();
                gUISample.righttopScrollPane.validate();
            }
        });
        gUISample.save.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings({S_Annotation.TAG_STATIC_ACCESS})
            public void actionPerformed(ActionEvent e) {
                if (null == gUISample.fileCurrentpath) {
                    //20230106-System.out.println(S_Annotation.ATTENSION_UNCURRENT_CHOICE);
                    return;
                }
                javax.swing.JOptionPane jOptionPane
                    = new JOptionPane(S_Annotation.ATTENSION_UPDATE_ENSURE
                    + gUISample.fileCurrentpath + S_Annotation.MARK_QUESTION);
                int confirm = jOptionPane.showConfirmDialog(gUISample.canvas
                    , S_Annotation.ATTENSION_UPDATE_ENSURE
                        + gUISample.fileCurrentpath + S_Annotation.MARK_QUESTION);
                if (0 != confirm) {
                    gUISample.rightBotJTextPane.setText
                        (S_Annotation.ATTENSION_CANCELLED_OPERATION);
                    gUISample.rightBotJTextPane.validate();
                    return;
                }
                SaveAnd_U_File.U_(gUISample.fileCurrentpath, gUISample.first.first);
            }
        });

        gUISample.saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SaveAs_I_File.Save(gUISample.first.first);
            }
        });

        gUISample.osgis.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings({"static-access"})
            public void actionPerformed(ActionEvent e) {
                String jarCategoryLink = "";
                FileDialog filedialog = new FileDialog(new Frame()
                    , S_Annotation.ATTENSION_LOAD_HISTORY, FileDialog.LOAD);
                filedialog.setFilenameFilter(new TXTFilter(S_Annotation.FILE_FORMAT_ETL));
                filedialog.setVisible(true);
                jarCategoryLink = filedialog.getDirectory();
                ////20230106-System.out.println(jarCategoryLink);
                if (null == jarCategoryLink || jarCategoryLink.isEmpty()
                    || jarCategoryLink.contains(S_Annotation.FILE_FORMAT_JAR)) {
                    //20230106-System.out.println(S_Annotation.ATTENSION_RECHOICE);
                    return;
                }
                File file = new File(jarCategoryLink);
                if (file.isFile()) {
                    //20230106-System.out.println(S_Annotation.ATTENSION_FILE_CHOICE);
                    return;
                }
                File[] files = file.listFiles();
                Here:
                for (int i = 0; i < files.length; i++) {
                    gUISample.rightBotJTextPane.validate();
                    gUISample.getContentPane().validate();
                    URLClassLoader loader = null;
                    try {
                        loader = new URLClassLoader(new URL[]{files[i].toURL()});
                    } catch (MalformedURLException e2) {
                        e2.printStackTrace();
                    }
                    String filename = files[i].getName().replace(S_Annotation
                        .FILE_FORMAT_JAR, S_Annotation.STRING_EMPTY);
                    if (!filename.contains("OSI.OSU.")) {
                        continue Here;
                    }
                    //如下注释2行代码
                    //refer https://www.cnblogs.com/chinaxin/p/3678442.html
                    //这小伙子以后有前途。哈哈
                    //Class<?> myclass= loader.loadClass
                    //("hand.java.loadjar.TestClass");
                    //Gene new object
                    //Object myobject= myclass.newInstance();
                    Class<?> myclass = null;
                    //因为按照标准格式函数命名, 因此做了首字母的大写变换
                    //, 准备调试下.罗瑶光
                    String[] filenameSplit = filename.split("\\.");
                    String lastName = filenameSplit[filenameSplit.length - 1];
                    String FirstCharOfLastName = ("" + lastName.charAt(0)).toUpperCase();
                    String NewlastName = FirstCharOfLastName + lastName.subSequence(1
                        , lastName.length());
                    //20230106-System.out.println(filename);
                    //   数组                尾组
                    //                     首字母                    大写
                    //filename= (""+ filename.split("\\.")[filename.split("\\.")
                    //.length- 1].charAt(0)).toUpperCase();
                    ////20230106-System.out.println(filename.replace(filename.split(".")
                    //.length, newChar)filename.split(".").length);
                    try {
                        String className = filename + "." + NewlastName
                            + S_Annotation.NODE_NODE_INTERFACE;
                        //20230106-System.out.println(className);
                        myclass = loader.loadClass(className);
                    } catch (ClassNotFoundException e1) {
                        ////增加小写识别一次, 兼容老的插件。之后我会统一进行修改
                        ////罗瑶光20210514
                        //FirstCharOfLastName= (""+ lastName.charAt(0));
                        //NewlastName= FirstCharOfLastName
                        //+ lastName.subSequence(1, lastName.length());
                        ////20230106-System.out.println(filename);
                        //String className= filename+ "."+ NewlastName
                        //		+ S_Data.NODE_NODE_INTERFACE;
                        ////20230106-System.out.println(className);
                        //try {myclass= loader.loadClass(className);
                        //} catch (ClassNotFoundException e2) {
                        //	e2.printStackTrace();}
                        e1.printStackTrace();
                    }
                    Object myobject = null;
                    try {
                        myobject = myclass.newInstance();
                    } catch (InstantiationException e1) {
                        e1.printStackTrace();
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    }
                    OSU_MCI_MCU_MSI _OSU_MCI_MCU_MSI = (OSU_MCI_MCU_MSI) myobject;
                    if (gUISample.nodeReflection.containsKey(_OSU_MCI_MCU_MSI
                        ._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
                        gUISample.rightBotJTextPane.setText("请勿重复添加, 节点已存在"
                            + System.currentTimeMillis());
                        continue Here;
                        //return;
                    }
                    gUISample.nodeReflection.put(_OSU_MCI_MCU_MSI
                        ._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
                    _OSU_MCI_MCU_MSI.register(gUISample.tableData_old, gUISample.text, NE);
                    //search register need add the information
                    if (_OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
                        .contains("添加") && _OSU_MCI_MCU_MSI
                        ._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("页")) {
                        gUISample.u.searchList.add(_OSU_MCI_MCU_MSI);
                        //memory increment
                    }
                    //searchList
                    //
                    _OSU_MCI_MCU_MSI.IMP_PSU(NE);
                    gUISample.rightBotJTextPane.setText("节点:"
                        + _OSU_MCI_MCU_MSI._SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
                        + "已经更新成功" + System.currentTimeMillis()
                        + "\r\n" + gUISample.rightBotJTextPane.getText());
                    gUISample.rightBotJTextPane.validate();
                    gUISample.thread.sleepDeta(100);
                    gUISample.nodeView.first = gUISample.nodeView.link.addNode(gUISample
                        .nodeView.first, _OSU_MCI_MCU_MSI);
                }
                gUISample.nodeView.U_Tree();
                gUISample.getContentPane().validate();
            }
        });

        gUISample.boot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BootNeroCell.bootCell(gUISample.first.first, gUISample.rightBotJTextPane
                    , gUISample.canvas, NE);
                gUISample.rightBotJTextPane.setText(S_Annotation.NODE_EXEC_SUCCESS);
                gUISample.rightBotJTextPane.validate();
            }
        });
        gUISample.bootETL.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings(S_Annotation.TAG_STATIC_ACCESS)
            public void actionPerformed(ActionEvent e) {
                try {
                    javax.swing.JOptionPane jOptionPane
                        = new JOptionPane(S_Annotation.ATTENSION_LOAD_ENSURE);
                    int confirm = jOptionPane.showConfirmDialog(gUISample.canvas
                        , S_Annotation.ATTENSION_LOAD_ENSURE);
                    if (0 != confirm) {
                        gUISample.rightBotJTextPane.setText(S_Annotation
                            .ATTENSION_CANCELLED_OPERATION);
                        gUISample.rightBotJTextPane.validate();
                        return;
                    }
                    FileDialog filedialog = new FileDialog(new Frame()
                        , S_Annotation.ATTENSION_LOAD_HISTORY, FileDialog.LOAD);
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
                        gUISample.first.first = gUISample.first.deletNode(gUISample
                                .first.first, needDeleteNode.name, needDeleteNode.ID
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
        //delete
        gUISample.delete.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings(S_Annotation.TAG_STATIC_ACCESS)
            public void actionPerformed(ActionEvent e) {
                try {
                    javax.swing.JOptionPane jOptionPane = new JOptionPane(S_Annotation
                        .ATTENSION_CANCEL_ENSURE);
                    int confirm = jOptionPane.showConfirmDialog(gUISample.canvas
                        , S_Annotation.ATTENSION_CANCEL_ENSURE);
                    if (0 != confirm) {
                        gUISample.rightBotJTextPane.setText(S_Annotation
                            .ATTENSION_CANCELLED_OPERATION);
                        gUISample.rightBotJTextPane.validate();
                        return;
                    }
                    LinkNode node = gUISample.first.first;
                    while (node != null) {
                        gUISample.first.first = gUISample.first.deletNode(gUISample
                            .first.first, node.name, node.ID, node.primaryKey);
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
        gUISample.leftSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {
                    //action code
                    gUISample.nodeProject.width = gUISample.leftSplitPane.getWidth();
                    gUISample.nodeProject.height = gUISample.leftSplitPane
                        .getDividerLocation();
                    gUISample.nodeProject.setBounds(0, 0, gUISample.leftSplitPane
                        .getWidth(), gUISample.leftSplitPane.getDividerLocation());
                    gUISample.nodeProject.validate();
                }
            }
        });
        gUISample.mainSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {
                    //action code
                    gUISample.nodeProject.width = gUISample.mainSplitPane
                        .getDividerLocation();
                    gUISample.nodeProject.height = gUISample.leftSplitPane
                        .getDividerLocation();
                    gUISample.nodeProject.setBounds(0, 0, gUISample.mainSplitPane
                        .getDividerLocation(), gUISample.leftSplitPane
                        .getDividerLocation());
                    gUISample.nodeProject.validate();
                }
            }
        });

        gUISample.righttopScrollPane.addComponentListener(new ComponentListener() {
            public void componentHidden(ComponentEvent arg0) {
            }

            public void componentMoved(ComponentEvent arg0) {
            }

            public void componentResized(ComponentEvent arg0) {
                gUISample.righttopScrollPane.validate();
            }

            public void componentShown(ComponentEvent arg0) {
            }
        });

        gUISample.getContentPane().addComponentListener(new ComponentListener() {
            public void componentHidden(ComponentEvent arg0) {
            }

            public void componentMoved(ComponentEvent arg0) {
            }

            public void componentResized(ComponentEvent arg0) {
                gUISample.w = gUISample.getContentPane().getWidth();
                gUISample.h = gUISample.getContentPane().getHeight();
                gUISample.mainSplitPane.setBounds(10, 50
                    , gUISample.w - 20, gUISample.h - 80);
                gUISample.mainSplitPane.setDividerLocation(0.11);
                gUISample.leftSplitPane.setDividerLocation(0.25);
                gUISample.rightSplitPane.setDividerLocation(0.85);
                gUISample.righttopSplitPane.setDividerLocation(0.9);
                gUISample.nodeProject.width
                    = gUISample.mainSplitPane.getDividerLocation();
                gUISample.nodeProject.height
                    = gUISample.leftSplitPane.getDividerLocation();
                gUISample.nodeProject.setBounds(0, 0
                    , gUISample.mainSplitPane.getDividerLocation()
                    , gUISample.leftSplitPane.getDividerLocation());
                gUISample.nodeProject.validate();
                gUISample.mainSplitPane.validate();
                //20230106-System.out.println(gUISample.w + "<>" + gUISample.h);
            }

            public void componentShown(ComponentEvent arg0) {
            }
        });
        gUISample.addMouseListener(gUISample);
        gUISample.addMouseMotionListener(gUISample);
        gUISample.nodeProject.addMouseListener(gUISample);
        gUISample.nodeView.addMouseListener(gUISample);
        gUISample.nodeView.tree.addMouseListener(gUISample);
        gUISample.nodeView.tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent evt) {
                DefaultMutableTreeNode note
                    = (DefaultMutableTreeNode) gUISample.nodeView.tree
                    .getLastSelectedPathComponent();
                String tr = null;
                if (note != null) {
                    tr = new CacuString().cauString(note.toString());
                }
                if (tr != null) {
                    gUISample.treeNodeName = new String(tr);
                    gUISample.rightBotJTextPane.setText("jieDianMing："
                        + gUISample.treeNodeName);
                    gUISample.rightBotJTextPane.validate();
                }
            }
        });
        gUISample.menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (gUISample.treeNodeName != null) {
                    gUISample.first.first = gUISample.first.addNode(gUISample.first.first
                        , gUISample.treeNodeName, 100, 50, gUISample.nodeView.first, NE);
                    gUISample.righttopScrollPane.validate();
                    gUISample.rightBotJTextPane.setText("jieDianMing："
                        + "gUISample.treeNodeName");
                    gUISample.rightBotJTextPane.validate();
                }
            }
        });
        gUISample.configre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LinkNode node = new LinkNode();
                gUISample.first.first = Sort.sort(gUISample.first.first);
                node = gUISample.first.first;
                while (node != null) {
                    if (node.name.equals(gUISample.canvas.currentNodeName)
                        && node.ID == gUISample.canvas.currentNodeID
                        && node.primaryKey.equals
                        (gUISample.canvas.currentNodePrimaryKey)) {
                        node.thisFace.MEI_MSU(gUISample.rightBotJTextPane
                            , gUISample.canvas);
                        node.thisFace._SQ__AOU_AOQ_VES.setLocation(node.x, node.y);
                        node.thisFace._SQ__AOU_AOQ_VES.setSize(500, 500);
                        node.thisFace._SQ__AOU_AOQ_VES.setResizable(true);
                        node.thisFace._SQ__AOU_AOQ_VES.scrollPane.setBounds(0, 0
                            , node.thisFace._SQ__AOU_AOQ_VES.getWidth() - 10
                            , node.thisFace._SQ__AOU_AOQ_VES.getHeight() - 45);
                        node.thisFace._SQ__AOU_AOQ_VES.panel.setPreferredSize(
                            new Dimension(800, 600));
                        node.thisFace._SQ__AOU_AOQ_VES.setBackground(Color.BLUE);
                        node.thisFace._SQ__AOU_AOQ_VES.setVisible(true);
                        node.thisFace._SQ__AOU_AOQ_VES.validate();
                        new OSGI_chansfer(node, gUISample.first.first);
                        //加primaryKEY标识
                        node.thisFace.primaryInterfaceKeyID = node.primaryKey.toString();
                    }
                    node = node.next;
                }
                gUISample.rightBotJTextPane.setText(S_Annotation.NODE_UPDATE_SUCCESS);
                gUISample.rightBotJTextPane.validate();
            }
        });
        gUISample.run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LinkNode node = new LinkNode();
                gUISample.first.first = Sort.sort(gUISample.first.first);
                node = gUISample.first.first;
                while (node != null) {
                    if (node.name.equals(gUISample.canvas.currentNodeName) && node.ID
                        == gUISample.canvas.currentNodeID && node.primaryKey
                        .equals(gUISample.canvas.currentNodePrimaryKey)) {
                        //加primaryKEY标识
                        node.thisFace.primaryInterfaceKeyID = node.primaryKey.toString();
                        node.thisFace.OPE_E(gUISample.rightBotJTextPane, NE);//稍后hook 进行 异常修整 20230218
                    }
                    node = node.next;
                }
                gUISample.rightBotJTextPane.setText(S_Annotation.NODE_EXEC_SUCCESS);
                gUISample.rightBotJTextPane.validate();
            }
        });
        gUISample.show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LinkNode node = new LinkNode();
                gUISample.first.first = Sort.sort(gUISample.first.first);
                node = gUISample.first.first;
                while (node != null) {
                    if (node.name.equals(gUISample.canvas.currentNodeName) && node.ID
                        == gUISample.canvas.currentNodeID && node.primaryKey
                        .equals(gUISample.canvas.currentNodePrimaryKey)) {
                        if (!node.thisFace.showed) {
                            try {
                                node.thisFace.AVQ_ASQ_OVQ_OSQ_VSQ(gUISample.rightBotJTextPane, NE);
                                node.thisFace._SQ__OVQ_OSQ_VSQ.setLocation(node.x, node.y);
                                node.thisFace._SQ__OVQ_OSQ_VSQ.setSize(500, 500);
                                node.thisFace._SQ__OVQ_OSQ_VSQ.setResizable(true);
                                node.thisFace._SQ__OVQ_OSQ_VSQ.scrollPane.setBounds(0, 0
                                    , node.thisFace._SQ__AOU_AOQ_VES.getWidth() - 10
                                    , node.thisFace._SQ__AOU_AOQ_VES.getHeight() - 45);
                                node.thisFace._SQ__OVQ_OSQ_VSQ.panel.setPreferredSize(
                                    new Dimension(800, 600));
                                node.thisFace._SQ__OVQ_OSQ_VSQ.setVisible(true);
                                node.thisFace._SQ__OVQ_OSQ_VSQ.validate();
                            } catch (Exception e1) {
                                //e1.printStackTrace();
                                gUISample.rightBotJTextPane.setText(S_Annotation
                                    .NODE_INSPECT_ERROR);
                                gUISample.rightBotJTextPane.validate();
                            }
                        } else {
                            node.thisFace._SQ__OVQ_OSQ_VSQ.setVisible(true);
                        }
                    }
                    node = node.next;
                }
                gUISample.rightBotJTextPane.setText
                    (S_Annotation.NODE_INDICATE_SUCCESS);
                gUISample.rightBotJTextPane.validate();
            }
        });
        gUISample.dNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LinkNode node = new LinkNode();
                gUISample.first.first = Sort.sort(gUISample.first.first);
                node = gUISample.first.first;
                while (node != null) {
                    if (node.name.equals(gUISample.canvas.currentNodeName)
                        && node.ID == gUISample.canvas.currentNodeID
                        && node.primaryKey.equalsIgnoreCase
                        (gUISample.canvas.currentNodePrimaryKey)) {
                        gUISample.first.first = gUISample.first.deletNode(gUISample.first
                            .first, node.name, node.ID, node.primaryKey);
                        gUISample.updateRelatedLine.doUpdateRelatedLine
                            (gUISample.first.first, gUISample.canvas.currentNodeName
                                , gUISample.canvas.currentNodeID
                                , gUISample.canvas.currentNodePrimaryKey);
                    }
                    node = node.next;
                }
                gUISample.canvas.repaint();
            }
        });
        gUISample.dLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LinkNode node = new LinkNode();
                gUISample.first.first = Sort.sort(gUISample.first.first);
                node = gUISample.first.first;
                while (node != null) {
                    if (node.beconnect && node.name.equals(gUISample.canvas.currentNodeName)
                        && node.ID == gUISample.canvas.currentNodeID && node.primaryKey
                        .equals(gUISample.canvas.currentNodePrimaryKey)) {
                        node.beconnect = false;
                        node.tBeconnect = false;
                        node.mBeconnect = false;
                        node.dBeconnect = false;
                    }
                    node = node.next;
                }
                gUISample.canvas.repaint();
            }
        });
    }
}

