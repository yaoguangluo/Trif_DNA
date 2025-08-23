package O_V.OPM.ESU.admin;

import ME.VPC.M.app.App;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class YouBiaoSectionPanel extends JPanel {

    /**
     * 罗瑶光
     */

    public String[] tabNames = {"中药本草", "数据分析", "智能相诊", "智能声诊",
        "位术数", "西医内科", "中医方剂", "中医诊断",
        "古籍", "中医生殖", "西医妇幼", "西医急诊",
        "大外科", "中医外伤", "西药处方", "编辑页",
        "哈里森内科", "五官科", "男科", "老年科", "传染科", "新生儿科",
        "麻醉科", "精神科", "脑外科", "现代护理", "核医学", "肿瘤科", "西医骨伤", "遗传学"};
    public JCheckBox jlabel_box[];
    public boolean[] tabNamesHook = new boolean[30];
    public boolean isConfig = true;
    public JCheckBox jlabel_end_boxs;
    public JCheckBox jlabel_end_boxs1;
    public JCheckBox jlabel_end_boxs2;
    public JCheckBox jlabel_end_boxs3;
    public JCheckBox jlabel_peizhi_di25;
    public JTextPane jTextPane;
    public JCheckBox jlabel_peizhi_di2511;
    @SuppressWarnings("unused")
    private JCheckBox jlabel_peizhi_di2512;
    @SuppressWarnings("unused")
    private JCheckBox jlabel_peizhi_di2513;
    //	private JComponent jlabelpeizhi2255;
//	private JComponent jlabelpeizhi2256;
//	private JComponent jlabelpeizhi2257;
    @SuppressWarnings("unused")
    private JCheckBox jlabel_peizhi_di2515;
    @SuppressWarnings("unused")
    private App appInThisClass;

    public YouBiaoSectionPanel(App app) {
//		initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB5.txt", 5);
//		initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt", 6);
//		initDeciphring("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_17.txt", 17);
        appInThisClass = app;
        jlabel_box = new JCheckBox[30];
        this.setLayout(null);
        this.setBounds(0, 0, 800, 600);
        this.setBackground(Color.BLACK);
        //copy tab

        JLabel fourInitonsIcderosion = new JLabel("fourInitonsIcd浓度" + ":");
        fourInitonsIcderosion.setForeground(Color.white);
        fourInitonsIcderosion.setBounds(10 + 0 * 130, 20 + 25 * 0, 150, 25);
        JTextField fourInitonsIcderosionJTextField = new JTextField();
        fourInitonsIcderosionJTextField.setBounds(10 + 0 * 130 + 110, 20 + 25 * 0, 50, 25);
        fourInitonsIcderosionJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanFuTxt = fourInitonsIcderosionJTextField.getText().trim();
            }
        });
        fourInitonsIcderosionJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanFuTxt = fourInitonsIcderosionJTextField.getText().trim();
            }
        });
        fourInitonsIcderosionJTextField.setText("5");
        appInThisClass.app_S.fourInitonSuanFuTxt = "5";
        this.add(fourInitonsIcderosion);
        this.add(fourInitonsIcderosionJTextField);

        JLabel fourInitonsAcderosion = new JLabel("fourInitonsAcd浓度" + ":");
        fourInitonsAcderosion.setForeground(Color.white);
        fourInitonsAcderosion.setBounds(10 + 2 * 90, 20 + 25 * 0, 150, 25);
        JTextField fourInitonsAcderosionJTextField = new JTextField();
        fourInitonsAcderosionJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 0, 50, 25);
        fourInitonsAcderosionJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianFuTxt = fourInitonsAcderosionJTextField.getText().trim();
            }
        });
        fourInitonsAcderosionJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianFuTxt = fourInitonsAcderosionJTextField.getText().trim();
            }
        });
        fourInitonsAcderosionJTextField.setText("95");
        appInThisClass.app_S.fourInitonJianFuTxt = "95";
        this.add(fourInitonsAcderosion);
        this.add(fourInitonsAcderosionJTextField);

        JLabel sixteenInitonsAcderosion = new JLabel("sixteenInitonsAcd浓度" + ":");
        sixteenInitonsAcderosion.setForeground(Color.white);
        sixteenInitonsAcderosion.setBounds(10 + 4 * 90, 20 + 25 * 0, 150, 25);
        JTextField sixteenInitonsAcderosionJTextField = new JTextField();
        sixteenInitonsAcderosionJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 0, 50, 25);
        sixteenInitonsAcderosionJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianFuTxt = sixteenInitonsAcderosionJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosionJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianFuTxt = sixteenInitonsAcderosionJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosionJTextField.setText("5");
        appInThisClass.app_S.sixteenInitonJianFuTxt = "5";
        this.add(sixteenInitonsAcderosion);
        this.add(sixteenInitonsAcderosionJTextField);


        JLabel sixteenInitonsIcderosion = new JLabel("sixteenInitonsIcd浓度" + ":");
        sixteenInitonsIcderosion.setForeground(Color.white);
        sixteenInitonsIcderosion.setBounds(10 + 6 * 90, 20 + 25 * 0, 150, 25);
        JTextField sixteenInitonsIcderosionJTextField = new JTextField();
        sixteenInitonsIcderosionJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 0, 50, 25);
        sixteenInitonsIcderosionJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanFuTxt = sixteenInitonsIcderosionJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosionJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanFuTxt = sixteenInitonsIcderosionJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosionJTextField.setText("95");
        appInThisClass.app_S.sixteenInitonSuanFuTxt = "95";
        this.add(sixteenInitonsIcderosion);
        this.add(sixteenInitonsIcderosionJTextField);

        //pixGate
        //pixRatio
        //像素精值

        JLabel fourInitonsIcdErosionPixGate = new JLabel("fourInitonsIcdpixGate" + ":");
        fourInitonsIcdErosionPixGate.setForeground(Color.white);
        fourInitonsIcdErosionPixGate.setBounds(10 + 0 * 150, 20 + 25 * 1, 150, 25);
        JTextField fourInitonsIcdErosionPixGateJTextField = new JTextField();
        fourInitonsIcdErosionPixGateJTextField.setBounds(10 + 0 * 150 + 110, 20 + 25 * 1, 50, 25);
        fourInitonsIcdErosionPixGateJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanFaTxt = fourInitonsIcdErosionPixGateJTextField.getText().trim();
            }
        });
        fourInitonsIcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanFaTxt = fourInitonsIcdErosionPixGateJTextField.getText().trim();
            }
        });
        fourInitonsIcdErosionPixGateJTextField.setText("10");
        appInThisClass.app_S.fourInitonSuanFaTxt = "10";
        this.add(fourInitonsIcdErosionPixGate);
        this.add(fourInitonsIcdErosionPixGateJTextField);

        JLabel fourInitonsIcderosionpixRatio = new JLabel("fourInitonsIcdpixRatio" + ":");
        fourInitonsIcderosionpixRatio.setForeground(Color.white);
        fourInitonsIcderosionpixRatio.setBounds(10 + 0 * 150, 20 + 25 * 2, 150, 25);
        JTextField fourInitonsIcderosionpixRatioJTextField = new JTextField();
        fourInitonsIcderosionpixRatioJTextField.setBounds(10 + 0 * 150 + 110, 20 + 25 * 2, 50, 25);
        fourInitonsIcderosionpixRatioJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanBiTxt = fourInitonsIcderosionpixRatioJTextField.getText().trim();
            }
        });
        fourInitonsIcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanBiTxt = fourInitonsIcderosionpixRatioJTextField.getText().trim();
            }
        });
        fourInitonsIcderosionpixRatioJTextField.setText("5");
        appInThisClass.app_S.fourInitonSuanBiTxt = "5";
        this.add(fourInitonsIcderosionpixRatio);
        this.add(fourInitonsIcderosionpixRatioJTextField);

        JLabel fourInitonsIcderosion像素精度 = new JLabel("fourInitonsIcd像素精度" + ":");
        fourInitonsIcderosion像素精度.setForeground(Color.white);
        fourInitonsIcderosion像素精度.setBounds(10 + 0 * 150, 20 + 25 * 3, 150, 25);
        JTextField fourInitonsIcderosion像素精度JTextField = new JTextField();
        fourInitonsIcderosion像素精度JTextField.setBounds(10 + 0 * 150 + 110, 20 + 25 * 3, 50, 25);
        fourInitonsIcderosion像素精度JTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanJingTxt = fourInitonsIcderosion像素精度JTextField.getText().trim();
            }
        });
        fourInitonsIcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanJingTxt = fourInitonsIcderosion像素精度JTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素精度JTextField.setText("8");
        appInThisClass.app_S.fourInitonSuanJingTxt = "8";
        this.add(fourInitonsIcderosion像素精度);
        this.add(fourInitonsIcderosion像素精度JTextField);

        JLabel fourInitonsIcderosion像素PCA = new JLabel("fourInitonsIcd像素PCA" + ":");
        fourInitonsIcderosion像素PCA.setForeground(Color.white);
        fourInitonsIcderosion像素PCA.setBounds(10 + 0 * 150, 20 + 25 * 4, 150, 25);
        JTextField fourInitonsIcderosion像素PCAJTextField = new JTextField();
        fourInitonsIcderosion像素PCAJTextField.setBounds(10 + 0 * 150 + 110, 20 + 25 * 4, 50, 25);
        fourInitonsIcderosion像素PCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanPCATxt = fourInitonsIcderosion像素PCAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素PCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanPCATxt = fourInitonsIcderosion像素PCAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素PCAJTextField.setText("25");
        appInThisClass.app_S.fourInitonSuanPCATxt = "25";
        this.add(fourInitonsIcderosion像素PCA);
        this.add(fourInitonsIcderosion像素PCAJTextField);


        JLabel fourInitonsIcderosion像素ICA = new JLabel("fourInitonsIcd像素ICA" + ":");
        fourInitonsIcderosion像素ICA.setForeground(Color.white);
        fourInitonsIcderosion像素ICA.setBounds(10 + 0 * 150, 20 + 25 * 5, 150, 25);
        JTextField fourInitonsIcderosion像素ICAJTextField = new JTextField();
        fourInitonsIcderosion像素ICAJTextField.setBounds(10 + 0 * 150 + 110, 20 + 25 * 5, 50, 25);
        fourInitonsIcderosion像素ICAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanICATxt = fourInitonsIcderosion像素ICAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素ICAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanICATxt = fourInitonsIcderosion像素ICAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素ICAJTextField.setText("15");
        appInThisClass.app_S.fourInitonSuanICATxt = "15";
        this.add(fourInitonsIcderosion像素ICA);
        this.add(fourInitonsIcderosion像素ICAJTextField);

        JLabel fourInitonsIcderosion像素ECA = new JLabel("fourInitonsIcd像素ECA" + ":");
        fourInitonsIcderosion像素ECA.setForeground(Color.white);
        fourInitonsIcderosion像素ECA.setBounds(10 + 0 * 150, 20 + 25 * 6, 150, 25);
        JTextField fourInitonsIcderosion像素ECAJTextField = new JTextField();
        fourInitonsIcderosion像素ECAJTextField.setBounds(10 + 0 * 150 + 110, 20 + 25 * 6, 50, 25);
        fourInitonsIcderosion像素ECAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanECATxt = fourInitonsIcderosion像素ECAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素ECAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanECATxt = fourInitonsIcderosion像素ECAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素ECAJTextField.setText("20");
        appInThisClass.app_S.fourInitonSuanECATxt = "20";
        this.add(fourInitonsIcderosion像素ECA);
        this.add(fourInitonsIcderosion像素ECAJTextField);

        JLabel fourInitonsIcderosion像素UPCA = new JLabel("fourInitonsIcd像素UPCA" + ":");
        fourInitonsIcderosion像素UPCA.setForeground(Color.white);
        fourInitonsIcderosion像素UPCA.setBounds(10 + 0 * 150, 20 + 25 * 7, 150, 25);
        JTextField fourInitonsIcderosion像素UPCAJTextField = new JTextField();
        fourInitonsIcderosion像素UPCAJTextField.setBounds(10 + 0 * 150 + 110, 20 + 25 * 7, 50, 25);
        fourInitonsIcderosion像素UPCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanUPCATxt = fourInitonsIcderosion像素UPCAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素UPCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanUPCATxt = fourInitonsIcderosion像素UPCAJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion像素UPCAJTextField.setText("15");
        appInThisClass.app_S.fourInitonSuanUPCATxt = "15";
        this.add(fourInitonsIcderosion像素UPCA);
        this.add(fourInitonsIcderosion像素UPCAJTextField);
        ///////////////////////////////////////////////////////////////////////////////////////////

        //pixGate
        //pixRatio
        //像素精值
        JLabel fourInitonsAcdErosionPixGate = new JLabel("fourInitonsAcdpixGate" + ":");
        fourInitonsAcdErosionPixGate.setForeground(Color.white);
        fourInitonsAcdErosionPixGate.setBounds(10 + 2 * 90, 20 + 25 * 1, 150, 25);
        JTextField fourInitonsAcdErosionPixGateJTextField = new JTextField();
        fourInitonsAcdErosionPixGateJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 1, 50, 25);
        fourInitonsAcdErosionPixGateJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianFaTxt = fourInitonsAcdErosionPixGateJTextField.getText().trim();
            }
        });
        fourInitonsAcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianFaTxt = fourInitonsAcdErosionPixGateJTextField.getText().trim();
            }
        });
        fourInitonsAcdErosionPixGateJTextField.setText("10");
        appInThisClass.app_S.fourInitonJianFaTxt = "10";
        this.add(fourInitonsAcdErosionPixGate);
        this.add(fourInitonsAcdErosionPixGateJTextField);

        JLabel fourInitonsAcderosionpixRatio = new JLabel("fourInitonsAcdpixRatio" + ":");
        fourInitonsAcderosionpixRatio.setForeground(Color.white);
        fourInitonsAcderosionpixRatio.setBounds(10 + 2 * 90, 20 + 25 * 2, 150, 25);
        JTextField fourInitonsAcderosionpixRatioJTextField = new JTextField();
        fourInitonsAcderosionpixRatioJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 2, 50, 25);
        fourInitonsAcderosionpixRatioJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianBiTxt = fourInitonsAcderosionpixRatioJTextField.getText().trim();
            }
        });
        fourInitonsAcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianBiTxt = fourInitonsAcderosionpixRatioJTextField.getText().trim();
            }
        });
        fourInitonsAcderosionpixRatioJTextField.setText("8");
        appInThisClass.app_S.fourInitonJianBiTxt = "8";
        this.add(fourInitonsAcderosionpixRatio);
        this.add(fourInitonsAcderosionpixRatioJTextField);

        JLabel fourInitonsAcderosion像素精度 = new JLabel("fourInitonsAcd像素精度" + ":");
        fourInitonsAcderosion像素精度.setForeground(Color.white);
        fourInitonsAcderosion像素精度.setBounds(10 + 2 * 90, 20 + 25 * 3, 150, 25);
        JTextField fourInitonsAcderosion像素精度JTextField = new JTextField();
        fourInitonsAcderosion像素精度JTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 3, 50, 25);
        fourInitonsAcderosion像素精度JTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianJingTxt = fourInitonsAcderosion像素精度JTextField.getText().trim();
            }
        });
        fourInitonsAcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianJingTxt = fourInitonsAcderosion像素精度JTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素精度JTextField.setText("8");
        appInThisClass.app_S.fourInitonJianJingTxt = "8";
        this.add(fourInitonsAcderosion像素精度);
        this.add(fourInitonsAcderosion像素精度JTextField);

        JLabel fourInitonsAcderosion像素PCA = new JLabel("fourInitonsAcd像素PCA" + ":");
        fourInitonsAcderosion像素PCA.setForeground(Color.white);
        fourInitonsAcderosion像素PCA.setBounds(10 + 2 * 90, 20 + 25 * 4, 150, 25);
        JTextField fourInitonsAcderosion像素PCAJTextField = new JTextField();
        fourInitonsAcderosion像素PCAJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 4, 50, 25);
        fourInitonsAcderosion像素PCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianPCATxt = fourInitonsAcderosion像素PCAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素PCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianPCATxt = fourInitonsAcderosion像素PCAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素PCAJTextField.setText("25");
        appInThisClass.app_S.fourInitonJianPCATxt = "25";
        this.add(fourInitonsAcderosion像素PCA);
        this.add(fourInitonsAcderosion像素PCAJTextField);


        JLabel fourInitonsAcderosion像素ICA = new JLabel("fourInitonsAcd像素ICA" + ":");
        fourInitonsAcderosion像素ICA.setForeground(Color.white);
        fourInitonsAcderosion像素ICA.setBounds(10 + 2 * 90, 20 + 25 * 5, 150, 25);
        JTextField fourInitonsAcderosion像素ICAJTextField = new JTextField();
        fourInitonsAcderosion像素ICAJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 5, 50, 25);
        fourInitonsAcderosion像素ICAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianICATxt = fourInitonsAcderosion像素ICAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素ICAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianICATxt = fourInitonsAcderosion像素ICAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素ICAJTextField.setText("15");
        appInThisClass.app_S.fourInitonJianICATxt = "15";
        this.add(fourInitonsAcderosion像素ICA);
        this.add(fourInitonsAcderosion像素ICAJTextField);

        JLabel fourInitonsAcderosion像素ECA = new JLabel("fourInitonsAcd像素ECA" + ":");
        fourInitonsAcderosion像素ECA.setForeground(Color.white);
        fourInitonsAcderosion像素ECA.setBounds(10 + 2 * 90, 20 + 25 * 6, 150, 25);
        JTextField fourInitonsAcderosion像素ECAJTextField = new JTextField();
        fourInitonsAcderosion像素ECAJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 6, 50, 25);
        fourInitonsAcderosion像素ECAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianECATxt = fourInitonsAcderosion像素ECAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素ECAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianECATxt = fourInitonsAcderosion像素ECAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素ECAJTextField.setText("20");
        appInThisClass.app_S.fourInitonJianECATxt = "20";
        this.add(fourInitonsAcderosion像素ECA);
        this.add(fourInitonsAcderosion像素ECAJTextField);

        JLabel fourInitonsAcderosion像素UPCA = new JLabel("fourInitonsAcd像素UPCA" + ":");
        fourInitonsAcderosion像素UPCA.setForeground(Color.white);
        fourInitonsAcderosion像素UPCA.setBounds(10 + 2 * 90, 20 + 25 * 7, 150, 25);
        JTextField fourInitonsAcderosion像素UPCAJTextField = new JTextField();
        fourInitonsAcderosion像素UPCAJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 7, 50, 25);
        fourInitonsAcderosion像素UPCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianUPCATxt = fourInitonsAcderosion像素UPCAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素UPCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianUPCATxt = fourInitonsAcderosion像素UPCAJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion像素UPCAJTextField.setText("15");
        appInThisClass.app_S.fourInitonJianUPCATxt = "15";
        this.add(fourInitonsAcderosion像素UPCA);
        this.add(fourInitonsAcderosion像素UPCAJTextField);
        ///////////////////////////////////////////////////////////////////////////////////////////

        //pixGate
        //pixRatio
        //像素精值
        JLabel sixteenInitonsAcdErosionPixGate = new JLabel("sixteenInitonsAcdpixGate" + ":");
        sixteenInitonsAcdErosionPixGate.setForeground(Color.white);
        sixteenInitonsAcdErosionPixGate.setBounds(10 + 4 * 90, 20 + 25 * 1, 150, 25);
        JTextField sixteenInitonsAcdErosionPixGateJTextField = new JTextField();
        sixteenInitonsAcdErosionPixGateJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 1, 50, 25);
        sixteenInitonsAcdErosionPixGateJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianFaTxt = sixteenInitonsAcdErosionPixGateJTextField.getText().trim();
            }
        });
        sixteenInitonsAcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianFaTxt = sixteenInitonsAcdErosionPixGateJTextField.getText().trim();
            }
        });
        sixteenInitonsAcdErosionPixGateJTextField.setText("10");
        appInThisClass.app_S.sixteenInitonJianFaTxt = "10";
        this.add(sixteenInitonsAcdErosionPixGate);
        this.add(sixteenInitonsAcdErosionPixGateJTextField);

        JLabel sixteenInitonsAcderosionpixRatio = new JLabel("sixteenInitonsAcdpixRatio" + ":");
        sixteenInitonsAcderosionpixRatio.setForeground(Color.white);
        sixteenInitonsAcderosionpixRatio.setBounds(10 + 4 * 90, 20 + 25 * 2, 150, 25);
        JTextField sixteenInitonsAcderosionpixRatioJTextField = new JTextField();
        sixteenInitonsAcderosionpixRatioJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 2, 50, 25);
        sixteenInitonsAcderosionpixRatioJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianBiTxt = sixteenInitonsAcderosionpixRatioJTextField.getText().trim();
            }
        });
        sixteenInitonsAcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianBiTxt = sixteenInitonsAcderosionpixRatioJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosionpixRatioJTextField.setText("2");
        appInThisClass.app_S.sixteenInitonJianBiTxt = "2";
        this.add(sixteenInitonsAcderosionpixRatio);
        this.add(sixteenInitonsAcderosionpixRatioJTextField);

        JLabel sixteenInitonsAcderosion像素精度 = new JLabel("sixteenInitonsAcd像素精度" + ":");
        sixteenInitonsAcderosion像素精度.setForeground(Color.white);
        sixteenInitonsAcderosion像素精度.setBounds(10 + 4 * 90, 20 + 25 * 3, 150, 25);
        JTextField sixteenInitonsAcderosion像素精度JTextField = new JTextField();
        sixteenInitonsAcderosion像素精度JTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 3, 50, 25);
        sixteenInitonsAcderosion像素精度JTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianJingTxt = sixteenInitonsAcderosion像素精度JTextField.getText().trim();
            }
        });
        sixteenInitonsAcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianJingTxt = sixteenInitonsAcderosion像素精度JTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素精度JTextField.setText("8");
        appInThisClass.app_S.sixteenInitonJianJingTxt = "8";
        this.add(sixteenInitonsAcderosion像素精度);
        this.add(sixteenInitonsAcderosion像素精度JTextField);

        JLabel sixteenInitonsAcderosion像素PCA = new JLabel("sixteenInitonsAcd像素PCA" + ":");
        sixteenInitonsAcderosion像素PCA.setForeground(Color.white);
        sixteenInitonsAcderosion像素PCA.setBounds(10 + 4 * 90, 20 + 25 * 4, 150, 25);
        JTextField sixteenInitonsAcderosion像素PCAJTextField = new JTextField();
        sixteenInitonsAcderosion像素PCAJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 4, 50, 25);
        sixteenInitonsAcderosion像素PCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianPCATxt = sixteenInitonsAcderosion像素PCAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素PCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianPCATxt = sixteenInitonsAcderosion像素PCAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素PCAJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonJianPCATxt = "1";
        this.add(sixteenInitonsAcderosion像素PCA);
        this.add(sixteenInitonsAcderosion像素PCAJTextField);


        JLabel sixteenInitonsAcderosion像素ICA = new JLabel("sixteenInitonsAcd像素ICA" + ":");
        sixteenInitonsAcderosion像素ICA.setForeground(Color.white);
        sixteenInitonsAcderosion像素ICA.setBounds(10 + 4 * 90, 20 + 25 * 5, 150, 25);
        JTextField sixteenInitonsAcderosion像素ICAJTextField = new JTextField();
        sixteenInitonsAcderosion像素ICAJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 5, 50, 25);
        sixteenInitonsAcderosion像素ICAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianICATxt = sixteenInitonsAcderosion像素ICAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素ICAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianICATxt = sixteenInitonsAcderosion像素ICAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素ICAJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonJianICATxt = "1";
        this.add(sixteenInitonsAcderosion像素ICA);
        this.add(sixteenInitonsAcderosion像素ICAJTextField);

        JLabel sixteenInitonsAcderosion像素ECA = new JLabel("sixteenInitonsAcd像素ECA" + ":");
        sixteenInitonsAcderosion像素ECA.setForeground(Color.white);
        sixteenInitonsAcderosion像素ECA.setBounds(10 + 4 * 90, 20 + 25 * 6, 150, 25);
        JTextField sixteenInitonsAcderosion像素ECAJTextField = new JTextField();
        sixteenInitonsAcderosion像素ECAJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 6, 50, 25);
        sixteenInitonsAcderosion像素ECAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianECATxt = sixteenInitonsAcderosion像素ECAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素ECAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianECATxt = sixteenInitonsAcderosion像素ECAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素ECAJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonJianECATxt = "1";
        this.add(sixteenInitonsAcderosion像素ECA);
        this.add(sixteenInitonsAcderosion像素ECAJTextField);

        JLabel sixteenInitonsAcderosion像素UPCA = new JLabel("sixteenInitonsAcd像素UPCA" + ":");
        sixteenInitonsAcderosion像素UPCA.setForeground(Color.white);
        sixteenInitonsAcderosion像素UPCA.setBounds(10 + 4 * 90, 20 + 25 * 7, 150, 25);
        JTextField sixteenInitonsAcderosion像素UPCAJTextField = new JTextField();
        sixteenInitonsAcderosion像素UPCAJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 7, 50, 25);
        sixteenInitonsAcderosion像素UPCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianUPCATxt = sixteenInitonsAcderosion像素UPCAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素UPCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianUPCATxt = sixteenInitonsAcderosion像素UPCAJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion像素UPCAJTextField.setText("45");
        appInThisClass.app_S.sixteenInitonJianUPCATxt = "45";
        this.add(sixteenInitonsAcderosion像素UPCA);
        this.add(sixteenInitonsAcderosion像素UPCAJTextField);
        ///////////////////////////////////////////////////////////////////////////////////////////


        //pixGate
        //pixRatio
        //像素精值
        JLabel sixteenInitonsIcdErosionPixGate = new JLabel("sixteenInitonsIcdpixGate" + ":");
        sixteenInitonsIcdErosionPixGate.setForeground(Color.white);
        sixteenInitonsIcdErosionPixGate.setBounds(10 + 6 * 90, 20 + 25 * 1, 150, 25);
        JTextField sixteenInitonsIcdErosionPixGateJTextField = new JTextField();
        sixteenInitonsIcdErosionPixGateJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 1, 50, 25);
        sixteenInitonsIcdErosionPixGateJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanFaTxt = sixteenInitonsIcdErosionPixGateJTextField.getText().trim();
            }
        });
        sixteenInitonsIcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanFaTxt = sixteenInitonsIcdErosionPixGateJTextField.getText().trim();
            }
        });
        sixteenInitonsIcdErosionPixGateJTextField.setText("10");
        appInThisClass.app_S.sixteenInitonSuanFaTxt = "10";
        this.add(sixteenInitonsIcdErosionPixGate);
        this.add(sixteenInitonsIcdErosionPixGateJTextField);

        JLabel sixteenInitonsIcderosionpixRatio = new JLabel("sixteenInitonsIcdpixRatio" + ":");
        sixteenInitonsIcderosionpixRatio.setForeground(Color.white);
        sixteenInitonsIcderosionpixRatio.setBounds(10 + 6 * 90, 20 + 25 * 2, 150, 25);
        JTextField sixteenInitonsIcderosionpixRatioJTextField = new JTextField();
        sixteenInitonsIcderosionpixRatioJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 2, 50, 25);
        sixteenInitonsIcderosionpixRatioJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanBiTxt = sixteenInitonsIcderosionpixRatioJTextField.getText().trim();
            }
        });
        sixteenInitonsIcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanBiTxt = sixteenInitonsIcderosionpixRatioJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosionpixRatioJTextField.setText("2");
        appInThisClass.app_S.sixteenInitonSuanBiTxt = "2";
        this.add(sixteenInitonsIcderosionpixRatio);
        this.add(sixteenInitonsIcderosionpixRatioJTextField);

        JLabel sixteenInitonsIcderosion像素精度 = new JLabel("sixteenInitonsIcd像素精度" + ":");
        sixteenInitonsIcderosion像素精度.setForeground(Color.white);
        sixteenInitonsIcderosion像素精度.setBounds(10 + 6 * 90, 20 + 25 * 3, 150, 25);
        JTextField sixteenInitonsIcderosion像素精度JTextField = new JTextField();
        sixteenInitonsIcderosion像素精度JTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 3, 50, 25);
        sixteenInitonsIcderosion像素精度JTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanJingTxt = sixteenInitonsIcderosion像素精度JTextField.getText().trim();
            }
        });
        sixteenInitonsIcdErosionPixGateJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanJingTxt = sixteenInitonsIcderosion像素精度JTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素精度JTextField.setText("8");
        appInThisClass.app_S.sixteenInitonSuanJingTxt = "8";
        this.add(sixteenInitonsIcderosion像素精度);
        this.add(sixteenInitonsIcderosion像素精度JTextField);

        JLabel sixteenInitonsIcderosion像素PCA = new JLabel("sixteenInitonsIcd像素PCA" + ":");
        sixteenInitonsIcderosion像素PCA.setForeground(Color.white);
        sixteenInitonsIcderosion像素PCA.setBounds(10 + 6 * 90, 20 + 25 * 4, 150, 25);
        JTextField sixteenInitonsIcderosion像素PCAJTextField = new JTextField();
        sixteenInitonsIcderosion像素PCAJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 4, 50, 25);
        sixteenInitonsIcderosion像素PCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanPCATxt = sixteenInitonsIcderosion像素PCAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素PCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanPCATxt = sixteenInitonsIcderosion像素PCAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素PCAJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonSuanPCATxt = "1";
        this.add(sixteenInitonsIcderosion像素PCA);
        this.add(sixteenInitonsIcderosion像素PCAJTextField);


        JLabel sixteenInitonsIcderosion像素ICA = new JLabel("sixteenInitonsIcd像素ICA" + ":");
        sixteenInitonsIcderosion像素ICA.setForeground(Color.white);
        sixteenInitonsIcderosion像素ICA.setBounds(10 + 6 * 90, 20 + 25 * 5, 150, 25);
        JTextField sixteenInitonsIcderosion像素ICAJTextField = new JTextField();
        sixteenInitonsIcderosion像素ICAJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 5, 50, 25);
        sixteenInitonsIcderosion像素ICAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanICATxt = sixteenInitonsIcderosion像素ICAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素ICAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanICATxt = sixteenInitonsIcderosion像素ICAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素ICAJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonSuanICATxt = "1";
        this.add(sixteenInitonsIcderosion像素ICA);
        this.add(sixteenInitonsIcderosion像素ICAJTextField);

        JLabel sixteenInitonsIcderosion像素ECA = new JLabel("sixteenInitonsIcd像素ECA" + ":");
        sixteenInitonsIcderosion像素ECA.setForeground(Color.white);
        sixteenInitonsIcderosion像素ECA.setBounds(10 + 6 * 90, 20 + 25 * 6, 150, 25);
        JTextField sixteenInitonsIcderosion像素ECAJTextField = new JTextField();
        sixteenInitonsIcderosion像素ECAJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 6, 50, 25);
        sixteenInitonsIcderosion像素ECAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanECATxt = sixteenInitonsIcderosion像素ECAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素ECAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanECATxt = sixteenInitonsIcderosion像素ECAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素ECAJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonSuanECATxt = "1";
        this.add(sixteenInitonsIcderosion像素ECA);
        this.add(sixteenInitonsIcderosion像素ECAJTextField);

        JLabel sixteenInitonsIcderosion像素UPCA = new JLabel("sixteenInitonsIcd像素UPCA" + ":");
        sixteenInitonsIcderosion像素UPCA.setForeground(Color.white);
        sixteenInitonsIcderosion像素UPCA.setBounds(10 + 6 * 90, 20 + 25 * 7, 150, 25);
        JTextField sixteenInitonsIcderosion像素UPCAJTextField = new JTextField();
        sixteenInitonsIcderosion像素UPCAJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 7, 50, 25);
        sixteenInitonsIcderosion像素UPCAJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanUPCATxt = sixteenInitonsIcderosion像素UPCAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素UPCAJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanUPCATxt = sixteenInitonsIcderosion像素UPCAJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion像素UPCAJTextField.setText("45");
        appInThisClass.app_S.sixteenInitonSuanUPCATxt = "45";
        this.add(sixteenInitonsIcderosion像素UPCA);
        this.add(sixteenInitonsIcderosion像素UPCAJTextField);


        /////////////////////////权重


        JLabel sixteenInitonsIcderosion权重scale = new JLabel("sixteenInitonsIcd权重scale" + ":");
        sixteenInitonsIcderosion权重scale.setForeground(Color.white);
        sixteenInitonsIcderosion权重scale.setBounds(10 + 6 * 90, 20 + 25 * 9, 150, 25);
        JTextField sixteenInitonsIcderosion权重scaleJTextField = new JTextField();
        sixteenInitonsIcderosion权重scaleJTextField.setBounds(10 + 6 * 90 + 110, 20 + 25 * 9, 50, 25);
        sixteenInitonsIcderosion权重scaleJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanScaleTxt = sixteenInitonsIcderosion权重scaleJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion权重scaleJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanScaleTxt = sixteenInitonsIcderosion权重scaleJTextField.getText().trim();
            }
        });
        sixteenInitonsIcderosion权重scaleJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonSuanScaleTxt = "1";
        this.add(sixteenInitonsIcderosion权重scale);
        this.add(sixteenInitonsIcderosion权重scaleJTextField);
        /////
        JLabel sixteenInitonsAcderosion权重scale = new JLabel("sixteenInitonsAcd权重scale" + ":");
        sixteenInitonsAcderosion权重scale.setForeground(Color.white);
        sixteenInitonsAcderosion权重scale.setBounds(10 + 4 * 90, 20 + 25 * 9, 150, 25);
        JTextField sixteenInitonsAcderosion权重scaleJTextField = new JTextField();
        sixteenInitonsAcderosion权重scaleJTextField.setBounds(10 + 4 * 90 + 110, 20 + 25 * 9, 50, 25);
        sixteenInitonsAcderosion权重scaleJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianScaleTxt = sixteenInitonsAcderosion权重scaleJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion权重scaleJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianScaleTxt = sixteenInitonsAcderosion权重scaleJTextField.getText().trim();
            }
        });
        sixteenInitonsAcderosion权重scaleJTextField.setText("1");
        appInThisClass.app_S.sixteenInitonJianScaleTxt = "1";
        this.add(sixteenInitonsAcderosion权重scale);
        this.add(sixteenInitonsAcderosion权重scaleJTextField);
        //////
        JLabel fourInitonsIcderosion权重scale = new JLabel("fourInitonsIcd蚀权重scale" + ":");
        fourInitonsIcderosion权重scale.setForeground(Color.white);
        fourInitonsIcderosion权重scale.setBounds(10 + 2 * 90, 20 + 25 * 9, 150, 25);
        JTextField fourInitonsIcderosion权重scaleJTextField = new JTextField();
        fourInitonsIcderosion权重scaleJTextField.setBounds(10 + 2 * 90 + 110, 20 + 25 * 9, 50, 25);
        fourInitonsIcderosion权重scaleJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanScaleTxt = fourInitonsIcderosion权重scaleJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion权重scaleJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanScaleTxt = fourInitonsIcderosion权重scaleJTextField.getText().trim();
            }
        });
        fourInitonsIcderosion权重scaleJTextField.setText("0.001");
        appInThisClass.app_S.fourInitonSuanScaleTxt = "0.001";
        this.add(fourInitonsIcderosion权重scale);
        this.add(fourInitonsIcderosion权重scaleJTextField);


        JLabel fourInitonsAcderosion权重scale = new JLabel("fourInitonsAcd蚀权重scale" + ":");
        fourInitonsAcderosion权重scale.setForeground(Color.white);
        fourInitonsAcderosion权重scale.setBounds(10 + 0 * 90, 20 + 25 * 9, 150, 25);
        JTextField fourInitonsAcderosion权重scaleJTextField = new JTextField();
        fourInitonsAcderosion权重scaleJTextField.setBounds(10 + 0 * 90 + 110, 20 + 25 * 9, 50, 25);
        fourInitonsAcderosion权重scaleJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianScaleTxt = fourInitonsAcderosion权重scaleJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion权重scaleJTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianScaleTxt = fourInitonsAcderosion权重scaleJTextField.getText().trim();
            }
        });
        fourInitonsAcderosion权重scaleJTextField.setText("1");
        appInThisClass.app_S.fourInitonJianScaleTxt = "1";
        this.add(fourInitonsAcderosion权重scale);
        this.add(fourInitonsAcderosion权重scaleJTextField);


        //file


        //shaohou
        JLabel fourInitonsIcderosiondeciphringAddress = new JLabel("fourInitonsIcderosiondeciphringAddress" + ":");
        fourInitonsIcderosiondeciphringAddress.setForeground(Color.white);
        fourInitonsIcderosiondeciphringAddress.setBounds(10 + 0 * 150, 20 + 25 * 13, 150, 50);

        JTextField fourInitonsIcderosiondeciphringAddressJTextField = new JTextField();
        fourInitonsIcderosiondeciphringAddressJTextField.setBounds(10 + 0 * 150 + 160, 20 + 25 * 13, 550, 50);
        fourInitonsIcderosiondeciphringAddressJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonSuanTxt = fourInitonsIcderosiondeciphringAddressJTextField.getText().trim();
            }
        });
        fourInitonsIcderosiondeciphringAddressJTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonSuanTxt = fourInitonsIcderosiondeciphringAddressJTextField.getText().trim();
            }
        });
        fourInitonsIcderosiondeciphringAddressJTextField.setText("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt");
        appInThisClass.app_S.fourInitonSuanTxt = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6.txt";
        this.add(fourInitonsIcderosiondeciphringAddress);
        this.add(fourInitonsIcderosiondeciphringAddressJTextField);

        //
        JLabel fourInitonsAcdErosionDeciphringAddress = new JLabel("fourInitonsAcderosiondeciphringAddress" + ":");
        fourInitonsAcdErosionDeciphringAddress.setForeground(Color.white);
        fourInitonsAcdErosionDeciphringAddress.setBounds(10 + 0 * 150, 20 + 25 * 16, 150, 50);

        JTextField fourInitonsAcdErosionDeciphringAddressJTextField = new JTextField();
        fourInitonsAcdErosionDeciphringAddressJTextField.setBounds(10 + 0 * 150 + 160, 20 + 25 * 16, 550, 50);
        fourInitonsAcdErosionDeciphringAddressJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.fourInitonJianTxt = fourInitonsAcdErosionDeciphringAddressJTextField.getText().trim();
            }
        });
        fourInitonsAcdErosionDeciphringAddressJTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.fourInitonJianTxt = fourInitonsAcdErosionDeciphringAddressJTextField.getText().trim();
            }
        });
        fourInitonsAcdErosionDeciphringAddressJTextField.setText("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB5.txt");
        appInThisClass.app_S.fourInitonJianTxt = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB5.txt";
        this.add(fourInitonsAcdErosionDeciphringAddress);
        this.add(fourInitonsAcdErosionDeciphringAddressJTextField);

        //
        //sixteenInitonsIcderosion地址
        JLabel sixteenInitonsIcdErosionDeciphringAddress = new JLabel("sixteenInitonsIcderosiondeciphringAddress" + ":");
        sixteenInitonsIcdErosionDeciphringAddress.setForeground(Color.white);
        sixteenInitonsIcdErosionDeciphringAddress.setBounds(10 + 0 * 150, 20 + 25 * 19, 150, 50);

        JTextField sixteenInitonsIcdErosionDeciphringAddressJTextField = new JTextField();
        sixteenInitonsIcdErosionDeciphringAddressJTextField.setBounds(10 + 0 * 150 + 160, 20 + 25 * 19, 550, 50);
        sixteenInitonsIcdErosionDeciphringAddressJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonSuanTxt = sixteenInitonsIcdErosionDeciphringAddressJTextField.getText().trim();
            }
        });
        sixteenInitonsIcdErosionDeciphringAddressJTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonSuanTxt = sixteenInitonsIcdErosionDeciphringAddressJTextField.getText().trim();
            }
        });
        sixteenInitonsIcdErosionDeciphringAddressJTextField.setText("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_suan_17.txt");
        appInThisClass.app_S.sixteenInitonSuanTxt = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_suan_17.txt";
        this.add(sixteenInitonsIcdErosionDeciphringAddress);
        this.add(sixteenInitonsIcdErosionDeciphringAddressJTextField);


        //sixteenInitonsAcderosion地址
        JLabel sixteenInitonsAcdErosionDeciphringAddress = new JLabel("sixteenInitonsAcderosiondeciphringAddress" + ":");
        sixteenInitonsAcdErosionDeciphringAddress.setForeground(Color.white);
        sixteenInitonsAcdErosionDeciphringAddress.setBounds(10 + 0 * 150, 20 + 25 * 22, 150, 50);

        JTextField sixteenInitonsAcdErosionDeciphringAddressJTextField = new JTextField();
        sixteenInitonsAcdErosionDeciphringAddressJTextField.setBounds(10 + 0 * 150 + 160, 20 + 25 * 22, 550, 50);
        sixteenInitonsAcdErosionDeciphringAddressJTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                appInThisClass.app_S.sixteenInitonJianTxt = sixteenInitonsAcdErosionDeciphringAddressJTextField.getText().trim();
            }
        });
        sixteenInitonsAcdErosionDeciphringAddressJTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.sixteenInitonJianTxt = sixteenInitonsAcdErosionDeciphringAddressJTextField.getText().trim();
            }
        });
        sixteenInitonsAcdErosionDeciphringAddressJTextField.setText("C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_jian_17.txt");
        appInThisClass.app_S.sixteenInitonJianTxt = "C:/Users/yaogu/Desktop/project/开源门户/deciphering/F_DB6_jian_17.txt";
        this.add(sixteenInitonsAcdErosionDeciphringAddress);
        this.add(sixteenInitonsAcdErosionDeciphringAddressJTextField);


    }

}
