//YLJ_HRJ/ME/APM/VSQ/fuchankexue/FckxPage.java
package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.M.X.AppSearch_X_DetaSearch;
import ME.VPC.S.pillow.FckxPage_X_S_s;
import ME.VPC.V.dictionary.FckxDictionary;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

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
public class FckxPage_X_S_sListeners extends FckxPage_X_S_s
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
		FckxDictionary d = new FckxDictionary();
		dic_list = d.txtToList();
		dic_map = d.listToMap(dic_list);
		dic_gn = d.mapToMap_gn(dic_map);
		dic_lx = d.mapToMap_lx(dic_map);
		dic_by = d.mapToMap_by(dic_map);
		dic_wx = d.mapToMap_wx(dic_map);
		dic_bl = d.mapToMap_bl(dic_map);
		dic_lc = d.mapToMap_lc(dic_map);
		dic_sy = d.mapToMap_sy(dic_map);
		dic_zd = d.mapToMap_zd(dic_map);
		dic_bf = d.mapToMap_bf(dic_map);
		dic_zl = d.mapToMap_zl(dic_map);
		dic_jy = d.mapToMap_jy(dic_map);
		dic_yh = d.mapToMap_yh(dic_map);
		dic_yf = d.mapToMap_yf(dic_map);
		dic_yx = d.mapToMap_yx(dic_map);
		tableData_old = new Object[dic_map.size()][18];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			tableData_old[i] = new Object[] { "" + (i + 1), "" + 0,
					copy.get(i).replaceAll("〔+", "〔").trim(),
					dic_map.getTrimString(copy.get(i)).replaceAll("〔+", "〔"),
					dic_zl.getTrimString(copy.get(i)),
					dic_lc.getTrimString(copy.get(i)),
					dic_by.getTrimString(copy.get(i)),
					dic_zd.getTrimString(copy.get(i)),
					dic_gn.getTrimString(copy.get(i)),
					dic_lx.getTrimString(copy.get(i)),
					dic_wx.getTrimString(copy.get(i)),
					dic_bl.getTrimString(copy.get(i)),
					dic_sy.getTrimString(copy.get(i)),
					dic_bf.getTrimString(copy.get(i)),
					dic_jy.getTrimString(copy.get(i)),
					dic_yh.getTrimString(copy.get(i)),
					dic_yf.getTrimString(copy.get(i)),
					dic_yx.getTrimString(copy.get(i)) };
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
		table.getColumnModel().getColumn(3).setPreferredWidth(80 + 521);
		table.getColumnModel().getColumn(4).setPreferredWidth(80 + 30);
		table.getColumnModel().getColumn(5).setPreferredWidth(80 + 30);
		table.getColumnModel().getColumn(6).setPreferredWidth(80 + 60);
		table.getColumnModel().getColumn(7).setPreferredWidth(80 + 30);
		table.getColumnModel().getColumn(8).setPreferredWidth(80 + 30);
		table.getColumnModel().getColumn(9).setPreferredWidth(80 + 110);
		table.getColumnModel().getColumn(10).setPreferredWidth(80 + 110);
		table.getColumnModel().getColumn(11).setPreferredWidth(80 + 60);
		table.getColumnModel().getColumn(12).setPreferredWidth(80 + 30);
		table.getColumnModel().getColumn(13).setPreferredWidth(80 + 110);
		table.getColumnModel().getColumn(14).setPreferredWidth(80 + 110);
		table.getColumnModel().getColumn(17).setPreferredWidth(80 + 110);
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
		int count = AppSearch_X_DetaSearch.detaSearch(score_code, score,
				newTableModel, tableData_old, copy, key, dic_map, true, NE);
		// 测试了下, OK, 准备整体vpcs替换。之后设计成线程。避免搜索死锁,
		if (-1 == count) {
			return;
		}
		NE.app_S.lYGSortESU9D.javaSort(score_code, score);
		int max = score_code[0];
		Object[][] tableData = new Object[count][18];
		int new_count = 0;
		newTableModel.getDataVector().clear();
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
					score[i].replace("〔〔〔", "〔"),
					dic_map.get(score[i]).toString().replace("〔〔〔", "〔"),
					dic_zl.get(score[i]).toString(),
					dic_lc.get(score[i]).toString(),
					dic_by.get(score[i]).toString(),
					dic_zd.get(score[i]).toString(),
					dic_gn.get(score[i]).toString(),
					dic_lx.get(score[i]).toString(),
					dic_wx.get(score[i]).toString(),
					dic_bl.get(score[i]).toString(),
					dic_sy.get(score[i]).toString(),
					dic_bf.get(score[i]).toString(),
					dic_jy.get(score[i]).toString(),
					dic_yh.get(score[i]).toString(),
					dic_yf.get(score[i]).toString(),
					dic_yx.get(score[i]).toString() };
			newTableModel.insertRow(new_count, tableData[new_count]);
			new_count += 1;
		}
		newTableModel.fireTableDataChanged();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}

