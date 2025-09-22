package U_V.ESU.imageToList;

import S_A.pheromone.IMV_SIQ;

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

public class ImageToList_X_waveImageFileToArrayMapWithBlack {
    //该函数用于股市等波形图片文件转换成相同颜色数组分类集合。
    public static IMV_SIQ _E(String FilePath) {
        IMV_SIQ output = new IMV_SIQ();
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(new File(FilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < bufferedImage.getWidth(); ++i) {
            for (int j = 0; j < bufferedImage.getHeight(); ++j) {
                int color = bufferedImage.getRGB(i, j);
                color = color & 0Xff;
                List<Integer> pointRange;
                if (output.containsKey(color)) {
                    pointRange = output.getList(color);
                } else {
                    pointRange = new ArrayList<>();
                }
                pointRange.add(j);
                output.putList(color, pointRange);
            }
        }
        return output;
    }
}
