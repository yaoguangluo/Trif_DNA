package test.java.InterfaceTest.initon.util;

import U_A.PEU.P.table.TableSorterZYNK;
import V_A.SQ.ReadPinYinBihua;
import test.java.InterfaceTest.CommonTestInition;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 这个函数用于测试工程所有文件打印出文件所在的包名，函数名和文件夹名，方便之后古拉丁文 十六元基
 * 索引首先我是十六元基编码个人著作权人，作者，是我罗瑶光创造了这个学术体系，从无到有，作为创造者，
 * 我有义务将它细化美观。拼音词库表中 161行 x->x 去掉，不然会导致ascii检索比较问题 影响排
 * 序输出。 -罗瑶光
 * 
 * 存储包名有很多种方式，我的工程里面已经有了map形式的索引，那就继续用map来put这些package名。
 * 思考出现了一个问题，网上的描述是JDK的文件进行官方文档描述，如一个类显示他的method。method
 * 里面包含的field，然后描述它，而我要做的是NE的class 包含的fields显示它的method包名。
 * 这里出现了巨大的问题，难道几十年没有一个同行看到这个问题？用C我直接改注册表。java因为成了.o文件
 * 我能怎么办？我又改怎么办？这把2进制文件估计一把人一直发财。
 * 
 * 于是我进行梳理，通过NE获取method 和 field两种属性，然后method是否被field关联，那我就得
 * 需要做很多步骤了。首先field是变量名属性，变量名对应的函数是类名，不是包名。method是类名，
 * 如何将类变量名对应类名，说明很多公司已经注意到了java的反射已经出现的智能化问题了。其实高斯林
 * 只要将这个反射field函数写成double list 模型进行pre->，不就解决了吗，底层.o文件不改，上层
 * 这么复杂弥补对策。
 * 
 * --跟进思考，反射field函数写成double list 模型进行pre->，隐患是，-trif later
 * 
 * 于是更进思考，通过输出结果可以看出method输出的是jdk原生类名，不是定义类名，根本就没用，说明
 * java.lang.reflect.Method 和 java.awt.Event这种method结果对field即使变量名一致也没有
 * 有价值的交集。
 * 
 * 于是跟进思考如何解决这个问题。 1 在NE创造变量的时候就put map，这就对了嘛。这个计划我可以立即
 * 执行 2 在NE创造函数的时候就put map，这就对了嘛。这个计划我也可以立即执行 3 。。later trif
 * 那就准备干干 1. 目前我用的是app_S.studyVerbaMap.putObject这种方式进行索引，这里有个问题，
 * 这种方式不是全局化索引，全局索引其实也可以，只是NE的变量都是没有赋值的参数，都是null，这种问题
 * 也好解决。解决办法是我当缓存来写即可，map有就取值，没有就添加，我要做的是将时间过滤属性改为
 * 频率过滤属性即可。 
 * 
 * 跟进思考，那这种逻辑进行map不就是元基花组件嘛，callFunctionKey 和 annotationMap，看来我的
 * 早年路径是正确的，我现在要做是扩展这个，包含所有 NE的field的 annotation 即可
 * 元基花我已经申请了个人著作权。庆幸下，又省了 2200 RMB = 110只蒜香小烧鸡。
 * 
 * 跟进思考， annotation索引花的是 method，对于field索引来说，索引的是类和变量，一个是逻辑关系
 * 一个是计算关系。仅仅做缓存使用即可，之前我说否定论做精度匹配，看样子已经创造了完整的条件了。
 * StudyVerbaMap 的 _SMV 之后会大有用途。
 * 
 * 
 * --罗瑶光 十六元基索引 教父--
 * 
 * 
 * */
public class FindAllPackageFiles {
	@SuppressWarnings({ "unused" })
	public static void main(String[] argv)
			throws NoSuchFieldException, InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		// 初始化
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		// 初始化载体
		ReadPinYinBihua.getPinYinBihuaMap(commonTestInition.NE);
		TableSorterZYNK tableSorterZYNK = new TableSorterZYNK(
				commonTestInition.NE);
		// ToDo
		/*
		 * 元基花 2代 变量补充扩展，将NE的 value所有 fields 全部in annotationMap
		 * 然后分类索引。 --罗瑶光
		 * 
		 */

		commonTestInition.NE.app_S.studyVerbaMap.init_SMV(commonTestInition.NE);
		// 关闭
		commonTestInition.endEnvironment();
	}
}