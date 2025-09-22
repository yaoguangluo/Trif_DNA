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
//public class ChouchuJPanel extends JPanel {
//    /**
//     *
//     */
//    //
//    public ChouchuJPanel(JTextField name) {
//        this.setLayout(null);
//        this.setBounds(0, 0, 780, 610);
//        this.setBackground(Color.BLACK);
//        //
//        //copy tab
//        JLabel 麻痹 = new JLabel("麻痹:");
//        麻痹.setForeground(Color.WHITE);
//        麻痹.setBounds(10, 20, 100, 50);
//        JCheckBox 麻痹_box = new JCheckBox();
//        麻痹_box.setBounds(10 + 60, 33, 20, 20);
//        麻痹_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (麻痹_box.isSelected()) {
//                    if (!name.getText().contains("麻痹")) {
//                        name.setText(name.getText() + " 麻痹");
//                    }
//                } else {
//                    if (name.getText().contains("麻痹")) {
//                        name.setText(name.getText().replace("麻痹", ""));
//                    }
//                }
//            }
//        });
//        this.add(麻痹);
//        this.add(麻痹_box);
//        //copy tab
//        JLabel 阳痫 = new JLabel("阳痫:");
//        阳痫.setForeground(Color.WHITE);
//        阳痫.setBounds(10, 20 + 25, 100, 50);
//        JCheckBox 阳痫_box = new JCheckBox();
//        阳痫_box.setBounds(10 + 60, 33 + 25, 20, 20);
//        阳痫_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (阳痫_box.isSelected()) {
//                    if (!name.getText().contains("阳痫")) {
//                        name.setText(name.getText() + " 阳痫");
//                    }
//                } else {
//                    if (name.getText().contains("阳痫")) {
//                        name.setText(name.getText().replace("阳痫", ""));
//                    }
//                }
//            }
//        });
//        this.add(阳痫);
//        this.add(阳痫_box);
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
//            }
//        });
//        this.add(梦痫);
//        this.add(梦痫_box);
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
//            }
//        });
//        this.add(打摆子);
//        this.add(打摆子_box);
//
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
//            }
//        });
//        this.add(痉挛);
//        this.add(痉挛_box);
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
//            }
//        });
//        this.add(耳鸣);
//        this.add(耳鸣_box);
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
//            }
//        });
//        this.add(震颤);
//        this.add(震颤_box);
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
//            }
//        });
//        this.add(心悸);
//        this.add(心悸_box);
//    }
//
//}