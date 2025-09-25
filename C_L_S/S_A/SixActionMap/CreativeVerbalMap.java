package S_A.SixActionMap;

import OSI.OSU.addAction.AddActionInterfaceClass;
import OSI.OSU.addAction.AddFindColumnsInMemoryClass;
import OSI.OSU.addAction.AddParserMixedStringClass;
import OSI.OSU.addAction.AddParserMixedStringToListClass;
import OSI.OSU.addAction.LimitedRowAttributesOfColumnsInMemoryClass;
import OSI.OSU.addAction.UpdateColorAttributesOfColumnsInMemoryClass;
import S_A.SEM.bloom.StaticFunctionMapO_VECS_C;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.IMV_SIQ;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
@SuppressWarnings("unchecked")
public class CreativeVerbalMap {
	public IMV_SIQ flowerActionMap = new IMV_SIQ();
	public static void initInitonActions() {
		regAddActionInterfaceClass();
		regAddParserMixedStringClass();
		regAddParserMixedStringToListClass();
		regAddFindColumnsInMemoryClass();
		regUpdateColorAttributesOfColumnsInMemoryClass();
		regLimitedRowAttributesOfColumnsInMemoryClass();
		/*
		 * 函数注册越来越多，以后可以OSGI插件化，也可以函数分层。
		 */

	}

	/*
	 * CN
	 * 关于元基花的函数注册方式我思考了很久，早期的24朵花瓣模拟染色体进行函数注册，后来干脆
	 * 把StaticRootMap 这类map拿出来直接进行单例化一个新类添加模块注册，让其越来越动态，
	 * 但是遇到了一个问题 StaticFunctionMapS_AOPM_C 这类成员还是不够灵活，我有必要之后
	 * 有时间会全部进行new 来去static。即使这些函数是非常稳定的类，new有一个好处是支持一个
	 * 平台系统上多个华瑞集API，同时 StaticFunctionMapS_AOPM_C这类函数可以进行object
	 * 态下稍微改造，因为继承关系，我有必要以后StaticFunctionMapS_AOPM_C 会变成
	 * StaticFunctionMap，S_AOPM_C 以后只是一个key，方便扩展归纳。这样做的价值是，元基花
	 * 能有效适应和抵抗程序员的编码风格。生存能力直接提高一个档次，像极了亚马逊的王莲，其实在
	 * 某种观测态下，编码规范这种思维也是可以优化进化的。
	 * 
	 * EN
	 * Mr.YaoguangLuo has been thinking about an optimization of coding-norms since
	 *  the method of initons-flower created at 2021. In early times, StaticRootMap
	 *   as a static attribute which was ranged in 24 chromosome-nodes in HRJ-YLJ 
	 *   system. He extracted it out from S-AOPM package and built a 
	 *   new singleton class to let the TVM-registrations became more simpler and 
	 *   faster. The name of class-file is CreativeVerbalMap. Continuing this method, 
	 *   while thus classes were 2's-developed by problem-consumers, how does to 
	 *   raise the survive ability itself? Finally Mr.YaoguangLuo determined out
	 *   that is necessary to change the key word of 'static' into 'new', ASAP. 
	 *  
	 * --罗瑶光/YaoguangLuo
	 * --稍后纠正语法。
	 * */
	static void regAddActionInterfaceClass() {
		// TODO Auto-generated method stub
		// 非OSGI模式注册花语言，其他见我著作权的CrabInterfaceClass。
		FlowerAction.FlowerSixDomainActions.put("I+表", "findTableInMemory");
		// 注册花函数
		AddActionInterfaceClass addActionInterfaceClass 
		= new AddActionInterfaceClass();
		String callFunctionKey = "findTableInMemory";
		// 20230207 走统计新陈代谢, 见CrabInterfaceClass
		// chromosomes
		StaticRootMap.staticBloomingTimes.put(callFunctionKey, (long) 0);
		StaticRootMap.staticBloomingTime.put(callFunctionKey,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map.put(callFunctionKey, "S_AOPM");
		StaticRootMap.chromosomeNode.put(callFunctionKey,
				addActionInterfaceClass);// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKey,
				"inputValues:传参因子:因子");
		// booming
		StaticRootMap.chromosomeBlooming.put(callFunctionKey,
				addActionInterfaceClass);
	}

