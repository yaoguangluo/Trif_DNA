package O_V.OSM.shell;

import ME.VPC.M.app.App;
import O_V.OSA.shell.PL_XA_E;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import S_I.OSI.PSO.regex.DoSplit;
import S_A.pheromone.IMV_SQI_utils;
import U_V.ESU.list.List_ESU_X_stringlistToStringArray;
import test.java.InterfaceTest.tinShell.FastCartesianIdentifyTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class E_pl_XA_E {
	@SuppressWarnings("unchecked")
	/*
	* command是一条最短的指令句，指令句变成指令的中间数据目前保留在 
	* NE.app_S.workVerbalMap 中，我在思考，每次计算完一句指令，这些过程产物都要clear
	* 掉，这是一种C语言的free写法，在高级的java结构中，可以进行单例来class null掉，意
	* 思是我可以创造一个command class，这个类专门负责command的数据碎片，这个class可
	* 以list形式进入tinmap，也可以每次执行完被G1GC来null掉，想到这里，于是先命名个
	* command Class先。 --地址在package O_V.OSM.shell; --函数名CommandClass
	* 
	*/
	/*
	* 开始构造混合歧义语义数字构造机，在这里要构造2个函数，一个是initArabicNumber
	* 用于提取混合数字变量到command_V._IMV_SQI_SS中，我定义为_IMV_SQI_SS_Q
	* 另外一个函数是fussionOfArabicNumber，用于原函数进行组合_IMV_SQI_SS_Q的内容。
	* 注意initArabicNumber提取数字要提取position，避免序次问题出错。 --罗瑶光
	*/
	/*
	* 思考关于关系分类的价值，表面的含义我就不介绍了，如果我要输出我的思维方式要优秀于传
	* 统的认知方式，就要有明显的论证和论据来强调我的HVPCS关系要优秀于普通的模型，显而易
	* 见，今天的逻辑分层和关系分类最大的价值是我挖掘到了一个中间层map unknowMap ，这个
	* 隐匿在我的workmap中又要的表达在command的逻辑中，于是出现了一行逻辑错误，文件地址
	* package E_A.ME.analysis.E; 函数名 CogsBinaryForest_AE的 218行
	* //关联studyMap later -trif ，这个unknow关系不应该
	* 被包含在workmap中，我扔在网上完整的华瑞集源码和开发文档，
	* 
	* 我要严谨的提醒的是 这些年一些用户看了后，模仿窥伺我，改我的思维方式和函数名，到时
	* 候出了问题，别怪我没提醒。 我的逻辑是HVPCS+ 元基编码 + 时函数 + 计算哲学。用户
	* 们既然要模仿我的风格，就要深入接触这4个领域。我的动机是当然希望人才辈出，早点超越
	* 我，对得起我苦心细致的文字描述。2018 分词如果lucene 每秒当时能够上 2000万，我
	* 就省了好多事。但做事一定要脚踏实地。 我写文字的动机1是著作权在先权分析，文字分解
	* 后就可以进行相似度匹配。
	* 2 是方便教材方式方向文字描述，制造各类深度思考问题，授人之渔。
	* 
	* --罗瑶光
	*/
	/*
	* 既然用到了normalization的修正，那么这里也替换下进行性能测试将之前的简单
	* cartesianWorkActionsRights替换成normalizationalWorkActionsRights
	* 看下输出结果，结果正确，之后在不断地增加函数时候会逐步的修正这个map的分类计算结构。
	* 我归纳这种计算逻辑概念为计算哲学中的 -逻辑意识因果表达结构分层- -罗瑶光
	*
	*/
	/*
	* 准备把心态摆正一下。降低自己的思维跳跃活性，用于保证持续的思绪稳定。 思考，关于
	* normalizationalWorkActionsRights 的形态是 actionsDistance[i]
	* + "-" + actionsDistanceV[i] 其中
	* actionsDistance[i]的形态是cartesianWorkActionsRights的key 而
	* cartesianWorkActionsRights的key构造来自于WorkVerbalMap_X_S的166行的初始
	* root 于是我开始思考，在计算关系分层的时候缺少了一些中间过程的碎片记录，这个记录关系
	* 导致了我之后要花双倍时间来重复计算曾经已有的却未保留的结果，论证在计算哲学中，计算关
	* 系可以外因计算逻辑。于是开始优化准备将root的组合因子进行map化。从而过滤掉下面的重复
	* 逻辑。于是在CommandClass中定义rootMap来封装root，rootRelation来封装root的关系。
	* 这里root不包含pos后戳，不包含 _ 无效, 去掉此逻辑。于是可以化简如下。
	* 
	* --罗瑶光
	*/
	/*
	* 因为是取精度，所以-号关于stringSets最末一位即可获取答案。
	* 我在思考-stringSets也是一种重复逻辑，于是有必要将之间的DNN精度也保留在map中。
	* command_V.cartesianWorkActionsRights 通过500字的思绪描述，最终优化的逻辑。
	* 大幅减少冗余的变量和堆栈关系。
	* 
	* 在进行构造关系的分析过程中，发现split的操作是一种流程逻辑错误的弥补。弥补之前在
	* 指令句关系计算中没有规划好属性的形态。稍后优化好形态，提高笛卡尔的计算 性能 
	* -trif --罗瑶光
	*/
	/*
	* map细化分解的好处显而易见，如我的早期的德塔分词，map全部分解。这是一种
	* 计算关系催化过程。之后这个map也可以元基来索引加速遍历。 --罗瑶光
	* 德塔分词三个四字成语的最大距离是12 构成一个主谓宾短句
	* 过滤和缩减了海量关系计算集合。
	*/
	/*
	* 目前这种分解方式可以有效地统计函数序列和扩充新的函数集，但是计算结构属于编译结构，
	* 所谓的编译结构是，根据已经有的东西进行逻辑编码，让系统通过某种条件能找到和启动它。
	* 而不是智慧结构，我理解为面对抽象的数据进行综合评估，得到某些可计算流程，并预想这
	* 个逻辑能得到和接近某类想要的结果。构造一个智慧结构于是开始思考，计算辩证学说内因
	* 量变，是一种方法，否定论也是一种方法，采样计算也符合这个观点，我就随便选一个练手
	* 既然主流天天夸赞采样，打分等方法论多厉害，我就走下否定论思维，反正挑战我自己。怎么
	* 难怎么上。首先我否定我自己，我是菜鸟，远离那些高大上先，方便新的开始。 --罗瑶光
	* 既然是新的开始，于是开始构造否定思维框架，第一个框架是否定打分和量变的函数价值，
	* 我就不打分，做精确匹配怎么做？元基索引，固定的十六元基进行分类明确包含关系标识
	* 进行匹配计算，那就开始了，每个函数都依次进行元基索引标识。怎么做？在商业测试文件
	* 中进行统计所有的工程函数，每个函数的对应文件夹地址作为KEY，精确搜索Key执行。
	* 高频优先，低频下放。那就开干了。见package
	* test.java.InterfaceTest.initon.util; --罗瑶光
	* 
	*/
	public static TinMap E_pl_XA(String plSearch, boolean mod,
		TinMap output, App NE) throws InterruptedException,
		IOException {

		if (null == output) {
			output = NE._I_U.outputMap;// later all in 1 and contans objectmap
		}
		output.put("firstTime", "true");
		output.put("start", "0");
		output.put("countJoins", "0");
		// 2make line
		List<String> lists = DoSplit.splitRegex(plSearch.replace(" ",
			"").replace("\n", ""), ";", "\\", "\\");
		String[] commands = List_ESU_X_stringlistToStringArray._E(
			lists);
		NE._I_U.acknowledge = null;
		String[] acknowledgeSwap = null;
		for (String command : commands) {
			HashMap<String, Integer> scores = new HashMap<>();
			NE._I_U.commandAcknowledge = command;
			S_logger.Log.logger.info("" + "command" + command);
			CommandClass command_V = new CommandClass();
			// 函数注册 价值降低
			NE.app_S.workVerbalMap.command_V = command_V;
			NE.app_S.currentTinmap = output;
			// 之后整体替换下。方便command_V管理。
			command_V.commandWithoutNumerics = command.toString();
			command_V.commandAcknowledge = command.toString();
			command_V.command = command.toString();
			command_V.initSixActions(NE);
			command_V.initArabicNumber();

			// -1 计算逻辑关系根据不同的环境会有不同的组合，最优关系是频率出来的，不是
			// 关键字分析出来的。所以动态化计算是趋势。
			String commandSwap = doHumanTalkSwap(NE, command_V);
			command_V.commandSwap = commandSwap;
			List<String> commandLists = DoSplit.splitRegex(command,
				":", "\\", "\\");
			command_V.commandLists = commandLists;
			// ESU_X swap系列 稍后并到测试文件中 -trif
			NE._I_U.acknowledge = List_ESU_X_stringlistToStringArray
				._E(commandLists);
			command_V.acknowledge = NE._I_U.acknowledge;
			if (null != commandSwap) {// splitRegex稍后并到测试文件中 -trif
				commandLists = DoSplit.splitRegex(commandSwap, ":",
					"\\", "\\");
				acknowledgeSwap = List_ESU_X_stringlistToStringArray
					._E(commandLists);
				command_V.acknowledgeSwap = acknowledgeSwap;
				S_logger.Log.logger.info("" + commandSwap);
				doAcknowledgeSwap(acknowledgeSwap, command, NE);
				// later // duplications
				// return null;
			}
			// -2
			String[] temp = NE._I_U.acknowledge.clone();
			// Iterator<String> iterators =
			// NE.app_S.workVerbalMap.cartesianWorkActionsRights
			// .keySet().iterator();
			Iterator<String> iterators = command_V.cartesianWorkActionsRightsSV
				.keySet().iterator();
			while (iterators.hasNext()) {
				String string = iterators.next();
				// String[] strings = string.split("_");//不包含 _ 无效,去掉此逻辑。
				S_logger.Log.logger.info("" + "400-10000001"
					+ string);
				if (null != string) {
					/* loop s later */
					int scaleRights;
					scaleRights = command_V.cartesianWorkActionsRightsSV
						.getInt(string);
					if (scaleRights < 12) {
						S_logger.Log.logger.info(""
							+ "couldDoThenDo-1-" + string);
						IMV_SQI_utils.couldDoThenDo(string, temp,
							output, NE, scores);
					}
					// later // in // pdn
				}
			}
			// SVO主谓宾的中文缩写。cartesianWorkActionsRights分解后SV和VO可以
			// 以后形成严谨的指令句匹配规范
			iterators = command_V.cartesianWorkActionsRightsVO
				.keySet().iterator();
			while (iterators.hasNext()) {
				String string = iterators.next();
				// String[] strings = string.split("_");//不包含 _ 无效,去掉此逻辑。
				S_logger.Log.logger.info("" + "400-10000001"
					+ string);
				if (null != string) {
					int scaleRights;
					if (command_V.cartesianWorkActionsRightsVO
						.containsKey(string)) {
						scaleRights = command_V.cartesianWorkActionsRightsVO
							.getInt(string);
					} else {
						scaleRights = 9999;
					}
					if (scaleRights < 12) {
						S_logger.Log.logger.info(""
							+ "couldDoThenDo-2-" + string);
						IMV_SQI_utils.couldDoThenDo(string, temp,
							output, NE, scores);
					}
				}
			}
			// -3
			command_V.cartesianWorkActionsRightsSV.clear();
			command_V.cartesianWorkActionsPositionsSV.clear();
			command_V.cartesianWorkActions_posSV.clear();

			command_V.cartesianWorkActionsRightsVO.clear();
			command_V.cartesianWorkActionsPositionsVO.clear();
			command_V.cartesianWorkActions_posVO.clear();
			command_V.unknown_map.clear();
			/*
			* 这样command_V的价值就出来了，clear之后再GC，双重清理，在垃圾器的优化
			* 环境里会内存更加稳定。
			*/
			/* loop s later */
			S_logger.Log.logger.info("" + "couldDoThenDo-3-"
				+ temp[0]);
			IMV_SQI_utils.couldDoThenDo(temp[0], temp, output, NE,
				scores);// later in pdn */
			if (temp[0].equals("获取临时表名")) {
				// 稍后写入 元基花
				output.put(temp[0], temp[1]);
				output.put("type", temp[2]);
			}
			output.put("newCommand", temp[0]);
			Pl_XA_Command_E.P_E(temp, output, mod, NE);
			output.put("lastCommand", output.get("newCommand"));
		}
		if (null != NE._I_U.acknowledge) {
			if (output.get("start").toString().equals("1")) {
				Pl_XA_Command_E.P_E(NE._I_U.acknowledge, output, mod,
					NE);
			}
		}
		Pl_XA_Command_E.P_Check(output.get("newCommand").toString(),
			output, mod, NE);
		return output;
	}

	// 哲学 辩证学 辩论
	private static boolean hasVerb(String[] acknowledgeSwap,
		int position, App NE) {
		String string = acknowledgeSwap[position];
		List<String> list = NE.app_S._A.parserMixedString(string);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String stringIterator = iterator.next();
			if (NE.app_S.workVerbalMap.doMap.containsKey(
				stringIterator)) {
				return true;
			}
		}
		return false;
	}

	private static boolean hasData2DSubject(String[] acknowledgeSwap,
		int position, App NE) {
		String string = acknowledgeSwap[position];
		List<String> list = NE.app_S._A.parserMixedString(string);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String stringIterator = iterator.next();
			if (NE.app_S.workVerbalMap.data2DSubjectMap.containsKey(
				stringIterator)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * 现在出现了一个问题，我的PLSEARCH系统是针对我的已经有的函数进行语言驱动，这种驱动
	 * 计算方式是更好地辅助我已经有的函数进行序列可控操作。如果不断地增加新的函数，和扩展
	 * 系统的使用方式，那么遇到的问题根据这种逻辑便会指数增加，于是我停止了下脚步，我在思
	 * 考，一种不需要辅助也能计算出有用结果的通用类逻辑，在最恶劣的环境里，只需要加入某种
	 * 精度组合就能覆盖所有条件搭配的逻辑，目前我找到了很多方法，
	 * 
	 * 1-明确动词的指令集，因为人类的动词不但数量少还有限，又精确。非常方便 第一步索引先。
	 * 2-单句分解指令集，因为单句是一个完整逻辑句，方便以后各类歧义 句型 复句句型首先转换
	 *   为单句再执行即可。
	 * 3-最大的价值在 1 和 2 可以直接元基 索引 IDUQ 分类即可。方便我的花语系统加速。 
	 *   如六元-StudyVerbalMap
	 * 
	 */
	private static void doAcknowledgeSwap(String[] acknowledgeSwap,
		String command, App NE) {
		// null 将 授权 选择 进行 执行 数据 智慧 逻辑 操作 :null数据 矩阵 对象 表格 表
		boolean hasData2DSubjectBoolean = hasData2DSubject(
			acknowledgeSwap, 0, NE);
		boolean hasVerbBoolean = hasVerb(acknowledgeSwap, 1, NE);
		if ((hasData2DSubjectBoolean/**/) && (hasVerbBoolean/**/)) {
			doHuoQuBiaoMingSwap(command, NE);
			return;
		}
		boolean hasData2DObjectBoolean = hasData2DSubject(
			acknowledgeSwap, 2, NE);
		if ((hasVerbBoolean/**/) && (hasData2DObjectBoolean/**/)) {
			doHuoQuBiaoMingSwap(command, NE);
			return;
		}
	}

	@SuppressWarnings("unchecked")
	private static void doHuoQuBiaoMingSwap(String command, App NE) {
		Iterator<String> iterator = NE.app_S.tableNameMap.keySet()
			.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (command.contains(string)) {
				NE._I_U.acknowledge = new String[3];
				NE._I_U.acknowledge[0] = "获取表名";
				NE._I_U.acknowledge[1] = string;
				NE._I_U.acknowledge[2] = "进行选择";
				return;
			}
		}
	}

	@SuppressWarnings("unused")
	private static void doTinshellTalk() {
	}

	// later out to data swap api
	/*
	* （首-先，一，开始，于是，顺其自然，）
	* （将，获-取-得，授权，选择，确-定-保，认-准-定，标-记-出，拿-出-到-来，把，）
	* （表 表格-单-库，矩阵，文-档-件，对象）
	* （进行 执行 跟进 更近 更进 数据 智慧 逻辑 选择 操作 确认）
	*  work domain out later.
	*  NE.app_S.workVerbalMap.setHumanTalk(command, NE);
	*  
	*  准备整体将注解提取到函数体外部，避免无效计算，这样做需要进行标识。如关键字+～+处
	*  setHumanTalkAfterNewBusinessTest处，避免修改频繁，不要写行数。
	*  
	*  举例
	*  关键字 getCartesianRelationShipFromHumanTalk 处 思考
	*  思考1 - 当构造混合中文数字提取转换匹配后，进行归纳格式化成map，这个map则需要在
	*  这一层进行和分词结果整合。这种逻辑属于ETL类型逻辑， command_V._IMV_SQI_SS
	*  command_V._IMV_SQI_SS_Q
	* 
	*  思考2 - 所以这种逻辑以后可以更进分解swap成用tinshell OSGI ETL节点来中文节点分层
	*  ，以后人工智能的基础思考模型就稳定了。然后元基索引 使用频率统计排序归纳，创造一个 
	*  自然选择的计算模拟环境。
	* 
	*   这一层逻辑已经并入了 setHumanTalkAfterNewBusinessTest，于是注释掉。	
	*   Iterator<String> iterators = command_V._IMV_SQI_SS_Q.keySet()
	*   	.iterator();
	*   while (iterators.hasNext()) {
	*   	String string = iterators.next();
	*   	WordFrequency WordFrequency = command_V._IMV_SQI_SS_Q
	*   		.getW(string);
	*   	command_V._IMV_SQI_SS.put(string, WordFrequency);
	*   }
	*   分词的position要统计char位置，不是word位置，不然会不准确 later --trif一下
	*  
	*  --罗瑶光
	*/
	public static String doHumanTalkSwap(App NE,
		CommandClass command_V) {

		NE.app_S.workVerbalMap.setHumanTalkAfterNewBusinessTest(
			command_V, NE);

		FastCartesianIdentifyTest fastCartesianIdentifyTest = new FastCartesianIdentifyTest();
		fastCartesianIdentifyTest
			.getCartesianRelationShipFromHumanTalk(
				NE.app_S.workVerbalMap);
		Boolean findSubject = NE.app_S.workVerbalMap.findSubject(NE,
			command_V);
		return NE.app_S.workVerbalMap.returnBestTypeOfCommands(
			findSubject);
	}

	public static TinMap E_pl_XA(PL_XA_E orm, boolean b,
		TinMap output, App NE) throws InterruptedException,
		IOException {
		return E_pl_XA(orm.getPLSearch(), true, output, NE);
	}
}

