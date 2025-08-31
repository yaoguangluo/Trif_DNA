package S_A.SixActionMap;

import ME.VPC.M.app.App;
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