	static void regAddParserMixedStringClass() {
		// 注册花函数
		AddParserMixedStringClass addParserMixedStringClass 
		= new AddParserMixedStringClass();
		String callFunctionKeyaddParserMixedStringClass = "parserMixedString";
		//
		FlowerAction.FlowerChromosomeActions.put(
				callFunctionKeyaddParserMixedStringClass,
				addParserMixedStringClass);
		// 20230207 走统计新陈代谢, 见CrabInterfaceClass
		// chromosomes
		StaticRootMap.staticBloomingTimes
				.put(callFunctionKeyaddParserMixedStringClass, (long) 0);
		StaticRootMap.staticBloomingTime.put(
				callFunctionKeyaddParserMixedStringClass,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map
				.put(callFunctionKeyaddParserMixedStringClass, "A_VECS");
		StaticRootMap.chromosomeNode.put(
				callFunctionKeyaddParserMixedStringClass,
				addParserMixedStringClass);// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(
				callFunctionKeyaddParserMixedStringClass,
				"inputValues:传参因子:因子");
		// booming
		StaticRootMap.chromosomeBlooming.put(
				callFunctionKeyaddParserMixedStringClass,
				addParserMixedStringClass);

	}

	static void regAddParserMixedStringToListClass() {
		// 注册花函数
		AddParserMixedStringToListClass addParserMixedStringToListClass 
		= new AddParserMixedStringToListClass();
		String callFunctionKeyAddParserMixedStringToListClass 
		= "parserMixedStringToList";
		//
		FlowerAction.FlowerChromosomeActions.put(
				callFunctionKeyAddParserMixedStringToListClass,
				addParserMixedStringToListClass);
		// 20230207 走统计新陈代谢, 见CrabInterfaceClass
		// chromosomes
		StaticRootMap.staticBloomingTimes
				.put(callFunctionKeyAddParserMixedStringToListClass, (long) 0);
		StaticRootMap.staticBloomingTime.put(
				callFunctionKeyAddParserMixedStringToListClass,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map
				.put(callFunctionKeyAddParserMixedStringToListClass, "A_VECS");
		StaticRootMap.chromosomeNode.put(
				callFunctionKeyAddParserMixedStringToListClass,
				addParserMixedStringToListClass);// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(
				callFunctionKeyAddParserMixedStringToListClass,
				"inputValues:传参因子:因子");
		// booming
		StaticRootMap.chromosomeBlooming.put(
				callFunctionKeyAddParserMixedStringToListClass,
				addParserMixedStringToListClass);
	}

	/*
	 * important key = '输出-内容'  '仅含-'  '+列', those three keys could increase to a 
	 * combination key ,and '+列' is a fit rights key, and '输出-内容' '仅含-' are complement
	 * keys.
	 * let's ..
	 * */
	static void regAddFindColumnsInMemoryClass() {
		// VI+列 later
		FlowerAction.FlowerSixDomainActions.put("+列",
				"addFindColumnsInMemoryClass");
		// 注册花函数
		AddFindColumnsInMemoryClass addFindColumnsInMemoryClass 
		= new AddFindColumnsInMemoryClass();
		String callFunctionKeyAddFindColumnsInMemoryClass 
		= "addFindColumnsInMemoryClass";
		// 20230207 走统计新陈代谢, 见CrabInterfaceClass
		// chromosomes
		StaticRootMap.staticBloomingTimes
				.put(callFunctionKeyAddFindColumnsInMemoryClass, (long) 0);
		StaticRootMap.staticBloomingTime.put(
				callFunctionKeyAddFindColumnsInMemoryClass,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map
				.put(callFunctionKeyAddFindColumnsInMemoryClass, "S_AOPM");
		StaticRootMap.chromosomeNode.put(
				callFunctionKeyAddFindColumnsInMemoryClass,
				addFindColumnsInMemoryClass);// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(
				callFunctionKeyAddFindColumnsInMemoryClass,
				"inputValues:传参因子:因子");
		// booming
		StaticRootMap.chromosomeBlooming.put(
				callFunctionKeyAddFindColumnsInMemoryClass,
				addFindColumnsInMemoryClass);

	}

