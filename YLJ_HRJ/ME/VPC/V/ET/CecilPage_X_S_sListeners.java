package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.S.pillow.CecilPage_X_S_s;
import ME.VPC.V.dictionary.CecilDictionary;
import P.image.Color_P;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;
import U_V.ESU.list.List_ESU_X_listToArray;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import OCI.ME.analysis.C.A;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("serial")
public class CecilPage_X_S_sListeners extends CecilPage_X_S_s
		implements MouseListener, KeyListener {
	//
	public JTextField name() {
		name = new JTextField();
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}

	@SuppressWarnings({ "unchecked" })
	public javax.swing.JTable jTable(App app_NE) {
		NE = app_NE;
		CecilDictionary d = new CecilDictionary();
		dic_list = d.txtToListName();
		dic_map = d.listNameToMap(dic_list);// .listNameToMap(dic_list);
		tableData_old = new Object[dic_map.size()][4];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext()) {
			copy.add(iter.next());
		}
		for (int i = 0; i < copy.size(); i++) {
			tableData_old[i] = new Object[] { "" + (i + 1), "" + 0,
					copy.get(i).trim(), dic_map.get(copy.get(i)).toString()
							.replaceAll("\\s+", " ") };
		}
		table = new javax.swing.JTable();
		newTableModel = new DefaultTableModel(tableData_old, columnTitle) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		tableSections(NE);
		table.getColumnModel().getColumn(0).setPreferredWidth(80 + 30);
		table.getColumnModel().getColumn(1).setPreferredWidth(80 + 30);
		table.getColumnModel().getColumn(2).setPreferredWidth(80 + 130);
		table.getColumnModel().getColumn(3).setPreferredWidth(80 + 930);
		table.addMouseListener(this);
		return table;
	}

	@SuppressWarnings("unused")
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (key == null) {
			key = "";
		}
		sets = null;
		IMV_SIQ_SS map = new IMV_SIQ_SS();
		int row = table.getSelectedRow();
		int col = table.getSelectedColumn();
		String value = (String) table.getValueAt(row, col);
		data.setSize(500, 800);
		if (null == _A) {
			return; // trif
		}
		sets = _A.parserMixedString(value);// 词性分析
		data.setContentType("text/html");
		StringBuilder page = new StringBuilder().append("");
		currentPage = 0;
		List<String> setsForGet = sets.subList(currentPage * 2000,
				(currentPage + 1) * 2000 < sets.size()
						? (currentPage + 1) * 2000
						: sets.size());
		Iterator<String> iterator = setsForGet.iterator();
		NE.app_S.listCharPosition = 0;// xian dan hou duo... later
		Here: while (iterator.hasNext()) {
			NE.app_S.listCharPosition++;
			String setOfi = iterator.next();
			String pecsi = "";
			String pfullecsi = posFullec.getString(setOfi);
			if (pfullecsi == null) {
				page.append("<span style=\"background:#ffffff\">"
						+ "<font color=\"black\" size=\"5\">" + setOfi
						+ "</font></span>");
				continue;
			}
			if (pos.containsKey(pfullecsi)) {
				pecsi = pos.getString(pfullecsi);
			}
			if (pecsi.contains("名") || pecsi.contains("动")
					|| pecsi.contains("形")) {
				if (map.containsKey(setOfi)) {
					WordFrequency wordFrequency = map.getW(setOfi);
					wordFrequency.I_frequency(
							wordFrequency.get_frequency() + S_Pos.INT_ONE);
					wordFrequency.positions.add(NE.app_S.listCharPosition);
					map.put(setOfi, wordFrequency);
				} else {
					WordFrequency wordFrequency = new WordFrequency(1.0,
							setOfi);
					wordFrequency.positions.add(NE.app_S.listCharPosition);
					map.put(setOfi, wordFrequency);
				}
			}
			if (!setOfi.equals("")) {
				if (key.contains(setOfi) && (setOfi.length() > 2)
						&& (pecsi.contains("名") || pecsi.contains("动")
								|| pecsi.contains("形"))) {
					page.append("<span style=\"background:red\">"
							+ "<font color=\"white\">" + setOfi
							+ "</font></span>");
					continue;
				}
				if (pecsi.contains("名")) {
					page.append("<span style=\"background:"
							+ Color_P.P(255, 245, 255)
							+ "\"><font color=\"black\" size=\"5\">" + setOfi
							+ "</font></span>");
					continue;
				}
				if (pecsi.contains("动")) {
					page.append("<span style=\"background:"
							+ Color_P.P(245, 255, 245)
							+ "\"><font color=\"black\" size=\"5\">" + setOfi
							+ "</font></span>");
					continue;
				}
				if (pecsi.contains("形")) {
					page.append("<span style=\"background:"
							+ Color_P.P(255, 255, 245)
							+ "\"><font color=\"black\" size=\"5\">" + setOfi
							+ "</font></span>");
					continue;
				}
				if (pecsi.contains("副")) {
					page.append("<span style=\"background:#000000\">"
							+ "<font color=\"white\" size=\"5\">" + setOfi
							+ "</font></span>");
					continue;
				}
				page.append("<span style=\"background:white\">"
						+ "<font color=\"black\" size=\"5\">" + setOfi
						+ "</font></span>");
			}
		}
		buttonSum.setText(
				"共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
		buttonCrt.setText("当前页面：" + (sets == null ? 0 : 1));
		data.setText(page.toString());
		data.setSelectionStart(0);
		data.setSelectionEnd(0);
		data.validate();
		//
		statistic.setSize(500, 800);
		IMV_SIQ_S_ fwa = doFwaArrangement(map, NE);
		statistic.setContentType("text/html");
		page.delete(0, page.length());
		Here: for (int i = fwa.size() - 1; i >= 0; i--) {
			if (fwa.get(i) != null) {
				String pecsi = "";
				String pfullecsi = posFullec
						.getString(fwa.getW(i).get_word().toLowerCase());
				if (pfullecsi == null) {
					page.append("<div style=\"background:black\">"
							+ "<font color=\"white\">" + fwa.getW(i).get_word()
							+ "" + fwa.getW(i).get_frequency()
							+ "</font></div>");
					continue;
				}
				if (pos.containsKey(pfullecsi)) {
					pecsi = pos.getString(pfullecsi);
				}
				if (pecsi.contains("名")) {
					page.append("<div style=\"background:#FF44FF\">"
							+ "<font color=\"white\">" + fwa.getW(i).get_word()
							+ "" + fwa.getW(i).get_frequency()
							+ "</font></div>");
					continue;
				}
				if (pecsi.contains("动")) {
					page.append("<div style=\"background:#8CEA00\">"
							+ "<font color=\"black\" size=\"5\">"
							+ fwa.getW(i).get_word() + ""
							+ fwa.getW(i).get_frequency() + "</font></div>");
					continue;
				}
				if (pecsi.contains("形")) {
					page.append("<div style=\"background:#FF9224\">"
							+ "<font color=\"black\" size=\"5\">"
							+ fwa.getW(i).get_word() + ""
							+ fwa.getW(i).get_frequency() + "</font></div>");
				}
			}
		}
		statistic.setText(page.toString());
		statistic.setSelectionStart(0);
		statistic.setSelectionEnd(0);
		statistic.validate();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@SuppressWarnings("unused")
	@Override
	public void keyReleased(KeyEvent arg0) {
		String[] score = new String[copy.size()];
		int[] score_code = new int[copy.size()];
		int[] reg = new int[copy.size()];
		int count = 0;
		Iterator<String> iteratorForCopy = copy.iterator();
		int copyCount = 0;
		this.key = "";
		if (null == verbals) {
			return; // trif
		}
		Iterator<Verbal> iteratorWordFrequency = verbals.iterator();
		while (iteratorWordFrequency.hasNext()) {
			Verbal iteratorWordFrequencyVerbal = iteratorWordFrequency.next();
			String mapSearchaAtII = iteratorWordFrequencyVerbal
					.getEnglish() == null ? " "
							: iteratorWordFrequencyVerbal.getEnglish()
									.replaceAll("\\s+", " ");
			this.key += mapSearchaAtII;
		}
		List<String> list = _A.parserMixedString(key);
		String[] string = List_ESU_X_listToArray._E(list);

		String[] stringReg = new String[key.length() / 3];
		for (int i = 0; i < stringReg.length; i++) {
			stringReg[i] = key.substring(i * 3,
					(i * 3 + 3) < key.length() ? (i * 3 + 3)
							: key.length() - 1);
		}
		while (iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			// 得到数据
			String temps = dic_map.get(iteratorForCopyString).toString();
			iteratorWordFrequency = verbals.iterator();
			// 遍历搜索字
			Here: while (iteratorWordFrequency.hasNext()) {
				Verbal iteratorWordFrequencyVerbal = iteratorWordFrequency
						.next();
				String mapSearchaAtII = iteratorWordFrequencyVerbal
						.getEnglish() == null ? " "
								: iteratorWordFrequencyVerbal.getEnglish()
										.replaceAll("\\s+", " ");
				// 如果有数据
				if (temps.contains(mapSearchaAtII)
						&& mapSearchaAtII.length() > 2) {
					if (reg[copyCount] == 0) {
						count += 1;
					}
					// 加入关键表行
					score[copyCount] = iteratorForCopyString;
					String pecsi = "";
					if (iteratorForCopyString.toLowerCase()
							.contains(mapSearchaAtII)) {
						score_code[copyCount] += 10000;
					}
					// 获取中文
					String pfullecsi = posFullec.getString(mapSearchaAtII);
					if (pfullecsi == null) {
						reg[copyCount] += 1;
						score_code[copyCount] += 1;
						continue;
					}
					// 识别词性
					if (!pos.containsKey(pfullecsi)) {
						reg[copyCount] += 1;
						score_code[copyCount] += 1;
						continue;
					}
					pecsi = pos.getString(pfullecsi);
					if (pecsi.contains("名") || pecsi.contains("动")
							|| pecsi.contains("形") || pecsi.contains("谓")) {
						reg[copyCount] += 5;
					}
					reg[copyCount] += 1;
					score_code[copyCount] += (iteratorForCopyString
							.contains(mapSearchaAtII) ? 2 : 1)
							* (!pecsi.contains("名")
									? pecsi.contains("动") ? 10 : 1
									: 50);
				}
			}
			score_code[copyCount] = score_code[copyCount] * reg[copyCount];

			// 词距
			int code = 100;
			int tempb = 0;
			int tempa = score_code[copyCount];
			if (key.length() > 24) {
				// 全词
				for (int i = 0; i < string.length; i++) {
					if (temps.contains(string[i])) {
						tempb += code;
					}
				}
				// 断句
				for (int i = 0; i < stringReg.length; i++) {
					if (temps.contains(stringReg[i])) {
						tempb += code;
					}
				}
				score_code[copyCount] = (int) (tempa
						/ Math.pow(this.app_S.lookrot + 1, 4)
						+ tempb * Math.pow(this.app_S.lookrot, 2));
			}
			if (key.replace(" ", "").length() > 1
					&& key.replace(" ", "").length() < 25) {
				if (temps.contains(key)) {
					tempb += code << 7;
				}
				score_code[copyCount] = (int) (tempa
						/ Math.pow(this.app_S.lookrot + 1, 4)
						+ tempb * Math.pow(this.app_S.lookrot, 2));
			}
			copyCount++;
		}
		NE.app_S.lYGSortESU9D.javaSort(score_code, score);
		int new_count = 0;
		newTableModel.getDataVector().clear();
		if (count < 1) {
			for (int i = 0; i < tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}
			newTableModel.fireTableDataChanged();
			return;
		}
		int register = 0;
		for (int i = copy.size() - 1; i > -1; i--) {
			if (score_code[i] > 1) {
				register++;
			}
		}
		Object[][] tableData = new Object[register][13];
		Here: for (int i = copy.size() - 1; i > -1; i--) {
			if (score_code[i] <= 1) {
				continue;
			}
			try {
				tableData[new_count] = new Object[] { new_count + 1,
						score_code[i], score[i],
						dic_map.get(score[i]).toString(), };
			} catch (Exception e) {
				NE.app_S.appConfig.SectionJPanel.jTextPane.setText("323");
			}
			newTableModel.insertRow(new_count, tableData[new_count]);
			new_count += 1;
		}
		newTableModel.fireTableDataChanged();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}
}