// working for here
// IMV_SQI output= new IMV_SQI();
// 1make container
// String[] commands= plSearch.replace(" ",
// "").replace("\n", "").split(";");

//405
//boolean hasVerbBoolean = (string.contains("进行") || string.contains("执行")
//    || string.contains("跟进") || string.contains("更近") || string.contains("更进")
//    || string.contains("数据") || string.contains("智慧") || string.contains("逻辑")
//    || string.contains("选择") || string.contains("选") || string.contains("操作")
//    || string.contains("操") || string.contains("点击") || string.contains("点")
//    || string.contains("确认") || string.contains("认") || string.contains("做")
//    || string.contains("将") || string.contains("获取") || string.contains("获得")
//    || string.contains("获") || string.contains("取得") || string.contains("取")
//    || string.contains("授权") || string.contains("选") || string.contains("确定")
//    || string.contains("定") || string.contains("提") || string.contains("确保")
//    || string.contains("认准") || string.contains("认定") || string.contains("标记")
//    || string.contains("标出") || string.contains("标") || string.contains("拿")
//    || string.contains("拿出") || string.contains("拿到") || string.contains("拿来")
//    || string.contains("锁定") || string.contains("锁存") || string.contains("锁")
//    || string.contains("存")
//    /**/);

//420
//String string = acknowledgeSwap[position];
//    boolean hasSubjectBoolean = (string.contains("表") || string.contains("表格")
//|| string.contains("表单") || string.contains("表库") || string.contains("矩阵")
//|| string.contains("文档") || string.contains("文件") || string.contains("对象")
//|| string.contains("单子") || string.contains("数据库") || string.contains("数据")
//|| string.contains("文章") || string.contains("文献")/**/);
//return hasSubjectBoolean;

