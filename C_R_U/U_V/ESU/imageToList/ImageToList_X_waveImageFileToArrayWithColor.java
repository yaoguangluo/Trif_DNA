package U_V.ESU.imageToList;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class ImageToList_X_waveImageFileToArrayWithColor {
    //该函数用于股市等波形图片文件转换成数组。根据特征颜色处理。
    public static List<Integer> _E(String FilePath
            , int colorRange) {
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(FilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < bufferedImage.getWidth(); ++i) {
            for (int j = 0; j < bufferedImage.getHeight(); ++j) {
                int color = bufferedImage.getRGB(i, j);
                color = color & 0Xff;
                if (colorRange == color) {
                    output.add(j);
                }
            }
        }
        return output;
    }
}
