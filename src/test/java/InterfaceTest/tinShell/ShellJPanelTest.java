package test.java.InterfaceTest.tinShell;

import ME.VPC.M.app.App;
import ME.VPC.M.app.App_X;
import ME.VPC.V.config.ShellJPanel;
import M_V.MPI.xls.commonXLS.MakeContainerXLS;
import M_V.MVQ.button.DetaButton;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import O_V.OSM.shell.E_pl_XA_E;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import exception.thread.DetaThread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.accessibility.AccessibleContext;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.InputVerifier;
import javax.swing.JCheckBox;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.LayoutManager;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.dnd.DropTarget;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferStrategy;
import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeSupport;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * 第3层，(2层父母住)
 * */
// mock api 和test me api 注释：Generated with love by TestMe :)
// Please report issues and submit feature
// requests at: http://weirddev.com/forum#!/testme

/*
 * -十六元基索引的应用方式
 * 当Tinshell的框架开始逐渐细化稳定，目前出现了7个肽TVM指令集和3000个花语TVM 指令集，
 * 于是有机会开始用 肽TVM指令集进行元基缩写索引化来增加指令识别灵活度。于是稍后开始这个
 * 逻辑编码。为什么用肽TVM的crab来测试，因为函数少，方便修改。误差少，方便观测，局部改
 * 方便快速修复。理清思绪。从局部扩大到整体。
 * 
 * -具体流程
 * 1 在实现笛卡尔关系计算之前，将名词和动词进行元基识别索引转代码，之后改动指令集的文字
 * 对应元基码。
 * 
 * 2 不断修正因为转码带来的细微变化，保证原逻辑的畅通。
 * 
 * --罗瑶光
 * */

@SuppressWarnings({ "unchecked", "unused" })
class ShellJPanelTest {
	public static void main(String[] argv)
		throws InterruptedException, IOException {
		ShellJPanelTest shellJPanelTest = new ShellJPanelTest();
		shellJPanelTest.testTinshell();
	}

	// @Mock
	// App NE;
	@Mock
	LinkNode thisNodeInfo;
	// Field jlabel_box of type JCheckBox[]
	// - was not mocked since Mockito doesn't mock arrays
	// Field tabNamesHook of type boolean[]
	// - was not mocked since Mockito doesn't mock arrays
	@Mock
	JTextPane jTextPane;
	// Field stringBuilder of type StringBuilder
	// - was not mocked since Mockito doesn't mock a
	// Final class when 'mock-maker-inline' option is not set
	@Mock
	JTextPane outputjTextPane;
	@Mock
	TinMap output;
	@Mock
	DetaButton jlabel_button_clear;
	@Mock
	DetaButton jlabel_button;
	@Mock
	DetaButton jlabel_init_button;
	@Mock
	DetaButton jlabel_debug_button;
	@Mock
	DetaButton jlabel_flush_button;
	@Mock
	App appInThisClass;
	@Mock
	JCheckBox jlabel_peizhi_di2515;
	@Mock
	Set<KeyStroke> managingFocusForwardTraversalKeys;
	@Mock
	Set<KeyStroke> managingFocusBackwardTraversalKeys;
	@Mock
	Object INPUT_VERIFIER_SOURCE_KEY;
	@Mock
	ComponentUI ui;
	@Mock
	EventListenerList listenerList;
	@Mock
	VetoableChangeSupport vetoableChangeSupport;
	@Mock
	Border border;
	@Mock
	InputVerifier inputVerifier;
	@Mock
	Component paintingChild;
	@Mock
	JPopupMenu popupMenu;
	@Mock
	AtomicBoolean revalidateRunnableScheduled;
	@Mock
	List<Rectangle> tempRectangles;
	@Mock
	InputMap focusInputMap;
	@Mock
	InputMap ancestorInputMap;
	@Mock
	ComponentInputMap windowInputMap;
	@Mock
	ActionMap actionMap;
	@Mock
	Component componentObtainingGraphicsFrom;
	@Mock
	Object componentObtainingGraphicsFromLock;
	@Mock
	Object aaHint;
	@Mock
	Object lcdRenderingHint;

