package test.java.InterfaceTest.tinShell;

import java.util.HashMap;
import java.util.Iterator;

import O_V.OSM.shell.CommandClass;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SixActionMap.WorkVerbaMap;
import test.java.InterfaceTest.CommonTestInition;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
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
	 * WorkVerbaMap function name-- findSubject
	 * 
	 * Yaoguang.Luo/罗瑶光
	 */
	// to do a swap..
	/*
	 * 首先提取已经有的函数通过 getCartesianRelationShipFromHumanTalk
	 * 计算细腻的处理好 WorkVerbaMap 和他的 SVO 对象，笛卡尔的关系可以通过
	 * 对象进行PCA，之前的排序就用上了，排序后选择。选择一些有代表性的，没有
	 * 特殊符号的，明确动词的关系组，然后在这些关系组中通过
	 * getCartesianPromotionTVMFromRelationShips进行跟进筛选归纳有价值的逻辑。
	 */
	public HashMap<String, String> getCartesianRelationShipFromHumanTalk(
			WorkVerbaMap workVerbaMap) {
		/*
		 * 这个函数用于 filter 笛卡尔map 中的 大量无用的成员，每减少一名成员，之后的
		 * 计算就增加一分速度和性能。
		 * 
		 * 都到这一步了，价值就非常明显了。
		 * 1 首先我找出了一个严重的问题，就是我的笛卡尔关系是拆开的分类的关系，
		 *   所以我应该设计一个新的全局关系比如 功效==搜索 然后再区分关系 功效-搜索 和 搜索+功效
		 *   区分，所以我漏掉了一个全局关系Map，目前还看不出价值，但是处理海量关系一旦有概率这个
		 *   计算全局逻辑，那么将是巨大的计算浪费。
		 *   
		 * 2 其次观测发现我的笛卡尔关系变量描述不规范 条件+功效:9:5:_stringNoun1_stringVerb10
		 *   这个例子如果更加适应计算，后后缀应该是数字代号描述会更好， 比如条件+功效:9:5:4:5:1:10,
		 *   统一格式可以探索一劳永逸的表达方式，加速思考和行为编码。
		 *   
		 * 3 发现这么多当前可以做的事情，说明计算哲学的价值巨大，一个人的研究能力是他的母语水平，
		 *   一个人的母语水平来自与他对事物的简短文字描述能力。 这个能力来自定义 和 辩证的学习力。
		 *   
		 * 4 跟进思考，首先剔除和筛选掉 全部是符号的笛卡尔关系成员，再筛选掉含有关键字符号的关系成员。
		 *   再筛选掉缺失一半关系的成员。不是删除，是筛选，所以我还要设计3个map装载这些垃圾。将来有用。
		 *   目测一半的数据被清理掉，之后性能指数翻倍。
		 *   
		 * 5 。。。
		 *   
		 * 6 完全正确的源码计算，正确地输出，稍微一个变换思考，一下出现了好多问题，而且这些问题都能有
		 *   当前环境下的标准答案。。  
		 *   
		 * 很多人不知道自己当前要干什么，并不是能力不行，恰恰是能力太强，譬如我，只是当时不知道自己
		 * 的兴趣爱好是什么。因为什么事情都思考一下，生活会很累很乏味，只是逃避而已，但是一旦知道了
		 * 进行有选择地思考，就开挂了。
		 * 
		 * 辩证思考的魅力 - 罗瑶光
		 * 
		 * */
		return null;
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
	 * ，如果不经过反复地推敲和细腻的文字描述，很难发现这些点。可这些点偏偏价值巨大。 在科学上，任何名词的定义
	 * 是没有好似，好像，类似这了词汇的，如果有，那便是对基础认知
	 * 不足，或者是当前的思维无法分辨某一类现象，又或者是这类现象还没有被严谨地归纳和定义。
	 * 
	 * 1 有效地规避函数级别的死循环 和 类级别的死递归。 2 合理地分配函数在堆栈中的序列构造，减少假缓冲和无效逻辑。
	 * 3 剔除大量的无关变量和冗余的编码片段，目的性更强。 4 方便更进研究和扩展。
	 * 
	 * --罗瑶光
	 * 
	 */
	public static void main(String[] argv) {
		// 初始
		FastCartesianIdentifyTest fastCartesianIdentifyTest = new FastCartesianIdentifyTest();
		// 启动测试开始
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		CommandClass command_V = new CommandClass();
		commonTestInition.NE.app_S.workVerbaMap.command_V = command_V;
		// 输入
		String command = "条件为:和:功效|DNN搜索|功效|菜谱|4;";
		command_V.commandWithoutNumerics = command.toString();
		command_V.commandAcknowledge = command.toString();
		command_V.command = command.toString();
		command_V.initSixActions(commonTestInition.NE);
		command_V.initArabicNumber();
		// 计算
		commonTestInition.NE.app_S.workVerbaMap
				.setHumanTalkAfterNewBusinessTest(command_V,
						commonTestInition.NE);
		Iterator<String> iterators = command_V._IMV_SIQ_SS_Q.keySet()
				.iterator();
		while (iterators.hasNext()) {
			String string = iterators.next();
			WordFrequency WordFrequency = command_V._IMV_SIQ_SS_Q.getW(string);
			command_V._IMV_SIQ_SS.put(string, WordFrequency);
		}
		commonTestInition.NE.app_S.workVerbaMap.initEnvironment();
		/*
		 * 函数稳定后我会专门花时间分配 public private protected sync 函数方法。
		 * 目前在没有冲突的情况下 整体先 public -- 罗瑶光
		 */
		commonTestInition.NE.app_S.workVerbaMap
				.relationshipsCombinationWithNoun();
		commonTestInition.NE.app_S.workVerbaMap
				.relationshipsCombinationWithVerb();
		commonTestInition.NE.app_S.workVerbaMap
				.relationshipsCombinationWithNounAndVerb();
		commonTestInition.NE.app_S.workVerbaMap
				.initCartesianActions(commonTestInition.NE, command_V);
		commonTestInition.NE.app_S.workVerbaMap
				.sortCartesianWorkActionsPositionSV(commonTestInition.NE,
						command_V);
		commonTestInition.NE.app_S.workVerbaMap
				.sortCartesianWorkActionsDistanceSV(commonTestInition.NE,
						command_V);
		commonTestInition.NE.app_S.workVerbaMap
				.sortCartesianWorkActionsPositionVO(commonTestInition.NE,
						command_V);
		commonTestInition.NE.app_S.workVerbaMap
				.sortCartesianWorkActionsDistanceVO(commonTestInition.NE,
						command_V);
		commonTestInition.NE.app_S.workVerbaMap
				.actionsNormalization(commonTestInition.NE, command_V);
		// 统计筛选归纳
		/*
		 * 这里效果就出来，去掉之前繁杂的调试逻辑。观测速度翻好几番。 later。。
		 */
		fastCartesianIdentifyTest.getCartesianRelationShipFromHumanTalk(
				commonTestInition.NE.app_S.workVerbaMap);

		// 输出

		// 结束
		commonTestInition.endEnvironment();

	}

}

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
//简体-->条件为:和:功效|DNN搜索|功效|菜谱|4;
//chineseSimpleCommandWithoutNumerics400-1-->条件为:和:功效|DNN搜索|功效|菜谱|4;
//4--22
//混合数字字符探索-->4
//4
//output-->四
//stringSwaped-400-1->四
//输入-->四
//简体-->四
//total2-->4
//stringSwaped-400-2->4
//position-->22
//chineseSimpleCommandWithoutNumerics-->条件为:和:功效|DNN搜索|功效|菜谱|*;
//简体-->条件为:和:功效|DNN搜索|功效|菜谱|4;
//chineseSimpleCommandWithoutNumerics400-1-->条件为:和:功效|DNN搜索|功效|菜谱|*;
//4--22
//chineseSimpleCommandWithoutNumerics400-->条件为:和:功效|DNN搜索|功效|菜谱|*;
//-展示词性-
//条件/名词----为/动词----:/标点----和/并列连词----:/标点----功效/名词----|dnn/NULL----搜索/名词----|/标点----功效/名词----|/标点----菜谱/形谓词通用----|/标点----*/名词----;/标点----
//--词汇->条件-词性->名词-平均距离->0-出现频率->1.0
//--词汇->功效-词性->名词-平均距离->10-出现频率->2.0
//--词汇->搜索-词性->名词-平均距离->12-出现频率->1.0
//--词汇->*-词性->名词-平均距离->21-出现频率->1.0
//--词汇->为-词性->动词-平均距离->2-出现频率->1.0
//--词汇->菜谱-词性->形谓词通用-平均距离->18-出现频率->1.0[1]
//[3]
//[4, 6]
//[5]
//[6, 15]
//[8]
//[12]
//[14, 15, 17]
//[15]
//[17]
//[18]
//[19, 20]
//[22]
//和:-功效:5:7:_stringVerb5_stringNoun10
//功效+菜谱:5:12:_stringNoun10_stringVerb15
//功效+搜索:2:11:_stringNoun10_stringVerb12
//功效+*:7:13:_stringNoun10_stringVerb17
//功效+;*:7:13:_stringNoun10_stringVerb17
//|dnn-功效:2:9:_stringVerb8_stringNoun10
//功效+*;:7:13:_stringNoun10_stringVerb17
//:和-功效:5:7:_stringVerb5_stringNoun10
//功效+4:12:16:_stringNoun10_stringVerb22
//条件-功效:9:5:_stringVerb1_stringNoun10
//:-功效:5:7:_stringVerb5_stringNoun10
//为-功效:7:6:_stringVerb3_stringNoun10
//功效+|:5:12:_stringNoun10_stringVerb15
//功效-菜谱:5:12:_stringVerb10_stringNoun15
//和:-菜谱:10:10:_stringVerb5_stringNoun15
//搜索-菜谱:3:13:_stringVerb12_stringNoun15
//菜谱+*:2:16:_stringNoun15_stringVerb17
//菜谱+;*:2:16:_stringNoun15_stringVerb17
//|dnn-菜谱:7:11:_stringVerb8_stringNoun15
//菜谱+*;:2:16:_stringNoun15_stringVerb17
//:和-菜谱:10:10:_stringVerb5_stringNoun15
//菜谱+4:7:18:_stringNoun15_stringVerb22
//条件-菜谱:14:8:_stringVerb1_stringNoun15
//:-菜谱:10:10:_stringVerb5_stringNoun15
//为-菜谱:12:9:_stringVerb3_stringNoun15
//功效-搜索:2:11:_stringVerb10_stringNoun12
//和:-搜索:7:8:_stringVerb5_stringNoun12
//搜索+菜谱:3:13:_stringNoun12_stringVerb15
//搜索+*:5:14:_stringNoun12_stringVerb17
//搜索+;*:5:14:_stringNoun12_stringVerb17
//|dnn-搜索:4:10:_stringVerb8_stringNoun12
//搜索+*;:5:14:_stringNoun12_stringVerb17
//:和-搜索:7:8:_stringVerb5_stringNoun12
//搜索+4:10:17:_stringNoun12_stringVerb22
//条件-搜索:11:6:_stringVerb1_stringNoun12
//:-搜索:7:8:_stringVerb5_stringNoun12
//为-搜索:9:7:_stringVerb3_stringNoun12
//搜索+|:3:13:_stringNoun12_stringVerb15
//和+功效:5:7:_stringNoun5_stringVerb10
//和+菜谱:10:10:_stringNoun5_stringVerb15
//和+搜索:7:8:_stringNoun5_stringVerb12
//和+*:12:11:_stringNoun5_stringVerb17
//和+;*:12:11:_stringNoun5_stringVerb17
//和+|dnn:3:6:_stringNoun5_stringVerb8
//和+*;:12:11:_stringNoun5_stringVerb17
//和+4:17:13:_stringNoun5_stringVerb22
//条件-和:4:3:_stringVerb1_stringNoun5
//为-和:2:4:_stringVerb3_stringNoun5
//和+|:10:10:_stringNoun5_stringVerb15
//|dnn+功效:2:9:_stringNoun8_stringVerb10
//和:-|dnn:3:6:_stringVerb5_stringNoun8
//|dnn+菜谱:7:11:_stringNoun8_stringVerb15
//|dnn+搜索:4:10:_stringNoun8_stringVerb12
//|dnn+*:9:12:_stringNoun8_stringVerb17
//|dnn+;*:9:12:_stringNoun8_stringVerb17
//|dnn+*;:9:12:_stringNoun8_stringVerb17
//:和-|dnn:3:6:_stringVerb5_stringNoun8
//|dnn+4:14:15:_stringNoun8_stringVerb22
//条件-|dnn:7:4:_stringVerb1_stringNoun8
//:-|dnn:3:6:_stringVerb5_stringNoun8
//为-|dnn:5:5:_stringVerb3_stringNoun8
//|dnn+|:7:11:_stringNoun8_stringVerb15
//功效-4:12:16:_stringVerb10_stringNoun22
//和:-4:17:13:_stringVerb5_stringNoun22
//菜谱-4:7:18:_stringVerb15_stringNoun22
//搜索-4:10:17:_stringVerb12_stringNoun22
//*-4:5:19:_stringVerb17_stringNoun22
//;*-4:5:19:_stringVerb17_stringNoun22
//|dnn-4:14:15:_stringVerb8_stringNoun22
//*;-4:5:19:_stringVerb17_stringNoun22
//:和-4:17:13:_stringVerb5_stringNoun22
//条件-4:21:11:_stringVerb1_stringNoun22
//:-4:17:13:_stringVerb5_stringNoun22
//为-4:19:12:_stringVerb3_stringNoun22
//|-4:7:18:_stringVerb15_stringNoun22
//条件+功效:9:5:_stringNoun1_stringVerb10
//条件+和::4:3:_stringNoun1_stringVerb5
//条件+菜谱:14:8:_stringNoun1_stringVerb15
//条件+搜索:11:6:_stringNoun1_stringVerb12
//条件+*:16:9:_stringNoun1_stringVerb17
//条件+;*:16:9:_stringNoun1_stringVerb17
//条件+|dnn:7:4:_stringNoun1_stringVerb8
//条件+*;:16:9:_stringNoun1_stringVerb17
//条件+:和:4:3:_stringNoun1_stringVerb5
//条件+4:21:11:_stringNoun1_stringVerb22
//条件+::4:3:_stringNoun1_stringVerb5
//条件+为:2:2:_stringNoun1_stringVerb3
//条件+|:14:8:_stringNoun1_stringVerb15
//为+功效:7:6:_stringNoun3_stringVerb10
//为+和::2:4:_stringNoun3_stringVerb5
//为+菜谱:12:9:_stringNoun3_stringVerb15
//为+搜索:9:7:_stringNoun3_stringVerb12
//为+*:14:10:_stringNoun3_stringVerb17
//为+;*:14:10:_stringNoun3_stringVerb17
//为+|dnn:5:5:_stringNoun3_stringVerb8
//为+*;:14:10:_stringNoun3_stringVerb17
//为+:和:2:4:_stringNoun3_stringVerb5
//为+4:19:12:_stringNoun3_stringVerb22
//条件-为:2:2:_stringVerb1_stringNoun3
//为+::2:4:_stringNoun3_stringVerb5
//为+|:12:9:_stringNoun3_stringVerb15
//功效-|:5:12:_stringVerb10_stringNoun15
//和:-|:10:10:_stringVerb5_stringNoun15
//搜索-|:3:13:_stringVerb12_stringNoun15
//|+*:2:16:_stringNoun15_stringVerb17
//|+;*:2:16:_stringNoun15_stringVerb17
//|dnn-|:7:11:_stringVerb8_stringNoun15
//|+*;:2:16:_stringNoun15_stringVerb17
//:和-|:10:10:_stringVerb5_stringNoun15
//|+4:7:18:_stringNoun15_stringVerb22
//条件-|:14:8:_stringVerb1_stringNoun15
//:-|:10:10:_stringVerb5_stringNoun15
//为-|:12:9:_stringVerb3_stringNoun15
//条件+为+2
//条件+:和+3
//条件+:+3
//条件+和:+3
//为+:+4
//条件+|dnn+4
//为+:和+4
//为+和:+4
//为+|dnn+5
//条件+功效+5
//为+功效+6
//条件+搜索+6
//和+|dnn+6
//和+功效+7
//为+搜索+7
//条件+菜谱+8
//条件+|+8
//和+搜索+8
//为+菜谱+9
//条件+*+9
//条件+;*+9
//|dnn+功效+9
//为+|+9
//条件+*;+9
//为+*+10
//|dnn+搜索+10
//为+;*+10
//和+|+10
//和+菜谱+10
//为+*;+10
//和+;*+11
//和+*;+11
//条件+4+11
//|dnn+菜谱+11
//功效+搜索+11
//和+*+11
//|dnn+|+11
//|dnn+*;+12
//|dnn+*+12
//|dnn+;*+12
//功效+菜谱+12
//功效+|+12
//为+4+12
//功效+;*+13
//功效+*+13
//功效+*;+13
//和+4+13
//搜索+|+13
//搜索+菜谱+13
//搜索+*;+14
//搜索+*+14
//搜索+;*+14
//|dnn+4+15
//菜谱+*+16
//功效+4+16
//|+;*+16
//|+*+16
//菜谱+;*+16
//菜谱+*;+16
//|+*;+16
//搜索+4+17
//|+4+18
//菜谱+4+18
//菜谱+*-2
//|+*;-2
//菜谱+;*-2
//为+和:-2
//|+*-2
//|+;*-2
//为+:-2
//条件+为-2
//为+:和-2
//菜谱+*;-2
//功效+搜索-2
//|dnn+功效-2
//搜索+菜谱-3
//和+|dnn-3
//搜索+|-3
//条件+:和-4
//条件+:-4
//|dnn+搜索-4
//条件+和:-4
//为+|dnn-5
//搜索+*-5
//功效+菜谱-5
//功效+|-5
//搜索+;*-5
//搜索+*;-5
//和+功效-5
//功效+*-7
//|+4-7
//|dnn+菜谱-7
//功效+;*-7
//和+搜索-7
//为+功效-7
//条件+|dnn-7
//功效+*;-7
//|dnn+|-7
//菜谱+4-7
//|dnn+*-9
//为+搜索-9
//|dnn+;*-9
//|dnn+*;-9
//条件+功效-9
//和+菜谱-10
//和+|-10
//搜索+4-10
//条件+搜索-11
//和+;*-12
//功效+4-12
//和+*;-12
//为+|-12
//为+菜谱-12
//和+*-12
//为+;*-14
//条件+|-14
//为+*-14
//|dnn+4-14
//条件+菜谱-14
//为+*;-14
//条件+*-16
//条件+*;-16
//条件+;*-16
//和+4-17
//为+4-19
//条件+4-21
//条件-为+2
//条件-和+3
//条件-|dnn+4
//为-和+4
//条件-功效+5
//为-|dnn+5
//:和-|dnn+6
//和:-|dnn+6
//条件-搜索+6
//:-|dnn+6
//为-功效+6
//:和-功效+7
//为-搜索+7
//:-功效+7
//和:-功效+7
//条件-菜谱+8
//:和-搜索+8
//条件-|+8
//和:-搜索+8
//:-搜索+8
//|dnn-功效+9
//为-|+9
//为-菜谱+9
//:和-菜谱+10
//和:-菜谱+10
//:和-|+10
//|dnn-搜索+10
//:-菜谱+10
//和:-|+10
//:-|+10
//|dnn-菜谱+11
//功效-搜索+11
//|dnn-|+11
//条件-4+11
//为-4+12
//功效-|+12
//功效-菜谱+12
//和:-4+13
//:-4+13
//搜索-|+13
//:和-4+13
//搜索-菜谱+13
//|dnn-4+15
//功效-4+16
//搜索-4+17
//|-4+18
//菜谱-4+18
//*-4+19
//*;-4+19
//;*-4+19
//功效-搜索-2
//条件-为-2
//为-和-2
//|dnn-功效-2
//搜索-|-3
//:-|dnn-3
//和:-|dnn-3
//:和-|dnn-3
//搜索-菜谱-3
//条件-和-4
//|dnn-搜索-4
//功效-|-5
//为-|dnn-5
//和:-功效-5
//*;-4-5
//*-4-5
//;*-4-5
//:和-功效-5
//:-功效-5
//功效-菜谱-5
//|-4-7
//为-功效-7
//|dnn-菜谱-7
//菜谱-4-7
//:-搜索-7
//|dnn-|-7
//条件-|dnn-7
//:和-搜索-7
//和:-搜索-7
//为-搜索-9
//条件-功效-9
//和:-菜谱-10
//:和-|-10
//:-菜谱-10
//搜索-4-10
//:和-菜谱-10
//:-|-10
//和:-|-10
//条件-搜索-11
//功效-4-12
//为-菜谱-12
//为-|-12
//条件-菜谱-14
//条件-|-14
//|dnn-4-14
//:和-4-17
//:-4-17
//和:-4-17
//为-4-19
//条件-4-21
