package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import P_V.PCI.ASQ.basic.RatioMatrix;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import P_V.PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import P_V.PCI.ASQ.demension.Line2D;
import P_V.PCI.ASQ.demension.Line3D;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//进行了test 的main 整理, 还没有测试, 稍后。
//可以用的 一些老接口见 http://tinos.qicp.vip/data.html
//著作权人 + 作者= 罗瑶光
public interface StaticFunctionMapP_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();


    //public static  数据预测static 全部统计下

    //	坐标类
    //	完善了欧基里德 熵增距离位移标记算法 20191216 罗瑶光
    //	完善了欧基里德 距离重心算法 20191216 罗瑶光
    //	完善了基于2维重心曲度射极斜率探测坐标雷达算法来获取边缘, 比常规 边缘小线段集合梯度计算快600倍。
    //20191216 罗瑶光
    //	完善了基于3维重心曲度射极斜率探测坐标雷达算法来获取边缘, 比常规 边缘小线段集合梯度计算快600倍。
    // 20191218 罗瑶光
    //	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/SideEnd.java
    //
    public List<AMV_MVS_VSQ_2D> getSideEnd2D(App NE);

    public List<AMV_MVS_VSQ_3D> getSideEnd3D(App NE);


    //	完善了极快速欧基里德动态坐标簇分类算法 20191217 罗瑶光
    //	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/PositionClasification.java
    //
    public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithoutHeart(App NE);

    public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithHeart(App NE);

    //position

    public List<AMV_MVS_VSQ_2D> getShortestSamplePosition2DGroup(App NE);

    public Map<Double, List<AMV_MVS_VSQ_2D>>
    getShorterSamplePosition2DGroupsWithScale(App NE);

    public List<AMV_MVS_VSQ_3D>
    getShortestSamplePosition3DGroup(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>>
    getShortestSamplePosition3DGroupsWithScale(App NE);

    //	完善了带精度 欧基里德 2维坐标团 切裂算法 20191219 罗瑶光
    //	完善了带精度 欧基里德 2维坐标集 重心熵 融聚算法 20191219 罗瑶光
    //	完善了带精度 欧基里德 3维坐标团 切裂算法 20191219 罗瑶光
    //	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/Fissile.java
    //
    public Map<Double, List<AMV_MVS_VSQ_2D>> fissilePosition2D(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>> fissilePosition3D(App NE);

    //	完善了带精度 欧基里德 3维坐标集 重心熵 融聚算法 20191219 罗瑶光
    //	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/Fusion.java
    //
    public Map<Double, List<AMV_MVS_VSQ_2D>> fusionPosition2DwithHeart(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>> fusionPosition3DwithHeart(App NE);

    //	完善了带精度 2维 (非欧拉权距)商旅路径团簇 隔离 算法 20191220 罗瑶光
    //	完善了带精度 3维 (非欧拉权距)商旅路径团簇 隔离 算法 20191220 罗瑶光
    //	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/isolation/Isolation.java
    //
    public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPIsolationGroups2D(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPIsolationGroups3D(App NE);

    //	完善了带精度 2维 商旅路径团簇 森林单元 隔离 算法 20191220 罗瑶光
    //	完善了带精度 3维 商旅路径团簇 森林单元 隔离 算法 20191220 罗瑶光
    //	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/isolation/ForestIsolation.java
    //
    public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPForestIsolationGroups2D(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPForestIsolationGroups3D(App NE);

    //	完善 2维 坐标集 切裂 重心 轨迹 跟踪算法 20191221 罗瑶光
    //	完善 3维 坐标集 切裂 重心 轨迹 跟踪算法 20191221 罗瑶光
    //	https://gitee.com/DetaChina/Data_Prediction/tree/master/src/org/tinos/deta/trace
    //
    public List<AMV_MVS_VSQ_2D> trackTracePosition2DHeartsWithSingerGroup(App NE);

    public List<AMV_MVS_VSQ_3D> trackTracePosition3DHeartsWithSingerGroup(App NE);

    public List<AMV_MVS_VSQ_2D> trackTracePosition2DByHearts(App NE);

    public List<AMV_MVS_VSQ_3D> trackTracePosition3DByHearts(App NE);

    public Map<Double, List<AMV_MVS_VSQ_2D>> trackTracePosition2DHeartsWithFissileGroups(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>> trackTracePosition3DHeartsWithFissileGroups(App NE);

    //	完善增加 2维 坐标重心轨迹跟踪算法 20191221 罗瑶光
    //	完善增加 3维 坐标重心轨迹跟踪算法 20191221 罗瑶光
    //	增加 2维 带精度匹配最短最近重心团切融算法 20191223 罗瑶光
    //	增加 3维 带精度匹配最短最近重心团切融算法 20191223 罗瑶光
    //	增加 2维基于带精度 最短 重心位移 路径坐标集团采样 算法 20191223 罗瑶光
    //	增加 3维基于带精度 最短 重心位移 路径坐标集团采样 算法 20191223 罗瑶光
    //	增加了2维精度距离内 坐标集 筛选算法。 20191223 罗瑶光
    //	增加了3维精度距离内 坐标集 筛选算法。 20191223 罗瑶光
    //	增加了 小于重心距离精度内 2维坐标团集合筛选 算法 20191223 罗瑶光
    //	增加了 小于重心距离精度内 3维坐标团集合筛选 算法 20191223 罗瑶光
    //	增加了 2维 融聚团 宇宙重心算法 20191224 罗瑶光
    //	增加了 3维 融聚团 宇宙重心算法 20191224 罗瑶光
    //	增加了 2维 精度 子集数量内 融聚团 筛选算法 20191224 罗瑶光
    //	增加了 3维 精度 子集数量内 融聚团 筛选算法 20191224 罗瑶光
    //	增加了 2维 坐标团的带精度计算 主要有效距离成份集的平均压强算法 20191225 罗瑶光
    //	增加了 3维 坐标团的带精度计算 主要有效距离成份集的平均压强算法 20191225 罗瑶光
    //	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java
    //
    public double findMeanDistanceFromPositions2D(App NE);

    public double findMeanDistanceFromPositions3D(App NE);

    //	增加了 2维 坐标团中 每一个坐标与精度数邻接坐标集的最小距离平均值比上 整体平均值来 获取的不稳定状态观测/预测（斥力, 活性）算法。 20191225 罗瑶光
    //	增加了 3维 坐标团中 每一个坐标与精度数邻接坐标集的最小距离平均值比上 整体平均值来 获取的不稳定状态观测/预测（斥力, 活性）算法。 20191225 罗瑶光
    //	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java
    //
    public double[]  findPascalMeanDistanceByEachPositions2D(App NE);

    public double[]  findPascalMeanDistanceByEachPositions3D(App NE);

    //	增加了 2维 坐标集的计算观测优化函数 和 观测宽度差 求值 20191225 罗瑶光
    //	增加了 3维 坐标集的计算观测优化函数 和 观测宽度差 求值 20191225 罗瑶光
    //	增加了 2维 坐标集隐藏运动趋势预测算法 20191226 罗瑶光
    //	增加了 3维 坐标集隐藏运动趋势预测算法 20191226 罗瑶光
    //	增加了 2, 3 求坐标团集的中心和重心集 算法 并做了局部认知优化 20191226 罗瑶光
    //	增加了 2, 3维 通过坐标团的 精度匹配分割的内部坐标聚类团 进行 每个聚类团的 重心和中心距离 求解 获取有效的团稳定观测数据模型 20191227 罗瑶光
    //	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPositionsGroupPascalHearts.java
    //
    public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalHearts(App NE);

    public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalHearts(App NE);

    public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalMids(App NE);

    public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalMids(App NE);

    public Map<Double, Line2D> getPosition2DsGroupPascalDirection2DMap(App NE);

    public Map<Double, Line3D> getPosition3DsGroupPascalDirection3DMap(App NE);

    public Map<Double, Line3D> getPosition3DsGroupPascalDirection3D(App NE);

    public Map<Double, Line2D> getPosition2DsGroupPascalDirection2D(App NE);

    //	增加了 2, 3维 临近2个坐标团的相互引力比的算法建模观测, 小于1 吸引, 大于1 排斥。 20191227 罗瑶光
    //	增加了 2, 3维 支持高达1亿坐标 的 极速欧拉微分回路 商旅路径计算 的 TSP算法 1代 20200112 罗瑶光
    //	增加了 2, 3维 支持高达1亿坐标 的 极速欧拉微分回路 商旅路径计算 的 TSP算法 2, 3代 20200317 罗瑶光
    //	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP2D.java
    //	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP3D.java
    public List<Line2D> getYaoguangLuo2DEulerRingTSP(App NE);

    public List<Line3D> getYaoguangLuo3DEulerRingTSP(App NE);

    public List<Line2D> getYaoguangLuo2DEulerRingTSP2D(App NE);

    public List<Line3D> getYaoguangLuo3DEulerRingTSP2D(App NE);

    public List<Line2D> getYaoguangLuo2DEulerRingTSP3D(App NE);

    public List<Line3D> getYaoguangLuo3DEulerRingTSP3D(App NE);

    //
    //	增加了 2, 3维 根据坐标的重心轨迹来求解其坐标集的反演函数。 20200414 罗瑶光
    //	概率类
    //	完善了贝叶斯决策树矩阵轭相似度匹配算法 20191217 罗瑶光
    //	完善了贝叶斯决策树轭校验评估算法 20191217 罗瑶光
    //	增加findMean 函数集, 纠正 findSumOfDoubleMatrix3D 函数 20191222 罗瑶光
    //	增加了增量比 函数 20191223 罗瑶光
    //	增加 模糊概率集相似成份采样。20191223 罗瑶光
    //	增加 带精度有效概率集合采样。20191223 罗瑶光
    //	增加了 相似概率集 有效成份过滤 的PCA 均值采样算法 20191223 罗瑶光
    //	增加了 数组排序后, 对最大最小精度百分比数值过滤后的 中间主要有效成份 的 mean 求解算法。 20191226 罗瑶光
    //	增加了 求指定像素在图片中的像素占比算法。 20200301 罗瑶光
    //	增加了 用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的簇数量占比算法。 20200301 罗瑶光
    //	增加了 用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的像素占比求解算法。 20200301 罗瑶光
    //	数组类
    //	增加 进行精度误差 线性和2分匹配 来获取质量是否属于合格状态算法 20191228 罗瑶光
    //	增加 进行2维和3维的像素矩阵中2分极值分类 来进行 map坐标转化观测 算法 20190229 罗瑶光
    //	增加 将shareholder分层处理的图片像素数据 按指定的精度和对应像素进行按像素团的大小进行特定过滤算法 20190302 罗瑶光
    //	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/image/ImagePixGroupFilter.java
    //
    public int[][] getImagePix2DGroupFilter(App NE);

    public int[][][] getImagePix3DGroupFilter(App NE);


    //	增加 将像素矩阵指定的RBG颜色值拿出来形成波形数列输出算法 20190303 罗瑶光
    //	增加 2, 3维 带精度 矩阵中非有效成份筛选过滤算法 20190303 罗瑶光
    //	NLP
    //	NLP Algorithm of Matching The POS Scored Sentence 20191228 Yaoguang. Luo
    //	NLP Algorithm of Matching The POS Scored Sentences 20191229 Yaoguang. Luo
    //	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/NLP/NLPTopicMatch.java
    //
    public String NLPBestSentenceMatch(App NE);

    //<<NLP Algorithm of Matching The POS Scored Sentences>>.
    //This prediction algorithm mostly used for matching the ranged sample sentences by using score method.
    //Theory: Yaoguang.Luo 20191229
    //Application: Yaoguang.Luo
    //Attention: need Deta Parser API OSS
    //sortStackRange: for the sort stacks filter scale
    //filterRate: for how many sets need to delete
    public List<String> NLPBestSentencesMatch(App NE);

    public double[]  getNLPBestSentencesMatchScore(App NE);

    public double[]  getNLPBestSentencesMatchScoreRights(App NE);

    //这个函数用于进行精度误差匹配 获取质量是否属于合格状态。
    public boolean getErrorAsserts(App NE);

    public boolean getBinaryErrorAsserts(App NE);


    //统计
    public double findTotalIncrementWithScale(App NE);

    public double findMeanIncrementWithScale(App NE);

    //平均
    public double findMeanOfFilterDoubleArrayWithScale(App NE);

    public double findMeanOfDoubleArray(App NE);

    public double[]  findMeanOfTwoDoubleArray(App NE);

    public double[] [] findMeanOfTwoDoubleArray2D(App NE);

    public double findMeanOfDoubleMatrix2D(App NE);

    public double[]  findRowMeanOfDoubleMatrix2D(App NE);

    public double[]  findCulumnMeanOfDoubleMatrix2D(App NE);

    public double findMeanOfDoubleMatrix3D(App NE);

    public double findMeanOfDoubleList(App NE);

    public double[]  findMeanOfMartrix1DList(App NE);

    public double[] [] findMeanOfMartrix2DList(App NE);

    //求和
    public double findSumOfDoubleArray(App NE);

    public double[]  findSumOfTwoDoubleArray(App NE);

    public double[] [] findSumOfTwoDoubleArray2D(App NE);

    public double findSumOfDoubleMatrix2D(App NE);

    public double[]  findRowSumOfDoubleMatrix2D(App NE);

    public double[]  findCulumnSumOfDoubleMatrix2D(App NE);

    public double findSumOfDoubleMatrix3D(App NE);

    public double findSumOfDoubleList(App NE);

    public double[]  findSumOfMartrix1DList(App NE);

    public double[] [] findSumOfMartrix2DList(App NE);

    //计数
    public double getShareholdCount(App NE);

    //评估
    public boolean encodeEstimateSumOfScoresList(App NE);

    public boolean encodeEstimateSumOfScoresArray(App NE);

    public boolean getEstimateCartesianSumOfScoresArray(App NE);

    public boolean getEstimateCartesian1DSumOfScoresArray(App NE);

    public boolean[] encodeEstimateInitonsScore(App NE);

    public boolean[] decodeEstimateInitonsScore(App NE);

    public double[]  getRightsEstimateScore(App NE);

    //这个函数用于求模糊概率集平均值采样主要成份分析
    public RatioMatrix getSimilarFuzzSetWithScale(App NE);

    public RatioMatrix getSimilarFuzzSet(App NE);

    public List<RatioMatrix> getSimilarFuzzSetListWithScale(App NE);

    //ratio
    public double getDistanceRatio2D(App NE);

    //降低计算速度来获取高准确斜率梯度 (早期傅里叶思想)
    public double getARCDistanceRatio2D(App NE);

    //降低计算速度来获取两点间线的真实角度
    public double getTrueARCDistanceRatio2D(App NE);

    //获取计算参照梯度
    public double getDistanceRatio3D(App NE);

    //获取真实三维夹角
    public double getTrueARCDistanceRatio3D(App NE);

    public List<Double> getPercentListByOuterKey(App NE);

    public void kernel(App NE);

    public void kernelFix(App NE);

    public double findTotalIncrementRatioWithScale(App NE);

    public double findMeanIncrementRatioWithScale(App NE);


    //比较简单的鸡尾酒频率盲分割
    public double[]  frequencyUpSplit(App NE);

    public double[]  frequencyDownSplit(App NE);

    public double[]  frequencyUpSplitWithScale(App NE);

    public double[]  frequencyDownSplitWithScale(App NE);

    public boolean predictionResult(App NE);

    public String predictionMatrixResult(App NE);

    //image
    //思想：统计与概率论
    //作者：罗瑶光
    //将shareholder分层处理的图片像素数据进行 分类归类统计输出
    public Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> getImagePixClassificationMap(App NE);

    public Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> getImagePixClassificationMap3D(App NE);

    public int[] getVWaveFromImagePix(App NE);

    public int[] getHWaveFromImagePix(App NE);

    public double getPixPercentByDeterPix(App NE);

    //这个函数用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的簇数量占比。
    public double getClusterPercentByDeterPixGroup(App NE);

    //这个函数用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的像素占比。
    public double getPixPercentByDeterPixGroup(App NE);

    //FusionPCAFilter{
    public Map<Double, List<AMV_MVS_VSQ_2D>> filterFusion2DSetsWithCountScale(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>> filterFusion3DSetsWithCountScale(App NE);

    //PCA_AMV_MVS_VSQ_Filter
    public List<AMV_MVS_VSQ_2D> filterPosition2DsWithScaledDistance(App NE);

    public List<AMV_MVS_VSQ_3D> filterPosition3DsWithScaledDistance3DList(App NE);

    public Map<Double, List<AMV_MVS_VSQ_2D>> filterPosition2DsWithScaledDistanceMap2D(App NE);

    public Map<Double, List<AMV_MVS_VSQ_3D>> filterPosition3DsWithScaledDistanceMap3D(App NE);

    //Percentage{
    public List<Double> getPercentListByOuterKeyDoubleList(App NE);

    public double[]  getPercentArrayByOuterKeyArray(App NE);

    public double[]  getEachPercentSetOfDoubleArray(App NE);

    public double[] [] getPercentArrayByOuterKey(App NE);

    public double[] [] getEachPercentSetOfArray(App NE);
}
