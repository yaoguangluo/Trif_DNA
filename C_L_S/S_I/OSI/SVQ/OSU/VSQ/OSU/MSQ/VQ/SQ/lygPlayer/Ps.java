package S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygPlayer;

import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.sound.SoundPlay;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.io.RandomAccessFile;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Ps extends Thread {
    public RandomAccessFile raf;
    public LYGFileIO io;
    public BufferReader read;

    public Ps(RandomAccessFile raf1, LYGFileIO io1, BufferReader read1) {
        raf = raf1;
        io = io1;
        read = read1;
    }

    public void run() {
        int times = 0;
        int secbytes = (int) (io.header.SFrameSize * io.header.SFrameRate);
        AudioFormat af = new AudioFormat(io.header.SEn, io.header.SSampleRate,
                io.header.SSampleSizeInBits, io.header.SChannels,
                io.header.SFrameSize, io.header.SFrameRate, io.header.SBigEndian);
        io.header.SWavCurrentPos = io.header.SWavPos;
        SourceDataLine line1;
        DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, af);
        try {
            line1 = (SourceDataLine) AudioSystem.getLine(info1);
            int bufSize = line1.getBufferSize() / 8;
            line1.open(af, bufSize);
        } catch (LineUnavailableException ex) {
            return;
        }
        int bufSize = line1.getBufferSize() / 8;
        byte[] data = new byte[bufSize];
        byte secbytesarray[] = new byte[secbytes];
        int sp = secbytesarray.length / data.length;
        line1.start();
        while (times++ < io.duration) {
            try {
                read.asyBufferReader(raf, io, secbytesarray, 1);
                new SoundPlay().Play(secbytesarray, af, line1, sp, data);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
        }
        line1.stop();
        line1.close();
        line1 = null;
    }
}
