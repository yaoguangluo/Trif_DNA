package V_A.VQ.SQ.demos;

import U_A.PEU.P.movie.*;

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class DEMO_WAV_TO_LYG {
    public static void main(String[] args) {
        //String wavInputFile=new String("C:\\Users\\yaoguang\\Desktop\\study\\sound\\AHag.wav");
        String wavInputFile
            = "C:\\Users\\yaoguang\\Desktop\\study\\sound\\luo.wav";
        String lygOutputFile
            = "C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg";
        new WAVtoLYG(wavInputFile, lygOutputFile);
    }
}
