package test.java.InterfaceTest.chineseParser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import E_A.ME.analysis.E.BinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_String;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_X_;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ParserCharsFix {
	// 索引词汇定制map是固定变量表，可以全局static使用。
	public static Map<String, HashMap<String, String>> environmentIndex = new HashMap<>();

	public void initenvironmentIndex() {
		initMilitery();
		initMeeting();
		initNation();
		initMusic();
		initCarFix();
		initFood();
		initCity();
		initStreet();
		// ... .
	}

	public void initMilitery() {
		/*
		 * 词汇越来越多之后可以lyg文件进行文件init扩展。
		 */
		HashMap<String, String> militery = new HashMap<>();
		militery.put("大将", "可英文");
		militery.put("上将", "可英文");
		militery.put("中将", "可英文");
		militery.put("少将", "可英文");
		militery.put("上尉", "可英文");
		militery.put("中尉", "可英文");
		militery.put("少尉", "可英文");
		militery.put("大校", "可英文");
		militery.put("上校", "可英文");
		militery.put("中校", "可英文");
		militery.put("少校", "可英文");
		militery.put("副班", "可英文");
		environmentIndex.put("军事", militery);
		// 还可以细化
	}

	public void initMeeting() {
		HashMap<String, String> meeting = new HashMap<>();
		meeting.put("会上", "可英文");
		meeting.put("会中", "可英文");
		meeting.put("会下", "可英文");
		meeting.put("会前", "可英文");
		meeting.put("会后", "可英文");

		environmentIndex.put("会议", meeting);

	}

	public void initNation() {
		HashMap<String, String> meeting = new HashMap<>();
		meeting.put("伦敦", "可英文");
		meeting.put("沙特", "可英文");
		meeting.put("阿拉伯", "可英文");
		environmentIndex.put("国家", meeting);
	}
	
	public void initMusic() {
		HashMap<String, String> meeting = new HashMap<>();
		meeting.put("杨宝心", "可英文");
		meeting.put("修儿", "可英文");
		meeting.put("峰暴班", "可英文");
		environmentIndex.put("传媒", meeting);
	}

	public void initCarFix() {
		HashMap<String, String> meeting = new HashMap<>();
		meeting.put("胎噪", "可英文");
		meeting.put("风噪", "可英文");
		environmentIndex.put("交通", meeting);
	}

	//行业包含 餐饮 传媒，这里的关系设计需要分析。
	public void initFood() {
		HashMap<String, String> meeting = new HashMap<>();
		meeting.put("寿司", "可英文");
		meeting.put("日料", "可英文");
		meeting.put("飞饼", "可英文");
		environmentIndex.put("食物", meeting);
	}

	public void initCity() {
		HashMap<String, String> city = new HashMap<>();
		city.put("西单", "可英文");
		city.put("禾绿", "可英文");
		environmentIndex.put("城市", city);
	}

	public void initStreet() {
		HashMap<String, String> street = new HashMap<>();
		street.put("大塘冲", "可英文");
		environmentIndex.put("街道", street);
	}

	/*
	 * 通过德塔极速切词后的结果开始获取联想环境词汇map，之前很多大佬说我的
	 * LenovoInit函数没用，搞了干嘛,我本想认真解释 既然没用那你们找我干嘛，
	 * 后来想想算了，本就互不认识，争论无意义，现在做定制map校正和输出校正测试
	 * ，我就写点文字来描述下LenovoInit一些2019年的具体的逻辑价值。
	 * 
	 * 关于环境的定制map初始有多种方式，我介绍2种 -1 数据分词时候已经知道了
	 * 具体的环境类，可以在分词前进行init针对需要遍历的环境赋值= “历史，哲学 ，数学。。。。” -2
	 * 数据分词时不知道具体，那么就需要用lenovoInit来 获取大概环境类如 “历史，哲学，数学。。。。”
	 * 然后进行遍历组字检查。 前提条件是lenovo map需要扩充细致完整。
	 * 
	 * --罗瑶光
	 */
	public Map<String, String> getInvironment(App NE, List<String> sets) {
		// Map<String, String> invironmentMap = new HashMap<>();
		// NE.app_S.sensingMap_E.IV_LenovoMap(NE.app_S._A);
		// IMV_SIQ lenovo =
		// NE.app_S.lenovoInit.getSensingMap().getLenovoMap();
		// Iterator<String> Iterator = sets.iterator();
		// while (Iterator.hasNext()) {
		// String word = Iterator.next();
		// if (lenovo.contains(word)) {
		// invironmentMap.put(word, "later");
		// }
		// }
		// return invironmentMap;
		Map<String, String> invironmentMap = new HashMap<>();
		// 稍后函数提取出来，小片段化去重。
		//System.out.println("400-8-0001-001-" + sets.size());
		NE.app_S.lenovoInit.IV_SetsExclude_A(sets, NE);
		//System.out.println("400-8-0001-002-" + sets.size());
		IMV_SIQ_X_ environmentSampleMap = NE.app_S.lenovoInit
				.getEnvironmentInit().getEmotionSampleMap();
		//System.out.println("400-8-0001-003-" + environmentSampleMap.size());
		IMV_SIQ lenovo = NE.app_S.lenovoInit.getSensingMap().getLenovoMap();
		// reduce
		System.out.println("环    境：");
		Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			//System.out.println("400-8-0001" + word);
			NE.app_S.emotionSample = environmentSampleMap.get_S(word);
			String stringDistinction = NE.app_S.emotionSample.getDistinction();
			//System.out.println("400-8-0002" + stringDistinction);
			if (null != stringDistinction) {
				String string = "";
				if (lenovo.containsKey(stringDistinction)) {
					string = lenovo.get(stringDistinction).toString();
					//System.out.println("400-8-0003" + string);
//					System.out.print(
//							lenovo.get(NE.app_S.emotionSample
//									.getDistinction()).toString() + " ");
					invironmentMap.put(string.replace(" ", ""), "later");
				} else {
					string = NE.app_S.emotionSample.getDistinction();
//					System.out.print(NE.app_S.emotionSample
//							.getDistinction() + " ");
					invironmentMap.put(string.replace(" ", ""), "later");
				}
				if (!string.replace(" ", "").isEmpty()) {
					System.out.print(string + " ");
				}
			}
		}
		return invironmentMap;
	}

	/*
	 * 通过德塔极速切词后的结果开始获取联想环境词汇map校正最终结果。
	 */
	public List<String> charFix(App NE, List<String> sets) {
		List<String> computeSet = new LinkedList<>();
		List<String> subSet = new LinkedList<>();
		Iterator<String> iterators = sets.iterator();
		while (iterators.hasNext()) {
			String string = iterators.next();
			computeSet.add(string);
		}

		// 获取环境的组字涉及面。
		Map<String, String> invironmentMap = getInvironment(NE, sets);
		Iterator<String> iteratorsInvironmentMap = invironmentMap.keySet()
				.iterator();
		// 每一个环境面遍历
		while (iteratorsInvironmentMap.hasNext()) {
			String temp = iteratorsInvironmentMap.next();
			// 如果词库的环境面恰好也在计算环境面，就取出来计算当前组字面
			if (ParserCharsFix.environmentIndex.containsKey(temp)) {
				Map<String, String> environmentMap = ParserCharsFix.environmentIndex
						.get(temp);
				// 当前组字面从sets的 9字连词开始,2个字结束
				for (int i = 9; i > 1; i--) {
					// 逐词排查连字条件分析
					// 减少computeSet算子数
					//System.out.println("400-" + i);
					//System.out.println("");
					if (!subSet.isEmpty()) {
						computeSet.clear();
						Iterator<String> iteratorsSubset = subSet.iterator();
						while (iteratorsSubset.hasNext()) {
							String string = iteratorsSubset.next();
							//System.out.print(string + "-");
							computeSet.add(string);
						}
						subSet.clear();
					}
					System.out.println(" ");
					for (int j = 0; j < computeSet.size(); j++) {
						StringBuilder stringBuilder = new StringBuilder();
						boolean find = false;
						// 连字条件stringBuilder内核记录
						for (int k = j; k < computeSet.size()
								&& k < j + i; k++) {
							if (stringBuilder.length() < i) {
								if (stringBuilder.length()
										+ computeSet.get(k).length() < i) {
									stringBuilder.append(computeSet.get(k));
								}
							}
							String string = stringBuilder.toString();
							if (environmentMap.containsKey(string)) {
								//System.out.println("400-2-" + string);
								subSet.add(string);
								find = true;
								// 同时原list去掉string。
								stringBuilder.delete(0, stringBuilder.length() - 1);
								//
								j += (k - j);
							}
						}
						if (false == find) {
							// 如果没有找到就加原来的set，如果找到了，就要记录k值，
							// 如果k值是右终界点而substring处理了词中前字拆分逻辑，那么不考虑这类逻辑，
							//System.out.println("400-3-" + computeSet.get(j));
							subSet.add(computeSet.get(j));
						}
					}
				}
			}
		}
		if (!subSet.isEmpty()) {
			return subSet;
		}
		return sets;
	}

}
