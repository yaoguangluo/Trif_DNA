package ECE;

import C_A.OCI.ME.pos.C.X_E;
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

public class Pos_X_E extends Pos_X_O implements X_E {
	public void I_FixWordsOfTwo(int charPosition, StringBuilder inputString,
			StringBuilder[] fixWords) {
		fixWords[S_Pos.INT_ONE].delete(S_Pos.INT_ZERO,
				fixWords[S_Pos.INT_ONE].length());
		if (charPosition + S_Pos.INT_SEVEN < inputString.length()) {
			fixWords[S_Pos.INT_ONE]
					.append(inputString.substring(charPosition + S_Pos.INT_TWO,
							charPosition + S_Pos.INT_SEVEN));
			return;
		}
		fixWords[S_Pos.INT_ONE].append(inputString
				.substring(charPosition + S_Pos.INT_TWO, inputString.length()));
	}

	// !(A(B+C+D))=!A+!(B+C+D)
	public int loopCheckBackFix(StringBuilder[] fixWord, int backPosition,
			int countLength, List<String> outputList, String[] strings,
			int[] nestCountInputStringLength) {
		String charPositionAtFixWord = S_Pos.EMPTY_STRING
				+ fixWord[S_Pos.INT_ONE].charAt(backPosition);
		if (!wordsForest.containsKey(charPositionAtFixWord)
				|| !(S_Maps.zhuCi.containsKey(charPositionAtFixWord)
						|| S_Maps.shengLueCi.containsKey(charPositionAtFixWord)
						|| S_Maps.fuCi.containsKey(charPositionAtFixWord))) {
			return S_Pos.INT_ERROR;
		}
		if (!wordsForest.get(fixWord[S_Pos.INT_ZERO].toString()).toString()
				.contains(S_Pos.NLP_CI_SHENG_LUE)
				&& wordsForest.get(charPositionAtFixWord).toString()
						.contains(S_Pos.NLP_CI_FU)) {
			return S_Pos.INT_ERROR;
		}//trif-countLength
		nestCountInputStringLength[S_Pos.INT_ZERO] = charOfThree(countLength,
				outputList, strings, fixWord);
		return S_Pos.INT_RIGHT;
	}

	// }
//	return S_Pos.INT_ERROR;
	public void didNotFindFirstChar(List<String> outputList, String[] strings,
			StringBuilder[] fixWord) {
		if (!wordsForest.containsKey(strings[S_Pos.INT_TWO])) {
			if (wordsForest.containsKey(strings[S_Pos.INT_ONE])) {
				outputList.add(strings[S_Pos.INT_ONE]);
				outputList.add(strings[S_Pos.INT_THREE]);
				fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWord[S_Pos.INT_ZERO].length());
				fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_THREE]);
			}
			return;
		}
		if (S_Maps.fuCi.containsKey(strings[S_Pos.INT_TWO])) {
			outputList.add(strings[S_Pos.INT_ZERO]);
			outputList.add(strings[S_Pos.INT_TWO]);
			fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					fixWord[S_Pos.INT_ZERO].length());
			fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
			return;
		}
		if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
			outputList.add(strings[S_Pos.INT_ONE]);
			outputList.add(strings[S_Pos.INT_THREE]);
			fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					fixWord[S_Pos.INT_ZERO].length());
			fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_THREE]);
		}
	}

	public int loopCheckBackFixForMap(StringBuilder[] fixWord, int backPosition,
			int countLength, IMV_SIQ_SS outputList, String[] strings,
			int[] nestCountInputStringLength, App NE) {
		String charPositionAtFixWord = S_Pos.EMPTY_STRING
				+ fixWord[S_Pos.INT_ONE].charAt(backPosition);
		if (wordsForest.containsKey(charPositionAtFixWord)
				&& (S_Maps.zhuCi.containsKey(charPositionAtFixWord)
						|| wordsForest.get(charPositionAtFixWord).toString()
								.contains(S_Pos.NLP_CI_SHENG_LUE))) {
			nestCountInputStringLength[S_Pos.INT_ZERO] = charOfThreeForMap(
					countLength, outputList, strings, fixWord, NE);
			return S_Pos.INT_RIGHT;
		}
		return S_Pos.INT_ERROR;
	}

	public void didNotFindFirstCharForMap(IMV_SIQ_SS outputList,
			String[] strings, StringBuilder[] fixWord, App NE) {
		if (!wordsForest.containsKey(strings[S_Pos.INT_TWO])) {
			return;
		}
		if (S_Maps.fuCi.containsKey(strings[S_Pos.INT_TWO])) {
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
		}
	}
}
//112 //				WordFrequency wordFrequency= new WordFrequency();
////				wordFrequency.I_frequency(1.0);
////				wordFrequency.I_Word(strings[S_Pos.INT_ZERO]);

//120 //				WordFrequency wordFrequency= new WordFrequency();
////				wordFrequency.I_frequency(1.0);
////				wordFrequency.I_Word(strings[S_Pos.INT_TWO]);