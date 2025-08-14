//package U_V.AVU.OEU.FLT;
//
//import I_A.IMS.EUQ.SP.SoundWavePanelVectorNew;
//import ME.VPC.M.app.App;
//import U_A.PEU.P.wave.DFT;
//import P.wave.maxAndMin.MaxAndMin_X_max_v;
//import P.wave.proportion.Proportion_X_newXY;
//import P.wave.proportion.Proportion_X_newXYBest;
//import P.wave.proportion.Proportion_X_newYwithoutBound;
//import P.wave.quantification.Quantification_X_liangHuaEqualDelete;
//import jniFFT.LYGFFT;
//import jniLYGAFDCDFFT.LYGAFDCTDFFT;
//import S_A.linePage.Line2025;
//
//import java.awt.Graphics;
//import java.awt.geom.Line2D;
//import java.util.Map;
//import java.util.Vector;
//
////later..已淘汰
////作者： 罗瑶光, 浏阳,
///*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
// * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
// * 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
  //208号 阳光家园别墅小区 第十栋别墅
// * */
//public class FltNew extends Flt {
//    
//
//    public String clt4(LYGFFT fFT, Vector<java.awt.geom.Line2D.Double> lines
//        , Line2025 soundWaveJPanelNew, SoundWavePanelVectorNew mainPaint
//        , Vector<java.awt.geom.Line2D.Double> mlines1
//        , Vector<java.awt.geom.Line2D.Double> mlines2
//        , Vector<java.awt.geom.Line2D.Double> mlines3
//        , Vector<java.awt.geom.Line2D.Double> mlines4
//        , Vector<java.awt.geom.Line2D.Double> mlines5
//        , Vector<java.awt.geom.Line2D.Double> mlines6
//        , Vector<java.awt.geom.Line2D.Double> mlines7
//        , Vector<java.awt.geom.Line2D.Double> mlines8
//        , Vector<java.awt.geom.Line2D.Double> mlines9
//        , Vector<java.awt.geom.Line2D.Double> mlines10
//        , Vector<java.awt.geom.Line2D.Double> mlines11
//        , Vector<java.awt.geom.Line2D.Double> mlines12
//        , int N, double[][] cos, double[][] sin, double[] newdata
//        , double[] fdata1, Map<String, String> cache_bz, Map<String, String> cache_sj
//        , Vector<java.lang.Double> forOutput, Graphics graphics, int type, App NE) {
//        double[] newdata1 = newdata;
//        newdata1 = U_A.PEU.P.wave.Median.median1d(newdata1, 0.0);
//        double bili[] = Proportion_X_newYwithoutBound.newYwithoutBound(newdata1, 0.002);
//        double max = MaxAndMin_X_max_v.max_abs_v(bili);
//        double bili0[] = bili;
//        if (max >= 2 && 0 == type) {
//            bili0 = U_A.PEU.P.wave.Guassian.guassian1d(bili0);
//            bili0 = Proportion_X_newXYBest.newXYBiliWithSameWidth(bili0, 1024.0, 65.0);
//            lines.clear();
//            for (int i = 0; i < bili0.length; i++) {
//                lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
//            }
//            mainPaint.paint(soundWaveJPanelNew.getGraphics(), bili0, forOutput, NE);
//        } else if (1 == type) {
//            bili0 = U_A.PEU.P.wave.Guassian.guassian1d(bili0);
//            bili0 = Proportion_X_newXYBest.newXYBiliWithSameWidth(bili0, 1024.0, 100.0);
//            lines.clear();
//            for (int i = 0; i < bili0.length; i++) {
//                lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
//            }
//            mainPaint.paint(soundWaveJPanelNew.getGraphics(), bili0, forOutput, NE);
//        } else {
//            bili0 = Proportion_X_newXY.newXY(bili0, 1024.0, 100.0);
//            lines.clear();
//            for (int i = 0; i < bili0.length; i++) {
//                lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
//            }
//            //mainPaint.paint(soundWaveJPanelNew.getGraphics(), lines, forOutput);//later
//            mlines1.clear();
//            mlines2.clear();
//            mlines3.clear();
//            mlines4.clear();
//            mlines5.clear();
//            mlines6.clear();
//            mlines7.clear();
//            mlines8.clear();
//            mlines9.clear();
//            return "";
//        }
//        //离散余弦
//        double[] df = bili0.clone();
//        DFT dFT = new DFT();
//        dFT.IV_(1024);
//        double[] dftk = dFT.ft(df);
//        //mainPaint.erazer1(mlines1);
//        render(dftk, mlines1, null, mainPaint);
//        //mainPaint.paint1(mlines1);
//        //
//        double[] dcf = bili0.clone();
//        double[] dfctk = dFT.fct(dcf);
//        //mainPaint.erazer4(mlines4);
//        render(dfctk, mlines4, null, mainPaint);
//        //mainPaint.paint4(mlines4);
//        //库里图基快速傅立叶
//        double[] ff = new double[bili0.length];
//        int ffd = 0;
//        for (double d : bili0) {
//            ff[ffd++] = d;
//        }
//        double[] ftk = fFT.jnifft(ff);
//        //mainPaint.erazer2(mlines2);
//        double[] ftkD = new double[ftk.length];
//        ffd = 0;
//        for (double d : ftk) {
//            ftkD[ffd++] = d;
//        }
//        render(ftkD, mlines2, null, mainPaint);
//        //mainPaint.paint2(mlines2);
//        //虚构空间
//        LYGAFDCTDFFT lYGAFDCTDFFT = new LYGAFDCTDFFT();
//        double[] fit = bili0.clone();
//        LYGAFDCTDFFT.cp[] out = new LYGAFDCTDFFT.cp[bili0.length];
//        double[] fitk = new LYGAFDCTDFFT().jniLYGFIT(fit, out, 4);
//        //mainPaint.erazer3(mlines3);
//        render(fitk, mlines3, null, mainPaint);
//        //mainPaint.paint3(mlines3);
//        //噪音诃
//        double[] ffn = bili0.clone();
//        double[] fntk = new LYGAFDCTDFFT().jniLYGFLTn(ffn, out, 4);
//        //mainPaint.erazer5(mlines5);
//        render(fntk, mlines5, null, mainPaint);
//        //mainPaint.paint5(mlines5);
//        //希尔伯特虚度漂移
//        double[] ffl = bili0.clone();
//        lYGAFDCTDFFT.initk();
//        double[] flntk = lYGAFDCTDFFT.jniLYGFLTln(ffl);
//        flntk[0] = 0.0;
//        flntk[1] = 0.0;
//        flntk[2] = 0.0;
//        flntk[3] = 0.0;
//        //mainPaint.erazer6(mlines6);
//        render(flntk, mlines6, null, mainPaint);
//        //mainPaint.paint6(mlines6);
//        //虚度空间
//        double[] flt = bili0.clone();
//        double[] fltk = new LYGAFDCTDFFT().jniLYGFLT(flt, out, 4);
//        //mainPaint.erazer7(mlines7);
//        render(fltk, mlines7, null, mainPaint);
//        //mainPaint.paint7(mlines7);
//        //
//        double[] fllt = bili0.clone();
//        double[] flltk = new LYGAFDCTDFFT().jniLYGFLLT(fllt);
//        flltk[0] = 0.0;
//        flltk[1] = 0.0;
//        flltk[2] = 0.0;
//        flltk[3] = 0.0;
//        //mainPaint.erazer10(mlines10);
//        render(flltk, mlines10, null, mainPaint);
//        //mainPaint.paint10(mlines10);
//        //时能虚空
//        double[] fet = bili0.clone();
//        double[] fetk = new LYGAFDCTDFFT().jniLYGFET(fet);
//        fetk[0] = 0.0;
//        fetk[1] = 0.0;
//        fetk[2] = 0.0;
//        fetk[3] = 0.0;
//        //mainPaint.erazer8(mlines8);
//        render(fetk, mlines8, null, mainPaint);
//        //mainPaint.paint8(mlines8);
//        //薛定谔虚度漂移
//        double[] fxet = bili0.clone();
//        double[] fxetk = new LYGAFDCTDFFT().jniLYGFxET(fxet, out, 4);
//        //mainPaint.erazer11(mlines11);
//        render(fxetk, mlines11, null, mainPaint);
//        mainPaint.paint11(mlines11);
//        //分阶虚空
//        double[] filt = bili0.clone();
//        double[] filtk = lYGAFDCTDFFT.jniLYGFILT(filt);
//        filtk[0] = 0.0;
//        filtk[1] = 0.0;
//        filtk[2] = 0.0;
//        filtk[3] = 0.0;
//        //mainPaint.erazer9(mlines9);
//        render(filtk, mlines9, null, mainPaint);
//        mainPaint.paint9(mlines9);
//        return "";
//    }
//
//    public void render(double[] dftk, Vector<java.awt.geom.Line2D.Double> mlines2
//        , Vector<java.awt.geom.Line2D.Double> mlines5, SoundWavePanelVectorNew mainPaint) {
//        double bili1k[] = dftk;//infi and din set 0 later～ yaoguangluo
//        double caijian2k[] = U_A.PEU.P.wave.Tailor.caiJian1(dftk
//            , 0.0, (double) (dftk.length >> 2));//64
//        //傅里叶
//        bili1k = Proportion_X_newXY.newXY(caijian2k, 256.0, 100.0);
//        bili1k = Quantification_X_liangHuaEqualDelete.liangHuaEqualDelete(bili1k);
//        double bili2k[] = Proportion_X_newXYBest.newXYBest(caijian2k, 256.0, 100.0);
//        mlines2.clear();
//        for (int i = 0; i < bili1k.length; i++) {
//            //bili2k[i] = null == bili2k[i] ? 0 : bili2k[i];
//            mlines2.add(new Line2D.Double(i, bili2k[i], i, bili2k[i]));
//        }
//        double guassian3k[] = U_A.PEU.P.wave.Median.median1d(bili2k, 3.0);
//        guassian3k = U_A.PEU.P.wave.Guassian.guassian1d(bili2k);
//        double bili3k[] = Proportion_X_newXY.newXY(guassian3k, 256.0, 100.0);
//        if (null != mlines5) {
//            mlines5.clear();
//            for (int i = 0; i < bili3k.length; i++) {
//                //bili3k[i] = null == bili3k[i] ? 0 : bili3k[i];
//                mlines5.add(new Line2D.Double(i, bili3k[i], i, bili3k[i]));
//            }
//        }
//    }
//}
