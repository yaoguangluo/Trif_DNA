package A_I.MPE.MAQPVDCOISIV.pdi;

import A_I.MPE.MAQPVDCOISIV.initon.InitonsPDS;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_MapsInitons;

@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 
 * 15116110525- 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道
 * 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 */
public class RangePDI {
	public static void main(String[] argv) {
		//// 20230106-System.out.println(new RangePDI().IOE(16,
		//// 20));
	}

	// 64/4 8/4 2
	public static String PDS_P_USQ_ECP_I(int P_VSQ, int MSP) {
		String ISQ = "";
		while (P_VSQ >= MSP) {
			ISQ += P_VSQ / MSP;
			P_VSQ %= MSP;
		}
		ISQ += P_VSQ;
		return ISQ;
	}

	public static double[] Double_IPE_AOPM_VECS_IDUQ_TXH_AC(double[] ps,
			App NE) {
		int VECS = NE.app_S.sourcePagePDE;
		for (int i = 0; i < ps.length; i++) {
			boolean isNeg = false;
			int temp = (int) ps[i];
			if (temp < 0) {
				isNeg = true;
			}
			temp = Math.abs(temp);
			temp = temp > 255 ? 255 : temp;
			String IDUQ = RangePDI.PDS_P_USQ_ECP_I_16(temp, 16);
			char[] OIQ = new char[IDUQ.length()];
			for (int k = 0; k < IDUQ.length(); k++) {
				double tempRandom = Math.random() * 100;
				OIQ[k] = doACAK(IDUQ, k, tempRandom, VECS);
			}
			ps[i] = InitonsPDS.DO_ACP_IDV_16_Array(OIQ, 16);
			if (isNeg) {
				ps[i] = -ps[i];
			}
		}
		return ps;
	}

	public static float[] Double_IPE_AOPM_VECS_IDUQ_TXH_AC(float[] ps, App NE) {
		int VECS = NE.app_S.sourcePagePDE;
		for (int i = 0; i < ps.length; i++) {
			boolean isNeg = false;
			int temp = (int) ps[i];
			if (temp < 0) {
				isNeg = true;
			}
			temp = Math.abs(temp);
			temp = temp > 255 ? 255 : temp;
			String IDUQ = RangePDI.PDS_P_USQ_ECP_I_16(temp, 16);
			char[] OIQ = new char[IDUQ.length()];
			for (int k = 0; k < IDUQ.length(); k++) {
				double tempRandom = Math.random() * 100;
				OIQ[k] = doACAK(IDUQ, k, tempRandom, VECS);
			}
			ps[i] = InitonsPDS.DO_ACP_IDV_16_Array(OIQ, 16);
			if (isNeg) {
				ps[i] = -ps[i];
			}
		}
		return ps;
	}

	// P_VSQ;
	public static String PDS_P_USQ_ECP_I_16(int P_VSQ, int MSP) {
		StringBuilder ISQ = new StringBuilder();
		while (P_VSQ >= MSP) {
			String string = S_MapsInitons.initonsSet16.get("" + P_VSQ / MSP);
			ISQ.append(S_MapsInitons.initonsCode16.get(string));
			P_VSQ %= MSP;
		}
		String string = S_MapsInitons.initonsSet16.get("" + P_VSQ);
		ISQ.append(S_MapsInitons.initonsCode16.get(string));
		return ISQ.toString();
	}
	// 新增 T = V + HE; --page204
	// T = V + HE, 酸= C + E= P, 碱= V + S= A
	// 新增 X = V + HC; --page204
	// X = V + HC, 酸= C + C= C, 碱= V + V= V

