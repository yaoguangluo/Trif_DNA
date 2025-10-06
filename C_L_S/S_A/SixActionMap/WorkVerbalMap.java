package S_A.SixActionMap;

import ME.VPC.M.app.App;
import O_V.OSM.shell.CommandClass;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ;
import test.java.InterfaceTest.chineseParser.DemoAfterPOSTest;
import test.java.InterfaceTest.chineseParser.DemoPOSTest;

import java.util.Iterator;
import java.util.List;

//1 6元SDLC
//2 sdlc obss
//3 obss normalization
//4 normalizational format
//5 format map
//6 map parser
//7 parser in PDE model
//8 model in time norms
//全部基于罗瑶光著作权基础堆积即可。
/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
@SuppressWarnings("unchecked")
public class WorkVerbalMap extends WorkVerbalMap_X {

	// 一些逻辑不应该出现在电脑上，只能文字出现在书本上。就因为电脑内置蓝牙wifi声卡接口
	//，我就不爽。不管了我就当写书一样就是了。--罗瑶光 trif
	/*
	 * 1 华瑞集的所有函数通过元基花进行注册登记，注册登记的函数进行24组十六元基编码索引分类
	 * 模拟染色体 可以序列化索引和编码所有函数。AOPM VECS IDUQ 稍后就能用上了。
	 * 
	 * 2 函数调用接口通过元基枝进行归纳分类，归纳分类的接口通过功能测试进行功能分类成六元分析机
	 * 模拟生活领域的生存技能。六元分析机 -爱-学习-帮助-创新-安全-工作-
	 * 
	 * 3 通过笛卡尔关系计算将六元功能分析机 与 24组十六元基编码索引分类函数 进行指令集熵化结果。
	 * 构造一个内存大脑tin map 保存这个熵化状态。
	 * 
	 * 4 增加面向对象继承孢子形态 OSGI形态 花语形态 手工编码形态 测试函数融合 4种形态扩展插件
	 * 指令集和VPCS业务逻辑。
	 * 
	 * 5 通过一次新陈代谢逻辑和二次新陈代谢逻辑来缩进函数名，文件名，标题名，变量名，宏名，类名
	 * 增加计算效率，肽展公式进行优化关系。
	 * 
	 * 这上述5点的-DNA元基催化与肽计算-过程保证了以后华瑞集函数指令系统进行仿生拟态杂交仅仅融合
	 * 测试文件和测试文件的统计自然选择确定那些函数和指令在杂交后保留，优先，剔除，等操作逻辑即可。
	 * 
	 * 目前这个框架越来越规范和完善。离不开详细的文字描述。这是哲学的分支。慢慢开始意识到，
	 * 人类的进化过程中一个明显的导向是对时间事物的具体描述能力。这个能力也是认知能力。所以年轻
	 * 人一定要学好语文，特别是其中的散文 叙述文和议论文。
	 * 
	 * 写到这我开始思考笛卡尔关系的去重逻辑，笛卡尔关系属于全耦合关系，不符合量子计算的规范。
	 * 关于笛卡尔关系优化，我想到了很多点，
	 * 1 首先便是去重，可以构造一个临时map来辨别当前子关系是否被重复计算。定义cartesianLooped
	 * 2 局部微分化，将段落句拆分为单句集，子单句拆分为 DNN词汇句。DNN词汇句做分词笛卡尔关系计算。
	 * 3 多层笛卡尔关系做sigma熵化，关系的过程变量进行微积分优化求导，结果作加法累积。
	 * 4 稳定功能测试后进行 -DNA元基催化与肽计算- 上述5点算法融合。
	 * 5 AOPM VECS IDUQ 指令集索引 稍后就能用上了。
	 * 
	 * 于是跟进这个5点小目标。
	 * 关于DNN的词汇归纳思考- 仅仅在子单句的长度超过30字-精度30可设成变量可自由设计-的条件下
	 * 触发DNN替代原句分析。避免繁琐计算，达到有效计算加速的目的。
	 * 
	 * --罗瑶光
	 * 
	 * */
	public boolean findSubject(App NE, CommandClass command_V) {
		initEnvironment();
		// small talk calculus
		// m 一旦笛卡尔，单字组合就没有用了，仅仅依赖分词即可。
		relationshipsCombinationWithNoun();
		// d 看了计算哲学后，我才意识到我40年生命中语文功底算是白学了。
		relationshipsCombinationWithVerb();
		// md
		relationshipsCombinationWithNounAndVerb();
		/*
		 * 发现很多变量在逻辑意识优化后，关系也变化了，一些计算产物之后都没有用到了
		 * 于是先保留，方便之后的逻辑更近。
		 * */
		// init cartesianActions
		initCartesianActions(NE, command_V);
		//SVO的关系细化分解后，逻辑操作会更加地精确。
		sortCartesianWorkActionsPositionSV(NE, command_V);
		//
		sortCartesianWorkActionsDistanceSV(NE, command_V);
		
		sortCartesianWorkActionsPositionVO(NE, command_V);
		//
		sortCartesianWorkActionsDistanceVO(NE, command_V);
		//
		actionsNormalization(NE, command_V);
		if (!objectMap.isEmpty() && !verbMap.isEmpty()) {
			return true;
		}
		return false;
	}

