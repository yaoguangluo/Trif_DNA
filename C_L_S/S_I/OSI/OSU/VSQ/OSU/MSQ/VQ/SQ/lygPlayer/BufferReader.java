package S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygPlayer;

import U_A.PEU.P.movie.LYGFileIO;

import java.io.IOException;
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
public class BufferReader {
    public synchronized void asyBufferReader(RandomAccessFile raf, LYGFileIO io
            , byte[] buffer, int readtype) {//0 video 1 audio{
        try {
            if (readtype == 0) {
                raf.seek(io.header.SMovCurrentPos);
                raf.read(buffer);
                io.header.SMovCurrentPos += buffer.length;
            } else {
                raf.seek(io.header.SWavCurrentPos);
                raf.read(buffer);
                io.header.SWavCurrentPos += buffer.length;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