//60
//Pl_XA_Command_E.P_TableName(acknowledge, output);
//String callFunctionKey = ("P_TableName");
//    //StaticRootMap.initMap();
//    String[] strings = new String[1];
//    IMV_SQI outputReg = new IMV_SQI();
//    IMV_SQI inputValue = new IMV_SQI();
//    String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//        .getString(callFunctionKey).split(":");
//NE._I_U.outputMap = output;//加了map后缀需要更新关联函数
//    inputValue.put(传参因子[0], temp);
//    inputValue.put(传参因子[1], output);
//    outputReg.put("传参因子", 传参因子);
//    outputReg.put("inputValues", inputValue);
//    strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//    StaticRootMap.tinShellV005(strings, outputReg);

//64
//Pl_XA_Command_E.P_SetRoot(acknowledge, output);
//String callFunctionKey = ("P_SetRoot");
//    //StaticRootMap.initMap();
//    String[] strings = new String[1];
//    IMV_SQI outputReg = new IMV_SQI();
//    IMV_SQI inputValue = new IMV_SQI();
//    String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//        .getString(callFunctionKey).split(":");
//NE._I_U.outputMap = output;
//    inputValue.put(传参因子[0], temp);
//    inputValue.put(传参因子[1], output);
//    outputReg.put("传参因子", 传参因子);
//    outputReg.put("inputValues", inputValue);
//    strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//    StaticRootMap.tinShellV005(strings, outputReg);
//@SuppressWarnings("unchecked")
//IMV_SQI map= (IMV_SQI) outputReg.get(callFunctionKey);
//app.app_S.nameFeelFilter= (CfxTextField) map.get("interfaceReturn");

