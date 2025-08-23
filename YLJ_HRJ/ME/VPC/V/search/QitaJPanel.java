//package ME.VPC.V.search;
//
//import javax.swing.JCheckBox;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
///*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
// * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
//
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
//*  208号 阳光家园别墅小区 第十栋别墅
// * */
//public class QitaJPanel extends JPanel {
//
//    /**
//     *
//     */
//    //
//    public QitaJPanel(JTextField name) {
//        this.setLayout(null);
//        this.setBounds(0, 0, 780, 610);
//        this.setBackground(Color.BLACK);
//        //
//        JLabel hotqichuan_filter = new JLabel("发热:");
//        hotqichuan_filter.setForeground(Color.WHITE);
//        hotqichuan_filter.setBounds(10, 20, 100, 50);
//        JCheckBox hotqichuan_filter_box = new JCheckBox();
//        hotqichuan_filter_box.setBounds(10 + 60, 33, 20, 20);
//        hotqichuan_filter_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (hotqichuan_filter_box.isSelected()) {
//                    if (!name.getText().contains("发热")) {
//                        name.setText(name.getText() + " 发热");
//                    }
//                } else {
//                    if (name.getText().contains("发热")) {
//                        name.setText(name.getText().replace("发热", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(hotqichuan_filter);
//        this.add(hotqichuan_filter_box);
//        //
//        JLabel shentongqichuan_filter = new JLabel("身痛:");
//        shentongqichuan_filter.setForeground(Color.WHITE);
//        shentongqichuan_filter.setBounds(10, 45, 100, 50);
//        JCheckBox shentongqichuan_filter_box = new JCheckBox();
//        shentongqichuan_filter_box.setBounds(10 + 60, 58, 20, 20);
//        shentongqichuan_filter_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (shentongqichuan_filter_box.isSelected()) {
//                    if (!name.getText().contains("身痛")) {
//                        name.setText(name.getText() + " 身痛");
//                    }
//                } else {
//                    if (name.getText().contains("身痛")) {
//                        name.setText(name.getText().replace("身痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(shentongqichuan_filter);
//        this.add(shentongqichuan_filter_box);
//        //
//        JLabel etoutongqichuan_filter = new JLabel("额头痛:");
//        etoutongqichuan_filter.setForeground(Color.WHITE);
//        etoutongqichuan_filter.setBounds(10, 45 + 25, 100, 50);
//        JCheckBox etoutongqichuan_filter_box = new JCheckBox();
//        etoutongqichuan_filter_box.setBounds(10 + 60, 58 + 25, 20, 20);
//        etoutongqichuan_filter_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (etoutongqichuan_filter_box.isSelected()) {
//                    if (!name.getText().contains("额头痛")) {
//                        name.setText(name.getText() + " 额头痛");
//                    }
//                } else {
//                    if (name.getText().contains("额头痛")) {
//                        name.setText(name.getText().replace("额头痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(etoutongqichuan_filter);
//        this.add(etoutongqichuan_filter_box);
//        //copy tab
//        JLabel kesou = new JLabel("咳嗽:");
//        kesou.setForeground(Color.WHITE);
//        kesou.setBounds(10, 45 + 25 + 25, 100, 50);
//        JCheckBox kesou_box = new JCheckBox();
//        kesou_box.setBounds(10 + 60, 58 + 25 + 25, 20, 20);
//        kesou_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (kesou_box.isSelected()) {
//                    if (!name.getText().contains("咳嗽")) {
//                        name.setText(name.getText() + " 咳嗽");
//                    }
//                } else {
//                    if (name.getText().contains("咳嗽")) {
//                        name.setText(name.getText().replace("咳嗽", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(kesou);
//        this.add(kesou_box);
//        //copy tab
//        JLabel nongtan = new JLabel("浓痰:");
//        nongtan.setForeground(Color.WHITE);
//        nongtan.setBounds(10, 45 + 25 + 25 + 25, 100, 50);
//        JCheckBox nongtan_box = new JCheckBox();
//        nongtan_box.setBounds(10 + 60, 58 + 25 + 25 + 25, 20, 20);
//        nongtan_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (nongtan_box.isSelected()) {
//                    if (!name.getText().contains("浓痰")) {
//                        name.setText(name.getText() + " 浓痰");
//                    }
//                } else {
//                    if (name.getText().contains("浓痰")) {
//                        name.setText(name.getText().replace("浓痰", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(nongtan);
//        this.add(nongtan_box);
//
//        //copy tab
//        JLabel huangtan = new JLabel("黄痰:");
//        huangtan.setForeground(Color.WHITE);
//        huangtan.setBounds(10, 45 + 25 + 75, 100, 50);
//        JCheckBox huangtan_box = new JCheckBox();
//        huangtan_box.setBounds(10 + 60, 58 + 25 + 75, 20, 20);
//        huangtan_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (huangtan_box.isSelected()) {
//                    if (!name.getText().contains("黄痰")) {
//                        name.setText(name.getText() + " 黄痰");
//                    }
//                } else {
//                    if (name.getText().contains("黄痰")) {
//                        name.setText(name.getText().replace("黄痰", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(huangtan);
//        this.add(huangtan_box);
//        //copy tab
//        JLabel baitan = new JLabel("白痰:");
//        baitan.setForeground(Color.WHITE);
//        baitan.setBounds(10, 45 + 25 + 100, 100, 50);
//        JCheckBox baitan_box = new JCheckBox();
//        baitan_box.setBounds(10 + 60, 58 + 25 + 100, 20, 20);
//        baitan_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (baitan_box.isSelected()) {
//                    if (!name.getText().contains("白痰")) {
//                        name.setText(name.getText() + " 白痰");
//                    }
//                } else {
//                    if (name.getText().contains("白痰")) {
//                        name.setText(name.getText().replace("白痰", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(baitan);
//        this.add(baitan_box);
//        //copy tab
//        JLabel duotan = new JLabel("多痰:");
//        duotan.setForeground(Color.WHITE);
//        duotan.setBounds(10, 45 + 25 + 125, 100, 50);
//        JCheckBox duotan_box = new JCheckBox();
//        duotan_box.setBounds(10 + 60, 58 + 25 + 125, 20, 20);
//        duotan_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (duotan_box.isSelected()) {
//                    if (!name.getText().contains("多痰")) {
//                        name.setText(name.getText() + " 多痰");
//                    }
//                } else {
//                    if (name.getText().contains("多痰")) {
//                        name.setText(name.getText().replace("多痰", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(duotan);
//        this.add(duotan_box);
//        //copy tab
//        JLabel shaotan = new JLabel("少痰:");
//        shaotan.setForeground(Color.WHITE);
//        shaotan.setBounds(10, 45 + 25 + 100 + 25 + 25, 100, 50);
//        JCheckBox shaotan_box = new JCheckBox();
//        shaotan_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 25, 20, 20);
//        shaotan_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (shaotan_box.isSelected()) {
//                    if (!name.getText().contains("少痰")) {
//                        name.setText(name.getText() + " 少痰");
//                    }
//                } else {
//                    if (name.getText().contains("少痰")) {
//                        name.setText(name.getText().replace("少痰", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(shaotan);
//        this.add(shaotan_box);
//        //copy tab
//        JLabel chouyan = new JLabel("稠痰:");
//        chouyan.setForeground(Color.WHITE);
//        chouyan.setBounds(10, 45 + 25 + 100 + 25 + 50, 100, 50);
//        JCheckBox chouyan_box = new JCheckBox();
//        chouyan_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 50, 20, 20);
//        chouyan_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (chouyan_box.isSelected()) {
//                    if (!name.getText().contains("稠痰")) {
//                        name.setText(name.getText() + " 稠痰");
//                    }
//                } else {
//                    if (name.getText().contains("稠痰")) {
//                        name.setText(name.getText().replace("稠痰", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(chouyan);
//        this.add(chouyan_box);
//        //copy tab
//        JLabel xitan = new JLabel("稀痰:");
//        xitan.setForeground(Color.WHITE);
//        xitan.setBounds(10, 45 + 25 + 100 + 25 + 75, 100, 50);
//        JCheckBox xitan_box = new JCheckBox();
//        xitan_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 75, 20, 20);
//        xitan_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (xitan_box.isSelected()) {
//                    if (!name.getText().contains("稀痰")) {
//                        name.setText(name.getText() + " 稀痰");
//                    }
//                } else {
//                    if (name.getText().contains("稀痰")) {
//                        name.setText(name.getText().replace("稀痰", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(xitan);
//        this.add(xitan_box);
//        //copy tab
//        JLabel toutong = new JLabel("头痛:");
//        toutong.setForeground(Color.WHITE);
//        toutong.setBounds(10, 45 + 25 + 100 + 25 + 100, 100, 50);
//        JCheckBox toutong_box = new JCheckBox();
//        toutong_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 100, 20, 20);
//        toutong_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (toutong_box.isSelected()) {
//                    if (!name.getText().contains("头痛")) {
//                        name.setText(name.getText() + " 头痛");
//                    }
//                } else {
//                    if (name.getText().contains("头痛")) {
//                        name.setText(name.getText().replace("头痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(toutong);
//        this.add(toutong_box);
//        //copy tab
//        JLabel bozitong = new JLabel("脖子痛:");
//        bozitong.setForeground(Color.WHITE);
//        bozitong.setBounds(10, 45 + 25 + 100 + 25 + 125, 100, 50);
//        JCheckBox bozitong_box = new JCheckBox();
//        bozitong_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 125, 20, 20);
//        bozitong_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (bozitong_box.isSelected()) {
//                    if (!name.getText().contains("脖子痛")) {
//                        name.setText(name.getText() + " 脖子痛");
//                    }
//                } else {
//                    if (name.getText().contains("脖子痛")) {
//                        name.setText(name.getText().replace("脖子痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(bozitong);
//        this.add(bozitong_box);
//        //copy tab
//        JLabel xiongtong = new JLabel("胸痛:");
//        xiongtong.setForeground(Color.WHITE);
//        xiongtong.setBounds(10, 45 + 25 + 100 + 25 + 150, 100, 50);
//        JCheckBox xiongtong_box = new JCheckBox();
//        xiongtong_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 150, 20, 20);
//        xiongtong_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (xiongtong_box.isSelected()) {
//                    if (!name.getText().contains("胸痛")) {
//                        name.setText(name.getText() + " 胸痛");
//                    }
//                } else {
//                    if (name.getText().contains("胸痛")) {
//                        name.setText(name.getText().replace("胸痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(xiongtong);
//        this.add(xiongtong_box);
//        //copy tab
//        JLabel futong = new JLabel("腹痛:");
//        futong.setForeground(Color.WHITE);
//        futong.setBounds(10, 45 + 25 + 100 + 25 + 150, 100, 50);
//        JCheckBox futong_box = new JCheckBox();
//        futong_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 150, 20, 20);
//        futong_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (futong_box.isSelected()) {
//                    if (!name.getText().contains("腹痛")) {
//                        name.setText(name.getText() + " 腹痛");
//                    }
//                } else {
//                    if (name.getText().contains("腹痛")) {
//                        name.setText(name.getText().replace("腹痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(futong);
//        this.add(futong_box);
//        //copy tab
//        JLabel 关节痛 = new JLabel("关节痛:");
//        关节痛.setForeground(Color.WHITE);
//        关节痛.setBounds(10, 45 + 25 + 100 + 25 + 175, 100, 50);
//        JCheckBox 关节痛_box = new JCheckBox();
//        关节痛_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 175, 20, 20);
//        关节痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (关节痛_box.isSelected()) {
//                    if (!name.getText().contains("关节痛")) {
//                        name.setText(name.getText() + " 关节痛");
//                    }
//                } else {
//                    if (name.getText().contains("关节痛")) {
//                        name.setText(name.getText().replace("关节痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(关节痛);
//        this.add(关节痛_box);
//        //copy tab
//        JLabel 空痛 = new JLabel("空痛:");
//        空痛.setForeground(Color.WHITE);
//        空痛.setBounds(10, 45 + 25 + 100 + 25 + 200, 100, 50);
//        JCheckBox 空痛_box = new JCheckBox();
//        空痛_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 200, 20, 20);
//        空痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (空痛_box.isSelected()) {
//                    if (!name.getText().contains("空痛")) {
//                        name.setText(name.getText() + " 空痛");
//                    }
//                } else {
//                    if (name.getText().contains("空痛")) {
//                        name.setText(name.getText().replace("空痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(空痛);
//        this.add(空痛_box);
//        //copy tab
//        JLabel 隐痛 = new JLabel("隐痛:");
//        隐痛.setForeground(Color.WHITE);
//        隐痛.setBounds(10, 45 + 25 + 100 + 25 + 225, 100, 50);
//        JCheckBox 隐痛_box = new JCheckBox();
//        隐痛_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 225, 20, 20);
//        隐痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (隐痛_box.isSelected()) {
//                    if (!name.getText().contains("隐痛")) {
//                        name.setText(name.getText() + " 隐痛");
//                    }
//                } else {
//                    if (name.getText().contains("隐痛")) {
//                        name.setText(name.getText().replace("隐痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(隐痛);
//        this.add(隐痛_box);
//        //copy tab
//        JLabel 绞痛 = new JLabel("绞痛:");
//        绞痛.setForeground(Color.WHITE);
//        绞痛.setBounds(10, 45 + 25 + 100 + 25 + 250, 100, 50);
//        JCheckBox 绞痛_box = new JCheckBox();
//        绞痛_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 250, 20, 20);
//        绞痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (绞痛_box.isSelected()) {
//                    if (!name.getText().contains("绞痛")) {
//                        name.setText(name.getText() + " 绞痛");
//                    }
//                } else {
//                    if (name.getText().contains("绞痛")) {
//                        name.setText(name.getText().replace("绞痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(绞痛);
//        this.add(绞痛_box);
//        //copy tab
//        JLabel 刺痛 = new JLabel("刺痛:");
//        刺痛.setForeground(Color.WHITE);
//        刺痛.setBounds(10, 45 + 25 + 100 + 25 + 275, 100, 50);
//        JCheckBox 刺痛_box = new JCheckBox();
//        刺痛_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 275, 20, 20);
//        刺痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (刺痛_box.isSelected()) {
//                    if (!name.getText().contains("刺痛")) {
//                        name.setText(name.getText() + " 刺痛");
//                    }
//                } else {
//                    if (name.getText().contains("刺痛")) {
//                        name.setText(name.getText().replace("刺痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(刺痛);
//        this.add(刺痛_box);
//        //copy tab
//        JLabel 剧痛 = new JLabel("剧痛:");
//        剧痛.setForeground(Color.WHITE);
//        剧痛.setBounds(10, 45 + 25 + 100 + 25 + 300, 100, 50);
//        JCheckBox 剧痛_box = new JCheckBox();
//        剧痛_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 300, 20, 20);
//        剧痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (剧痛_box.isSelected()) {
//                    if (!name.getText().contains("剧痛")) {
//                        name.setText(name.getText() + " 剧痛");
//                    }
//                } else {
//                    if (name.getText().contains("剧痛")) {
//                        name.setText(name.getText().replace("剧痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(剧痛);
//        this.add(剧痛_box);
//        //copy tab
//        JLabel 反跳痛 = new JLabel("反跳痛:");
//        反跳痛.setForeground(Color.WHITE);
//        反跳痛.setBounds(10, 45 + 25 + 100 + 25 + 325, 100, 50);
//        JCheckBox 反跳痛_box = new JCheckBox();
//        反跳痛_box.setBounds(10 + 60, 58 + 25 + 100 + 25 + 325, 20, 20);
//        反跳痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (反跳痛_box.isSelected()) {
//                    if (!name.getText().contains("反跳痛")) {
//                        name.setText(name.getText() + " 反跳痛");
//                    }
//                } else {
//                    if (name.getText().contains("反跳痛")) {
//                        name.setText(name.getText().replace("反跳痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(反跳痛);
//        this.add(反跳痛_box);
//        //copy tab
//        JLabel 压痛 = new JLabel("压痛:");
//        压痛.setForeground(Color.WHITE);
//        压痛.setBounds(10 + 110, 20 + 0, 100, 50);
//        JCheckBox 压痛_box = new JCheckBox();
//        压痛_box.setBounds(10 + 60 + 110, 33 + 0, 20, 20);
//        压痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (压痛_box.isSelected()) {
//                    if (!name.getText().contains("压痛")) {
//                        name.setText(name.getText() + " 压痛");
//                    }
//                } else {
//                    if (name.getText().contains("压痛")) {
//                        name.setText(name.getText().replace("压痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(压痛);
//        this.add(压痛_box);
//        //copy tab
//        JLabel 抽痛 = new JLabel("抽痛:");
//        抽痛.setForeground(Color.WHITE);
//        抽痛.setBounds(10 + 110, 20 + 25, 100, 50);
//        JCheckBox 抽痛_box = new JCheckBox();
//        抽痛_box.setBounds(10 + 60 + 110, 33 + 25, 20, 20);
//        抽痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (抽痛_box.isSelected()) {
//                    if (!name.getText().contains("抽痛")) {
//                        name.setText(name.getText() + " 抽痛");
//                    }
//                } else {
//                    if (name.getText().contains("抽痛")) {
//                        name.setText(name.getText().replace("抽痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(抽痛);
//        this.add(抽痛_box);
//        //copy tab
//        JLabel 灼痛 = new JLabel("灼痛:");
//        灼痛.setForeground(Color.WHITE);
//        灼痛.setBounds(10 + 110, 20 + 50, 100, 50);
//        JCheckBox 灼痛_box = new JCheckBox();
//        灼痛_box.setBounds(10 + 60 + 110, 33 + 50, 20, 20);
//        灼痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (灼痛_box.isSelected()) {
//                    if (!name.getText().contains("灼痛")) {
//                        name.setText(name.getText() + " 灼痛");
//                    }
//                } else {
//                    if (name.getText().contains("灼痛")) {
//                        name.setText(name.getText().replace("灼痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(灼痛);
//        this.add(灼痛_box);
//        //copy tab
//        JLabel 有汗 = new JLabel("有汗:");
//        有汗.setForeground(Color.WHITE);
//        有汗.setBounds(10 + 110, 20 + 75, 100, 50);
//        JCheckBox 有汗_box = new JCheckBox();
//        有汗_box.setBounds(10 + 60 + 110, 33 + 75, 20, 20);
//        有汗_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (有汗_box.isSelected()) {
//                    if (!name.getText().contains("有汗")) {
//                        name.setText(name.getText() + " 有汗");
//                    }
//                } else {
//                    if (name.getText().contains("有汗")) {
//                        name.setText(name.getText().replace("有汗", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(有汗);
//        this.add(有汗_box);
//        //copy tab
//        JLabel 无汗 = new JLabel("无汗:");
//        无汗.setForeground(Color.WHITE);
//        无汗.setBounds(10 + 110, 20 + 100, 100, 50);
//        JCheckBox 无汗_box = new JCheckBox();
//        无汗_box.setBounds(10 + 60 + 110, 33 + 100, 20, 20);
//        无汗_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (无汗_box.isSelected()) {
//                    if (!name.getText().contains("无汗")) {
//                        name.setText(name.getText() + " 无汗");
//                    }
//                } else {
//                    if (name.getText().contains("无汗")) {
//                        name.setText(name.getText().replace("无汗", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(无汗);
//        this.add(无汗_box);
//        //copy tab
//        JLabel 盗汗 = new JLabel("盗汗:");
//        盗汗.setForeground(Color.WHITE);
//        盗汗.setBounds(10 + 110, 20 + 125, 100, 50);
//        JCheckBox 盗汗_box = new JCheckBox();
//        盗汗_box.setBounds(10 + 60 + 110, 33 + 125, 20, 20);
//        盗汗_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (盗汗_box.isSelected()) {
//                    if (!name.getText().contains("盗汗")) {
//                        name.setText(name.getText() + " 盗汗");
//                    }
//                } else {
//                    if (name.getText().contains("盗汗")) {
//                        name.setText(name.getText().replace("盗汗", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(盗汗);
//        this.add(盗汗_box);
//        //copy tab
//        JLabel 自汗 = new JLabel("自汗:");
//        自汗.setForeground(Color.WHITE);
//        自汗.setBounds(10 + 110, 20 + 150, 100, 50);
//        JCheckBox 自汗_box = new JCheckBox();
//        自汗_box.setBounds(10 + 60 + 110, 33 + 150, 20, 20);
//        自汗_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (自汗_box.isSelected()) {
//                    if (!name.getText().contains("自汗")) {
//                        name.setText(name.getText() + " 自汗");
//                    }
//                } else {
//                    if (name.getText().contains("自汗")) {
//                        name.setText(name.getText().replace("自汗", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(自汗);
//        this.add(自汗_box);
//        //copy tab
//        JLabel 手痛 = new JLabel("手痛:");
//        手痛.setForeground(Color.WHITE);
//        手痛.setBounds(10 + 110, 20 + 175, 100, 50);
//        JCheckBox 手痛_box = new JCheckBox();
//        手痛_box.setBounds(10 + 60 + 110, 33 + 175, 20, 20);
//        手痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (手痛_box.isSelected()) {
//                    if (!name.getText().contains("手痛")) {
//                        name.setText(name.getText() + " 手痛");
//                    }
//                } else {
//                    if (name.getText().contains("手痛")) {
//                        name.setText(name.getText().replace("手痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(手痛);
//        this.add(手痛_box);
//        //copy tab
//        JLabel 脚痛 = new JLabel("脚痛:");
//        脚痛.setForeground(Color.WHITE);
//        脚痛.setBounds(10 + 110, 20 + 200, 100, 50);
//        JCheckBox 脚痛_box = new JCheckBox();
//        脚痛_box.setBounds(10 + 60 + 110, 33 + 200, 20, 20);
//        脚痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (脚痛_box.isSelected()) {
//                    if (!name.getText().contains("脚痛")) {
//                        name.setText(name.getText() + " 脚痛");
//                    }
//                } else {
//                    if (name.getText().contains("脚痛")) {
//                        name.setText(name.getText().replace("脚痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(脚痛);
//        this.add(脚痛_box);
//        //copy tab
//        JLabel 腰痛 = new JLabel("腰痛:");
//        腰痛.setForeground(Color.WHITE);
//        腰痛.setBounds(10 + 110, 20 + 225, 100, 50);
//        JCheckBox 腰痛_box = new JCheckBox();
//        腰痛_box.setBounds(10 + 60 + 110, 33 + 225, 20, 20);
//        腰痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (腰痛_box.isSelected()) {
//                    if (!name.getText().contains("腰痛")) {
//                        name.setText(name.getText() + " 腰痛");
//                    }
//                } else {
//                    if (name.getText().contains("腰痛")) {
//                        name.setText(name.getText().replace("腰痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(腰痛);
//        this.add(腰痛_box);
//        //copy tab
//        JLabel 背痛 = new JLabel("背痛:");
//        背痛.setForeground(Color.WHITE);
//        背痛.setBounds(10 + 110, 20 + 250, 100, 50);
//        JCheckBox 背痛_box = new JCheckBox();
//        背痛_box.setBounds(10 + 60 + 110, 33 + 250, 20, 20);
//        背痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (背痛_box.isSelected()) {
//                    if (!name.getText().contains("背痛")) {
//                        name.setText(name.getText() + " 背痛");
//                    }
//                } else {
//                    if (name.getText().contains("背痛")) {
//                        name.setText(name.getText().replace("背痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(背痛);
//        this.add(背痛_box);
//        //copy tab
//        JLabel 指甲痛 = new JLabel("指甲痛:");
//        指甲痛.setForeground(Color.WHITE);
//        指甲痛.setBounds(10 + 110, 20 + 275, 100, 50);
//        JCheckBox 指甲痛_box = new JCheckBox();
//        指甲痛_box.setBounds(10 + 60 + 110, 33 + 275, 20, 20);
//        指甲痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (指甲痛_box.isSelected()) {
//                    if (!name.getText().contains("指甲痛")) {
//                        name.setText(name.getText() + " 指甲痛");
//                    }
//                } else {
//                    if (name.getText().contains("指甲痛")) {
//                        name.setText(name.getText().replace("指甲痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(指甲痛);
//        this.add(指甲痛_box);
//        //copy tab
//        JLabel 手掌痛 = new JLabel("手掌痛:");
//        手掌痛.setForeground(Color.WHITE);
//        手掌痛.setBounds(10 + 110, 20 + 300, 100, 50);
//        JCheckBox 手掌痛_box = new JCheckBox();
//        手掌痛_box.setBounds(10 + 60 + 110, 33 + 300, 20, 20);
//        手掌痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (手掌痛_box.isSelected()) {
//                    if (!name.getText().contains("手掌痛")) {
//                        name.setText(name.getText() + " 手掌痛");
//                    }
//                } else {
//                    if (name.getText().contains("手掌痛")) {
//                        name.setText(name.getText().replace("手掌痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(手掌痛);
//        this.add(手掌痛_box);
//        //copy tab
//        JLabel 脚趾痛 = new JLabel("脚趾痛:");
//        脚趾痛.setForeground(Color.WHITE);
//        脚趾痛.setBounds(10 + 110, 20 + 325, 100, 50);
//        JCheckBox 脚趾痛_box = new JCheckBox();
//        脚趾痛_box.setBounds(10 + 60 + 110, 33 + 325, 20, 20);
//        脚趾痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (脚趾痛_box.isSelected()) {
//                    if (!name.getText().contains("脚趾痛")) {
//                        name.setText(name.getText() + " 脚趾痛");
//                    }
//                } else {
//                    if (name.getText().contains("脚趾痛")) {
//                        name.setText(name.getText().replace("脚趾痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(脚趾痛);
//        this.add(脚趾痛_box);
//        //copy tab
//        JLabel 气喘 = new JLabel("气喘:");
//        气喘.setForeground(Color.WHITE);
//        气喘.setBounds(10 + 110, 20 + 350, 100, 50);
//        JCheckBox 气喘_box = new JCheckBox();
//        气喘_box.setBounds(10 + 60 + 110, 33 + 350, 20, 20);
//        气喘_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (气喘_box.isSelected()) {
//                    if (!name.getText().contains("气喘")) {
//                        name.setText(name.getText() + " 气喘");
//                    }
//                } else {
//                    if (name.getText().contains("气喘")) {
//                        name.setText(name.getText().replace("气喘", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(气喘);
//        this.add(气喘_box);
//        //copy tab
//        JLabel 哮喘 = new JLabel("哮喘:");
//        哮喘.setForeground(Color.WHITE);
//        哮喘.setBounds(10 + 110, 20 + 375, 100, 50);
//        JCheckBox 哮喘_box = new JCheckBox();
//        哮喘_box.setBounds(10 + 60 + 110, 33 + 375, 20, 20);
//        哮喘_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (哮喘_box.isSelected()) {
//                    if (!name.getText().contains("哮喘")) {
//                        name.setText(name.getText() + " 哮喘");
//                    }
//                } else {
//                    if (name.getText().contains("哮喘")) {
//                        name.setText(name.getText().replace("哮喘", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(哮喘);
//        this.add(哮喘_box);
//        //copy tab
//        JLabel 四肢抽搐 = new JLabel("四肢抽搐:");
//        四肢抽搐.setForeground(Color.WHITE);
//        四肢抽搐.setBounds(10 + 110, 20 + 400, 100, 50);
//        JCheckBox 四肢抽搐_box = new JCheckBox();
//        四肢抽搐_box.setBounds(10 + 60 + 110, 33 + 400, 20, 20);
//        四肢抽搐_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (四肢抽搐_box.isSelected()) {
//                    if (!name.getText().contains("四肢抽搐")) {
//                        name.setText(name.getText() + " 四肢抽搐");
//                    }
//                } else {
//                    if (name.getText().contains("四肢抽搐")) {
//                        name.setText(name.getText().replace("四肢抽搐", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(四肢抽搐);
//        this.add(四肢抽搐_box);
//        //copy tab
//        JLabel 癫痫 = new JLabel("癫痫:");
//        癫痫.setForeground(Color.WHITE);
//        癫痫.setBounds(10 + 110, 20 + 425, 100, 50);
//        JCheckBox 癫痫_box = new JCheckBox();
//        癫痫_box.setBounds(10 + 60 + 110, 33 + 425, 20, 20);
//        癫痫_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (癫痫_box.isSelected()) {
//                    if (!name.getText().contains("癫痫")) {
//                        name.setText(name.getText() + " 癫痫");
//                    }
//                } else {
//                    if (name.getText().contains("癫痫")) {
//                        name.setText(name.getText().replace("癫痫", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(癫痫);
//        this.add(癫痫_box);
//        //copy tab
//        JLabel 梦痫 = new JLabel("梦痫:");
//        梦痫.setForeground(Color.WHITE);
//        梦痫.setBounds(10 + 110, 20 + 450, 100, 50);
//        JCheckBox 梦痫_box = new JCheckBox();
//        梦痫_box.setBounds(10 + 60 + 110, 33 + 450, 20, 20);
//        梦痫_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (梦痫_box.isSelected()) {
//                    if (!name.getText().contains("梦痫")) {
//                        name.setText(name.getText() + " 梦痫");
//                    }
//                } else {
//                    if (name.getText().contains("梦痫")) {
//                        name.setText(name.getText().replace("梦痫", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(梦痫);
//        this.add(梦痫_box);
//        //copy tab
//        JLabel 梦话 = new JLabel("梦话:");
//        梦话.setForeground(Color.WHITE);
//        梦话.setBounds(10 + 110, 20 + 475, 100, 50);
//        JCheckBox 梦话_box = new JCheckBox();
//        梦话_box.setBounds(10 + 60 + 110, 33 + 475, 20, 20);
//        梦话_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (梦话_box.isSelected()) {
//                    if (!name.getText().contains("梦话")) {
//                        name.setText(name.getText() + " 梦话");
//                    }
//                } else {
//                    if (name.getText().contains("梦话")) {
//                        name.setText(name.getText().replace("梦话", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(梦话);
//        this.add(梦话_box);
//        //copy tab
//        JLabel 梦遗 = new JLabel("梦遗:");
//        梦遗.setForeground(Color.WHITE);
//        梦遗.setBounds(10 + 110, 20 + 500, 100, 50);
//        JCheckBox 梦遗_box = new JCheckBox();
//        梦遗_box.setBounds(10 + 60 + 110, 33 + 500, 20, 20);
//        梦遗_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (梦遗_box.isSelected()) {
//                    if (!name.getText().contains("梦遗")) {
//                        name.setText(name.getText() + " 梦遗");
//                    }
//                } else {
//                    if (name.getText().contains("梦遗")) {
//                        name.setText(name.getText().replace("梦遗", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(梦遗);
//        this.add(梦遗_box);
//        //copy tab
//        JLabel 梦游 = new JLabel("梦游:");
//        梦游.setForeground(Color.WHITE);
//        梦游.setBounds(10 + 110 + 110, 20 + 0, 100, 50);
//        JCheckBox 梦游_box = new JCheckBox();
//        梦游_box.setBounds(10 + 60 + 110 + 110, 33 + 0, 20, 20);
//        梦游_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (梦游_box.isSelected()) {
//                    if (!name.getText().contains("梦游")) {
//                        name.setText(name.getText() + " 梦游");
//                    }
//                } else {
//                    if (name.getText().contains("梦游")) {
//                        name.setText(name.getText().replace("梦游", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(梦游);
//        this.add(梦游_box);
//        //copy tab
//        JLabel 惊厥 = new JLabel("惊厥:");
//        惊厥.setForeground(Color.WHITE);
//        惊厥.setBounds(10 + 110 + 110, 20 + 25, 100, 50);
//        JCheckBox 惊厥_box = new JCheckBox();
//        惊厥_box.setBounds(10 + 60 + 110 + 110, 33 + 25, 20, 20);
//        惊厥_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (惊厥_box.isSelected()) {
//                    if (!name.getText().contains("惊厥")) {
//                        name.setText(name.getText() + " 惊厥");
//                    }
//                } else {
//                    if (name.getText().contains("惊厥")) {
//                        name.setText(name.getText().replace("惊厥", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(惊厥);
//        this.add(惊厥_box);
//        //copy tab
//        JLabel 昏迷 = new JLabel("昏迷:");
//        昏迷.setForeground(Color.WHITE);
//        昏迷.setBounds(10 + 110 + 110, 20 + 50, 100, 50);
//        JCheckBox 昏迷_box = new JCheckBox();
//        昏迷_box.setBounds(10 + 60 + 110 + 110, 33 + 50, 20, 20);
//        昏迷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (昏迷_box.isSelected()) {
//                    if (!name.getText().contains("昏迷")) {
//                        name.setText(name.getText() + " 昏迷");
//                    }
//                } else {
//                    if (name.getText().contains("昏迷")) {
//                        name.setText(name.getText().replace("昏迷", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(昏迷);
//        this.add(昏迷_box);
//        //copy tab
//        JLabel 中风 = new JLabel("中风:");
//        中风.setForeground(Color.WHITE);
//        中风.setBounds(10 + 110 + 110, 20 + 75, 100, 50);
//        JCheckBox 中风_box = new JCheckBox();
//        中风_box.setBounds(10 + 60 + 110 + 110, 33 + 75, 20, 20);
//        中风_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (中风_box.isSelected()) {
//                    if (!name.getText().contains("中风")) {
//                        name.setText(name.getText() + " 中风");
//                    }
//                } else {
//                    if (name.getText().contains("中风")) {
//                        name.setText(name.getText().replace("中风", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(中风);
//        this.add(中风_box);
//        //copy tab
//        JLabel 偏瘫 = new JLabel("偏瘫:");
//        偏瘫.setForeground(Color.WHITE);
//        偏瘫.setBounds(10 + 110 + 110, 20 + 100, 100, 50);
//        JCheckBox 偏瘫_box = new JCheckBox();
//        偏瘫_box.setBounds(10 + 60 + 110 + 110, 33 + 100, 20, 20);
//        偏瘫_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (偏瘫_box.isSelected()) {
//                    if (!name.getText().contains("偏瘫")) {
//                        name.setText(name.getText() + " 偏瘫");
//                    }
//                } else {
//                    if (name.getText().contains("偏瘫")) {
//                        name.setText(name.getText().replace("偏瘫", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(偏瘫);
//        this.add(偏瘫_box);
//        //copy tab
//        JLabel 便血 = new JLabel("便血:");
//        便血.setForeground(Color.WHITE);
//        便血.setBounds(10 + 110 + 110, 20 + 125, 100, 50);
//        JCheckBox 便血_box = new JCheckBox();
//        便血_box.setBounds(10 + 60 + 110 + 110, 33 + 125, 20, 20);
//        便血_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (便血_box.isSelected()) {
//                    if (!name.getText().contains("便血")) {
//                        name.setText(name.getText() + " 便血");
//                    }
//                } else {
//                    if (name.getText().contains("便血")) {
//                        name.setText(name.getText().replace("便血", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(便血);
//        this.add(便血_box);
//        //copy tab
//        JLabel 便白 = new JLabel("便白:");
//        便白.setForeground(Color.WHITE);
//        便白.setBounds(10 + 110 + 110, 20 + 150, 100, 50);
//        JCheckBox 便白_box = new JCheckBox();
//        便白_box.setBounds(10 + 60 + 110 + 110, 33 + 150, 20, 20);
//        便白_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (便白_box.isSelected()) {
//                    if (!name.getText().contains("便白")) {
//                        name.setText(name.getText() + " 便白");
//                    }
//                } else {
//                    if (name.getText().contains("便白")) {
//                        name.setText(name.getText().replace("便白", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(便白);
//        this.add(便白_box);
//        //copy tab
//        JLabel 便溏 = new JLabel("便溏:");
//        便溏.setForeground(Color.WHITE);
//        便溏.setBounds(10 + 110 + 110, 20 + 175, 100, 50);
//        JCheckBox 便溏_box = new JCheckBox();
//        便溏_box.setBounds(10 + 60 + 110 + 110, 33 + 175, 20, 20);
//        便溏_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (便溏_box.isSelected()) {
//                    if (!name.getText().contains("便溏")) {
//                        name.setText(name.getText() + " 便溏");
//                    }
//                } else {
//                    if (name.getText().contains("便溏")) {
//                        name.setText(name.getText().replace("便溏", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(便溏);
//        this.add(便溏_box);
//        //copy tab
//        JLabel 便秘 = new JLabel("便秘:");
//        便秘.setForeground(Color.WHITE);
//        便秘.setBounds(10 + 110 + 110, 20 + 200, 100, 50);
//        JCheckBox 便秘_box = new JCheckBox();
//        便秘_box.setBounds(10 + 60 + 110 + 110, 33 + 200, 20, 20);
//        便秘_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (便秘_box.isSelected()) {
//                    if (!name.getText().contains("便秘")) {
//                        name.setText(name.getText() + " 便秘");
//                    }
//                } else {
//                    if (name.getText().contains("便秘")) {
//                        name.setText(name.getText().replace("便秘", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(便秘);
//        this.add(便秘_box);
//        //copy tab
//        JLabel 便恶臭 = new JLabel("便恶臭:");
//        便恶臭.setForeground(Color.WHITE);
//        便恶臭.setBounds(10 + 110 + 110, 20 + 225, 100, 50);
//        JCheckBox 便恶臭_box = new JCheckBox();
//        便恶臭_box.setBounds(10 + 60 + 110 + 110, 33 + 225, 20, 20);
//        便恶臭_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (便恶臭_box.isSelected()) {
//                    if (!name.getText().contains("便恶臭")) {
//                        name.setText(name.getText() + " 便恶臭");
//                    }
//                } else {
//                    if (name.getText().contains("便恶臭")) {
//                        name.setText(name.getText().replace("便恶臭", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(便恶臭);
//        this.add(便恶臭_box);
//        //copy tab
//        JLabel 腹胀 = new JLabel("腹胀:");
//        腹胀.setForeground(Color.WHITE);
//        腹胀.setBounds(10 + 110 + 110, 20 + 250, 100, 50);
//        JCheckBox 腹胀_box = new JCheckBox();
//        腹胀_box.setBounds(10 + 60 + 110 + 110, 33 + 250, 20, 20);
//        腹胀_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (腹胀_box.isSelected()) {
//                    if (!name.getText().contains("腹胀")) {
//                        name.setText(name.getText() + " 腹胀");
//                    }
//                } else {
//                    if (name.getText().contains("腹胀")) {
//                        name.setText(name.getText().replace("腹胀", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(腹胀);
//        this.add(腹胀_box);
//
//        //copy tab
//        JLabel 屁多 = new JLabel("屁多:");
//        屁多.setForeground(Color.WHITE);
//        屁多.setBounds(10 + 110 + 110, 20 + 275, 100, 50);
//        JCheckBox 屁多_box = new JCheckBox();
//        屁多_box.setBounds(10 + 60 + 110 + 110, 33 + 275, 20, 20);
//        屁多_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (屁多_box.isSelected()) {
//                    if (!name.getText().contains("屁多")) {
//                        name.setText(name.getText() + " 屁多");
//                    }
//                } else {
//                    if (name.getText().contains("屁多")) {
//                        name.setText(name.getText().replace("屁多", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(屁多);
//        this.add(屁多_box);
//        //copy tab
//        JLabel 痔疮 = new JLabel("痔疮:");
//        痔疮.setForeground(Color.WHITE);
//        痔疮.setBounds(10 + 110 + 110, 20 + 300, 100, 50);
//        JCheckBox 痔疮_box = new JCheckBox();
//        痔疮_box.setBounds(10 + 60 + 110 + 110, 33 + 300, 20, 20);
//        痔疮_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (痔疮_box.isSelected()) {
//                    if (!name.getText().contains("痔疮")) {
//                        name.setText(name.getText() + " 痔疮");
//                    }
//                } else {
//                    if (name.getText().contains("痔疮")) {
//                        name.setText(name.getText().replace("痔疮", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(痔疮);
//        this.add(痔疮_box);
//        //copy tab
//        JLabel 打摆子 = new JLabel("打摆子:");
//        打摆子.setForeground(Color.WHITE);
//        打摆子.setBounds(10 + 110 + 110, 20 + 325, 100, 50);
//        JCheckBox 打摆子_box = new JCheckBox();
//        打摆子_box.setBounds(10 + 60 + 110 + 110, 33 + 325, 20, 20);
//        打摆子_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (打摆子_box.isSelected()) {
//                    if (!name.getText().contains("打摆子")) {
//                        name.setText(name.getText() + " 打摆子");
//                    }
//                } else {
//                    if (name.getText().contains("打摆子")) {
//                        name.setText(name.getText().replace("打摆子", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(打摆子);
//        this.add(打摆子_box);
//        //copy tab
//        JLabel 诳语 = new JLabel("诳语:");
//        诳语.setForeground(Color.WHITE);
//        诳语.setBounds(10 + 110 + 110, 20 + 350, 100, 50);
//        JCheckBox 诳语_box = new JCheckBox();
//        诳语_box.setBounds(10 + 60 + 110 + 110, 33 + 350, 20, 20);
//        诳语_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (诳语_box.isSelected()) {
//                    if (!name.getText().contains("诳语")) {
//                        name.setText(name.getText() + " 诳语");
//                    }
//                } else {
//                    if (name.getText().contains("诳语")) {
//                        name.setText(name.getText().replace("诳语", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(诳语);
//        this.add(诳语_box);
//        //copy tab
//        JLabel 失音 = new JLabel("失音:");
//        失音.setForeground(Color.WHITE);
//        失音.setBounds(10 + 110 + 110, 20 + 375, 100, 50);
//        JCheckBox 失音_box = new JCheckBox();
//        失音_box.setBounds(10 + 60 + 110 + 110, 33 + 375, 20, 20);
//        失音_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (失音_box.isSelected()) {
//                    if (!name.getText().contains("失音")) {
//                        name.setText(name.getText() + " 失音");
//                    }
//                } else {
//                    if (name.getText().contains("失音")) {
//                        name.setText(name.getText().replace("失音", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(失音);
//        this.add(失音_box);
//        //copy tab
//        JLabel 嗓痛 = new JLabel("嗓痛:");
//        嗓痛.setForeground(Color.WHITE);
//        嗓痛.setBounds(10 + 110 + 110, 20 + 400, 100, 50);
//        JCheckBox 嗓痛_box = new JCheckBox();
//        嗓痛_box.setBounds(10 + 60 + 110 + 110, 33 + 400, 20, 20);
//        嗓痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (嗓痛_box.isSelected()) {
//                    if (!name.getText().contains("嗓痛")) {
//                        name.setText(name.getText() + " 嗓痛");
//                    }
//                } else {
//                    if (name.getText().contains("嗓痛")) {
//                        name.setText(name.getText().replace("嗓痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(嗓痛);
//        this.add(嗓痛_box);
//        //copy tab
//        JLabel 恶心 = new JLabel("恶心:");
//        恶心.setForeground(Color.WHITE);
//        恶心.setBounds(10 + 110 + 110, 20 + 425, 100, 50);
//        JCheckBox 恶心_box = new JCheckBox();
//        恶心_box.setBounds(10 + 60 + 110 + 110, 33 + 425, 20, 20);
//        恶心_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (恶心_box.isSelected()) {
//                    if (!name.getText().contains("恶心")) {
//                        name.setText(name.getText() + " 恶心");
//                    }
//                } else {
//                    if (name.getText().contains("恶心")) {
//                        name.setText(name.getText().replace("恶心", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(恶心);
//        this.add(恶心_box);
//        //copy tab
//        JLabel 反胃 = new JLabel("反胃:");
//        反胃.setForeground(Color.WHITE);
//        反胃.setBounds(10 + 110 + 110, 20 + 450, 100, 50);
//        JCheckBox 反胃_box = new JCheckBox();
//        反胃_box.setBounds(10 + 60 + 110 + 110, 33 + 450, 20, 20);
//        反胃_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (反胃_box.isSelected()) {
//                    if (!name.getText().contains("反胃")) {
//                        name.setText(name.getText() + " 反胃");
//                    }
//                } else {
//                    if (name.getText().contains("反胃")) {
//                        name.setText(name.getText().replace("反胃", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(反胃);
//        this.add(反胃_box);
//        //copy tab
//        JLabel 呕吐 = new JLabel("呕吐:");
//        呕吐.setForeground(Color.WHITE);
//        呕吐.setBounds(10 + 110 + 110, 20 + 475, 100, 50);
//        JCheckBox 呕吐_box = new JCheckBox();
//        呕吐_box.setBounds(10 + 60 + 110 + 110, 33 + 475, 20, 20);
//        呕吐_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (呕吐_box.isSelected()) {
//                    if (!name.getText().contains("呕吐")) {
//                        name.setText(name.getText() + " 呕吐");
//                    }
//                } else {
//                    if (name.getText().contains("呕吐")) {
//                        name.setText(name.getText().replace("呕吐", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(呕吐);
//        this.add(呕吐_box);
//        //copy tab
//        JLabel 吐血 = new JLabel("吐血:");
//        吐血.setForeground(Color.WHITE);
//        吐血.setBounds(10 + 110 + 110, 20 + 500, 100, 50);
//        JCheckBox 吐血_box = new JCheckBox();
//        吐血_box.setBounds(10 + 60 + 110 + 110, 33 + 500, 20, 20);
//        吐血_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (吐血_box.isSelected()) {
//                    if (!name.getText().contains("吐血")) {
//                        name.setText(name.getText() + " 吐血");
//                    }
//                } else {
//                    if (name.getText().contains("吐血")) {
//                        name.setText(name.getText().replace("吐血", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(吐血);
//        this.add(吐血_box);
//        //copy tab
//        JLabel 吐白沫 = new JLabel("吐白沫:");
//        吐白沫.setForeground(Color.WHITE);
//        吐白沫.setBounds(10 + 110 + 110 + 110, 20 + 0, 100, 50);
//        JCheckBox 吐白沫_box = new JCheckBox();
//        吐白沫_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 0, 20, 20);
//        吐白沫_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (吐白沫_box.isSelected()) {
//                    if (!name.getText().contains("吐白沫")) {
//                        name.setText(name.getText() + " 吐白沫");
//                    }
//                } else {
//                    if (name.getText().contains("吐白沫")) {
//                        name.setText(name.getText().replace("吐白沫", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(吐白沫);
//        this.add(吐白沫_box);
//        //copy tab
//        JLabel 发冷 = new JLabel("发冷:");
//        发冷.setForeground(Color.WHITE);
//        发冷.setBounds(10 + 110 + 110 + 110, 20 + 25, 100, 50);
//        JCheckBox 发冷_box = new JCheckBox();
//        发冷_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 25, 20, 20);
//        发冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (发冷_box.isSelected()) {
//                    if (!name.getText().contains("发冷")) {
//                        name.setText(name.getText() + " 发冷");
//                    }
//                } else {
//                    if (name.getText().contains("发冷")) {
//                        name.setText(name.getText().replace("发冷", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(发冷);
//        this.add(发冷_box);
//        //copy tab
//        JLabel 脓血 = new JLabel("脓血:");
//        脓血.setForeground(Color.WHITE);
//        脓血.setBounds(10 + 110 + 110 + 110, 20 + 50, 100, 50);
//        JCheckBox 脓血_box = new JCheckBox();
//        脓血_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 50, 20, 20);
//        脓血_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (脓血_box.isSelected()) {
//                    if (!name.getText().contains("脓血")) {
//                        name.setText(name.getText() + " 脓血");
//                    }
//                } else {
//                    if (name.getText().contains("脓血")) {
//                        name.setText(name.getText().replace("脓血", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(脓血);
//        this.add(脓血_box);
//        //copy tab
//        JLabel 皮炎 = new JLabel("皮炎:");
//        皮炎.setForeground(Color.WHITE);
//        皮炎.setBounds(10 + 110 + 110 + 110, 20 + 75, 100, 50);
//        JCheckBox 皮炎_box = new JCheckBox();
//        皮炎_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 75, 20, 20);
//        皮炎_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (皮炎_box.isSelected()) {
//                    if (!name.getText().contains("皮炎")) {
//                        name.setText(name.getText() + " 皮炎");
//                    }
//                } else {
//                    if (name.getText().contains("皮炎")) {
//                        name.setText(name.getText().replace("皮炎", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(皮炎);
//        this.add(皮炎_box);
//
//        //copy tab
//        JLabel 疱疹 = new JLabel("疱疹:");
//        疱疹.setForeground(Color.WHITE);
//        疱疹.setBounds(10 + 110 + 110 + 110, 20 + 100, 100, 50);
//        JCheckBox 疱疹_box = new JCheckBox();
//        疱疹_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 100, 20, 20);
//        疱疹_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (疱疹_box.isSelected()) {
//                    if (!name.getText().contains("疱疹")) {
//                        name.setText(name.getText() + " 疱疹");
//                    }
//                } else {
//                    if (name.getText().contains("疱疹")) {
//                        name.setText(name.getText().replace("疱疹", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(疱疹);
//        this.add(疱疹_box);
//        //copy tab
//        JLabel 风疹 = new JLabel("风疹:");
//        风疹.setForeground(Color.WHITE);
//        风疹.setBounds(10 + 110 + 110 + 110, 20 + 125, 100, 50);
//        JCheckBox 风疹_box = new JCheckBox();
//        风疹_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 125, 20, 20);
//        风疹_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (风疹_box.isSelected()) {
//                    if (!name.getText().contains("风疹")) {
//                        name.setText(name.getText() + " 风疹");
//                    }
//                } else {
//                    if (name.getText().contains("风疹")) {
//                        name.setText(name.getText().replace("风疹", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(风疹);
//        this.add(风疹_box);
//        //copy tab
//        JLabel 麻疹 = new JLabel("麻疹:");
//        麻疹.setForeground(Color.WHITE);
//        麻疹.setBounds(10 + 110 + 110 + 110, 20 + 150, 100, 50);
//        JCheckBox 麻疹_box = new JCheckBox();
//        麻疹_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 150, 20, 20);
//        麻疹_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (麻疹_box.isSelected()) {
//                    if (!name.getText().contains("麻疹")) {
//                        name.setText(name.getText() + " 麻疹");
//                    }
//                } else {
//                    if (name.getText().contains("麻疹")) {
//                        name.setText(name.getText().replace("麻疹", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(麻疹);
//        this.add(麻疹_box);
//        //copy tab
//        JLabel 湿疹 = new JLabel("湿疹:");
//        湿疹.setForeground(Color.WHITE);
//        湿疹.setBounds(10 + 110 + 110 + 110, 20 + 175, 100, 50);
//        JCheckBox 湿疹_box = new JCheckBox();
//        湿疹_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 175, 20, 20);
//        湿疹_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (湿疹_box.isSelected()) {
//                    if (!name.getText().contains("湿疹")) {
//                        name.setText(name.getText() + " 湿疹");
//                    }
//                } else {
//                    if (name.getText().contains("湿疹")) {
//                        name.setText(name.getText().replace("湿疹", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(湿疹);
//        this.add(湿疹_box);
//        //copy tab
//        JLabel 汗疹 = new JLabel("汗疹:");
//        汗疹.setForeground(Color.WHITE);
//        汗疹.setBounds(10 + 110 + 110 + 110, 20 + 200, 100, 50);
//        JCheckBox 汗疹_box = new JCheckBox();
//        汗疹_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 200, 20, 20);
//        汗疹_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (汗疹_box.isSelected()) {
//                    if (!name.getText().contains("汗疹")) {
//                        name.setText(name.getText() + " 汗疹");
//                    }
//                } else {
//                    if (name.getText().contains("汗疹")) {
//                        name.setText(name.getText().replace("汗疹", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(汗疹);
//        this.add(汗疹_box);
//        //copy tab
//        JLabel 梅毒 = new JLabel("梅毒:");
//        梅毒.setForeground(Color.WHITE);
//        梅毒.setBounds(10 + 110 + 110 + 110, 20 + 225, 100, 50);
//        JCheckBox 梅毒_box = new JCheckBox();
//        梅毒_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 225, 20, 20);
//        梅毒_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (梅毒_box.isSelected()) {
//                    if (!name.getText().contains("梅毒")) {
//                        name.setText(name.getText() + " 梅毒");
//                    }
//                } else {
//                    if (name.getText().contains("梅毒")) {
//                        name.setText(name.getText().replace("梅毒", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(梅毒);
//        this.add(梅毒_box);
//        //copy tab
//        JLabel 支原体病 = new JLabel("支原体病:");
//        支原体病.setForeground(Color.WHITE);
//        支原体病.setBounds(10 + 110 + 110 + 110, 20 + 250, 100, 50);
//        JCheckBox 支原体病_box = new JCheckBox();
//        支原体病_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 250, 20, 20);
//        支原体病_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (支原体病_box.isSelected()) {
//                    if (!name.getText().contains("支原体病")) {
//                        name.setText(name.getText() + " 支原体病");
//                    }
//                } else {
//                    if (name.getText().contains("支原体病")) {
//                        name.setText(name.getText().replace("支原体病", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(支原体病);
//        this.add(支原体病_box);
//        //copy tab
//        JLabel 衣原体病 = new JLabel("衣原体病:");
//        衣原体病.setForeground(Color.WHITE);
//        衣原体病.setBounds(10 + 110 + 110 + 110, 20 + 275, 100, 50);
//        JCheckBox 衣原体病_box = new JCheckBox();
//        衣原体病_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 275, 20, 20);
//        衣原体病_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (衣原体病_box.isSelected()) {
//                    if (!name.getText().contains("衣原体病")) {
//                        name.setText(name.getText() + " 衣原体病");
//                    }
//                } else {
//                    if (name.getText().contains("衣原体病")) {
//                        name.setText(name.getText().replace("衣原体病", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(衣原体病);
//        this.add(衣原体病_box);
//        //copy tab
//        JLabel 病毒感染 = new JLabel("病毒感染:");
//        病毒感染.setForeground(Color.WHITE);
//        病毒感染.setBounds(10 + 110 + 110 + 110, 20 + 300, 100, 50);
//        JCheckBox 病毒感染_box = new JCheckBox();
//        病毒感染_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 300, 20, 20);
//        病毒感染_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (病毒感染_box.isSelected()) {
//                    if (!name.getText().contains("病毒感染")) {
//                        name.setText(name.getText() + " 病毒感染");
//                    }
//                } else {
//                    if (name.getText().contains("病毒感染")) {
//                        name.setText(name.getText().replace("病毒感染", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(病毒感染);
//        this.add(病毒感染_box);
//        //copy tab
//        JLabel 狂犬病毒 = new JLabel("狂犬病毒:");
//        狂犬病毒.setForeground(Color.WHITE);
//        狂犬病毒.setBounds(10 + 110 + 110 + 110, 20 + 325, 100, 50);
//        JCheckBox 狂犬病毒_box = new JCheckBox();
//        狂犬病毒_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 325, 20, 20);
//        狂犬病毒_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (狂犬病毒_box.isSelected()) {
//                    if (!name.getText().contains("狂犬病毒")) {
//                        name.setText(name.getText() + " 狂犬病毒");
//                    }
//                } else {
//                    if (name.getText().contains("狂犬病毒")) {
//                        name.setText(name.getText().replace("狂犬病毒", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(狂犬病毒);
//        this.add(狂犬病毒_box);
//        //copy tab
//        JLabel 破生风 = new JLabel("破生风:");
//        破生风.setForeground(Color.WHITE);
//        破生风.setBounds(10 + 110 + 110 + 110, 20 + 350, 100, 50);
//        JCheckBox 破生风_box = new JCheckBox();
//        破生风_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 350, 20, 20);
//        破生风_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (破生风_box.isSelected()) {
//                    if (!name.getText().contains("破生风")) {
//                        name.setText(name.getText() + " 破生风");
//                    }
//                } else {
//                    if (name.getText().contains("破生风")) {
//                        name.setText(name.getText().replace("破生风", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(破生风);
//        this.add(破生风_box);
//        //copy tab
//        JLabel 骨折 = new JLabel("骨折:");
//        骨折.setForeground(Color.WHITE);
//        骨折.setBounds(10 + 110 + 110 + 110, 20 + 375, 100, 50);
//        JCheckBox 骨折_box = new JCheckBox();
//        骨折_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 375, 20, 20);
//        骨折_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (骨折_box.isSelected()) {
//                    if (!name.getText().contains("骨折")) {
//                        name.setText(name.getText() + " 骨折");
//                    }
//                } else {
//                    if (name.getText().contains("骨折")) {
//                        name.setText(name.getText().replace("骨折", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(骨折);
//        this.add(骨折_box);
//        //copy tab
//        JLabel 骨质疏松 = new JLabel("骨质疏松:");
//        骨质疏松.setForeground(Color.WHITE);
//        骨质疏松.setBounds(10 + 110 + 110 + 110, 20 + 400, 100, 50);
//        JCheckBox 骨质疏松_box = new JCheckBox();
//        骨质疏松_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 400, 20, 20);
//        骨质疏松_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (骨质疏松_box.isSelected()) {
//                    if (!name.getText().contains("骨质疏松")) {
//                        name.setText(name.getText() + " 骨质疏松");
//                    }
//                } else {
//                    if (name.getText().contains("骨质疏松")) {
//                        name.setText(name.getText().replace("骨质疏松", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(骨质疏松);
//        this.add(骨质疏松_box);
//        //copy tab
//        JLabel 牙痛 = new JLabel("牙痛:");
//        牙痛.setForeground(Color.WHITE);
//        牙痛.setBounds(10 + 110 + 110 + 110, 20 + 425, 100, 50);
//        JCheckBox 牙痛_box = new JCheckBox();
//        牙痛_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 425, 20, 20);
//        牙痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (牙痛_box.isSelected()) {
//                    if (!name.getText().contains("牙痛")) {
//                        name.setText(name.getText() + " 牙痛");
//                    }
//                } else {
//                    if (name.getText().contains("牙痛")) {
//                        name.setText(name.getText().replace("牙痛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(牙痛);
//        this.add(牙痛_box);
//        //copy tab
//        JLabel 怀孕 = new JLabel("怀孕:");
//        怀孕.setForeground(Color.WHITE);
//        怀孕.setBounds(10 + 110 + 110 + 110, 20 + 450, 100, 50);
//        JCheckBox 怀孕_box = new JCheckBox();
//        怀孕_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 450, 20, 20);
//        怀孕_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (怀孕_box.isSelected()) {
//                    if (!name.getText().contains("怀孕")) {
//                        name.setText(name.getText() + " 怀孕");
//                    }
//                } else {
//                    if (name.getText().contains("怀孕")) {
//                        name.setText(name.getText().replace("怀孕", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(怀孕);
//        this.add(怀孕_box);
//        //copy tab
//        JLabel 难产 = new JLabel("难产:");
//        难产.setForeground(Color.WHITE);
//        难产.setBounds(10 + 110 + 110 + 110, 20 + 475, 100, 50);
//        JCheckBox 难产_box = new JCheckBox();
//        难产_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 475, 20, 20);
//        难产_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (难产_box.isSelected()) {
//                    if (!name.getText().contains("难产")) {
//                        name.setText(name.getText() + " 难产");
//                    }
//                } else {
//                    if (name.getText().contains("难产")) {
//                        name.setText(name.getText().replace("难产", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(难产);
//        this.add(难产_box);
//        //copy tab
//        JLabel 带下 = new JLabel("带下:");
//        带下.setForeground(Color.WHITE);
//        带下.setBounds(10 + 110 + 110 + 110, 20 + 500, 100, 50);
//        JCheckBox 带下_box = new JCheckBox();
//        带下_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 500, 20, 20);
//        带下_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (带下_box.isSelected()) {
//                    if (!name.getText().contains("带下")) {
//                        name.setText(name.getText() + " 带下");
//                    }
//                } else {
//                    if (name.getText().contains("带下")) {
//                        name.setText(name.getText().replace("带下", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(带下);
//        this.add(带下_box);
//        //copy tab
//        JLabel 美容 = new JLabel("美容:");
//        美容.setForeground(Color.WHITE);
//        美容.setBounds(10 + 110 + 110 + 220, 20 + 0, 100, 50);
//        JCheckBox 美容_box = new JCheckBox();
//        美容_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 0, 20, 20);
//        美容_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (美容_box.isSelected()) {
//                    if (!name.getText().contains("美容")) {
//                        name.setText(name.getText() + " 美容");
//                    }
//                } else {
//                    if (name.getText().contains("美容")) {
//                        name.setText(name.getText().replace("美容", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(美容);
//        this.add(美容_box);
//        //copy tab
//        JLabel 护肤 = new JLabel("护肤:");
//        护肤.setForeground(Color.WHITE);
//        护肤.setBounds(10 + 110 + 110 + 220, 20 + 25, 100, 50);
//        JCheckBox 护肤_box = new JCheckBox();
//        护肤_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 25, 20, 20);
//        护肤_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (护肤_box.isSelected()) {
//                    if (!name.getText().contains("护肤")) {
//                        name.setText(name.getText() + " 护肤");
//                    }
//                } else {
//                    if (name.getText().contains("护肤")) {
//                        name.setText(name.getText().replace("护肤", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(护肤);
//        this.add(护肤_box);
//        //copy tab
//        JLabel 生发 = new JLabel("生发:");
//        生发.setForeground(Color.WHITE);
//        生发.setBounds(10 + 110 + 110 + 220, 20 + 50, 100, 50);
//        JCheckBox 生发_box = new JCheckBox();
//        生发_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 50, 20, 20);
//        生发_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (生发_box.isSelected()) {
//                    if (!name.getText().contains("生发")) {
//                        name.setText(name.getText() + " 生发");
//                    }
//                } else {
//                    if (name.getText().contains("生发")) {
//                        name.setText(name.getText().replace("生发", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(生发);
//        this.add(生发_box);
//        //copy tab
//        JLabel 明目 = new JLabel("明目:");
//        明目.setForeground(Color.WHITE);
//        明目.setBounds(10 + 110 + 110 + 220, 20 + 75, 100, 50);
//        JCheckBox 明目_box = new JCheckBox();
//        明目_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 75, 20, 20);
//        明目_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (明目_box.isSelected()) {
//                    if (!name.getText().contains("明目")) {
//                        name.setText(name.getText() + " 明目");
//                    }
//                } else {
//                    if (name.getText().contains("明目")) {
//                        name.setText(name.getText().replace("明目", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(明目);
//        this.add(明目_box);
//        //copy tab
//        JLabel 润喉 = new JLabel("润喉:");
//        润喉.setForeground(Color.WHITE);
//        润喉.setBounds(10 + 110 + 110 + 220, 20 + 100, 100, 50);
//        JCheckBox 润喉_box = new JCheckBox();
//        润喉_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 100, 20, 20);
//        润喉_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (润喉_box.isSelected()) {
//                    if (!name.getText().contains("润喉")) {
//                        name.setText(name.getText() + " 润喉");
//                    }
//                } else {
//                    if (name.getText().contains("润喉")) {
//                        name.setText(name.getText().replace("润喉", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(润喉);
//        this.add(润喉_box);
//        //copy tab
//        JLabel 解蛇毒 = new JLabel("解蛇毒:");
//        解蛇毒.setForeground(Color.WHITE);
//        解蛇毒.setBounds(10 + 110 + 110 + 220, 20 + 125, 100, 50);
//        JCheckBox 解蛇毒_box = new JCheckBox();
//        解蛇毒_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 125, 20, 20);
//        解蛇毒_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (解蛇毒_box.isSelected()) {
//                    if (!name.getText().contains("解蛇毒")) {
//                        name.setText(name.getText() + " 解蛇毒");
//                    }
//                } else {
//                    if (name.getText().contains("解蛇毒")) {
//                        name.setText(name.getText().replace("解蛇毒", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(解蛇毒);
//        this.add(解蛇毒_box);
//        //copy tab
//        JLabel 营养 = new JLabel("营养:");
//        营养.setForeground(Color.WHITE);
//        营养.setBounds(10 + 110 + 110 + 220, 20 + 150, 100, 50);
//        JCheckBox 营养_box = new JCheckBox();
//        营养_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 150, 20, 20);
//        营养_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (营养_box.isSelected()) {
//                    if (!name.getText().contains("营养")) {
//                        name.setText(name.getText() + " 营养");
//                    }
//                } else {
//                    if (name.getText().contains("营养")) {
//                        name.setText(name.getText().replace("营养", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(营养);
//        this.add(营养_box);
//        //copy tab
//        JLabel 耳聋 = new JLabel("耳聋:");
//        耳聋.setForeground(Color.WHITE);
//        耳聋.setBounds(10 + 110 + 110 + 220, 20 + 175, 100, 50);
//        JCheckBox 耳聋_box = new JCheckBox();
//        耳聋_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 175, 20, 20);
//        耳聋_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (耳聋_box.isSelected()) {
//                    if (!name.getText().contains("耳聋")) {
//                        name.setText(name.getText() + " 耳聋");
//                    }
//                } else {
//                    if (name.getText().contains("耳聋")) {
//                        name.setText(name.getText().replace("耳聋", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(耳聋);
//        this.add(耳聋_box);
//        //copy tab
//        JLabel 月经不调 = new JLabel("月经不调:");
//        月经不调.setForeground(Color.WHITE);
//        月经不调.setBounds(10 + 110 + 110 + 220, 20 + 200, 100, 50);
//        JCheckBox 月经不调_box = new JCheckBox();
//        月经不调_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 200, 20, 20);
//        月经不调_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (月经不调_box.isSelected()) {
//                    if (!name.getText().contains("月经不调")) {
//                        name.setText(name.getText() + " 月经不调");
//                    }
//                } else {
//                    if (name.getText().contains("月经不调")) {
//                        name.setText(name.getText().replace("月经不调", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(月经不调);
//        this.add(月经不调_box);
//        //copy tab
//        JLabel 雀目 = new JLabel("雀目:");
//        雀目.setForeground(Color.WHITE);
//        雀目.setBounds(10 + 110 + 110 + 220, 20 + 225, 100, 50);
//        JCheckBox 雀目_box = new JCheckBox();
//        雀目_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 225, 20, 20);
//        雀目_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (雀目_box.isSelected()) {
//                    if (!name.getText().contains("雀目")) {
//                        name.setText(name.getText() + " 雀目");
//                    }
//                } else {
//                    if (name.getText().contains("雀目")) {
//                        name.setText(name.getText().replace("雀目", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(雀目);
//        this.add(雀目_box);
//        //copy tab
//        JLabel 痈疮脓疙 = new JLabel("痈疮脓疙:");
//        痈疮脓疙.setForeground(Color.WHITE);
//        痈疮脓疙.setBounds(10 + 110 + 110 + 220, 20 + 250, 100, 50);
//        JCheckBox 痈疮脓疙_box = new JCheckBox();
//        痈疮脓疙_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 250, 20, 20);
//        痈疮脓疙_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (痈疮脓疙_box.isSelected()) {
//                    if (!name.getText().contains("痈疮脓疙")) {
//                        name.setText(name.getText() + " 痈疮脓疙");
//                    }
//                } else {
//                    if (name.getText().contains("痈疮脓疙")) {
//                        name.setText(name.getText().replace("痈疮脓疙", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(痈疮脓疙);
//        this.add(痈疮脓疙_box);
//        //copy tab
//        JLabel 劳累所伤 = new JLabel("劳累所伤:");
//        劳累所伤.setForeground(Color.WHITE);
//        劳累所伤.setBounds(10 + 110 + 110 + 220, 20 + 275, 100, 50);
//        JCheckBox 劳累所伤_box = new JCheckBox();
//        劳累所伤_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 275, 20, 20);
//        劳累所伤_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (劳累所伤_box.isSelected()) {
//                    if (!name.getText().contains("劳累所伤")) {
//                        name.setText(name.getText() + " 劳累所伤");
//                    }
//                } else {
//                    if (name.getText().contains("劳累所伤")) {
//                        name.setText(name.getText().replace("劳累所伤", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(劳累所伤);
//        this.add(劳累所伤_box);
//        //copy tab
//        JLabel 脾气暴烈 = new JLabel("脾气暴烈:");
//        脾气暴烈.setForeground(Color.WHITE);
//        脾气暴烈.setBounds(10 + 110 + 110 + 220, 20 + 300, 100, 50);
//        JCheckBox 脾气暴烈_box = new JCheckBox();
//        脾气暴烈_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 300, 20, 20);
//        脾气暴烈_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (脾气暴烈_box.isSelected()) {
//                    if (!name.getText().contains("脾气暴烈")) {
//                        name.setText(name.getText() + " 脾气暴烈");
//                    }
//                } else {
//                    if (name.getText().contains("脾气暴烈")) {
//                        name.setText(name.getText().replace("脾气暴烈", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(脾气暴烈);
//        this.add(脾气暴烈_box);
//        //copy tab
//        JLabel 斑疹 = new JLabel("斑疹:");
//        斑疹.setForeground(Color.WHITE);
//        斑疹.setBounds(10 + 110 + 110 + 220, 20 + 325, 100, 50);
//        JCheckBox 斑疹_box = new JCheckBox();
//        斑疹_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 325, 20, 20);
//        斑疹_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (斑疹_box.isSelected()) {
//                    if (!name.getText().contains("斑疹")) {
//                        name.setText(name.getText() + " 斑疹");
//                    }
//                } else {
//                    if (name.getText().contains("斑疹")) {
//                        name.setText(name.getText().replace("斑疹", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(斑疹);
//        this.add(斑疹_box);
//        //copy tab
//        JLabel 肾结石 = new JLabel("肾结石:");
//        肾结石.setForeground(Color.WHITE);
//        肾结石.setBounds(10 + 110 + 110 + 220, 20 + 350, 100, 50);
//        JCheckBox 肾结石_box = new JCheckBox();
//        肾结石_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 350, 20, 20);
//        肾结石_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (肾结石_box.isSelected()) {
//                    if (!name.getText().contains("肾结石")) {
//                        name.setText(name.getText() + " 肾结石");
//                    }
//                } else {
//                    if (name.getText().contains("肾结石")) {
//                        name.setText(name.getText().replace("肾结石", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(肾结石);
//        this.add(肾结石_box);
//        //copy tab
//        JLabel 胆结石 = new JLabel("胆结石:");
//        胆结石.setForeground(Color.WHITE);
//        胆结石.setBounds(10 + 110 + 110 + 220, 20 + 375, 100, 50);
//        JCheckBox 胆结石_box = new JCheckBox();
//        胆结石_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 375, 20, 20);
//        胆结石_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (胆结石_box.isSelected()) {
//                    if (!name.getText().contains("胆结石")) {
//                        name.setText(name.getText() + " 胆结石");
//                    }
//                } else {
//                    if (name.getText().contains("胆结石")) {
//                        name.setText(name.getText().replace("胆结石", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(胆结石);
//        this.add(胆结石_box);
//        //copy tab
//        JLabel 高血压 = new JLabel("高血压:");
//        高血压.setForeground(Color.WHITE);
//        高血压.setBounds(10 + 110 + 110 + 220, 20 + 400, 100, 50);
//        JCheckBox 高血压_box = new JCheckBox();
//        高血压_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 400, 20, 20);
//        高血压_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (高血压_box.isSelected()) {
//                    if (!name.getText().contains("高血压")) {
//                        name.setText(name.getText() + " 高血压");
//                    }
//                } else {
//                    if (name.getText().contains("高血压")) {
//                        name.setText(name.getText().replace("高血压", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(高血压);
//        this.add(高血压_box);
//        //copy tab
//        JLabel 低血压 = new JLabel("低血压:");
//        低血压.setForeground(Color.WHITE);
//        低血压.setBounds(10 + 110 + 110 + 220, 20 + 425, 100, 50);
//        JCheckBox 低血压_box = new JCheckBox();
//        低血压_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 425, 20, 20);
//        低血压_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (低血压_box.isSelected()) {
//                    if (!name.getText().contains("低血压")) {
//                        name.setText(name.getText() + " 低血压");
//                    }
//                } else {
//                    if (name.getText().contains("低血压")) {
//                        name.setText(name.getText().replace("低血压", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(低血压);
//        this.add(低血压_box);
//        //copy tab
//        JLabel 崩漏 = new JLabel("崩漏:");
//        崩漏.setForeground(Color.WHITE);
//        崩漏.setBounds(10 + 110 + 110 + 220, 20 + 450, 100, 50);
//        JCheckBox 崩漏_box = new JCheckBox();
//        崩漏_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 450, 20, 20);
//        崩漏_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (崩漏_box.isSelected()) {
//                    if (!name.getText().contains("崩漏")) {
//                        name.setText(name.getText() + " 崩漏");
//                    }
//                } else {
//                    if (name.getText().contains("崩漏")) {
//                        name.setText(name.getText().replace("崩漏", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(崩漏);
//        this.add(崩漏_box);
//
//        //copy tab
//        JLabel 挑食 = new JLabel("挑食:");
//        挑食.setForeground(Color.WHITE);
//        挑食.setBounds(10 + 110 + 110 + 220, 20 + 475, 100, 50);
//        JCheckBox 挑食_box = new JCheckBox();
//        挑食_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 475, 20, 20);
//        挑食_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (挑食_box.isSelected()) {
//                    if (!name.getText().contains("挑食")) {
//                        name.setText(name.getText() + " 挑食");
//                    }
//                } else {
//                    if (name.getText().contains("挑食")) {
//                        name.setText(name.getText().replace("挑食", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(挑食);
//        this.add(挑食_box);
//        //copy tab
//        JLabel 厌食 = new JLabel("厌食:");
//        厌食.setForeground(Color.WHITE);
//        厌食.setBounds(10 + 110 + 110 + 220, 20 + 500, 100, 50);
//        JCheckBox 厌食_box = new JCheckBox();
//        厌食_box.setBounds(10 + 60 + 110 + 110 + 220, 33 + 500, 20, 20);
//        厌食_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (厌食_box.isSelected()) {
//                    if (!name.getText().contains("厌食")) {
//                        name.setText(name.getText() + " 厌食");
//                    }
//                } else {
//                    if (name.getText().contains("厌食")) {
//                        name.setText(name.getText().replace("厌食", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(厌食);
//        this.add(厌食_box);
//        //copy tab
//        JLabel 绝食 = new JLabel("绝食:");
//        绝食.setForeground(Color.WHITE);
//        绝食.setBounds(10 + 110 + 110 + 330, 20 + 0, 100, 50);
//        JCheckBox 绝食_box = new JCheckBox();
//        绝食_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 0, 20, 20);
//        绝食_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (绝食_box.isSelected()) {
//                    if (!name.getText().contains("绝食")) {
//                        name.setText(name.getText() + " 绝食");
//                    }
//                } else {
//                    if (name.getText().contains("绝食")) {
//                        name.setText(name.getText().replace("绝食", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(绝食);
//        this.add(绝食_box);
//        //copy tab
//        JLabel 暴饮暴食 = new JLabel("暴饮暴食:");
//        暴饮暴食.setForeground(Color.WHITE);
//        暴饮暴食.setBounds(10 + 110 + 110 + 330, 20 + 25, 100, 50);
//        JCheckBox 暴饮暴食_box = new JCheckBox();
//        暴饮暴食_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 25, 20, 20);
//        暴饮暴食_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (暴饮暴食_box.isSelected()) {
//                    if (!name.getText().contains("暴饮暴食")) {
//                        name.setText(name.getText() + " 暴饮暴食");
//                    }
//                } else {
//                    if (name.getText().contains("暴饮暴食")) {
//                        name.setText(name.getText().replace("暴饮暴食", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(暴饮暴食);
//        this.add(暴饮暴食_box);
//        //copy tab
//        JLabel 水肿 = new JLabel("水肿:");
//        水肿.setForeground(Color.WHITE);
//        水肿.setBounds(10 + 110 + 110 + 330, 20 + 50, 100, 50);
//        JCheckBox 水肿_box = new JCheckBox();
//        水肿_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 50, 20, 20);
//        水肿_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (水肿_box.isSelected()) {
//                    if (!name.getText().contains("水肿")) {
//                        name.setText(name.getText() + " 水肿");
//                    }
//                } else {
//                    if (name.getText().contains("水肿")) {
//                        name.setText(name.getText().replace("水肿", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(水肿);
//        this.add(水肿_box);
//        //copy tab
//        JLabel 肿胀 = new JLabel("肿胀:");
//        肿胀.setForeground(Color.WHITE);
//        肿胀.setBounds(10 + 110 + 110 + 330, 20 + 75, 100, 50);
//        JCheckBox 肿胀_box = new JCheckBox();
//        肿胀_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 75, 20, 20);
//        肿胀_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (肿胀_box.isSelected()) {
//                    if (!name.getText().contains("肿胀")) {
//                        name.setText(name.getText() + " 肿胀");
//                    }
//                } else {
//                    if (name.getText().contains("肿胀")) {
//                        name.setText(name.getText().replace("肿胀", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(肿胀);
//        this.add(肿胀_box);
//        //copy tab
//        JLabel 呼吸不畅 = new JLabel("呼吸不畅:");
//        呼吸不畅.setForeground(Color.WHITE);
//        呼吸不畅.setBounds(10 + 110 + 110 + 330, 20 + 100, 100, 50);
//        JCheckBox 呼吸不畅_box = new JCheckBox();
//        呼吸不畅_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 100, 20, 20);
//        呼吸不畅_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (呼吸不畅_box.isSelected()) {
//                    if (!name.getText().contains("呼吸不畅")) {
//                        name.setText(name.getText() + " 呼吸不畅");
//                    }
//                } else {
//                    if (name.getText().contains("呼吸不畅")) {
//                        name.setText(name.getText().replace("呼吸不畅", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(呼吸不畅);
//        this.add(呼吸不畅_box);
//        //copy tab
//        JLabel 口臭 = new JLabel("口臭:");
//        口臭.setForeground(Color.WHITE);
//        口臭.setBounds(10 + 110 + 110 + 330, 20 + 125, 100, 50);
//        JCheckBox 口臭_box = new JCheckBox();
//        口臭_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 125, 20, 20);
//        口臭_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (口臭_box.isSelected()) {
//                    if (!name.getText().contains("口臭")) {
//                        name.setText(name.getText() + " 口臭");
//                    }
//                } else {
//                    if (name.getText().contains("口臭")) {
//                        name.setText(name.getText().replace("口臭", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(口臭);
//        this.add(口臭_box);
//        //copy tab
//        JLabel 打嗝 = new JLabel("打嗝:");
//        打嗝.setForeground(Color.WHITE);
//        打嗝.setBounds(10 + 110 + 110 + 330, 20 + 150, 100, 50);
//        JCheckBox 打嗝_box = new JCheckBox();
//        打嗝_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 150, 20, 20);
//        打嗝_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (打嗝_box.isSelected()) {
//                    if (!name.getText().contains("打嗝")) {
//                        name.setText(name.getText() + " 打嗝");
//                    }
//                } else {
//                    if (name.getText().contains("打嗝")) {
//                        name.setText(name.getText().replace("打嗝", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(打嗝);
//        this.add(打嗝_box);
//        //copy tab
//        JLabel 奢睡 = new JLabel("奢睡:");
//        奢睡.setForeground(Color.WHITE);
//        奢睡.setBounds(10 + 110 + 110 + 330, 20 + 175, 100, 50);
//        JCheckBox 奢睡_box = new JCheckBox();
//        奢睡_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 175, 20, 20);
//        奢睡_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (奢睡_box.isSelected()) {
//                    if (!name.getText().contains("奢睡")) {
//                        name.setText(name.getText() + " 奢睡");
//                    }
//                } else {
//                    if (name.getText().contains("奢睡")) {
//                        name.setText(name.getText().replace("奢睡", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(奢睡);
//        this.add(奢睡_box);
//        //copy tab
//        JLabel 肥胖 = new JLabel("肥胖:");
//        肥胖.setForeground(Color.WHITE);
//        肥胖.setBounds(10 + 110 + 110 + 330, 20 + 200, 100, 50);
//        JCheckBox 肥胖_box = new JCheckBox();
//        肥胖_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 200, 20, 20);
//        肥胖_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (肥胖_box.isSelected()) {
//                    if (!name.getText().contains("肥胖")) {
//                        name.setText(name.getText() + " 肥胖");
//                    }
//                } else {
//                    if (name.getText().contains("肥胖")) {
//                        name.setText(name.getText().replace("肥胖", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(肥胖);
//        this.add(肥胖_box);
//        //copy tab
//        JLabel 流口水 = new JLabel("流口水:");
//        流口水.setForeground(Color.WHITE);
//        流口水.setBounds(10 + 110 + 110 + 330, 20 + 225, 100, 50);
//        JCheckBox 流口水_box = new JCheckBox();
//        流口水_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 225, 20, 20);
//        流口水_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (流口水_box.isSelected()) {
//                    if (!name.getText().contains("流口水")) {
//                        name.setText(name.getText() + " 流口水");
//                    }
//                } else {
//                    if (name.getText().contains("流口水")) {
//                        name.setText(name.getText().replace("流口水", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(流口水);
//        this.add(流口水_box);
//        //copy tab
//        JLabel 闭经 = new JLabel("闭经:");
//        闭经.setForeground(Color.WHITE);
//        闭经.setBounds(10 + 110 + 110 + 330, 20 + 250, 100, 50);
//        JCheckBox 闭经_box = new JCheckBox();
//        闭经_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 250, 20, 20);
//        闭经_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (闭经_box.isSelected()) {
//                    if (!name.getText().contains("闭经")) {
//                        name.setText(name.getText() + " 闭经");
//                    }
//                } else {
//                    if (name.getText().contains("闭经")) {
//                        name.setText(name.getText().replace("闭经", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(闭经);
//        this.add(闭经_box);
//        //copy tab
//        JLabel 中毒 = new JLabel("中毒:");
//        中毒.setForeground(Color.WHITE);
//        中毒.setBounds(10 + 110 + 110 + 330, 20 + 275, 100, 50);
//        JCheckBox 中毒_box = new JCheckBox();
//        中毒_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 275, 20, 20);
//        中毒_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (中毒_box.isSelected()) {
//                    if (!name.getText().contains("中毒")) {
//                        name.setText(name.getText() + " 中毒");
//                    }
//                } else {
//                    if (name.getText().contains("中毒")) {
//                        name.setText(name.getText().replace("中毒", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(中毒);
//        this.add(中毒_box);
//        //copy tab
//        JLabel 尿血 = new JLabel("尿血:");
//        尿血.setForeground(Color.WHITE);
//        尿血.setBounds(10 + 110 + 110 + 330, 20 + 300, 100, 50);
//        JCheckBox 尿血_box = new JCheckBox();
//        尿血_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 300, 20, 20);
//        尿血_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (尿血_box.isSelected()) {
//                    if (!name.getText().contains("尿血")) {
//                        name.setText(name.getText() + " 尿血");
//                    }
//                } else {
//                    if (name.getText().contains("尿血")) {
//                        name.setText(name.getText().replace("尿血", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(尿血);
//        this.add(尿血_box);
//        //copy tab
//        JLabel 止血 = new JLabel("止血:");
//        止血.setForeground(Color.WHITE);
//        止血.setBounds(10 + 110 + 110 + 330, 20 + 325, 100, 50);
//        JCheckBox 止血_box = new JCheckBox();
//        止血_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 325, 20, 20);
//        止血_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (止血_box.isSelected()) {
//                    if (!name.getText().contains("止血")) {
//                        name.setText(name.getText() + " 止血");
//                    }
//                } else {
//                    if (name.getText().contains("止血")) {
//                        name.setText(name.getText().replace("止血", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(止血);
//        this.add(止血_box);
//        //copy tab
//        JLabel 贫血 = new JLabel("贫血:");
//        贫血.setForeground(Color.WHITE);
//        贫血.setBounds(10 + 110 + 110 + 330, 20 + 350, 100, 50);
//        JCheckBox 贫血_box = new JCheckBox();
//        贫血_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 350, 20, 20);
//        贫血_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (贫血_box.isSelected()) {
//                    if (!name.getText().contains("贫血")) {
//                        name.setText(name.getText() + " 贫血");
//                    }
//                } else {
//                    if (name.getText().contains("贫血")) {
//                        name.setText(name.getText().replace("贫血", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(贫血);
//        this.add(贫血_box);
//        //copy tab
//        JLabel 青春痘 = new JLabel("青春痘:");
//        青春痘.setForeground(Color.WHITE);
//        青春痘.setBounds(10 + 110 + 110 + 330, 20 + 375, 100, 50);
//        JCheckBox 青春痘_box = new JCheckBox();
//        青春痘_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 375, 20, 20);
//        青春痘_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (青春痘_box.isSelected()) {
//                    if (!name.getText().contains("青春痘")) {
//                        name.setText(name.getText() + " 青春痘");
//                    }
//                } else {
//                    if (name.getText().contains("青春痘")) {
//                        name.setText(name.getText().replace("青春痘", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(青春痘);
//        this.add(青春痘_box);
//        //copy tab
//        JLabel 筋伤 = new JLabel("筋伤:");
//        筋伤.setForeground(Color.WHITE);
//        筋伤.setBounds(10 + 110 + 110 + 330, 20 + 400, 100, 50);
//        JCheckBox 筋伤_box = new JCheckBox();
//        筋伤_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 400, 20, 20);
//        筋伤_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (筋伤_box.isSelected()) {
//                    if (!name.getText().contains("筋伤")) {
//                        name.setText(name.getText() + " 筋伤");
//                    }
//                } else {
//                    if (name.getText().contains("筋伤")) {
//                        name.setText(name.getText().replace("筋伤", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(筋伤);
//        this.add(筋伤_box);
//        //copy tab
//        JLabel 癌症 = new JLabel("癌症:");
//        癌症.setForeground(Color.WHITE);
//        癌症.setBounds(10 + 110 + 110 + 330, 20 + 425, 100, 50);
//        JCheckBox 癌症_box = new JCheckBox();
//        癌症_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 425, 20, 20);
//        癌症_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (癌症_box.isSelected()) {
//                    if (!name.getText().contains("癌症")) {
//                        name.setText(name.getText() + " 癌症");
//                    }
//                } else {
//                    if (name.getText().contains("癌症")) {
//                        name.setText(name.getText().replace("癌症", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(癌症);
//        this.add(癌症_box);
//        //copy tab
//        JLabel 肿瘤 = new JLabel("肿瘤:");
//        肿瘤.setForeground(Color.WHITE);
//        肿瘤.setBounds(10 + 110 + 110 + 330, 20 + 450, 100, 50);
//        JCheckBox 肿瘤_box = new JCheckBox();
//        肿瘤_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 450, 20, 20);
//        肿瘤_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (肿瘤_box.isSelected()) {
//                    if (!name.getText().contains("肿瘤")) {
//                        name.setText(name.getText() + " 肿瘤");
//                    }
//                } else {
//                    if (name.getText().contains("肿瘤")) {
//                        name.setText(name.getText().replace("肿瘤", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(肿瘤);
//        this.add(肿瘤_box);
//        //copy tab
//        JLabel 休克 = new JLabel("休克:");
//        休克.setForeground(Color.WHITE);
//        休克.setBounds(10 + 110 + 110 + 330, 20 + 475, 100, 50);
//        JCheckBox 休克_box = new JCheckBox();
//        休克_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 475, 20, 20);
//        休克_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (休克_box.isSelected()) {
//                    if (!name.getText().contains("休克")) {
//                        name.setText(name.getText() + " 休克");
//                    }
//                } else {
//                    if (name.getText().contains("休克")) {
//                        name.setText(name.getText().replace("休克", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(休克);
//        this.add(休克_box);
//        //copy tab
//        JLabel 红眼病 = new JLabel("红眼病:");
//        红眼病.setForeground(Color.WHITE);
//        红眼病.setBounds(10 + 110 + 110 + 330, 20 + 500, 100, 50);
//        JCheckBox 红眼病_box = new JCheckBox();
//        红眼病_box.setBounds(10 + 60 + 110 + 110 + 330, 33 + 500, 20, 20);
//        红眼病_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (红眼病_box.isSelected()) {
//                    if (!name.getText().contains("红眼病")) {
//                        name.setText(name.getText() + " 红眼病");
//                    }
//                } else {
//                    if (name.getText().contains("红眼病")) {
//                        name.setText(name.getText().replace("红眼病", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(红眼病);
//        this.add(红眼病_box);
//        //copy tab
//        JLabel 痉挛 = new JLabel("痉挛:");
//        痉挛.setForeground(Color.WHITE);
//        痉挛.setBounds(10 + 110 + 110 + 440, 20 + 0, 100, 50);
//        JCheckBox 痉挛_box = new JCheckBox();
//        痉挛_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 0, 20, 20);
//        痉挛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (痉挛_box.isSelected()) {
//                    if (!name.getText().contains("痉挛")) {
//                        name.setText(name.getText() + " 痉挛");
//                    }
//                } else {
//                    if (name.getText().contains("痉挛")) {
//                        name.setText(name.getText().replace("痉挛", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(痉挛);
//        this.add(痉挛_box);
//        //copy tab
//        JLabel 失眠不寐 = new JLabel("失眠不寐:");
//        失眠不寐.setForeground(Color.WHITE);
//        失眠不寐.setBounds(10 + 110 + 110 + 440, 20 + 25, 100, 50);
//        JCheckBox 失眠不寐_box = new JCheckBox();
//        失眠不寐_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 25, 20, 20);
//        失眠不寐_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (失眠不寐_box.isSelected()) {
//                    if (!name.getText().contains("失眠不寐")) {
//                        name.setText(name.getText() + " 失眠不寐");
//                    }
//                } else {
//                    if (name.getText().contains("失眠不寐")) {
//                        name.setText(name.getText().replace("失眠不寐", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(失眠不寐);
//        this.add(失眠不寐_box);
//        //copy tab
//        JLabel 惊恐 = new JLabel("惊恐:");
//        惊恐.setForeground(Color.WHITE);
//        惊恐.setBounds(10 + 110 + 110 + 440, 20 + 50, 100, 50);
//        JCheckBox 惊恐_box = new JCheckBox();
//        惊恐_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 50, 20, 20);
//        惊恐_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (惊恐_box.isSelected()) {
//                    if (!name.getText().contains("惊恐")) {
//                        name.setText(name.getText() + " 惊恐");
//                    }
//                } else {
//                    if (name.getText().contains("惊恐")) {
//                        name.setText(name.getText().replace("惊恐", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(惊恐);
//        this.add(惊恐_box);
//        //copy tab
//        JLabel 耳鸣 = new JLabel("耳鸣:");
//        耳鸣.setForeground(Color.WHITE);
//        耳鸣.setBounds(10 + 110 + 110 + 440, 20 + 75, 100, 50);
//        JCheckBox 耳鸣_box = new JCheckBox();
//        耳鸣_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 75, 20, 20);
//        耳鸣_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (耳鸣_box.isSelected()) {
//                    if (!name.getText().contains("耳鸣")) {
//                        name.setText(name.getText() + " 耳鸣");
//                    }
//                } else {
//                    if (name.getText().contains("耳鸣")) {
//                        name.setText(name.getText().replace("耳鸣", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(耳鸣);
//        this.add(耳鸣_box);
//        //copy tab
//        JLabel 疝气 = new JLabel("疝气:");
//        疝气.setForeground(Color.WHITE);
//        疝气.setBounds(10 + 110 + 110 + 440, 20 + 100, 100, 50);
//        JCheckBox 疝气_box = new JCheckBox();
//        疝气_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 100, 20, 20);
//        疝气_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (疝气_box.isSelected()) {
//                    if (!name.getText().contains("疝气")) {
//                        name.setText(name.getText() + " 疝气");
//                    }
//                } else {
//                    if (name.getText().contains("疝气")) {
//                        name.setText(name.getText().replace("疝气", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(疝气);
//        this.add(疝气_box);
//        //copy tab
//        JLabel 震颤 = new JLabel("震颤:");
//        震颤.setForeground(Color.WHITE);
//        震颤.setBounds(10 + 110 + 110 + 440, 20 + 125, 100, 50);
//        JCheckBox 震颤_box = new JCheckBox();
//        震颤_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 125, 20, 20);
//        震颤_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (震颤_box.isSelected()) {
//                    if (!name.getText().contains("震颤")) {
//                        name.setText(name.getText() + " 震颤");
//                    }
//                } else {
//                    if (name.getText().contains("震颤")) {
//                        name.setText(name.getText().replace("震颤", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(震颤);
//        this.add(震颤_box);
//        //copy tab
//        JLabel 健忘 = new JLabel("健忘:");
//        健忘.setForeground(Color.WHITE);
//        健忘.setBounds(10 + 110 + 110 + 440, 20 + 150, 100, 50);
//        JCheckBox 健忘_box = new JCheckBox();
//        健忘_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 150, 20, 20);
//        健忘_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (健忘_box.isSelected()) {
//                    if (!name.getText().contains("健忘")) {
//                        name.setText(name.getText() + " 健忘");
//                    }
//                } else {
//                    if (name.getText().contains("健忘")) {
//                        name.setText(name.getText().replace("健忘", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(健忘);
//        this.add(健忘_box);
//        //copy tab
//        JLabel 衄血 = new JLabel("衄血:");
//        衄血.setForeground(Color.WHITE);
//        衄血.setBounds(10 + 110 + 110 + 440, 20 + 175, 100, 50);
//        JCheckBox 衄血_box = new JCheckBox();
//        衄血_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 175, 20, 20);
//        衄血_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (衄血_box.isSelected()) {
//                    if (!name.getText().contains("衄血")) {
//                        name.setText(name.getText() + " 衄血");
//                    }
//                } else {
//                    if (name.getText().contains("衄血")) {
//                        name.setText(name.getText().replace("衄血", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(衄血);
//        this.add(衄血_box);
//        //copy tab
//        JLabel 舌疮 = new JLabel("舌疮:");
//        舌疮.setForeground(Color.WHITE);
//        舌疮.setBounds(10 + 110 + 110 + 440, 20 + 200, 100, 50);
//        JCheckBox 舌疮_box = new JCheckBox();
//        舌疮_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 200, 20, 20);
//        舌疮_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (舌疮_box.isSelected()) {
//                    if (!name.getText().contains("舌疮")) {
//                        name.setText(name.getText() + " 舌疮");
//                    }
//                } else {
//                    if (name.getText().contains("舌疮")) {
//                        name.setText(name.getText().replace("舌疮", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(舌疮);
//        this.add(舌疮_box);
//        //copy tab
//        JLabel 心悸 = new JLabel("心悸:");
//        心悸.setForeground(Color.WHITE);
//        心悸.setBounds(10 + 110 + 110 + 440, 20 + 225, 100, 50);
//        JCheckBox 心悸_box = new JCheckBox();
//        心悸_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 225, 20, 20);
//        心悸_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (心悸_box.isSelected()) {
//                    if (!name.getText().contains("心悸")) {
//                        name.setText(name.getText() + " 心悸");
//                    }
//                } else {
//                    if (name.getText().contains("心悸")) {
//                        name.setText(name.getText().replace("心悸", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(心悸);
//        this.add(心悸_box);
//        //copy tab
//        JLabel 心烦 = new JLabel("心烦:");
//        心烦.setForeground(Color.WHITE);
//        心烦.setBounds(10 + 110 + 110 + 440, 20 + 250, 100, 50);
//        JCheckBox 心烦_box = new JCheckBox();
//        心烦_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 250, 20, 20);
//        心烦_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (心烦_box.isSelected()) {
//                    if (!name.getText().contains("心烦")) {
//                        name.setText(name.getText() + " 心烦");
//                    }
//                } else {
//                    if (name.getText().contains("心烦")) {
//                        name.setText(name.getText().replace("心烦", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(心烦);
//        this.add(心烦_box);
//        //copy tab
//        JLabel 失禁 = new JLabel("失禁:");
//        失禁.setForeground(Color.WHITE);
//        失禁.setBounds(10 + 110 + 110 + 440, 20 + 275, 100, 50);
//        JCheckBox 失禁_box = new JCheckBox();
//        失禁_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 275, 20, 20);
//        失禁_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (失禁_box.isSelected()) {
//                    if (!name.getText().contains("失禁")) {
//                        name.setText(name.getText() + " 失禁");
//                    }
//                } else {
//                    if (name.getText().contains("失禁")) {
//                        name.setText(name.getText().replace("失禁", ""));
//                    }
//                }
//            }
//        });
//        this.add(失禁);
//        this.add(失禁_box);
//        //copy tab
//        JLabel 阳痿 = new JLabel("阳痿:");
//        阳痿.setForeground(Color.WHITE);
//        阳痿.setBounds(10 + 110 + 110 + 440, 20 + 300, 100, 50);
//        JCheckBox 阳痿_box = new JCheckBox();
//        阳痿_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 300, 20, 20);
//        阳痿_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (阳痿_box.isSelected()) {
//                    if (!name.getText().contains("阳痿")) {
//                        name.setText(name.getText() + " 阳痿");
//                    }
//                } else {
//                    if (name.getText().contains("阳痿")) {
//                        name.setText(name.getText().replace("阳痿", ""));
//                    }
//                }
//            }
//        });
//        this.add(阳痿);
//        this.add(阳痿_box);
//        //copy tab
//        JLabel 癃闭 = new JLabel("癃闭:");
//        癃闭.setForeground(Color.WHITE);
//        癃闭.setBounds(10 + 110 + 110 + 440, 20 + 325, 100, 50);
//        JCheckBox 癃闭_box = new JCheckBox();
//        癃闭_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 325, 20, 20);
//        癃闭_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (癃闭_box.isSelected()) {
//                    if (!name.getText().contains("癃闭")) {
//                        name.setText(name.getText() + " 癃闭");
//                    }
//                } else {
//                    if (name.getText().contains("癃闭")) {
//                        name.setText(name.getText().replace("癃闭", ""));
//                    }
//                }
//            }
//        });
//        this.add(癃闭);
//        this.add(癃闭_box);
//        //copy tab
//        JLabel 消痿 = new JLabel("消痿:");
//        消痿.setForeground(Color.WHITE);
//        消痿.setBounds(10 + 110 + 110 + 440, 20 + 350, 100, 50);
//        JCheckBox 消痿_box = new JCheckBox();
//        消痿_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 350, 20, 20);
//        消痿_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (消痿_box.isSelected()) {
//                    if (!name.getText().contains("消痿")) {
//                        name.setText(name.getText() + " 消痿");
//                    }
//                } else {
//                    if (name.getText().contains("消痿")) {
//                        name.setText(name.getText().replace("消痿", ""));
//                    }
//                }
//            }
//        });
//        this.add(消痿);
//        this.add(消痿_box);
//        //copy tab
//        JLabel 小便刺痛 = new JLabel("小便刺痛:");
//        小便刺痛.setForeground(Color.WHITE);
//        小便刺痛.setBounds(10 + 110 + 110 + 440, 20 + 375, 100, 50);
//        JCheckBox 小便刺痛_box = new JCheckBox();
//        小便刺痛_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 375, 20, 20);
//        小便刺痛_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (小便刺痛_box.isSelected()) {
//                    if (!name.getText().contains("小便刺痛")) {
//                        name.setText(name.getText() + " 小便刺痛");
//                    }
//                } else {
//                    if (name.getText().contains("小便刺痛")) {
//                        name.setText(name.getText().replace("小便刺痛", ""));
//                    }
//                }
//            }
//        });
//        this.add(小便刺痛);
//        this.add(小便刺痛_box);
//        //copy tab
//        JLabel 遗尿 = new JLabel("遗尿:");
//        遗尿.setForeground(Color.WHITE);
//        遗尿.setBounds(10 + 110 + 110 + 440, 20 + 400, 100, 50);
//        JCheckBox 遗尿_box = new JCheckBox();
//        遗尿_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 400, 20, 20);
//        遗尿_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (遗尿_box.isSelected()) {
//                    if (!name.getText().contains("遗尿")) {
//                        name.setText(name.getText() + " 遗尿");
//                    }
//                } else {
//                    if (name.getText().contains("遗尿")) {
//                        name.setText(name.getText().replace("遗尿", ""));
//                    }
//                }
//            }
//        });
//        this.add(遗尿);
//        this.add(遗尿_box);
//        //copy tab
//        JLabel 易怒 = new JLabel("易怒:");
//        易怒.setForeground(Color.WHITE);
//        易怒.setBounds(10 + 110 + 110 + 440, 20 + 425, 100, 50);
//        JCheckBox 易怒_box = new JCheckBox();
//        易怒_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 425, 20, 20);
//        易怒_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (易怒_box.isSelected()) {
//                    if (!name.getText().contains("易怒")) {
//                        name.setText(name.getText() + " 易怒");
//                    }
//                } else {
//                    if (name.getText().contains("易怒")) {
//                        name.setText(name.getText().replace("易怒", ""));
//                    }
//                }
//            }
//        });
//        this.add(易怒);
//        this.add(易怒_box);
//        //copy tab
//        JLabel 疲倦 = new JLabel("疲倦:");
//        疲倦.setForeground(Color.WHITE);
//        疲倦.setBounds(10 + 110 + 110 + 440, 20 + 450, 100, 50);
//        JCheckBox 疲倦_box = new JCheckBox();
//        疲倦_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 450, 20, 20);
//        疲倦_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (疲倦_box.isSelected()) {
//                    if (!name.getText().contains("疲倦")) {
//                        name.setText(name.getText() + " 疲倦");
//                    }
//                } else {
//                    if (name.getText().contains("疲倦")) {
//                        name.setText(name.getText().replace("疲倦", ""));
//                    }
//                }
//            }
//        });
//        this.add(疲倦);
//        this.add(疲倦_box);
//        //copy tab
//        JLabel 瘙痒 = new JLabel("瘙痒:");
//        瘙痒.setForeground(Color.WHITE);
//        瘙痒.setBounds(10 + 110 + 110 + 440, 20 + 475, 100, 50);
//        JCheckBox 瘙痒_box = new JCheckBox();
//        瘙痒_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 475, 20, 20);
//        瘙痒_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (瘙痒_box.isSelected()) {
//                    if (!name.getText().contains("瘙痒")) {
//                        name.setText(name.getText() + " 瘙痒");
//                    }
//                } else {
//                    if (name.getText().contains("瘙痒")) {
//                        name.setText(name.getText().replace("瘙痒", ""));
//                    }
//                }
//            }
//        });
//        this.add(瘙痒);
//        this.add(瘙痒_box);
//        //copy tab
//        JLabel 黄疸 = new JLabel("黄疸:");
//        黄疸.setForeground(Color.WHITE);
//        黄疸.setBounds(10 + 110 + 110 + 440, 20 + 500, 100, 50);
//        JCheckBox 黄疸_box = new JCheckBox();
//        黄疸_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 500, 20, 20);
//        黄疸_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (黄疸_box.isSelected()) {
//                    if (!name.getText().contains("黄疸")) {
//                        name.setText(name.getText() + " 黄疸");
//                    }
//                } else {
//                    if (name.getText().contains("黄疸")) {
//                        name.setText(name.getText().replace("黄疸", ""));
//                    }
//                }
//
//            }
//        });
//        this.add(黄疸);
//        this.add(黄疸_box);
//    }
//}