package DVIAQVIMIV;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展erosion变换. 计算机视觉. 
//硬件工具, imageIO, javaCV. 像素头
//因为肽展公式和思想GPL2.0开源, 本程序源码同样GPL2.0开源.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DoPDEofSkin {
    public void doPDEofSkin() {

    }

    public void doPDSofSkin() {

    }

    public void doPDNofSkin() {

    }

    public void doTVMofSkin() {

    }

    public void doDNAofSkin() {

    }

    public void doRNAofSkin() {

    }

    public void doErosionofSkin() {

    }

    public int[][][] doPDEofSkin_IDUQ(int[][][] rgb, int ratio) {
        int[][][] output = new int[3][][];
        //int ratio= 50;
        int[][] rp = RangePDI.IPE(rgb[0], ratio);
        int[][] gp = RangePDI.IPE(rgb[1], ratio);
        int[][] bp = RangePDI.IPE(rgb[2], ratio);
        output[0] = rp;
        output[1] = gp;
        output[2] = bp;
        return output;
    }

    public int[][][] doPDEofSkin_AOPM_VECS_IDUQ_TXH(int[][][] rgb, int ratio) {
        int[][][] output = new int[3][][];
        //int ratio= 50;
        int[][] rp = RangePDI.IPE_AOPM_VECS_IDUQ_TXH(rgb[0], ratio);
        int[][] gp = RangePDI.IPE_AOPM_VECS_IDUQ_TXH(rgb[1], ratio);
        int[][] bp = RangePDI.IPE_AOPM_VECS_IDUQ_TXH(rgb[2], ratio);
        output[0] = rp;
        output[1] = gp;
        output[2] = bp;
        return output;
    }

    public int[][][] doPDEofSkin_AOPM_VECS_IDUQ_TXH_AC(int[][][] rgb, int ratio) {
        int[][][] output = new int[3][][];
        //int ratio= 50;
        int[][] rp = RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(rgb[0], ratio);
        int[][] gp = RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(rgb[1], ratio);
        int[][] bp = RangePDI.IPE_AOPM_VECS_IDUQ_TXH_AC(rgb[2], ratio);
        output[0] = rp;
        output[1] = gp;
        output[2] = bp;
        return output;
    }
}
