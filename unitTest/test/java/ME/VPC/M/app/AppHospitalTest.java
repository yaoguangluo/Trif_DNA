package test.java.ME.VPC.M.app;

import ME.VPC.M.app.App;
import ME.VPC.M.app.AppHospital;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.swing.JTextPane;
import java.awt.event.MouseEvent;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class AppHospitalTest {
    /**
     * Method under test: {@link AppHospital#IV_(JTextPane, App)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIV_() throws InterruptedException {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: javax.media.Player
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AppHospital appHospital = null;
        JTextPane name = null;
        App app = null;

        // Act
        appHospital.IV_(name, app);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AppHospital#mouseDragged(MouseEvent)}
     *   <li>{@link AppHospital#mouseMoved(MouseEvent)}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testMouseDragged() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   ME.VPC.M.app.AppHospital.<init>().
        //   The arrange section threw
        //   java.awt.HeadlessException
        //       at java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:208)
        //       at java.awt.ScrollPane.<init>(ScrollPane.java:201)
        //       at java.awt.ScrollPane.<init>(ScrollPane.java:187)
        //       at ME.VPC.M.app.AppHospital.<init>(AppHospital.java:32)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AppHospital appHospital = null;
        MouseEvent e = null;

        // Act
        appHospital.mouseDragged(e);
        MouseEvent e2 = null;
        appHospital.mouseMoved(e2);

        // Assert
        // TODO: Add assertions on result
    }
}

