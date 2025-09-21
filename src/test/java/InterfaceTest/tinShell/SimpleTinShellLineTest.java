package test.java.InterfaceTest.tinShell;

import java.io.IOException;

import ME.VPC.M.app.App_X;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class SimpleTinShellLineTest {
	/*
	 * 随着编码的复杂度越来越高，测试的内容也越来越丰富，变量和关系的耦合度也越来越高。
	 * 于是tinshell的测试逻辑也应该需要细化。节省观测操作的时间。 在修改大量文件后发现
	 *  随机 测试"在输出的数据表中仅展示从第陆行到第" + "九" + "行的数据;" 时候发现
	 *  计算逻辑出了问题，是SV 和 VO中含有错误关系，于是设计这个 函数来加速观测完善
	 *  这个TVM extension 指令句。
	 *  
	 *  价值论证， 快速观测立马发现了笛卡尔关系相同数需要归纳，按精度归纳。于是fix
	 * 
	 * 另外我的电脑拼音输入法 竟然就没有这个 -关闭词汇提示靠前的功能- 的选项，真够坑爹
	 * ，稍微一打快点文字，就会出错。。想起初中语法错误。神操作。
	 */
	public static void main(String[] argv)
			throws InterruptedException, IOException {
		ShellJPanelSeparationTest shellJPanelSeparationTest = new ShellJPanelSeparationTest();
		SimpleTinShellLineTest simpleTinShellLineTest = new SimpleTinShellLineTest();
		simpleTinShellLineTest.testTinshell(shellJPanelSeparationTest);
	}

	public void testTinshell(
			ShellJPanelSeparationTest shellJPanelSeparationTest)
			throws IOException, InterruptedException {
		// test without mock api
		System.out.println("test without mock api -- tinshell 批处理测试 执行复杂"
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
		String XLSTableName = shellJPanelTest.initSourceXLSEnvironment(NE,
				filePathXLSX);
	
		String tinshell = (""
				// +"在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n"
				+ "在输出的数据表中仅展示从第陆行到第"
				// + "3拾"
				+ "九" + "行的数据;");
		TinMap tinMap = shellJPanelSeparationTest.execTest(tinshell, NE, null);
		// 输出见末尾 第二段
		// 关闭
		NE.stop();
	}
}

/*
 * 输出正确
 * 400---00007---
操作:6|行至|9
400---00008---
400---00009---
 * */
