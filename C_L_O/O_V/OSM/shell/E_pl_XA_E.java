package O_V.OSM.shell;

import ME.VPC.M.app.App;
import O_V.OSA.shell.PL_XA_E;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import S_I.OSI.PSO.regex.DoSplit;
import S_A.SixActionMap.FlowerAction;
import U_V.ESU.list.List_ESU_X_stringlistToStringArray;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class E_pl_XA_E {
	public static TinMap E_pl_XA(String plSearch, boolean mod, TinMap output,
			App NE) throws InterruptedException, IOException {
		// working for here
		// IMV_SIQ output= new IMV_SIQ();
		// 1make container
		if (null == output) {
			output = NE._I_U.outputMap;// later all in 1 and contans objectmap
		}
		output.put("firstTime", "true");
		output.put("start", "0");
		output.put("countJoins", "0");
		// 2make line
		List<String> lists = DoSplit.splitRegex(
				plSearch.replace(" ", "").replace("\n", ""), ";", "\\", "\\");
		String[] commands = List_ESU_X_stringlistToStringArray._E(lists);
		// String[] commands= plSearch.replace(" ",
		// "").replace("\n", "").split(";");
		NE._I_U.acknowledge = null;
		String[] acknowledgeSwap = null;
		for (String command : commands) {
			NE._I_U.commandAcknowledge = command;
			// */
			String commandSwap = doHumanTalkSwap(command, NE);
			List<String> commandLists = DoSplit.splitRegex(command, ":", "\\",
					"\\");
			NE._I_U.acknowledge = List_ESU_X_stringlistToStringArray
					._E(commandLists);
			if (null != commandSwap) {
				commandLists = DoSplit.splitRegex(commandSwap, ":", "\\", "\\");
				acknowledgeSwap = List_ESU_X_stringlistToStringArray
						._E(commandLists);
				System.out.println(commandSwap);
				doAcknowledgeSwap(acknowledgeSwap, command, NE);// later
																// duplications
				// return null;
			}
			String[] temp = NE._I_U.acknowledge.clone();
			// */
			Iterator<String> iterators = NE.app_S.workVerbaMap.cartesianWorkActionsRights
					.keySet().iterator();
			while (iterators.hasNext()) {
				String string = iterators.next();
				String[] strings = string.split("_");
				if (null != strings[0]) {
					/* loop s later */
					FlowerAction.FlowerSixDomainActions
							.couldDoThenDo(strings[0], temp, output, NE);// later
																		 // in
																		 // pdn
				}
			}
			NE.app_S.workVerbaMap.cartesianWorkActionsRights.clear();
			NE.app_S.workVerbaMap.cartesianWorkActionsPositions.clear();
			NE.app_S.workVerbaMap.normalizationalWorkActionsRights.clear();
			NE.app_S.workVerbaMap.normalizationalWorkActionsPositions.clear();
			NE.app_S.workVerbaMap.cartesianWorkActions_pos.clear();
			NE.app_S.workVerbaMap.unknown_map.clear();
			/* loop s later */
			FlowerAction.FlowerSixDomainActions.couldDoThenDo(temp[0], temp,
					output, NE);// later in pdn
			// */
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
				Pl_XA_Command_E.P_E(NE._I_U.acknowledge, output, mod, NE);
			}
		}
		Pl_XA_Command_E.P_Check(output.get("newCommand").toString(), output,
				mod, NE);
		return output;
	}

	// 哲学 辩证学 辩论
	private static boolean hasVerb(String[] acknowledgeSwap, int position,
			App NE) {
		String string = acknowledgeSwap[position];
		List<String> list = NE.app_S._A.parserMixedString(string);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String stringIterator = iterator.next();
			if (NE.app_S.workVerbaMap.doMap.containsKey(stringIterator)) {
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
			if (NE.app_S.workVerbaMap.data2DSubjectMap
					.containsKey(stringIterator)) {
				return true;
			}
		}
		return false;
	}

	private static void doAcknowledgeSwap(String[] acknowledgeSwap,
			String command, App NE) {
		// null 将 授权 选择 进行 执行 数据 智慧 逻辑 操作 :null数据 矩阵 对象 表格 表
		boolean hasData2DSubjectBoolean = hasData2DSubject(acknowledgeSwap, 0,
				NE);
		boolean hasVerbBoolean = hasVerb(acknowledgeSwap, 1, NE);
		if ((hasData2DSubjectBoolean/**/) && (hasVerbBoolean/**/)) {
			doHuoQuBiaoMingSwap(command, NE);
			return;
		}
		boolean hasData2DObjectBoolean = hasData2DSubject(acknowledgeSwap, 2,
				NE);
		if ((hasVerbBoolean/**/) && (hasData2DObjectBoolean/**/)) {
			doHuoQuBiaoMingSwap(command, NE);
			return;
		}
	}

	private static void doHuoQuBiaoMingSwap(String command, App NE) {
		Iterator<String> iterator = NE.app_S.tableNameMap.keySet().iterator();
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

	private static void doTinshellTalk() {
	}

	// later out to data swap api
	private static String doHumanTalkSwap(String command, App NE) {
		// （首-先，一，开始，于是，顺其自然，）
		// （将，获-取-得，授权，选择，确-定-保，认-准-定，标-记-出，拿-出-到-来，把，）
		// （表 表格-单-库，矩阵，文-档-件，对象）
		// （进行 执行 跟进 更近 更进 数据 智慧 逻辑 选择 操作 确认）
		// work domain out later.*/
		NE.app_S.workVerbaMap.setHumanTalk(command, NE);
		Boolean findSubject = NE.app_S.workVerbaMap.findSubject(NE);
		return NE.app_S.workVerbaMap.returnBestTypeOfCommands(findSubject);
	}

	public static TinMap E_pl_XA(PL_XA_E orm, boolean b, TinMap output, App NE)
			throws InterruptedException, IOException {
		return E_pl_XA(orm.getPLSearch(), true, output, NE);
	}
}
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
//    IMV_SIQ outputReg = new IMV_SIQ();
//    IMV_SIQ inputValue = new IMV_SIQ();
//    String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//        .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = output;//加了map后缀需要更新关联函数
//                    inputValue.put(传参因子[0], temp);
//                    inputValue.put(传参因子[1], output);
//                    outputReg.put("传参因子", 传参因子);
//                    outputReg.put("inputValues", inputValue);
//                    strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                    StaticRootMap.tinShellV005(strings, outputReg);

