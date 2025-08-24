package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.M.X.AppSearch_X_DetaSearch;
import ME.VPC.S.pillow.ZynkxPage_X_S_s;
import ME.VPC.S.pillow.PageWords;
import ME.VPC.V.dictionary.ZynkxDictionary;
import Q_V.OSI.AOP.MEC.SIQ.search.ZhongYaoSearch;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import OSV.VCQ.standard.DictionaryStandardDB;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ZynkxPage_X_S_sListeners extends ZynkxPage_X_S_s
		implements MouseListener, KeyListener {
	//
	public App NE;

	public JTextField name() {
		name = new JTextField();
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}

	@SuppressWarnings({ "serial" })
	public javax.swing.JTable jTable(App app_NE) {
		NE = app_NE;
//		DictionaryDB d= new DictionaryDB();
		ZynkxDictionary d = new ZynkxDictionary();
		dic_list = d.txtToList();
		dic_map = d.listToMap(dic_list);
//		DictionaryDB
		dic_chu_fang = d.MapToChuFang(dic_list, dic_map);
		dic_mz = d.MapTomz(dic_list, dic_map);
		dic_zf = d.MapTozf(dic_list, dic_map);
		dic_yy = d.MapToyy(dic_list, dic_map);

		dic_sy = d.MapTosy(dic_list, dic_map);
		dic_tl = d.MapTotl(dic_list, dic_map);
		dic_ff = d.MapToff(dic_list, dic_map);
		dic_fg = d.MapTofg(dic_list, dic_map);

		tableData_old = new Object[dic_map.size()][12];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			tableData_old[i] = new Object[] { "" + (i + 1), "" + 0,
					copy.get(i).trim().replace("^", " "),
					dic_map.get(copy.get(i)).toString().replaceAll("\\s*", "")
							.replace("^", " "),
					dic_zf.containsKey(copy.get(i)) ? dic_zf.get(copy.get(i))// later..
							.toString().replace("-", " ") : "",
					dic_chu_fang.containsKey(copy.get(i)) ? dic_chu_fang
							.get(copy.get(i)).toString().replace("-", " ") : "",
					dic_mz.containsKey(copy.get(i)) ? dic_mz.get(copy.get(i))
							.toString().replace("-", " ") : "",
					dic_yy.containsKey(copy.get(i)) ? dic_yy.get(copy.get(i))
							.toString().replace("-", " ") : "",
					dic_sy.containsKey(copy.get(i)) ? dic_sy.get(copy.get(i))
							.toString().replace("-", " ") : "",
					dic_tl.containsKey(copy.get(i)) ? dic_tl.get(copy.get(i))
							.toString().replace("-", " ") : "",
					dic_ff.containsKey(copy.get(i)) ? dic_ff.get(copy.get(i))
							.toString().replace("-", " ") : "",
					dic_fg.containsKey(copy.get(i)) ? dic_fg.get(copy.get(i))
							.toString().replace("-", " ") : "" };
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
		table.getColumnModel().getColumn(2).setPreferredWidth(80 + 50);
		table.getColumnModel().getColumn(3).setPreferredWidth(80 + 521);
		table.getColumnModel().getColumn(4).setPreferredWidth(80 + 100);
		table.getColumnModel().getColumn(5).setPreferredWidth(80 + 60);
		table.getColumnModel().getColumn(6).setPreferredWidth(80 + 60);
		table.getColumnModel().getColumn(7).setPreferredWidth(80 + 50);

		table.getColumnModel().getColumn(8).setPreferredWidth(80 + 50);
		table.getColumnModel().getColumn(9).setPreferredWidth(80 + 50);
		table.getColumnModel().getColumn(10).setPreferredWidth(80 + 50);
		table.getColumnModel().getColumn(11).setPreferredWidth(80 + 50);
		table.addMouseListener(this);
		return table;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (key == null) {
			key = "";
		}
		sets = null;
		IMV_SIQ_SS map = new IMV_SIQ_SS();
		row = table.getSelectedRow();
		col = table.getSelectedColumn();
		String value = (String) table.getValueAt(row, col);

		// 3d
		int column = 4;
		if (table.getValueAt(row, column).toString().isEmpty()) {
			column = 3;
		}
		String zhongYaoFang = table.getValueAt(row, column).toString();
		String searchYaos = this.app_S.coAuthorForWord.bootZynkFlowerForest(
				table.getValueAt(row, 2).toString(), zhongYaoFang, true, NE);
		// (this.app_S.table.getValueAt(row, 2).toString(), false);
		ZhongYaoSearch.zhongYaoSearch(this.app_S, searchYaos, "", searchYaos,
				NE);

		data.setSize(500, 800);
		sets = _A.parserMixedString(value);// 词性分析
		data.setContentType("text/html");
		StringBuilder page = new StringBuilder().append("");
		currentPage = 0;
		List<String> setsForGet = sets.subList(currentPage * 2000,
				(currentPage + 1) * 2000 < sets.size()
						? (currentPage + 1) * 2000
						: sets.size());

		PageWords.renderWordLoopPOS(page, setsForGet, map, key, true, NE);
		buttonSum.setText(
				"共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
		buttonCrt.setText("当前页面：" + (sets == null ? 0 : 1));
		data.setText(page.toString());
		data.setSelectionStart(0);
		data.setSelectionEnd(0);
		data.validate();
		statistic.setSize(500, 800);
		// Map<Integer, WordFrequency> fwa=
		// _A.sortWordFrequencyMapToSortMap(map);
		IMV_SIQ_S_ fwa = doFwaArrangement(map, NE);
		statistic.setContentType("text/html");
		page.delete(0, page.length());
		Here: for (int i = fwa.size() - 1; i >= 0; i--) {
			if (fwa.get(i) != null) {
				if (pos.get(fwa.getW(i).get_word()) == null) {
					page.append("<div style=\"background:white\">"
							+ "<font color=\"black\">" + fwa.getW(i).get_word()
							+ "" + fwa.getW(i).get_frequency()
							+ "</font></div>");
					continue Here;
				}
				if (S_Maps.mingCi.containsKey(fwa.getW(i).get_word())) {
					page.append("<div style=\"background:#FF44FF\">"
							+ "<font color=\"white\">" + fwa.getW(i).get_word()
							+ "" + fwa.getW(i).get_frequency()
							+ "</font></div>");
					continue Here;
				}
				if (S_Maps.dongCi.containsKey(fwa.getW(i).get_word())) {
					page.append("<div style=\"background:#8CEA00\">"
							+ "<font color=\"black\" size=\""
							+ NE.app_S.size_font_rot + "\">"
							+ fwa.getW(i).get_word() + ""
							+ fwa.getW(i).get_frequency() + "</font></div>");
					continue Here;
				}
				if (S_Maps.xingRongCi.containsKey(fwa.getW(i).get_word())) {
					page.append("<div style=\"background:#FF9224\">"
							+ "<font color=\"black\" size=\""
							+ NE.app_S.size_font_rot + "\">"
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

	// }catch(Exception e){
//		this.validate();
//		data.validate();
//		jTabbedpane.validate();
//			statistic.validate();
//			jTabbedpane.validate();
//		}
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
		// int max= score_code.length> 0? score_code[0]: 9999;//稍后处理
		// 罗瑶光20210514
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
					score[i].replace("^", " "),
					dic_map.get(score[i]).toString().replace("^", " "),
					dic_zf.containsKey(score[i])
							? dic_zf.getString(score[i]).replace("-", " ")
							: "",
					dic_chu_fang.containsKey(score[i])
							? dic_chu_fang.getString(score[i]).replace("-", " ")
							: "",
					dic_mz.containsKey(score[i])
							? dic_mz.getString(score[i]).replace("-", " ")
							: "",
					dic_yy.containsKey(score[i])
							? dic_yy.getString(score[i]).replace("-", " ")
							: "",
					dic_sy.containsKey(score[i])
							? dic_sy.getString(score[i]).replace("-", " ")
							: "",
					dic_tl.containsKey(score[i])
							? dic_tl.getString(score[i]).replace("-", " ")
							: "",
					dic_ff.containsKey(score[i])
							? dic_ff.getString(score[i]).replace("-", " ")
							: "",
					dic_fg.containsKey(score[i])
							? dic_fg.getString(score[i]).replace("-", " ")
							: "" };
			newTableModel.insertRow(new_count, tableData[new_count]);
			new_count += 1;
		}
		newTableModel.fireTableDataChanged();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}

//"culumnName:uk:病症药名:string;"+ 
//"culumnName:uk:用药参考:string;"+ 
//"culumnName:uk:成人处方:string;"+ 
//"culumnName:uk:脉症:string;"+ 
//"culumnName:uk:制法:string;"+ 
//"culumnName:uk:应用:string;"+ 
//"culumnName:uk:使用:string;"+ 
//"culumnName:uk:讨论:string;"+ 
//"culumnName:uk:附方:string;"+ 
//"culumnName:uk:方歌:string;";
/////////////////////////////////////////////////////////////////////////////////////
//测试下刚写的标准读表函数.
//DictionaryStandardDB d= new DictionaryStandardDB();
//String primaryKey= "病症药名";
//String tabKey= "zyfj";
////以后设计 uniq forenkey等.
//Map<String, IMV_SIQ> map= d.dbToMap(primaryKey, tabKey);
//dic_bzm=map.get("病症药名");
//dic_chu_fang=map.get("成人处方");
//dic_mz=map.get("脉症");
//dic_zf=map.get("制法");
//dic_yy=map.get("应用");
//dic_sy=map.get("使用");
//dic_tl=map.get("讨论");
//dic_ff=map.get("附方");
//dic_fg=map.get("方歌");
//dic_map=map.get("dic_map");
////////////////////////////////////////////////////////////////////////////////////
//dic_bzm= new IMV_SIQ();
//dic_chu_fang= new IMV_SIQ();
//dic_mz= new IMV_SIQ();
//dic_zf= new IMV_SIQ();
//dic_yy= new IMV_SIQ();
//dic_sy= new IMV_SIQ();
//dic_tl= new IMV_SIQ();
//dic_ff= new IMV_SIQ();
//dic_fg= new IMV_SIQ();	
//dic_map= d.txtToMap(dic_bzm, dic_chu_fang, dic_mz, dic_zf
// , dic_yy, dic_sy, dic_tl, dic_ff, dic_fg);

//Iterator<String> iterator= setsForGet.iterator();
//Here:
//	while(iterator.hasNext()) {
//		String setOfi= iterator.next();
//		if(pos.get(setOfi)== null) {
//			page.append("<span style=\"background:#000000\">"
//					+ "<font color=\"white\" size=\"5\">" + setOfi + "</font></span>");
//			continue Here;
//		}
//		if(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
//				||pos.get(setOfi).contains("形")) {
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
//					||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
//				page.append("<span style=\"background:red\">"
//						+ "<font color=\"white\">"+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("名")) {
//				page.append("<span style=\"background:"
//						+U_A.PEU.P.image.Color_P.P(0, 0, 0)
//						+"\"><font color="
//						+U_A.PEU.P.image.Color_P.P(255
//								, 255- 80- u.raterot
//								, 255)
//						+ " size=\"5\">"
//						+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("动")) {
//				page.append("<span style=\"background:"
//						+U_A.PEU.P.image.Color_P.P(0, 0, 0)
//						+"\"><font color="
//						+U_A.PEU.P.image.Color_P.P(255- 80- u.raterot
//								, 255
//								, 255- 80- u.raterot)
//						+ " size=\"5\">"
//						+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("形")) {
//				page.append("<span style=\"background:"
//						+U_A.PEU.P.image.Color_P.P(255, 255, 245)
//						+"\"><font color="
//						+U_A.PEU.P.image.Color_P.P(255
//								, 255
//								, 255- 80- u.raterot)
//						+ " size=\"5\">"
//						+setOfi+"</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("副")) {
//				page.append("<span style=\"background:#000000\">"
//						+ "<font color=\"white\" size=\"5\">"
//						+setOfi+"</font></span>");
//				continue Here;
//			} 
//			page.append("<span style=\"background:black\">"
//					+ "<font color=\"white\" size=\"5\">"
//					+setOfi+"</font></span>");			 
//		}
//   }