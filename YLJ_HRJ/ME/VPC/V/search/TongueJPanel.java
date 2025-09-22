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
////词汇作者 罗荣武
////软件编码 罗瑶光
////20220628 20220629
///*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
// * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
// * 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
// * */
//public class TongueJPanel extends JPanel {
//    //
//
//    public TongueJPanel(JTextField name, JTextField 性味, JTextField 归经) {
//        this.setLayout(null);
//        this.setBounds(0, 0, 780, 610);
//        this.setBackground(Color.BLACK);
//        String[][] 罗荣武词汇 = new String[7][12];
//        罗荣武词汇[0][0] = "舌白";
//        罗荣武词汇[0][1] = "舌黄";
//        罗荣武词汇[0][2] = "舌青";
//        罗荣武词汇[0][3] = "舌苔黄";
//        罗荣武词汇[0][4] = "舌苔白";
//        罗荣武词汇[0][5] = "胖大舌";
//        罗荣武词汇[0][6] = "花剥苔";
//        罗荣武词汇[0][7] = "苔黑滑";
//        罗荣武词汇[0][8] = "呖血";
//        罗荣武词汇[0][9] = "鼻鸣";
//        罗荣武词汇[0][10] = "毒";
//        罗荣武词汇[0][11] = "孺";
//
//        罗荣武词汇[1][0] = "寒热往来";
//        罗荣武词汇[1][1] = "骨蒸发热";
//        罗荣武词汇[1][2] = "上焦湿热";
//        罗荣武词汇[1][3] = "中焦湿热";
//        罗荣武词汇[1][4] = "下焦湿热";
//        罗荣武词汇[1][5] = "排尿淋漓";
//        罗荣武词汇[1][6] = "苔黑干燥";
//        罗荣武词汇[1][7] = "流涎";
//        罗荣武词汇[1][8] = "夜热早凉";
//        罗荣武词汇[1][9] = "喉咙痰鸣";
//        罗荣武词汇[1][10] = "胎";
//        罗荣武词汇[1][11] = "哺";
//
//        罗荣武词汇[2][0] = "心火";
//        罗荣武词汇[2][1] = "肝火";
//        罗荣武词汇[2][2] = "胃火";
//        罗荣武词汇[2][3] = "肾火";
//        罗荣武词汇[2][4] = "潮热";
//        罗荣武词汇[2][5] = "壮热";
//        罗荣武词汇[2][6] = "烦热";
//        罗荣武词汇[2][7] = "呛嗽";
//        罗荣武词汇[2][8] = "唛气";
//        罗荣武词汇[2][9] = "疖肿";
//        罗荣武词汇[2][10] = "孕";
//        罗荣武词汇[2][11] = "堕";
//
//        罗荣武词汇[3][0] = "脉滑";
//        罗荣武词汇[3][1] = "脉细";
//        罗荣武词汇[3][2] = "脉洪";
//        罗荣武词汇[3][3] = "脉大";
//        罗荣武词汇[3][4] = "脉弦";
//        罗荣武词汇[3][5] = "声怯";
//        罗荣武词汇[3][6] = "脉缓";
//        罗荣武词汇[3][7] = "脉迟";
//        罗荣武词汇[3][8] = "目眵";
//        罗荣武词汇[3][9] = "奢睡";
//        罗荣武词汇[3][10] = "石";
//        罗荣武词汇[3][11] = "伤";
//
//        罗荣武词汇[4][0] = "倦怠";
//        罗荣武词汇[4][1] = "舌干燥";
//        罗荣武词汇[4][2] = "黄涕";
//        罗荣武词汇[4][3] = "清涕";
//        罗荣武词汇[4][4] = "喷嚏";
//        罗荣武词汇[4][5] = "气促";
//        罗荣武词汇[4][6] = "消瘦";
//        罗荣武词汇[4][7] = "苔少";
//        罗荣武词汇[4][8] = "苔腻";
//        罗荣武词汇[4][9] = "下痢";
//        罗荣武词汇[4][10] = "儿";
//        罗荣武词汇[4][11] = "婴";
//
//        罗荣武词汇[5][0] = "胃寒";
//        罗荣武词汇[5][1] = "中恶";
//        罗荣武词汇[5][2] = "口苦";
//        罗荣武词汇[5][3] = "畏寒";
//        罗荣武词汇[5][4] = "恶寒";
//        罗荣武词汇[5][5] = "虚劳";
//        罗荣武词汇[5][6] = "谵语";
//        罗荣武词汇[5][7] = "代谢病";
//        罗荣武词汇[5][8] = "蛔虫寄生";
//        罗荣武词汇[5][9] = "动物毒素";
//        罗荣武词汇[5][10] = "妇";
//        罗荣武词汇[5][11] = "产";
//
//        罗荣武词汇[6][0] = "呕吐";
//        罗荣武词汇[6][1] = "吐血";
//        罗荣武词汇[6][2] = "干呕";
//        罗荣武词汇[6][3] = "恶心";
//        罗荣武词汇[6][4] = "反胃";
//        罗荣武词汇[6][5] = "呕逆";
//        罗荣武词汇[6][6] = "呕恶";
//        罗荣武词汇[6][7] = "微呕";
//        罗荣武词汇[6][8] = "呕不能食";
//        罗荣武词汇[6][9] = "呕渴";
//        罗荣武词汇[6][10] = "乳";
//        罗荣武词汇[6][11] = "幼";
//        int lineCount = 0;
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 12; j++) {
//                String string = 罗荣武词汇[i][j];
//                JLabel jLabel_filter = new JLabel(string + ":");
//                jLabel_filter.setForeground(Color.WHITE);
//                jLabel_filter.setBounds(10 + 110 * i, 20 + 25 * j, 100, 50);
//                JCheckBox jLabel_filter_box = new JCheckBox();
//                jLabel_filter_box.setBounds(10 + 60 + 110 * i, 33 + 25 * j, 20, 20);
//                jLabel_filter_box.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent arg0) {
//                        if (jLabel_filter_box.isSelected()) {
//                            if (!name.getText().contains(string)) {
//                                name.setText(name.getText() + " " + string);
//                            }
//                        } else {
//                            if (name.getText().contains(string)) {
//                                name.setText(name.getText().replace(" "
//                                    + string, ""));//去冗余累增空格
//                                name.setText(name.getText().replace(string, ""));
//                            }
//                        }
//                    }
//                });
//                this.add(jLabel_filter);
//                this.add(jLabel_filter_box);
//            }
//        }
//
//        lineCount = 13;
//        String[][] 经络词汇 = new String[7][3];
//        经络词汇[0][0] = "心";
//        经络词汇[0][1] = "肝";
//        经络词汇[1][0] = "脾";
//        经络词汇[1][1] = "肺";
//        经络词汇[2][0] = "肾";
//        经络词汇[2][1] = "小肠";
//        经络词汇[3][0] = "大肠";
//        经络词汇[3][1] = "胆";
//        经络词汇[4][0] = "膀胱";
//        经络词汇[4][1] = "十二";
//        经络词汇[5][0] = "三焦";
//        经络词汇[5][1] = "胃";
//        经络词汇[6][0] = "任";
//        经络词汇[6][1] = "督";
//
//        经络词汇[0][2] = "心包";
//        经络词汇[1][2] = "奇经八脉";
//        经络词汇[2][2] = "手";
//        经络词汇[3][2] = "足";
//        经络词汇[4][2] = "脑";
//        经络词汇[5][2] = "胰";
//        经络词汇[6][2] = "骨";
//
//        String stringTag = "relatiedJingLuoFilter-颜色字输出在软件首页辅助选项框";
//        JLabel jLabel_filterTag = new JLabel(stringTag);
//        jLabel_filterTag.setForeground(Color.yellow);
//        jLabel_filterTag.setBounds(10, 20 + 25 * 12, 500, 50);
//        this.add(jLabel_filterTag);
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = lineCount; j < lineCount + 3; j++) {
//                String string = 经络词汇[i][j - lineCount];
//                JLabel jLabel_filter = new JLabel(string + ":");
//                jLabel_filter.setForeground(Color.yellow);
//                jLabel_filter.setBounds(10 + 110 * i, 20 + 25 * j, 100, 50);
//                JCheckBox jLabel_filter_box = new JCheckBox();
//                jLabel_filter_box.setBounds(10 + 60 + 110 * i
//                    , 33 + 25 * j, 20, 20);
//                jLabel_filter_box.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent arg0) {
//                        if (jLabel_filter_box.isSelected()) {
//                            if (!归经.getText().contains(string)) {
//                                归经.setText(归经.getText() + string);//不需要空格
//                                归经.setText(归经.getText().replace(" ", ""));//去冗余空格
//                            }
//                        } else {
//                            if (归经.getText().contains(string)) {
//                                归经.setText(归经.getText().replace(" "
//                                    + string, ""));//去冗余累增空格
//                                归经.setText(归经.getText().replace(" ", ""));//去冗余空格
//                                归经.setText(归经.getText().replace(string, ""));
//                            }
//                        }
//                    }
//                });
//                this.add(jLabel_filter);
//                this.add(jLabel_filter_box);
//            }
//        }
//
//
//        lineCount = 17;
//        String[][] 性味词汇 = new String[7][2];
//        性味词汇[0][0] = "酸";
//        性味词汇[0][1] = "甜";
//        性味词汇[1][0] = "苦";
//        性味词汇[1][1] = "辛";
//        性味词汇[2][0] = "咸";
//        性味词汇[2][1] = "寒";
//        性味词汇[3][0] = "热";
//        性味词汇[3][1] = "温";
//        性味词汇[4][0] = "燥";
//        性味词汇[4][1] = "凉";
//        性味词汇[5][0] = "平";
//        性味词汇[5][1] = "涩";
//        性味词汇[6][0] = "腻";
//        性味词汇[6][1] = "甘";
//
//        String stringTag2 = "有关性味-颜色字输出在软件首页辅助选项框";
//        JLabel jLabel_filterTag2 = new JLabel(stringTag2);
//        jLabel_filterTag2.setForeground(Color.pink);
//        jLabel_filterTag2.setBounds(10, 20 + 25 * 16, 500, 50);
//        this.add(jLabel_filterTag2);
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = lineCount; j < lineCount + 2; j++) {
//                String string = 性味词汇[i][j - lineCount];
//                JLabel jLabel_filter = new JLabel(string + ":");
//                jLabel_filter.setForeground(Color.pink);
//                jLabel_filter.setBounds(10 + 110 * i, 20 + 25 * j, 100, 50);
//                JCheckBox jLabel_filter_box = new JCheckBox();
//                jLabel_filter_box.setBounds(10 + 60 + 110 * i, 33 + 25 * j, 20, 20);
//                jLabel_filter_box.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent arg0) {
//                        if (jLabel_filter_box.isSelected()) {
//                            if (!性味.getText().contains(string)) {
//                                性味.setText(性味.getText() + " " + string);
//                            }
//                        } else {
//                            if (性味.getText().contains(string)) {
//                                性味.setText(性味.getText().replace(" "
//                                    + string, ""));//去冗余累增空格
//                                性味.setText(性味.getText().replace(string, ""));
//                            }
//                        }
//                    }
//                });
//                this.add(jLabel_filter);
//                this.add(jLabel_filter_box);
//            }
//        }
//    }
//}