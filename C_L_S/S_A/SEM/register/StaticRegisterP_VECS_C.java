package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapP_VECS_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterP_VECS_C {
	@SuppressWarnings("unchecked")
	public static void load(StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_E, App NE) {
		
		//稍后封装
		staticFunctionMapP_VECS_E.annotationMap.put("aNNTest", "string");
		staticFunctionMapP_VECS_E.annotationMap.put("dNNTest", "string");
		staticFunctionMapP_VECS_E.annotationMap.put("rNNTest", "string");
		staticFunctionMapP_VECS_E.annotationMap.put("sensingTest", "string");
		staticFunctionMapP_VECS_E.annotationMap.put("educationLevelTest", "input:_AE");
		staticFunctionMapP_VECS_E.annotationMap.put("literarinessLevelTest"
				, "input:emotionMap_E:emotionInit:ratioMap_E");
		staticFunctionMapP_VECS_E.annotationMap.put("successICATest"
				, "input:emotionMap_E:emotionInit:ratioMap_E:successICATest");//之后这种注册方式统一在花粉api中登记，
		staticFunctionMapP_VECS_E.annotationMap.put("getSideEnd2D", "list:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getSideEnd3D", "list:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("addNewPositionWithoutHeart", "groups:position2D:scaleDistance");
		staticFunctionMapP_VECS_E.annotationMap.put("addNewPositionWithHeart", "groups:position2D:hearts:scaleDistance");
		staticFunctionMapP_VECS_E.annotationMap.put("getShortestSamplePosition2DGroup", "inputHeart:groups");
		staticFunctionMapP_VECS_E.annotationMap.put("getShorterSamplePosition2DGroupsWithScale", "inputHeart:groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getShortestSamplePosition3DGroup", "inputHeart:groups");
		staticFunctionMapP_VECS_E.annotationMap.put("getShortestSamplePosition3DGroupsWithScale", "inputHeart:groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("fissilePosition2D", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("fissilePosition3D", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("fusionPosition2DwithHeart", "groups:groupsHeart：scale");
		staticFunctionMapP_VECS_E.annotationMap.put("fusionPosition3DwithHeart", "groups:groupsHeart:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPIsolationGroups2D", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPIsolationGroups3D", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPForestIsolationGroups2D", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPForestIsolationGroups3D", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition2DHeartsWithSingerGroup", "coods");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition3DHeartsWithSingerGroup", "coods");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition2DByHearts", "hearts");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition3DByHearts", "hearts");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition2DHeartsWithFissileGroups", "coods:distanceScale");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition3DHeartsWithFissileGroups", "coods:distanceScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanDistanceFromPositions2D"
				, "position2Ds:observerPCAScale:sortRangeScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanDistanceFromPositions3D"
				, "position3Ds:observerPCAScale:sortRangeScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findPascalMeanDistanceByEachPositions2D"
				, "position2Ds:observerPCAScale:sortRangeScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findPascalMeanDistanceByEachPositions3D"
				, "position3Ds:observerPCAScale:sortRangeScale");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalHearts", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalHearts", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalMids", "groups:scale");
	
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalMids", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalDirection"
				, "pascalHearts:pascalMids");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalDirection"
				, "pascalHearts:pascalMids");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalDirection", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalDirection", "groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo2DEulerRingTSP", "AMV_MVS_VSQs");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo3DEulerRingTSP", "AMV_MVS_VSQs");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo2DEulerRingTSP2D", "AMV_MVS_VSQs");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo3DEulerRingTSP2D", "AMV_MVS_VSQs");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo2DEulerRingTSP3D"
				, "positions:sortRangeScale:sortDeepsScale");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo3DEulerRingTSP3D"
				, "positions:sortRangeScale:sortDeepsScale");
		
		staticFunctionMapP_VECS_E.annotationMap.put("getImagePix2DGroupFilter", "inputPixMatrix:RBG:distanceScale:max:min");
		staticFunctionMapP_VECS_E.annotationMap.put("getImagePix3DGroupFilter", "inputPixMatrix:RBG:distanceScale:max:min");
		staticFunctionMapP_VECS_E.annotationMap.put("NLPBestSentenceMatch", "searchString:sampleSentences");
		staticFunctionMapP_VECS_E.annotationMap.put("NLPBestSentencesMatch", "searchString:sampleSentences:sortStackRange:filterRate");
		staticFunctionMapP_VECS_E.annotationMap.put("getNLPBestSentencesMatchScore", "searchString:sampleSentences");
		staticFunctionMapP_VECS_E.annotationMap.put("getNLPBestSentencesMatchScoreRights"
				, "searchString:sampleSentences:_A:nlp:keyMap");
		staticFunctionMapP_VECS_E.annotationMap.put("getErrorAsserts", "inputValue:matchValues:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getBinaryErrorAsserts"
				, "inputValue:matchValues:scale:sortStackRange:isSort");
		staticFunctionMapP_VECS_E.annotationMap.put("findTotalIncrementWithScale", "value:times:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanIncrementWithScale", "value:times:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfFilterDoubleArrayWithScale"
				, "input:filterScale:sortRangeScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleArray", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfTwoDoubleArray", "origin:input");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfTwoDoubleArray2D", "origin:input");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleMatrix2D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findRowMeanOfDoubleMatrix2D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findCulumnMeanOfDoubleMatrix2D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleMatrix3D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleList", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfMartrix1DList", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfMartrix2DList", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleArray", "input");	
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfTwoDoubleArray", "origin, input");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfTwoDoubleArray2D", "origin, input");
		
	 
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleMatrix2D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findRowSumOfDoubleMatrix2D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findCulumnSumOfDoubleMatrix2D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleMatrix3D", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleList", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfMartrix1DList", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfMartrix2DList", "input");
		staticFunctionMapP_VECS_E.annotationMap.put("getShareholdCount", "input:sharehold");
		
		staticFunctionMapP_VECS_E.annotationMap.put("encodeEstimateSumOfScoresList", "scores:estimateValue");
		staticFunctionMapP_VECS_E.annotationMap.put("encodeEstimateSumOfScoresArray", "scores:estimateValue");
		staticFunctionMapP_VECS_E.annotationMap.put("getEstimateCartesianSumOfScoresArray"
				, "input:EstimateRatios:estimateValue");
		staticFunctionMapP_VECS_E.annotationMap.put("getEstimateCartesian1DSumOfScoresArray"
				, "inputs:EstimateRatios:estimateValue");
		staticFunctionMapP_VECS_E.annotationMap.put("encodeEstimateInitonsScore", "input:EstimateRatios:estimateValue");
		
		staticFunctionMapP_VECS_E.annotationMap.put("decodeEstimateInitonsScore", "input:EstimateRatios:estimateValue");
		staticFunctionMapP_VECS_E.annotationMap.put("getRightsEstimateScore", "inputs:rights");
		staticFunctionMapP_VECS_E.annotationMap.put("getSimilarFuzzSetWithScale", "input:groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getDistanceRatio2D", "begin:end");
		staticFunctionMapP_VECS_E.annotationMap.put("getARCDistanceRatio2D", "begin:end");
		staticFunctionMapP_VECS_E.annotationMap.put("getTrueARCDistanceRatio2D", "begin:end");
		staticFunctionMapP_VECS_E.annotationMap.put("getDistanceRatio3D", "begin:end");
		staticFunctionMapP_VECS_E.annotationMap.put("getTrueARCDistanceRatio3D", "begin:end");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentListByOuterKey", "array");
		staticFunctionMapP_VECS_E.annotationMap.put("kernel", "output:array:j");
		staticFunctionMapP_VECS_E.annotationMap.put("kernelFix", "output:array:j");
		staticFunctionMapP_VECS_E.annotationMap.put("findTotalIncrementRatioWithScale"
				, "value:times:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanIncrementRatioWithScale"
				, "value:times:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyUpSplit"
				, "originFrequency:compareFrequency");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyDownSplit"
				, "originFrequency:compareFrequency");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyUpSplitWithScale"
				, "originFrequency:compareFrequency:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyDownSplitWithScale"
				, "originFrequency:compareFrequency:scale");

	

		staticFunctionMapP_VECS_E.annotationMap.put("predictionResult"
				, "input:groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("predictionMatrixResult"
				, "input:groups:scale");
		staticFunctionMapP_VECS_E.annotationMap.put("getImagePixClassificationMap"
				, "pixMap");
		staticFunctionMapP_VECS_E.annotationMap.put("getVWaveFromImagePix"
				, "pixMap:RGB");
		staticFunctionMapP_VECS_E.annotationMap.put("getHWaveFromImagePix"
				, "pixMap:RGB");
		staticFunctionMapP_VECS_E.annotationMap.put("getPixPercentByDeterPix"
				, "imagePix:scaleRBG");
		staticFunctionMapP_VECS_E.annotationMap.put("getClusterPercentByDeterPixGroup"
				, "imagePix:scaleSUM");
		staticFunctionMapP_VECS_E.annotationMap.put("getPixPercentByDeterPixGroup"
				, "imagePix:scaleSUM");
		staticFunctionMapP_VECS_E.annotationMap.put("filterFusion2DSetsWithCountScale"
				, "groups:countScale");
		staticFunctionMapP_VECS_E.annotationMap.put("filterFusion3DSetsWithCountScale"
				, "groups:countScale");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition2DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition3DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition2DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition3DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentListByOuterKey", "list:key");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentArrayByOuterKey", "array:key");
		staticFunctionMapP_VECS_E.annotationMap.put("getEachPercentSetOfArray", "array");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentArrayByOuterKey", "array:key");
	
		Iterator<String> iterators= staticFunctionMapP_VECS_E.annotationMap.keySet().iterator();
		while(iterators.hasNext()) {
			String temp= iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp, (long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp, "P_VECS");
		}
	}	
}
