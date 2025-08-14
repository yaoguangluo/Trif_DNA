package U_A.PEU.P.movie;

import U_A.PEU.P.sound.BytestoAIS;
import org.apache.commons.math.complex.Complex;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
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
public class AdataFrame{
	public int seconds;
	public AudioInputStream audioIS;
	public byte[] audioBytes;
	public double[]  audioArray;
	public Complex[][] audiofft;
	public AdataFrame next;
	public AdataFrame prev;
	public double[]  master;
	public double[]  slave;
	public double[]  fftarray;
	public double[]  fftlooparray;
	public int[][] logfftarray;
	public double[]  orge;
	public AdataFrame(){	
	}
	
	public void AUinit(Header header){
		AudioFormat af= new AudioFormat(header.SEn,
				header.SSampleRate,
				header.SSampleSizeInBits,
				header.SChannels,
				header.SFrameSize,
				header.SFrameRate,
				header.SBigEndian);
		//en /1sample rate /2samplesize /3 channels /4framesize  /5 framrate/bigendianture 
		audioIS= new BytestoAIS().getAIS(audioArray, af, audioIS);
	}
}
