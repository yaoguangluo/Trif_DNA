package U_V.OEU.xqpx.wcms.sort;
//import java.io.BufferedReader;

//import java.io.InputStream;
//import java.io.InputStreamReader;

import S_A.pheromone.IMV_SIQ;

import java.util.Map;

//import SVQ.stable.S_File;
//import PEU.S.verbal.VerbalSource;
//今天将新陈代谢技术应用到 chinesePinYin笔画分词上.

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("unchecked")
public class LYG10D13D_X_S implements LYG10D13D_X_SC {
	public Map<String, Boolean> find = new IMV_SIQ();
	public Map<String, String> pinyin;
	public Map<String, Integer> filter = new IMV_SIQ();
	public int range;
	public int deeps;
	public String numbers = "0123456789.Ee";
	public Map<String, Integer> bihua;

	public boolean findSmallWithTwoChar(String x1, String x2, int scale,
			int point) {
		if (x1.length() <= point || x2.length() <= point) {
			if (x1.length() < x2.length()) {
				for (int p = 0; p < scale; p++) {
					if (!(x1.length() <= p || x2.length() <= p)) {
						if (x1.charAt(p) != x2.charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}
		// else {//多余 条件 -trif
		boolean hasX1 = pinyin.containsKey("" + x1.charAt(point));
		boolean hasX2 = pinyin.containsKey("" + x2.charAt(point));
		if (!(!hasX1 || !hasX2)) {
			String[] js = new String[2];
			js[0] = this.pinyin.get("" + x1.charAt(point));
			js[1] = this.pinyin.get("" + x2.charAt(point));
			boolean changepinyin = processSortpinyin(js, 3);
			return changepinyin;
		} else if (!(hasX1 || hasX2)) {
			if (x1.toLowerCase().charAt(point) > x2.toLowerCase()
					.charAt(point)) {
				return true;
			} else if (x1.toLowerCase().charAt(point) == x2.toLowerCase()
					.charAt(point)) {
				return x1.charAt(point) > x2.charAt(point);
			}
			return false;
		} else if (!(hasX1 || !hasX2)) {
			return true;
		}
		// }
		return false;
	}

	public boolean processSortpinyin(String[] kernel, int scale) {
		for (int k = 0; k < scale; k++) {
			if (kernel[0].length() <= k || kernel[1].length() <= k) {
				if (kernel[0].length() > kernel[1].length()) {
					return true;
				}
				return false;
			}
			if (kernel[0].toLowerCase().charAt(k) > kernel[1].toLowerCase()
					.charAt(k)) {
				return true;
			}
			if (kernel[0].toLowerCase().charAt(k) < kernel[1].toLowerCase()
					.charAt(k)) {
				return false;
			}
		}
		if (kernel[0].length() > kernel[1].length()) {
			return true;
		}
		return false;
	}
}
