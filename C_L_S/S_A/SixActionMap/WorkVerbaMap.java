package S_A.SixActionMap;

import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import test.java.InterfaceTest.chineseParser.DemoPOSTest;

import java.util.Iterator;

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
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -(Facebook和-Gmail邮箱 我-2018年1月后从未使用，小心网墙欺诈)-
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
@SuppressWarnings("unchecked")
public class WorkVerbaMap extends WorkVerbaMap_X {

	// 一些逻辑不应该出现在电脑上，只能文字出现在书本上。就因为电脑内置蓝牙wifi声卡接口，我就不爽。
	// 不管了我就当写书一样就是了。--罗瑶光 trif
	public boolean findSubject(App NE) {
		initEnvironment();
		// small talk calculus
		// m 一旦笛卡尔，单字组合就没有用了，仅仅依赖分词即可。
		relationshipsCombinationWithNoun();
		// d 看了计算哲学后，我才意识到我40年生命中语文功底算是白学了。
		relationshipsCombinationWithVerb();
		// md
		relationshipsCombinationWithNounAndVerb();
		// init cartesianActions
		initCartesianActions(NE);
		//
		sortCartesianWorkActionsPosition(NE);
		//
		sortCartesianWorkActionsDistance(NE);
		//
		actionsNormalization(NE);
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
	public void setHumanTalkAfterNewBusinessTest(String command, App NE) {
		_IMV_SIQ_SS.clear();
		_IMV_SIQ_SS_.clear();
		_IMV_SIQ_S_.clear();
		this.humanTalk = command;
		// 分词 提取 英文段和数字段形成变量。比如dnn 12345等
		_IMV_SIQ_SS_ = NE.app_S._A.parserMixedString(command);

		// -1 词频 归纳
		// -2 词性 归纳
		// 之前逻辑是 所有词性词汇 搜索 归纳
		// -未知 词汇 入 NE.app_S.workVerbaMap.unknown_map.put(string,
		// true);
		// 其他 入 mapSearchWithoutSort.put(string, wordFrequency);

		// 测试逻辑是 名 动 形 副 修正归纳 map-string-wordFrequency
		// public IMV_SIQ_SS noun = new IMV_SIQ_SS();
		// public IMV_SIQ_SS verb = new IMV_SIQ_SS();
		// public IMV_SIQ_SS adj = new IMV_SIQ_SS();
		// public IMV_SIQ_SS adv = new IMV_SIQ_SS();

		// 缺少逻辑是
		// 增加其他词性 map 同时统一入 mapSearchWithoutSort 即可逻辑有很多种，
		// 我选择 都做一遍，然后loop 替换即可我的动机是确保包含所有形式的 完整计算关系。
		//
		this._IMV_SIQ_SS = NE.app_S._A.getWordFrequencyMap(_IMV_SIQ_SS_, NE);
		NE.app_S._A.initPCAWordPOS(this._IMV_SIQ_SS, NE);
		//
		IMV_SIQ pos = NE.app_S._A.getPosCnToCn();
		DemoPOSTest demoPOSTest = new DemoPOSTest();
		demoPOSTest.testPOS(_IMV_SIQ_SS_, pos);
		/*
		 * 思考，当一个原来的词汇关系系统计算中，纠正了副词的准确性，那么原来的函数中形容词的词数
		 * 就会大幅地减少，如果之后的跟进计算用到了形容词，而没有用到副词，那么条件的精度会增加，
		 * 而过滤数也会增加。这样的计算强调语法包含，质量提高，但性能降低。提高性能的方式是增加
		 * 副词逻辑的计算函数集。--罗瑶光
		 * */
		
		// loop update and insect
		Iterator<String> iterators = demoPOSTest.noun.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (this._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency = this._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp = demoPOSTest.noun.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				this._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}
		iterators = demoPOSTest.verb.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (this._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency = this._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp = demoPOSTest.verb.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				this._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}
		iterators = demoPOSTest.adj.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (this._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency= this._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp= demoPOSTest.adj.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				this._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}
		iterators = demoPOSTest.adv.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next();
			if (this._IMV_SIQ_SS.containsKey(temp)) {
				WordFrequency wordFrequency= this._IMV_SIQ_SS.get(temp);
				WordFrequency wordFrequencyTemp= demoPOSTest.adv.get(temp);
				wordFrequency.I_pos(wordFrequencyTemp.get_pos());
				this._IMV_SIQ_SS.put(temp, wordFrequency);
			}
		}

	}

	public void setHumanTalk(String command, App NE) {
		_IMV_SIQ_SS.clear();
		_IMV_SIQ_SS_.clear();
		_IMV_SIQ_S_.clear();
		this.humanTalk = command;
		// 分词 提取 英文段和数字段形成变量。比如dnn 12345等
		_IMV_SIQ_SS_ = NE.app_S._A.parserMixedString(command);
		for (int i = 0; i < _IMV_SIQ_SS_.size(); i++) {
			System.out.println(_IMV_SIQ_SS_.get(i));
		}
		// 1 精确词汇pos函数
		// 2 精确词汇笛卡尔 取缔之前的老快速 map 频率
		this._IMV_SIQ_SS = NE.app_S._A.getWordFrequencyMap(_IMV_SIQ_SS_, NE);
		// 3 精确词汇rnn 和 position
		// loop unknown
		// 4 精确词汇的mapping肽指令集
		// 5 局部替换即可，价值可识别12345和英文abcde 方便人类语言中入参识别。
		// */
		// this._IMV_SIQ_SS =
		// NE.app_S._A.parserMixStringByReturnFrequencyMap(command,
		// NE);
		NE.app_S._A.initPCAWordPOS(this._IMV_SIQ_SS, NE);
	}

	// 先处理仅一个主谓宾的简单长句，以后处理复杂带连词的多主宾复句子。
	//在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可
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