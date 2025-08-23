package A_V.E;

import A_V.C.RatioMap;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Pos;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_S_;
import S_A.pheromone.IMV_SIQ_X_;

import java.util.Iterator;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class RatioMap_E implements RatioMap {
	@Override
	public IMV_SIQ_X_ getEmotionSampleMap(IMV_SIQ_S_ wordFrequencyMap,
			IMV_SIQ positive, IMV_SIQ negative, App NE) {
		IMV_SIQ_X_ output = new IMV_SIQ_X_();
		for (int i = wordFrequencyMap.size()
				- S_Pos.INT_ONE; i >= S_Pos.INT_ZERO; i--) {
			if (wordFrequencyMap.getW(i).get_word().length() > S_Pos.INT_ONE) {
				EmotionSample emotionSample;
				if (output.containsKey(wordFrequencyMap.getW(i).get_word())) {
					emotionSample = output
							.get_S(wordFrequencyMap.getW(i).get_word());
				} else {
					emotionSample = new EmotionSample();
				}
				if (positive.containsKey(wordFrequencyMap.getW(i).get_word())) {
					emotionSample.I_PositiveCount(
							wordFrequencyMap.getW(i).get_frequency());
				} else if (negative
						.containsKey(wordFrequencyMap.getW(i).get_word())) {
					emotionSample.I_NegativeCount(
							wordFrequencyMap.getW(i).get_frequency());
				} else {
					emotionSample.I_MedCount(
							wordFrequencyMap.getW(i).get_frequency());
				}
				output.put(wordFrequencyMap.getW(i).get_word(), emotionSample);
			}
		}
		return output;
	}

	@Override
	public void IQ_MotivationRatio(IMV_SIQ_X_ emotionSampleMap,
			double sumOfEmotion) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			emotionSample.I_MotivationRatio(
					emotionSample.getEmotionRatio() / sumOfEmotion);
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_CorrelationRatio(IMV_SIQ_X_ emotionSampleMap,
			double sumOfEmotion) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			emotionSample.I_CorrelationRatio((emotionSample.getPositiveCount()
					+ emotionSample.getNegativeCount()
					+ emotionSample.getMedCount()) / sumOfEmotion);
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_ContinusRatio(IMV_SIQ_X_ emotionSampleMap,
			double emotionRatio) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			emotionSample.I_ContinusRatio((emotionSample.getPositiveCount()
					+ emotionSample.getNegativeCount()
					+ emotionSample.getMedCount()) * emotionRatio);
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_TrendsRatio(IMV_SIQ_X_ emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			emotionSample.I_TrendsRatio(emotionSample.getEmotionRatio()
					* emotionSample.getContinusRatio()
					* emotionSample.getCorrelationRatio());
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_PredictionRatio(IMV_SIQ_X_ emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			emotionSample.I_PredictionRatio(emotionSample.getMotivationRatio()
					* emotionSample.getCorrelationRatio());
			emotionSampleMap.put(word, emotionSample);
		}

	}

	@Override
	public void IQ_GuessRatio(IMV_SIQ_X_ emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			emotionSample.I_GuessRatio(emotionSample.getPredictionRatio()
					* emotionSample.getTrendsRatio());
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_SensingRatio(IMV_SIQ_X_ emotionSampleMap) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			if (0 == emotionSample.getTrendsRatio()) {
				emotionSample.I_SensingRatio(0.0);
			} else {
				emotionSample.I_SensingRatio(emotionSample.getPredictionRatio()
						/ emotionSample.getTrendsRatio());
			}
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public double findTotalPositiveCount(IMV_SIQ_X_ emotionSampleMap) {
		double output = 1.0;
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			output += emotionSample.getPositiveCount();
		}
		return output;
	}

	@Override
	public double findTotalNegativeCount(IMV_SIQ_X_ emotionSampleMap) {
		double output = 1.0;
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			output += 0.0;
			// if (null != emotionSample.getNegativeCount()) {
			output += emotionSample.getNegativeCount();
			// }
		}
		return output;
	}

	@Override
	public void IQ_EmotionRatio(IMV_SIQ_X_ emotionSampleMap,
			double positiveCount, double negativeCount, double medCount) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			double negRate = emotionSample.getNegativeCount() / negativeCount;
			double posRate = emotionSample.getPositiveCount() / positiveCount;
			double medRate = emotionSample.getMedCount() / medCount;
			emotionSample.I_EmotionRatio(negRate + posRate + medRate);
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public double findTotalKeyCount(IMV_SIQ_X_ emotionSampleMap) {
		double output = 1.0;// LATER IN BOLD
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			output += emotionSample.getNegativeCount()
					+ emotionSample.getPositiveCount()
					+ emotionSample.getMedCount();
		}
		return output;
	}

	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public void IQ_Motivation(IMV_SIQ_X_ emotionSampleMap, IMV_SIQ motivation) {
		Iterator<String> IteratorsMotivation = motivation.keySet().iterator();
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			if (motivation.containsKey(word)) {
				emotionSample.I_Motivation(motivation.getString(word));
			} else {
				emotionSample.I_Motivation("语料库空");
			}
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_Trending(IMV_SIQ_X_ emotionSampleMap, IMV_SIQ trending) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			if (trending.containsKey(word)) {
				emotionSample.I_Trending(trending.getString(word));
			} else {
				emotionSample.I_Trending("语料库空");
			}
			emotionSampleMap.put(word, emotionSample);
		}
		System.out.println("trif");
	}

	@Override
	public void IQ_Prediction(IMV_SIQ_X_ emotionSampleMap, IMV_SIQ prediction) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			if (prediction.containsKey(emotionSample.getTrending())) {
				emotionSample.I_Prediction(
						prediction.get(emotionSample.getTrending()).toString());
			} else if (prediction.containsKey(emotionSample.getMotivation())) {
				emotionSample.I_Prediction(prediction
						.get(emotionSample.getMotivation()).toString());
			} else {
				emotionSample.I_Prediction("语料库空");
			}
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public void IQ_Distinction(IMV_SIQ_X_ emotionSampleMap,
			IMV_SIQ distinction) {
		Iterator<String> Iterator = emotionSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			EmotionSample emotionSample = emotionSampleMap.get_S(word);
			if (distinction.containsKey(word)) {
				emotionSample.I_Distinction(distinction.get(word).toString());
			}
			emotionSampleMap.put(word, emotionSample);
		}
	}

	@Override
	public IMV_SIQ_X_ getEnvironmentSampleMap(IMV_SIQ_S_ wordFrequencyMap) {
		IMV_SIQ_X_ output = new IMV_SIQ_X_();
		for (int i = wordFrequencyMap.size()
				- S_Pos.INT_ONE; i >= S_Pos.INT_ZERO; i--) {
			if (wordFrequencyMap.getW(i).get_word().length() > S_Pos.INT_ONE) {
				EmotionSample emotionSample = new EmotionSample();
				if (!output.containsKey(wordFrequencyMap.getW(i).get_word())) {
					output.put(wordFrequencyMap.getW(i).get_word(),
							emotionSample);
				}
			}
		}
		return output;
	}
}
