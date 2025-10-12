package S_A.SixActionMap;

import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SQI;

import java.util.Iterator;
import java.util.LinkedList;

import ME.VPC.M.app.App;
import O_V.OSM.shell.CommandClass;

/*
 * 1 6元SDLC
 * 2 sdlc obss
 * 3 obss normalization
 * 4 normalizational format
 * 5 format map
 * 6 map parser
 * 7 parser in PDE model
 * 8 model in time norms
 * 全部基于罗瑶光著作权基础堆积即可。
 **/
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
public class WorkVerbalMap_X_S {
	public String doName;
	public String subjectName;
	public String objectName;
	public String humanTalk;
	public IMV_SQI fixMap;
	public IMV_SQI doMap;
	public IMV_SQI objectMap;
	public IMV_SQI babeiMap;
	public IMV_SQI verbMap;
	public IMV_SQI data2DSubjectMap;
	public IMV_SQI positionMap;
	public IMV_SQI nounInText;
	public IMV_SQI verbInText;
	/*
	 * 开始设计高级笛卡尔关系 分
	 * 稳定后在思考变量的归纳方式。
	 * 关于精细化map的价值，举例50个子集成员进行处理，有20个单子集合并成20个双子集，那么当时
	 * 最早的逻辑是 替换组合子集 = （50 - 20 + 20）*（50 - 20 + 20）= 2500，这种方法在处理从- 到-
	 * 问题时候失效了，于是后修改为 笛卡尔关系 包含本身 累积是 70 * 70 = 4900。这种方法ok但速度翻了
	 * 1倍， 于是现在准备采用高级map， 思考--当 map 分区后，原系是 （50-20）*（50-20）= 900， 
	 * 单子集 20 * 20 = 400，合并双子集 20 * 20 = 400，原系-单子集 = 30 * 20 = 600，
	 * 原系-合并双子集 = 30 * 20 = 600；单子集-合并双子集= 20 * 20 = 400 
	 * 共计900 + 400 + 400 + 600 + 600 + 400 = 3300， 效果就出来，不但精确了双子集的价值
	 * 因为包含 原系-单子集 逻辑， 所以还依旧保留了从- 到-的问题解决方案。
	 * 
	 * 稍后编码从理论走向真实论证，注意规避一些 PCA 逻辑误区。估计有200行源码要增删构造。
	 * 
	 * 哲学问题论证--任何理论充分的奇想和冥想在没有一个真实具体的客观参照事务作为论据对象，
	 * 都属于某种形式的空想。不能否定其价值，所以属于一类可以被尊重的无效计算。
	 * 
	 * --罗瑶光
	 * */
	public IMV_SQI nounInTextSimple;
	public IMV_SQI verbInTextSimple;
	/*
	 * 开始设计高级笛卡尔关系 渡
	 * */
	public IMV_SQI nounInTextReason;
	public IMV_SQI verbInTextReason;
	/*
	 * 开始设计高级笛卡尔关系 簇
	 * */
	public IMV_SQI nounInTextFix;
	public IMV_SQI verbInTextFix;
	/**/
	public CommandClass command_V;

	public IMV_SQI ActionsObject;
	public IMV_SQI nounInTextFull;// later
	public IMV_SQI verbInTextFull;// later
	public IMV_SQI cartesianWorkActionsFull;// later

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

