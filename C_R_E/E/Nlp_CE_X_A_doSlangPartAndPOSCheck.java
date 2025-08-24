package E;

import C_A.OCI.ME.nlp.C.Nlp_C_X_A_doSlangPartAndPOSCheck;
import ECE.XCE_XAS_U;
import ME.VPC.M.app.App;
import M_V.ME.word.forest.utils.Util_X_ContainsKey;
import M_V.ME.word.forest.utils.Util_X_prefixWordEqualZero;
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

public class Nlp_CE_X_A_doSlangPartAndPOSCheck extends XCE_XAS_U
		implements Nlp_C_X_A_doSlangPartAndPOSCheck {
	public int forTwoChar(int countLength, List<String> outputList,
			StringBuilder stringBuilder, StringBuilder[] prefixWord,
			int charPosition, StringBuilder textInputString) {
		// Pos_C_X_P_chuLiMingCi Pos_C_X_P=
		// (Pos_C_X_P_chuLiMingCi)posUtils;
		String countWordNode = stringBuilder.toString();
		int temp = prefixWord[S_Pos.INT_ZERO].length();// trif checking book
		if (temp == S_Pos.INT_ZERO) {
			if (S_Maps.CiTwo.containsKey(countWordNode)) {
				prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, temp);
				prefixWord[S_Pos.INT_ZERO].append(countWordNode);
				outputList.add(countWordNode);
				return countLength;
			}
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, temp);
			prefixWord[S_Pos.INT_ZERO]
					.append(stringBuilder.charAt(S_Pos.INT_ZERO));
			outputList.add(
					S_Pos.EMPTY_STRING + stringBuilder.charAt(S_Pos.INT_ZERO));
			return countLength - S_Pos.INT_ONE;
		}
		String[] strings = new String[S_Pos.INT_TWO];
		strings[S_Pos.INT_ZERO] = String
				.valueOf(countWordNode.charAt(S_Pos.INT_ZERO));
		strings[S_Pos.INT_ONE] = countWordNode;
		if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_ZERO])) {
			countLength = pos_X_P.P_MingCiOfTwo(outputList, countLength,
					strings, prefixWord, charPosition, textInputString);
			return countLength;
		}
		if (S_Maps.baDongCi.containsKey(strings[S_Pos.INT_ZERO])) {
			countLength = pos_X_P.P_BaDongCiOfTwo(outputList, countLength,
					strings, prefixWord);
			return countLength;
		}
		if (S_Maps.jieCi.containsKey(strings[S_Pos.INT_ZERO])) {
			if (S_Maps.dongCi
					.containsKey(prefixWord[S_Pos.INT_ZERO].toString())) {
				if (!S_Maps.jieCi.containsKey(countWordNode)) {
					countLength = pos_X_P.charOfTwo(countLength, outputList,
							strings, prefixWord);
					return countLength;
				}
			}
		}
		if (S_Maps.CiTwo.containsKey(countWordNode)) {
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO].append(countWordNode);
			outputList.add(countWordNode);
			return countLength;
		}
		countLength = pos_X_P.charOfTwo(countLength, outputList, strings,
				prefixWord);
		return countLength;
	}

	// 新陈代谢
	public int forTwoCharForMap(int countLength, IMV_SIQ_SS outputList,
			StringBuilder stringBuilder, StringBuilder[] prefixWord, App NE) {
		String countWordNode = stringBuilder.toString();
		if (!wordsForest.containsKey(countWordNode)) {
			Util_X_ContainsKey.not_E(outputList, countWordNode, prefixWord, NE);
			return --countLength;
		}
		if (prefixWord[S_Pos.INT_ZERO].length() == S_Pos.INT_ZERO) {
			Util_X_prefixWordEqualZero._E(outputList, countWordNode, prefixWord,
					NE);
			return countLength;
		}
		String[] strings = new String[S_Pos.INT_TWO];
		strings[S_Pos.INT_ZERO] = String
				.valueOf(countWordNode.charAt(S_Pos.INT_ZERO));
		strings[S_Pos.INT_ONE] = countWordNode.charAt(S_Pos.INT_ZERO)
				+ String.valueOf(countWordNode.charAt(S_Pos.INT_ONE));
		if (wordsForest.containsKey(strings[S_Pos.INT_ZERO])) {
			StringBuilder temp = wordsForest.get(strings[S_Pos.INT_ZERO]);
			if (temp.toString().contains(S_Pos.NLP_CI_MING)) {
				countLength = pos_X_P.P_MingCiOfTwoForMap(outputList,
						countLength, strings, prefixWord, NE);
				return countLength;
			}
		}
		if (wordsForest.containsKey(strings[S_Pos.INT_ONE])) {
			Util_X_ContainsKey._E(outputList, countWordNode, prefixWord, NE);
			return countLength;
		}
		return S_Pos.INT_ZERO;
	}
}
//@Override
//public int forMap(int countLength, Map<String, WordFrequency> outputList, Map<String, String> wordsForest,
//		StringBuilder stringBuilder, StringBuilder[] prefixWord, X_P posUtils) {
//	// TODO Auto-generated method stub
//	return 0;
//}
