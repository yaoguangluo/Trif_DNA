package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.M.X.AppSearch_X_DetaSearch;
import ME.VPC.S.pillow.ZyzdxPage_X_S_s;
import ME.VPC.V.dictionary.ZyzdxDictionary;

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
@SuppressWarnings("serial")
public class ZyzdxPage_X_S_sListeners extends ZyzdxPage_X_S_s
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
		ZyzdxDictionary d = new ZyzdxDictionary();
		dic_list = d.txtToList();
		dic_map = d.listToMap(dic_list);
		dic_gn = d.mapToMap_gn(dic_map);
		dic_lcbx = d.mapToMap_lcbx(dic_map);
		dic_lcyy = d.mapToMap_lcyy(dic_map);
		dic_zhfx = d.mapToMap_zhfx(dic_map);
		dic_zhjb = d.mapToMap_zhjb(dic_map);
		tableData_old = new Object[dic_map.size()][9];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {// later
			tableData_old[i] = new Object[] { "" + (i + 1), "" + 0,
					copy.get(i).trim().replace("〔", "").replace("〕", ":"),
					dic_map.get(copy.get(i)).toString().replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"),
					dic_lcbx.get(copy.get(i)).toString(),
					dic_gn.get(copy.get(i)).toString(),
					dic_zhfx.get(copy.get(i)).toString(),
					dic_lcyy.get(copy.get(i)).toString(),
					dic_zhjb.get(copy.get(i)).toString() };
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
		table.getColumnModel().getColumn(5).setPreferredWidth(80 + 130);
		table.getColumnModel().getColumn(6).setPreferredWidth(80 + 130);
		table.getColumnModel().getColumn(7).setPreferredWidth(80 + 130);
		table.getColumnModel().getColumn(8).setPreferredWidth(80 + 130);
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

	@Override
	public void keyReleased(KeyEvent arg0) {
		String[] score = new String[copy.size()];
		int[] score_code = new int[copy.size()];
		int count = AppSearch_X_DetaSearch.detaSearch(score_code, score,
				newTableModel, tableData_old, copy, key, dic_map, true, NE);
		// 测试了下, OK, 准备整体vpcs替换。之后设计成线程。避免搜索死锁,
		if (-1 == count) {
			return;
		}
		NE.app_S.lYGSortESU9D.javaSort(score_code, score);
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
					score[i].replace("〔", "").replace("〕", ":"),
					dic_map.get(score[i]).toString().replace("〔", "")
							.replace("〕", ":"),
					dic_lcbx.get(score[i]).toString().replaceAll("\\s*", ""),
					dic_gn.get(score[i]).toString().replaceAll("\\s*", ""),
					dic_zhfx.get(score[i]).toString().replaceAll("\\s*", ""),
					dic_lcyy.get(score[i]).toString().replaceAll("\\s*", ""),
					dic_zhjb.get(score[i]).toString().replaceAll("\\s*", "") };
			newTableModel.insertRow(new_count, tableData[new_count]);
			new_count += 1;
		}
		newTableModel.fireTableDataChanged();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}