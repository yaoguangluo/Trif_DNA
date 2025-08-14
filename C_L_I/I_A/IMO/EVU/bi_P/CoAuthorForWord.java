package I_A.IMO.EVU.bi_P;

import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.slider.DetaSlider;
import exception.thread.DetaThread;
import Q_V.OSI.AOP.MEC.SIQ.search.ZhongYaoSearch;
import S_A.SVQ.stable.S_Maps;
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
import com.jogamp.opengl.util.GLBuffers;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Iterator;
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
public class CoAuthorForWord extends CoAuthorForWord_XCDX implements GLEventListener {
    public CoAuthorForWord(App NE) throws HeadlessException {
//		System.load("/Users/joe/chilkatJava/libchilkat.jnilib");
//		System.loadLibrary();
        DetaThread.sleepDeta(100);
        rootWord = "";
        rootLeaf = new IMV_SIQ();
        findLeaf = new IMV_SIQ();
        frequencyLeaf = new IMV_SIQ();
        didLeaf = new IMV_SIQ();
        this._A = NE.app_S._A;
        this.pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        this.u = NE.app_S;
        this.setLayout(null);
        DetaThread.sleepDeta(100);
        GLProfile glp = GLProfile.getDefault();
        GLCapabilities glcap = new GLCapabilities(glp);
        canvas = new GLCanvas(glcap);
        canvas.addGLEventListener(this);
        canvas.addMouseListener(this);
        DetaThread.sleepDeta(100);
        canvas.addMouseMotionListener(this);
        canvas.addKeyListener(this);
        canvas.addMouseWheelListener(this);
        canvas.setBounds(0, 0, 618, 350 - 50 - 30 - 20);//3d cavas
        DetaThread.sleepDeta(100);
        this.add(canvas);
        animator = new FPSAnimator(canvas, 24, true);
        centerWindow(this);
        animator.start();
        DetaThread.sleepDeta(100);
        sliderx = new DetaSlider(0, 360);
        sliderx.setSnapToTicks(true);
        sliderx.setPaintTicks(true);
        sliderx.setMajorTickSpacing(20);
        sliderx.setMinorTickSpacing(5);
        sliderx.addChangeListener(
            event -> {
                JSlider source = (JSlider) event.getSource();
                xrot = source.getValue();
            });
        DetaThread.sleepDeta(100);
        slidery = new DetaSlider(0, 360);
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
        DetaThread.sleepDeta(100);
        sliderz = new DetaSlider(0, 360);
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
        DetaThread.sleepDeta(100);
        slidert = new DetaSlider(1, 21);
        slidert.setSnapToTicks(true);
        slidert.setPaintTicks(true);
        slidert.setMajorTickSpacing(20);
        slidert.setMinorTickSpacing(1);
        slidert.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    irot = source.getValue();
                }
            });
        top = new DetaButton("上", 100, 50, Color.pink);
        top.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    brot += 0.5;
                }
            });
        down = new DetaButton("下", 100, 50, Color.orange);
        down.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    brot -= 0.5;
                }
            });
        left = new DetaButton("左", 100, 50, Color.pink);
        left.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    lrot -= 0.5;
                }
            });
        right = new DetaButton("右", 100, 50, Color.green);
        right.addActionListener(
            e -> lrot += 0.5);
        bhl = new DetaButton("功效森林", 100, 50, Color.pink);
        bhl.addActionListener(
            e -> {
                String searchYaos = u.coAuthorForWord.bootFlowerForest(rootWord, true, NE);
                ZhongYaoSearch.zhongYaoSearch(u, searchYaos, "", searchYaos, NE);
            });
        cfc = new DetaButton("属性植株", 100, 50, Color.orange);
        cfc.addActionListener(
            e -> {
                bootClassificationMap(rootWord, true, NE);
                ZhongYaoSearch.zhongYaoSearch(u, u.key, "", u.key, NE);
            });
        whh = new DetaButton("禁忌森林", 200, 50, Color.magenta);
        whh.addActionListener(
            e -> {
                String searchYaos = u.coAuthorForWord.bootFlowerSea(rootWord, true, NE);
                ZhongYaoSearch.zhongYaoSearch(u, searchYaos, "", searchYaos, NE);
            });
        rst = new DetaButton("重置", 200, 50, Color.pink);
        rst.addActionListener(
            e -> {
                hook = !hook;
                if (null == jframe) {
                    u.coAuthorForWord.canvas.setSize(900, 750);
                    jframe = new JFrame("药物观测");
                    jframe.setLayout(null);
                    jframe.setSize(900, 750);
                    jframe.setVisible(false);
                    jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                }
                //拿出来
                if (hook) {
                    animator.stop();
                    DetaThread.sleepDeta(200);
                    u.coAuthorForWord.canvas.setSize(900, 750);
                    DetaThread.sleepDeta(200);
                    jframe.add(u.coAuthorForWord.canvas);
                    DetaThread.sleepDeta(200);
                    jframe.setVisible(true);
                    u.coAuthorForWord.canvas.validate();
                    DetaThread.sleepDeta(200);
                    u.coAuthorForWord.validate();
                    DetaThread.sleepDeta(200);
                    jframe.validate();
                    DetaThread.sleepDeta(200);
                    animator.start();
                    DetaThread.sleepDeta(1200);
                    //semaphone问题被我hook解决了.
                } else {
                    animator.stop();
                    DetaThread.sleepDeta(200);
                    u.coAuthorForWord.canvas.setSize(618, 350 - 50 - 30 - 20);
                    DetaThread.sleepDeta(200);
                    u.coAuthorForWord.add(u.coAuthorForWord.canvas);
                    DetaThread.sleepDeta(200);
                    jframe.setVisible(false);
                    DetaThread.sleepDeta(200);
                    u.coAuthorForWord.canvas.validate();
                    DetaThread.sleepDeta(200);
                    u.coAuthorForWord.validate();
                    DetaThread.sleepDeta(200);
                    u.coAuthorForWord.xrot = 1.0f;
                    u.coAuthorForWord.yrot = 1.0f;
                    u.coAuthorForWord.zrot = 1.0f;
                    u.coAuthorForWord.trot = 1.0f;
                    u.coAuthorForWord.prot = 1.0f;
                    u.coAuthorForWord.lrot = -28.0f;
                    u.coAuthorForWord.brot = -1.5f;
                    u.coAuthorForWord.irot = 18.0f;
                    u.coAuthorForWord.srot = 0.7f;
                    DetaThread.sleepDeta(200);
                    animator.start();
                    DetaThread.sleepDeta(1200);
                    //semaphone问题被我hook解决了.
                }
            });
        save = new DetaButton("保存", 200, 50, Color.green);
        //	rst.setBounds(0, 0, 100, 20);
        save.addActionListener(e -> {
            xrotr = xrot;
            yrotr = yrot;
            zrotr = zrot;
            trotr = trot;
            protr = prot;
            lrotr = lrot;
            brotr = brot;
            irotr = irot;
            srotr = srot;
        });
        load = new DetaButton("读取", 200, 50, Color.magenta);
        //	rst.setBounds(0, 0, 100, 20);
        load.addActionListener(
            e -> {
                xrot = xrotr;
                yrot = yrotr;
                zrot = zrotr;
                trot = trotr;
                prot = protr;
                lrot = lrotr;
                brot = brotr;
                irot = irotr;
                srot = srotr;
            });
        buttonBox.add(top);
        buttonBox.add(down);
        buttonBox.add(left);
        DetaThread.sleepDeta(100);
        buttonBox.add(right);
        buttonBox.add(whh);
        buttonBox.add(bhl);
        buttonBox.add(cfc);
        buttonBox1.add(rst);
        buttonBox1.add(save);
        buttonBox1.add(load);
        Box buttonBoxX = new Box(BoxLayout.X_AXIS);
        JButton xzb = new DetaButton("X坐标", 200, 50, Color.pink);
        buttonBoxX.add(xzb);
        buttonBoxX.add(sliderx);
        sliderBoxx1.add(buttonBoxX);

        Box buttonBoxY = new Box(BoxLayout.X_AXIS);
        JButton yzb = new DetaButton("Y坐标", 200, 50, Color.pink);
        buttonBoxY.add(yzb);
        buttonBoxY.add(slidery);
        sliderBoxx1.add(buttonBoxY);

        Box buttonBoxZ = new Box(BoxLayout.X_AXIS);
        JButton zzb = new DetaButton("Z坐标", 200, 50, Color.pink);
        buttonBoxZ.add(zzb);
        buttonBoxZ.add(sliderz);
        sliderBoxx2.add(buttonBoxZ);

        Box buttonBoxT = new Box(BoxLayout.X_AXIS);
        JButton tzb = new DetaButton("T坐标", 200, 50, Color.pink);
        buttonBoxT.add(tzb);
        buttonBoxT.add(slidert);
        sliderBoxx2.add(buttonBoxT);
        sliderBox.add(sliderBoxx1);
        sliderBox.add(sliderBoxx2);
        sliderBox.add(buttonBox);
        sliderBox.add(buttonBox1);
        sliderBox.setBounds(0, 350 - 50 - 30 - 20, 627 - 10, 300 - 50);//3d
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
//		glut = new GLUT();
        DetaThread.sleepDeta(100);
