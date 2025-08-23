package I_A.IMO.EVU.bi_P;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import V_A.VSQ.OPE.jogl.JOGLOBJShape;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于gleem J3D官方demo 来写的。

public class CoAuthor extends JPanel implements GLEventListener {
    public IMV_SIQ root;
    public Map<String, Integer> findLeaf;
    public IMV_SIQ dic_li;
    public CogsBinaryForest_AE _A;
    public int c = 0;
    public int[] array;
    
    public FPSAnimator animator = null;
    ChangeListener listener;
    Box sliderBox = new Box(BoxLayout.Y_AXIS);
    Box buttonBox = new Box(BoxLayout.X_AXIS);
    JSlider sliderx;
    JSlider slidery;
    JSlider sliderz;
    JSlider slidert;
    JButton top;
    JButton down;
    JButton left;
    JButton right;
    GL2 gl;
    GLU glu;
    GLUT glut;
    float whiteLight[] = {0.2f, 0.2f, 0.2f, 1.0f};
    float sourceLight[] = {0.8f, 0.8f, 0.8f, 1.0f};
    float lightPos[] = {0.0f, 0.0f, 0.0f, 1.0f};
    float moveshape = 0.0f;
    float fEarthRot = 0.0f;
    float xrot = 0.0f;
    float yrot = 0.0f;
    float zrot = 0.0f;
    float trot = 0.0f;
    float lrot = -2.0f;
    float brot = 0.0f;
    ByteBuffer buffer;
    int[][] g;
    JOGLOBJShape shape = null;
    public double t = 1.0d;
    public String rootWord;

