package S_A.SixActionMap;

import O_V.OSM.shell.CommandClass;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StudyVerbalMap_Q extends StudyVerbalMap_X {
	/*
	 * S_logger.Log.logger.info("" + "混合数字字符预处理锁定-->" + string);
	 * 因为有些用户喜欢写100万2000这种标识，就不用一百万两千和1002000这类规范的。
	 * 所以我在这个if里面之后还要设计个阿拉伯数字转汉字的数字翻译机。 逻辑是先拆分数汉，
	 * 再翻译数变汉，最后组合全汉输出即可。 --罗瑶光
	 * 
	 * 首先构造一个getChineseFromNumerics，我设置最大数为16位，因为之前的
	 * getNumericsFromChinese也是16位，我电脑最大也就8位。大数运算我不cover。
	 */
	/*
	 * 首先开始思考，假定这个number是一个标准的整数，因为小数逻辑简单，
	 * 只要直接翻译char即可。负数只要前面价格符号即可。
	 * 
	 * 于是开始分解，4位的千万位一个区间，那么是4个区间，符合普通人理解。 
	 * numberParser[0]=0~9999
	 * numberParser[1]=0 0000~9999 0000 
	 * numberParser[2]=0 0000 0000~9999 9999 9999 
	 * numberParser[3]=0 0000 0000 0000~9999 9999 9999 9999 
	 * 这就简单了，直接加个戳组合即可. 
	 * --论证了 计算哲学 适合 所有定义类逻辑的描述。
	 * --罗瑶光
	 */
	@SuppressWarnings("unused")
	public StringBuilder getChineseFromNumerics(StringBuilder chars) {
		S_logger.Log.logger.info("" + chars.toString());
		//char[] chars = number.toCharArray();
		String[] chineseParser = new String[4];
		String[] chineseParsered = new String[4];
		for (int i = 0; i < chineseParser.length; i++) {
			chineseParser[i] = "";
			chineseParsered[i] = "";
		}
		/*
		 * 1 number swap to numberParser
		 */
		int order = 0;
		for (int right = chars.length() - 1; right >= 0; right--) {
			char temp = chars.charAt(right);
			if (order < 4) {
				chineseParser[0] = temp + chineseParser[0];
			} else if (order < 8) {
				chineseParser[1] = temp + chineseParser[1];
			} else if (order < 12) {
				chineseParser[2] = temp + chineseParser[2];
			} else if (order < 16) {
				chineseParser[3] = temp + chineseParser[3];
			}
			order++;
		}
		for (int i = 0; i < chineseParser.length; i++) {
			// S_logger.Log.logger.info("" + i + "-->" + chineseParser[i]);
		}
		/*
		 * 2 numberParser swap to chineseParser
		 */
		for (int i = 0; i < chineseParser.length; i++) {
			if (chineseParser[i].isEmpty()) {
				continue;
			}
			chineseParsered[i] = doSwapUnderTenThousands(
				chineseParser[i]);
			// S_logger.Log.logger.info("" + i + "-->" + chineseParsered[i]);
		}
		/*
		 * 3 chineseParser combination
		 */
		StringBuilder output = new StringBuilder();
		boolean has3 = false;
		boolean has2 = false;
		boolean has1 = false;
		boolean has0 = false;
		if (chineseParsered[3].isEmpty()) {
			has3 = false;
		} else {
			has3 = true;
		}
		output.append(chineseParsered[3]);
		if (true == has3 && !chineseParsered[3].equals("零")) {
			output.append('万');
		}
		//
		if (chineseParsered[2].isEmpty()) {
			has2 = false;
		} else {
			has2 = true;
		}
		output.append(chineseParsered[2]);
		if ((true == has2 || true == has3) && !chineseParsered[2]
			.equals("零")) {
			output.append('亿');
		}
		//
		if (chineseParsered[1].isEmpty()) {
			has1 = false;
		} else {
			has1 = true;
		}
		output.append(chineseParsered[1]);
		if ((true == has1) && !chineseParsered[1].equals("零")) {
			output.append('万');
		}
		//
		if (chineseParsered[0].isEmpty()) {
			has0 = false;
		} else {
			if (chineseParsered[0].length() < 4) {
				if (0 != output.length()) {
					if (output.charAt(output.length() - 1) == '亿'
						|| output.charAt(output.length()
							- 1) == '万') {
						output = output.append('零');
					}
				}
			}
			has0 = true;
		}
		output.append(chineseParsered[0]);
		/*
		 * 开头与结尾零过滤,因为正则在不同的系统中有不同的语法格式如PCRE 
		 * 所以java系统我手写一份。 --罗瑶光
		 */
		//String outputFinal = "";
		output = prefixOptimization(output);
		// oder-fix
		String outputString = orderfixOptimization(output.toString());
		S_logger.Log.logger.info("" + "output-->" + outputString);
		return new StringBuilder(outputString);
	}

	/*
	 * fix filter 和 oder-fix稍后提取成函数，避免重复，然后command class
	 * 继承这些中间变量， 处理好哲学关系 保持简洁计算性能。。 --罗瑶光
	 */
	public StringBuilder prefixOptimization(StringBuilder input) {
		if (0 != input.length()) {
			while (input.charAt(0) == '零' && input.length() > 1) {
				input.deleteCharAt(0);
				//.subSequence(1, input.length());
			}
		}
		return input;
	}

	public String orderfixOptimization(String input) {
		if (0 != input.length()) {
			while (input.charAt(input.length() - 1) == '零' && input
				.length() > 1) {
				input = input.substring(0, input.length() - 1);
			}
		}
		return input;
	}

	/*
	 * 这个逻辑开始思考千位变换， 1- 首先string 进行 swap to chars 
	 * 2- 4位的 char 对应个十百千 这是单位， 3- char是0-9 需要量词翻译。 
	 * 4- 翻译后加单位进行组合，量词是零需要过滤所在的单位，因为一开始是高位满足法拆分， 
	 * 5- 所以开头是0，也要保留零，
	 * 6- 末尾是零需要过滤，
	 */
	@SuppressWarnings("unused")
	public String doSwapUnderTenThousands(String string) {
		String stringChinese = "";
		String stringChineseUnits = "";
		String stringChineseUnitsFix = "";
		String stringChineseUnitsFixFlter = "";
		String output = "";
		char[] chars = string.toCharArray();
		for (int right = chars.length - 1; right >= 0; right--) {
			char temp = chars[right];
			if (temp == '0') {
				stringChinese = "零" + stringChinese;
			}
			if (temp == '1') {
				stringChinese = "一" + stringChinese;
			}
			if (temp == '2') {
				stringChinese = "二" + stringChinese;
			}
			if (temp == '3') {
				stringChinese = "三" + stringChinese;
			}
			if (temp == '4') {
				stringChinese = "四" + stringChinese;
			}
			if (temp == '5') {
				stringChinese = "五" + stringChinese;
			}
			if (temp == '6') {
				stringChinese = "六" + stringChinese;
			}
			if (temp == '7') {
				stringChinese = "七" + stringChinese;
			}
			if (temp == '8') {
				stringChinese = "八" + stringChinese;
			}
			if (temp == '9') {
				stringChinese = "九" + stringChinese;
			}
		}
		/*
		 * 加单元
		 */
		int order = 0;
		for (int i = stringChinese.length() - 1; i >= 0; i--) {
			stringChineseUnits = "" + stringChinese.charAt(i);
			if (1 == order && stringChinese.charAt(i) != '零') {
				stringChineseUnits = stringChinese.charAt(i) + "十";
			}
			if (2 == order && stringChinese.charAt(i) != '零') {
				stringChineseUnits = stringChinese.charAt(i) + "百";
			}
			if (3 == order && stringChinese.charAt(i) != '零') {
				stringChineseUnits = stringChinese.charAt(i) + "千";
			}
			stringChineseUnitsFix = stringChineseUnits
				+ stringChineseUnitsFix;
			order++;
		}
		/*
		 * 过滤零单元
		 */
		if (stringChineseUnitsFix.contains("零零")) {
			stringChineseUnitsFix = stringChineseUnitsFix.replace(
				"零零零零", "");
			stringChineseUnitsFix = stringChineseUnitsFix.replace(
				"零零零", "零");
			stringChineseUnitsFix = stringChineseUnitsFix.replace(
				"零零", "零");
		}
		stringChineseUnitsFix = orderfixOptimization(
			stringChineseUnitsFix);
		return stringChineseUnitsFix;
	}
	// S_logger.Log.logger.info("" + "stringChineseUnitsFix-->" +
	// stringChineseUnitsFix);
	// S_logger.Log.logger.info("" + "stringChineseUnitsFixFilter-->" +
	// stringChineseUnitsFix);
	// pre-fix
	// oder-fix

	public static void main(String[] argv) {
		CommandClass commandClass = new CommandClass();
		StudyVerbalMap_Q studyVerbalMap_Q = new StudyVerbalMap_Q();

		StringBuilder number = new StringBuilder("205602");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("250602");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("9992980400000088");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8082940800808033");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8888888888888888");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8888888888888888");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8888000008888888");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8080800800800088");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8000000000000000");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("800800000000080");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("800080000000080");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("000800000080000");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8000000000000");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("008000080");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8080808");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("808080");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8080");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("808");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("80");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("0080");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("88");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("8");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		S_logger.Log.logger.info("" + "-------------------");
		number = new StringBuilder("0");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);

		number = new StringBuilder("100900");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		//含零测试。
		number = new StringBuilder("8082040800800803");
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		/*
		 * 今天测试覆盖率思维发现一个问题，问题的描述是我在做16位大数循环测试时候，当测试的循环
		 * loop到 205602 的时候显示 二十五万零六百零二， 于是我单个测试，发现上行函数是
		 * 二十万五千六百零二 ，下行一个function call 进去就成了 二十五万零六百零二，百思不得其解。
		 * 我开始--思考
		 * 1 -- 是内存不足 边界堆栈buffer裁剪 导致寄存器冗余归纳出错？
		 * 2 -- 我眼花？于是重新测试 loop 竟然还出现了 -零零- 连续。
		 * 3 -- string buffer在快速计算时候log和write println等一样需要flush一下？ 
		 *      奇怪jdk文档都没有这一条啊。
		 * 4 -- 电脑没有删除out 还要 clean？
		 * 
		 * 解决方法
		 * 1 带着这个问题，我能做的就是把华瑞集工程中 复杂string计算模块 逐步变成string builder模块 
		 * 2 string builder模块中 常见乱码的模块部分 逐步变成 byte array模块。
		 * 
		 * --罗瑶光
		 * */
		//十六大数测试，覆盖率100%