	static void regUpdateColorAttributesOfColumnsInMemoryClass() {
		// O+\\?+\\+颜色 等正则类指令 later 这是未来的趋势
		/*
		 * 在这种逻辑下，红色的计算关系是颜色属性分支，早年的map关于 红色->颜色 这类关系就
		 * 可以用上了人类语言-词汇组-关系组-关系归纳-归纳组匹配-匹配计算， 目前我就得到了
		 * 这类计算逻辑。既然得到了就开始用。
		 * 
		 * --罗瑶光
		 */
		// later 指令集多了，O+颜色 就统一索引 -trif
		/*
		 * 用上元基索引TVM指令后，一定要注意函数调用已经更加离散化，所以一定要控制好过滤 筛选和精度，避免计算浪费。
		 * --罗瑶光
		 * */
		FlowerAction.FlowerSixDomainActions.put("E+颜色",
				"updateColorAttributesOfColumnsInMemoryClass");
		// 注册花函数
		UpdateColorAttributesOfColumnsInMemoryClass updateColorAttributesOfColumnsInMemoryClass 
		= new UpdateColorAttributesOfColumnsInMemoryClass();
		String callFunctionKeyUpdateColorAttributesOfColumnsInMemoryClass
		= "updateColorAttributesOfColumnsInMemoryClass";
		// 20230207 走统计新陈代谢, 见CrabInterfaceClass
		// chromosomes
		/*
		 * 之后走_SMV 这里的变量中入参将全部省略，避免内存占用浪费。之后可以设计个temp区间 
		 * 当作类脑存储容器专门用于计算失效的 和 临时的变量，关于这类格式
		 * -- trif binlog，map，DB，json
		 * 等。我会首先采用map 不累。。
		 */
		StaticRootMap.staticBloomingTimes.put(
				callFunctionKeyUpdateColorAttributesOfColumnsInMemoryClass,
				(long) 0);
		StaticRootMap.staticBloomingTime.put(
				callFunctionKeyUpdateColorAttributesOfColumnsInMemoryClass,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map.put(
				callFunctionKeyUpdateColorAttributesOfColumnsInMemoryClass,
				"S_AOPM");
		StaticRootMap.chromosomeNode.put(
				callFunctionKeyUpdateColorAttributesOfColumnsInMemoryClass,
				updateColorAttributesOfColumnsInMemoryClass);// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(
				callFunctionKeyUpdateColorAttributesOfColumnsInMemoryClass,
				"inputValues:传参因子:因子");
		// booming
		StaticRootMap.chromosomeBlooming.put(
				callFunctionKeyUpdateColorAttributesOfColumnsInMemoryClass,
				updateColorAttributesOfColumnsInMemoryClass);

	}

	
	/*
	 *思考 chromosomeNode 里面添加 key limitedRowAttributesOfColumnsInMemoryClass 
	 *目的是将crab 执行，TVM extension
	 *
	 *FlowerSixDomainActions 里面加 key P_AggregationLimitMap 防止没有识别 指令句
	 *走PLSearh老命令驱动花语。
	 *
	 *现在二和一出现了多个问题，首先是老工程合并出现了多个花语段，
	 *然后花肽合并出现了if else 逻辑问题。
	 *
	 *因为 if else的价值就是 新函数不走花语 所以花语就不用再管了，以后新的函数直接走肽语调用花函数即可
	 *
	 * */
	static void regLimitedRowAttributesOfColumnsInMemoryClass() {
		/*
		 * 开始构造数字行数提取指令 从- 组合 到- 然后分析 从- 组合 到- 展示+行 仅+展示
		 */
//		FlowerAction.FlowerSixDomainActions.put("仅+V",
//				"limitedRowAttributesOfColumnsInMemoryClass");
		FlowerAction.FlowerSixDomainActions.put("仅+V",
				"P_AggregationLimitMap");
		
		// 注册花函数
		LimitedRowAttributesOfColumnsInMemoryClass limitedRowAttributesOfColumnsInMemoryClass 
		= new LimitedRowAttributesOfColumnsInMemoryClass();
		String callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass 
		= "P_AggregationLimitMap";
		// 20230207 走统计新陈代谢, 见CrabInterfaceClass
		// chromosomes
		/*
		 * 之后走_SMV 这里的变量中入参将全部省略，避免内存占用浪费。之后可以设计个
		 * temp区间当作类脑存储容器专门用于计算失效的 和 临时的变量，关于这类格式
		 * -- trif binlog，map，DB，json
		 * 等。我会首先采用map 不累。。
		 */
		StaticRootMap.staticBloomingTimes.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				(long) 0);
		StaticRootMap.staticBloomingTime.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				"O_VECS");
		StaticRootMap.chromosomeNode.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				limitedRowAttributesOfColumnsInMemoryClass);// 20241001准备把这行移出去。
//		StaticFunctionMapS_AOPM_C.annotationMap.put(
//				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
//				"inputValues:传参因子:因子");
		
		StaticFunctionMapO_VECS_C.annotationMap.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				"inputValues:传参因子:因子");
		// booming
		StaticRootMap.chromosomeBlooming.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				limitedRowAttributesOfColumnsInMemoryClass);
	}

}