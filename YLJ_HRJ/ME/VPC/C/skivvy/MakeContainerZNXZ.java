package ME.VPC.C.skivvy;

import A_V.cap.Monitor_X_;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import ME.VPC.S.ne.WindowsUI;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

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
public class MakeContainerZNXZ extends MakeContainer_X_S_s {

    public MakeContainerZNXZ(Container jpanelThird, App app_NE) {
        super(app_NE);
        NE = app_NE;
        this.containerPanel = jpanelThird;
        this._A = NE.app_S._A;
    }

    public void run() {
        try {
            jTabbedpane.validate();
            DetaThread.sleepDeta(1000);
            containerPanel.setLayout(null);
            containerPanel.setBounds(0, 0, WindowsUI.makeContainerWidth
                , WindowsUI.makeContainerHeight);
            app_S.monitor = new Monitor_X_();
            app_S.monitor.setVisible(true);
            app_S.monitor.init();
            app_S.monitor.monitor_X_S.sliderx = new JSlider(0, 360);
            app_S.monitor.monitor_X_S.sliderx.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.sliderx.setPaintTicks(true);
            app_S.monitor.monitor_X_S.sliderx.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.sliderx.setMinorTickSpacing(1);
            app_S.monitor.monitor_X_S.sliderx.setBackground(Color.black);
            app_S.monitor.monitor_X_S.sliderx.setForeground(Color.gray);
            app_S.monitor.monitor_X_S.sliderx.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.facx = source.getValue();
                });

