package fullDNATokenPDI;

import A_I.MPE.MAQPVDCOISIV.initon.Initon;
import A_I.MPE.MAQPVDCOISIV.initon.InitonLinkDNA;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案, 可阅读 相关 著作权 原文  进行逻辑辨别.
public class PDI_X_do_PDE_RNA_FullFormular {

    public void de_PDE_RNA_FullFormularForDB(Initon initon
        , PDI_X_ pDE_RNA_FullFormular, boolean bYS) {
        Initon InitonPDE = initon;
        InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
        Initon InitonPDE1V = new PDI_X_doIncrement()
            .doIncrementV(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1E = new PDI_X_doIncrement()
            .doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        Initon InitonPDE1C = new PDI_X_doIncrement()
            .doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1S = new PDI_X_doIncrement()
            .doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);

        //		Initon InitonPDE1A= new PDI_X_doIncrement()
        //.doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);
        //		Initon InitonPDE1O= new PDI_X_doIncrement()
        //.doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
        //		Initon InitonPDE1P= new PDI_X_doIncrement()
        //.doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
        //		Initon InitonPDE2= new PDI_X_doIncrement()
        //.doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
        while (InitonPDE1S.hasNext()) {
            pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
            InitonPDE1S = InitonPDE1S.next;
        }
        pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
        while (InitonPDE1S.hasPrev()) {
            InitonPDE1S = InitonPDE1S.prev;
        }
    }
    //	Initon InitonPDEM= new PDI_X_doDecrement()
    //.doDecrementM(InitonPDE2, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDEP= new PDI_X_doDecrement()
    //.doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDEO= new PDI_X_doDecrement()
    //.doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDEA= new PDI_X_doDecrement()
    //.doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular);
    //
    //		Initon InitonPDES= new PDI_X_doDecrement()
    //.doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular, bYS);
    //		Initon InitonPDEC= new PDI_X_doDecrement()
    //.doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDEE= new PDI_X_doDecrement()
    //.doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular, bYS);
    //		Initon InitonPDE1= new PDI_X_doDecrement()
    //.doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular);
    //		while(InitonPDE1.hasNext()) {
    //			pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
    //			InitonPDE1= InitonPDE1.next;
    //		}
    //		pDE_RNA_FullFormular.pds+= InitonPDE1.getStore();
    //		while(InitonPDE1.hasPrev()) {
    //			InitonPDE1= InitonPDE1.prev;
    //		}


    public void do_PDE_RNA_FullFormular_FullBack(Initon initon
        , PDI_X_ pDE_RNA_FullFormular3
        , boolean bYS) {
        Initon InitonPDE = initon;
        InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
        Initon InitonPDE1V = new PDI_X_doIncrement()
            .doIncrementV(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDE1E = new PDI_X_doIncrement()
            .doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular3, bYS);
        Initon InitonPDE1C = new PDI_X_doIncrement()
            .doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDE1S = new PDI_X_doIncrement()
            .doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular3, bYS);

