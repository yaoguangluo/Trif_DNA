package I_A.IMS.EUQ.SP;

import java.util.Vector;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于 java sound demo JDK 官方 demo 写的
public class SoundWaveVector {
    Vector<java.awt.geom.Line2D.Double> lines = new Vector<java.awt.geom.Line2D.Double>();
    final double pi = 6.28318530;
    public byte[] audioBytes;
    public float[] audioData = new float[1024];
    public float[] audioDataL = new float[1024];
    public int countL = 0;
    public double pshock;
    public double nshock;
    public String v;
    public int N = 1024;
//	
}

//
//@SuppressWarnings({ "rawtypes", "unused" })
//public Vector getVectorLines1(SoundWaveJPanel jpt, SoundWavePanelVector jp3
//		, AudioInputStream ais, Map<String, String> cache_bz
//		, Map<String, String> cache_sj, DFT dFT, Vector<Double> forOutput
//		, Graphics graphics, int type) {
//	pshock= 0;
//	nshock= 0;
//	lines.removeAllElements();  // clear the old vector
//	AudioFormat af= ais.getFormat();
//	audioBytes= null;
//	if (audioBytes== null) {
//		try {
//			audioBytes= new byte[(int) (ais.getFrameLength() *af.getFrameSize())/2];
//			// //20230106-System.out.println("audiobyte length:"+audioBytes.length);
//			ais.read(audioBytes);
//		} catch (Exception ex) { 
//			//reportStatus(ex.toString());
//			return lines;
//		}
//	}
//	Dimension d= new Dimension(N, 600);
//	int w= d.width;
//	int h= d.height-15;    
//	if (af.getSampleSizeInBits()== 16) {
//		int nlengthInSamples= audioBytes.length / 2;
//		audioData= new double[nlengthInSamples];
//		if (af.isBigEndian()) {
//			for (int i= 0; i < nlengthInSamples; i++) {
//				/* First byte is MSB (high order) */
//				int MSB= (int) audioBytes[2*i];
//				/* Second byte is LSB (low order) */
//				int LSB= (int) audioBytes[2*i+1];
//				audioData[i]= MSB << 8 | (255 & LSB);
//			}
//		} else {
//			for (int i= 0; i < nlengthInSamples; i++) {
//				/* First byte is LSB (low order) */
//				int LSB= (int) audioBytes[2* i];
//				/* Second byte is MSB (high order) */
//				int MSB= (int) audioBytes[2* i+ 1];
//				audioData[i]= MSB << 8 | (255 & LSB);
//			}
//		}
//	} else if (af.getSampleSizeInBits()== 8) {
//		int nlengthInSamples= audioBytes.length;
//		audioData= new double[nlengthInSamples];
//		if (af.getEncoding().toString().startsWith("PCM_SIGN")) {
//			for (int i= 0; i < audioBytes.length; i++) {
//				audioData[i]= audioBytes[i];
//			}
//		} else {
//			for (int i= 0; i < audioBytes.length; i++) {
//				audioData[i]= audioBytes[i] - 128;
//			}
//		}
//	}
//	int frames_per_pixel= audioBytes.length/af.getFrameSize()/w;
//	byte my_byte= 0;
//	double y_last= 0;
//	int idx= 0;
//	int numChannels= af.getChannels();
//	double newdata[]= new double [w] ;
//	double newdata1[]= new double [w] ;
//	double fdata1[]= new double [w] ;
//	double fdata2[]= new double [w] ;
//	double cos[][]= new double [w][w] ;
//	double sin[][]= new double [w][w] ;
//	//caiyang
//	for(int i=0; i < w && audioData != null;i++){
//		idx= (int) (frames_per_pixel * numChannels * i);//到时候改成熵增。
//		newdata[i]=audioData[w*2+ i];	
//	}
//	//ff
//	v= new Flt().clt4(dFT, lines, jpt, jp3, mlines1, mlines2, mlines3, mlines4
//			, mlines5, mlines6, mlines7, mlines8, mlines9, mlines10, mlines11
//			, mlines12, N, cos, sin, newdata, fdata1, cache_bz, cache_sj
//			, forOutput, graphics, type);
//	//pinlvguolv	
//	DetaThread.sleepDeta(200);
//	return lines;
//}    