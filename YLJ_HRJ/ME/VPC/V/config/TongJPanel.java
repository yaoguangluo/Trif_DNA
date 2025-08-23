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
//public class TongJPanel extends JPanel{
//
//	/**
//	 *
//	 */
//	//
//
//	public TongJPanel(JTextField name){
//		this.setLayout(null);
//		this.setBounds(0, 0, 780, 610);
//		this.setBackground(Color.BLACK);
//
//		JLabel shentongqichuan_filter= new JLabel("身痛:");
//		shentongqichuan_filter.setForeground(Color.WHITE);
//		shentongqichuan_filter.setBounds(10, 45, 100, 50);
//		JCheckBox shentongqichuan_filter_box= new JCheckBox();
//		shentongqichuan_filter_box.setBounds(10+60, 58, 20, 20);
//		shentongqichuan_filter_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(shentongqichuan_filter_box.isSelected()) {
//					if(!name.getText().contains("身痛")) {
//						name.setText(name.getText()+" 身痛");
//					}
//				}else {
//					if(name.getText().contains("身痛")) {
//						name.setText(name.getText().replace("身痛", ""));
//					}
//				}
//				}
//		});
//		this.add(shentongqichuan_filter);
//		this.add(shentongqichuan_filter_box);
//		//
//		JLabel etoutongqichuan_filter= new JLabel("额头痛:");
//		etoutongqichuan_filter.setForeground(Color.WHITE);
//		etoutongqichuan_filter.setBounds(10, 45+25, 100, 50);
//		JCheckBox etoutongqichuan_filter_box= new JCheckBox();
//		etoutongqichuan_filter_box.setBounds(10+60, 58+25, 20, 20);
//		etoutongqichuan_filter_box.addActionListener(new ActionListener(){
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				if(etoutongqichuan_filter_box.isSelected()) {
//					if(!name.getText().contains("额头痛")) {
//						name.setText(name.getText()+" 额头痛");
//					}
//				}else {
//					if(name.getText().contains("额头痛")) {
//						name.setText(name.getText().replace("额头痛", ""));
//					}
//				}
//				}
//		});
//		this.add(etoutongqichuan_filter);
//		this.add(etoutongqichuan_filter_box);
//
//
//				//copy tab
//				JLabel toutong= new JLabel("头痛:");
//				toutong.setForeground(Color.WHITE);
//				toutong.setBounds(10, 45+25+100+25+100, 100, 50);
//				JCheckBox toutong_box= new JCheckBox();
//				toutong_box.setBounds(10+60, 58+25+100+25+100, 20, 20);
//				toutong_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(toutong_box.isSelected()) {
//							if(!name.getText().contains("头痛")) {
//								name.setText(name.getText()+" 头痛");
//							}
//						}else {
//							if(name.getText().contains("头痛")) {
//								name.setText(name.getText().replace("头痛", ""));
//							}
//						}
//								}
//				});
//				this.add(toutong);
//				this.add(toutong_box);
//				//copy tab
//				JLabel bozitong= new JLabel("脖子痛:");
//				bozitong.setForeground(Color.WHITE);
//				bozitong.setBounds(10, 45+25+100+25+125, 100, 50);
//				JCheckBox bozitong_box= new JCheckBox();
//				bozitong_box.setBounds(10+60, 58+25+100+25+125, 20, 20);
//				bozitong_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(bozitong_box.isSelected()) {
//							if(!name.getText().contains("脖子痛")) {
//								name.setText(name.getText()+" 脖子痛");
//							}
//						}else {
//							if(name.getText().contains("脖子痛")) {
//								name.setText(name.getText().replace("脖子痛", ""));
//							}
//						}
//								}
//				});
//				this.add(bozitong);
//				this.add(bozitong_box);
//				//copy tab
//				JLabel xiongtong= new JLabel("胸痛:");
//				xiongtong.setForeground(Color.WHITE);
//				xiongtong.setBounds(10+440, 45+25+100+25+150, 100, 50);
//				JCheckBox xiongtong_box= new JCheckBox();
//				xiongtong_box.setBounds(10+60+440, 58+25+100+25+150, 20, 20);
//				xiongtong_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(xiongtong_box.isSelected()) {
//							if(!name.getText().contains("胸痛")) {
//								name.setText(name.getText()+" 胸痛");
//							}
//						}else {
//							if(name.getText().contains("胸痛")) {
//								name.setText(name.getText().replace("胸痛", ""));
//							}
//						}
//								}
//				});
//				this.add(xiongtong);
//				this.add(xiongtong_box);
//				//copy tab
//				JLabel futong= new JLabel("腹痛:");
//				futong.setForeground(Color.WHITE);
//				futong.setBounds(10, 45+25+100+25+150, 100, 50);
//				JCheckBox futong_box= new JCheckBox();
//				futong_box.setBounds(10+60, 58+25+100+25+150, 20, 20);
//				futong_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(futong_box.isSelected()) {
//							if(!name.getText().contains("腹痛")) {
//								name.setText(name.getText()+" 腹痛");
//							}
//						}else {
//							if(name.getText().contains("腹痛")) {
//								name.setText(name.getText().replace("腹痛", ""));
//							}
//						}
//								}
//				});
//				this.add(futong);
//				this.add(futong_box);
//				//copy tab
//				JLabel 关节痛= new JLabel("关节痛:");
//				关节痛.setForeground(Color.WHITE);
//				关节痛.setBounds(10, 45+25+100+25+175, 100, 50);
//				JCheckBox 关节痛_box= new JCheckBox();
//				关节痛_box.setBounds(10+60, 58+25+100+25+175, 20, 20);
//				关节痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(关节痛_box.isSelected()) {
//							if(!name.getText().contains("关节痛")) {
//								name.setText(name.getText()+" 关节痛");
//							}
//						}else {
//							if(name.getText().contains("关节痛")) {
//								name.setText(name.getText().replace("关节痛", ""));
//							}
//						}
//								}
//				});
//				this.add(关节痛);
//				this.add(关节痛_box);
//				//copy tab
//				JLabel 空痛= new JLabel("空痛:");
//				空痛.setForeground(Color.WHITE);
//				空痛.setBounds(10, 45+25+100+25+200, 100, 50);
//				JCheckBox 空痛_box= new JCheckBox();
//				空痛_box.setBounds(10+60, 58+25+100+25+200, 20, 20);
//				空痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(空痛_box.isSelected()) {
//							if(!name.getText().contains("空痛")) {
//								name.setText(name.getText()+" 空痛");
//							}
//						}else {
//							if(name.getText().contains("空痛")) {
//								name.setText(name.getText().replace("空痛", ""));
//							}
//						}
//								}
//				});
//				this.add(空痛);
//				this.add(空痛_box);
//				//copy tab
//				JLabel 隐痛= new JLabel("隐痛:");
//				隐痛.setForeground(Color.WHITE);
//				隐痛.setBounds(10, 45+25+100+25+225, 100, 50);
//				JCheckBox 隐痛_box= new JCheckBox();
//				隐痛_box.setBounds(10+60, 58+25+100+25+225, 20, 20);
//				隐痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(隐痛_box.isSelected()) {
//							if(!name.getText().contains("隐痛")) {
//								name.setText(name.getText()+" 隐痛");
//							}
//						}else {
//							if(name.getText().contains("隐痛")) {
//								name.setText(name.getText().replace("隐痛", ""));
//							}
//						}
//								}
//				});
//				this.add(隐痛);
//				this.add(隐痛_box);
//				//copy tab
//				JLabel 绞痛= new JLabel("绞痛:");
//				绞痛.setForeground(Color.WHITE);
//				绞痛.setBounds(10, 45+25+100+25+250, 100, 50);
//				JCheckBox 绞痛_box= new JCheckBox();
//				绞痛_box.setBounds(10+60, 58+25+100+25+250, 20, 20);
//				绞痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(绞痛_box.isSelected()) {
//							if(!name.getText().contains("绞痛")) {
//								name.setText(name.getText()+" 绞痛");
//							}
//						}else {
//							if(name.getText().contains("绞痛")) {
//								name.setText(name.getText().replace("绞痛", ""));
//							}
//						}
//								}
//				});
//				this.add(绞痛);
//				this.add(绞痛_box);
//				//copy tab
//				JLabel 刺痛= new JLabel("刺痛:");
//				刺痛.setForeground(Color.WHITE);
//				刺痛.setBounds(10, 45+25+100+25+275, 100, 50);
//				JCheckBox 刺痛_box= new JCheckBox();
//				刺痛_box.setBounds(10+60, 58+25+100+25+275, 20, 20);
//				刺痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(刺痛_box.isSelected()) {
//							if(!name.getText().contains("刺痛")) {
//								name.setText(name.getText()+" 刺痛");
//							}
//						}else {
//							if(name.getText().contains("刺痛")) {
//								name.setText(name.getText().replace("刺痛", ""));
//							}
//						}
//								}
//				});
//				this.add(刺痛);
//				this.add(刺痛_box);
//				//copy tab
//				JLabel 剧痛= new JLabel("剧痛:");
//				剧痛.setForeground(Color.WHITE);
//				剧痛.setBounds(10, 45+25+100+25+300, 100, 50);
//				JCheckBox 剧痛_box= new JCheckBox();
//				剧痛_box.setBounds(10+60, 58+25+100+25+300, 20, 20);
//				剧痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(剧痛_box.isSelected()) {
//							if(!name.getText().contains("剧痛")) {
//								name.setText(name.getText()+" 剧痛");
//							}
//						}else {
//							if(name.getText().contains("剧痛")) {
//								name.setText(name.getText().replace("剧痛", ""));
//							}
//						}
//								}
//				});
//				this.add(剧痛);
//				this.add(剧痛_box);
//				//copy tab
//				JLabel 反跳痛= new JLabel("反跳痛:");
//				反跳痛.setForeground(Color.WHITE);
//				反跳痛.setBounds(10, 45+25+100+25+325, 100, 50);
//				JCheckBox 反跳痛_box= new JCheckBox();
//				反跳痛_box.setBounds(10+60, 58+25+100+25+325, 20, 20);
//				反跳痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(反跳痛_box.isSelected()) {
//							if(!name.getText().contains("反跳痛")) {
//								name.setText(name.getText()+" 反跳痛");
//							}
//						}else {
//							if(name.getText().contains("反跳痛")) {
//								name.setText(name.getText().replace("反跳痛", ""));
//							}
//						}
//								}
//				});
//				this.add(反跳痛);
//				this.add(反跳痛_box);
//				//copy tab
//				JLabel 压痛= new JLabel("压痛:");
//				压痛.setForeground(Color.WHITE);
//				压痛.setBounds(10+110, 20+0, 100, 50);
//				JCheckBox 压痛_box= new JCheckBox();
//				压痛_box.setBounds(10+60+110, 33+0, 20, 20);
//				压痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(压痛_box.isSelected()) {
//							if(!name.getText().contains("压痛")) {
//								name.setText(name.getText()+" 压痛");
//							}
//						}else {
//							if(name.getText().contains("压痛")) {
//								name.setText(name.getText().replace("压痛", ""));
//							}
//						}
//								}
//				});
//				this.add(压痛);
//				this.add(压痛_box);
//				//copy tab
//				JLabel 抽痛= new JLabel("抽痛:");
//				抽痛.setForeground(Color.WHITE);
//				抽痛.setBounds(10+110, 20+25, 100, 50);
//				JCheckBox 抽痛_box= new JCheckBox();
//				抽痛_box.setBounds(10+60+110, 33+25, 20, 20);
//				抽痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(抽痛_box.isSelected()) {
//							if(!name.getText().contains("抽痛")) {
//								name.setText(name.getText()+" 抽痛");
//							}
//						}else {
//							if(name.getText().contains("抽痛")) {
//								name.setText(name.getText().replace("抽痛", ""));
//							}
//						}
//								}
//				});
//				this.add(抽痛);
//				this.add(抽痛_box);
//				//copy tab
//				JLabel 灼痛= new JLabel("灼痛:");
//				灼痛.setForeground(Color.WHITE);
//				灼痛.setBounds(10+110, 20+50, 100, 50);
//				JCheckBox 灼痛_box= new JCheckBox();
//				灼痛_box.setBounds(10+60+110, 33+50, 20, 20);
//				灼痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(灼痛_box.isSelected()) {
//							if(!name.getText().contains("灼痛")) {
//								name.setText(name.getText()+" 灼痛");
//							}
//						}else {
//							if(name.getText().contains("灼痛")) {
//								name.setText(name.getText().replace("灼痛", ""));
//							}
//						}
//								}
//				});
//				this.add(灼痛);
//				this.add(灼痛_box);
//				//copy tab
//				JLabel 手痛= new JLabel("手痛:");
//				手痛.setForeground(Color.WHITE);
//				手痛.setBounds(10+110, 20+175, 100, 50);
//				JCheckBox 手痛_box= new JCheckBox();
//				手痛_box.setBounds(10+60+110, 33+175, 20, 20);
//				手痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(手痛_box.isSelected()) {
//							if(!name.getText().contains("手痛")) {
//								name.setText(name.getText()+" 手痛");
//							}
//						}else {
//							if(name.getText().contains("手痛")) {
//								name.setText(name.getText().replace("手痛", ""));
//							}
//						}
//								}
//				});
//				this.add(手痛);
//				this.add(手痛_box);
//				//copy tab
//				JLabel 脚痛= new JLabel("脚痛:");
//				脚痛.setForeground(Color.WHITE);
//				脚痛.setBounds(10+110, 20+200, 100, 50);
//				JCheckBox 脚痛_box= new JCheckBox();
//				脚痛_box.setBounds(10+60+110, 33+200, 20, 20);
//				脚痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(脚痛_box.isSelected()) {
//							if(!name.getText().contains("脚痛")) {
//								name.setText(name.getText()+" 脚痛");
//							}
//						}else {
//							if(name.getText().contains("脚痛")) {
//								name.setText(name.getText().replace("脚痛", ""));
//							}
//						}
//								}
//				});
//				this.add(脚痛);
//				this.add(脚痛_box);
//				//copy tab
//				JLabel 腰痛= new JLabel("腰痛:");
//				腰痛.setForeground(Color.WHITE);
//				腰痛.setBounds(10+110, 20+225, 100, 50);
//				JCheckBox 腰痛_box= new JCheckBox();
//				腰痛_box.setBounds(10+60+110, 33+225, 20, 20);
//				腰痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(腰痛_box.isSelected()) {
//							if(!name.getText().contains("腰痛")) {
//								name.setText(name.getText()+" 腰痛");
//							}
//						}else {
//							if(name.getText().contains("腰痛")) {
//								name.setText(name.getText().replace("腰痛", ""));
//							}
//						}
//								}
//				});
//				this.add(腰痛);
//				this.add(腰痛_box);
//				//copy tab
//				JLabel 背痛= new JLabel("背痛:");
//				背痛.setForeground(Color.WHITE);
//				背痛.setBounds(10+110, 20+250, 100, 50);
//				JCheckBox 背痛_box= new JCheckBox();
//				背痛_box.setBounds(10+60+110, 33+250, 20, 20);
//				背痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(背痛_box.isSelected()) {
//							if(!name.getText().contains("背痛")) {
//								name.setText(name.getText()+" 背痛");
//							}
//						}else {
//							if(name.getText().contains("背痛")) {
//								name.setText(name.getText().replace("背痛", ""));
//							}
//						}
//								}
//				});
//				this.add(背痛);
//				this.add(背痛_box);
//				//copy tab
//				JLabel 指甲痛= new JLabel("指甲痛:");
//				指甲痛.setForeground(Color.WHITE);
//				指甲痛.setBounds(10+110, 20+275, 100, 50);
//				JCheckBox 指甲痛_box= new JCheckBox();
//				指甲痛_box.setBounds(10+60+110, 33+275, 20, 20);
//				指甲痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(指甲痛_box.isSelected()) {
//							if(!name.getText().contains("指甲痛")) {
//								name.setText(name.getText()+" 指甲痛");
//							}
//						}else {
//							if(name.getText().contains("指甲痛")) {
//								name.setText(name.getText().replace("指甲痛", ""));
//							}
//						}
//								}
//				});
//				this.add(指甲痛);
//				this.add(指甲痛_box);
//				//copy tab
//				JLabel 手掌痛= new JLabel("手掌痛:");
//				手掌痛.setForeground(Color.WHITE);
//				手掌痛.setBounds(10+110, 20+300, 100, 50);
//				JCheckBox 手掌痛_box= new JCheckBox();
//				手掌痛_box.setBounds(10+60+110, 33+300, 20, 20);
//				手掌痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(手掌痛_box.isSelected()) {
//							if(!name.getText().contains("手掌痛")) {
//								name.setText(name.getText()+" 手掌痛");
//							}
//						}else {
//							if(name.getText().contains("手掌痛")) {
//								name.setText(name.getText().replace("手掌痛", ""));
//							}
//						}
//								}
//				});
//				this.add(手掌痛);
//				this.add(手掌痛_box);
//				//copy tab
//				JLabel 脚趾痛= new JLabel("脚趾痛:");
//				脚趾痛.setForeground(Color.WHITE);
//				脚趾痛.setBounds(10+110, 20+325, 100, 50);
//				JCheckBox 脚趾痛_box= new JCheckBox();
//				脚趾痛_box.setBounds(10+60+110, 33+325, 20, 20);
//				脚趾痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(脚趾痛_box.isSelected()) {
//							if(!name.getText().contains("脚趾痛")) {
//								name.setText(name.getText()+" 脚趾痛");
//							}
//						}else {
//							if(name.getText().contains("脚趾痛")) {
//								name.setText(name.getText().replace("脚趾痛", ""));
//							}
//						}
//								}
//				});
//				this.add(脚趾痛);
//				this.add(脚趾痛_box);
//				//copy tab
//				JLabel 嗓痛= new JLabel("嗓痛:");
//				嗓痛.setForeground(Color.WHITE);
//				嗓痛.setBounds(10+110+110, 20+400, 100, 50);
//				JCheckBox 嗓痛_box= new JCheckBox();
//				嗓痛_box.setBounds(10+60+110+110, 33+400, 20, 20);
//				嗓痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(嗓痛_box.isSelected()) {
//							if(!name.getText().contains("嗓痛")) {
//								name.setText(name.getText()+" 嗓痛");
//							}
//						}else {
//							if(name.getText().contains("嗓痛")) {
//								name.setText(name.getText().replace("嗓痛", ""));
//							}
//						}
//								}
//				});
//				this.add(嗓痛);
//				this.add(嗓痛_box);
//					//copy tab
//				JLabel 牙痛= new JLabel("牙痛:");
//				牙痛.setForeground(Color.WHITE);
//				牙痛.setBounds(10+110+110+110, 20+425, 100, 50);
//				JCheckBox 牙痛_box= new JCheckBox();
//				牙痛_box.setBounds(10+60+110+110+110, 33+425, 20, 20);
//				牙痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(牙痛_box.isSelected()) {
//							if(!name.getText().contains("牙痛")) {
//								name.setText(name.getText()+" 牙痛");
//							}
//						}else {
//							if(name.getText().contains("牙痛")) {
//								name.setText(name.getText().replace("牙痛", ""));
//							}
//						}
//								}
//				});
//				this.add(牙痛);
//				this.add(牙痛_box);
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
//				JLabel 骨痛= new JLabel("骨痛:");
//				骨痛.setForeground(Color.WHITE);
//				骨痛.setBounds(10, 20, 100, 50);
//				JCheckBox 骨痛_box= new JCheckBox();
//				骨痛_box.setBounds(10+60, 33, 20, 20);
//				骨痛_box.addActionListener(new ActionListener(){
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						if(骨痛_box.isSelected()) {
//							if(!name.getText().contains("骨痛")) {
//								name.setText(name.getText()+" 骨痛");
//							}
//						}else {
//							if(name.getText().contains("骨痛")) {
//								name.setText(name.getText().replace("骨痛", ""));
//							}
//						}
//								}
//				});
//				this.add(骨痛);
//				this.add(骨痛_box);
//		}
//}