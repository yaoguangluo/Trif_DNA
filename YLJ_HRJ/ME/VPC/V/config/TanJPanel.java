//package ME.VPC.V.config;
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
// * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
// * 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
// * */
//public class TanJPanel extends JPanel{
//	//
//
//	public TanJPanel(JTextField name){
//		this.setLayout(null);
//		this.setBounds(0, 0, 780, 610);
//		this.setBackground(Color.BLACK);
//
//				//copy tab
//				JLabel nongtan= new JLabel("浓痰:");
//				nongtan.setForeground(Color.WHITE);
//				nongtan.setBounds(10, 45+25+25+25, 100, 50);
//				JCheckBox nongtan_box= new JCheckBox();
//				nongtan_box.setBounds(10+60, 58+25+25+25, 20, 20);
//				nongtan_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(nongtan_box.isSelected()) {
//							if(!name.getText().contains("浓痰")) {
//								name.setText(name.getText()+" 浓痰");
//							}
//						}else {
//							if(name.getText().contains("浓痰")) {
//								name.setText(name.getText().replace("浓痰", ""));
//							}
//						}
//								}
//				});
//				this.add(nongtan);
//				this.add(nongtan_box);
//					//copy tab
//				JLabel huangtan= new JLabel("黄痰:");
//				huangtan.setForeground(Color.WHITE);
//				huangtan.setBounds(10, 45+25+75, 100, 50);
//				JCheckBox huangtan_box= new JCheckBox();
//				huangtan_box.setBounds(10+60, 58+25+75, 20, 20);
//				huangtan_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(huangtan_box.isSelected()) {
//							if(!name.getText().contains("黄痰")) {
//								name.setText(name.getText()+" 黄痰");
//							}
//						}else {
//							if(name.getText().contains("黄痰")) {
//								name.setText(name.getText().replace("黄痰", ""));
//							}
//						}
//								}
//				});
//				this.add(huangtan);
//				this.add(huangtan_box);
//				//copy tab
//				JLabel baitan= new JLabel("白痰:");
//				baitan.setForeground(Color.WHITE);
//				baitan.setBounds(10, 45+25+100, 100, 50);
//				JCheckBox baitan_box= new JCheckBox();
//				baitan_box.setBounds(10+60, 58+25+100, 20, 20);
//				baitan_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(baitan_box.isSelected()) {
//							if(!name.getText().contains("白痰")) {
//								name.setText(name.getText()+" 白痰");
//							}
//						}else {
//							if(name.getText().contains("白痰")) {
//								name.setText(name.getText().replace("白痰", ""));
//							}
//						}
//								}
//				});
//				this.add(baitan);
//				this.add(baitan_box);
//				//copy tab
//				JLabel duotan= new JLabel("多痰:");
//				duotan.setForeground(Color.WHITE);
//				duotan.setBounds(10, 45+25+125, 100, 50);
//				JCheckBox duotan_box= new JCheckBox();
//				duotan_box.setBounds(10+60, 58+25+125, 20, 20);
//				duotan_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(duotan_box.isSelected()) {
//							if(!name.getText().contains("多痰")) {
//								name.setText(name.getText()+" 多痰");
//							}
//						}else {
//							if(name.getText().contains("多痰")) {
//								name.setText(name.getText().replace("多痰", ""));
//							}
//						}
//								}
//				});
//				this.add(duotan);
//				this.add(duotan_box);
//				//copy tab
//				JLabel shaotan= new JLabel("少痰:");
//				shaotan.setForeground(Color.WHITE);
//				shaotan.setBounds(10, 45+25+100+25+25, 100, 50);
//				JCheckBox shaotan_box= new JCheckBox();
//				shaotan_box.setBounds(10+60, 58+25+100+25+25, 20, 20);
//				shaotan_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(shaotan_box.isSelected()) {
//							if(!name.getText().contains("少痰")) {
//								name.setText(name.getText()+" 少痰");
//							}
//						}else {
//							if(name.getText().contains("少痰")) {
//								name.setText(name.getText().replace("少痰", ""));
//							}
//						}
//								}
//				});
//				this.add(shaotan);
//				this.add(shaotan_box);
//				//copy tab
//				JLabel chouyan= new JLabel("稠痰:");
//				chouyan.setForeground(Color.WHITE);
//				chouyan.setBounds(10, 45+25+100+25+50, 100, 50);
//				JCheckBox chouyan_box= new JCheckBox();
//				chouyan_box.setBounds(10+60, 58+25+100+25+50, 20, 20);
//				chouyan_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(chouyan_box.isSelected()) {
//							if(!name.getText().contains("稠痰")) {
//								name.setText(name.getText()+" 稠痰");
//							}
//						}else {
//							if(name.getText().contains("稠痰")) {
//								name.setText(name.getText().replace("稠痰", ""));
//							}
//						}
//								}
//				});
//				this.add(chouyan);
//				this.add(chouyan_box);
//				//copy tab
//				JLabel xitan= new JLabel("稀痰:");
//				xitan.setForeground(Color.WHITE);
//				xitan.setBounds(10, 45+25+100+25+75, 100, 50);
//				JCheckBox xitan_box= new JCheckBox();
//				xitan_box.setBounds(10+60, 58+25+100+25+75, 20, 20);
//				xitan_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(xitan_box.isSelected()) {
//							if(!name.getText().contains("稀痰")) {
//								name.setText(name.getText()+" 稀痰");
//							}
//						}else {
//							if(name.getText().contains("稀痰")) {
//								name.setText(name.getText().replace("稀痰", ""));
//							}
//						}
//								}
//				});
//				this.add(xitan);
//				this.add(xitan_box);
//
//				//copy tab
//				JLabel 有汗= new JLabel("有汗:");
//				有汗.setForeground(Color.WHITE);
//				有汗.setBounds(10+110, 20+75, 100, 50);
//				JCheckBox 有汗_box= new JCheckBox();
//				有汗_box.setBounds(10+60+110, 33+75, 20, 20);
//				有汗_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(有汗_box.isSelected()) {
//							if(!name.getText().contains("有汗")) {
//								name.setText(name.getText()+" 有汗");
//							}
//						}else {
//							if(name.getText().contains("有汗")) {
//								name.setText(name.getText().replace("有汗", ""));
//							}
//						}
//								}
//				});
//				this.add(有汗);
//				this.add(有汗_box);
//				//copy tab
//				JLabel 无汗= new JLabel("无汗:");
//				无汗.setForeground(Color.WHITE);
//				无汗.setBounds(10+110, 20+100, 100, 50);
//				JCheckBox 无汗_box= new JCheckBox();
//				无汗_box.setBounds(10+60+110, 33+100, 20, 20);
//				无汗_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(无汗_box.isSelected()) {
//							if(!name.getText().contains("无汗")) {
//								name.setText(name.getText()+" 无汗");
//							}
//						}else {
//							if(name.getText().contains("无汗")) {
//								name.setText(name.getText().replace("无汗", ""));
//							}
//						}
//								}
//				});
//				this.add(无汗);
//				this.add(无汗_box);
//				//copy tab
//				JLabel 盗汗= new JLabel("盗汗:");
//				盗汗.setForeground(Color.WHITE);
//				盗汗.setBounds(10+110, 20+125, 100, 50);
//				JCheckBox 盗汗_box= new JCheckBox();
//				盗汗_box.setBounds(10+60+110, 33+125, 20, 20);
//				盗汗_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(盗汗_box.isSelected()) {
//							if(!name.getText().contains("盗汗")) {
//								name.setText(name.getText()+" 盗汗");
//							}
//						}else {
//							if(name.getText().contains("盗汗")) {
//								name.setText(name.getText().replace("盗汗", ""));
//							}
//						}
//								}
//				});
//				this.add(盗汗);
//				this.add(盗汗_box);
//				//copy tab
//				JLabel 自汗= new JLabel("自汗:");
//				自汗.setForeground(Color.WHITE);
//				自汗.setBounds(10+ 110, 20+ 150, 100, 50);
//				JCheckBox 自汗_box= new JCheckBox();
//				自汗_box.setBounds(10+ 60+ 110, 33+ 150, 20, 20);
//				自汗_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(自汗_box.isSelected()) {
//							if(!name.getText().contains("自汗")) {
//								name.setText(name.getText()+" 自汗");
//							}
//						}else {
//							if(name.getText().contains("自汗")) {
//								name.setText(name.getText().replace("自汗", ""));
//							}
//						}
//								}
//				});
//				this.add(自汗);
//				this.add(自汗_box);
//
//				//copy tab
//				JLabel 汗疹= new JLabel("汗疹:");
//				汗疹.setForeground(Color.WHITE);
//				汗疹.setBounds(10+110+110+110, 20+200, 100, 50);
//				JCheckBox 汗疹_box= new JCheckBox();
//				汗疹_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
//				汗疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(汗疹_box.isSelected()) {
//							if(!name.getText().contains("汗疹")) {
//								name.setText(name.getText()+" 汗疹");
//							}
//						}else {
//							if(name.getText().contains("汗疹")) {
//								name.setText(name.getText().replace("汗疹", ""));
//							}
//						}
//								}
//				});
//				this.add(汗疹);
//				this.add(汗疹_box);
//	}
//}