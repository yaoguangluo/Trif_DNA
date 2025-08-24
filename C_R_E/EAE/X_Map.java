package EAE;

import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import C_A.OCI.ME.analysis.C.A_X_Map;
import E_A.ME.analysis.E.AE;
import ME.VPC.M.app.App;
import M_V.ME.word.frequency.utils.Util_X_CompareCheck;
import M_V.ME.word.frequency.utils.Util_X_FindCheck;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import java.util.List;
import java.util.Map;

//PARSER XCDX
//Yaoguang.Luo
//20210702
//一种元基枝 写法结构 处理子类接口 分类.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class X_Map extends AE implements A_X_Map {
	public IMV_SIQ_SS parserStringByReturnFrequencyMap(String inputString,
			App NE) {
		int inputLength = mixedString.length();
		int forestDepth = S_Pos.INT_ZERO;
		int find = S_Pos.INT_ZERO;
		int countLength;
		mixedString = new StringBuilder(inputString);
		StringBuilder[] fixWords = new StringBuilder[S_Pos.INT_TWO];
		fixWords[S_Pos.INT_ZERO] = new StringBuilder();
		fixWords[S_Pos.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		// Map<String, String> wordsForest =
		// fHMMList.getPosCnToCn();
		IMV_SIQ_SS outputList = new IMV_SIQ_SS();
		// Map<Long, FMHMMNode> forestRoots = fHMMList.getMap();
		for (int charPosition = S_Pos.INT_ZERO; charPosition < inputLength; charPosition += (countLength == S_Pos.INT_ZERO
				? S_Pos.INT_ONE
				: countLength)) {
			if (mixedString.charAt(charPosition) < S_Pos.INT_ONE_TWO_EIGHT) {
				if (fixWords[S_Pos.INT_ZERO].length() > S_Pos.INT_ZERO) {
					if (fixWords[S_Pos.INT_ZERO].charAt(fixWords[S_Pos.INT_ZERO]
							.length()
							- S_Pos.INT_ONE) < S_Pos.INT_ONE_TWO_EIGHT) {
						fixWords[S_Pos.INT_ZERO]
								.append(mixedString.charAt(charPosition));
						countLength = S_Pos.INT_ONE;
						find = S_Pos.INT_ONE;
						continue;
					}
					fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWords[S_Pos.INT_ZERO].length());
				}
				find = S_Pos.INT_ONE;
				fixWords[S_Pos.INT_ZERO]
						.append(mixedString.charAt(charPosition));
				countLength = S_Pos.INT_ONE;
				continue;
			}
			if (find == S_Pos.INT_ONE) {
				find = S_Pos.INT_ZERO;
				Util_X_FindCheck._E(outputList, fixWords, NE);
			}
			stringBuilder.delete(S_Pos.INT_ZERO, stringBuilder.length());
			stringBuilder = nero_C.getBinaryForestRecurWords(
					stringBuilder.append(mixedString.charAt(charPosition)),
					mixedString, charPosition, inputLength, forestRoots,
					forestDepth, charPosition + S_Pos.INT_ONE);
			String countWordNode = stringBuilder.toString();
			int compare = countLength = countWordNode.length();
			if (compare == S_Pos.INT_ONE) {
				Util_X_CompareCheck._E(outputList, fixWords, countWordNode, NE);
				fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWords[S_Pos.INT_ZERO].length());
				fixWords[S_Pos.INT_ZERO].append(countWordNode);
				continue;
			}
			if (compare == S_Pos.INT_TWO) {
				countLength = nlp_C.forTwoCharForMap(countLength, outputList,
						stringBuilder, fixWords, NE);
				continue;
			}
			if (compare == S_Pos.INT_THREE) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C.ofThreeForMap(countLength, outputList,
						stringBuilder, fixWords, NE);
				continue;
			}
			if (compare == S_Pos.INT_FOUR) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C.forMap(countLength, outputList,
						stringBuilder, fixWords, NE);
			}
		}
		return outputList;
	}

	public IMV_SIQ_SS getWordFrequencyMap(List<String> sets, App NE) {
		IMV_SIQ_SS map = new IMV_SIQ_SS();
		for (String setOfi : sets) {
			if (map.containsKey(setOfi)) {
				WordFrequency wordFrequency = map.getW(setOfi);
				wordFrequency.I_frequency(
						wordFrequency.get_frequency() + S_Pos.INT_ONE);
				wordFrequency.positions.add(NE._I_U.parserCharPosition);
				map.put(setOfi, wordFrequency);
				continue;
			}
			WordFrequency wordFrequency = new WordFrequency(1.0, setOfi);
			wordFrequency.positions.add(NE._I_U.parserCharPosition);
			map.put(setOfi, wordFrequency);
		}
		return map;
	}

	// 计算函数以后移出 DNA元基组 到RNA.
	public List<WordFrequency> sortWordFrequencyMap(IMV_SIQ_SS map) {
		List<WordFrequency> list = quick6DLuoYaoguangSort
				.frequencyWordMapToList(map);
		quick6DLuoYaoguangSort.quick6DLuoYaoGuangSortWordFrequency(list,
				S_Pos.INT_ZERO, list.size() - S_Pos.INT_ONE);
		return list;
	}

	public IMV_SIQ_S_ getWordFrequencyByReturnSortMap(List<String> sets,
			App NE) {
		return sortWordFrequencyMapToSortMap(getWordFrequencyMap(sets, NE));
	}

	public IMV_SIQ_S_ sortWordFrequencyMapToUnsortMap(IMV_SIQ_SS map) {
		return quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
	}

	public IMV_SIQ_S_ sortWordFrequencyMapToSortMap(IMV_SIQ_SS map) {
		IMV_SIQ_S_ listMap = quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
		quick6DLuoYaoguangSort.quick6DLuoYaoGuangSortWordFrequency(listMap,
				S_Pos.INT_ZERO, listMap.size() - S_Pos.INT_ONE);
		return listMap;
	}

	public IMV_SIQ_SS parserMixStringByReturnFrequencyMap(String inputString,
			App NE) {
		mixedString = new StringBuilder(inputString + S_Pos.SPACE_STRING);
		// IMV_SIQ wordsForest = fHMMList.getPosCnToCn();
		IMV_SIQ_SS outputList = new IMV_SIQ_SS();
		Map<Long, FMHMMNode> forestRoots = fHMMList.getMap();// .getRoot();
		int inputLength = mixedString.length();
		int forestDepth = S_Pos.INT_ZERO;
		int countLength;
		StringBuilder[] fixWords = new StringBuilder[S_Pos.INT_TWO];
		fixWords[S_Pos.INT_ZERO] = new StringBuilder();
		fixWords[S_Pos.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = S_Pos.INT_ZERO;
		for (int charPosition = S_Pos.INT_ZERO; charPosition < inputLength; charPosition += (countLength == S_Pos.INT_ZERO
				? S_Pos.INT_ONE
				: countLength)) {// luan ma
			NE._I_U.parserCharPosition = charPosition;// later duplicate..
			if (mixedString.charAt(charPosition) < S_Pos.INT_ONE_TWO_EIGHT
					&& charPosition < mixedString.length() - S_Pos.INT_ONE) {
				if (find == S_Pos.INT_ZERO) {
					fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWords[S_Pos.INT_ZERO].length());
				}
				fixWords[S_Pos.INT_ZERO]
						.append(mixedString.charAt(charPosition));
				countLength = S_Pos.INT_ONE;
				find = S_Pos.INT_ONE;
				continue;
			}
			if (find == S_Pos.INT_ONE) {
				find = S_Pos.INT_ZERO;
				for (String temp : fHMMList.englishStringToWordsList(
						fixWords[S_Pos.INT_ZERO].toString())) {
					WordFrequency wordFrequency;
					if (outputList.containsKey(temp)) {
						wordFrequency = outputList.getW(temp);
						wordFrequency.I_frequency(
								wordFrequency.get_frequency() + S_Pos.INT_ONE);
					} else {
						wordFrequency = new WordFrequency(1.0, temp);
					}
					wordFrequency.positions.add(NE._I_U.parserCharPosition);
					outputList.put(temp, wordFrequency);
				}
				fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWords[S_Pos.INT_ZERO].length());
			}
			stringBuilder.delete(S_Pos.INT_ZERO, stringBuilder.length());
			stringBuilder = nero_C.getBinaryForestRecurWords(
					stringBuilder.append(mixedString.charAt(charPosition)),
					mixedString, charPosition, inputLength, forestRoots,
					forestDepth, charPosition + S_Pos.INT_ONE);
			String countWordNode = stringBuilder.toString();
			int compare = countLength = countWordNode.length();
			if (compare == S_Pos.INT_TWO) {
				countLength = nlp_C.forTwoCharForMap(countLength, outputList,
						stringBuilder, fixWords, NE);
				continue;
			}
			if (compare == S_Pos.INT_THREE) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C.ofThreeForMap(countLength, outputList,
						stringBuilder, fixWords, NE);
				continue;
			}
			if (compare == S_Pos.INT_ONE) {
				WordFrequency wordFrequency;
				if (outputList.containsKey(countWordNode)) {
					wordFrequency = outputList.getW(countWordNode);
					wordFrequency.I_frequency(
							wordFrequency.get_frequency() + S_Pos.INT_ONE);
				} else {
					wordFrequency = new WordFrequency(1.0,
							fixWords[S_Pos.INT_ZERO].toString());
				}
				wordFrequency.positions.add(NE._I_U.parserCharPosition);
				outputList.put(countWordNode, wordFrequency);
				fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWords[S_Pos.INT_ZERO].length());
				fixWords[S_Pos.INT_ZERO].append(countWordNode);
				continue;
			}
			if (compare == S_Pos.INT_FOUR) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C.forMap(countLength, outputList,
						stringBuilder, fixWords, NE);
			}
		}
		return outputList;
	}

	public List<WordFrequency> getWordFrequency(List<String> sets, App NE) {
		return sortWordFrequencyMap(getWordFrequencyMap(sets, NE));
	}

	public EmotionMap getEmotionMap() {
		return this.emotionMap;
	}
}
//116 //            WordFrequency wordFrequency = new WordFrequency();
////            wordFrequency.I_frequency(1.0);
////            wordFrequency.I_Word(setOfi);

//224 //                    WordFrequency wordFrequency = new WordFrequency();
////                    wordFrequency.I_frequency(1.0);
////                    wordFrequency.I_Word(fixWords[S_Pos.INT_ZERO].toString());

//188 //                        WordFrequency wordFrequency = new WordFrequency();
////                        wordFrequency.I_frequency(1.0);
////                        wordFrequency.I_Word(temp);