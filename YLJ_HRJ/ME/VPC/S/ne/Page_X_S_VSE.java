package ME.VPC.S.ne;

import ME.VPC.M.app.App;
import ME.VPC.S.pillow.PageWords;
import M_V.MVQ.tableRender.ColorTableRender;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;
import U_A.PEU.P.table.TableSorterZYNK;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.JTableHeader;
import java.awt.Color;
import java.awt.Font;
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
public class Page_X_S_VSE extends Page_X_S_sVSQ {

	public IMV_SIQ_S_ doFwaArrangement(IMV_SIQ_SS map, App NE) {
		if (null == NE.app_S) {
			return null;// fatar trif
		}
		if (null == map) {
			return null;// fatar trif
		}
		if (null == NE.app_S._A) {
			return null;// fatar trif
		}
		IMV_SIQ_S_ fwaOriginal = NE.app_S._A.sortWordFrequencyMapToSortMap(map);
		IMV_SIQ_S_ fwa = new IMV_SIQ_S_();
		IMV_SIQ_S_ fwaComplex = new IMV_SIQ_S_();
		int singer = 0;
		int complex = 0;
		for (int i = 0; i < fwaOriginal.size(); i++) {
			if (fwaOriginal.getW(i).get_word().length() > 1) {
				fwaComplex.put(complex++, fwaOriginal.get(i));
			} else {
				fwa.put(singer++, fwaOriginal.get(i));
			}
		}
		for (int i = 0; i < fwaComplex.size(); i++) {
			fwa.put(singer++, fwaComplex.get(i));
		}
		return fwa;
	}

	public void initPage(JTextPane text, App NE) {
		this.text = text;
		if (NE == null) {
			return;
		}
		if (NE.app_S == null) {
			return;
		}
		this._A = NE.app_S._A;
		if (null == NE.app_S) {
			return;// fatar trif
		}
		if (null == NE.app_S.fMHMMListOneTime_E) {
			return;// fatar trif
		}
		this.pos = NE.app_S.fMHMMListOneTime_E.posCnToCn;
		this.pose = NE.app_S.fMHMMListOneTime_E.posEnToEn;
		this.etc = NE.app_S.fMHMMListOneTime_E.fullEnToCn;// later..
		this.cte = NE.app_S.fMHMMListOneTime_E.fullCnToEn;
		this.posFec = NE.app_S.fMHMMListOneTime_E_X_S.fullEnToCn;// scale fus.

		this.app_S = NE.app_S;
		this.jTabbedpane = NE.app_S.jTabbedpane;
		this.posec = NE.app_S.fMHMMListOneTime_E.posEnToCn;
		this.posFullec = NE.app_S.fMHMMListOneTime_E.fullEnToCn;
		this.emotionSample = NE.app_S.emotionSample;// same..
		this.ratioMap_E = NE.app_S.ratioMap_E;
	}

	public void simpleClicked(App NE) {
		if (key == null) {
			key = "";
		}
		sets = null;
		IMV_SIQ_SS map = new IMV_SIQ_SS();
		try {
			row = table.getSelectedRow();
			col = table.getSelectedColumn();
			String value = (String) table.getValueAt(row, col);
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
			buttonSum.setText("共有 "
					+ (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
			buttonCrt.setText("当前页面：" + (sets == null ? 0 : 1));
			if (null == data) {
				return;// fatar trif
			}
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
		} catch (Exception e) {
			if (null == data) {
				return;// fatar trif
			}
			data.validate();
			if (null == jTabbedpane) {
				return; // trif
			}
			jTabbedpane.validate();
		}
		try {
			statistic.setSize(500, 800);
			IMV_SIQ_S_ fwa = doFwaArrangement(map, NE);
			statistic.setContentType("text/html");
			StringBuilder page = new StringBuilder();
			Here: for (int i = fwa.size() - 1; i >= 0; i--) {
				if (fwa.get(i) != null) {
					if (pos.get(fwa.getW(i).get_word()) == null) {
						page.append("<div style=\"background:white\">"
								+ "<font color=\"black\">"
								+ fwa.getW(i).get_word() + ""
								+ fwa.getW(i).get_frequency()
								+ "</font></div>");
						continue Here;
					}
					if (S_Maps.mingCi.containsKey(fwa.getW(i).get_word())) {
						page.append("<div style=\"background:#FF44FF\">"
								+ "<font color=\"white\">"
								+ fwa.getW(i).get_word() + ""
								+ fwa.getW(i).get_frequency()
								+ "</font></div>");
						continue Here;
					}
					if (S_Maps.dongCi.containsKey(fwa.getW(i).get_word())) {
						page.append("<div style=\"background:#8CEA00\">"
								+ "<font color=\"black\"" + " size=\""
								+ NE.app_S.size_font_rot + "\">"
								+ fwa.getW(i).get_word() + ""
								+ fwa.getW(i).get_frequency()
								+ "</font></div>");
						continue Here;
					}
					if (S_Maps.xingRongCi.containsKey(fwa.getW(i).get_word())) {
						page.append("<div style=\"background:#FF9224\">"
								+ "<font color=\"black\"" + " size=\""
								+ NE.app_S.size_font_rot + "\">"
								+ fwa.getW(i).get_word() + ""
								+ fwa.getW(i).get_frequency()
								+ "</font></div>");
					}
				}
			}
			statistic.setText(page.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		} catch (Exception e) {
			statistic.validate();
			jTabbedpane.validate();
		}
	}

	public void tableSections(App NE) {
		if (null == table) {
			return;// fatar trif
		}
		TableSorterZYNK sorter = new TableSorterZYNK(newTableModel, NE); // ADDE
		sorter.setTableHeader(table.getTableHeader());
		table.setModel(sorter);
		table.setRowHeight(35);// 设置高度
		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(245, 245, 220));
		header.setFont(new Font("楷体", Font.PLAIN, 19));// 设置表格字体
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		ColorTableRender tcr = new ColorTableRender(NE);
		table.setDefaultRenderer(Object.class, tcr);
	}
}