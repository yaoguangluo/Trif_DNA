package E_A.ME.analysis.E;

import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import C_A.ME.analysis.C.CogsBinaryForest_A;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import java.util.Iterator;
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
public class CogsBinaryForest_AE extends BinaryForest_AE
		implements CogsBinaryForest_A {

	public IMV_SIQ_SS getWordFrequencyMap(List<String> sets, App NE) {
		IMV_SIQ_SS map = new IMV_SIQ_SS();
		Iterator<String> iterator = sets.iterator();
		int positionStackPoint = 1;
		Here: while (iterator.hasNext()) {
			String setOfi = iterator.next();
			if (map.containsKey(setOfi)) {
				WordFrequency wordFrequency = map.getW(setOfi);
				wordFrequency.I_frequency(
						wordFrequency.get_frequency() + S_Pos.INT_ONE);
				wordFrequency.positions.add(positionStackPoint);
				map.put(setOfi, wordFrequency);
				continue Here;
			}
			WordFrequency wordFrequency = new WordFrequency(1.0, setOfi);
			wordFrequency.positions.add(positionStackPoint);
			map.put(setOfi, wordFrequency);
			positionStackPoint++;
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

	public IMV_SIQ_S_ sortWordFrequencyMapToSortMap(IMV_SIQ_SS map) {
		IMV_SIQ_S_ listMap = quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
		quick6DLuoYaoguangSort.quick6DLuoYaoGuangSortWordFrequency(listMap,
				S_Pos.INT_ZERO, listMap.size() - S_Pos.INT_ONE);
		return listMap;
	}

	public IMV_SIQ_SS parserMixStringByReturnFrequencyMap(String inputString,
			App NE) {
		mixedString = new StringBuilder(inputString + S_Pos.SPACE_STRING);
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
		Here: for (int charPosition = S_Pos.INT_ZERO; charPosition < inputLength; charPosition += (countLength == S_Pos.INT_ZERO
				? S_Pos.INT_ONE
				: countLength)) {// luan ma
			NE._I_U.parserCharPosition = charPosition;
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
				continue Here;
			}
			if (find == S_Pos.INT_ONE) {
				find = S_Pos.INT_ZERO;
				Iterator<String> it = fHMMList.englishStringToWordsList(
						fixWords[S_Pos.INT_ZERO].toString()).iterator();
				while (it.hasNext()) {
					String temp = it.next();
					if (outputList.containsKey(temp)) {
						WordFrequency wordFrequency = outputList.getW(temp);
						wordFrequency.I_frequency(
								wordFrequency.get_frequency() + S_Pos.INT_ONE);
						wordFrequency.positions.add(NE._I_U.parserCharPosition);
						outputList.put(temp, wordFrequency);
					} else {
						WordFrequency wordFrequency = new WordFrequency(1.0,
								temp);
						wordFrequency.positions.add(NE._I_U.parserCharPosition);
						outputList.put(temp, wordFrequency);
					}
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
				continue Here;
			}
			if (compare == S_Pos.INT_THREE) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C.ofThreeForMap(countLength, outputList,
						stringBuilder, fixWords, NE);
				continue Here;
			}
			if (compare == S_Pos.INT_ONE) {
				if (outputList.containsKey(countWordNode)) {
					WordFrequency wordFrequency = outputList
							.getW(countWordNode);
					wordFrequency.I_frequency(
							wordFrequency.get_frequency() + S_Pos.INT_ONE);
					wordFrequency.positions.add(NE._I_U.parserCharPosition);
					outputList.put(countWordNode, wordFrequency);
				} else {
					WordFrequency wordFrequency = new WordFrequency(1.0,
							fixWords[S_Pos.INT_ZERO].toString());
					wordFrequency.positions.add(NE._I_U.parserCharPosition);// xian
																			// dan
																			// hou
																			// duo..later..
					outputList.put(countWordNode, wordFrequency);
				}
				fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWords[S_Pos.INT_ZERO].length());
				fixWords[S_Pos.INT_ZERO].append(countWordNode);
				continue Here;
			}
			if (compare == S_Pos.INT_FOUR) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C.forMap(countLength, outputList,
						stringBuilder, fixWords, NE);
			}
		}
		return outputList;
	}

	public EmotionMap getEmotionMap() {
		return this.emotionMap;
	}

	@SuppressWarnings("unchecked")
	public void initPCAWordPOS(IMV_SIQ_SS mapSearchWithoutSort, App NE) {
		Iterator<String> iterator = mapSearchWithoutSort.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			WordFrequency wordFrequency = mapSearchWithoutSort.getW(string);
			StringBuilder stringBuilder = new StringBuilder();
			if (S_Maps.mingCi.containsKey(string)) {
				stringBuilder.append("名词");
			} else if (S_Maps.dongCi.containsKey(string)) {
				stringBuilder.append("动词");
			} else if (S_Maps.xingRongCi.containsKey(string)) {
				stringBuilder.append("形词");
			} else if (S_Maps.weiCi.containsKey(string)) {
				stringBuilder.append("谓词");
			} else if (S_Maps.fuCi.containsKey(string)) {
				stringBuilder.append("副词");
			} else if (S_Maps.jieCi.containsKey(string)) {
				stringBuilder.append("介词");
			} else if (S_Maps.baDongCi.containsKey(string)) {
				stringBuilder.append("把动词");
			} else if (S_Maps.liangCi.containsKey(string)) {
				stringBuilder.append("量词");
			} else if (S_Maps.dingMingCi.containsKey(string)) {
				stringBuilder.append("定名词");// later dingming 地名统一纠正
			} else if (S_Maps.daiCi.containsKey(string)) {
				stringBuilder.append("代词");
			} else if (S_Maps.lianCi.containsKey(string)) {
				stringBuilder.append("连词");
			} else if (S_Maps.qingTaiCi.containsKey(string)) {
				stringBuilder.append("情态词");
			} else if (S_Maps.shiTaiCi.containsKey(string)) {
				stringBuilder.append("时态词");
			} else if (S_Maps.xianDingCi.containsKey(string)) {
				stringBuilder.append("限定词");
			} else if (S_Maps.zhuCi.containsKey(string)) {
				stringBuilder.append("助词");
			} else if (S_Maps.shengLueCi.containsKey(string)) {
				stringBuilder.append("省略词");
			} else {
				stringBuilder.append("未知");
				NE.app_S.workVerbaMap.unknown_map.put(string, true);
			}
			wordFrequency.I_pos(stringBuilder.toString());
			mapSearchWithoutSort.put(string, wordFrequency);
		}
	}
}
//108  WordFrequency wordFrequency = new WordFrequency();
//            wordFrequency.I_frequency(1.0);
//            wordFrequency.I_Word(setOfi);

