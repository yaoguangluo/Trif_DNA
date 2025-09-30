package S_A.SixActionMap;

import O_V.OSM.shell.CommandClass;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StudyVerbalMap_Q extends StudyVerbalMap_X {
	/*
	 * System.out.println("混合数字字符预处理锁定-->" + string);
	 * 因为有些大佬喜欢写100万2000这种标识，就不用一百万两千和1002000这类规范的。
	 * 所以我在这个if里面之后还要设计个阿拉伯数字转汉字的数字翻译机。 逻辑是先拆分数汉，
	 * 再翻译数变汉，最后组合全汉输出即可。 --罗瑶光
	 * 
	 * 首先构造一个getChineseFromNumerics，我设置最大数为16位，因为之前的
	 * getNumericsFromChinese也是16位，我电脑最大也就8位。大数运算我不cover。
	 */
	@SuppressWarnings("unused")
	public String getChineseFromNumerics(String number) {
		System.out.println(number);
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
		char[] chars = number.toCharArray();
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
		for (int right = chars.length - 1; right >= 0; right--) {
			char temp = chars[right];
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
			// System.out.println(i + "-->" + chineseParser[i]);
		}
		/*
		 * 2 numberParser swap to chineseParser
		 */
		for (int i = 0; i < chineseParser.length; i++) {
			chineseParsered[i] = doSwapUnderTenThousands(chineseParser[i]);
			// System.out.println(i + "-->" + chineseParsered[i]);
		}
		/*
		 * 3 chineseParser combination
		 */
		String output = "";
		boolean has3 = false;
		boolean has2 = false;
		boolean has1 = false;
		boolean has0 = false;
		if (chineseParsered[3].isEmpty()) {
			has3 = false;
		} else {
			has3 = true;
		}
		output = output + chineseParsered[3];
		if (true == has3 && !chineseParsered[3].equals("零")) {
			output = output + '万';
		}
		//
		if (chineseParsered[2].isEmpty()) {
			has2 = false;
		} else {
			has2 = true;
		}
		output = output + chineseParsered[2];
		if ((true == has2 || true == has3) && !chineseParsered[2].equals("零")) {
			output = output + '亿';
		}
		//
		if (chineseParsered[1].isEmpty()) {
			has1 = false;
		} else {
			has1 = true;
		}
		output = output + chineseParsered[1];
		if ((true == has1) && !chineseParsered[1].equals("零")) {
			output = output + '万';
		}
		//
		if (chineseParsered[0].isEmpty()) {
			has0 = false;
		} else {
			has0 = true;
		}
		output = output + chineseParsered[0];
		/*
		 * 开头与结尾零过滤,因为正则在不同的系统中有不同的语法格式如PCRE 
		 * 所以java系统我手写一份。 --罗瑶光
		 */
		//String outputFinal = "";
		output = prefixOptimization(output);
		// oder-fix
		output = orderfixOptimization(output);
		System.out.println("output-->" + output);
		return output;
	}
	
	/*
	 * fix filter 和 oder-fix稍后提取成函数，避免重复，然后command class
	 * 继承这些中间变量， 处理好哲学关系 保持简洁计算性能。。 --罗瑶光
	 */
	public String prefixOptimization(String input) {
		if (!input.isEmpty()) {
			while (input.charAt(0) == '零' && input.length() > 1) {
				input = input.substring(1, input.length());
			}
		}
		return input;
	}

	public String orderfixOptimization(String input) {
		if (!input.isEmpty()) {
			while (input.charAt(input.length() - 1) == '零'
					&& input.length() > 1) {
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
		// System.out.println("stringChinese-->" + stringChinese);
		/*
		 * 加单元
		 */
		int order = 0;
		for (int i = stringChinese.length() - 1; i >= 0; i--) {
			stringChineseUnits = "" + stringChinese.charAt(i);
			// System.out.println("stringChineseUnits-->" +
			// stringChineseUnits);
			if (1 == order && stringChinese.charAt(i) != '零') {
				stringChineseUnits = stringChinese.charAt(i) + "十";
				// System.out
				// .println("stringChineseUnits-->" + stringChineseUnits);
			}
			if (2 == order && stringChinese.charAt(i) != '零') {
				stringChineseUnits = stringChinese.charAt(i) + "百";
				// System.out
				// .println("stringChineseUnits-->" + stringChineseUnits);
			}
			if (3 == order && stringChinese.charAt(i) != '零') {
				stringChineseUnits = stringChinese.charAt(i) + "千";
				// System.out
				// .println("stringChineseUnits-->" + stringChineseUnits);
			}
			stringChineseUnitsFix = stringChineseUnits + stringChineseUnitsFix;
			order++;
		}
		// System.out.println("stringChineseUnitsFix-->" +
		// stringChineseUnitsFix);
		/*
		 * 过滤零单元
		 */
		stringChineseUnitsFix = stringChineseUnitsFix.replace("零零零零", "");
		stringChineseUnitsFix = stringChineseUnitsFix.replace("零零零", "零");
		stringChineseUnitsFix = stringChineseUnitsFix.replace("零零", "零");
		// System.out.println("stringChineseUnitsFixFilter-->" +
		// stringChineseUnitsFix);
		// pre-fix
		// oder-fix
		stringChineseUnitsFix = orderfixOptimization(stringChineseUnitsFix);
		return stringChineseUnitsFix;
	}

	public static void main(String[] argv) {
		CommandClass commandClass=new CommandClass();
		StudyVerbalMap_Q studyVerbalMap_Q = new StudyVerbalMap_Q();
		String number = "9992980400000088";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8082940800808033";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8888888888888888";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8888888888888888";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8888000008888888";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8080800800800088";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8000000000000000";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "800800000000080";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "800080000000080";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "000800000080000";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8000000000000";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "008000080";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8080808";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "808080";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8080";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "808";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "80";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "0080";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "88";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "8";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		System.out.println("-------------------");
		number = "0";
		number = studyVerbalMap_Q.getChineseFromNumerics(number);
		commandClass.fasterChineseNumberSwap(number);
		// 不断加不断修正细化即可
		//

	}
}
//不断加测试函数不断修正细化即可
//输出
//9992980400000088
//output-->九千九百九十二万九千八百零四亿零八十八
//输入-->九千九百九十二万九千八百零四亿零八十八
//简体-->九千九百九十二万九千八百零四亿零八十八
//total2-->9992
//total3-->99929804
//total2-->88
//total7-->9992980400000088
//-------------------
//8082940800808033
//output-->八千零八十二万九千四百零八亿零八十万八千零三十三
//输入-->八千零八十二万九千四百零八亿零八十万八千零三十三
//简体-->八千零八十二万九千四百零八亿零八十万八千零三十三
//total2-->8082
//total3-->80829408
//total2-->80
//total3-->808033
//total7-->8082940800808033
//-------------------
//8888888888888888
//output-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//输入-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//简体-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//total2-->8888
//total3-->88888888
//total2-->8888
//total3-->88888888
//total7-->8888888888888888
//-------------------
//8888888888888888
//output-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//输入-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//简体-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//total2-->8888
//total3-->88888888
//total2-->8888
//total3-->88888888
//total7-->8888888888888888
//-------------------
//8888000008888888
//output-->八千八百八十八万亿零八百八十八万八千八百八十八
//输入-->八千八百八十八万亿零八百八十八万八千八百八十八
//简体-->八千八百八十八万亿零八百八十八万八千八百八十八
//total2-->8888
//total4-->88880000
//total2-->888
//total3-->8888888
//total7-->8888000008888888
//-------------------
//8080800800800088
//output-->八千零八十万八千零八亿零八十万零八十八
//输入-->八千零八十万八千零八亿零八十万零八十八
//简体-->八千零八十万八千零八亿零八十万零八十八
//total2-->8080
//total3-->80808008
//total2-->80
//total3-->800088
//total7-->8080800800800088
//-------------------
//8000000000000000
//output-->八千万亿
//输入-->八千万亿
//简体-->八千万亿
//total2-->8000
//total4-->80000000
//亿1-->八千万亿
//total6-->8000000000000000
//-------------------
//800800000000080
//output-->八百万八千亿零八十
//输入-->八百万八千亿零八十
//简体-->八百万八千亿零八十
//total2-->800
//total3-->8008000
//total2-->80
//total7-->800800000000080
//-------------------
//800080000000080
//output-->八百万零八百亿零八十
//输入-->八百万零八百亿零八十
//简体-->八百万零八百亿零八十
//total2-->800
//total3-->8000800
//total2-->80
//total7-->800080000000080
//-------------------
//000800000080000
//output-->八千亿零八万
//输入-->八千亿零八万
//简体-->八千亿零八万
//total2-->8000
//total2-->8
//total4-->80000
//total7-->800000080000
//-------------------
//8000000000000
//output-->八万亿
//输入-->八万亿
//简体-->八万亿
//total2-->8
//total4-->80000
//亿1-->八万亿
//total6-->8000000000000
//-------------------
//008000080
//output-->八百万零八十
//输入-->八百万零八十
//简体-->八百万零八十
//total2-->800
//total3-->8000080
//-------------------
//8080808
//output-->八百零八万零八百零八
//输入-->八百零八万零八百零八
//简体-->八百零八万零八百零八
//total2-->808
//total3-->8080808
//-------------------
//808080
//output-->八十万八千零八十
//输入-->八十万八千零八十
//简体-->八十万八千零八十
//total2-->80
//total3-->808080
//-------------------
//8080
//output-->八千零八十
//输入-->八千零八十
//简体-->八千零八十
//total2-->8080
//-------------------
//808
//output-->八百零八
//输入-->八百零八
//简体-->八百零八
//total2-->808
//-------------------
//80
//output-->八十
//输入-->八十
//简体-->八十
//total2-->80
//-------------------
//0080
//output-->八十
//输入-->八十
//简体-->八十
//total2-->80
//-------------------
//88
//output-->八十八
//输入-->八十八
//简体-->八十八
//total2-->88
//-------------------
//8
//output-->八
//输入-->八
//简体-->八
//total2-->8
//-------------------
//0
//output-->零
//输入-->零
//简体-->零
//total2-->0



//if (!output.isEmpty()) {
//	while (output.charAt(0) == '零' && output.length() > 1) {
//		output = output.substring(1, output.length());
//	}
//}
//// oder-fix
//if (!output.isEmpty()) {
//	while (output.charAt(output.length() - 1) == '零'
//			&& output.length() > 1) {
//		output = output.substring(0, output.length() - 1);
//	}
//}

//if (!stringChineseUnitsFix.isEmpty()) {
//while (stringChineseUnitsFix
//		.charAt(stringChineseUnitsFix.length() - 1) == '零'
//		&& stringChineseUnitsFix.length() > 1) {
//	stringChineseUnitsFix = stringChineseUnitsFix.substring(0,
//			stringChineseUnitsFix.length() - 1);
//}
//}