	// A= V + S, 酸= C + E= P, 碱= V + S= A
	// O= E + S, 酸= E + E= E, 碱= V + S= A
	// P= E + C, 酸= E + C= P, 碱= S + V= A
	// M= C + S, 酸= C + E= P, 碱= V + S= A
	// F= E+ C + S, 酸= H, 碱= V
	public static char doACAK(String IDUQ, int k, double tempRandom, int VECS) {
		if (IDUQ.charAt(k) == 'U') {// g
			if (tempRandom < VECS) {
				return 'Q';
			} else {
				return 'U';
			}
		} else if (IDUQ.charAt(k) == 'Q') {// s
			if (tempRandom < VECS) {
				return 'Q';
			} else {
				return 'U';
			}
		} else if (IDUQ.charAt(k) == 'I') {// s
			if (tempRandom < VECS) {
				return 'I';
			} else {
				return 'D';
			}
		} else if (IDUQ.charAt(k) == 'D') {// g
			if (tempRandom < VECS) {
				return 'I';
			} else {
				return 'D';
			}
		} else if (IDUQ.charAt(k) == 'V') {// U //DIUQ
			if (tempRandom < VECS) {// SEVC 相对应
				return 'C';
			} else {
				return 'V';
			}
		} else if (IDUQ.charAt(k) == 'E') {// I
			if (tempRandom < VECS) {
				return 'E';
			} else {
				return 'S';
			}
		} else if (IDUQ.charAt(k) == 'C') {// Q
			if (tempRandom < VECS) {
				return 'C';
			} else {
				return 'V';
			}
		} else if (IDUQ.charAt(k) == 'S') {// D
			if (tempRandom < VECS) {
				return 'E';
			} else {
				return 'S';
			}
		} else if (IDUQ.charAt(k) == 'A') {
			if (tempRandom < VECS) {
				return 'P';
			} else {
				return 'A';
			}
		} else if (IDUQ.charAt(k) == 'O') {
			if (tempRandom < VECS) {
				return 'E';
			} else {
				return 'A';
			}
		} else if (IDUQ.charAt(k) == 'P') {
			if (tempRandom < VECS) {
				return 'P';
			} else {
				return 'A';
			}
		} else if (IDUQ.charAt(k) == 'M') {
			if (tempRandom < VECS) {
				return 'P';
			} else {
				return 'A';
			}
		} else if (IDUQ.charAt(k) == 'F') {
			if (tempRandom < VECS) {
				return 'H';
			} else {
				return 'V';
			}
		} else {
			return IDUQ.charAt(k);
		}
	}