	/*
	 * 新的商业测试接口既然写了那就要用。作为世界记录的7年保持者，我罗瑶光要做的 只有2件事情，1
	 * 挑战我自己和期待对手挑战我，2 改变我自己对以往事物的评价， 给自己传道授业解惑。什么时候
	 * 被业界打倒了，我就退休。好多东西等我玩。写代码只是我的兴趣爱好。别抽象我。我只是个凡人。
	 */
	@SuppressWarnings("unused")
	public void setHumanTalkAfterNewBusinessTest(CommandClass command_V,
			App NE) {		
		/*
		 * 在进行分词前进行数字提取过滤，得到数字类nums和序次的map然后过滤掉这些数字
		 * 的string进行下一步的操作，如果有alfs的提取任务，就alfs也用这个逻辑处理。 
		 * --罗瑶光
		 * 
		 * */
		int res = new StudyVerbalMap().extractNumberfromString(command_V);
		/*
		 * 将replace 提取出来，然后进行字符的长度进行replace
		 * */
		//。。。todo
		this.humanTalk = command_V.command;
		// 分词 提取 英文段和数字段形成变量。比如dnn 12345等
		S_logger.Log.logger.info("chineseSimpleCommandWithoutNumerics400-->" 
		+ command_V.chineseSimpleCommandWithoutNumerics);
	
		command_V._IMV_SIQ_SS_ = NE.app_S._A
				.parserMixedString(command_V.chineseSimpleCommandWithoutNumerics);
		// -1 词频 归纳
		// -2 词性 归纳
		// 之前逻辑是 所有词性词汇 搜索 归纳
		// -未知 词汇 入 NE.app_S.workVerbalMap.unknown_map.put(string,
		// true);
		// 其他 入 mapSearchWithoutSort.put(string, wordFrequency);
		// 测试逻辑是 名 动 形 副 修正归纳 map-string-wordFrequency
		// 缺少逻辑是
		// 增加其他词性 map 同时统一入 mapSearchWithoutSort 即可逻辑有很多种，
		// 我选择 都做一遍，然后loop 替换即可我的动机是确保包含所有形式的 完整计算关系。
		//
		command_V._IMV_SIQ_SS = NE.app_S._A
				.getWordFrequencyMap(command_V._IMV_SIQ_SS_, NE);
		NE.app_S._A.initPCAWordPOS(command_V._IMV_SIQ_SS, NE);
		//
		IMV_SIQ pos = NE.app_S._A.getPosCnToCn();
		DemoPOSTest demoPOSTest = new DemoPOSTest();
		//demoPOSTest.testPOS(command_V._IMV_SIQ_SS_, pos);
		//--解决方法 首先分解
		List<String> setsInput = demoPOSTest.testPOSOnlyGetList(command_V._IMV_SIQ_SS_, pos);
		/*
		 * 思考，当一个原来的词汇关系系统计算中，纠正了副词的准确性，那么原来的函数中形容词的词数
		 * 就会大幅地减少，如果之后的跟进计算用到了形容词，而没有用到副词，那么条件的精度会增加，
		 * 而过滤数也会增加。这样的计算强调语法包含，质量提高，但性能降低。提高性能的方式是增加
		 * 副词逻辑的计算函数集。--罗瑶光
		 */
		//DemoAfterPOSTest demoAfterPOSTest = new DemoAfterPOSTest();
		//List<String> setsInput = demoAfterPOSTest.testPOS(command_V._IMV_SIQ_SS_, pos);
		//List<String> setsAfterInput = demoAfterPOSTest.testAfterPOS(setsInput, pos);
		/*
		 * 在测试文档中已经设计了更为精准的 DemoAfterPOSTest 服务，于是这里进行替换下函数，看效果如何。
		 * testAfterPOS 的逻辑是 出现单字的 同词性相联的进行合并， 但是这个格式在当前的tinshell逻辑中
		 * 不能采纳，于是需要稍微的变形。编程可采纳的格式。
		 * 
		 * 问题1 demoPOSTest.testPOS 已经将改变的词性修正 到wordFrequency 类中还注册了
		 * char position 直接变形比较麻烦，于是开始梳理思路。
		 * --解决方法 首先分解 demoPOSTest.testPOS 为两个逻辑，先修正pos 变成 含有/的 list
		 * --再list组合修正。--最终将修正的list 处理成 wordFrequency 格式list。
		 * 
		 * */
		//--再list组合修正
		DemoAfterPOSTest demoAfterPOSTest = new DemoAfterPOSTest();
		List<String> setsAfterInput = demoAfterPOSTest.testAfterPOS(setsInput, pos);
		//--最终将修正的list 处理成 wordFrequency 格式list。
		demoPOSTest.testPOStoWordFrequencyList(setsAfterInput, pos);
		// loop update and insect
		Iterator<String> iterators = demoPOSTest.noun.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (command_V._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency = command_V._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp = demoPOSTest.noun.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				command_V._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}
		iterators = demoPOSTest.verb.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (command_V._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency = command_V._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp = demoPOSTest.verb.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				command_V._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}
		iterators = demoPOSTest.adj.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (command_V._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency = command_V._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp = demoPOSTest.adj.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				command_V._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}
		iterators = demoPOSTest.adv.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (command_V._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency = command_V._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp = demoPOSTest.adv.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				command_V._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}
		/*
		* 阿拉伯数字加进map中
		*/
		Iterator<String> iteratorNumbers= command_V._IMV_SIQ_SS_Q.keySet().iterator();
		while(iteratorNumbers.hasNext()) {
			String temp= iteratorNumbers.next();
			WordFrequency wordFrequency = command_V._IMV_SIQ_SS_Q.getW(temp);
			command_V._IMV_SIQ_SS.put(temp, wordFrequency);
		}
		S_logger.Log.logger.info("");
	}

