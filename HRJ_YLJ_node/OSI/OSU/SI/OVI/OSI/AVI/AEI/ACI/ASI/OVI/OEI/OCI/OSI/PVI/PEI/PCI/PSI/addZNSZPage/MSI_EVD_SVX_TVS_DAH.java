package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZNSZPage;

import C_A.ME.analysis.C.A;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import ME.VPC.S.ne.WindowsUI;
import M_V.MVQ.tabbedpane.DetabbedPane;
import U_A.PEU.P.wave.DFT;
import exception.thread.DetaThread;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;

public class MSI_EVD_SVX_TVS_DAH extends Thread implements Runnable {
    public Container jpanelFourth;
    public App_S u;
    public DetabbedPane jTabbedpane;
    public List<String> tabNames;
    public A _A;
    public Map<String, String> pos;
    public Map<String, String> pose;
    public Map<String, String> etc;
    public Map<String, String> cte;
    public JSlider slider2 = new JSlider(0, 360);
    public JSlider slider3 = new JSlider(0, 360);
    public JSlider slider4 = new JSlider(0, 360);
    public JSlider slider5 = new JSlider(0, 360);
    public JSlider slider6 = new JSlider(0, 360);
    public JSlider slider7 = new JSlider(0, 360);
    public JSlider slider8 = new JSlider(0, 360);
    public JSlider slider16 = new JSlider(0, 360);
    public JSlider slider32 = new JSlider(0, 360);
    public JSlider slider64 = new JSlider(0, 360);
    public JSlider slider128 = new JSlider(0, 360);
    public JSlider slider256 = new JSlider(0, 360);
    public JSlider slider512 = new JSlider(0, 360);

    public int source2 = 0;
    public int source3 = 0;
    public int source4 = 0;
    public int source5 = 0;
    public int source6 = 0;
    public int source7 = 0;
    public int source8 = 0;
    public int source16 = 0;
    public int source32 = 0;
    public int source64 = 0;
    public int source128 = 0;
    public int source256 = 0;
    public int source512 = 0;
    App NE;
    public MSI_EVD_SVX_TVS_DAH(A _A, Container jpanelFourth, App_S u2
        , DetabbedPane jTabbedpane, List<String> tabNames2, Map<String, String> pos
        , Map<String, String> pose, Map<String, String> etc, Map<String, String> cte, App app_NE) {
        super();
        this.jpanelFourth = jpanelFourth;
        this.u = u2;
        this.tabNames = tabNames2;
        this.jTabbedpane = jTabbedpane;
        this._A = _A;
        this.pos = pos;
        this.pose = pose;
        this.etc = etc;
        this.cte = cte;
        NE= app_NE;
    }

