package S_A.SixActionMap;

import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;
import java.util.LinkedList;

import ME.VPC.M.app.App;
import O_V.OSM.shell.CommandClass;

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
public class WorkVerbaMap_X_S {
	public String doName;
	public String subjectName;
	public String objectName;
	public String humanTalk;
	public IMV_SIQ fixMap;
	public IMV_SIQ doMap;
	public IMV_SIQ objectMap;
	public IMV_SIQ babeiMap;
	public IMV_SIQ verbMap;
	public IMV_SIQ data2DSubjectMap;
	public IMV_SIQ positionMap;
	public IMV_SIQ nounInText;
	public IMV_SIQ verbInText;
	public CommandClass command_V;

	public IMV_SIQ ActionsObject;
	public IMV_SIQ nounInTextFull;// later
	public IMV_SIQ verbInTextFull;// later
	public IMV_SIQ cartesianWorkActionsFull;// later

	public LinkedList<String> shortString = new LinkedList<>();
	public int[] actionsPositionV_SV;
	public String[] actionsPosition_SV;
	public int[] actionsDistanceV_SV;
	public String[] actionsDistance_SV;
	
	public int[] actionsPositionV_VO;
	public String[] actionsPosition_VO;
	public int[] actionsDistanceV_VO;
	public String[] actionsDistance_VO;
	
	public int i = 0;

