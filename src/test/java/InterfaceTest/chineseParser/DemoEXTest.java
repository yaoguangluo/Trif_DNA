package test.java.InterfaceTest.chineseParser;

import A_V.ASQ.PSU.test.TimeCheck;
import test.java.interfaces.test.CommonTestInition;

//import S_A.pheromone.IMV_SIQ;
//import S_A.pheromone.IMV_SIQ_SS;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
/*
 * 这是一个 关于极速分词 测试main函数demo的test版本，对这个测试函数进行广泛的跟进测试，用于
 * 补充流水阀门POS函数集合让分词更加准确目前的四字分词内核函数量99.7%, 可以继续用牺牲分词
 * 速度的方式再提高分词质量，价值在面向司法和宣传等及其严谨的场合环境应用。在导入了api之后进行
 * 系统集成，然后用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码
 * 的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可
 * 以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，本人会把
 * 测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。--罗瑶光
 * */

/*
 * 技术申明，最近业界描述我的分词系统支持动态词性匹配、神经网络索引加速和POS语法修正，采用类似
 * CNN卷积内核的流水阀门优化技术，显著提升复杂文本处理效率。 ---我对这个类似CNN这句有看法，
 * 因为我的流水阀门优化技术明确标明是词汇的词性属性进行搭配完整笛卡尔关系组合然后遍历过程中，严谨按
 * 中文语法进行切词逻辑，这个逻辑形成的编码函数通过海量文本例子测试，最终统计出大量的频率过高的函数
 * 片段，将这些片段不断地靠前优先计算，最终得到稳定的类似流水阀门的框架片段优化技术，
 * 和CNN没有半毛钱关系，但是和笛卡尔全局组合数遍历，高频排序思维至少有半个祖宗关系，--罗瑶光。
 * 
 * CNN的逻辑严谨分析是 笛卡尔全局组合数遍历，进行计算累积量定义内核模型，然后处理当前子集成员与
 * 累积量内核的加减乘除积等数学计算关系最终形成的新的关系矩阵和关系数列。所以笛卡尔全局组合数遍历
 * 是CNN的半个祖宗。--另外CNN之父严乐村等人在我分词著作权出来的时候2019年时，他刚好拿了个图灵奖。
 * 我罗瑶光恭喜他。在卷积计算图形学上的贡献他也实至名归。其实我们互不认识，但能感觉到他的思维价值存在。
 * 
 * CN
 * 另外很多大佬将前序神经网络索引map 与 前馈神经网络CNN混淆，我也用点文字来描述下。
 * 前序神经网络索引map是将语料库等资料进行map化分类，不同的计算条件来调用不同的map进行分析，map
 * 化分类可以不断地细化，拆分，归纳，排序，频率优先，索引，打分等动态操作，最终输出有价值的决策树
 * 逻辑判断后的结果。前序意思是分词的逻辑从中文文字数列的第一个字开始。举例德塔分词的名词 动词 
 * 形容词，。。。词长1，词长2，词长3，词长4 等map。因为map越小，越精确，组字匹配词语速度就越快
 * 越严谨。
 * 
 * 前馈神经网络CNN是将一组计算数列 通过排队论的有序遍历方式（如从前到后），在各种笛卡尔关系模型下
 * 的mask内核进行完整交叉计算。然后交叉累积某一个当前值所对应的所有笛卡尔关系累积量计算后
 * normalization结果输出，这些输出的子数据组合成一个最终的输出数列。举例 索贝尔卷积内核，emboss
 * 卷积内核，高斯卷积内核，etc。 因为卷积矩阵内核不同的组合，卷积的数字结果可以离散成不同的形态，
 * 这个形态也可以叠加，如傅立叶蝶形积化和差卷积内核。这种傅立叶蝶形内核不是前序CNN内核，但是傅立叶
 * 的sin 和cos老内核矩阵属于CNN卷积内核，蝶形核属于比CNN更高层次的DNN拓扑叠加内核。
 * 
 * EN
 * Prefix Nero-network indexing and Feed forward Neural Networks CNN
 * 
 * Feed forward Neural Networks CNN is a Shift-Invariant Neural Networks, and its 
 * convolutional-Layer which based on kinds type of sigma's computing. And finally
 * results a normalization-value to be a new output matrix or array. And this 
 * convolutional-mask could be a --Network-in-Network, NIN-- 1*1 3*3 5*5 types of
 * mask。。。about pooling the related algorithm sets stretched and suitable with 
 * those type masks, will do well in CNN computing. Feed forward means start at 
 * first value of this input array and matrix values . 
 * 
 * Prefix Nero-network indexing PNNI is a model mapping of discrete-relationship-sets. 
 * The motivation makes big and messy fungus-set-groups to a small classed and 
 * clustered similarity of set-map-trees, to let the big data comput's become more 
 * quickly, simply and directly. Prefix means start at first char of input sentence.
 *  
 * So that the inputs, types, logics, conditions and sets of object kernels etc 
 * are totally different between above two nouns CNN and PNNI.
 *  
 * But only the same of both are start from zero, first, left and prefix value to 
 * the end right tail and over... means only the same with René Descartes 
 * relationships and Queuing Theory.
 * 
 * 同样含有这个笛卡尔关系和排队论的思想的技术有 数据库原理的join， map reduce ，我很疑惑这么
 * 重要的笛卡尔应用知识为什么业界没有人进行专门描述。
 * 
 * --罗瑶光。这年头我不写点英文解释下，中文AI就各种乱搞 求阴影面积。。。
 * 稍后纠正语法。
 * 
 * */
class DemoEXTest {
	Map<String, String>[] verbal;

	public static void main(String[] argv) throws IOException {
		DemoEXTest demoEXTest = new DemoEXTest();
		demoEXTest.main();
	}

