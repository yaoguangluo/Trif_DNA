package P_V.PCI.ASQ.ratio;

import P_V.PCI.ASQ.basic.Compute_S;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;

//Theory: Yaoguang.luo
//一种仅仅通过坐标差值叠加来计算距离向量的使用方法。
//Application: Yaoguang.luo
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DistanceRatio {
    //避免其他象限1+的长度逃逸修正, 同时去acsin函数, 循环中巨幅减少计算量。值得尊敬下。
    public static double getDistanceRatio2D_Z(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
        //首先求出两个坐标点的x和y的长度距离。
        double x1 = end.getX();
        double y1 = end.getY();
        double x = end.getX() - begin.getX();//
        double y = end.getY() - begin.getY();
        //不能出现分母为0，
        x = x == 0 ? 0.1 : x;
        y = y == 0 ? 0.1 : y;
        double z = Math.abs(x) + Math.abs(y);//斜边
        //减少无效精度密集点。
        x = Math.abs(x) < 1 ? 0.1 : x;
        y = Math.abs(y) < 1 ? 0.1 : y;
        z = z < 1 ? 0.1 : z;//减少无效精度密集点。
        //这个距离包含四个象限。于是分布来讨论。
        //首先第一种为在第一象限
        if (x > 0 && y > 0) {
            //x y z  1 3 4   3/4  0。75
            //x y️ z  3 3 6   3/6  0。5
            //x y z  3 1 4   1/4  0。25
            //sin角越小，sin比值越小；从小到大排为
            double v = y / z;
            System.out.println("1-x:" + x1 + "y:" + y1 + "--x:" + x + "y:" + y + "v:" + v);
            return v;
        }
        //首先第二种为在第二象限
        if (x < 0 && y > 0) {
            //x y z  -1 3 4  3/4  0.75
            //x y️ z  -3 3 6  3/6  0.5
            //x y z  -3 1 4  1/4  0.25
            //sin角越大，sin比值越大；从小到大排为
            double v = 2 - y / z;
            System.out.println("2-x:" + x1 + "y:" + y1 + "--x:" + x + "y:" + y + "v:" + v);
            return v;
        }
        //首先第三种为在第三象限
        if (x < 0 && y < 0) {
            //x y z  -1 -3  4  -3/4  -0.75
            //x y️ z  -3 -3  6  -3/6  -0.5
            //x y z  -3 -1  4  -1/4  -0.25
            //sin角越小，sin比值越大；从小到大排为
            double v = 3 - y / z;
            System.out.println("3-x:" + x1 + "y:" + y1 + "--x:" + x + "y:" + y + "v:" + v);
            return v;
        }
        //首先第四种为在第四象限
        if (x > 0 && y < 0) {
            //x y z  1 -3  4  -3/4  -0.75
            //x y️ z  3 -3  6  -3/6  -0.5
            //x y z  3 -1  4  -1/4  -0.25
            //sin角越大，sin比值越小；从小到大排为
            double v = 5 + y / z;
            System.out.println("4-x:" + x1 + "y:" + y1 + "--x:" + x + "y:" + y + "v:" + v);
            return v;
        }
        //infinity
        return 0.0;
    }

    //获取斜率梯度
    public static double getDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
        double x = begin.getX() - end.getX();
        double y = begin.getY() - end.getY();
        //infinit
        x = x == 0 ? 0.1 : x;
        y = y == 0 ? 0.1 : y;
        //1象限
        if (x > 0 && y > 0) {
            return Math.abs(x) / Math.abs(y);
        }
        //4象限
        if (x > 0 && y < 0) {
            return 1 + Math.abs(x) / Math.abs(y);
        }
        //2象限
        if (x < 0 && y > 0) {
            return Math.abs(x) / Math.abs(y);
        }
        //3象限
        if (x < 0 && y < 0) {
            return -1 - Math.abs(x) / Math.abs(y);
        }
        //infinity
        return 0.0;
    }

    //降低计算速度来获取高准确斜率梯度 (早期傅里叶思想)
    public static double getARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
        double x = begin.getX() - end.getX();
        double y = begin.getY() - end.getY();
        double z = Math.sqrt(x * x + y * y);
        return Math.asin(x / z) + Math.acos(y / z);
    }

    //降低计算速度来获取两点间线的真实角度
    public static double getTrueARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
        double x = begin.getX() - end.getX();
        double y = begin.getY() - end.getY();
        double z = Math.sqrt(x * x + y * y);
        //1象限
        if (x >= 0 && y >= 0) {
            return Math.asin(Math.abs(x) / z);
        }
        //4象限
        if (x >= 0 && y < 0) {
            return 2 * Compute_S.getPi() - Math.asin(Math.abs(x) / z);
        }
        //2象限
        if (x < 0 && y >= 0) {
            return Compute_S.getPi() - Math.asin(Math.abs(x) / z);
        }
        //3象限
        if (x < 0 && y < 0) {
            return Compute_S.getPi() + Math.asin(Math.abs(x) / z);
        }
        return 0.0;
    }

    //获取计算参照梯度
    public static double getDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) {
        double pi = 3.1415926;
        double x = begin.getX() - end.getX();
        double y = begin.getY() - end.getY();
        double z = begin.getZ() - end.getZ();
        //1象限
        if (x >= 0 && y >= 0) {
            if (z >= 0) {
                return Math.abs(x) / Math.abs(y);
            } else {
                return pi + Math.abs(x) / Math.abs(y);
            }
        }
        //4象限
        if (x >= 0 && y < 0) {
            if (z >= 0) {
                return pi * 6 + Math.abs(x) / Math.abs(y);
            } else {
                return pi * 7 + Math.abs(x) / Math.abs(y);
            }
        }
        //2象限
        if (x < 0 && y >= 0) {
            if (z >= 0) {
                return pi * 2 + Math.abs(x) / Math.abs(y);
            } else {
                return pi * 3 + Math.abs(x) / Math.abs(y);
            }
        }
        //3象限
        if (x < 0 && y < 0) {
            if (z >= 0) {
                return pi * 4 + Math.abs(x) / Math.abs(y);
            } else {
                return pi * 5 + Math.abs(x) / Math.abs(y);
            }
        }
        return 0.0;
    }

    //获取真实三维夹角
    public static double getTrueARCDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) {
        return 0.0;
        //球面参照无效。以后研究下有什么标准规范没。
    }
}
