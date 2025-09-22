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
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_sessionCheckWithPostPDSKey {

	// 序列 反序密文检查
	public static boolean _E(Token token, TokenCerts tokenCerts) {
		// //20230106-System.out.println("====================================================");
		// //20230106-System.out.println("开始后序验证：");
		TokenPDI pDE_RNA_Formular2 = new TokenPDI();
		pDE_RNA_Formular2.pdeieKey = token.getUpdsde().toString();
		pDE_RNA_Formular2.pdeisKey = token.getUpdsds().toString();
		pDE_RNA_Formular2.pdedeKey = token.getUpdsie().toString();
		pDE_RNA_Formular2.pdedsKey = token.getUpdsis().toString();
		// //20230106-System.out.println("准备计算元基DNA序列："+
		// token.getmPassword());
		pDE_RNA_Formular2.doSessionKeyUnPress(token.getmPassword(),
				pDE_RNA_Formular2, true);
		// //20230106-System.out.println("得到原续降元元基DNA序列："+
		// tokenCerts.getPds());
		// //20230106-System.out.println("得到后续降元元基DNA序列："+
		// pDE_RNA_Formular2.pds);
		// //20230106-System.out.println("验证正确？");
		// 20230106-System.out.println(tokenCerts.getPds().equals(pDE_RNA_Formular2.pds)?
		// "正确": "失败");
		return tokenCerts.getPds().equals(pDE_RNA_Formular2.pds) ? true : false;
	}

	// 写个main函数测试下
	public static void main(String[] argv) {
		TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA
				._E("控制吸收", false, null);
		Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
		X_sessionCheck._E(token, tokenCerts);
	}
}
