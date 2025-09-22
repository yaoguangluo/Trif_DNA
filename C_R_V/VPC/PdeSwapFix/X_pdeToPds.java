package VPC.PdeSwapFix;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import A_I.MPE.MAQPVDCOISIV.initon.Initon;
import A_I.MPE.MAQPVDCOISIV.initon.InitonLinkDNA;

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
public class X_pdeToPds {
    //刚检查pds to pde 我测试下
    //罗瑶光 MPOASCEV
    public static String pdeToPds(String pds, String de, String ds, String ie, String is) {
        FullDNATokenPDI pDE_RNA_Formular2 = new FullDNATokenPDI();
        pDE_RNA_Formular2.pdeieKey = ie;
        pDE_RNA_Formular2.pdeisKey = is;
        pDE_RNA_Formular2.pdedeKey = de;
        pDE_RNA_Formular2.pdedsKey = ds;
        //20230106-System.out.println("准备计算元基DNA序列："+ pds);
        //pds~pde
        Initon[] initon = new Initon[pds.length()];
        for (int i = 0; i < pds.length(); i++) {
            if (initon[i] == null) {
                initon[i] = new Initon();
            }
            initon[i].I_Initon("" + pds.charAt(i));
            if (i + 1 < pds.length()) {
                if (initon[i + 1] == null) {
                    initon[i + 1] = new Initon();
                }
                initon[i].next = initon[i + 1];
                initon[i + 1].prev = initon[i];
            }
        }
        InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
        Initon InitonPDEM = pDE_RNA_Formular2.doDecrementM(initon[0], initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDEP = pDE_RNA_Formular2.doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDEO = pDE_RNA_Formular2.doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDEA = pDE_RNA_Formular2.doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDES = pDE_RNA_Formular2.doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_Formular2, true);
        Initon InitonPDEC = pDE_RNA_Formular2.doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDEE = pDE_RNA_Formular2.doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_Formular2, true);
        Initon InitonPDEV = pDE_RNA_Formular2.doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_Formular2);
        while (InitonPDEV.hasNext()) {
            pDE_RNA_Formular2.pds += InitonPDEV.getStore();
            InitonPDEV = InitonPDEV.next;
        }
        pDE_RNA_Formular2.pds += InitonPDEV.getStore();
        while (InitonPDEV.hasPrev()) {
            InitonPDEV = InitonPDEV.prev;
        }
        return pDE_RNA_Formular2.pds;
    }

}
