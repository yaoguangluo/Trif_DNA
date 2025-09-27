package test.java.InterfaceTest.tinShell;

import java.io.IOException;

import ME.VPC.M.app.App_X;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */

public class SimpleTinShellLineTest {
	/*
	 * 随着编码的复杂度越来越高，测试的内容也越来越丰富，变量和关系的耦合度也越来越高。
	 * 于是tinshell的测试逻辑也应该需要细化。节省观测操作的时间。 在修改大量文件后发现 随机
	 * 测试"在输出的数据表中仅展示从第陆行到第" + "九" + "行的数据;" 时候发现 计算逻辑出了问题，是SV 和
	 * VO中含有错误关系，于是设计这个 函数来加速观测完善 这个TVM extension 指令句。
	 * 
	 * 价值论证， 快速观测立马发现了笛卡尔关系相同数需要归纳，按精度归纳。于是fix
	 * 另外我的电脑拼音输入法 竟然就没有这个 -关闭词汇提示靠前的功能- 的选项，真够坑爹
	 * ，稍微一打快点文字，就会出错。。想起初中语法错误。神操作。
	 */
	public static void main(String[] argv)
		throws InterruptedException, IOException {
		ShellJPanelSeparationTest shellJPanelSeparationTest = new ShellJPanelSeparationTest();
		SimpleTinShellLineTest simpleTinShellLineTest = new SimpleTinShellLineTest();
		simpleTinShellLineTest.testTinshell(
			shellJPanelSeparationTest);
	}

	@SuppressWarnings("unused")
	public void testTinshell(
		ShellJPanelSeparationTest shellJPanelSeparationTest)
		throws IOException, InterruptedException {
		// test without mock api
		System.out.println(
			"test without mock api -- tinshell 批处理测试 执行复杂"
				+ "条件搜索逻辑--我本地苹果mac上已经调通可运行。方便我之后的各类型测试");
		ShellJPanelTest shellJPanelTest = new ShellJPanelTest();
		// -1
		// 启动测试开始
		// 配置系统支持
		// 临时设置用，之后结构优化后进行去除。
		// 配置组件支持
		// 配置环境支持
		App_X NE = shellJPanelTest.initTinshellEnvironment();
		// -2
		String filePathXLSX = "/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/"
			+ "project/TinOS/DetaResources/books/xlsx/zybgPage.xlsx";
		String XLSTableName = shellJPanelTest
			.initSourceXLSEnvironment(NE, filePathXLSX);
		/*
		 * 稍后准备对"条件为:和:笔记原文|DNN搜索|功效|菜谱|4;\r\n"  进行TVM 执行前 语言指令句翻译。
		 * 这句的逻辑翻译处理笛卡尔关系是比较简单的，因为出现了 -DNN搜索- 这种明确的关键字标识，
		 * 
		 * 于是开始思考
		 * 1 -是否能创造 更加 简洁的2次开发 指令扩展。构造一个通用指令关系，然后加这个blooming类就直接OK的模式。
		 * 2 -关于1的理解是可以实现的，构建一个笛卡尔分析机，输入多个采样话语，得到综合关系的最优指令推荐。
		 * 3 -这个推荐需要符合某种逻辑条件集合，是一个综合打分的决策树的输出逻辑，
		 * 
		 * 稍后可以初步设计下这个函数。最近我游戏账号因为总是卡掉线，莫名进入了放逐之地，需要3把匹配半天不见人，
		 * 搞得我本来就无聊的一天 莫名又多了6个小时，咋办？ 做人不能老对着电脑写代码吧。
		 * 
		 * --罗瑶光
		 * */
		String tinshell = (""
			//// +"在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n"
			//+ "在输出的数据表中仅展示从第陆行到第"
			//// + "3拾"
			//+ "九" + "行的数据;"

			+ "首先获取一个表，名叫" + XLSTableName + "，如果有就下一步;\r\n"
			+ "条件为:和:笔记原文|DNN搜索|功效|菜谱|4;\r\n"
			+ "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n"
			+ "在输出的数据表中仅展示从第零行到第壹行的数据;");

		TinMap tinMap = shellJPanelSeparationTest.execTest(tinshell,
			NE, null);
		// 输出见末尾 第二段
		// 关闭
		NE.stop();
	}

}

/*
 * 输出正确 400---00007--- 操作:6|行至|9 400---00008---
 * 400---00009---
 */
/*
 * 
添加指令集 二次开发 一定要注意四层 注册校准机制 和 反射机制。
-1
line-->:[{rowValue={功效={culumnValue=肉煎饼充饥,补元气,生肉。., culumnName=功效}, 
中药名称={culumnValue=食物肉煎饼菜谱, culumnName=中药名称}, 
打分={culumnValue=320000, culumnName=打分}}}, 

-2
{rowValue={功效={culumnValue=烤全羊大补筋骨补元气。., culumnName=功效}, 
中药名称={culumnValue=烤全羊菜谱, culumnName=中药名称}, 
打分={culumnValue=320000, culumnName=打分}}}]


line-->:2
line-->:success
line-->:0
line-->:2
Action-->:selectRowsByAttributesOfGetCulumns
Action-->:P_AggregationLimitMap
Action-->:findTableInMemory
Action-->:P_ListNeedStart
Action-->:P_TableName
Action-->:selectRowsByAttributesOfCondition
*
*/
