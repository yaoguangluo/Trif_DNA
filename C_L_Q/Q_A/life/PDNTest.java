package Q_A.life;

import I_A.IMO.EVU.bi_P.CoDNAAuthorForWord;
import ME.VPC.M.app.App;

import javax.swing.*;
import java.awt.*;
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */

public class PDNTest {
    public static void main(String[] argv) throws InterruptedException {
        App NE = new App();
        Application application = new Application();
        application.IV_();
        try {
            CoDNAAuthorForWord app = null;
            try {
                app = new CoDNAAuthorForWord(NE);
                app.setSize(850, 400);
                app.setVisible(true);
                JFrame f = new JFrame();
                f.add(app);
                f.setTitle("DNA三维观测");
                f.setLocationRelativeTo(null);
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                f.setSize(650, 480);
                f.setVisible(true);
                //app.bootZynkFlowerForest("DNA三维观测", DNNtext, true, NE);
                app.bootDNAFlowerForest("DNA三维观测", application, true);
                //application
            } catch (HeadlessException e1) {
                e1.printStackTrace();
            }
            //	close= false;

        } catch (Exception e) {
        }
    }
}