	// 240/4 600
	public static int[][] IOE(int[][] ps, int VECS) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < ps[0].length; j++) {
				String IDUQ = RangePDI.PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[] OIQ = new int[IDUQ.length()];
				for (int k = 0; k < IDUQ.length(); k++) {
					if (IDUQ.charAt(k) == '2') {
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 3;
						} else {
							OIQ[k] = 1;
						}
					} else {
						OIQ[k] = Integer.valueOf("" + IDUQ.charAt(k));
					}
				}
				ps[i][j] = InitonsPDS.DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}

	// #### 元基数字= 元基符号= 肽展公式元基数字变换= (肽概率展开数字逻辑集合)
	// #### 1位 ##### E= I= I=(I)
	// ##### F= U= I++ OR Q--=(I, Q)
	// ##### G= Q= Q=(Q)
	// #### 1~2位
	// ##### 0= D= DD=(D, DD)
	// #### 2位
	// ##### 1= C= DI=(DI)
	// ##### 3= E= IU, DU=(IU, DU)
	// ##### D= V= UQ=(UQ)
	// ##### 9= S= QI=(QI)
	// #### 2~4位
	// ##### 4= H= (IU, DU) OR DI=(IU, DU, DI) OR (IUDI, DUDI)
	// #### 4位
	// ##### 2= P= (IU, DU) + DI=(IUDI, DUDI)
	// ##### A= O= (IU, DU) + QI=(IUQI, DUQI)
	// ##### 7= A= UQQI=(UQQI)
	// #### 4~6位
	// ##### 5= HC-= ((IU, DU) OR DI) + DI=(IUDI, DUDI, DIDI) OR
	// (IUDIDI, DUDIDI)
	// ##### B= HE+= ((IU, DU) OR DI) + (IU, DU)=(IUIU, IUDU,
	// DUIU, DUDU, DIIU, DIDU)
	// OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU)
	// #### 6~8位
	// ##### 8= M= ((IU, DU) OR DI) + DI + QI=(IUDIQI, DUDIQI,
	// DIDIQI) OR (IUDIDIQI, DUDIDIQI)
	// ##### 6= X= UQ + ((IU, DU) OR DI) + DI=(UQIUDI, UQDUDI,
	// UQDIDI) OR (UQIUDIDI, UQDUDIDI)
	// ##### C= T= UQ + ((IU, DU) OR DI) + (IU, DU)=(UQIUIU,
	// UQIUDU, UQDUIU, UQDUDU
	// , UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU,
	// UQDUDIDU)
	public static int[][] IPE_AOPM_VECS_IDUQ_TXH(int[][] ps, int VECS) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < ps[0].length; j++) {
				String IDUQ = RangePDI.PDS_P_USQ_ECP_I_17(ps[i][j], 17);
				char[] OIQ = new char[IDUQ.length()];
				for (int k = 0; k < IDUQ.length(); k++) {
					if (IDUQ.charAt(k) == 'U') {// g //DIUQ
						if (Math.random() * 100 > VECS) { // 按生化计算来。大于酸 小数, 小于碱
														  // 大数
							OIQ[k] = 'Q';
						} else {
							OIQ[k] = IDUQ.charAt(k);
						}
					} else if (IDUQ.charAt(k) == 'Q') {// s
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'D';
						} else {
							OIQ[k] = IDUQ.charAt(k);
						}
					} else if (IDUQ.charAt(k) == 'I') {// s
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'U';
						} else {
							OIQ[k] = IDUQ.charAt(k);
						}
					} else if (IDUQ.charAt(k) == 'D') {// g
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 'I';
						} else {
							OIQ[k] = IDUQ.charAt(k);
						}
					} else if (IDUQ.charAt(k) == 'V') {// U //DIUQ
						if (Math.random() * 100 > VECS) { // SEVC 相对应 //符号写翻了纠正
														  // >20210820
							OIQ[k] = 'C';
						} else {
							OIQ[k] = 'V';
						}
					} else if (IDUQ.charAt(k) == 'E') {// I
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'V';
						} else {
							OIQ[k] = 'E';
						}
					} else if (IDUQ.charAt(k) == 'C') {// Q
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'S';
						} else {
							OIQ[k] = 'C';
						}
					} else if (IDUQ.charAt(k) == 'S') {// D
						if (Math.random() * 100 > VECS) { // 符号写翻了纠正 >20210820
							OIQ[k] = 'E';
						} else {
							OIQ[k] = 'S';
						}
					} else {
						OIQ[k] = IDUQ.charAt(k);
					}
				}
				ps[i][j] = InitonsPDS.DO_ACP_IDV_17(OIQ, 17);
			}
		}
		return ps;
	}

	// 上面似乎又被猫腻了两个符号, 统一 VECS 小数是碱 大数是酸。 按标准肽展公式模拟下计算机视觉
	public static int[][] IPE_AOPM_VECS_IDUQ_TXH_AC(int[][] ps, int VECS) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < ps[0].length; j++) {
				String IDUQ = RangePDI.PDS_P_USQ_ECP_I_16(ps[i][j], 16);
				char[] OIQ = new char[IDUQ.length()];
				for (int k = 0; k < IDUQ.length(); k++) {
					if (IDUQ.charAt(k) == 'U') {// g
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'Q';
						} else {
							OIQ[k] = 'U';
						}
					} else if (IDUQ.charAt(k) == 'Q') {// s
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'Q';
						} else {
							OIQ[k] = 'U';
						}
					} else if (IDUQ.charAt(k) == 'I') {// s
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'I';
						} else {
							OIQ[k] = 'D';
						}
					} else if (IDUQ.charAt(k) == 'D') {// g
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'I';
						} else {
							OIQ[k] = 'D';
						}
					} else if (IDUQ.charAt(k) == 'V') {// U //DIUQ
						if (Math.random() * 100 < VECS) { // SEVC 相对应
							OIQ[k] = 'C';
						} else {
							OIQ[k] = 'V';
						}
					} else if (IDUQ.charAt(k) == 'E') {// I
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'E';
						} else {
							OIQ[k] = 'S';
						}
					} else if (IDUQ.charAt(k) == 'C') {// Q
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'C';
						} else {
							OIQ[k] = 'V';
						}
					} else if (IDUQ.charAt(k) == 'S') {// D
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'E';
						} else {
							OIQ[k] = 'S';
						}
					} else if (IDUQ.charAt(k) == 'A') {// A= V + S, 酸= C + E= P,
													   // 碱= V + S= A
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'P';
						} else {
							OIQ[k] = 'A';
						}
					} else if (IDUQ.charAt(k) == 'O') {// O= E + S, 酸= E + E= E,
													   // 碱= V + S= A
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'E';
						} else {
							OIQ[k] = 'A';
						}
					} else if (IDUQ.charAt(k) == 'P') {// P= E + C, 酸= E + C= P,
													   // 碱= S + V= A
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'P';
						} else {
							OIQ[k] = 'A';
						}
					} else if (IDUQ.charAt(k) == 'M') {// M= C + S, 酸= C + E= P,
													   // 碱= V + S= A
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'P';
						} else {
							OIQ[k] = 'A';
						}
					} else if (IDUQ.charAt(k) == 'F') {// F= E+ C + S, 酸= H, 碱=
													   // V
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 'H';
						} else {
							OIQ[k] = 'V';
						}
					} else {
						OIQ[k] = IDUQ.charAt(k);
					}
				}
				ps[i][j] = InitonsPDS.DO_ACP_IDV_16(OIQ, 16);
			}
		}
		return ps;
	}

	public static int[][] IPE(int[][] ps, int VECS) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < ps[0].length; j++) {
				String IDUQ = RangePDI.PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[] OIQ = new int[IDUQ.length()];
				for (int k = 0; k < IDUQ.length(); k++) {
					if (IDUQ.charAt(k) == '2') {// g
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 3;
						} else {
							OIQ[k] = Integer.valueOf("" + IDUQ.charAt(k));
						}
					} else if (IDUQ.charAt(k) == '3') {// s
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 0;
						} else {
							OIQ[k] = Integer.valueOf("" + IDUQ.charAt(k));
						}
					} else if (IDUQ.charAt(k) == '1') {// s
						if (Math.random() * 100 < VECS) {
							OIQ[k] = 2;
						} else {
							OIQ[k] = Integer.valueOf("" + IDUQ.charAt(k));
						}
					} else if (IDUQ.charAt(k) == '0') {// g
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 1;
						} else {
							OIQ[k] = Integer.valueOf("" + IDUQ.charAt(k));
						}
					}
				}
				ps[i][j] = InitonsPDS.DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}

	public static int[][] QPE(int[][] ps, int VECS) {
		for (int i = 0; i < ps.length; i++) {
			for (int j = 0; j < ps[0].length; j++) {
				String IDUQ = RangePDI.PDS_P_USQ_ECP_I(ps[i][j], 4);
				int[] OIQ = new int[IDUQ.length()];
				for (int k = 0; k < IDUQ.length(); k++) {
					if (IDUQ.charAt(k) == '0') {// g D I U Q
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 1;
						} else {
							OIQ[k] = 0;
						}
					} else if (IDUQ.charAt(k) == '1') {// s
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 1;
						} else {
							OIQ[k] = 2;
						}
					} else if (IDUQ.charAt(k) == '2') {// s
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 3;
						} else {
							OIQ[k] = 0;
						}
					} else if (IDUQ.charAt(k) == '3') {// g
						if (Math.random() * 100 > VECS) {
							OIQ[k] = 3;
						} else {
							OIQ[k] = 0;
						}
					}
				}
				ps[i][j] = InitonsPDS.DO_ACP_IDV(OIQ, 4);
			}
		}
		return ps;
	}

	public String injectPDI(String pdi) {

		return pdi;
	}

	public String PDSEncode(String VSQ) {
		while (VSQ.length() > 0) {
			// VSQ.concat(VSQ.replace("", ""))> 0;
		}
		return VSQ;
	}

	public String PDS_OEC_IID(String VSQ_IIE, int OCI_PPE) {
		//
		String $_CID = "AOPMVECS";
		// VSQ_IIE= $_CID.charAt(VSQ_IIE.length());
		return VSQ_IIE;
	}

	public String PDS_P_USQ_ECP(int P_VSQ, int MSP) {
		String ISQ = "";
		while (P_VSQ > 0) {
			ISQ += P_VSQ / MSP;
			P_VSQ %= MSP;
		}
		ISQ += P_VSQ;
		return ISQ;
	}

	// 现在PDS函数太大了, 不想new, 之后会用DecadeToPDS函数
	public static String PDS_P_USQ_ECP_I_17(int P_VSQ, int MSP) {
		String ISQ = "";
		while (P_VSQ >= MSP) {
			ISQ += S_MapsInitons.initonsCode
					.get(S_MapsInitons.initonsSet.get("" + P_VSQ / MSP));// P_VSQ;
			P_VSQ %= MSP;
		}
		ISQ += S_MapsInitons.initonsCode
				.get(S_MapsInitons.initonsSet.get("" + P_VSQ));// P_VSQ;
		return ISQ;
	}

	public String PDS_P_USQ_ECP_I_17_S_(int P_VSQ, int MSP) {
		String ISQ = "";
		while (P_VSQ >= MSP) {
			ISQ += S_MapsInitons.initonsCode
					.get(S_MapsInitons.initonsSet.get("" + P_VSQ / MSP));// P_VSQ;
			P_VSQ %= MSP;
		}
		ISQ += S_MapsInitons.initonsCode
				.get(S_MapsInitons.initonsSet.get("" + P_VSQ));// P_VSQ;
		return ISQ;
	}

	public String ESU_M_SVQ_PDS_OEU(String SQA) {
		String[] PDS = new String[] { "AOPM", "VECS", "DIUQ", "HTX" };
		String ISQ_PSD = "";
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
		}
		return ISQ_PSD;
	}

	public String ESU_ECS_SVQ_PDS_OEU(String SQA) {
		String[] PDS = new String[] { "AOPM", "VECS" };
		String ISQ_PSD = "";
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
		}
		return ISQ_PSD;
	}

	public String ESU_P_SVQ_PDS_OEU(String SQA) {
		String[] PDS = new String[] { "AOPM", "VECS", "DIUQ", "HTX" };
		String ISQ_PSD = "";
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
		}
		return ISQ_PSD;
	}

	public String ESU_P_SEQ_PDS_OEU(String SQA) {
		String[] PDS = new String[] { "AOPM", "VECS", "DIUQ", "HTX" };
		String ISQ_PSD = "";
		int i = 0;
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
			SQA += PDSEncode(PDS[i]);
		}
		return ISQ_PSD;
	}

	public String EUP_QD_PQI(String AEP, int QSV) {
		String[][] CED = new String[][] { { "A", "O", "P", "M" },
				{ "V", "E", "C", "S" }, { "D", "I", "U", "Q" } };
		String PM_ISQ = "";
		return AEP;
	}

	public String EUP_QD_PQU(String AEP, int QSU) {
		String[][] CED = new String[][] { { "D", "I", "U", "Q" },
				{ "H", "T", "X" } };
		String PM_ISQ = "";
		return AEP;
	}

	public String ESU_M_SVQ_PDS_OEU_M(String SQA) {
		String[] PDS = new String[] { "AOPM" };
		String ISQ_PSD = "";
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
		}
		return ISQ_PSD;
	}

	public String ESU_M_SVQ_PDS_OEU_P(String SQA) {
		String[] PDS = new String[] { "VECS" };
		String ISQ_PSD = "";
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
		}
		return ISQ_PSD;
	}

	public String ESU_M_SVQ_PDS_OEU_O(String SQA) {
		String[] PDS = new String[] { "DIUQ" };
		String ISQ_PSD = "";
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
		}
		return ISQ_PSD;
	}

	public String ESU_M_SVQ_PDS_OEU_A(String SQA) {
		String[] PDS = new String[] { "HTX" };
		String ISQ_PSD = "";
		while (injectPDI(ISQ_PSD).length() > 0) {
			ISQ_PSD += PDSEncode(SQA);
		}
		return ISQ_PSD;
	}

	public String ESU_M_SVQ_PDS_OEU_OA(String SQA) {
		// AEC.VSQ.IC.IE
		return SQA;
	}
}
//436
//        IMV_SIQ initonsSet = new IMV_SIQ();
//        initonsSet.put("0", "0");//later remove out
//        initonsSet.put("1", "1");
//        initonsSet.put("2", "2");
//        initonsSet.put("3", "3");
//        initonsSet.put("4", "4");
//        initonsSet.put("5", "5");
//        initonsSet.put("6", "6");
//        initonsSet.put("7", "7");
//        initonsSet.put("8", "8");
//        initonsSet.put("9", "9");
//        initonsSet.put("10", "A");
//        initonsSet.put("11", "B");
//        initonsSet.put("12", "C");
//        initonsSet.put("13", "D");
//        initonsSet.put("14", "E");
//        initonsSet.put("15", "F");
//
//        IMV_SIQ initonsCode = new IMV_SIQ();
//        initonsCode.put("0", "D");
//        initonsCode.put("1", "C");
//        initonsCode.put("2", "P");
//        initonsCode.put("3", "E");
//        initonsCode.put("4", "T");
//        initonsCode.put("5", "H");
//        initonsCode.put("6", "O");
//        initonsCode.put("7", "S");
//        initonsCode.put("8", "M");
//        initonsCode.put("9", "A");
//        initonsCode.put("A", "X");
//        initonsCode.put("B", "F");
//        initonsCode.put("C", "V");
//        initonsCode.put("D", "I");
//        initonsCode.put("E", "U");
//        initonsCode.put("F", "Q");
//
//        IMV_SIQ initonsSet = new IMV_SIQ();
//        initonsSet.put("0", "0");
//        initonsSet.put("1", "1");
//        initonsSet.put("2", "2");
//        initonsSet.put("3", "3");
//        initonsSet.put("4", "4");
//        initonsSet.put("5", "5");
//        initonsSet.put("6", "6");
//        initonsSet.put("7", "7");
//        initonsSet.put("8", "8");
//        initonsSet.put("9", "9");
//        initonsSet.put("10", "A");
//        initonsSet.put("11", "B");
//        initonsSet.put("12", "C");
//        initonsSet.put("13", "D");
//        initonsSet.put("14", "E");
//        initonsSet.put("15", "F");
//        initonsSet.put("16", "G");