//67
////Pl_XA_Command_E.P_BaseName(acknowledge, output);
//String callFunctionKey = ("P_BaseName");
////StaticRootMap.initMap();
//String[] strings = new String[1];
//IMV_SQI outputReg = new IMV_SQI();
//IMV_SQI inputValue = new IMV_SQI();
//String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//    .getString(callFunctionKey).split(":");// all in 1 later
//NE._I_U.outputMap = output;
//inputValue.put(传参因子[0], temp);
//inputValue.put(传参因子[1], output);
//outputReg.put("传参因子", 传参因子);
//outputReg.put("inputValues", inputValue);
//strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//StaticRootMap.tinShellV005(strings, outputReg);

//69
////Pl_XA_Command_E.P_YLJOperation(acknowledge, output);
//String callFunctionKey = ("P_YLJOperation");
////StaticRootMap.initMap();
//String[] strings = new String[1];
//IMV_SQI outputReg = new IMV_SQI();
//IMV_SQI inputValue = new IMV_SQI();
//String chromosome = StaticRootMap.staticClass_XE_Map.getString(callFunctionKey);
//String[] 传参因子 = StaticFunctionMap.callAnnotationMap(chromosome, callFunctionKey); //我是神！ tin神！
//NE._I_U.outputMap = output;
//inputValue.put(传参因子[0], temp);
//inputValue.put(传参因子[1], output);
//outputReg.put("传参因子", 传参因子);
//outputReg.put("inputValues", inputValue);
//strings[0] = "执行 " + chromosome + " 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//StaticRootMap.tinShellV005(strings, outputReg);