//		gl.glEnable(GL.GL_TEXTURE_2D);
//		gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MIN_FILTER, gl.GL_LINEAR);
//		gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MAG_FILTER, gl.GL_NEAREST);
        DetaThread.sleepDeta(100);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glDepthFunc(GL.GL_LEQUAL);
        gl.glShadeModel(GL2.GL_SMOOTH);
        DetaThread.sleepDeta(100);
        gl.glClearColor(0f, 0f, 0f, 0f);
        gl.glHint(gl.GL_PERSPECTIVE_CORRECTION_HINT, gl.GL_NICEST);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        section = new int[21];
        section[0] = 32;
        section[1] = 32;
        section[2] = 32;
        section[3] = 32;
        section[4] = 10;
        section[5] = 10;
        section[6] = 10;
        section[7] = 10;
        section[8] = 10;
        section[9] = 10;
        section[10] = 10;
        section[11] = 10;
    }

    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        //gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glTranslatef(lrot, brot, -36.0f);
        gl.glRotatef(xrot, 1, 0.0f, 0.0f);
        gl.glRotatef(yrot, 0.0f, 1, 0.0f);
        gl.glRotatef(zrot, 0.0f, 0.0f, 1);
        gl.glPointSize(prot);
        gl.glOrtho(0, trot, 0, trot, 1, -1);
        float a = 10;
        double root[] = new double[3];
        for (int i = 0; i < root.length; i++) {
            root[i] = 0.0;
        }
        didLeaf.clear();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glBegin(GL.GL_TRIANGLES);
        drawWords(gl, section, 0, root, a, 0, 0, this.rootLeaf, didLeaf);
        gl.glEnd();
        gl.glFlush();
    }

    @SuppressWarnings({"unchecked", "static-access"})
    private void drawWords(GL2 gl, int[] s, int se, double[] root, float a, int j
        , int k, IMV_SIQ root3, Map<String, Integer> didLeaf) {
        DetaThread.sleepDeta(3);
        if (root3 == null || root3.size() == 0) {
            return;
        }
        int i = 0;
        s[se] = root3.size() > (int) irot ? (int) irot : root3.size();
        Iterator<String> iteratorLeaf = root3.keySet().iterator();
        Here:
        while (iteratorLeaf.hasNext()) {
            if (k >= 78) {
                return;
            }
            double a1 = 1.0;
            String leafName = iteratorLeaf.next();
            if (leafName.length() == 0) {
                continue Here;
            }
            int type = 0;
            IMV_SIQ leaf = (IMV_SIQ) root3.get(leafName);
            if (leaf.size() > 0) {
                a1 = 1.0;
            }
            k++;
            if (k > 25) {
                return;
            }
            if (se < 2) {
                if (leafName.equalsIgnoreCase("功能")
                    || leafName.equalsIgnoreCase("引起")
                    || leafName.equalsIgnoreCase("缺乏")
                    || leafName.equalsIgnoreCase("作用")
                    || leafName.equalsIgnoreCase("组成")
                    || leafName.equalsIgnoreCase("输出")
                    || leafName.equalsIgnoreCase("各种")
                    || leafName.equalsIgnoreCase("引起")
                    || leafName.equalsIgnoreCase("意义")
                    || leafName.equalsIgnoreCase("传导")
                    || leafName.equalsIgnoreCase("手术")
                    || leafName.equalsIgnoreCase("性性")
                    || leafName.equalsIgnoreCase("药物")
                    || leafName.equalsIgnoreCase("过量")
                    || leafName.equalsIgnoreCase("时可")
                    || leafName.equalsIgnoreCase("治疗")
                    || leafName.equalsIgnoreCase("预防")
                    || leafName.equalsIgnoreCase("注射")
                    || leafName.equalsIgnoreCase("应用")
                    || leafName.equalsIgnoreCase("适用")
                    || leafName.equalsIgnoreCase("适用于")
                    || leafName.equalsIgnoreCase("适应")) {
                    continue Here;
                }
            }
            int freq = -1;
            if (frequencyLeaf.containsKey(leafName)) {
                freq = frequencyLeaf.get(leafName);
            }
            if ((se < 2) || (se == 3) || (se == 2 && zybc == 1 && (freq == -1))
                || (se == 2 && (freq >= u.leafrot))) {
                gl.glBegin(gl.GL_LINES);
                if (j % 7 == 0) {
                    gl.glColor3f(0, 0, 255);
                }
                if (j % 7 == 1) {
                    gl.glColor3f(0, 255, 0);
                }
                if (j % 7 == 2) {
                    gl.glColor3f(255, 0, 0);
                }
                if (j % 7 == 3) {
                    gl.glColor3f(255, 0, 255);
                }
                if (j % 7 == 4) {
                    gl.glColor3f(255, 255, 0);
                }
                if (j % 7 == 5) {
                    gl.glColor3f(255, 255, 255);
                }
                if (j % 7 == 6) {
                    gl.glColor3f(0, 255, 255);
                }
                gl.glVertex3d(root[0], root[1], root[2]);
                gl.glVertex3d(root[0] + Math.cos((2 * Math.PI / s[se]) * i) * a
                    , root[1] + Math.sin((2 * Math.PI / s[se]) * i) * a
                    , root[2] + (srot * a1));
                gl.glEnd();
                gl.glColor3f(0, 0, 255);
                gl.glRasterPos3d(root[0] + Math.cos((2 * Math.PI / s[se]) * i) * a
                    , root[1] + Math.sin((2 * Math.PI / s[se]) * i) * a
                    , root[2] + (srot * a1));
                String prePrint = leafName;
                prePrint = prePrint.substring(0, prePrint.length() > 20
                    ? 20 : prePrint.length());
                Font font = new Font(prePrint, 20, 20);
                try {
                    checkImageBuf = GLBuffers.newDirectByteBuffer(20
                        * prePrint.length() * 22 * 3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                BufferedImage image = new BufferedImage(prePrint.length() * 32
                    , 20, BufferedImage.TYPE_INT_RGB);
                Graphics2D ga = image.createGraphics();
                ga.setColor(Color.white);
                if (pos.containsKey(leafName)) {
                    if (S_Maps.mingCi.containsKey(leafName)) {
                        ga.setColor(new Color(255, 125, 255));
                        type = 1;
                    }
                    if (S_Maps.dongCi.containsKey(leafName)) {
                        ga.setColor(new Color(125, 255, 125));
                    }
                    if (S_Maps.xingRongCi.containsKey(leafName)) {
                        ga.setColor(new Color(255, 255, 125));
                    }
                    if (S_Maps.weiCi.containsKey(leafName)) {
                        ga.setColor(new Color(125, 125, 255));
                    }
                }
                int AMV_MVS_VSQX = 1;
                int AMV_MVS_VSQY = 17;
                this.weightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
                this.heightPrint(prePrint, ga, AMV_MVS_VSQX, AMV_MVS_VSQY, font);
                checkImageBuf.clear();
                int h = image.getHeight();
                for (int i1 = h - 1; i1 >= 0; i1--) {
                    for (int j1 = 0; j1 < prePrint.length() * 20; j1++) {
                        checkImageBuf.put((byte) (image.getRGB(j1, i1) & (byte) 0xFF));
                        checkImageBuf.put((byte) (image.getRGB(j1, i1) >> 8 & (byte) 0xFF));
                        checkImageBuf.put((byte) (image.getRGB(j1, i1) >> 16 & (byte) 0xFF));
                    }
                }
                checkImageBuf.rewind();
                try {
                    gl.glDrawPixels(prePrint.length() * 20, 20, GL2.GL_RGB
                        , GL.GL_UNSIGNED_BYTE, checkImageBuf);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("2");
                }
                double root1[] = new double[3];
                for (int regi = 0; regi < root1.length; regi++) {
                    root1[regi] = 0.0;
                }
                root1[0] = root[0] + Math.cos((2 * Math.PI / s[se]) * i) * a;
                root1[1] = root[1] + Math.sin((2 * Math.PI / s[se]) * i) * a;
                root1[2] = root[2] + (srot * a1);
                if (!didLeaf.containsKey(leafName) && findLeaf.containsKey(leafName)) {
                    didLeaf.put(leafName, 1);
                    if (type == 1) {
                        if (zynk == 0) {
                            drawWords(gl, s, se + 1, root1
                                , a * 0.5f, j + i, k, leaf, didLeaf);
                        } else {
                            drawWords(gl, s, se + 1, root1
                                , a * 0.36f, j + i, k, leaf, didLeaf);
                        }
                    } else {
                        drawWords(gl, s, se + 1, root1
                            , a * 0.5f, j + i, k, leaf, didLeaf);
                    }
                }
            }
            i++;
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

    public static void main(String[] args) throws HeadlessException {
        CoAuthorForWord app = new CoAuthorForWord(new App());//later
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
}
//372 //        int section[] = new int[21];
////        section[0] = 32;
////        section[1] = 32;
////        section[2] = 32;
////        section[3] = 32;
////        section[4] = 10;
////        section[5] = 10;
////        section[6] = 10;
////        section[7] = 10;
////        section[8] = 10;
////        section[9] = 10;
////        section[10] = 10;
////        section[11] = 10;