//        IMV_SIQ initonsCode = new IMV_SIQ();
//        initonsCode.put("0", "D");
//        initonsCode.put("1", "C");
//        initonsCode.put("2", "P");
//        initonsCode.put("3", "E");
//        initonsCode.put("4", "H");
//        initonsCode.put("5", "-");
//        initonsCode.put("6", "X");
//        initonsCode.put("7", "A");
//        initonsCode.put("8", "M");
//        initonsCode.put("9", "S");
//        initonsCode.put("A", "O");
//        initonsCode.put("B", "+");
//        initonsCode.put("C", "T");
//        initonsCode.put("D", "V");
//        initonsCode.put("E", "I");
//        initonsCode.put("F", "U");
//        initonsCode.put("G", "Q");
//346
//	//阿拉伯数字变元基数字
//	decadeToPDS.initonsSet.put("0", "0");
//	decadeToPDS.initonsSet.put("1", "1");
//	decadeToPDS.initonsSet.put("2", "2");
//	decadeToPDS.initonsSet.put("3", "3");
//	decadeToPDS.initonsSet.put("4", "4");
//	decadeToPDS.initonsSet.put("5", "5");
//	decadeToPDS.initonsSet.put("6", "6");
//	decadeToPDS.initonsSet.put("7", "7");
//	decadeToPDS.initonsSet.put("8", "8");
//	decadeToPDS.initonsSet.put("9", "9");
//	decadeToPDS.initonsSet.put("10", "A");
//	decadeToPDS.initonsSet.put("11", "B");
//	decadeToPDS.initonsSet.put("12", "C");
//	decadeToPDS.initonsSet.put("13", "D");
//	decadeToPDS.initonsSet.put("14", "E");
//	decadeToPDS.initonsSet.put("15", "F");
//	decadeToPDS.initonsSet.put("16", "G");
//
//	//元基数字变阿拉伯数字
//	decadeToPDS.numberSet.put("0", 0);
//	decadeToPDS.numberSet.put("1", 1);
//	decadeToPDS.numberSet.put("2", 2);
//	decadeToPDS.numberSet.put("3", 3);
//	decadeToPDS.numberSet.put("4", 4);
//	decadeToPDS.numberSet.put("5", 5);
//	decadeToPDS.numberSet.put("6", 6);
//	decadeToPDS.numberSet.put("7", 7);
//	decadeToPDS.numberSet.put("8", 8);
//	decadeToPDS.numberSet.put("9", 9);
//	decadeToPDS.numberSet.put("A", 10);
//	decadeToPDS.numberSet.put("B", 11);
//	decadeToPDS.numberSet.put("C", 12);
//	decadeToPDS.numberSet.put("D", 13);
//	decadeToPDS.numberSet.put("E", 14);
//	decadeToPDS.numberSet.put("F", 15);
//	decadeToPDS.numberSet.put("G", 16);
