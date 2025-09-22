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
public class X_pdsToPde {
    //把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
    //罗瑶光 VECSAOPM
    public static String pdsToPde(String pds, String de, String ds, String ie, String is) {
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
        Initon InitonPDE1V = pDE_RNA_Formular2.doIncrementV(initon[0], initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDE1E = pDE_RNA_Formular2.doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_Formular2, true);
        Initon InitonPDE1C = pDE_RNA_Formular2.doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDE2S = pDE_RNA_Formular2.doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_Formular2, true);
        Initon InitonPDE1A = pDE_RNA_Formular2.doIncrementA(InitonPDE2S, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDE1O = pDE_RNA_Formular2.doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDE1P = pDE_RNA_Formular2.doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_Formular2);
        Initon InitonPDE1M = pDE_RNA_Formular2.doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_Formular2);
        while (InitonPDE1M.hasNext()) {
            pDE_RNA_Formular2.pde += InitonPDE1M.getStore();
            InitonPDE1M = InitonPDE1M.next;
        }
        pDE_RNA_Formular2.pde += InitonPDE1M.getStore();
        while (InitonPDE1M.hasPrev()) {
            InitonPDE1M = InitonPDE1M.prev;
        }
        return pDE_RNA_Formular2.pde;
    }

}
