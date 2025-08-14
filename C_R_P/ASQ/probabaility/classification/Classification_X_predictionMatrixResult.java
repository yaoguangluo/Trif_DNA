package ASQ.probabaility.classification;

import P_V.PCI.ASQ.basic.RatioMatrix;

import java.util.Map;

//这个函数用于通过概率轭相似度来进行坐标分类
//思想：贝叶斯 , 数据挖掘绿皮书, 任课教授 ：卡拉森。
//实现：罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 卡拉森， 书记pang。ning。tan 数据挖掘绿皮书
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Classification_X_predictionMatrixResult {
    public static String _E(RatioMatrix input, Map<String, RatioMatrix> groups) {
        String groupKey = null;
        double shortestDistance = 0.0;
        boolean isFirst = true;
        //轭
        double esyn = input.getRightRightRatio() + input.getErrorErrorRatio();
        //double esny= input.getErrorRightRatio()+ input.getRightErrorRatio();若使用该行
        //轭 误差集合请自行校正。罗瑶光20191217
        double yesyn = input.getRightRightRatio() / esyn;
        double nesyn = input.getErrorErrorRatio() / esyn;
        double totalRatio = -yesyn * Math.log(yesyn) - nesyn * Math.log(nesyn);
        //本征
        double esyy = input.getRightRightRatio() + input.getRightErrorRatio();
        double yesyy = input.getRightRightRatio() / esyy;
        double nesyy = input.getRightErrorRatio() / esyy;
        double meany = -yesyy * Math.log(yesyy) - nesyy * Math.log(nesyy);
        double esnn = input.getErrorRightRatio() + input.getErrorErrorRatio();
        double yesnn = input.getErrorRightRatio() / esnn;
        double nesnn = input.getErrorErrorRatio() / esnn;
        double meann = -yesnn * Math.log(yesnn) - nesnn * Math.log(nesnn);
        double deta = totalRatio - meany - meann;
        for (String matrixKey : groups.keySet()) {
            RatioMatrix ratioMatrix = groups.get(matrixKey);
            //采样
            double tesyy = ratioMatrix.getRightRightRatio() + ratioMatrix.getRightErrorRatio();
            double tyesyy = ratioMatrix.getRightRightRatio() / tesyy;
            double tnesyy = ratioMatrix.getRightErrorRatio() / tesyy;
            double tmeany = -tyesyy * Math.log(tyesyy) - tnesyy * Math.log(tnesyy);
            double tesnn = ratioMatrix.getErrorRightRatio() + ratioMatrix.getErrorErrorRatio();
            double tyesnn = ratioMatrix.getErrorRightRatio() / tesnn;
            double tnesnn = ratioMatrix.getErrorErrorRatio() / tesnn;
            double tmeann = -tyesnn * Math.log(tyesnn) - tnesnn * Math.log(tnesnn);
            double tdeta = totalRatio - tmeany - tmeann;
            //取值
            if (isFirst) {
                isFirst = false;
                shortestDistance = Math.abs(deta - tdeta);
                groupKey = matrixKey;
            } else {
                if (Math.abs(deta - tdeta) < shortestDistance) {
                    shortestDistance = Math.abs(deta - tdeta);
                    groupKey = matrixKey;
                }
            }
        }
        //输出
        return groupKey;
    }
}
