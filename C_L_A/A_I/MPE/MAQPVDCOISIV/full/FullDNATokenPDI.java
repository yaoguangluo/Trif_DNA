package A_I.MPE.MAQPVDCOISIV.full;

import A_I.MPE.MAQPVDCOISIV.initon.Initon;
import A_I.MPE.MAQPVDCOISIV.initon.InitonLinkDNA;
import A_I.MPE.MAQPVDCOISIV.pde.PDE_Decrement_FullDNAFormular;
import A_I.MPE.MAQPVDCOISIV.pde.PDE_Decrement_FullFormular;
import A_I.MPE.MAQPVDCOISIV.pde.PDE_Increment_FullDNAFormular;
import A_I.MPE.MAQPVDCOISIV.pde.PDE_Increment_FullFormular;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案, 可阅读 相关 著作权 原文  进行逻辑辨别.
public class FullDNATokenPDI {
	public double[] key = new double[4];
	public String bys = "";
	public String pdw = "";
	public String pds = "";
	public String pde = "";
	public String time = "";
	public String session_key = "";
	public String text;
	public String cacheId;
	public String code = "";
	public String lock = "";
	public String pdedeKey = "";
	public String pdedsKey = "";
	public String pdeieKey = "";
	public String pdeisKey = "";

	public void doKeyPress(String initons, FullDNATokenPDI pDE_RNA_FullFormular,
			boolean bYS) {
		Initon[] initon = new Initon[initons.length()];
		for (int i = 0; i < initons.length(); i++) {
			if (initon[i] == null) {
				initon[i] = new Initon();
			}
			initon[i].I_Initon("" + initons.charAt(i));
			if (i + 1 < initons.length()) {
				if (initon[i + 1] == null) {
					initon[i + 1] = new Initon();
				}
				initon[i].next = initon[i + 1];
				initon[i + 1].prev = initon[i];
			}
		}
		if (null != initons && initons.length() > 0) {
			do_PDE_RNA_FullFormular(initon[0], pDE_RNA_FullFormular, bYS);
		}
	}

	public String[] encodeDNA(String humanWord) {
		String[] string = new String[5];
		// 0e 1s 2 humanword 3 seccode 4dna initons
		FullDNATokenPDI pDE_RNA_FullFormular = new FullDNATokenPDI();
		pDE_RNA_FullFormular.code = pDE_RNA_FullFormular.initonSect(humanWord);
		// 20230106-System.out.println(pDE_RNA_FullFormular.code);
		pDE_RNA_FullFormular.enSecCode(pDE_RNA_FullFormular, false);
		pDE_RNA_FullFormular.pdedeKey = pDE_RNA_FullFormular.pdeieKey;
		pDE_RNA_FullFormular.pdedsKey = pDE_RNA_FullFormular.pdeisKey;
		pDE_RNA_FullFormular.code = pDE_RNA_FullFormular.pde;
		pDE_RNA_FullFormular.pde = "";
		pDE_RNA_FullFormular.deSecCode(pDE_RNA_FullFormular, true);
		string[0] = pDE_RNA_FullFormular.pdeieKey;
		string[1] = pDE_RNA_FullFormular.pdeisKey;
		string[2] = humanWord;
		string[3] = pDE_RNA_FullFormular.code;
		string[4] = pDE_RNA_FullFormular.pde;
		// 20230106-System.out.println(pDE_RNA_FullFormular.pde);
		return string;
	}

	public void deSecCode(FullDNATokenPDI pDE_RNA_FullFormular, boolean b) {
		//
		String initons = pDE_RNA_FullFormular.code;
		Initon[] initon = new Initon[initons.length()];
		for (int i = 0; i < initons.length(); i++) {
			if (initon[i] == null) {
				initon[i] = new Initon();
			}
			initon[i].I_Initon("" + initons.charAt(i));
			if (i + 1 < initons.length()) {
				if (initon[i + 1] == null) {
					initon[i + 1] = new Initon();
				}
				initon[i].next = initon[i + 1];
				initon[i + 1].prev = initon[i];
			}
		}
		if (null != initons && initons.length() > 0) {
			de_PDE_RNA_FullFormularForDB(initon[0], pDE_RNA_FullFormular, true);
			// do_PDE_RNA_FullFormular_FullBack(initon[0],
			// pDE_RNA_FullFormular, true);
		}
	}

//	Initon InitonPDE1A= doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1O= doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1P= doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE2= doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);

