package S_A.SixActionMap;

import OSI.OSU.addAction.AddActionInterfaceClass;
import OSI.OSU.addAction.AddFindColumnsInMemoryClass;
import OSI.OSU.addAction.AddParserMixedStringClass;
import OSI.OSU.addAction.AddParserMixedStringToListClass;
import OSI.OSU.addAction.LimitedRowAttributesOfColumnsInMemoryClass;
import OSI.OSU.addAction.UpdateColorAttributesOfColumnsInMemoryClass;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.IMV_SIQ;

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
@SuppressWarnings("unchecked")
public class CreativeVerbaMap {
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

	static void regAddFindColumnsInMemoryClass() {
		// VI+列 later
		FlowerAction.FlowerSixDomainActions.put("展示+列",
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
		FlowerAction.FlowerSixDomainActions.put("标记+颜色",
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

	static void regLimitedRowAttributesOfColumnsInMemoryClass() {
		/*
		 * 开始构造数字行数提取指令 从- 组合 到- 然后分析 从- 组合 到- 展示+行 仅+展示
		 */
		FlowerAction.FlowerSixDomainActions.put("仅+展示",
				"limitedRowAttributesOfColumnsInMemoryClass");
		// 注册花函数
		LimitedRowAttributesOfColumnsInMemoryClass limitedRowAttributesOfColumnsInMemoryClass 
		= new LimitedRowAttributesOfColumnsInMemoryClass();
		String callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass 
		= "limitedRowAttributesOfColumnsInMemoryClass";
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
				"S_AOPM");
		StaticRootMap.chromosomeNode.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				limitedRowAttributesOfColumnsInMemoryClass);// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				"inputValues:传参因子:因子");
		// booming
		StaticRootMap.chromosomeBlooming.put(
				callFunctionKeyLimitedRowAttributesOfColumnsInMemoryClass,
				limitedRowAttributesOfColumnsInMemoryClass);
	}

}