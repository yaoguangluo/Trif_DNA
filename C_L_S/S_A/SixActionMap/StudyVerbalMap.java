package S_A.SixActionMap;

import java.util.Iterator;

import O_V.OSM.shell.CommandClass;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_logger.Log;

/*
 * 个人著作权人，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StudyVerbalMap extends StudyVerbalMap_Q {
	public String filterString = "";

	/*
	 * 这个函数用于command_V的commandString中提取出数字特征字符到map中，然后遍历map
	 * 将这些特征字符的词组进行过滤掉。
	 */
	public int extractNumberfromString(CommandClass command_V) {
		if (null == command_V.command) {
			return -1;
		}
		if (null == command_V.command) {
			return -1;
		}
		filterString = "";//修正
		getNumericsFromUnknownMapAndFiltCommand(command_V);
		//
		command_V.chineseSimpleCommandWithoutNumerics = filterString;
		command_V.initedArabicNumber = true;
		return 0;
	}

	/*
	 * 这个函数用于将command string中的数字和汉字进行提取出来，形成一个map，如果是汉字就进行
	 * 阿拉伯数字变换。提取map后将原string的对应字符全部过滤掉生成commandWithNumFilters。
	 * 
	 * 函数中的条件归纳优化。
	 * ( (A & B ) | ( C | D ... ) ) = res 见该函数尾巴注释部分。
	 * --优化 1 卡诺图化简
	 * 略 
	 * 
	 * --优化 2 迪摩根化简
	 * !res =     ( ! ( ( A &   B )   |        ( C | D ...) ) )       --
	 *      = ( ! ! ! ( ( A &   B )   |        ( C | D ...) ) )
	 *      = ( ! ! ( ! ( A &   B )   &    ( ! ( C | D ...) ) ) )
	 *      = ( ! ! ( ( ! A | ! B )   &    ( ! ( C | D ...) ) ) )
	 *      = ( ! ( ! ( ! A | ! B )   |  ! ( ! ( C | D ...) ) ) )
	 *      = ( ! ( ! ( ! A | ! B )   |        ( C | D ...) ) )
	 *      
	 * --优化 2 离散化简 
	 * Map<String, Boolean> chineseNumberSets = new HashMap<>();
	 * chineseNumberSets.put('零', true);
	 * 稍后提取出去成为stable map
	 * 
	 * 
	 * --println函数走图形打印机，并发工程记得注释掉或者用其他的classic观测API--如log4J
	 * --函数中的更进思考，这里应该直接处理掉数字变换，就能很好地避免-年-月-单字成为词汇的问题。
	 *
	 * 
	 * --罗瑶光
	 * */
	@SuppressWarnings("unchecked")
	public void getNumericsFromUnknownMapAndFiltCommand(
		CommandClass command_V) {
		// number extra
		String string = "";
		String inputString = command_V.command;
		S_logger.Log.logger.info("" + inputString);
		inputString = command_V.simpleChineseNumberSwap(inputString);
		/*
		 * 思考--涉及拆嵌套的逻辑如何分关系。
		 * */
		if (command_V.chineseSimpleCommandWithoutNumerics.isEmpty()) {
			command_V.chineseSimpleCommandWithoutNumerics = inputString
				.toString();
		}
		String temp = "chineseSimpleCommandWithoutNumerics400-1-->"
			+ command_V.chineseSimpleCommandWithoutNumerics;
		S_logger.Log.logger.info(temp);
		int fixOrder = 0;
		for (fixOrder = 0; fixOrder < inputString
			.length(); fixOrder++) {
			if (!(inputString.charAt(fixOrder) <= 47 || inputString
				.charAt(fixOrder) >= 58) || chineseNumberSets
					.containsKey("" + inputString.charAt(fixOrder))) {
				string += inputString.charAt(fixOrder);
				continue;
			}
			if (!string.isEmpty()) {
				S_logger.Log.logger.info("" + string + "--"
					+ fixOrder);
				command_V.numericsFromUnknownString.put(string
					.toString(), fixOrder);
				String output = formatNumeric(string, command_V);
				if (null != output) {
					filterString += output;
				}
				string = "";
			}
			filterString += inputString.charAt(fixOrder);
			continue;
		}
		if (!string.isEmpty()) {
			S_logger.Log.logger.info("" + "nums-->" + string + "--"
				+ fixOrder);
			// println函数走图形打印机，并发工程记得注释掉或者用其他的classic观测API
			command_V.numericsFromUnknownString.put(string.toString(),
				fixOrder);
			string = "";
		}
		// chinese number extra
		/*
		 * 之后这类输出统一归纳为频率 和时间统计函数集，方便高频优先意识。 --罗瑶光
		 * */
		// english extra later
	}
	//} else {
	//if ((inputString.charAt(fixOrder) > 47 && inputString.charAt(fixOrder) < 58) 
	//		|| (inputString.charAt(fixOrder) == '零' 
	//			|| inputString.charAt(fixOrder) == '一' 
	//			|| inputString.charAt(fixOrder) == '二' 
	//			|| inputString.charAt(fixOrder) == '三' 
	//			|| inputString.charAt(fixOrder) == '四'
	//			|| inputString.charAt(fixOrder) == '五'
	//			|| inputString.charAt(fixOrder) == '六'
	//			|| inputString.charAt(fixOrder) == '七'
	//			|| inputString.charAt(fixOrder) == '八'
	//			|| inputString.charAt(fixOrder) == '九'
	//			|| inputString.charAt(fixOrder) == '十'
	//			|| inputString.charAt(fixOrder) == '百'
	//			|| inputString.charAt(fixOrder) == '千'
	//			|| inputString.charAt(fixOrder) == '万'
	//			|| inputString.charAt(fixOrder) == '亿'
	//			|| inputString.charAt(fixOrder) == '壹'
	//			|| inputString.charAt(fixOrder) == '贰'
	//			|| inputString.charAt(fixOrder) == '两'
	//			|| inputString.charAt(fixOrder) == '叁'
	//			|| inputString.charAt(fixOrder) == '肆'
	//			|| inputString.charAt(fixOrder) == '伍'
	//			|| inputString.charAt(fixOrder) == '陆'
	//			|| inputString.charAt(fixOrder) == '柒'
	//			|| inputString.charAt(fixOrder) == '捌'
	//			|| inputString.charAt(fixOrder) == '玖'
	//			|| inputString.charAt(fixOrder) == '拾'
	//			|| inputString.charAt(fixOrder) == '佰'
	//			|| inputString.charAt(fixOrder) == '仟')) {
	//} else {

	@SuppressWarnings("unchecked")
	public void formatNumericMap(CommandClass command_V) {
		Iterator<String> iterators = command_V.numericsFromUnknownString
			.keySet().iterator();
		while (iterators.hasNext()) {
			String string = iterators.next();
			formatNumeric(string, command_V);
		}
	}

	/*
	 * symbolsSwapNumericsByLength 与string的 长度一致 增加分词的char position
	 * 准确度，因果增加笛卡尔关系的精确度。
	 *
	 * --关于混合中文歧义数字描述
	 * 因为有些用户喜欢写100万2000这种标识，就不用一百万两千和1002000这类规范的。
	 * 所以我在这个if里面之后还要设计个阿拉伯数字转汉字的数字翻译机。 逻辑是先拆分数汉，
	 * 再翻译数变汉，最后组合全汉输出即可。 
	 * 
	 * --罗瑶光
	 * 
	 * loop 找出阿拉伯数字，然后翻译拼接
	 */
	@SuppressWarnings("unused")
	public String formatNumeric(String input,
		CommandClass command_V) {
		String string = input;
		String symbolsSwapNumericsByLength = "";
		for (int i = 0; i < string.length(); i++) {
			symbolsSwapNumericsByLength += command_V.symbolSwapNumerics;
		}
		S_logger.Log.logger.info("" + "混合数字字符探索-->" + string);
		boolean hasNumerics = false;
		boolean hasChars = false;
		if (string.contains("0") || string.contains("1") || string
			.contains("2") || string.contains("3") || string.contains(
				"4") || string.contains("5") || string.contains("6")
			|| string.contains("7") || string.contains("8") || string
				.contains("9")) {
			hasNumerics = true;
		}
		if (string.contains("零") || string.contains("一") || string
			.contains("二") || string.contains("三") || string.contains(
				"四") || string.contains("五") || string.contains("六")
			|| string.contains("七") || string.contains("八") || string
				.contains("九") || string.contains("十") || string
					.contains("十") || string.contains("百") || string
						.contains("千") || string.contains("万")
			|| string.contains("亿")) {
			hasChars = true;
		}
		if (!hasNumerics && !hasChars) {
			//流水阀门上提优化。
			return null;
		}
		if (hasNumerics && !hasChars) {
			/*
			 * 翻译阿拉伯数字 逻辑是 
			 * number = studyVerbalMap_Q.getChineseFromNumerics(number);
			 * */
			StringBuilder stringBuilder = new StringBuilder(string);
			stringBuilder = getChineseFromNumerics(stringBuilder);
			//稍后逐步替换。stringBuilder
			S_logger.Log.logger.info("" + "stringSwaped-400-1->"
				+ stringBuilder.toString());
			String stringSwaped = command_V.fasterChineseNumberSwap(
				stringBuilder);
			S_logger.Log.logger.info("" + "stringSwaped-400-2->"
				+ stringSwaped);
			//String stringSwaped = command_V.fasterChineseNumberSwap(string);
			WordFrequency wordFrequency = new WordFrequency(1,
				stringSwaped);
			String temp = command_V.numericsFromUnknownString
				.getString(string);
			int tempInt = Integer.valueOf(temp);
			S_logger.Log.logger.info("" + "position-->" + tempInt);
			wordFrequency.positions.add(tempInt);
			//wordFrequency.I_frequency(1);
			wordFrequency.I_pos("变换数字字符串代词名词");
			/*
			 * replace应该分离出来，作为全局任务，避免出现2*18这种错误归纳。
			 * */
			command_V._IMV_SQI_SS_Q.put(stringSwaped, wordFrequency);
			command_V._IMV_SQI_SS_Q_.add(stringSwaped);
			return stringSwaped;//减少遍历
		}
		if (!hasNumerics && hasChars) {
			/*
			 * 翻译汉字数字 逻辑是
			 * commandClass.fasterChineseNumberSwap(number);
			 * 之后要归纳下，避免重含，如果有逆向递归操作容易死循环。
			 * */
			StringBuilder stringBuilder = new StringBuilder(string);
			String stringSwaped = command_V.fasterChineseNumberSwap(
				stringBuilder);
			Log.logger.info("" + "stringSwaped-400-2->"
				+ stringSwaped);
			WordFrequency wordFrequency = new WordFrequency(1,
				stringSwaped);
			String temp = command_V.numericsFromUnknownString
				.getString(string);
			int tempInt = Integer.valueOf(temp);
			S_logger.Log.logger.info("" + "position-->" + tempInt);
			wordFrequency.positions.add(tempInt);
			//wordFrequency.I_frequency(1);
			wordFrequency.I_pos("变换数字字符串代词名词");
			command_V._IMV_SQI_SS_Q.put(stringSwaped, wordFrequency);
			command_V._IMV_SQI_SS_Q_.add(stringSwaped);
			/*
			 * 下面注释的逻辑需要按照字符串的长短排序后按照长优先进行replace，不然会字符串断层错误。
			 * */
			return stringSwaped;//减少遍历
		}
		S_logger.Log.logger.info("" + "混合数字字符预处理锁定-->" + string);
		String chineseNumber = "";
		String arabicNumber = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) > 47 && string.charAt(i) < 58) {
				arabicNumber += string.charAt(i);
				continue;
			}
			if (!arabicNumber.isEmpty()) {
				StringBuilder stringBuilder = new StringBuilder(arabicNumber);
				stringBuilder = getChineseFromNumerics(stringBuilder);
				String chineseNumberPars = stringBuilder.toString();
				String fix = "";
				S_logger.Log.logger.info("" + "chineseNumber-->"+ chineseNumber);
				S_logger.Log.logger.info(""+ "chineseNumberPars length-->"+ chineseNumberPars.length());
				if (!chineseNumber.isEmpty() && arabicNumber
					.length() < 4) {	
					//稍后用StringBuilder替换加速。
					if(chineseNumber.charAt(chineseNumber.length() - 1) != '零') {
						fix = "零";	
					}
				}
				chineseNumber += fix + chineseNumberPars;
				arabicNumber = "";
			}
			chineseNumber += string.charAt(i);
		}
		if (!arabicNumber.isEmpty()) {
			StringBuilder stringBuilder = new StringBuilder(arabicNumber);
			stringBuilder = getChineseFromNumerics(stringBuilder);
			String chineseNumberPars=stringBuilder.toString();
			String fix = "";
			S_logger.Log.logger.info("" + "chineseNumber-->"
				+ chineseNumber);
			S_logger.Log.logger.info(""
				+ "chineseNumberPars length-->" + chineseNumberPars
					.length());
			if (!chineseNumber.isEmpty() && arabicNumber
				.length() < 4) {
				if(chineseNumber.charAt(chineseNumber.length() - 1) != '零') {
					fix = "零";	
				}
			}
			chineseNumber += fix + chineseNumberPars;
			arabicNumber = "";
		}
		// fix filter
		// 稍后分离出去。
		StringBuilder stringBuilder = new StringBuilder(chineseNumber);
		stringBuilder = prefixOptimization(stringBuilder);
		// oder-fix
		chineseNumber = orderfixOptimization(chineseNumber);
		S_logger.Log.logger.info("" + "混合数字字符预处理结果-->"
			+ chineseNumber);
		//稍后去重
		/*
		 * 思考关于position的位置添加方式，是字符串的头字所取位置，那么之后分词的
		 * 位置也要符合这个规范，不然有误差。或导致精度过滤的条件类计算不准确。
		 * later -trif。 罗瑶光
		 * */
		
		StringBuilder stringBuilderChineseNumber = new StringBuilder(chineseNumber);
		String regArabicNumber = command_V.fasterChineseNumberSwap(
			stringBuilderChineseNumber);
		S_logger.Log.logger.info("" + "stringSwaped-400-2->"
			+ regArabicNumber);
		WordFrequency wordFrequency = new WordFrequency(1,
			regArabicNumber);
		String temp = command_V.numericsFromUnknownString.getString(
			string);
		int tempInt = Integer.valueOf(temp);
		S_logger.Log.logger.info("" + "position-->" + tempInt);
		wordFrequency.positions.add(tempInt);
		//wordFrequency.I_frequency(1);
		wordFrequency.I_pos("变换数字字符串代词名词");
		command_V._IMV_SQI_SS_Q.put(regArabicNumber, wordFrequency);
		command_V._IMV_SQI_SS_Q_.add(regArabicNumber);
		return regArabicNumber;//减少遍历
	}
	//	command_V.chineseSimpleCommandWithoutNumerics 
	//	= command_V.chineseSimpleCommandWithoutNumerics.replace(string
	//	, symbolsSwapNumericsByLength);
	//	command_V.chineseSimpleCommandWithoutNumerics 
	//				= command_V.chineseSimpleCommandWithoutNumerics.replace(string
	//						, symbolsSwapNumericsByLength);
	//command_V.chineseSimpleCommandWithoutNumerics 
	//				= command_V.chineseSimpleCommandWithoutNumerics.replace(string
	//						, symbolsSwapNumericsByLength);

	public static void main(String[] argv) {
		String input = "123万200亿000在输出的123万亿200数据表中123万200亿202万2000仅"
			+ "展示123万亿200020从第123万200亿123万106行到2仟6拾第102万2000行的数据";
		CommandClass commandClass = new CommandClass();
		commandClass.command = input;
		StudyVerbalMap studyVerbalMap = new StudyVerbalMap();
		//稍后
		//有必要将initChineseNumberSets封装入new 里面，因为这类函数可以脱离主引擎环境去执行。。
		studyVerbalMap.initChineseNumberSets();
		studyVerbalMap.extractNumberfromString(commandClass);
		/*
		 * 稍后可以设计处理混合字符的数字格式化机，关于 3十 这种描述进行格式化。 --罗瑶光
		 */
		studyVerbalMap.formatNumericMap(commandClass);

		// 不断加不断修正细化即可
		//

	}
}
//输出
//简体-->123万200亿000在输出的123万亿200数据表中123万200亿202万2000仅
//展示123万亿200020从第123万200亿123万106行到2千6十第102万2000行的数据
//123万200亿000--11
//123万亿200--23
//123万200亿202万2000--43
//123万亿200020--57
//123万200亿123万106--74
//2千6十--80
//102万2000--89
//混合数字字符探索-->123万亿200020
//混合数字字符预处理锁定-->123万亿200020
//123
//output-->一百二十三
//chineseNumber-->
//chineseNumberPars length-->5
//200020
//output-->二十万零二十
//chineseNumber-->一百二十三万亿
//chineseNumberPars length-->6
//混合数字字符预处理结果-->一百二十三万亿二十万零二十
//混合数字字符探索-->2千6十
//混合数字字符预处理锁定-->2千6十
//2
//output-->二
//chineseNumber-->
//chineseNumberPars length-->1
//6
//output-->六
//chineseNumber-->二千
//chineseNumberPars length-->1
//混合数字字符预处理结果-->二千零六十
//混合数字字符探索-->123万200亿123万106
//混合数字字符预处理锁定-->123万200亿123万106
//123
//output-->一百二十三
//chineseNumber-->
//chineseNumberPars length-->5
//200
//output-->二百
//chineseNumber-->一百二十三万
//chineseNumberPars length-->2
//123
//output-->一百二十三
//chineseNumber-->一百二十三万零二百亿
//chineseNumberPars length-->5
//106
//output-->一百零六
//chineseNumber-->一百二十三万零二百亿零一百二十三万
//chineseNumberPars length-->4
//混合数字字符预处理结果-->一百二十三万零二百亿零一百二十三万零一百零六
//混合数字字符探索-->123万亿200
//混合数字字符预处理锁定-->123万亿200
//123
//output-->一百二十三
//chineseNumber-->
//chineseNumberPars length-->5
//200
//output-->二百
//chineseNumber-->一百二十三万亿
//chineseNumberPars length-->2
//混合数字字符预处理结果-->一百二十三万亿零二百
//混合数字字符探索-->123万200亿202万2000
//混合数字字符预处理锁定-->123万200亿202万2000
//123
//output-->一百二十三
//chineseNumber-->
//chineseNumberPars length-->5
//200
//output-->二百
//chineseNumber-->一百二十三万
//chineseNumberPars length-->2
//202
//output-->二百零二
//chineseNumber-->一百二十三万零二百亿
//chineseNumberPars length-->4
//2000
//output-->二千
//chineseNumber-->一百二十三万零二百亿零二百零二万
//chineseNumberPars length-->2
//混合数字字符预处理结果-->一百二十三万零二百亿零二百零二万二千
//混合数字字符探索-->102万2000
//混合数字字符预处理锁定-->102万2000
//102
//output-->一百零二
//chineseNumber-->
//chineseNumberPars length-->4
//2000
//output-->二千
//chineseNumber-->一百零二万
//chineseNumberPars length-->2
//混合数字字符预处理结果-->一百零二万二千
//混合数字字符探索-->123万200亿000
//混合数字字符预处理锁定-->123万200亿000
//123
//output-->一百二十三
//chineseNumber-->
//chineseNumberPars length-->5
//200
//output-->二百
//chineseNumber-->一百二十三万
//chineseNumberPars length-->2
//000
//output-->零
//chineseNumber-->一百二十三万零二百亿
//chineseNumberPars length-->1
//混合数字字符预处理结果-->一百二十三万零二百亿
/*
 * 病句歧义分析123万200亿000 也可以理解为一百二十三万零二百亿仟，但是这里出了一个问题， 如果后面接123，
 * 如123万200亿123，那么这里有两个意思，1是一百二十三万零二百亿 个 123，
 * 要做乘积，乘123，在这种计算逻辑环境中，数字提取的将不是稳定的数字提取逻辑，而是数字乘法
 * 函数的提取，提取的是一个要计算乘法的逻辑。可以理解为 病句歧义分析含有算法逻辑的数字函数。
 * 所以不考虑，按完整数字逻辑来获取。按拼接法 123万200亿000 需要改为 123万200亿， 再举
 * 个例子123万200亿2000则保留末尾2000，因为2字有数字拼接逻辑意义。 --罗瑶光
 * 
 */

