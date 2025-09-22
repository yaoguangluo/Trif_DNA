package S_A.linePage;

import A_I.MPE.MAQPVDCOISIV.pdi.RangePDI;
import ME.VPC.M.app.App;
import P.wave.proportion.Proportion_X_newXY;
import P.wave.proportion.Proportion_X_newXYBest;
import U_A.PEU.P.wave.Guassian_F;
import U_A.PEU.P.wave.Median;
import U_A.PEU.P.wave.Tailor;
import jniLYGAFDCDFFT.LYGAFDCTDFFT_F.cp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class PageQ_E extends PageQ_S {
    public String clt4(Graphics2D graphics2D, App NE) {
        if (null == graphics2D) {
            graphics2D = (Graphics2D) soundWaveJPanelNew.getGraphics();
        }
        //conf
        mainPaint.g2 = graphics2D;
        if (NE.app_S.isCloseSA) {
            mainPaint.paintSA(new Color(95, 95, 95));
        } else {
            mainPaint.paintSA(Color.WHITE);
        }
        //pa
        float showSize = 1024;
        pageP_M.passNeed = 1;
        pageP_M.XRange = showSize;
        if (NE.app_S.isClosePA) {//later page new bug
            int temp = NE.app_S.sourcePagePA;
            int passNeed = 1 << (temp - 1);
            showSize /= passNeed;
            pageP_M.passNeed = passNeed;
            pageP_M.XRange = showSize;
        }
        //cacu
        float bili0[] = newdata;
        if (0 == type) {//later fix
            bili0 = Proportion_X_newXYBest.newXYBestAll(bili0, showSize, 80);//+
            lines.clear();
            for (int i = 0; i < bili0.length; i++) {
                lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
            }
            mainPaint.paint(mainPaint.g2, bili0, forOutput, NE);
        } else if (1 == type) {
            if (NE.app_S.isCloseFA) {
                bili0 = Proportion_X_newXYBest.newXYBestAll(bili0, showSize, 80);
            } else {
                bili0 = Proportion_X_newXYBest.newXYBestAllStableMax_f(bili0, showSize
                    , 80, NE.app_S.sourcePageFA);//+
            }
            if (0 < NE.app_S.sourcePagePDE) {
                //double-pde
                bili0 = RangePDI.Double_IPE_AOPM_VECS_IDUQ_TXH_AC(bili0, NE);
            }
            lines.clear();
            mainPaint.paint(mainPaint.g2, bili0, forOutput, NE);
        } else {
            bili0 = Proportion_X_newXY.newXY(bili0, showSize, 80);
            lines.clear();
            for (int i = 0; i < bili0.length; i++) {
                lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
            }
            return "";
        }
        if (NE.app_S.full1024) {
            if (null == NE.app_S.full1024Vector) {
                return "";
            }
            if (mainPaint.regLine > 1023) {
                bili0 = NE.app_S.full1024Vector.clone();
            } else {
                return "";
            }
        }
        Color color = new Color(95, 95, 95);
        cp[] out = new cp[bili0.length];
        //库里图基快速傅立叶
        if (NE.app_S.isFFT) {
            float[] ftkD = lYGAFDCTDFFT_F.jniLYGFFT(bili0, out, 4);
            ftkD = render(ftkD, false, NE);
            mainPaint.paint2(ftkD_record, color, 10, 290, 0);
            mainPaint.paint2(ftkD, Color.red, 10, 290, 0);
            mainPaint.paint_string(color, 10, 290, "库里图基傅立叶fft");
            mainPaint.paint_string(Color.red, 10, 290, "库里图基傅立叶fft");
            ftkD_record = ftkD;
        }
        if (NE.app_S.isIFFT) {
            //虚构空间
            float[] fit = lYGAFDCTDFFT_F.jniLYGFIT(bili0, out, 4);
            fit = render(fit, false, NE);
            mainPaint.paint2(fit_record, color, 10, 420, 0);
            mainPaint.paint2(fit, Color.orange, 10, 420, 0);
            mainPaint.paint_string(color, 10, 420, "虚构空间");
            mainPaint.paint_string(Color.orange, 10, 420, "虚构空间");
            fit_record = fit;
            //噪音诃虚构时能
            float[] ffn = lYGAFDCTDFFT_F.jniLYGFLTn(bili0, out, 4);
            ffn = render(ffn, false, NE);
            mainPaint.paint2(ffn_record, color, 270, 290, 0);
            mainPaint.paint2(ffn, Color.yellow, 270, 290, 0);
            mainPaint.paint_string(color, 270, 290, "虚构时能");
            mainPaint.paint_string(Color.yellow, 270, 290, "虚构时能");
            ffn_record = ffn;
        }
        if (NE.app_S.isLFFT) {
            //虚度空间
            float[] flt = lYGAFDCTDFFT_F.jniLYGFLT(bili0, out, 4);
            flt = render(flt, false, NE);
            mainPaint.paint2(flt_record, color, 530, 290, 0);
            mainPaint.paint2(flt, Color.BLUE, 530, 290, 0);
            mainPaint.paint_string(color, 530, 290, "虚度时能");
            mainPaint.paint_string(Color.BLUE, 530, 290, "虚度时能");
            flt_record = flt;
            //薛定谔虚度漂移
            float[] fxet = lYGAFDCTDFFT_F.jniLYGFxET(bili0, out, 4);
            fxet = render(fxet, false, NE);
            mainPaint.paint2(fxet_record, color, 790, 420, 0);
            mainPaint.paint2(fxet, Color.pink, 790, 420, 0);
            mainPaint.paint_string(color, 790, 420, "薛定谔虚度漂移");
            mainPaint.paint_string(Color.pink, 790, 420, "薛定谔虚度漂移");
            fxet_record = fxet;
        }
        if (NE.app_S.isPdn) {
            float[] fllt = lYGAFDCTDFFT_F.jniLYGPDN(bili0, 4);
            fllt = render(fllt, true, NE);
            mainPaint.paint2(fllt_record, color, 790, 290, 40);
            mainPaint.paint2(fllt, Color.MAGENTA, 790, 290, 40);
            mainPaint.paint_string(color, 790, 290, "PDN-PDE");
            mainPaint.paint_string(Color.MAGENTA, 790, 290, "PDN-PDE");
            fllt_record = fllt;
        }
        if (NE.app_S.isTFT) {
            //时能虚空
            float[] fflA = new float[bili0.length];
            float[] fflBI = new float[bili0.length];
            float[] ffl = lYGAFDCTDFFT_F.jniLYGFET(bili0, fflA, fflBI, out, 4);//trif later
            ffl = render(ffl, false, NE);
            ffl = Proportion_X_newXY.newXY(ffl, 256, 80);//+
            mainPaint.paint2(ffl_record, color, 530, 420, 0);
            mainPaint.paint2(ffl, Color.white, 530, 420, 0);
            mainPaint.paint_string(color, 530, 420, "时函数");
            mainPaint.paint_string(Color.white, 530, 420, "时函数");
            ffl_record = ffl;
            fflA = render(fflA, false, NE);
            fflA = Proportion_X_newXY.newXY(fflA, 256, 40);//+
            fflBI = render(fflBI, false, NE);
            fflBI = Proportion_X_newXY.newXY(fflBI, 256, 40);//+
            mainPaint.paint2(fflA_record, fflBI_record, color, 270 + 128, 420 - 40, 0);
            mainPaint.paint2(fflA, fflBI, Color.green, 270 + 128, 420 - 40, 0);
            mainPaint.paint2_string(color, 270 + 128, 420 - 40, "时函数空间纹路");
            mainPaint.paint2_string(Color.green, 270 + 128, 420 - 40, "时函数空间纹路");
            fflA_record = fflA;
            fflBI_record = fflBI;
        }
        return "";
    }

    public float[] render(float[] dftk, boolean isMid, App NE) {
        int reg = 0;
        if (NE.app_S.isLianghua && !isMid) {//later local register
            reg = 2;//64
        }
        float temp = (dftk.length >> reg);
        dftk = Tailor.caiJian1(dftk, 0, temp);//64
        float height = 80;
        if (isMid) {
            height = 40;
        }
        dftk = Proportion_X_newXY.newXY(dftk, 256, height);//+
        if (NE.app_S.isMedian) {
            dftk = Median.median1d(dftk, 3);
        }
        if (NE.app_S.isGussian) {
            dftk = Guassian_F.guassian1d(dftk);
        }
        return dftk;
    }

    public String clt4WithoutErazer(Graphics2D graphics2D, App NE) {
        if (null == graphics2D) {
            graphics2D = (Graphics2D) soundWaveJPanelNew.getGraphics();
        }
        //conf
        mainPaint.g2 = graphics2D;
        if (NE.app_S.isCloseSA) {
            mainPaint.paintSA(new Color(95, 95, 95));
        } else {
            mainPaint.paintSA(Color.WHITE);
        }
        //pa
        float showSize = 1024;
        pageP_M.passNeed = 1;
        pageP_M.XRange = showSize;
        if (NE.app_S.isClosePA) {//later page new bug
            int temp = NE.app_S.sourcePagePA;
            int passNeed = 1 << (temp - 1);
            showSize /= passNeed;
            pageP_M.passNeed = passNeed;
            pageP_M.XRange = showSize;
        }
        //cacu
        float[] bili0 = newdata;
        if (0 < NE.app_S.sourcePagePDE) {
            //double-pde
            bili0 = RangePDI.Double_IPE_AOPM_VECS_IDUQ_TXH_AC(bili0, NE);
            //pde-double
        }
        if (0 == type) {//later fix
            bili0 = Proportion_X_newXYBest.newXYBestAll(bili0, showSize, 80);//+
            lines.clear();
            for (int i = 0; i < bili0.length; i++) {
                lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
            }
            mainPaint.paint(mainPaint.g2, bili0, forOutput, NE);
        } else if (1 == type) {
            if (NE.app_S.isCloseFA) {
                bili0 = Proportion_X_newXYBest.newXYBestAll(bili0, showSize, 80);
            } else {
                bili0 = Proportion_X_newXYBest.newXYBestAllStableMax_f(bili0, showSize
                    , 80, NE.app_S.sourcePageFA);//+
            }
            if (0 < NE.app_S.sourcePagePDE) {
                //double-pde
                bili0 = RangePDI.Double_IPE_AOPM_VECS_IDUQ_TXH_AC(bili0, NE);
            }
            lines.clear();
            mainPaint.paint(mainPaint.g2, bili0, forOutput, NE);
        } else {
            bili0 = Proportion_X_newXY.newXY(bili0, showSize, 80);
            lines.clear();
            for (int i = 0; i < bili0.length; i++) {
                lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
            }
        }
        return "";
    }
}
//293
//        mlines2.clear();
//        for (int i = 0; i < dftk.length; i++) {
//            dftk[i] = null == dftk[i] ? 0 : dftk[i];
//            mlines2.add(new Line2D.Double(i, dftk[i], i, dftk[i]));
//        }

