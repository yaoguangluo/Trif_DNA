package O_V.OSM.shell;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ME.VPC.M.app.App;
import S_A.SixActionMap.WorkVerbaMap;
import S_A.pheromone.IMV_SIQ;
/*
 * Thinking， should I make a English version about this presentation？
 * COZ I logged in GitHub just now and checked the traffic history，
 * in amazing where I saw so much unique IPs from the world-wides. 
 * Thinking.. what does the feeling about those IPs, when they saw 
 * a complex and discrete Chinese annotations and explanations. 
 * 
 * Hens I may do something in a right way. On the way. and by the way
 * continue a Chinese minding now. 
 * 
 * -- YaoguangLuo  
 * 
 * */
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

/*
 * 看到这些变量在增加，我在思考，计算数据的关系很多思绪可以从关系方式数据库的范式定义
 * 中寻找答案，所以年轻人一定要把数据库原理这门课学好。WorkVerbaMap在华瑞集中的逻辑
 * 决策是1:1的关系，而命令句和map的关系是 M:1 的关系。而里面的单句延伸是1:M的关系，
 * 延伸的属性和指令集是 M:N 关系。指令集的计算逻辑是sigma范式，指令集的推导笛卡尔关系。
 * 关于这六层关系要进行计算优化，自然要用到梯度微积分。所以年轻人高等数学和计算机统计
 * 要学好。将这6层关系化简后，形成的BPM和UML是不是要更近管理维护？所以离散数学也要学好。
 * 
 * --罗瑶光
 * 
 * */
public class CommandClass {
	//用了NE， 六元分析机可以略去。
	public App regNE;
	// 工作机
	//public WorkVerbaMap workVerbaMap;
	// 单句的命令
	public String command;
	public int countReject = 0;
	// 单句的延伸
	public String commandAcknowledge;
	// 单句的延伸
	public String commandWithNumFilters;

	// 单句的多种延伸
	public String[] acknowledge;
	public String[] acknowledgeSwap;
	// 单句的变换延伸
	public String commandSwap;
	// 单句的分解延伸
	public List<String> commandLists;
	//
	public String[] stringSets;
	public Map<String, String[]> stringSetsMap = new HashMap<>();
	// 单句的预处理
	public List<String> _IMV_SIQ_SS_ = new ArrayList<>();
	/*
	 * 稍后这些关于当前的命令句对应的workVerbaMap中需要clear的对象都走这个类，
	 * 免得以后修改或者增加条件，不谨慎漏了几个clear。我认为这是一种计算关系的优 化方式，属于聚类优化计算逻辑。
	 * 
	 * 随着条件越来越多，之后会统一组合优化这个map关系，然后剔除掉一些成员变量。 --trif later
	 * 
	 * --罗瑶光
	 * 
	 */
	public IMV_SIQ_SS _IMV_SIQ_SS = new IMV_SIQ_SS();
	public IMV_SIQ_S_ _IMV_SIQ_S_ = new IMV_SIQ_S_();
	
	public IMV_SIQ unknown_map = new IMV_SIQ();
	public IMV_SIQ cartesianLooped = new IMV_SIQ();
	/*
	 * 关系大幅减少仅仅代表计算关系的优化比较通畅，并不代表计算属性的优化是完美的，
	 * 于是开始细化计算关系，确定计算属性的重心价值。于是开始拆解 +- SVO关系。
	 * 这里分解后，所有涉及这个逻辑的都要分解。于是跟进优化。 --罗瑶光
	 */
	public IMV_SIQ cartesianWorkActionsRightsSV = new IMV_SIQ();//
	public IMV_SIQ cartesianWorkActionsPositionsSV = new IMV_SIQ();//
	public IMV_SIQ cartesianWorkActions_posSV = new IMV_SIQ();//

	public IMV_SIQ cartesianWorkActionsRightsVO = new IMV_SIQ();//
	public IMV_SIQ cartesianWorkActionsPositionsVO = new IMV_SIQ();//
	public IMV_SIQ cartesianWorkActions_posVO = new IMV_SIQ();//

