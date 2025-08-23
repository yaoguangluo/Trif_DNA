package U_V.ESU.toolkitImageToBufferImage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

//新增一个ToolkitImage 变换
//sun 在命名的时候把画图和镜像分不开了, toolkit, image 的注释文档都是按toolkit来的
//, 于是写图片经常要烧脑一下。现在分出来。
//罗瑶光

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

public class U_X_toolkitImageToBufferImage {
    public static BufferedImage _E(Image image, int positionX, int positionY
        , int width, int height, ImageObserver imageObserver) {
        BufferedImage bufferedImage = new BufferedImage(width, height
            , BufferedImage.TYPE_INT_RGB);
        bufferedImage.getGraphics().drawImage(image, positionX, positionY
            , width, height, imageObserver);
        return bufferedImage;
    }
}