    public void run() {
        jTabbedpane.validate();
        DetaThread.sleepDeta(10 * 60);
        jpanelFourth.setLayout(null);
        jpanelFourth.setBounds(0, 0, 1446, 980);
        //
        slider2.setSnapToTicks(true);
        slider2.setPaintTicks(true);
        slider2.setMajorTickSpacing(5);
        slider2.setMinorTickSpacing(1);
        slider2.setBackground(Color.black);
        slider2.setForeground(Color.white);
        slider2.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source2 = source.getValue();
                }
            });

        slider3.setSnapToTicks(true);
        slider3.setPaintTicks(true);
        slider3.setMajorTickSpacing(5);
        slider3.setMinorTickSpacing(1);
        slider3.setBackground(Color.black);
        slider3.setForeground(Color.white);
        slider3.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source3 = source.getValue();
                }
            });
        slider4.setSnapToTicks(true);
        slider4.setPaintTicks(true);
        slider4.setMajorTickSpacing(5);
        slider4.setMinorTickSpacing(1);
        slider4.setBackground(Color.black);
        slider4.setForeground(Color.white);
        slider4.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source4 = source.getValue();
                }
            });
        slider5.setSnapToTicks(true);
        slider5.setPaintTicks(true);
        slider5.setMajorTickSpacing(5);
        slider5.setMinorTickSpacing(1);
        slider5.setBackground(Color.black);
        slider5.setForeground(Color.white);
        slider5.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source5 = source.getValue();
                }
            });
        slider6.setSnapToTicks(true);
        slider6.setPaintTicks(true);
        slider6.setMajorTickSpacing(5);
        slider6.setMinorTickSpacing(1);
        slider6.setBackground(Color.black);
        slider6.setForeground(Color.white);
        slider6.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source6 = source.getValue();
                }
            });
        slider7.setSnapToTicks(true);
        slider7.setPaintTicks(true);
        slider7.setMajorTickSpacing(5);
        slider7.setMinorTickSpacing(1);
        slider7.setBackground(Color.black);
        slider7.setForeground(Color.white);
        slider7.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source7 = source.getValue();
                }
            });
        slider8.setSnapToTicks(true);
        slider8.setPaintTicks(true);
        slider8.setMajorTickSpacing(5);
        slider8.setMinorTickSpacing(1);
        slider8.setBackground(Color.black);
        slider8.setForeground(Color.white);
        slider8.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source8 = source.getValue();
                }
            });
        slider16.setSnapToTicks(true);
        slider16.setPaintTicks(true);
        slider16.setMajorTickSpacing(5);
        slider16.setMinorTickSpacing(1);
        slider16.setBackground(Color.black);
        slider16.setForeground(Color.white);
        slider16.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source16 = source.getValue();
                }
            });
        slider32.setSnapToTicks(true);
        slider32.setPaintTicks(true);
        slider32.setMajorTickSpacing(5);
        slider32.setMinorTickSpacing(1);
        slider32.setBackground(Color.black);
        slider32.setForeground(Color.white);
        slider32.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source32 = source.getValue();
                }
            });
        slider64.setSnapToTicks(true);
        slider64.setPaintTicks(true);
        slider64.setMajorTickSpacing(5);
        slider64.setMinorTickSpacing(1);
        slider64.setBackground(Color.black);
        slider64.setForeground(Color.white);
        slider64.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source64 = source.getValue();
                }
            });
        slider128.setSnapToTicks(true);
        slider128.setPaintTicks(true);
        slider128.setMajorTickSpacing(5);
        slider128.setMinorTickSpacing(1);
        slider128.setBackground(Color.black);
        slider128.setForeground(Color.white);
        slider128.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source128 = source.getValue();
                }
            });
        slider256.setSnapToTicks(true);
        slider256.setPaintTicks(true);
        slider256.setMajorTickSpacing(5);
        slider256.setMinorTickSpacing(1);
        slider256.setBackground(Color.black);
        slider256.setForeground(Color.white);
        slider256.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source256 = source.getValue();
                }
            });
        slider512.setSnapToTicks(true);
        slider512.setPaintTicks(true);
        slider512.setMajorTickSpacing(5);
        slider512.setMinorTickSpacing(1);
        slider512.setBackground(Color.black);
        slider512.setForeground(Color.white);
        slider512.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    source512 = source.getValue();
                }
            });
        Box sliderBox2 = new Box(BoxLayout.X_AXIS);
        Box sliderBox3 = new Box(BoxLayout.X_AXIS);
        Box sliderBox4 = new Box(BoxLayout.X_AXIS);
        Box sliderBox5 = new Box(BoxLayout.X_AXIS);
        Box sliderBox6 = new Box(BoxLayout.X_AXIS);
        Box sliderBox8 = new Box(BoxLayout.X_AXIS);
        Box sliderBox16 = new Box(BoxLayout.X_AXIS);
        Box sliderBox32 = new Box(BoxLayout.X_AXIS);
        Box sliderBox64 = new Box(BoxLayout.X_AXIS);
        Box sliderBox128 = new Box(BoxLayout.X_AXIS);
        Box sliderBox256 = new Box(BoxLayout.X_AXIS);
        Box sliderBox512 = new Box(BoxLayout.X_AXIS);
        sliderBox2.add(slider2);
        sliderBox3.add(slider3);
        sliderBox4.add(slider4);
        sliderBox5.add(slider5);
        sliderBox6.add(slider6);
        sliderBox8.add(slider8);
        sliderBox16.add(slider16);
        sliderBox32.add(slider32);
        sliderBox64.add(slider64);
        sliderBox128.add(slider128);
        sliderBox256.add(slider256);
        sliderBox512.add(slider512);
        sliderBox2.add(new Label("频率002HZ"));
        sliderBox3.add(new Label("频率003HZ"));
        sliderBox4.add(new Label("频率004HZ"));
        sliderBox5.add(new Label("频率005HZ"));
        sliderBox6.add(new Label("频率006HZ"));
        sliderBox8.add(new Label("频率008HZ"));
        sliderBox16.add(new Label("频率016HZ"));
        sliderBox32.add(new Label("频率032HZ"));
        sliderBox64.add(new Label("频率064HZ"));
        sliderBox128.add(new Label("频率128HZ"));
        sliderBox256.add(new Label("频率256HZ"));
        sliderBox512.add(new Label("频率512HZ"));
        Box sliderBox = new Box(BoxLayout.Y_AXIS);
        sliderBox.add(sliderBox2);
        sliderBox.add(sliderBox3);
        sliderBox.add(sliderBox4);
        sliderBox.add(sliderBox5);
        sliderBox.add(sliderBox6);
        sliderBox.add(sliderBox8);
        sliderBox.add(sliderBox16);
        sliderBox.add(sliderBox32);
        sliderBox.add(sliderBox64);
        sliderBox.add(sliderBox128);
        sliderBox.add(sliderBox256);
        sliderBox.add(sliderBox512);
        sliderBox.setBounds(500, 0, 50, 400);
        JPanel panel_sc = new JPanel();
        JPanel panel_scm = new JPanel();
        panel_scm.setLayout(new GridLayout(5, 1));
        panel_sc.add(sliderBox);
