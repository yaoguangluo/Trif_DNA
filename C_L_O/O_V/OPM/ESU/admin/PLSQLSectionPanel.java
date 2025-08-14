package O_V.OPM.ESU.admin;

import ME.VPC.M.app.App;
import YLJ_HRJ.ME.VPC.S.configs.ConfigIndex;

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
public class PLSQLSectionPanel extends JPanel {

    /**
     *
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

    public PLSQLSectionPanel(App app) {
        appInThisClass = app;
        jlabel_box = new JCheckBox[30];
        this.setLayout(null);
        this.setBounds(0, 0, 800, 600);
        this.setBackground(Color.BLACK);
        //copy tab
        JLabel databaseLoader = new JLabel("databaseLoader" + ":");
        databaseLoader.setForeground(Color.white);
        databaseLoader.setBounds(10 + 0 * 150, 20 + 25 * 0, 100, 50);
        JCheckBox databaseLoader_end_box = new JCheckBox();
        databaseLoader_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 0, 20, 20);
        databaseLoader_end_box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (databaseLoader_end_box.isSelected()) {
                    appInThisClass.app_S.bootDBInBaseWay = true;
                } else {
                    appInThisClass.app_S.bootDBInBaseWay = false;
                }

            }
        });
        this.add(databaseLoader);
        this.add(databaseLoader_end_box);

        JLabel 读取TXT = new JLabel("读取TXT" + ":");
        读取TXT.setForeground(Color.white);
        读取TXT.setBounds(10 + 1 * 150, 20 + 25 * 0, 100, 50);
        JCheckBox 读取TXT_end_box = new JCheckBox();
        读取TXT_end_box.setBounds(10 + 85 + 1 * 150, 33 + 25 * 0, 20, 20);
        读取TXT_end_box.addActionListener(arg0 -> {
						if (读取TXT_end_box.isSelected()) {
								appInThisClass.app_S.bootDBInTXTWay = true;
						} else {
								appInThisClass.app_S.bootDBInTXTWay = false;
						}
				});
        this.add(读取TXT);
        this.add(读取TXT_end_box);

        //有规律的01数字后缀我会稍后归纳优化. 罗瑶光
        JLabel suspendCache = new JLabel("suspendCache" + ":");
        suspendCache.setForeground(Color.white);
        suspendCache.setBounds(10 + 0 * 150, 20 + 25 * 1, 100, 50);
        JCheckBox suspendCache_end_box = new JCheckBox();
        suspendCache_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 1, 20, 20);
        suspendCache_end_box.addActionListener(arg0 -> {
						if (suspendCache_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(suspendCache);
        this.add(suspendCache_end_box);

        JLabel suspendORM = new JLabel("suspendORM" + ":");
        suspendORM.setForeground(Color.white);
        suspendORM.setBounds(10 + 1 * 150, 20 + 25 * 1, 100, 50);
        JCheckBox suspendORM_end_box = new JCheckBox();
        suspendORM_end_box.setBounds(10 + 85 + 1 * 150, 33 + 25 * 1, 20, 20);
        suspendORM_end_box.addActionListener(arg0 -> {
						if (suspendORM_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(suspendORM);
        this.add(suspendORM_end_box);


        JLabel 读取REST = new JLabel("读取REST模式" + ":");
        读取REST.setForeground(Color.white);
        读取REST.setBounds(10 + 2 * 150, 20 + 25 * 0, 100, 50);
        JCheckBox 读取REST_end_box = new JCheckBox();
        读取REST_end_box.setBounds(10 + 85 + 2 * 150, 33 + 25 * 0, 20, 20);
        读取REST_end_box.addActionListener(arg0 -> {
						if (读取REST_end_box.isSelected()) {
								appInThisClass.app_S.bootDBInWebWay = true;
						} else {
								appInThisClass.app_S.bootDBInWebWay = false;
						}
				});
        this.add(读取REST);
        this.add(读取REST_end_box);

        JLabel mediTabFixable = new JLabel("mediTabFixable" + ":");
        mediTabFixable.setForeground(Color.white);
        mediTabFixable.setBounds(10 + 2 * 150, 20 + 25 * 1, 100, 50);
        JCheckBox mediTabFixable_end_box = new JCheckBox();
        mediTabFixable_end_box.setBounds(10 + 85 + 2 * 150, 33 + 25 * 1, 20, 20);
        mediTabFixable_end_box.addActionListener(arg0 -> {
						if (mediTabFixable_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(mediTabFixable);
        this.add(mediTabFixable_end_box);

        JLabel 元基解密 = new JLabel("元基解密" + ":");
        元基解密.setForeground(Color.white);
        元基解密.setBounds(10 + 0 * 150, 20 + 25 * 2, 100, 50);
        JCheckBox 元基解密_end_box = new JCheckBox();
        元基解密_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 2, 20, 20);
        元基解密_end_box.addActionListener(arg0 -> {
						if (元基解密_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(元基解密);
        this.add(元基解密_end_box);

        JLabel 元基加密 = new JLabel("元基加密" + ":");
        元基加密.setForeground(Color.white);
        元基加密.setBounds(10 + 1 * 150, 20 + 25 * 2, 100, 50);
        JCheckBox 元基加密_end_box = new JCheckBox();
        元基加密_end_box.setBounds(10 + 85 + 1 * 150, 33 + 25 * 2, 20, 20);
        元基加密_end_box.addActionListener(arg0 -> {
						if (元基加密_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(元基加密);
        this.add(元基加密_end_box);

        JLabel initonComputing = new JLabel("initonComputing" + ":");
        initonComputing.setForeground(Color.white);
        initonComputing.setBounds(10 + 2 * 150, 20 + 25 * 2, 100, 50);
        JCheckBox initonComputing_end_box = new JCheckBox();
        initonComputing_end_box.setBounds(10 + 85 + 2 * 150, 33 + 25 * 2, 20, 20);
        initonComputing_end_box.addActionListener(arg0 -> {
						if (initonComputing_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(initonComputing);
        this.add(initonComputing_end_box);

        //hotBackMode
        JLabel hotBackMode = new JLabel("hotBackMode" + ":");
        hotBackMode.setForeground(Color.white);
        hotBackMode.setBounds(10 + 0 * 150, 20 + 25 * 3, 100, 50);
        JCheckBox hotBackMode_end_box = new JCheckBox();
        hotBackMode_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 3, 20, 20);
        hotBackMode_end_box.addActionListener(arg0 -> {
						if (hotBackMode_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(hotBackMode);
        this.add(hotBackMode_end_box);
        //binlog
        JLabel Binlog = new JLabel("Binlog" + ":");
        Binlog.setForeground(Color.white);
        Binlog.setBounds(10 + 0 * 150, 20 + 25 * 4, 100, 50);
        JCheckBox Binlog_end_box = new JCheckBox();
        Binlog_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 4, 20, 20);
        Binlog_end_box.addActionListener(arg0 -> {
						if (Binlog_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(Binlog);
        this.add(Binlog_end_box);


        JLabel RWSeparateMode = new JLabel("RWSeparateMode" + ":");
        RWSeparateMode.setForeground(Color.white);
        RWSeparateMode.setBounds(10 + 1 * 150, 20 + 25 * 3, 100, 50);
        JCheckBox RWSeparateMode_end_box = new JCheckBox();
        RWSeparateMode_end_box.setBounds(10 + 85 + 1 * 150, 33 + 25 * 3, 20, 20);
        RWSeparateMode_end_box.addActionListener(arg0 -> {
						if (RWSeparateMode_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(RWSeparateMode);
        this.add(RWSeparateMode_end_box);


        //rollback模式
        JLabel Rollback = new JLabel("Rollback" + ":");
        Rollback.setForeground(Color.white);
        Rollback.setBounds(10 + 0 * 150, 20 + 25 * 5, 100, 50);
        JCheckBox Rollback_end_box = new JCheckBox();
        Rollback_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 5, 20, 20);
        Rollback_end_box.addActionListener(arg0 -> {
						if (Rollback_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(Rollback);
        this.add(Rollback_end_box);
        //indexingMode
        JLabel indexingMode = new JLabel("indexingMode" + ":");
        indexingMode.setForeground(Color.white);
        indexingMode.setBounds(10 + 0 * 150, 20 + 25 * 6, 100, 50);
        JCheckBox indexingMode_end_box = new JCheckBox();
        indexingMode_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 6, 20, 20);
        indexingMode_end_box.addActionListener(arg0 -> {
						if (indexingMode_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(indexingMode);
        this.add(indexingMode_end_box);
        //QueryMode
        JLabel QueryMode = new JLabel("QueryMode" + ":");
        QueryMode.setForeground(Color.white);
        QueryMode.setBounds(10 + 0 * 150, 20 + 25 * 7, 100, 50);
        JCheckBox QueryMode_end_box = new JCheckBox();
        QueryMode_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 7, 20, 20);
        QueryMode_end_box.addActionListener(arg0 -> {
						if (QueryMode_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(QueryMode);
        this.add(QueryMode_end_box);
        //exceptionNote
        JLabel exceptionNote = new JLabel("exceptionNote" + ":");
        exceptionNote.setForeground(Color.white);
        exceptionNote.setBounds(10 + 0 * 150, 20 + 25 * 8, 100, 50);
        JCheckBox exceptionNote_end_box = new JCheckBox();
        exceptionNote_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 8, 20, 20);
        exceptionNote_end_box.addActionListener(arg0 -> {
						if (exceptionNote_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(exceptionNote);
        this.add(exceptionNote_end_box);
        //withoutLockMode
        JLabel withoutLockMode = new JLabel("withoutLockMode" + ":");
        withoutLockMode.setForeground(Color.white);
        withoutLockMode.setBounds(10 + 0 * 150, 20 + 25 * 9, 100, 50);
        JCheckBox withoutLockMode_end_box = new JCheckBox();
        withoutLockMode_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 9, 20, 20);
        withoutLockMode_end_box.addActionListener(arg0 -> {
						if (withoutLockMode_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(withoutLockMode);
        this.add(withoutLockMode_end_box);
        //WEBMode
        JLabel WEBMode = new JLabel("WEBMode" + ":");
        WEBMode.setForeground(Color.white);
        WEBMode.setBounds(10 + 0 * 150, 20 + 25 * 10, 100, 50);
        JCheckBox WEBMode_end_box = new JCheckBox();
        WEBMode_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 10, 20, 20);
        WEBMode_end_box.addActionListener(arg0 -> {
						if (WEBMode_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(WEBMode);
        this.add(WEBMode_end_box);
        //命令行
        JLabel commandLineMode = new JLabel("commandLineMode" + ":");
        commandLineMode.setForeground(Color.white);
        commandLineMode.setBounds(10 + 0 * 150, 20 + 25 * 11, 100, 50);
        JCheckBox commandLineMode_end_box = new JCheckBox();
        commandLineMode_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 11, 20, 20);
        commandLineMode_end_box.addActionListener(arg0 -> {
						if (commandLineMode_end_box.isSelected()) {
								for (int i = 0; i < tabNames.length; i++) {
								}
						} else {
								for (int i = 0; i < tabNames.length; i++) {
								}
						}
				});
        this.add(commandLineMode);
        this.add(commandLineMode_end_box);


        JLabel databaseConfigAddress = new JLabel("databaseConfigAddress" + ":");
        databaseConfigAddress.setForeground(Color.white);
        databaseConfigAddress.setBounds(10 + 0 * 150, 20 + 25 * 13, 150, 50);

        JTextField databaseConfigAddressJTextField = new JTextField();
        databaseConfigAddressJTextField.setBounds(10 + 0 * 150 + 160, 20 + 25 * 13, 550, 50);
        databaseConfigAddressJTextField.addActionListener(
					arg0 -> appInThisClass.app_S.dbConfigPath = databaseConfigAddressJTextField.getText().trim());
        databaseConfigAddressJTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                appInThisClass.app_S.dbConfigPath = databaseConfigAddressJTextField.getText().trim();
            }
        });
        databaseConfigAddressJTextField.setText(ConfigIndex.detaDBPath);
        appInThisClass.app_S.dbConfigPath = ConfigIndex.detaDBPath;
        this.add(databaseConfigAddress);
        this.add(databaseConfigAddressJTextField);

    }
}
