package M_V.MSU.sessionValidation;

import A_I.MPE.MAQPVDCOISIV.pdi.TokenPDI;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenCerts;

//DNA加密设计 罗瑶光
//DNA加密思想 罗瑶光
//Refer <DNA元基编码>罗瑶光 罗荣武, <PDE肽展公式>: 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_sessionInitByTokenPDICertsDNA {
	// 序列PDI初始生成走非Util函数
	public static Token _E(TokenCerts tokenCerts) {
		Token token = new Token();
		TokenPDI pDE_RNA_Formular = new TokenPDI();
		pDE_RNA_Formular.key[0] = 0.0;
		pDE_RNA_Formular.key[1] = 0.0;
		pDE_RNA_Formular.key[2] = 0.0;
		pDE_RNA_Formular.key[3] = 0.0;
		pDE_RNA_Formular.doKeyPress(tokenCerts.getPdnPassword(),
				pDE_RNA_Formular, false);
		// //20230106-System.out.println("静态肽展降元概率钥匙E: "+
		// pDE_RNA_Formular.pdedeKey);
		// //20230106-System.out.println("静态肽展降元概率钥匙S: "+
		// pDE_RNA_Formular.pdedsKey);
		// //20230106-System.out.println("静态肽展降元: "+
		// pDE_RNA_Formular.pds);
		tokenCerts.I_Pds(pDE_RNA_Formular.pds);
		token.I_Updsde(pDE_RNA_Formular.pdedeKey);
		token.I_Updsds(pDE_RNA_Formular.pdedsKey);
		token.I_Updsie(pDE_RNA_Formular.pdeieKey);
		token.I_Updsis(pDE_RNA_Formular.pdeisKey);
		// //20230106-System.out.println("静态肽展增元概率钥匙E: "+
		// pDE_RNA_Formular.pdeieKey);
		// //20230106-System.out.println("静态肽展增元概率钥匙S: "+
		// pDE_RNA_Formular.pdeisKey);
		// //20230106-System.out.println("静态肽展增元: "+
		// pDE_RNA_Formular.pde);
		pDE_RNA_Formular.time = "" + System.currentTimeMillis();
		pDE_RNA_Formular.cacheId = "ID" + Math.random() + ":" + Math.random();
		// //20230106-System.out.println("时间: " +
		// pDE_RNA_Formular.time);
		// //20230106-System.out.println("账号随机缓存字符串: " +
		// pDE_RNA_Formular.cacheId);
		pDE_RNA_Formular.session_key = pDE_RNA_Formular.pde;
		// //20230106-System.out.println("Session: " +
		// pDE_RNA_Formular.session_key);
		token.I_mPassword(pDE_RNA_Formular.pde);
		token.I_mPasswordPDS(pDE_RNA_Formular.pds);
		return token;
	}
}