//72
////	Pl_XA_Command_E.P_StoreValues(acknowledge, output);
//String callFunctionKey = "P_StoreValues";
////StaticRootMap.initMap();
//String[] strings = new String[1];
//IMV_SQI outputReg = new IMV_SQI();
//IMV_SQI inputValue = new IMV_SQI();
//String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//    .getString(callFunctionKey).split(":");
//NE._I_U.outputMap = output;
//inputValue.put(传参因子[0], temp);
//inputValue.put(传参因子[1], output);
//outputReg.put("传参因子", 传参因子);
//outputReg.put("inputValues", inputValue);
//strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//StaticRootMap.tinShellV005(strings, outputReg);

//76
////Pl_XA_Command_E.P_fileOperations(acknowledge, output);
//String callFunctionKey = "P_fileOperations";
////StaticRootMap.initMap();
//String[] strings = new String[1];
//IMV_SQI outputReg = new IMV_SQI();
//IMV_SQI inputValue = new IMV_SQI();
//String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//    .getString(callFunctionKey).split(":");
//NE._I_U.outputMap = output;
//inputValue.put(传参因子[0], temp);
//inputValue.put(传参因子[1], output);
//outputReg.put("传参因子", 传参因子);
//outputReg.put("inputValues", inputValue);
//strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//StaticRootMap.tinShellV005(strings, outputReg);

