//YLJ_HRJ/ME/APM/VSQ/AppButtonUtil.java
package ME.VPC.V.appButton;

import DSU.V.VtoV;

import E_A.OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import M_V.MVQ.button.DetaButton;
import P.image.Color_P;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_uRIencodeToURIdecode;

import javax.swing.JTable;
import javax.swing.JTextPane;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//把通用节点的 按钮操作提取出来 统一化管理去重。

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//20211022 
public class AppButtonUtil_X_DNN_Page extends AppButtonUtil_X_DNN {
	// StringBuilder page= new StringBuilder().append("");
	// AppPageUtil.pageSIMILAR(page, etc, cte, key, pos, sets,
	// currentPage);

	// StringBuilder page= new StringBuilder().append("");
	// AppPageUtil.pageflipPages(page, map, key, pos, sets,
	// currentPage);
	// 中药DNN
	public static void pageDNN(StringBuilder page, List<String> sets,
			int currentPage, App_S u, JTable table, int row, String key,
			DetaButton buttonSum, DetaButton buttonCrt, JTextPane data,
			JTextPane statistic, String zhong_xi_yao, App NE) {// shaohou
															   // zhenghe danli
		IMV_SIQ pos = u.fMHMMListOneTime_E.posCnToCn;// later..
		List<String> setsForGet = sets.subList(currentPage * 2000,
				(currentPage + 1) * 2000 < sets.size()
						? (currentPage + 1) * 2000
						: sets.size());
		Iterator<String> iterator = setsForGet.iterator();
		String setOfi = "";
		int times = 0;
		while (times++ < 1000 && iterator.hasNext()) {
			setOfi += iterator.next();
		}
		String response = "";
		String keyCache = setOfi.length() > 30 ? setOfi.substring(0, 30)
				: setOfi.substring(0, setOfi.length() - 1);
		if (!u.CacheString.containsKey(keyCache)) {
			String string = String_ESU_X_charsetSwap._E(setOfi, "UTF8", "UTF8");
			// String encode= String_ESU_X_stringToURIencode._E(string,
			// "UTF8");
			// response= RestCall_X_backEndRequest._E(encode);
			response = VtoV
					.ObjectToJsonString(RestNLPPortImpl.dataCG(string, NE));
			String[] strings = response.split("\"");
			response = strings.length > 3 ? strings[3] : "";
			response = String_ESU_X_uRIencodeToURIdecode._E(response, "UTF8");
			if (u.CacheStringPiple.size() < 301) {// buman
				u.CacheString.put(keyCache, response);
				u.CacheStringPiple.add(0, keyCache);
			} else {// man
				u.CacheString.put(keyCache, response);
				u.CacheStringPiple.add(0, keyCache);
				u.CacheString.remove(u.CacheStringPiple.get(300));
				u.CacheStringPiple.remove(300);
			}
		} else {
			response = u.CacheString.getString(keyCache);
		}
		// dnn森林
		String[] dnn = response.replace("\r\n", "<br/>").split("<br/>");
		if (zhong_xi_yao.contains("中药")) {
			if (null == u) {
				return;
			}
			if (null == u.coAuthorForWord) {
				return;
			}
			u.coAuthorForWord.bootDetaDnnFlowerForest(
					table.getValueAt(row, 2).toString(), dnn, true);
		} else if (zhong_xi_yao.contains("西药")) {
			u.coAuthorForWord.bootDetaBingMingDnnFlowerForest(
					table.getValueAt(row, 2).toString(), dnn, true);
		} else {
		}
		// (this.u.table.getValueAt(row, 2).toString(), false);
		// dnn rank
		Map<String, Double> dNNrank = new IMV_SIQ();
		doRankDNN(statistic, response, pos, dNNrank, NE);
		// DNN
		IMV_SIQ_SS map = new IMV_SIQ_SS();
		iterator = setsForGet.iterator();
		NE.app_S.listCharPosition = 0;
		Here: while (iterator.hasNext()) {
			NE.app_S.listCharPosition++;
			setOfi = iterator.next();
			if (pos.get(setOfi) == null) {
				page.append("<span style=\"background:#F1F1F1\">"
						+ "<font color=\"black\"" + " size=\""
						+ NE.app_S.size_font_rot + "\">" + setOfi
						+ "</font></span>");
				continue Here;
			}
			if ((S_Maps.mingCi.containsKey(setOfi)
					|| S_Maps.dongCi.containsKey(setOfi)
					|| S_Maps.xingRongCi.containsKey(setOfi))) {
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
//                    WordFrequency wordFrequency = new WordFrequency();
//                    wordFrequency.I_frequency(1.0);
//                    wordFrequency.I_Word(setOfi);
					map.put(setOfi, wordFrequency);
				}
			}
			if (!setOfi.equals("")) {
				if (response.contains(setOfi) && setOfi.length() > 1) {
					if (doResponseContainsSetofI(page, setOfi, dNNrank, NE)) {
						continue Here;
					}
				}
				if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
						|| S_Maps.dongCi.containsKey(setOfi)
						|| S_Maps.xingRongCi.containsKey(setOfi))) {
					page.append("<span style=\"background:red\">"
							+ "<font color=\"white\">" + setOfi
							+ "</font></span>");
					continue Here;
				}
				if (S_Maps.mingCi.containsKey(setOfi)) {
					page.append("<span style=\"background:"
							+ Color_P.P(255, 245, 255)
							+ "\"><font color=\"black\"" + " size=\""
							+ NE.app_S.size_font_rot + "\">" + setOfi
							+ "</font></span>");
					continue Here;
				}
				if (S_Maps.dongCi.containsKey(setOfi)) {
					page.append("<span style=\"background:"
							+ Color_P.P(245, 255, 245)
							+ "\"><font color=\"black\"" + " size=\""
							+ NE.app_S.size_font_rot + "\">" + setOfi
							+ "</font></span>");
					continue Here;
				}
				if (S_Maps.xingRongCi.containsKey(setOfi)) {
					page.append("<span style=\"background:"
							+ Color_P.P(255, 255, 245)
							+ "\"><font color=\"black\"" + " size=\""
							+ NE.app_S.size_font_rot + "\">" + setOfi
							+ "</font></span>");
					continue Here;
				}
				if (S_Maps.fuCi.containsKey(setOfi)) {
					page.append("<span style=\"background:#F1FFFF\">"
							+ "<font color=\"black\"" + " size=\""
							+ NE.app_S.size_font_rot + "\">" + setOfi
							+ "</font></span>");
					continue Here;
				}
				page.append("<span style=\"background:white\">"
						+ "<font color=\"black\"" + " size=\""
						+ NE.app_S.size_font_rot + "\">" + setOfi
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
	}
}

