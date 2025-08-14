package DVIAQVIMIV;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展erosion变换. 计算机视觉. 
//硬件工具, imageIO, javaCV.
//因为肽展公式和思想GPL2.0开源, 本程序源码同样GPL2.0开源.
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
public class GetICAStatisticRatio {
    int corr = 15;
    int scale = 7;

    public GetICAStatisticRatio(int scale, int corr) {
        this.scale = scale;
        this.corr = corr;
    }

    public double getPinkStatisticCount(int[][][] rgb) {
        int ri = 255;
        int gi = 0;
        int bi = 255;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getWhiteStatisticCount(int[][][] rgb) {
        int ri = 255;
        int gi = 255;
        int bi = 255;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getPupilStatisticCount(int[][][] rgb) {
        int ri = 255;
        int gi = 0;
        int bi = 255;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getYellowStatisticCount(int[][][] rgb) {
        int ri = 255;
        int gi = 255;
        int bi = 0;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getRedStatisticCount(int[][][] rgb) {
        int ri = 255;
        int gi = 0;
        int bi = 0;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getGreenStatisticCount(int[][][] rgb) {
        int ri = 0;
        int gi = 255;
        int bi = 0;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getBlueStatisticCount(int[][][] rgb) {
        int ri = 0;
        int gi = 0;
        int bi = 255;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getMidPinkStatisticCount(int[][][] rgb) {
        int ri = 128;
        int gi = 0;
        int bi = 128;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getMidWhiteStatisticCount(int[][][] rgb) {
        int ri = 128;
        int gi = 128;
        int bi = 128;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getMidPupilStatisticCount(int[][][] rgb) {
        int ri = 128;
        int gi = 0;
        int bi = 128;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getMidYellowStatisticCount(int[][][] rgb) {
        int ri = 128;
        int gi = 128;
        int bi = 0;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getMidRedStatisticCount(int[][][] rgb) {
        int ri = 128;
        int gi = 0;
        int bi = 0;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getMidGreenStatisticCount(int[][][] rgb) {
        int ri = 0;
        int gi = 128;
        int bi = 0;
        return getCountOfKernel(rgb, ri, gi, bi);
    }

    public double getMidBlueStatisticCount(int[][][] rgb) {
        int ri = 0;
        int gi = 0;
        int bi = 128;
        return getCountOfKernel(rgb, ri, gi, bi);
    }


    public double getCountOfKernel(int[][][] rgb, int ri, int gi, int bi) {
        double count = 0.0;
        for (int i = 0; i < rgb[0].length; i++) {
            for (int j = 0; j < rgb[0][0].length; j++) {
                if (rgb[0][i][j] * scale > ri - corr && rgb[0][i][j] * scale < ri + corr) {
                    if (rgb[1][i][j] * scale > gi - corr && rgb[1][i][j] * scale < gi + corr) {
                        if (rgb[2][i][j] * scale > bi - corr && rgb[2][i][j] * scale < bi + corr) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