	@Mock
	List<Component> component;
	@Mock
	LayoutManager layoutMgr;
	@Mock
	FocusTraversalPolicy focusTraversalPolicy;
	@Mock
	Set<Thread> printingThreads;
	@Mock
	ContainerListener containerListener;
	@Mock
	Color preserveBackgroundColor;

	@Mock
	Component modalComp;
	// Field modalAppContext of type AppContext - was not mocked
	// since Mockito
	// doesn't mock a Final class when 'mock-maker-inline'
	// option is not set

	@Mock
	Container parent;
	// Field appContext of type AppContext - was not mocked
	// since Mockito doesn't
	// mock a Final class when 'mock-maker-inline' option is not
	// set
	@Mock
	Color foreground;
	@Mock
	Color background;
	@Mock
	Font font;
	@Mock
	Font peerFont;
	@Mock
	Cursor cursor;
	// Field locale of type Locale - was not mocked since
	// Mockito doesn't
	// mock a Final class when 'mock-maker-inline' option is not
	// set
	@Mock
	GraphicsConfiguration graphicsConfig;
	@Mock
	BufferStrategy bufferStrategy;
	@Mock
	DropTarget dropTarget;
	@Mock
	Vector<PopupMenu> popups;
	// Field focusTraversalKeys of type Set[] - was not mocked
	// since
	// Mockito doesn't mock arrays
	@Mock
	Object LOCK;
	// Field acc of type AccessControlContext - was not mocked
	// since
	// Mockito doesn't mock a
	// Final class when 'mock-maker-inline' option is not set
	@Mock
	Dimension minSize;
	@Mock
	Dimension prefSize;
	@Mock
	Dimension maxSize;
	// Field componentOrientation of type ComponentOrientation -
	// was not mocked since Mockito
	// doesn't mock a Final class when 'mock-maker-inline'
	// option is not set
	@Mock
	ComponentListener componentListener;
	@Mock
	FocusListener focusListener;
	@Mock
	HierarchyListener hierarchyListener;
	@Mock
	HierarchyBoundsListener hierarchyBoundsListener;
	@Mock
	KeyListener keyListener;
	@Mock
	MouseListener mouseListener;
	@Mock
	MouseMotionListener mouseMotionListener;
	@Mock
	MouseWheelListener mouseWheelListener;
	@Mock
	InputMethodListener inputMethodListener;
	@Mock
	PropertyChangeSupport changeSupport;
	@Mock
	Object objectLock;
	// Field compoundShape of type Region - was not mocked since
	// Mockito doesn't mock a
	// Final class when 'mock-maker-inline' option is not set
	// Field mixingCutoutRegion of type Region - was not mocked
	// since Mockito doesn't mock
	// a Final class when 'mock-maker-inline' option is not set
	// Field eventCache of type EventQueueItem[] - was not
	// mocked
	// since Mockito doesn't mock arrays
	@Mock
	Map<Class<?>, Boolean> coalesceMap;

	@Mock
	AccessibleContext accessibleContext;
	@InjectMocks
	ShellJPanel shellJPanel;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@SuppressWarnings("unused")
	@Test
	void testGetStringFromStringBuilder() {
		String result = shellJPanel.getStringFromStringBuilder();
		// mock trif
		// Assertions.assertEquals("replaceMeWithExpectedResult",
		// result);
	}

	/*
	 * 这是一个 tinshell 批处理测试 执行复杂条件搜索逻辑， 测试main函数demo的test版本，在导入
	 * 了api之后进行系统集成，然后用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可
	 * 出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，可以用断点来查看
	 * 数据，也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，
	 * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。 --罗瑶光
	 */
	// -1
	// 启动测试开始
	// 配置系统支持
	// 临时设置用，之后结构优化后进行去除。
	// 配置组件支持
	// 配置环境支持
	App_X initTinshellEnvironment() throws IOException,
		InterruptedException {
		App_X NE = new App_X();
		NE.tempString = "去弹窗组件流测试";
		NE.init(NE);
		DetaThread.sleepDeta(100);
		NE.start();
		while (null == NE.app_S.studyVerbalMap) {
			Thread.sleep(500);
		}
		return NE;
	}