//148//                    WordFrequency wordFrequency = new WordFrequency();
////                    wordFrequency.I_frequency(1.0);
////                    wordFrequency.I_Word(setOfi);

//77
//	@SuppressWarnings({"serial"})
//	public javax.swing.JTable jTable2D()  {  	
//		//稍后缩进
//		CommonXlsPage_X_S_s commonXlsPage_X_S_s= new CommonXlsPage_X_S_s();
//		DB db= new DB();
//		ConcurrentHashMap<String, Base> bases= new IMV_SIQ();
//		db.I_Bases(bases);
//		boolean hasSpec= true;
//		//read
//		String resourceAsStream= "cecilPage.xlsx";
//		Object[][] output= XlsxToYLJBufferPage.readNonObjectXlsxWithStream(commonXlsPage_X_S_s
//				, db, resourceAsStream, 6, hasSpec);
//		tableData_old= output;
//		table= new javax.swing.JTable();  
//		newTableModel= new DefaultTableModel(tableData_old, commonXlsPage_X_S_s.columnTitle){
//			@Override  
//			public boolean isCellEditable(int row, int column){
//				return false;  
//			}  
//		};  
//		tableSections();
//		table.getColumnModel().getColumn(0).setPreferredWidth(80+30);
//		table.getColumnModel().getColumn(1).setPreferredWidth(80+30);
//		table.getColumnModel().getColumn(2).setPreferredWidth(80+130);
//		table.getColumnModel().getColumn(3).setPreferredWidth(80+930);
//		table.addMouseListener(this);
//		return table;
//	}