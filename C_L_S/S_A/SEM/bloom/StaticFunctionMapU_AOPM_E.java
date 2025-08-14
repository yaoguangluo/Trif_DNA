package S_A.SEM.bloom;

import ME.VPC.C.skivvy.MakeContainerZNSZ;
import ME.VPC.M.app.App;
import P.image.Color_P;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.classification.ObjectClassification;
import U_A.PEU.P.combination.ObjectCombination;
import U_A.PEU.P.dna.DNAAuth;
import U_A.PEU.P.dna.StringUtil;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenUtil;
import P.image.CheckRange;
import P.image.Closing;
import U_A.PEU.P.image.ConvexHull;
import U_A.PEU.P.image.ConvexHull.Vertex;
import U_A.PEU.P.image.Dilation;
import P.image.Emboss;
import U_A.PEU.P.image.Erosion;
import P.image.GetMean;
import P.image.Guassian;
import U_A.PEU.P.image.HitAndMiss;
import U_A.PEU.P.image.HoughTransform;
import P.image.Laplacian;
import P.image.Mask;
import P.image.Median;
import P.image.Opening;
import P.image.PrintMoments;
import U_A.PEU.P.image.ReadWritePng;
import P.image.RedRaf;
import P.image.Reflection;
import P.image.Sobel;
import P.image.Strech;
import P.image.Threshold_X_P;
import P.image.Threshold_X_P_Section;
import U_A.PEU.P.matrix.CnnMeasure;
import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;
import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.nlp.DETA_ANN_HMM;
import U_A.PEU.P.nlp.DETA_DNN;
import U_A.PEU.P.table.TableSorterZYNK;
import U_A.PEU.P.time.TimeCheck;
import U_A.PEU.P.wave.Common;
import U_A.PEU.P.wave.DFT;
import U_A.PEU.P.wave.FFT;
import U_A.PEU.P.wave.Laplasian;
import U_A.PEU.P.wave.Shehold;
import U_A.PEU.P.wave.Tailor;
import P.wave.copy.Copy_X_copy1d;
import P.wave.copy.Copy_X_copy1dx2;
import P.wave.copy.Copy_X_copy2d;
import P.wave.maxAndMin.MaxAndMin_X_max_i;
import P.wave.maxAndMin.MaxAndMin_X_max_v;
import P.wave.maxAndMin.MaxAndMin_X_min_i;
import P.wave.maxAndMin.MaxAndMin_X_min_v;
import P.wave.peakStatistic.PeakStatistic_X_fengPaixX;
import P.wave.peakStatistic.PeakStatistic_X_fengPaiyY;
import P.wave.peakStatistic.PeakStatistic_X_fengTong1;
import P.wave.proportion.Proportion_X_newX;
import P.wave.proportion.Proportion_X_newXY;
import P.wave.proportion.Proportion_X_newXYBest;
import P.wave.proportion.Proportion_X_newXYYwithoutBound;
import P.wave.proportion.Proportion_X_newY;
import P.wave.proportion.Proportion_X_newYwithoutBound;
import P.wave.quantification.Quantification_X_liangHuaDengChaAdd;
import P.wave.quantification.Quantification_X_liangHuaDengChaMines;
import P.wave.quantification.Quantification_X_liangHuaEqualDelete;
import P.wave.quantification.Quantification_X_liangHuaXiHua;
import P.wave.quantification.Quantification_X_liangHuaXiHuaHalfSide;
import U_A.PEU.P.zip.BootBackup;
import U_A.PEU.P.zip.GzipUtil;
import U_A.PEU.P.zip.UnZip;
import U_A.PVU.P.image.Filter;

import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

// 著作权人+ 作者= 罗瑶光
//小函数思想与来源, 见详细refer , 和函数的描述文字注释。
// 稍后一一把接口函数主体 实例化。
public class StaticFunctionMapU_AOPM_E implements StaticFunctionMapU_AOPM_C {
    //Cache_M 入选jdk, 略
    public IMV_SIQ annotationMap = new IMV_SIQ();