//180 WordFrequency wordFrequency = new WordFrequency();
//                        wordFrequency.I_frequency(1.0);
//                        wordFrequency.I_Word(temp);

//212 WordFrequency wordFrequency = new WordFrequency();
//                    wordFrequency.I_frequency(1.0);
//                    wordFrequency.I_Word(fixWords[S_Pos.INT_ZERO].toString());

//    public IMV_SIQ_SS parserStringByReturnFrequencyMap(StringBuilder inputString, App NE) {
//        int countLength;
//        int find = S_Pos.INT_ZERO;
//        int forestDepth = S_Pos.INT_ZERO;
//        int inputLength = inputString.length();
//        StringBuilder[] fixWords = new StringBuilder[S_Pos.INT_TWO];
//        fixWords[S_Pos.INT_ZERO] = new StringBuilder();
//        fixWords[S_Pos.INT_ONE] = new StringBuilder();
//        StringBuilder stringBuilder = new StringBuilder();
//        //Map<String, String> wordsForest = fHMMList.getPosCnToCn();
//        IMV_SIQ_SS outputList = new IMV_SIQ_SS();
//        Map<Long, FMHMMNode> forestRoots = fHMMList.getMap();
//        for (int charPosition = S_Pos.INT_ZERO; charPosition < inputLength; charPosition
//            += (countLength == S_Pos.INT_ZERO ? S_Pos.INT_ONE : countLength)) {
//            if (inputString.charAt(charPosition) < S_Pos.INT_ONE_TWO_EIGHT) {
//                if (fixWords[S_Pos.INT_ZERO].length() > S_Pos.INT_ZERO) {
//                    if (fixWords[S_Pos.INT_ZERO].charAt(fixWords[S_Pos.INT_ZERO].length()
//                        - S_Pos.INT_ONE) < S_Pos.INT_ONE_TWO_EIGHT) {
//                        fixWords[S_Pos.INT_ZERO].append(inputString.charAt(charPosition));
//                        countLength = S_Pos.INT_ONE;
//                        find = S_Pos.INT_ONE;
//                        continue;
//                    }
//                    fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO
//                        , fixWords[S_Pos.INT_ZERO].length());
//                }
//                find = S_Pos.INT_ONE;
//                fixWords[S_Pos.INT_ZERO].append(inputString.charAt(charPosition));
//                countLength = S_Pos.INT_ONE;
//                continue;
//            }
//            if (find == S_Pos.INT_ONE) {
//                find = S_Pos.INT_ZERO;
//                Util_X_FindCheck._E(outputList, fixWords, NE);
//            }
//            stringBuilder.delete(S_Pos.INT_ZERO, stringBuilder.length());
//            stringBuilder = nero_C.getBinaryForestRecurWords(stringBuilder.append(
//                    inputString.charAt(charPosition)), inputString, charPosition, inputLength
//                , forestRoots, forestDepth, charPosition + S_Pos.INT_ONE);
//            String countWordNode = stringBuilder.toString();
//            int compare = countLength = countWordNode.length();
//            if (compare == S_Pos.INT_ONE) {
//                Util_X_CompareCheck._E(outputList, fixWords, countWordNode, NE);
//                fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO
//                    , fixWords[S_Pos.INT_ZERO].length());
//                fixWords[S_Pos.INT_ZERO].append(countWordNode);
//                continue;
//            }
//            if (compare == S_Pos.INT_TWO) {
//                countLength = nlp_C.forTwoCharForMap(countLength, outputList
//                    , stringBuilder, fixWords, NE);
//                continue;
//            }
//            if (compare == S_Pos.INT_THREE) {
//                I_FixWords(charPosition, inputString, fixWords);
//                countLength = nlp_C.ofThreeForMap(countLength, outputList
//                    , stringBuilder, fixWords, NE);
//                continue;
//            }
//            if (compare == S_Pos.INT_FOUR) {
//                I_FixWords(charPosition, inputString, fixWords);
//                countLength = nlp_C.forMap(countLength, outputList, stringBuilder
//                    , fixWords, NE);
//            }
//        }
//        return outputList;
//    }

//62
//public IMV_SIQ_S_ sortWordFrequencyMapToUnsortMap(IMV_SIQ_SS map) {
//    IMV_SIQ_S_ listMap = quick6DLuoYaoguangSort.frequencyWordMapToMap(map);
//    return listMap;
//}

//163
//public List<WordFrequency> getWordFrequency(List<String> sets, App NE) {
//    return sortWordFrequencyMap(getWordFrequencyMap(sets, NE));
//}