	public IMV_SIQ numericsFromUnknownString = new IMV_SIQ();
	public IMV_SIQ alfabeticsFromUnknownString = new IMV_SIQ();
	public IMV_SIQ symbolicsFromUnknownString = new IMV_SIQ();
	public IMV_SIQ unicodesFromUnknownString = new IMV_SIQ();

	/*
	 * 在这个逻辑中主要有2类，一类是阿拉伯字符如250，一类是语义字符如二百五十。这个关系是
	 * 长期稳定的思维。所以当前可进行固定函数编码。
	 */
	@SuppressWarnings("unchecked")
	public void getNumericsFromUnknownMap(String inputString) {
		/*
		 * 在一切关系明了的环境中开始思考-未知的字符集大体有4类，第一类是数字，第二类是
		 * 字母，第三类是常见符号，第四类是特殊符号。所以在这里就要有4个识别函数来work。
		 * 
		 * --later to do。 --罗瑶光
		 */
		// 1 阿拉伯字母句
		String string = "";
		int fixOrder = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) < 48 || inputString.charAt(i) > 57) {
				if (!string.isEmpty()) {
					System.out.println(string + "--" + fixOrder);
					// println函数走图形打印机，并发工程记得注释掉或者用其他的classic观测API
					numericsFromUnknownString.put(string.toString(),
							fixOrder++);
					string = "";
				}
				continue;
			}
			string += inputString.charAt(i);
		}
		if (!string.isEmpty()) {
			System.out.println(string + "--" + fixOrder);
			// println函数走图形打印机，并发工程记得注释掉或者用其他的classic观测API
			numericsFromUnknownString.put(string.toString(), fixOrder++);
			string = "";
		}
		// 2 其他语义，如中文
		// to do later。。
	}

	@SuppressWarnings("unchecked")
	public void getAlfabeticsFromUnknownMap(String inputString) {
		// 英文字母句
		String string = "";
		int fixOrder = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if ((inputString.charAt(i) > 64 && inputString.charAt(i) < 91)
					|| (inputString.charAt(i) > 96
							&& inputString.charAt(i) < 123)) {
				string += inputString.charAt(i);
			} else {
				if (!string.isEmpty()) {
					System.out.println(string + "--" + fixOrder);
					alfabeticsFromUnknownString.put(string.toString(),
							fixOrder++);
					string = "";
				}
				continue;
			}
		}
		if (!string.isEmpty()) {
			System.out.println(string + "--" + fixOrder);
			alfabeticsFromUnknownString.put(string.toString(), fixOrder++);
			string = "";
		}
	}

	public void getSymbolicsFromUnknownMap(String inputString) {
		// 这里的逻辑是构造科学计算器用，华瑞集系统先不cover。
		/*
		 * 我要做的是识别指令符号，｜ ; ; 以后变量中含有指令符号做string用， 我用HTTP
		 * encode去变形，或者元基编码去格式变换，避免被这层逻辑分解即可。 省去一把函数。
		 */
	}

	public IMV_SIQ getUnicodesFromUnknownMap(String inputString) {

		return null;
	}

	/*
	 * 准备构造中文数字翻译机。
	 */
	/*
	 * // 首选我要构造一个数字取值机，value。 // 拿到了数字后，确定这个数字的后缀fix。 //
	 * 于是出现了问题，当fix连续出现，而 value 没有赋值，所以问题在于变量缺少。 //
	 * 在计算哲学中，数字有分层关系，我定义为量-0-9-词，单元-十佰千万亿-词， //
	 * 这里便是数字的哲学辩证量与单元的逻辑关系。所以我一开始变量命名就是错的。 //
	 * 在数字逻辑中，单元词本身就是个量词，是被包含关系。 // 于是将关系提取 // 于是我需要一个加乘器
	 * 用connectCi标识 当字符串匹配到单元词的时候，开始区间划分。 //liangCi的 取值为 -1和 0～9
	 * //liangCidanyuanCide 取值为 -1和 0～9 10 100 1000 10000
	 * 100000000 //danyuanCide 取值为 10 100 1000 10000 100000000
	 * //数字分为三层关系后，开始思考中文的逻辑组合，
	 * 单个量词直接输出，多个量词链接为乘法，那么这里需要有前缀标识liangCiFix
	 * 在loop的最末端进行标记。确定乘法标记，只有在loop区间中没有操作条件时候才做乘积
	 * 在50字描述后，问题就找到了。 --罗瑶光
	 */
	public static void main(String[] argv) {
		CommandClass commandClass = new CommandClass();
		String string = "*&^$^&&567 678&^%Royal!% @123&&@tin yo&&@@luo yaoguang";
		commandClass.getNumericsFromUnknownMap(string);
		commandClass.getAlfabeticsFromUnknownMap(string);
		// output
		// 567--0
		// 678--1
		// 123--2
		// Royal--0
		// tin--1
		// yo--2
		// luo--3
		commandClass.numericsFromUnknownString.clear();
		commandClass.alfabeticsFromUnknownString.clear();
		string = "在输出的数据表中仅展示从第0行到第30行的数据";
		commandClass.getNumericsFromUnknownMap(string);
		commandClass.getAlfabeticsFromUnknownMap(string);
		// output
		// 567--0
		// 678--1
		// 123--2
		// Royal--0
		// tin--1
		// yo--2
		// luo--3
		// ----------------
		// 0--0
		// 30--1
		System.out.println("--------中文数字机-V00001---------");
		String number = "一";
		commandClass.fasterChineseNumberSwap(number);
		number = "拾";
		commandClass.fasterChineseNumberSwap(number);
		number = "零拾";
		commandClass.fasterChineseNumberSwap(number);
		number = "一拾贰";
		commandClass.fasterChineseNumberSwap(number);
		number = "拾陆";
		commandClass.fasterChineseNumberSwap(number);
		number = "零拾三";
		commandClass.fasterChineseNumberSwap(number);
		number = "捌拾玖";
		commandClass.fasterChineseNumberSwap(number);
//
		number = "零佰";
		commandClass.fasterChineseNumberSwap(number);
		number = "壹百";
		commandClass.fasterChineseNumberSwap(number);
		number = "两佰二十";
		commandClass.fasterChineseNumberSwap(number);
		number = "两佰零二";
		commandClass.fasterChineseNumberSwap(number);
		number = "两佰贰十二";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千两佰贰十二";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千两佰零二";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千零二";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千零二十";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千零二十二";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千零二十二万";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千零二十二万零二";
		commandClass.fasterChineseNumberSwap(number);
		number = "两千零二十二万两千零二十二";
		commandClass.fasterChineseNumberSwap(number);
		number = "玖千玖百九拾九万九千九佰九十玖";
		commandClass.fasterChineseNumberSwap(number);
//
		number = "零万";
		commandClass.fasterChineseNumberSwap(number);
		number = "万二十";
		commandClass.fasterChineseNumberSwap(number);
		number = "二万二佰零二";
		commandClass.fasterChineseNumberSwap(number);
		number = "十万";
		commandClass.fasterChineseNumberSwap(number);
		number = "十万万";
		System.out.println("十万万");
		System.out.println("-学好语文，这叫十亿-先不处理歧义句");
		System.out.println("-先不处理超亿句，我框架都写好了，直接split 加函数即可。");
		number = "十二万";
		commandClass.fasterChineseNumberSwap(number);
		number = "万";
		commandClass.fasterChineseNumberSwap(number);
		number = "亿";
		commandClass.fasterChineseNumberSwap(number);
		number = "十亿";
		commandClass.fasterChineseNumberSwap(number);
		// 大数运算构造机 later
		number = "万亿";
		commandClass.fasterChineseNumberSwap(number);
		number = "九千万亿";
		commandClass.fasterChineseNumberSwap(number);
		number = "九千万亿零九";
		commandClass.fasterChineseNumberSwap(number);
		number = "九千万亿零九十";
		commandClass.fasterChineseNumberSwap(number);
		number = "九千零九十万零九十亿零九十";
		// 9090 0090 0000 0090
		commandClass.fasterChineseNumberSwap(number);
		number = "九千零九十万零九百零九亿零九十万零九百零九";
		commandClass.fasterChineseNumberSwap(number);
		number = "八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八";
		commandClass.fasterChineseNumberSwap(number);
		
		// 我的系统没有16位大数计算业务，有就按这个逻辑+兆+京条件去解决。
		// 框架都搞好了，直接加函数即可 --罗瑶光
	}

	public String simpleChineseNumberSwap(String chineseNumber) {
		String stringSwap = chineseNumber.replace("壹", "一");
		stringSwap = stringSwap.replace("贰", "二");
		stringSwap = stringSwap.replace("两", "二");
		stringSwap = stringSwap.replace("叁", "三");
		stringSwap = stringSwap.replace("肆", "四");
		stringSwap = stringSwap.replace("伍", "五");
		stringSwap = stringSwap.replace("陆", "六");
		stringSwap = stringSwap.replace("柒", "七");
		stringSwap = stringSwap.replace("捌", "八");
		stringSwap = stringSwap.replace("玖", "九");
		stringSwap = stringSwap.replace("拾", "十");
		stringSwap = stringSwap.replace("佰", "百");
		stringSwap = stringSwap.replace("仟", "千");
		stringSwap = stringSwap.replace("万", "万");
		System.out.println("简体-->" + stringSwap);
		return stringSwap;
	}

	@SuppressWarnings("unused")
	public String fasterChineseNumberSwap(String chineseNumber) {
		System.out.println("输入-->" + chineseNumber);
		/*
		 * 上面是计算哲学和计算关系和计算逻辑的分析方法，需要巨大的采样，不符合我的思维认知方式
		 * 于是按照罗瑶光的思绪分析，开始编码。首先我要进行数据预处理，将文字中所有繁体全部简化
		 */
		String stringSwap = simpleChineseNumberSwap(chineseNumber);
		/*
		 * 简化后文字开始进行精确分析，首先拆分最大逻辑集合确定亿为最大计算量级， 
		 * 因为单机的long最大只有亿。然后处理京为最大处理量级。关于亿的逻辑意识组合 
		 * 有 万亿，一万亿， 一万一千零二亿， 乘积是100 000 000 ，8个零。
		 */
		String regWan = "";
		String regYi = "";
		String reg = "";
		String total1 = "";
		String total2 = "";
		String total3 = "";
		String total4 = "";
		String total5 = "";
		String total6 = "";
		String outputYi = "";
		String[] stringsYi = stringSwap.split("亿");
		// System.out.println("stringsYi.length-->" +
		// stringsYi.length);
		if (stringsYi.length > 0) {
			int j = 0;
			for (String stringYi : stringsYi) {
				j++;
				// System.out.println("stringYi-->" + stringYi);
				/*
				 * 简化后文字开始进行精确分析，然后拆分最大逻辑集合确定万为最大计算量级， 
				 * 有 千万，一百万， 一千零二十万，乘积是10 000 4个零。
				 */
				// System.out.println(stringYi);
				String[] stringsWan = stringYi.split("万");
				// System.out.println("stringsWan.length-->" +
				// stringsWan.length);
				String outputWan = "";
				if (stringsWan.length > 0) {
					int i = 0;
					for (String stringWan : stringsWan) {
						i++;
						// System.out.println("stringWan-->" + stringWan);
						/*
						 * 逻辑分层后，这里只要处理一万以内的组合，大幅减少条件分析。
						 */
						// System.out.println("longWan-->" + stringWan);
						if (stringWan.isEmpty()) {
							outputWan += "" + 1;
							reg = outputWan;
							System.out.println("total1-->" + outputWan);
							total1 = outputWan.toString();
							continue;
						}
						long longWan = processWan(stringWan);
						// System.out.println("longWan-->" + longWan);
						if (outputWan.isEmpty()) {
							outputWan += "" + longWan;
							reg = outputWan;
							System.out.println("total2-->" + outputWan);
							total2 = outputWan.toString();
							continue;
						}
						if (longWan < 10) {
							outputWan += "000" + longWan;
						} else if (longWan < 100) {
							outputWan += "00" + longWan;
						} else if (longWan < 1000) {
							outputWan += "0" + longWan;
						} else {
							outputWan += "" + longWan;
						}
						reg = outputWan;
						total3= outputWan.toString();
						System.out.println("total3-->" + outputWan);
					}
					if (stringYi.contains("万") && stringsWan.length < 2) {
						outputWan += "0000";
						reg = outputWan;
						total4 = outputWan.toString();
						System.out.println("total4-->" + outputWan);
					}
				} else {
					// wan to do
					outputWan = "10000";
					reg = outputWan;
					total5 = outputWan.toString();
					System.out.println("total5-->" + outputWan);
				}
				if (1 == j) {
					regYi = reg;
				}
				if (2 == j) {
					regWan = reg;
				}
			}
			if (stringSwap.contains("亿") && stringsYi.length < 2) {
				System.out.println("亿1-->" + stringSwap);
				outputYi += reg + "00000000";
				total6 = outputYi.toString();
				System.out.println("total6-->" + outputYi);
			}
			if (stringSwap.contains("亿") && stringsYi.length > 1) {
				//System.out.println("regYi2-->" + regYi);
				//System.out.println("亿2-->" + stringSwap);
				//System.out.println("regWan2-->" + regWan);
				//System.out.println("stringsYi.length-->" + stringsYi.length);
				if (regWan.length() < 2) {
					regYi += "0000000" + regWan;
					//System.out.println("regWan1-->" + regWan);
					//System.out.println("regYi1-->" + regYi);
				} else if (regWan.length() < 3) {
					regYi += "000000" + regWan;
					//System.out.println("regWan2-->" + regWan);
					//System.out.println("regYi2-->" + regYi);
				} else if (regWan.length() < 4) {
					regYi += "00000" + regWan;
					//System.out.println("regWan3-->" + regWan);
					//System.out.println("regYi3-->" + regYi);
				} else if (regWan.length() < 5) {
					regYi += "0000" + regWan;
					//System.out.println("regWan4-->" + regWan);
					//System.out.println("regYi4-->" + regYi);
				} else if (regWan.length() < 6) {
					regYi += "000" + regWan;
					//System.out.println("regWan5-->" + regWan);
					//System.out.println("regYi5-->" + regYi);
				} else if (regWan.length() < 7) {
					regYi += "00" + regWan;
					//System.out.println("regWan6-->" + regWan);
					//System.out.println("regYi6-->" + regYi);
				} else if (regWan.length() < 8) {
					regYi += "0" + regWan;
					//System.out.println("regWan7-->" + regWan);
					//System.out.println("regYi7-->" + regYi);
				}else if (regWan.length() < 9) {
					regYi += "" + regWan;
					//System.out.println("regWan7-->" + regWan);
					//System.out.println("regYi7-->" + regYi);
				}
				outputYi += regYi;
				System.out.println("total7-->" + outputYi);
			}

		} else {
			// yi to do
			outputYi = "100000000";
			System.out.println("total8-->" + outputYi);

		}
		if(!outputYi.isEmpty()) {
			return outputYi;
		}
		if(!total6.isEmpty()) {
			return total6;
		}
		if(!total5.isEmpty()) {
			return total5;
		}
		if(!total4.isEmpty()) {
			return total4;
		}
		if(!total3.isEmpty()) {
			return total3;
		}
		if(!total2.isEmpty()) {
			return total2;
		}
		if(!total1.isEmpty()) {
			return total1;
		}
		return outputYi;
	}

	private long processWan(String stringWan) {
		// TODO Auto-generated method stub
		long total = 0;
		long set = 0;
		long value = -1;
		for (int i = 0; i < stringWan.length(); i++) {
			if (stringWan.charAt(i) == '零') {
				value = 0;
			}
			if (stringWan.charAt(i) == '一') {
				value = 1;
			}
			if (stringWan.charAt(i) == '二') {
				value = 2;
			}
			if (stringWan.charAt(i) == '三') {
				value = 3;
			}
			if (stringWan.charAt(i) == '四') {
				value = 4;
			}
			if (stringWan.charAt(i) == '五') {
				value = 5;
			}
			if (stringWan.charAt(i) == '六') {
				value = 6;
			}
			if (stringWan.charAt(i) == '七') {
				value = 7;
			}
			if (stringWan.charAt(i) == '八') {
				value = 8;
			}
			if (stringWan.charAt(i) == '九') {
				value = 9;
			}
			if (stringWan.charAt(i) == '十') {
				set = 0 != value ? -1 == value ? 1 : value : 0;
				set = set * 10;
				total += set;
				value = -1;
			}
			if (stringWan.charAt(i) == '百') {
				set = 0 != value ? -1 == value ? 1 : value : 0;
				set = set * 100;
				total += set;
				value = -1;
			}
			if (stringWan.charAt(i) == '千') {
				set = 0 != value ? -1 == value ? 1 : value : 0;
				set = set * 1000;
				total += set;
				value = -1;
			}
			/*
			 * 出现了逻辑记录意识错误，以后我在进行修改的时候我要将我的中间文件进行后缀标识保存。
			 * 不然拜拜浪费几个小时。发现一个问题，我每次在修改后的注释后的函数，我莫名有种强烈
			 * 要删除掉的意识，为什么要删掉这个注释逻辑呢？动机是源码不好看，不好看可以移出到
			 * 文件末尾呀，然后注释标注格式化，让注释好看呀，这个删除的操作意识有问题。涉嫌
			 * 毁灭证据的思维。这几年特别写核心源码的时候，想删除的动机意识特别强烈。这是我的 
			 * 一个严重的错误习惯，以后要改正。
			 */
			// System.out.println("loop-->" + total);
		}
		if (-1 != value) {
			total += value;
		}
		return total;
	}
	/*
	 * 
	 * */
	public  IMV_SIQ_SS _IMV_SIQ_SS_Q = new IMV_SIQ_SS();
	public  String commandWithoutNumerics = "";
	public  String chineseSimpleCommandWithoutNumerics = "";
	/*
	 * 保证相等长度替换，symbolSwapNumerics只能包含一个位的char符号。
	 * */
	public  String symbolSwapNumerics = "*";
	public void initArabicNumber() {
		/*
		 * 开始填写这几天的逻辑。
		 * */
		/*1 取变量，拿出所有混合数字，标注position，剔除掉原句中的这些变量。这里会遇到一个问题
		    就是 commandClass 的command 要分解出一个 commandWithoutNumerics，用于分词。
		    那么剔除掉的地方需要一个标识，不然序次会打乱，于是用symbolSwap 替换代入到函数中，
		    我先设计个*看看效果，以后跟进测试。 
		    
		    studyVerbaMap 六个元 可以注册到 commandClass
		    
		    --2022年后靠近电磁音频传感器产生的奇怪意识，
		    --罗瑶光
		*/
		regNE.app_S.studyVerbaMap.extractNumberfromString(this);
		regNE.app_S.studyVerbaMap.formatNumericMap(this);
		
		//2 取变量，拿出所有混合数字，标注position，剔除掉原句中的这些变量。
		//3
		//4
		System.out.println("chineseSimpleCommandWithoutNumerics-->" + this.chineseSimpleCommandWithoutNumerics);
		//
	}
	//400局部输出正确
	//chineseSimpleCommandWithoutNumerics-->在输出的数据表中仅展示从第*行到第*行的数据
	public void fussionOfArabicNumber() {
		// TODO Auto-generated method stub
		
	}

	public void initSixActions(App NE) {
		// TODO Auto-generated method stub
		this.regNE= NE;
	}
}
//输出
//567--0
//678--1
//123--2
//Royal--0
//tin--1
//yo--2
//luo--3
//yaoguang--4
//0--0
//30--1
//--------中文数字机-V00001---------
//输入-->一
//简体-->一
//total2-->1
//输入-->拾
//简体-->十
//total2-->10
//输入-->零拾
//简体-->零十
//total2-->0
//输入-->一拾贰
//简体-->一十二
//total2-->12
//输入-->拾陆
//简体-->十六
//total2-->16
//输入-->零拾三
//简体-->零十三
//total2-->3
//输入-->捌拾玖
//简体-->八十九
//total2-->89
//输入-->零佰
//简体-->零百
//total2-->0
//输入-->壹百
//简体-->一百
//total2-->100
//输入-->两佰二十
//简体-->二百二十
//total2-->220
//输入-->两佰零二
//简体-->二百零二
//total2-->202
//输入-->两佰贰十二
//简体-->二百二十二
//total2-->222
//输入-->两千两佰贰十二
//简体-->二千二百二十二
//total2-->2222
//输入-->两千两佰零二
//简体-->二千二百零二
//total2-->2202
//输入-->两千零二
//简体-->二千零二
//total2-->2002
//输入-->两千零二十
//简体-->二千零二十
//total2-->2020
//输入-->两千零二十二
//简体-->二千零二十二
//total2-->2022
//输入-->两千零二十二万
//简体-->二千零二十二万
//total2-->2022
//total4-->20220000
//输入-->两千零二十二万零二
//简体-->二千零二十二万零二
//total2-->2022
//total3-->20220002
//输入-->两千零二十二万两千零二十二
//简体-->二千零二十二万二千零二十二
//total2-->2022
//total3-->20222022
//输入-->玖千玖百九拾九万九千九佰九十玖
//简体-->九千九百九十九万九千九百九十九
//total2-->9999
//total3-->99999999
//输入-->零万
//简体-->零万
//total2-->0
//total4-->00000
//输入-->万二十
//简体-->万二十
//total1-->1
//total3-->10020
//输入-->二万二佰零二
//简体-->二万二百零二
//total2-->2
//total3-->20202
//输入-->十万
//简体-->十万
//total2-->10
//total4-->100000
//十万万
//-学好语文，这叫十亿-先不处理歧义句
//-先不处理超亿句，我框架都写好了，直接split 加函数即可。
//输入-->十二万
//简体-->十二万
//total2-->12
//total4-->120000
//输入-->万
//简体-->万
//total5-->10000
//输入-->亿
//简体-->亿
//total8-->100000000
//输入-->十亿
//简体-->十亿
//total2-->10
//亿1-->十亿
//total6-->1000000000
//输入-->万亿
//简体-->万亿
//total5-->10000
//亿1-->万亿
//total6-->1000000000000
//输入-->九千万亿
//简体-->九千万亿
//total2-->9000
//total4-->90000000
//亿1-->九千万亿
//total6-->9000000000000000
//输入-->九千万亿零九
//简体-->九千万亿零九
//total2-->9000
//total4-->90000000
//total2-->9
//total7-->9000000000000009
//输入-->九千万亿零九十
//简体-->九千万亿零九十
//total2-->9000
//total4-->90000000
//total2-->90
//total7-->9000000000000090
//输入-->九千零九十万零九十亿零九十
//简体-->九千零九十万零九十亿零九十
//total2-->9090
//total3-->90900090
//total2-->90
//total7-->9090009000000090
//输入-->九千零九十万零九百零九亿零九十万零九百零九
//简体-->九千零九十万零九百零九亿零九十万零九百零九
//total2-->9090
//total3-->90900909
//total2-->90
//total3-->900909
//total7-->9090090900900909
//输入-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//简体-->八千八百八十八万八千八百八十八亿八千八百八十八万八千八百八十八
//total2-->8888
//total3-->88888888
//total2-->8888
//total3-->88888888
//total7-->8888888888888888
///*
//* 
//* */
//number = "两万";
//commandClass.fasterChineseNumberSwap(number);
///*
//* 两万是一个万单位乘以2，set的逻辑是value*10000，所以是20000，这是的十万，十是10，
//* 万是10000，十万组合是10乘以10000，而我的逻辑中total的逻辑是+10000，所以缺少了算子。
//* 
//*/

//core
//	public IMV_SIQ cartesianWorkActionsRights = new IMV_SIQ();//
//	public IMV_SIQ cartesianWorkActionsPositions = new IMV_SIQ();//
//	public IMV_SIQ cartesianWorkActions_pos = new IMV_SIQ();//
	// 关系大幅减少。
	// public IMV_SIQ cartesianRootMap = new IMV_SIQ();
	// public IMV_SIQ cartesianRootWithScaleMap = new IMV_SIQ();
	// public IMV_SIQ cartesianRootRelationMap = new IMV_SIQ();
	// public IMV_SIQ normalizationalWorkActionsRights = new
	// IMV_SIQ();
	// public IMV_SIQ normalizationalWorkActionsPositions = new
	// IMV_SIQ();
	// public IMV_SIQ complementedWorkActionsRights = new
	// IMV_SIQ();
	// public IMV_SIQ complementedWorkActionsPositions = new
	// IMV_SIQ();
