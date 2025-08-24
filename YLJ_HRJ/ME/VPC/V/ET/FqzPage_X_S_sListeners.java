package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.S.pillow.FqzPage_X_S_s;
import ME.VPC.V.dictionary.FqzDictionary;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ_SS;
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
//import OSV.VCQ.standard.DictionaryStandardDB;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class FqzPage_X_S_sListeners extends FqzPage_X_S_s
		implements MouseListener, KeyListener {

	public JTextField name() {
		name = new JTextField();
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}

	@SuppressWarnings({ "serial" })
	public javax.swing.JTable jTable(App app_NE) {
		NE = app_NE;
		FqzDictionary d = new FqzDictionary();
		dic_list = d.txtToListName();
		dic_map = d.listNameToMap(dic_list);// .listNameToMap(dic_list);
		tableData_old = new Object[dic_map.size()][4];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			tableData_old[i] = new Object[] { "" + (i + 1), "" + 0,
					copy.get(i).trim(), dic_map.getTrimString(copy.get(i)) };
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

	@Override
	public void mouseClicked(MouseEvent arg0) {
		simpleClicked(NE);
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
		IMV_SIQ_SS mapSearchWithoutSort = null;
		if (null == _A) {
			return; // trif
		}
		mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(key, NE);
		Iterator<String> iteratorForCopy = copy.iterator();
		int copyCount = 0;
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
			String temps = dic_map.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency = mapSearchWithoutSort
					.keySet().iterator();
			Here: while (iteratorWordFrequency.hasNext()) {
				String mapSearchaAtII = iteratorWordFrequency.next();
				WordFrequency wordFrequencySearch = mapSearchWithoutSort
						.getW(mapSearchaAtII);
				if (temps.contains(mapSearchaAtII)) {
					if (reg[copyCount] == 0) {
						count += 1;
					}
					score[copyCount] = iteratorForCopyString;
					if (!pos.containsKey(mapSearchaAtII)) {
						reg[copyCount] += 1;
						int wfs = (int) wordFrequencySearch.get_frequency();
						wfs = wfs > 5 ? 5 : wfs;
						score_code[copyCount] += 1 << mapSearchaAtII
								.length() << wfs;
						continue Here;
					}
					if (pos.getString(mapSearchaAtII).contains("名")
							|| pos.getString(mapSearchaAtII).contains("动")
							|| pos.getString(mapSearchaAtII).contains("形")
							|| pos.getString(mapSearchaAtII).contains("谓")) {
						reg[copyCount] += 2;
					}
					reg[copyCount] += 1;
					int wfs = (int) wordFrequencySearch.get_frequency();
					wfs = wfs > 5 ? 5 : wfs;
					score_code[copyCount] += (iteratorForCopyString
							.contains(mapSearchaAtII) ? 2 : 1)
							* (!pos.getString(mapSearchaAtII).contains("名")
									? pos.getString(mapSearchaAtII)
											.contains("动") ? 45 : 1
									: 50) << mapSearchaAtII.length() + wfs;
					continue Here;
				}
				if (mapSearchaAtII.length() > 1) {
					for (int j = 0; j < mapSearchaAtII.length(); j++) {
						char temp = mapSearchaAtII.charAt(j);
						if (temps.contains(String.valueOf(temp))) {
							if (reg[copyCount] == 0) {
								count += 1;
							}
							score[copyCount] = iteratorForCopyString;
							score_code[copyCount] += 1;
							if (pos.containsKeyChar(temp) && (pos
									.getString(temp).contains("名")// later..
									|| pos.getString(temp).contains("动")
									|| pos.getString(temp).contains("形")
									|| pos.getString(temp).contains("谓"))) {
								reg[copyCount] += 2;
							}
							reg[copyCount] += 1;
							continue Here;
						}
					}
				}
			}
			score_code[copyCount] = score_code[copyCount] * reg[copyCount];
			// 词距
			int code = 100;
			int tempb = 0;
			int tempa = score_code[copyCount];
			if (key.length() > 4) {
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
					&& key.replace(" ", "").length() < 5) {
				if (temps.contains(key)) {
					tempb += code << 7;
				}
				score_code[copyCount] = (int) (tempa
						/ Math.pow(this.app_S.lookrot + 1, 4)
						+ tempb * Math.pow(this.app_S.lookrot, 2));
			}
			copyCount++;
		}
		LABEL2: NE.app_S.lYGSortESU9D.javaSort(score_code, score);
		int max = score_code[0];
		Object[][] tableData = new Object[count][13];
		int new_count = 0;
		newTableModel.getDataVector().clear();
		if (null == key || key.equals("")) {
			for (int i = 0; i < tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}
			newTableModel.fireTableDataChanged();
			return;
		}
		Here: for (int i = copy.size() - 1; i > -1; i--) {
			if (score_code[i] < 1) {
				continue Here;
			}
			if (app_S.shuming_filter_box.isSelected()) {
				String wei = score[i];
				String temp = app_S.name_filter.getText();
				for (int j = 0; j < temp.length(); j++) {
					if (wei.contains("" + temp.charAt(j))) {
						continue Here;
					}
				}
			}
			tableData[new_count] = new Object[] { new_count + 1, score_code[i],
					score[i], dic_map.get(score[i]).toString(), };
			newTableModel.insertRow(new_count, tableData[new_count]);
			new_count += 1;
		}
		newTableModel.fireTableDataChanged();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}
////45		Dictionary d= new Dictionary();
////		dic_list= d.txtToListName();
////		dic_map= d.listNameToMap(dic_list);//.listNameToMap(dic_list);
//
//
////测试下刚写的标准读表函数.
//DictionaryStandardDB d= new DictionaryStandardDB();
//String primaryKey= "病名";
//String tabKey= "zysz";
////以后设计 uniq forenkey等.
//Map<String, IMV_SIQ> map= d.dbToMap(primaryKey, tabKey);
//IMV_SIQ dic_bing_ming= map.get("病名");
//IMV_SIQ dic_yongyao= map.get("用药");
//dic_map= map.get("dic_map");
//
////		DictionaryDB d= new DictionaryDB();
////		IMV_SIQ dic_bing_ming= new IMV_SIQ();
////		IMV_SIQ dic_yongyao= new IMV_SIQ();
////		dic_map= d.txtToMap(dic_bing_ming, dic_yongyao);
//
//tableData_old= new Object[dic_map.size()][4];
//Iterator<String> iter= dic_map.keySet().iterator();
//copy= new ArrayList<String>();
//while (iter.hasNext())
//	copy.add(iter.next());
//for(int i=0; i<copy.size(); i++) {
//	tableData_old[i]= new Object[]{""+(i+1)
//			, ""+0
//			, copy.get(i).trim()
//			, dic_yongyao.get(copy.get(i)) };
//	//, dic_map.get(copy.get(i)).toString()
//.replaceAll("\\s*", "")};
//}	
//table= new javax.swing.JTable();  

//if(key== null) {
//key= "";
//}
//sets= null;
//Map<String, WordFrequency> map= new IMV_SIQ();
//try {
//row= table.getSelectedRow();
//int col= table.getSelectedColumn();
//String value= (String) table.getValueAt(row, col);
//data.setSize(500, 800);
//sets= _A.parserMixedString(value);//词性分析		
//data.setContentType("text/html");
//StringBuilder page= new StringBuilder().append("");
//List<String> setsForGet= sets.subList(currentPage*2000
//		, (currentPage + 1)*2000< sets.size()
//		? (currentPage + 1)*2000: sets.size());
//
//PageWords.renderWordLoopPOS(pos, page, app_S, setsForGet, map, key, true);
//buttonSum.setText("共有 " + (sets== null ? 0 : (1 + sets.size() / 2001)) + " 页");
//buttonCrt.setText("当前页面：" + (sets== null? 0 : 1));
//data.setText(page.toString());
//data.setSelectionStart(0);
//data.setSelectionEnd(0);
//data.validate();
//}catch(Exception e){	
//data.validate();
//jTabbedpane.validate();
//}   
//try {
//statistic.setSize(500, 800);
////Map<Integer, WordFrequency> fwa= _A.sortWordFrequencyMapToSortMap(map);
//Map<Integer, WordFrequency> fwa= doFwaArrangement(_A,  map);
//
//statistic.setContentType("text/html");
//StringBuilder page= new StringBuilder();
//Here:
//	for (int i= fwa.size()-1; i >= 0; i--) {
//		if (fwa.get(i) != null) {
//			if(pos.get(fwa.get(i).get_word())== null) {
//				page.append("<div style=\"background:white\">"
//						+ "<font color=\"black\">" 
//						+ fwa.get(i).get_word()+""+fwa.get(i).get_frequency() 
//						+ "</font></div>");
//				continue Here;
//			}
//			if(pos.get(fwa.get(i).get_word()).contains("名")) {
//				page.append( "<div style=\"background:#FF44FF\">"
//						+ "<font color=\"white\">" 
//						+ fwa.get(i).get_word()+""+fwa.get(i).get_frequency() 
//						+"</font></div>");
//				continue Here;
//			}
//			if(pos.get(fwa.get(i).get_word()).contains("动")) {
//				page.append("<div style=\"background:#8CEA00\">"
//						+ "<font color=\"black\" size=\"5\">" 
//						+ fwa.get(i).get_word()+""+fwa.get(i).get_frequency() 
//						+"</font></div>");
//				continue Here;
//			}
//			if(pos.get(fwa.get(i).get_word()).contains("形")) {
//				page.append("<div style=\"background:#FF9224\">"
//						+ "<font color=\"black\" size=\"5\">" 
//						+ fwa.get(i).get_word()+""+fwa.get(i).get_frequency() 
//						+"</font></div>");
//			}
//		}
//	}	
//statistic.setText(page.toString());
//statistic.setSelectionStart(0);
//statistic.setSelectionEnd(0);
//statistic.validate();
//}catch(Exception e){	
//statistic.validate();
//jTabbedpane.invalidate();
//}  