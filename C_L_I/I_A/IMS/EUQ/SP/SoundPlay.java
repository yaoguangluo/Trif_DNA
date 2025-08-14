package I_A.IMS.EUQ.SP;
import exception.thread.DetaThread;
import O_V.OSI.OSU.AVU.OSQ.wavePlay.Jp;
import U_A.PEU.P.movie.AdataFrame;
import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.sound.BytestoAIS;
import U_A.PEU.P.wave.DFT;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.io.IOException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于 java sound demo JDK 官方 demo 写的
public class SoundPlay implements Runnable {
    private LYGFileIO cur;
    private AdataFrame af;
    private Jp jp;
    @SuppressWarnings("unused")
    private Object bootSound;

    public SoundPlay() {
    }

    public void Play(AudioInputStream ais1) {
        if (ais1 == null) {
            return;
        }
        AudioFormat format = ais1.getFormat();
        AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, ais1);
        if (playbackInputStream == null) {
            return;
        }
        SourceDataLine line1;
        DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
        try {
            line1 = (SourceDataLine) AudioSystem.getLine(info1);
            int frameSizeInBytes = ais1.getFormat().getFrameSize();
            int bufferLengthInFrames = line1.getBufferSize() / (1 * 2 * 2 * frameSizeInBytes);
            int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
            //20230106-System.out.println("bufferLengthInBytes : "+ bufferLengthInBytes +" **");
            byte[] data = new byte[bufferLengthInBytes];
            line1.open(format, line1.getBufferSize());
            int numBytesRead = 0;
            line1.start();
            while (true) {
                try {
                    if ((numBytesRead = ais1.read(data)) == -1) {
                        break;
                    }
                    int numBytesRemaining = numBytesRead;
                    while (numBytesRemaining > 0) {
                        numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                        DetaThread.sleepDeta(1);
                    }
                } catch (Exception e) {
                    break;
                }
            }
            line1.stop();
            line1.close();
            line1 = null;
        } catch (LineUnavailableException ex) {
            return;
        }

    }


    public void Play(AdataFrame af) {
        if (af.audioIS == null) {
            return;
        }
        AudioFormat format = af.audioIS.getFormat();
        AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);
        if (playbackInputStream == null) {
            return;
        }
        SourceDataLine line1;
        DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
        try {
            line1 = (SourceDataLine) AudioSystem.getLine(info1);
            int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
            int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
            int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
            int bufSize = bufferLengthInBytes;
            line1.open(format, bufSize);
        } catch (LineUnavailableException ex) {
            return;
        }
        int frameSizeInBytes = format.getFrameSize();
        int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
        int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
        byte[] data = new byte[bufferLengthInBytes];
        int numBytesRead = 0;
        line1.start();
        try {
            af.audioIS.reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            try {//try local ..
                if ((numBytesRead = af.audioIS.read(data)) == -1) {
                    break;
                }
                int numBytesRemaining = numBytesRead;
                while (numBytesRemaining > 0) {
                    numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                }
            } catch (Exception e) {
                break;
            }
        }
        while (af.next != null) {
            af = af.next;
            try {
                af.audioIS.reset();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            while (true) {
                try {
                    if ((numBytesRead = af.audioIS.read(data)) == -1) {
                        break;
                    }
                    int numBytesRemaining = numBytesRead;
                    while (numBytesRemaining > 0) {
                        numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
        line1.stop();
        line1.close();
        line1 = null;
    }

    public void Play(byte[] secbytesarray, AudioFormat af, SourceDataLine line1, int sp, byte[] data) throws LineUnavailableException {
        for (int i = 0; i < sp; i++) {
            for (int j = 0; j < data.length; j++) {
                data[j] = secbytesarray[j + i * data.length];
            }
            line1.write(data, 0, data.length);
        }
    }

    @SuppressWarnings("unused")
    public void Play1(AudioInputStream ais1, AudioFormat af) {
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
        int numBytesRead = 0;
        line1.start();
        byte all[] = new byte[(int) (ais1.getFrameLength() * 2)];
        try {//later
            ais1.read(all);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int sp = all.length / data.length;
        int pos = 0;
        for (int i = 0; i < sp; i++) {
            for (int j = 0; j < data.length; j++) {
                data[j] = all[j + i * data.length];
            }
            int numBytesRemaining = data.length;//343
            while (numBytesRemaining > 0) {
                numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
            }
        }
        line1.stop();
        line1.close();
        line1 = null;
    }

    public void PlayArray(AdataFrame af) {
        if (af.audioIS == null) {
            return;
        }
        AudioInputStream ais = new BytestoAIS().getAIS(af.audioArray, af.audioIS);
        AudioFormat format = af.audioIS.getFormat();
        AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);
        if (playbackInputStream == null) {
            return;
        }
        SourceDataLine line1;
        DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
        try {
            line1 = (SourceDataLine) AudioSystem.getLine(info1);

            int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
            int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
            int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
            int bufSize = bufferLengthInBytes;
            line1.open(format, bufSize);
        } catch (LineUnavailableException ex) {
            return;
        }
        int frameSizeInBytes = format.getFrameSize();
        int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
        int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
        byte[] data = new byte[bufferLengthInBytes];
        int numBytesRead = 0;
        line1.start();
        while (true) {
            try {
                if ((numBytesRead = ais.read(data)) == -1) {
                    break;
                }
                int numBytesRemaining = numBytesRead;
                while (numBytesRemaining > 0) {
                    numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                }
            } catch (Exception e) {
                break;
            }
        }
        while (af.next != null) {
            af = af.next;
            ais = new BytestoAIS().getAIS(af.audioArray, af.audioIS);
            while (true) {
                try {
                    if ((numBytesRead = ais.read(data)) == -1) {
                        break;
                    }
                    int numBytesRemaining = numBytesRead;
                    while (numBytesRemaining > 0) {
                        numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
        line1.stop();
        line1.close();
        line1 = null;
    }

    public void PlayMasterArray(AdataFrame af) {

        if (af.audioIS == null) {
            return;
        }
        double master[] = new double[af.master.length];
        int psita = 0;
        for (int i = 2; i < master.length - 2; i++) {
            psita = 0;
            for (int p = -2; p < 3; p++) {
                psita += (af.master[i + p]);
            }
            master[i] = psita / 5.0;
        }
        AudioInputStream ais = new BytestoAIS().getAIS(master, af.audioIS);
        AudioFormat format = af.audioIS.getFormat();
        AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);
        if (playbackInputStream == null) {
            return;
        }
        SourceDataLine line1;
        DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
        try {
            line1 = (SourceDataLine) AudioSystem.getLine(info1);

            int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
            int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
            int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
            int bufSize = bufferLengthInBytes;
            line1.open(format, bufSize);
        } catch (LineUnavailableException ex) {
            return;
        }
        int frameSizeInBytes = format.getFrameSize();
        int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
        int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
        byte[] data = new byte[bufferLengthInBytes];
        int numBytesRead = 0;
        line1.start();
        while (true) {
            try {
                if ((numBytesRead = ais.read(data)) == -1) {
                    break;
                }
                int numBytesRemaining = numBytesRead;
                while (numBytesRemaining > 0) {
                    numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                }
            } catch (Exception e) {
                break;
            }
        }
        while (af.next != null) {
            af = af.next;
            psita = 0;
            for (int i = 2; i < master.length - 2; i++) {
                //find high
                psita = 0;
                for (int p = -2; p < 3; p++) {
                    psita += (af.master[i + p]);
                }
                master[i] = psita / 5.0;
            }
            ais = new BytestoAIS().getAIS(master, af.audioIS);
            while (true) {
                try {
                    if ((numBytesRead = ais.read(data)) == -1) {
                        break;
                    }
                    int numBytesRemaining = numBytesRead;
                    while (numBytesRemaining > 0) {
                        numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
        line1.stop();
        line1.close();
        line1 = null;
    }

    public void PlaySlaveArray(AdataFrame af) {
        if (af.audioIS == null) {
            return;
        }
        double slave[] = new double[af.slave.length];
        int psita = 0;
        for (int i = 2; i < slave.length - 2; i++) {
            //find high
            psita = 0;
            for (int p = -2; p < 3; p++) {
                psita += (af.slave[i + p]);
            }
            slave[i] = psita / 5.0;

        }
        AudioInputStream ais = new BytestoAIS().getAIS(slave, af.audioIS);
        AudioFormat format = af.audioIS.getFormat();
        AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);
        if (playbackInputStream == null) {
            return;
        }
        SourceDataLine line1;
        DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
        try {
            line1 = (SourceDataLine) AudioSystem.getLine(info1);

            int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
            int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
            int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
            int bufSize = bufferLengthInBytes;
            line1.open(format, bufSize);
        } catch (LineUnavailableException ex) {
            return;
        }
        int frameSizeInBytes = format.getFrameSize();
        int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
        int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
        byte[] data = new byte[bufferLengthInBytes];
        int numBytesRead = 0;
        line1.start();
        while (true) {
            try {
                if ((numBytesRead = ais.read(data)) == -1) {
                    break;
                }
                int numBytesRemaining = numBytesRead;
                while (numBytesRemaining > 0) {
                    numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                }
            } catch (Exception e) {
                break;
            }
        }
        while (af.next != null) {
            af = af.next;
            psita = 0;
            for (int i = 2; i < slave.length - 2; i++) {
                //find high
                psita = 0;
                for (int p = -2; p < 3; p++) {
                    psita += (af.slave[i + p]);
                }
                slave[i] = psita / 5.0;
            }
            ais = new BytestoAIS().getAIS(slave, af.audioIS);
            while (true) {
                try {
                    if ((numBytesRead = ais.read(data)) == -1) {
                        break;
                    }
                    int numBytesRemaining = numBytesRead;
                    while (numBytesRemaining > 0) {
                        numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
        line1.stop();
        line1.close();
        line1 = null;
    }

    public void PlayFftArray(AdataFrame af, LYGFileIO cur, Jp jp, Object bootSound) throws InterruptedException {
        if (af.audioIS == null) {
            return;
        }
        this.cur = cur;
        this.af = af;
        this.jp = jp;
        this.bootSound = bootSound;
    }

    @Override
    public void run() {
        while (jp.reg == 5) {
            DetaThread.sleepDeta(10);
            DFT dFT = new DFT();
            dFT.IV_(1024);
            double[] fft = new double[1024];// 内自应体《-》核糖体不一致性，分区域应用。
            for(int i= 0; i< fft.length; i++){
                fft[i] = 0.0;
            }
            fft[2] = Double.valueOf(cur.makeContainerZNSZ.source2 << 5);
            fft[4] = Double.valueOf(cur.makeContainerZNSZ.source3 << 5);
            fft[8] = Double.valueOf(cur.makeContainerZNSZ.source4 << 5);
            fft[16] = Double.valueOf(cur.makeContainerZNSZ.source5 << 5);
            fft[32] = Double.valueOf(cur.makeContainerZNSZ.source6 << 5);
            fft[32] = Double.valueOf(cur.makeContainerZNSZ.source7 << 5);//无效先
            fft[64] = Double.valueOf(cur.makeContainerZNSZ.source8 << 5);
            fft[128] = Double.valueOf(cur.makeContainerZNSZ.source16 << 5);
            fft[200] = Double.valueOf(cur.makeContainerZNSZ.source32 << 5);
            fft[256] = Double.valueOf(cur.makeContainerZNSZ.source64 << 5);
            fft[300] = Double.valueOf(cur.makeContainerZNSZ.source128 << 5);
            fft[400] = Double.valueOf(cur.makeContainerZNSZ.source256 << 5);
            fft[512] = Double.valueOf(cur.makeContainerZNSZ.source512 << 5);
            double[]  array = dFT.ft(fft);
            //for(int i=0;i<5;i++) {
            AudioInputStream ais = new BytestoAIS().getAIS(array, af.audioIS);
            AudioFormat format = af.audioIS.getFormat();
            AudioInputStream playbackInputStream
                = AudioSystem.getAudioInputStream(format, af.audioIS);
            if (playbackInputStream == null) {
                return;
            }
            SourceDataLine line1;
            DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
            try {
                line1 = (SourceDataLine) AudioSystem.getLine(info1);
                int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
                int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
                int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
                int bufSize = bufferLengthInBytes;
                line1.open(format, bufSize);
            } catch (LineUnavailableException ex) {
                return;
            }
            int frameSizeInBytes = format.getFrameSize();
            int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
            int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;

            byte[] data = new byte[bufferLengthInBytes];
            byte[] initData = new byte[bufferLengthInBytes];
            boolean firstTime = true;
            int numBytesRead = 0;
            line1.start();
            while (jp.reg == 5) {
                try {
                    if (firstTime) {
                        if ((numBytesRead = ais.read(data)) == -1) {
                            break;
                        }
                        initData = data.clone();
                        firstTime = !firstTime;
                    } else {
                        data = initData.clone();
                    }
                    int numBytesRemaining = numBytesRead;
                    while (numBytesRemaining > 0) {
                        DetaThread.sleepDeta(2);
                        numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                    }
                } catch (Exception e) {
                    break;
                }
            }
            line1.stop();
            line1.close();
        }
        //	}
    }
}