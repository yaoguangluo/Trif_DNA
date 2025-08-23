package ME.VPC.V.config;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.SectionJPanel_X_S;
import M_V.MPI.xls.commonXLS.CommonXls;
import M_V.MPI.xls.commonXLS.MakeContainerXLS;
import M_V.MVQ.slider.DetaSlider;
import O_V.OSA.shell.XA_ShellTables;
import S_A.SVQ.stable.S_HTTP;
import S_A.pheromone.IMV_SIQ;
import dnn.GetDNNMap;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class SectionJPanel extends SectionJPanel_X_S {

    /**
     * 作者罗瑶光
     */
    public Map<String, Boolean> pagehookJCheckBoxMap = new IMV_SIQ();
    //
    //App NE;

    @SuppressWarnings("rawtypes")
    public SectionJPanel(App app) {
        NE = app;
        appInThisClass = app;
        jlabel_box = new JCheckBox[30];
        this.setLayout(null);
        this.setBounds(0, 0, 800, 600);
        this.setBackground(Color.BLACK);

        JLabel webLabel = new JLabel("Web控制接口" + ":");
        webLabel.setForeground(Color.red);
        webLabel.setBounds(10 + 0 * 130, 20 + 25 * 0 + 120, 100, 25);
        this.add(webLabel);


        JLabel pagesLabel = new JLabel("添加临时页选项" + ":");
        pagesLabel.setForeground(Color.yellow);
        pagesLabel.setBounds(10 + 130 * 2, 20 + 25 * 0 + 120, 150, 25);
        this.add(pagesLabel);

        newPages = new JComboBox();
        newPages.setBounds(10 + 130 * 2, 20 + 25 * 1 + 120, 200 + 45, 20);
        newPages.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent arg0) {
                Component[] components = app.app_S.jTabbedpane.getComponents();
                for (int i = 0; i < components.length; i++) {
                    Component component = components[i];
                    String pageNameString = component.getName();
                    if (pageNameString.contains("临时")) {
                        if (newPages.getSelectedItem() != null) {
                            String target = newPages.getSelectedItem().toString();
                            if (app.app_S.tempPages.containsKey(target)) {
                                Object componentTemp = app.app_S.tempPages.get(target);
                                //if is xls
                                CommonXls commonXls = (CommonXls) componentTemp;
                                //app.app_S.jTabbedpane.remove(commonXls);
                                //app.app_S.jTabbedpane.addTab(commonXls.getName(), new ImageIcon()
                                //, commonXls, commonXls.getName());//
                                //app.app_S.jTabbedpane.setSelectedComponent(commonXls);
                                //pagehookJCheckBoxMap.put(commonXls.getName(), true);//
                                if (pagehookJCheckBoxMap.containsKey(commonXls.getName())) {
                                    pagehookJCheckBox.setSelected(pagehookJCheckBoxMap.get(commonXls.getName()));
                                } else {
                                    pagehookJCheckBoxMap.put(commonXls.getName(), false);
                                    pagehookJCheckBox.setSelected(false);
                                }
                                //.setSelectedIndex(i);
                                app.app_S.jTabbedpane.updateUI();
                            }
                        }
                    }
                }
            }
        });
        this.add(newPages);

        JLabel xlsWithSpecLabel = new JLabel("是否有表头" + ":");
        xlsWithSpecLabel.setForeground(Color.ORANGE);
        xlsWithSpecLabel.setBounds(10 + 130 * 5 - 50, 20 + 25 * 2 + 8 + 120, 300, 50);
        xlsWithSpec = new JCheckBox();
        xlsWithSpec.setBounds(10 + 130 * 5 + 30, 20 + 25 * 3 + 120, 20, 20);
        xlsWithSpec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (xlsWithSpec.isSelected()) {
                    xlsWithSpec.setSelected(true);
                } else {
                    xlsWithSpec.setSelected(false);
                }
            }
        });
        this.add(xlsWithSpecLabel);
        this.add(xlsWithSpec);

        M_V.MVQ.button.DetaButton addxls_button = new M_V.MVQ.button.DetaButton("添加XLS:");
        addxls_button.setBounds(10 + 130 * 2, 20 + 25 * 3 + 120, 100, 30);
        addxls_button.addActionListener(e -> {
            try {
                if (null == app.app_S._A) {
                    return;
                }//later normalization
                MakeContainerXLS makeContainerXLS = new MakeContainerXLS(app.app_S._A, app.app_S
                    , app.app_S.jTabbedpane, app.app_S.tabNames, app.app_S.fMHMMListOneTime_E_X_S.posCnToCn
                    , app.app_S.fMHMMListOneTime_E_X_S.posEnToEn, app.app_S.fMHMMListOneTime_E_X_S.enToCn
                    , app.app_S.fMHMMListOneTime_E_X_S.fullCnToEn, "xls"
                    , app.app_S.emotionSample, app.app_S.ratioMap_E, app.app_S.sensingTest, NE
                );
                makeContainerXLS.start();
                NE.app_S.makeContainerXLSList.add(makeContainerXLS);

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        this.add(addxls_button);

        M_V.MVQ.button.DetaButton deletexlsx_button = new M_V.MVQ.button.DetaButton("剔除XLS:");
        deletexlsx_button.setBounds(10 + 130 * 3 - 20, 20 + 25 * 3 + 120, 100, 30);
        deletexlsx_button.addActionListener(e -> {
            if (null == app.app_S._A) {
                return;
            }
            Component[] components = newPages.getComponents();
            for (int i = 0; i < components.length; i++) {
                if (components[i].toString().contains("XLS")) {
                    newPages.remove(components[i]);
                }
            }
            NE.app_S.makeContainerXLSList.clear();
            NE.app_S.tempPages.clear();
            pagehookJCheckBoxMap.clear();
            NE.app_S.appConfig.SectionJPanel.newPages.removeAllItems();
            boolean hasEmptyTemp = false;
            Component[] jTabbedpaneComponents = NE.app_S.jTabbedpane.getComponents();
            for (int i = 0; i < jTabbedpaneComponents.length; i++) {
                String name = jTabbedpaneComponents[i].getName();
                if (name.contains("XLS")) {
                    XA_ShellTables.searchShellTables.remove(name.replace("临时", ""));
                    app.app_S.jTabbedpane.remove(jTabbedpaneComponents[i]);
                    if (pagehookJCheckBoxMap.containsKey(name)) {
                        pagehookJCheckBoxMap.remove(name);//
                    }
                }
            }
            NE.app_S.appConfig.SectionJPanel.updateUI();
            NE.app_S.jTabbedpane.updateUI();
        });
        this.add(deletexlsx_button);

        M_V.MVQ.button.DetaButton deletexls_button = new M_V.MVQ.button.DetaButton("导出XLS:");
        deletexls_button.setBounds(10 + 130 * 4 - 40, 20 + 25 * 3 + 120, 100, 30);
        deletexls_button.addActionListener(e -> {
            FileDialog filedialog = new FileDialog(new Frame(), "Export Path:", FileDialog.LOAD);
            filedialog.setVisible(true);
            String filepath = filedialog.getDirectory();//+ filedialog.getFile();
            System.out.println(filepath);
            try {
                String fileType = ".xlsx";
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        this.add(deletexls_button);
        JLabel pagehook = new JLabel("页面展示" + ":");//用于tab页面是否展示
        pagehook.setForeground(Color.ORANGE);
        pagehook.setBounds(10 + 130 * 5 - 50 - 80, 20 + 25 * 0 + 8 + 120, 300, 50);
        pagehookJCheckBox = new JCheckBox();
        pagehookJCheckBox.setBounds(10 + 130 * 5 + 30 - 90, 20 + 25 * 1 + 120, 20, 20);
        //加表获取newPages表名 targetPage
        //查看tab是否有表，有就不加
        //没有就查看表app.app_S.tempPages 是否有缓存，有就取来加。
        //取出来就加入tab加载页面
        //刷新 validate
        pagehookJCheckBox.addActionListener(arg0 -> {
            String targetPage = newPages.getSelectedItem().toString();
            if (pagehookJCheckBox.isSelected()) {
                pagehookJCheckBox.setSelected(true);
                Iterator<String> iterators = app.app_S.tempPages.keySet().iterator();
                while (iterators.hasNext()) {
                    String tempPage = iterators.next();
                    if (tempPage.contains("临时")) {
                        if (targetPage.equalsIgnoreCase(tempPage)) {//准备加载
                            if (newPages.getSelectedItem() != null) {
                                if (pagehookJCheckBoxMap.containsKey(tempPage)) {
                                    if (pagehookJCheckBoxMap.get(tempPage)) {//true
                                        return;
                                    }
                                } else {
                                    pagehookJCheckBoxMap.put(tempPage, true);//nofind init
                                    return;//函数加表流程是一定加入模式，所以不要再loop这里tab
                                }
                                //if
                                Object componentTemp = app.app_S.tempPages.get(tempPage);
                                //if(Object is commonXLS)
                                CommonXls component = (CommonXls) componentTemp;
                                //之后还有写继承type类 使用mysql，db2等几百种类型
                                //以后这里是多种结构，不仅仅是xls 所以这个jtablepane太上层，搞名堂。
                                // component下层函数不提供
                                //导致我还要把这个函数做成专门加xls的。
                                //app.app_S.jTabbedpane.addTab(tempPage, new ImageIcon()
                                //, component, tempPage);
                                //因为java awt的 component到object 层是隐藏，所以在object和
                                //新类之间变换会class invalid，我又还改不了
                                //改不了又看不到函数结构，用已有函数 就像彩票中奖一样，于是从最重的高级类开始。vpcs价值就出来
                                //依赖删除仅仅，资源还在，sleeper替换了而已。
                                //Container container= new Container();
                                MakeContainerXLS makeContainerTemp = new MakeContainerXLS(component
                                    , app.app_S._A, app.app_S, app.app_S.jTabbedpane
                                    , app.app_S.tabNames, app.app_S.fMHMMListOneTime_E_X_S.posCnToCn
                                    , app.app_S.fMHMMListOneTime_E_X_S.posEnToEn
                                    , app.app_S.fMHMMListOneTime_E_X_S.enToCn
                                    , app.app_S.fMHMMListOneTime_E_X_S.fullCnToEn
                                    , "xls", app.app_S.emotionSample
                                    , app.app_S.ratioMap_E, app.app_S.sensingTest, NE);
                                makeContainerTemp.start();
                                pagehookJCheckBoxMap.put(targetPage, true);//
                                validate();
                                //app.app_S.jTabbedpane.updateUI();
                                app.app_S.jTabbedpane.validate();
                                app.validate();
                            }
                        }
                    }
                }
            } else {
                pagehookJCheckBox.setSelected(false);
                pagehookJCheckBoxMap.put(targetPage, false);
                //类不规范，老子的问题。不断的更新内容，导致原来单一函数在依赖上没有形成单例模版。
                Component[] components = app.app_S.jTabbedpane.getComponents();
                for (int i = 0; i < components.length; i++) {
                    Component component = components[i];
                    String pageNameString = component.getName();
                    if (pageNameString.contains("临时")) {
                        if (newPages.getSelectedItem() != null) {
                            if (targetPage.equalsIgnoreCase(component.getName())) {
                                if (app.app_S.tempPages.containsKey(component.getName())) {
                                    if (!pagehookJCheckBoxMap.containsKey(component.getName())) {
                                        pagehookJCheckBoxMap.put(component.getName(), false);
                                        return;
                                    }
                                    pagehookJCheckBoxMap.put(component.getName(), false);
                                    //if(Object is commonXLS)
                                    //CommonXls commonXls = (CommonXls) component;
                                    //app.app_S.tempPages.put(commonXls.getName(), commonXls);
                                    app.app_S.jTabbedpane.remove(component);//remove 后之前操作 就没了。所以先put下。
                                    deleteVPCS_sleeperXLS(targetPage);//去依赖
                                    app.app_S.jTabbedpane.updateUI();
                                    app.app_S.jTabbedpane.validate();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        });
        this.add(pagehook);
        this.add(pagehookJCheckBox);
        //


        JLabel qian_duan_jie_kou = new JLabel("前端接口" + ":");
        qian_duan_jie_kou.setForeground(Color.white);
        qian_duan_jie_kou.setBounds(10 + 0 * 130, 20 + 25 * 1 + 120, 150, 25);
        JTextField qian_duan_jie_kouJTextField = new JTextField();
        qian_duan_jie_kouJTextField.setBounds(10 + 0 * 130 + 120, 20 + 25 * 1 + 120, 50, 25);
        qian_duan_jie_kouJTextField.addActionListener(arg0
            -> appInThisClass.app_S.frontendTxt = qian_duan_jie_kouJTextField.getText().trim());
        qian_duan_jie_kouJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.frontendTxt = qian_duan_jie_kouJTextField.getText().trim();
            }
        });
        qian_duan_jie_kouJTextField.setText(S_HTTP.PORT_FRONTEND);
        if (appInThisClass != null) {
            if (appInThisClass.app_S != null) {
                appInThisClass.app_S.frontendTxt = S_HTTP.PORT_FRONTEND;
            } else {
                return;
            }
        } else {
            return;
        }
        this.add(qian_duan_jie_kou);
        this.add(qian_duan_jie_kouJTextField);

        JLabel hou_duan_jie_kou = new JLabel("hou_duan_jie_kou" + ":");
        hou_duan_jie_kou.setForeground(Color.white);
        hou_duan_jie_kou.setBounds(10 + 0 * 130, 20 + 25 * 2 + 120, 150, 25);
        JTextField hou_duan_jie_kouJTextField = new JTextField();
        hou_duan_jie_kouJTextField.setBounds(10 + 0 * 130 + 120, 20 + 25 * 2 + 120, 50, 25);
        hou_duan_jie_kouJTextField.addActionListener(arg0
            -> appInThisClass.app_S.backendTxt = hou_duan_jie_kouJTextField.getText().trim());
        hou_duan_jie_kouJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.backendTxt = hou_duan_jie_kouJTextField.getText().trim();
            }
        });
        hou_duan_jie_kouJTextField.setText(S_HTTP.PORT_BACKEND);
        appInThisClass.app_S.backendTxt = S_HTTP.PORT_BACKEND;
        this.add(hou_duan_jie_kou);
        this.add(hou_duan_jie_kouJTextField);
        JLabel shu_ju_ku_jie_kou = new JLabel("数据库接口" + ":");
        shu_ju_ku_jie_kou.setForeground(Color.white);
        shu_ju_ku_jie_kou.setBounds(10 + 0 * 130, 20 + 25 * 3 + 120, 150, 25);
        JTextField shu_ju_ku_jie_kouJTextField = new JTextField();
        shu_ju_ku_jie_kouJTextField.setBounds(10 + 0 * 130 + 120, 20 + 25 * 3 + 120, 50, 25);
        shu_ju_ku_jie_kouJTextField.addActionListener(arg0
            -> appInThisClass.app_S.databasePortTxt = shu_ju_ku_jie_kouJTextField.getText().trim());
        shu_ju_ku_jie_kouJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.databasePortTxt = shu_ju_ku_jie_kouJTextField.getText().trim();
            }
        });
        shu_ju_ku_jie_kouJTextField.setText(S_HTTP.PORT_DATABASE);
        appInThisClass.app_S.databasePortTxt = S_HTTP.PORT_DATABASE;
        this.add(shu_ju_ku_jie_kou);
        this.add(shu_ju_ku_jie_kouJTextField);


        JLabel huan_cun_jie_kou = new JLabel("缓存接口" + ":");
        huan_cun_jie_kou.setForeground(Color.white);
        huan_cun_jie_kou.setBounds(10 + 0 * 130, 20 + 25 * 4 + 120, 150, 25);
        JTextField huan_cun_jie_kouJTextField = new JTextField();
        huan_cun_jie_kouJTextField.setBounds(10 + 0 * 130 + 120, 20 + 25 * 4 + 120, 50, 25);
        huan_cun_jie_kouJTextField.addActionListener(arg0
            -> appInThisClass.app_S.huan_cun_jie_kouTxt = huan_cun_jie_kouJTextField.getText().trim());
        huan_cun_jie_kouJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.huan_cun_jie_kouTxt = huan_cun_jie_kouJTextField.getText().trim();
            }
        });
        huan_cun_jie_kouJTextField.setText(S_HTTP.PORT_CACHE);
        appInThisClass.app_S.huan_cun_jie_kouTxt = S_HTTP.PORT_CACHE;
        this.add(huan_cun_jie_kou);
        this.add(huan_cun_jie_kouJTextField);


        JLabel lan_ya_jie_kou = new JLabel("蓝牙接口" + ":");
        lan_ya_jie_kou.setForeground(Color.white);
        lan_ya_jie_kou.setBounds(10 + 0 * 130, 20 + 25 * 5 + 120, 150, 25);
        JTextField lan_ya_jie_kouJTextField = new JTextField();
        lan_ya_jie_kouJTextField.setBounds(10 + 0 * 130 + 120, 20 + 25 * 5 + 120, 50, 25);
        lan_ya_jie_kouJTextField.addActionListener(arg0
            -> appInThisClass.app_S.lan_ya_jie_kouTxt = lan_ya_jie_kouJTextField.getText().trim());
        lan_ya_jie_kouJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.lan_ya_jie_kouTxt = lan_ya_jie_kouJTextField.getText().trim();
            }
        });
        lan_ya_jie_kouJTextField.setText(S_HTTP.PORT_BLUETOOTH);
        appInThisClass.app_S.lan_ya_jie_kouTxt = S_HTTP.PORT_BLUETOOTH;
        this.add(lan_ya_jie_kou);
        this.add(lan_ya_jie_kouJTextField);

        JLabel Tel_zhong_duan_jie_kou = new JLabel("Tel终端接口" + ":");
        Tel_zhong_duan_jie_kou.setForeground(Color.white);
        Tel_zhong_duan_jie_kou.setBounds(10 + 0 * 130, 20 + 25 * 6 + 120, 150, 25);
        JTextField Tel_zhong_duan_jie_kouJTextField = new JTextField();
        Tel_zhong_duan_jie_kouJTextField.setBounds(10 + 0 * 130 + 120, 20 + 25 * 6 + 120, 50, 25);
        Tel_zhong_duan_jie_kouJTextField.addActionListener(arg0
            -> appInThisClass.app_S.Tel_zhong_duan_Txt = Tel_zhong_duan_jie_kouJTextField.getText().trim());
        Tel_zhong_duan_jie_kouJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.Tel_zhong_duan_Txt = Tel_zhong_duan_jie_kouJTextField.getText().trim();
            }
        });
        Tel_zhong_duan_jie_kouJTextField.setText(S_HTTP.PORT_TELPORT);
        appInThisClass.app_S.Tel_zhong_duan_Txt = S_HTTP.PORT_TELPORT;
        this.add(Tel_zhong_duan_jie_kou);
        this.add(Tel_zhong_duan_jie_kouJTextField);

        JLabel jlabelpeizhi21 = new JLabel("智慧搜索" + ":");
        jlabelpeizhi21.setForeground(Color.ORANGE);
        jlabelpeizhi21.setBounds(10 + 0 * 150, 20 + 25 * 11 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di21 = new JCheckBox();
        jlabel_peizhi_di21.setBounds(10 + 85 + 0 * 150, 33 + 25 * 11 - 300, 20, 20);
        jlabel_peizhi_di21.addActionListener(arg0 -> {
        });
        this.add(jlabelpeizhi21);
        this.add(jlabel_peizhi_di21);

        JLabel jlabelpeizhi2122 = new JLabel("DNN搜索" + ":");
        jlabelpeizhi2122.setForeground(Color.ORANGE);
        jlabelpeizhi2122.setBounds(10 + 1 * 150, 20 + 25 * 11 - 300, 300, 50);
        jlabel_peizhi_di2122 = new JCheckBox();
        jlabel_peizhi_di2122.setBounds(10 + 85 + 1 * 150, 33 + 25 * 11 - 300, 20, 20);
        jlabel_peizhi_di2122.addActionListener(arg0 -> {
            if (jlabel_peizhi_di2122.isSelected()) {
                jlabel_peizhi_di2122.setSelected(true);
            } else {
                jlabel_peizhi_di2122.setSelected(false);
            }
        });
        jlabel_peizhi_di2122.setSelected(true);
        this.add(jlabelpeizhi2122);
        this.add(jlabel_peizhi_di2122);

        JLabel jlabelpeizhi2123 = new JLabel("神经网络搜索" + ":");
        jlabelpeizhi2123.setForeground(Color.ORANGE);
        jlabelpeizhi2123.setBounds(10 + 2 * 150, 20 + 25 * 11 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di2123 = new JCheckBox();
        jlabel_peizhi_di2123.setBounds(10 + 85 + 2 * 150, 33 + 25 * 11 - 300, 20, 20);
        jlabel_peizhi_di2123.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi2123);
        this.add(jlabel_peizhi_di2123);

        JLabel jlabelpeizhi21231 = new JLabel("DNA搜索" + ":");
        jlabelpeizhi21231.setForeground(Color.ORANGE);
        jlabelpeizhi21231.setBounds(10 + 3 * 150, 20 + 25 * 11 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di21231 = new JCheckBox();
        jlabel_peizhi_di21231.setBounds(10 + 85 + 3 * 150, 33 + 25 * 11 - 300, 20, 20);
        jlabel_peizhi_di21231.addActionListener(arg0 -> {
            if (jlabel_peizhi_di21231.isSelected()) {
                appInThisClass.app_S.DNASearchIsClick = true;
            } else {
                appInThisClass.app_S.DNASearchIsClick = false;
            }
        });
        //初始默认开启
        jlabel_peizhi_di21231.setSelected(true);
        appInThisClass.app_S.DNASearchIsClick = true;
        this.add(jlabelpeizhi21231);
        this.add(jlabel_peizhi_di21231);

        //dna催化
        JLabel jlabelpeizhi2123111 = new JLabel("DNA催化计算" + ":");
        jlabelpeizhi2123111.setForeground(Color.ORANGE);
        jlabelpeizhi2123111.setBounds(10 + 3 * 150, 20 + 25 * 12 - 300, 300, 50);
        DetaSlider cui_hua_bi_zhi = new DetaSlider(0, 100);
        cui_hua_bi_zhi.setSnapToTicks(true);
        cui_hua_bi_zhi.setPaintTicks(true);
        cui_hua_bi_zhi.setMajorTickSpacing(5);
        cui_hua_bi_zhi.setMinorTickSpacing(5);
        cui_hua_bi_zhi.setValue(49);
        cui_hua_bi_zhi.addChangeListener(
            event -> {
                JSlider source = (JSlider) event.getSource();
                appInThisClass.app_S.catalyticRot = source.getValue();
                appInThisClass.keyReleased(null);
            });
        cui_hua_bi_zhi.setBounds(10 + 85 + 3 * 150, 33 + 25 * 12 - 300, 170, 20);

        this.add(jlabelpeizhi2123111);
        this.add(cui_hua_bi_zhi);


        JLabel jlabelpeizhi212311 = new JLabel("DNA加密" + ":");
        jlabelpeizhi212311.setForeground(Color.ORANGE);
        jlabelpeizhi212311.setBounds(10 + 4 * 150, 20 + 25 * 11 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di212311 = new JCheckBox();
        jlabel_peizhi_di212311.setBounds(10 + 85 + 4 * 150, 33 + 25 * 11 - 300, 20, 20);
        jlabel_peizhi_di212311.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi212311);
        this.add(jlabel_peizhi_di212311);


        JLabel jlabelpeizhi22 = new JLabel("智慧阅读" + ":");
        jlabelpeizhi22.setForeground(Color.ORANGE);
        jlabelpeizhi22.setBounds(10 + 0 * 150, 20 + 25 * 12 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di22 = new JCheckBox();
        jlabel_peizhi_di22.setBounds(10 + 85 + 0 * 150, 33 + 25 * 12 - 300, 20, 20);
        jlabel_peizhi_di22.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi22);
        this.add(jlabel_peizhi_di22);

        JLabel jlabelpeizhi2233 = new JLabel("专家操作" + ":");
        jlabelpeizhi2233.setForeground(Color.ORANGE);
        jlabelpeizhi2233.setBounds(10 + 1 * 150, 20 + 25 * 12 - 300, 300, 50);
        jlabel_peizhi_di2233 = new JCheckBox();
        jlabel_peizhi_di2233.setBounds(10 + 85 + 1 * 150, 33 + 25 * 12 - 300, 20, 20);
        jlabel_peizhi_di2233.addActionListener(arg0 -> {
            if (jlabel_peizhi_di2233.isSelected()) {
                jlabel_peizhi_di2233.setSelected(true);
            } else {
                jlabel_peizhi_di2233.setSelected(false);
            }
        });
        //初始默认开启
        jlabel_peizhi_di2233.setSelected(false);
        this.add(jlabelpeizhi2233);
        this.add(jlabel_peizhi_di2233);


        JLabel jlabelpeizhi22331 = new JLabel("数理统计" + ":");
        jlabelpeizhi22331.setForeground(Color.ORANGE);
        jlabelpeizhi22331.setBounds(10 + 2 * 150, 20 + 25 * 12 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di22331 = new JCheckBox();
        jlabel_peizhi_di22331.setBounds(10 + 85 + 2 * 150, 33 + 25 * 12 - 300, 20, 20);
        jlabel_peizhi_di22331.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi22331);
        this.add(jlabel_peizhi_di22331);

        JLabel jlabelpeizhi23 = new JLabel("智慧大脑" + ":");
        jlabelpeizhi23.setForeground(Color.ORANGE);
        jlabelpeizhi23.setBounds(10 + 0 * 150, 20 + 25 * 13 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di23 = new JCheckBox();
        jlabel_peizhi_di23.setBounds(10 + 85 + 0 * 150, 33 + 25 * 13 - 300, 20, 20);
        jlabel_peizhi_di23.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi23);
        this.add(jlabel_peizhi_di23);


        JLabel jlabelpeizhi23D = new JLabel("DNA编码索引" + ":");
        jlabelpeizhi23D.setForeground(Color.ORANGE);
        jlabelpeizhi23D.setBounds(10 + 1 * 150, 20 + 25 * 13 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di23D = new JCheckBox();
        jlabel_peizhi_di23D.setBounds(10 + 85 + 1 * 150, 33 + 25 * 13 - 300, 20, 20);
        jlabel_peizhi_di23D.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi23D);
        this.add(jlabel_peizhi_di23D);

        JLabel jlabelpeizhi23D1 = new JLabel("类人认知执行" + ":");
        jlabelpeizhi23D1.setForeground(Color.ORANGE);
        jlabelpeizhi23D1.setBounds(10 + 2 * 150, 20 + 25 * 13 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di23D1 = new JCheckBox();
        jlabel_peizhi_di23D1.setBounds(10 + 85 + 2 * 150, 33 + 25 * 13 - 300, 20, 20);
        jlabel_peizhi_di23D1.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi23D1);
        this.add(jlabel_peizhi_di23D1);


        JLabel jlabelpeizhi23D12 = new JLabel("肽展计算" + ":");
        jlabelpeizhi23D12.setForeground(Color.ORANGE);
        jlabelpeizhi23D12.setBounds(10 + 3 * 150, 20 + 25 * 13 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di23D12 = new JCheckBox();
        jlabel_peizhi_di23D12.setBounds(10 + 85 + 3 * 150, 33 + 25 * 13 - 300, 20, 20);
        jlabel_peizhi_di23D12.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi23D12);
        this.add(jlabel_peizhi_di23D12);

        JLabel jlabelpeizhi23D1277 = new JLabel("元基筛选" + ":");
        jlabelpeizhi23D1277.setForeground(Color.ORANGE);
        jlabelpeizhi23D1277.setBounds(10 + 3 * 150, 20 + 25 * 14 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di23D1277 = new JCheckBox();
        jlabel_peizhi_di23D1277.setBounds(10 + 85 + 3 * 150, 33 + 25 * 14 - 300, 20, 20);
        jlabel_peizhi_di23D1277.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi23D1277);
        this.add(jlabel_peizhi_di23D1277);


        JLabel jlabelpeizhi23D123 = new JLabel("TVM识别" + ":");
        jlabelpeizhi23D123.setForeground(Color.ORANGE);
        jlabelpeizhi23D123.setBounds(10 + 4 * 150, 20 + 25 * 13 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di23D123 = new JCheckBox();
        jlabel_peizhi_di23D123.setBounds(10 + 85 + 4 * 150, 33 + 25 * 13 - 300, 20, 20);
        jlabel_peizhi_di23D123.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi23D123);
        this.add(jlabel_peizhi_di23D123);

        JLabel jlabelpeizhi23D12377 = new JLabel("元基索引" + ":");
        jlabelpeizhi23D12377.setForeground(Color.ORANGE);
        jlabelpeizhi23D12377.setBounds(10 + 4 * 150, 20 + 25 * 14 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di23D12377 = new JCheckBox();
        jlabel_peizhi_di23D12377.setBounds(10 + 85 + 4 * 150, 33 + 25 * 14 - 300, 20, 20);
        jlabel_peizhi_di23D12377.addActionListener(arg0 -> {

        });
        this.add(jlabelpeizhi23D12377);
        this.add(jlabel_peizhi_di23D12377);


        JLabel jlabelpeizhi2355 = new JLabel("德塔混合分词" + ":");
        jlabelpeizhi2355.setForeground(Color.ORANGE);
        jlabelpeizhi2355.setBounds(10 + 0 * 150, 20 + 25 * 14 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di2355 = new JCheckBox();
        jlabel_peizhi_di2355.setBounds(10 + 85 + 0 * 150, 33 + 25 * 14 - 300, 20, 20);
        jlabel_peizhi_di2355.addActionListener(arg0 -> {
        });
        this.add(jlabelpeizhi2355);
        this.add(jlabel_peizhi_di2355);

        JLabel jlabelpeizhi2356 = new JLabel("德塔象契排序" + ":");
        jlabelpeizhi2356.setForeground(Color.ORANGE);
        jlabelpeizhi2356.setBounds(10 + 1 * 150, 20 + 25 * 14 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di2356 = new JCheckBox();
        jlabel_peizhi_di2356.setBounds(10 + 85 + 1 * 150, 33 + 25 * 14 - 300, 20, 20);
        jlabel_peizhi_di2356.addActionListener(arg0 -> {
        });
        this.add(jlabelpeizhi2356);
        this.add(jlabel_peizhi_di2356);

        JLabel jlabelpeizhi2357 = new JLabel("拼音笔划索引" + ":");
        jlabelpeizhi2357.setForeground(Color.ORANGE);
        jlabelpeizhi2357.setBounds(10 + 2 * 150, 20 + 25 * 14 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di2357 = new JCheckBox();
        jlabel_peizhi_di2357.setBounds(10 + 85 + 2 * 150, 33 + 25 * 14 - 300, 20, 20);
        jlabel_peizhi_di2357.addActionListener(arg0 -> {
        });
        this.add(jlabelpeizhi2357);
        this.add(jlabel_peizhi_di2357);


        JLabel jlabelpeizhi2511 = new JLabel("德塔云" + ":");
        jlabel_peizhi_di2511 = new JCheckBox();
        jlabelpeizhi2511.setForeground(Color.ORANGE);
        jlabelpeizhi2511.setBounds(10 + 0 * 150, 20 + 25 * 15 - 300, 300, 50);
        jlabel_peizhi_di2511.setBounds(10 + 85 + 0 * 150, 33 + 25 * 15 - 300, 20, 20);
        jlabel_peizhi_di2511.addActionListener(arg0 -> {
            if (jlabel_peizhi_di2511.isSelected()) {
                jlabel_peizhi_di2511.setSelected(true);
            } else {
                jlabel_peizhi_di2511.setSelected(false);
            }
        });
        //初始默认开启
        jlabel_peizhi_di2511.setSelected(true);
        this.add(jlabelpeizhi2511);
        this.add(jlabel_peizhi_di2511);

        JLabel jlabelpeizhi24 = new JLabel("德塔前端" + ":");
        jlabelpeizhi24.setForeground(Color.ORANGE);
        jlabelpeizhi24.setBounds(10 + 1 * 150, 20 + 25 * 15 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di24 = new JCheckBox();
        jlabel_peizhi_di24.setBounds(10 + 85 + 1 * 150, 33 + 25 * 15 - 300, 20, 20);
        jlabel_peizhi_di24.addActionListener(arg0 -> {
        });
        this.add(jlabelpeizhi24);
        this.add(jlabel_peizhi_di24);

        JLabel jlabelpeizhi2512 = new JLabel("德塔后端" + ":");
        jlabelpeizhi2512.setForeground(Color.ORANGE);
        jlabelpeizhi2512.setBounds(10 + 2 * 150, 20 + 25 * 15 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di2512 = new JCheckBox();
        jlabel_peizhi_di2512.setBounds(10 + 85 + 2 * 150, 33 + 25 * 15 - 300, 20, 20);
        jlabel_peizhi_di2512.addActionListener(arg0 -> {
            if (jlabel_peizhi_di2512.isSelected()) {
                jlabel_peizhi_di2512.setSelected(true);
            } else {
                jlabel_peizhi_di2512.setSelected(false);
            }
        });
        this.add(jlabelpeizhi2512);
        this.add(jlabel_peizhi_di2512);

        JLabel jlabelpeizhi2513 = new JLabel("德塔数据库" + ":");
        //jlabel_peizhi_di2513= new JCheckBox();
        jlabelpeizhi2513.setForeground(Color.ORANGE);
        jlabelpeizhi2513.setBounds(10 + 3 * 150, 20 + 25 * 15 - 300, 300, 50);
        JCheckBox jlabel_peizhi_di2513 = new JCheckBox();
        jlabel_peizhi_di2513.setBounds(10 + 85 + 3 * 150, 33 + 25 * 15 - 300, 20, 20);
        jlabel_peizhi_di2513.addActionListener(arg0 -> {
            if (jlabel_peizhi_di2513.isSelected()) {
                jlabel_peizhi_di2513.setSelected(true);
            } else {
                jlabel_peizhi_di2513.setSelected(false);
            }
        });
        this.add(jlabelpeizhi2513);
        this.add(jlabel_peizhi_di2513);

        JLabel jlabelpeizhi2515 = new JLabel("德塔缓存" + ":");
        //jlabel_peizhi_di2515= new JCheckBox();
        jlabelpeizhi2515.setForeground(Color.ORANGE);
        jlabelpeizhi2515.setBounds(10 + 4 * 150, 20 + 25 * 15 - 300, 300, 50);
        jlabel_peizhi_di2515 = new JCheckBox();
        jlabel_peizhi_di2515.setBounds(10 + 85 + 4 * 150, 33 + 25 * 15 - 300, 20, 20);
        jlabel_peizhi_di2515.addActionListener(arg0 -> {
            if (jlabel_peizhi_di2515.isSelected()) {
                jlabel_peizhi_di2515.setSelected(true);
            } else {
                jlabel_peizhi_di2515.setSelected(false);
            }
        });
        this.add(jlabelpeizhi2515);
        this.add(jlabel_peizhi_di2515);

        boot_button = new M_V.MVQ.button.DetaButton("启动:");
        boot_button.setBounds(10 + 120 + 140, 460 - 300 + 120, 100, 30);
        boot_button.addActionListener(e -> {
            if (appInThisClass.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {
                jTextPane.setText("正在载入 华瑞集 DNN 索引 5.0.0.0. 系统 . . .");
                if (null == appInThisClass.app_S.DNNmap || appInThisClass.app_S.DNNmap.isEmpty()) {
                    appInThisClass.app_S.DNNmap = GetDNNMap.doGetDNNMap(appInThisClass.app_S, NE);
                }
            }
            tabNamesHook[0] = true;
            isConfig = false;
        });
        this.add(boot_button);

        M_V.MVQ.button.DetaButton jlabel_flush_button = new M_V.MVQ.button.DetaButton("异常刷新:");
        jlabel_flush_button.setBounds(10 + 100 + 30 + 120 + 140, 460 - 300 + 120, 100, 30);
        jlabel_flush_button.addActionListener(e -> {
            if (null != app) {
                //print
                //validate
                if (null != app.app_S) {
                    if (null != app.app_S.jTabbedpane) {
                        //app.app_S.jTabbedpane.validate();
                        app.app_S.jTabbedpane.updateUI();
                    }
                }
                //数据validate
                System.gc();
            }
        });
        this.add(jlabel_flush_button);
        jTextPane = new JTextPane();
        JScrollPane jsp_jTextPane = new JScrollPane(jTextPane);
        jsp_jTextPane.setBounds(10 + 0 * 150, 20 + 25 * 15 + 120 - 180, 750, 350);
        this.add(jsp_jTextPane);

        jTextPane.setText("正在载入 养疗经 2.0.2.5 系统(2.0.2.5.5) . . .");
    }

    public void deleteVPCS_sleeperXLS(String targetName) {
        if (null == NE.app_S._A) {
            return;
        }
        Component[] components = newPages.getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i].toString().contains(targetName)) {
                newPages.remove(components[i]);
            }
        }
        //NE.app_S.makeContainerXLSList.clear();
        //boolean hasEmptyTemp= false;
        Component[] jTabbedpaneComponents = NE.app_S.jTabbedpane.getComponents();
        for (int i = 0; i < jTabbedpaneComponents.length; i++) {
            String name = jTabbedpaneComponents[i].getName();
            if (name.contains(targetName)) {
                XA_ShellTables.searchShellTables.remove(name.replace("临时", ""));
                NE.app_S.jTabbedpane.remove(i);
                if (pagehookJCheckBoxMap.containsKey(name)) {
                    pagehookJCheckBoxMap.put(name, false);//
                }
            }
        }
        NE.app_S.appConfig.SectionJPanel.updateUI();
        NE.app_S.jTabbedpane.updateUI();
    }
}

//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.cecil.columnTitle
//		, NE.app_S.cecil.tableData_old, filepath, "cecilPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.zynkxPage.columnTitle
//		, NE.app_S.zynkxPage.tableData_old
//		, filepath, "zynkxPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.zyzdxPage.columnTitle
//, NE.app_S.zyzdxPage.tableData_old
//, filepath, "zyzdxPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.fyydPage.columnTitle
//, NE.app_S.fyydPage.tableData_old
//, filepath, "fyydPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.fqzPage.columnTitle
//, NE.app_S.fqzPage.tableData_old
//, filepath, "fqzPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.fckxPage.columnTitle
//, NE.app_S.fckxPage.tableData_old
//, filepath, "fckxPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.jzkxPage.columnTitle
//, NE.app_S.jzkxPage.tableData_old
//, filepath, "jzkxPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.wkxPage.columnTitle
//, NE.app_S.wkxPage.tableData_old
//, filepath, "wkxPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.wskxPage.columnTitle
//, NE.app_S.wskxPage.tableData_old
//, filepath, "wskxPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.xyscPage.columnTitle
//, NE.app_S.xyscPage.tableData_old
//, filepath, "xyscPage", fileType);
//
//new DetaYLJBufferToXls()
//.detaYLJBufferToXlsWithTableName(NE.app_S.columnTitle
//, NE.app_S.tableData_old
//, filepath, "zybgPage", fileType);

//493//        JLabel jlabels = new JLabel("无声卡" + ":");
////        jlabels.setForeground(Color.green);
////        jlabels.setBounds(10 + 0 * 150, 20 + 25 * 7, 100, 50);
////        jlabel_end_boxs = new JCheckBox();
////        jlabel_end_boxs.setBounds(10 + 85 + 0 * 150, 33 + 25 * 7, 20, 20);
////        jlabel_end_boxs.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////                if (jlabel_end_boxs.isSelected()) {
////                    jlabel_end_boxs.setSelected(false);
////                } else {
////                    jlabel_end_boxs.setSelected(true);
////                }
////            }
////        });
////        this.add(jlabels);
////        this.add(jlabel_end_boxs);
//
////        JLabel jlabels1 = new JLabel("无网卡" + ":");
////        jlabels1.setForeground(Color.green);
////        jlabels1.setBounds(10 + 1 * 150, 20 + 25 * 7, 100, 50);
////        jlabel_end_boxs1 = new JCheckBox();
////        jlabel_end_boxs1.setBounds(10 + 85 + 1 * 150, 33 + 25 * 7, 20, 20);
////        jlabel_end_boxs1.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////                if (jlabel_end_boxs1.isSelected()) {
////                    jlabel_end_boxs1.setSelected(false);
////                } else {
////                    jlabel_end_boxs1.setSelected(true);
////                }
////            }
////        });
////        this.add(jlabels1);
////        this.add(jlabel_end_boxs1);
//
////        JLabel jlabels2 = new JLabel("无蓝牙" + ":");
////        jlabels2.setForeground(Color.green);
////        jlabels2.setBounds(10 + 2 * 150, 20 + 25 * 7, 100, 50);
////        jlabel_end_boxs2 = new JCheckBox();
////        jlabel_end_boxs2.setBounds(10 + 85 + 2 * 150, 33 + 25 * 7, 20, 20);
////        jlabel_end_boxs2.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////                if (jlabel_end_boxs2.isSelected()) {
////                    jlabel_end_boxs2.setSelected(false);
////                } else {
////                    jlabel_end_boxs2.setSelected(true);
////                }
////            }
////        });
////        this.add(jlabels2);
////        this.add(jlabel_end_boxs2);
//
////        JLabel jlabels3 = new JLabel("GPU加速" + ":");
////        jlabels3.setForeground(Color.green);
////        jlabels3.setBounds(10 + 3 * 150, 20 + 25 * 7, 100, 50);
////        jlabel_end_boxs3 = new JCheckBox();
////        jlabel_end_boxs3.setBounds(10 + 85 + 3 * 150, 33 + 25 * 7, 20, 20);
////        jlabel_end_boxs3.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////                if (!jlabel_end_boxs3.isSelected()) {
////                    jlabel_end_boxs3.setSelected(true);
////                } else {
////                    jlabel_end_boxs3.setSelected(false);
////                }
////            }
////        });
////        this.add(jlabels3);
////        this.add(jlabel_end_boxs3);
//
////        JLabel jlabels31 = new JLabel("无打印机" + ":");
////        jlabels31.setForeground(Color.green);
////        jlabels31.setBounds(10 + 4 * 150, 20 + 25 * 7, 100, 50);
////        jlabel_end_boxs31 = new JCheckBox();
////        jlabel_end_boxs31.setBounds(10 + 85 + 4 * 150, 33 + 25 * 7, 20, 20);
////        jlabel_end_boxs31.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////                if (!jlabel_end_boxs31.isSelected()) {
////                    jlabel_end_boxs31.setSelected(true);
////                } else {
////                    jlabel_end_boxs31.setSelected(false);
////                }
////            }
////        });
////        this.add(jlabels31);
////        this.add(jlabel_end_boxs31);
//
////        JLabel jlabelpeizhi = new JLabel("配置机型4G RAM, 30GB disk, 1200* 768 windows" + ":");
////        jlabelpeizhi.setForeground(Color.magenta);
////        jlabelpeizhi.setBounds(10 + 0 * 150, 20 + 25 * 8, 300, 50);
////        JCheckBox jlabel_peizhi_di = new JCheckBox();
////        jlabel_peizhi_di.setBounds(10 + 85 + 0 * 150 + 250, 33 + 25 * 8, 20, 20);
////        jlabel_peizhi_di.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////            }
////        });
////        this.add(jlabelpeizhi);
////        this.add(jlabel_peizhi_di);
//
////        JLabel jlabelpeizhi1 = new JLabel("配置机型8G RAM, 60GB disk, 1520* 1024 windows" + ":");
////        jlabelpeizhi1.setForeground(Color.magenta);
////        jlabelpeizhi1.setBounds(10 + 0 * 150, 20 + 25 * 9, 300, 50);
////        JCheckBox jlabel_peizhi_di1 = new JCheckBox();
////        jlabel_peizhi_di1.setBounds(10 + 85 + 0 * 150 + 250, 33 + 25 * 9, 20, 20);
////        jlabel_peizhi_di1.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////            }
////        });
////        this.add(jlabelpeizhi1);
////        this.add(jlabel_peizhi_di1);
//
////        JLabel jlabelpeizhi2 = new JLabel("配置机型16G RAM, 100GB disk, 1920* 1360 windows" + ":");
////        jlabelpeizhi2.setForeground(Color.magenta);
////        jlabelpeizhi2.setBounds(10 + 0 * 150, 20 + 25 * 10, 300, 50);
////        JCheckBox jlabel_peizhi_di2 = new JCheckBox();
////        jlabel_peizhi_di2.setBounds(10 + 85 + 0 * 150 + 250, 33 + 25 * 10, 20, 20);
////        jlabel_peizhi_di2.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent arg0) {
////            }
////        });
////        this.add(jlabelpeizhi2);
////        this.add(jlabel_peizhi_di2);