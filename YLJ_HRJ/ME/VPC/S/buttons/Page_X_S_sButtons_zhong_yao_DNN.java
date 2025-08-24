package ME.VPC.S.buttons;

import DSU.V.VtoV;

import E_A.OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.Page_X_S_sVSQ;
import M_V.MVQ.button.DetaButton;
import P.image.Color_P;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_uRIencodeToURIdecode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
//import OCI.ME.analysis.C.A;
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
public class Page_X_S_sButtons_zhong_yao_DNN {
	public static DetaButton data_X_zhong_yao_DNN(Page_X_S_sVSQ page_X_S_s,
			int x, int y, int weight, int height, int maxInPage, int max,
			App NE) {
		DetaButton buttonKSLJ = new DetaButton("中药DNN");
		// buttonKSLJ.setBounds(990, 0, 115, 30);
		buttonKSLJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (null == page_X_S_s.sets) {
					return;
				}
				if (page_X_S_s.text.getText().length() > max) {
					return;
				}
				StringBuilder page = new StringBuilder().append("");
				List<String> setsForGet = page_X_S_s.sets.subList(
						page_X_S_s.currentPage * maxInPage,
						(page_X_S_s.currentPage + 1)
								* maxInPage < page_X_S_s.sets.size()
										? (page_X_S_s.currentPage + 1)
												* maxInPage
										: page_X_S_s.sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				String setOfi = "";
				int times = 0;
				while (times++ < 1000 && iterator.hasNext()) {
					setOfi += iterator.next();
				}
				String response = "";
				String keyCache = setOfi.length() > 30 ? setOfi.substring(0, 30)
						: setOfi.substring(0, setOfi.length() - 1);
				if (!page_X_S_s.app_S.CacheString.containsKey(keyCache)) {
					String string = String_ESU_X_charsetSwap._E(setOfi, "UTF8",
							"UTF8");
//						String encode= String_ESU_X_stringToURIencode._E(string, "UTF8");
//						response= RestCall_X_backEndRequest._E(encode);
					response = VtoV.ObjectToJsonString(
							RestNLPPortImpl.dataCG(string, NE));
					String[] strings = response.split("\"");
					response = strings.length > 3 ? strings[3] : "";
					response = String_ESU_X_uRIencodeToURIdecode._E(response,
							"UTF8");
					if (page_X_S_s.app_S.CacheStringPiple.size() < 301) {// buman
						page_X_S_s.app_S.CacheString.put(keyCache, response);
						page_X_S_s.app_S.CacheStringPiple.add(0, keyCache);
					} else {// man
						page_X_S_s.app_S.CacheString.put(keyCache, response);
						page_X_S_s.app_S.CacheStringPiple.add(0, keyCache);
						page_X_S_s.app_S.CacheString.remove(
								page_X_S_s.app_S.CacheStringPiple.get(300));
						page_X_S_s.app_S.CacheStringPiple.remove(300);
					}
				} else {
					response = page_X_S_s.app_S.CacheString.getString(keyCache);
				}
				// dnn森林
				String[] dnn = response.replace("\r\n", "<br/>").split("<br/>");
				page_X_S_s.app_S.coAuthorForWord.bootDetaDnnFlowerForest(
						page_X_S_s.table.getValueAt(page_X_S_s.row, 2)
								.toString(),
						dnn, true);
				// (this.app_S.table.getValueAt(row, 2).toString(), false);
				IMV_SIQ_SS map = new IMV_SIQ_SS();
				iterator = setsForGet.iterator();
				NE.app_S.listCharPosition = 0;
				Here: while (iterator.hasNext()) {
					NE.app_S.listCharPosition++;
					setOfi = iterator.next();
					if (page_X_S_s.pos.get(setOfi) == null) {
						page.append("<span style=\"background:#F1F1F1\">"
								+ "<font color=\"black\" size=\""
								+ NE.app_S.size_font_rot + "\">" + setOfi
								+ "</font></span>");
						continue Here;
					}
					if ((S_Maps.mingCi.containsKey(setOfi)
							|| S_Maps.dongCi.containsKey(setOfi)
							|| S_Maps.xingRongCi.containsKey(setOfi))) {
						if (map.containsKey(setOfi)) {
							WordFrequency wordFrequency = map.getW(setOfi);
							wordFrequency
									.I_frequency(wordFrequency.get_frequency()
											+ S_Pos.INT_ONE);
							wordFrequency.positions
									.add(NE.app_S.listCharPosition);
							map.put(setOfi, wordFrequency);
						} else {
							WordFrequency wordFrequency = new WordFrequency(1.0,
									setOfi);
							wordFrequency.positions
									.add(NE.app_S.listCharPosition);
							map.put(setOfi, wordFrequency);
						}
					}
					if (!setOfi.equals("")) {
						if (response.contains(setOfi) && setOfi.length() > 1) {
							page.append("<span style=\"background:"
									+ Color_P.P(255, 145, 255) + "\">"
									+ "<font color=\"black\" size=\""
									+ NE.app_S.size_font_rot + "\">" + setOfi
									+ "</font></span>");
							continue Here;
						}
						if (page_X_S_s.key.contains(setOfi) && (S_Maps.mingCi
								.containsKey(setOfi)
								|| S_Maps.dongCi.containsKey(setOfi)
								|| S_Maps.xingRongCi.containsKey(setOfi))) {
							page.append("<span style=\"background:red\">"
									+ "<font color=\"white\">" + setOfi
									+ "</font></span>");
							continue Here;
						}
						if (S_Maps.mingCi.containsKey(setOfi)) {
							page.append("<span style=\"background:"
									+ Color_P.P(255, 245, 255) + "\">"
									+ "<font color=\"black\" size=\""
									+ NE.app_S.size_font_rot + "\">" + setOfi
									+ "</font></span>");
							continue Here;
						}
						if (S_Maps.dongCi.containsKey(setOfi)) {
							page.append("<span style=\"background:"
									+ Color_P.P(245, 255, 245) + "\">"
									+ "<font color=\"black\" size=\""
									+ NE.app_S.size_font_rot + "\">" + setOfi
									+ "</font></span>");
							continue Here;
						}
						if (S_Maps.xingRongCi.containsKey(setOfi)) {
							page.append("<span style=\"background:"
									+ Color_P.P(255, 255, 245) + "\">"
									+ "<font color=\"black\" size=\""
									+ NE.app_S.size_font_rot + "\">" + setOfi
									+ "</font></span>");
							continue Here;
						}
						if (page_X_S_s.pos.getString(setOfi).contains("副")) {
							page.append("<span style=\"background:#F1FFFF\">"
									+ "<font color=\"black\" size=\""
									+ NE.app_S.size_font_rot + "\">" + setOfi
									+ "</font></span>");
							continue Here;
						}
						page.append("<span style=\"background:white\">"
								+ "<font color=\"black\" size=\""
								+ NE.app_S.size_font_rot + "\">" + setOfi
								+ "</font></span>");
					}
				}
				page_X_S_s.buttonSum
						.setText("共有 "
								+ (page_X_S_s.sets == null ? 0
										: (1 + page_X_S_s.sets.size() / 2001))
								+ " 页");
				page_X_S_s.buttonCrt
						.setText("当前页面：" + (page_X_S_s.sets == null ? 0 : 1));
				page_X_S_s.data.setText(page.toString());
				page_X_S_s.data.setSelectionStart(0);
				page_X_S_s.data.setSelectionEnd(0);
				page_X_S_s.data.validate();
				//
				page_X_S_s.statistic.setSize(500, 800);
				// Map<Integer, WordFrequency> fwa=
				// _A.sortWordFrequencyMapToSortMap(map);
				page_X_S_s.statistic.setContentType("text/html");
				StringBuilder stringBuilder = new StringBuilder();
				String[] fwa = response.replace("\r\n", "<br/>").split("<br/>");
				Here: for (int i = fwa.length - 1; i > 0; i--) {
					if (fwa[i] != null) {
						if (page_X_S_s.pos
								.getString(fwa[i].split(":")[0]) == null) {
							stringBuilder
									.append("<div style=\"background:white\">"
											+ "<font color=\"black\">" + fwa[i]
											+ "</font></div>");
							continue Here;
						}
						if (S_Maps.mingCi.containsKey(fwa[i].split(":")[0])) {
							stringBuilder
									.append("<div style=\"background:#FF44FF\">"
											+ "<font color=\"white\">" + fwa[i]
											+ "</font></div>");
							continue Here;
						}
						if (S_Maps.dongCi.containsKey(fwa[i].split(":")[0])) {
							stringBuilder
									.append("<div style=\"background:#8CEA00\">"
											+ "<font color=\"black\""
											+ " size=\""
											+ NE.app_S.size_font_rot + "\">"
											+ fwa[i] + "</font></div>");
							continue Here;
						}
						if (S_Maps.xingRongCi
								.containsKey(fwa[i].split(":")[0])) {
							stringBuilder
									.append("<div style=\"background:#FF9224\">"
											+ "<font color=\"black\""
											+ " size=\""
											+ NE.app_S.size_font_rot + "\">"
											+ fwa[i] + "</font></div>");
						}
					}
				}
				page_X_S_s.statistic.setText(stringBuilder.toString());
				page_X_S_s.statistic.setSelectionStart(0);
				page_X_S_s.statistic.setSelectionEnd(0);
				page_X_S_s.statistic.validate();
			}
		});
		return buttonKSLJ;
	}
}
//109 //                            WordFrequency wordFrequency = new WordFrequency();
////                            wordFrequency.I_frequency(1.0);
////                            wordFrequency.I_Word(setOfi);