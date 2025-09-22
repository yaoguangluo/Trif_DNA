package ME.VPC.E.sleeper;

import ME.VPC.M.app.App;
import ME.VPC.S.buttons.Page_X_S_sButtons_zhong_yao_DNN;
import ME.VPC.S.ne.WindowsUI;
import ME.VPC.V.ET.FqzPage_X_S_sListeners;
import M_V.MVQ.button.DetaButton;
import O_V.OSI.AOP.neo.tts.ReadChinese;
import exception.thread.DetaThread;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;

//import OSV.VCQ.standard.DictionaryStandardDB;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE
//.procedure.pde.FullDNATokenPDI;
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
@SuppressWarnings("serial")
public class FqzPage extends FqzPage_X_S_sListeners {

	public FqzPage(JTextPane text, App NE) {
		initPage(text, NE);
		this.setLayout(null);
		this.setBounds(0, 0, WindowsUI.makeContainerWidth,
				WindowsUI.makeContainerHeight);
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		JScrollPane jsp_data = new JScrollPane(this.data(NE));
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());
		JScrollPane jsp = new JScrollPane(this.jTable(NE));
		JLabel jlabel = new JLabel("主要词汇 \\ 操作选项");
		PageUtil.initPageTail(jsp_statistic, jsp_data, jsp, jlabel);
		this.add(jsp);
		this.add(jlabel);
		this.add(jsp_data);
		this.add(jsp_statistic);
	}

	@SuppressWarnings("deprecation")
	public JTextPane data(App NE) {
		PageButtons._I(this, NE);
//        data = new JTextPane();
//        data.setBounds(850, 150, WindowsUI.basicWidth - 600, 800 - 70);
//        data.setBackground(new Color(210, 210, 210));
//        buttonSum = new DetaButton("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
//        buttonSum.setBounds(0, 0, 100, 30);
//        buttonCrt = new DetaButton("当前页面：" + (currentPage + 1));
//        buttonCrt.setBounds(120, 0, 150, 30);
////        buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(this
////                , 290, 0, 100, 30, 2000);
////        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
////                , 410, 0, 100, 30, 2000);
//        buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(this
//            , 2000);
//        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
//            , 2000);
//        buttonCTE = Page_X_S_sButtonsenglish.data_X_english(this
//                , 630, 0, 100, 30, 2000);
//        buttonFRS = Page_X_S_sButtonschinese.data_X_chinese(this
//                , 520, 0, 100, 30, 2000);
//        buttonETC = Page_X_S_sButtonssymnorine.data_X_symnorine(this
//                , 740, 0, 100, 30, 2000);
		DetaButton buttonKSLJ = Page_X_S_sButtons_zhong_yao_DNN
				.data_X_zhong_yao_DNN(this, 990, 0, 115, 30, 2000, 5000, NE);
		DetaButton buttonADD = new DetaButton("添加到编辑页");
		buttonADD.setBounds(868, 0, 115, 30);
		buttonADD.addActionListener(e -> {
			if (sets == null) {
				return;
			}
			if (text.getText().length() > 5000) {
				return;
			}
			StringBuilder page = new StringBuilder();
			List<String> setsForGet = sets.subList(currentPage * 2000,
					(currentPage + 1) * 2000 < sets.size()
							? (currentPage + 1) * 2000
							: sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			while (iterator.hasNext()) {
				String setOfi = iterator.next();
				page.append(setOfi);
			}
			if (!text.getText().isEmpty()) {
				text.setText(text.getText() + "\r\n\r\n" + page.toString());
			} else {
				text.setText(page.toString());
			}
			text.validate();
		});

		buttonCTV = new DetaButton("阅读关");
		readChinese = new ReadChinese(buttonCTV, app_S);
		buttonCTV.setBounds(740, 0, 100, 30);
		buttonCTV.addActionListener(e -> {
			if (buttonCTV.getText().equalsIgnoreCase("阅读开")) {
				readChinese.waitString = true;
				readChinese.waitWord = true;
				return;
			}
			if (readChinese.getState().toString()
					.equalsIgnoreCase("TERMINATED")) {
				readChinese.I_NullSap();
				readChinese = new ReadChinese(buttonCTV, app_S);
			}
			if (sets == null) {
				return;
			}
			if (readChinese.finish == 0) {
				if (!readChinese.isAlive()) {
					buttonCTV.setLabel("阅读开");
					buttonCTV.updateUI();

					DetaThread.sleepDeta(200);

					readChinese.I_PreReadList(sets, NE);
					if (readChinese.finish == 2) {
						readChinese.start();
					}
				}
			}
		});

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(buttonPrev);
		buttonBox.add(buttonNext);
		buttonBox.add(buttonSum);
		buttonBox.add(buttonCrt);
		buttonBox.add(buttonCTE);
		buttonBox.add(buttonFRS);
		buttonBox.add(buttonETC);
		buttonBox.add(buttonCTV);
		buttonBox.add(buttonADD);
		buttonBox.add(buttonKSLJ);
		// buttonBox.add(buttonZYSZ);
		buttonBox.setBounds(5 + 800 - 650, 290 + 100 - 80 + 200 - 260 + 120,
				1150, 20);
		this.add(buttonBox);
		return data;
	}

	public JTextPane statistic() {
		statistic = new JTextPane();
		statistic.setBackground(new Color(210, 210, 210));
		statistic.setBounds(850, 150, WindowsUI.basicWidth - 840, 800);
		return statistic;
	}
}

////我本来想用URLencoder转代码, 就不需要用@标识@了。以后改下。先用我大TIN god标识。
//buttonZYSZ= new DetaButton("导出中医生殖");
//buttonZYSZ.setBounds(740, 0, 100, 30);
//				buttonZYSZ.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						boolean mod= true;
//						for(int i= 0; i< table.getRowCount(); i++){
//							try {
//								DetaThread.sleepDeta(150);
//							} catch (InterruptedException e2) {
//					//								e2.printStackTrace();
//							}
//							String plsql= "setRoot:C:/DetaDB1;";
//							plsql+= "baseName:ZYY;"; 
//							plsql+= "tableName:zysz:insert;" +
//									"culumnValue:ID:"+ table.getValueAt(i, 0)
//									.toString()
//.replace(":", "@Tin@")+ ";"+
//									"culumnValue:打分:"+ table.getValueAt(i, 1)
//									.toString()
//.replace(":", "@Tin@")+ ";"+
//									"culumnValue:病名:"+ new FullDNATokenPDI()
//									.initonSect(table.getValueAt(i, 2).toString()
//.replace(":", "@Tin@"))+ ";"+
//									"culumnValue:用药:"+ new FullDNATokenPDI()
//									.initonSect(table.getValueAt(i, 3).toString()
//.replace(":", "@Tin@"))+ ";";
//							try {
//								OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.E_PLSQLImp.E_PLSQL(plsql, mod);
//							}catch(Exception e1) {
//								e1.printStackTrace();
//							}
//						}}
//				});