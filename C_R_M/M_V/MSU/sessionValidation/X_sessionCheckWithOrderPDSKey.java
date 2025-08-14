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
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_sessionCheckWithOrderPDSKey {

    //序列 正序密文检查
    public static boolean _E(Token token, TokenCerts tokenCerts) {
        TokenPDI pDE_RNA_Formular = new TokenPDI();
        //		//20230106-System.out.println("Session: "+ token.getmPassword());
        //		//20230106-System.out.println("===============================================");
        //		//20230106-System.out.println("开始前序验证：");
        //		//20230106-System.out.println("开始Session解析："+ token.getmPassword());
        //		//20230106-System.out.println("开始概率钥匙解析："+ token.getUpdsde()
        //+ token.getUpdsds()+ token.getUpdsie()+ token.getUpdsis());
        TokenPDI pDE_RNA_Formular1 = new TokenPDI();
        pDE_RNA_Formular1.pdedeKey = token.getUpdsde();
        pDE_RNA_Formular1.pdedsKey = token.getUpdsds();
        pDE_RNA_Formular1.pdeieKey = token.getUpdsie();
        pDE_RNA_Formular1.pdeisKey = token.getUpdsis();
        pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
        //		//20230106-System.out.println("得到原降元元基DNA序列："+ pDE_RNA_Formular.pds);
        //		//20230106-System.out.println("得到新降元元基DNA序列："+ pDE_RNA_Formular1.pds);
        //		//20230106-System.out.println("得到原元基DNA序列："+ pDE_RNA_Formular.pde);
        //		//20230106-System.out.println("得到新元基DNA序列："+ pDE_RNA_Formular1.pde);
        return pDE_RNA_Formular1.pde.equalsIgnoreCase(token.getmPassword());
    }
}
