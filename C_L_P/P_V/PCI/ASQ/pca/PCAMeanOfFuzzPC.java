package P_V.PCI.ASQ.pca;

import P_V.PCI.ASQ.basic.RatioMatrix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//这个函数用于求模糊概率集平均值采样主要成份分析
//思想：贝叶斯 模糊数学 统计于概率论
//实现：罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PCAMeanOfFuzzPC {
    public static RatioMatrix getSimilarFuzzSetWithScale(RatioMatrix input, List<RatioMatrix> groups
        , double scale) {
        List<RatioMatrix> output = new ArrayList<>();
        Iterator<RatioMatrix> iterators = groups.iterator();
        while (iterators.hasNext()) {
            RatioMatrix ratio = iterators.next();
            double rightRightMean = ratio.getRightRightRatio();
            double rightErrorMean = ratio.getRightErrorRatio();
            double errorRightMean = ratio.getErrorRightRatio();
            double errorErrorMean = ratio.getErrorErrorRatio();
            double predictionRightRight = Math.abs(input.getRightRightRatio() - rightRightMean);
            double predictionRightError = Math.abs(input.getRightErrorRatio() - rightErrorMean);
            double predictionErrorRight = Math.abs(input.getErrorRightRatio() - errorRightMean);
            double predictionErrorError = Math.abs(input.getErrorErrorRatio() - errorErrorMean);
            double tempSumRight = predictionRightRight + predictionRightError + predictionErrorRight
                + predictionErrorError;
            if (tempSumRight < scale) {
                output.add(ratio);
            }
        }
        RatioMatrix outputMean = new RatioMatrix();
        Iterator<RatioMatrix> iteratorsOutput = output.iterator();
        while (iteratorsOutput.hasNext()) {
            RatioMatrix ratio = iteratorsOutput.next();
            outputMean.I_ErrorErrorRatio(ratio.getErrorErrorRatio() + outputMean.getErrorErrorRatio());
            outputMean.I_ErrorRightRatio(ratio.getErrorRightRatio() + outputMean.getErrorRightRatio());
            outputMean.I_RightErrorRatio(ratio.getRightErrorRatio() + outputMean.getRightErrorRatio());
            outputMean.I_RightRightRatio(ratio.getRightRightRatio() + outputMean.getRightRightRatio());
        }
        outputMean.I_ErrorErrorRatio(outputMean.getErrorErrorRatio() / output.size());
        outputMean.I_ErrorRightRatio(outputMean.getErrorRightRatio() / output.size());
        outputMean.I_RightErrorRatio(outputMean.getRightErrorRatio() / output.size());
        outputMean.I_RightRightRatio(outputMean.getRightRightRatio() / output.size());
        return outputMean;
    }
}
