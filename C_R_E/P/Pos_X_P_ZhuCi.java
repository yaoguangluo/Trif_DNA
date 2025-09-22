package P;

import C_A.OCI.ME.pos.CP.X_P_ZhuCi;
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

public class Pos_X_P_ZhuCi extends Pos_X_P_MingCi implements X_P_ZhuCi {
	// 60
	private boolean returnFind(String firstChar, String secondChar) {
		if (S_Maps.fuCi.containsKey(firstChar)) {
			return true;
		}
		if (S_Maps.fuCi.containsKey(secondChar)) {
			return true;
		}
		if (S_Maps.fuCi.containsKey(firstChar + secondChar)) {
			return true;
		}
		if (!wordsForest.containsKey(firstChar)) {
			return true;
		}
		if (!wordsForest.containsKey(secondChar)) {
			return true;
		}
		return false;
	}

	// 去else !A&&!B&&!C= !(A+B+C)
	public int P_ZhuCiOfThree(List<String> outputList, int countLength,
			String[] strings, StringBuilder[] fixWord) {
		if (S_Pos.INT_ZERO == outputList.size()) {
			didNotFindFirstChar(outputList, strings, fixWord);
			return countLength;
		}
		if (wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
			if (S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
				if (wordsForest.containsKey(strings[S_Pos.INT_TWO])) {
					countLength = charOfThree(countLength, outputList, strings,
							fixWord);//trif-countLength
					return countLength;
				}
				outputList.add(strings[S_Pos.INT_ZERO]);
				fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWord[S_Pos.INT_ZERO].length());
				fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
				return countLength = S_Pos.INT_ONE;
			}
			if (fixWord[S_Pos.INT_ONE].length() > S_Pos.INT_ONE) {
				String firstChar = S_Pos.EMPTY_STRING
						+ fixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO);// later..
				String secondChar = S_Pos.EMPTY_STRING
						+ fixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ONE);
				boolean find = returnFind(firstChar, secondChar);
				if (!find) {
					outputList.add(strings[S_Pos.INT_ZERO]);
					fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWord[S_Pos.INT_ZERO].length());
					fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
					countLength = S_Pos.INT_ONE;
					if (wordsForest.containsKey(strings[S_Pos.INT_TWO])) {
						outputList.add(strings[S_Pos.INT_TWO]);
						fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
								fixWord[S_Pos.INT_ZERO].length());
						fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
						countLength = S_Pos.INT_THREE;
					}
					return countLength;
				}
			}
			if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
				outputList.add(strings[S_Pos.INT_ONE]);
				fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWord[S_Pos.INT_ZERO].length());
				fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
				return countLength - S_Pos.INT_ONE;
			}
			if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_TWO])) {
				outputList.add(strings[S_Pos.INT_ZERO]);
				outputList.add(strings[S_Pos.INT_TWO]);
				fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWord[S_Pos.INT_ZERO].length());
				fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
				return countLength;
			}
		}
		return countLength;
	}

	public int P_ZhuCiOfThreeForMap(IMV_SIQ_SS outputList, int countLength,
			String[] strings, StringBuilder[] fixWord, App NE) {
		if (S_Pos.INT_ZERO == outputList.size()) {
			didNotFindFirstCharForMap(outputList, strings, fixWord, NE);
			return countLength;
		}
		if (!wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
			return countLength;
		}
		if (S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())) {
			countLength = charOfThreeForMap(countLength, outputList, strings,
					fixWord, NE);
			return countLength;
		}
		countLength -= S_Pos.INT_THREE;
		if (wordsForest.containsKey(strings[S_Pos.INT_ONE])) {
			WordFrequency wordFrequency;
			if (outputList.containsKey(strings[S_Pos.INT_ONE])) {
				wordFrequency = outputList.getW(strings[S_Pos.INT_ONE]);
				wordFrequency.I_frequency(
						wordFrequency.get_frequency() + S_Pos.INT_ONE);
			} else {
				wordFrequency = new WordFrequency(1.0, strings[S_Pos.INT_ONE]);
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
//125 //				wordFrequency= new WordFrequency();
////				wordFrequency.I_frequency(1.0);
////				wordFrequency.I_Word(strings[S_Pos.INT_ONE]);