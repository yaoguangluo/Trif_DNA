package S_I.OSI.OVQ.OSU.MSQ.MV.SQ.show3D;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.nio.ByteBuffer;
public class test extends JPanel implements GLEventListener {  
	String str=new String("c://playTest//assignment02.png");
	
	static FPSAnimator animator=null;  
	ChangeListener listener; 
	Box sliderBox= new Box(BoxLayout.Y_AXIS);  
	JSlider  sliderx;
	JSlider  slidery;
	JSlider  sliderz;
	// Image3d l2= new Image3d();
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
	ByteBuffer buffer;
	int[][] g;
	public test(int[][] gout) throws HeadlessException {  
		g=gout;
		//super("name"); 
		this.setLayout(null);
		setSize(600, 480);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		GLProfile glp= GLProfile.getDefault();
		GLCapabilities glcaps=new GLCapabilities(glp);          //閼存瑨灏冮懘妤冪槵閼存瑩鍨惧В顓炰紕濡潧鍘介埛姘ｆ噰閸嬫挸鏆橀懘妤?鐎懘娆掑皟閼存绱￠懘娆忕?懞鎺楀灳濮ｎ剦鍎崑顔瑰煑閸愶綇鎷烽懞鎺楀焵椤戣棄濡烽懘娆掑皟閼存銈奸懘娆忕?懞鎺楀灳濮ｎ剦鍎埗鈺嬫嫹閸ㄥ嫯鍓婚柍銉庢枼鎳囬崑鎾诲焺閳锋艾鍙呴幑妤?浼勯妵锝呭暊閿熷?熷壒妤ｈ儻鍓婚崹鍕闁炽儲顕￠鐐蹭紕婵垵鍙呴幑妤?浼勯妷鍐ㄥ幗閳锋埃鎳囬敓钘夊床閼存骞婇懘娆戝?濋懘妤呪攼閼存妾伴懘娆掑皟閼存鎮呴懘娆撳灳濮ｎ厼浼勯敓锟??閿熸枻鎷烽敓鍊熷壒閼卞?熷壔閼肩姾鍓圭弧鎾瑰壔闁炽儙鍐蹭紕閻樺棗鍘介埛姘ｆ噰閿熻棄宕查懘婊堟畷閼存瑨灏冮懘妤佹倕閼存瑩鍨剧含閸嬵喒鍩楅崗鐔叉寣閳垛晪鎷烽崡銏ｅ妧閹搭喛鍓婚懠鐘哄壒闂勫洩鍓婚柍銉︻嚔閸嬵喖澶熼崘锝忔嫹閼存瀚濋懘娆掑皟閼存鎮呴懘娆撳灳濮ｎ厼浼勯悩鍡楀幗椤曠浼勫Λ闈涗紕閻偄鍙呴幑妤?浼勭含閸愶綇鎷烽懞鎺楀焵椤戠姵鎷嬮崗鐔叉寣閳垛晪鎷烽崡銏ｅ壒閹哄疇鍓婚懠鐘哄壒濡よ壈鍓婚柍銉庢枼鎳囬崑鎾诲焺閳锋艾鍟犻敓鍊熷壒濞肩偠鍓婚懠鐘哄壒濡よ壈鍓婚柍銉ヮ潠閳垛晛浜鹃懕鍊熷壔闁炽儲顕㈤崑顕嗘嫹  
		GLCanvas canvas=new GLCanvas(glcaps);  
		canvas.addGLEventListener(this);  
		canvas.setBounds(0, 0, 300, 300);
		//canvas.addMouseListener(listener);  
		//getContentPane().
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
				new ChangeListener() {    
					public void stateChanged(ChangeEvent event) {    
						JSlider source= (JSlider) event.getSource();  
						xrot= source.getValue();  
					}

				});  
		slidery= new JSlider(0, 360);
		slidery.setSnapToTicks(true);  
		slidery.setPaintTicks(true);  
		slidery.setMajorTickSpacing(20);  
		slidery.setMinorTickSpacing(5);  
		slidery.addChangeListener( 
				new ChangeListener()  {    
					public void stateChanged(ChangeEvent event)  {    
						JSlider source= (JSlider) event.getSource();  
						yrot= source.getValue();  
					}

				});  
		sliderz= new JSlider(0, 360);
		sliderz.setSnapToTicks(true);  
		sliderz.setPaintTicks(true);  
		sliderz.setMajorTickSpacing(20);  
		sliderz.setMinorTickSpacing(5);  
		sliderz.addChangeListener( 
				new ChangeListener()  {    
					public void stateChanged(ChangeEvent event)  {    
						JSlider source= (JSlider) event.getSource();  
						zrot= source.getValue();  
					}

				});  
		sliderBox.add(sliderx);
		sliderBox.add(slidery);
		sliderBox.add(sliderz);
		//getContentPane().
		sliderBox.setBounds(0, 300, 300, 500);
		add(sliderBox);
	}     
	private void centerWindow(Component frame){ 
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
	public void init(GLAutoDrawable drawable) {  
		gl=  drawable.getGL().getGL2();    
		glu= new GLU();  
		glut= new GLUT();       
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MIN_FILTER, gl.GL_LINEAR);
		gl.glTexParameteri(gl.GL_TEXTURE_2D, gl.GL_TEXTURE_MAG_FILTER, gl.GL_NEAREST);
		gl.glEnable(GL.GL_DEPTH_TEST);
		gl.glDepthFunc(GL.GL_LEQUAL);
		gl.glShadeModel(GL2.GL_SMOOTH);
		gl.glClearColor(0f, 0f, 0f, 0f);                        // The Type Of Depth Testing To Do
		gl.glHint(gl.GL_PERSPECTIVE_CORRECTION_HINT, gl.GL_NICEST);
		//20230106-System.out.println("error");
	}  
	public void display(GLAutoDrawable drawable) {  
		GL2 gl= drawable.getGL().getGL2();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		gl.glTranslatef(-1.5f, 0.0f, -6.0f); // translate left and into the screen
		gl.glRotatef(xrot, 1.0f, 0.0f, 0.0f);                     // Rotate On The X Axis
		gl.glRotatef(yrot, 0.0f, 1.0f, 0.0f);                     // Rotate On The Y Axis
		gl.glRotatef(zrot, 0.0f, 0.0f, 1.0f);
		gl.glPointSize(1);
		gl.glBegin(GL.GL_POINTS);
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g[0].length;j++){
				gl.glColor3f((float)g[i][j]/255, (float)g[i][j]/255, (float)g[i][j]/255);
				gl.glVertex3d(i*0.005, j*0.005, g[i][j]*0.005);
			}
		}
		gl.glEnd();
		gl.glFlush();
	}  
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		float fAspect; 
		if (height== 0) {  
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
	public static void main(String[] args) {  
		final test app= new test(null);      
		app.setSize(800, 600);
		app.setVisible(true);
				JFrame f=new JFrame();
				f.add(app);
				f.setTitle("ButtonDemo");
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(500, 600);
				f.setVisible(true);
	}  
}  
