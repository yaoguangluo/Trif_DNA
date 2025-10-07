package test.java.InterfaceTest.chineseParser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SQI;
import S_A.pheromone.IMV_SQI_X_;
import exception.file.O.DetaBufferedReader;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */

/*
 * 关于定制map的思考并不是当前世界的所有的领域都要特意地专门地设计一些定制map来进行组词，
 * 因为定制map主要用来处理稀奇古怪的名词缩写问题。对于变化快速的街道，传媒，食品等某些
 * 领域特殊现象归纳，当这个潮流一旦过了热度没了，这些新兴名词之后也会随着时间莫名消失，
 * 添加的方式应该是首先扩充比较通用的名词词汇。所以这些定制词汇应该需要一个频率属性来
 * 统计使用次数，或者使用前和当前的官方开源词库进行比对下，如交通街道名这类全世界几百万
 * 个街道，命名毫无逻辑，想改就能改的组合街名词。过滤的价值在于提高组词识别效率。
 * */
public class ParserCharsFix {
	// 索引词汇定制map是固定变量表，可以全局static使用。
	public static Map<String, HashMap<String, String>> environmentIndex = new HashMap<>();

	public void initenvironmentIndex(App NE) throws IOException {
		initMilitery(NE);
		initMeeting(NE);
		initNation(NE);
		initMusic(NE);
		initCarFix(NE);
		initFood(NE);
		initCity(NE);
		initStreet(NE);
		// ... .
	}

