package fullDNATokenPDI;

import A_I.pde.PDE_Increment_FullDNAFormular_XCDX;
import A_I.MPE.MAQPVDCOISIV.pde.PDE_Increment_FullFormular;
import A_I.MPE.MAQPVDCOISIV.initon.Initon;
import A_I.MPE.MAQPVDCOISIV.initon.InitonLinkDNA;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案, 可阅读 相关 著作权 原文  进行逻辑辨别.
public class PDI_X_doIncrement {
/////INITONS SWAP	

    public Initon doIncrementA(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullFormular().PDE_IncrementA(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("A->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }

    public Initon doIncrementO(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullFormular().PDE_IncrementO(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("O->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }

    public Initon doIncrementP(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullFormular().PDE_IncrementP(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("P->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }

    public Initon doIncrementM(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullFormular().PDE_IncrementM(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("M->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }

    public Initon doIncrementV(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullFormular().PDE_IncrementV(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("V->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }

    public Initon doIncrementC(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullFormular().PDE_IncrementC(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("C->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }

    public Initon doIncrementE(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular, boolean bYS) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullDNAFormular_XCDX().PDE_IncrementE_DU(initonLinkDNA
            , pDE_RNA_FullFormular, bYS);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("E->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }

    public Initon doIncrementS(Initon InitonPDE, InitonLinkDNA initonLinkDNA
        , PDI_X_ pDE_RNA_FullFormular, boolean bYS) {
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_FullDNAFormular_XCDX().PDE_IncrementS_IQ(initonLinkDNA
            , pDE_RNA_FullFormular);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        //20230106-System.out.println();
        //20230106-System.out.print("S->");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.next;
        }
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.prev;
        }
        return InitonPDE;
    }
}
