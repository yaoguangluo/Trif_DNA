package I_A.IMS.EUQ.SP;

import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.sound.SoundRecord;
import jniFFT.LYGFFT;

import javax.sound.sampled.AudioFormat;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.geom.Line2D.Double;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

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
public class SoundWave extends JPanel {
    public O_V.OSI.OSU.AVU.OSQ.wavePlay.Jp waveJpanel;
    public App NE;
    public boolean isRecoding = false;
    public int maxPipeSize = 512;
    public int type = 0;

    public int frameSizeInBytes;
    public int bufferLengthInFrames;
    public int bufferLengthInBytes;
    //稍后过滤private
    public LYGFileIO cur;
    public Thread t1;
    public JButton j;
    public JButton j4;
    public DetaButton detaButton;
    public LYGFFT fFT;
    public Thread time;
    public SoundRecord rec;
    public BufferedImage imageForOutput = new BufferedImage(1400
        , 700, BufferedImage.TYPE_INT_RGB);
    public AudioFormat format;
    public SoundWaveVector sw;
    public SoundWaveVectorNew swn;

    public Vector<Double> lines;
    public Vector<java.lang.Float> forOutput;
    public IMV_SIQ cache_sj = new IMV_SIQ();
    public IMV_SIQ cache_bz = new IMV_SIQ();
    public List<byte[]> temps = new CopyOnWriteArrayList<>();
}
