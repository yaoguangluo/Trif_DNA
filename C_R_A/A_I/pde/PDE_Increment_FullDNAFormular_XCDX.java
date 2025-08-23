package A_I.pde;

import fullDNATokenPDI.PDI_X_;
import A_I.MPE.MAQPVDCOISIV.initon.Initon;
import A_I.MPE.MAQPVDCOISIV.initon.InitonLinkDNA;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案, 可阅读 相关 著作权 原文  进行逻辑辨别.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PDE_Increment_FullDNAFormular_XCDX {
    //A= V + S LINK 数据结构对象 (简单测试)
    //这个函数我没有按sonar模式 修改, 因为我担心 sonar会潜意识 改变我的写作模式,
    //于是 按照我很多年的ANSI C代码风格进行编写, 因为这种方式是我的基础. 我个人觉
    //得 一个人的研发能力来自于他的母语水平.所以我是C基础, 我应该继续跟进这个天赋.正如下面这函数.
    public Initon PDE_IncrementA(InitonLinkDNA initonLinkDNA) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        while (null != initonLink) {
            if (initonLink.getStore().equalsIgnoreCase("V")) {
                if (initonLink.hasNext()) {
                    Initon initonNext = initonLink.forwardNext();
                    if (initonNext.getStore().equalsIgnoreCase("S")) {
                        Initon initonIncrementA = new Initon();
                        initonIncrementA.I_A(); //新增一个数据A
                        if (initonNext.hasNext()) {
                            initonIncrementA.next = initonNext.next; //A后序替换
                            initonIncrementA.next.prev = initonIncrementA;//A后序前序恒等
                        }
                        if (null != initonNext.prev.prev) {
                            initonIncrementA.prev = initonNext.prev.prev;//A前序替换
                            initonIncrementA.prev.next = initonIncrementA;//A前序后序恒等
                        }
                        initonLink = initonIncrementA;//最后A代替
                    }
                }
            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }

    //A= V + S LIST jdk util对象, 下面函数是直接用JDK的虚拟机函数 编写的, 逻辑比较清晰, 各有各的用处.
    public List<Initon> PDE_IncrementA(List<Initon> Initons) {
        List<Initon> output = new CopyOnWriteArrayList<>();
        Iterator<Initon> iterator = Initons.iterator();
        while (iterator.hasNext()) {
            Initon initon = iterator.next();
            if (initon.getStore().equalsIgnoreCase("V")) {
                if (iterator.hasNext()) {
                    Initon initonNext = iterator.next();
                    if (initonNext.getStore().equalsIgnoreCase("S")) {
                        Initon initonIncrementA = new Initon();
                        initonIncrementA.I_A();
                        output.add(initonIncrementA);
                        continue;
                    }
                    Initon initonIncrementV = new Initon();
                    initonIncrementV.I_V();
                    Initon initonIncrementS = new Initon();
                    initonIncrementS.I_S();
                    output.add(initonIncrementV);
                    output.add(initonIncrementS);
                    continue;
                }
                Initon initonIncrementV = new Initon();
                initonIncrementV.I_V();
                output.add(initonIncrementV);
                continue;
            }
            output.add(initon);
        }
        return output;
    }

    //O= E + S LINK 数据结构对象 (简单测试)
    public Initon PDE_IncrementO(InitonLinkDNA initonLinkDNA) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        while (null != initonLink) {
            if (initonLink.getStore().equalsIgnoreCase("E")) {
                if (initonLink.hasNext()) {
                    Initon initonNext = initonLink.forwardNext();
                    if (initonNext.getStore().equalsIgnoreCase("S")) {
                        Initon initonIncrementO = new Initon();
                        initonIncrementO.I_O(); //新增一个数据O
                        if (initonNext.hasNext()) {
                            initonIncrementO.next = initonNext.next; //O后序替换
                            initonIncrementO.next.prev = initonIncrementO;//O后序前序恒等
                        }
                        if (null != initonNext.prev.prev) {
                            initonIncrementO.prev = initonNext.prev.prev;//O前序替换
                            initonIncrementO.prev.next = initonIncrementO;//O前序后序恒等
                        }
                        initonLink = initonIncrementO;//最后O代替
                    }
                }
            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }

    //P= E + C LINK 数据结构对象 (简单测试)
    public Initon PDE_IncrementP(InitonLinkDNA initonLinkDNA) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        while (null != initonLink) {
            if (initonLink.getStore().equalsIgnoreCase("E")) {
                if (initonLink.hasNext()) {
                    Initon initonNext = initonLink.forwardNext();
                    if (initonNext.getStore().equalsIgnoreCase("C")) {
                        Initon initonIncrementP = new Initon();
                        initonIncrementP.I_P(); //新增一个数据P
                        if (initonNext.hasNext()) {
                            initonIncrementP.next = initonNext.next; //P后序替换
                            initonIncrementP.next.prev = initonIncrementP;//P后序前序恒等
                        }
                        if (null != initonNext.prev.prev) {
                            initonIncrementP.prev = initonNext.prev.prev;//P前序替换
                            initonIncrementP.prev.next = initonIncrementP;//P前序后序恒等
                        }
                        initonLink = initonIncrementP;//最后P代替
                    }
                }
            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }

    //M= C + S
    public Initon PDE_IncrementM(InitonLinkDNA initonLinkDNA) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        while (null != initonLink) {
            if (initonLink.getStore().equalsIgnoreCase("C")) {
                if (initonLink.hasNext()) {
                    Initon initonNext = initonLink.forwardNext();
                    if (initonNext.getStore().equalsIgnoreCase("S")) {
                        Initon initonIncrementM = new Initon();
                        initonIncrementM.I_M(); //新增一个数据M
                        if (initonNext.hasNext()) {
                            initonIncrementM.next = initonNext.next; //M后序替换
                            initonIncrementM.next.prev = initonIncrementM;//M后序前序恒等
                        }
                        if (null != initonNext.prev.prev) {
                            initonIncrementM.prev = initonNext.prev.prev;//M前序替换
                            initonIncrementM.prev.next = initonIncrementM;//M前序后序恒等
                        }
                        initonLink = initonIncrementM;//最后M代替
                    }
                }
            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }


    //V= U + Q
    public Initon PDE_IncrementV(InitonLinkDNA initonLinkDNA) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        while (null != initonLink) {
            if (initonLink.getStore().equalsIgnoreCase("U")) {
                if (initonLink.hasNext()) {
                    Initon initonNext = initonLink.forwardNext();
                    if (initonNext.getStore().equalsIgnoreCase("Q")) {
                        Initon initonIncrementV = new Initon();
                        initonIncrementV.I_V(); //新增一个数据V
                        if (initonNext.hasNext()) {
                            initonIncrementV.next = initonNext.next; //V后序替换
                            initonIncrementV.next.prev = initonIncrementV;//V后序前序恒等
                        }
                        if (null != initonNext.prev.prev) {
                            initonIncrementV.prev = initonNext.prev.prev;//V前序替换
                            initonIncrementV.prev.next = initonIncrementV;//V前序后序恒等
                        }
                        initonLink = initonIncrementV;//最后V代替
                    }
                }
            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }

    //E= D + U
    //肽展公式的概率问题, 先这样命名, 之后讨论 是IU还是DU
    public Initon PDE_IncrementE_DU(InitonLinkDNA initonLinkDNA
            , PDI_X_ pDE_RNA_Formular, boolean bYS) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        while (null != initonLink) {
            String initonString = initonLink.getStore();
            if (initonLink.getStore().equalsIgnoreCase("D")
                    || initonLink.getStore().equalsIgnoreCase("U")) {
                Initon initonIncrementE = new Initon();
                initonIncrementE.I_E(); //新增一个数据S
                if (initonString.equalsIgnoreCase("D")) {
                    pDE_RNA_Formular.pdeieKey += "0";
                } else if (initonString.equalsIgnoreCase("U")) {
                    pDE_RNA_Formular.pdeieKey += "1";
                }
                if (initonLink.hasNext()) {
                    initonIncrementE.next = initonLink.next; //S后序替换
                    initonIncrementE.next.prev = initonIncrementE;//S后序前序恒等
                }
                if (null != initonLink.prev) {
                    initonIncrementE.prev = initonLink.prev;//S前序替换
                    initonIncrementE.prev.next = initonIncrementE;//S前序后序恒等
                }
                initonLink = initonIncrementE;//最后S代替

            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }

    //C= I + D
    public Initon PDE_IncrementC(InitonLinkDNA initonLinkDNA) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        while (null != initonLink) {
            if (initonLink.getStore().equalsIgnoreCase("I")) {
                if (initonLink.hasNext()) {
                    Initon initonNext = initonLink.forwardNext();
                    if (initonNext.getStore().equalsIgnoreCase("D")) {
                        Initon initonIncrementC = new Initon();
                        initonIncrementC.I_C(); //新增一个数据C
                        if (initonNext.hasNext()) {
                            initonIncrementC.next = initonNext.next; //C后序替换
                            initonIncrementC.next.prev = initonIncrementC;//C后序前序恒等
                        }
                        if (null != initonNext.prev.prev) {
                            initonIncrementC.prev = initonNext.prev.prev;//M前序替换
                            initonIncrementC.prev.next = initonIncrementC;//M前序后序恒等
                        }
                        initonLink = initonIncrementC;//最后C代替
                    }
                }
            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }
//279-
//	if(pDE_RNA_Formular.pdedsKey.charAt(index)== '0') { 
//	initonIncrementS.I_S(); //新增一个数据S
//}else if(pDE_RNA_Formular.pdedsKey.charAt(index)== '1') { 
//	initonIncrementS.I_S(); //新增一个数据S
//}else if(pDE_RNA_Formular.pdedsKey.charAt(index)== '2') { 
//	if(initonString.equalsIgnoreCase("I")) {
//		initonIncrementS.I_I();
//		//pDE_RNA_Formular.pdeisKey+= "0";
//	}else if(initonString.equalsIgnoreCase("Q")) {
//		initonIncrementS.I_Q();
//		//pDE_RNA_Formular.pdeisKey+= "1";
//	}
//}	
//index++;

    //S= I
    //肽展公式的概率问题, 先这样命名, 之后讨论 是I, Q还是I + Q
    public Initon PDE_IncrementS_IQ(InitonLinkDNA initonLinkDNA
            , PDI_X_ pDE_RNA_Formular) {
        Initon initonLink = initonLinkDNA.getInitonLink();
        //int index= 0;
        while (null != initonLink) {
            String initonString = initonLink.getStore();
            if (initonLink.getStore().equalsIgnoreCase("I")
                    || initonLink.getStore().equalsIgnoreCase("Q")) {
                Initon initonIncrementS = new Initon();
                initonIncrementS.I_S(); //新增一个数据S
                if (initonString.equalsIgnoreCase("I")) {
                    pDE_RNA_Formular.pdeisKey += "0";
                } else if (initonString.equalsIgnoreCase("Q")) {
                    pDE_RNA_Formular.pdeisKey += "1";
                }
                if (initonLink.hasNext()) {
                    initonIncrementS.next = initonLink.next; //S后序替换
                    initonIncrementS.next.prev = initonIncrementS;//S后序前序恒等
                }
                if (null != initonLink.prev) {
                    initonIncrementS.prev = initonLink.prev;//S前序替换
                    initonIncrementS.prev.next = initonIncrementS;//S前序后序恒等
                }
                initonLink = initonIncrementS;//最后S代替

            }
            if (!initonLink.hasNext()) {
                return initonLink;
            }
            initonLink = initonLink.forwardNext();//while loop 替增.
        }
        return initonLink;
    }
}
