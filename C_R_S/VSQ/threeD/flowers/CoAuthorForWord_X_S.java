package VSQ.threeD.flowers;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import V_A.VSQ.OPE.jogl.JOGLOBJShape;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.GLBuffers;
import com.jogamp.opengl.util.gl2.GLUT;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

//BSOS-metabolics2025later
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("serial")
public class CoAuthorForWord_X_S extends JPanel {
    public ByteBuffer checkImageBuf = GLBuffers.newDirectByteBuffer(20 * 100 * 3);
    public IMV_SIQ rootClassMap = new IMV_SIQ();

    public Boolean clicked = false;
    public int mousex = 0;
    public int mousey = 0;
    public Map<String, String> pos;
    public LinkedHashMap<String, Object> rootLeaf = new LinkedHashMap<>();

    public Map<String, Integer> findLeaf;
    public Map<String, Integer> frequencyLeaf;
    public Map<String, Integer> didLeaf;
    public App u;
    public IMV_SIQ dic_li;
    public IMV_SIQ dic_yl;
    public CogsBinaryForest_AE _A;
    public int c = 0;
    public double t = 1.0d;
    public String rootWord;

    public FPSAnimator animator = null;
    public ChangeListener listener;
    public Box sliderBoxx1 = new Box(BoxLayout.X_AXIS);
    public Box sliderBoxx2 = new Box(BoxLayout.X_AXIS);
    public Box sliderBox = new Box(BoxLayout.Y_AXIS);
    public Box sliderBoxRight = new Box(BoxLayout.Y_AXIS);
    public Box buttonBox = new Box(BoxLayout.X_AXIS);
    public JSlider sliderx;
    public JSlider slidery;
    public JSlider sliderz;
    public JSlider slidert;
    public JButton top;
    public JButton down;
    public JButton left;
    public JButton right;
    public JButton bhl;
    public JButton cfc;
    public JButton whh;
    public JButton rst;
    public JButton save;
    public JButton load;
    public ImageIcon bagua_xun = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_xun_png, "DetaResources/xlx/");
    public ImageIcon bagua_li = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_li_png, "DetaResources/xlx/");
    public ImageIcon bagua_kun = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_kun_png, "DetaResources/xlx/");
    public ImageIcon bagua_dui = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_dui_png, "DetaResources/xlx/");
    public ImageIcon bagua_qian = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_qian_png, "DetaResources/xlx/");
    public ImageIcon bagua_kan = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_kan_png, "DetaResources/xlx/");
    public ImageIcon bagua_gen = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_gen_png, "DetaResources/xlx/");
    public ImageIcon bagua_zhen = FastReadProjectFile.getDetaImageIconReader(
        S_File.bg_zhen_png, "DetaResources/xlx/");
    public GL2 gl;
    public GLU glu;
    public GLUT glut;

    public float xrot = 0.0f;
    public float yrot = 0.0f;
    public float zrot = 360.0f;
    public float trot = 5.4f;
    public float prot = 1.0f;
    public float lrot = -1.5f;
    public float brot = -0.5f;
    public float irot = 78.0f;//indexed leafs
    public float srot = 0.7f;
    public float xrotr = 0.0f;
    public float yrotr = 0.0f;
    public float zrotr = 0.0f;
    public float trotr = 0.0f;
    public float protr = 0.0f;
    public float lrotr = 0.0f;
    public float brotr = 0.0f;
    public float irotr = 0.0f;
    public float srotr = 0.0f;
    public float rotFangDa = 0.0f;
    public float rotSuoXiao = 0.0f;
    public float rotShunLiu = 0.0f;
    public float rotNiLiu = 0.0f;
    //later in dynamic array。。
    public JSlider sliderFangDa;
    public JButton buttonFangDa;

    public JSlider sliderSuoXiao;
    public JButton buttonSuoXiao;

    public JSlider sliderShunLiu;
    public JButton buttonShunLiu;

    public JSlider sliderNiLiu;
    public JButton buttonNiLiu;


    public JSlider sliderSanJiao;
    public JSlider sliderSanJiaoZ;
    public JButton buttonSanJiao;

    public JSlider sliderBaGang;
    public JSlider sliderBaGangZ;
    public JButton buttonBaGang;

    public JSlider sliderBaYou;
    public JSlider sliderBaYouZ;
    public JButton buttonBaYou;


    public JSlider sliderYuanJi;
    public JSlider sliderYuanJiZ;
    public JButton buttonYuanJi;

    public JSlider sliderShuangYuan;
    public JSlider sliderShuangYuanZ;
    public JButton buttonShuangYuan;

    public JSlider sliderJingLuo;
    public JSlider sliderJingLuoZ;
    public JButton buttonJingLuo;

    public JSlider sliderHeLuo;
    public JSlider sliderHeLuoZ;
    public JButton buttonHeLuo;

    public JSlider sliderLiuRen;
    public JSlider sliderLiuRenZ;
    public JButton buttonLiuRen;

    public JSlider sliderLiuZhu;
    public JSlider sliderLiuZhuZ;
    public JButton buttonLiuZhu;

    public JSlider sliderTianXing;
    public JSlider sliderTianXingZ;
    public JButton buttonTianXing;

    public JSlider sliderYiShu;
    public JSlider sliderYiShuZ;
    public JButton buttonYiShu;

    public JSlider sliderZiWu;
    public JSlider sliderZiWuZ;
    public JButton buttonZiWu;

    public JSlider sliderKanYu;
    public JSlider sliderKanYuZ;
    public JButton buttonKanYu;

    public JSlider sliderWuXing;
    public JSlider sliderWuXingZ;
    public JButton buttonWuXing;

    public JSlider sliderJieQi;
    public JSlider sliderJieQiZ;
    public JButton buttonJieQi;

    public JSlider sliderJingYi;
    public JSlider sliderJingYiZ;
    public JButton buttonJingYi;

    public JSlider sliderQuDu;
    public JSlider sliderQuDuZ;
    public JButton buttonQuDu;
    //稍后缩进
    public JSlider sliderXianWei;
    public JSlider sliderXianWeiZ;
    public JButton buttonXianWei;

    public JSlider sliderXueWei;
    public JSlider sliderXueWeiZ;
    public JButton buttonXueWei;

    public JSlider slider_six;
    public JSlider slider_sixZ;
    public JButton button_six;

    //稍后单例类缩进优化
    public JSlider slider_seven;
    public JSlider slider_sevenZ;
    public JButton button_seven;

    public JSlider slider_five;
    public JSlider slider_fiveZ;
    public JButton button_five;

    public JSlider sliderYinWei;
    public JSlider sliderYinWeiZ;
    public JButton buttonYinWei;

    public ByteBuffer buffer;
    public int[][] g;
    public JOGLOBJShape shape = null;
}
//43  //   public List<IMV_SIQ> rootLeafList = new ArrayList<>();
////    public IMV_SIQ rootLeafWuXing;
////    public IMV_SIQ rootLeafYuanJi;
////    public IMV_SIQ rootLeafShuangYuan;
////    public IMV_SIQ rootLeafBaYou;
////    public IMV_SIQ rootLeafJingLuo;
////    public IMV_SIQ rootLeafZiWu;
////    public IMV_SIQ rootLeafLiuZhu;
////    public IMV_SIQ rootLeafJieQi;
////    public IMV_SIQ rootLeafBaGang;
////    public IMV_SIQ rootLeafKanYu;
////    public IMV_SIQ rootLeafLiuRen;
////    public IMV_SIQ rootLeafYiShu;
////    public IMV_SIQ rootLeafTianXing;
////    public IMV_SIQ rootLeafJingYi;
////    public IMV_SIQ rootLeafHeLuo;
////    public IMV_SIQ rootLeafSanJiao;

//    public float[] whiteLight = {0.2f, 0.2f, 0.2f, 1.0f};
//    public float sourceLight[] = {0.8f, 0.8f, 0.8f, 1.0f};
//    public float lightPos[] = {0.0f, 0.0f, 0.0f, 1.0f};
//    public float moveshape = 0.0f;
//    public float fEarthRot = 0.0f;