//public static Map<Integer, WordFrequency> doFwaArrangement(CogsBinaryForest_AE _A
//, Map<String, WordFrequency> map){
//Map<Integer, WordFrequency> fwaOriginal= _A.sortWordFrequencyMapToSortMap(map);
//Map<Integer, WordFrequency> fwa= new LinkedHashMap<>();
//Map<Integer, WordFrequency> fwaComplex= new LinkedHashMap<>();
//int singer=0; 
//int complex=0;
//for (int i= 0; i< fwaOriginal.size(); i++) {
//if(fwaOriginal.get(i).get_word().length()> 1) {
//	fwaComplex.put(complex++, fwaOriginal.get(i));
//}else {
//	fwa.put(singer++, fwaOriginal.get(i));
//}
//}
//for (int i= 0; i< fwaComplex.size(); i++) {
//fwa.put(singer++, fwaComplex.get(i));
//}
//return fwa;
//}

//Iterator<String> iterator= setsForGet.iterator();
//Here:
//	while(iterator.hasNext()) {
//		String setOfi= iterator.next();
//		if(pos.get(setOfi)== null) {
//			page.append("<span style=\"background:#000000\">"
//					+ "<font color=\"white\" size=\"5\">" 
//		+ setOfi + "</font></span>");
//			continue Here;
//		}
//		if(pos.get(setOfi).contains("名")|| pos.get(setOfi).contains("动")
//				|| pos.get(setOfi).contains("形")) {
//			if (map.containsKey(setOfi)) {
//				WordFrequency wordFrequency= map.get(setOfi);
//				wordFrequency.I_frequency(wordFrequency.get_frequency()
//						+ S_Pos.INT_ONE);
//				map.put(setOfi, wordFrequency);
//			} else {
//				WordFrequency wordFrequency= new WordFrequency();
//				wordFrequency.I_frequency(S_Pos.INT_ONE);
//				wordFrequency.I_Word(setOfi);
//				map.put(setOfi, wordFrequency);
//			}
//		}
//		if (!setOfi.equals("")) {
//			if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")
//					|| pos.get(setOfi).contains("动")
//					||pos.get(setOfi).contains("形"))) {
//				page.append("<span style=\"background:red\">"
//						+ "<font color=\"white\">"+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("名")) {
//				page.append("<span style=\"background:"
//			+U_A.PEU.P.image.Color_P.P(255, 245, 255)
//						+"\"><font color=\"black\" size=\"5\">"
//			+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("动")) {
//				page.append("<span style=\"background:"
//			+U_A.PEU.P.image.Color_P.P(245, 255, 245)
//						+"\"><font color=\"black\" size=\"5\">"
//			+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("形")) {
//				page.append("<span style=\"background:"
//			+U_A.PEU.P.image.Color_P.P(255, 255, 245)
//						+"\"><font color=\"black\" size=\"5\">"
//			+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("副")) {
//				page.append("<span style=\"background:#F1FFFF\">"
//						+ "<font color=\"black\" size=\"5\">"
//						+setOfi+"</font></span>");
//				continue Here;
//			} 
//			page.append("<span style=\"background:white\">"
//					+ "<font color=\"black\" size=\"5\">"
//					+setOfi+"</font></span>");				 
//		}
//	}