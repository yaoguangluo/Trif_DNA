package P;

import C_A.OCI.ME.pos.CP.X_P_JieCi;
import ECE.Pos_X_E;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Pos_X_P_JieCi extends Pos_X_E implements X_P_JieCi {
	public int P_JieCiOfThree(List<String> outputList, int countLength,
			String[] strings, StringBuilder[] fixWord) {
		if (S_Pos.INT_ZERO == outputList.size()
				&& (wordsForest.get(strings[S_Pos.INT_TWO]).toString()
						.contains(S_Pos.NLP_CI_WEI))) {
			outputList.add(strings[S_Pos.INT_ZERO]);
			outputList.add(strings[S_Pos.INT_TWO]);
			fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					fixWord[S_Pos.INT_ZERO].length());
			fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
			return countLength;
		}
		if (outputList.size() > S_Pos.INT_ZERO// later do
				&& wordsForest
						.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
			if (S_Maps.qingTaiCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
					|| S_Maps.weiCi
							.containsKey(fixWord[S_Pos.INT_ZERO].toString())
					|| S_Maps.lianCi
							.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
				countLength = charOfThree(countLength, outputList, strings,
						fixWord);//trif-countLength
				return countLength;
			} else {
				if (S_Maps.dongCi
						.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
					if (S_Maps.xingWeiCi.containsKey(strings[S_Pos.INT_ONE])
							|| S_Maps.xingRongCi
									.containsKey(strings[S_Pos.INT_ONE])) {
						countLength = twoCharOfThree(countLength, outputList,
								strings, fixWord);//trif-countLength
						return countLength;
					}
				}
				if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_TWO])) {
					outputList.add(strings[S_Pos.INT_ZERO]);
					outputList.add(strings[S_Pos.INT_TWO]);
					fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWord[S_Pos.INT_ZERO].length());
					fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
					return countLength;
				} else if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
					if (S_Maps.jieCi.containsKey(strings[S_Pos.INT_ONE])) {
						countLength = twoCharOfThree(countLength, outputList,
								strings, fixWord);//trif-countLength
						return countLength;
					}
					outputList.add(strings[S_Pos.INT_ONE]);
					fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWord[S_Pos.INT_ZERO].length());
					fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
					countLength = S_Pos.INT_TWO;
					return countLength;
				} else if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_TWO])) {
					outputList.add(strings[S_Pos.INT_ZERO]);
					outputList.add(strings[S_Pos.INT_TWO]);
					fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWord[S_Pos.INT_ZERO].length());
					fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
					return countLength;
				}
			}
		}
		if (S_Maps.jieCi.containsKey(strings[S_Pos.INT_ONE])) {
			countLength = twoCharOfThree(countLength, outputList, strings,
					fixWord);//trif-countLength
			return countLength;
		}
		outputList.add(strings[S_Pos.INT_ZERO]);
		if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_TWO])) {
			outputList.add(strings[S_Pos.INT_TWO]);
			fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					fixWord[S_Pos.INT_ZERO].length());
			fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
			return countLength;
		}
		fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				fixWord[S_Pos.INT_ZERO].length());
		fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
		return countLength = S_Pos.INT_ONE;
	}

	public int P_JieCiOfThreeForMap(IMV_SIQ_SS outputList, int countLength,
			String[] strings, StringBuilder[] fixWord, App NE) {
		if (outputList.size() == S_Pos.INT_ZERO
				&& S_Maps.weiCi.containsKey(strings[S_Pos.INT_TWO])) {
			if (outputList.containsKey(strings[S_Pos.INT_ZERO])) {
				WordFrequency wordFrequency = outputList
						.getW(strings[S_Pos.INT_ZERO]);
				wordFrequency.I_frequency(
						wordFrequency.get_frequency() + S_Pos.INT_ONE);
				wordFrequency.positions.add(NE._I_U.parserCharPosition);
				outputList.put(strings[S_Pos.INT_ZERO], wordFrequency);
			} else {
				WordFrequency wordFrequency = new WordFrequency(1.0,
						strings[S_Pos.INT_ZERO]);
				wordFrequency.positions.add(NE._I_U.parserCharPosition);
				outputList.put(strings[S_Pos.INT_ZERO], wordFrequency);
			}
			if (outputList.containsKey(strings[S_Pos.INT_TWO])) {
				WordFrequency wordFrequency = outputList
						.getW(strings[S_Pos.INT_TWO]);
				wordFrequency.I_frequency(
						wordFrequency.get_frequency() + S_Pos.INT_ONE);
				wordFrequency.positions.add(NE._I_U.parserCharPosition);
				outputList.put(strings[S_Pos.INT_TWO], wordFrequency);
			} else {
				WordFrequency wordFrequency = new WordFrequency(1.0,
						strings[S_Pos.INT_TWO]);
				wordFrequency.positions.add(NE._I_U.parserCharPosition);
				outputList.put(strings[S_Pos.INT_TWO], wordFrequency);
			}
			fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					fixWord[S_Pos.INT_ZERO].length());
			fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
			return countLength;
		}
		if (outputList.size() > S_Pos.INT_ZERO && wordsForest
				.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
			if (S_Maps.lianCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
					|| S_Maps.qingTaiCi
							.containsKey(fixWord[S_Pos.INT_ZERO].toString())
					|| S_Maps.weiCi
							.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
				countLength = charOfThreeForMap(countLength, outputList,
						strings, fixWord, NE);
				return countLength;
			} else {
				countLength -= S_Pos.INT_THREE;
				if (wordsForest.containsKey(strings[S_Pos.INT_ONE])) {
					WordFrequency wordFrequency;
					if (outputList.containsKey(strings[S_Pos.INT_ONE])) {
						wordFrequency = outputList.getW(strings[S_Pos.INT_ONE]);
						wordFrequency.I_frequency(
								wordFrequency.get_frequency() + S_Pos.INT_ONE);
					} else {
						wordFrequency = new WordFrequency(1.0,
								strings[S_Pos.INT_ONE]);
					}
					wordFrequency.positions.add(NE._I_U.parserCharPosition);
					outputList.put(strings[S_Pos.INT_ONE], wordFrequency);
					fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWord[S_Pos.INT_ZERO].length());
					fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
					countLength += S_Pos.INT_TWO;
				}
				return countLength;
			}
		}
		return countLength;
	}
}
//106 //				WordFrequency wordFrequency= new WordFrequency();
////				wordFrequency.I_frequency(1.0);
////				wordFrequency.I_Word(strings[S_Pos.INT_ZERO]);

//114 //				WordFrequency wordFrequency= new WordFrequency();
////				wordFrequency.I_frequency(1.0);
////				wordFrequency.I_Word(strings[S_Pos.INT_TWO]);

//139 //						WordFrequency wordFrequency= new WordFrequency();
////						wordFrequency.I_frequency(1.0);
////						wordFrequency.I_Word(strings[S_Pos.INT_ONE]);