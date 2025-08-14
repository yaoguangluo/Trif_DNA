package ASQ.probabaility.classification;

import P_V.PCI.ASQ.basic.RatioMatrix;

import java.util.List;

//这个函数用于通过概率轭相似度来进行坐标分类
//思想：贝叶斯 , 数据挖掘绿皮书, 任课教授 ：卡拉森。
//实现：罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 卡拉森， 书籍 pang.ningtan 数据挖掘绿皮书
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Classification_X_predictionResult {
    public static boolean _E(RatioMatrix input
        , List<RatioMatrix> groups) {
        double rightRightMean = 0.0;
        double rightErrorMean = 0.0;
        double errorRightMean = 0.0;
        double errorErrorMean = 0.0;
        //成功集
        for (RatioMatrix ratio : groups) {
            rightRightMean += ratio.getRightRightRatio();
            rightErrorMean += ratio.getRightErrorRatio();
            errorRightMean += ratio.getErrorRightRatio();
            errorErrorMean += ratio.getErrorErrorRatio();
        }
        rightRightMean = rightRightMean / groups.size();
        rightErrorMean = rightErrorMean / groups.size();
        errorRightMean = errorRightMean / groups.size();
        errorErrorMean = errorErrorMean / groups.size();
        //决策轭
        double predictionRightRight = input.getRightRightRatio() - rightRightMean;
        double predictionRightError = input.getRightErrorRatio() - rightErrorMean;
        double predictionErrorRight = input.getErrorRightRatio() - errorRightMean;
        double predictionErrorError = input.getErrorErrorRatio() - errorErrorMean;
        //迪摩根轭集 因为考虑到在质量检测项目中的适用性, 进行了乘积修改如下。
        if (predictionRightRight >= 0 && predictionRightError <= 0
            && predictionErrorRight >= 0 && predictionErrorError <= 0) {
            //to do fixlater
            //return true;
            System.out.println(true);
        }
        return true;
    }
}