	/* 
	 * 为什么现在不设计成implements接口，因为目前没有明确六元函数定义域规范，
	 * 以后批量计算模型会CE按XCDX分解来做计算加速。
	 *
	 * 之前做了商业测试文件，里面有优化校准副词的函数逻辑，那么既然测试写了就要用到，
	 * 于是我的思维是那就直接用阿，于是就把测试函数 new出来然后将Noun和VERB取代
	 * 这里的nounInText和verbInText，准确率就提高了很多，并不代表结果会更精确，
	 * 所以替代后要将所有流程都校准一遍。 --罗瑶光
	 * 
	 */
	public void initEnvironment() {
		subjectName = null;
		doName = null;
		objectName = null;
		objectMap.clear();
		verbMap.clear();
		babeiMap.clear();
		nounInText.clear();// small calculus , later do full
		verbInText.clear();
		Iterator<String> iterator = command_V._IMV_SQI_SS.keySet()
			.iterator();
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
			WordFrequency wordFrequency = command_V._IMV_SQI_SS.getW(
				string);
			// 一切数据首先都应该名词化*/
			nounInText.put(string, wordFrequency);
			verbInText.put(string, wordFrequency);
			S_logger.Log.logger.info("" + wordFrequency.positions);
		}
	}

	/* root_v += stringVerb;
	 * root_v += "-";
	 * root_v += stringNoun;
	/* 
	 * CN
	 * --十六元基索引逻辑
	 * 1 名词索引价值用于古拉丁英文索引元基编码加速特征片段识别。
	 * 2 动词索引价值用于TVM指令集快速降维面化 进行 触发计算识别。
	 * 
	 * EN
	 * 16 Initon indexing
	 * 1 Latin noun's verbal exchange could make cluster with short
	 * 	 , less and same sections of DNA initons.
	 *   better for observation. 
	 *   
	 * 2 Latin verb's verbal exchange could make trigger with short
	 *   , less and same sections of DNA initons.
	 *   better for computation.
	 *     
	 * --罗瑶光
	 * 
	 * 稍后开始整理关系map，分出精细的属性成员出来。
	 * */
	@SuppressWarnings("unused")
	public void initCartesianActions(App NE, CommandClass command_V) {
		Iterator<String> iteratorNoun = nounInText.keySet()
			.iterator();
		NextNoun: while (iteratorNoun.hasNext()) {
			String stringNoun = iteratorNoun.next();
			if (stringNoun.isEmpty()) {
				continue NextNoun;
			}
			if (!command_V._IMV_SQI_SS.containsKey(stringNoun)) {
				continue NextNoun;
			}
			WordFrequency wordFrequencyNoun = command_V._IMV_SQI_SS
				.getW(stringNoun);
			int averagePositionNoun = wordFrequencyNoun
				.getAveragePosition();
			Iterator<String> iteratorVerb = verbInText.keySet()
				.iterator();
			NextVerb: while (iteratorVerb.hasNext()) {
				String stringVerb = iteratorVerb.next();
				if (stringVerb.isEmpty()) {
					continue NextVerb;
				}
				if (!command_V._IMV_SQI_SS.containsKey(stringVerb)) {
					continue NextVerb;
				}
				WordFrequency wordFrequencyVerb = command_V._IMV_SQI_SS
					.getW(stringVerb);
				int averagePositionVerb = wordFrequencyVerb
					.getAveragePosition();
				// noun-verb
				String root = "";
				//String root_v = "";
				String root_pos = "";
				//String root_pos_v = "";
				if (NE.app_S.studyVerbalMap.initonDelegate
					.containsKey(stringVerb)) {
					stringVerb = NE.app_S.studyVerbalMap.initonDelegate
						.getString(stringVerb);
				}
				if (averagePositionNoun < averagePositionVerb) {
					//                  later do noun's domains. 					
					if (NE.app_S.studyVerbalMap.initonDelegate
						.containsKey(stringNoun)) {
						stringNoun = NE.app_S.studyVerbalMap.initonDelegate
							.getString(stringNoun);
					}
					if (NE.app_S.studyVerbalMap.initonDelegate
						.containsKey(stringVerb)) {
						stringVerb = NE.app_S.studyVerbalMap.initonDelegate
							.getString(stringVerb);
					}
					root += stringNoun;
					root += "+";
					root += stringVerb;

					root_pos += "_stringNoun" + averagePositionNoun;
					root_pos += "_stringVerb" + averagePositionVerb;

					/* root_pos_v += "_stringVerb" + averagePositionVerb;
					*  root_pos_v += "_stringNoun" + averagePositionNoun;
					*/
					int right = Math.abs(averagePositionNoun
						- averagePositionVerb);
					int position = (averagePositionNoun
						+ averagePositionVerb) >> 1;
					if (!command_V.cartesianWorkActionsRightsSV
						.containsKey(root)
						&& !command_V.cartesianWorkActionsPositionsSV
							.containsKey(root) && right > 0) {
						if (right < NE.app_S.initonsDistanceRelationship) {
							if (!root.contains(" ")) {
								command_V.cartesianWorkActionsRightsSV
									.put(root, right);
							}
						}
					}
				} else {
					if (NE.app_S.studyVerbalMap.initonDelegate
						.containsKey(stringNoun)) {
						stringNoun = NE.app_S.studyVerbalMap.initonDelegate
							.getString(stringNoun);
					}
					if (NE.app_S.studyVerbalMap.initonDelegate
						.containsKey(stringVerb)) {
						stringVerb = NE.app_S.studyVerbalMap.initonDelegate
							.getString(stringVerb);
					}
					root += stringVerb;
					root += "-";
					root += stringNoun;
					root_pos += "_stringVerb" + averagePositionVerb;
					root_pos += "_stringNoun" + averagePositionNoun;
					int right = Math.abs(averagePositionNoun
						- averagePositionVerb);
					int position = (averagePositionNoun
						+ averagePositionVerb) >> 1;
					if (!command_V.cartesianWorkActionsRightsVO
						.containsKey(root)
						&& !command_V.cartesianWorkActionsPositionsVO
							.containsKey(root) && right > 0) {
						if (right < NE.app_S.initonsDistanceRelationship) {
							if (!root.contains(" ")) {
								command_V.cartesianWorkActionsRightsVO
									.put(root, right);
							}
						}
					}
				}
			}
		}
	}
	/* command_V.cartesianWorkActions_posSV.put(root,
	*		root_pos);
	* command_V.cartesianWorkActionsRightsParserSV.put(stringNoun + "+",
	*		right);
	* command_V.cartesianWorkActionsRightsParserSV.put("+" + stringVerb,
	*		right);
	* command_V.cartesianWorkActionsPositionsSV.put(root,
	*		position);
	* S_logger.Log.logger.info("" + root + ":" + right + ":"
	*		+ position + ":" + root_pos);
	*/
	/*
	 * command_V.cartesianWorkActions_posVO.put(root,
	 *		root_pos);
	 * command_V.cartesianWorkActionsRightsParserVO.put(stringVerb + "-",
	 *		right);
	 * command_V.cartesianWorkActionsRightsParserVO.put("-" + stringNoun,
	 *		right);
	 * command_V.cartesianWorkActionsPositionsVO.put(root,
	 *		position);
	 * S_logger.Log.logger.info("" + root + ":" + right + ":"
	 *		+ position + ":" + root_pos);
	 *
	 */

	public void initActionMap(CommandClass command_V) {
		// 计算关机分层
		objectMap = new IMV_SQI();
		babeiMap = new IMV_SQI();
		verbMap = new IMV_SQI();
		fixMap = new IMV_SQI();
		nounInText = new IMV_SQI();
		verbInText = new IMV_SQI();
		// （首-先，一，开始，于是，顺其自然，）
		// （将，获-取-得，授权，选择，确-定-保，认-准-定，标-记-出，拿-出-到-来，把，）
		data2DSubjectMap = new IMV_SQI();
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
		doMap = new IMV_SQI();
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
//public IMV_SQI_SS _IMV_SQI_SS;
//public IMV_SQI_S_ _IMV_SQI_S_;
//public List<String> _IMV_SQI_SS_ = new ArrayList<>();
// public IMV_SQI unknown_map;
// public IMV_SQI cartesianWorkActions_pos;
// public IMV_SQI cartesianWorkActionsRights;
// public IMV_SQI cartesianWorkActionsPositions;
// public IMV_SQI normalizationalWorkActionsRights;
// public IMV_SQI normalizationalWorkActionsPositions;
// public IMV_SQI complementedWorkActionsRights;
// public IMV_SQI complementedWorkActionsPositions;