package P.image;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 reinhart，思想 computer vision绿皮书
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Reflection {
    //reinhart路德 上课给我们的。
    public static int[][] PadImage(int[][] _image, int height, int width) {
        int lines = _image.length;
        int samples = _image[0].length;
        int padded_lines = lines + height - 1;
        int padded_samples = samples + width - 1;
        int[][] paddedImage = new int[padded_lines][padded_samples];
        int halfWidth = width / 2;
        int halfHeight = height / 2;
        // -- Fill interior of padded array with actual image.
        for (int i = 0; i < lines; ++i) {
            System.arraycopy(_image[i], 0, paddedImage[i + halfHeight]
                , halfWidth, samples);
        }
        // -- Fill border of padded array with a mirror image of
        //    the actual image reflected about the boundaries.
        // left border
        for (int i = 0; i < lines; ++i) {
            for (int j = 0, oj = halfWidth - 1; j < halfWidth; ++j, --oj) {
                paddedImage[i + halfHeight][oj] = _image[i][j];
            }
        }
        // right border
        for (int i = 0; i < lines; ++i) {
            for (int j = samples - halfWidth, oj = samples + (2 * halfWidth) - 1
                 ; j < samples; ++j, --oj) {
                paddedImage[i + halfHeight][oj] = _image[i][j];
            }
        }
        // top border
        for (int i = 0, oi = halfHeight - 1; i < halfHeight; ++i, --oi) {
            System.arraycopy(_image[i], 0, paddedImage[oi], halfWidth, samples);
        }
        // bottom border
        for (int i = lines - halfHeight, oi = lines + (2 * halfHeight) - 1; i < lines; ++i, --oi) {
            System.arraycopy(_image[i], 0, paddedImage[oi], halfWidth, samples);
        }
        // top left corner
        for (int i = 0; i < halfHeight; ++i) {
            for (int j = 0, oj = halfWidth - 1; j < halfWidth; ++j, --oj) {
                paddedImage[i][oj] = paddedImage[i][j + halfWidth];
            }
        }
        // bottom right corner
        for (int i = lines + halfHeight; i < lines + (2 * halfHeight); ++i) {
            for (int j = samples, oj = samples + (2 * halfWidth) - 1
                 ; j < samples + halfWidth; ++j, --oj) {
                paddedImage[i][oj] = paddedImage[i][j];
            }
        }
        // top right corner
        for (int i = 0; i < halfHeight; ++i) {
            for (int j = samples, oj = samples + (2 * halfWidth) - 1
                 ; j < samples + halfWidth; ++j, --oj) {
                paddedImage[i][oj] = paddedImage[i][j];
            }
        }
        // bottom left corner
        for (int i = lines + halfHeight; i < lines + (2 * halfHeight); ++i) {
            for (int j = 0, oj = halfWidth - 1; j < halfWidth; ++j, --oj) {
                paddedImage[i][oj] = paddedImage[i][j + halfWidth];
            }
        }
        return paddedImage;
    }
}
