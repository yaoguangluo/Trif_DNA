package I_A.IMS.EUQ.SP;
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.FileDialog;
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.geom.Line2D.Double;
//import java.awt.image.BufferedImage;
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.Iterator;
//import java.util.Vector;
//import java.util.concurrent.ConcurrentHashMap;
//
//import javax.imageio.ImageIO;
//import javax.sound.sampled.AudioFormat;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.DataLine;
//import javax.sound.sampled.LineUnavailableException;
//import javax.sound.sampled.TargetDataLine;
//import javax.swing.JButton;
//import javax.swing.JTextPane;
//
//import ME.VPC.C.skivvy.MakeContainerZNSZ;
//import M_V.MVQ.button.DetaButton;
//import M_V.MVQ.filenameFilter.TXTFilter;
//import U_A.PEU.P.movie.LYGFileIO;
//import U_A.PEU.P.sound.SoundRecord;
//import U_A.PEU.P.wave.DFT;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于 java sound demo JDK 官方 demo 写的
public class SoundWaveJPanel extends SoundWave implements Runnable{
	
//	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

//public SoundWaveJPanel(Container jpanelFourth, DFT dFT, JTextPane text
//		, BufferedImage imageForOutput, MakeContainerZNSZ makeContainerZNSZ){
//	this.imageForOutput= imageForOutput;
//	this.dFT= dFT;
//	this.setBackground(new Color(100, 100, 100));
//	forOutput= new Vector<Double>();
//	rec= new SoundRecord(null);
//	
//	double[]  fft= new double[1024];
//	fft[4]= 500;
//	LYGFileIO lYGFileIO= new LYGFileIO().initWithFFT(new double[1024], makeContainerZNSZ);
//	waveJpanel= new O_V.OSI.OSU.AVU.OSQ.wavePlay.Jp(lYGFileIO);
//	
//	JButton j= new DetaButton("开始录音", 100, 50, Color.pink);
//	j.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 0;
//			t1= new Thread(SoundWaveJPanel.this);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();	
//			jpanelFourth.validate();
//		}
//	});
//	j.setSize(100, 30);
//	j.setBounds(500, 20, 100, 30);
//	JButton j1= new DetaButton("关闭录音", 100, 50, Color.black);
//	j1.setForeground(Color.white);
//	j1.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 0;
//			waveJpanel.reg= 0;
//			jpanelFourth.validate();
//		}
//	});
//	j1.setSize(100, 30);
//	JButton j2= new DetaButton("生成数列", 100- 20, 50, Color.green);
//	j2.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) { 
//			reg= 2;
//			if(forOutput== null) {
//				return;
//			}
//			if(forOutput.size()<= 0) {
//				return;
//			}
//			if(text.getText().length()>5000) {
//				return;
//			}
//			StringBuilder page= new StringBuilder();
//			Iterator<Double> iterator= forOutput.iterator();
//				while(iterator.hasNext()) {
//					double setOfi= iterator.next();
//					page.append(" "+ setOfi.getX2()+":"+setOfi.getY2()); 
//				}
//				if(!text.getText().isEmpty()) {
//					text.setText(text.getText() +"\r\n\r\n"+ page.toString());
//				}else {
//					text.setText(page.toString());
//				}
//				text.validate(); 
//		}
//	});
//	j2.setSize(100, 30);
//	
//	JButton j21= new DetaButton("读取数列", 100- 20, 50, Color.green);
//	j21.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) { 
//			reg= 2;
//			if(forOutput== null) {
//				return;
//			}
//			if(forOutput.size()<= 0) {
//				return;
//			}
//			if(text.getText().length()>5000) {
//				return;
//			}
//			StringBuilder page= new StringBuilder();
//			Iterator<Double> iterator= forOutput.iterator();
//				while(iterator.hasNext()) {
//					double setOfi= iterator.next();
//					page.append(" "+ setOfi.getX2()+":"+setOfi.getY2()); 
//				}
//				if(!text.getText().isEmpty()) {
//					text.setText(text.getText() +"\r\n\r\n"+ page.toString());
//				}else {
//					text.setText(page.toString());
//				}
//				text.validate(); 
//		}
//	});
//	j21.setSize(100, 30);
//	
//	JButton j3= new DetaButton("存为图片", 100- 20, 50, Color.magenta);
//	j3.addActionListener(new ActionListener() {
//		@SuppressWarnings("unused")
//		public void actionPerformed(ActionEvent e) {
//			reg= 0;
//			//获取图片
//			//弹出保存框
//			if(null== imageForOutput) {
//				return;
//			}
//			//get path
//			FileDialog filedialog= new FileDialog(new Frame(), "导入到这里", FileDialog.LOAD);
//			filedialog.setFilenameFilter(new TXTFilter("png"));
//			filedialog.setVisible(true);
//			String filepath= filedialog.getDirectory() + filedialog.getFile();
//			//20230106-System.out.println(filepath);
//			try {
//				File outputBin= new File(filepath+ ".png");
//				if(null== imageForOutput) {
//					return;
//				}
//				ImageIO.write(imageForOutput, "png", outputBin);
//			} catch (IOException writePngError) {
//				//20230106-System.out.println(filepath);
//			}	
//			//输出图片
//		}
//	});
//	j3.setSize(100, 30);
//	
//	JButton j4= new DetaButton("高敏噪音", 100- 20, 50, Color.black);
//	j4.setForeground(Color.white);
//	j4.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 1;
//			t1= new Thread(SoundWaveJPanel.this);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();	
//			jpanelFourth.validate();
//		}
//	});
//	j4.setSize(100, 30);
//	
//	JButton j5= new DetaButton("读取图片", 100- 20, 50, Color.black);
//	j5.setForeground(Color.white);
//	j5.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 1;
//			t1= new Thread(SoundWaveJPanel.this);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();	
//			jpanelFourth.validate();
//		}
//	});
//	j5.setSize(100, 30);
//	
//	JButton j51= new DetaButton("调制解调", 100- 20, 50, Color.black);
//	j51.setForeground(Color.white);
//	j51.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 1;
//			//new fft[];
////			double[]  fft= new double[1024];
////			fft[4]= 500;
////			LYGFileIO lYGFileIO= new LYGFileIO().initWithFFT(new double[1024]
//			//, makeContainerZNSZ);
////			waveJpanel= new org.LYG.node.sound.wavePlay.jp(lYGFileIO);
//			waveJpanel.reg= 5;
//			t1= new Thread(waveJpanel);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();;
//			jpanelFourth.validate();
//		}
//	});
//	j51.setSize(100, 30);
//	
//	DetaButton j6= new DetaButton("山林", 100-10, 50, Color.green);
//	j6.setForeground(Color.white);
//	j6.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 1;
//			t1= new Thread(SoundWaveJPanel.this);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();	
//			jpanelFourth.validate();
//		}
//	});
//	j6.setSize(100, 30);
//	
//	DetaButton j7= new DetaButton("海边", 100- 20, 50, Color.blue);
//	j7.setForeground(Color.white);
//	j7.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 1;
//			t1= new Thread(SoundWaveJPanel.this);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();	
//			jpanelFourth.validate();
//		}
//	});
//	j7.setSize(100, 30);
//	
//	JButton j8= new DetaButton("美梦", 100- 20, 50, Color.magenta);
//	j8.setForeground(Color.white);
//	j8.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 1;
//			t1= new Thread(SoundWaveJPanel.this);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();	
//			jpanelFourth.validate();
//		}
//	});
//	j8.setSize(100, 30);
//	
//	JButton j9= new DetaButton("书馆", 100- 20, 50, Color.yellow);
//	j9.setForeground(Color.white);
//	j9.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//			reg= 1;
//			type= 1;
//			t1= new Thread(SoundWaveJPanel.this);
//			t1.setPriority(Thread.MIN_PRIORITY);
//			t1.start();	
//			jpanelFourth.validate();
//		}
//	});
//	j9.setSize(100, 30);
//
//	this.add(j);	
//	this.add(j1);
//	this.add(j2);	
//	this.add(j21);	
//	this.add(j3);
//	this.add(j5);
//	this.add(j4);
//	this.add(j51);
//	this.add(j6);
//	this.add(j7);
//	this.add(j8);
//	this.add(j9);
//	jp3= new SoundWavePanelVector(imageForOutput.getGraphics());
//	jp3.setBounds(100, 0, 400, 400);
//	jp3.setVisible(true);
//	this.add(jp3);	
//} 
//
//@SuppressWarnings({ "unchecked", "unused" })
//public void run(){
//	while(reg==1){
//		//录音
//		////20230106-System.out.println("luo");
//		sw= new SoundWaveVector();
//		time= new Thread(rec);
//		time.setPriority(6);
//		TargetDataLine line;
//		AudioFormat.Encoding encoding= AudioFormat.Encoding.PCM_SIGNED;  
//		float rate= 19200f;  
//		int sampleSize= 16;  
//		String signedString= "signed";  
//		boolean bigEndian= true;  
//		int channels= 2;  
//		format= new AudioFormat(encoding, rate, sampleSize,
//				channels, (sampleSize/ 8) * channels, rate, bigEndian);
//		cache_sj=new IMV_SIQ();
//		cache_bz=new IMV_SIQ();
//		InputStream ain= getClass().getResourceAsStream("zabo.txt");
//		DetaBufferedReader acReader= new DetaBufferedReader(DetaInputStreamReader.E(ain));  
//		String actempString= null; 
//		try {
//			while ((actempString= acReader.readDetaLine()) != null) {
//				cache_bz.put(actempString, actempString);
//			}
//			acReader.closeDeta();
//		} catch (IOException e1) {
////			e1.printStackTrace();
//		}
//		while(reg==1){
//			try {
//				DetaThread.sleepDeta(1);
//				DataLine.Info info= new DataLine.Info(TargetDataLine.class, format);
//				if (!AudioSystem.isLineSupported(info)) {
//					return;
//				}
//				// get and open the target data line for capture.
//				try {
//					line= (TargetDataLine) AudioSystem.getLine(info);
//					line.open(format, line.getBufferSize());
//				} catch (LineUnavailableException ex) { 
//					return;
//				} catch (SecurityException ex) { 
//					//shutDown(ex.toString());
//					return;
//				} catch (Exception ex) { 
//					//shutDown(ex.toString());
//					return;
//				}
//				ByteArrayOutputStream out= new ByteArrayOutputStream();
//				DetaThread.sleepDeta(100);
//				frameSizeInBytes= format.getFrameSize();
//				bufferLengthInFrames= line.getBufferSize() / 8;
//				bufferLengthInBytes= bufferLengthInFrames * frameSizeInBytes;
//				//  //20230106-System.out.println("bufferLengthInBytes : " + bufferLengthInBytes +" **");
//				byte[] data= new byte[bufferLengthInBytes];
//				int numBytesRead= 0;
//				line.start();
//				if((numBytesRead= line.read(data, 0, bufferLengthInBytes))== -1) {
//					break;
//				}
//				out.write(data, 0, numBytesRead);
//				line.stop();//以后改成一边录一边计算，没必要这样录一段计算一段
//				line.close();//我有点不爽，3楼一把监控，老子写代码，毫无保留，
//				line= null;
//				// stop and close the output stream
//				try {
//					out.flush();
//					out.close();
//				} catch (IOException ex) {
//					ex.printStackTrace();
//				}
//				// load bytes into the audio input stream for playback
//				byte[] audioBytes= out.toByteArray();
//				ByteArrayInputStream bais= new ByteArrayInputStream(audioBytes);
//				AudioInputStream ais= new AudioInputStream(bais, format, audioBytes.length/ format.getFrameSize());
//				lines= sw.getVectorLines1(this, jp3, ais, cache_bz, cache_sj, dFT, forOutput
//						, imageForOutput.getGraphics(), type);
//				//显示最大值				     
//			} catch (InterruptedException | IOException e) {
//				e.printStackTrace();
//			}
//		}
//		//显示波振幅 
//		return;
//	} 
//}