package OSI.OSU.addAction;

import ME.VPC.M.app.App;
import OSI.OSU.crab.CrabInterface;
import O_V.OSA.shell.XA_ShellTable;
import O_V.OSA.shell.XA_ShellTables;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
//稍后封装成一个统一的傻瓜接口。
public class UpdateColorAttributesOfColumnsInMemoryClass implements CrabInterface {
	String callFunctionKey;
	String className = "UpdateColorAttributesOfColumnsInMemoryClass";
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
	public void chromosomes(App NE) {
		NE.app_S.staticRootMap.initMap(NE);
		callFunctionKey = "callFunctionKey";
		// 20230207 走统计新陈代谢
		NE.app_S.staticRootMap.staticBloomingTimes.put(callFunctionKey, (long) 0);
		NE.app_S.staticRootMap.staticBloomingTime.put(callFunctionKey,
				System.currentTimeMillis());// 增加记忆时间。20241013
		NE.app_S.staticRootMap.staticClass_XE_Map.put(callFunctionKey, "S_AOPM");
		NE.app_S.staticRootMap.chromosomeNode.put(callFunctionKey,
				new UpdateColorAttributesOfColumnsInMemoryClass());// 20241001准备把这行移出去。
		NE.app_S.staticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKey,
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
	public void bloomings(App NE) {
		NE.app_S.staticRootMap.chromosomeBlooming.put(callFunctionKey, this.getClass());
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	/*
	 * 因为之后的map会进行精度打分来确定是否要走这个函数，所以下面这种不断细化添加判断条件的这种
	 * 逻辑片段会全部剔除。也因为下面这类片段的条件精确度非常高，以后下面这种逻辑只会出现在特殊情 
	 * 况下。 以后 + -的精确词性搭配语法不会出现 -N 和 N- 类型，这种思维可以将错误锁定在词汇的
	 * 词性的校准逻辑层面，保持算法的BPM结构模块相对稳定性。 --罗瑶光
	 */
	/*
	 * 颜色有很多种，如何标记函数缩进，我个人觉得有必要分为主要颜色和描述颜色，主要颜色是红橙蓝绿青
	 * 靛紫等100种常见可描述的，描述颜色则是rgb格式了，因为这种划分和人的思维和学习方式类似。于是
	 * 先设计个红色开始，再扩充分类，再扩充聚类即可。以后完善了再思考关于学习颜色的认知方式。
	 * 
	 * 思考，目前我的action逻辑是tinshell操作，tinshell的对象主要是表格，我的引擎是德塔PLSQL
	 * 优化成PLORM到PLSEARCH过来的，里面的计算法则主要是针对表的属性，如果输入的数据杂乱，
	 * 那么首先应该预处理成格式化的表格，一些不能swap成表格的数据怎么办？那么在这个logic中就应该
	 * 直接计算输出。那么这里又是一个抽象哲学的文字描述点。感觉计算哲学不是这么简单的东西。因为抽象
	 * 变成具体，只是一种观测方式，这个维度可以肆意变化，结果同样一直在变化。不能强加给某种指令结果。
	 * 于是我想到了结果参照，我个人认为输出结果可以多样化，只要是成功的，都要保留，这些结果同样要构成
	 * 计算关系，这种关系中间产物在计算逻辑上用途很多。tinmap的output就应该是个object list而不
	 * 是唯一的某类值。 
	 * 
	 * 思考，在这种逻辑指令构造中，语言相当于指令的描述方式，用于有效地获取指令，而指令相当于一种
	 * 基础计算逻辑，语言关系是离散的，指令关系是唯一的。避免无休止的增加指令，之后指令集也需要
	 * 不断地优化，缩进，逻辑方式是长变短，多变少，繁变简。然后去重。索引。我否定下元基索引不是趋势，
	 * 但是我真的否定不了索引指令是趋势。那就为指令索引任务做好铺垫先。很多用户窥探了我7年，模仿我
	 * 的思维方式思考问题，总是让我情绪尴尬，我在思考这是外因，内因是我要增加我的娱乐时间，简短我的
	 * 编码时间。虽然人不能老闲着，难道一直忙就是健康的生活方式？
	 * 
	 * --罗瑶光
	 * 
	 * 搞科研，有能力的一定要绑定团队，这样在实验室里环境安全稳定。对我这种比较次的人物，就算了
	 * 
	 * 
	 * */
	public boolean logic(IMV_SIQ inputValues, String[] 传参因子, int 因子, App NE, IMV_SIQ outputReg) {
//		if (NE.app_S.workVerbalMap.cartesianWorkActionsRights.containsKey("-红色")) {
//			//为-红色
//			System.out.printf("highly fit"); // later in mapping iterator.*/
//		}
		S_logger.Log.logger.info("Hello Word!");
		if (NE.app_S.workVerbalMap.command_V.cartesianLooped
				.contains(className)) {
			//System.out.println("400-size-01-"
			//		+ NE.app_S.workVerbalMap.command_V.countReject++);
			return false;
		}
		//System.out.println("400-size-02-"
		//		+ NE.app_S.workVerbalMap.command_V.cartesianLooped.size());

		// 获取表
		S_logger.Log.logger.info("400---00001---");
		if (!NE._I_U.outputMap.containsKey("获取表名")) {
			return false;
		}
		S_logger.Log.logger.info("400---00002---");
		// later will loop join table;
		String huoqubiaoming = NE._I_U.outputMap.getString("获取表名").replace("临时","");
		if (XA_ShellTables.searchShellTables.containsKey(huoqubiaoming)) {
			S_logger.Log.logger.info("400---00003---");
			/*
			 * 思考，如果数据库中有这个表，而表名却是个缩写，那么这里的if之后有必要更改为
			 * loop。containsKey改为marchKey
			 * */
			XA_ShellTable _XA_ShellTable = XA_ShellTables.searchShellTables
					.get(huoqubiaoming);
			Object[] columns = _XA_ShellTable.huaRuiJiJtableCulumns;
			S_logger.Log.logger.info("400---00004---");
			//操作:中药名称|颜色标记为|红色;
			String shellType = "操作:";
			//这里我的PLSQL指令集不够精确和细腻，如何细腻化指令集不在这里描述，之后统一归纳。
			for (int i = 0; i < columns.length; i++) {
				if (NE._I_U.commandAcknowledge
						.contains(columns[i].toString())) {
					shellType += columns[i].toString();
					shellType += "|";
				}
			}
			S_logger.Log.logger.info("400---00005---");
			shellType += "颜色标记为|";
			Iterator<String> iterators= NE.app_S.workVerbalMap.command_V
					.cartesianWorkActionsRightsSV.keySet().iterator();
			boolean find = false;
			S_logger.Log.logger.info("400---00006---");
			while(iterators.hasNext()&&!find) {
				String string = iterators.next();
				/*
				 * 注意否定句型的不 非 等字，那么红色将是错误的用法，应该增加校准类指令集辅助。
				 * 于是开始思考，这是一种指令集分解逻辑，这个逻辑的关系和硬件的与 或 非相似。
				 * 说明指令集的构造在某种观测上可以理解为离散关系，在这种关系的维度里，指令集可以
				 * 进行迪摩根定律变化，这种变化依赖的关系为DNN 关系，DNN提供计算精度，离散提供
				 * 计算方法，笛卡尔提供计算对象，为之后的TVM计算关系优化铺好了道路。
				 * 
				 * 跟进思考，当替换成做一个操作将列名为中药名称的子集 --不能-- 用红色来标记为输出的颜色;
				 *  得到关系
				 *  不能+颜色-6
				 *	不能-颜色-6
				 *  不能-标记-4
				 *  不能-红色-2
				 *  那么这个2 ，4 和 6的精确度能迫使指令集不添加红色。如//negative 关系测试
				 *  
				 * --罗瑶光
				 * 。
				 * later -trif
				 * */
				if(string.contains("+红色")) {
					shellType += "红色";
					S_logger.Log.logger.info("---find---");
					find = true;
				}
			}
			//negative 关系测试
			iterators= NE.app_S.workVerbalMap.command_V
					.cartesianWorkActionsRightsSV.keySet().iterator();
			while(iterators.hasNext()) {
				String string = iterators.next();
				//System.out.println("400-10000004" + string);
				/*
				 * 注意否定句型的不 非 等字，那么红色将是错误的用法，应该增加校准类指令集辅助。
				 * 于是开始思考，这是一种指令集分解逻辑，这个逻辑的关系和硬件的与 或 非相似。
				 * 说明指令集的构造在某种观测上可以理解为离散关系，在这种关系的维度里，指令集可以
				 * 进行迪摩根定律变化，这种变化依赖的关系为DNN 关系，DNN提供计算精度，离散提供
				 * 计算方法，笛卡尔提供计算对象，为之后的TVM计算关系优化铺好了道路。
				 * 
				 * 跟进思考，当替换成做一个操作将列名为中药名称的子集 --不能-- 用红色来标记为输出的颜色;
				 * 输出也正确，之后可以不断地修正和完善离散类指令集。
				 *  得到关系
				 *  不能+颜色-6
				 *	不能-颜色-6
				 *  不能-标记-4
				 *  不能-红色-2
				 *  那么这个2 ，4 和 6的精确度能迫使指令集不添加红色。如//negative 关系测试
				 *  因为400-10000001 处已经精度 12 筛选了条件，那么这里可以适当的根据去求做筛选操作。
				 *  
				 * --罗瑶光
				 * 。
				 * later -trif
				 * */
				if(string.contains("红色")){
					//System.out.println("400-10000005" + string);
					if(string.contains("不")) {
						return false;
					}
				}
			}
			iterators= NE.app_S.workVerbalMap.command_V
					.cartesianWorkActionsRightsVO.keySet().iterator();
			while(iterators.hasNext()) {
				String string = iterators.next();
				//System.out.println("400-10000004" + string);
				if(string.contains("红色")){
					//System.out.println("400-10000005" + string);
					if(string.contains("不")) {
						return false;
					}
				}
			}
			S_logger.Log.logger.info("400---00007---");
			S_logger.Log.logger.info(shellType);
			String[] strings = shellType.split(":");
			List<String[]> list = new ArrayList();
			list.add(strings);
			S_logger.Log.logger.info("400---00008---");
			NE._I_U.outputMap.put("操作", list);// 集成到老的接口模式先，避免bug*/
			NE._I_U.outputMap.put("type", "进行选择");
			S_logger.Log.logger.info("400---00009---");
		}
		//避免一个指令句含有多次触发。
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