package VSQ.parser;

import A_V.C.RatioMap;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import C_A.ME.analysis.C.A;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_S_;
import S_A.pheromone.IMV_SIQ_X_;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class EnvironmentInit_X_S {
    public EmotionMap getEmotionMap() {
        return emotionMap;
    }

    public A get_A() {
        return _A;
    }

    public IMV_SIQ getPositive() {
        return positive;
    }

    public IMV_SIQ getNegative() {
        return negative;
    }

    public IMV_SIQ getMotivation() {
        return motivation;
    }

    public IMV_SIQ getPrediction() {
        return prediction;
    }

    public List<String> getSets() {
        return sets;
    }

    public IMV_SIQ_S_ getWordFrequencyMap() {
        return wordFrequencyMap;
    }

    public IMV_SIQ_X_ getEmotionSampleMap() {
        return emotionSampleMap;
    }

    public IMV_SIQ getDistinction() {
        return distinction;
    }

    public EmotionMap emotionMap;
    public CogsBinaryForest_AE _A;
    public IMV_SIQ positive;
    public IMV_SIQ negative;
    public IMV_SIQ motivation;
    public IMV_SIQ trending;
    public IMV_SIQ prediction;
    public IMV_SIQ distinction;
    public List<String> sets;
    public RatioMap rationMap;
    public IMV_SIQ_S_ wordFrequencyMap;
    public IMV_SIQ_X_ emotionSampleMap;
}
//public RatioMap getRationMap() {
//		return rationMap;
//	}
//	public void I_Sets(List<String> sets) {
//		this.sets= sets;
//	}
//	public void I_Trending(IMV_SIQ trending) {
//		this.trending= trending;
//	}
//	public void I_Motivation(IMV_SIQ motivation) {
//		this.motivation= motivation;
//	}
//	public void I_Negative(IMV_SIQ negative) {
//		this.negative= negative;
//	}
//	public void I_Positive(IMV_SIQ positive) {
//		this.positive= positive;
//	}
//
//	public void I__A(CogsBinaryForest_AE _A) {
//		this._A= _A;
//	}
//	public void I_EmotionMap(EmotionMap emotionMap) {
//		this.emotionMap= emotionMap;
//	}
//
//	public void I_RationMap(RatioMap rationMap) {
//		this.rationMap= rationMap;
//	}
//
//public void I_Prediction(IMV_SIQ prediction) {
//		this.prediction= prediction;
//	}
//	public IMV_SIQ getTrending() {
//		return trending;
//	}
//	public void I_WordFrequencyMap(IMV_SIQ_S_ wordFrequencyMap) {
//		this.wordFrequencyMap= wordFrequencyMap;
//	}
//
//public void I_EmotionSampleMap(IMV_SIQ_X_ emotionSampleMap) {
//	this.emotionSampleMap= emotionSampleMap;
//}
//
//	public double getPositiveCount() {
//		return positiveCount;
//	}
//
//	public void I_PositiveCount(double positiveCount) {
//		this.positiveCount= positiveCount;
//	}
//
//	public double getNegativeCount() {
//		return negativeCount;
//	}
//
//
//	public double getTotalCount() {
//		return totalCount;
//	}
////
//public void I_TotalCount(double totalCount) {
//	this.totalCount= totalCount;
//}
//
//	public void I_Distinction(IMV_SIQ distinction) {
//		this.distinction= distinction;
//	}
//
//	public void I_NegativeCount(double negativeCount) {
//		this.negativeCount= negativeCount;
//	}
//	public double positiveCount;
//	public double negativeCount;
//	public double totalCount;