package S_A.SixActionMap;

import java.util.Iterator;

import O_V.OSM.shell.CommandClass;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StudyVerbaMap extends StudyVerbaMap_X {
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
		// command_V.getNumericsFromUnknownMap(command_V.command);
		getNumericsFromUnknownMapAndFiltCommand(command_V);

		return 0;
	}

	/*
	 * 这个函数用于将command string中的数字和汉字进行提取出来，形成一个map，如果是汉字就进行
	 * 阿拉伯数字变换。提取map后将原string的对应字符全部过滤掉生成commandWithNumFilters。
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void getNumericsFromUnknownMapAndFiltCommand(
			CommandClass command_V) {
		// TODO Auto-generated method stub
		// number extra
		String string = "";
		String inputString = command_V.command;
		inputString = command_V.simpleChineseNumberSwap(inputString);
		int fixOrder = 0;
		for (fixOrder = 0; fixOrder < inputString.length(); fixOrder++) {
			if ((inputString.charAt(fixOrder) > 47
					&& inputString.charAt(fixOrder) < 58)
					|| (inputString.charAt(fixOrder) == '零'
							|| inputString.charAt(fixOrder) == '一'
							|| inputString.charAt(fixOrder) == '二'
							|| inputString.charAt(fixOrder) == '三'
							|| inputString.charAt(fixOrder) == '四'
							|| inputString.charAt(fixOrder) == '五'
							|| inputString.charAt(fixOrder) == '六'
							|| inputString.charAt(fixOrder) == '七'
							|| inputString.charAt(fixOrder) == '八'
							|| inputString.charAt(fixOrder) == '九'
							|| inputString.charAt(fixOrder) == '十'
							|| inputString.charAt(fixOrder) == '百'
							|| inputString.charAt(fixOrder) == '千'
							|| inputString.charAt(fixOrder) == '万'
							|| inputString.charAt(fixOrder) == '亿'
							|| inputString.charAt(fixOrder) == '壹'
							|| inputString.charAt(fixOrder) == '贰'
							|| inputString.charAt(fixOrder) == '两'
							|| inputString.charAt(fixOrder) == '叁'
							|| inputString.charAt(fixOrder) == '肆'
							|| inputString.charAt(fixOrder) == '伍'
							|| inputString.charAt(fixOrder) == '陆'
							|| inputString.charAt(fixOrder) == '柒'
							|| inputString.charAt(fixOrder) == '捌'
							|| inputString.charAt(fixOrder) == '玖'
							|| inputString.charAt(fixOrder) == '拾'
							|| inputString.charAt(fixOrder) == '佰'
							|| inputString.charAt(fixOrder) == '仟')) {
			} else {
				if (!string.isEmpty()) {
					System.out.println(string + "--" + fixOrder);
					// println函数走图形打印机，并发工程记得注释掉或者用其他的classic观测API
					command_V.numericsFromUnknownString.put(string.toString(),
							fixOrder);
					string = "";
				}
				filterString += inputString.charAt(fixOrder);
				continue;
			}
			string += inputString.charAt(fixOrder);
		}
		if (!string.isEmpty()) {
			System.out.println(string + "--" + fixOrder);
			// println函数走图形打印机，并发工程记得注释掉或者用其他的classic观测API
			command_V.numericsFromUnknownString.put(string.toString(),
					fixOrder);
			string = "";
		}
		// chinese number extra
		// english extra later
	}

	public static void main(String[] argv) {
		String input = "123在输出的数据表中仅展示从第零行到第3拾行的数据";
		CommandClass command_V = new CommandClass();
		command_V.command = input;
		StudyVerbaMap studyVerbaMap = new StudyVerbaMap();
		studyVerbaMap.extractNumberfromString(command_V);
		System.out.println("1-->" + command_V.numericsFromUnknownString.size());
		System.out.println("2-->" + command_V.commandWithNumFilters);
		System.out.println("3-->" + studyVerbaMap.filterString);
		/*
		 * 稍后可以设计处理混合字符的数字格式化机，关于 3十 这种描述进行格式化。 --罗瑶光
		 */
		studyVerbaMap.formatNumericMap(command_V);
	}

	@SuppressWarnings("unchecked")
	public void formatNumericMap(CommandClass command_V) {
		Iterator<String> iterators = command_V.numericsFromUnknownString
				.keySet().iterator();
		while (iterators.hasNext()) {
			String string = iterators.next();
			System.out.println("混合数字字符探索-->" + string);
			boolean hasNumerics = false;
			boolean hasChars = false;
			if (string.contains("0") || string.contains("1")
					|| string.contains("2") || string.contains("3")
					|| string.contains("4") || string.contains("5")
					|| string.contains("6") || string.contains("7")
					|| string.contains("8") || string.contains("9")) {
				hasNumerics = true;
			}
			if (string.contains("零") || string.contains("一")
					|| string.contains("二") || string.contains("三")
					|| string.contains("四") || string.contains("五")
					|| string.contains("六") || string.contains("七")
					|| string.contains("八") || string.contains("九")
					|| string.contains("十") || string.contains("十")
					|| string.contains("百") || string.contains("千")
					|| string.contains("万") || string.contains("亿")) {
				hasChars = true;
			}
			if (hasNumerics && hasChars) {
				System.out.println("混合数字字符预处理锁定-->" + string);
				/*
				 * 因为有些大佬喜欢写100万2000这种标识，就不用一百万两千和1002000这类规范的。
				 * 所以我在这个if里面之后还要设计个阿拉伯数字转汉字的数字翻译机。 逻辑是先拆分数汉，
				 * 再翻译数变汉，最后组合全汉输出即可。 --罗瑶光
				 */
			}
		}
	}
}
//输出
//简体-->123在输出的数据表中仅展示从第零行到第3十行的数据
//123--3
//零--17
//3十--22
//1-->3
//2-->null
//3-->在输出的数据表中仅展示从第行到第行的数据
//混合数字字符探索-->123
//混合数字字符探索-->零
//混合数字字符探索-->3十
//混合数字字符预处理锁定-->3十
