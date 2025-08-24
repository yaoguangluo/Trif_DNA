package ME.VPC.E.sleeper;

import ME.VPC.M.app.App;
import ME.VPC.S.buttons.Page_X_S_sButtonsreading;
import ME.VPC.S.ne.WindowsUI;
import ME.VPC.V.ET.XyscPage_X_S_sListeners;
import ME.VPC.V.appButton.AppButtonUtil_X_DNN_Classify;
import ME.VPC.V.appButton.AppButtonUtil_X_DNN_Page;
import M_V.MVQ.button.DetaButton;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import java.awt.Color;
import java.util.List;

//import OSV.VCQ.standard.DictionaryStandardDB;
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
public class XyscPage extends XyscPage_X_S_sListeners {

	public XyscPage(JTextPane text, App NE) {
		initPage(text, NE);
		if (null == NE.app_S) {
			return;// fatar trif
		}
		this.emotionSample = NE.app_S.emotionSample;
		this.ratioMap_E = NE.app_S.ratioMap_E;
		this.sensingTest = NE.app_S.sensingTest;
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

	public JTextPane data(App NE) {
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
		PageButtons._I(this, NE);
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
			for (String setOfi : setsForGet) {
				page.append(setOfi);
			}
			if (!text.getText().isEmpty()) {
				text.setText(text.getText() + "\r\n\r\n" + page.toString());
			} else {
				text.setText(page.toString());
			}
			text.validate();
		});
		DetaButton buttonKSLJ = new DetaButton("中药DNN");
		buttonKSLJ.setBounds(990, 0, 115, 30);
		buttonKSLJ.addActionListener(e -> {
			if (null == sets) {
				return;
			}
			if (text.getText().length() > 5000) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil_X_DNN_Page.pageDNN(page, sets, currentPage, app_S,
					table, row, key, buttonSum, buttonCrt, data, statistic,
					"中药", NE);
		});
		DetaButton buttonKSLJB = new DetaButton("西药DNN");
		buttonKSLJB.setBounds(990 + 115 + 7, 0, 115, 30);
		buttonKSLJB.addActionListener(e -> {
			if (null == sets) {
				return;
			}
			if (text.getText().length() > 5000) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil_X_DNN_Page.pageDNN(page, sets, currentPage, app_S,
					table, row, key, buttonSum, buttonCrt, data, statistic,
					"西药", NE);
		});
		//
		// dnn游标
		JSlider sliderDNN = new JSlider(0, 25);
		sliderDNN.setSnapToTicks(true);
		sliderDNN.setPaintTicks(true);
		sliderDNN.setMajorTickSpacing(5);
		sliderDNN.setMinorTickSpacing(1);
		sliderDNN.addChangeListener(event -> {
			JSlider source = (JSlider) event.getSource();
			app_S.jsliderDNNRatio = (double) source.getValue();
			if (null == sets) {
				return;
			}
			if (text.getText().length() > 5000) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil_X_DNN_Classify.classifyDNN(page, sets, currentPage,
					table, row, key, buttonSum, buttonCrt, data, statistic,
					"西药", NE);
		});
		DetaButton buttonBCJ = new DetaButton("导出新篇西药全集");
		// buttonETC.setBounds(200 - 15, 0, 88, 30);
		buttonBCJ.addActionListener(e -> {
			// 一行一行的插入
			boolean mod = true;
			for (int i = 0; i < table.getRowCount(); i++) {
				String plsql = "setRoot:C:/DetaDB;";
				plsql += "baseName:ZYY;";
				plsql += "tableName:xybg:insert;" + "culumnValue:ID:" + table
						.getValueAt(i, 0).toString().replace(":", "@Tin@") + ";"
						+ "culumnValue:打分:"
						+ table.getValueAt(i, 1).toString()
								.replace(":", "@Tin@")
						+ ";" + "culumnValue:西药名:" + table.getValueAt(i, 2)
								.toString().replace(":", "@Tin@")
						+ ";" + "culumnValue:介绍:" + table.getValueAt(i, 3)
								.toString().replace(":", "@Tin@")
						+ ";" + "culumnValue:药理:"
						+ table.getValueAt(i, 4).toString()
								.replace(":", "@Tin@")
						+ ";" + "culumnValue:主要成分:" + table.getValueAt(i, 5)
								.toString().replace(":", "@Tin@")
						+ ";" + "culumnValue:用法:"
						+ table.getValueAt(i, 6).toString()
								.replace(":", "@Tin@")
						+ ";" + "culumnValue:注意事项:"
						+ table.getValueAt(i, 7).toString()
								.replace(":", "@Tin@")
						+ ";" + "culumnValue:适应症:"
						+ table.getValueAt(i, 8).toString()
								.replace(":", "@Tin@")
						+ ";" + "culumnValue:不良反应:" + table.getValueAt(i, 9)
								.toString().replace(":", "@Tin@")
						+ ";" + "culumnValue:用量:"
						+ table.getValueAt(i, 10).toString()
								.replace(":", "@Tin@")
						+ ";" + "culumnValue:药物相互作用:"
						+ table.getValueAt(i, 11).toString().replace(":",
								"@Tin@")
						+ ";" + "culumnValue:其他:" + table.getValueAt(i, 12)
								.toString().replace(":", "@Tin@")
						+ ";";
				try {
					M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, mod);
				} catch (Exception e1) {
					jTabbedpane.validate();
					data.validate();
				}
			}
		});
		buttonCTV = Page_X_S_sButtonsreading.data_X_reading(this, app_S, NE);
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
		buttonBox.add(buttonKSLJB);
		buttonBox.add(sliderDNN);
		buttonBox.setBounds(5 + 800 - 650, 290 + 100 - 80 + 200 - 260 + 120,
				950 + 220, 20);
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