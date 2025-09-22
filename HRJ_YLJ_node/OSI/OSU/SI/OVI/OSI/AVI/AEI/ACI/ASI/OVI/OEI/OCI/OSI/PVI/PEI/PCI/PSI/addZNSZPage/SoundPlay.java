package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZNSZPage;

import exception.thread.DetaThread;
import U_A.PEU.P.movie.AdataFrame;
import U_A.PEU.P.sound.BytestoAIS;
import U_A.PEU.P.wave.DFT;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.io.IOException;

public class SoundPlay implements Runnable {
    private LYGFileIO cur;
    private AdataFrame af;
    private JpWave jp;
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
            System.out.println("bufferLengthInBytes : " + bufferLengthInBytes + " **");
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
        try {
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
            master[i] = (double)psita / 5;
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
                master[i] = (double)psita / 5;
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
            slave[i] = (double)psita / 5;

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
                slave[i] = (double)psita / 5;
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

    public void PlayFftArray(AdataFrame af, LYGFileIO cur, JpWave jp, Object bootSound) throws InterruptedException {
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
        try {
            while (jp.reg == 5) {
                DetaThread.sleepDeta(10);
                DFT dFT = new DFT();
                dFT.IV_(1024);
                double[]  fft = new double[1024];
                fft[2] = (double)cur.makeContainerZNSZ.source2 * 60;
                fft[3] = (double)cur.makeContainerZNSZ.source3 * 60;
                fft[4] = (double)cur.makeContainerZNSZ.source4 * 60;
                fft[5] = (double)cur.makeContainerZNSZ.source5 * 60;
                fft[6] = (double)cur.makeContainerZNSZ.source6 * 60;
                fft[7] = (double)cur.makeContainerZNSZ.source7 * 60;
                fft[8] = (double)cur.makeContainerZNSZ.source8 * 60;
                fft[16] = (double)cur.makeContainerZNSZ.source16 * 60;
                fft[32] = (double)cur.makeContainerZNSZ.source32 * 60;
                fft[64] = (double)cur.makeContainerZNSZ.source64 * 60;
                fft[128] = (double)cur.makeContainerZNSZ.source128 * 60;
                fft[256] = (double)cur.makeContainerZNSZ.source256 * 60;
                fft[512] = (double)cur.makeContainerZNSZ.source512 * 60;
                double[]  array = dFT.ft(fft);
                //for(int i=0;i<5;i++) {
                AudioInputStream ais = new BytestoAIS().getAIS(array, af.audioIS);
                AudioFormat format = af.audioIS.getFormat();
                AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);
                if (playbackInputStream == null) {
                    return;
                }
                SourceDataLine line1;
                DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);

                line1 = (SourceDataLine) AudioSystem.getLine(info1);
                int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
                int bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
                int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
                int bufSize = bufferLengthInBytes;
                line1.open(format, bufSize);

                frameSizeInBytes = format.getFrameSize();
                bufferLengthInFrames = line1.getBufferSize() / (8 * frameSizeInBytes);
                bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
                byte[] data = new byte[bufferLengthInBytes];
                int numBytesRead = 0;
                line1.start();
                while (jp.reg == 5) {
                    DetaThread.sleepDeta(10);
                    if ((numBytesRead = ais.read(data)) == -1) {
                        break;
                    }
                    int numBytesRemaining = numBytesRead;
                    while (numBytesRemaining > 0) {
                        DetaThread.sleepDeta(1);
                        numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
                    }
                }
                line1.stop();
                line1.close();
            }
        } catch (LineUnavailableException ex) {
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}