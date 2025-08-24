package P;

import C_A.OCI.ME.pos.CP.X_P;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;

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

public class Pos_X_P extends Pos_X_P_ZhuCi implements X_P {
	public int P_BaDongCiOfTwo(List<String> outputList, int countLength,
			String[] strings, StringBuilder[] prefixWord) {
		if (!wordsForest.containsKey(prefixWord[S_Pos.INT_ZERO].toString())) {
			return countLength;
		}
		if (S_Maps.daiCi.containsKey(prefixWord[S_Pos.INT_ZERO].toString())
				|| S_Maps.fuCi
						.containsKey(prefixWord[S_Pos.INT_ZERO].toString())) {
			countLength = charOfTwo(countLength, outputList, strings,
					prefixWord);
			return countLength;
		}
		if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
			outputList.add(strings[S_Pos.INT_ONE]);
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
			return countLength;
		}
		return countLength - S_Pos.INT_TWO;
	}

	// 离散思维 走 离散代数
	public int P_ShiTaiCiOfThree(List<String> outputList, int countLength,
			String[] strings, StringBuilder[] prefixWord) {
		if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_TWO].toString())) {
			if (S_Maps.xingWeiCi
					.containsKey(prefixWord[S_Pos.INT_ZERO].toString())) {
				countLength = charOfThree(countLength, outputList, strings,
						prefixWord);
				return countLength;
			}
			if (S_Maps.dongCi
					.containsKey(prefixWord[S_Pos.INT_ZERO].toString())) {
				countLength = charOfThree(countLength, outputList, strings,
						prefixWord);
				return countLength;
			}
			if (S_Maps.jieCi
					.containsKey(prefixWord[S_Pos.INT_ZERO].toString())) {
				countLength = charOfThree(countLength, outputList, strings,
						prefixWord);
				return countLength;
			}
		}
		if (S_Maps.dongCi.containsKey(strings[S_Pos.INT_TWO].toString())
				|| S_Maps.liangCi
						.containsKey(strings[S_Pos.INT_TWO].toString())) {
			countLength = charOfThree(countLength, outputList, strings,
					prefixWord);
			return countLength;
		}
		if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
			outputList.add(strings[S_Pos.INT_ONE]);
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
			countLength = S_Pos.INT_TWO;
			return countLength;
		}
		outputList.add(strings[S_Pos.INT_ZERO]);
		if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_TWO])) {
			outputList.add(strings[S_Pos.INT_TWO]);
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
			return countLength;
		}
		prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				prefixWord[S_Pos.INT_ZERO].length());
		prefixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
		return countLength = S_Pos.INT_ONE;
	}

	public int P_FuCiOfThree(List<String> outputList, int countLength,
			String[] strings, StringBuilder[] prefixWord) {
		if (S_Maps.fuCi.containsKey(strings[S_Pos.INT_TWO].toString())) {
			if (S_Maps.fuCi
					.containsKey(prefixWord[S_Pos.INT_ZERO].toString())) {
				countLength = charOfThree(countLength, outputList, strings,
						prefixWord);
				return countLength;
			}
		}
		if (S_Maps.dongCi.containsKey(strings[S_Pos.INT_TWO].toString())) {
			boolean B = S_Maps.zhuCi.containsKey(S_Pos.EMPTY_STRING
					+ prefixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO));
			if (B) {
				countLength = charOfThree(countLength, outputList, strings,
						prefixWord);
				return countLength;
			}
			boolean C = S_Maps.daiCi.containsKey(S_Pos.EMPTY_STRING
					+ prefixWord[S_Pos.INT_ONE].charAt(S_Pos.INT_ZERO));
			if (C) {
				countLength = charOfThree(countLength, outputList, strings,
						prefixWord);
				return countLength;
			}
		}
		if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
			countLength = twoCharOfThree(countLength, outputList, strings,
					prefixWord);
			return countLength;
		}
		outputList.add(strings[S_Pos.INT_ZERO]);
		prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				prefixWord[S_Pos.INT_ZERO].length());
		prefixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
		return S_Pos.INT_ONE;
	}
}
