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
//public class YangJPanel extends JPanel{
//	//
//
//	public YangJPanel(JTextField name){
//		this.setLayout(null);
//		this.setBounds(0, 0, 780, 610);
//		this.setBackground(Color.BLACK);
//
//		//copy tab
//		JLabel 瘙痒= new JLabel("瘙痒:");
//		瘙痒.setForeground(Color.WHITE);
//		瘙痒.setBounds(10, 20, 100, 50);
//		JCheckBox 瘙痒_box= new JCheckBox();
//		瘙痒_box.setBounds(10+60, 33, 20, 20);
//		瘙痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(瘙痒_box.isSelected()) {
//					if(!name.getText().contains("瘙痒")) {
//						name.setText(name.getText()+" 瘙痒");
//					}
//				}else {
//					if(name.getText().contains("瘙痒")) {
//						name.setText(name.getText().replace("瘙痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(瘙痒);
//		this.add(瘙痒_box);
//		//copy tab
//		JLabel 腹股沟痒= new JLabel("腹股沟痒:");
//		腹股沟痒.setForeground(Color.WHITE);
//		腹股沟痒.setBounds(10, 20+25, 100, 50);
//		JCheckBox 腹股沟痒_box= new JCheckBox();
//		腹股沟痒_box.setBounds(10+60, 33+25, 20, 20);
//		腹股沟痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(腹股沟痒_box.isSelected()) {
//					if(!name.getText().contains("腹股沟痒")) {
//						name.setText(name.getText()+" 腹股沟痒");
//					}
//				}else {
//					if(name.getText().contains("腹股沟痒")) {
//						name.setText(name.getText().replace("腹股沟痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(腹股沟痒);
//		this.add(腹股沟痒_box);
//		//copy tab
//		JLabel 皮痒= new JLabel("皮痒:");
//		皮痒.setForeground(Color.WHITE);
//		皮痒.setBounds(10, 20+50, 100, 50);
//		JCheckBox 皮痒_box= new JCheckBox();
//		皮痒_box.setBounds(10+60, 33+50, 20, 20);
//		皮痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(皮痒_box.isSelected()) {
//					if(!name.getText().contains("皮痒")) {
//						name.setText(name.getText()+" 皮痒");
//					}
//				}else {
//					if(name.getText().contains("皮痒")) {
//						name.setText(name.getText().replace("皮痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(皮痒);
//		this.add(皮痒_box);
//		//copy tab
//		JLabel 接触痒= new JLabel("接触痒:");
//		接触痒.setForeground(Color.WHITE);
//		接触痒.setBounds(10, 20+75, 100, 50);
//		JCheckBox 接触痒_box= new JCheckBox();
//		接触痒_box.setBounds(10+60, 33+75, 20, 20);
//		接触痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(接触痒_box.isSelected()) {
//					if(!name.getText().contains("接触痒")) {
//						name.setText(name.getText()+" 接触痒");
//					}
//				}else {
//					if(name.getText().contains("接触痒")) {
//						name.setText(name.getText().replace("接触痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(接触痒);
//		this.add(接触痒_box);
//		//copy tab
//		JLabel 手痒= new JLabel("手痒:");
//		手痒.setForeground(Color.WHITE);
//		手痒.setBounds(10, 20+100, 100, 50);
//		JCheckBox 手痒_box= new JCheckBox();
//		手痒_box.setBounds(10+60, 33+100, 20, 20);
//		手痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(手痒_box.isSelected()) {
//					if(!name.getText().contains("手痒")) {
//						name.setText(name.getText()+" 手痒");
//					}
//				}else {
//					if(name.getText().contains("手痒")) {
//						name.setText(name.getText().replace("手痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(手痒);
//		this.add(手痒_box);
//		//copy tab
//		JLabel 脚痒= new JLabel("脚痒:");
//		脚痒.setForeground(Color.WHITE);
//		脚痒.setBounds(10, 20+125, 100, 50);
//		JCheckBox 脚痒_box= new JCheckBox();
//		脚痒_box.setBounds(10+60, 33+125, 20, 20);
//		脚痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(脚痒_box.isSelected()) {
//					if(!name.getText().contains("脚痒")) {
//						name.setText(name.getText()+" 脚痒");
//					}
//				}else {
//					if(name.getText().contains("脚痒")) {
//						name.setText(name.getText().replace("脚痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(脚痒);
//		this.add(脚痒_box);
//		//copy tab
//		JLabel 香港脚= new JLabel("香港脚:");
//		香港脚.setForeground(Color.WHITE);
//		香港脚.setBounds(10, 20+150, 100, 50);
//		JCheckBox 香港脚_box= new JCheckBox();
//		香港脚_box.setBounds(10+60, 33+150, 20, 20);
//		香港脚_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(香港脚_box.isSelected()) {
//					if(!name.getText().contains("香港脚")) {
//						name.setText(name.getText()+" 香港脚");
//					}
//				}else {
//					if(name.getText().contains("香港脚")) {
//						name.setText(name.getText().replace("香港脚", ""));
//					}
//				}
//
//			}
//		});
//		this.add(香港脚);
//		this.add(香港脚_box);
//		//copy tab
//		JLabel 舌痒= new JLabel("舌痒:");
//		舌痒.setForeground(Color.WHITE);
//		舌痒.setBounds(10, 20+175, 100, 50);
//		JCheckBox 舌痒_box= new JCheckBox();
//		舌痒_box.setBounds(10+60, 33+175, 20, 20);
//		舌痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(舌痒_box.isSelected()) {
//					if(!name.getText().contains("舌痒")) {
//						name.setText(name.getText()+" 舌痒");
//					}
//				}else {
//					if(name.getText().contains("舌痒")) {
//						name.setText(name.getText().replace("舌痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(舌痒);
//		this.add(舌痒_box);
//		//copy tab
//		JLabel 嘴角痒= new JLabel("嘴角痒:");
//		嘴角痒.setForeground(Color.WHITE);
//		嘴角痒.setBounds(10, 20+200, 100, 50);
//		JCheckBox 嘴角痒_box= new JCheckBox();
//		嘴角痒_box.setBounds(10+60, 33+200, 20, 20);
//		嘴角痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(嘴角痒_box.isSelected()) {
//					if(!name.getText().contains("嘴角痒")) {
//						name.setText(name.getText()+" 嘴角痒");
//					}
//				}else {
//					if(name.getText().contains("嘴角痒")) {
//						name.setText(name.getText().replace("嘴角痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(嘴角痒);
//		this.add(嘴角痒_box);
//		//copy tab
//		JLabel 眼痒= new JLabel("眼痒:");
//		眼痒.setForeground(Color.WHITE);
//		眼痒.setBounds(10, 20+225, 100, 50);
//		JCheckBox 眼痒_box= new JCheckBox();
//		眼痒_box.setBounds(10+60, 33+225, 20, 20);
//		眼痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(眼痒_box.isSelected()) {
//					if(!name.getText().contains("眼痒")) {
//						name.setText(name.getText()+" 眼痒");
//					}
//				}else {
//					if(name.getText().contains("眼痒")) {
//						name.setText(name.getText().replace("眼痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(眼痒);
//		this.add(眼痒_box);
//		//copy tab
//		JLabel 生殖器痒= new JLabel("生殖器痒:");
//		生殖器痒.setForeground(Color.WHITE);
//		生殖器痒.setBounds(10, 20+250, 100, 50);
//		JCheckBox 生殖器痒_box= new JCheckBox();
//		生殖器痒_box.setBounds(10+60, 33+250, 20, 20);
//		生殖器痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(生殖器痒_box.isSelected()) {
//					if(!name.getText().contains("生殖器痒")) {
//						name.setText(name.getText()+" 生殖器痒");
//					}
//				}else {
//					if(name.getText().contains("生殖器痒")) {
//						name.setText(name.getText().replace("生殖器痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(生殖器痒);
//		this.add(生殖器痒_box);
//		//copy tab
//		JLabel 腋下痒= new JLabel("腋下痒:");
//		腋下痒.setForeground(Color.WHITE);
//		腋下痒.setBounds(10, 20+275, 100, 50);
//		JCheckBox 腋下痒_box= new JCheckBox();
//		腋下痒_box.setBounds(10+60, 33+275, 20, 20);
//		腋下痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(腋下痒_box.isSelected()) {
//					if(!name.getText().contains("腋下痒")) {
//						name.setText(name.getText()+" 腋下痒");
//					}
//				}else {
//					if(name.getText().contains("腋下痒")) {
//						name.setText(name.getText().replace("腋下痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(腋下痒);
//		this.add(腋下痒_box);
//		//copy tab
//		JLabel 背痒= new JLabel("背痒:");
//		背痒.setForeground(Color.WHITE);
//		背痒.setBounds(10, 20+300, 100, 50);
//		JCheckBox 背痒_box= new JCheckBox();
//		背痒_box.setBounds(10+60, 33+300, 20, 20);
//		背痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(背痒_box.isSelected()) {
//					if(!name.getText().contains("背痒")) {
//						name.setText(name.getText()+" 背痒");
//					}
//				}else {
//					if(name.getText().contains("背痒")) {
//						name.setText(name.getText().replace("背痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(背痒);
//		this.add(背痒_box);
//		//copy tab
//		JLabel 腿痒= new JLabel("腿痒:");
//		腿痒.setForeground(Color.WHITE);
//		腿痒.setBounds(10, 20+325, 100, 50);
//		JCheckBox 腿痒_box= new JCheckBox();
//		腿痒_box.setBounds(10+60, 33+325, 20, 20);
//		腿痒_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(腿痒_box.isSelected()) {
//					if(!name.getText().contains("腿痒")) {
//						name.setText(name.getText()+" 腿痒");
//					}
//				}else {
//					if(name.getText().contains("腿痒")) {
//						name.setText(name.getText().replace("腿痒", ""));
//					}
//				}
//
//			}
//		});
//		this.add(腿痒);
//		this.add(腿痒_box);
//	}
//}