package U_A.PEU.P.movie;
import javax.sound.sampled.AudioFormat.Encoding;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Header{
	public int MWFrame;
	public int MHFrame;
	public int MFrameLeangth;
	public int MFrameRate;
	//en /1sample rate /2samplesize /3 channels /4framesize  /5 framrate/bigendianture 
	public Encoding SEn;
	public float SSampleRate;
	public int SSampleSizeInBits;
	public int SChannels;
	public int SFrameSize;
	public float SFrameRate;
	public boolean SBigEndian;
	public long SFrameLeangth;
	public long MovPos;
	public long SWavPos;
	public long SWavCurrentPos;
	public long SMovCurrentPos;
	public Header(){	
		MWFrame=0;
		MHFrame=0;
		MFrameLeangth=0;
		MFrameRate=0;
		//en /1sample rate /2samplesize /3 channels /4framesize  /5 framrate/bigendianture 
		SEn=null;
		SSampleRate=0;
		SSampleSizeInBits=0;
		SChannels=0;
		SFrameSize=0;
		SFrameRate=0;
		SBigEndian=false;
		SFrameLeangth=0;
		SWavPos=0;
		MovPos=0;
		SWavCurrentPos=0;
		SMovCurrentPos=0;
	}
}
