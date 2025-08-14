package U_A.PEU.P.sound;
import javax.sound.sampled.AudioFormat;
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
public class Convolution{
	public Convolution(){
	}
	public double medGet(int[] audioData, AudioFormat af, int w, int h
			, int frames_per_pixel){
		int numChannels= af.getChannels();
		int idx=0;
		byte my_byte;
		double count=0.0;
		for (double x= 0.0; x < w && audioData != null; x++) {
			idx= (int) (frames_per_pixel * numChannels * x);
			if (af.getSampleSizeInBits()== 8)  {
				my_byte= (byte) audioData[idx];
			} else {
				my_byte= (byte) (128 * audioData[idx] / 32768 );
			}
			double y_new= (double) (h * (128 - my_byte) / 256);
			count+=y_new;
		}
		count=count/w;
		if(count>(count+0.5)){
			count=count+1;
		}
		//20230106-System.out.println(count);
		return count;
	}
}
