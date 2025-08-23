package U_A.PEU.P.sound;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
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
public class SoundAttribute{
	public SoundAttribute(){
	}
	@SuppressWarnings("unused")
	public void printAttribute(AudioInputStream ais){
		long framelength= ais.getFrameLength();
		//20230106-System.out.println("frame length : " + framelength);

		AudioFormat af= ais.getFormat();
		//DataLine.Info info= new DataLine.Info(SourceDataLine.class, af);
		int frameRate= (int)af.getFrameRate();
		//20230106-System.out.println("Frames per second: " + frameRate);

		int sampleRate=(int)af.getSampleRate();
		//20230106-System.out.println("Sample Rate: " + sampleRate);

		int frameSize= af.getFrameSize();
		//20230106-System.out.println("each Frame Size: " + frameSize);

		int channels= af.getChannels();
		//20230106-System.out.println("Channels : " + channels);

		int bps= af.getSampleSizeInBits();
		//20230106-System.out.println("Bits per sample : " + bps);

		double times;
		long milliseconds= (long)((ais.getFrameLength() * 1000) / ais.getFormat().getFrameRate());
		times= milliseconds / 1000.0;
		//20230106-System.out.println("Duration of the songs : " + times +" seconds");
	}
}
