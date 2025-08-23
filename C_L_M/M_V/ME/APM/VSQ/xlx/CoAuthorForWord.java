package M_V.ME.APM.VSQ.xlx;

import ME.VPC.M.app.App;
import exception.thread.DetaThread;
import S_A.pheromone.IMV_SIQ;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.util.LinkedHashMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class CoAuthorForWord extends CoAuthorForWord_Q implements MouseMotionListener
    , MouseListener, MouseWheelListener, KeyListener, GLEventListener {
    

    public CoAuthorForWord(App NE) throws HeadlessException {
        DetaThread.sleepDeta(100);
        rootWord = "";
        rootLeaf = new LinkedHashMap<String, Object>();
        findLeaf = new IMV_SIQ();
        frequencyLeaf = new IMV_SIQ();
        didLeaf = new IMV_SIQ();
        this._A = NE.app_S._A;
        this.pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        this.u = NE;
        this.setLayout(null);
        DetaThread.sleepDeta(100);
        GLProfile glp = GLProfile.getDefault();
        GLCapabilities glcaps = new GLCapabilities(glp);
        GLCanvas canvas = new GLCanvas(glcaps);
        canvas.addGLEventListener(this);
        canvas.addMouseListener(this);
        DetaThread.sleepDeta(100);
        canvas.addMouseMotionListener(this);
        canvas.addKeyListener(this);
        canvas.addMouseWheelListener(this);
        canvas.setBounds(0, 0, 718, 660);
        DetaThread.sleepDeta(100);
        this.add(canvas);
        animator = new FPSAnimator(canvas, 24, true);
        centerWindow(this);
        animator.start();
        DetaThread.sleepDeta(100);
        add(creatOperationsBox());
        add(creatSlidersBox());
    }

    private void centerWindow(Component frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.width > screenSize.width)
            frameSize.width = screenSize.width;
        if (frameSize.height > screenSize.height)
            frameSize.height = screenSize.height;
        frame.setLocation((screenSize.width - frameSize.width) >> 1,
                (screenSize.height - frameSize.height) >> 1);
    }

    @SuppressWarnings("static-access")
    public void init(GLAutoDrawable drawable) {
        gl = drawable.getGL().getGL2();
        glu = new GLU();
        //glut= new GLUT();
        DetaThread.sleepDeta(100);
        DetaThread.sleepDeta(100);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glDepthFunc(GL.GL_LEQUAL);
        gl.glShadeModel(GL2.GL_SMOOTH);
        DetaThread.sleepDeta(100);
        gl.glClearColor(0f, 0f, 0f, 0f);
        gl.glHint(gl.GL_PERSPECTIVE_CORRECTION_HINT, gl.GL_NICEST);
    }

    public static void main(String[] args) throws HeadlessException {
        App NE= new App();
        CoAuthorForWord app = new CoAuthorForWord(NE);
        app.setSize(850, 500);
        app.setVisible(true);
        JFrame f = new JFrame();
        f.add(app);
        f.setTitle("ButtonDemo");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(650, 480);
        f.setVisible(true);
    }
}