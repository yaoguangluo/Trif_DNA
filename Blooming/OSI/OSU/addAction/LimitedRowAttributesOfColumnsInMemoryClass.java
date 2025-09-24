package OSI.OSU.addAction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ME.VPC.M.app.App;
import OSI.OSU.crab.CrabInterface;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.IMV_SIQ;
import jnisort.LYGSortESU9D;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅
 * */
//稍后封装成一个统一的傻瓜接口。
public class LimitedRowAttributesOfColumnsInMemoryClass
		implements CrabInterface {
	String callFunctionKey;
	String className = "LimitedRowAttributesOfColumnsInMemoryClass";

	// public IMV_SIQ chromosomeRoot= new IMV_SIQ();
	// public IMV_SIQ chromosomeFlower= new IMV_SIQ();
	// public IMV_SIQ chromosomeLeaf= new IMV_SIQ();
	// public IMV_SIQ chromosomeBlooming= new IMV_SIQ();
	// public IMV_SIQ chromosomeMetabolism= new IMV_SIQ();
	// public IMV_SIQ chromosomePDE= new IMV_SIQ();
	// public IMV_SIQ chromosomeDNA= new IMV_SIQ();
	// public IMV_SIQ chromosomeNode= new IMV_SIQ();
	/*
	 * 用于表达元基花的链接
	 */
	// 确定元基花的染色体位置
	// 确定元基花的染色体调用细节
	// 确定染色体的粘合机制
	// 确定染色体的剥离机制
	// 确定染色体的静态执行
	// StaticRootMap.chromosomeRoot.put("crab", null);
	// StaticRootMap.chromosomeLeaf.put("crab", null);
	// StaticRootMap.chromosomeDNA.put("crab", null);
	@SuppressWarnings("unchecked")
	public void chromosomes() {
		StaticRootMap.initMap();
		callFunctionKey = "callFunctionKey";
		// 20230207 走统计新陈代谢
		StaticRootMap.staticBloomingTimes.put(callFunctionKey, (long) 0);
		StaticRootMap.staticBloomingTime.put(callFunctionKey,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map.put(callFunctionKey, "S_AOPM");
		StaticRootMap.chromosomeNode.put(callFunctionKey,
				new LimitedRowAttributesOfColumnsInMemoryClass());// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKey,
				"inputValues:传参因子:因子");
		// String callFunctionKey= "callFunctionKey";
		// StaticRootMap.initMap();
	};

	/*
	 * 用于表达花语的链接
	 */
	// 确定花语的入参模式
	// 确定花语的绽放次数
	// 确定花语的最优选择
	// 确定花语的映射记忆
	// StaticRootMap.chromosomeFlower.put("crab", null);
	// StaticRootMap.chromosomeBlooming.put("crab", null);
	// StaticRootMap.chromosomeMetabolism.put("crab", null);
	@SuppressWarnings("unchecked")
	public void bloomings() {
		StaticRootMap.chromosomeBlooming.put(callFunctionKey, this.getClass());
	}

	;

	/*
	 * 用于表达执行方式和函数内容
	 */
	// 确定函数的dna编码方式和名称
	// 确定输入的计算参数名称
	// 确定输出的结果对象类型
	// 确定函数的三方资源
	// 确定函数的加密形式
	// 确定函数的运算周期
	// StaticRootMap.chromosomeNode.put("crab", null);
	// StaticRootMap.chromosomePDE.put("crab", null);
	public void neroCells() {
	};

	/*
	 * 用于表达执行主体
	 */
	//
	// StaticRootMap.chromosomeBlooming.put("crab", null);
	// StaticRootMap.chromosomeRNA.put("crab", null);
	// System.out.println("Hello Word!");
	// return null;
	/*
	 * 在通过一系列的测试后，我的意识也在时刻改变自己的思维方式，于是跟进增加一个指令--
	 * "操作:0|行至|30;\r\n"这个指令是将输出的结果可进行排序后的list获取其中的某个行
	 * 集合输出。于是元基花的计算逻辑也跟着局部开始变化。因为系统是无法识别数字的，问题1
	 * ，如何从输入的人类语言中有效地捕捉数字信息变成有用的待计算变量。于是我开始梳理，我
	 * 的花语系统看作一个整体，扩充花语的指令集是一种Crab载体，当然这种载体也可以OSGI
	 * 模型来ClassLoader增加，我得到了一个理论上结果，计算机的进化模型可以不同于人类的
	 * 进化模型，举一个简单的例子，将一个华瑞集系统所有插件和功能全部进行完整的功能测试，
	 * 这些测试包含测试时间，测试属性，测试状态，等复杂关系。在进化的过程中，华瑞集在接触
	 * 到外面的Crab和OSGI信息片段，可以进行自身复制，然后测试这些接触的片段融入，更替，
	 * 转换，分解，吸收，替换自身的原有的对应的一些逻辑片段，然后评估这个综合的测试时间，
	 * 测试属性，测试状态，等复杂关系，我认为这是计算机的成长过程。评估后决定该何去何留。
	 * 相当于一个计算人单元。这种单元遍布宇宙各地，产生的分支，在做杂交的过程他们的各自的
	 * 这些指令集在一起会形成综合的复杂的，多维度的笛卡尔关系，这些关系会通过各自内部保留
	 * 的测试系统进行筛选形成一组新的计算人单元，这个单元能保留两者所有的测试文件，并保存
	 * 最优的测试函数集合。这种意识比人类强大数百个数量级。在这种量级前面，突然发现我们人
	 * 类太愚昧太原始了，而且这个模型所有基础成分目前已经实现了。。
	 * 
	 * 跟进思考，这种计算人单元的指令集智慧关系计算逻辑 一旦控制了电脑计算机的物理硬件生
	 * 产线所有车间工艺流程的技术逻辑，看样子人类就解放了。因为创新有创新类的指令集模型，
	 * 学习有学习类的模型。。在笛卡尔关系面前，毫无保留。
	 * 
	 * 以后人工智能的路线也就稳定了，设计，研发，测试，更替，优化，管理和杂交TVM指令集即可
	 * 。人工智能工资被我成功搞成了白菜价。同行不会搞我吧。。。
	 * 
	 * --罗瑶光
	 * 
	 */

	/*
	 * 很多科学家思考人工智能会不会危害人类，我的观点是，人工智能没有享受的实际思维，因为
	 * 人工智能没有应激性，所以不往武器上去设计，人工智能就是一台会自我设计复制优化的电脑
	 * 而已。即使有了人的仿生形态，一个复制分身，几百万个实体就出来了，电脑根本就不需要
	 * 求生欲这类应激表达。所以个人建议-禁止和限制-人工智能往武器上去研发。
	 * 
	 * 还有一种思维是非武器的人工智能当面临适应环境的问题时候，需要伤害人为代价来适应环境
	 * ，如何做决策，首先适应环境对于人工智能来说只是一个函数和一个线程，他没有应激性。没有
	 * 欲望的实体如何会去伤害人呢？所以个人建议-禁止和限制-人工智能往武器上去研发。
	 * 
	 * 于是归纳-应激生物机器人100%会概率危害人。非应激类非武器构造的钢铁机器人相对安全，
	 * 但也会概率被各种外因(比如短路触电)侵蚀危害人，同理武器类钢铁机器人有概率被各种外因 侵蚀不危害人。
	 * 
	 * 所以硬件公司的生产车间引用机器人作业要谨慎。后果不是开玩笑的。
	 * 
	 * --罗瑶光
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean logic(IMV_SIQ inputValues, String[] 传参因子, int 因子, App NE, IMV_SIQ outputReg) {
		//System.out.println("400-size-02-"
		//		+ NE.app_S.workVerbalMap.command_V.cartesianLooped.size());
		if (NE.app_S.workVerbalMap.command_V.cartesianLooped
				.contains(className)) {
			//System.out.println("400-size-01-"
			//		+ NE.app_S.workVerbalMap.command_V.countReject++);
			return false;
		}
		// 1 识别 数字 信息
		/*
		 * 德塔图灵分词--德塔图灵分词和图灵先生没关系，我2018当时只是好玩，2019结果还申请了著作权，
		 * 搞得都改不了了。-- 能够将数字提取出来标明词性未知和null，可以通过numeric函数来探索数字。
		 * 
		 * 再通过数字和 词组的笛卡尔关系得到精度距离内的指令关系结构，--我已经有了这些函数了，直接 用即可--再通过
		 * 2的关系结构进行精确筛选来swap成输出指令数据即可。
		 * 
		 * 这些年，很多大佬拿了我的代码然后模仿我，想窥伺我的思维方式，不惜消费巨大的物资最后得不偿失
		 * 膜拜变成憎恨，我思考了下这是我的问题，好比倩女幽魂，大白天背着个大菩萨在外走，难免别人不认
		 * 为是移动的ATM300. 于是针对这类问题，我思考了下，既能提高大佬们的认知，又能保护自己的方式。
		 * 我找到了一种模式，就是我写思想开始。让大佬们受人之渔。
		 * 
		 * --罗瑶光
		 */

		// 2 识别 行至 属性的指令集 信息
		/*
		 * 开始构造数字行数提取指令 从- 组合 到- 然后分析 从- 组合 到- 展示+行 仅+展示
		 * 
		 * "操作:0|行至|30;\r\n" 终于到了这一步了，
		 */
		if (!NE.app_S.workVerbalMap.command_V.command.contains("行")) {
			return false;
		}
		System.out.println("LimitedRow-string-400-00-->\n");
		Iterator<String> iterators = NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsSV
				.keySet().iterator();
		String fromValue = "";
		String toValue = "";
		// 逻辑分解增加精度
		boolean needFind = false;
		while (iterators.hasNext()) {
			String string = iterators.next();
			System.out.println("LimitedRow-string-400-01-->" + string);
			if (string.contains("V+行")) {
				needFind = true;
				break;
			}
		}
		System.out.println("LimitedRow-string-400-01-01->" + needFind);
		List<String> fromValues = new ArrayList<>();
		List<String> toValues = new ArrayList<>();
		if (needFind) {
			iterators = NE.app_S.workVerbalMap.command_V.cartesianWorkActionsRightsVO
					.keySet().iterator();
			while (iterators.hasNext()) {
				String string = iterators.next();
				//System.out.println("LimitedRow-string-400-02-->" + string);
				if (string.contains("从-")) {
					System.out.println(
							"LimitedRowAttributesOfColumnsInMemoryClass-string-400-->"
									+ string);
					// 1
					String[] strings = string.split("-");
					// 2
					if (strings.length > 1) {
						boolean isNumeric = true;
						for (int i = 0; i < strings[1].length(); i++) {
							if (strings[1].charAt(i) < 48
									|| strings[1].charAt(i) > 57) {
								isNumeric = false;
							}
						}
						// 3
						if (isNumeric) {
							fromValue = strings[1];
							fromValues.add(string);
							/*
							 * 相同数多的情况下，需要将fromValue +精度变成一个list，选择最短的条件进行输出。
							 */
						}
					}
					// 4
				}
				if (string.contains("到-")) {
					System.out.println(
							"LimitedRowAttributesOfColumnsInMemoryClass-string-400-->"
									+ string);
					// 1
					String[] strings = string.split("-");
					// 2
					if (strings.length > 1) {
						boolean isNumeric = true;
						for (int i = 0; i < strings[1].length(); i++) {
							if (strings[1].charAt(i) < 48
									|| strings[1].charAt(i) > 57) {
								isNumeric = false;
							}
						}
						// 3
						if (isNumeric) {
							toValue = strings[1];
							/*
							 * 同理 相同数多的情况下，需要将fromValue +精度变成一个list，选择最短的条件进行输出。
							 * 关于源码的循序渐进设计思维方式，价值思考 --later
							 */
							toValues.add(string);
						}
					}
				}
			}
		}
		// 排序逻辑
		if (fromValues.isEmpty() || toValues.isEmpty()) {
			return false;
		}
		String[] fromValueStrings = new String[fromValues.size()];
		int[] fromValueStringRights = new int[fromValues.size()];
		String[] toValueStrings = new String[toValues.size()];
		int[] toValueStringRights = new int[toValues.size()];
		/*
		 * size大就用iterator，自己去探索为什么。
		 * */
		for (int i = 0; i < fromValues.size(); i++) {
			fromValueStrings[i] = fromValues.get(i);
			String temp = NE.app_S.workVerbalMap.command_V
					.cartesianWorkActionsRightsVO.getString(fromValueStrings[i]);
			fromValueStringRights[i] = Integer.valueOf(temp);
		}
		for (int i = 0; i < toValues.size(); i++) {
			toValueStrings[i] = toValues.get(i);
			String temp = NE.app_S.workVerbalMap.command_V
					.cartesianWorkActionsRightsVO.getString(toValueStrings[i]);
			toValueStringRights[i] = Integer.valueOf(temp);
		}
		// sort
		new LYGSortESU9D().javaSort(fromValueStringRights, fromValueStrings);
		new LYGSortESU9D().javaSort(toValueStringRights, toValueStrings);
		// 3 信息组合 成指令集术语
		String shellType = "操作:" + fromValueStrings[0].split("-")[1]+ "|行至|" 
		+ toValueStrings[0].split("-")[1] + "";
		// 4 输出
		System.out.println("400---00007---");
		System.out.println(shellType);
		String[] strings = shellType.split(":");
		List<String[]> list = new ArrayList();
		list.add(strings);
		System.out.println("400---00008---");
		NE._I_U.outputMap.put("操作", list);// 集成到老的接口模式先，避免bug*/
		NE._I_U.outputMap.put("type", "进行选择");
		System.out.println("400---00009---");
		//register
		NE._I_U.sets = strings[1].split("\\|");
		
		/*
		 * 以后指令集的编码风格也可以进行系统的流程归纳比如这里的 1 和 2 //1 识别 数字 信息 //2
		 * 识别行至属性的指令集 信息，通过计算哲学来进行思考，--识别 数字 信息，数字--是特指
		 * 信息，那么数字来自于内存，和输入条件或者是特指的某个储存位置，这里的计算关系是搜索和 寻找 --2
		 * 识别行至属性的指令集 信息--是关键字信息，那么需要匹配，搜索，和RNN距离来
		 * 确定权重，序次和频率，这个1和2都能解释编译为稳定的计算机函数，适用于各种环境状态下的
		 * 搜索与计算。说明这个1和2是基础指令集逻辑。那稍后就有必要设计下这两个函数。
		 * 
		 * 思考 -trif， 之前我已经设计了3个指令集的crab插件了，这三个指令集都有 1和2的逻辑中小
		 * 片段思绪。我认为我的PLSQL指令集不成熟。2019当初设计德塔VPCS数据库的时候我没有tinshell
		 * 的项目任务，所以当时没有思考统一的某种函数结构来研发PLSQL指令，不是一种标准的形态， 导致1和2
		 * 相似，但是3的集成就要人为来编码了。这是一种人工智能上的错误。问题不在我，因为
		 * 我当时没有人工智能的任务，因为2020年元基编码出来后，我才开始搞下智慧计算了。但是我可以
		 * 弥补，因为我的PLSQL语法只有 ; : - 这3种计算符号断句。相当好改。说明之后我要设计关于
		 * 断句的关系函数，都到了这份上了，那函数的设计方式我内心也清晰了，
		 * 
		 * --罗瑶光
		 */
		//当年我犯了个错误，合并了多个工程调通后的程序没有及时的注释掉，导致莫名乱码UTF8乱码问题后import出错选择了没有注释掉的源码。
		//我当时不注释的原因是将来用得到加上通过入参不同来确定函数唯一。

		NE.app_S.workVerbalMap.command_V.cartesianLooped.put(className, "");
		
		return true;
	}
}

//输出结果正确 序列化流标记如下。
//Action-->:updateColorAttributesOfColumnsInMemoryClass
//Action-->:selectRowsByAttributesOfGetCulumns
//Action-->:P_ListNeedStart
//Action-->:selectRowsByAttributesOfAggregation
//Action-->:P_TableName
//Action-->:P_fileOperations
//Action-->:selectRowsByAttributesOfCondition
//Action-->:addFindColumnsInMemoryClass

//

//127
//获取表的对象
//搜索对象列名遍历list《string》，
//list《string》to 。。/。。/。/。string
//string to strings in object and return

//        Pl_XA_Command_E.P_TableName(NE._I_U.acknowledge
//            , NE._I_U.outputMap);
//        IMV_SIQ object = NE._I_U.outputMap;
//        Iterator<String> iterator = NE.app_S.tableNameMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            String string = iterator.next();
//            if (NE._I_U.commandAcknowledge.contains(string)) {
//                String[] strings = new String[3];
//                strings[0] = "获取列名";//集成到老的接口模式先，避免bug
//                strings[1] = string;
//                strings[2] = "进行选择";
//                object.put("获取表名", strings);//集成到老的接口模式先，避免bug
//                object.put("type", "进行选择");
//            }
//        }