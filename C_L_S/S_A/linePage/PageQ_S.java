package S_A.linePage;

import I_A.IMS.EUQ.SP.SoundWavePanelVectorNew;
import S_A.pheromone.IMV_SIQ;
import jniFFT.LYGFFT;
import jniLYGAFDCDFFT.LYGAFDCTDFFT;
import jniLYGAFDCDFFT.LYGAFDCTDFFT_F;

import javax.swing.JLabel;
import java.awt.geom.Line2D;
import java.util.Vector;

/*
 * 著作权人，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class PageQ_S {
    public SoundWavePanelVectorNew mainPaint;
    public int sourcePage = 0;//later
    public PageP_M pageP_M;
    public LYGAFDCTDFFT_F lYGAFDCTDFFT_F;
    public boolean registed = false;
    public JLabel idLabelV;
    public JLabel ratioLabelV;
    public JLabel timeLabelV;
    public Line2025 soundWaveJPanelNew;
    public float[] ftkD_record;
    public float[] fit_record;
    public float[] ffn_record;
    public float[] ffl_record;
    public float[] fflA_record;
    public float[] fflBI_record;
    public float[] flt_record;
    public float[] fxet_record;
    public float[] fllt_record;
    public LYGAFDCTDFFT lYGAFDCTDFFT;
    public IMV_SIQ cacheBz;
    public IMV_SIQ cacheSj;
    public Vector<java.lang.Float> forOutput;
    public int n;
    public int type;
    public LYGFFT fFT;
    //
    public int max = 10000;
    public float[] newdata;
    public int count = 0;
    public PageS head = null;
    public PageS tail = null;
    public Vector<Line2D.Double> lines;
}
//19200以上 波特率的gc速度跟不上。避免。
//    public Graphics graphics;
//    public double[][] cos;
//    public double[][] sin;
//    public double[] fet_record;
//    public double[] fdata1;
//    public boolean concurrent = false;

//
//    public Vector<java.awt.geom.Line2D.Double> mlines1 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines2 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines3 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines4 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines5 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines6 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines7 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines8 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines9 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines10 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines11 = new Vector<java.awt.geom.Line2D.Double>();
//    public Vector<java.awt.geom.Line2D.Double> mlines12 = new Vector<java.awt.geom.Line2D.Double>();