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

import S_A.SixActionMap.WorkVerbalMap;
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
 * 中寻找答案，所以年轻人一定要把数据库原理这门课学好。WorkVerbalMap在华瑞集中的逻辑
 * 决策是1:1的关系，而命令句和map的关系是 M:1 的关系。而里面的单句延伸是1:M的关系，
 * 延伸的属性和指令集是 M:N 关系。指令集的计算逻辑是sigma范式，指令集的推导笛卡尔关系。
 * 关于这六层关系要进行计算优化，自然要用到梯度微积分。所以年轻人高等数学和计算机统计
 * 要学好。将这6层关系化简后，形成的BPM和UML是不是要更近管理维护？所以离散数学也要学好。
 * 
 * --罗瑶光
 * 
 * */
public class CommandClassBackUp {
	// 工作机
	public WorkVerbalMap workVerbalMap;
	// 单句的命令
	public String command;
	// 单句的延伸
	public String commandAcknowledge;

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
	 * 稍后这些关于当前的命令句对应的workVerbalMap中需要clear的对象都走这个类，
	 * 免得以后修改或者增加条件，不谨慎漏了几个clear。我认为这是一种计算关系的优 化方式，属于聚类优化计算逻辑。
	 * 
	 * 随着条件越来越多，之后会统一组合优化这个map关系，然后剔除掉一些成员变量。 --trif later
	 * 
	 * --罗瑶光
	 * 
	 */
	public IMV_SIQ_SS _IMV_SIQ_SS = new IMV_SIQ_SS();
	public IMV_SIQ_S_ _IMV_SIQ_S_ = new IMV_SIQ_S_();
	// core
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
	public IMV_SIQ unknown_map = new IMV_SIQ();
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
	@SuppressWarnings("unused")
	public String fasterChineseNumberSwap1(String chineseNumber) {
		System.out.println(chineseNumber);
		// 输入分析，开始思考，中文有3套系统，非语义，简体，大写，所以非常混杂，
		// 有一点好，我们国家至少小数点后的数字不会用中文大写，省了一把函数。如3.一四壹五玖二六。
		/*
		 * 缩写--- 一零零零 1000 二零贰五 2025
		 * 
		 * 非缩写--- 单位---个 万 亿 兆 。。。。 / 一 壹 量级---拾 佰 千 组合--- 拾 一一 一十
		 * 一十一 壹拾一 佰一零零 一百 一佰一十 一佰一拾一 千一零零零 一千 一千一佰一十
		 */
		long liangCidanyuanCi = -1;
		long liangCiFix = -1;
		long connectCi = -1;
		long connectCiFix = -1;
		long total = 0;
		String totalParser = "";
		long fix = -1;
		for (int i = 0; i < chineseNumber.length(); i++) {
			long liangCi = -1;//
			long danyuanCi = -1;
			boolean danyuanCiOperations = false;
			if (chineseNumber.charAt(i) == '零') {
				liangCi = 0;
				liangCidanyuanCi = 0;
			}
			if (chineseNumber.charAt(i) == '一'
					|| chineseNumber.charAt(i) == '壹') {
				liangCi = 1;
				liangCidanyuanCi = 1;
			}
			if (chineseNumber.charAt(i) == '二' || chineseNumber.charAt(i) == '贰'
					|| chineseNumber.charAt(i) == '两') {
				liangCi = 2;
				liangCidanyuanCi = 2;
			}
			if (chineseNumber.charAt(i) == '三'
					|| chineseNumber.charAt(i) == '叁') {
				liangCi = 3;
				liangCidanyuanCi = 3;
			}
			if (chineseNumber.charAt(i) == '四'
					|| chineseNumber.charAt(i) == '肆') {
				liangCi = 4;
				liangCidanyuanCi = 4;
			}
			if (chineseNumber.charAt(i) == '五'
					|| chineseNumber.charAt(i) == '伍') {
				liangCi = 5;
				liangCidanyuanCi = 5;
			}
			if (chineseNumber.charAt(i) == '六'
					|| chineseNumber.charAt(i) == '陆') {
				liangCi = 6;
				liangCidanyuanCi = 6;
			}
			if (chineseNumber.charAt(i) == '七'
					|| chineseNumber.charAt(i) == '柒') {
				liangCi = 7;
				liangCidanyuanCi = 7;
			}
			if (chineseNumber.charAt(i) == '八'
					|| chineseNumber.charAt(i) == '捌') {
				liangCi = 8;
				liangCidanyuanCi = 8;
			}
			if (chineseNumber.charAt(i) == '九'
					|| chineseNumber.charAt(i) == '玖') {
				liangCi = 9;
				liangCidanyuanCi = 9;
			}
			//
			if (chineseNumber.charAt(i) == '拾'
					|| chineseNumber.charAt(i) == '十') {
				// 新手别按我的逻辑写，别出错，
				liangCidanyuanCi = 10;
				danyuanCi = 10;
				danyuanCiOperations = true;
			}
			if (chineseNumber.charAt(i) == '佰'
					|| chineseNumber.charAt(i) == '百') {
				liangCidanyuanCi = 100;
				danyuanCi = 100;
				danyuanCiOperations = true;
			}
			if (chineseNumber.charAt(i) == '仟'
					|| chineseNumber.charAt(i) == '千') {
				liangCidanyuanCi = 1000;
				danyuanCi = 1000;
				danyuanCiOperations = true;
			}
			if (chineseNumber.charAt(i) == '万') {// 我电脑没有繁体万字 sorry
				liangCidanyuanCi = 10000;
				danyuanCi = 10000;
				danyuanCiOperations = true;
			}
			if (chineseNumber.charAt(i) == '亿') {// 我电脑没有繁体万字 sorry
				liangCidanyuanCi = 100000000;
				danyuanCi = 100000000;
				danyuanCiOperations = true;
			}
//			if (chineseNumber.charAt(i) == '兆') {//我电脑没有繁体万字 sorry
//			}
//			if (chineseNumber.charAt(i) == '京') {//我电脑没有繁体万字 sorry
//			}
			long totalCurrent = 0;
			if (true == danyuanCiOperations) {
				/*
				 * 有单元词，说明当前区间量词为-1，量词戳是之前的区间量词， 例如九十 = 九乘十 = 90 =
				 * totalCurrent；
				 * 
				 */
				// if (-1 != liangCiFix && -1 != danyuanCi) {
				System.out.println(
						"danyuanCiOperations---->" + danyuanCiOperations);
				System.out.println("liangCi-------------->" + liangCi);
				System.out.println("liangCiFix----------->" + liangCiFix);
				System.out.println("danyuanCi------------>" + danyuanCi);
				System.out.println("totalCurrent--------->" + totalCurrent);
				System.out.println("total---------------->" + total);
				System.out.println("connectCi------------>" + connectCi);
				System.out.println("connectCiFix------------>" + connectCiFix);
				if (-1 == liangCiFix) {
					totalCurrent = 1 * danyuanCi;
				} else {
					totalCurrent = liangCiFix * danyuanCi;
				}
				System.out.println(
						"danyuanCiOperations---->" + danyuanCiOperations);
				System.out.println("liangCi-------------->" + liangCi);
				System.out.println("liangCiFix----------->" + liangCiFix);
				System.out.println("danyuanCi------------>" + danyuanCi);
				System.out.println("totalCurrent--------->" + totalCurrent);
				System.out.println("total---------------->" + total);
				System.out.println("connectCi------------>" + connectCi);
				System.out.println("connectCiFix------------>" + connectCiFix);
				// }
//					liangCidanyuanCi = 10;
//					danyuanCi = 10;
//					danyuanCiOperations = true;

			}
			// 计算逻辑分层。
			if (false == danyuanCiOperations) {
				System.out.println(
						"danyuanCiOperations---->" + danyuanCiOperations);
				System.out.println("liangCi-------------->" + liangCi);
				System.out.println("liangCiFix----------->" + liangCiFix);
				System.out.println("danyuanCi------------>" + danyuanCi);
				System.out.println("totalCurrent--------->" + totalCurrent);
				System.out.println("total---------------->" + total);
				System.out.println("connectCi------------>" + connectCi);
				System.out.println("connectCiFix------------>" + connectCiFix);
				/*
				 * connect词汇的逻辑是 前字和当前字都不是单元字，确定connectCi大于0即可
				 */
				if (-1 == connectCiFix) {
					connectCi = liangCi * liangCiFix;
				} else {
					connectCi = liangCi * connectCiFix;
				}
//				if (-1 != liangCiFix) {
//					if (0 == connectCi) {
//						connectCi = liangCiFix * liangCi;
//					} else {
//						connectCi = connectCi * liangCi;
//					}
//					totalCurrent += liangCi;
//				}
				totalCurrent += liangCi;
				// totalCurrent = liangCiFix;
				System.out.println(
						"danyuanCiOperations---->" + danyuanCiOperations);
				System.out.println("liangCi-------------->" + liangCi);
				System.out.println("liangCiFix----------->" + liangCiFix);
				System.out.println("danyuanCi------------>" + danyuanCi);
				System.out.println("totalCurrent--------->" + totalCurrent);
				System.out.println("total---------------->" + total);
				System.out.println("connectCi------------>" + connectCi);
				System.out.println("connectCiFix------------>" + connectCiFix);
			}
			total = total + totalCurrent;
			liangCiFix = liangCi;
			connectCiFix = connectCi;
		}
		System.out.println(total);
		return "";
	}

