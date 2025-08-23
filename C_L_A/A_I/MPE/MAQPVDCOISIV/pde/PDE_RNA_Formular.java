package A_I.MPE.MAQPVDCOISIV.pde;

import A_I.MPE.MAQPVDCOISIV.initon.Initon;
import A_I.MPE.MAQPVDCOISIV.initon.InitonLinkDNA;

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
public class PDE_RNA_Formular {
    public static void main(String[] argv) {
        Initon initonA = new Initon();
        initonA.I_M();   //改成  O 测试下
        Initon initonV = new Initon();
        initonV.I_S();
        Initon initonS = new Initon();
        initonS.I_I();
        Initon initonS1 = new Initon();
        initonS1.I_O();
        Initon initonS2 = new Initon();
        initonS2.I_C();
        Initon initonS3 = new Initon();
        initonS3.I_U();
        Initon initonS4 = new Initon();
        initonS4.I_O();
        Initon initonS5 = new Initon();
        initonS5.I_C();
        Initon initonS6 = new Initon();
        initonS6.I_I();
        Initon initonS7 = new Initon();
        initonS7.I_P();
        Initon initonS8 = new Initon();
        initonS8.I_C();
        Initon initonS9 = new Initon();
        initonS9.I_U();
        Initon initonS10 = new Initon();
        initonS10.I_P();
        Initon initonS11 = new Initon();
        initonS11.I_C();
        Initon initonS12 = new Initon();
        initonS12.I_I();

        initonA.next = initonV;
        initonV.prev = initonA;
        initonV.next = initonS;
        initonS.prev = initonV;
        initonS.next = initonS1;
        initonS1.prev = initonS;

        initonS.next = initonS1;
        initonS1.prev = initonS;

        initonS1.next = initonS2;
        initonS2.prev = initonS1;

        initonS2.next = initonS3;
        initonS3.prev = initonS2;

        initonS3.next = initonS4;
        initonS4.prev = initonS3;

        initonS4.next = initonS5;
        initonS5.prev = initonS4;

        initonS5.next = initonS6;
        initonS6.prev = initonS5;

        initonS6.next = initonS7;
        initonS7.prev = initonS6;

        initonS7.next = initonS8;
        initonS8.prev = initonS7;

        initonS8.next = initonS9;
        initonS9.prev = initonS8;

        initonS9.next = initonS10;
        initonS10.prev = initonS9;

        initonS10.next = initonS11;
        initonS11.prev = initonS10;

        initonS11.next = initonS12;
        initonS12.prev = initonS11;

        PDE_RNA_Formular pDE_RNA_Formular = new PDE_RNA_Formular();
        pDE_RNA_Formular.do_PDE_RNA_Formular(initonA);
    }

