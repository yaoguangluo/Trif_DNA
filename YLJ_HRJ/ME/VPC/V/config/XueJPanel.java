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
//public class XueJPanel extends JPanel{
//	//
//
//	public XueJPanel(JTextField name){
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
//
//				//copy tab
//				JLabel 吐血= new JLabel("吐血:");
//				吐血.setForeground(Color.WHITE);
//				吐血.setBounds(10+110+110, 20+500, 100, 50);
//				JCheckBox 吐血_box= new JCheckBox();
//				吐血_box.setBounds(10+60+110+110, 33+500, 20, 20);
//				吐血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(吐血_box.isSelected()) {
//							if(!name.getText().contains("吐血")) {
//								name.setText(name.getText()+" 吐血");
//							}
//						}else {
//							if(name.getText().contains("吐血")) {
//								name.setText(name.getText().replace("吐血", ""));
//							}
//						}
//								}
//				});
//				this.add(吐血);
//				this.add(吐血_box);
//
//				//copy tab
//				JLabel 脓血= new JLabel("脓血:");
//				脓血.setForeground(Color.WHITE);
//				脓血.setBounds(10+110+110+110, 20+50, 100, 50);
//				JCheckBox 脓血_box= new JCheckBox();
//				脓血_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
//				脓血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(脓血_box.isSelected()) {
//							if(!name.getText().contains("脓血")) {
//								name.setText(name.getText()+" 脓血");
//							}
//						}else {
//							if(name.getText().contains("脓血")) {
//								name.setText(name.getText().replace("脓血", ""));
//							}
//						}
//								}
//				});
//				this.add(脓血);
//				this.add(脓血_box);
//
//				//copy tab
//				JLabel 高血压= new JLabel("高血压:");
//				高血压.setForeground(Color.WHITE);
//				高血压.setBounds(10+110+110+220, 20+400, 100, 50);
//				JCheckBox 高血压_box= new JCheckBox();
//				高血压_box.setBounds(10+60+110+110+220, 33+400, 20, 20);
//				高血压_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(高血压_box.isSelected()) {
//							if(!name.getText().contains("高血压")) {
//								name.setText(name.getText()+" 高血压");
//							}
//						}else {
//							if(name.getText().contains("高血压")) {
//								name.setText(name.getText().replace("高血压", ""));
//							}
//						}
//								}
//				});
//				this.add(高血压);
//				this.add(高血压_box);
//				//copy tab
//				JLabel 低血压= new JLabel("低血压:");
//				低血压.setForeground(Color.WHITE);
//				低血压.setBounds(10+110+110+220, 20+425, 100, 50);
//				JCheckBox 低血压_box= new JCheckBox();
//				低血压_box.setBounds(10+60+110+110+220, 33+425, 20, 20);
//				低血压_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(低血压_box.isSelected()) {
//							if(!name.getText().contains("低血压")) {
//								name.setText(name.getText()+" 低血压");
//							}
//						}else {
//							if(name.getText().contains("低血压")) {
//								name.setText(name.getText().replace("低血压", ""));
//							}
//						}
//								}
//				});
//				this.add(低血压);
//				this.add(低血压_box);
//
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
//				JLabel 止血= new JLabel("止血:");
//				止血.setForeground(Color.WHITE);
//				止血.setBounds(10+110+110+330, 20+325, 100, 50);
//				JCheckBox 止血_box= new JCheckBox();
//				止血_box.setBounds(10+60+110+110+330, 33+325, 20, 20);
//				止血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(止血_box.isSelected()) {
//							if(!name.getText().contains("止血")) {
//								name.setText(name.getText()+" 止血");
//							}
//						}else {
//							if(name.getText().contains("止血")) {
//								name.setText(name.getText().replace("止血", ""));
//							}
//						}
//								}
//				});
//				this.add(止血);
//				this.add(止血_box);
//				//copy tab
//				JLabel 贫血= new JLabel("贫血:");
//				贫血.setForeground(Color.WHITE);
//				贫血.setBounds(10+110+110+330, 20+350, 100, 50);
//				JCheckBox 贫血_box= new JCheckBox();
//				贫血_box.setBounds(10+60+110+110+330, 33+350, 20, 20);
//				贫血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(贫血_box.isSelected()) {
//							if(!name.getText().contains("贫血")) {
//								name.setText(name.getText()+" 贫血");
//							}
//						}else {
//							if(name.getText().contains("贫血")) {
//								name.setText(name.getText().replace("贫血", ""));
//							}
//						}
//								}
//				});
//				this.add(贫血);
//				this.add(贫血_box);
//
//				//copy tab
//				JLabel 衄血= new JLabel("衄血:");
//				衄血.setForeground(Color.WHITE);
//				衄血.setBounds(10+110+110+440, 20+175, 100, 50);
//				JCheckBox 衄血_box= new JCheckBox();
//				衄血_box.setBounds(10+60+110+110+440, 33+175, 20, 20);
//				衄血_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(衄血_box.isSelected()) {
//							if(!name.getText().contains("衄血")) {
//								name.setText(name.getText()+" 衄血");
//							}
//						}else {
//							if(name.getText().contains("衄血")) {
//								name.setText(name.getText().replace("衄血", ""));
//							}
//						}
//								}
//				});
//				this.add(衄血);
//				this.add(衄血_box);
//				//copy tab
//				JLabel 血黄= new JLabel("血黄:");
//				血黄.setForeground(Color.WHITE);
//				血黄.setBounds(10+110, 20, 100, 50);
//				JCheckBox 血黄_box= new JCheckBox();
//				血黄_box.setBounds(10+60+110, 33, 20, 20);
//				血黄_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(血黄_box.isSelected()) {
//							if(!name.getText().contains("血黄")) {
//								name.setText(name.getText()+" 血黄");
//							}
//						}else {
//							if(name.getText().contains("血黄")) {
//								name.setText(name.getText().replace("血黄", ""));
//							}
//						}
//								}
//				});
//				this.add(血黄);
//				this.add(血黄_box);
//				//copy tab
//				JLabel 血黑= new JLabel("血黑:");
//				血黑.setForeground(Color.WHITE);
//				血黑.setBounds(10+110, 20+25, 100, 50);
//				JCheckBox 血黑_box= new JCheckBox();
//				血黑_box.setBounds(10+60+110, 33+25, 20, 20);
//				血黑_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(血黑_box.isSelected()) {
//							if(!name.getText().contains("血黑")) {
//								name.setText(name.getText()+" 血黑");
//							}
//						}else {
//							if(name.getText().contains("血黑")) {
//								name.setText(name.getText().replace("血黑", ""));
//							}
//						}
//								}
//				});
//				this.add(血黑);
//				this.add(血黑_box);
//				//copy tab
//				JLabel 血白= new JLabel("血白:");
//				血白.setForeground(Color.WHITE);
//				血白.setBounds(10+110, 20+50, 100, 50);
//				JCheckBox 血白_box= new JCheckBox();
//				血白_box.setBounds(10+60+110, 33+50, 20, 20);
//				血白_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(血白_box.isSelected()) {
//							if(!name.getText().contains("血白")) {
//								name.setText(name.getText()+" 血白");
//							}
//						}else {
//							if(name.getText().contains("血白")) {
//								name.setText(name.getText().replace("血白", ""));
//							}
//						}
//								}
//				});
//				this.add(血白);
//				this.add(血白_box);
//				//copy tab
//				JLabel 流血不止= new JLabel("流血不止:");
//				流血不止.setForeground(Color.WHITE);
//				流血不止.setBounds(10+110, 20+75, 100, 50);
//				JCheckBox 流血不止_box= new JCheckBox();
//				流血不止_box.setBounds(10+60+110, 33+75, 20, 20);
//				流血不止_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(流血不止_box.isSelected()) {
//							if(!name.getText().contains("流血不止")) {
//								name.setText(name.getText()+" 流血不止");
//							}
//						}else {
//							if(name.getText().contains("流血不止")) {
//								name.setText(name.getText().replace("流血不止", ""));
//							}
//						}
//								}
//				});
//				this.add(流血不止);
//				this.add(流血不止_box);
//			}
//}