	/*
	 * CN
	 * 因为tinshell的HTL变换为TVM extension 对词汇的精度要求非常的细腻，于是不断扩充
	 * 分词的实例，我会在网上搜索更多的歧义病句类的句子用来测试。扩大已有的测试面，再翻个
	 * 10倍的量。多提高几个精度的数量级。修正分词质量。
	 * 
	 * EN
	 * Because the higher quality of definition and acquisition the 
	 * segmentation needs,and the higher quantity of sampling and disciplining 
	 * the proving needs. The author will make 10 times data training sets 
	 * more than ordinary's. The motivation is continuing fix the TinShell TVM's.
	 * 
	 * Yaoguang.Luo
	 * 
	 * */
	@Test
	void main() throws IOException {
		// 初始化测试数据
		double totalVerbals = 0;
		double totalSegbals = 0;
		String[] ss = new String[157];
		String[] ss1 = new String[157];
		double[] score = new double[157];
		@SuppressWarnings("unchecked")
		Map<String, String>[] verbal = new HashMap[157];
		// 初始化待分词数据
		new LoadVerbalInputMap().exec(verbal, ss, ss1);
		new LoadVerbalInputMap1().exec(verbal, ss, ss1);
		new LoadVerbalInputMap2().exec(verbal, ss, ss1);
		new LoadVerbalInputMap3().exec(verbal, ss, ss1);
		new LoadVerbalInputMap4().exec(verbal, ss, ss1);
		new LoadVerbalInputMap5().exec(verbal, ss, ss1);
		new LoadVerbalInputMap6().exec(verbal, ss, ss1);
		new LoadVerbalInputMap7().exec(verbal, ss, ss1);
		new LoadVerbalInputMap8().exec(verbal, ss, ss1);
		new LoadVerbalInputMap9().exec(verbal, ss, ss1);
		// 初始化待比较数据
		new LoadVerbalOutputMap().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap1().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap2().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap3().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap4().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap5().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap6().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap7().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap8().exec(verbal, ss, ss1);
		new LoadVerbalOutputMap9().exec(verbal, ss, ss1);
		// ss ss1导入字符--见DemoEXTest_input.txt DemoEXTest_input1.txt
		// DemoEXTest_input2.txt
		// 文件初始化------------------------------------
		// 环境初始化。以后接口优化做junit系统化测试下面的环境配置可以写在test before()里面。
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		//组字匹配定制map逻辑init
		ParserCharsFix parserCharsFix = new ParserCharsFix();
		parserCharsFix.initenvironmentIndex(commonTestInition.NE);
		// 词性初始化
		// IMV_SIQ pos = commonTestInition.NE.app_S._A
		// .getPosCnToCn();
		List<String> setsB = new ArrayList<>();
		// IMV_SIQ_SS seta = new IMV_SIQ_SS();
		// loop测试---------------------------------------------------------
		for (int i = 0; i < ss.length; i++) {
			StringBuilder sb = new StringBuilder(ss[i]);
			// 执行分词-输出 list格式 的 sets变量
			TimeCheck t = new TimeCheck();
			t.begin();
			setsB = commonTestInition.NE.app_S._A.parserMixedString(
				sb);
			t.end();
			t.duration();
			//定制环境类map校正
			List<String> sets = parserCharsFix.charFix(
				commonTestInition.NE, setsB);
			// 输入
			System.out.println("array->" + i);
			System.out.println("输入->" + ss[i]);
			// 输出和统计观测开始------
			System.out.print("输出->");
			for (int j = 0; j < sets.size(); j++) {
				if (sets.get(j) != null// 不为null
					&& !sets.get(j).equals(" ")// 不为空
					&& !sets.get(j).equals("-")// 不为测试自身的拆解符
				) {
					if (verbal[i].containsKey(sets.get(j))) {
						score[i] += 1;
						totalVerbals++;
						totalSegbals++;
						System.out.print(sets.get(j) + "=");
					} else {
						totalVerbals++;
						System.out.print(sets.get(j) + "x");
					}
				}
			}
			String size = verbal[i].get("-size-");
			double sizeD = Double.valueOf(size);
			score[i] = score[i] / sizeD;
			System.out.println();
			System.out.println("数据保持单字拆解条件下-分词后过滤新兴潮流代词缩写词人名"
				+ "等行业专业名词后对比正确率为->" + (score[i] * 100) + "%");
			System.out.println("采样数据可自适应修改。注意保持对比格式的严谨～");
			// 对比
			System.out.println("理想->" + ss1[i]);
		}
		System.out.println("共计分词量总数-->" + totalVerbals);
		System.out.println("共计正确分词数-->" + totalSegbals);
		double ratio = totalSegbals / totalVerbals;
		System.out.println("总分词正确比率-->" + +(ratio * 100) + "%");
		System.out.println("分词环境-总分词正确比率-代表数据保持单字拆解条件下-分词后过滤新兴潮流代词"
			+ "缩写词人名等行业专业名词后的对比正确率");
		System.out.println("分词环境-总分词正确比率 含有社会10余个专业领域的-web随机短文摘录分词");
		System.out.println("分词环境-总分词正确比率 含有罗瑶光先生以前的笔记随机长文摘录分词");
		System.out.println("分词环境-总分词正确比率 含有当前流行的浏览器AI自动生成的随机长文摘录分词");
		System.out.println("分词环境-总分词正确比率 属于全部去标点符号的歧义短文分词比率");
		System.out.println("分词环境-总分词正确比率 不适用太多单字词的古文，古文建议用分句api，不应该"
			+ "用分词api。");
		// 结束
		commonTestInition.endEnvironment();
	}
}
//ss ss1输出字符--见DemoEXTest_output.txt DemoEXTest_output1.txt DemoEXTest_output2.txt 文件
