package test.java.InterfaceTest.tinShell;

import java.util.HashMap;
import java.util.Iterator;

import O_V.OSM.shell.CommandClass;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SixActionMap.WorkVerbalMap;
import test.java.interfaces.test.CommonTestInition;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class FastCartesianIdentifyTest {
	/*
	 * 思考2点
	 * 
	 * CN 1- 之前的意识错误纠正，主要是思维方式的纠正，之前我把2018年分词
	 * 还是用老版Lucene，把落后归咎于业界的不争气。在这一点上我还是要诚恳地
	 * 道歉，做人应该符合科学的方法论和合理的制度规范 去 思考论题。不能激进
	 * 。好比我写函数思想一样，也不能图快和激进，因为我的目标一直很明确，瞬间
	 * 转移和永生，只是人工智能，元基编码恰好是这个探索过程的中间bonus产物。
	 * 
	 * 2- 文字的描述内容目的非常明确，就是让计算力有浓度。计算力在某种 观测
	 * 的面上可以用语言的形式来体现。语言是可以提炼的，所以计算力有浓度。比如
	 * 笛卡尔关系，为了更准确的提炼TVM extension 花肽语指令。可以将源码的
	 * 这部份提出来，专门设计针对各种语言，输出计算相似的指令片段标注。最终
	 * 形成自适应的指令片段而不是人为地去定义这个片段。比如目前的8个肽class
	 * 还是我手写的，之前的3000多花语class也是我手写的。通过仔细分析，不难
	 * 得到很多仅自适应逻辑计算，就可以分类的属性，比如相同片段，相同的词性，
	 * 相同的含义，。。。在map归纳下都可以谨谨有条地归纳出来。
	 * 
	 * 
	 * EN 2- Type of observation, to raise and make an ability
	 * of computation more ratios of concentration. Assumption a
	 * format of An ability of computation could be a detailed
	 * human's literacy-language. The language has been
	 * extracting the purity of cognition every times since was
	 * used, the ability of computation has been mining well in
	 * production's efficiency-domain simultaneously. And
	 * recently one of the effect way about making a promotion
	 * of exporting out the Cartesian's relationship-logic with
	 * specially test models, to better for continuing
	 * sub-designs. Thus models could do well in self-adapted
	 * and initialed as valuable sections of TVM's
	 * derive-construction.
	 * 
	 * Could start a few sections work below.
	 * 
	 * package name-- package S_A.SixActionMap; file name--
	 * WorkVerbalMap function name-- findSubject
	 * 
	 * Yaoguang.Luo/罗瑶光
	 */
	// to do a swap..
	/*
	 * 首先提取已经有的函数通过 getCartesianRelationShipFromHumanTalk
	 * 计算细腻的处理好 WorkVerbalMap 和他的 SVO 对象，笛卡尔的关系可以通过
	 * 对象进行PCA，之前的排序就用上了，排序后选择。选择一些有代表性的，没有
	 * 特殊符号的，明确动词的关系组，然后在这些关系组中通过
	 * getCartesianPromotionTVMFromRelationShips进行跟进筛选归纳有价值的逻辑。
	 */
	/*
	 * 这个函数用于 filter 笛卡尔map 中的 大量无用的成员，每减少一名成员，
	 * 之后的 计算就增加一分速度和性能。
	 * 
	 * 都到这一步了，价值就非常明显了。 1 首先我找出了一个严重的问题，就是
	 * 我的笛卡尔关系是拆开的分类的关系，所以我应该设计一个新的全局关系比如
	 * 功效==搜索 然后再区分关系 功效-搜索 和 搜索+功效
	 * 区分，所以我漏掉了一个全局关系Map，目前还看不出价值，但是处理海量关系
	 * 一旦有概率这个计算全局逻辑，那么将是巨大的计算浪费。
	 * 
	 * 2 其次观测发现我的笛卡尔关系变量描述不规范
	 * 条件+功效:9:5:_stringNoun1_stringVerb10
	 * 这个例子如果更加适应计算，后后缀应该是数字代号描述会更好， 
	 * 比如条件+功效:9:5:4:5:1:10,统一格式可以探索一劳永逸的表达方式，加速
	 * 思考和行为编码。
	 * 
	 * 3 发现这么多当前可以做的事情，说明计算哲学的价值巨大，一个人的研究能力
	 * 是他的母语水平，一个人的母语水平来自与他对事物的简短文字描述能力。这个
	 * 能力来自定义 和 辩证的学习力。
	 * 
	 * 4 跟进思考，首先剔除和筛选掉 全部是符号的笛卡尔关系成员，再筛选掉含有
	 * 关键字符号的关系成员。再筛选掉缺失一半关系的成员。不是删除，是筛选，
	 * 所以我还要设计3个map装载这些垃圾。将来有用。目测一半的数据被清理掉，
	 * 之后性能指数翻倍。
	 * 
	 * 5 。。。
	 * 
	 * 6 完全正确的源码计算，正确地输出，稍微一个变换思考，一下出现了好多问题
	 * ，而且这些问题都能有当前环境下的标准答案。。
	 * 
	 * 很多人不知道自己当前要干什么，并不是能力不行，恰恰是能力太强，譬如我，
	 * 只是当时不知道自己的兴趣爱好是什么。因为什么事情都思考一下，生活会很
	 * 累很乏味，只是逃避而已，但是一旦知道了进行有选择地思考，就开挂了。
	 * 
	 * 辩证思考的魅力 - 罗瑶光
	 * 
	 */
	/*
	 * 开始筛选出含有特殊符号的map，命名为relationsASCII，从command_V. 
	 * _IMV_SQI_SS 中提取 于是开始思考，是先提取再计算还是先计算再提取？ 
	 * --先提取再计算，加速主要关系输出。
	 * --先计算再提取，增加细腻属性关系。
	 * 于是跟进思考，含有特殊符号的relationsASCII属性对语言分析有什么充份
	 * 且必要的价值影响？ 
	 * 1 代号使用价值，以后有变量模型的语言有代换价值。 2 later。。
	 * 这些符号没有严谨的词性意义，在SVO中的POS作用表达不强，于是采用先提取再计算的逻辑。
	 * 很多时候在非应激表达的劳动中，说服我做决策的从来不是我的主观爱好，而是客观辩证思维。
	 */
	/*
	 * 关键字 string.contains("*" 处--笔记
	 * 歧义数字变量关系 
	 * 思考 *号代表输入的文字中有变量，于是分析这个* 和处理后的变量是否需要同时
	 * 存在与关系中。首先早期没有处理变量的时候，变量字符都是断开的，增加了大量
	 * 的笛卡尔关系。增加了变量处理后，有了*，但是变量的position是char的位置
	 * 来计算的，不是切词的list位置计算的。那么position也是规范准确的可用于计
	 * 算的变量。* 在笛卡尔关系中的意义代表变量与词汇的关系。如果筛掉*，用原数字
	 * 来表达，那么还要增加一层关系，数字是不是变量，再思考变量和词汇的关系。
	 * 但是通常数字和词汇本就是变量的意思。那么这里可以先筛掉*，加个slash，以后
	 * 要参考*的笛卡尔条件，去掉slash。目前我的CreativeVerbalMap 十六元基索引 
	 * TVM extension 和 blooming Action 都没有*的参照条件，可以注释下先筛掉。
	 * 另外为了一个 * 增加一把笛卡尔关系词汇组其实也是不值得提倡的编码逻辑，可以
	 * 采用含*的boolean标识，做条件编码，更规范的管理含有变量的逻辑句。于是思路
	 * 就清晰了 * 属于语法 构造关系。先并入relationsGrammar关系中
	 * 
	 * WordFrequency wordFrequency = workVerbalMap.command_V._IMV_SQI_SS
	 *		.getW(string);
	 * workVerbalMap.command_V._IMV_SQI_SS_temp.put(string,
	 *		wordFrequency);
	 * continue;
	 * 
	 * --罗瑶光
	 */

	@SuppressWarnings("unused")
	public HashMap<String, String> getCartesianRelationShipFromHumanTalk(
		WorkVerbalMap workVerbalMap) {
		Iterator<String> iterators = workVerbalMap.command_V._IMV_SQI_SS
			.keySet().iterator();
		while (iterators.hasNext()) {
			Object object = iterators.next();
			String string = object.toString();
			S_logger.Log.logger.info("" + string);
			/*
			 * 找出不含有特殊符号的条件拆分，方便垃圾分类。 1 不含有与或非的string 2 3
			 */
			if (string.contains("&") || string.contains("|") || string
				.contains("!") || string.contains(";") || string
					.contains("*") || string.contains(":") || string
						.contains(" ")) {
				/*
				 * 关于这种逻辑的写法逐char匹配，应该在更前分词的时候就过滤掉，因为考虑到分词时候
				 * 万一有符号+String的代号的组合转码条件，将造成更多断开的碎片。
				 */
				WordFrequency wordFrequency = workVerbalMap.command_V._IMV_SQI_SS
					.getW(string);
				workVerbalMap.command_V.relationsGrammar.put(string,
					wordFrequency);
				// workVerbalMap.command_V._IMV_SQI_SS.remove(string);
				continue;
			}
			if (string.contains("*")) {

			}
			/*
			 * ASCII关系 字母关系 65～90 97～122 思考如果是其他语言呢？毫无价值。先不管。
			 */
			boolean findEnglish = false;
			findEnglish = findEnglishFromString(string);
			if (true == findEnglish) {
				WordFrequency wordFrequency = workVerbalMap.command_V._IMV_SQI_SS
					.getW(string);
				workVerbalMap.command_V.relationsEnglish.put(string,
					wordFrequency);
				continue;
			}
			/*
			 * ASCII关系 特殊符号关系 这个最难处理，各种语言符号，各种特殊符号，各种。。later
			 */
			// to do
			WordFrequency wordFrequency = workVerbalMap.command_V._IMV_SQI_SS
				.getW(string);
			workVerbalMap.command_V._IMV_SQI_SS_temp.put(string,
				wordFrequency);
		}
		S_logger.Log.logger.info("" + "筛选前主要关系数-->"
			+ workVerbalMap.command_V._IMV_SQI_SS.size());
		S_logger.Log.logger.info("" + "筛选后主要关系数-->"
			+ workVerbalMap.command_V._IMV_SQI_SS_temp.size());
		workVerbalMap.command_V._IMV_SQI_SS = workVerbalMap.command_V._IMV_SQI_SS_temp;
		return null;
	}

	private boolean findEnglishFromString(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) > 64 && string.charAt(i) < 91) {
				return true;
			}
			if (string.charAt(i) > 96 && string.charAt(i) < 123) {
				return true;
			}
		}
		return false;
	}

	public HashMap<String, String> getCartesianRelationShipFromHumanTalks(
		String[] sentences) {
		return null;
	}

	public HashMap<String, String> getCartesianPromotionTVMFromRelationShips(
		HashMap<String, String> relationShips) {
		return null;
	}

	public HashMap<String, String> getUtilsOfCartesianPromotionTVM(
		HashMap<String, String> cartesianPromotion) {
		return null;
	}

	// 提取子功能测试
	/*
	 * 在这个逻辑思维中，我一直在思考--碎片记忆与段落记忆的方式不同 则对 函数的计算影响也不同。
	 * 如何有效地区分和管理这些不同所带来的问题集合。 这是一个非常抽象的难以描述的逻辑和概念
	 * ，如果不经过反复地推敲和细腻的文字描述，很难发现这些点。可这些点偏偏价值巨大。 在科学
	 * 上，任何名词的定义是没有好似，好像，类似这种词汇思维的，如果有，那便是对基础认知
	 * 不足，或者是当前的思维无法分辨某一类现象，又或者是这类现象还没有被严谨地归纳和定义。
	 * 
	 * 1 有效地规避函数级别的死循环 和 类级别的死递归。 
	 * 2 合理地分配函数在堆栈中的序列构造，减少假缓冲和无效逻辑。
	 * 3 剔除大量的无关变量和冗余的编码片段，目的性更强。 
	 * 4 方便更进研究和扩展。
	 * 
	 * --罗瑶光
	 * 
	 */
	/*
	 * 准备定义笛卡尔的符号规范
	 * 1 因为一开始采用 全局的去动名词的全局笛卡尔关系，所以四个
	 * cartesianWorkActionsRightsVO
	 * cartesianWorkActionsRightsSV
	 * cartesianWorkActionsPositionsVO
	 * cartesianWorkActionsPositionsSV
	 * 里面的结果是一致的，所以可以剔除减少75%的计算量。
	 * averagePositionNoun 比较不再有价值需要进行全补充关系
	 * 
	 * 剔除并不是删除这些计算量 而是重新利用。原来的+和-是动和名的组合，因为是全局关系，
	 * 不再有这个逻辑了，因为人类语法动名词可以变换。动词本就是名词的一种弱属性。
	 * 那么+和-可以重新定义为 文中的词汇关系 先后为+，后先为-。这个价值可以用来观测词汇
	 * 的因果发生现象。那么这里出现第二个问题便是 当一个指令句出现多个相同的字，就+-无效了
	 * 如果做平均数来计算，那么平均数仅仅是代表距离的分布关系，而不是前后关系。
	 * 
	 * 在哲学计算的层面上，上面思考的内容属于新的关系更近分析，所以进行归纳，关系分层，
	 * 这里仅用+做笛卡尔全局计算先，新的关系和新的条件，用新的决策树函数逻辑来处理。
	 * 
	 * //那第一层决策关系函数处理的逻辑 就没有了- 和动名词之分。
	 * //VO map全部省略，SVO逻辑区 先 减少75%的内存占用。
	 * //这种操作先保留，因为动名词的全局笛卡尔逻辑全省略有风险，
	 * 
	 * 主要成分价值map
	 * cartesianWorkActionsRightsVO
	 * cartesianWorkActionsRightsSV
	 * 仅保留PCA，VO map全部省略，SVO逻辑区 ，减少80%的内存占用。
	 * 当前main功能测试通过。Tinshell测试通过。华瑞集admin界面测试通过。
	 * WorkVerbalMap_X_S 195行处PCA过滤，以后用到条件再解开slash。
	 * --罗瑶光
	 * */

	// 筛选前主要关系数-->13
	// 筛选后主要关系数-->8
	// 在含有各类特殊字符的输入中 主要成分计算量减少40% 价值巨大。
	// 在纯中文的规整字符输入中 准备应用于tinshell 和 tinshellSeparateTest 测试。
	/* 真实测试结果输出正确，计算量减少 2/38，接近5%。价值可观。
	Action-->:updateColorAttributesOfColumnsInMemoryClass
	Action-->:selectRowsByAttributesOfGetCulumns
	Action-->:findTableInMemory
	Action-->:P_ListNeedStart
	Action-->:limitedRowAttributesOfColumnsInMemoryClass
	Action-->:selectRowsByAttributesOfAggregation
	Action-->:P_TableName
	Action-->:P_fileOperations
	Action-->:selectRowsByAttributesOfCondition
	Action-->:addFindColumnsInMemoryClass
	*/
	// 结束
	/*
	 * 思考-条件和逻辑的分层筛选，对特殊的问题会产生一些盲区。可以叫bug。
	 * 稍后在处理逻辑内容时，要考虑这些盲区，写FIX管理关系函数。
	 * 并不是现在输出正确就是一直准确。环境是变化的，所以逻辑也应该遵循这个
	 * 变化中的长期稳定类规律去自适应。
	 * 
	 * --罗瑶光
	 * 
	 * */
	@SuppressWarnings("unchecked")
	public static void main(String[] argv) {
		// 初始
		FastCartesianIdentifyTest fastCartesianIdentifyTest = new FastCartesianIdentifyTest();
		// 启动测试开始
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		CommandClass command_V = new CommandClass();
		commonTestInition.NE.app_S.workVerbalMap.command_V = command_V;
		// 输入
		//String command = "条件为:和:功效|DNN搜索|功效|菜谱|4;";

		String command = "" + "在输出的数据表中仅展示从第陆行到第"
		//+ "3拾"
			+ "九" + "行的数据;";
		command_V.commandWithoutNumerics = command.toString();
		command_V.commandAcknowledge = command.toString();
		command_V.command = command.toString();
		command_V.initSixActions(commonTestInition.NE);
		command_V.initArabicNumber();
		// 计算
		commonTestInition.NE.app_S.workVerbalMap
			.setHumanTalkAfterNewBusinessTest(command_V,
				commonTestInition.NE);
		Iterator<String> iterators = command_V._IMV_SQI_SS_Q.keySet()
			.iterator();
		while (iterators.hasNext()) {
			String string = iterators.next();
			WordFrequency WordFrequency = command_V._IMV_SQI_SS_Q
				.getW(string);
			command_V._IMV_SQI_SS.put(string, WordFrequency);
		}
		commonTestInition.NE.app_S.workVerbalMap.initEnvironment();
		// 统计筛选归纳
		/*
		 * 这里效果就出来，去掉之前繁杂的调试逻辑。观测速度翻好几番。 later。。
		 */
		fastCartesianIdentifyTest
			.getCartesianRelationShipFromHumanTalk(
				commonTestInition.NE.app_S.workVerbalMap);
		/*
		 * 函数稳定后我会专门花时间分配 public private protected sync 函数方法。
		 * 目前在没有冲突的情况下 整体先 public -- 罗瑶光
		 */
		commonTestInition.NE.app_S.workVerbalMap
			.relationshipsCombinationWithNoun();
		commonTestInition.NE.app_S.workVerbalMap
			.relationshipsCombinationWithVerb();
		commonTestInition.NE.app_S.workVerbalMap
			.relationshipsCombinationWithNounAndVerb();
		commonTestInition.NE.app_S.workVerbalMap.initCartesianActions(
			commonTestInition.NE, command_V);
		commonTestInition.NE.app_S.workVerbalMap
			.sortCartesianWorkActionsPositionSV(commonTestInition.NE,
				command_V);
		commonTestInition.NE.app_S.workVerbalMap
			.sortCartesianWorkActionsDistanceSV(commonTestInition.NE,
				command_V);
		commonTestInition.NE.app_S.workVerbalMap
			.sortCartesianWorkActionsPositionVO(commonTestInition.NE,
				command_V);
		commonTestInition.NE.app_S.workVerbalMap
			.sortCartesianWorkActionsDistanceVO(commonTestInition.NE,
				command_V);
		commonTestInition.NE.app_S.workVerbalMap.actionsNormalization(
			commonTestInition.NE, command_V);
		//
		S_logger.Log.logger.info("" + "-----笛卡尔词汇观测-----");
		S_logger.Log.logger.info("" + "1-cartesianWorkA-"
			+ commonTestInition.NE.app_S.workVerbalMap.verbInText
				.size());
		Iterator<String> iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.verbInText
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">" + "");
		}
		S_logger.Log.logger.info("" + "1-cartesianWorkB-"
			+ commonTestInition.NE.app_S.workVerbalMap.nounInText
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.nounInText
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">" + "");
		}

		// 输出
		S_logger.Log.logger.info("" + "-----笛卡尔关系推荐逻辑观测-----");
		S_logger.Log.logger.info(""
			+ "1-cartesianWorkActionsPositionsSV-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsPositionsSV
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsPositionsSV
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsPositionsSV
					.getString(string));
		}

		S_logger.Log.logger.info(""
			+ "2-cartesianWorkActionsPositionsVO-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsPositionsVO
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsPositionsVO
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsPositionsVO
					.getString(string));
		}

		S_logger.Log.logger.info(""
			+ "3-cartesianWorkActionsRightsSV-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsSV
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsSV
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsSV
					.getString(string));
		}

		S_logger.Log.logger.info(""
			+ "4-cartesianWorkActionsRightsVO-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsVO
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsVO
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsVO
					.getString(string));
		}

		S_logger.Log.logger.info("" + "5-cartesianWorkActions_posSV-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActions_posSV
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActions_posSV
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActions_posSV
					.getString(string));
		}

		S_logger.Log.logger.info("" + "6-cartesianWorkActions_posVO-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActions_posVO
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActions_posVO
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActions_posVO
					.getString(string));
		}

		S_logger.Log.logger.info(""
			+ "7-cartesianWorkActionsRightsParserSV-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsParserSV
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsParserSV
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsParserSV
					.getString(string));
		}

		S_logger.Log.logger.info(""
			+ "8-cartesianWorkActionsRightsParserVO-"
			+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsParserVO
				.size());
		iteratorStrings = commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsParserVO
			.keySet().iterator();
		while (iteratorStrings.hasNext()) {
			String string = iteratorStrings.next();
			S_logger.Log.logger.info("" + string + ">"
				+ commonTestInition.NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsParserVO
					.getString(string));
		}
		commonTestInition.endEnvironment();
	}
}
//输出
//*环境初始化*
//*卷积环境 init*
//*PDE环境 init*
//*排序环境 init*
//*语料库表环境 init*
//*CNN type init*
//*ANN RNN DNN init*
//*六元催化 map*
//*花孢环境 init*
//*略先 init*
//*词性环境 init*
//*分词引擎 init*
//*自然语言环境 init*
//*其他枝叶 register*
//简体-->在输出的数据表中仅展示从第六行到第九行的数据;
//chineseSimpleCommandWithoutNumerics400-1-->在输出的数据表中仅展示从第六行到第九行的数据;
//六--14
//九--18
//混合数字字符探索-->六
//输入-->六
//简体-->六
//total2-->6
//stringSwaped-400-2->6
//position-->14
//混合数字字符探索-->九
//输入-->九
//简体-->九
//total2-->9
//stringSwaped-400-2->9
//position-->18
//chineseSimpleCommandWithoutNumerics-->在输出的数据表中仅展示从第*行到第*行的数据;
//简体-->在输出的数据表中仅展示从第六行到第九行的数据;
//chineseSimpleCommandWithoutNumerics400-1-->在输出的数据表中仅展示从第*行到第*行的数据;
//六--14
//九--18
//chineseSimpleCommandWithoutNumerics400-->在输出的数据表中仅展示从第*行到第*行的数据;
//-展示词性-
//在/介词----输出/名词----的/结构助词----数据/名词----表/动词----中/定名词----仅/形谓词作副词----展示/动词----从/介词----第/名词----*/名词----行/名词----到/动词----第/名词----*/名词----行/名词----的/结构助词----数据/名词----;/标点----在/介词----输出/名词----的/结构助词----数据/名词----表/动词----中/定名词----仅/形谓词作副词----展示/动词----从/介词----第*/名词----行/名词----到/动词----第*/名词----行/名词----的/结构助词----数据/名词----;/标点-----展示词性-
//在/介词----输出/名词----的/结构助词----数据/名词----表/动词----中/定名词----仅/形谓词作副词----展示/动词----从/介词----第*/名词----行/名词----到/动词----第*/名词----行/名词----的/结构助词----数据/名词----;/标点----
//--词汇->输出-词性->名词-平均距离->4-出现频率->1.0
//--词汇->数据-词性->名词-平均距离->44-出现频率->2.0
//--词汇->中-词性->名词-平均距离->24-出现频率->1.0
//--词汇->第*-词性->名词-平均距离->52-出现频率->2.0
//--词汇->行-词性->名词-平均距离->57-出现频率->2.0
//--词汇->表-词性->动词-平均距离->20-出现频率->1.0
//--词汇->展示-词性->动词-平均距离->37-出现频率->1.0
//--词汇->到-词性->动词-平均距离->55-出现频率->1.0
//--词汇->仅-词性->形谓词作形容词-平均距离->29-出现频率->1.0
//--词汇->仅-词性->形谓词作副词-平均距离->29-出现频率->1.0[1]
//[2]
//[4, 17]
//[5, 17]
//[7]
//[8]
//[9]
//[10]
//[12]
//[13, 17]
//[14, 17]
//[15, 17]
//[16]
//[17]
//[18, 19]
//[14]
//[18]
//在
//输出
//的
//数据
//表
//中
//仅
//展示
//从
//第
//*
//行
//到
//;
// 
//6
//9
//筛选前主要关系数-->17
//筛选后主要关系数-->14
//-----笛卡尔词汇观测-----
//1-cartesianWorkA-20
// >
//仅中>
//的>
//在>
//*>
//第到>
//展示>
//从>
//到>
//中仅>
//数据>
//中表>
//行到>
//表中>
//输出>
//6>
//到第>
//到行>
//9>
//;>
//1-cartesianWorkB-14
// >
//的>
//仅>
//在>
//*>
//展示>
//从>
//第行>
//行第>
//数据>
//输出>
//6>
//9>
//;>
//-----笛卡尔关系推荐逻辑观测-----
//1-cartesianWorkActionsPositionsSV-0
//2-cartesianWorkActionsPositionsVO-0
//3-cartesianWorkActionsRightsSV-89
//展示+第到>5
//输出+9>16
//从+第到>3
//数据+第到>4
//的+第到>5
//展示+到第>5
//从+到第>3
//数据+到第>4
//输出+表中>5
//输出+6>12
//行第+到>1
//的+数据>1
//在+行到>15
//展示+从>2
//的+到第>5
//展示+数据>1
//展示+9>8
//行第+9>3
//展示+6>4
//数据+从>1
//第行+行到>1
//行第+到行>1
//仅+的>1
//在+到第>14
//输出+中表>5
//6+到>2
//从+到>4
//从+9>6
//输出+到>14
//从+6>2
//仅+从>3
//展示+到行>6
//从+到行>4
//6+9>4
//从+行到>4
//数据+行到>5
//输出+行到>14
//在+的>9
//在+表中>6
//6+到行>2
//仅+行到>7
//在+中表>6
//输出+的>8
//的+从>2
//的+行到>6
//在+输出>1
//输出+展示>8
//仅+到>7
//输出+第到>13
//输出+到第>13
//在+到>15
//输出+仅中>6
//输出+数据>9
//的+9>8
//第行+到行>1
//仅+展示>1
//在+9>17
//6+第到>1
//6+到第>1
//的+6>4
//在+中仅>7
//的+到>6
//仅+第到>6
//仅+9>9
//在+6>13
//行第+行到>1
//仅+6>5
//仅+到第>6
//仅+数据>2
//在+展示>9
//在+仅中>7
//展示+行到>6
//数据+到行>5
//输出+到行>14
//的+到行>6
//在+第到>14
//在+数据>10
//展示+到>6
//在+从>11
//数据+到>5
//第行+9>3
//6+行到>2
//在+到行>15
//第行+到>1
//数据+6>3
//输出+中仅>6
//仅+到行>7
//数据+9>7
//输出+从>10
//4-cartesianWorkActionsRightsVO-84
//中表-数据>4
//第到-9>3
//到第-9>3
//中表-展示>3
//输出-的>8
//表中-6>7
//的-数据>1
//仅中-的>2
//的-9>8
//展示-数据>1
//的-6>4
//在-9>17
//到行-9>2
//在-行第>14
//中仅-行第>7
//在-6>13
//表中-9>11
//表中-仅>2
//中表-的>3
//从-第行>3
//中仅-的>2
//仅中-第行>7
//展示-第行>5
//中表-行第>8
//在-仅>8
//输出-行第>13
//在-从>11
//数据-从>1
//仅中-仅>1
//数据-6>3
//的-行第>5
//表中-行第>8
//行到-9>2
//数据-行第>4
//数据-9>7
//在-输出>1
//仅中-从>4
//输出-从>10
//6-第行>1
//中仅-仅>1
//仅中-6>6
//输出-展示>8
//中仅-展示>2
//输出-9>16
//表中-展示>3
//展示-从>2
//输出-6>12
//仅中-9>10
//输出-仅>7
//中仅-从>4
//表中-数据>4
//在-第行>14
//中仅-数据>3
//输出-数据>9
//中表-6>7
//展示-9>8
//中表-9>11
//从-6>2
//中仅-6>6
//展示-6>4
//中表-从>5
//中仅-9>10
//中仅-第行>7
//在-的>9
//仅中-行第>7
//中表-仅>2
//表中-的>3
//从-行第>3
//从-9>6
//在-展示>9
//表中-从>5
//6-9>4
//展示-行第>5
//的-第行>5
//中表-第行>8
//表中-第行>8
//在-数据>10
//到-9>2
//输出-第行>13
//的-从>2
//仅中-数据>3
//数据-第行>4
//仅中-展示>2
//6-行第>1
//5-cartesianWorkActions_posSV-0
//6-cartesianWorkActions_posVO-0
//7-cartesianWorkActionsRightsParserSV-0
//8-cartesianWorkActionsRightsParserVO-0
