package DVIAQVIMIV;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;
import P_V.PCI.ASQ.statistic.ShareholdCount;
import U_A.PEU.P.image.ReadWritePng;

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
public class SkinDetect {

    public void getRatioScore() {

    }

    public void getRatioScoreSort() {

    }

    @SuppressWarnings("unused")
    public static void main(String[] argv) {
        //皮肤病图片识别
        //1 读取一张图片
        //在
        int[][] r = new ReadWritePng().REDpngRead("图片地址");
        int[][] g = new ReadWritePng().GRNpngRead("图片地址");
        int[][] b = new ReadWritePng().BLUpngRead("图片地址");
        //等会增加PCA区域面积
        ///......
        //
        //2 进行肽展非卷积erosion变换.
        //3 统计erosion后的颜色特征
        //3.1用PDE肽erosion碱性 为 处理函数
        int ratio = 50;//酸碱浓度模拟就到这个份上.(0 ~ 100)
        int[][] rp = RangePDI.IPE(r, ratio);
        int[][] gp = RangePDI.IPE(g, ratio);
        int[][] bp = RangePDI.IPE(b, ratio);

        //4 然后进行模式识别 数据比对,
        int sharehold = 127;//酸碱浓度模拟就到这个份上.(0 ~ 100)
        //4.1像素统计
        double countR = ShareholdCount.getShareholdCount(rp, sharehold);
        double countB = ShareholdCount.getShareholdCount(bp, sharehold);
        double countG = ShareholdCount.getShareholdCount(gp, sharehold);

        //double countYellow= ...
        int[][][] rgb = new int[][][]{r, g, b};
        double countYellow = new GetICAStatisticRatio(5, 15).getYellowStatisticCount(rgb);
        double countBlue = new GetICAStatisticRatio(5, 15).getBlueStatisticCount(rgb);
        double countRed = new GetICAStatisticRatio(5, 15).getRedStatisticCount(rgb);
        double countGreen = new GetICAStatisticRatio(5, 15).getGreenStatisticCount(rgb);
        double countPupil = new GetICAStatisticRatio(5, 15).getPupilStatisticCount(rgb);
        double countWhite = new GetICAStatisticRatio(5, 15).getWhiteStatisticCount(rgb);
        double countPink = new GetICAStatisticRatio(5, 15).getPinkStatisticCount(rgb);
        //double countPupil= ...
        //double countPink= ...
        //double countWhite= ...

        //5 打分.
        //5.1红蓝比值
        double ratioRB = 0 == countB ? 0 : countR / countB;
        double ratioRG = 0 == countG ? 0 : countR / countG;
        double ratioGB = 0 == countB ? 0 : countG / countB;
        //...下面为非原色
        double ratioYellowR = 0 == countR ? 0 : countYellow / countR;
        double ratioYellowG = 0 == countG ? 0 : countYellow / countG;
        double ratioYellowB = 0 == countB ? 0 : countYellow / countB;

        double countBlueR = 0 == countR ? 0 : countBlue / countR;
        double countBlueG = 0 == countG ? 0 : countBlue / countG;
        double countBlueB = 0 == countB ? 0 : countBlue / countB;

        double countRedR = 0 == countR ? 0 : countRed / countR;
        double countRedG = 0 == countG ? 0 : countRed / countG;
        double countRedB = 0 == countB ? 0 : countRed / countB;

        double countGreenR = 0 == countR ? 0 : countGreen / countR;
        double countGreenG = 0 == countG ? 0 : countGreen / countG;
        double countGreenB = 0 == countB ? 0 : countGreen / countB;

        double countPupilR = 0 == countR ? 0 : countPupil / countR;
        double countPupilG = 0 == countG ? 0 : countPupil / countG;
        double countPupilB = 0 == countB ? 0 : countPupil / countB;

        double countWhiteR = 0 == countR ? 0 : countWhite / countR;
        double countWhiteG = 0 == countG ? 0 : countWhite / countG;
        double countWhiteB = 0 == countB ? 0 : countWhite / countB;

        double countPinkR = 0 == countR ? 0 : countPink / countR;
        double countPinkG = 0 == countG ? 0 : countPink / countG;
        double countPinkB = 0 == countB ? 0 : countPink / countB;
        //...
        //..
        //接近满分 100分, 按百分比接近相似度 打分.
        //double score= 都到这一步了, 遍历图片数据这样计算 做个采样数据库, 之后就比对相似度打分就是了.
        //...
        //比值采样方法, 中心面积取值, 按中心面积2倍 进行周边面积取值.
        //可有可无, 增加比较面, 检测更加精确准确.做成格式化的采样 如身份证头像那样, 固定的.

        //6 排序进行高分推荐.
        //总分排序推荐

        //7做之前进行将所有皮肤病图片训练, 做成数据库, 方便计算加速.
    }
}