	//	militery.put("大将", "可英文");
	//	militery.put("上将", "可英文");
	//	militery.put("中将", "可英文");
	//	militery.put("少将", "可英文");
	//	militery.put("上尉", "可英文");
	//	militery.put("中尉", "可英文");
	//	militery.put("少尉", "可英文");
	//	militery.put("大校", "可英文");
	//	militery.put("上校", "可英文");
	//	militery.put("中校", "可英文");
	//	militery.put("少校", "可英文");
	//	militery.put("副班", "可英文");
	public void initMilitery(App NE) throws IOException {
		/*
		 * 词汇越来越多之后可以lyg文件进行文件init扩展。
		 */
		HashMap<String, String> militery = new HashMap<>();
		callFastReadProjectFile(militery, "militery.lyg", NE,
			"otherlyg", S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000001-" + militery.size());
		environmentIndex.put("军事", militery);
		// 还可以细化
	}

	public void callFastReadProjectFile(
		HashMap<String, String> inputs, String fileName, App NE,
		String category, String charSet, String lineParserSymbol)
		throws IOException {
		/*
		 * 问题，当时设计读取资源函数，没有细致到设计成一种非常方便记忆的函数格式。
		 * 导致每次使用我还要想半天这个逻辑，怎么扩展和重用。
		 * 
		 * --罗瑶光
		 */
		DetaBufferedReader cReaderp = FastReadProjectFile
			.getDetaBufferedReader(fileName, NE.resourceTail
				+ category + "/", charSet);
		// index
		String cInputStringp;
		while ((cInputStringp = cReaderp.readDetaLine()) != null) {
			String[] words = cInputStringp.split(lineParserSymbol);
			if (words.length > 1) {
				inputs.put(words[0], "可英文");
			}
		}
		cReaderp.close();
	}

	//	meeting.put("会上", "可英文");
	//	meeting.put("会中", "可英文");
	//	meeting.put("会下", "可英文");
	//	meeting.put("会前", "可英文");
	//	meeting.put("会后", "可英文");
	public void initMeeting(App NE) throws IOException {
		HashMap<String, String> meeting = new HashMap<>();
		callFastReadProjectFile(meeting, "meeting.lyg", NE,
			"otherlyg", S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000002-" + meeting.size());
		environmentIndex.put("会议", meeting);

	}

	//	meeting.put("伦敦", "可英文");
	//	meeting.put("沙特", "可英文");
	//	meeting.put("阿拉伯", "可英文");
	public void initNation(App NE) throws IOException {
		HashMap<String, String> nation = new HashMap<>();
		callFastReadProjectFile(nation, "nation.lyg", NE, "otherlyg",
			S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000003-" + nation.size());
		environmentIndex.put("国家", nation);
	}

	//	meeting.put("杨宝心", "可英文");
	//	meeting.put("修儿", "可英文");
	//	meeting.put("峰暴班", "可英文");
	public void initMusic(App NE) throws IOException {
		HashMap<String, String> music = new HashMap<>();
		callFastReadProjectFile(music, "music.lyg", NE, "otherlyg",
			S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000004-" + music.size());
		environmentIndex.put("传媒", music);
	}

	//	meeting.put("胎噪", "可英文");
	//	meeting.put("风噪", "可英文");
	public void initCarFix(App NE) throws IOException {
		HashMap<String, String> carFix = new HashMap<>();
		callFastReadProjectFile(carFix, "carFix.lyg", NE, "otherlyg",
			S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000005-" + carFix.size());
		environmentIndex.put("交通", carFix);
	}

	// 行业包含 餐饮 传媒，这里的关系设计需要分析。
	//	meeting.put("寿司", "可英文");
	//	meeting.put("日料", "可英文");
	//	meeting.put("飞饼", "可英文");
	public void initFood(App NE) throws IOException {
		HashMap<String, String> food = new HashMap<>();
		callFastReadProjectFile(food, "food.lyg", NE, "otherlyg",
			S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000006-" + food.size());
		environmentIndex.put("食物", food);
	}

	//city.put("西单", "可英文");
	//city.put("禾绿", "可英文");
	public void initCity(App NE) throws IOException {
		HashMap<String, String> city = new HashMap<>();
		callFastReadProjectFile(city, "city.lyg", NE, "otherlyg",
			S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000007-" + city.size());
		environmentIndex.put("城市", city);
	}

	//street.put("大塘冲", "可英文");
	public void initStreet(App NE) throws IOException {
		HashMap<String, String> street = new HashMap<>();
		callFastReadProjectFile(street, "street.lyg", NE, "otherlyg",
			S_Pos.UTF8_STRING, "/");
		S_logger.Log.logger.info("400-0000000008-" + street.size());
		environmentIndex.put("街道", street);
	}

	/*
	 * 通过德塔极速切词后的结果开始获取联想环境词汇map，之前很多用户说我的
	 * LenovoInit函数没用，搞了干嘛,现在做定制map校正和输出校正测试
	 * ，我就写点文字来描述下LenovoInit一些2019年的具体的逻辑价值。
	 * 
	 * 关于环境的定制map初始有多种方式，我介绍2种 -1 数据分词时候已经知道了
	 * 具体的环境类，可以在分词前进行init针对需要遍历的环境赋值= “历史，哲学 
	 * ，数学。。。。” -2 数据分词时不知道具体，那么就需要用lenovoInit来 
	 * 获取大概环境类如 “历史，哲学，数学。。。。” 然后进行遍历组字检查。 
	 * 前提条件是lenovo map需要扩充细致完整。
	 * 
	 * --罗瑶光
	 */
	public Map<String, String> getInvironment(App NE,
		List<String> sets) {
		Map<String, String> invironmentMap = new HashMap<>();
		// 稍后函数提取出来，小片段化去重。
		// System.out.println("400-8-0001-001-" + sets.size());
		NE.app_S.lenovoInit.IV_SetsExclude_A(sets, NE);
		// System.out.println("400-8-0001-002-" + sets.size());
		IMV_SQI_X_ environmentSampleMap = NE.app_S.lenovoInit
			.getEnvironmentInit().getEmotionSampleMap();
		// System.out.println("400-8-0001-003-" +
		// environmentSampleMap.size());
		IMV_SQI lenovo = NE.app_S.lenovoInit.getSensingMap()
			.getLenovoMap();
		// reduce
		S_logger.Log.logger.info("环    境：");
		Iterator<String> Iterator = environmentSampleMap.keySet()
			.iterator();
		while (Iterator.hasNext()) {
			String word = Iterator.next();
			// System.out.println("400-8-0001" + word);
			NE.app_S.emotionSample = environmentSampleMap.get_S(word);
			String stringDistinction = NE.app_S.emotionSample
				.getDistinction();
			// System.out.println("400-8-0002" + stringDistinction);
			if (null != stringDistinction) {
				String string = "";
				if (lenovo.containsKey(stringDistinction)) {
					string = lenovo.get(stringDistinction).toString();
					// System.out.println("400-8-0003" + string);
					// System.out.print(
					// lenovo.get(NE.app_S.emotionSample
					// .getDistinction()).toString() + " ");
					invironmentMap.put(string.replace(" ", ""),
						"later");
				} else {
					string = NE.app_S.emotionSample.getDistinction();
					// System.out.print(NE.app_S.emotionSample
					//	.getDistinction() + " ");
					invironmentMap.put(string.replace(" ", ""),
						"later");
				}
				if (!string.replace(" ", "").isEmpty()) {
					S_logger.Log.logger.info(string + " ");
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
		Iterator<String> iteratorsInvironmentMap = invironmentMap
			.keySet().iterator();
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
					// System.out.println("400-" + i);
					// System.out.println("");
					if (!subSet.isEmpty()) {
						computeSet.clear();
						Iterator<String> iteratorsSubset = subSet
							.iterator();
						while (iteratorsSubset.hasNext()) {
							String string = iteratorsSubset.next();
							// System.out.print(string + "-");
							computeSet.add(string);
						}
						subSet.clear();
					}
					S_logger.Log.logger.info(" ");
					for (int j = 0; j < computeSet.size(); j++) {
						StringBuilder stringBuilder = new StringBuilder();
						boolean find = false;
						// 连字条件stringBuilder内核记录
						for (int k = j; k < computeSet.size() && k < j
							+ i; k++) {
							if (stringBuilder.length() < i) {
								if (stringBuilder.length()
									+ computeSet.get(k)
										.length() < i) {
									stringBuilder.append(computeSet
										.get(k));
								}
							}
							String string = stringBuilder.toString();
							if (environmentMap.containsKey(string)) {
								// System.out.println("400-2-" + string);
								subSet.add(string);
								find = true;
								// 同时原list去掉string。
								stringBuilder.delete(0, stringBuilder
									.length() - 1);
								//
								j += (k - j);
							}
						}
						if (false == find) {
							// 如果没有找到就加原来的set，如果找到了，就要记录k值，
							// 如果k值是右终界点而substring处理了词中前字拆分逻辑，那么不考虑这类逻辑，
							// System.out.println("400-3-" + computeSet.get(j));
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
// Map<String, String> invironmentMap = new HashMap<>();
// NE.app_S.sensingMap_E.IV_LenovoMap(NE.app_S._A);
// IMV_SQI lenovo =
// NE.app_S.lenovoInit.getSensingMap().getLenovoMap();
// Iterator<String> Iterator = sets.iterator();
// while (Iterator.hasNext()) {
// String word = Iterator.next();
// if (lenovo.contains(word)) {
// invironmentMap.put(word, "later");
// }
// }
// return invironmentMap;