//		panel_scm.add(labela);
//		panel_scm.add(labelo);
//		panel_scm.add(labele);
//		panel_scm.add(labeli);
//		panel_scm.add(labelu);
        JScrollPane jsp_panel_sc = new JScrollPane(panel_sc);
        JScrollPane jsp_panel_scm = new JScrollPane(panel_scm);
        jsp_panel_sc.setBounds(1050 + 30, 15, 235, 330 + 20);
        jsp_panel_scm.setBounds(1050 + 30, 350 + 20, 235, 368 - 33 - 28 - 50);
        DFT dFt = new DFT();
        dFt.IV_(1024);
        BufferedImage imageForOutput = new BufferedImage(1400, 700, BufferedImage.TYPE_INT_RGB);
        //jp jp1= new jp(jpanelFourth, dFt, app.app_S.text, imageForOutput, this);
        JpZNSZ jp1 = new JpZNSZ(jpanelFourth, dFt, u.text, imageForOutput, NE);
        jp1.setVisible(true);
        jp1.setBounds(0 + 10, 15, 1040 + 20, 640 - 30);
        JButton zc = new JButton("智能声诊");
        zc.setBounds(WindowsUI.makeContainerWidth, 15, 100, 50);
        jpanelFourth.add(zc);
        jpanelFourth.add(jp1);
        jpanelFourth.add(jsp_panel_sc);
        jpanelFourth.add(jsp_panel_scm);
        jpanelFourth.setName(tabNames.get(3));
        jTabbedpane.addTab(tabNames.get(3), new ImageIcon(), jpanelFourth, "智能声诊页");// 锟斤拷锟斤拷锟揭伙拷锟揭筹拷锟
        Color[] colors = new Color[3];
        colors[0] = new Color(253, 233, 254);
        colors[1] = new Color(233, 254, 234);
        colors[2] = new Color(255, 251, 232);
        jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1, colors[jTabbedpane.getTabCount() % 3]);
        jTabbedpane.validate();
    }
}