//private static boolean doResponseContainsSetofI(App_S u, Map<String, String> pos
//		, StringBuilder page, String setOfi, Map<String, Double> dNNrank) {
//	//System.out.println("root:"+ u.jsliderDNNRatio);
//	u.appConfig.SectionJPanel.jTextPane.setText("root:"
//			+ u.jsliderDNNRatio);
//	double rank= dNNrank.containsKey(setOfi)?dNNrank.get(setOfi):0;
//	double peak= dNNrank.size()* (u.jsliderDNNRatio/20.1);
//	if(pos.get(setOfi).contains("名")) {
//		if(setOfi.length()> 2|| rank> peak) {
//			page.append("<span style=\"background:"
//					+U_A.PEU.P.image.Color_P.P(255, 90, 255)
//					+"\"><font color=\"black\" size=\"5\">"
//					+setOfi+"</font></span>");
//			return true;
//		}
//		page.append("<span style=\"background:"
//				+U_A.PEU.P.image.Color_P.P(255, 210, 255)
//				+"\"><font color=\"black\" size=\"5\">"
//				+setOfi+"</font></span>");
//		return true;
//	}
//	if(pos.get(setOfi).contains("动")) {
//		if(setOfi.length()> 2|| rank> peak) {
//			page.append("<span style=\"background:"
//					+U_A.PEU.P.image.Color_P.P(90, 255, 90)
//					+"\"><font color=\"black\" size=\"5\">"
//					+setOfi+"</font></span>");
//			return true;
//		}
//		page.append("<span style=\"background:"
//				+U_A.PEU.P.image.Color_P.P(210, 255, 210)
//				+"\"><font color=\"black\" size=\"5\">"
//				+setOfi+"</font></span>");
//		return true;
//	}
//	if(pos.get(setOfi).contains("形")) {
//		if(setOfi.length()> 2|| rank> peak) {
//			page.append("<span style=\"background:"
//					+U_A.PEU.P.image.Color_P.P(255, 255, 90)
//					+"\"><font color=\"black\" size=\"5\">"
//					+setOfi+"</font></span>");
//			return true;
//		}
//		page.append("<span style=\"background:"
//				+U_A.PEU.P.image.Color_P.P(255, 255, 210)
//				+"\"><font color=\"black\" size=\"5\">"
//				+setOfi+"</font></span>");
//		return true;
//	}
//	return false;
//}
//
//
//public static void doRankDNN(JTextPane statistic, String response
//		, Map<String, String> pos, Map<String, Double> dNNrank) {
//	//dnn rank
//	try {
//		statistic.setSize(500, 800);
//		//Map<Integer, WordFrequency> fwa= _A.sortWordFrequencyMapToSortMap(map);
//		statistic.setContentType("text/html");
//		StringBuilder stringBuilder= new StringBuilder();
//		String[] fwa= response.replace("\r\n", "<br/>").split("<br/>");
//		Here:
//			for (int i= fwa.length-1; i > 0; i--) {
//				if (fwa[i]!= null) {
//					String[] strings= fwa[i].split(":");
//					//DNNrank.put(strings[0], Double.valueOf(strings[1]));// 不需要怎么复杂
//					dNNrank.put(strings[0], 0.0+ i);
//					if(pos.get(strings[0])== null) {
//						stringBuilder.append("<div style=\"background:white\">"
//								+ "<font color=\"black\">" 
//								+fwa[i] + "</font></div>");
//						continue Here;
//					}
//					if(pos.get(strings[0]).contains("名")) {
//						stringBuilder.append( "<div style=\"background:#FF44FF\">"
//								+ "<font color=\"white\">"
//								+ fwa[i] +"</font></div>");
//						continue Here;
//					}
//					if(pos.get(strings[0]).contains("动")) {
//						stringBuilder.append("<div style=\"background:#8CEA00\">"
//								+ "<font color=\"black\" size=\"5\">" 
//								+ fwa[i] +"</font></div>");
//						continue Here;
//					}
//					if(pos.get(strings[0]).contains("形")) {
//						stringBuilder.append("<div style=\"background:#FF9224\">"
//								+ "<font color=\"black\" size=\"5\">" 
//								+ fwa[i] +"</font></div>");
//					}
//				}
//			}	
//		statistic.setText(stringBuilder.toString());
//		statistic.setSelectionStart(0);
//		statistic.setSelectionEnd(0);
//		statistic.validate();
//	}catch(Exception e1){	
//		statistic.validate();
//	}          
//}