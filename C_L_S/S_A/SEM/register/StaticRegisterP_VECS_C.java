package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapP_VECS_C;
import S_A.SEM.bloom.StaticFunctionMapP_VECS_E;
import S_A.SEM.bloom.StaticRootMap;

import java.util.Iterator;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342 
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticRegisterP_VECS_C {
	public static void load(StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_E) {
		
		//稍后封装
		StaticFunctionMapP_VECS_C.annotationMap.put("aNNTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("dNNTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("rNNTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("sensingTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("educationLevelTest", "input:_AE");
		StaticFunctionMapP_VECS_C.annotationMap.put("literarinessLevelTest"
				, "input:emotionMap_E:emotionInit:ratioMap_E");
		StaticFunctionMapP_VECS_C.annotationMap.put("successICATest"
				, "input:emotionMap_E:emotionInit:ratioMap_E:successICATest");//之后这种注册方式统一在花粉api中登记，
		StaticFunctionMapP_VECS_C.annotationMap.put("getSideEnd2D", "list:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getSideEnd3D", "list:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("addNewPositionWithoutHeart", "groups:position2D:scaleDistance");
		StaticFunctionMapP_VECS_C.annotationMap.put("addNewPositionWithHeart", "groups:position2D:hearts:scaleDistance");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShortestSamplePosition2DGroup", "inputHeart:groups");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShorterSamplePosition2DGroupsWithScale", "inputHeart:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShortestSamplePosition3DGroup", "inputHeart:groups");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShortestSamplePosition3DGroupsWithScale", "inputHeart:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fissilePosition2D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fissilePosition3D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fusionPosition2DwithHeart", "groups:groupsHeart：scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fusionPosition3DwithHeart", "groups:groupsHeart:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPIsolationGroups2D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPIsolationGroups3D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPForestIsolationGroups2D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPForestIsolationGroups3D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition2DHeartsWithSingerGroup", "coods");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition3DHeartsWithSingerGroup", "coods");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition2DByHearts", "hearts");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition3DByHearts", "hearts");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition2DHeartsWithFissileGroups", "coods:distanceScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition3DHeartsWithFissileGroups", "coods:distanceScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanDistanceFromPositions2D"
				, "position2Ds:observerPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanDistanceFromPositions3D"
				, "position3Ds:observerPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findPascalMeanDistanceByEachPositions2D"
				, "position2Ds:observerPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findPascalMeanDistanceByEachPositions3D"
				, "position3Ds:observerPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalHearts", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalHearts", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalMids", "groups:scale");
	
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalMids", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalDirection"
				, "pascalHearts:pascalMids");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalDirection"
				, "pascalHearts:pascalMids");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalDirection", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalDirection", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo2DEulerRingTSP", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo3DEulerRingTSP", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo2DEulerRingTSP2D", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo3DEulerRingTSP2D", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo2DEulerRingTSP3D"
				, "positions:sortRangeScale:sortDeepsScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo3DEulerRingTSP3D"
				, "positions:sortRangeScale:sortDeepsScale");
		
		StaticFunctionMapP_VECS_C.annotationMap.put("getImagePix2DGroupFilter", "inputPixMatrix:RBG:distanceScale:max:min");
		StaticFunctionMapP_VECS_C.annotationMap.put("getImagePix3DGroupFilter", "inputPixMatrix:RBG:distanceScale:max:min");
		StaticFunctionMapP_VECS_C.annotationMap.put("NLPBestSentenceMatch", "searchString:sampleSentences");
		StaticFunctionMapP_VECS_C.annotationMap.put("NLPBestSentencesMatch", "searchString:sampleSentences:sortStackRange:filterRate");
		StaticFunctionMapP_VECS_C.annotationMap.put("getNLPBestSentencesMatchScore", "searchString:sampleSentences");
		StaticFunctionMapP_VECS_C.annotationMap.put("getNLPBestSentencesMatchScoreRights"
				, "searchString:sampleSentences:_A:nlp:keyMap");
		StaticFunctionMapP_VECS_C.annotationMap.put("getErrorAsserts", "inputValue:matchValues:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getBinaryErrorAsserts"
				, "inputValue:matchValues:scale:sortStackRange:isSort");
		StaticFunctionMapP_VECS_C.annotationMap.put("findTotalIncrementWithScale", "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanIncrementWithScale", "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfFilterDoubleArrayWithScale"
				, "input:filterScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleArray", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfTwoDoubleArray", "origin:input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfTwoDoubleArray2D", "origin:input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findRowMeanOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findCulumnMeanOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleMatrix3D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfMartrix1DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfMartrix2DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleArray", "input");	
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfTwoDoubleArray", "origin, input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfTwoDoubleArray2D", "origin, input");
		
	 
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findRowSumOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findCulumnSumOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleMatrix3D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfMartrix1DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfMartrix2DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShareholdCount", "input:sharehold");
		
		StaticFunctionMapP_VECS_C.annotationMap.put("encodeEstimateSumOfScoresList", "scores:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("encodeEstimateSumOfScoresArray", "scores:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("getEstimateCartesianSumOfScoresArray"
				, "input:EstimateRatios:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("getEstimateCartesian1DSumOfScoresArray"
				, "inputs:EstimateRatios:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("encodeEstimateInitonsScore", "input:EstimateRatios:estimateValue");
		
		StaticFunctionMapP_VECS_C.annotationMap.put("decodeEstimateInitonsScore", "input:EstimateRatios:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("getRightsEstimateScore", "inputs:rights");
		StaticFunctionMapP_VECS_C.annotationMap.put("getSimilarFuzzSetWithScale", "input:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getDistanceRatio2D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getARCDistanceRatio2D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTrueARCDistanceRatio2D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getDistanceRatio3D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTrueARCDistanceRatio3D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentListByOuterKey", "array");
		StaticFunctionMapP_VECS_C.annotationMap.put("kernel", "output:array:j");
		StaticFunctionMapP_VECS_C.annotationMap.put("kernelFix", "output:array:j");
		StaticFunctionMapP_VECS_C.annotationMap.put("findTotalIncrementRatioWithScale"
				, "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanIncrementRatioWithScale"
				, "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyUpSplit"
				, "originFrequency:compareFrequency");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyDownSplit"
				, "originFrequency:compareFrequency");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyUpSplitWithScale"
				, "originFrequency:compareFrequency:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyDownSplitWithScale"
				, "originFrequency:compareFrequency:scale");

	

		StaticFunctionMapP_VECS_C.annotationMap.put("predictionResult"
				, "input:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("predictionMatrixResult"
				, "input:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getImagePixClassificationMap"
				, "pixMap");
		StaticFunctionMapP_VECS_C.annotationMap.put("getVWaveFromImagePix"
				, "pixMap:RGB");
		StaticFunctionMapP_VECS_C.annotationMap.put("getHWaveFromImagePix"
				, "pixMap:RGB");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPixPercentByDeterPix"
				, "imagePix:scaleRBG");
		StaticFunctionMapP_VECS_C.annotationMap.put("getClusterPercentByDeterPixGroup"
				, "imagePix:scaleSUM");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPixPercentByDeterPixGroup"
				, "imagePix:scaleSUM");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterFusion2DSetsWithCountScale"
				, "groups:countScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterFusion3DSetsWithCountScale"
				, "groups:countScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition2DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition3DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition2DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition3DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentListByOuterKey", "list:key");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentArrayByOuterKey", "array:key");
		StaticFunctionMapP_VECS_C.annotationMap.put("getEachPercentSetOfArray", "array");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentArrayByOuterKey", "array:key");
	
		Iterator<String> iterators= StaticFunctionMapP_VECS_C.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			StaticRootMap.staticBloomingTimes.put(temp, (long) 0);
			StaticRootMap.staticClass_XE_Map.put(temp, "P_VECS");
		}
	}	
}
