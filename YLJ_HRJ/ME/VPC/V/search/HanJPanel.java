//package ME.VPC.V.search;
//
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JCheckBox;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
///*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
// * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
// * 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
// * */
//public class HanJPanel extends JPanel {
//
//    /**
//     *
//     */
//    //
//    public HanJPanel(JTextField name) {
//        this.setLayout(null);
//        this.setBounds(0, 0, 780, 610);
//        this.setBackground(Color.BLACK);
//
//        //copy tab
//        JLabel bisai = new JLabel("鼻塞:");
//        bisai.setForeground(Color.WHITE);
//        bisai.setBounds(10, 20, 100, 50);
//        JCheckBox bisai_box = new JCheckBox();
//        bisai_box.setBounds(10 + 60, 33, 20, 20);
//        bisai_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (bisai_box.isSelected()) {
//                    if (!name.getText().contains("鼻塞")) {
//                        name.setText(name.getText() + " 鼻塞");
//                    }
//                } else {
//                    if (name.getText().contains("鼻塞")) {
//                        name.setText(name.getText().replace("鼻塞", ""));
//                    }
//                }
//            }
//        });
//        this.add(bisai);
//        this.add(bisai_box);
//
//        //copy tab
//        JLabel biti = new JLabel("鼻涕:");
//        biti.setForeground(Color.WHITE);
//        biti.setBounds(10, 20 + 25, 100, 50);
//        JCheckBox biti_box = new JCheckBox();
//        biti_box.setBounds(10 + 60, 33 + 25, 20, 20);
//        biti_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (biti_box.isSelected()) {
//                    if (!name.getText().contains("鼻涕")) {
//                        name.setText(name.getText() + " 鼻涕");
//                    }
//                } else {
//                    if (name.getText().contains("鼻涕")) {
//                        name.setText(name.getText().replace("鼻涕", ""));
//                    }
//                }
//            }
//        });
//        this.add(biti);
//        this.add(biti_box);
//
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
//            }
//        });
//        this.add(kesou);
//        this.add(kesou_box);
//        //copy tab
//        JLabel 畏寒 = new JLabel("畏寒:");
//        畏寒.setForeground(Color.WHITE);
//        畏寒.setBounds(10, 45 + 25 + 50, 100, 50);
//        JCheckBox 畏寒_box = new JCheckBox();
//        畏寒_box.setBounds(10 + 60, 58 + 25 + 50, 20, 20);
//        畏寒_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (畏寒_box.isSelected()) {
//                    if (!name.getText().contains("畏寒")) {
//                        name.setText(name.getText() + " 畏寒");
//                    }
//                } else {
//                    if (name.getText().contains("畏寒")) {
//                        name.setText(name.getText().replace("畏寒", ""));
//                    }
//                }
//            }
//        });
//        this.add(畏寒);
//        this.add(畏寒_box);
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
//            }
//        });
//        this.add(发冷);
//        this.add(发冷_box);
//        //copy tab
//        JLabel 脚冷 = new JLabel("脚冷:");
//        脚冷.setForeground(Color.WHITE);
//        脚冷.setBounds(10 + 110 + 110 + 110, 20 + 25 + 25, 100, 50);
//        JCheckBox 脚冷_box = new JCheckBox();
//        脚冷_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 25 + 25, 20, 20);
//        脚冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (脚冷_box.isSelected()) {
//                    if (!name.getText().contains("脚冷")) {
//                        name.setText(name.getText() + " 脚冷");
//                    }
//                } else {
//                    if (name.getText().contains("脚冷")) {
//                        name.setText(name.getText().replace("脚冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(脚冷);
//        this.add(脚冷_box);
//        //copy tab
//        JLabel 冻疮 = new JLabel("冻疮:");
//        冻疮.setForeground(Color.WHITE);
//        冻疮.setBounds(10 + 110 + 110 + 110, 20 + 25 + 25 + 25, 100, 50);
//        JCheckBox 冻疮_box = new JCheckBox();
//        冻疮_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 25 + 25 + 25, 20, 20);
//        冻疮_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (冻疮_box.isSelected()) {
//                    if (!name.getText().contains("冻疮")) {
//                        name.setText(name.getText() + " 冻疮");
//                    }
//                } else {
//                    if (name.getText().contains("冻疮")) {
//                        name.setText(name.getText().replace("冻疮", ""));
//                    }
//                }
//            }
//        });
//        this.add(冻疮);
//        this.add(冻疮_box);
//        //copy tab
//        JLabel 腹冷 = new JLabel("腹冷:");
//        腹冷.setForeground(Color.WHITE);
//        腹冷.setBounds(10 + 110 + 110 + 110, 20 + 25 + 25 + 25 + 25 + 25, 100, 50);
//        JCheckBox 腹冷_box = new JCheckBox();
//        腹冷_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 25 + 25 + 25 + 25 + 25, 20, 20);
//        腹冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (腹冷_box.isSelected()) {
//                    if (!name.getText().contains("腹冷")) {
//                        name.setText(name.getText() + " 腹冷");
//                    }
//                } else {
//                    if (name.getText().contains("腹冷")) {
//                        name.setText(name.getText().replace("腹冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(腹冷);
//        this.add(腹冷_box);
//        //copy tab
//        JLabel 脚趾冷 = new JLabel("脚趾冷:");
//        脚趾冷.setForeground(Color.WHITE);
//        脚趾冷.setBounds(10 + 110 + 110 + 110, 20 + 25 + 25 + 25 + 25 + 25 + 25, 100, 50);
//        JCheckBox 脚趾冷_box = new JCheckBox();
//        脚趾冷_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 25 + 25 + 25 + 25 + 25 + 25, 20, 20);
//        脚趾冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (脚趾冷_box.isSelected()) {
//                    if (!name.getText().contains("脚趾冷")) {
//                        name.setText(name.getText() + " 脚趾冷");
//                    }
//                } else {
//                    if (name.getText().contains("脚趾冷")) {
//                        name.setText(name.getText().replace("脚趾冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(脚趾冷);
//        this.add(脚趾冷_box);
//        //copy tab
//        JLabel 背冷 = new JLabel("背冷:");
//        背冷.setForeground(Color.WHITE);
//        背冷.setBounds(10 + 110 + 110 + 110, 20 + 25 + 25 + 25 + 25 + 75, 100, 50);
//        JCheckBox 背冷_box = new JCheckBox();
//        背冷_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 25 + 25 + 25 + 25 + 75, 20, 20);
//        背冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (背冷_box.isSelected()) {
//                    if (!name.getText().contains("背冷")) {
//                        name.setText(name.getText() + " 背冷");
//                    }
//                } else {
//                    if (name.getText().contains("背冷")) {
//                        name.setText(name.getText().replace("背冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(背冷);
//        this.add(背冷_box);
//        //copy tab
//        JLabel 耳朵冷 = new JLabel("耳朵冷:");
//        耳朵冷.setForeground(Color.WHITE);
//        耳朵冷.setBounds(10 + 110 + 110 + 110, 20 + 25 + 25 + 25 + 25, 100, 50);
//        JCheckBox 耳朵冷_box = new JCheckBox();
//        耳朵冷_box.setBounds(10 + 60 + 110 + 110 + 110, 33 + 25 + 25 + 25 + 25, 20, 20);
//        耳朵冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (耳朵冷_box.isSelected()) {
//                    if (!name.getText().contains("耳朵冷")) {
//                        name.setText(name.getText() + " 耳朵冷");
//                    }
//                } else {
//                    if (name.getText().contains("耳朵冷")) {
//                        name.setText(name.getText().replace("耳朵冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(耳朵冷);
//        this.add(耳朵冷_box);
//        //copy tab
//        JLabel 手冷 = new JLabel("手冷:");
//        手冷.setForeground(Color.WHITE);
//        手冷.setBounds(10 + 110 + 110 + 440, 20 + 25, 100, 50);
//        JCheckBox 手冷_box = new JCheckBox();
//        手冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 25, 20, 20);
//        手冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (手冷_box.isSelected()) {
//                    if (!name.getText().contains("手冷")) {
//                        name.setText(name.getText() + " 手冷");
//                    }
//                } else {
//                    if (name.getText().contains("手冷")) {
//                        name.setText(name.getText().replace("手冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(手冷);
//        this.add(手冷_box);
//        //copy tab
//        JLabel 脚掌冷 = new JLabel("脚掌冷:");
//        脚掌冷.setForeground(Color.WHITE);
//        脚掌冷.setBounds(10 + 110 + 110 + 440, 20 + 50, 100, 50);
//        JCheckBox 脚掌冷_box = new JCheckBox();
//        脚掌冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 50, 20, 20);
//        脚掌冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (脚掌冷_box.isSelected()) {
//                    if (!name.getText().contains("脚掌冷")) {
//                        name.setText(name.getText() + " 脚掌冷");
//                    }
//                } else {
//                    if (name.getText().contains("脚掌冷")) {
//                        name.setText(name.getText().replace("脚掌冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(脚掌冷);
//        this.add(脚掌冷_box);
//        //copy tab
//        JLabel 四肢冰冷 = new JLabel("四肢冰冷:");
//        四肢冰冷.setForeground(Color.WHITE);
//        四肢冰冷.setBounds(10 + 110 + 110 + 440, 20 + 275, 100, 50);
//        JCheckBox 四肢冰冷_box = new JCheckBox();
//        四肢冰冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 275, 20, 20);
//        四肢冰冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (四肢冰冷_box.isSelected()) {
//                    if (!name.getText().contains("四肢冰冷")) {
//                        name.setText(name.getText() + " 四肢冰冷");
//                    }
//                } else {
//                    if (name.getText().contains("四肢冰冷")) {
//                        name.setText(name.getText().replace("四肢冰冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(四肢冰冷);
//        this.add(四肢冰冷_box);
//        //copy tab
//        JLabel 头冷 = new JLabel("头冷:");
//        头冷.setForeground(Color.WHITE);
//        头冷.setBounds(10 + 110 + 110 + 440, 20 + 75, 100, 50);
//        JCheckBox 头冷_box = new JCheckBox();
//        头冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 75, 20, 20);
//        头冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (头冷_box.isSelected()) {
//                    if (!name.getText().contains("头冷")) {
//                        name.setText(name.getText() + " 头冷");
//                    }
//                } else {
//                    if (name.getText().contains("头冷")) {
//                        name.setText(name.getText().replace("头冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(头冷);
//        this.add(头冷_box);
//        //copy tab
//        JLabel 膝盖冷 = new JLabel("膝盖冷:");
//        膝盖冷.setForeground(Color.WHITE);
//        膝盖冷.setBounds(10 + 110 + 110 + 440, 20 + 100, 100, 50);
//        JCheckBox 膝盖冷_box = new JCheckBox();
//        膝盖冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 100, 20, 20);
//        膝盖冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (膝盖冷_box.isSelected()) {
//                    if (!name.getText().contains("膝盖冷")) {
//                        name.setText(name.getText() + " 膝盖冷");
//                    }
//                } else {
//                    if (name.getText().contains("膝盖冷")) {
//                        name.setText(name.getText().replace("膝盖冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(膝盖冷);
//        this.add(膝盖冷_box);
//        //copy tab
//        JLabel 手指冷 = new JLabel("手指冷:");
//        手指冷.setForeground(Color.WHITE);
//        手指冷.setBounds(10 + 110 + 110 + 440, 20 + 125, 100, 50);
//        JCheckBox 手指冷_box = new JCheckBox();
//        手指冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 125, 20, 20);
//        手指冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (手指冷_box.isSelected()) {
//                    if (!name.getText().contains("手指冷")) {
//                        name.setText(name.getText() + " 手指冷");
//                    }
//                } else {
//                    if (name.getText().contains("手指冷")) {
//                        name.setText(name.getText().replace("手指冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(手指冷);
//        this.add(手指冷_box);
//        //copy tab
//        JLabel 关节冷 = new JLabel("关节冷:");
//        关节冷.setForeground(Color.WHITE);
//        关节冷.setBounds(10 + 110 + 110 + 440, 20 + 150, 100, 50);
//        JCheckBox 关节冷_box = new JCheckBox();
//        关节冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 150, 20, 20);
//        关节冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (关节冷_box.isSelected()) {
//                    if (!name.getText().contains("关节冷")) {
//                        name.setText(name.getText() + " 关节冷");
//                    }
//                } else {
//                    if (name.getText().contains("关节冷")) {
//                        name.setText(name.getText().replace("关节冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(关节冷);
//        this.add(关节冷_box);
//        //copy tab
//        JLabel 感觉冷 = new JLabel("感觉冷:");
//        感觉冷.setForeground(Color.WHITE);
//        感觉冷.setBounds(10 + 110 + 110 + 440, 20 + 175, 100, 50);
//        JCheckBox 感觉冷_box = new JCheckBox();
//        感觉冷_box.setBounds(10 + 60 + 110 + 110 + 440, 33 + 175, 20, 20);
//        感觉冷_box.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                if (感觉冷_box.isSelected()) {
//                    if (!name.getText().contains("感觉冷")) {
//                        name.setText(name.getText() + " 感觉冷");
//                    }
//                } else {
//                    if (name.getText().contains("感觉冷")) {
//                        name.setText(name.getText().replace("感觉冷", ""));
//                    }
//                }
//            }
//        });
//        this.add(感觉冷);
//        this.add(感觉冷_box);
//
//    }
//
//}