    // timeCheck ch=new timeCheck();
    public CoAuthor(IMV_SIQ dic_li, App NE) throws HeadlessException {
        this._A = NE.app_S._A;
        this.dic_li = dic_li;
        this.setLayout(null);
        GLProfile glp = GLProfile.getDefault();
        GLCapabilities glcaps = new GLCapabilities(glp);
        GLCanvas canvas = new GLCanvas(glcaps);
        canvas.addGLEventListener(this);
        canvas.setBounds(0, 0, 610, 370);
        this.add(canvas);
        animator = new FPSAnimator(canvas, 32, true);
        centerWindow(this);
        animator.start();
        sliderx = new JSlider(0, 360);
        sliderx.setSnapToTicks(true);
        sliderx.setPaintTicks(true);
        sliderx.setMajorTickSpacing(20);
        sliderx.setMinorTickSpacing(5);
        sliderx.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    xrot = source.getValue();
                }
            });
        slidery = new JSlider(0, 360);
        slidery.setSnapToTicks(true);
        slidery.setPaintTicks(true);
        slidery.setMajorTickSpacing(20);
        slidery.setMinorTickSpacing(5);
        slidery.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    yrot = source.getValue();
                }
            });
        sliderz = new JSlider(0, 360);
        sliderz.setSnapToTicks(true);
        sliderz.setPaintTicks(true);
        sliderz.setMajorTickSpacing(20);
        sliderz.setMinorTickSpacing(5);
        sliderz.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    zrot = source.getValue();
                }

            });
        slidert = new JSlider(1, 50);
        slidert.setSnapToTicks(true);
        slidert.setPaintTicks(true);
        slidert.setMajorTickSpacing(20);
        slidert.setMinorTickSpacing(1);
        slidert.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    trot = source.getValue();
                }
            });
        top = new JButton("top");
        top.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    brot += 0.5;
                }
            });
        down = new JButton("down");
        down.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    brot -= 0.5;
                }
            });
        left = new JButton("left");
        left.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    lrot -= 0.5;
                }
            });
        right = new JButton("right");
        right.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    lrot += 0.5;
                }
            });
        buttonBox.add(top);
        buttonBox.add(down);
        buttonBox.add(left);
        buttonBox.add(right);
        sliderBox.add(sliderx);
        sliderBox.add(slidery);
        sliderBox.add(sliderz);
        sliderBox.add(slidert);
        sliderBox.add(buttonBox);
        sliderBox.setBounds(0, 370, 610, 700);
        add(sliderBox);
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
        glut = new GLUT();
        gl.glEnable(GL.GL_TEXTURE_2D);
        gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MIN_FILTER, gl.GL_LINEAR);
        gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MAG_FILTER, gl.GL_NEAREST);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glDepthFunc(GL.GL_LEQUAL);
        gl.glShadeModel(GL2.GL_SMOOTH);
        gl.glClearColor(0f, 0f, 0f, 0f);                        // The Type Of Depth Testing To Do
        gl.glHint(gl.GL_PERSPECTIVE_CORRECTION_HINT, gl.GL_NICEST);

        //20230106-System.out.println("error");
        array = arrayInit();
    }

    private static int[] arrayInit() {
        int[] array = new int[100];
        java.util.Random r = new java.util.Random();
        for (int i = 100, j = 0; i > 0; i--, j++) {
            array[j] = r.nextInt(100);
        }
        return array;
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(lrot, brot, -6.0f); // translate left and into the screen
        gl.glRotatef(xrot, 1.0f, 0.0f, 0.0f);                     // Rotate On The X Axis
        gl.glRotatef(yrot, 0.0f, 1.0f, 0.0f);                     // Rotate On The Y Axis
        gl.glRotatef(zrot, 0.0f, 0.0f, 1.0f);
        gl.glPointSize(1);
        gl.glOrtho(0, //left
            trot,  //right
            0, //bottom
            trot, //top
            1, -1);
        double section[] = new double[12];
        section[0] = 5.0;
        section[1] = 6.0;
        section[2] = 3.0;
        section[3] = 3.0;
        section[4] = 3.0;
        section[5] = 3.0;
        section[6] = 3.0;
        section[7] = 3.0;
        section[8] = 3.0;
        section[9] = 3.0;
        section[10] = 3.0;
        section[11] = 3.0;

        int a = 25;
        double root[] = new double[3];
        double pation = section[0] * section[1];
        int m = array[0];
        int l = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
            if (array[i] < l) {
                l = array[i];
            }
        }
        double bina = m / pation;
        draw(section, 0, root, a, 0, 0, bina);
        gl.glEnd();
        gl.glFlush();
    }

    @SuppressWarnings("static-access")
    private void draw(double[] s, int se, double[] root, int a, int j, int k, double bina) {
        if (se < s.length) {
            for (int i = 1; i <= s[se]; i++) {
                gl.glBegin(gl.GL_LINES);
                gl.glColor3f(0, 0, 255);
                gl.glVertex3d(root[0], root[1], root[2]);
                gl.glVertex3d(root[0] + Math.cos(2 * Math.PI * i / s[se]) * a
                    , root[1] + Math.sin(2 * Math.PI * i / s[se]) * a, root[2] + 1);
                gl.glEnd();
                gl.glColor3f(0, 0, 255);
                gl.glRasterPos3d(root[0] + Math.cos(2 * Math.PI * i / s[se]) * a
                    , root[1] + Math.sin(2 * Math.PI * i / s[se]) * a, root[2] + 1);
                glut.glutBitmapString(GLUT.BITMAP_HELVETICA_12, (i) + "yaoguangluo");
                double root1[] = new double[3];
                root1[0] = root[0] + Math.cos(2 * Math.PI * i / s[se]) * a;
                root1[1] = root[1] + Math.sin(2 * Math.PI * i / s[se]) * a;
                root1[2] = root[2] + 1;
                j = i;
                k = se;
                draw(s, se + 1, root1, a / 2, j, k, bina);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= bina * j * s[k - 1] && array[i] > bina * (j - 1) * s[k - 1]) {
                    gl.glBegin(gl.GL_LINES);
                    gl.glColor3f(0, 255, 0);
                    gl.glVertex3d(root[0], root[1], root[2]);
                    gl.glVertex3d(root[0] + Math.cos(2 * Math.PI * i / 180) * a, root[1]
                        + Math.sin(2 * Math.PI * i / 180) * a, root[2] + 1);
                    gl.glEnd();
                    gl.glColor3f(255, 0, 0);
                    gl.glRasterPos3d(root[0] + Math.cos(2 * Math.PI * i / 180) * a, root[1]
                        + Math.sin(2 * Math.PI * i / 180) * a, root[2] + 1);
                    glut.glutBitmapString(GLUT.BITMAP_HELVETICA_12, (i) + "yaoguangluo");
                }
            }
        }
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        float fAspect;
        if (height == 0) {
            height = 1;
        }
        gl.glViewport(0, 0, width, height);
        fAspect = (float) width / height;
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(53.0f, fAspect, 1.0, 400.0);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void dispose(GLAutoDrawable arg0) {
    }

    public static void main(String[] args) {
        App NE = new App();
        CoAuthor app = new CoAuthor(null, NE);
        app.setSize(850, 700);
        app.setVisible(true);
        JFrame f = new JFrame();
        f.add(app);
        f.setTitle("ButtonDemo");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(650, 700);
        f.setVisible(true);
    }

    public void bootWordmap(String string, App NE) {
        rootWord = string;
        root = new IMV_SIQ();
        findLeaf = new ConcurrentHashMap<String, Integer>();
        IMV_SIQ leaf = new IMV_SIQ();
        kerner(rootWord, leaf, findLeaf, NE);
        root.put(rootWord, leaf);
    }

    private void kerner(String temp, IMV_SIQ root, Map<String, Integer> findLeaf, App NE) {
        if (dic_li.containsKey(temp)) {
            IMV_SIQ leaf = new IMV_SIQ();
            IMV_SIQ_SS map = _A.parserMixStringByReturnFrequencyMap(dic_li.get(rootWord).toString(), NE);
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String tempRec = it.next();
                if (!findLeaf.containsKey(tempRec)) {
                    findLeaf.put(tempRec, 1);
                    kerner(tempRec, leaf, findLeaf, NE);
                } else {
                    findLeaf.put(tempRec, findLeaf.get(tempRec) + 1);
                }
            }
            root.put(temp, leaf);
        }
    }
} 
