package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.M.X.AppSearch_X_DetaSearch;
import ME.VPC.S.pillow.JzkxPage_X_S_s;
import ME.VPC.V.dictionary.JzkxDictionary;

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
 * *lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("serial")
public class JzkxPage_X_S_sListeners extends JzkxPage_X_S_s
		implements MouseListener, KeyListener {
	//
	// App NE;

	public JTextField name() {
		name = new JTextField();
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}

	@SuppressWarnings({ "serial" })
	public javax.swing.JTable jTable(App app_NE) {
		NE = app_NE;
		JzkxDictionary d = new JzkxDictionary();
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
					copy.get(i).replace("〔〔〔", "〔").trim(),
					dic_map.get(copy.get(i)).toString().replaceAll("\\s*", "")
							.replace("〔〔〔", "〔"),
					dic_gn.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_zl.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_lc.get(copy.get(i)).toString().replaceAll("\\s*", ""),

					dic_lx.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_by.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_wx.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_bl.get(copy.get(i)).toString().replaceAll("\\s*", ""),

					dic_sy.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_zd.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_bf.get(copy.get(i)).toString().replaceAll("\\s*", ""),

					dic_jy.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yh.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yf.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yx.get(copy.get(i)).toString().replaceAll("\\s*", "") };
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
		// String key= name.getText();
		String[] score = new String[copy.size()];
		int[] score_code = new int[copy.size()];
		int[] reg = new int[copy.size()];
//		int count=0;
//		Map<String, WordFrequency> mapSearchWithoutSort= null;
//		mapSearchWithoutSort= _A.parserMixStringByReturnFrequencyMap(key, NE);
//		Iterator<String> iteratorForCopy= copy.iterator();	
//		int copyCount= 0;
//		List<String> list= _A.parserMixedString(key);
//		String[] string= List_ESU_X_listToArray._E(list);
//		
//		String[] stringReg= new String[key.length()/3];
//		for(int i= 0; i< stringReg.length; i++) {
//			stringReg[i]= key.substring(i*3, (i*3+ 3)<key.length()?(i*3+ 3):key.length()-1);
//		}
//		while(iteratorForCopy.hasNext()) {
//			String iteratorForCopyString= iteratorForCopy.next();
//			score[copyCount]= iteratorForCopyString;
//			String temps= dic_map.get(iteratorForCopyString).toString();
//			Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
//			Here:
//				while(iteratorWordFrequency.hasNext()) {  
//					String mapSearchaAtII= iteratorWordFrequency.next();
//					WordFrequency wordFrequencySearch= mapSearchWithoutSort.get(mapSearchaAtII);
//					if(temps.contains(mapSearchaAtII)) {
//						if(reg[copyCount]== 0){
//							count += 1;
//						}
//						score[copyCount]= iteratorForCopyString;
//						if(score[copyCount].contains(key.replace(" ", ""))) {
//							reg[copyCount]+= 500;
//						}
//						if(key.contains(score[copyCount].replace(" ", ""))) {
//							reg[copyCount]+= 500;
//						}
//						if(!pos.containsKey(mapSearchaAtII)) {
//							reg[copyCount] += 1;
//							score_code[copyCount] += 1 << mapSearchaAtII.length()
//							<< wordFrequencySearch.get_frequency() ;
//							continue Here;
//						}
//						if(pos.get(mapSearchaAtII).contains("名")
//						||pos.get(mapSearchaAtII).contains("动")
//								||pos.get(mapSearchaAtII).contains("形")
//								||pos.get(mapSearchaAtII).contains("谓")) {
//							reg[copyCount] += 2;
//						}
//						reg[copyCount] += 1;
//						score_code[copyCount]
//						+= (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1)
//							* (!pos.get(mapSearchaAtII).contains("名")
//							? pos.get(mapSearchaAtII).contains("动")? 45 : 1 : 50)
//								<< mapSearchaAtII.length() * wordFrequencySearch.get_frequency();
//						continue Here;
//					}
//					if(mapSearchaAtII.length()>1) {
//						for(int j=0;j<mapSearchaAtII.length();j++) {
//							if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
//								if(reg[copyCount]== 0){
//									count += 1;
//								}
//								score[copyCount]= iteratorForCopyString;
//								score_code[copyCount]+=1;
//								if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
//										pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
//										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
//										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
//										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
//										)) {
//									reg[copyCount] += 2;
//								}
//								reg[copyCount] += 1;
//								continue Here;
//							}
//						}
//					}
//				}
//			score_code[copyCount]= score_code[copyCount] * reg[copyCount];
//			//词距
//			int code= 100;
//			int tempb= 0;
//			int tempa= score_code[copyCount];
//			if(key.length()> 4) {
//				//全词
//				for(int i= 0; i< string.length; i++) {
//					if(temps.contains(string[i])) {
//						tempb+= code;
//					}
//				}
//				//断句
//				for(int i= 0; i< stringReg.length; i++) {
//					if(temps.contains(stringReg[i])) {
//						tempb+= code;
//					}
//				}
//				score_code[copyCount]= (int) (tempa/Math.pow(this.app_S.lookrot+ 1, 4)
//				+ tempb*Math.pow(this.app_S.lookrot, 2));
//			}
//			if(key.replace(" ", "").length()> 1&& key.replace(" ", "").length()< 5) {
//				if(temps.contains(key)) {
//					tempb+= code<< 7;
//				}
//				score_code[copyCount]= (int) (tempa/Math.pow(this.app_S.lookrot+ 1, 4)
//				+ tempb*Math.pow(this.app_S.lookrot, 2));
//			}
//			copyCount++;
//		}
//		LABEL2:
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
					score[i].replace("〔〔〔", "〔"),
					dic_map.get(score[i]).toString().replace("〔〔〔", "〔"),
					dic_gn.get(score[i]).toString(),
					dic_zl.get(score[i]).toString(),
					dic_lc.get(score[i]).toString(),

					dic_lx.get(score[i]).toString(),
					dic_by.get(score[i]).toString(),
					dic_wx.get(score[i]).toString(),
					dic_bl.get(score[i]).toString(),

					dic_sy.get(score[i]).toString(),
					dic_zd.get(score[i]).toString(),
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