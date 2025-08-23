package A_I.MPE.MSU.pds;
//这个函数用于元基进行数字逻辑丝化变换
//思想：肽展公式, 十六 十七进制元基数字, 元基数字逻辑
//作者：罗瑶光
//算法参考如下（肽展公式在离散数学中根据贝叶斯进行数字逻辑变换）
//#### 元基数字 =   元基符号=   肽展公式元基数字变换= (肽概率展开数字逻辑集合)
//#### 0	=		D = 	DD=(D, DD)
//#### E 	=		I = 	I =(I) 
//#### F 	=		U = 	I++ OR Q-- =(I, Q)
//#### G 	=		Q =    Q =(Q) 
//
//#### 1	=		C =  	DI =(DI) 
//#### 3 	=		E =  	IU, DU =(IU, DU)
//#### 4 	=		H =  	(IU, DU) OR DI =(IU, DU, DI) OR (IUDI, DUDI)
//#### D 	=		V = 	UQ =(UQ) 
//#### 9 	=		S = 	QI =(QI) 
//
//
//#### 2 	=		P = 	(IU, DU) + DI =(IUDI, DUDI)
//#### 5 	=		HC=    ((IU, DU) OR DI) + DI =(IUDI, DUDI, DIDI) OR (IUDIDI
//, DUDIDI)
//#### B 	=		HE=    ((IU, DU) OR DI) + (IU, DU) =(IUIU, IUDU, DUIU, DUDU
//, DIIU, DIDU) OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU)
//#### A 	=		O = 	(IU, DU) + QI =(IUQI, DUQI)
//#### 7 	=		A = 	UQQI =(UQQI) 
//
//
//#### 8 	=		M = 	((IU, DU) OR DI) + DI + QI =(IUDIQI, DUDIQI, DIDIQI)
//OR (IUDIDIQI, DUDIDIQI)
//#### 6 	=		X =  	UQ + ((IU, DU) OR DI) + DI =(UQIUDI, UQDUDI, UQDIDI)
//OR (UQIUDIDI, UQDUDIDI)
//#### C 	=		T = 	UQ + ((IU, DU) OR DI) + (IU, DU) =(UQIUIU, UQIUDU,
//UQDUIU, UQDUDU, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU)


