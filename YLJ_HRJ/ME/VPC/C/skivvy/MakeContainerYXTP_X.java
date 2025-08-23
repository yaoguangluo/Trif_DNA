package ME.VPC.C.skivvy;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.tabbedpane.DetabbedPane;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.list.List_ESU_X_listToArray;

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class MakeContainerYXTP_X extends Thread implements Runnable {
	public Container jpanelFourth;
	public App_S app;
	public DetabbedPane jTabbedpane;
	public List<String> tabNames;
	public CogsBinaryForest_AE _A;
	public IMV_SIQ pos;
	public IMV_SIQ pose;
	public IMV_SIQ etc;
	public IMV_SIQ cte;
	// buff spee cacu
	// string xiao kuai gao
	// button da man di
	public Map<String, LinkedList<String>> listMap = new IMV_SIQ();
	public Map<String, LinkedList<String>> showMap = new IMV_SIQ();
	public Map<String, BufferedImage> cacuMap = new LinkedHashMap<>();
	public List<String> cacuPip = new LinkedList<>();
	public LinkedList<String> typeList = new LinkedList<>();
	public int flip = 0;
	public int flop = 0;
	public DetaButton topButton;
	public DetaButton leftButton;
	public String nullPG;
	public BufferedImage bufferedImageNullPG;
	// public LinkedList<DetaButton> topList= new
	// LinkedList<>();

	public MakeContainerYXTP_X(Container jpanelFourth, List<String> tabNames2,
			App NE) {
		super();
		this.jpanelFourth = jpanelFourth;
		this.app = NE.app_S;// later in super.
		this.tabNames = tabNames2;
		this.jTabbedpane = this.app.jTabbedpane;
		this._A = this.app._A;
		this.pos = this.app.fMHMMListOneTime_E_X_S.posCnToCn;
		this.pose = this.app.fMHMMListOneTime_E_X_S.posEnToEn;
		this.etc = this.app.fMHMMListOneTime_E_X_S.fullEnToCn;
		this.cte = this.app.fMHMMListOneTime_E_X_S.fullCnToEn;
	}

	public void AOP_VEC_SQ(String input, App NE) {
		// listMap;
		// get listmap from string[]
		Iterator<String> iterator = showMap.keySet().iterator();
		while (iterator.hasNext()) {
			String type = iterator.next();
			LinkedList<String> copy = showMap.get(type);
			LinkedList<String> output = sort(copy, input, NE);
			// if(!output.isEmpty()) {
			listMap.put(type, output);
			// }
		}
		if (null == topButton) {
			return;// trif all later
		}
		topButton.doClick();

		String string = typeList.get(typeList.size() - 1);
		for (int i = typeList.size() - 1; i > 0; i--) {
			typeList.set(i, typeList.get(i - 1));
		}
		typeList.set(0, string);
		leftButton.doClick();
	}

	public void AOP_VEC_SQ_PDE(List<String> pathRankList) {
		// listMap;
		Map<String, Boolean> map = new IMV_SIQ();
		Iterator<String> iteratorPathRankList = pathRankList.iterator();
		while (iteratorPathRankList.hasNext()) {
			String StringPath = iteratorPathRankList.next();
			String[] strings = StringPath.split(S_ShellETL.SHELL_ETL_GREATER);
			if (strings.length > 1) {
				map.put(StringPath.split(S_ShellETL.SHELL_ETL_GREATER)[1],
						true);
			}
		}

		// get listmap from string[]
		Iterator<String> iterator = showMap.keySet().iterator();
		while (iterator.hasNext()) {
			LinkedList<String> output = new LinkedList<>();
			String type = iterator.next();
			LinkedList<String> copy = showMap.get(type);
			Iterator<String> iteratorPath = copy.iterator();
			while (iteratorPath.hasNext()) {
				String StringPath = iteratorPath.next();
				if (null != StringPath) {
					// System.out.println(StringPath.replace("\\", "/"));
					String[] StringsPath = StringPath.replace("\\", "/")
							.split("/");
					if (StringsPath.length > 1) {
						if (map.containsKey(
								StringsPath[StringsPath.length - 1])) {
							output.add(StringPath);
						}
					}
				}
			}
			// if(!output.isEmpty()) {
			listMap.put(type, output);
			// }
		}
		topButton.doClick();

		String string = typeList.get(typeList.size() - 1);
		for (int i = typeList.size() - 1; i > 0; i--) {
			typeList.set(i, typeList.get(i - 1));
		}
		typeList.set(0, string);
		leftButton.doClick();
	}

	public LinkedList<String> sort(List<String> copy, String key, App NE) {
		LinkedList<String> output = new LinkedList<>();
		String[] score = new String[copy.size()];
		int[] score_code = new int[copy.size()];
		int[] reg = new int[copy.size()];
		// int count= 0;
		IMV_SIQ_SS mapSearchWithoutSort = null;
		// Map<Integer, WordFrequency> mapSearchWithSort= null;
		mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(key, NE);
		Iterator<String> iteratorForCopy = copy.iterator();
		int copyCount = 0;
		List<String> list = _A.parserMixedString(key);
		String[] string = List_ESU_X_listToArray._E(list);

		String[] stringReg = new String[key.length() / 3];
		for (int i = 0; i < stringReg.length; i++) {
			stringReg[i] = key.substring(i * 3,
					(i * 3 + 3) < key.length() ? (i * 3 + 3)
							: key.length() - 1);
		}
		while (iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			// String temps=
			// dic_map.get(iteratorForCopyString).toString();
			String temps = iteratorForCopyString;
			Iterator<String> iteratorWordFrequency = mapSearchWithoutSort
					.keySet().iterator();
			Here: while (iteratorWordFrequency.hasNext()) {
				String mapSearchaAtII = iteratorWordFrequency.next();
				WordFrequency wordFrequencySearch = mapSearchWithoutSort
						.getW(mapSearchaAtII);
				int wfs = (int) wordFrequencySearch.get_frequency();
				wfs = wfs > 5 ? 5 : wfs;
				if (temps.contains(mapSearchaAtII)) {
					if (reg[copyCount] == 0) {
						// count += 1;
					}
					score[copyCount] = iteratorForCopyString;
					if (score[copyCount].contains(key.replace(" ", ""))) {
						reg[copyCount] += 500;
					}
					if (key.contains(score[copyCount].replace(" ", ""))) {
						reg[copyCount] += 500;
					}
					if (!pos.containsKey(mapSearchaAtII)) {
						reg[copyCount] += 1;
						score_code[copyCount] += 1 << mapSearchaAtII
								.length() << wfs;
						continue Here;
					}
					if (S_Maps.mingCi.containsKey(mapSearchaAtII)
							|| S_Maps.dongCi.containsKey(mapSearchaAtII)
							|| S_Maps.xingRongCi.containsKey(mapSearchaAtII)
							|| S_Maps.weiCi.containsKey(mapSearchaAtII)) {
						reg[copyCount] += 2;
					}
					reg[copyCount] += 1;
					score_code[copyCount] += (iteratorForCopyString
							.contains(mapSearchaAtII) ? 2 : 1)
							* (!S_Maps.mingCi.containsKey(mapSearchaAtII)
									? S_Maps.dongCi.containsKey(mapSearchaAtII)
											? 50
											: 1
									: 50) << mapSearchaAtII.length() * wfs;
					continue Here;
				}
				if (mapSearchaAtII.length() > 1) {
					for (int j = 0; j < mapSearchaAtII.length(); j++) {
						String temp = "" + mapSearchaAtII.charAt(j);
						if (temps.contains(String.valueOf(temp))) {
							if (reg[copyCount] == 0) {
								// count += 1;
							}
							score[copyCount] = iteratorForCopyString;
							score_code[copyCount] += 1;
							if (S_Maps.CiOne.containsKey(temp) && (S_Maps.mingCi
									.containsKey(temp)// later..
									|| S_Maps.dongCi.containsKey(temp)
									|| S_Maps.xingRongCi.containsKey(temp)
									|| S_Maps.weiCi.containsKey(temp))) {
								reg[copyCount] += 2;
							}
							reg[copyCount] += 1;
							continue Here;
						}
					}
				}
			}
			score_code[copyCount] = score_code[copyCount] * reg[copyCount];
			//
			int code = 100;
			int tempb = 0;
			int tempa = score_code[copyCount];
			if (key.length() > 4) {
				//
				for (int i = 0; i < string.length; i++) {
					if (temps.contains(string[i])) {
						tempb += code;
					}
				}
				//
				for (int i = 0; i < stringReg.length; i++) {
					if (temps.contains(stringReg[i])) {
						tempb += code;
					}
				}
				score_code[copyCount] = (int) (tempa
						/ Math.pow(this.app.lookrot + 1, 4)
						+ tempb * Math.pow(this.app.lookrot, 2));
			}
			if (key.replace(" ", "").length() > 1
					&& key.replace(" ", "").length() < 5) {
				if (temps.contains(key)) {
					tempb += code << 7;
				}
				score_code[copyCount] = (int) (tempa
						/ Math.pow(this.app.lookrot + 1, 4)
						+ tempb * Math.pow(this.app.lookrot, 2));
			}
			copyCount++;
		}
		NE.app_S.lYGSortESU9D.javaSort(score_code, score);
		Here: for (int i = copy.size() - 1; i > -1; i--) {
			if (score_code[i] < 1) {
				continue Here;
			}
			if (app.shuming_filter_box.isSelected()) {
				String wei = score[i];
				String temp = app.name_filter.getText();
				for (int j = 0; j < temp.length(); j++) {
					if (wei.contains("" + temp.charAt(j))) {
						continue Here;
					}
				}
			}
			output.add(score[i]);
		}
		return output;
	}
}