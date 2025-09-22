package I_A.IMS.EUQ.SP;

import ME.VPC.M.app.App;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import java.util.Vector;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于 java sound demo JDK 官方 demo 写的
public class SoundWaveVectorNew extends SoundWaveVector {
    @SuppressWarnings({"rawtypes", "unused"})
    public Vector getVectorLines1(AudioInputStream ais, App NE) {
        lines.removeAllElements();// clear the old vector
        AudioFormat af = ais.getFormat();
        audioBytes = null;
        if (audioBytes == null) {
            try {
                int temp = (int) (ais.getFrameLength() * af.getFrameSize());
                audioBytes = new byte[temp >> 1];
                ais.read(audioBytes);//loop later
                int len = 1;
                int c = 0;
                while (len > 0 && 1 == NE.app_S.reg && null != audioBytes) {
                    if (null == ais) {
                        break;
                    }
                    len = ais.read(audioBytes);//dangqian 4800 zhen = 1024fs
                    if (len > 0) {
                        doAudioBytesTask(af, NE);
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                return lines;
            }
        }
        return lines;
    }

    public void doAudioBytesTask(AudioFormat af, App NE) {
        if (audioBytes.length < 1) {
            return;
        }
        pshock = 0.0;
        nshock = 0.0;
        if (af.getSampleSizeInBits() == 16) {
            int nlengthInSamples = audioBytes.length >> 1;
            if (nlengthInSamples != audioData.length) {
                if (null == audioData) {
                    audioData = new float[nlengthInSamples];
                } else {
                    if (audioData.length != nlengthInSamples) {
                        audioData = new float[nlengthInSamples];
                    }
                }
            }
            if (af.isBigEndian()) {
                for (int i = 0; i < nlengthInSamples; i++) {
                    int MSB = audioBytes[i << 1];
                    int LSB = audioBytes[i * 2 + 1];//later heap
                    audioData[i] = (MSB << 8 | (255 & LSB));
                }
            } else {
                for (int i = 0; i < nlengthInSamples; i++) {
                    int LSB = audioBytes[i << 1];
                    int MSB = audioBytes[i * 2 + 1];
                    audioData[i] = (MSB << 8 | (255 & LSB));
                }
            }
        } else if (af.getSampleSizeInBits() == 8) {
            if (audioBytes.length != audioData.length) {
                if (null == audioData) {
                    audioData = new float[audioBytes.length];
                } else {
                    if (audioData.length != audioBytes.length) {
                        audioData = new float[audioBytes.length];
                    }
                }
            }
            if (af.getEncoding().toString().startsWith("PCM_SIGN")) {
                for (int i = 0; i < audioBytes.length; i++) {
                    audioData[i] = (audioBytes[i]);
                }
            } else {
                for (int i = 0; i < audioBytes.length; i++) {
                    audioData[i] = (audioBytes[i]) - 128;
                }
            }
        }
        float newdataO[] = new float[N];
        int count = 0;//do loop
        int ratio = 0;
        //大于1024 loop
        //小于1024 叠满
        if (audioData.length < N) {
            if (countL < N) {
                for (int i = 0; i < audioData.length && (countL < N); i++) {
                    audioDataL[countL++] = audioData[i];
                }
            }
            if (countL >= N) {
                countL = 1;
                float newdata[] = audioDataL.clone();
                audioDataL = new float[N];//later acceleration
                //先做当前软件已显示的1024记录
                NE.app_S.pageQ.addDataToTail(newdata, NE);
                tempDoDraw(newdata, NE);
            }
        }
        if (audioData.length >= N) {
            while (count < audioData.length && 1 == NE.app_S.reg) {
                int rc = ratio * 1024;
                ratio++;
                if (N + rc > audioData.length) {
                    return;//去range
                }
                for (int i = 0; i < N && audioData != null; i++) {
                    newdataO[i] = audioData[i + rc];//infinit later
                    count++;
                }
                float newdata[] = newdataO;
                //先做当前软件已显示的1024记录
                NE.app_S.pageQ.addDataToTail(newdata, NE);
                tempDoDraw(newdata, NE);
            }
        }
    }

    private void tempDoDraw(float[] newdata, App NE) {
        if (!NE.app_S.pageQ.registed) {
            NE.app_S.pageQ.regiter(lines, N, newdata, NE);
            NE.app_S.pageQ.newdata = newdata;
            v = NE.app_S.pageQ.doClt4(NE);
            return;
        }
        if (NE.app_S.line2025.isRecoding) {
            return;
        }
        //attension
        NE.app_S.pageQ.newdata = newdata;
        //ff
        v = NE.app_S.pageQ.doClt4(NE);
    }
}