	public static void main(String[] argv) {
		CommandClassBackUp commandClass = new CommandClassBackUp();
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
		System.out.println("----------------------");
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
//		/*
//		 * 
//		 * */
//		number = "两万";
//		commandClass.fasterChineseNumberSwap(number);
//		/*
//		 * 两万是一个万单位乘以2，set的逻辑是value*10000，所以是20000，这是的十万，十是10，
//		 * 万是10000，十万组合是10乘以10000，而我的逻辑中total的逻辑是+10000，所以缺少了算子。
//		 * 
//		 * 
//		 * 
//		 */
		number = "十万";
		commandClass.fasterChineseNumberSwap(number);
		number = "十万万";
		System.out.println("十万万");
		System.out.println("-学好语文，这叫十亿-先不处理歧义句");
		System.out.println("-先不处理超亿句，我框架都写好了，直接split 加函数即可。");
		//commandClass.fasterChineseNumberSwap(number);
		number = "十二万";
		commandClass.fasterChineseNumberSwap(number);
	}

	@SuppressWarnings("unused")
	public String fasterChineseNumberSwap(String chineseNumber) {
		System.out.println("输入-->" + chineseNumber);
		/*
		 * 上面是计算哲学和计算关系和计算逻辑的分析方法，需要巨大的采样，不符合我的思维认知方式
		 * 于是按照罗瑶光的思绪分析，开始编码。首先我要进行数据预处理，将文字中所有繁体全部简化
		 */
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
		/*
		 * 简化后文字开始进行精确分析，首先拆分最大逻辑集合确定亿为最大计算量级， 因为单机的long最大只有亿。
		 * 然后处理京为最大处理量级。关于亿的逻辑意识组合 有 万亿，一万亿， 一万一千零二亿， 乘积是100 000 000
		 * 8个零。
		 */
		String outputYi = "";
		String[] stringsYi = stringSwap.split("亿");
		//System.out.println(stringsYi.length);
		if (stringsYi.length > 0) {
			for (String stringYi : stringsYi) {
				/*
				 * 简化后文字开始进行精确分析，然后拆分最大逻辑集合确定万为最大计算量级， 有 千万，一百万， 一千零二十万，
				 * 乘积是10 000 4个零。
				 */
				//System.out.println(stringYi);
				String[] stringsWan = stringYi.split("万");
				//System.out.println("stringsWan.length-->" + stringsWan.length);
				String outputWan = "";
				if (stringsWan.length > 0) {
					int i = 0;
					for (String stringWan : stringsWan) {
						i++;
						/*
						 * 逻辑分层后，这里只要处理一万以内的组合，大幅减少条件分析。
						 */
						//System.out.println("longWan-->" + stringWan);
						if (stringWan.isEmpty()) {
							outputWan += "" + 1;
							System.out.println("total-->" + outputWan);
							continue;
						}
						long longWan = processWan(stringWan);
						//System.out.println("longWan-->" + longWan);
						if (outputWan.isEmpty()) {
							outputWan += "" + longWan;
							System.out.println("total-->" + outputWan);
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
						System.out.println("total-->" + outputWan);
					}
					if (stringYi.contains("万") && stringsWan.length < 2) {
						outputWan += "0000";
						System.out.println("total-->" + outputWan);
					}
				} else {
					// wan
				}
			}
		} else {
			// yi
		}
		return "";
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
			 * 毁灭证据的思维。这几年特别写核心源码的时候，想删除的动机意识特别强烈。这是我的 一个严重的错误习惯，以后要改正。
			 */
			//System.out.println("loop-->" + total);
		}
		if (-1 != value) {
			total += value;
		}
		return total;
	}
}