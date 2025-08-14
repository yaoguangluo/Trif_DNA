package S_A.VSQ.parser;

import S_A.pheromone.IMV_SIQ;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class EmotionMap_ES{
	public IMV_SIQ positiveMap;
	public IMV_SIQ negativeMap;
	public IMV_SIQ motivationMap;
	public IMV_SIQ trendingMap;
	public IMV_SIQ predictionMap;
	public IMV_SIQ distinctionMap;

	public IMV_SIQ getPredictionMap() {
		return predictionMap;
	}

	public void I_PredictionMap(IMV_SIQ predictionMap) {
		this.predictionMap= predictionMap;
	}

	public IMV_SIQ getPositiveMap() {
		return positiveMap;
	}

	public void I_PositiveMap(IMV_SIQ positiveMap) {
		this.positiveMap= positiveMap;
	}

	public IMV_SIQ getNegativeMap() {
		return negativeMap;
	}

	public void I_NegativeMap(IMV_SIQ negativeMap) {
		this.negativeMap= negativeMap;
	}

	public IMV_SIQ getMotivationMap() {
		return motivationMap;
	}

	public void I_MotivationMap(IMV_SIQ motivationMap) {
		this.motivationMap= motivationMap;
	}

	public IMV_SIQ getTrendingMap() {
		return trendingMap;
	}

	public void I_TrendingMap(IMV_SIQ trendingMap) {
		this.trendingMap= trendingMap;
	}

	public IMV_SIQ getDistinctionMap() {
		return distinctionMap;
	}

	public void I_DistinctionMap(IMV_SIQ distinctionMap) {
		this.distinctionMap= distinctionMap;
	}
}