	public void setHumanTalk(CommandClass command_V, App NE) {
		command_V._IMV_SIQ_SS.clear();
		command_V._IMV_SIQ_SS_.clear();
		command_V._IMV_SIQ_S_.clear();
		this.humanTalk = command_V.command;
		// 分词 提取 英文段和数字段形成变量。比如dnn 12345等
		command_V._IMV_SIQ_SS_ = NE.app_S._A
				.parserMixedString(command_V.command);
		for (int i = 0; i < command_V._IMV_SIQ_SS_.size(); i++) {
			System.out.println(command_V._IMV_SIQ_SS_.get(i));
		}
		// 1 精确词汇pos函数
		// 2 精确词汇笛卡尔 取缔之前的老快速 map 频率
		command_V._IMV_SIQ_SS = NE.app_S._A
				.getWordFrequencyMap(command_V._IMV_SIQ_SS_, NE);
		// 3 精确词汇rnn 和 position
		// loop unknown
		// 4 精确词汇的mapping肽指令集
		// 5 局部替换即可，价值可识别12345和英文abcde 方便人类语言中入参识别。
		// */
		NE.app_S._A.initPCAWordPOS(command_V._IMV_SIQ_SS, NE);
	}

	// 先处理仅一个主谓宾的简单长句，以后处理复杂带连词的多主宾复句子。
	// 在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可
	/*
	 * 这个把被逻辑以后用指令集的形式分出去。--later
	 * */
	public String returnBestTypeOfCommands(Boolean findSubject) {
		// init shortChineseActions
		Iterator<String> iterator = objectMap.keySet().iterator();
		while (iterator.hasNext()) {
			String subject = iterator.next();
			if (babeiMap.containsKey("把")) {
				if (objectMap.getInt(subject) < babeiMap.getInt("把")) {
					subjectName += subject;
				}
				if (objectMap.getInt(subject) > babeiMap.getInt("把")) {
					objectName += subject;
				}
			} else if (babeiMap.containsKey("被")) {
				if (objectMap.getInt(subject) < babeiMap.getInt("被")) {
					objectName += subject;
				}
				if (objectMap.getInt(subject) > babeiMap.getInt("被")) {
					subjectName += subject;
				}
			} else {
				if (null == subjectName) {
					subjectName += subject;
				} else {
					objectName += subject;
				}
			}
		}
		if (findSubject) {
			String output = "";
			if (null != subjectName) {
				output = subjectName;
			}
			output += ":";
			if (null != doName) {
				output += doName;
			}
			output += ":";
			if (null != objectName) {
				output += objectName;
			}
			return output;// later
		}
		return null;
	}
}
//计算辩证意识大幅减少大量算子。

// this._IMV_SIQ_SS =
// NE.app_S._A.parserMixStringByReturnFrequencyMap(command,
// NE);

//_IMV_SIQ_SS.clear();
//_IMV_SIQ_SS_.clear();
//_IMV_SIQ_S_.clear();
//
// command_V._IMV_SIQ_SS;
// command_V._IMV_SIQ_SS_;
// command_V._IMV_SIQ_S_;
// public IMV_SIQ_SS noun = new IMV_SIQ_SS();
// public IMV_SIQ_SS verb = new IMV_SIQ_SS();
// public IMV_SIQ_SS adj = new IMV_SIQ_SS();
// public IMV_SIQ_SS adv = new IMV_SIQ_SS();