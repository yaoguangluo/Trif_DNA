package U_V.ESU.toolkitImageToBufferImage;


import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
//新增一个ToolkitImage 变换
//sun 在命名的时候把画图和镜像分不开了, toolkit, image 的注释文档都是按toolkit来的
//, 于是写图片经常要烧脑一下。现在分出来。
//罗瑶光

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class U_X_toolkitImageIconToBufferImage {
    public static BufferedImage _E(int positionX, int positionY, ImageIcon imageIcon) {
        BufferedImage bufferedImage = new BufferedImage(imageIcon.getIconWidth(),
            imageIcon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.drawImage(imageIcon.getImage(), positionX, positionY
            , imageIcon.getImageObserver());
        return bufferedImage;
    }
}