    public void do_PDE_RNA_Formular(Initon initon) {
        //初始
        Initon InitonPDE = initon;
        //20230106-System.out.print("input:" + InitonPDE.getStore());
        while (InitonPDE.hasNext()) {
            InitonPDE = InitonPDE.forwardNext();
            //20230106-System.out.print(InitonPDE.getStore());
        }
        //20230106-System.out.println();

        ////20230106-System.out.println("肽展 降元");
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        InitonLinkDNA initonLinkDNA = new InitonLinkDNA();
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementA(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("降元A= V + S");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementO(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("降元O= E + S");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementP(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("降元P= E + C");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementM(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("降元M= C + S");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementV(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("降元V= U + Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPY = InitonPDE.copyRNA(InitonPDE);
        ////20230106-System.out.println();
        ////20230106-System.out.println("1降元概率IU");
        doE_IU(InitonPDE, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPY);
        ////20230106-System.out.println();
        ////20230106-System.out.println("2降元概率DU");
        doE_DU(InitonPDE_COPY, initonLinkDNA);


    }

    private static void doE_IU(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementE_IU(initonLinkDNA, null, false);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("11降元E= I + U");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementC(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("11降元C= I + D");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);

        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPYSI = InitonPDE.copyRNA(InitonPDE);
        Initon InitonPDE_COPYSQ = InitonPDE.copyRNA(InitonPDE);

        ////20230106-System.out.println();
        String s = "1111概率S_";
        String si = "1111概率S_I_";
        String sq = "1111概率S_Q_";
        ////20230106-System.out.println("1111概率S");
        doS(s, InitonPDE, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPYSI);
        ////20230106-System.out.println();
        ////20230106-System.out.println("1112概率S_I");
        doS_I(si, InitonPDE_COPYSI, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPYSQ);
        ////20230106-System.out.println();
        ////20230106-System.out.println("1113概率S_Q");
        doS_Q(sq, InitonPDE_COPYSQ, initonLinkDNA);
    }

    private static void doS_Q(String sq, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementS_Q(initonLinkDNA, null);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();

        ////20230106-System.out.println(sq+ "降元S= Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);

        //全部 收
        ////20230106-System.out.println();
        ////20230106-System.out.println(sq+ "肽展 增元");
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA = new InitonLinkDNA();
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(sq+ "V= U + Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPY = InitonPDE.copyRNA(InitonPDE);
        ////20230106-System.out.println();
        ////20230106-System.out.println(sq+ "概率Increment IU");
        doIncrementE_IU(sq, InitonPDE, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPY);
        ////20230106-System.out.println();
        ////20230106-System.out.println(sq+ "概率Increment DU");
        doIncrementE_DU(sq, InitonPDE_COPY, initonLinkDNA);
    }

    private static void doS_I(String si, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementS_I(initonLinkDNA, null, false);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(si+ "11降元S= I");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);

        //全部 收
        ////20230106-System.out.println();
        ////20230106-System.out.println(si+ "11肽展 增元");
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA = new InitonLinkDNA();
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(si+ "11V= U + Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPY = InitonPDE.copyRNA(InitonPDE);
        ////20230106-System.out.println();
        ////20230106-System.out.println(si+ "111概率Increment IU");
        doIncrementE_IU(si, InitonPDE, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPY);
        ////20230106-System.out.println();
        ////20230106-System.out.println(si+ "112概率Increment DU");
        doIncrementE_DU(si, InitonPDE_COPY, initonLinkDNA);
    }

    private static void doS(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementS(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();

        ////20230106-System.out.println(s+ "11降元S= I + Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);

        //全部 收
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "11肽展 增元");
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA = new InitonLinkDNA();
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "11V= U + Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPY = InitonPDE.copyRNA(InitonPDE);
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "111概率Increment IU");
        doIncrementE_IU(s, InitonPDE, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPY);
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "112概率Increment DU");
        doIncrementE_DU(s, InitonPDE_COPY, initonLinkDNA);
    }

    private static void doE_DU(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementE_DU(initonLinkDNA, null);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("21降元E= D + U");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Decrement_Formular().PDE_DecrementC(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println("21降元C= I + D");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }

        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPYSI = InitonPDE.copyRNA(InitonPDE);
        Initon InitonPDE_COPYSQ = InitonPDE.copyRNA(InitonPDE);
        String s = "2222概率S_";
        String si = "2222概率S_I_";
        String sq = "2222概率S_Q_";
        ////20230106-System.out.println();
        ////20230106-System.out.println("2111概率S");
        doS(s, InitonPDE, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPYSI);
        ////20230106-System.out.println();
        ////20230106-System.out.println("2112概率S_I");
        doS_I(si, InitonPDE_COPYSI, initonLinkDNA);

        initonLinkDNA.I_InitonLink(InitonPDE_COPYSQ);
        ////20230106-System.out.println();
        ////20230106-System.out.println("2113概率S_Q");
        doS_Q(sq, InitonPDE_COPYSQ, initonLinkDNA);
    }

    private static void doIncrementE_DU(String sq, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementE_DU(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(sq+ "E= D + U");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementC(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(sq+ "C= I + D");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);

        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPYSI = InitonPDE.copyRNA(InitonPDE);
        Initon InitonPDE_COPYSQ = InitonPDE.copyRNA(InitonPDE);

        doIncrementS(sq + "EDU_IQ_", InitonPDE, initonLinkDNA);
        doIncrementS_I(sq + "EDU_I_", InitonPDE_COPYSI, initonLinkDNA);
        doIncrementS_Q(sq + "EDU_Q_", InitonPDE_COPYSQ, initonLinkDNA);
    }

    private static void doIncrementE_IU(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementE_IU(initonLinkDNA, null, false);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "E= I + U");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementC(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "C= I + D");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementS(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        Initon InitonPDE_COPYSI = InitonPDE.copyRNA(InitonPDE);
        Initon InitonPDE_COPYSQ = InitonPDE.copyRNA(InitonPDE);

        doIncrementS(s + "EIU_IQ_", InitonPDE, initonLinkDNA);
        doIncrementS_I(s + "EIU_I_", InitonPDE_COPYSI, initonLinkDNA);
        doIncrementS_Q(s + "EIU_Q_", InitonPDE_COPYSQ, initonLinkDNA);
    }

    private static void doIncrementS_Q(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementS_Q(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "S= Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        doIncrementAOPM(s, InitonPDE, initonLinkDNA);
    }

    private static void doIncrementS_I(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementS_I(initonLinkDNA, null);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "S= I");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        doIncrementAOPM(s, InitonPDE, initonLinkDNA);
    }

    private static void doIncrementS(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementS(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "S= I + Q");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        doIncrementAOPM(s, InitonPDE, initonLinkDNA);
    }

    private static void doIncrementAOPM(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementA(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "A= V + S");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementO(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "O= E + S");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementP(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        ////20230106-System.out.println();
        ////20230106-System.out.println(s+ "P= E + C");
        while (InitonPDE.hasNext()) {
            ////20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        ////20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
        InitonPDE = new PDE_Increment_Formular().PDE_IncrementM(initonLinkDNA);
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        //20230106-System.out.println();
        //20230106-System.out.println(s+ "M= C + S");
        while (InitonPDE.hasNext()) {
            //20230106-System.out.print(InitonPDE.getStore());
            InitonPDE = InitonPDE.forwardNext();
        }
        //20230106-System.out.print(InitonPDE.getStore());
        while (InitonPDE.hasPrev()) {
            InitonPDE = InitonPDE.forwardPrev();
        }
        initonLinkDNA.I_InitonLink(InitonPDE);
    }
}
