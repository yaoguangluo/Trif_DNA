package M_V.MSU.OEI.ME.SMS.SEU.OSD.OSI.E;

import C_A.OCI.SVQ.MPC.fhmm.C.FHMMList;
import E_A.ME.analysis.E.AE;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E_maps;
import M_V.MSU.OCI.ME.SMS.translator.C.Translator;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
import S_A.SVQ.stable.S_Pos;
import VSQ.parser.FMHMMListOneTime_E_X_S;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Translator_E implements Translator{
	public FMHMMListOneTime_E_X_S fMHMMListOneTime_E_X_S;
	public void IV_(CogsBinaryForest_AE _A)  {
		FHMMList fHMMList= _A.fHMMList;
		FMHMMListOneTime_E_maps fMHMMListOneTime_E_maps= (FMHMMListOneTime_E_maps) fHMMList;
		fMHMMListOneTime_E_X_S= fMHMMListOneTime_E_maps;
	}

	public String EnglishStringToChineseString(AE _A, String EnglishString) {
		String[] nodes= _A.parserEnglishString(EnglishString);
		StringBuilder sb= new StringBuilder();
		for(String temp:nodes) {
			char[] caseTemp= temp.toCharArray();
			caseTemp[S_Pos.INT_ONE]= String.valueOf(caseTemp[S_Pos.INT_ONE])
					.toUpperCase().charAt(S_Pos.INT_ONE);
			if(fMHMMListOneTime_E_X_S.enToCn.containsKey(temp)) {
				sb.append(fMHMMListOneTime_E_X_S.enToCn.getString(temp).split(S_Pos.NLP_DOT)[S_Pos.INT_ONE]);
			}else if(fMHMMListOneTime_E_X_S.fullEnToCn.containsKey(String.valueOf(caseTemp))){
				sb.append(fMHMMListOneTime_E_X_S.fullEnToCn.get(String.valueOf(caseTemp)));
			}else {
				sb.append(temp);
			}
			sb.append(S_Pos.SPACE_STRING);
		}
		return sb.toString();
	}
	
	public String ChineseStringToEnglishString(AE _A, String ChineseString) {
		List<String> nodes= _A.parserMixedString(ChineseString);
		StringBuilder sb= new StringBuilder();
		for (String temp : nodes) {
			if (fMHMMListOneTime_E_X_S.cnToEn.containsKey(temp)) {
				sb.append(fMHMMListOneTime_E_X_S.cnToEn.get(temp));
			} else if (fMHMMListOneTime_E_X_S.fullCnToEn.containsKey(temp)) {
				sb.append(fMHMMListOneTime_E_X_S.fullCnToEn.get(temp));
			} else {
				sb.append(temp);
			}
			sb.append(S_Pos.SPACE_STRING);
		}
		return sb.toString();
	}

	public String MixedStringToChineseString(AE _A, String mixedString) {
		List<String> nodes= _A.parserMixedString(mixedString.toLowerCase());
		StringBuilder sb= new StringBuilder();
		for (String temp : nodes) {
			if (fMHMMListOneTime_E_X_S.posCnToCn.containsKey(temp)) {
				sb.append(temp);
			} else {
				String[] strings = _A.parserEnglishString(temp);
				for (String string : strings) {
					if (string == null || string.length() < S_Pos.INT_ONE) {
						string = S_Pos.EMPTY_STRING;
					}
					if (fMHMMListOneTime_E_X_S.enToCn.containsKey(string)) {
						sb.append(fMHMMListOneTime_E_X_S.enToCn.getString(string)
							.split(S_Pos.NLP_DOT)[S_Pos.INT_ZERO]);
					} else if (fMHMMListOneTime_E_X_S.fullEnToCn.containsKey(string)) {
						sb.append(fMHMMListOneTime_E_X_S.fullEnToCn.get(string));
					} else {
						sb.append(temp);
					}
				}
			}
		}
		return sb.toString();
	}

	public String ChineseStringToEnglishStringWithPOS(AE _A, String ChineseString) {
		List<String> nodes= _A.parserMixedString(ChineseString);
		StringBuilder sb= new StringBuilder();
		for (String temp : nodes) {
			if (fMHMMListOneTime_E_X_S.cnToEn.containsKey(temp)) {
				sb.append(fMHMMListOneTime_E_X_S.cnToEn.get(temp));
			} else if (fMHMMListOneTime_E_X_S.fullCnToEn.containsKey(temp)) {
				sb.append(fMHMMListOneTime_E_X_S.fullCnToEn.get(temp));
			} else {
				sb.append(temp);
			}
			if (fMHMMListOneTime_E_X_S.posCnToCn.containsKey(temp)) {
				sb.append(S_Pos.NLP_SYMBO_SLASH);
				sb.append(fMHMMListOneTime_E_X_S.posCnToCn.get(temp));
			}
			sb.append(S_Pos.SPACE_STRING);
		}
		return sb.toString();
	}

	public List<Verbal> index(AE _A, String mixedString) {
		List<Verbal> verbals= new CopyOnWriteArrayList<>();
		List<String> nodes= _A.parserMixedString(mixedString.toLowerCase());
		for (String word : nodes) {
			Verbal verbal = new Verbal();
			if (fMHMMListOneTime_E_X_S.posCnToCn.containsKey(word)) {
				verbal.I_Chinese(word);
				verbal.I_PartOfSpeech(fMHMMListOneTime_E_X_S.posCnToCn.getString(word));
				if (fMHMMListOneTime_E_X_S.cnToEn.containsKey(word)) {
					verbal.I_English(fMHMMListOneTime_E_X_S.cnToEn.getString(word));
					if (fMHMMListOneTime_E_X_S.enToCn.containsKey(fMHMMListOneTime_E_X_S.cnToEn.get(word))) {
						verbal.I_Explain(fMHMMListOneTime_E_X_S.enToCn
							.getString(fMHMMListOneTime_E_X_S.cnToEn.getString(word)));
					}
				} else if (fMHMMListOneTime_E_X_S.fullCnToEn.containsKey(word)) {
					verbal.I_English(fMHMMListOneTime_E_X_S.fullCnToEn.getString(word));
					verbal.I_Explain(fMHMMListOneTime_E_X_S.fullCnToEn.getString(word));
				}
			} else if (fMHMMListOneTime_E_X_S.posEnToEn.containsKey(word)) {
				verbal.I_English(word);
				if (fMHMMListOneTime_E_X_S.fullEnToCn.containsKey(word)) {
					verbal.I_Chinese(fMHMMListOneTime_E_X_S.fullEnToCn.getString(word));
				}
				if (fMHMMListOneTime_E_X_S.posCnToCn.containsKey(fMHMMListOneTime_E_X_S.fullEnToCn.get(word))) {
					verbal.I_PartOfSpeech(fMHMMListOneTime_E_X_S.posCnToCn
						.getString(fMHMMListOneTime_E_X_S.fullEnToCn.getString(word)));
				}
				if (fMHMMListOneTime_E_X_S.enToCn.containsKey(word)) {
					verbal.I_Explain(fMHMMListOneTime_E_X_S.enToCn.getString(word));
				}
			} else {
				verbal.I_English(word);
				verbal.I_Chinese(fMHMMListOneTime_E_X_S.fullEnToCn.getString(word));
				verbal.I_PartOfSpeech(S_Pos.NLP_NULL);
				verbal.I_Explain(S_Pos.NLP_NULL);
			}
			verbals.add(verbal);
		}
		return verbals;
	}

	public List<Verbal> fixPos(List<Verbal> verbals) {
		for(int i= 0; i < verbals.size(); i++) {
			if(verbals.get(i).getPartOfSpeech() != null) {
				if(verbals.get(i).getPartOfSpeech().contains(S_Pos.NLP_ZI_DONG)){
					if(!verbals.get(i).getPartOfSpeech().contains(S_Pos.NLP_ZI_MING)){
						if(i - S_Pos.INT_ONE > S_Pos.INT_ZERO && verbals.get(i 
								- S_Pos.INT_ONE)
								.getEnglish().contains(S_Pos.NLP_ENGLISH_OF)) {
							Verbal temp= verbals.get(i);
							temp.I_PartOfSpeech(S_Pos.NLP_CI_DONG_MING);
							String english= temp.getEnglish().replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING);
							if(english.charAt(english.length() - S_Pos.INT_ONE)== S_Pos.NLP_CHAR_E) {
								english= S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING 
										+ english.substring(S_Pos.INT_ZERO, english.length() - S_Pos.INT_ONE)
										+ S_Pos.NLP_ENGLISH_ING;
							}else {
								english= S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING + english + S_Pos.NLP_ENGLISH_ING;
							}
							temp.I_English(english);
						}else if(verbals.get(i + S_Pos.INT_ONE).getPartOfSpeech().contains(S_Pos.NLP_ZI_MING)){
							if(i - S_Pos.INT_ONE >= S_Pos.INT_ZERO 
									&& !verbals.get(i - S_Pos.INT_ONE).getPartOfSpeech()
									.contains(S_Pos.NLP_ZI_MING)){
								if(!verbals.get(i - S_Pos.INT_ONE).getPartOfSpeech().contains(S_Pos.NLP_ZI_DAI)){
									if(verbals.get(i - S_Pos.INT_ONE).getPartOfSpeech().contains(S_Pos.NLP_ZI_JIE)){
										if(verbals.get(i - S_Pos.INT_ONE).getChinese().contains(S_Pos.NLP_ZI_ZAI)){
											if(verbals.get(i + S_Pos.INT_ONE).getChinese().contains(S_Pos.NLP_ZI_ZHONG)){
												Verbal temp= verbals.get(i + S_Pos.INT_ONE);
												temp.I_English(S_Pos.NLP_ENGLISH_STATUS);
											}
										}
									}
									Verbal temp= verbals.get(i);
									temp.I_PartOfSpeech(S_Pos.NLP_CI_DONG_MING);
									String english= temp.getEnglish().replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING);
									if(english.charAt(english.length()-S_Pos.INT_ONE)== S_Pos.NLP_CHAR_E) {
										english= S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING 
												+ english.substring(S_Pos.INT_ZERO, english.length() - S_Pos.INT_ONE)
												+ S_Pos.NLP_ENGLISH_ING;
									}else {
										english= S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING 
												+ english + S_Pos.NLP_ENGLISH_ING;
									}
									temp.I_English(english);
								}
							}
							if(verbals.get(i + S_Pos.INT_TWO).getPartOfSpeech().contains(S_Pos.NLP_ZI_DONG)){
								if(!verbals.get(i + S_Pos.INT_TWO).getPartOfSpeech().contains(S_Pos.NLP_ZI_MING)){
									if(verbals.get(i + S_Pos.INT_THREE).getPartOfSpeech().contains(S_Pos.NLP_ZI_MING)){
										Verbal temp= verbals.get(i + S_Pos.INT_TWO);
										temp.I_PartOfSpeech(S_Pos.NLP_CI_DONG_MING);
										String english= temp.getEnglish().replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING);
										if(english.charAt(english.length() - S_Pos.INT_ONE)== S_Pos.NLP_CHAR_E) {
											english= S_Pos.NLP_ENGLISH_OF + S_Pos.SPACE_STRING +
													S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING 
													+ english.substring(S_Pos.INT_ZERO, english.length()-S_Pos.INT_ONE)
													+ S_Pos.NLP_ENGLISH_ING;
										}else {
											english= S_Pos.NLP_ENGLISH_OF + S_Pos.SPACE_STRING 
													+ S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING 
													+ english + S_Pos.NLP_ENGLISH_ING;
										}
										temp.I_English(english);
									}
								}
							}
						}else if(i - S_Pos.INT_ONE >= S_Pos.INT_ZERO && verbals.get(i - S_Pos.INT_ONE)
								.getPartOfSpeech().contains(S_Pos.NLP_ZI_JIE)){
							Verbal temp= verbals.get(i);
							temp.I_PartOfSpeech(S_Pos.NLP_CI_DONG_MING);
							String english= temp.getEnglish().replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING);
							if(english.charAt(english.length() - S_Pos.INT_ONE)== S_Pos.NLP_CHAR_E) {
								english= S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING 
										+ english.substring(S_Pos.INT_ZERO
										, english.length() - S_Pos.INT_ONE) + S_Pos.NLP_ENGLISH_ING;
							}else {
								english= S_Pos.NLP_ENGLISH_THE + S_Pos.SPACE_STRING  
										+ english + S_Pos.NLP_ENGLISH_ING;
							}
							temp.I_English(english);
						}else if(i - S_Pos.INT_ONE >= S_Pos.INT_ZERO 
								&& verbals.get(i - S_Pos.INT_ONE).getPartOfSpeech()
								.contains(S_Pos.NLP_ZI_FU)){
							Verbal temp= verbals.get(i);
							temp.I_PartOfSpeech(S_Pos.NLP_CI_DONG_MING);
							String english= temp.getEnglish().replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING);
							if(english.charAt(english.length() - S_Pos.INT_ONE)== S_Pos.NLP_CHAR_E) {
								english= english.substring(S_Pos.INT_ZERO, english.length() - S_Pos.INT_ONE)
										+ S_Pos.NLP_ENGLISH_ING;
							}else {
								english += S_Pos.NLP_ENGLISH_ING;
							}
							temp.I_English(english);
						}
					}
				}else if(verbals.get(i).getPartOfSpeech().contains(S_Pos.NLP_ZI_MING)){
					if(i - S_Pos.INT_ONE >= S_Pos.INT_ZERO && verbals.get(i - S_Pos.INT_ONE)
							.getPartOfSpeech().contains(S_Pos.NLP_FU_SHU)){
						Verbal temp= verbals.get(i);
						String english= temp.getEnglish().replace(S_Pos.SPACE_STRING, S_Pos.EMPTY_STRING);
						if(english.charAt(english.length()-1)== S_Pos.NLP_CHAR_H 
								|| english.charAt(english.length()-1)== S_Pos.NLP_CHAR_S) {
							english += S_Pos.NLP_ENGLISH_ES;
						}else {
							english += S_Pos.NLP_ENGLISH_S;
						}
						temp.I_English(english);
					}
				}else if(verbals.get(i).getPartOfSpeech().contains(S_Pos.NLP_CI_FU)){
					if(i - S_Pos.INT_ONE >= S_Pos.INT_ZERO && (verbals.get(i-S_Pos.INT_ONE)
							.getPartOfSpeech().contains(S_Pos.NLP_ZI_DAI)
							||verbals.get(i - S_Pos.INT_ONE).getPartOfSpeech().contains(S_Pos.NLP_ZI_MING))){
						if(i-S_Pos.INT_ONE >= S_Pos.INT_ZERO&&verbals.get(i - S_Pos.INT_ONE).getPartOfSpeech()
								.contains(S_Pos.NLP_ZI_again)
								||(verbals.get(i-S_Pos.INT_ONE).getPartOfSpeech().contains(S_Pos.NLP_ZI_single)
										&& verbals.get(i-S_Pos.INT_ONE).getPartOfSpeech().contains(S_Pos.NLP_ZI_one))){
							if(verbals.get(i).getEnglish().contains(S_Pos.NLP_HAVE_HAS)) {
								Verbal temp= verbals.get(i);
								String english= temp.getEnglish().replace(S_Pos.NLP_HAVE_HAS, S_Pos.NLP_HAVE);
								temp.I_English(english);
							}
						}else {
							if(verbals.get(i).getEnglish().contains(S_Pos.NLP_HAVE_HAS)) {
								Verbal temp= verbals.get(i);
								String english= temp.getEnglish().replace(S_Pos.NLP_HAVE_HAS, S_Pos.NLP_HAS);
								temp.I_English(english);
							}
						}
					}	
					if(i-S_Pos.INT_TWO>= S_Pos.INT_ZERO && (verbals.get(i-S_Pos.INT_TWO).getPartOfSpeech()
							.contains(S_Pos.NLP_ZI_DAI) || verbals.get(i-S_Pos.INT_TWO).getPartOfSpeech()
							.contains(S_Pos.NLP_ZI_MING))){
						if(verbals.get(i-S_Pos.INT_TWO).getPartOfSpeech().contains(S_Pos.NLP_ZI_again)
							||(verbals.get(i-S_Pos.INT_TWO).getPartOfSpeech().contains(S_Pos.NLP_ZI_single)
									&&verbals.get(i-S_Pos.INT_TWO).getPartOfSpeech().contains(S_Pos.NLP_ZI_one))){
							if(verbals.get(i).getEnglish().contains(S_Pos.NLP_HAVE_HAS)) {
								Verbal temp= verbals.get(i);
								String english= temp.getEnglish().replace(S_Pos.NLP_HAVE_HAS, S_Pos.NLP_HAVE);
								temp.I_English(english);
							}
						}else {
							if(verbals.get(i).getEnglish().contains(S_Pos.NLP_HAVE_HAS)) {
								Verbal temp= verbals.get(i);
								String english= temp.getEnglish().replace(S_Pos.NLP_HAVE_HAS, S_Pos.NLP_HAS);
								temp.I_English(english);
							}
						}
					}	 
				}	
			}
		}
		return verbals;
	}

	public String getChineseSentenseFromVerbalList(List<Verbal> verbals) {
		StringBuilder sb= new StringBuilder();
		for (Verbal verbal : verbals) {
			sb.append(verbal.getChinese() == null
				? S_Pos.EMPTY_STRING : verbal.getChinese());
		}
		return sb.toString()
.replaceAll(S_Pos.NLP_SPASE_REP, S_Pos.SPACE_STRING);
	}

	public String getEnglishSentenseFromVerbalFixList(List<Verbal> verbalsFix) {
		StringBuilder sb= new StringBuilder();
		for (Verbal fix : verbalsFix) {
			sb.append(fix.getEnglish() == null
				? S_Pos.EMPTY_STRING : fix.getEnglish().toLowerCase());
			sb.append(S_Pos.SPACE_STRING);
		}
		return sb.toString()
.replaceAll(S_Pos.NLP_SPASE_REP, S_Pos.SPACE_STRING);
	}
}
