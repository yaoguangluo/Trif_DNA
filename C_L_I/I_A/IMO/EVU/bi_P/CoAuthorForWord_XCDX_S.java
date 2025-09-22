package I_A.IMO.EVU.bi_P;
import ME.VPC.S.ne.App_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import S_A.pheromone.IMV_SIQ;
import V_A.VSQ.OPE.jogl.JOGLOBJShape;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.GLBuffers;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import java.nio.ByteBuffer;
import java.util.Map;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于gleem J3D官方demo 来写的。
public class CoAuthorForWord_XCDX_S extends JPanel {
    
    public String rootWord;
    public ByteBuffer checkImageBuf = GLBuffers.newDirectByteBuffer(20 * 100 * 3);
    public boolean hook = false;
    public Boolean clicked = false;
    public int c = 0;
    public int mousex = 0;
    public int mousey = 0;
    public int zynk = 0;
    public int zybc = 0;
    public int needChange = 0;
    public int[][] g;
    public int section[];
    //public float whiteLight[] = {0.2f, 0.2f, 0.2f, 1.0f};
    // public float sourceLight[] = {0.8f, 0.8f, 0.8f, 1.0f};
    //public float lightPos[] = {0.0f, 0.0f, 0.0f, 1.0f};
    public float prot = 1.0f;
    public float lrot = -28.0f;
    public float brot = -1.5f;
    public float irot = 18.0f;
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
    public float moveshape = 0.0f;
    public float fEarthRot = 0.0f;
    public float xrot = 1.0f;
    public float yrot = 1.0f;
    public float zrot = 1.0f;
    public float trot = 1.0f;
    public double t = 1.0d;
    public String prevSearchString = "";
    //ui action
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

    public JSlider sliderx;
    public JSlider slidery;
    public JSlider sliderz;
    public JSlider slidert;
    public Box sliderBoxx1 = new Box(BoxLayout.X_AXIS);
    public Box sliderBoxx2 = new Box(BoxLayout.X_AXIS);
    public Box sliderBox = new Box(BoxLayout.Y_AXIS);
    public Box buttonBox = new Box(BoxLayout.X_AXIS);
    public Box buttonBox1 = new Box(BoxLayout.X_AXIS);
    public ChangeListener listener;
    //util
    public Map<String, Integer> didLeaf;
    public IMV_SIQ dic_li;
    public IMV_SIQ dic_yl;
    public IMV_SIQ rootLeaf;

    public IMV_SIQ pos;
    public Map<String, Integer> findLeaf;
    public Map<String, Integer> frequencyLeaf;
    //native
    public JOGLOBJShape shape = null;
    public GLCanvas canvas;
    public ByteBuffer buffer;
    public GL2 gl;
    public GLU glu;
    //public GLUT glut;
    public FPSAnimator animator = null;
    //3d continuing object
    public App_S u;
    public CogsBinaryForest_AE _A;
    public JFrame jframe;
}
