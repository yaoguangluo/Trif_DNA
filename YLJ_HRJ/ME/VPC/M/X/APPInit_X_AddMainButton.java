package ME.VPC.M.X;

import ME.VPC.M.app.App;
import ME.VPC.M.app.AppSearch;
import M_V.MVQ.button.DetaButton;
import O_V.org.tinos.listen.ReadToWav;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class APPInit_X_AddMainButton {
    @SuppressWarnings({"deprecation"})
    public void IV_(App app, JPanel jPanel) {
        DetaButton jlabel_button = new DetaButton("搜:");
        jlabel_button.setBounds(2, 6, 56, 23);
        jlabel_button.setBackground(Color.PINK);
        jlabel_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (null == app.app_S.frame) {
                    app.app_S.appSearch = new AppSearch();
                    app.app_S.appSearch.IV_(app.app_S.name
                        , app.app_S.nameFeelFilter
                        , app.app_S.name_filter_not_have);
                    app.app_S.appSearch.setBounds(0, 0, 785, 655);
                    app.app_S.appSearch.setVisible(true);
                    app.app_S.appSearch.show();
                    app.app_S.frame = new JFrame("电子护理站 搜索词汇 V1.2.2");
                    //frame.setLayout(null);
                    app.app_S.frame.setSize(780, 650);
                    app.app_S.frame.setLocation(300, 300);
                    app.app_S.frame.setResizable(false);
                    app.app_S.frame.add(app.app_S.appSearch);
                    app.app_S.frame.setVisible(true);
                    app.app_S.frame.show();
                    app.app_S.frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                } else {
                    app.app_S.frame.setVisible(true);
                    app.app_S.frame.show();
                }
            }
        });
        DetaButton yin_button = new DetaButton("音:");
        yin_button.setBounds(2, 33, 56, 23);
        yin_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                app.app_S.name.setText(new ReadToWav().listen());
            }
        });
        //	jPanel.add(addChuFang);
        //	jPanel.add(jbutton_detao_zai_xian);
        //jPanel.add(button_卫健委);
        jPanel.add(jlabel_button);
        jPanel.add(yin_button);
    }
}

//JButton button_卫健委= new CfxButton("卫健委", 100, 50, Color.orange);
//button_卫健委.setBounds(10+ 70+ 760+ 130+ 130+ 130+ 130- 100- 50, 6, 100, 50);
//button_卫健委.addActionListener(new ActionListener() {
//	public void actionPerformed(ActionEvent e) {
//		try {
//			String link= "http://www.nhc.gov.cn";
//			Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+ link);
//		} catch (IOException e1) {	
//			app.app_S.jTabbedpane.validate();
//		}
//	}
//});	

