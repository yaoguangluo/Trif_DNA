/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package DVIAQVIMIV;

import U_A.PEU.P.image.ReadWritePng;
import U_V.ESU.toolkitImageToBufferImage.U_X_toolkitImageIconToBufferImage;
import U_V.ESU.toolkitImageToBufferImage.U_X_toolkitImageToBufferImage;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展erosion变换. 计算机视觉. 
//硬件工具, imageIO, javaCV.
//因为肽展公式和思想GPL2.0开源, 本程序源码同样GPL2.0开源.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class GetSkinBy {
    public void getSkinBy() {

    }

    public int[][][] getSkinBy(String 图片地址) {
        int[][][] output = new int[3][][];
        int[][] r = new ReadWritePng().REDpngRead(图片地址);
        int[][] g = new ReadWritePng().GRNpngRead(图片地址);
        int[][] b = new ReadWritePng().BLUpngRead(图片地址);
        output[0] = r;
        output[1] = g;
        output[2] = b;
        return output;
    }

    public int[][][] getSkinBy(BufferedImage bufferedImage) {
        int[][][] output = new int[3][][];
        int[][] r = new ReadWritePng().REDpngRead(bufferedImage);
        int[][] g = new ReadWritePng().GRNpngRead(bufferedImage);
        int[][] b = new ReadWritePng().BLUpngRead(bufferedImage);
        output[0] = r;
        output[1] = g;
        output[2] = b;
        return output;
    }

    //稍后去思考imageObserver 是哪个对象
    public int[][][] getSkinBy(Image image, int weigh, int heigh, ImageObserver imageObserver) {
        BufferedImage bufferedImage
            = U_X_toolkitImageToBufferImage._E(image, 0, 0, weigh, heigh, imageObserver);
        int[][][] output = new int[3][][];
        int[][] r = new ReadWritePng().REDpngRead(bufferedImage);
        int[][] g = new ReadWritePng().GRNpngRead(bufferedImage);
        int[][] b = new ReadWritePng().BLUpngRead(bufferedImage);
        output[0] = r;
        output[1] = g;
        output[2] = b;
        return output;
    }

    //...
    public int[][][] getSkinBy(ImageIcon imageIcon) {
        BufferedImage bufferedImage
            = U_X_toolkitImageIconToBufferImage._E(0, 0, imageIcon);
        int[][][] output = new int[3][][];
        int[][] r = new ReadWritePng().REDpngRead(bufferedImage);
        int[][] g = new ReadWritePng().GRNpngRead(bufferedImage);
        int[][] b = new ReadWritePng().BLUpngRead(bufferedImage);
        output[0] = r;
        output[1] = g;
        output[2] = b;
        return output;
    }
}
