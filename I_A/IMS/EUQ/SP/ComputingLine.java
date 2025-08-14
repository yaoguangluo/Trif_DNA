package I_A.IMS.EUQ.SP;

import ME.VPC.M.app.App;
import S_A.linePage.Line2025;
import exception.thread.DetaThread;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
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
public class ComputingLine extends Thread implements Runnable {
    App NE;

    public ComputingLine(App app_NE) {
        NE = app_NE;
    }

    @SuppressWarnings({"unchecked"})
    public void run() {
        if (null != NE.app_S.line2025) {
            //reg
            Line2025 line2025 = NE.app_S.line2025;
            if(null==line2025){
                return;
            }
            if(null==line2025.format){
                return;
            }
            AudioFormat format = line2025.format;
            List<byte[]> temps = line2025.temps;
            SoundWaveVectorNew swn = line2025.swn;
            //ini
            byte[] audioBytes;
            ByteArrayOutputStream out;
            Iterator<byte[]> iterator;
            ByteArrayInputStream bais;
            AudioInputStream ais;
            AudioFormat af;
            while (NE.app_S.reg == 1) {
                try {
                    DetaThread.sleepDeta(1);
                    int size = temps.size();
                    if (size > 0) {
                        out = new ByteArrayOutputStream();
                        iterator = temps.iterator();
                        while (iterator.hasNext() && 1 == NE.app_S.reg) {
                            out.write(iterator.next());
                        }
                        temps.clear();
                        audioBytes = out.toByteArray();
                        bais = new ByteArrayInputStream(audioBytes);
                        long longS = audioBytes.length / format.getFrameSize();
                        ais = new AudioInputStream(bais, format, longS);
                        af = ais.getFormat();
                        if (null != audioBytes) {
                            swn.audioBytes = audioBytes;
                            swn.doAudioBytesTask(af, NE);
                        }
                    }//显示最大值
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }//显示波振幅
        }
        return;
    }
}