//command_V.commandWithoutNumerics.replace(string, command_V.symbolSwapNumerics);
//S_logger.Log.logger.info("" + "commandWithoutNumerics-->" + command_V.commandWithoutNumerics);

//command_V.commandWithoutNumerics.replace(string, command_V.symbolSwapNumerics);
//S_logger.Log.logger.info("" + "commandWithoutNumerics-->" + command_V.commandWithoutNumerics);

//command_V.commandWithoutNumerics.replace(string, command_V.symbolSwapNumerics);
//S_logger.Log.logger.info("" + "commandWithoutNumerics-->" + command_V.commandWithoutNumerics);

//if (!chineseNumber.isEmpty()) {
//while (chineseNumber.charAt(0) == '零'
//	&& chineseNumber.length() > 1) {
//chineseNumber = chineseNumber.substring(1,
//		chineseNumber.length());
//}
//}
//if (!chineseNumber.isEmpty()) {
//while (chineseNumber
//	.charAt(chineseNumber.length() - 1) == '零'
//	&& chineseNumber.length() > 1) {
//chineseNumber = chineseNumber.substring(0,
//		chineseNumber.length() - 1);
//}
//}

//S_logger.Log.logger.info("" + 
//"1-->" + commandClass.numericsFromUnknownString.size());
//S_logger.Log.logger.info("" + "2-->" + commandClass.commandWithNumFilters);
//S_logger.Log.logger.info("" + "3-->" + studyVerbalMap.filterString);

//StudyVerbalMap_Q studyVerbalMap_Q = new StudyVerbalMap_Q();
//String number = "9992980400000088";
//number = studyVerbalMap_Q.getChineseFromNumerics(number);
//commandClass.fasterChineseNumberSwap(number);
