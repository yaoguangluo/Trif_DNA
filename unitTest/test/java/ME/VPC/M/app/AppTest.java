package test.java.ME.VPC.M.app;

import ME.VPC.M.app.App;
import ME.VPC.M.app.App_X;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class AppTest {
    /**
     * Method under test: default or parameterless constructor of {@link App}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.awt.HeadlessException
        //       at java.applet.Applet.<init>(Applet.java:80)
        //       at javax.swing.JApplet.<init>(JApplet.java:141)
        //       at ME.VPC.M.app.App.<init>(App.java:73)
        //   See https://diff.blue/R013 to resolve this issue.

        new App();
    }

    /**
     * Method under test:
     * @throws InterruptedException 
     * @throws IOException 
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testInit() throws IOException, InterruptedException {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: javax.media.Player
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        App_X app = null;
        App NE = null;

        // Act
        app.init(NE);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link App#keyPressed(KeyEvent)}
     *   <li>{@link App#keyTyped(KeyEvent)}
     *   <li>{@link App#mouseClicked(Object)}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKeyPressed() {
        // TODO: Complete this test.
        //   Reason: R081 Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   ME.VPC.M.app.App.<init>().
        //   The arrange section threw
        //   java.awt.HeadlessException
        //       at java.applet.Applet.<init>(Applet.java:80)
        //       at javax.swing.JApplet.<init>(JApplet.java:141)
        //       at ME.VPC.M.app.App.<init>(App.java:73)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        App app = null;
        KeyEvent arg0 = null;

        // Act
        app.keyPressed(arg0);
        KeyEvent arg02 = null;
        app.keyTyped(arg02);
        Object object = null;
        app.mouseClicked(object);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link App#keyReleased(KeyEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testKeyReleased() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: javax.media.Player
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        App app = null;
        KeyEvent arg0 = null;

        // Act
        app.keyReleased(arg0);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link App#actionPerformed(ActionEvent)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testActionPerformed() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: javax.media.Player
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        App app = null;
        ActionEvent arg0 = null;

        // Act
        app.actionPerformed(arg0);

        // Assert
        // TODO: Add assertions on result
    }
}

