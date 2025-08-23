package U_A.PEU.P.image;

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
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * 授课 reinhart 加州路德大学 课后作业。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class ReadWritePng {
    public int h;
    public int w;
    public void writePNG(String args, int[][] outmag) {
        BufferedImage image = new BufferedImage(outmag[0].length, outmag.length
                , BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < image.getHeight(); ++i) {
            for (int j = 0; j < image.getWidth(); ++j) {
                int val = (int) outmag[i][j];
                int pixel = (val << 16) | (val << 8) | (val);
                image.setRGB(j, i, pixel);
            }
        }
        String pathBin = args;//output path
        File outputBin = new File(pathBin);
        try {
            ImageIO.write(image, "png", outputBin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writePNG(String args, int[][][] outmag) {
        BufferedImage image = new BufferedImage(outmag[0][0].length, outmag[0].length
                , BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < image.getHeight(); ++i) {
            for (int j = 0; j < image.getWidth(); ++j) {
                int rval = (int) outmag[0][i][j];
                int gval = (int) outmag[1][i][j];
                int bval = (int) outmag[2][i][j];
                int pixel = (rval << 16) | (gval << 8) | (bval);
                image.setRGB(j, i, pixel);
            }
        }
        String pathBin = args;//output path
        File outputBin = new File(pathBin);
        try {
            ImageIO.write(image, "png", outputBin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ReadWritePng() {
    }

    public int[][] GRNpngRead(String args) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(args));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // extract R, G, B values
        h = image.getHeight();
        w = image.getWidth();
        //20230106-System.out.println(h+"&&"+w);
        int[][] g = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                g[i][j] = image.getRGB(j, i) >> 8 & 0xFF;
            }
        }
        return g;
    }

    public int[][] GRNpngRead(BufferedImage image) {
        // extract R, G, B values
        h = image.getHeight();
        w = image.getWidth();
        //20230106-System.out.println(h+"&&"+w);
        int[][] g = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                g[i][j] = image.getRGB(j, i) >> 8 & 0xFF;
            }
        }
        return g;
    }

    public int[][] REDpngRead(String args) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(args));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // extract R, G, B values
        h = image.getHeight();
        w = image.getWidth();
        int[][] r = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                r[i][j] = image.getRGB(j, i) >> 16 & 0xFF;
                //x, y coordinates opposite to array
            }
        }
        return r;
    }

    public int[][] REDpngRead(BufferedImage image) {
        // extract R, G, B values
        h = image.getHeight();
        w = image.getWidth();
        int[][] r = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                r[i][j] = image.getRGB(j, i) >> 16 & 0xFF;
                //x, y coordinates opposite to array
            }
        }
        return r;
    }

    public int[][] BLUpngRead(String args) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(args));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // extract R, G, B values
        h = image.getHeight();
        w = image.getWidth();
        int[][] b = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                b[i][j] = image.getRGB(j, i) & 0xFF;
            }
        }
        return b;
    }

    public int[][] BLUpngRead(BufferedImage image) {
        // extract R, G, B values
        h = image.getHeight();
        w = image.getWidth();
        int[][] b = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                b[i][j] = image.getRGB(j, i) & 0xFF;
            }
        }
        return b;
    }

    public int[] sizeHW(String args) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(args));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int size[] = new int[2];
        size[0] = image.getHeight();
        size[1] = image.getWidth();
        return size;
    }

    public BufferedImage createBufferImage(int[][] r, int[][] g, int[][] b) {
        BufferedImage image = new BufferedImage(r[0].length, r.length
                , BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < image.getHeight(); ++i) {
            for (int j1 = 0; j1 < image.getWidth(); ++j1) {
                int rr = (int) r[i][j1];
                int gg = (int) g[i][j1];
                int bb = (int) b[i][j1];
                int pixel = (rr << 16) | (gg << 8) | (bb);
                image.setRGB(j1, i, pixel);
            }
        }
        return image;
    }
}		
