package S_A.VSQ.parser;

import S_A.pheromone.IMV_SQI;
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class EmotionMap_ES{
	public IMV_SQI positiveMap;
	public IMV_SQI negativeMap;
	public IMV_SQI motivationMap;
	public IMV_SQI trendingMap;
	public IMV_SQI predictionMap;
	public IMV_SQI distinctionMap;

	public IMV_SQI getPredictionMap() {
		return predictionMap;
	}

	public void I_PredictionMap(IMV_SQI predictionMap) {
		this.predictionMap= predictionMap;
	}

	public IMV_SQI getPositiveMap() {
		return positiveMap;
	}

	public void I_PositiveMap(IMV_SQI positiveMap) {
		this.positiveMap= positiveMap;
	}

	public IMV_SQI getNegativeMap() {
		return negativeMap;
	}

	public void I_NegativeMap(IMV_SQI negativeMap) {
		this.negativeMap= negativeMap;
	}

	public IMV_SQI getMotivationMap() {
		return motivationMap;
	}

	public void I_MotivationMap(IMV_SQI motivationMap) {
		this.motivationMap= motivationMap;
	}

	public IMV_SQI getTrendingMap() {
		return trendingMap;
	}

	public void I_TrendingMap(IMV_SQI trendingMap) {
		this.trendingMap= trendingMap;
	}

	public IMV_SQI getDistinctionMap() {
		return distinctionMap;
	}

	public void I_DistinctionMap(IMV_SQI distinctionMap) {
		this.distinctionMap= distinctionMap;
	}
}