//JButton addChuFang= new CfxButton("电子医院", 100, 50, Color.pink);
////addChuFang.setBounds(50+50+760+130+130-100-50, 6, 100, 50);
//addChuFang.setBounds(30+60+760+130+130+130-100-50+25, 6, 100, 50);
//addChuFang.addActionListener(new ActionListener() {
//	public void actionPerformed(ActionEvent e) {
//		//
//		String preAdd= "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, "
//				+ "来做证候分析。谢谢!";
//		preAdd+= "\r\n\r\n *************************\r\n\r\n";
//		preAdd+= "大综合证候分析：";
//		preAdd+= "\r\n\r\n *************************\r\n\r\n";
//		//中医诊断：
//		preAdd+= "中医诊断：\r\n\r\n";
//		for(int i=0;i<5;i++) {
//			preAdd+= "证候名："+ (null==app.app_S.zyzdxPage.table.getValueAt(i, 2)
//					?"":app.app_S.zyzdxPage.table.getValueAt(i, 2).toString())
//					//	+ "证候内容："+	(null==zyzdx.table.getValueAt(i, 5)
//					//?"":zyzdx.table.getValueAt(i, 5).toString())
//					+ "可能性："+	(null==app.app_S.zyzdxPage.table.getValueAt(i, 1)
//					?"":app.app_S.zyzdxPage.table.getValueAt(i, 1).toString());
//			preAdd+= "\r\n\r\n";
//		}
//		preAdd+= "内科诊断：\r\n\r\n";
//		//内科分析：
//		for(int i=0;i<5;i++) {
//			preAdd+= "证候名："+ (null==app.app_S.xynkPage.table.getValueAt(i, 2)
//					?"":app.app_S.xynkPage.table.getValueAt(i, 2).toString())
//					//	+ "证候意义："+	(null==xynkPage.table.getValueAt(i, 9)
//					//?"":xynkPage.table.getValueAt(i, 9).toString())
//					+ "可能性："+	(null==app.app_S.xynkPage.table.getValueAt(i, 1)
//					?"":app.app_S.xynkPage.table.getValueAt(i, 1).toString());
//			preAdd+= "\r\n\r\n";
//		}
//		preAdd+= "西医诊断：\r\n\r\n";
//		//西医急诊：
//		for(int i=0;i<5;i++) {
//			preAdd+= "证候名："+ (null==app.app_S.jzkxPage.table.getValueAt(i, 2)
//					?"":app.app_S.jzkxPage.table.getValueAt(i, 2).toString())
//					+ "可能性："+	(null==app.app_S.jzkxPage.table.getValueAt(i, 1)
//					?"":app.app_S.jzkxPage.table.getValueAt(i, 1).toString());
//			preAdd+= "\r\n\r\n";
//		}
//		preAdd+= "外科诊断：\r\n\r\n";
//		//外科分析：
//		for(int i=0;i<5;i++) {
//			preAdd+= "证候内容："+ (null==app.app_S.wkxPage.table.getValueAt(i, 2)
//					?"":app.app_S.wkxPage.table.getValueAt(i, 2).toString())
//					+ "可能性："+	(null==app.app_S.wkxPage.table.getValueAt(i, 1)
//					?"":app.app_S.wkxPage.table.getValueAt(i, 1).toString());
//			preAdd+= "\r\n\r\n";
//		}
//		preAdd+= "\r\n\r\n *************************\r\n\r\n";
//		preAdd+= "小专科系统组合诊断（可选）：";
//		preAdd+= "\r\n\r\n *************************\r\n\r\n";
//		preAdd+= "妇幼诊断：\r\n\r\n";
//		//妇幼分析：
//		for(int i=0;i<5;i++) {
//			preAdd+= "证候内容："+ (null==app.app_S.fckxPage.table.getValueAt(i, 2)
//					?"":app.app_S.fckxPage.table.getValueAt(i, 2).toString())
//					+ "可能性："+	(null==app.app_S.fckxPage.table.getValueAt(i, 1)
//					?"":app.app_S.fckxPage.table.getValueAt(i, 1).toString());
//			preAdd+= "\r\n\r\n";
//		}
//
//		preAdd+= "伤科：\r\n\r\n";
//		//伤科分析：
//		for(int i=0;i<5;i++) {
//			preAdd+= "证候内容："+ (null==app.app_S.wskxPage.table.getValueAt(i, 2)
//					?"":app.app_S.wskxPage.table.getValueAt(i, 2).toString())
//					+ "可能性："+	(null==app.app_S.wskxPage.table.getValueAt(i, 1)
//					?"":app.app_S.wskxPage.table.getValueAt(i, 1).toString());
//			preAdd+= "\r\n\r\n";
//		}
//
//		String xiYaoTuiJian="";
//		xiYaoTuiJian+= "*************************\r\n\r\n";
//		xiYaoTuiJian+= "中西医结合用药打分排序（可选）：";
//		xiYaoTuiJian+= "\r\n\r\n *************************\r\n\r\n";
//		xiYaoTuiJian+= "西药推荐：\r\n\r\n";
//		//分析：
//		for(int i=0;i<20;i++) {
//			xiYaoTuiJian+= "推荐名："+ (null==app.app_S.xyscPage.table.getValueAt(i, 2)
//					?"":app.app_S.xyscPage.table.getValueAt(i, 2).toString())
//					+ "适应内容："+	(null==app.app_S.xyscPage.table.getValueAt(i, 8)
//					?"":app.app_S.xyscPage.table.getValueAt(i, 8).toString())
//					+ "可能性："+	(null==app.app_S.xyscPage.table.getValueAt(i, 1)
//					?"":app.app_S.xyscPage.table.getValueAt(i, 1).toString());
//			xiYaoTuiJian+= "\r\n\r\n";
//		}
//		preAdd+= xiYaoTuiJian;
//		preAdd+= "方剂推荐：\r\n\r\n";
//		//方剂分析：
//		for(int i=0;i<5;i++) {
//			preAdd+= "推荐名："+ (null==app.app_S.zynkxPage.table.getValueAt(i, 2)
//					?"":app.app_S.zynkxPage.table.getValueAt(i, 2).toString())
//					+ "推荐内容："+(null==app.app_S.zynkxPage.table.getValueAt(i, 4)
//					?"":app.app_S.zynkxPage.table.getValueAt(i, 4).toString())
//					+ "可能性："+	(null==app.app_S.zynkxPage.table.getValueAt(i, 1)
//					?"":app.app_S.zynkxPage.table.getValueAt(i, 1).toString());
//			preAdd+= "\r\n\r\n";
//		}
//		preAdd+= "\r\n\r\n";
//
//		String zhongYaoTuiJian="";
//		//
//		zhongYaoTuiJian+= "*************************";
//		zhongYaoTuiJian+= "\r\n\r\n";
//		zhongYaoTuiJian+= "仅作中药推荐, 不做处方权分析, 请拥有处方权职业药师慎重分析药理"
//				+ "根据病情搭配修改。谢谢!";
//		zhongYaoTuiJian+= "\r\n\r\n *************************";
//		zhongYaoTuiJian+= "\r\n\r\n";
//		for(int r= 0; r< (app.app_S.newTableModel.getRowCount()< 30
//				? app.app_S.newTableModel.getRowCount(): 30); r++) {
//			if(app.app_S.newTableModel.getValueAt(r, 2)!= null
//					&& !app.app_S.newTableModel.getValueAt(r, 2)
//					.toString().isEmpty()) {
//				zhongYaoTuiJian+= app.app_S.newTableModel.getValueAt(r, 2);
//			}
//			zhongYaoTuiJian+= "/";
//			if(app.app_S.newTableModel.getValueAt(r, 6)!= null
//					&&!app.app_S.newTableModel.getValueAt(r, 6)
//					.toString().isEmpty()) {
//				String temp= app.app_S.newTableModel.getValueAt(r, 6).toString();
//				String value= "";
//				for(int i= 0; i < temp.length(); i++){
//					if(temp.charAt(i)<128 || temp.charAt(i)=='~') {
//						value+=temp.charAt(i);
//					}else {
//						value+=" ";
//					}
//				}
//				String[] temps= value.replaceAll("\\s+", " ").split(" ");
//				if(temps.length>0 && temps[0].split("~").length > 1) {
//					//value= temps[0].split("~")[1];
//					value= temps[0].split("~")[0].charAt(
//							temps[0].split("~")[0].length()-1)+"~";
//					value+= temps[0].split("~")[1].replaceAll("g+", "");
//					value+= "g;";
//				}else {
//					value= "请酌情添加;";
//				}
//				zhongYaoTuiJian+= value;
//			}else {
//				zhongYaoTuiJian+= "请酌情添加;";
//			}
//			if(r%2!=0) {
//				zhongYaoTuiJian+= "\r\n\r\n";
//			}else {
//				zhongYaoTuiJian+= "\r\n\r\n";
//			}
//		}
//		preAdd+= zhongYaoTuiJian;
//		if(app.app_S.text.getText().length()< 8000) {
//			if(preAdd.length()< 8000) {
//				if(!app.app_S.text.getText().isEmpty()) {
//					app.app_S.text.setText(preAdd+ "\r\n\r\n"
//				+ app.app_S.text.getText());
//				}else {
//					app.app_S.text.setText(preAdd);
//				}
//			}
//		}else {
//			app.app_S.text.setText(preAdd);
//		}
//		app.app_S.text.validate();
//
//		if(app.app_S.jText.getText().length()< 8000) {
//			if(zhongYaoTuiJian.length()< 8000) {
//				if(!app.app_S.jText.getText().isEmpty()) {
//					app.app_S.jText.setText(zhongYaoTuiJian+ "\r\n\r\n"
//				+ app.app_S.jText.getText());
//				}else {
//					app.app_S.jText.setText(zhongYaoTuiJian);
//				}
//			}
//		}else {
//			app.app_S.jText.setText(zhongYaoTuiJian);
//		}
//		app.app_S.jText.validate();
//
//		if(app.app_S.jxText.getText().length()< 8000) {
//			if(xiYaoTuiJian.length()< 8000) {
//				if(!app.app_S.jxText.getText().isEmpty()) {
//					app.app_S.jxText.setText(xiYaoTuiJian
//							+ "\r\n\r\n"+ app.app_S.jxText.getText());
//				}else {
//					app.app_S.jxText.setText(xiYaoTuiJian);
//				}
//			}
//		}else {
//			app.app_S.jxText.setText(xiYaoTuiJian);
//		}
//		app.app_S.jxText.validate();
//
//		try {
//			if(null== app.app_S.frameHospital) {
//				app.app_S.appHospital= new AppHospital();
//				app.app_S.appHospital.IV_(app.app_S.jText
//						, app.app_S.appInstance);
//				app.app_S.appHospital.setBounds(0, 0, 1145, 455);
//				app.app_S.appHospital.setVisible(true);
//				app.app_S.appHospital.show();
//				app.app_S.frameHospital= new JFrame("电子医院诊断推荐报告 V0.0.3");
//				//frame.setLayout(null);
//				app.app_S.frameHospital.setSize(1140, 650);
//				app.app_S.frameHospital.setLocation(300, 300);
//				app.app_S.frameHospital.setResizable(false);
//				app.app_S.frameHospital.add(app.app_S.appHospital);
//				app.app_S.frameHospital.setVisible(true);
//				app.app_S.frameHospital.show();
//				app.app_S.frameHospital.setDefaultCloseOperation(
//						JFrame.HIDE_ON_CLOSE);	
//			}else {			//				app.app_S.appHospital= new AppHospital();
//				app.app_S.appHospital.IV_(app.app_S.jText
//						, app.app_S.appInstance);
//				app.app_S.appHospital.setBounds(0, 0, 1145, 455);
//				app.app_S.appHospital.setVisible(true);
//				app.app_S.appHospital.show();
//				app.app_S.frameHospital= new JFrame("电子医院诊断推荐报告 V0.0.3");
//				//frame.setLayout(null);
//				app.app_S.frameHospital.setSize(1140, 650);
//				app.app_S.frameHospital.setLocation(300, 300);
//				app.app_S.frameHospital.setResizable(false);
//				app.app_S.frameHospital.add(app.app_S.appHospital);
//				app.app_S.frameHospital.setVisible(true);
//				app.app_S.frameHospital.show();
//				app.app_S.frameHospital.setDefaultCloseOperation(
//						JFrame.HIDE_ON_CLOSE);	
//			}
//		}catch(Exception exceptione) {
//			exceptione.printStackTrace();
//		}
//		app.app_S.jText.validate();
//	}
//});