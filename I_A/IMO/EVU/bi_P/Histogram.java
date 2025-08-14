package I_A.IMO.EVU.bi_P;

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
import javax.swing.event.ChangeListener;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.nio.ByteBuffer;
//import parserProcessor.timeCheck;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于gleem J3D官方demo 来写的。
public class Histogram extends JPanel implements GLEventListener {  	
	public int c=0;
	public int []array;

    static FPSAnimator animator=null;  
    ChangeListener listener; 
    Box sliderBox= new Box(BoxLayout.Y_AXIS);  
    Box buttonBox= new Box(BoxLayout.X_AXIS);  
    JSlider  sliderx;
    JSlider  slidery;
    JSlider  sliderz;
    JSlider  slidert;
    JButton top;
    JButton down;
    JButton left;
    JButton right;   
    GL2 gl;  
    GLU glu;  
    GLUT glut;  
    float whiteLight[]= {0.2f, 0.2f, 0.2f, 1.0f};
    float sourceLight[]= {0.8f, 0.8f, 0.8f, 1.0f};
    float lightPos[]= {0.0f, 0.0f, 0.0f, 1.0f};
    float moveshape= 0.0f;  
    float fEarthRot= 0.0f; 
    float xrot= 0.0f;  
    float yrot= 0.0f;  
    float zrot= 0.0f;  
    float trot= 0.0f;  
    float lrot= -2.0f; 
    float brot= 0.0f; 
    ByteBuffer buffer;
    int[][] g;
    JOGLOBJShape shape=null;
    public double t= 1.0d;
    //timeCheck ch=new timeCheck();    
    public Histogram() throws HeadlessException  {  
    	this.setLayout(null);
        GLProfile glp= GLProfile.getDefault();
        GLCapabilities glcaps=new GLCapabilities(glp);      
        GLCanvas canvas=new GLCanvas(glcaps);  
        canvas.addGLEventListener(this);  
        canvas.setBounds(0, 0, 500, 500);
        this.add(canvas);  
        animator=new FPSAnimator(canvas, 60, true);
        centerWindow(this); 
        animator.start();
        sliderx= new JSlider(0, 360);
        sliderx.setSnapToTicks(true);  
        sliderx.setPaintTicks(true);  
        sliderx.setMajorTickSpacing(20);  
        sliderx.setMinorTickSpacing(5);  
        sliderx.addChangeListener(
					event -> {
							JSlider source= (JSlider) event.getSource();
							xrot= source.getValue();
					});
        slidery= new JSlider(0, 360);
        slidery.setSnapToTicks(true);  
        slidery.setPaintTicks(true);  
        slidery.setMajorTickSpacing(20);  
        slidery.setMinorTickSpacing(5);  
        slidery.addChangeListener(
					event -> {
							JSlider source= (JSlider) event.getSource();
							yrot= source.getValue();
					});
        sliderz= new JSlider(0, 360);
        sliderz.setSnapToTicks(true);  
        sliderz.setPaintTicks(true);  
        sliderz.setMajorTickSpacing(20);  
        sliderz.setMinorTickSpacing(5);  
        sliderz.addChangeListener(
					event -> {
							JSlider source= (JSlider) event.getSource();
							zrot= source.getValue();
					});
        
        slidert= new JSlider(1, 50);
        slidert.setSnapToTicks(true);  
        slidert.setPaintTicks(true);  
        slidert.setMajorTickSpacing(20);  
        slidert.setMinorTickSpacing(1);  
        slidert.addChangeListener(
					event -> {
							JSlider source= (JSlider) event.getSource();
							trot= source.getValue();
					});
        
        top  = new JButton("top");
        top.addActionListener(
					e -> brot+=0.5);
        
        down = new JButton("down");
        down.addActionListener(
					e -> brot-=0.5);
        
        left = new JButton("left");
        left.addActionListener(
					e -> lrot-=0.5);
        
        right= new JButton("right");
        right.addActionListener(
					e -> lrot+=0.5);
        
        buttonBox.add(top);
        buttonBox.add(down);
        buttonBox.add(left);
        buttonBox.add(right);
        
        sliderBox.add(sliderx);
        sliderBox.add(slidery);
        sliderBox.add(sliderz);
        sliderBox.add(slidert);
        sliderBox.add(buttonBox);
        sliderBox.setBounds(0, 500, 500, 700);
        add(sliderBox);
    }     
    private void centerWindow(Component frame) {
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension frameSize= frame.getSize();  
        if (frameSize.width > screenSize.width)  
            frameSize.width= screenSize.width;  
        if (frameSize.height > screenSize.height)  
            frameSize.height= screenSize.height;  
        frame.setLocation((screenSize.width - frameSize.width) >> 1,
                (screenSize.height - frameSize.height) >> 1);  
    }  
    @SuppressWarnings("static-access")
	public void init(GLAutoDrawable drawable)  {  
        gl=  drawable.getGL().getGL2();    
        glu= new GLU();  
        glut= new GLUT();       
        gl.glEnable(GL.GL_TEXTURE_2D);
        gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MIN_FILTER, gl.GL_LINEAR);
        gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MAG_FILTER, gl.GL_NEAREST);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glDepthFunc(GL.GL_LEQUAL);
        gl.glShadeModel(GL2.GL_SMOOTH);
        gl.glClearColor(0f, 0f, 0f, 0f);  // The Type Of Depth Testing To Do
        gl.glHint(gl.GL_PERSPECTIVE_CORRECTION_HINT, gl.GL_NICEST);
 
		//20230106-System.out.println("error");
		array=arrayInit(); 
    }  
    
    
    private static int[] arrayInit()  {	
		int[] array=new int[12];	
		java.util.Random r=new java.util.Random(); 
		for(int i=12, j=0;i>0;i--, j++)
		{
			array[j]=r.nextInt(3);
		}
		
		return array;
	}
    
    @SuppressWarnings("static-access")
	public void display(GLAutoDrawable drawable)  {  
     	GL2 gl= drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(lrot, brot, -6.0f); // translate left and into the screen
        gl.glRotatef(xrot, 1.0f, 0.0f, 0.0f);                     // Rotate On The X Axis
        gl.glRotatef(yrot, 0.0f, 1.0f, 0.0f);                     // Rotate On The Y Axis
        gl.glRotatef(zrot, 0.0f, 0.0f, 1.0f);
        gl.glPointSize(1);
        
      //  glu.gluLookAt(0, 0, 0, 2, 2, 2, 2, 2, 2);

        gl.glOrtho(0, //left
        		trot,  //right
        	       0, //bottom
        	       trot, //top
        		   1, -1);
        
       // gl.glBegin(GL.GL_POINTS);
// 
        int a[][]=new int[12][3];
        int x= 0;
        for(int i=0;i<x;i++){
      	  for(int j=0;j<3;j++)	{
      		  	
      		    gl.glBegin(gl.GL_POLYGON);
      			gl.glColor3f(0, 0, 255);
      		    gl.glVertex3d(i*0.7+0.0, j*0.7+0.0, a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.0, a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2, a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.0, j*0.7+0.2, a[i*j][0]*0.05);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      			gl.glColor3f(0, 0, 255);
      		    gl.glVertex3d(i*0.7+0.00, j*0.7+0.00, a[i*j][0]*0.05+0.5);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.00, a[i*j][0]*0.05+0.5);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2, a[i*j][0]*0.05+0.5);
    		    gl.glVertex3d(i*0.7+0.0, j*0.7+0.2, a[i*j][0]*0.05+0.5);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      			gl.glColor3f(0, 0, 255);
      		    gl.glVertex3d(i*0.7+0.0, j*0.7+0.0 , a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.0 , a[i*j][0]*0.05);
      			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.0 , a[i*j][0]*0.05+0.5);
      			gl.glVertex3d(i*0.7+0.0 , j*0.7+0.0 , a[i*j][0]*0.05+0.5);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
    			gl.glColor3f(0, 0, 255);
    		    gl.glVertex3d(i*0.7+0.0, j*0.7+0.2 , a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2 , a[i*j][0]*0.05);
    			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.2 , a[i*j][0]*0.05+0.5);
    			gl.glVertex3d(i*0.7+0.0 , j*0.7+0.2 , a[i*j][0]*0.05+0.5);
    		    gl.glEnd();
    		    
      		    gl.glBegin(gl.GL_QUADS);
      			gl.glColor3f(0, 0, 255);
      		    gl.glVertex3d(i*0.7+0.0, j*0.7+0.0 , a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.0, j*0.7+0.2 , a[i*j][0]*0.05);
      			gl.glVertex3d(i*0.7+0.0 , j*0.7+0.2 , a[i*j][0]*0.05+0.5);
      			gl.glVertex3d(i*0.7+0.0 , j*0.7+0.0 , a[i*j][0]*0.05+0.5);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
    			gl.glColor3f(0, 0, 255);
    		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.0 , a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2 , a[i*j][0]*0.05);
    			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.2 , a[i*j][0]*0.05+0.5);
    			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.0 , a[i*j][0]*0.05+0.5);
    		    gl.glEnd();

      		    gl.glBegin(gl.GL_POLYGON);
      			gl.glColor3f(0, 255, 0);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2, a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.2, a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4, a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.4, a[i*j][0]*0.05);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      		    gl.glColor3f(0, 255, 0);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2, a[i*j][0]*0.05+1.5);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.2, a[i*j][0]*0.05+1.5);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4, a[i*j][0]*0.05+1.5);
    		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.4, a[i*j][0]*0.05+1.5);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      		    gl.glColor3f(0, 255, 0);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2 , a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.2 , a[i*j][0]*0.05);
      			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.2 , a[i*j][0]*0.05+1.5);
      			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.2 , a[i*j][0]*0.05+1.5);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      		    gl.glColor3f(0, 255, 0);
    		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.4 , a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4 , a[i*j][0]*0.05);
    			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.4 , a[i*j][0]*0.05+1.5);
    			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.4 , a[i*j][0]*0.05+1.5);
    		    gl.glEnd();
    		    
      		    gl.glBegin(gl.GL_QUADS);
      			gl.glColor3f(0, 255, 0);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.2 , a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.2, j*0.7+0.4 , a[i*j][0]*0.05);
      			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.4 , a[i*j][0]*0.05+1.5);
      			gl.glVertex3d(i*0.7+0.2 , j*0.7+0.2 , a[i*j][0]*0.05+1.5);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
    			gl.glColor3f(0, 255, 0);
    		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.2 , a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4 , a[i*j][0]*0.05);
    			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.4 , a[i*j][0]*0.05+1.5);
    			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.2 , a[i*j][0]*0.05+1.5);
    		    gl.glEnd();
    		       
    		    
      		    gl.glBegin(gl.GL_POLYGON);
      			gl.glColor3f(255, 0, 0);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4, a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.4, a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.6, a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.6, a[i*j][0]*0.05);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      		    gl.glColor3f(255, 0, 0);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4, a[i*j][0]*0.05+1.0);
      		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.4, a[i*j][0]*0.05+1.0);
      		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.6, a[i*j][0]*0.05+1.0);
    		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.6, a[i*j][0]*0.05+1.0);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      		    gl.glColor3f(255, 0, 0);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4 , a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.4 , a[i*j][0]*0.05);
      			gl.glVertex3d(i*0.7+0.6 , j*0.7+0.4 , a[i*j][0]*0.05+1.0);
      			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.4 , a[i*j][0]*0.05+1.0);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
      		    gl.glColor3f(255, 0, 0);
    		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.6 , a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.6 , a[i*j][0]*0.05);
    			gl.glVertex3d(i*0.7+0.6 , j*0.7+0.6 , a[i*j][0]*0.05+1.0);
    			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.6 , a[i*j][0]*0.05+1.0);
    		    gl.glEnd();
    		    
      		    gl.glBegin(gl.GL_QUADS);
      			gl.glColor3f(255, 0, 0);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.4 , a[i*j][0]*0.05);
      		    gl.glVertex3d(i*0.7+0.4, j*0.7+0.6 , a[i*j][0]*0.05);
      			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.6 , a[i*j][0]*0.05+1.0);
      			gl.glVertex3d(i*0.7+0.4 , j*0.7+0.4 , a[i*j][0]*0.05+1.0);
      		    gl.glEnd();
      		    
      		    gl.glBegin(gl.GL_QUADS);
    			gl.glColor3f(255, 0, 0);
    		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.4 , a[i*j][0]*0.05);
    		    gl.glVertex3d(i*0.7+0.6, j*0.7+0.6 , a[i*j][0]*0.05);
    			gl.glVertex3d(i*0.7+0.6 , j*0.7+0.6 , a[i*j][0]*0.05+1.0);
    			gl.glVertex3d(i*0.7+0.6 , j*0.7+0.4 , a[i*j][0]*0.05+1.0);
    		    gl.glEnd();
    		    	    
    		    
      	  	}
        	}
   
  	gl.glEnd();
    gl.glFlush();
   }  
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height)  {
        float fAspect; 
  
        if (height== 0)  {  
            height= 1;  
        }      
        gl.glViewport(0, 0, width, height);
        fAspect= (float) width / height;      
        gl.glMatrixMode(GL2.GL_PROJECTION);  
        gl.glLoadIdentity();       
        glu.gluPerspective(53.0f, fAspect, 1.0, 400.0);
        gl.glMatrixMode(GL2.GL_MODELVIEW);  
        gl.glLoadIdentity();  
    }  
    public void dispose(GLAutoDrawable arg0) {       
    }  
    public static void main(String[] args)  {  
        final Histogram app= new Histogram();  
    	//final OBJTest app= new OBJTest();  
        app.setSize(850, 700);
		app.setVisible(true);
		JFrame f=new JFrame();
		f.add(app);
		f.setTitle("ButtonDemo");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(650, 700);
		f.setVisible(true);
	
    }  
}  