    //ObjectClassification
    public Map<String, IMV_SIQ> mapClassification(App NE) {
        IMV_SIQ input=NE._I_U.inputMap;
        String[] keywords=NE._I_U.keywords;
        return ObjectClassification.mapClassification(input, keywords);
    }
    ;
    public Map<String, IMV_SIQ> mapClassification2D(App NE) {
        IMV_SIQ input=NE._I_U.inputMap;
        String[] keywords=NE._I_U.keywords;
        return ObjectClassification.mapClassification2D(input, keywords);
    }
    ;// 稍后一一把接口函数主体 实例化。
    public Map<String, String[]> stringClassification2D(App NE) {
        String[] input=NE._I_U.inputStringA;
        String[] keywords=NE._I_U.keywords;
        return ObjectClassification.stringClassification2D(input, keywords);
    }
    ;// 稍后一一把接口函数主体 实例化。
    public Map<String, List<String>> listClassification2D(App NE) {
        List<String> input= NE._I_U.listString;
        String[] keywords= NE._I_U.keywords;
        return ObjectClassification.listClassification2D(input, keywords);
    }
    ;// 稍后一一把接口函数主体 实例化。。。。。。。。下面所有的。
    //ObjectCombination {
    public IMV_SIQ mapCombination(App NE) {
        IMV_SIQ output=NE._I_U.outputMap;
        IMV_SIQ destination=NE._I_U.destinationMap;
        return ObjectCombination.mapCombination(output, destination);
    }
    ;
    public List<Object> listCombination(App NE) {
        List<Object> output=NE._I_U.outputObjectList;
        List<Object> destination=NE._I_U.destination;
        return ObjectCombination.listCombination(output, destination);
    }
    ;
    public int[] intArrayCombination(App NE) {
        int[] output=NE._I_U.outputIntA;
        int[] destination=NE._I_U.destinationA;
        return ObjectCombination.intArrayCombination(output, destination);
    }
    ;
    public double[]  doubleArrayCombination(App NE) {
        double[] output=NE._I_U.outputA;
        double[] destination=NE._I_U.destinationDoubleA;
        return ObjectCombination.doubleArrayCombination(output, destination);
    }
    ;
    public long[] longArrayCombination(App NE) {
        long[] output=NE._I_U.outputLongA;
        long[] destination=NE._I_U.destinationLongA;
        return ObjectCombination.longArrayCombination(output, destination);
    }
    ;
    public float[] floatArrayCombination(App NE) {
        float[] output=NE._I_U.outputFloatA;
        float[] destination=NE._I_U.destinationF;
        return ObjectCombination.floatArrayCombination(output, destination);
    }
    ;
    public String[] StringArrayCombination(App NE) {
        String[] output=NE._I_U.outputStringA;
        String[] destination=NE._I_U.destinationStringA;
        return ObjectCombination.StringArrayCombination(output, destination);
    }
    ;
    public char[] charArrayCombination(App NE) {
        char[] output=NE._I_U.outputCharA;
        char[] destination=NE._I_U.destinationCharA;
        return ObjectCombination.charArrayCombination(output, destination);
    }
    ;
    public byte[] byteArrayCombination(App NE) {
        byte[] output=NE._I_U.outputBytes;
        byte[] destination=NE._I_U.destinationBytes;
        return ObjectCombination.byteArrayCombination(output, destination);
    }
    ;
    public Vector<Object> vectorCombination(App NE) {
        Vector<Object> output=NE._I_U.outputV;
        Vector<Object> destination=NE._I_U.destinationV;
        return ObjectCombination.vectorCombination(output, destination);
    }
    ;
    //DNAAuth {
    public boolean DNAAuthStatusCheckEmailAndPds(App NE) {
        App app=NE._I_U.app;
        AES_QMS_XSD_TIH string=NE._I_U.string;
        IMV_SIQ data=NE._I_U.dataMap;
        return DNAAuth.DNAAuthStatusCheckEmailAndPds(app, string._S_, data);
    }

    ;

    public boolean DNAAuthStatusCheckEmailAndPde(App NE) {
        App app=NE._I_U.app;
        AES_QMS_XSD_TIH string=NE._I_U.string;
        IMV_SIQ data=NE._I_U.dataMap;
        return DNAAuth.DNAAuthStatusCheckEmailAndPde(app, string._S_, data);
    }

    ;
    public boolean DNAAuthStatusCheckEmailAndPassword(App NE) {
        App app=NE._I_U.app;
        AES_QMS_XSD_TIH string=NE._I_U.string;
        IMV_SIQ data=NE._I_U.dataMap;
        return DNAAuth.DNAAuthStatusCheckEmailAndPassword(app.app_S, string._S_, data);
    }

    ;