	// 为什么现在不设计成implements接口，因为目前没有明确六元函数定义域规范，
	// 以后批量计算模型会CE按XCDX分解来做计算加速。
	/*
	 * 之前做了商业测试文件，里面有优化校准副词的函数逻辑，那么既然测试写了就要用到，
	 * 于是我的思维是那就直接用阿，于是就把测试函数 new出来然后将Noun和VERB取代
	 * 这里的nounInText和verbInText，准确率就提高了很多，并不代表结果会更精确，
	 * 所以替代后要将所有流程都校准一遍。 --罗瑶光
	 */
	void initEnvironment() {
		subjectName = null;
		doName = null;
		objectName = null;
		objectMap.clear();
		verbMap.clear();
		babeiMap.clear();
		nounInText.clear();// small calculus , later do full
		verbInText.clear();
		Iterator<String> iterator = command_V._IMV_SIQ_SS.keySet().iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (data2DSubjectMap.containsKey(string)) {
				objectMap.put(string, i++);
			}
			if (doMap.containsKey(string)) {
				doName += string;
				verbMap.put(string, i++);
			}
			if (fixMap.containsKey(string)) {
				babeiMap.put(string, i++);
			}
			// pos load
			WordFrequency wordFrequency = command_V._IMV_SIQ_SS.getW(string);
			// if (wordFrequency.get_pos().contains("名")) {
			// 一切数据首先都应该名词化*/
			nounInText.put(string, wordFrequency);
			// }
			// 动 pca map替换成cartsian map先 因为英语会出现had had 有且仅有这类语法。
			// if (wordFrequency.get_pos().contains("动")) {
			verbInText.put(string, wordFrequency);
			// }
			System.out.println(wordFrequency.positions);
		}
	}

	void initCartesianActions(App NE, CommandClass command_V) {
		Iterator<String> iteratorNoun = nounInText.keySet().iterator();
		NextNoun: while (iteratorNoun.hasNext()) {
			String stringNoun = iteratorNoun.next();
			if (stringNoun.isEmpty()) {
				continue NextNoun;
			}
			WordFrequency wordFrequencyNoun = command_V._IMV_SIQ_SS
					.getW(stringNoun);
			int averagePositionNoun = wordFrequencyNoun.getAveragePosition();
			Iterator<String> iteratorVerb = verbInText.keySet().iterator();
			NextVerb: while (iteratorVerb.hasNext()) {
				String stringVerb = iteratorVerb.next();
				if (stringVerb.isEmpty()) {
					continue NextVerb;
				}
				WordFrequency wordFrequencyVerb = command_V._IMV_SIQ_SS
						.getW(stringVerb);
				int averagePositionVerb = wordFrequencyVerb
						.getAveragePosition();
				// noun-verb
				String root = "";
				String root_pos = "";
				if (StudyVerbaMap.initonDelegate.containsKey(stringVerb)) {
					stringVerb = StudyVerbaMap.initonDelegate
							.getString(stringVerb);
				}
				if (averagePositionNoun < averagePositionVerb) {
					root += stringNoun;
					root += "+";
					root += stringVerb;
					root_pos += "_stringNoun" + averagePositionNoun;
					root_pos += "_stringVerb" + averagePositionVerb;
					int right = Math.abs(averagePositionNoun - averagePositionVerb);
					int position = (averagePositionNoun + averagePositionVerb) >> 1;
					if (!command_V.cartesianWorkActionsRightsSV.containsKey(root)
							&& !command_V.cartesianWorkActionsPositionsSV
									.containsKey(root)
							&& right > 0) {
						if (right < NE.app_S.initonsDistanceRelationship) {
							if (!root.contains(" ")) {
								command_V.cartesianWorkActions_posSV.put(root,
										root_pos);
								command_V.cartesianWorkActionsRightsSV.put(root,
										right);
								command_V.cartesianWorkActionsPositionsSV.put(root,
										position);
								System.out.println(root + ":" + right + ":"
										+ position + ":" + root_pos);
							}
						}
					}
				} else {
					root += stringVerb;
					root += "-";
					root += stringNoun;
					root_pos += "_stringVerb" + averagePositionVerb;
					root_pos += "_stringNoun" + averagePositionNoun;
					int right = Math.abs(averagePositionNoun - averagePositionVerb);
					int position = (averagePositionNoun + averagePositionVerb) >> 1;
					if (!command_V.cartesianWorkActionsRightsVO.containsKey(root)
							&& !command_V.cartesianWorkActionsPositionsVO
									.containsKey(root)
							&& right > 0) {
						if (right < NE.app_S.initonsDistanceRelationship) {
							if (!root.contains(" ")) {
								command_V.cartesianWorkActions_posVO.put(root,
										root_pos);
								command_V.cartesianWorkActionsRightsVO.put(root,
										right);
								command_V.cartesianWorkActionsPositionsVO.put(root,
										position);
								System.out.println(root + ":" + right + ":"
										+ position + ":" + root_pos);
							}
						}
					}
				}
			}
		}
	}

	public void initActionMap(CommandClass command_V) {
		// 计算关机分层
		objectMap = new IMV_SIQ();
		babeiMap = new IMV_SIQ();
		verbMap = new IMV_SIQ();
		fixMap = new IMV_SIQ();
		nounInText = new IMV_SIQ();
		verbInText = new IMV_SIQ();
		// （首-先，一，开始，于是，顺其自然，）
		// （将，获-取-得，授权，选择，确-定-保，认-准-定，标-记-出，拿-出-到-来，把，）
		data2DSubjectMap = new IMV_SIQ();
		data2DSubjectMap.put("表", true);
		data2DSubjectMap.put("表格", true);
		data2DSubjectMap.put("表单", true);
		data2DSubjectMap.put("东西", true);
		data2DSubjectMap.put("物", true);
		data2DSubjectMap.put("表库", true);
		data2DSubjectMap.put("矩阵", true);
		data2DSubjectMap.put("文档", true);
		data2DSubjectMap.put("文件", true);
		data2DSubjectMap.put("对象", true);
		data2DSubjectMap.put("单子", true);
		data2DSubjectMap.put("数据库", true);
		data2DSubjectMap.put("数据", true);
		data2DSubjectMap.put("文章", true);
		data2DSubjectMap.put("文献", true);
		// （表 表格-单-库，矩阵，文-档-件，对象）
		// 这里有很多问题，最终表达会影响计算精度，以后会细化分类逐步优化。-trif
		doMap = new IMV_SIQ();
		doMap.put("进行", true);
		doMap.put("执行", true);
		doMap.put("提", true);
		doMap.put("操", true);
		doMap.put("跟进", true);
		doMap.put("更近", true);
		doMap.put("更进", true);
		doMap.put("数据", true);
		doMap.put("智慧", true);
		doMap.put("逻辑", true);
		doMap.put("选择", true);
		doMap.put("操作", true);
		doMap.put("点击", true);
		doMap.put("点", true);
		doMap.put("确认", true);
		doMap.put("做", true);
		doMap.put("将", true);
		doMap.put("获取", true);
		doMap.put("获", true);
		doMap.put("获得", true);
		doMap.put("取得", true);
		doMap.put("取", true);
		doMap.put("授权", true);
		doMap.put("授", true);
		doMap.put("选", true);
		doMap.put("确定", true);
		doMap.put("确保", true);
		doMap.put("认准", true);
		doMap.put("认", true);
		doMap.put("认定", true);
		doMap.put("定", true);
		doMap.put("标记", true);
		doMap.put("标出", true);
		doMap.put("标", true);
		doMap.put("拿出", true);
		doMap.put("拿到", true);
		doMap.put("拿来", true);
		doMap.put("拿", true);
		fixMap.put("把", true);
		fixMap.put("被", true);
		doMap.put("锁定", true);
		doMap.put("锁存", true);
		doMap.put("锁", true);
		doMap.put("存", true);
		// （进行 执行 跟进 更近 更进 数据 智慧 逻辑 选择 操作 确认）
	}
}
//public IMV_SIQ_SS _IMV_SIQ_SS;
//public IMV_SIQ_S_ _IMV_SIQ_S_;
//public List<String> _IMV_SIQ_SS_ = new ArrayList<>();
// public IMV_SIQ unknown_map;
// public IMV_SIQ cartesianWorkActions_pos;
// public IMV_SIQ cartesianWorkActionsRights;
// public IMV_SIQ cartesianWorkActionsPositions;
// public IMV_SIQ normalizationalWorkActionsRights;
// public IMV_SIQ normalizationalWorkActionsPositions;
// public IMV_SIQ complementedWorkActionsRights;
// public IMV_SIQ complementedWorkActionsPositions;