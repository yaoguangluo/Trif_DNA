package VSQ.ICAQDTVMQVM;

import A_I.MPE.MSU.pde.DecadeToPDS;
import M_V.MVQ.button.DetaButton;
import O_V.OSI.AOP.freetts.thread.read.ReadEnglish;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.Button;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Monitor_X_S {
    public boolean isbt114Stop;
    public boolean isbt121Stop;
    public boolean isbt122Stop;
    public boolean isbt123Stop;
    public boolean isbt124Stop;
    public boolean isbt132Stop;

    public boolean isRedButton = false;
    public boolean isGreenButton = false;
    public boolean isBlueButton = false;
    public boolean isStreButton = false;
    public boolean isSblButton = false;
    public boolean isRcaButton = false;
    public boolean isPcaButton = false;
    public boolean isPcfButton = false;
    public boolean isbt52Stop = false;
    public boolean isbt53Stop = false;
    public boolean isbt60Stop = false;
    public boolean isbt73Stop = false;
    public boolean isbt80Stop = false;
    public boolean isbt81Stop = false;
    public boolean isbt82Stop = false;
    public boolean isbt83Stop = false;
    public boolean isbt62Stop = false;
    public boolean isbt43Stop = false;
    public boolean isbt41Stop = false;
    public boolean isbt88Stop = false;
    public boolean isbt113Stop = false;
    public boolean recordStop = true;
    public boolean isStop = true;
    public boolean lendImage = false;

    public long last = 0;
    public long mi = 0;
    public long newmi = 0;

    public int encry_c = 2;
    public int encry_c_new = 2;
    public int encry_c_fs = 2;

    public int facr = 0;
    public int facg = 0;
    public int facb = 0;

    public int stop = 0;
    public int has = 0;
    public int reg = 0;
    public int facx = 7;
    public int facy = 100;
    public int facz = 50;
    public int fact = 50;
    public int facl = 3;

    public int q = 0;
    public int q_new = 0;
    public int q_fs = 0;
    public int findr = 0;
    public int[][] out;
    public int[][] out_oldr = null;
    public int[][] out_oldg = null;
    public int[][] out_oldb = null;

    public int[][] out_old2r = null;
    public int[][] out_old2g = null;
    public int[][] out_old2b = null;
    public int[][] out_old1 = null;
    public int[][] out_old2 = null;
    public int[][] out_old3 = null;
    public int[][] out_old4 = null;
    public int[][] out_old5 = null;
    public int[][] ccar;
    public int[][] ccag;
    public int[][] ccab;

    public int[][] gdif;
    public int[][] mskr;
    public int[][] mskb;
    public int[][] mskg;
    public int[][] diffg;
    public int[][] diffr;
    public int[][] diffb;
    public int[][] rp;
    public int[][] gp;
    public int[][] bp;
    public int[][] r2r;
    public int[][] r2g;
    public int[][] r2b;
    public int[][] gpcar;
    public int[][] gpcag;
    public int[][] gpcab;

    public int[][] showOCLDr;
    public int[][] showORGNr;
    public int[][] showOCLDg;
    public int[][] showORGNg;
    public int[][] showOCLDb;
    public int[][] showORGNb;

    public int[][][] encry;
    public int[][][] encry_new;
    public int[][][] encry_fs;

    public String time = "";
    public String newtime = "";

    public JSlider sliderx;
    public JSlider sliderz;
    public JSlider slidery;
    public JSlider slidert;
    public JSlider sliderl;
    public JSlider sliderr;
    public JSlider sliderg;
    public JSlider sliderb;

    public JButton btr;
    public JButton btg;
    public JButton btb;

    public JButton bt1;
    public JButton bt2;
    public JButton bt3;
    public JButton bt4;
    public JButton bt5;

    public JButton bt00;
    public JButton bt01;
    public JButton bt02;
    public JButton bt03;

    public JButton bt10;
    public JButton bt11;
    public JButton bt12;
    public JButton bt13;

    public JButton bt20;
    public JButton bt21;
    public JButton bt22;
    public JButton bt23;

    public JButton bt30;
    public JButton bt31;
    public JButton bt32;
    public JButton bt33;

    public JButton bt40;
    public JButton bt41;
    public JButton bt42;
    public JButton bt43;

    public JButton bt50;
    public JButton bt51;
    public JButton bt52;
    public JButton bt53;

    public JButton bt60;
    public JButton bt61;
    public JButton bt62;
    public JButton bt63;

    public JButton bt70;
    public JButton bt71;
    public JButton bt72;
    public JButton bt73;

    public JButton bt80;
    public JButton bt81;
    public JButton bt82;
    public JButton bt83;

    public JButton bt84;
    public JButton bt85;
    public JButton bt86;
    public JButton bt87;

    public JButton bt88;
    public JButton bt89;
    public JButton bt90;
    public JButton bt91;

    public Button btn;
    public DetaButton bt92;

    public DetaButton bt111;
    public DetaButton bt112;
    public DetaButton bt113;
    public DetaButton bt114;

    public DetaButton bt121;
    public DetaButton bt122;
    public DetaButton bt123;
    public DetaButton bt124;

    public DetaButton bt131;
    public DetaButton bt132;
    public DetaButton bt133;
    public DetaButton bt134;

    public DetaButton bt141;
    public DetaButton bt142;
    public DetaButton bt143;
    public DetaButton bt144;

    public DetaButton bt151;
    public DetaButton bt152;
    public DetaButton bt153;
    public DetaButton bt154;

    public Image difImage;
    public Image img;
    public BufferedImage imageForOutput;
    public BufferedImage stopBufferedImage;
    public ReadEnglish readEnglish;

    public DecadeToPDS decadeToPDS = new DecadeToPDS();
    public ArrayList<int[][]> imageList = new ArrayList<>();

    public Box br = new Box(BoxLayout.X_AXIS);
    public Box bg = new Box(BoxLayout.X_AXIS);
    public Box bb = new Box(BoxLayout.X_AXIS);
    public Box sliderBox = new Box(BoxLayout.Y_AXIS);
    public Box buttonBox0 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox1 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox2 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox3 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox4 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox5 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox6 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox7 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox8 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox9 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox10 = new Box(BoxLayout.X_AXIS);
    public Box buttonBox11 = new Box(BoxLayout.X_AXIS);

    public Box b1 = new Box(BoxLayout.X_AXIS);
    public Box b2 = new Box(BoxLayout.X_AXIS);
    public Box b3 = new Box(BoxLayout.X_AXIS);
    public Box b4 = new Box(BoxLayout.X_AXIS);
    public Box b5 = new Box(BoxLayout.X_AXIS);
    public Box b6 = new Box(BoxLayout.X_AXIS);
    public Box b7 = new Box(BoxLayout.X_AXIS);

    public OpenCVFrameGrabber grabber;
    public OpenCVFrameConverter.ToIplImage converter;
    public org.bytedeco.javacv.Frame frame;
    public Java2DFrameConverter paintConverter;
}
//	public int[][] finalEncry;
//	public int[][] finalEncryNew;
//	public int[][] finalEncryFs;

//	public Box buttonBox12= new Box(BoxLayout.X_AXIS);
//	public Box buttonBox13= new Box(BoxLayout.X_AXIS);
//	public Box buttonBox14= new Box(BoxLayout.X_AXIS);
//	public Box buttonBox15= new Box(BoxLayout.X_AXIS);

////
////	public IplImage ipl;
////	public IplImage newcv;
////	public IplImage difcv;
////	public IplImage oldcv;

//	public Map<String, Boolean> eyeShows= new IMV_SIQ();

//	public Image newImage;
//	public Image oldImage;