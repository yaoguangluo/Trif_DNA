package U_V.ESU.image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
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

public class Image_ESU_X_pixRGBTableToFile {
    public static void _E(String pngOutputPath, int[][] pixRed
        , int[][] pixGreen, int[][] pixBlue, String fileType) {
        BufferedImage bufferedImage = new BufferedImage(pixRed[0].length
            , pixRed.length, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < bufferedImage.getHeight(); ++i) {
            for (int j = 0; j < bufferedImage.getWidth(); ++j) {
                bufferedImage.setRGB(j, i, (pixRed[i][j] << 16)
                    | (pixGreen[i][j] << 8) | (pixBlue[i][j]));
            }
        }
        try {
            ImageIO.write(bufferedImage, fileType, new File(pngOutputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
