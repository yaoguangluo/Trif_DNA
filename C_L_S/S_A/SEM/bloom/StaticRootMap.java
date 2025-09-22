package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//用来索引24组花
//罗瑶光
//1 稍后细化 元基花接口
//2 稍后将接口统一用 function, class, 元基组 3层map
//3 function 统一走 interface接口。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class StaticRootMap {
	public static Map<String, StaticClassMap> staticRootMap;
	// flower annotationMap，在分层中，这里略
	// 元基枝 root
	public static IMV_SIQ staticClassMap = new IMV_SIQ();
	// 函数入参登记
	public static IMV_SIQ staticClass_XE_Map = new IMV_SIQ();
	// 20230207 走统计新陈代谢
	public static Map<String, Long> staticBloomingTimes = new IMV_SIQ();// 需要
																		// new
	public static Map<String, Long> staticBloomingTime = new IMV_SIQ();// 需要 new
																	   // 稍后分出去，先用来做只执行固定次数的函数统计
	public static Map<String, Long> staticBloomingDuration = new IMV_SIQ();// 需要
																		   // new
	public static Map<String, List<Long>> staticBloomingDurationList = new IMV_SIQ();
	// 函数的api包
	public static IMV_SIQ staticBloomingLeafs = new IMV_SIQ();
	// 20230221 重新命名
	public static IMV_SIQ chromosomeRoot = new IMV_SIQ();
	// 元基花的标识
	public static IMV_SIQ chromosomeFlower = new IMV_SIQ();
	// 函数的api需求
	public static IMV_SIQ chromosomeLeaf = new IMV_SIQ();
	// 运行标识
	public static IMV_SIQ chromosomeBlooming = new IMV_SIQ();
	// 时间组合标识
	public static IMV_SIQ chromosomeMetabolism = new IMV_SIQ();
	// 消费组合元基编码标识
	public static IMV_SIQ chromosomePDE = new IMV_SIQ();
	// DNA编码标识 用于花蕊和遗传
	public static IMV_SIQ chromosomeDNA = new IMV_SIQ();
	// rna计算标识 范围广泛
	public static IMV_SIQ chromosomeRNA = new IMV_SIQ();
	// etl节点标识 用于花蕊 花瓣 花粉
	public static IMV_SIQ chromosomeNode = new IMV_SIQ();

	public static void initMap() {
		if (null != staticRootMap) {
			return;
		}
		staticRootMap = new IMV_SIQ();
		StaticClassMap map_A_VECS = new StaticClassMap("A_VECS");
		StaticClassMap map_A_IDUQ = new StaticClassMap("A_IDUQ");
		StaticClassMap map_O_VECS = new StaticClassMap("O_VECS");
		StaticClassMap map_O_IDUQ = new StaticClassMap("O_IDUQ");
		StaticClassMap map_P_VECS = new StaticClassMap("P_VECS");
		StaticClassMap map_P_IDUQ = new StaticClassMap("P_IDUQ");
		StaticClassMap map_M_VECS = new StaticClassMap("M_VECS");
		StaticClassMap map_M_IDUQ = new StaticClassMap("M_IDUQ");
		StaticClassMap map_V_AOPM = new StaticClassMap("V_AOPM");
		StaticClassMap map_V_IDUQ = new StaticClassMap("V_IDUQ");
		StaticClassMap map_E_AOPM = new StaticClassMap("E_AOPM");
		StaticClassMap map_E_IDUQ = new StaticClassMap("E_IDUQ");
		StaticClassMap map_C_AOPM = new StaticClassMap("C_AOPM");
		StaticClassMap map_C_IDUQ = new StaticClassMap("C_IDUQ");
		StaticClassMap map_S_AOPM = new StaticClassMap("S_AOPM");
		StaticClassMap map_S_IDUQ = new StaticClassMap("S_IDUQ");
		StaticClassMap map_I_AOPM = new StaticClassMap("I_AOPM");
		StaticClassMap map_I_VECS = new StaticClassMap("I_VECS");
		StaticClassMap map_D_AOPM = new StaticClassMap("D_AOPM");
		StaticClassMap map_D_VECS = new StaticClassMap("D_VECS");
		StaticClassMap map_U_AOPM = new StaticClassMap("U_AOPM");
		StaticClassMap map_U_VECS = new StaticClassMap("U_VECS");
		StaticClassMap map_Q_AOPM = new StaticClassMap("Q_AOPM");
		StaticClassMap map_Q_VECS = new StaticClassMap("Q_VECS");
		//
		// A
		staticRootMap.put("A_VECS", map_A_VECS);
		staticRootMap.put("A_IDUQ", map_A_IDUQ);
		// O
		staticRootMap.put("O_VECS", map_O_VECS);
		staticRootMap.put("O_IDUQ", map_O_IDUQ);
		// P
		staticRootMap.put("P_VECS", map_P_VECS);
		staticRootMap.put("P_IDUQ", map_P_IDUQ);
		// M
		staticRootMap.put("M_VECS", map_M_VECS);
		staticRootMap.put("M_IDUQ", map_M_IDUQ);
		// V
		staticRootMap.put("V_AOPM", map_V_AOPM);
		staticRootMap.put("V_IDUQ", map_V_IDUQ);
		// E
		staticRootMap.put("E_AOPM", map_E_AOPM);
		staticRootMap.put("E_IDUQ", map_E_IDUQ);
		// C
		staticRootMap.put("C_AOPM", map_C_AOPM);
		staticRootMap.put("C_IDUQ", map_C_IDUQ);
		// S
		staticRootMap.put("S_AOPM", map_S_AOPM);
		staticRootMap.put("S_IDUQ", map_S_IDUQ);
		// I
		staticRootMap.put("I_VECS", map_I_VECS);
		staticRootMap.put("I_AOPM", map_I_AOPM);
		// D
		staticRootMap.put("D_VECS", map_D_VECS);
		staticRootMap.put("D_AOPM", map_D_AOPM);
		// U
		staticRootMap.put("U_VECS", map_U_VECS);
		staticRootMap.put("U_AOPM", map_U_AOPM);
		// Q
		staticRootMap.put("Q_VECS", map_Q_VECS);
		staticRootMap.put("Q_AOPM", map_Q_AOPM);
	}

	public static void tinShellV006(String[] shellCommands, IMV_SIQ shellOutput,
			App NE) throws InterruptedException, IOException {
		tinShellV005(shellCommands, shellOutput, NE);
		// +++++later
	}

	@SuppressWarnings("static-access")
	public static void tinShellV005(String[] shellCommands, IMV_SIQ shellOutput,
			App NE) throws InterruptedException, IOException {
		// 稍后准备把 下面main的测试代码 进行封装 调通 一句执行命令, 多句执行命令, 多句并发执行命令。
		// 然后并入tinshell。像shell replace命令那样。
		// 罗瑶光
		String[] strings = shellCommands;
		IMV_SIQ output = shellOutput;
		// 开始设计传参。
		StaticRootMap staticRootMap = new StaticRootMap();
		staticRootMap.initMap();
		for (String string : strings) {
			Iterator<String> iterator = StaticRootMap.staticRootMap.keySet()
					.iterator();
			while (iterator.hasNext()) {
				String callMapKey = iterator.next();
				// case 染色体接口
				if (string.contains(callMapKey)) {
					if (callMapKey.equalsIgnoreCase("U_VECS")) {
						doU_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("U_AOPM")) {
						doU_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);// 稍后分出去
					}
					if (callMapKey.equalsIgnoreCase("A_VECS")) {
						doA_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("A_IDUQ")) {
						doA_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("O_VECS")) {
						doO_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("O_IDUQ")) {
						doO_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("P_VECS")) {
						doP_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("P_IDUQ")) {
						doP_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("M_VECS")) {
						doM_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("M_IDUQ")) {
						doM_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("V_AOPM")) {
						doV_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("V_IDUQ")) {
						doV_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("E_AOPM")) {
						doE_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("E_IDUQ")) {
						doE_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("C_AOPM")) {
						doC_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("C_IDUQ")) {
						doC_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("S_AOPM")) {
						doS_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("S_IDUQ")) {
						doS_IDUQ_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("I_AOPM")) {
						doI_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("I_VECS")) {
						doI_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("D_AOPM")) {
						doD_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("D_VECS")) {
						doD_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("Q_AOPM")) {
						doQ_AOPM_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
					if (callMapKey.equalsIgnoreCase("Q_VECS")) {
						doQ_VECS_Case(StaticRootMap.staticRootMap, string,
								output, NE);
					}
				}
			}
//			//写法 3	
//			doU_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doU_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);//稍后分出去
//			doA_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doA_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doO_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doO_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doP_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doP_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doM_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doM_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doV_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doV_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doE_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doE_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doC_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doC_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doS_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doS_IDUQ_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doI_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doI_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doD_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doD_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doQ_AOPM_Case(StaticRootMap.staticRootMap, string, output, NE);
//			doQ_VECS_Case(StaticRootMap.staticRootMap, string, output, NE);
		}
	}

	public static void main(String[] argv)
			throws InterruptedException, IOException {
		App NE = new App();
		// 写法 1
		// StaticRootMap staticRootMap= new StaticRootMap();
		StaticRootMap.initMap();
		// StaticClassMap staticClassMap=
		// StaticRootMap.staticRootMap.get("U_VECS");
		// StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C
		// = (StaticFunctionMapU_VECS_E)
		// staticClassMap.staticClassMap.get("U_VECS");
		// staticFunctionMapU_VECS_C.main(null);
		// 写法 2
		String[] strings = new String[4];
		strings[0] = "执行 U_VECS 下 main 接口, 参数是null";
		// strings[1]= "执行 I_VECS 下 main 接口, 参数是null";
		strings[1] = "执行 U_VECS 下 main 接口, 参数是null";
		//
		IMV_SIQ output = new IMV_SIQ();
		String[] 传参因子 = new String[2];
		IMV_SIQ inputValue = new IMV_SIQ();

		double[] doubles = new double[5];
		doubles[0] = 2.2222262;
		doubles[1] = 3.2226222;
		doubles[2] = 6.2622222;
		doubles[3] = 4.6226222;
		doubles[4] = 1.2222226;
		double dou = 2.22;

		NE._I_U.inputsA = doubles;
		NE._I_U.doubleS = dou;
		传参因子[0] = "input";// 像神一样的tin god
		传参因子[1] = "scale";

		inputValue.put(传参因子[0], doubles);
		inputValue.put(传参因子[1], dou);
		output.put("传参因子", 传参因子);
		output.put("inputValues", inputValue);

		strings[2] = "执行 U_AOPM 下 median1d 接口, 参数是 传参因子";
		// strings[3]= "执行 U_AOPM 下 min_v 接口, 参数是 过程因子";
		strings[3] = "执行 U_AOPM 下 fengTong1 接口, 参数是 过程因子";

		// ...
		StaticRootMap.tinShellV005(strings, output, NE);
		// 写法 3
		System.out.println(11);
	}

	private static void doA_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_C = (StaticFunctionMapA_VECS_E) StaticRootMap.staticClassMap
				.get("A_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapA_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doA_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapA_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doP_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_C = (StaticFunctionMapP_VECS_E) StaticRootMap.staticClassMap
				.get("P_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapP_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doP_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapP_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doO_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C = (StaticFunctionMapO_IDUQ_E) StaticRootMap.staticClassMap
				.get("O_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapO_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doO_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapO_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doO_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE)
			throws InterruptedException, IOException {
		StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C = (StaticFunctionMapO_VECS_E) StaticRootMap.staticClassMap
				.get("O_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapO_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doO_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapO_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doA_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_C = (StaticFunctionMapA_IDUQ_E) StaticRootMap.staticClassMap
				.get("A_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapA_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doA_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapA_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doU_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C = (StaticFunctionMapU_VECS_E) StaticRootMap.staticClassMap
				.get("U_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapU_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doU_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapU_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doP_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_C = (StaticFunctionMapP_IDUQ_E) StaticRootMap.staticClassMap
				.get("P_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapP_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doP_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapP_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doM_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C = (StaticFunctionMapM_VECS_E) StaticRootMap.staticClassMap
				.get("M_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapM_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doM_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapM_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);// later fix..20241017
			}
		}
	}
//稍后全部走归纳计算模式。

	private static void doM_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C = (StaticFunctionMapM_IDUQ_E) StaticRootMap.staticClassMap
				.get("M_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapM_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doM_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapM_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doV_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_C = (StaticFunctionMapV_AOPM_E) StaticRootMap.staticClassMap
				.get("V_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapV_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doV_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapV_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doV_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_C = (StaticFunctionMapV_IDUQ_E) StaticRootMap.staticClassMap
				.get("V_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapV_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doV_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapV_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doE_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_C = (StaticFunctionMapE_AOPM_E) StaticRootMap.staticClassMap
				.get("E_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapE_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doE_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapE_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doE_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_C = (StaticFunctionMapE_IDUQ_E) StaticRootMap.staticClassMap
				.get("E_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapE_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doE_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapE_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static void doC_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE)
			throws InterruptedException, IOException {
		StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_C = (StaticFunctionMapC_AOPM_E) StaticRootMap.staticClassMap
				.get("C_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapC_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doC_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapC_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doC_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapC_IDUQ_E staticFunctionMapC_IDUQ_C = (StaticFunctionMapC_IDUQ_E) StaticRootMap.staticClassMap
				.get("C_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapC_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doC_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapC_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doS_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_C = (StaticFunctionMapS_AOPM_E) StaticRootMap.staticClassMap
				.get("S_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapS_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doS_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapS_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doS_IDUQ_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_C = (StaticFunctionMapS_IDUQ_E) StaticRootMap.staticClassMap
				.get("S_IDUQ");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapS_IDUQ_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doS_IDUQ_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapS_IDUQ_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doI_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_C = (StaticFunctionMapI_AOPM_E) StaticRootMap.staticClassMap
				.get("I_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapI_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doI_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapI_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doI_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C = (StaticFunctionMapI_VECS_E) StaticRootMap.staticClassMap
				.get("I_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapI_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doI_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapI_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doD_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapD_AOPM_E staticFunctionMapD_AOPM_C = (StaticFunctionMapD_AOPM_E) StaticRootMap.staticClassMap
				.get("D_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapD_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doD_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapD_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doD_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapD_VECS_E staticFunctionMapD_VECS_C = (StaticFunctionMapD_VECS_E) StaticRootMap.staticClassMap
				.get("D_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapD_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doD_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapD_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doQ_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapQ_AOPM_E staticFunctionMapQ_AOPM_C = (StaticFunctionMapQ_AOPM_E) StaticRootMap.staticClassMap
				.get("Q_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapQ_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doQ_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapQ_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doQ_VECS_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C = (StaticFunctionMapQ_VECS_E) StaticRootMap.staticClassMap
				.get("Q_VECS");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapQ_VECS_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doQ_VECS_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapQ_VECS_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}

	private static void doU_AOPM_Case(Map<String, StaticClassMap> staticRootMap,
			String string, IMV_SIQ output, App NE) {
		StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_C = (StaticFunctionMapU_AOPM_E) StaticRootMap.staticClassMap
				.get("U_AOPM");
		// case 函数名接口
		Iterator<String> callFunction = StaticFunctionMapU_AOPM_C.annotationMap
				.keySet().iterator();
		while (callFunction.hasNext()) {
			String callFunctionKey = callFunction.next();
			String[] strings = string.split(" ");// 精确冗余20230218 罗瑶光
												 // 稍后涉及成exception打分 模式匹配
			if (strings[3].equalsIgnoreCase(callFunctionKey)) {
				StaticFunctionMap.doU_AOPM_CaseFunction(
						new CallFunctionKey(callFunctionKey), string,
						staticFunctionMapU_AOPM_C, output, NE);
				StaticRootMap.staticBloomingTimes.put(callFunctionKey,
						StaticRootMap.staticBloomingTimes.get(callFunctionKey)
								+ 1);
			}
		}
	}
}
