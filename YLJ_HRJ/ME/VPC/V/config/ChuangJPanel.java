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
//public class ChuangJPanel extends JPanel {
//	//
//
//	public ChuangJPanel(JTextField name){
//		this.setLayout(null);
//		this.setBounds(0, 0, 780, 610);
//		this.setBackground(Color.BLACK);
//
//
//				//copy tab
//				JLabel 痔疮= new JLabel("痔疮:");
//				痔疮.setForeground(Color.WHITE);
//				痔疮.setBounds(10+110+110, 20+300, 100, 50);
//				JCheckBox 痔疮_box= new JCheckBox();
//				痔疮_box.setBounds(10+60+110+110, 33+300, 20, 20);
//				痔疮_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(痔疮_box.isSelected()) {
//							if(!name.getText().contains("痔疮")) {
//								name.setText(name.getText()+" 痔疮");
//							}
//						}else {
//							if(name.getText().contains("痔疮")) {
//								name.setText(name.getText().replace("痔疮", ""));
//							}
//						}
//								}
//				});
//				this.add(痔疮);
//				this.add(痔疮_box);
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
//				//copy tab
//				JLabel 皮炎= new JLabel("皮炎:");
//				皮炎.setForeground(Color.WHITE);
//				皮炎.setBounds(10+110+110+110, 20+75, 100, 50);
//				JCheckBox 皮炎_box= new JCheckBox();
//				皮炎_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
//				皮炎_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(皮炎_box.isSelected()) {
//							if(!name.getText().contains("皮炎")) {
//								name.setText(name.getText()+" 皮炎");
//							}
//						}else {
//							if(name.getText().contains("皮炎")) {
//								name.setText(name.getText().replace("皮炎", ""));
//							}
//						}
//								}
//				});
//				this.add(皮炎);
//				this.add(皮炎_box);
//					//copy tab
//				JLabel 疱疹= new JLabel("疱疹:");
//				疱疹.setForeground(Color.WHITE);
//				疱疹.setBounds(10+110+110+110, 20+100, 100, 50);
//				JCheckBox 疱疹_box= new JCheckBox();
//				疱疹_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
//				疱疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(疱疹_box.isSelected()) {
//							if(!name.getText().contains("疱疹")) {
//								name.setText(name.getText()+" 疱疹");
//							}
//						}else {
//							if(name.getText().contains("疱疹")) {
//								name.setText(name.getText().replace("疱疹", ""));
//							}
//						}
//								}
//				});
//				this.add(疱疹);
//				this.add(疱疹_box);
//				//copy tab
//				JLabel 风疹= new JLabel("风疹:");
//				风疹.setForeground(Color.WHITE);
//				风疹.setBounds(10+110+110+110, 20+125, 100, 50);
//				JCheckBox 风疹_box= new JCheckBox();
//				风疹_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
//				风疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(风疹_box.isSelected()) {
//							if(!name.getText().contains("风疹")) {
//								name.setText(name.getText()+" 风疹");
//							}
//						}else {
//							if(name.getText().contains("风疹")) {
//								name.setText(name.getText().replace("风疹", ""));
//							}
//						}
//								}
//				});
//				this.add(风疹);
//				this.add(风疹_box);
//				//copy tab
//				JLabel 麻疹= new JLabel("麻疹:");
//				麻疹.setForeground(Color.WHITE);
//				麻疹.setBounds(10+110+110+110, 20+150, 100, 50);
//				JCheckBox 麻疹_box= new JCheckBox();
//				麻疹_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
//				麻疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(麻疹_box.isSelected()) {
//							if(!name.getText().contains("麻疹")) {
//								name.setText(name.getText()+" 麻疹");
//							}
//						}else {
//							if(name.getText().contains("麻疹")) {
//								name.setText(name.getText().replace("麻疹", ""));
//							}
//						}
//								}
//				});
//				this.add(麻疹);
//				this.add(麻疹_box);
//				//copy tab
//				JLabel 湿疹= new JLabel("湿疹:");
//				湿疹.setForeground(Color.WHITE);
//				湿疹.setBounds(10+110+110+110, 20+175, 100, 50);
//				JCheckBox 湿疹_box= new JCheckBox();
//				湿疹_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
//				湿疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(湿疹_box.isSelected()) {
//							if(!name.getText().contains("湿疹")) {
//								name.setText(name.getText()+" 湿疹");
//							}
//						}else {
//							if(name.getText().contains("湿疹")) {
//								name.setText(name.getText().replace("湿疹", ""));
//							}
//						}
//								}
//				});
//				this.add(湿疹);
//				this.add(湿疹_box);
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
//				//copy tab
//				JLabel 梅毒= new JLabel("梅毒:");
//				梅毒.setForeground(Color.WHITE);
//				梅毒.setBounds(10+110+110+110, 20+225, 100, 50);
//				JCheckBox 梅毒_box= new JCheckBox();
//				梅毒_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
//				梅毒_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(梅毒_box.isSelected()) {
//							if(!name.getText().contains("梅毒")) {
//								name.setText(name.getText()+" 梅毒");
//							}
//						}else {
//							if(name.getText().contains("梅毒")) {
//								name.setText(name.getText().replace("梅毒", ""));
//							}
//						}
//								}
//				});
//				this.add(梅毒);
//				this.add(梅毒_box);
//					//copy tab
//				JLabel 痈疮脓疙= new JLabel("痈疮脓疙:");
//				痈疮脓疙.setForeground(Color.WHITE);
//				痈疮脓疙.setBounds(10+110+110+220, 20+250, 100, 50);
//				JCheckBox 痈疮脓疙_box= new JCheckBox();
//				痈疮脓疙_box.setBounds(10+60+110+110+220, 33+250, 20, 20);
//				痈疮脓疙_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(痈疮脓疙_box.isSelected()) {
//							if(!name.getText().contains("痈疮脓疙")) {
//								name.setText(name.getText()+" 痈疮脓疙");
//							}
//						}else {
//							if(name.getText().contains("痈疮脓疙")) {
//								name.setText(name.getText().replace("痈疮脓疙", ""));
//							}
//						}
//								}
//				});
//				this.add(痈疮脓疙);
//				this.add(痈疮脓疙_box);
//				//copy tab
//				JLabel 斑疹= new JLabel("斑疹:");
//				斑疹.setForeground(Color.WHITE);
//				斑疹.setBounds(10+110+110+220, 20+325, 100, 50);
//				JCheckBox 斑疹_box= new JCheckBox();
//				斑疹_box.setBounds(10+60+110+110+220, 33+325, 20, 20);
//				斑疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(斑疹_box.isSelected()) {
//							if(!name.getText().contains("斑疹")) {
//								name.setText(name.getText()+" 斑疹");
//							}
//						}else {
//							if(name.getText().contains("斑疹")) {
//								name.setText(name.getText().replace("斑疹", ""));
//							}
//						}
//								}
//				});
//				this.add(斑疹);
//				this.add(斑疹_box);
//				//copy tab
//				JLabel 水肿= new JLabel("水肿:");
//				水肿.setForeground(Color.WHITE);
//				水肿.setBounds(10+110+110+330, 20+50, 100, 50);
//				JCheckBox 水肿_box= new JCheckBox();
//				水肿_box.setBounds(10+60+110+110+330, 33+50, 20, 20);
//				水肿_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(水肿_box.isSelected()) {
//							if(!name.getText().contains("水肿")) {
//								name.setText(name.getText()+" 水肿");
//							}
//						}else {
//							if(name.getText().contains("水肿")) {
//								name.setText(name.getText().replace("水肿", ""));
//							}
//						}
//								}
//				});
//				this.add(水肿);
//				this.add(水肿_box);
//				//copy tab
//				JLabel 肿胀= new JLabel("肿胀:");
//				肿胀.setForeground(Color.WHITE);
//				肿胀.setBounds(10+110+110+330, 20+75, 100, 50);
//				JCheckBox 肿胀_box= new JCheckBox();
//				肿胀_box.setBounds(10+60+110+110+330, 33+75, 20, 20);
//				肿胀_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(肿胀_box.isSelected()) {
//							if(!name.getText().contains("肿胀")) {
//								name.setText(name.getText()+" 肿胀");
//							}
//						}else {
//							if(name.getText().contains("肿胀")) {
//								name.setText(name.getText().replace("肿胀", ""));
//							}
//						}
//								}
//				});
//				this.add(肿胀);
//				this.add(肿胀_box);
//				//copy tab
//				JLabel 舌疮= new JLabel("舌疮:");
//				舌疮.setForeground(Color.WHITE);
//				舌疮.setBounds(10+110+110+440, 20+200, 100, 50);
//				JCheckBox 舌疮_box= new JCheckBox();
//				舌疮_box.setBounds(10+60+110+110+440, 33+200, 20, 20);
//				舌疮_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(舌疮_box.isSelected()) {
//							if(!name.getText().contains("舌疮")) {
//								name.setText(name.getText()+" 舌疮");
//							}
//						}else {
//							if(name.getText().contains("舌疮")) {
//								name.setText(name.getText().replace("舌疮", ""));
//							}
//						}
//								}
//				});
//				this.add(舌疮);
//				this.add(舌疮_box);
//				//copy tab
//				JLabel 炎疹= new JLabel("炎疹:");
//				炎疹.setForeground(Color.WHITE);
//				炎疹.setBounds(10+110+110, 20, 100, 50);
//				JCheckBox 炎疹_box= new JCheckBox();
//				炎疹_box.setBounds(10+60+110+110, 33, 20, 20);
//				炎疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(炎疹_box.isSelected()) {
//							if(!name.getText().contains("炎疹")) {
//								name.setText(name.getText()+" 炎疹");
//							}
//						}else {
//							if(name.getText().contains("炎疹")) {
//								name.setText(name.getText().replace("炎疹", ""));
//							}
//						}
//								}
//				});
//				this.add(炎疹);
//				this.add(炎疹_box);
//				//copy tab
//				JLabel 腮腺疹= new JLabel("腮腺疹:");
//				腮腺疹.setForeground(Color.WHITE);
//				腮腺疹.setBounds(10+110+110, 20+25, 100, 50);
//				JCheckBox 腮腺疹_box= new JCheckBox();
//				腮腺疹_box.setBounds(10+60+110+110, 33+25, 20, 20);
//				腮腺疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(腮腺疹_box.isSelected()) {
//							if(!name.getText().contains("腮腺疹")) {
//								name.setText(name.getText()+" 腮腺疹");
//							}
//						}else {
//							if(name.getText().contains("腮腺疹")) {
//								name.setText(name.getText().replace("腮腺疹", ""));
//							}
//						}
//								}
//				});
//				this.add(腮腺疹);
//				this.add(腮腺疹_box);
//				//copy tab
//				JLabel 皮疹= new JLabel("皮疹:");
//				皮疹.setForeground(Color.WHITE);
//				皮疹.setBounds(10+110+110, 20+50, 100, 50);
//				JCheckBox 皮疹_box= new JCheckBox();
//				皮疹_box.setBounds(10+60+110+110, 33+50, 20, 20);
//				皮疹_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(皮疹_box.isSelected()) {
//							if(!name.getText().contains("皮疹")) {
//								name.setText(name.getText()+" 皮疹");
//							}
//						}else {
//							if(name.getText().contains("皮疹")) {
//								name.setText(name.getText().replace("皮疹", ""));
//							}
//						}
//								}
//				});
//				this.add(皮疹);
//				this.add(皮疹_box);
//				//copy tab
//				JLabel 刀疮= new JLabel("刀疮:");
//				刀疮.setForeground(Color.WHITE);
//				刀疮.setBounds(10+110+110, 20+75, 100, 50);
//				JCheckBox 刀疮_box= new JCheckBox();
//				刀疮_box.setBounds(10+60+110+110, 33+75, 20, 20);
//				刀疮_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(刀疮_box.isSelected()) {
//							if(!name.getText().contains("刀疮")) {
//								name.setText(name.getText()+" 刀疮");
//							}
//						}else {
//							if(name.getText().contains("刀疮")) {
//								name.setText(name.getText().replace("刀疮", ""));
//							}
//						}
//								}
//				});
//				this.add(刀疮);
//				this.add(刀疮_box);
//				//copy tab
//				JLabel 破伤风= new JLabel("破伤风:");
//				破伤风.setForeground(Color.WHITE);
//				破伤风.setBounds(10+110+110, 20+100, 100, 50);
//				JCheckBox 破伤风_box= new JCheckBox();
//				破伤风_box.setBounds(10+60+110+110, 33+100, 20, 20);
//				破伤风_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(破伤风_box.isSelected()) {
//							if(!name.getText().contains("破伤风")) {
//								name.setText(name.getText()+" 破伤风");
//							}
//						}else {
//							if(name.getText().contains("破伤风")) {
//								name.setText(name.getText().replace("破伤风", ""));
//							}
//						}
//								}
//				});
//				this.add(破伤风);
//				this.add(破伤风_box);
//				//copy tab
//				JLabel 动物咬伤= new JLabel("动物咬伤:");
//				动物咬伤.setForeground(Color.WHITE);
//				动物咬伤.setBounds(10+110+110, 20+125, 100, 50);
//				JCheckBox 动物咬伤_box= new JCheckBox();
//				动物咬伤_box.setBounds(10+ 60+ 110+ 110, 33+ 125, 20, 20);
//				动物咬伤_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(动物咬伤_box.isSelected()) {
//							if(!name.getText().contains("动物咬伤")) {
//								name.setText(name.getText()+" 动物咬伤");
//							}
//						}else {
//							if(name.getText().contains("动物咬伤")) {
//								name.setText(name.getText().replace("动物咬伤", ""));
//							}
//						}
//								}
//				});
//				this.add(动物咬伤);
//				this.add(动物咬伤_box);
//				//copy tab
//				JLabel 冻疮= new JLabel("冻疮:");
//				冻疮.setForeground(Color.WHITE);
//				冻疮.setBounds(10+110+110, 20+150, 100, 50);
//				JCheckBox 冻疮_box= new JCheckBox();
//				冻疮_box.setBounds(10+60+110+110, 33+150, 20, 20);
//				冻疮_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(冻疮_box.isSelected()) {
//							if(!name.getText().contains("冻疮")) {
//								name.setText(name.getText()+" 冻疮");
//							}
//						}else {
//							if(name.getText().contains("冻疮")) {
//								name.setText(name.getText().replace("冻疮", ""));
//							}
//						}
//								}
//				});
//				this.add(冻疮);
//				this.add(冻疮_box);
//				//copy tab
//				JLabel 久疮不愈= new JLabel("久疮不愈:");
//				久疮不愈.setForeground(Color.WHITE);
//				久疮不愈.setBounds(10+110+110, 20+175, 100, 50);
//				JCheckBox 久疮不愈_box= new JCheckBox();
//				久疮不愈_box.setBounds(10+60+110+110, 33+175, 20, 20);
//				久疮不愈_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(久疮不愈_box.isSelected()) {
//							if(!name.getText().contains("久疮不愈")) {
//								name.setText(name.getText()+" 久疮不愈");
//							}
//						}else {
//							if(name.getText().contains("久疮不愈")) {
//								name.setText(name.getText().replace("久疮不愈", ""));
//							}
//						}
//								}
//				});
//				this.add(久疮不愈);
//				this.add(久疮不愈_box);
//		}
//}