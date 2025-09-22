//YLJ_HRJ/ME/APM/VSQ/AppButtonUtil.java
package ME.VPC.V.appButton;

import ME.VPC.S.ne.App_S;
import ME.VPC.M.app.App;
import P.image.Color_P;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;
import java.util.List;
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
public class AppButtonUtil_X_pageenglish {
	// StringBuilder page= new StringBuilder().append("");
	// AppPageUtil.pageSIMILAR(page, etc, cte, key, pos, sets,
	// currentPage);

	// StringBuilder page= new StringBuilder().append("");
	// AppPageUtil.pageflipPages(page, map, key, pos, sets,
	// currentPage);
	// symnorine,
	public static void pageenglish(StringBuilder page, String key,
			List<String> sets, int currentPage, App NE) {
		List<String> setsForGet = sets.subList(currentPage * 2000,
				(currentPage + 1) * 2000 < sets.size()
						? (currentPage + 1) * 2000
						: sets.size());
		App_S u = NE.app_S;
		if (null == u) {
			return; /// fatal trif
		}
		IMV_SIQ pos = u.fMHMMListOneTime_E_X_S.posCnToCn;
		IMV_SIQ cte = u.fMHMMListOneTime_E_X_S.fullCnToEn;
		Iterator<String> iterator = setsForGet.iterator();
		Here: while (iterator.hasNext()) {
			String setOfi = iterator.next();
			if (pos.get(setOfi) == null) {
				page.append("<span style=\"background:#ffffff\">"
						+ "<font color=\"black\"" + " size=\""
						+ NE.app_S.size_font_rot + "\">" + setOfi
						+ (cte.containsKey(setOfi)
								? ":(" + cte.get(setOfi) + ")"
								: "")
						+ "</font></span>");
				continue Here;
			}
			if (!setOfi.equals("")) {
				if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
						|| S_Maps.dongCi.containsKey(setOfi)
						|| S_Maps.xingRongCi.containsKey(setOfi))) {
					page.append("<span style=\"background:red\">"
							+ "<font color=\"white\">" + setOfi
							+ (cte.containsKey(setOfi)
									? ":(" + cte.get(setOfi) + ")"
									: "")
							+ "</font></span>");
					continue Here;
				}
				if (S_Maps.mingCi.containsKey(setOfi)) {
					page.append("<span style=\"background:"
							+ Color_P.P(245, 245 - 40 - NE.app_S.raterot << 3,
									245)
							+ "\"><font color=" + Color_P.P(0, 0, 0)
							+ " size=\"" + NE.app_S.size_font_rot + "\">"
							+ setOfi
							+ (cte.containsKey(setOfi)
									? ":(" + cte.get(setOfi) + ")"
									: "")
							+ "</font></span>");
					continue Here;
				}
				if (S_Maps.dongCi.containsKey(setOfi)) {
					page.append("<span style=\"background:"
							+ Color_P.P(255 - NE.app_S.raterot << 3, 245,
									245 - 40 - NE.app_S.raterot << 3)
							+ "\"><font color=" + Color_P.P(0, 0, 0)
							+ " size=\"" + NE.app_S.size_font_rot + "\">"
							+ setOfi
							+ (cte.containsKey(setOfi)
									? ":(" + cte.get(setOfi) + ")"
									: "")
							+ "</font></span>");
					continue Here;
				}
				if (S_Maps.xingRongCi.containsKey(setOfi)) {
					page.append("<span style=\"background:"
							+ Color_P.P(255, 255,
									255 - 40 - NE.app_S.raterot << 3)
							+ "\"><font color=" + Color_P.P(0, 0, 0)
							+ " size=\"" + NE.app_S.size_font_rot + "\">"
							+ setOfi
							+ (cte.containsKey(setOfi)
									? ":(" + cte.get(setOfi) + ")"
									: "")
							+ "</font></span>");
					continue Here;
				}
				if (pos.getString(setOfi).contains("副")) {
					page.append(
							"<span style=\"background:"
									+ Color_P.P(255 - NE.app_S.raterot << 3,
											255, 255)
									+ "\">" + "<font color="
									+ Color_P.P(0, 0, 0) + " size=\""
									+ NE.app_S.size_font_rot + "\">" + setOfi
									+ (cte.containsKey(setOfi)
											? ":(" + cte.get(setOfi) + ")"
											: "")
									+ "</font></span>");
					continue Here;
				}
				page.append("<span style=\"background:white\">"
						+ "<font color=\"black\"" + " size=\""
						+ NE.app_S.size_font_rot + "\">" + setOfi
						+ (cte.containsKey(setOfi)
								? ":(" + cte.get(setOfi) + ")"
								: "")
						+ "</font></span>");
			}
		}
	}
}
