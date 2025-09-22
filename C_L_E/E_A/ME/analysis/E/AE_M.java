package E_A.ME.analysis.E;

import C_A.ME.analysis.C.A;
import C_A.ME.nero.C.NERO_C_OneTime;
import C_A.OCI.SVQ.MPC.fhmm.C.FHMMList_indexAll;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Pos;

import java.util.Iterator;
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
public class AE_M extends AS implements A {
	public FHMMList_indexAll fHMMList;// gjs list later..
	public Nlp_CE_X_S nlp_C;// later fix.. //later getter setter
	public NERO_C_OneTime nero_C;
	public Pos_X_P pos_C;
	public Map<Long, FMHMMNode> forestRoots;
	public Map<Long, FMHMMNode>[] forestsRoots;

	public void I_FixWords(int charPosition, StringBuilder inputString,
			StringBuilder[] fixWords) {
		fixWords[S_Pos.INT_ONE].delete(S_Pos.INT_ZERO,
				fixWords[S_Pos.INT_ONE].length());
		if (charPosition + S_Pos.INT_EIGHT < inputString.length()) {
			fixWords[S_Pos.INT_ONE].append(
					inputString.substring(charPosition + S_Pos.INT_THREE,
							charPosition + S_Pos.INT_EIGHT));
			return;
		}
		fixWords[S_Pos.INT_ONE].append(inputString.substring(
				charPosition + S_Pos.INT_THREE, inputString.length()));
	}

