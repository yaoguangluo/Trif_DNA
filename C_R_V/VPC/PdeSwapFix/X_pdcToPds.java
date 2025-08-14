package VPC.PdeSwapFix;

import A_I.MPE.MAQPVDCOISIV.pdi.TokenPDI;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import U_A.PEU.P.dna.TokenCerts;

//把token pdi例子进行拆分成 3个函数, 之后方便集成到data swap 包中。
//肽展作者 罗瑶光
//编码作者 罗瑶光
//见 VPC.transaction
//见 DNA元基催化与肽计算 第841页公式
//20210828

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_pdcToPds {
    public static String pdcToPds(String pdc, String lock, String de, String ds, String ie, String is) {
        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(pdc, true, lock);
        TokenPDI pDE_RNA_Formular = new TokenPDI();
        TokenPDI pDE_RNA_Formular1 = new TokenPDI();
        pDE_RNA_Formular1.pdedeKey = de;
        pDE_RNA_Formular1.pdedsKey = ds;
        pDE_RNA_Formular1.pdeieKey = ie;
        pDE_RNA_Formular1.pdeisKey = is;
        pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
        return pDE_RNA_Formular1.pds;
    }
}
