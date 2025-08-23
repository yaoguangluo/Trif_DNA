package bi_P;

import ME.VPC.S.ne.App_S;
import C_A.ME.analysis.C.A;
import S_A.pheromone.IMV_SIQ;
import V_A.VSQ.OPE.jogl.JOGLOBJShape;
import OSI.MSU.AVQ.ASQ.dnaSets.CMS;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.GLBuffers;
import com.jogamp.opengl.util.gl2.GLUT;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
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

public class CoDNAAuthorForWord_X_S extends JPanel {
    public float xrot = 18.0f;
    public float yrot = 2.0f;
    public float zrot = 1.0f;
    public float trot = 6.0f;
    public float prot = 1.0f;
    public float lrot = -3.5f;
    public float brot = 1.0f;
    public float irot = 78.0f;
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
    public double t = 1.0d;

    public Boolean clicked = false;
    public int mousex = 0;
    public int mousey = 0;
    public int zynk = 0;
    public int zybc = 0;
    public int c = 0;
    public String rootWord;//later..
    public IMV_SIQ pos;
    public Map<String, Integer> findLeaf;
    public Map<String, Integer> frequencyLeaf;
    public Map<String, Integer> didLeaf;
    public IMV_SIQ dic_li;
    public IMV_SIQ dic_yl;
    public IMV_SIQ rootLeaf;
    public App_S u;
    public A _A;

    public Box sliderBoxx1 = new Box(BoxLayout.X_AXIS);
    public Box sliderBoxx2 = new Box(BoxLayout.X_AXIS);
    public Box sliderBox = new Box(BoxLayout.Y_AXIS);
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

    public GL2 gl;
    public GLU glu;
    public GLUT glut;
    public ByteBuffer buffer;
    public ByteBuffer checkImageBuf = GLBuffers.newDirectByteBuffer(20 * 100 * 3);

    //public ByteBuffer checkImageBuf= ByteBuffer.allocate(20 * 100 * 3);
    public FPSAnimator animator = null;
    public ChangeListener listener;
    public JOGLOBJShape shape = null;
    public CMS cms;
}
//	public int needChange= 0;
//	int[][] g;
//
//	public String prevSearchString= "";
//	float[] whiteLight = {0.2f, 0.2f, 0.2f, 1.0f};
//	float[] sourceLight = {0.8f, 0.8f, 0.8f, 1.0f};
//	float[] lightPos = {0.0f, 0.0f, 0.0f, 1.0f};
//	float moveshape= 0.0f;
//	float fEarthRot= 0.0f;
//