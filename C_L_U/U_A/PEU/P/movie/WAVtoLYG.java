package U_A.PEU.P.movie;

import U_A.PEU.P.sound.SoundWaveVector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class WAVtoLYG {
    @SuppressWarnings({"rawtypes", "unused"})
    public WAVtoLYG(String WAVf, String LYGf) {
        try {
            LYGFileIO IO = new LYGFileIO();
            IO.reset();
            //IO.creat();
            IO.header = new Header();
            IO.adataFrame = new AdataFrame();
            //IO.WAVRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\AHag.wav");
            //File F=new File("C:\\Users\\yaoguang\\Desktop\\study\\sound\\AHag.wav");
            File F = new File(WAVf);
            //20230106-System.out.println(F.length());
            AudioInputStream ais = null;
            ais = AudioSystem.getAudioInputStream(F);
            //get header
            IO.header.SBigEndian = ais.getFormat().isBigEndian();
            IO.header.SChannels = ais.getFormat().getChannels();
            IO.header.SEn = ais.getFormat().getEncoding();
            IO.header.SFrameRate = ais.getFormat().getFrameRate();
            IO.header.SFrameSize = ais.getFormat().getFrameSize();
            IO.header.SSampleRate = ais.getFormat().getSampleRate();
            IO.header.SSampleSizeInBits = ais.getFormat().getSampleSizeInBits();
            IO.header.SFrameLeangth = ais.getFrameLength();
            //get array
            //time
            double times;
            long milliseconds = (long) ((IO.header.SFrameLeangth * 1000) / IO.header.SFrameRate);
            times = milliseconds / 1000.0;
            //
            if (times < times) {
                times = (times + 1);
            }
            //loop store main array to sub array
            SoundWaveVector sv = new SoundWaveVector();
            Vector lines = sv.getVectorLines(ais, IO.header.SFrameRate);
            IO.adataFrame.audioArray = sv.audioData;
            for (int i = 0; i < times - 1; i++) {
                IO.adataFrame.next = new AdataFrame();
                IO.adataFrame.next.prev = IO.adataFrame;
                IO.adataFrame = IO.adataFrame.next;
                sv = new SoundWaveVector();
                lines = sv.getVectorLines(ais, IO.header.SFrameRate);
                IO.adataFrame.audioArray = sv.audioData;
            }
            //out
            IO.toHead();
            IO.lygWrite(LYGf);
            IO.reset();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