//		for (int i = 0; i < 99999999; i++) {
//			for (int j = 0; j < 99999999; j++) {
//				StringBuilder bignumber = new StringBuilder(i + ""
//					+ j);
//				bignumber = studyVerbalMap_Q.getChineseFromNumerics(
//					bignumber);
//				commandClass.fasterChineseNumberSwap(bignumber);
//			}
//		}

		// 不断加不断修正细化即可
	}
}
//不断加测试函数不断修正细化即可
//输出
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 205602
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->二十万五千六百零二
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->二十万五千六百零二
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->二十万五千六百零二
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->20
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->205602
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 250602
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->二十五万零六百零二
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->二十五万零六百零二
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->二十五万零六百零二
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->25
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->250602
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 9992980400000088
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->九千九百九十二万九千八百零四亿零八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->九千九百九十二万九千八百零四亿零八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->九千九百九十二万九千八百零四亿零八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->9992
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->99929804
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->88
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->9992980400000088
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8082940800808033
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千零八十二万九千四百零八亿零八十万八千零三十三
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千零八十二万九千四百零八亿零八十万八千零三十三
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千零八十二万九千四百零八亿零八十万八千零三十三
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8082
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->80829408
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->808033
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->8082940800808033
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8888888888888888
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->88888888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->88888888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->8888888888888888
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8888888888888888
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->88888888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->88888888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->8888888888888888
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8888000008888888
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千八百八十八万亿零八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千八百八十八万亿零八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千八百八十八万亿零八百八十八万八千八百八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total4-->88880000
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->8888888
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->8888000008888888
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8080800800800088
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千零八十万八千零八亿零八十万零八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千零八十万八千零八亿零八十万零八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千零八十万八千零八亿零八十万零八十八
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8080
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->80808008
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->800088
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->8080800800800088
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8000000000000000
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8000
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total4-->80000000
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 亿1-->八千万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total6-->8000000000000000
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 800800000000080
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八百万八千亿零零八十
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八百万八千亿零零八十
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八百万八千亿零零八十
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->800
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->8008000
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->800800000000080
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 800080000000080
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八百万零八百亿零零八十
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八百万零八百亿零零八十
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八百万零八百亿零零八十
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->800
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->8000800
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->800080000000080
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 000800000080000
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千亿零八万
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千亿零八万
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千亿零八万
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8000
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total4-->80000
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->800000080000
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8000000000000
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total4-->80000
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 亿1-->八万亿
//10月 18, 2025 2:03:43 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total6-->8000000000000
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:43 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 008000080
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八百万零零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八百万零零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八百万零零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->800
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->8000080
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8080808
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八百零八万零八百零八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八百零八万零八百零八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八百零八万零八百零八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->808
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->8080808
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 808080
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八十万八千零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八十万八千零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八十万八千零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->808080
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8080
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千零八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8080
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 808
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八百零八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八百零八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八百零八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->808
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 80
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 0080
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八十
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 88
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八十八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八十八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八十八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->88
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q main
//信息: -------------------
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 0
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->零
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->零
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->零
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->0
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 100900
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->一十万零零九百
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->一十万零零九百
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->一十万零零九百
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->10
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->100900
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: 8082040800800803
//10月 18, 2025 2:03:44 下午 S_A.SixActionMap.StudyVerbalMap_Q getChineseFromNumerics
//信息: output-->八千零八十二万零四百零八亿零八十万零八百零三
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: 输入-->八千零八十二万零四百零八亿零八十万零八百零三
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass simpleChineseNumberSwap
//信息: 简体-->八千零八十二万零四百零八亿零八十万零八百零三
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->8082
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->80820408
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total2-->80
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total3-->800803
//10月 18, 2025 2:03:44 下午 O_V.OSM.shell.CommandClass fasterChineseNumberSwap
//信息: total7-->8082040800800803