//if (1 == type) {
//    if (NE.app_S.isCloseFA) {
//    bili0 = Proportion_X_newXYBest.newXYBestAll(bili0, showSize, 80.0);
//    } else {
//    bili0 = Proportion_X_newXYBest.newXYBestAllStableMax(bili0
//    , showSize, 80.0, NE.app_S.sourcePageFA);
//    }
//    if (0 < NE.app_S.sourcePagePDE) {
//    //double-pde
//    bili0 = RangePDI.Double_IPE_AOPM_VECS_IDUQ_TXH_AC(bili0);
//    //pde-double
//    }
//    lines.clear();
//    if (NE.app_S.pageP_M.times < NE.app_S.pageP_M.passNeed) {
//    NE.app_S.pageP_M.times++;
//    for (int i = 0; i < bili0.length; i++) {
//    NE.app_S.pageP_M.vectorPassNeed.add(new Line2D.Double(
//    i + NE.app_S.pageP_M.XRange, bili0[i]
//    , i + NE.app_S.pageP_M.XRange, bili0[i]));
////                    NE.app_S.pageP_M.vector.add(new Line2D.Double(
////                        i + NE.app_S.pageP_M.XRange, bili0[i]
////                        , i + NE.app_S.pageP_M.XRange, bili0[i]));
//    }
//    }
////            if (NE.app_S.full1024) {
////                if (NE.app_S.pageP_M.vector.size() >= 1024) {
////                    NE.app_S.full1024Vector = NE.app_S.pageP_M.vector;
////                }
////            }
//    mainPaint.paint(mainPaint.g2, NE.app_S.pageP_M.vectorPassNeed, forOutput);
//    NE.app_S.pageP_M.vectorPassNeed.clear();
//    // if (NE.app_S.pageP_M.times >= NE.app_S.pageP_M.passNeed) {
//    //     NE.app_S.pageP_M.times = 0;
////                if (!NE.app_S.full1024) {
////                    NE.app_S.pageP_M.vector.clear();
////                }
//    // }
//    }

//74
//            mlines1.clear();
//            mlines2.clear();
//            mlines3.clear();
//            mlines4.clear();
//            mlines5.clear();
//            mlines6.clear();
//            mlines7.clear();
//            mlines8.clear();
//            mlines9.clear();
//            double[] ff = new double[bili0.length];
//            int ffd = 0;
//            for (double d : bili0) {
//                ff[ffd++] = d;
//            }
//double[] ftk = fFT.jnifft(ff);

//91
//            double[] ftkD = new double[ftk.length];
//            ffd = 0;
//            for (double d : ftk) {
//                ftkD[ffd++] = d;
//            }
//116
//虚构希尔伯特虚度漂移
//通过早期的分解推导，产生的矩阵算子在ffti之后因为蝶形分解到了子集，于是在512的固定init不再适用。
//于是全部去掉该逻辑，更换为设计成空间声纹先*/
//时函数空间纹路
//double[] ffl = bili0.clone();
//ffl = NE.app_S.lYGAFDCTDFFT.jniLYGFLTln(ffl); 更换