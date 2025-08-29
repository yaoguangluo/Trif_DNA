package E;

import C_A.OCI.ME.nlp.C.Nlp_C_X_S_doSlangCheck;
import ME.VPC.M.app.App;
import M_V.ME.word.forest.utils.Util_X_ContainsKey;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.List;

//import OCI.ME.pos.C.Pos_C_X_O;
//繁衍和继承是新陈代谢的一种体现.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Nlp_CE_X_S extends Nlp_CE_X_A_doPOSAndEMMCheck
		implements Nlp_C_X_S_doSlangCheck {
	public int _E(int countLength, List<String> output,
			StringBuilder stringBuilder, StringBuilder[] prefixWord,
			int charPosition, StringBuilder textInputString) {
		String inputString = stringBuilder.toString();
		if (S_Maps.CiFour.containsKey(inputString)) {
			output.add(inputString);
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO].append(inputString);
			return countLength;
		} // will make pre 3 or post 3 check. now finished pre 3
		  // .20190330
		String preRegister = S_Pos.EMPTY_STRING
				+ inputString.charAt(S_Pos.INT_ZERO)
				+ inputString.charAt(S_Pos.INT_ONE);
		String inRegister = S_Pos.EMPTY_STRING
				+ inputString.charAt(S_Pos.INT_ONE)
				+ inputString.charAt(S_Pos.INT_TWO);
		String postRegister = S_Pos.EMPTY_STRING
				+ inputString.charAt(S_Pos.INT_TWO)
				+ inputString.charAt(S_Pos.INT_THREE);
		if (S_Maps.dongCi.containsKey(
				S_Pos.EMPTY_STRING + inputString.charAt(S_Pos.INT_THREE)
						+ prefixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO))) {
			countLength = ofThree(--countLength, output,
					stringBuilder.delete(S_Pos.INT_THREE, S_Pos.INT_FOUR),
					prefixWord, charPosition, textInputString);
			return countLength;//trif-countLength
		}
		boolean A = S_Maps.CiTwo.containsKey(preRegister);
		if (A) {
			if (S_Maps.CiTwo.containsKey(postRegister)) {
				String string = S_Pos.EMPTY_STRING
						+ inputString.charAt(S_Pos.INT_ZERO);
				if (S_Maps.xingWeiCi
						.containsKey(prefixWord[S_Pos.INT_ZERO].toString())
						&& S_Maps.shiTaiCi.containsKey(string)) {
					output.add(string);
					prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							prefixWord[S_Pos.INT_ZERO].length());
					prefixWord[S_Pos.INT_ZERO].append(string);
					return countLength - S_Pos.INT_THREE;
				}
				if (S_Maps.zhuCi.containsKey(string)) {
					String[] strings = new String[S_Pos.INT_FOUR];
					strings[S_Pos.INT_ZERO] = String
							.valueOf(inputString.charAt(S_Pos.INT_ZERO));
					strings[S_Pos.INT_ONE] = String
							.valueOf(inputString.charAt(S_Pos.INT_ZERO))
							+ inputString.charAt(S_Pos.INT_ONE);
					strings[S_Pos.INT_TWO] = String
							.valueOf(inputString.charAt(S_Pos.INT_ONE))
							+ inputString.charAt(S_Pos.INT_TWO);
					strings[S_Pos.INT_THREE] = String
							.valueOf(inputString.charAt(S_Pos.INT_TWO));
					countLength = pos_X_P.P_ZhuCiOfThree(output,
							countLength - S_Pos.INT_ONE, strings, prefixWord);
					return countLength;
				}
				output.add(preRegister);
				prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						prefixWord[S_Pos.INT_ZERO].length());
				prefixWord[S_Pos.INT_ZERO].append(preRegister);
				return countLength - S_Pos.INT_TWO;
			}
		}
		if (S_Maps.CiThree
				.containsKey(preRegister + inputString.charAt(S_Pos.INT_TWO))
				&& !S_Maps.CiTwo.containsKey(postRegister)) {
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO].append(preRegister)
					.append(inputString.charAt(S_Pos.INT_TWO));
			output.add(preRegister + inputString.charAt(S_Pos.INT_TWO));
			return countLength - S_Pos.INT_ONE;
		}
		if (A) {
			if (S_Maps.CiTwo.containsKey(inRegister)) {
				countLength = ofThree(--countLength, output,
						stringBuilder.delete(S_Pos.INT_THREE, S_Pos.INT_FOUR),
						prefixWord, charPosition, textInputString);
				return countLength;
			}
			countLength = forTwoChar(countLength - S_Pos.INT_TWO, output,
					stringBuilder.delete(S_Pos.INT_TWO, S_Pos.INT_FOUR),
					prefixWord, charPosition, textInputString);
			return countLength;
		}
		output.add(S_Pos.EMPTY_STRING + inputString.charAt(S_Pos.INT_ZERO));
		prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				prefixWord[S_Pos.INT_ZERO].length());
		prefixWord[S_Pos.INT_ZERO].append(S_Pos.EMPTY_STRING)
				.append(inputString.charAt(S_Pos.INT_ZERO));
		return S_Pos.INT_ONE;
	}

	public int forMap(int countLength, List<String> output,
			StringBuilder stringBuilder, StringBuilder[] prefixWord,
			int charPosition, StringBuilder textInputString) {
		String inputString = stringBuilder.toString();
		if (wordsForest.containsKey(inputString)) {
			output.add(inputString);
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO].append(inputString);
			return countLength;
		}
		countLength = ofThree(--countLength, output,
				stringBuilder.delete(S_Pos.INT_THREE, S_Pos.INT_FOUR),
				prefixWord, charPosition, textInputString);
		return countLength;
	}

	public int forMap(int countLength, IMV_SIQ_SS output,
			StringBuilder stringBuilder, StringBuilder[] prefixWord, App NE) {
		String inputString = stringBuilder.toString();
		if (wordsForest.containsKey(inputString)) {
			Util_X_ContainsKey._E(output, inputString, prefixWord, NE);
			return countLength;
		}
		String keyWord = S_Pos.EMPTY_STRING + inputString.charAt(S_Pos.INT_ZERO)
				+ inputString.charAt(S_Pos.INT_ONE);
		if (S_Maps.mingCi.containsKey(keyWord)) {
			if (S_Maps.mingCi.containsKey(
					S_Pos.EMPTY_STRING + inputString.charAt(S_Pos.INT_TWO)
							+ inputString.charAt(S_Pos.INT_THREE))) {
				Util_X_ContainsKey._E(output, keyWord, prefixWord, NE);
				return countLength;
			}
		}
		countLength = ofThreeForMap(--countLength, output,
				stringBuilder.delete(S_Pos.INT_THREE, S_Pos.INT_FOUR),
				prefixWord, NE);
		return countLength;
	}
}
//2个月研究发现 词性越来越多, 根据笛摩根定律, 先把未知词汇也添加到条件中. 之后采用 排除法优化.
//	if(S_Maps.jieCi.containsKey(preRegister)|| S_Maps.mingCi.containsKey(preRegister)
//|| S_Maps.xingRongCi.containsKey(preRegister)
//	|| S_Maps.fuCi.containsKey(preRegister)|| S_Maps.dongCi.containsKey(preRegister)
//|| S_Maps.lianCi.containsKey(preRegister)
//	|| S_Maps.liangCi.containsKey(preRegister)
//|| S_Maps.xingWeiCi.containsKey(preRegister)
//|| S_Maps.shiTaiCi.containsKey(preRegister)
//	|| S_Maps.zhuCi.containsKey(preRegister)) {
//if(S_Maps.mingCi.containsKey(postRegister)
//|| S_Maps.dongCi.containsKey(postRegister)
//|| S_Maps.lianCi.containsKey(postRegister)
//		|| S_Maps.xingRongCi.containsKey(postRegister)
//|| S_Maps.xingWeiCi.containsKey(postRegister)
//|| S_Maps.liangCi.containsKey(preRegister)
//		|| S_Maps.fuCi.containsKey(postRegister)
//|| S_Maps.jieCi.containsKey(postRegister)) {