//83
////Pl_XA_Command_E.P_fileOperations(acknowledge, output);
//String callFunctionKey = "P_fileOperations";
////StaticRootMap.initMap();
//String[] strings = new String[1];
//IMV_SQI outputReg = new IMV_SQI();
//IMV_SQI inputValue = new IMV_SQI();
//String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//    .getString(callFunctionKey).split(":");
//NE._I_U.outputMap = output;
//inputValue.put(传参因子[0], temp);
//inputValue.put(传参因子[1], output);
//outputReg.put("传参因子", 传参因子);
//outputReg.put("inputValues", inputValue);
//strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//StaticRootMap.tinShellV005(strings, outputReg);

//54
//if (temp[0].equals("获取表名")) {
//    FlowerAction.doAction("P_TableName", temp, output);
//    }
//    //acknowledge= command.split(":");
//    if (temp[0].equals("setRoot")) {
//    FlowerAction.doAction("P_SetRoot", temp, output);
//    }
//    if (temp[0].equals("baseName")) {//库名
//    FlowerAction.doAction("P_BaseName", temp, output);
//    }
//    if (temp[0].equals("界面操作")) {
//    FlowerAction.doAction("P_YLJOperation", temp, output);
//    }
//    if (temp[0].equals("设")) {//新增计算变量存储。
//    FlowerAction.doAction("P_StoreValues", temp, output);
//    }
//    //确定文件夹:路径:进行搜索
//    if (temp[0].equals("确定文件夹")) {//准备设计文件夹计算
//    FlowerAction.doAction("P_fileOperations", temp, output);
//    }
//    // 匹配条件:文件类型|包含|java;
//    //  *     匹配条件:文件大小KB|小于|200;
//    //  *     匹配条件:文件名|包含|哈哈;
//    //  *     匹配条件:替换|5|行间至|10;
//    if (temp[0].equals("匹配条件")) {//准备设计文件夹计算
//    FlowerAction.doAction("P_fileOperations", temp, output);
//    }
//    //将:字符串:替换为:替换;
//    if (temp[0].equals("将")) {//准备设计文件夹计算
//    FlowerAction.doAction("P_fileOperations", temp, output);
//    }
//    if (temp[0].equals(S_ShellETL.SHELL_ETL_CULUMNNAME)) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("修改列名")) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("culumnValue")) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("join")) {
//    FlowerAction.doAction("P_Join", temp, output);
//    }
//    if (temp[0].equals("条件为")) {/*later obesession*/
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("relation")) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("操作")) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("PLETL")) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("获取列名")) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }
//    if (temp[0].equals("PLTCP")) {
//    FlowerAction.doAction("P_ListNeedStart", temp, output);
//    }

// String[] stringSets = string.split("-");
// command_V.stringSets = stringSets;// 增加利用率。
// command_V.stringSetsMap.put(string, stringSets);
// int scaleRights = Integer
// .valueOf(stringSets[stringSets.length - 1]);

//command_V.normalizationalWorkActionsRights.clear();
//command_V.normalizationalWorkActionsPositions.clear();
//command_V.complementedWorkActionsRights.clear();
//command_V.complementedWorkActionsPositions.clear();