    public boolean DNAAuthCheck(App NE) {
        App app=NE._I_U.app;
        AES_QMS_XSD_TIH string=NE._I_U.string;
        IMV_SIQ data=NE._I_U.dataMap;
        return DNAAuth.DNAAuthCheck(app, string._S_, data);
    }

    ;

    //StringUtil {
    public String encode(App NE) {
        AES_QMS_XSD_TIH input=NE._I_U.inputString;
        App app=NE._I_U.app;
        AES_QMS_XSD_TIH string=NE._I_U.string;
        IMV_SIQ data=NE._I_U.dataMap;
        return StringUtil.encode(input._S_);
    }
    ;

    public String decode(App NE) {
        AES_QMS_XSD_TIH str=NE._I_U.strV;
        return StringUtil.decode(str._S_);
    }

    ;

    public String EncoderByMd5(App NE) {
        AES_QMS_XSD_TIH salt=NE._I_U.salt;
        AES_QMS_XSD_TIH pwd=NE._I_U.pwd;
        int enctimes=NE._I_U.enctimes;
        try {
            return StringUtil.EncoderByMd5(salt._S_, pwd._S_, enctimes);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String EncoderByDNA(App NE) {
        AES_QMS_XSD_TIH key=NE._I_U.key;
        AES_QMS_XSD_TIH uPassword=NE._I_U.uPassword;
        Token token=NE._I_U.token;
        return StringUtil.EncoderByDNA(key._S_, uPassword._S_, token);
    };

    //TokenUtil {
    public Token getNewTokenFromUsrAndUsrToken(App NE) {
        Usr usr = NE._I_U.usr;
        UsrToken usrToken = NE._I_U.usrToken;
        return TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
    };

    public String getSecondMD5Password(App NE) {
        AES_QMS_XSD_TIH uPassword= NE._I_U.uPassword;
        return TokenUtil.getSecondMD5Password(uPassword._S_);
    };

    public String getFirstMD5Password(App NE) {
        AES_QMS_XSD_TIH key=NE._I_U.key;
        AES_QMS_XSD_TIH uPassword=NE._I_U.uPassword;
        return TokenUtil.getFirstMD5Password(key._S_, uPassword._S_);
    };

    public String getFirstDNAPassword(App NE) {
        AES_QMS_XSD_TIH key=NE._I_U.key;
        AES_QMS_XSD_TIH uPassword=NE._I_U.uPassword;
        Token token=NE._I_U.token;
        return TokenUtil.getFirstDNAPassword(key._S_, uPassword._S_, token);
    };

    public Token getNewTokenFromUsrAndUsrTokenByDNA(App NE) {
        Usr usr=NE._I_U.usr;
        UsrToken usrToken=NE._I_U.usrToken;
        return TokenUtil.getNewTokenFromUsrAndUsrTokenByDNA(usr, usrToken);
    };

    //image
    // CheckRange {
    public int[][] CheckRange_P(App NE) {
        int[][] g=NE._I_U.gM;
        return CheckRange.P(g);
    };

    //Closing {
    public int[][] Closing_P(App NE) {
        int[][] g=NE._I_U.gM;
        int[][] kenel=NE._I_U.kernelM;
        return Closing.P(g, kenel);
    }

    ;

    //Color_P {
    public String Color_P(App NE) {
        int r=NE._I_U.r;
        int g=NE._I_U.g;
        int b=NE._I_U.bInt;
        return Color_P.P(r, g, b);
    };

    //ConvexHull {
    public List<Vertex> convexHull(App NE) {
        List<Vertex> vertices=NE._I_U.vertices;
        return new ConvexHull().convexHull(vertices);
    }

    ;

    public int compareSlope(App NE) {
        int dy2=NE._I_U.dy2;
        int dx2=NE._I_U.dx2;
        int dy1=NE._I_U.dy1;
        int dx1=NE._I_U.dx1;
        return new ConvexHull().compareSlope(dy2, dx2, dy1, dx1);
    }

    ;

    public void PNGWrite(App NE) {
        int[][] g=NE._I_U.gM;
        int pix=NE._I_U.pix;
        AES_QMS_XSD_TIH output=NE._I_U.outputString;
        new ConvexHull().PNGWrite(g, pix, output._S_);
    };

    public void CSVWrite(App NE) {
        int[][] g=NE._I_U.gM;
        int pix=NE._I_U.pix;
        AES_QMS_XSD_TIH outputcsv=NE._I_U.outputcsv;
        new ConvexHull().CSVWrite(g, pix, outputcsv._S_);
    };

    //Dilation{
    public int[][] Dilation_P(App NE) {
        int[][] g=NE._I_U.gM;
        int[][] kernel=NE._I_U.kernelM;
        return new Dilation().P(g, kernel);//later..
    }

    ;

    //Emboss {
    public int[][] Emboss_P(App NE) {
        int[][] g=NE._I_U.gM;
        return Emboss.P(g);
    }

    ;

    //Erosion{
    public int[][] Erosion_P(App NE) {
        int[][] g=NE._I_U.gM;
        int[][] kernel=NE._I_U.kernelM;
        return new Erosion().P(g, kernel);
    }

    ;

    // GetMean {
    public double print_Mean(App NE) {
        int[][] outDIR=NE._I_U.outDIR;
        return GetMean.print_Mean(outDIR);
    }

    ;

    public double print_DoubleMean(App NE) {
        double[][] outDIR= NE._I_U.outDIRM;
        return GetMean.print_Mean(outDIR);
    }

    ;

    //	//Group_O { 稍后把 非个人著作权的几十行踢出去。
    //	public double[] [] GO(int[][] kener, int[][] refG, int[] size){
    //		return null;};

    //Guassian {
    public int[][] Guassian_P_2D(App NE) {
        int[][] g=NE._I_U.gM;
        int d=NE._I_U.d;
        int e=NE._I_U.e;
        double sig=NE._I_U.sig;
        return Guassian.P_2D(g, d, e, sig);
    }

    ;

    public int[][] Guassian_P_1D(App NE) {
        int[][] g=NE._I_U.gM;
        int frection=NE._I_U.frection;
        int kernel=NE._I_U.kernel;
        double sig=NE._I_U.sig;
        return Guassian.P_1D(g, frection, kernel, sig);
    }

    ;

    public BufferedImage Guassian_P(App NE) {
        BufferedImage lygimage=NE._I_U.bufferedImage;
        double d=NE._I_U.dDouble;
        double e=NE._I_U.eDouble;
        double k=NE._I_U.k;
        return Guassian.P(lygimage, d, e, k);
    };

    // HitAndMiss{
    public int[][] HitAndMiss_P(App NE) {
        int[][] g= NE._I_U.gM;
        int pix= NE._I_U.pix;
        int[][] kernel= NE._I_U.kernelM;
        return new HitAndMiss().P(g, pix, kernel);
    };

    //HoughTransform {
    public void HoughTransformLoop(App NE) {
        int[][] g=NE._I_U.gM;
        int pix=NE._I_U.pix;
        int scale=NE._I_U.scale;
        new HoughTransform().HoughTransformLoop(g, pix, scale);
    }

    ;

    public void IV_HTMatrix(App NE) {
        int[][] g=NE._I_U.gM;
        new HoughTransform().IV_HTMatrix(g);
    }

    ;

    //Laplacian {
    public int[][] Laplacian_P(App NE) {
        int[][] g=NE._I_U.gM;
        return Laplacian.P(g);
    }

    ;

    //Mask {
    public int[][] Mask_P(App NE) {
        int[][] mag=NE._I_U.mag;
        int[][] dir=NE._I_U.dir;
        return Mask.P(mag, dir);
    }

    ;

    //Median {
    public int[][] MedianIntArray_P(App NE) {
        int[][] g=NE._I_U.gM;
        int d=NE._I_U.d;
        int e=NE._I_U.e;
        return Median.P(g, d, e);
    }

    ;

    public BufferedImage Median_P(App NE) {
        BufferedImage lygimage=NE._I_U.bufferedImage;
        int d=NE._I_U.d;
        int e=NE._I_U.e;
        return Median.P(lygimage, d, e);
    }

    ;

    //Opening {
    public int[][] Opening_P(App NE) {
        int[][] g=NE._I_U.gM;
        int[][] kernel=NE._I_U.kernelM;
        return Opening.P(g, kernel);
    }

    ;

    //PrintMoments{
    public void PrintCurrent(App NE) {
        int[][] g=NE._I_U.gM;
        int pix=NE._I_U.pix;
        PrintMoments.PrintCurrent(g, pix);
    }

    ;

    //ReadWritePng {
    public void writePNG(App NE) {
        AES_QMS_XSD_TIH args=NE._I_U.argsString;
        int[][] outmag=NE._I_U.outmag;
        new ReadWritePng().writePNG(args._S_, outmag);
    }

    ;

    public void writePNGT(App NE) {
        AES_QMS_XSD_TIH args=NE._I_U.argsString;
        int[][][] outmag=NE._I_U.outmagT;
        new ReadWritePng().writePNG(args._S_, outmag);
    }

    ;

    public int[][] GRNpngReadString(App NE) {
        AES_QMS_XSD_TIH args=NE._I_U.argsString;
        return new ReadWritePng().GRNpngRead(args._S_);
    }

    ;

    public int[][] GRNpngRead(App NE) {
        BufferedImage image=NE._I_U.bufferedImage;
        return new ReadWritePng().GRNpngRead(image);
    }

    ;

    public int[][] REDpngReadString(App NE) {
        AES_QMS_XSD_TIH args=NE._I_U.argsString;
        return new ReadWritePng().REDpngRead(args._S_);
    }

    ;

    public int[][] REDpngRead(App NE) {
        BufferedImage image=NE._I_U.bufferedImage;
        return new ReadWritePng().REDpngRead(image);
    }

    ;

    public int[][] BLUpngReadString(App NE) {
        AES_QMS_XSD_TIH args=NE._I_U.argsString;
        return new ReadWritePng().BLUpngRead(args._S_);
    }

    ;

    public int[][] BLUpngRead(App NE) {
        BufferedImage image=NE._I_U.bufferedImage;
        return new ReadWritePng().BLUpngRead(image);
    }

    ;

    public int[] sizeHW(App NE) {
        AES_QMS_XSD_TIH args=NE._I_U.argsString;
        return new ReadWritePng().sizeHW(args._S_);
    }

    ;

    public BufferedImage createBufferImage(App NE) {
        int[][] r=NE._I_U.rM;
        int[][] g=NE._I_U.gM;
        int[][] b=NE._I_U.bM;
        return new ReadWritePng().createBufferImage(r, g, b);
    }

    ;

    //RedRaf{
    public int[][] smallToNormal(App NE) {
        int r[][]=NE._I_U.rM;
        int s=NE._I_U.s;
        int b=NE._I_U.bInt;
        return RedRaf.smallToNormal(r, s, b);
    }

    ;

    //Reflection {//renhat教授的稍后剔出去
    public int[][] PadImage(App NE) {
        int[][] _image=NE._I_U._image;
        int height=NE._I_U.height;
        int width=NE._I_U.width;
        return Reflection.PadImage(_image, height, width);
    }

    ;

    //RegionGet {
    public void RegionGet(App NE) {
        int[][] g=NE._I_U.gM;
        new U_A.PEU.P.image.RegionGet(g);
    }

    ;

    public void buildGraph(App NE) {
        int[][] g=NE._I_U.gM;
        AES_QMS_XSD_TIH output=NE._I_U.outputString;
        new U_A.PEU.P.image.RegionGet(g).buildGraph(g, output._S_);//写法稍后优化下。罗瑶光
    }

    ;

    //Sobel {
    public int[][] Sobel_P(App NE) {
        int[][] g=NE._I_U.gM;
        int choice=NE._I_U.choice;
        return Sobel.P(g, choice);
    }

    ;

    public int[][] Sobel_P_WithMask(App NE) {
        int[][] g=NE._I_U.gM;
        int choice=NE._I_U.choice;
        //int mask=NE._I_U.mask;
        return Sobel.P_WithMask(g, choice);
    }

    ;

    //Strech {
    public int[][] StrechIntM_P(App NE) {
        int[][] g=NE._I_U.gM;
        double d=NE._I_U.dDouble;
        double e=NE._I_U.eDouble;
        return Strech.P(g, d, e);
    }

    ;

    public BufferedImage Strech_P(App NE) {
        BufferedImage lygimage=NE._I_U.lygimage;
        double d=NE._I_U.dDouble;
        double e=NE._I_U.eDouble;
        return Strech.P(lygimage, d, e);
    }

    ;

    //Threshold {
    public int[][] Threshold_P(App NE) {
        int[][] g=NE._I_U.gM;
        int Td=NE._I_U.Td;
        return Threshold_X_P.P(g, Td);
    }

    ;

    public int[][] Threshold_P_Section(App NE) {
        int[][] g= NE._I_U.gM;
        int Ts= NE._I_U.Ts;
        int Td= NE._I_U.Td;//later
        return Threshold_X_P_Section.P_Section(g, Ts, Td);
    }

    ;

    //	//VtoV{ 移除著作权的 和 u vecs 已经出现的稍后剔除出去。 先注释掉先
    //	public JSONObject XmlToJsonObject(String response){
    //		return null;};
    //	public IMV_SIQ JsonObjectToMap(JSONObject response){
    //		return null;};
    //	public String MapToJsonString(IMV_SIQ response){
    //		return null;};
    //	public String ListToJsonString(List<Object> response){
    //		return null;};
    //	public String ObjectToJsonString(Object response){
    //		return null;};
    //	public IMV_SIQ XmlToMap(String response){
    //		return null;};
    //	public String MapToXml(IMV_SIQ response){
    //		return null;};
    //	public List<Object> JsonArrayToList(JSONArray jobj){
    //		return null;};

    //CnnMeasure{
    public double[][] getCnnMeansure(App NE) {
        double inputs[][]=NE._I_U.inputDoubleM;
        return new CnnMeasure().getCnnMeansure(inputs);
    }

    ;

    //StringUtil { 见我git的 备份描述refer 和 著作申请版本备份refer 都有详细说明
    //md5 官方 注释下, 以后用 dna MD5的作为纪念。 奇怪 还让我eclipse卡死一下刚。
    //	public String encode(String input) {};
    //	public String decode(String str) {};
    //	public String EncoderByMd5(String salt, String pwd, int enctimes)
    //throws NoSuchAlgorithmException
    //{};
    //	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException
    //{};

    //WAVtoLYG{ 以前设计视频的加密很少用。
    public void WAVtoLYG(App NE) {
        AES_QMS_XSD_TIH WAVf=NE._I_U.WAVf;
        AES_QMS_XSD_TIH LYGf=NE._I_U.LYGf;
        new U_A.PEU.P.movie.WAVtoLYG(WAVf._S_, LYGf._S_);
    };

    //LYGFileIO
    public LYGFileIO initWithFFT(App NE) {
        double fft[]=NE._I_U.fftA;
        MakeContainerZNSZ makeContainerZNSZ=NE._I_U.makeContainerZNSZ;
        return new LYGFileIO();//later...
    }

    ;
    //	public void lygRead(String filepath) {//稍后加单例接口
    //		new LYGFileIO().lygRead(filepath);
    //	};
    //	public void lygWrite(String string) {
    //		new LYGFileIO().lygWrite(string);
    //	};
    //	public void IQ_header(RandomAccessFile raf) {
    //		new LYGFileIO().IQ_header(raf);
    //	};
    //	public void IV_ByAudioBytes(AudioFormat af){
    //		new LYGFileIO().IV_ByAudioBytes(af);
    //	};

    //DETA_ANN_HMM {
    public String[][] summingNLP_P(App NE) {
        String[][] inputNLP= NE._I_U.inputNLP;
        return new DETA_ANN_HMM().summing_P(inputNLP);
    }

    //DETA_DNN {
    public String[][] summing_P(App NE) {
        String[][] ann=NE._I_U.ann;
        String[][] rnn=NE._I_U.rnn;
        return new DETA_DNN().summing_P(ann, rnn);
    }

    //sort he search 没有实用价值  见 top5Dsort, 略, 稍后我会把 养疗经的表格search
    // 组件提取出来变成函数。
    //声音滤波发音 略, 不想设计统一接口, 因为涉及武器安防领域, 本人去年承诺过, 不再个人研发,
    //tablesort
    public TableSorterZYNK initATableSorterZYNK(App NE) {
        return new TableSorterZYNK(NE);
    }

    ;

    public TimeCheck initATimeCheck(App NE) {
        return new TimeCheck();
    }

    ;

    //wave
    //Common{
    public double[] zhiShu(App NE) {
        double[] input= NE._I_U.inputsA;
        double scale= NE._I_U.scaleDouble;
        double shehold= NE._I_U.shehold;
        return Common.zhiShu(input, scale, shehold);
    };
    //Copy{
    public double[][] copy2d(App NE) {
        double[][] input=NE._I_U.inputDoubleM;
        double scale=NE._I_U.scaleDouble;
        return Copy_X_copy2d.copy2d(input, scale);
    };

    public double[] copy1d(App NE) {
        double[] input=NE._I_U.inputsA;
        double scale=NE._I_U.scaleDouble;
        return Copy_X_copy1d.copy1d(input, scale);
    };

    public double[] copy1dx2(App NE) {
        double[] input= NE._I_U.inputsA;
        double scale= NE._I_U.scaleDouble;
        return Copy_X_copy1dx2.copy1dx2(input, scale);
    };

    //DFT
    public void initADFT(App NE) {
        new DFT(); //稍后设计成传参。
    };

    //FFT
    public void initAFFT(App NE) {
        new FFT(); //稍后设计成传参。
    }
;

    //Guassian{
    public double[] guassian1d(App NE) {
        double[] input=NE._I_U.inputsA;
        double scale=NE._I_U.scaleDouble;
        return U_A.PEU.P.wave.Guassian.guassian1d(input);
    };

    //Laplasian{
    public double[] laplasian1d(App NE) {
        double[] input=NE._I_U.inputsA;
        double scale=NE._I_U.scaleDouble;
        return new Laplasian().laplasian1d(input, scale);
    }

    ;

    //MaxAndMin{
    public double max_v(App NE) {
        double[] input= NE._I_U.inputsA;
        return MaxAndMin_X_max_v.max_v(input);
    }

    ;

    public double max_i(App NE) {
        double[] input=NE._I_U.inputsA;
        return MaxAndMin_X_max_i.max_i(input);
    }

    ;

    public double min_v(App NE) {
        double[] input=NE._I_U.inputsA;
        double rank=NE._I_U.rank;
        return MaxAndMin_X_min_v.min_v(input, rank);
    }

    ;

    public double min_i(App NE) {
        double[] input=NE._I_U.inputsA;
        double rank=NE._I_U.rank;
        return MaxAndMin_X_min_i.min_i(input);
    }

    ;

    //Median{
    public double[] median1d(App NE) {
        return U_A.PEU.P.wave.Median.median1d(NE._I_U.inputsA
            , NE._I_U.scaleDouble);
    }

    ;

    //PeakStatistic{
    public double[][] fengTong1D(App NE) {
        double[] input=NE._I_U.inputsA;
        return PeakStatistic_X_fengTong1.fengTong1(input);
    }

    ;

    public double[][] fengPaixX(App NE) {
        double[][] input=NE._I_U.inputDoubleM;
        return PeakStatistic_X_fengPaixX.fengPaixX(input);
    }

    ;

    public double[][] fengPaiyY(App NE) {
        double[][] input=NE._I_U.inputDoubleM;
        return PeakStatistic_X_fengPaiyY.fengPaiyY(input);
    }

    ;

    public double[][] fengPaiXx(App NE) {
        double[][] input=NE._I_U.inputDoubleM;
        return PeakStatistic_X_fengPaixX.fengPaiXx(input);
    }

    ;

    public double[][] fengPaiYy(App NE) {
        double[][] input=NE._I_U.inputDoubleM;
        return PeakStatistic_X_fengPaiyY.fengPaiYy(input);
    }

    ;

    //Proportion{
    public double[] newX(App NE) {
        double[] input=NE._I_U.inputsA;
        double width=NE._I_U.widthDouble;
        return Proportion_X_newX.newX(input, width);
    }

    ;

    public double[] newY(App NE) {
        double[] input= NE._I_U.inputsA;
        double hight= NE._I_U.hight;
        return Proportion_X_newY.newY(input, hight);
    }

    ;

    public double[] newXY(App NE) {
        double[] input=NE._I_U.inputsA;
        double width=NE._I_U.widthDouble;
        double hight=NE._I_U.hight;
        return Proportion_X_newXY.newXY(input, width, hight);
    }

    ;

    public double[]  newXYBest(App NE) {
        double[] input=NE._I_U.inputsA;
        double width=NE._I_U.widthDouble;
        double hight=NE._I_U.hight;
        return Proportion_X_newXYBest.newXYBest(input, width, hight);
    }
    ;

    public double[] newYwithoutBound(App NE) {
        double[] input=NE._I_U.inputsA;
        double hight=NE._I_U.hight;
        return Proportion_X_newYwithoutBound.newYwithoutBound(input, hight);
    }
    ;
    public double[]  newXYYwithoutBound(App NE) {
        double[] input= NE._I_U.inputsA;
        double width= NE._I_U.widthDouble;
        double hight=NE._I_U.hight;
        return Proportion_X_newXYYwithoutBound.newXYYwithoutBound(input, width, hight);
    }

    ;

    //Quantification{
    public double[] liangHuaDengChaAdd(App NE) {
        double[] input= NE._I_U.inputsA;
        double scale= NE._I_U.scaleDouble;
        return Quantification_X_liangHuaDengChaAdd.liangHuaDengChaAdd(input, scale);
    }

    ;

    public double[]  liangHuaXiHua(App NE) {
        double[] input= NE._I_U.inputsA;
        double scale= NE._I_U.scaleDouble;
        return Quantification_X_liangHuaXiHua.liangHuaXiHua(input, scale);
    }

    ;

    public double[]  liangHuaDengChaMines(App NE) {
        double[] input= NE._I_U.inputsA;
        int scale= NE._I_U.scale;
        return Quantification_X_liangHuaDengChaMines.liangHuaDengChaMines(input, scale);
    }

    ;

    public double[] liangHuaEqualDelete(App NE) {
        double[] input= NE._I_U.inputsA;
        return Quantification_X_liangHuaEqualDelete.liangHuaEqualDelete(input);
    };

    public double[] liangHuaXiHuaHalfSide(App NE) {
        double[] input= NE._I_U.inputsA;
        return Quantification_X_liangHuaXiHuaHalfSide.liangHuaXiHuaHalfSide(input);
    };

    //Shehold{
    public double[] shehold1D(App NE) {
        double[] input=NE._I_U.inputsA;
        double scale=NE._I_U.scaleDouble;
        return Shehold.shehold1(input, scale);
    }

    ;

    //Tailor{
    public double[] caiJian1D(App NE) {
        double[] input=NE._I_U.inputsA;
        double left=NE._I_U.leftDouble;
        double right=NE._I_U.rightDouble;
        return Tailor.caiJian1(input, left, right);//函数名称123 结尾稍后优化下。 罗瑶光
    }

    ;

    //UnZip {
    public void unZipWithPath(App NE) {
        AES_QMS_XSD_TIH zipFullPath=NE._I_U.zipFullPath;
        AES_QMS_XSD_TIH zipCategory=NE._I_U.zipCategory;
        UnZip.unZipWithPath(zipFullPath._S_, zipCategory._S_);
    }

    ;

    //BootBackup {
    public void bootBackupByUsingGzip(App NE) {
        AES_QMS_XSD_TIH zipPath=NE._I_U.zipPath;
        BootBackup.bootBackupByUsingGzip(zipPath._S_);
    }

    ;

    //sourceFilePath is a root category of 待压缩的文件目录
    //zipFilePath is a zip category of 压缩的文件目录到
    //fileName is a zip file name
    public boolean fileToZip(App NE) {
        AES_QMS_XSD_TIH sourceFilePath=NE._I_U.sourceFilePath;
        AES_QMS_XSD_TIH zipFilePath=NE._I_U.zipFilePath;
        AES_QMS_XSD_TIH fileName=NE._I_U.fileName;
        return BootBackup.fileToZip(sourceFilePath._S_, zipFilePath._S_, fileName._S_);
    }

    ;

    //GzipUtil {
    // 压缩
    public byte[] compressBytes(App NE) {
        byte[] data=NE._I_U.data;
        return GzipUtil.compress(data);
    }

    ;

    public byte[] compress(App NE) {
        AES_QMS_XSD_TIH str=NE._I_U.strV;
        AES_QMS_XSD_TIH stringTypes=NE._I_U.stringTypes;
        return GzipUtil.compress(str._S_, stringTypes._S_);
    }

    ;

    public byte[] uncompress(App NE) {
        byte[] data=NE._I_U.data;
        return GzipUtil.uncompress(data);
    }

    ;

    //Filter{
    public int[][] P_Heart(App NE) {
        int[][] zuoBiao=NE._I_U.zuoBiao;
        int distance=NE._I_U.distanceScale;
        int scale=NE._I_U.scale;
        return new Filter().P_Heart(zuoBiao, distance, scale);
    }

    ;

    public int[][] P_Model(App NE) {
        int[][] zuoBiao=NE._I_U.zuoBiao;
        int[][] yanjing=NE._I_U.yanjing;
        return new Filter().P_Model(zuoBiao, yanjing);
    }//粗糙版本以后优化。
}

