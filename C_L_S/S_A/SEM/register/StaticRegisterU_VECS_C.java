package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapU_VECS_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterU_VECS_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E, App NE) {

		staticFunctionMapU_VECS_E.annotationMap.put("main", "main");//注册一个main接口
		staticFunctionMapU_VECS_E.annotationMap.put(
			"getMapFromDoubleStringArray", "score:nameScore");//注册一个main接口
		staticFunctionMapU_VECS_E.annotationMap.put(
			"getMapFromIntStringArray", "score:nameScore");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"getMapFromIntStringArray_ZhongYao", "score:nameScore");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToJson",
			"gson:object");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToXml",
			"gson:object");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToMap",
			"gson:objects");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToVector",
			"gson:objects");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToList",
			"gson:objects");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToIterator",
			"objects");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToSet",
			"objects");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToMatrix",
			"objects:widthRange");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToMatrix3D",
			"objects:widthRange:heightRange");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"xlsOrCsvFileToObjectMartix", "filePath:pageSheetIndex");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"xlsOrCsvFileToListObject", "filePath:pageSheetIndex");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"xlsOrCsvFileToRangedListObject",
			"filePath:pageSheetIndex:rows:culumns");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"xlsOrCsvFileToRangedObjectMartix",
			"filePath:pageSheetIndex:rows:culumns");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToGMTString",
			"date");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToYYYYMMDD",
			"date");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToHHMMSS",
			"date");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"dateToMiliSeconds", "date");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"getCurrentMiliSeconds", "date");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToTimeStamp",
			"date");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"timeStampToMiliSeconds", "timestamp");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"timeStampToMiliSecondsWithSize", "timestamp:size");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"dateStringToMiliSeconds", "string");
		staticFunctionMapU_VECS_E.annotationMap.put("hashTableToJson",
			"gson:hashtable");
		staticFunctionMapU_VECS_E.annotationMap.put("hashTableToXml",
			" gson:hashtable");
		staticFunctionMapU_VECS_E.annotationMap.put("hashTableToList",
			"gson:hashtable");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"hashTableToObjectArray", "gson:hashtable");
		staticFunctionMapU_VECS_E.annotationMap.put("getJson",
			"urlString:jsonString");
		staticFunctionMapU_VECS_E.annotationMap.put("postXML",
			"urlString:XMLString");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"postJsonWithSercurity", "urlString:jsonString");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"postXMLWithSercurity", "urlString:XMLString");
		staticFunctionMapU_VECS_E.annotationMap.put("getHTML",
			"urlString:object");
		staticFunctionMapU_VECS_E.annotationMap.put("pixTableToFile",
			"pngOutputPath:pix:fileType");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"pixRGBTableToFile",
			"pngOutputPath:pixRed:pixGreen:pixBlue:fileType");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"bufferedImageToFile",
			"pngOutputPath:bufferedImage:fileType");
		staticFunctionMapU_VECS_E.annotationMap.put("imageToFile",
			"pngOutputPath:image:fileType");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"bufferedImageToScaleImageFile",
			"pngOutputPath:bufferedImage:fileType:scale");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"waveImageFileToArrayWithBlack", "FilePath");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"waveImageToArrayWithBlack", "bufferedImage");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"waveImageToArrayWithColor", "bufferedImage:colorRange");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"waveImageFileToArrayWithColor", "FilePath:colorRange");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"waveImageFileToArrayMapWithBlack", "FilePath");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"waveImageToArrayMapWithBlack", "bufferedImage");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"toolkitImageIconToBufferImage",
			"positionX:positionY:imageIcon");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"toolkitImageToBufferImage",
			"image:positionX:positionY:width:height:imageObserver");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"toolkitImageToBufferImageAboutIconConfig",
			"image:positionX:positionY");

		staticFunctionMapU_VECS_E.annotationMap.put(
			"iteratorToJsonString", "gson:iterator");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringIteratorToJsonString", "gson:iterator");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToXml",
			"gson:iterator");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToMap",
			"gson:iterator");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"iteratorToObjectArray", "gson:iterator");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToList",
			"gson:iterator");
		staticFunctionMapU_VECS_E.annotationMap.put("jsonArrayToList",
			"jSONArray");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"jsonObjectToString", "jSONArray");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"jsonObjectToHashtable", "gson:jSONObject");
		staticFunctionMapU_VECS_E.annotationMap.put("jsonObjectToXml",
			"jSONObject");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"listToJsonString", "gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringListToJsonString", "gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put("listToXml",
			"gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put("listToMap",
			"gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"listToObjectArray", "gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringlistToStringArray", "gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put("listToIterator",
			"gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put("listToVector",
			"gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put("listToSet",
			"gson:list");
		staticFunctionMapU_VECS_E.annotationMap.put("listToArray",
			"gson:list");

		staticFunctionMapU_VECS_E.annotationMap.put("mapToList",
			"map");
		staticFunctionMapU_VECS_E.annotationMap.put("mapToHash",
			"map");
		staticFunctionMapU_VECS_E.annotationMap.put("jnisort",
			"array:range:deeps");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToList",
			"string:key");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToVector",
			"string:key");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToSets",
			"string:key");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToHashtable",
			"xmlString:gson");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"txtFileToObjectMatrix", "filePath:stopBy");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"txtFileToObjectMatrixWithRange",
			"filePath:stopBy:rangeBegin:rangeEnd");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"txtFileToListStringWithRange",
			"filePath:stopBy:rangeBegin:rangeEnd");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"txtFileToListString", "filePath");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"txtFileToListStringArray", "filePath, String stopBy");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToMap",
			"vector");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToList",
			"vector");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToArray",
			"vector");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"vectorToIterator", "vector");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"vectorToJsonString", "vector");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToSet",
			"vector");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringBuilderToCharArray", "stringBuilder");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringBuilderToString", "stringBuilder");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringBuilderToJson", "gson:stringBuilder");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringBuilderToXml", "gson:stringBuilder");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringBuilderToSplitArray", "stopBy:stringBuilder");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringBuilderToMap", "gson:stringBuilder");
		staticFunctionMapU_VECS_E.annotationMap.put("stringToArray",
			"stopBy:string");

		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringArrayToString", "strings");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringToURIencode", "string:encoding");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringToURIencode", "string");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"uRIencodeToURIdecode", "string");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"stringToCharASCII", "string");
		staticFunctionMapU_VECS_E.annotationMap.put("charsetSwap",
			"string:inputCharset:outputCharset");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"objectToJsonString", "gson:object");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixShiftSwapXYZ", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixInclineSwapXY", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixInclineSwapXZ", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixInclineSwapYZ", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixReverseSwap", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixReverseSwapXY", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixReverseSwapXZ", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixReverseSwapYZ", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixToArray",
			"objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixInclineSwap", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixPostSwap",
			"objects");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixInSwap",
			"objects");
		staticFunctionMapU_VECS_E.annotationMap.put(
			"matrixReverseSwap", "objects");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixToArray",
			"objects");

		Iterator<String> iterators = staticFunctionMapU_VECS_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"U_VECS");
		}
	}
}
