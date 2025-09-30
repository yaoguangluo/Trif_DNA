package test.java.InterfaceTest.initon.util;

import U_A.PEU.P.table.TableSorterZYNK;
import V_A.SQ.ReadPinYinBihua;
import test.java.InterfaceTest.CommonTestInition;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
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
 * 这里出现了巨大的问题，难道几十年没有一个同行看到这个问题？用C我直接改注册表。java因为底层封装
 * 成了.o文件我能怎么办？我又该怎么办？
 * 
 * 于是我进行梳理，通过NE获取method 和 field两种属性，然后method是否被field关联，那我就得
 * 需要做很多步骤了。首先field是变量名属性，变量名对应的函数是类名，不是包名。method是类名，
 * 如何将类变量名对应类名，说明很多公司已经注意到了java的反射已经出现的智能化问题了。其实高斯林
 * 只要将这个反射field函数写成double list 模型进行pre->，不就解决了吗，底层.o文件不改，上层
 * 这么复杂弥补对策。
 * 
 * --跟进思考，反射field函数写成double list 模型进行pre->，隐患又有哪些，-trif later
 * 
 * 于是更进思考，分析了下输出结果，通过输出结果可以看出method输出的是jdk原生类名，不是定义类名，
 * 根本就没用，说明java.lang.reflect.Method 和 java.awt.Event这种method结果对field即使
 * 变量名一致也没有有价值的交集。
 * 
 * 于是跟进思考如何解决这个问题。 1 在NE创造变量的时候就put map，这就对了嘛。这个计划我可以立即
 * 执行 2 在NE创造函数的时候就put map，这就对了嘛。这个计划我也可以立即执行 3 。。later trif
 * 那就准备干干 1. 目前我用的是app_S.studyVerbalMap.putObject这种方式进行索引，这里有个问题，
 * 这种方式不是全局化索引，全局索引其实也可以，只是NE的变量都是没有赋值的参数，都是null，这种问题
 * 也好解决。解决办法是我当缓存来写即可，map有就取值，没有就添加，我要做的是将时间过滤属性改为
 * 频率过滤属性即可。 
 * 
 * 跟进思考，那这种逻辑进行map不就是元基花组件嘛，callFunctionKey 和 annotationMap，看来我的
 * 早年路径是正确的，我现在要做是扩展这个map，包含所有 NE的field的 annotation 即可
 * 元基花我已经申请了个人著作权。庆幸下，又省了 2200 RMB = 110只蒜香小烧鸡。
 * 
 * 跟进思考， annotation索引花的是 method，对于field索引来说，索引的是类和变量，一个是逻辑关系
 * 一个是计算关系。仅仅做缓存使用即可，之前我说否定论做精度匹配，看样子已经创造了完整的条件了。
 * StudyVerbalMap 的 _SMV 之后会大有用途。
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
		 * 很多人不知道 变量补充扩展的价值，于是我准备举一个具体的实例来描述下，这个描述也是我
		 * 下一步要做的流程， 比如 tinshell 例子中的--操作:中药名称|颜色标记为|红色;--
		 * 这一句变量，进行分解，可以对比下 --首先获取一个表，名字是" + XLSTableName
		 * + "，如果有这个表，准备下一步选择-- 这句人类语言，或者是--在输出的数据表中仅展示列名
		 * 为中药名称，打分和功效列这三个即可-- 这句人类语言。 同理，--操作:中药名称|颜色标记
		 * 为|红色;-- 也可以分解为几种模型 1 将语言进行DNN词汇归纳，然后笛卡尔完整关系，关系
		 * 匹配已经有的函数，然后loop函数集精确匹配调用。tinshell这种模型我认为应该是早期的
		 * 初阶的计算逻辑和计算关系，因为它需要源源不断地扩充指令，在丰富的指令集缺乏下，会造成
		 * 意识缺陷。之前不是提过否定论嘛，我就再否定一次，缺乏指令集也能做正确计算，如何做，我
		 * 想到了几点，首先是关系细化，和关系分层，--操作:中药名称|颜色标记为|红色;--可以分解为
		 * 对象与观测的关系，观测与属性的关系。属性修改的关系。这三种关系在各种逻辑计算中都普遍
		 * 存在，那就是价值，这种价值能够驱动我的执行力，所以下一步我应该编码关于这类普遍存在的
		 * 关系集合。
		 * 
		 * 很多人不知道我翻译了两句执行混合tinshell 花语成功输出了，当年就不做指令集翻译了。我的
		 * 回答是这样的逻辑编码，我太累了。本来娱乐的时间就少，这样搞，当然也是条正确的路，之后可以
		 * 归纳缩进优化函数集，但是累，我得尝试用计算哲学思想来描述和对待这个问题。
		 * 
		 * 变量补充扩展那么就可以首先定义和应用在动词的规范化环境中。让关系描述更精准。因为动词
		 * 比较少。方便一个粗糙简单的开始。这是一种不累的方法。
		 * 
		 * 我想到了优化关系的思维，--对象与观测的关系，观测与属性的关系。属性修改的关系--优化为
		 * --对象与自身属性的关系，属性修改的逻辑，加入了计算逻辑思维，--语义就缩进了许多。
		 * --通过动词确定内存中的输入对象， 通过关系确定对象的属性，通过动词确定操作的输出内容。--
		 * 通过语义更近思维通过--标记确定对象探索，颜色确定属性探索，操作确定染色体逻辑层。--
		 * 这就是我下一步要设计的花语计算哲学分层意识。
		 * 
		 * 另外我要学会写文章，减少编码的含量，增加文字的人类描述和思考内容，让源码增加哲学意义。
		 * 这是计算增维方式。吸取宇宙的能量。让initInitonDelegate更加丰富的动词索引标注。
		 * 
		 * 作为DNA十六元基之父 -Tinshell 个人著作权人， 元基索引花 个人著作权人- 作者-教父-始祖-
		 * 名头太响亮可以增加自信心和绝对专注力。当然不要太过自信，爆了就不好了。任何问题都是外因，
		 * 内因是我有责任和义务完美元基花语。 --罗瑶光
		 */

		commonTestInition.NE.app_S.studyVerbalMap.init_SMV(
			commonTestInition.NE);
		// 关闭
		commonTestInition.endEnvironment();
	}
}