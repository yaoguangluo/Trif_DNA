package VPC.PdeSwapFix;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;

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
public class X_textToPdw {
    public static String textToPdw(FullDNATokenPDI pDE_RNA_FullFormular) {
        pDE_RNA_FullFormular.text = "控制吸收";
        pDE_RNA_FullFormular.pdw = pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
        return pDE_RNA_FullFormular.pdw;
    }
}
