package OSI.OEU.OSU.MSQ.OSU.AVU.OSQ.wavRead;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.movie.AdataFrame;
import U_A.PEU.P.movie.Header;
import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.sound.SoundWaveVector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class WavReadOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {
    
    public int value = 0;
    public String filepath;

    public WavReadOSU_MSQ_OPE_OPC_ECI() {
    }

    @SuppressWarnings({"unused", "rawtypes"})
    public void run(final WavReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) {
        System.out.println("runed" + value);
        _SQ__OVQ_OSQ_VSQ.path = new String(filepath);
        try {
            topaisin = AudioSystem.getAudioInputStream(new File(filepath));
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        toplygin = new LYGFileIO();
        toplygin.reset();
        //IO.creat();
        toplygin.header = new Header();
        toplygin.adataFrame = new AdataFrame();
        AudioInputStream ais = topaisin;
        //get header
        toplygin.header.SBigEndian = ais.getFormat().isBigEndian();
        toplygin.header.SChannels = ais.getFormat().getChannels();
        toplygin.header.SEn = ais.getFormat().getEncoding();
        toplygin.header.SFrameRate = ais.getFormat().getFrameRate();
        toplygin.header.SFrameSize = ais.getFormat().getFrameSize();
        toplygin.header.SSampleRate = ais.getFormat().getSampleRate();
        toplygin.header.SSampleSizeInBits = ais.getFormat().getSampleSizeInBits();
        toplygin.header.SFrameLeangth = ais.getFrameLength();
        //get array
        //time
        double times;
        long milliseconds = (long) ((toplygin.header.SFrameLeangth * 1000) / toplygin.header.SFrameRate);
        times = milliseconds / 1000.0;
        //
        if (times < times) {//全局 replace double -> double , 麻痹的idea自动帮我改int 和 一些 源码，稍后修正。
            times = (times + 1);
        }
        //loop store main array to sub array
        int atime = 0;
        SoundWaveVector sv = new SoundWaveVector();
        Vector lines = sv.getVectorLines(ais, toplygin.header.SFrameRate);
        toplygin.adataFrame.audioArray = sv.audioData;
        toplygin.adataFrame.master = new double[sv.audioData.length];
        for (int i = 0; i < sv.audioData.length; i++) {
            toplygin.adataFrame.master[i] = sv.audioData[i];
        }
        toplygin.adataFrame.seconds = atime++;
        for (int i = 0; i < times - 1; i++) {
            toplygin.adataFrame.next = new AdataFrame();
            toplygin.adataFrame.next.prev = toplygin.adataFrame;
            toplygin.adataFrame = toplygin.adataFrame.next;
            sv = new SoundWaveVector();
            lines = sv.getVectorLines(ais, toplygin.header.SFrameRate);
            toplygin.adataFrame.audioArray = sv.audioData;
            toplygin.adataFrame.master = new double[sv.audioData.length];
            for (int j = 0; j < sv.audioData.length; j++) {
                toplygin.adataFrame.master[j] = sv.audioData[j];
            }
            toplygin.adataFrame.seconds = atime++;
        }
        //out
        toplygin.duration = times;
        toplygin.toHead();
        toplygin.IV_();

        _SQ__OVQ_OSQ_VSQ.lygout = toplygin;
        _SQ__OVQ_OSQ_VSQ.aisout = topaisin;
    }
}