	// -2
	// 配置读XLS的表头配置
	// 开始模拟读xls的函数逻辑测试
	// 临时设置用，之后结构优化后进行去除。
	// 确定测试文件名为药食同源的表文件，tinshell函数执行这个表的操作计算。
	String initSourceXLSEnvironment(App_X NE, String filePathXLSX)
		throws InterruptedException {
		NE.app_S.appConfig.SectionJPanel.xlsWithSpec.setSelected(
			true);
		if (null == NE.app_S._A) {
			return "NULL";
		} // later normalization
		MakeContainerXLS makeContainerXLS = new MakeContainerXLS(
			NE.app_S._A, NE.app_S, NE.app_S.jTabbedpane,
			NE.app_S.tabNames,
			NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn,
			NE.app_S.fMHMMListOneTime_E_X_S.posEnToEn,
			NE.app_S.fMHMMListOneTime_E_X_S.enToCn,
			NE.app_S.fMHMMListOneTime_E_X_S.fullCnToEn, "xls",
			NE.app_S.emotionSample, NE.app_S.ratioMap_E,
			NE.app_S.sensingTest, NE);
		NE._I_U.tempString = filePathXLSX;
		makeContainerXLS.start();
		while (null == makeContainerXLS.jpanelSecond) {
			Thread.sleep(100);
		}
		while (null == makeContainerXLS.jpanelSecond.pageName) {
			Thread.sleep(100);
		}
		NE.app_S.makeContainerXLSList.add(makeContainerXLS);
		if (makeContainerXLS.tabNames.size() < 1) {
			System.out.println("error read table");
			NE.stop();
			return "NULL";
		}
		String XLSTableName = makeContainerXLS.jpanelSecond.pageName;
		String XLSTableNamePath = makeContainerXLS.jpanelSecond.xlsFilePath;
		System.out.println("path table:" + XLSTableName);
		System.out.println("name table:" + XLSTableNamePath);
		return XLSTableName;
	}

	// -3
	// init test
	// 准备测试命令，sonar覆盖率30%，提高覆盖率方式，我的DNA元基催化与肽计算中
	// 所有的命令都按下面方式模拟一遍就可以100%。
	// 我做的是模拟loader runner 批处理，不是sonar体系逻辑。我写测试是满足我
	// 罗瑶光的欲望，我的欲望不会告诉大家。大家要sonar，
	// 去100%填满mock所有单元函数即可。
	// 可以是其他的语言。initon talk， plorm， deta db
	TinMap execShell(App_X NE, String tinshellInput)
		throws InterruptedException, IOException {
		String plSearch = tinshellInput;
		// etc。。
		// osgi view init
		OSU_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ = new OSU_OVQ_OSQ_VSQ();
		// 命令需要的表格生成
		// later//Object object = _SQ__OVQ_OSQ_VSQ.outputOut.get(
		// S_ShellETL.SHELL_ETL_TIN_SHELL_ETL);
		Object object = new TinMap();
		// do test
		TinMap tinMap = (TinMap) object;
		output = E_pl_XA_E.E_pl_XA(plSearch.replace("\r\n", ""),
			false, tinMap, NE);// later
		return output;

	}

