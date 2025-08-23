package A_I.MPE.MAQPVDCOISIV.initon;

import S_A.SVQ.stable.S_Common;

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
public class Initon {
    private String store;
    public Initon prev;
    public Initon next;

    public String getStore() {
        return store;
    }

    public Initon addNextInitons(Initon initon) {
        Initon thisIniton = this;
        while (null != thisIniton.next) {
            thisIniton = thisIniton.next;
        }
        thisIniton.next = initon;
        return thisIniton;
    }

    public Initon addPrevInitons(Initon initon) {
        Initon thisIniton = this;
        while (null != thisIniton.prev) {
            thisIniton = thisIniton.prev;
        }
        thisIniton.prev = initon;
        return thisIniton;
    }

    public void I_Initon(String initon) {
        this.store = initon;
    }

    public void I_A() {
        this.store = "A";
    }

    public void I_O() {
        this.store = "O";
    }

    public void I_P() {
        this.store = "P";
    }

    public void I_M() {
        this.store = "M";
    }

    public void I_V() {
        this.store = "V";
    }

    public void I_E() {
        this.store = "E";
    }

    public void I_C() {
        this.store = "C";
    }

    public void I_S() {
        this.store = "S";
    }

    public void I_I() {
        this.store = "I";
    }

    public void I_D() {
        this.store = "D";
    }

    public void I_U() {
        this.store = "U";
    }

    public void I_Q() {
        this.store = "Q";
    }

    public boolean hasNext() {
        if (null != this.next) {
            return true;
        }
        return false;
    }

    public Initon forwardNext() {
        return this.next;
    }

    public boolean hasPrev() {
        if (null != this.prev) {
            return true;
        }
        return false;
    }

    public Initon forwardPrev() {
        return this.prev;
    }

    // 用于计算复制
    public Initon copyRNA(Initon initonPDE) {
        while (initonPDE.hasPrev()) {
            initonPDE.forwardPrev();
        }
        Initon InitonRNA = new Initon();
        InitonRNA.store = initonPDE.store;
        while (initonPDE.next != null) {
            initonPDE = initonPDE.next;
            Initon initon = new Initon();
            initon.store = initonPDE.store;
            InitonRNA.next = initon;
            initon.prev = InitonRNA;
            InitonRNA = initon;
        }
        //完成copy
        while (initonPDE.prev != null) {
            initonPDE = initonPDE.prev;
        }
        while (InitonRNA.prev != null) {
            InitonRNA = InitonRNA.prev;
        }
        return InitonRNA;
    }

    //用于遗传复制
    public Initon swapRNA(Initon initonPDE) {
        while (initonPDE.hasPrev()) {
            initonPDE.forwardPrev();
        }
        Initon InitonRNA = new Initon();
        InitonRNA.store = initonPDE.store;
        while (initonPDE.next != null) {
            initonPDE = initonPDE.next;
            Initon initon = new Initon();
            if (initonPDE.store.equalsIgnoreCase("IQ")) {
                initon.store = "S";
            }
            if (initonPDE.store.equalsIgnoreCase("S")) {
                initon.store = "IQ";
            }
//			if(initonPDE.store.equalsIgnoreCase("I")) {
//				initon.store= "U";	
//			}//这里我会做补码 规范化. 罗瑶光.20201105 7:56
//			if(initonPDE.store.equalsIgnoreCase("D")) {
//				initon.store= "DD";	
//			}
            if (initonPDE.store.equalsIgnoreCase("E")) {
                initon.store = "DU";
            }
            if (initonPDE.store.equalsIgnoreCase("DU")) {
                initon.store = "E";
            }
            if (initonPDE.store.equalsIgnoreCase("C")) {
                initon.store = "ID";
            }
            if (initonPDE.store.equalsIgnoreCase("ID")) {
                initon.store = "C";
            }
            if (initonPDE.store.equalsIgnoreCase("UQ")) {
                initon.store = "V";
            }
            if (initonPDE.store.equalsIgnoreCase("V")) {
                initon.store = "UQ";
            }
            initon.store = initonPDE.store;
            InitonRNA.next = initon;
            initon.prev = InitonRNA;
            InitonRNA = initon;
        }
        //完成copy
        while (initonPDE.prev != null) {
            initonPDE = initonPDE.prev;
        }
        while (InitonRNA.prev != null) {
            InitonRNA = InitonRNA.prev;
        }
        return InitonRNA;
    }