//根据结构式进行分析 全嘌呤肽展公式PDE PDS。罗瑶光20211201
//F全嘌呤= E OR C OR S= E OR S OR C= (IU, DU) OR QI OR DI= (IUQIDI, DUQIDI)
// 排列方式为 活泼组合E + 稳定组合S + 中性组合C

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PDE_PDS_DL16 {
	public String initonPDSwithBYS(String initon, double bys, StringBuilder pDEKey
			, boolean isBys) {
		if(initon.equalsIgnoreCase("D")) {
			return "D";
		}
		if(initon.equalsIgnoreCase("I")) {
			return "I";
		}
		if(initon.equalsIgnoreCase("U")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "I";	
				}else {
					pDEKey.append("1");
					return "Q";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "I";	
				}else {
					pDEKey.append("1");
					return "Q";
				}	
			}
		}
		if(initon.equalsIgnoreCase("Q")) {
			return "Q";
		}

		if(initon.equalsIgnoreCase("C")) {
			return "DI";
		}
		if(initon.equalsIgnoreCase("E")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "IU";	
				}else {
					pDEKey.append("1");
					return "DU";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "IU";	
				}else {
					pDEKey.append("1");
					return "DU";
				}
			}
		}
		//#### 4 	=		H =  	(IU, DU) OR DI =(IU, DU, DI) OR (IUDI, DUDI)
		if(initon.equalsIgnoreCase("H")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "IUDI";	
				}else {
					pDEKey.append("1");
					return "DUDI";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "IUDI";	
				}else {
					pDEKey.append("1");
					return "DUDI";
				}
			}
		}

		//+- 符号见 FindOulerRing 函数 的 332行。
		//#### 5 	=		HC=    ((IU, DU) OR DI) + DI
		//=(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
		if(initon.equalsIgnoreCase("-")) {	
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "IUDIDI";	
				}else {
					pDEKey.append("1");
					return "DUDIDI";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "IUDIDI";	
				}else {
					pDEKey.append("1");
					return "DUDIDI";
				}
			}
		}
		//+- 符号见 FindOulerRing 函数 的 332行。
		//#### B 	=		HE=    ((IU, DU) OR DI) + (IU, DU)
		//=(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU) OR (IUDIIU, IUDIDU, DUDIIU
		//, DUDIDU)
		if(initon.equalsIgnoreCase("+")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					if(Math.random()< 0.5) {
						pDEKey.append("0");
						return "IUDIIU";	
					}else {
						pDEKey.append("1");
						return "IUDIDU";
					}	
				}else {
					pDEKey.append("1");
					if(Math.random()< 0.5) {
						pDEKey.append("0");
						return "DUDIIU";	
					}else {
						pDEKey.append("1");
						return "DUDIDU";
					}
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					if(Math.random()< bys) {
						pDEKey.append("0");
						return "IUDIIU";	
					}else {
						pDEKey.append("1");
						return "IUDIDU";
					}	
				}else {
					pDEKey.append("1");
					if(Math.random()< bys) {
						pDEKey.append("0");
						return "DUDIIU";	
					}else {
						pDEKey.append("1");
						return "DUDIDU";
					}
				}
			}
		}
		if(initon.equalsIgnoreCase("V")) {
			return "UQ";
		}
		if(initon.equalsIgnoreCase("S")) {
			return "QI";
		}
		//#### 2 	=		P = 	(IU, DU) + DI =(IUDI, DUDI)
		if(initon.equalsIgnoreCase("P")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "IUDI";	
				}else {
					pDEKey.append("1");
					return "DUDI";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "IUDI";	
				}else {
					pDEKey.append("1");
					return "DUDI";
				}
			}
		}
		//#### A 	=		O = 	(IU, DU) + QI =(IUQI, DUQI)
		if(initon.equalsIgnoreCase("O")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "IUQI";	
				}else {
					pDEKey.append("1");
					return "DUQI";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "IUQI";	
				}else {
					pDEKey.append("1");
					return "DUQI";
				}
			}
		}
		if(initon.equalsIgnoreCase("A")) {
			return "UQQI";
		}
		//根据结构式进行分析 全嘌呤肽展公式PDE PDS。罗瑶光20211201
		//F全嘌呤= E OR C OR S= E OR S OR C= (IU, DU) OR QI OR DI= (IUQIDI, DUQIDI)
		// 排列方式为 活泼组合E + 稳定组合S + 中性组合C
		if(initon.equalsIgnoreCase("F")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "IUQIDI";	 
				}else {
					pDEKey.append("1");
					return "DUQIDI";	
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "IUQIDI";		
				}else {
					pDEKey.append("1");
					return "DUQIDI";		
				}
			}
		}
		//#### 8 	=		M = 	((IU, DU) OR DI) + DI + QI
		//=(IUDIQI, DUDIQI, DIDIQI) OR (IUDIDIQI, DUDIDIQI)
		if(initon.equalsIgnoreCase("M")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "IUDIDIQI";	
				}else {
					pDEKey.append("1");
					return "DUDIDIQI";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "IUDIDIQI";	
				}else {
					pDEKey.append("1");
					return "DUDIDIQI";
				}
			}

		}
		//#### 6 	=		X =  	UQ + ((IU, DU) OR DI) + DI
		//=(UQIUDI, UQDUDI, UQDIDI) OR (UQIUDIDI, UQDUDIDI)
		if(initon.equalsIgnoreCase("X")) {
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					return "UQIUDIDI";	
				}else {
					pDEKey.append("1");
					return "UQDUDIDI";
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					return "UQIUDIDI";	
				}else {
					pDEKey.append("1");
					return "UQDUDIDI";
				}
			}

		}
		//#### C 	=		T = 	UQ + ((IU, DU) OR DI) + (IU, DU)
		//=(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU)
		if(initon.equalsIgnoreCase("T")) {		
			if(!isBys) {
				if(Math.random()< 0.5) {
					pDEKey.append("0");
					if(Math.random()< 0.5) {
						pDEKey.append("0");
						return "UQIUDIIU";	
					}else {
						pDEKey.append("1");
						return "UQIUDIDU";
					}
				}else {
					pDEKey.append("1");
					if(Math.random()< 0.5) {
						pDEKey.append("0");
						return "UQDUDIIU";	
					}else {
						pDEKey.append("1");
						return "UQDUDIDU";
					}
				}
			}else {
				if(Math.random()< bys) {
					pDEKey.append("0");
					if(Math.random()< bys) {
						pDEKey.append("0");
						return "UQIUDIIU";	
					}else {
						pDEKey.append("1");
						return "UQIUDIDU";
					}
				}else {
					pDEKey.append("1");
					if(Math.random()< bys) {
						pDEKey.append("0");
						return "UQDUDIIU";	
					}else {
						pDEKey.append("1");
						return "UQDUDIDU";
					}
				}
			}
		}
		return initon;//出现null 的脏字符串,
	}
	//IUQ D CEVS H POA -+ MXT
	//反向排列后如下
	//TXM +- AOP H SVEC D QUI
	public String initonPDIwithBYS(String pds, double bys, StringBuilder pDEKey
			, boolean isBys) {
		pds= pds.replace("UQIUDIIU", "T");
		pds= pds.replace("UQIUDIDU", "T");
		pds= pds.replace("UQDUDIIU", "T");
		pds= pds.replace("UQDUDIDU", "T");
		pds= pds.replace("UQIUDIDI", "X");
		pds= pds.replace("UQDUDIDI", "X");
		pds= pds.replace("IUDIDIQI", "M");
		pds= pds.replace("DUDIDIQI", "M");
		pds= pds.replace("IUDIIU", "+");
		pds= pds.replace("IUDIDU", "+");
		pds= pds.replace("DUDIIU", "+");
		pds= pds.replace("DUDIDU", "+");
		pds= pds.replace("IUDIDI", "-");
		pds= pds.replace("IUQIDI", "F");//增加F PDE
		pds= pds.replace("DUQIDI", "F");
		pds= pds.replace("UQQI", "A");
		pds= pds.replace("IUQI", "O");
		pds= pds.replace("DUQI", "O");
		pds= pds.replace("IUDI", "P");
		pds= pds.replace("DUDI", "P");
		pds= pds.replace("IUDI", "H");
		pds= pds.replace("DUDI", "H");
		pds= pds.replace("QI", "S");
		pds= pds.replace("UQ", "V");
		pds= pds.replace("IU", "E");
		pds= pds.replace("DU", "E");
		pds= pds.replace("DI", "C");
		pds= pds.replace("D", "D");
		pds= pds.replace("Q", "Q");
		pds= pds.replace("U", "U");
		pds= pds.replace("I", "I");
		return pds;
	}

	//用于肽展公式逐级变换
	//QUI  D  SVEC  H AOP +-  TXM 
	public String initonPDEwithBYS(String pds, double pDE_KEY_rate, StringBuilder
			pDEKey, boolean isBys) {
		if(!isBys) {
			pds= pds.replace("Q", "Q");
			pds= pds.replace("U", "D");
			pds= pds.replace("I", "I");
			pds= pds.replace("D", "D");
			pds= pds.replace("QI", "S");
			pds= pds.replace("UQ", "V");
			pds= pds.replace("IU", "E");
			pds= pds.replace("DU", "E");
			pds= pds.replace("DI", "C");
			pds= pds.replace("IUDI", "H");
			pds= pds.replace("DUDI", "H");
			pds= pds.replace("UQQI", "A");
			pds= pds.replace("IUQI", "O");
			pds= pds.replace("DUQI", "O");
			pds= pds.replace("IUDI", "P");
			pds= pds.replace("DUDI", "P");
			pds= pds.replace("IUDIIU", "+");
			pds= pds.replace("IUDIDU", "+");
			pds= pds.replace("DUDIIU", "+");
			pds= pds.replace("DUDIDU", "+");
			pds= pds.replace("IUDIDI", "-");
			pds= pds.replace("DUDIDI", "-");
			pds= pds.replace("UQIUDIIU", "T");
			pds= pds.replace("UQIUDIDU", "T");
			pds= pds.replace("UQDUDIIU", "T");
			pds= pds.replace("UQDUDIDU", "T");
			pds= pds.replace("UQIUDIDI", "X");
			pds= pds.replace("UQDUDIDI", "X");
			pds= pds.replace("IUDIDIQI", "M");
			pds= pds.replace("DUDIDIQI", "M");
			return pds;
		}
		pds= pds.replace("Q", "Q");
		pds= pds.replace("U", "U");
		pds= pds.replace("I", "I");
		pds= pds.replace("D", "D");
		pds= pds.replace("QI", "S");
		pds= pds.replace("UQ", "V");

		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IU", "E");
		}else {
			pds= pds.replace("DU", "E");
		}

		pds= pds.replace("DI", "C");

		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("IUDI", "H");
		}else {
			pds= pds.replace("DUDI", "H");
		}

		pds= pds.replace("UQQI", "A");

		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IUQI", "O");
		}else {
			pds= pds.replace("DUQI", "O");
		}

		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("IUDI", "P");
		}else {
			pds= pds.replace("DUDI", "P");
		}

		if(Math.random()< pDE_KEY_rate) {
			if(Math.random()<pDE_KEY_rate) {
				pds= pds.replace("IUDIIU", "+");
			}else {
				pds= pds.replace("IUDIDU", "+");
			}
		}else {
			if(Math.random()< pDE_KEY_rate) {
				pds= pds.replace("DUDIIU", "+");
			}else {
				pds= pds.replace("DUDIDU", "+");
			}
		}

		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("IUDIDI", "-");
		}else {
			pds= pds.replace("DUDIDI", "-");
		}


		if(Math.random()< pDE_KEY_rate) {
			if(Math.random()< pDE_KEY_rate) {
				pds= pds.replace("UQIUDIIU", "T");
			}else {
				pds= pds.replace("UQIUDIDU", "T");
			}
		}else {
			if(Math.random()< pDE_KEY_rate) {
				pds= pds.replace("UQDUDIIU", "T");
			}else {
				pds= pds.replace("UQDUDIDU", "T");
			}
		}

		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("UQIUDIDI", "X");
		}else {
			pds= pds.replace("UQDUDIDI", "X");
		}

		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IUDIDIQI", "M");
		}else {
			pds= pds.replace("DUDIDIQI", "M");
		}

		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IUQIDI", "F");//增加F PDE
		}else {
			pds= pds.replace("DUQIDI", "F");
		}
		
		return pds;
	}

	//融合肽展公式, 离散数学和数字逻辑 的元基变换
	//	pds= pds.replace("UQ", "V");
	//	pds= pds.replace("DI", "C");
	//	pds= pds.replace("IQ", "S");
	//	pds= pds.replace("VS", "A");
	//	pds= pds.replace("ES", "O");
	//	pds= pds.replace("EC", "P");
	//	pds= pds.replace("CS", "M");
	//	pds= pds.replace("VE", "T");
	//	pds= pds.replace("VC", "X");
	// 我的思维逻辑是先将PDS的数字逻辑和离散数学归纳识别, 然后走肽展识别, 最大缩短元基长度
	public String initonPDE_DCDLwithBYS(String pds, double pDE_KEY_rate
			, StringBuilder pDEKey, boolean isBys) {
		if(!isBys) {
			pds= pds.replace("UQIUDIIU", "T");//UQIUDIIU
			pds= pds.replace("UQIUDIDU", "T");
			pds= pds.replace("UQDUDIIU", "T");
			pds= pds.replace("UQDUDIDU", "T");
			pds= pds.replace("UQIUDIDI", "X");
			pds= pds.replace("UQDUDIDI", "X");
			pds= pds.replace("IUDIDIQI", "M");
			pds= pds.replace("DUDIDIQI", "M");
			pds= pds.replace("IUDIIU", "+");
			pds= pds.replace("IUDIDU", "+");
			pds= pds.replace("DUDIIU", "+");
			pds= pds.replace("DUDIDU", "+");
			pds= pds.replace("IUDIDI", "-");
			pds= pds.replace("DUDIDI", "-");
			pds= pds.replace("IUQIDI", "F");//增加F PDE
			pds= pds.replace("DUQIDI", "F");
			pds= pds.replace("IUDI", "H");
			pds= pds.replace("DUDI", "H");
			pds= pds.replace("UQQI", "A");
			pds= pds.replace("IUQI", "O");
			pds= pds.replace("DUQI", "O");
			pds= pds.replace("IUDI", "P");
			pds= pds.replace("DUDI", "P");
			pds= pds.replace("QI", "S");
			pds= pds.replace("UQ", "V");
			pds= pds.replace("IU", "E");
			pds= pds.replace("DU", "E");
			pds= pds.replace("DI", "C");
			pds= pds.replace("Q", "Q");
			pds= pds.replace("U", "D");
			pds= pds.replace("I", "I");
			pds= pds.replace("D", "D");

			//PDE
			pds= pds.replace("VS", "A");
			pds= pds.replace("ES", "O");
			pds= pds.replace("EC", "P");
			pds= pds.replace("HE", "+");
			pds= pds.replace("HC", "-");
			pds= pds.replace("VE", "T");
			pds= pds.replace("VC", "X");
			pds= pds.replace("CS", "M");

			return pds;
		}
		if(Math.random()< pDE_KEY_rate) {
			if(Math.random()< pDE_KEY_rate) {
				pds= pds.replace("UQIUDIIU", "T");
			}else {
				pds= pds.replace("UQIUDIDU", "T");
			}
		}else {
			if(Math.random()< pDE_KEY_rate) {
				pds= pds.replace("UQDUDIIU", "T");
			}else {
				pds= pds.replace("UQDUDIDU", "T");
			}
		}
		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("UQIUDIDI", "X");
		}else {
			pds= pds.replace("UQDUDIDI", "X");
		}
		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IUDIDIQI", "M");
		}else {
			pds= pds.replace("DUDIDIQI", "M");
		}
		if(Math.random()< pDE_KEY_rate) {
			if(Math.random()<pDE_KEY_rate) {
				pds= pds.replace("IUDIIU", "+");
			}else {
				pds= pds.replace("IUDIDU", "+");
			}
		}else {
			if(Math.random()< pDE_KEY_rate) {
				pds= pds.replace("DUDIIU", "+");
			}else {
				pds= pds.replace("DUDIDU", "+");
			}
		}
		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("IUDIDI", "-");
		}else {
			pds= pds.replace("DUDIDI", "-");
		}
		
		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IUQIDI", "F");//增加F PDE
		}else {
			pds= pds.replace("DUQIDI", "F");
		}
		
		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("IUDI", "H");
		}else {
			pds= pds.replace("DUDI", "H");
		}
		pds= pds.replace("UQQI", "A");
		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IUQI", "O");
		}else {
			pds= pds.replace("DUQI", "O");
		}
		if(Math.random()< pDE_KEY_rate) {
			pds= pds.replace("IUDI", "P");
		}else {
			pds= pds.replace("DUDI", "P");
		}
		pds= pds.replace("QI", "S");
		pds= pds.replace("UQ", "V");
		if(Math.random()<pDE_KEY_rate) {
			pds= pds.replace("IU", "E");
		}else {
			pds= pds.replace("DU", "E");
		}
		pds= pds.replace("DI", "C");
		pds= pds.replace("D", "D");
		pds= pds.replace("Q", "Q");
		pds= pds.replace("U", "U");
		pds= pds.replace("I", "I");
		//PDE
		pds= pds.replace("VS", "A");
		pds= pds.replace("ES", "O");
		pds= pds.replace("EC", "P");
		pds= pds.replace("HE", "+");
		pds= pds.replace("HC", "-");
		pds= pds.replace("VE", "T");
		pds= pds.replace("VC", "X");
		pds= pds.replace("CS", "M");
		return pds;
	}
}