	@Test
	void testTinshell() throws InterruptedException, IOException {
		try {
			// test without mock api
			System.out.println(
				"test without mock api -- tinshell 批处理测试 执行复杂条件搜索逻辑"
					+ "--我本地苹果mac上已经调通可运行。" + "方便我之后的各类型测试");
			// -1
			// 启动测试开始
			// 配置系统支持
			// 临时设置用，之后结构优化后进行去除。
			// 配置组件支持
			// 配置环境支持
			App_X NE = initTinshellEnvironment();
			// -2
			// 配置读XLS的表头配置
			// 开始模拟读xls的函数逻辑测试
			// 临时设置用，之后结构优化后进行去除。
			// 确定测试文件名为药食同源的表文件，tinshell函数执行这个表的操作计算。
			String filePathXLSX = "/Users/luoyaoguang430181198505250014/Desktop/YLJHRJ/"
				+ "project/TinOS/DetaResources/books/xlsx/zybgPage.xlsx";
			String XLSTableName = initSourceXLSEnvironment(NE,
				filePathXLSX);
			// -3
			// init test
			// 准备测试命令，sonar覆盖率30%，提高覆盖率方式，我的DNA元基催化与肽计算中
			// 所有的命令都按下面方式模拟一遍就可以100%。
			// 我做的是模拟loader runner 批处理，不是sonar体系逻辑。我写测试是满足我
			// 罗瑶光的欲望，我的欲望不会告诉大家。大家要sonar，
			// 去100%填满mock所有单元函数即可。
			// 可以是其他的语言。initon talk， plorm， deta db

			String tinshellInput = ("首先获取一个表，名字是" + XLSTableName
				+ "，如果有这个表，准备下一步选择;\r\n"

				+ "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n" //tvm
				+ "对这个表的功效列进行DNN搜索含有菜谱的关键字" //human talk tvm extension
				+ "对这个表的功效进行搜索菜谱"//human talk
				/*
				 * Tinshell的最大价值目前处理数据库矩阵数据全部语言化，以后处理某一个流程可以类似的
				 * 指令集不断扩展TVM即可，举例处理烧水，只要说准备好一个烧壶，装满3分之2的纯净水，将烧壶放置
				 * 在火架上，传感器点火，水沸腾后熄灭火，那么这个流程可以直接work。当这种语言操纵指令丰富后，
				 * 就是一个真正的听得懂人话的机器。 我要做的就是将框架设计好，不断的翻译指令，加指令，处理指令，
				 * 精确指令，减少误差指令，识别指令，优化指令，索引指令即可。然后这个指令集的测试函数可以序列化融合
				 * 杂交，进行遗传进化，就可以逐渐的替代和胜任人类常用语言来描述的各种命令类的工作逻辑，减少劳动负担。。
				 * 
				 * 当年因为探索永生和瞬间转移，没想到的是真正的机器人技术思维逻辑彻底被攻克了。说明机器人是
				 * 永生和瞬间转移探索路上一个必经的中间过程。
				 * 
				 * 最近一个月的研究思维就确定了。做出一个万金油框架，让社会各类大佬可以轻松自由设计指令集。脱离
				 * 程序员的狭小区域。我觉得我先写一篇Tinshell的TVM指令设计流程。
				 * 
				 * --罗瑶光
				 * 
				 * */
				+ "条件为:和:中药名称|包含|菜谱;\r\n" + "条件为:和:风险规避|不包含|孕;\r\n"
				+ "条件为:和:性味|不包含|凉;\r\n" + "条件为:和:性味|不包含|咸;\r\n"
				+ "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n"
				+ "在输出的数据表中仅展示从第零行到第3拾行的数据;"
				+ "做一个操作将列名为中药名称的子集不能用红色来标记为输出的颜色;");
			/*
			 * 准备丰富已有指令集的精度和离散度。开始变换语义文字测试优化 tinshell。
			 * 思考-- 在变换语言的结构过程中优化的具体关系和逻辑进行统计分析，寻找其中的充要条件
			 * 特别是这些条件如果适用于各类文学结构的分析。那就是普遍存在的某种逻辑片段。
			 * 
			 * --罗瑶光
			 * */
			/*
			String tinshellInput = (
					  "首先获取一个表，名叫" + XLSTableName
					+ "，如果有就下一步;\r\n" + "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n"
					+ "条件为:和:中药名称|包含|菜谱;\r\n" + "条件为:和:风险规避|不包含|孕;\r\n"
					+ "条件为:和:性味|不包含|凉;\r\n" + "条件为:和:性味|不包含|咸;\r\n"
					+ "输出内容仅含中药名称，打分和功效这三个列;\r\n" 
					+ "内容也仅筛选从第零行到第3拾行;"
					+ "其中的中药名称列不用红色标记;");
			*/
			/*
			 * Question - relationships between TVM and Human Talk Languages HTL.
			 * 1- a TVM command could be a HTL sentence, the relationship is a type of 
			 * affiliation by HTL. 2- and a HTL may contains a structure of TVM, 
			 * continue analyzing those conditions will know HTL's could be a TVM's 
			 * but TVM's. Hens we need create a logic to connect TVM and HTL. let the 
			 * TVM's be a type of HTL's. The name of logic is -TVM Extension-.
			 * 
			 * Continuing mind -  -TVM Extension-. At first step could swap TVM's to 
			 * the output. Then the second step could swap similar-TVM's to TVM's. and 
			 * finally could swap HTL's to similar-TVM's, let's do the second's now.
			 * 
			 * --Yaoguang Luo 
			 * --Trif in English
			 * */
			tinshellInput = ("首先获取一个表，名叫" + XLSTableName
				+ "，如果有就下一步;\r\n" + "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n"
				+ "条件为:和:中药名称|包含|菜谱;\r\n" + "条件为:和:风险规避|不包含|孕;\r\n"
				+ "条件为:和:性味|不包含|凉;\r\n" + "条件为:和:性味|不包含|咸;\r\n"
				+ "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n"
				//here now.
				+ "在输出的数据表中仅展示从第零行到第3拾行的数据;"
				+ "做一个操作将列名为中药名称的子集不能用红色来标记为输出的颜色;");
			/*
			 * from the output maps, "首先获取一个表，名叫" + XLSTableName
					+ "，如果有就下一步;\r\n" + is ok for similar-TVM's extension,
					let's continue.
			 * */
			tinshellInput = ("" + "首先获取一个表，名叫" + XLSTableName
				+ "，如果有就下一步;\r\n" + "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n"
				+ "条件为:和:中药名称|包含|菜谱;\r\n" + "条件为:和:风险规避|不包含|孕;\r\n"
				+ "条件为:和:性味|不包含|凉;\r\n" + "条件为:和:性味|不包含|咸;\r\n"
				//+ "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n" 
				+ "输出内容仅含中药名称，打分和功效这三个列;\r\n"
				//ok for both.
				//--here now.
				+ "在输出的数据表中仅展示从第零行到第3拾行的数据;"
				+ "做一个操作将列名为中药名称的子集不能用红色来标记为输出的颜色;");
			/*
			 * important key = 输出-内容  仅含-  +列, those three keys increase to a 
			 * combination key
			 * let's ..
			 * 
			 * CN
			 * 通过严谨的计算哲学文字描述，通过充要条件细化归纳关于 tinshell TVM指令集与人类语言的
			 * 关系拓扑和逻辑拓扑，我找到了一个当前 tinshell 的明显缺陷，是笛卡尔条件匹配不够细腻，
			 * 具体表现在匹配的map不够多样化，这时候终于可以采用哲学的叠加打分评估逻辑了，否定论的
			 * 铺垫性建设宣告一个段落。下一步TVM extension 叠加条件函数规划。具体归纳类似
			 * AddFindColumnsInMemoryClass 的 logic 函数中 before println-hello world 的
			 * 代码逻辑。
			 * 
			 * EN
			 * After a philosophy-implementation with computing-literacies, Mr.Yaoguang.luo
			 * organized a lot of proofs to make an observation of topology between 
			 * relationships and logics, then he found the lack of tinshell's TVM, means 
			 * the less conditions of Cartesian in this system will COZ a lot of problems 
			 * in ratio of accurate. Then he did more TVM extension logics and prepare to fix
			 * this domains at the next proving steps. 
			 * 
			 * --罗瑶光
			 * 
			 * */

			output = execShell(NE, tinshellInput);
			// print answer
			// 打印执行后的输出表格
			if (null == output) {
				return;
			}
			Iterator<String> iterator = output.keySet().iterator();
			// 输出
			while (iterator.hasNext()) {
				String string = iterator.next();
				NE.app_S.appConfig.SectionJPanel.jTextPane.setText(
					output.get(string).toString());
				S_logger.Log.logger.info("line-->:" + output.get(string)
					.toString());
			}
			// DNA序列记忆标注
			if (null != NE.app_S.helpVerbalMap.didJustNow) {
				Iterator<String> iterators = NE.app_S.helpVerbalMap.didJustNow
					.keySet().iterator();
				while (iterators.hasNext()) {
					S_logger.Log.logger.info("Action-->:" + iterators
						.next());
				}
			}
			// 关闭
			NE.stop();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}

//String tinshellInput = ("首先获取一个表，名字是" + XLSTableName
//		+ "，如果有这个表，准备下一步选择;\r\n" + "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n"
//		+ "条件为:和:中药名称|包含|菜谱;\r\n" + "条件为:和:风险规避|不包含|孕;\r\n"
//		+ "条件为:和:性味|不包含|凉;\r\n" + "条件为:和:性味|不包含|咸;\r\n"
//		// + "获取列名:中药名称:打分:功效;\r\n"
//		+ "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n" 
//		+ "操作:0|行至|30;\r\n"
////		+ "在输出的数据表中仅展示第0到30行"
////		+ "在输出的数据表中仅展示前30行"
//		+ "在输出的数据表中仅展示从第零行到第3拾行的数据;"
//		// + "操作:中药名称|颜色标记为|红色;");
//		+ "做一个操作将列名为中药名称的子集不能用红色来标记为输出的颜色;");

//输出正确
//400---00007---
//操作:0|行至|30
//400---00008---
//。。
//line-->:10
//。。
//Action-->:updateColorAttributesOfColumnsInMemoryClass
//Action-->:selectRowsByAttributesOfGetCulumns
//Action-->:P_ListNeedStart
//Action-->:limitedRowAttributesOfColumnsInMemoryClass
//Action-->:selectRowsByAttributesOfAggregation
//Action-->:P_TableName
//Action-->:P_fileOperations
//Action-->:selectRowsByAttributesOfCondition
//Action-->:addFindColumnsInMemoryClass
/*
 * 花了三天时间做了一个最简的六元 -爱 学习 工作 创新 安全 帮助-
 * 分析混合歧义中文数字提取机，在简单的功能测试了下ok后，那么就准备
 * 应用下，逻辑是，
 * --1-- 首先识别出中文混合数字，进入到wordFrequency
 * map中	 如 command_V._IMV_SIQ_SS = NE.app_S._A
 *	.getWordFrequencyMap(command_V._IMV_SIQ_SS_, NE);
 * 和 NE.app_S._A.initPCAWordPOS(command_V._IMV_SIQ_SS, NE);
 * 变量管理关系-- 
 * 1 数字变量的set list--command_V._IMV_SIQ_SS_
 * 2 数字变量的map pos标注--command_V._IMV_SIQ_SS
 * --2-- 原文string剔除掉数字后进行原函数计算得到
 * 3 数字变量的set list--command_V._IMV_SIQ_SS_
 * 4 数字变量的map pos标注--command_V._IMV_SIQ_SS
 * 然后将4合并成final-command_V._IMV_SIQ_SS
 * 就可以将数字碎片融入原函数的笛卡尔关系中获取指令集。
 * 然后分析 从- 组合 到- 展示+行 仅+展示
 * --罗瑶光
 * */

//String tinshellInput = (
//		"首先获取一个表，名字是" + XLSTableName
//		+ "，如果有这个表，准备下一步选择;\r\n" + "条件为:和:功效|DNN搜索|功效|菜谱|4;\r\n"
//		+ "条件为:和:中药名称|包含|菜谱;\r\n" + "条件为:和:风险规避|不包含|孕;\r\n"
//		+ "条件为:和:性味|不包含|凉;\r\n" + "条件为:和:性味|不包含|咸;\r\n"
//		+ "在输出的数据表中仅展示列名为中药名称，打分和功效列这三个即可;\r\n" 
//+ "操作:0|行至|30;\r\n"
//+ 
//		"在输出的数据表中仅展示从第0行到第3拾行的数据;"

/*
 * 改为做一个操作将列名为中药名称的子集用红色来标记为输出的颜色; --进行计算，
 * //输出结果正确 序列化流标记如下。
 * //Action-->:updateColorAttributesOfColumnsInMemoryClass
 * //Action-->:selectRowsByAttributesOfGetCulumns
 * //Action-->:P_ListNeedStart
 * //Action-->:selectRowsByAttributesOfAggregation
 * //Action-->:P_TableName //Action-->:P_fileOperations
 * //Action-->:selectRowsByAttributesOfCondition
 * //Action-->:addFindColumnsInMemoryClass
 * 测试出之前一个临时关键字需要replace掉。
 * --计算哲学在复杂功能逻辑测试领域的应用真实实例。
 * --罗瑶光
 */

//line-->:临时XLS1753902276957
//    line-->:操作
//    line-->:success
//    line-->:0
//    line-->:进行选择
//    line-->:临时XLS1753902276957
//    line-->:true
//    line-->:操作
//    line-->:0
//    line-->:[{rowValue={功效={culumnValue=功专托痘疮。下乳汁。吐风痰。中风证以虾半斤。
//    入葱姜酱料水煮。先吃虾。次吃汁。
//    以鹅翎探引吐出痰涎即愈。能壮阳道。动风发呛。...., culumnName=功效}, 中药名称={culumnValue
//    =<div style="background:black"><
//    font color="red"><div style="background:black"><font color="red"><div style=
//    "background:black"><font color="red">
//    <div style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="backg
//    round:black"><font color="red"><div style="background:black"><font color
//    ="red"><div style="background:black"><fon
//    t color="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red">虾菜谱
//    </font></div></font></div></font></div></font></div></font></div></font>
//    </div></font></div></font></div></font><
//    /div></font></div>, culumnName=中药名称}, 打分={culumnValue=0, culumnName
//    =打分}}}, {rowValue={功效={culumnValue=功专温中益气
//    。多食热中发渴。发疮疥。一名。鱼。...., culumnName=功效}, 中药名称={culumnValue
//    =<div style="background:black"><font color=
//    "red"><div style="background:black"><font color="red"><div style="background
//    :black"><font color="red"><div style=
//    "background:black"><font color="red"><div style="background:black"><font color
//    ="red"><div style="background:black">
//    <font color="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red">
//    <div style="background:black"><font color="red"><div style="background:black">
//    <font color="red">鲢鱼菜谱</font></div>
//    </font></div></font></div></font></div></font></div></font></div></font>
//    </div></font></div></font></div></font></div>,
//    culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效
//    ={culumnValue=功专补五脏。除风湿。尾血疗口眼。斜。
//    少和麝。左涂右。右。涂左。正则洗去。滴耳治耳痛。滴鼻治鼻衄。点目治痘后生翳。头治百虫入耳。
//    ...., culumnName=功效}, 中药名称={culumnValue=
//    <div style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background
//    :black"><font color="red"><div style="background:black"><font color="red">
//    <div style="background:black"><font color=
//    "red"><div style="background:black"><font color="red"><div style="background
//    :black"><font color="red"><div style=
//    "background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:black">
//    <font color="red">鳝鱼菜谱</font></div></font></div></font></div></font></div>
//    </font></div></font></div></font></div>
//    </font></div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue
//    =0, culumnName=打分}}},
//    {rowValue={功效={culumnValue=功专调胃气。...., culumnName=功效}, 中药名称
//    ={culumnValue=<div style="background:black"><font
//    color="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red">
//    <div style="background:black"><font color="red"><div style="background
//    :black"><font color="red"><div style="background:
//    black"><font color="red"><div style="background:black"><font color="red">
//    <div style="background:black"><font color="red">
//    <div style="background:black"><font color="red"><div style="background
//    :black"><font color="red">鲂鱼菜谱</font></div>
//    </font></div></font></div></font></div></font></div></font></div></font>
//    </div></font></div></font></div></font></div>,
//    culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}, {rowValue
//    ={功效={culumnValue=马铃薯生长肌肉, 健骨, 抗癌。.
//    , culumnName=功效}, 中药名称={culumnValue=<div style="background:black">
//    <font color="red"><div style="background:black">
//    <font color="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red">
//    <div style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:
//    black"><font color="red"><div style="background:black"><font color="red">
//    <div style="background:black"><font color="red">
//    <div style="background:black"><font color="red">马铃薯菜谱</font></div></font>
//    </div></font></div></font></div></font></div>
//    </font></div></font></div></font></div></font></div></font></div>, culumnName
//    =中药名称}, 打分={culumnValue=0,
//    culumnName=打分}}}, {rowValue={功效={culumnValue=山羊蹄子增强免疫, 健骨, 补元气。
//    ., culumnName=功效}, 中药名称={culumnValue=<div
//    style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:black">
//    <font color="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red"><div
//    style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:
//    black"><font color="red"><div style="background:black"><font color="red">
//    <div style="background:black"><font color
//    ="red">山羊蹄菜谱</font></div></font></div></font></div></font></div></font>
//    </div></font></div></font></div></font>
//    </div></font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0
//    , culumnName=打分}}}, {rowValue={功效=
//    {culumnValue=功专暖中益气。醒酒解渴。同米粉煮羹食。调中收痔。煮食疗阳事不起。俗名泥鳅。
//    ...., culumnName=功效}, 中药名称={culumnValue=<div
//    style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background
//    :black"><font color="red"><div style="background:black"><font color="red">
//    <div style="background:black"><font color="red">
//    <div style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:black">
//    <font color="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red">鳅鱼菜谱</font>
//    </div></font></div></font></div></font></div></font></div></font></div>
//    </font></div></font></div></font></div></font></div>, culumnName=中药名称},
//    打分={culumnValue=0, culumnName=打分}}}, {rowValue={功效={culumnValue
//    =咖喱去腥开胃生津防腐杀虫提神充饥抗癌。., culumnName=功效}, 中药名称
//    ={culumnValue=<div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:black"><font color="red"><div style
//    ="background:black">
//    <font color="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:black">
//    <font color="red"><div style="background:black"><font color="red">食物咖喱菜谱
//    </font></div></font></div></font>
//    </div></font></div></font></div></font></div></font></div></font></div></font>
//    </div></font></div>, culumnName=中药名称}, 打分={culumnValue=0,
//    culumnName=打分}}}, {rowValue={功效={culumnValue=常用于润肺护肤抗癌。., culumnName=功效},
//    中药名称={culumnValue=<div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red"><div style="background:black"><
//    font color="red"><div style="background:black"><font
//    color="red"><div style="background:black"><font color="red"><div style="background:
//    black"><font color="red"><div style="background:black"><font color="red">
//    <div style="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style="background:black"><font color="red">西红柿菜谱</font>
//    </div></font></div>
//    </font></div></font></div></font></div></font></div></font></div></font></div>
//    </font></div></font></div>, culumnName=中药名称}, 打分={culumnValue=0
//    , culumnName=打分}}}, {rowValue={功效={culumnValue=蛋有消炎解毒, 壮阳, 补元气,
//    提神, 预防感冒。., culumnName=功效},
//    中药名称={culumnValue=<div style="background:black"><font color="red"><div style
//    ="background:black"><font color="red"><div style="background:black">
//    <font color="red"><div style=
//    "background:black"><font color="red"><div style="background:black"><font color
//    ="red"><div style="background:black"><font color="red"><div style
//    ="background:black"><font
//    color="red"><div style="background:black"><font color="red"><div
//    style="background:black"><font color="red"><div style="background:black"><font
//    color="red">鸡鸭鸽子鹌鹑蛋菜谱</font></div></font></div></font></div></font></div>
//    </font></div></font></div></font></div></font></div></font></div></font></div>,
//    culumnName=中药名称}, 打分={culumnValue=0, culumnName=打分}}}]
//    line-->:10
//    line-->:success
//    line-->:0
//    line-->:10
//    Action-->:selectRowsByAttributesOfGetCulumns
//    Action-->:P_ListNeedStart
//    Action-->:selectRowsByAttributesOfAggregation
//    Action-->:P_TableName
//    Action-->:selectRowsByAttributesOfCondition
//    Action-->:addFindColumnsInMemoryClass
//    Disconnected from the target VM, address: '127.0.0.1:52726', transport: 'socket'
//
//    Process finished with exit code 0

//本花语测试输出如下，
//Action-->:selectRowsByAttributesOfGetCulumns
//Action-->:P_ListNeedStart
//Action-->:selectRowsByAttributesOfAggregation
//Action-->:P_TableName
//Action-->:selectRowsByAttributesOfCondition
//Action-->:addFindColumnsInMemoryClass
//DNA执行统计标注
//DNA新陈代谢标注
