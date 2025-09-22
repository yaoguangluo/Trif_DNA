/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package O_V.OPM.ESU.admin;

import ME.VPC.M.app.App;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class VPCSRestPanel extends JPanel {
    /**
     * 罗瑶光
     * 以后统一改 for loop 进行init 组件
     */

    public JCheckBox jlabel_box[];
    @SuppressWarnings("unused")
    private App appInThisClass;
    public String[] tabNames = {"中药本草", "数据分析", "智能相诊", "图片搜索"
        , "位术数", "西医内科", "中医方剂", "中医诊断", "古籍"
        , "中医生殖", "西医妇幼", "西医急诊", "大外科", "中医外伤"
        , "西药处方", "编辑页", "哈里森内科", "五官科", "男科", "老年科"
        , "传染科", "新生儿科", "麻醉科", "精神科", "脑外科", "现代护理"
        , "核医学", "肿瘤科", "西医骨伤", "遗传学"};
    public boolean[] tabNamesHook = new boolean[30];

    public VPCSRestPanel(App app) {
        appInThisClass = app;
        jlabel_box = new JCheckBox[30];
        this.setLayout(null);
        this.setBounds(0, 0, 800, 600);
        this.setBackground(Color.BLACK);

        //copy tab
        int im = 5;
        int jm = 6;
        for (int i = 0; i < im; i++) {
            for (int j = 0; j < jm; j++) {
                if (i * jm + j < tabNames.length) {
                    JLabel jlabel = new JLabel(tabNames[i * jm + j] + ":");
                    jlabel.setForeground(new Color(210, 210, 210));
                    jlabel.setBounds(10 + i * 150, 20 + 25 * j, 100, 50);
                    jlabel_box[i * jm + j] = new JCheckBox();
                    jlabel_box[i * jm + j].setBackground(Color.BLUE);
                    jlabel_box[i * jm + j].setBounds(10 + 85 + i * 150, 33 + 25 * j, 20, 20);
                    final int reg = i * jm + j;
                    jlabel_box[i * jm + j].addActionListener(arg0 -> {
                        if (jlabel_box[reg].isSelected()) {
                            tabNamesHook[reg] = true;
                        } else {
                            tabNamesHook[reg] = false;
                        }

                    });
                    this.add(jlabel);
                    this.add(jlabel_box[i * jm + j]);
                }
            }
        }

        JLabel jlabel = new JLabel("一键科目全选" + ":");
        jlabel.setForeground(Color.RED);
        jlabel.setBounds(10 + 0 * 150, 20 + 25 * 6, 100, 50);
        JCheckBox jlabel_end_box = new JCheckBox();
        jlabel_end_box.setBounds(10 + 85 + 0 * 150, 33 + 25 * 6, 20, 20);
        jlabel_end_box.addActionListener(arg0 -> {
            if (jlabel_end_box.isSelected()) {
                for (int i = 0; i < tabNames.length; i++) {
                    tabNamesHook[i] = true;
                    jlabel_box[i].setSelected(true);
                }
            } else {
                for (int i = 0; i < tabNames.length; i++) {
                    tabNamesHook[i] = false;
                    jlabel_box[i].setSelected(false);
                }
            }

        });
        this.add(jlabel);
        this.add(jlabel_end_box);
        //copy tab
    }
}
//99
//		JLabel webLabel= new JLabel("Web控制接口"+ ":");
//		webLabel.setForeground(Color.red);
//		webLabel.setBounds(10+ 0* 130, 20+ 25* 0, 150, 25);
//		this.add(webLabel);
//
//		JLabel 前端接口= new JLabel("前端接口"+ ":");
//		前端接口.setForeground(Color.white);
//		前端接口.setBounds(10+ 0* 130, 20+ 25* 1, 150, 25);
//		JTextField 前端接口JTextField= new JTextField();
//		前端接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 1, 50, 25);
//		前端接口JTextField.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				appInThisClass.app_S.frontendTxt= 前端接口JTextField.getText().trim();
//			}
//		});
//		前端接口JTextField.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			@Override
//			public void keyPressed(KeyEvent e) {}
//			@Override
//			public void keyReleased(KeyEvent e) {
//				appInThisClass.app_S.frontendTxt= 前端接口JTextField.getText().trim();
//			}
//		});
//		前端接口JTextField.setText(S_HTTP.PORT_FRONTEND);
//		appInThisClass.app_S.frontendTxt= S_HTTP.PORT_FRONTEND;
//		this.add(前端接口);
//		this.add(前端接口JTextField);
//
//		JLabel 后端接口= new JLabel("后端接口"+ ":");
//		后端接口.setForeground(Color.white);
//		后端接口.setBounds(10+ 0* 130, 20+ 25* 2, 150, 25);
//		JTextField 后端接口JTextField= new JTextField();
//		后端接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 2, 50, 25);
//		后端接口JTextField.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				appInThisClass.app_S.backendTxt= 后端接口JTextField.getText().trim();
//			}
//		});
//		后端接口JTextField.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			@Override
//			public void keyPressed(KeyEvent e) {}
//			@Override
//			public void keyReleased(KeyEvent e) {
//				appInThisClass.app_S.backendTxt= 后端接口JTextField.getText().trim();
//			}
//		});
//		后端接口JTextField.setText(S_HTTP.PORT_BACKEND);
//		appInThisClass.app_S.backendTxt= S_HTTP.PORT_BACKEND;
//		this.add(后端接口);
//		this.add(后端接口JTextField);
////		JLabel 数据库接口= new JLabel("数据库接口"+ ":");
//		数据库接口.setForeground(Color.white);
//		数据库接口.setBounds(10+ 0* 130, 20+ 25* 3, 150, 25);
//		JTextField 数据库接口JTextField= new JTextField();
//		数据库接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 3, 50, 25);
//		数据库接口JTextField.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				appInThisClass.app_S.databasePortTxt= 数据库接口JTextField.getText().trim();
//			}
//		});
//		数据库接口JTextField.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			@Override
//			public void keyPressed(KeyEvent e) {}
//			@Override
//			public void keyReleased(KeyEvent e) {
//				appInThisClass.app_S.databasePortTxt= 数据库接口JTextField.getText().trim();
//			}
//		});
//		数据库接口JTextField.setText(S_HTTP.PORT_DATABASE);
//		appInThisClass.app_S.databasePortTxt= S_HTTP.PORT_DATABASE;
//		this.add(数据库接口);
//		this.add(数据库接口JTextField);
//
//
//		JLabel 缓存接口= new JLabel("缓存接口"+ ":");
//		缓存接口.setForeground(Color.white);
//		缓存接口.setBounds(10+ 0* 130, 20+ 25* 4, 150, 25);
//		JTextField 缓存接口JTextField= new JTextField();
//		缓存接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 4, 50, 25);
//		缓存接口JTextField.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				appInThisClass.app_S.缓存接口Txt= 缓存接口JTextField.getText().trim();
//			}
//		});
//		缓存接口JTextField.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			@Override
//			public void keyPressed(KeyEvent e) {}
//			@Override
//			public void keyReleased(KeyEvent e) {
//				appInThisClass.app_S.缓存接口Txt= 缓存接口JTextField.getText().trim();
//			}
//		});
//		缓存接口JTextField.setText(S_HTTP.PORT_CACHE);
//		appInThisClass.app_S.缓存接口Txt= S_HTTP.PORT_CACHE;
//		this.add(缓存接口);
//		this.add(缓存接口JTextField);
//
//
//		JLabel 蓝牙接口= new JLabel("蓝牙接口"+ ":");
//		蓝牙接口.setForeground(Color.white);
//		蓝牙接口.setBounds(10+ 0* 130, 20+ 25* 5, 150, 25);
//		JTextField 蓝牙接口JTextField= new JTextField();
//		蓝牙接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 5, 50, 25);
//		蓝牙接口JTextField.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				appInThisClass.app_S.蓝牙接口Txt= 蓝牙接口JTextField.getText().trim();
//			}
//		});
//		蓝牙接口JTextField.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			@Override
//			public void keyPressed(KeyEvent e) {}
//			@Override
//			public void keyReleased(KeyEvent e) {
//				appInThisClass.app_S.蓝牙接口Txt= 蓝牙接口JTextField.getText().trim();
//			}
//		});
//		蓝牙接口JTextField.setText(S_HTTP.PORT_BLUETOOTH);
//		appInThisClass.app_S.蓝牙接口Txt= S_HTTP.PORT_BLUETOOTH;
//		this.add(蓝牙接口);
//		this.add(蓝牙接口JTextField);
//
//		JLabel Tel终端接口= new JLabel("Tel终端接口"+ ":");
//		Tel终端接口.setForeground(Color.white);
//		Tel终端接口.setBounds(10+ 0* 130, 20+ 25* 6, 150, 25);
//		JTextField Tel终端接口JTextField= new JTextField();
//		Tel终端接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 6, 50, 25);
//		Tel终端接口JTextField.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				appInThisClass.app_S.Tel终端Txt= Tel终端接口JTextField.getText().trim();
//			}
//		});
//		Tel终端接口JTextField.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			@Override
//			public void keyPressed(KeyEvent e) {}
//			@Override
//			public void keyReleased(KeyEvent e) {
//				appInThisClass.app_S.Tel终端Txt= Tel终端接口JTextField.getText().trim();
//			}
//		});
//		Tel终端接口JTextField.setText(S_HTTP.PORT_TELPORT);
//		appInThisClass.app_S.Tel终端Txt= S_HTTP.PORT_TELPORT;
//		this.add(Tel终端接口);
//		this.add(Tel终端接口JTextField);
