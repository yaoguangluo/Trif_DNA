package U_A.PEU.P.sound;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import java.awt.Dimension;
import java.awt.geom.Line2D;
import java.util.Vector;
//作者： 罗瑶光, 浏阳, 基于java sound 作者查阅 stackover flows的java sound 问题描述
//后测试研发的。所以著作权人就略了。
/*
 *  作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class SoundRegressionVector{
	Vector<Line2D.Double> lines= new Vector<Line2D.Double>();
	byte[] audioBytes;
	@SuppressWarnings("rawtypes")
	public Vector getVectorLines(AudioInputStream ais){
		lines.removeAllElements();  // clear the old vector
		AudioFormat af= ais.getFormat();
		audioBytes=null;
		if (audioBytes== null) {
			try {
				audioBytes= new byte[(int) (ais.getFrameLength() *af.getFrameSize())];
				//20230106-System.out.println("audiobyte length:"+audioBytes.length);
				ais.read(audioBytes);
			} catch (Exception ex) { 
				//reportStatus(ex.toString());
				return null; 
			}
		}
		Dimension d= new Dimension(800, 600);
		int w= d.width;
		int h= d.height-15;
		int[] audioData= null;
		if (af.getSampleSizeInBits()== 16) {
			int nlengthInSamples= audioBytes.length / 2;
			audioData= new int[nlengthInSamples];
			if (af.isBigEndian()) {
				for (int i= 0; i < nlengthInSamples; i++) {
					/* First byte is MSB (high order) */
					int MSB= (int) audioBytes[2*i];
					/* Second byte is LSB (low order) */
					int LSB= (int) audioBytes[2*i+1];
					audioData[i]= MSB << 8 | (255 & LSB);
				}
			} else {
				for (int i= 0; i < nlengthInSamples; i++) {
					/* First byte is LSB (low order) */
					int LSB= (int) audioBytes[2*i];
					/* Second byte is MSB (high order) */
					int MSB= (int) audioBytes[2*i+1];
					audioData[i]= MSB << 8 | (255 & LSB);
				}
			}
		} else if (af.getSampleSizeInBits()== 8) {
			int nlengthInSamples= audioBytes.length;
			audioData= new int[nlengthInSamples];
			if (af.getEncoding().toString().startsWith("PCM_SIGN")) {
				for (int i= 0; i < audioBytes.length; i++) {
					audioData[i]= audioBytes[i];
				}
			} else {
				for (int i= 0; i < audioBytes.length; i++) {
					audioData[i]= audioBytes[i] - 128;
				}
			}
		}
		int frames_per_pixel= audioBytes.length / af.getFrameSize()/w;
		byte my_byte= 0;
		int idx=0;
		int numChannels= af.getChannels();
		double med= new Convolution().medGet(audioData, af, w, h, frames_per_pixel);
		for (double x= 0.0; x < w && audioData != null; x+=3) {
			idx= (int) (frames_per_pixel * numChannels * x);
			if (af.getSampleSizeInBits()== 8) {
				my_byte= (byte) audioData[idx];
			} else {
				my_byte= (byte)(128 * audioData[idx]/32768);
			}
			double y_new= h*(128-Double.valueOf(my_byte)/256);
			lines.add(new Line2D.Double(x, med, x, y_new));
		}
		return lines;
	}
}