    //用于反码复制
    public Initon maskRNA(Initon initonPDE) {
        while (initonPDE.hasPrev()) {
            initonPDE.forwardPrev();
        }
        Initon InitonRNA = new Initon();
        InitonRNA.store = initonPDE.store;
        while (initonPDE.next != null) {
            initonPDE = initonPDE.next;
            Initon initon = new Initon();

            if (initonPDE.store.equalsIgnoreCase("I")) {
                initon.store = "D";
            }
            if (initonPDE.store.equalsIgnoreCase("D")) {
                initon.store = "I";
            }
            if (initonPDE.store.equalsIgnoreCase("U")) {
                initon.store = "Q";
            }
            if (initonPDE.store.equalsIgnoreCase("Q")) {
                initon.store = "U";
            }
            initon.store = initonPDE.store;
            InitonRNA.next = initon;
            initon.prev = InitonRNA;
            InitonRNA = initon;
        }
        //完成copy
        while (initonPDE.prev != null) {
            initonPDE = initonPDE.prev;
        }
        while (InitonRNA.prev != null) {
            InitonRNA = InitonRNA.prev;
        }
        return InitonRNA;
    }

    //用于补码复制
    public Initon compsRNA(Initon initonPDE) {
        while (initonPDE.hasPrev()) {
            initonPDE.forwardPrev();
        }
        Initon InitonRNA = new Initon();
        InitonRNA.store = initonPDE.store;
        while (initonPDE.next != null) {
            initonPDE = initonPDE.next;
            Initon initon = new Initon();

            if (initonPDE.store.equalsIgnoreCase("I")) {
                initon.store = "U";
            }
            if (initonPDE.store.equalsIgnoreCase("D")) {
                initon.store = "I";
            }
            if (initonPDE.store.equalsIgnoreCase("U")) {
                initon.store = "Q";
            }
            if (initonPDE.store.equalsIgnoreCase("Q")) {
                initon.store = "DD";
            }
            initon.store = initonPDE.store;
            InitonRNA.next = initon;
            initon.prev = InitonRNA;
            InitonRNA = initon;
        }
        //完成copy
        while (initonPDE.prev != null) {
            initonPDE = initonPDE.prev;
        }
        while (InitonRNA.prev != null) {
            InitonRNA = InitonRNA.prev;
        }
        return InitonRNA;
    }

    //举例V的 SWAP initon.store= "UQ"; -> initon.store= "U"; 和 NEXT initon.store= "Q";
    //用于RNA 肽展遗传和增元计算.
    public Initon storeRNAExtension(Initon initonPDE) {
        while (initonPDE.hasPrev()) {
            initonPDE.forwardPrev();
        }
        Initon InitonRNA = new Initon();
        InitonRNA.store = initonPDE.store;
        while (initonPDE != null) {
            if (initonPDE.store.length() == 1) {
                Initon initon = new Initon();
                initon.store = initonPDE.store;
                initon.prev = initonPDE.prev;
                initon.next = initonPDE.next;
                InitonRNA = initon;
            }
            if (initonPDE.store.length() == 2) {
                //初始
                Initon initonFirst = new Initon();
                Initon initonSecond = new Initon();
                //赋值
                initonFirst.store = S_Common.STRING_EMPTY + initonPDE.store.charAt(0);
                initonSecond.store = S_Common.STRING_EMPTY + initonPDE.store.charAt(1);
                //连接
                initonFirst.next = initonSecond;
                initonSecond.prev = initonFirst;
                //已计算的前序融入
                if (initonPDE.prev != null) {
                    initonFirst.prev = initonPDE.prev;
                    initonFirst.prev.next = initonFirst;
                }
                //未计算的后序关联
                if (initonPDE.next != null) {
                    initonSecond.next = initonPDE.next;
                    initonSecond.next.prev = initonSecond;
                }
                //替进
                InitonRNA = initonSecond;
            }
            if (null == initonPDE.next) {
                while (initonPDE.prev != null) {
                    initonPDE = initonPDE.prev;
                }
                while (InitonRNA.prev != null) {
                    InitonRNA = InitonRNA.prev;
                }
                return InitonRNA;
            }
            initonPDE = initonPDE.next;
        }
        //完成copy
        while (initonPDE.prev != null) {
            initonPDE = initonPDE.prev;
        }
        while (InitonRNA.prev != null) {
            InitonRNA = InitonRNA.prev;
        }
        return InitonRNA;
    }

    public static void main(String[] argv) {
        Initon initonV = new Initon();
        initonV.store = "UQ";
        Initon initonV1 = new Initon();
        initonV1.store = "Q";
        Initon initonV2 = new Initon();
        initonV2.store = "IQ";

        initonV.next = initonV1;
        initonV1.prev = initonV;

        initonV1.next = initonV2;
        initonV2.prev = initonV1;

        initonV = initonV.storeRNAExtension(initonV);
        while (initonV.hasNext()) {
            //20230106-System.out.println(initonV.getStore());
            initonV = initonV.forwardNext();
        }
        //20230106-System.out.println(initonV.getStore());
    }

}
