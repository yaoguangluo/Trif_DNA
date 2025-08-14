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
//public class PaixieJPanel extends JPanel{
//	//
//
//	public PaixieJPanel(JTextField name){
//		this.setLayout(null);
//		this.setBounds(0, 0, 780, 610);
//		this.setBackground(Color.BLACK);
//				//copy tab
//				JLabel 便血= new JLabel("便血:");
//				便血.setForeground(Color.WHITE);
//				便血.setBounds(10+110+110, 20+125, 100, 50);
//				JCheckBox 便血_box= new JCheckBox();
//				便血_box.setBounds(10+60+110+110, 33+125, 20, 20);
//				便血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(便血_box.isSelected()) {
//							if(!name.getText().contains("便血")) {
//								name.setText(name.getText()+" 便血");
//							}
//						}else {
//							if(name.getText().contains("便血")) {
//								name.setText(name.getText().replace("便血", ""));
//							}
//						}
//								}
//				});
//				this.add(便血);
//				this.add(便血_box);
//				//copy tab
//				JLabel 便白= new JLabel("便白:");
//				便白.setForeground(Color.WHITE);
//				便白.setBounds(10+110+110, 20+150, 100, 50);
//				JCheckBox 便白_box= new JCheckBox();
//				便白_box.setBounds(10+60+110+110, 33+150, 20, 20);
//				便白_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(便白_box.isSelected()) {
//							if(!name.getText().contains("便白")) {
//								name.setText(name.getText()+" 便白");
//							}
//						}else {
//							if(name.getText().contains("便白")) {
//								name.setText(name.getText().replace("便白", ""));
//							}
//						}
//								}
//				});
//				this.add(便白);
//				this.add(便白_box);
//				//copy tab
//				JLabel 便溏= new JLabel("便溏:");
//				便溏.setForeground(Color.WHITE);
//				便溏.setBounds(10+110+110, 20+175, 100, 50);
//				JCheckBox 便溏_box= new JCheckBox();
//				便溏_box.setBounds(10+60+110+110, 33+175, 20, 20);
//				便溏_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(便溏_box.isSelected()) {
//							if(!name.getText().contains("便溏")) {
//								name.setText(name.getText()+" 便溏");
//							}
//						}else {
//							if(name.getText().contains("便溏")) {
//								name.setText(name.getText().replace("便溏", ""));
//							}
//						}
//								}
//				});
//				this.add(便溏);
//				this.add(便溏_box);
//				//copy tab
//				JLabel 便秘= new JLabel("便秘:");
//				便秘.setForeground(Color.WHITE);
//				便秘.setBounds(10+110+110, 20+200, 100, 50);
//				JCheckBox 便秘_box= new JCheckBox();
//				便秘_box.setBounds(10+60+110+110, 33+200, 20, 20);
//				便秘_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(便秘_box.isSelected()) {
//							if(!name.getText().contains("便秘")) {
//								name.setText(name.getText()+" 便秘");
//							}
//						}else {
//							if(name.getText().contains("便秘")) {
//								name.setText(name.getText().replace("便秘", ""));
//							}
//						}
//								}
//				});
//				this.add(便秘);
//				this.add(便秘_box);
//				//copy tab
//				JLabel 便恶臭= new JLabel("便恶臭:");
//				便恶臭.setForeground(Color.WHITE);
//				便恶臭.setBounds(10+110+110, 20+225, 100, 50);
//				JCheckBox 便恶臭_box= new JCheckBox();
//				便恶臭_box.setBounds(10+60+110+110, 33+225, 20, 20);
//				便恶臭_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(便恶臭_box.isSelected()) {
//							if(!name.getText().contains("便恶臭")) {
//								name.setText(name.getText()+" 便恶臭");
//							}
//						}else {
//							if(name.getText().contains("便恶臭")) {
//								name.setText(name.getText().replace("便恶臭", ""));
//							}
//						}
//								}
//				});
//				this.add(便恶臭);
//				this.add(便恶臭_box);
//					//copy tab
//				JLabel 屁多= new JLabel("屁多:");
//				屁多.setForeground(Color.WHITE);
//				屁多.setBounds(10+110+110, 20+275, 100, 50);
//				JCheckBox 屁多_box= new JCheckBox();
//				屁多_box.setBounds(10+60+110+110, 33+275, 20, 20);
//				屁多_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(屁多_box.isSelected()) {
//							if(!name.getText().contains("屁多")) {
//								name.setText(name.getText()+" 屁多");
//							}
//						}else {
//							if(name.getText().contains("屁多")) {
//								name.setText(name.getText().replace("屁多", ""));
//							}
//						}
//								}
//				});
//				this.add(屁多);
//				this.add(屁多_box);
//				//copy tab
//				JLabel 尿血= new JLabel("尿血:");
//				尿血.setForeground(Color.WHITE);
//				尿血.setBounds(10+110+110+330, 20+300, 100, 50);
//				JCheckBox 尿血_box= new JCheckBox();
//				尿血_box.setBounds(10+60+110+110+330, 33+300, 20, 20);
//				尿血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(尿血_box.isSelected()) {
//							if(!name.getText().contains("尿血")) {
//								name.setText(name.getText()+" 尿血");
//							}
//						}else {
//							if(name.getText().contains("尿血")) {
//								name.setText(name.getText().replace("尿血", ""));
//							}
//						}
//								}
//				});
//				this.add(尿血);
//				this.add(尿血_box);
//				//copy tab
//				JLabel 青春痘= new JLabel("青春痘:");
//				青春痘.setForeground(Color.WHITE);
//				青春痘.setBounds(10+110+110+330, 20+375, 100, 50);
//				JCheckBox 青春痘_box= new JCheckBox();
//				青春痘_box.setBounds(10+60+110+110+330, 33+375, 20, 20);
//				青春痘_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(青春痘_box.isSelected()) {
//							if(!name.getText().contains("青春痘")) {
//								name.setText(name.getText()+" 青春痘");
//							}
//						}else {
//							if(name.getText().contains("青春痘")) {
//								name.setText(name.getText().replace("青春痘", ""));
//							}
//						}
//								}
//				});
//				this.add(青春痘);
//				this.add(青春痘_box);
//					//copy tab
//				JLabel 疝气= new JLabel("疝气:");
//				疝气.setForeground(Color.WHITE);
//				疝气.setBounds(10+110+110+440, 20+100, 100, 50);
//				JCheckBox 疝气_box= new JCheckBox();
//				疝气_box.setBounds(10+60+110+110+440, 33+100, 20, 20);
//				疝气_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(疝气_box.isSelected()) {
//							if(!name.getText().contains("疝气")) {
//								name.setText(name.getText()+" 疝气");
//							}
//						}else {
//							if(name.getText().contains("疝气")) {
//								name.setText(name.getText().replace("疝气", ""));
//							}
//						}
//								}
//				});
//				this.add(疝气);
//				this.add(疝气_box);
//				//copy tab
//				JLabel 小便刺痛= new JLabel("小便刺痛:");
//				小便刺痛.setForeground(Color.WHITE);
//				小便刺痛.setBounds(10+110+110+440, 20+375, 100, 50);
//				JCheckBox 小便刺痛_box= new JCheckBox();
//				小便刺痛_box.setBounds(10+60+110+110+440, 33+375, 20, 20);
//				小便刺痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(小便刺痛_box.isSelected()) {
//							if(!name.getText().contains("小便刺痛")) {
//								name.setText(name.getText()+" 小便刺痛");
//							}
//						}else {
//							if(name.getText().contains("小便刺痛")) {
//								name.setText(name.getText().replace("小便刺痛", ""));
//							}
//						}
//								}
//				});
//				this.add(小便刺痛);
//				this.add(小便刺痛_box);
//				//copy tab
//				JLabel 遗尿= new JLabel("遗尿:");
//				遗尿.setForeground(Color.WHITE);
//				遗尿.setBounds(10+110+110+440, 20+400, 100, 50);
//				JCheckBox 遗尿_box= new JCheckBox();
//				遗尿_box.setBounds(10+60+110+110+440, 33+400, 20, 20);
//				遗尿_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(遗尿_box.isSelected()) {
//							if(!name.getText().contains("遗尿")) {
//								name.setText(name.getText()+" 遗尿");
//							}
//						}else {
//							if(name.getText().contains("遗尿")) {
//								name.setText(name.getText().replace("遗尿", ""));
//							}
//						}
//								}
//				});
//				this.add(遗尿);
//				this.add(遗尿_box);
//				//copy tab
//				JLabel 汗多= new JLabel("汗多:");
//				汗多.setForeground(Color.WHITE);
//				汗多.setBounds(10+110+110+110, 20, 100, 50);
//				JCheckBox 汗多_box= new JCheckBox();
//				汗多_box.setBounds(10+60+110+110+110, 33, 20, 20);
//				汗多_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(汗多_box.isSelected()) {
//							if(!name.getText().contains("汗多")) {
//								name.setText(name.getText()+" 汗多");
//							}
//						}else {
//							if(name.getText().contains("汗多")) {
//								name.setText(name.getText().replace("汗多", ""));
//							}
//						}
//								}
//				});
//				this.add(汗多);
//				this.add(汗多_box);
//				//copy tab
//				JLabel 汗血= new JLabel("汗血:");
//				汗血.setForeground(Color.WHITE);
//				汗血.setBounds(10+110+110+110, 20+25, 100, 50);
//				JCheckBox 汗血_box= new JCheckBox();
//				汗血_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
//				汗血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(汗血_box.isSelected()) {
//							if(!name.getText().contains("汗血")) {
//								name.setText(name.getText()+" 汗血");
//							}
//						}else {
//							if(name.getText().contains("汗血")) {
//								name.setText(name.getText().replace("汗血", ""));
//							}
//						}
//								}
//				});
//				this.add(汗血);
//				this.add(汗血_box);
//				//copy tab
//				JLabel 汗臭= new JLabel("汗臭:");
//				汗臭.setForeground(Color.WHITE);
//				汗臭.setBounds(10+110+110+110, 20+50, 100, 50);
//				JCheckBox 汗臭_box= new JCheckBox();
//				汗臭_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
//				汗臭_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(汗臭_box.isSelected()) {
//							if(!name.getText().contains("汗臭")) {
//								name.setText(name.getText()+" 汗臭");
//							}
//						}else {
//							if(name.getText().contains("汗臭")) {
//								name.setText(name.getText().replace("汗臭", ""));
//							}
//						}
//								}
//				});
//				this.add(汗臭);
//				this.add(汗臭_box);
//				//copy tab
//				JLabel 狐臭= new JLabel("狐臭:");
//				狐臭.setForeground(Color.WHITE);
//				狐臭.setBounds(10+110+110+110, 20+75, 100, 50);
//				JCheckBox 狐臭_box= new JCheckBox();
//				狐臭_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
//				狐臭_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(狐臭_box.isSelected()) {
//							if(!name.getText().contains("狐臭")) {
//								name.setText(name.getText()+" 狐臭");
//							}
//						}else {
//							if(name.getText().contains("狐臭")) {
//								name.setText(name.getText().replace("狐臭", ""));
//							}
//						}
//								}
//				});
//				this.add(狐臭);
//				this.add(狐臭_box);
//				//copy tab
//				JLabel 大便绿= new JLabel("大便绿:");
//				大便绿.setForeground(Color.WHITE);
//				大便绿.setBounds(10+110+110+110, 20+100, 100, 50);
//				JCheckBox 大便绿_box= new JCheckBox();
//				大便绿_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
//				大便绿_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(大便绿_box.isSelected()) {
//							if(!name.getText().contains("大便绿")) {
//								name.setText(name.getText()+" 大便绿");
//							}
//						}else {
//							if(name.getText().contains("大便绿")) {
//								name.setText(name.getText().replace("大便绿", ""));
//							}
//						}
//								}
//				});
//				this.add(大便绿);
//				this.add(大便绿_box);
//				//copy tab
//				JLabel 尿黑= new JLabel("尿黑:");
//				尿黑.setForeground(Color.WHITE);
//				尿黑.setBounds(10+110+110+110, 20+125, 100, 50);
//				JCheckBox 尿黑_box= new JCheckBox();
//				尿黑_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
//				尿黑_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(尿黑_box.isSelected()) {
//							if(!name.getText().contains("尿黑")) {
//								name.setText(name.getText()+" 尿黑");
//							}
//						}else {
//							if(name.getText().contains("尿黑")) {
//								name.setText(name.getText().replace("尿黑", ""));
//							}
//						}
//								}
//				});
//				this.add(尿黑);
//				this.add(尿黑_box);
//				//copy tab
//				JLabel 尿臭= new JLabel("尿臭:");
//				尿臭.setForeground(Color.WHITE);
//				尿臭.setBounds(10+110+110+110, 20+150, 100, 50);
//				JCheckBox 尿臭_box= new JCheckBox();
//				尿臭_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
//				尿臭_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(尿臭_box.isSelected()) {
//							if(!name.getText().contains("尿臭")) {
//								name.setText(name.getText()+" 尿臭");
//							}
//						}else {
//							if(name.getText().contains("尿臭")) {
//								name.setText(name.getText().replace("尿臭", ""));
//							}
//						}
//								}
//				});
//				this.add(尿臭);
//				this.add(尿臭_box);
//				//copy tab
//				JLabel 口臭= new JLabel("口臭:");
//				口臭.setForeground(Color.WHITE);
//				口臭.setBounds(10+110+110+110, 20+175, 100, 50);
//				JCheckBox 口臭_box= new JCheckBox();
//				口臭_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
//				口臭_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(口臭_box.isSelected()) {
//							if(!name.getText().contains("口臭")) {
//								name.setText(name.getText()+" 口臭");
//							}
//						}else {
//							if(name.getText().contains("口臭")) {
//								name.setText(name.getText().replace("口臭", ""));
//							}
//						}
//								}
//				});
//				this.add(口臭);
//				this.add(口臭_box);
//					//copy tab
//				JLabel 屁臭= new JLabel("屁臭:");
//				屁臭.setForeground(Color.WHITE);
//				屁臭.setBounds(10+110+110+110, 20+200, 100, 50);
//				JCheckBox 屁臭_box= new JCheckBox();
//				屁臭_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
//				屁臭_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(屁臭_box.isSelected()) {
//							if(!name.getText().contains("屁臭")) {
//								name.setText(name.getText()+" 屁臭");
//							}
//						}else {
//							if(name.getText().contains("屁臭")) {
//								name.setText(name.getText().replace("屁臭", ""));
//							}
//						}
//								}
//				});
//				this.add(屁臭);
//				this.add(屁臭_box);
//				//copy tab
//				JLabel 尿棕= new JLabel("尿棕:");
//				尿棕.setForeground(Color.WHITE);
//				尿棕.setBounds(10+110+110+110, 20+225, 100, 50);
//				JCheckBox 尿棕_box= new JCheckBox();
//				尿棕_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
//				尿棕_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(尿棕_box.isSelected()) {
//							if(!name.getText().contains("尿棕")) {
//								name.setText(name.getText()+" 尿棕");
//							}
//						}else {
//							if(name.getText().contains("尿棕")) {
//								name.setText(name.getText().replace("尿棕", ""));
//							}
//						}
//								}
//				});
//				this.add(尿棕);
//				this.add(尿棕_box);
//					//copy tab
//				JLabel 汗骚= new JLabel("汗骚:");
//				汗骚.setForeground(Color.WHITE);
//				汗骚.setBounds(10+110+110+110, 20+250, 100, 50);
//				JCheckBox 汗骚_box= new JCheckBox();
//				汗骚_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
//				汗骚_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(汗骚_box.isSelected()) {
//							if(!name.getText().contains("汗骚")) {
//								name.setText(name.getText()+" 汗骚");
//							}
//						}else {
//							if(name.getText().contains("汗骚")) {
//								name.setText(name.getText().replace("汗骚", ""));
//							}
//						}
//								}
//				});
//				this.add(汗骚);
//				this.add(汗骚_box);
//		}
//}