//64
//Pl_XA_Command_E.P_SetRoot(acknowledge, output);
//String callFunctionKey = ("P_SetRoot");
//    //StaticRootMap.initMap();
//    String[] strings = new String[1];
//    IMV_SIQ outputReg = new IMV_SIQ();
//    IMV_SIQ inputValue = new IMV_SIQ();
//    String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//        .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = output;
//                    inputValue.put(传参因子[0], temp);
//                    inputValue.put(传参因子[1], output);
//                    outputReg.put("传参因子", 传参因子);
//                    outputReg.put("inputValues", inputValue);
//                    strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                    StaticRootMap.tinShellV005(strings, outputReg);
//@SuppressWarnings("unchecked")
//IMV_SIQ map= (IMV_SIQ) outputReg.get(callFunctionKey);
//app.app_S.nameFeelFilter= (CfxTextField) map.get("interfaceReturn");

//67
//                //Pl_XA_Command_E.P_BaseName(acknowledge, output);
//                String callFunctionKey = ("P_BaseName");
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");// all in 1 later
//                NE._I_U.outputMap = output;
//                inputValue.put(传参因子[0], temp);
//                inputValue.put(传参因子[1], output);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);

//69
//                //Pl_XA_Command_E.P_YLJOperation(acknowledge, output);
//                String callFunctionKey = ("P_YLJOperation");
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String chromosome = StaticRootMap.staticClass_XE_Map.getString(callFunctionKey);
//                String[] 传参因子 = StaticFunctionMap.callAnnotationMap(chromosome, callFunctionKey); //我是神！ tin神！
//                NE._I_U.outputMap = output;
//                inputValue.put(传参因子[0], temp);
//                inputValue.put(传参因子[1], output);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                strings[0] = "执行 " + chromosome + " 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);

//72
//                //	Pl_XA_Command_E.P_StoreValues(acknowledge, output);
//                String callFunctionKey = "P_StoreValues";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = output;
//                inputValue.put(传参因子[0], temp);
//                inputValue.put(传参因子[1], output);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);

//76
//                //Pl_XA_Command_E.P_fileOperations(acknowledge, output);
//                String callFunctionKey = "P_fileOperations";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = output;
//                inputValue.put(传参因子[0], temp);
//                inputValue.put(传参因子[1], output);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);

//83
//                //Pl_XA_Command_E.P_fileOperations(acknowledge, output);
//                String callFunctionKey = "P_fileOperations";
//                //StaticRootMap.initMap();
//                String[] strings = new String[1];
//                IMV_SIQ outputReg = new IMV_SIQ();
//                IMV_SIQ inputValue = new IMV_SIQ();
//                String[] 传参因子 = StaticFunctionMapO_VECS_C.annotationMap
//                    .getString(callFunctionKey).split(":");
//                NE._I_U.outputMap = output;
//                inputValue.put(传参因子[0], temp);
//                inputValue.put(传参因子[1], output);
//                outputReg.put("传参因子", 传参因子);
//                outputReg.put("inputValues", inputValue);
//                strings[0] = "执行 O_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//                StaticRootMap.tinShellV005(strings, outputReg);

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