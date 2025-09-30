package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapO_VECS_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterO_VECS_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_E, App NE) {
		//稍后封装 20231120 稍后花粉因子object化，具体事物表达不因该出现在引擎的渲染层。
		staticFunctionMapO_VECS_E.annotationMap.put("SortStringDemo",
			"void");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"transactionLogin", "uEmail:uPassword");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"transactionRegister",
			"uEmail:uEmailEnsure:uName:uPassword:uPassWDEnsure"
			+ ":uAddress:uPhone:uWeChat:uQq:uAge:uSex");//later
		staticFunctionMapO_VECS_E.annotationMap.put("aCommonReadWay",
			"app");
		staticFunctionMapO_VECS_E.annotationMap.put("readDBInTXTWay",
			"app");
		staticFunctionMapO_VECS_E.annotationMap.put("readDBInBaseWay",
			"app");
		staticFunctionMapO_VECS_E.annotationMap.put("readDBInWebWay",
			"app");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"PLSQLSectionPanel", "app");
		staticFunctionMapO_VECS_E.annotationMap.put("VPCSRestPanel",
			"app");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"YouBiaoSectionPanel", "app");
		staticFunctionMapO_VECS_E.annotationMap.put("PL_XA_C",
			"void");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinCondition", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinAggregation", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinGetCulumns", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinRelation", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfNestCondition", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfNestAggregation", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfNestGetCulumns", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfNestRelation", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttribute",
			"currentDB:tableName:culmnName:value");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"XA_ShellQ_Rows_E_main", "args");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByTablePath",
			"tablePath:pageBegin:pageEnd:direction");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfCondition", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfAggregation", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfGetCulumns", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfPLETL", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfPLTCP", "object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"addNewSearchShellTable", "tableName:jtable");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getNewSearchShellTableSpecFromDefaultTableModel",
			"defaultTableModel");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getNewSearchShellTableDataFromDefaultTableModel",
			"defaultTableModel");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getNewSearchShellTableRowsFromDefaultTableModel",
			"spec:defaultTableModel");

		staticFunctionMapO_VECS_E.annotationMap.put(
			"addNewSearchShellTable", "tableName:defaultTableModel");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"addNewSearchShellTableWithObjectData",
			"tableName:defaultTableModel:defaultTableData");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"addNewSearchShellTable",
			"tableName:defaultTableData:defaultTableDataSpec");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"addNewSearchShellTableWithObjectDataReflectionDBRows",
			"tableName:defaultTableModel:defaultTableData");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"addNewSearchShellTableReflectionDBRows",
			"tableName:rows:defaultTableDataSpec");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"addInitSearchShellTable", "app");
		staticFunctionMapO_VECS_E.annotationMap.put("doNeroFlow",
			"rightBotJTextPane:nodeView:first:documentFlowAddress:inputMap");
		staticFunctionMapO_VECS_E.annotationMap.put("ReadChinese",
			"detaButton:app:_A");
		staticFunctionMapO_VECS_E.annotationMap.put("kernel",
			"app:string");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getMedicineBookFeedbackZY", "app:string");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getMedicineBookFeedbackXY", "app:string");

		staticFunctionMapO_VECS_E.annotationMap.put(
			"getMedicineBookFeedbackZT", "app:string");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getMedicineBookFeedbackXT", "app:string");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getMedicineBookFeedbackYT", "app:string");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getMedicineBookFeedback", "app:string");
		staticFunctionMapO_VECS_E.annotationMap.put("doSearch",
			"app:string");
		staticFunctionMapO_VECS_E.annotationMap.put("forwardDB",
			"app:string:data");
		staticFunctionMapO_VECS_E.annotationMap.put("forwardVPC",
			"app:string:data");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"forwardVPCBackEnd",
			"emotionMap:ratioMap_E:emotionInit:_A:environmentInit:emotionMap_E"
				+ ":lenovoInit:string:data");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"forwardVPCYangliaojing", "app:string:data");
		staticFunctionMapO_VECS_E.annotationMap.put("getCode",
			"filePath");
		staticFunctionMapO_VECS_E.annotationMap.put("getFilePath",
			"string");
		staticFunctionMapO_VECS_E.annotationMap.put("E_pl_XA",
			"plSearch:mod:output");
		staticFunctionMapO_VECS_E.annotationMap.put("E_pl_XA",
			"orm:b:output");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"P_AggregationLimitMap", "sets:output");
		staticFunctionMapO_VECS_E.annotationMap.put("P_PletlLimitMap",
			"sets:obj");
		staticFunctionMapO_VECS_E.annotationMap.put("P_PltcpLimitMap",
			"sets:output:object");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Cache",
			"sets:output:tableName:object:condition");
		staticFunctionMapO_VECS_E.annotationMap.put("P_kernel",
			"temp:readDBTableRowIndexCulumnFile:readDBTableRowIndexFile:reader:DBTableRowIndexPath:output:bufferRow:rowMap");
		staticFunctionMapO_VECS_E.annotationMap.put("P_kernel_search",
			"temp:readDBTableRowIndexFile:rowId:huaRuiJiJtableCulumns:huaRuiJiJtable:output;bufferRow;rowMap");
		staticFunctionMapO_VECS_E.annotationMap.put("rowToRowMap",
			"row");
		staticFunctionMapO_VECS_E.annotationMap.put("rowMapToRow",
			"map");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Map",
			"sets:output:tableName:object");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"getCulumnsMapWithAs", "sets:row");
		staticFunctionMapO_VECS_E.annotationMap.put("getCulumnsMap",
			"sets:row");
		staticFunctionMapO_VECS_E.annotationMap.put("P_getCulumnsMap",
			"obj:getCulumnsValueArray");

		staticFunctionMapO_VECS_E.annotationMap.put("P_AndMap",
			"sets:obj:joinObj:object:newObj");
		staticFunctionMapO_VECS_E.annotationMap.put("P_OrMap",
			"sets:obj:joinObj:object:newObj:findinNewObj");
		staticFunctionMapO_VECS_E.annotationMap.put("P_SetRoot",
			"acknowledge:output");
		staticFunctionMapO_VECS_E.annotationMap.put("P_BaseName",
			"acknowledge:output");
		staticFunctionMapO_VECS_E.annotationMap.put("P_TableName",
			"acknowledge:output");
		staticFunctionMapO_VECS_E.annotationMap.put("P_ListNeedStart",
			"acknowledge:output");
		staticFunctionMapO_VECS_E.annotationMap.put("P_YLJOperation",
			"acknowledge:output");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Join",
			"acknowledge:output");
		staticFunctionMapO_VECS_E.annotationMap.put("P_E",
			"acknowledge:output:mod");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Check",
			"acknowledge:output:mod");
		staticFunctionMapO_VECS_E.annotationMap.put("P_StoreValues",
			"acknowledge:output");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"P_fileOperations", "P_fileOperations");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceString",
			"fileDirectroyPath:searchString:needReplaceString");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"replaceStringWithFileName",
			"fileDirectroyPath:searchString:conditions");
		staticFunctionMapO_VECS_E.annotationMap.put("start", "void");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"replaceStringWithFileName",
			"fileDirectroyPath:searchString:needReplaceString:fileName");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"replaceStringWithFileType",
			"fileDirectroyPath:searchString:needReplaceString:fileName");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"replaceStringWithFileSize",
			"fileDirectroyPath:searchString:needReplaceString:fileName");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"replaceStringWithFileLines",
			"fileDirectroyPath:searchString:needReplaceString:beginLine:endLine");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"mainShellReplace", "argv");
		staticFunctionMapO_VECS_E.annotationMap.put(
			"replaceStringWithLogRecording", "conditions");

		Iterator<String> iterators = staticFunctionMapO_VECS_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {//出现相同的函数需要区别开 20230219 罗瑶光
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"O_VECS");
		}
	}
}
