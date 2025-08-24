//YLJ_HRJ/ME/APM/VSQ/AppButtonUtil.java
package ME.VPC.V.appButton;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import M_V.MSU.AMS.VQS.SQV.SI.OSU.SMV.http.RestCall_X_backEndRequest;
import M_V.MVQ.button.DetaButton;
import P.image.Color_P;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;
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
public class AppButtonUtil_X_DNN_Classify extends AppButtonUtil_X_DNN {
	public static void classifyDNN(StringBuilder page, List<String> sets,
			int currentPage, JTable table, int row, String key,
			DetaButton buttonSum, DetaButton buttonCrt, JTextPane data,
			JTextPane statistic, String zhong_xi_yao, App NE) {
		App_S u = NE.app_S;
		IMV_SIQ pos = u.fMHMMListOneTime_E_X_S.posCnToCn;
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
			String encode = String_ESU_X_stringToURIencode._E(string, "UTF8");
			response = RestCall_X_backEndRequest._E(encode);
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
					;
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
