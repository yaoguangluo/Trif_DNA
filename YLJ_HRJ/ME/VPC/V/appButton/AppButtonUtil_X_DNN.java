//YLJ_HRJ/ME/APM/VSQ/AppButtonUtil.java
package ME.VPC.V.appButton;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import P.image.Color_P;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;

import javax.swing.JTextPane;
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
//20230805
public class AppButtonUtil_X_DNN {
	public static boolean doResponseContainsSetofI(StringBuilder page,
			String setOfi, Map<String, Double> dNNrank, App NE) {
		App_S u = NE.app_S;
		IMV_SIQ pos = u.fMHMMListOneTime_E_X_S.posCnToCn;
		// System.out.println("root:"+ u.jsliderDNNRatio);
		u.appConfig.SectionJPanel.jTextPane
				.setText("root:" + u.jsliderDNNRatio);
		double rank = dNNrank.containsKey(setOfi) ? dNNrank.get(setOfi) : 0;
//        if (null == u.jsliderDNNRatio) {
//            u.jsliderDNNRatio = 0.0;
//        }
		double peak = dNNrank.size() * (u.jsliderDNNRatio / 20.1);
		if (S_Maps.mingCi.containsKey(setOfi)) {
			if (setOfi.length() > 2 || rank > peak) {
				page.append("<span style=\"background:"
						+ Color_P.P(255, 90, 255) + "\"><font color=\"black\""
						+ " size=\"" + NE.app_S.size_font_rot + "\">" + setOfi
						+ "</font></span>");
				return true;
			}
			page.append("<span style=\"background:" + Color_P.P(255, 210, 255)
					+ "\"><font color=\"black\"" + " size=\""
					+ NE.app_S.size_font_rot + "\">" + setOfi
					+ "</font></span>");
			return true;
		}
		if (S_Maps.dongCi.containsKey(setOfi)) {
			if (setOfi.length() > 2 || rank > peak) {
				page.append("<span style=\"background:" + Color_P.P(90, 255, 90)
						+ "\"><font color=\"black\"" + " size=\""
						+ NE.app_S.size_font_rot + "\">" + setOfi
						+ "</font></span>");
				return true;
			}
			page.append("<span style=\"background:" + Color_P.P(210, 255, 210)
					+ "\"><font color=\"black\"" + " size=\""
					+ NE.app_S.size_font_rot + "\">" + setOfi
					+ "</font></span>");
			return true;
		}
		if (S_Maps.xingRongCi.containsKey(setOfi)) {
			if (setOfi.length() > 2 || rank > peak) {
				page.append("<span style=\"background:"
						+ Color_P.P(255, 255, 90) + "\"><font color=\"black\""
						+ " size=\"" + NE.app_S.size_font_rot + "\">" + setOfi
						+ "</font></span>");
				return true;
			}
			page.append("<span style=\"background:" + Color_P.P(255, 255, 210)
					+ "\"><font color=\"black\"" + " size=\""
					+ NE.app_S.size_font_rot + "\">" + setOfi
					+ "</font></span>");
			return true;
		}
		return false;
	}

	public static void doRankDNN(JTextPane statistic, String response,
			IMV_SIQ pos, Map<String, Double> dNNrank, App NE) {
		try {
			statistic.setSize(500, 800);
			// Map<Integer, WordFrequency> fwa=
			// _A.sortWordFrequencyMapToSortMap(map);
			statistic.setContentType("text/html");
			StringBuilder stringBuilder = new StringBuilder();
			String[] fwa = response.replace("\r\n", "<br/>").split("<br/>");
			Here: for (int i = fwa.length - 1; i > 0; i--) {
				if (fwa[i] != null) {
					String[] strings = fwa[i].split(":");
					// DNNrank.put(strings[0], Double.valueOf(strings[1]));
					// 不需要怎么复杂
					dNNrank.put(strings[0], 0.0 + i);
					if (pos.get(strings[0]) == null) {
						stringBuilder.append("<div style=\"background:white\">"
								+ "<font color=\"black\">" + fwa[i]
								+ "</font></div>");
						continue Here;
					}
					if (pos.getString(strings[0]).contains("名")) {
						stringBuilder
								.append("<div style=\"background:#FF44FF\">"
										+ "<font color=\"white\">" + fwa[i]
										+ "</font></div>");
						continue Here;
					}
					if (pos.getString(strings[0]).contains("动")) {
						stringBuilder
								.append("<div style=\"background:#8CEA00\">"
										+ "<font color=\"black\"" + " size=\""
										+ NE.app_S.size_font_rot + "\">"
										+ fwa[i] + "</font></div>");
						continue Here;
					}
					if (pos.getString(strings[0]).contains("形")) {
						stringBuilder
								.append("<div style=\"background:#FF9224\">"
										+ "<font color=\"black\"" + " size=\""
										+ NE.app_S.size_font_rot + "\">"
										+ fwa[i] + "</font></div>");
					}
				}
			}
			statistic.setText(stringBuilder.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		} catch (Exception e1) {
			statistic.validate();
		}
	}
}
