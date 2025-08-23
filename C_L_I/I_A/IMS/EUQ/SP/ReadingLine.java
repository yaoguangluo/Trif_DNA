package I_A.IMS.EUQ.SP;

import ME.VPC.M.app.App;
import exception.thread.DetaThread;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class ReadingLine extends Thread implements Runnable {
    public SoundWave soundWave;
    public TargetDataLine line;
    public AudioFormat.Encoding encoding;
    ByteArrayOutputStream out;
    byte[] data;//19200bytes++s
    int channels;
    int sampleSize;
    int numBytesRead;
    int bufferLengthInBytes;
    List<byte[]> temps;
    int maxPipeSize;
    boolean bigEndian;
    int frameSizeInBytes;
    int bufferLengthInFrames;
    App NE;
    String signedString = "signed";

    public ReadingLine(App app_NE) {
        NE = app_NE;
        line = null;
        channels = 1;
        //1 2 4 8 16 32 64 128
        int temp = 1 << (NE.app_S.sourcePageFR - 1);
        NE.app_S.rateWave = 32f * temp;//1024 * 32== 4 times 1024=
        sampleSize = 16;
        bigEndian = true;
        encoding = AudioFormat.Encoding.PCM_SIGNED;
    }

    public void run() {
        if (null == NE.app_S.line2025) {
            return;
        }
        this.soundWave = NE.app_S.line2025;
        while (NE.app_S.reg == 1) {
            //录音
            try {
                temps = soundWave.temps;
                maxPipeSize = soundWave.maxPipeSize;
                soundWave.swn = new SoundWaveVectorNew();
                soundWave.format = new AudioFormat(encoding, NE.app_S.rateWave, sampleSize,
                    channels, (sampleSize / 8) * channels, NE.app_S.rateWave, bigEndian);
                DetaThread.sleepDeta(1);
                DataLine.Info info = new DataLine.Info(TargetDataLine.class, soundWave.format);
                if (!AudioSystem.isLineSupported(info)) {//return;
                }
                line = (TargetDataLine) AudioSystem.getLine(info);
                line.open(soundWave.format, line.getBufferSize());
                frameSizeInBytes = soundWave.format.getFrameSize();
                bufferLengthInFrames = line.getBufferSize() / 8;
                bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
                out = new ByteArrayOutputStream();
                DetaThread.sleepDeta(1);
                data = new byte[bufferLengthInBytes]; //19200bytes++s
                //audioData = new double[nlengthInSamples];
                numBytesRead = 0;
                line.start();
                while (NE.app_S.reg == 1 && temps.size() < maxPipeSize) {
                    if (-1 == (numBytesRead = line.read(data, 0, bufferLengthInBytes))) {
                        break;
                    }
                    out.reset();
                    out.write(data, 0, numBytesRead);
                    byte[] audioBytes = out.toByteArray();
                    if (temps.size() < maxPipeSize) {
                        temps.add(0, audioBytes);
                    }
                    DetaThread.sleepDeta(1);
                }
                // stop and close the output stream
                //later 去中断 演示中去fft计算展示来加速， 仅仅 slider 操作展示 fft和时函数高级计算
                line.stop();
                line.close();
                line = null;
                out.flush();
                out.close();
                //显示最大值
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }//显示波振幅
            return;
        }
    }
}
//later temps to linklistQ 20250107-0049
//一m秒钟1小段，later