//卡诺图化简.PCA阀门分流. 卷积催化, .原来备注这里 , 20190523
//	if(!wordsForest.containsKey(preRegister)&& (wordsForest.containsKey(inRegister)
//||wordsForest.containsKey(postRegister))) {
//	if(wordsForest.containsKey(preRegister+ inputString.charAt(S_Data.INT_TWO))) {
//		output.add(preRegister+ inputString.charAt(S_Data.INT_TWO));
//		prefixWord[S_Data.INT_ZERO].delete(S_Data.INT_ZERO
//, prefixWord[S_Data.INT_ZERO].length());
//		prefixWord[S_Data.INT_ZERO].append(preRegister
//+ inputString.charAt(S_Data.INT_TWO));
//		return countLength- S_Data.INT_ONE;
//	}
//	output.add(S_Data.EMPTY_STRING+ inputString.charAt(S_Data.INT_ZERO));
//	prefixWord[S_Data.INT_ZERO].delete(S_Data.INT_ZERO
//, prefixWord[S_Data.INT_ZERO].length());
//	prefixWord[S_Data.INT_ZERO].append(S_Data.EMPTY_STRING
//+ inputString.charAt(S_Data.INT_ZERO));
//	return countLength- S_Data.INT_THREE;
//}

//if(wordsForest.containsKey(preRegister)&& wordsForest.containsKey(inRegister
//+ inputString.charAt(S_Data.INT_THREE))) {
//	countLength= doPOSAndEMMCheckOfThree(--countLength
//, output, wordsForest
//			, stringBuilder.delete(S_Data.INT_THREE, S_Data.INT_FOUR)
//, prefixWord, posUtils, charPosition, textInputString);
//	return countLength;
//}
//if(wordsForest.containsKey(preRegister)) {
//	countLength= doPOSAndEMMCheckOfThree(--countLength
//, output, wordsForest
//			, stringBuilder.delete(S_Data.INT_THREE, S_Data.INT_FOUR)
//, prefixWord, posUtils, charPosition, textInputString);
//	return countLength;
//}