            app_S.monitor.monitor_X_S.slidery = new JSlider(0, 360);
            app_S.monitor.monitor_X_S.slidery.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.slidery.setPaintTicks(true);
            app_S.monitor.monitor_X_S.slidery.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.slidery.setMinorTickSpacing(1);
            app_S.monitor.monitor_X_S.slidery.setBackground(Color.black);
            app_S.monitor.monitor_X_S.slidery.setForeground(Color.gray);
            app_S.monitor.monitor_X_S.slidery.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.facy = source.getValue();
                });

            app_S.monitor.monitor_X_S.sliderz = new JSlider(0, 360);
            app_S.monitor.monitor_X_S.sliderz.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.sliderz.setPaintTicks(true);
            app_S.monitor.monitor_X_S.sliderz.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.sliderz.setMinorTickSpacing(1);
            app_S.monitor.monitor_X_S.sliderz.setBackground(Color.black);
            app_S.monitor.monitor_X_S.sliderz.setForeground(Color.gray);
            app_S.monitor.monitor_X_S.sliderz.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.facz = source.getValue();
                });
            app_S.monitor.monitor_X_S.slidert = new JSlider(0, 100);
            app_S.monitor.monitor_X_S.slidert.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.slidert.setPaintTicks(true);
            app_S.monitor.monitor_X_S.slidert.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.slidert.setMinorTickSpacing(1);
            app_S.monitor.monitor_X_S.slidert.setBackground(Color.black);
            app_S.monitor.monitor_X_S.slidert.setForeground(Color.gray);
            app_S.monitor.monitor_X_S.slidert.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.fact = source.getValue();
                    NE.app_S.appConfig.SectionJPanel.jTextPane.setText(""
                        + app_S.monitor.monitor_X_S.fact);
                });
            app_S.monitor.monitor_X_S.sliderl = new JSlider(0, 360);
            app_S.monitor.monitor_X_S.sliderl.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.sliderl.setPaintTicks(true);
            app_S.monitor.monitor_X_S.sliderl.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.sliderl.setMinorTickSpacing(1);
            app_S.monitor.monitor_X_S.sliderl.setBackground(Color.black);
            app_S.monitor.monitor_X_S.sliderl.setForeground(Color.gray);
            app_S.monitor.monitor_X_S.sliderl.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.facl = source.getValue();
                });

            MakeContainerZNXZ_X_ButtonsOEV.createButtons(NE);
            MakeContainerZNXZ_X_ButtonsMedicalOEV.createButtons(NE);
            MakeContainerZNXZ_X_ButtonsDNA.createButtons(NE);

            app_S.monitor.monitor_X_S.sliderr = new JSlider(0, 255);
            app_S.monitor.monitor_X_S.sliderr.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.sliderr.setPaintTicks(true);
            app_S.monitor.monitor_X_S.sliderr.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.sliderr.setMinorTickSpacing(0);
            app_S.monitor.monitor_X_S.sliderr.setBackground(Color.black);
            app_S.monitor.monitor_X_S.sliderr.setForeground(Color.pink);
            app_S.monitor.monitor_X_S.sliderr.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.facr = source.getValue();
                    NE.app_S.appConfig.SectionJPanel.jTextPane.setText(""
                        + app_S.monitor.monitor_X_S.facr);
                });

            app_S.monitor.monitor_X_S.sliderg = new JSlider(0, 255);
            app_S.monitor.monitor_X_S.sliderg.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.sliderg.setPaintTicks(true);
            app_S.monitor.monitor_X_S.sliderg.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.sliderg.setMinorTickSpacing(0);
            app_S.monitor.monitor_X_S.sliderg.setBackground(Color.black);
            app_S.monitor.monitor_X_S.sliderg.setForeground(Color.green);
            app_S.monitor.monitor_X_S.sliderg.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.facg = source.getValue();
                    NE.app_S.appConfig.SectionJPanel.jTextPane.setText(""
                        + app_S.monitor.monitor_X_S.facg);
                });

            app_S.monitor.monitor_X_S.sliderb = new JSlider(0, 255);
            app_S.monitor.monitor_X_S.sliderb.setSnapToTicks(true);
            app_S.monitor.monitor_X_S.sliderb.setPaintTicks(true);
            app_S.monitor.monitor_X_S.sliderb.setMajorTickSpacing(5);
            app_S.monitor.monitor_X_S.sliderb.setMinorTickSpacing(0);
            app_S.monitor.monitor_X_S.sliderb.setBackground(Color.black);
            app_S.monitor.monitor_X_S.sliderb.setForeground(Color.blue);
            app_S.monitor.monitor_X_S.sliderb.addChangeListener(
                event -> {
                    JSlider source = (JSlider) event.getSource();
                    app_S.monitor.monitor_X_S.facb = source.getValue();
                    NE.app_S.appConfig.SectionJPanel.jTextPane.setText(""
                        + app_S.monitor.monitor_X_S.facb);
                });
            app_S.monitor.monitor_X_S.br.add(app_S.monitor.monitor_X_S.btr);
            app_S.monitor.monitor_X_S.br.add(app_S.monitor.monitor_X_S.sliderr);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.br);

            app_S.monitor.monitor_X_S.bg.add(app_S.monitor.monitor_X_S.btg);
            app_S.monitor.monitor_X_S.bg.add(app_S.monitor.monitor_X_S.sliderg);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.bg);

            app_S.monitor.monitor_X_S.bb.add(app_S.monitor.monitor_X_S.btb);
            app_S.monitor.monitor_X_S.bb.add(app_S.monitor.monitor_X_S.sliderb);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.bb);

            app_S.monitor.monitor_X_S.b1.add(app_S.monitor.monitor_X_S.bt1);
            app_S.monitor.monitor_X_S.b1.add(app_S.monitor.monitor_X_S.sliderx);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.b1);

            app_S.monitor.monitor_X_S.b2.add(app_S.monitor.monitor_X_S.bt2);
            app_S.monitor.monitor_X_S.b2.add(app_S.monitor.monitor_X_S.slidery);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.b2);

            app_S.monitor.monitor_X_S.b3.add(app_S.monitor.monitor_X_S.bt3);
            app_S.monitor.monitor_X_S.b3.add(app_S.monitor.monitor_X_S.sliderz);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.b3);

            app_S.monitor.monitor_X_S.b4.add(app_S.monitor.monitor_X_S.bt4);
            app_S.monitor.monitor_X_S.b4.add(app_S.monitor.monitor_X_S.slidert);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.b4);

            app_S.monitor.monitor_X_S.b5.add(app_S.monitor.monitor_X_S.bt5);
            app_S.monitor.monitor_X_S.b5.add(app_S.monitor.monitor_X_S.sliderl);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.b5);

            app_S.monitor.monitor_X_S.buttonBox0.add(app_S.monitor.monitor_X_S.bt00);
            app_S.monitor.monitor_X_S.buttonBox0.add(app_S.monitor.monitor_X_S.bt01);
            app_S.monitor.monitor_X_S.buttonBox0.add(app_S.monitor.monitor_X_S.bt02);
            app_S.monitor.monitor_X_S.buttonBox0.add(app_S.monitor.monitor_X_S.bt03);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox0);

            app_S.monitor.monitor_X_S.buttonBox1.add(app_S.monitor.monitor_X_S.bt10);
            app_S.monitor.monitor_X_S.buttonBox1.add(app_S.monitor.monitor_X_S.bt11);
            app_S.monitor.monitor_X_S.buttonBox1.add(app_S.monitor.monitor_X_S.bt12);
            app_S.monitor.monitor_X_S.buttonBox1.add(app_S.monitor.monitor_X_S.bt13);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox1);

            app_S.monitor.monitor_X_S.buttonBox2.add(app_S.monitor.monitor_X_S.bt20);
            app_S.monitor.monitor_X_S.buttonBox2.add(app_S.monitor.monitor_X_S.bt21);
            app_S.monitor.monitor_X_S.buttonBox2.add(app_S.monitor.monitor_X_S.bt22);
            app_S.monitor.monitor_X_S.buttonBox2.add(app_S.monitor.monitor_X_S.bt23);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox2);

            app_S.monitor.monitor_X_S.buttonBox3.add(app_S.monitor.monitor_X_S.bt30);
            app_S.monitor.monitor_X_S.buttonBox3.add(app_S.monitor.monitor_X_S.bt31);
            app_S.monitor.monitor_X_S.buttonBox3.add(app_S.monitor.monitor_X_S.bt32);
            app_S.monitor.monitor_X_S.buttonBox3.add(app_S.monitor.monitor_X_S.bt33);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox3);

            app_S.monitor.monitor_X_S.buttonBox4.add(app_S.monitor.monitor_X_S.bt121);
            app_S.monitor.monitor_X_S.buttonBox4.add(app_S.monitor.monitor_X_S.bt41);
            app_S.monitor.monitor_X_S.buttonBox4.add(app_S.monitor.monitor_X_S.bt122);
            app_S.monitor.monitor_X_S.buttonBox4.add(app_S.monitor.monitor_X_S.bt43);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox4);

            app_S.monitor.monitor_X_S.buttonBox5.add(app_S.monitor.monitor_X_S.bt123);
            app_S.monitor.monitor_X_S.buttonBox5.add(app_S.monitor.monitor_X_S.bt124);
            app_S.monitor.monitor_X_S.buttonBox5.add(app_S.monitor.monitor_X_S.bt52);
            app_S.monitor.monitor_X_S.buttonBox5.add(app_S.monitor.monitor_X_S.bt53);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox5);

            app_S.monitor.monitor_X_S.buttonBox6.add(app_S.monitor.monitor_X_S.bt60);
            app_S.monitor.monitor_X_S.buttonBox6.add(app_S.monitor.monitor_X_S.bt131);
            app_S.monitor.monitor_X_S.buttonBox6.add(app_S.monitor.monitor_X_S.bt62);
            app_S.monitor.monitor_X_S.buttonBox6.add(app_S.monitor.monitor_X_S.bt132);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox6);

            app_S.monitor.monitor_X_S.buttonBox7.add(app_S.monitor.monitor_X_S.bt133);
            app_S.monitor.monitor_X_S.buttonBox7.add(app_S.monitor.monitor_X_S.bt134);
            app_S.monitor.monitor_X_S.buttonBox7.add(app_S.monitor.monitor_X_S.bt141);
            app_S.monitor.monitor_X_S.buttonBox7.add(app_S.monitor.monitor_X_S.bt73);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox7);
            app_S.monitor.monitor_X_S.buttonBox8.add(app_S.monitor.monitor_X_S.bt80);
            app_S.monitor.monitor_X_S.buttonBox8.add(app_S.monitor.monitor_X_S.bt81);
            app_S.monitor.monitor_X_S.buttonBox8.add(app_S.monitor.monitor_X_S.bt82);
            app_S.monitor.monitor_X_S.buttonBox8.add(app_S.monitor.monitor_X_S.bt83);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox8);
            app_S.monitor.monitor_X_S.buttonBox9.add(app_S.monitor.monitor_X_S.bt84);
            app_S.monitor.monitor_X_S.buttonBox9.add(app_S.monitor.monitor_X_S.bt85);
            app_S.monitor.monitor_X_S.buttonBox9.add(app_S.monitor.monitor_X_S.bt86);
            app_S.monitor.monitor_X_S.buttonBox9.add(app_S.monitor.monitor_X_S.bt87);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox9);

            app_S.monitor.monitor_X_S.buttonBox10.add(app_S.monitor.monitor_X_S.bt88);
            app_S.monitor.monitor_X_S.buttonBox10.add(app_S.monitor.monitor_X_S.bt142);
            app_S.monitor.monitor_X_S.buttonBox10.add(app_S.monitor.monitor_X_S.bt143);
            app_S.monitor.monitor_X_S.buttonBox10.add(app_S.monitor.monitor_X_S.bt92);
            app_S.monitor.monitor_X_S.buttonBox11.add(app_S.monitor.monitor_X_S.bt111);
            app_S.monitor.monitor_X_S.buttonBox11.add(app_S.monitor.monitor_X_S.bt112);
            app_S.monitor.monitor_X_S.buttonBox11.add(app_S.monitor.monitor_X_S.bt113);
            app_S.monitor.monitor_X_S.buttonBox11.add(app_S.monitor.monitor_X_S.bt114);

            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox10);
            app_S.monitor.monitor_X_S.sliderBox.add(app_S.monitor.monitor_X_S.buttonBox11);

            app_S.monitor.monitor_X_S.sliderBox.setBounds(910, 15, 400, 750);
            containerPanel.add(app_S.monitor);
            containerPanel.add(app_S.monitor.monitor_X_S.sliderBox);
            containerPanel.setName("智能视觉");
            jTabbedpane.addTab(containerPanel.getName(), new ImageIcon()
                , containerPanel, containerPanel.getName());// 加入第一个页面
            Color[] colors = TableRender.getTableCellRender();
            jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1
                , colors[jTabbedpane.getTabCount() % 3]);
            jTabbedpane.validate();
            isFinished = true;
            if (null != app_S.monitor) {
                if (null != app_S.monitor.monitor_X_S) {
                    while (0 == app_S.monitor.monitor_X_S.stop) {//later
                        DetaThread.sleepDeta(125);
                        Graphics g = app_S.monitor.getGraphics();
                        if (g != null) {
                            app_S.monitor.paint(g);
                        }
                    }
                }
            }
        } catch (InterruptedException e) {
            jTabbedpane.validate();
        }
    }
}
