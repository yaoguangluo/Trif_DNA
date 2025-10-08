package V_A.VQ.SQ.demos;

import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.movie.LYGPlayer;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

//作者+ 个人著作权人： 罗瑶光, 浏阳,
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class DEMO {
    @SuppressWarnings("unused")
    public DEMO() {
        String FilePath = new String("FilePath");
        LYGFileIO IO = new LYGFileIO();
        IO.reset();
        IO.lygRead(FilePath);
        LYGPlayer player = new LYGPlayer(IO);
        //processor IO begin;
        //...
        //end
        IO.lygWrite("filePath");
        IO.reset();
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Encoding en = new Encoding("ULAW");
        AudioFormat F = new AudioFormat(en, 1, 2, 3
            , 4, 5, true);
        //en /1sample rate /2samplesize /3 channels /4framesize
        ///5 framrate/bigendianture
        //20230106-S_logger.Log.logger.info("" + "Channels"+F.getChannels());
        //20230106-S_logger.Log.logger.info("" + "FrameRate"+F.getFrameRate());
        //20230106-S_logger.Log.logger.info("" + "FrameSize"+F.getFrameSize());
        //20230106-S_logger.Log.logger.info("" + "SampleSizeInBits"+F.getSampleSizeInBits());
        //20230106-S_logger.Log.logger.info("" + "Encod"+F.getEncoding());
        //20230106-S_logger.Log.logger.info("" + "SampleRate"+F.getSampleRate());
        //20230106-S_logger.Log.logger.info("" + "BigEndian"+F.isBigEndian());
    }
}