        Initon InitonPDE1A = new PDI_X_doIncrement()
            .doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDE1O = new PDI_X_doIncrement()
            .doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDE1P = new PDI_X_doIncrement()
            .doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDE2 = new PDI_X_doIncrement()
            .doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular3);
        while (InitonPDE2.hasNext()) {
            pDE_RNA_FullFormular3.pde += InitonPDE2.getStore();
            InitonPDE2 = InitonPDE2.next;
        }
        pDE_RNA_FullFormular3.pde += InitonPDE2.getStore();
        while (InitonPDE2.hasPrev()) {
            InitonPDE2 = InitonPDE2.prev;
        }

        Initon InitonPDEM = new PDI_X_doDecrement()
            .doDecrementM(InitonPDE2, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDEP = new PDI_X_doDecrement()
            .doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDEO = new PDI_X_doDecrement()
            .doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDEA = new PDI_X_doDecrement()
            .doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular3);

        Initon InitonPDES = new PDI_X_doDecrement()
            .doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular3, bYS);
        Initon InitonPDEC = new PDI_X_doDecrement()
            .doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_FullFormular3);
        Initon InitonPDEE = new PDI_X_doDecrement()
            .doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular3, bYS);
        Initon InitonPDE1 = new PDI_X_doDecrement()
            .doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular3);
        while (InitonPDE1.hasNext()) {
            pDE_RNA_FullFormular3.pds += InitonPDE1.getStore();
            InitonPDE1 = InitonPDE1.next;
        }
        pDE_RNA_FullFormular3.pds += InitonPDE1.getStore();
        while (InitonPDE1.hasPrev()) {
            InitonPDE1 = InitonPDE1.prev;
        }
    }

    public void doSessionKeyUnPress(String initons
        , PDI_X_ pDE_RNA_FullFormular2, boolean bYS) {
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

    public void do_PDE_RNA_FullFormular_Back(Initon initon
        , PDI_X_ pDE_RNA_FullFormular
        , boolean bYS) {
        Initon InitonPDE = initon;
        InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
        Initon InitonPDEM = new PDI_X_doDecrement()
            .doDecrementM(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEP = new PDI_X_doDecrement()
            .doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEO = new PDI_X_doDecrement()
            .doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEA = new PDI_X_doDecrement()
            .doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular);

        Initon InitonPDES = new PDI_X_doDecrement()
            .doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        Initon InitonPDEC = new PDI_X_doDecrement()
            .doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEE = new PDI_X_doDecrement()
            .doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        Initon InitonPDE1 = new PDI_X_doDecrement()
            .doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular);
        while (InitonPDE1.hasNext()) {
            pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
            InitonPDE1 = InitonPDE1.next;
        }
        pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
        while (InitonPDE1.hasPrev()) {
            InitonPDE1 = InitonPDE1.prev;
        }
    }
    //	Initon InitonPDE1S= new PDI_X_doIncrement()
    //.doIncrementS(InitonPDE1, initonLinkDNA, pDE_RNA_FullFormular, bYS);
    //		Initon InitonPDE1C= new PDI_X_doIncrement()
    //.doIncrementC(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDE1E= new PDI_X_doIncrement()
    //.doIncrementE(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);
    //		Initon InitonPDE1V= new PDI_X_doIncrement()
    //.doIncrementV(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDE1M= new PDI_X_doIncrement()
    //.doIncrementM(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDE1P= new PDI_X_doIncrement()
    //.doIncrementP(InitonPDE1M, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDE1O= new PDI_X_doIncrement()
    //.doIncrementO(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
    //		Initon InitonPDE2= new PDI_X_doIncrement()
    //.doIncrementA(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
    //		while(InitonPDE2.hasNext()) {
    //			pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
    //			InitonPDE2= InitonPDE2.next;
    //		}
    //		pDE_RNA_FullFormular.pde+= InitonPDE2.getStore();
    //		while(InitonPDE2.hasPrev()) {
    //			InitonPDE2= InitonPDE2.prev;
    //		}


    public void do_PDE_RNA_FullFormularForDB(Initon initon
        , PDI_X_ pDE_RNA_FullFormular, boolean bYS) {

        Initon InitonPDE = initon;
        InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
        Initon InitonPDE1V = new PDI_X_doDecrement()
            .doDecrementV(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1E = new PDI_X_doDecrement()
            .doDecrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        Initon InitonPDE1C = new PDI_X_doDecrement()
            .doDecrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1S = new PDI_X_doDecrement()
            .doDecrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        //		Initon InitonPDE1A= new PDI_X_doIncrement()
        //.doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);
        //		Initon InitonPDE1O= new PDI_X_doIncrement()
        //.doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
        //		Initon InitonPDE1P= new PDI_X_doIncrement()
        //.doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
        //		Initon InitonPDE2= new PDI_X_doIncrement()
        //.doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
        while (InitonPDE1S.hasNext()) {
            pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
            InitonPDE1S = InitonPDE1S.next;
        }
        pDE_RNA_FullFormular.pde += InitonPDE1S.getStore();
        while (InitonPDE1S.hasPrev()) {
            InitonPDE1S = InitonPDE1S.prev;
        }
    }

    public void do_PDE_RNA_FullFormular(Initon initon
        , PDI_X_ pDE_RNA_FullFormular
        , boolean bYS) {
        Initon InitonPDE = initon;
        InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
        //a->b
        Initon InitonPDEA = new PDI_X_doDecrement()
            .doDecrementA(InitonPDE, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEO = new PDI_X_doDecrement()
            .doDecrementO(InitonPDEA, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEP = new PDI_X_doDecrement()
            .doDecrementP(InitonPDEO, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEM = new PDI_X_doDecrement()
            .doDecrementM(InitonPDEP, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEV = new PDI_X_doDecrement()
            .doDecrementV(InitonPDEM, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDEE = new PDI_X_doDecrement()
            .doDecrementE(InitonPDEV, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        Initon InitonPDEC = new PDI_X_doDecrement()
            .doDecrementC(InitonPDEE, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1 = new PDI_X_doDecrement()
            .doDecrementS(InitonPDEC, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        while (InitonPDE1.hasNext()) {
            pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
            InitonPDE1 = InitonPDE1.next;
        }
        pDE_RNA_FullFormular.pds += InitonPDE1.getStore();
        while (InitonPDE1.hasPrev()) {
            InitonPDE1 = InitonPDE1.prev;
        }
        //b->c
        Initon InitonPDE1V = new PDI_X_doIncrement()
            .doIncrementV(InitonPDE1, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1E = new PDI_X_doIncrement()
            .doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        Initon InitonPDE1C = new PDI_X_doIncrement()
            .doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1S = new PDI_X_doIncrement()
            .doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_FullFormular, bYS);
        Initon InitonPDE1A = new PDI_X_doIncrement()
            .doIncrementA(InitonPDE1S, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1O = new PDI_X_doIncrement()
            .doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE1P = new PDI_X_doIncrement()
            .doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_FullFormular);
        Initon InitonPDE2 = new PDI_X_doIncrement()
            .doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_FullFormular);
        while (InitonPDE2.hasNext()) {
            pDE_RNA_FullFormular.pde += InitonPDE2.getStore();
            InitonPDE2 = InitonPDE2.next;
        }
        pDE_RNA_FullFormular.pde += InitonPDE2.getStore();
        while (InitonPDE2.hasPrev()) {
            InitonPDE2 = InitonPDE2.prev;
        }
    }
}
