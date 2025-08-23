package V_A.VQ.SQ.demos;

import U_A.PEU.P.movie.LYGFileIO;
import U_A.PEU.P.sound.SoundPlay;

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DEMO_LYG_to_WAV {
    public static void main(String args[]) {
        LYGFileIO IO = new LYGFileIO();
        IO.reset();
        IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newlyg.lyg");
        //IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg");
        IO.toHead();
        IO.IV_();
        if (IO.adataFrame != null) {
            new SoundPlay().Play(IO.adataFrame.audioIS);
            while (IO.adataFrame.next != null) {
                IO.adataFrame = IO.adataFrame.next;
                new SoundPlay().Play(IO.adataFrame.audioIS);
            }
        }
        IO.toHead();
        IO.IV_();
        if (IO.adataFrame != null) {
            new SoundPlay().Play(IO.adataFrame.audioIS);
            while (IO.adataFrame.next != null) {
                IO.adataFrame = IO.adataFrame.next;
                new SoundPlay().Play(IO.adataFrame.audioIS);
            }
        }
        if (IO.adataFrame != null) {
            new SoundPlay().Play(IO.adataFrame.audioIS);
            while (IO.adataFrame.next != null) {
                IO.adataFrame = IO.adataFrame.next;
                new SoundPlay().Play(IO.adataFrame.audioIS);
            }
        }

        //20230106-System.out.println("read");
        //IO.reset();
    }
}