	// Initon InitonPDEM= doDecrementM(InitonPDE2,
	// initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDEP= doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDEO= doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDEA= doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular);
//
//	Initon InitonPDES= doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//	Initon InitonPDEC= doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDEE= doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//	Initon InitonPDE1= doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular);
//	while(InitonPDE1.hasNext()) { 
//		pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
//		InitonPDE1= InitonPDE1.next;
//	} 
//	pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
//	while(InitonPDE1.hasPrev()) {
//		InitonPDE1= InitonPDE1.prev;
//	}
	private void de_PDE_RNA_FullFormularForDB(Initon initon,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {

		Initon InitonPDE = initon;
		InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
		Initon InitonPDE1V = doIncrementV(InitonPDE, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1E = doIncrementE(InitonPDE1V, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1C = doIncrementC(InitonPDE1E, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1S = doIncrementS(InitonPDE1C, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		while (InitonPDE1S.hasNext()) {
			pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
			InitonPDE1S = InitonPDE1S.next;
		}
		pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
		while (InitonPDE1S.hasPrev()) {
			InitonPDE1S = InitonPDE1S.prev;
		}
	}

	public void enSecCode(FullDNATokenPDI pDE_RNA_FullFormular, boolean bys) {
		String initons = pDE_RNA_FullFormular.code;
		Initon[] initon = new Initon[initons.length()];
		for (int i = 0; i < initons.length(); i++) {
			if (initon[i] == null) {
				initon[i] = new Initon();
			}
			initon[i].I_Initon("" + initons.charAt(i));
			if (i + 1 < initons.length()) {
				if (initon[i + 1] == null) {
					initon[i + 1] = new Initon();
				}
				initon[i].next = initon[i + 1];
				initon[i + 1].prev = initon[i];
			}
		}
		if (null != initons && initons.length() > 0) {
			do_PDE_RNA_FullFormularForDB(initon[0], pDE_RNA_FullFormular, bys);
		}
	}

//	public static void main(String[] argv) {	
//		FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
//		String a= "luoyaoguang";
//		pDE_RNA_FullFormular.encodeDNA(a);
//		
//		@SuppressWarnings("unused")
//		String initonKeys= "EIU/0.6/EDU/0.4/si/0.3/sq/0.7/EIU/0.5/EDU/0.5/si/0.632/sq/0.368";
//		pDE_RNA_FullFormular.key[0]= 0.6;
//		pDE_RNA_FullFormular.key[1]= 0.3;
//		pDE_RNA_FullFormular.key[2]= 0.5;
//		pDE_RNA_FullFormular.key[3]= 0.632;
//
//		pDE_RNA_FullFormular.text= "控制吸收";
//		pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.IV_onSect(pDE_RNA_FullFormular.text);
//		//20230106-System.out.println("原文: "+ pDE_RNA_FullFormular.text);
//		//pDE_RNA_FullFormular.pdw= "字典保密：MSIOCUOCIPCUPCI";
//		String[] lock= new String[12];
//        lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9] = "M";
//        lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
//        lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";
//        int i= (int)(Math.random()* 12)% 12;
//        pDE_RNA_FullFormular.lock+= lock[i];
//        i= (int)(Math.random()* 12)% 12;
//        pDE_RNA_FullFormular.lock+= lock[i];
//        i= (int)(Math.random()* 12)% 12;
//        pDE_RNA_FullFormular.lock+= lock[i];
//        i= (int)(Math.random()* 12)% 12;
//        pDE_RNA_FullFormular.lock+= lock[i];
//		
//		for(i= 0; i< pDE_RNA_FullFormular.pdw.length(); i++) {
//			pDE_RNA_FullFormular.code+= pDE_RNA_FullFormular.lock 
	// + pDE_RNA_FullFormular.pdw.charAt(i);
//		}
//		//20230106-System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
//		//20230106-System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
//		//20230106-System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
//		pDE_RNA_FullFormular.bys= "0.6/0.3/0.5/0.632";
//		//20230106-System.out.println("静态密钥: "+ pDE_RNA_FullFormular.bys);
//		pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
//		//20230106-System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_FullFormular.pdedeKey);
//		//20230106-System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_FullFormular.pdedsKey);
//		//20230106-System.out.println("静态肽展降元: "+ pDE_RNA_FullFormular.pds);
//		
//		//20230106-System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_FullFormular.pdeieKey);
//		//20230106-System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_FullFormular.pdeisKey);
//		//20230106-System.out.println("静态肽展增元: "+ pDE_RNA_FullFormular.pde);
//
//		pDE_RNA_FullFormular.time= "" + System.currentTimeMillis();
//		pDE_RNA_FullFormular.cacheId= "ID" + Math.random() 
	// + S_Common.STRING_SYMBOL_PER + Math.random();
//		//20230106-System.out.println("时间:  " + pDE_RNA_FullFormular.time);
//		//20230106-System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
//		pDE_RNA_FullFormular.session_key= pDE_RNA_FullFormular.pde;
//		//20230106-System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
//		//20230106-System.out.println("=====================================================");
//		//20230106-System.out.println("开始前序验证：");
//		//20230106-System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
//		//20230106-System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey
	// + pDE_RNA_FullFormular.pdedsKey
//				+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);
//		
//		FullDNATokenPDI pDE_RNA_FullFormular1= new FullDNATokenPDI();
//		pDE_RNA_FullFormular1.pdedeKey= pDE_RNA_FullFormular.pdedeKey.toString();
//		pDE_RNA_FullFormular1.pdedsKey= pDE_RNA_FullFormular.pdedsKey.toString();
//		pDE_RNA_FullFormular1.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
//		pDE_RNA_FullFormular1.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
//		
//		pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
//		//20230106-System.out.println();
//		//20230106-System.out.println("得到原降元元基DNA序列："+ pDE_RNA_FullFormular.pds);
//		//20230106-System.out.println("得到新降元元基DNA序列："+ pDE_RNA_FullFormular1.pds);
//		//20230106-System.out.println("得到原元基DNA序列："+ pDE_RNA_FullFormular.pde);
//		//20230106-System.out.println("得到新元基DNA序列："+ pDE_RNA_FullFormular1.pde);
//		//20230106-System.out.println("验证正确？");
//		//20230106-System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)
	// ? "正确": "失败");
////		//20230106-System.out.println("==========================================");
//		//20230106-System.out.println("开始后序验证：");
//		FullDNATokenPDI pDE_RNA_FullFormular2= new FullDNATokenPDI();
//		pDE_RNA_FullFormular2.pdeieKey= pDE_RNA_FullFormular.pdedeKey.toString();
//		pDE_RNA_FullFormular2.pdeisKey= pDE_RNA_FullFormular.pdedsKey.toString();
//		pDE_RNA_FullFormular2.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
//		pDE_RNA_FullFormular2.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
//		//20230106-System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormular1.pde);
//		pDE_RNA_FullFormular2.doSessionKeyUnPress(pDE_RNA_FullFormular1.pde
	// , pDE_RNA_FullFormular2, true);
//		//20230106-System.out.println();
//		//20230106-System.out.println("得到原续降元元基DNA序列："+ pDE_RNA_FullFormular1.pds);
//		//20230106-System.out.println("得到后续降元元基DNA序列："+ pDE_RNA_FullFormular2.pds);
//		//20230106-System.out.println("验证正确？");
//		//20230106-System.out.println(pDE_RNA_FullFormular1.pds.equals(pDE_RNA_FullFormular2.pds)
	// ? "正确": "失败");
//	
//		//20230106-System.out.println("===================================================");
//		//20230106-System.out.println("开始整序验证：");
//		FullDNATokenPDI pDE_RNA_FullFormular3= new FullDNATokenPDI();
//
//		
//		pDE_RNA_FullFormular3.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
//		pDE_RNA_FullFormular3.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
//		pDE_RNA_FullFormular3.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
//		pDE_RNA_FullFormular3.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
//		
//		
//		//20230106-System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormular1.pde);//pde加成
//		pDE_RNA_FullFormular3.doFullSessionKeyUnPress(pDE_RNA_FullFormular1.pde
	// , pDE_RNA_FullFormular3, true);
//		//20230106-System.out.println();
//		//20230106-System.out.println("得到原续降元元基DNA序列："+ pDE_RNA_FullFormular1.pds);
//		//20230106-System.out.println("得到后续降元元基DNA序列："+ pDE_RNA_FullFormular3.pds);
//		//20230106-System.out.println("验证正确？");
//		//20230106-System.out.println(pDE_RNA_FullFormular1.pds.equals(pDE_RNA_FullFormular3.pds)
	// ? "正确": "失败");
//		//20230106-System.out.println("准备整序计算元基DNA序列："+ pDE_RNA_FullFormular1.pde);
//		//20230106-System.out.println("准备整序计算元基DNA序列："+ pDE_RNA_FullFormular3.pde);
//		//20230106-System.out.println(pDE_RNA_FullFormular1.pde.equals(pDE_RNA_FullFormular3.pde)
	// ? "正确": "失败");
//		
//	}

	public void doFullSessionKeyUnPress(String initons,
			FullDNATokenPDI pDE_RNA_FullFormular3, boolean bYS) {
		Initon[] initon = new Initon[initons.length()];
		for (int i = 0; i < initons.length(); i++) {
			if (initon[i] == null) {
				initon[i] = new Initon();
			}
			initon[i].I_Initon("" + initons.charAt(i));
			if (i + 1 < initons.length()) {
				if (initon[i + 1] == null) {
					initon[i + 1] = new Initon();
				}
				initon[i].next = initon[i + 1];
				initon[i + 1].prev = initon[i];
			}
		}
		do_PDE_RNA_FullFormular_FullBack(initon[0], pDE_RNA_FullFormular3, bYS);
	}

	private void do_PDE_RNA_FullFormular_FullBack(Initon initon,
			FullDNATokenPDI pDE_RNA_FullFormular3, boolean bYS) {
		Initon InitonPDE = initon;
		InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
		Initon InitonPDE1V = doIncrementV(InitonPDE, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDE1E = doIncrementE(InitonPDE1V, initonLinkDNA,
				pDE_RNA_FullFormular3, bYS);
		Initon InitonPDE1C = doIncrementC(InitonPDE1E, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDE1S = doIncrementS(InitonPDE1C, initonLinkDNA,
				pDE_RNA_FullFormular3, bYS);

		Initon InitonPDE1A = doIncrementA(InitonPDE1S, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDE1O = doIncrementO(InitonPDE1A, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDE1P = doIncrementP(InitonPDE1O, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDE2 = doIncrementM(InitonPDE1P, initonLinkDNA,
				pDE_RNA_FullFormular3);
		while (InitonPDE2.hasNext()) {
			pDE_RNA_FullFormular3.pde += InitonPDE2.getStore();
			InitonPDE2 = InitonPDE2.next;
		}
		pDE_RNA_FullFormular3.pde += InitonPDE2.getStore();
		while (InitonPDE2.hasPrev()) {
			InitonPDE2 = InitonPDE2.prev;
		}

		Initon InitonPDEM = doDecrementM(InitonPDE2, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDEP = doDecrementP(InitonPDEM, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDEO = doDecrementO(InitonPDEP, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDEA = doDecrementA(InitonPDEO, initonLinkDNA,
				pDE_RNA_FullFormular3);

		Initon InitonPDES = doDecrementS(InitonPDEA, initonLinkDNA,
				pDE_RNA_FullFormular3, bYS);
		Initon InitonPDEC = doDecrementC(InitonPDES, initonLinkDNA,
				pDE_RNA_FullFormular3);
		Initon InitonPDEE = doDecrementE(InitonPDEC, initonLinkDNA,
				pDE_RNA_FullFormular3, bYS);
		Initon InitonPDE1 = doDecrementV(InitonPDEE, initonLinkDNA,
				pDE_RNA_FullFormular3);
		while (InitonPDE1.hasNext()) {
			pDE_RNA_FullFormular3.pds += InitonPDE1.getStore();
			InitonPDE1 = InitonPDE1.next;
		}
		pDE_RNA_FullFormular3.pds += InitonPDE1.getStore();
		while (InitonPDE1.hasPrev()) {
			InitonPDE1 = InitonPDE1.prev;
		}
	}

	public void doSessionKeyUnPress(String initons,
			FullDNATokenPDI pDE_RNA_FullFormular2, boolean bYS) {
		Initon[] initon = new Initon[initons.length()];
		for (int i = 0; i < initons.length(); i++) {
			if (initon[i] == null) {
				initon[i] = new Initon();
			}
			initon[i].I_Initon("" + initons.charAt(i));
			if (i + 1 < initons.length()) {
				if (initon[i + 1] == null) {
					initon[i + 1] = new Initon();
				}
				initon[i].next = initon[i + 1];
				initon[i + 1].prev = initon[i];
			}
		}
		do_PDE_RNA_FullFormular_Back(initon[0], pDE_RNA_FullFormular2, bYS);
	}

	private void do_PDE_RNA_FullFormular_Back(Initon initon,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {
		Initon InitonPDE = initon;
		InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
		Initon InitonPDEM = doDecrementM(InitonPDE, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEP = doDecrementP(InitonPDEM, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEO = doDecrementO(InitonPDEP, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEA = doDecrementA(InitonPDEO, initonLinkDNA,
				pDE_RNA_FullFormular);

		Initon InitonPDES = doDecrementS(InitonPDEA, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		Initon InitonPDEC = doDecrementC(InitonPDES, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEE = doDecrementE(InitonPDEC, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1 = doDecrementV(InitonPDEE, initonLinkDNA,
				pDE_RNA_FullFormular);
		while (InitonPDE1.hasNext()) {
			pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
			InitonPDE1 = InitonPDE1.next;
		}
		pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
		while (InitonPDE1.hasPrev()) {
			InitonPDE1 = InitonPDE1.prev;
		}
	}
//	Initon InitonPDE1S= doIncrementS(InitonPDE1, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//	Initon InitonPDE1C= doIncrementC(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1E= doIncrementE(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);
//	Initon InitonPDE1V= doIncrementV(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1M= doIncrementM(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1P= doIncrementP(InitonPDE1M, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1O= doIncrementO(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE2= doIncrementA(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
//	while(InitonPDE2.hasNext()) { 
//		pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
//		InitonPDE2= InitonPDE2.next;
//	} 
//	pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
//	while(InitonPDE2.hasPrev()) {
//		InitonPDE2= InitonPDE2.prev;
//	}

	public void doKeyUnPress(String initons,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {
		Initon[] initon = new Initon[initons.length()];
		for (int i = 0; i < initons.length(); i++) {
			if (initon[i] == null) {
				initon[i] = new Initon();
			}
			initon[i].I_Initon("" + initons.charAt(i));
			if (i + 1 < initons.length()) {
				if (initon[i + 1] == null) {
					initon[i + 1] = new Initon();
				}
				initon[i].next = initon[i + 1];
				initon[i + 1].prev = initon[i];
			}
		}
		do_PDE_RNA_FullFormular(initon[0], pDE_RNA_FullFormular, bYS);
	}

	// Initon InitonPDE1A= doIncrementA(InitonPDE1S,
	// initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1O= doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE1P= doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
//	Initon InitonPDE2= doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
	private void do_PDE_RNA_FullFormularForDB(Initon initon,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {

		Initon InitonPDE = initon;
		InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
		Initon InitonPDE1V = doDecrementV(InitonPDE, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1E = doDecrementE(InitonPDE1V, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1C = doDecrementC(InitonPDE1E, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1S = doDecrementS(InitonPDE1C, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		while (InitonPDE1S.hasNext()) {
			pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
			InitonPDE1S = InitonPDE1S.next;
		}
		pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
		while (InitonPDE1S.hasPrev()) {
			InitonPDE1S = InitonPDE1S.prev;
		}
	}

	public void do_PDE_RNA_FullFormular(Initon initon,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {
		Initon InitonPDE = initon;
		InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
		// a->b
		Initon InitonPDEA = doDecrementA(InitonPDE, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEO = doDecrementO(InitonPDEA, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEP = doDecrementP(InitonPDEO, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEM = doDecrementM(InitonPDEP, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEV = doDecrementV(InitonPDEM, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDEE = doDecrementE(InitonPDEV, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		Initon InitonPDEC = doDecrementC(InitonPDEE, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1 = doDecrementS(InitonPDEC, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		while (InitonPDE1.hasNext()) {
			pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
			InitonPDE1 = InitonPDE1.next;
		}
		pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
		while (InitonPDE1.hasPrev()) {
			InitonPDE1 = InitonPDE1.prev;
		}
		// b->c
		Initon InitonPDE1V = doIncrementV(InitonPDE1, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1E = doIncrementE(InitonPDE1V, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1C = doIncrementC(InitonPDE1E, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1S = doIncrementS(InitonPDE1C, initonLinkDNA,
				pDE_RNA_FullFormular, bYS);
		Initon InitonPDE1A = doIncrementA(InitonPDE1S, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1O = doIncrementO(InitonPDE1A, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE1P = doIncrementP(InitonPDE1O, initonLinkDNA,
				pDE_RNA_FullFormular);
		Initon InitonPDE2 = doIncrementM(InitonPDE1P, initonLinkDNA,
				pDE_RNA_FullFormular);
		while (InitonPDE2.hasNext()) {
			pDE_RNA_FullFormular.pde += InitonPDE2.getStore();
			InitonPDE2 = InitonPDE2.next;
		}
		pDE_RNA_FullFormular.pde += InitonPDE2.getStore();
		while (InitonPDE2.hasPrev()) {
			InitonPDE2 = InitonPDE2.prev;
		}
	}

/////INITONS SWAP	

	public Initon doIncrementA(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullFormular()
				.PDE_IncrementA(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("A->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doIncrementO(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullFormular()
				.PDE_IncrementO(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("O->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doIncrementP(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullFormular()
				.PDE_IncrementP(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("P->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doIncrementM(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullFormular()
				.PDE_IncrementM(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("M->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doIncrementV(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullFormular()
				.PDE_IncrementV(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("V->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doIncrementC(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullFormular()
				.PDE_IncrementC(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("C->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doIncrementE(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullDNAFormular()
				.PDE_IncrementE_DU(initonLinkDNA, pDE_RNA_FullFormular, bYS);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("E->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doIncrementS(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Increment_FullDNAFormular()
				.PDE_IncrementS_IQ(initonLinkDNA, pDE_RNA_FullFormular);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("S->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementA(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullFormular()
				.PDE_DecrementA(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("A->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementO(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullFormular()
				.PDE_DecrementO(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("O->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementP(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullFormular()
				.PDE_DecrementP(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("P->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementM(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullFormular()
				.PDE_DecrementM(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("M->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementV(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullFormular()
				.PDE_DecrementV(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("V->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementC(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullFormular()
				.PDE_DecrementC(initonLinkDNA);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("C->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementE(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullDNAFormular()
				.PDE_DecrementE_DU(initonLinkDNA, pDE_RNA_FullFormular, bYS);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("E->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	public Initon doDecrementS(Initon InitonPDE, InitonLinkDNA initonLinkDNA,
			FullDNATokenPDI pDE_RNA_FullFormular, boolean bYS) {
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		initonLinkDNA.I_InitonLink(InitonPDE);
		InitonPDE = new PDE_Decrement_FullDNAFormular()
				.PDE_DecrementS_IQ(initonLinkDNA, pDE_RNA_FullFormular, bYS);
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		// 20230106-System.out.println();
		// 20230106-System.out.print("S->");
		while (InitonPDE.hasNext()) {
			// 20230106-System.out.print(InitonPDE.getStore());
			InitonPDE = InitonPDE.next;
		}
		// 20230106-System.out.println();
		while (InitonPDE.hasPrev()) {
			InitonPDE = InitonPDE.prev;
		}
		return InitonPDE;
	}

	@SuppressWarnings("unchecked")
	public String initonSect(String key) {
		String pdis = "";
		IMV_SIQ map = new IMV_SIQ();
		map.put("0", "A");
		map.put("1", "O");
		map.put("2", "P");
		map.put("3", "M");
		map.put("4", "V");
		map.put("5", "E");
		map.put("6", "C");
		map.put("7", "S");
		map.put("8", "I");
		map.put("9", "D");
		map.put(".", "Q");
		int lineChars = 0;// 让元基码分段
		for (int i = 0; i < key.length(); i++) {
			lineChars++;
			if (lineChars == 60) { // 1行60个char
				pdis += "\r\n";
				lineChars = 0;
			}
			int c = key.charAt(i);
			String ints = S_Common.STRING_EMPTY + c;
			for (int j = 0; j < ints.length(); j++) {
				pdis += map.get("" + ints.charAt(j));
			}
			pdis += "U";
		}
		return pdis;
	}

	@SuppressWarnings("unchecked")
	public String initonDeSect(String key) {
		String pdis = "";
		IMV_SIQ map = new IMV_SIQ();
		map.put("A", "0");
		map.put("O", "1");
		map.put("P", "2");
		map.put("M", "3");
		map.put("V", "4");
		map.put("E", "5");
		map.put("C", "6");
		map.put("S", "7");
		map.put("I", "8");
		map.put("D", "9");
		map.put("Q", ".");
		String[] values = key.split("U");
		for (int i = 0; i < values.length; i++) {
			String c = values[i];
			String ints = "";
			for (int j = 0; j < c.length(); j++) {
				ints += map.get("" + c.charAt(j));
			}
			if (!ints.isEmpty() && !ints.contains("null")) {// 优化下null check
				int a = Integer.valueOf(ints);
				char b = (char) a;
				pdis += b;
			}
		}
		return pdis;
	}
}
