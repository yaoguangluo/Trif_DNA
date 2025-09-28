package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapM_VECS_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticRegisterM_VECS_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_E, App NE) {

		//稍后封装
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByAttributesOfJoinCondition", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByAttributesOfJoinAggregation", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByAttributesOfJoinGetCulumns", "object");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByAttributesOfJoinRelation", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinCondition", "object");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinAggregation", "object");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinGetCulumns", "object");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"selectRowsByAttributesOfJoinRelation", "object");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"insertRowByTablePathAndIndex",
			"tablePath:pageIndex:culumnOfNewRow");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"insertRowByBaseName", "baseName:tableName:jsobj:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"IU_RowByAttributes", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put("I_Table",
			"object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"deleteRowByTablePathAndIndex",
			"tablePath:pageIndex:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"D_RowByAttributesOfCondition", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowByTablePathAndIndex",
			"tablePath:pageIndex:jaculumnOfUpdateRow");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowByTablePathAndAttribute",
			"tablePath:culumnName:culumnValue:jobj");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByRecordConditions", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByAttributesOfCondition", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByAttributesOfAggregation", "object:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"updateRowsByAttributesOfGetCulumns", "object");
		staticFunctionMapM_VECS_E.annotationMap.put("E_PLSQL",
			"plslq:mod");
		staticFunctionMapM_VECS_E.annotationMap.put("E_PLORM",
			"orm:b");
		/*
		 * 早期多工程的tinshell花函数 合并会造成duplication问题，需要剔除。
		 * */
		//staticFunctionMapM_VECS_E.annotationMap.put("P_AggregationLimitMap", "sets:output");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Cache",
			"sets:output:tableName:baseName:object");
		staticFunctionMapM_VECS_E.annotationMap.put("P_kernel",
			"temp:readDBTableRowIndexCulumnFile:readDBTableRowIndexFile:reader:DBTableRowIndexPath:output:bufferRow:rowMap");
		staticFunctionMapM_VECS_E.annotationMap.put("rowToRowMap",
			"row");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Map",
			"sets:output:dBTablePath");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Table",
			"sets:output:DBTablePath:object");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"getCulumnsMapWithAs", "sets:row");
		staticFunctionMapM_VECS_E.annotationMap.put("getCulumnsMap",
			"sets:row");
		staticFunctionMapM_VECS_E.annotationMap.put("P_GetCulumnsMap",
			"obj:getCulumnsValueArray");
		staticFunctionMapM_VECS_E.annotationMap.put("P_AndMap",
			"sets:obj:joinObj:object:newObj");
		staticFunctionMapM_VECS_E.annotationMap.put("P_OrMap",
			"sets:obj:joinObj:object:newObj:findinNewObj");
		staticFunctionMapM_VECS_E.annotationMap.put("P_SetRoot",
			"acknowledge:output");
		staticFunctionMapM_VECS_E.annotationMap.put("P_BaseName",
			"acknowledge:output");
		//staticFunctionMapM_VECS_E.annotationMap.put("P_TableName", "acknowledge:output");
		staticFunctionMapM_VECS_E.annotationMap.put("P_ListNeedStart",
			"acknowledge:output");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Join",
			"acknowledge:output");
		staticFunctionMapM_VECS_E.annotationMap.put("P_E",
			"acknowledge:output:mod");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Check",
			"acknowledge:output:mod");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"wordsForestNotContainsKey",
			"outputList:countWordNode:prefixWord");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"prefixWordEqualZero",
			"outputList:countWordNode:prefixWord");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"wordsForestContainsKey",
			"outputList:countWordNode:prefixWord");

		staticFunctionMapM_VECS_E.annotationMap.put(
			"WordFrequencyFindCheck", "outputList:fixWords");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"WordFrequencyCompareCheck",
			"outputList:fixWords:countWordNode");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionCheck",
			"token:tokenCerts");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"sessionTokenUpdateByDNA", "password");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"sessionTokenCertsInitWithHumanWordsByDNA",
			"humanWordsPassword:bys:lockBys");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"sessionTokenCertsInitWithHumanWordsByDNA_ETL",
			"humanWordsPassword:bys:lockBys");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"sessionInitByTokenPDICertsDNA", "tokenCerts");

		staticFunctionMapM_VECS_E.annotationMap.put(
			"sessionInitByTokenCertsDNA", "tokenCerts");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"sessionCheckWithOrderPDSKey", "token:tokenCerts");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"sessionCheckWithPostPDSKey", "token:tokenCerts");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayIntCheck",
			"array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayIntFix",
			"array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayLongCheck",
			"array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayLongFix",
			"array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"arrayDoubleCheck", "array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayDoubleFix",
			"array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayFloatCheck",
			"array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayFloatFix",
			"array:min:max");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"currentSystemTimeCheck",
			"offsetUTC8:miliSecondsDistinction");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"currentSystemTimeToUTC", "offsetUTC8");
		staticFunctionMapM_VECS_E.annotationMap.put("getTranslator",
			"void");
		staticFunctionMapM_VECS_E.annotationMap.put("ListSetsCheck",
			"list:setsType");
		staticFunctionMapM_VECS_E.annotationMap.put("ListSetsFix",
			"list:setsType");
		staticFunctionMapM_VECS_E.annotationMap.put("matrixCheck",
			"objects:attribute");
		staticFunctionMapM_VECS_E.annotationMap.put("matrixFix",
			"objects:attribute");
		staticFunctionMapM_VECS_E.annotationMap.put("checkNULL",
			"object");
		staticFunctionMapM_VECS_E.annotationMap.put("getCfxButton",
			"string:x:y:c");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaButton",
			"string:x:y:c");
		staticFunctionMapM_VECS_E.annotationMap.put("YLJShowButton",
			"string:x:y:c");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaIndexLabel",
			"name:jFrameList");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaLabel",
			"name");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaSlider",
			"x:y");
		staticFunctionMapM_VECS_E.annotationMap.put("DetabbedPane",
			"x:y:c");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"getColorTableRender", "void");
		staticFunctionMapM_VECS_E.annotationMap.put("CfxTextArea",
			"string:x:y:c");
		staticFunctionMapM_VECS_E.annotationMap.put("CfxTextField",
			"string:x:y:c");
		staticFunctionMapM_VECS_E.annotationMap.put("CfxTextPane",
			"string:x:y:c");
		staticFunctionMapM_VECS_E.annotationMap.put(
			"forwardToRestMap", "app:vPCSRequest:vPCSResponse");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Rest",
			"app:vPCSRequest:vPCSResponse");
		staticFunctionMapM_VECS_E.annotationMap.put("P_RestDB",
			"app:vPCSRequest:vPCSResponse");
		staticFunctionMapM_VECS_E.annotationMap.put("P_",
			"type:socket:_A:emotionMap:ratioMap_E:emotionInit:environmentInit"
				+ ":emotionMap_E:lenovoInit");

		Iterator<String> iterators = staticFunctionMapM_VECS_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"M_VECS");
		}
	}
}
