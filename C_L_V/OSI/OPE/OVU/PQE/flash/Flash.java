package OSI.OPE.OVU.PQE.flash;

import S_A.SVQ.stable.S_Annotation;

import javax.swing.JFrame;

//作者 +著作权人： 罗瑶光, 浏阳
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Flash extends GUISample {

    @SuppressWarnings(S_Annotation.TAG_DEPRECATION)
    public static void main(String[] args) {
        GUISample NE = new GUISample();
        JFrame frame = new JFrame("Deta ETL 1.0.2");
        frame.setLayout(null);
        frame.resize(800, 440);
        frame.show();
        frame.add(NE);
        NE.init();
        NE.start();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