	// 82行 通过 S AE的 一次新陈代谢分离
	@SuppressWarnings("unused")
	private void doFind() {
		if (S_Pos.INT_ONE == find) {
			find = S_Pos.INT_ZERO;
			Iterator<String> it = fHMMList.englishStringToWordsList(
					fixWords[S_Pos.INT_ZERO].toString()).iterator();
			StringBuilder number = new StringBuilder();
			while (it.hasNext()) {
				String temp = it.next();
				if (S_Pos.NUMBERS.contains(temp)) {
					number.append(temp);
				} else {
					if (number.length() > 0) {
						outputList.add(number.toString());
						number.delete(0, number.length());
					}
					outputList.add(temp);
				}
			}
			if (number.length() > 0) {
				outputList.add(number.toString());
				number.delete(0, number.length());
			}
			fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					fixWords[S_Pos.INT_ZERO].length());
		}
	}

	public List<String> parserString(String inputString) {
		mixedString = new StringBuilder(inputString);
		List<String> outputList = new LinkedList<>();
		int inputLength = mixedString.length();
		int forestDepth = S_Pos.INT_ZERO;
		int countLength;
		StringBuilder[] fixWords = new StringBuilder[S_Pos.INT_TWO];
		fixWords[S_Pos.INT_ZERO] = new StringBuilder();
		fixWords[S_Pos.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = S_Pos.INT_ZERO;
		Here: for (int charPosition = S_Pos.INT_ZERO; charPosition < inputLength; charPosition += (countLength != S_Pos.INT_ZERO
				? countLength
				: S_Pos.INT_ONE)) {
			if (S_Pos.INT_ONE_TWO_EIGHT > mixedString.charAt(charPosition)) {
				if (fixWords[S_Pos.INT_ZERO].length() > S_Pos.INT_ZERO) {
					if (fixWords[S_Pos.INT_ZERO].charAt(fixWords[S_Pos.INT_ZERO]
							.length()
							- S_Pos.INT_ONE) < S_Pos.INT_ONE_TWO_EIGHT) {
						fixWords[S_Pos.INT_ZERO]
								.append(mixedString.charAt(charPosition));
						countLength = S_Pos.INT_ONE;
						find = S_Pos.INT_ONE;
						continue Here;
					}
					fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
							fixWords[S_Pos.INT_ZERO].length());
				}
				find = S_Pos.INT_ONE;
				fixWords[S_Pos.INT_ZERO]
						.append(mixedString.charAt(charPosition));
				countLength = S_Pos.INT_ONE;
				continue Here;
			}
			if (find == S_Pos.INT_ONE) {
				find = S_Pos.INT_ZERO;
				outputList.add(fixWords[S_Pos.INT_ZERO].toString());
			}
			stringBuilder.delete(S_Pos.INT_ZERO, stringBuilder.length());
			stringBuilder = nero_C.getBinaryForestRecurWords(
					stringBuilder.append(mixedString.charAt(charPosition)),
					mixedString, charPosition, inputLength, forestRoots,
					forestDepth, charPosition + S_Pos.INT_ONE);
			String countWordNode = stringBuilder.toString();
			int compare = countLength = countWordNode.length();
			if (compare == S_Pos.INT_ONE) {
				outputList.add(countWordNode);
				fixWords[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
						fixWords[S_Pos.INT_ZERO].length());
				fixWords[S_Pos.INT_ZERO].append(countWordNode);
				continue Here;
			}
			if (compare == S_Pos.INT_TWO) {
				countLength = nlp_C.forTwoChar(countLength, outputList,
						stringBuilder, fixWords, charPosition, mixedString);
				continue Here;
			}
			if (compare == S_Pos.INT_THREE) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C.ofThree(countLength, outputList,
						stringBuilder, fixWords, charPosition, mixedString);
				continue Here;
			}
			if (compare == S_Pos.INT_FOUR) {
				I_FixWords(charPosition, mixedString, fixWords);
				countLength = nlp_C._E(countLength, outputList, stringBuilder,
						fixWords, charPosition, mixedString);
			}
		}
		return outputList;
	}

	public String[] parserEnglishString(String englishString) {
		String[] words = englishString
				.replaceAll(S_Pos.NLP_SPASE_REP, S_Pos.SPACE_STRING)
				.split(S_Pos.SPACE_STRING);
		if (S_Pos.INT_ZERO == words.length) {
			return new String[] { S_Pos.SPACE_STRING };
		}
		return words;
	}

	public void IV_(App NE) {
		IV_condition(1, NE);
	}

	public void IV_Mixed(App NE) {
		IV_condition(2, NE);
	}

	public void IV_All(App NE) {
		IV_condition(3, NE);
	}

	@SuppressWarnings("unchecked")
	public void IV_condition(int indexType, App NE) {
		if (null != NE) {
			this.fHMMList = NE.app_S.fMHMMListOneTime_E;
			pos_C = NE.app_S.pos_X_P;
			nlp_C = NE.app_S.nlp_CE_X_S;
			nero_C = NE.app_S.nERO_C_OneTime_E;
			emotionMap = NE.app_S.emotionMap_E;
			sensingTest = NE.app_S.sensingTest;
			quick6DLuoYaoguangSort = NE.app_S.quick6DLuoYaoguangSort3DMap_E;
		} else {
		}
		if (1 == indexType) {
			fHMMList.index();
		}
		if (2 == indexType) {
			fHMMList.indexMixed(NE);
		}
		if (3 == indexType) {
			// fHMMList.indexAll();
		}
		fHMMList.indexPosEnToCn(NE);
		fHMMList.indexPosEnToEn(NE);
		fHMMList.indexEnToCn(NE);
		fHMMList.indexCnToEn(NE);
		fHMMList.indexFullEnToCn();
		fHMMList.indexFullCnToEn();
		fHMMList.indexFullCnToPy();
		fHMMList.indexFullCnToKo();
		fHMMList.indexFullCnToJp();
		fHMMList.indexFullCnToTt();
		fHMMList.indexFullCnToRs();
		fHMMList.indexFullCnToAb();
		fHMMList.indexFullCnToFn();
		fHMMList.indexFullCnToGm();
		fHMMList.indexFullCnToSp();

		forestRoots = fHMMList.getMap();
		forestsRoots = fHMMList.getMaps();
		wordsForest = fHMMList.getPosCnToCn();
		wordsForests = fHMMList.getWordsForests();
		//
		this.fHMMList.flushRedundant();
	}
}
//		emotionMap.IV_MotivationMap();
//		emotionMap.IV_NegativeMap();
//		emotionMap.IV_PositiveMap();
//		emotionMap.IV_TrendingMap();
//		emotionMap.IV_PredictionMap();