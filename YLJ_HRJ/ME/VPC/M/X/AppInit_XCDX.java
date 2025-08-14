package ME.VPC.M.X;

import ME.VPC.C.skivvy.MakeContainer_ZHONG_YAO;
import ME.VPC.H.hospital.DetaLabelS_s;
import ME.VPC.M.app.App;
import ME.VPC.M.app.AppConfig;
import M_V.MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import M_V.MVQ.label.DetaLabelConjunction;
import M_V.MVQ.slider.DetaSlider;
import M_V.MVQ.tabbedpane.DetabbedPane;
import O_V.OSI.AOP.VPC.server.RestServer;
import S_A.SVQ.stable.S_File;
import exception.thread.DetaThread;
import DVIAQVIMIV.SkinPathDetectTrip_E;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

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
    @SuppressWarnings({"deprecation"})
    public void IV_(App app, App NE) {//later duplicate
        //Register Medicine Report
        DetaLabelConjunction.detaLabelConjunction = new DetaLabelConjunction();
        DetaLabelConjunction.detaLabelConjunction.IV_();
        //Register ELEC hospital global actions clean
        if (null == DetaLabelS_s.stableImages) {
            DetaLabelS_s.stableImages = new DetaLabelS_s();
        }
        DetaLabelS_s.stableImages.setS_Images();
        DetaLabelS_s.stableImages.setTarget(false);
        //Register DNA
        S_File.DNA_PDN.put(this.getClass().getCanonicalName(), true);
        app.app_S.frameConfig = new JFrame("软件配置面板");
        app.app_S.frameConfig.setIconImage(app.app_S.logo.getImage());
        app.app_S.frameConfig.setLayout(null);
        app.app_S.frameConfig.setSize(800, 750);
        app.app_S.frameConfig.resize(800, 750);
        app.app_S.frameConfig.setResizable(false);
        //
        app.app_S.appConfig = new AppConfig();
        app.app_S.frameConfig.add(app.app_S.appConfig);
        if(NE.tempString.contains("测试")||NE.tempString.contains("test")){
        }else{
            app.app_S.frameConfig.setVisible(true);
            app.app_S.frameConfig.show();
        }
        app.app_S.frameConfig.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        app.app_S.frameConfig.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowevent) {
                //String command= "taskkill /im dm_new.exe /f";
                if (app.app_S.appConfig.SectionJPanel.isConfig) {
                    app.app_S.frameConfig.removeAll();
                    app.app_S.frameConfig.disable();
                    System.gc();
                    System.exit(0);
                }
            }
        });
        //app.app_S.appInstance= app;
        app.app_S.appConfig.IV_(app);
        //stop cursor
        // app.app_S._A = new CogsBinaryForest_AE();//300mb
        if (app.app_S.appConfig.SectionJPanel.jTextPane != null) {
            String text = app.app_S.appConfig.SectionJPanel.jTextPane.getText();
            text = "\r\n" + "----当前版本有效期100天." + text;
            text = "\r\n" + "..." + text;
            app.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
        }
        app.app_S.jTabbedpane = new DetabbedPane(1000 - 60, 20, Color.black, NE);
        // 存放选项卡的组件
        RestServer rest = new RestServer(app);//300mb
        rest.start();
        app.app_S.appConfig.SectionJPanel.jTextPane.setText("rest inject");
        if (app.app_S.appConfig.SectionJPanel.jTextPane != null) {
            String text = app.app_S.appConfig.SectionJPanel.jTextPane.getText();
            text = "\r\n" + "----当前版本有效期100天." + text;
            text = "\r\n" + "..." + text;
            text = "\r\n" + "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！" + text;
            text = "\r\n" + "..." + text;
            text = "\r\n" + "----载入德塔中文分词分析子系统完毕！" + text;
            text = "\r\n" + "..." + text;
            app.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
        }
        DetaThread.sleepDeta(2000);//分词初始
        if (app.app_S.appConfig.SectionJPanel.jTextPane != null) {
            String text = app.app_S.appConfig.SectionJPanel.jTextPane.getText();
            text = "\r\n" + "----当前版本有效期100天." + text;
            text = "\r\n" + "..." + text;
            text = "\r\n" + "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！" + text;
            text = "\r\n" + "..." + text;
            text = "\r\n" + "----载入德塔中文分词分析子系统完毕！" + text;
            text = "\r\n" + "..." + text;
            text = "\r\n" + "----载入德塔 多国语言词库 映射添加完毕！" + text;
            text = "\r\n" + "..." + text;
            app.app_S.appConfig.SectionJPanel.jTextPane.setText(text);
        }
        while (!app.app_S.ready) {
            DetaThread.sleepDeta(300);
        }
        while (app.app_S.appConfig.SectionJPanel.isConfig) {
            if(null!=app.app_S.appConfig.SectionJPanel.boot_button){
                app.app_S.appConfig.SectionJPanel.boot_button.doClick();
            }
            DetaThread.sleepDeta(300);
        }
        app.app_S.translator = new Translator_E();
        app.app_S.translator.IV_(app.app_S._A);
        app.app_S.text = new JTextPane();
        app.app_S.jText = new JTextPane();
        app.app_S.jxText = new JTextPane();
        app.app_S.text.setBackground(new Color(210, 210, 210));
        app.app_S.jText.setBackground(new Color(210, 210, 210));
        app.app_S.jxText.setBackground(new Color(210, 210, 210));
        UIManager.put("ScrollBarUI", "OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");
        app.app_S.jTabbedpane.setBounds(0, 60, 1345, 980);
        app.app_S.tabNames = new ArrayList<>();
        app.app_S.tabNames.add("中药本草");
        app.app_S.tabNames.add("数据分析");
        app.app_S.tabNames.add("智能相诊");
        app.app_S.tabNames.add("智能声诊");
        app.app_S.tabNames.add("位术数");
        app.app_S.tabNames.add("西医内科");
        app.app_S.tabNames.add("中医方剂");
        app.app_S.tabNames.add("中医诊断");
        app.app_S.tabNames.add("古籍");
        app.app_S.tabNames.add("中医生殖");
        app.app_S.tabNames.add("西医生殖");
        app.app_S.tabNames.add("西医急诊");
        app.app_S.tabNames.add("大外科");
        app.app_S.tabNames.add("中医外伤");
        app.app_S.tabNames.add("西药处方");
        app.app_S.tabNames.add("编辑页");
        app.app_S.tabNames.add("哈里森内科");
        int leftRange = 10;
        app.app_S.jsp_name = new JScrollPane(app.app_S.app_XCDX.name(NE));
        app.app_S.jsp_name.setBounds(60, 6, 280, 50);
        //
        app.app_S.jingmai_filter = new JLabel("精确搜索:");
        app.app_S.jingmai_filter.setForeground(Color.yellow);
        app.app_S.jingmai_filter.setBounds(360 - leftRange, -7, 100, 50);
        app.app_S.look = new DetaSlider(0, 12);
        app.app_S.look.setSnapToTicks(true);
        app.app_S.look.setPaintTicks(true);
        app.app_S.look.setMajorTickSpacing(5);
        app.app_S.look.setMinorTickSpacing(1);
        app.app_S.look.setValue(0);
        app.app_S.look.addChangeListener(event -> {//later。。
            JSlider source = (JSlider) event.getSource();
            app.app_S.lookrot = source.getValue();
        });
        app.app_S.look.addMouseListener(new MouseListener() {//later.. do
            @Override
            public void mouseReleased(MouseEvent arg0) {
                JSlider source = (JSlider) arg0.getSource();
                app.app_S.lookrot = source.getValue();
                Component component = new Component() {
                };//later..
                KeyEvent keyEvent = new KeyEvent(component
                    , 0, 0, 0, 10);
                keyEvent.setKeyCode(10);
                app.keyReleased(keyEvent);
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }
        });
        app.app_S.look.setBounds(420 - leftRange, 8, 50, 20);
        app.app_S.color_text = new JLabel("文本颜色:");
        app.app_S.color_text.setForeground(Color.yellow);
        app.app_S.color_text.setBounds(360 - leftRange, 21, 100, 50);
        app.app_S.rate = new DetaSlider(0, 20);
        app.app_S.rate.setSnapToTicks(true);
        app.app_S.rate.setPaintTicks(true);
        app.app_S.rate.setMajorTickSpacing(5);
        app.app_S.rate.setMinorTickSpacing(1);
        app.app_S.rate.setValue(0);
        app.app_S.rate.addChangeListener(event -> {
        });
        app.app_S.rate.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
                JSlider source = (JSlider) arg0.getSource();
                app.app_S.raterot = source.getValue() - 100;
                app.app_S.makeContainer_ZHONG_YAO.zhongYaoTableSimple.mouseClicked(arg0);
                //loop xls action.. later..
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }
        });
        app.app_S.rate.setBounds(420 - leftRange, 36, 50, 20);
        app.app_S.size_font = new JLabel("文字大小:");
        app.app_S.size_font.setForeground(Color.yellow);
        app.app_S.size_font.setBounds(493 - 3 * leftRange, 21, 100, 50);
        app.app_S.size_font_slider = new DetaSlider(0, 10);
        app.app_S.size_font_slider.setSnapToTicks(true);
        app.app_S.size_font_slider.setPaintTicks(true);
        app.app_S.size_font_slider.setMajorTickSpacing(5);
        app.app_S.size_font_slider.setMinorTickSpacing(1);
        app.app_S.size_font_slider.setValue(0);
        app.app_S.size_font_slider.addChangeListener(event -> {
        });
        app.app_S.size_font_slider.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
                JSlider source = (JSlider) arg0.getSource();
                app.app_S.size_font_rot = source.getValue();
                app.app_S.makeContainer_ZHONG_YAO.zhongYaoTableSimple.mouseClicked(arg0);
                app.app_S.editPane.buttonHighLight.doClick();
                app.app_S.jTabbedpane.updateUI();
                //loop xls action.. later..
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {//later do
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }
        });
        app.app_S.size_font_slider.setBounds(553 - leftRange * 3
            , 36, 50, 20);
        app.app_S.density_bloosm = new JLabel("词花密度:");
        app.app_S.density_bloosm.setForeground(Color.yellow);
        app.app_S.density_bloosm.setBounds(493 - 3 * leftRange
            , -7, 100, 50);
        app.app_S.leaf = new DetaSlider(0, 7);
        app.app_S.leaf.setSnapToTicks(true);
        app.app_S.leaf.setPaintTicks(true);
        app.app_S.leaf.setMajorTickSpacing(5);
        app.app_S.leaf.setMinorTickSpacing(1);
        app.app_S.leaf.setValue(0);
        app.app_S.leaf.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            app.app_S.leafrot = source.getValue();
            app.keyReleased(null);
        });
        app.app_S.leaf.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
                //loop xls action.. later..
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }
        });
        app.app_S.leaf.setBounds(553 - leftRange * 3, 8, 50, 20);
        app.app_S.color_bg = new JLabel("背景颜色:");
        app.app_S.color_bg.setForeground(Color.yellow);
        app.app_S.color_bg.setBounds(614 - (leftRange << 2), 21, 100, 50);
        app.app_S.color_bg_slider = new DetaSlider(0, 200);
        app.app_S.color_bg_slider.setSnapToTicks(true);
        app.app_S.color_bg_slider.setPaintTicks(true);
        app.app_S.color_bg_slider.setMajorTickSpacing(5);
        app.app_S.color_bg_slider.setMinorTickSpacing(1);
        app.app_S.color_bg_slider.setValue(0);
        app.app_S.color_bg_slider.addChangeListener(
            event -> {
            });
        app.app_S.color_bg_slider.addMouseListener(new MouseListener() {//later in new panel.
            @Override
            public void mouseReleased(MouseEvent arg0) {
                JSlider source = (JSlider) arg0.getSource();
                app.app_S.color_bg_rot = source.getValue();
                app.app_S.jTabbedpane.updateUI();
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }
        });
        app.app_S.color_bg_slider.setBounds(674 - (leftRange << 2)
            , 36, 50, 20);
        //稍后缩进
        app.app_S.read_speed = new JLabel("语速快慢:");
        app.app_S.read_speed.setForeground(Color.yellow);
        app.app_S.read_speed.setBounds(614 - (leftRange << 2)
            , -7, 100, 50);
        app.app_S.read_speed_slider = new DetaSlider(0, 20);
        app.app_S.read_speed_slider.setSnapToTicks(true);
        app.app_S.read_speed_slider.setPaintTicks(true);
        app.app_S.read_speed_slider.setMajorTickSpacing(5);
        app.app_S.read_speed_slider.setMinorTickSpacing(1);
        app.app_S.read_speed_slider.setValue(0);
        app.app_S.read_speed_slider.addChangeListener(
            event -> {
                JSlider source = (JSlider) event.getSource();
                app.app_S.read_speed_rot = source.getValue();
                app.keyReleased(null);
            });
        app.app_S.read_speed_slider.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent arg0) {
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }
        });
        app.app_S.read_speed_slider.setBounds(674 - (leftRange << 2), 8, 50, 20);
        app.app_S.jPanel = new JPanel();
        app.app_S.jPanel.setLayout(null);
        app.app_S.jPanel.setBounds(0, 0, 1470, 930 + app.app_S.rangeHigh);
        app.app_S.jPanel.setBackground(Color.BLACK);
        new APPInit_X_AddMainButton().IV_(app, app.app_S.jPanel);//la
        app.app_S.jPanel.add(app.app_S.jsp_name);
        app.app_S.jPanel.add(app.app_S.jTabbedpane);//
        //app.app_S.jPanel.add(app.app_S.page_filter);//所有页面过滤
        //app.app_S.jPanel.add(app.app_S.page_filter_box);//所有页面过滤
        app.app_S.jPanel.add(app.app_S.color_text);
        app.app_S.jPanel.add(app.app_S.size_font);
        app.app_S.jPanel.add(app.app_S.density_bloosm);
        app.app_S.jPanel.add(app.app_S.size_font_slider);
        app.app_S.jPanel.add(app.app_S.color_bg);
        app.app_S.jPanel.add(app.app_S.read_speed);
        app.app_S.jPanel.add(app.app_S.color_bg_slider);
        app.app_S.jPanel.add(app.app_S.read_speed_slider);
        app.app_S.jPanel.add(app.app_S.look);//游标
        app.app_S.jPanel.add(app.app_S.rate);//游标
        app.app_S.jPanel.add(app.app_S.leaf);//游标
        app.app_S.jPanel.add(app.app_S.jingmai_filter);//线性enter
        new CommonFilterTool().initCommonFilterTool(740, 6, NE);
        app.app_S.jPanel.setPreferredSize(
            new Dimension(1330, 770 + app.app_S.rangeHigh));
        app.app_S.jScrollPane = new JScrollPane(app.app_S.jPanel);
        app.app_S.jScrollPane.setBounds(0, 0, 1335
            , 780 + app.app_S.rangeHigh);
        app.app_S.appConfig.SectionJPanel.jTextPane.setText(
            app.app_S.appConfig.SectionJPanel.jTextPane.getText()
                + "trap app.app_S.rangeHigh" + app.app_S.rangeHigh);
        app.setLayout(null);
        app.getContentPane().add(app.app_S.jScrollPane);
        app.app_S.jScrollPane.setViewportView(app.app_S.jPanel);
        app.setBounds(0, 0, 1345, 795 + app.app_S.rangeHigh);
        app.setVisible(true);
        Container jpanelFirst = new Container();
        app.app_S.makeContainer_ZHONG_YAO = null;
        app.app_S.makeContainer_ZHONG_YAO = new MakeContainer_ZHONG_YAO(jpanelFirst, NE);
        //p1
        app.app_S.makeContainer_ZHONG_YAO.start();
        app.app_S.appConfig.SectionJPanel.jTextPane.setText(app.app_S.appConfig
            .SectionJPanel.jTextPane.getText() + "trap inject zhongyao");
        ////p1 trif
        //app.app_S.jTabbedpane.addTab("药食同源", new ImageIcon()
        //   , jpanelFirst, "药食同源");
        //app.app_S.jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0);
        //app.app_S.jTabbedpane.setBackgroundAt(0, new Color(253, 233, 254));
        //app.app_S.jTabbedpane.setBackground(Color.black);
        DetaThread.sleepDeta(300);
        app.mouseClicked(null);
        app.app_S.appConfig.SectionJPanel.jTextPane.setText(app.app_S.appConfig
            .SectionJPanel.jTextPane.getText() + "\r\n\r\n" + "server inject");
        new AppInit_X_PageLoad().IV_(app.app_S, NE);
        SkinPathDetectTrip_E.initDeciphring(app.app_S.fourInitonJianTxt.isEmpty()
            ? app.app_S.fourInitonJianTxt : "F_DB5.txt", 5);
        SkinPathDetectTrip_E.initDeciphring(app.app_S.fourInitonSuanTxt.isEmpty()
            ? app.app_S.fourInitonSuanTxt : "F_DB6.txt", 6);
        SkinPathDetectTrip_E.initDeciphring(app.app_S.sixteenInitonJianTxt.isEmpty()
            ? app.app_S.sixteenInitonJianTxt : "F_DB6_jian_17.txt", 17);
        SkinPathDetectTrip_E.initDeciphring(app.app_S.sixteenInitonJianTxt.isEmpty()
            ? app.app_S.sixteenInitonSuanTxt : "F_DB6_suan_17.txt", 18);

    }
}