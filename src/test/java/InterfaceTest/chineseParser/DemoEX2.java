package test.java.InterfaceTest.chineseParser;

import A_V.ASQ.PSU.test.TimeCheck;
import O_V.OSM.shell.CommandClass;
import O_V.OSM.shell.E_pl_XA_E;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SQI;
import S_A.pheromone.IMV_SQI_SS;
import S_A.pheromone.IMV_SQI_S_;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import S_logger.Log;
import test.java.interfaces.test.CommonTestInition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
 * 这是一个 极速分词 测试main函数demo的test版本，在导入了api之后进行系统集成，然后用下面的
 * 对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的
 * 参数，然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显示输出，
 * 方便集成，对程序员友好。系统需要jdk1.8以上的java环境，本人会把测试的输入输出都注释在这个
 * 文件里。及其傻瓜化的流程，方便商业化落地。 --罗瑶光
 * */
public class DemoEX2 {
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;
	int f = 0;
	int g = 0;

	//refer
	//https://logging.apache.org/log4j/2.x/javadoc/log4j-api/org/apache/logging/log4j/Logger.html
	//private static final Logger logger = Logger.getLogger("");
	/*
	 * 思考 20251007 今天在反复地分析测试输出结果，发现因为2018年10月中 2018和10已经
	 * 提取了数字，那么年月因为词性相同和单字出现满足组成双字词汇的条件，导致组合成了-年月-
	 * 词汇，我开始更近思考。这里在切词后组词逻辑中不应该合并，同时在笛卡尔关系中合并后
	 * 需要保留单字。间接论证了，昨天的保留单字在noun map和verb map中的逻辑属于必要的逻辑
	 * 。于是开始优化，
	 * 
	 * 途径-1-提取了数字，用一个空格替换，避免了组词。--操作快，
	 * 途径-2-提取了数字，用一个替代符号替换，避免了组词。同时将数字提取用list代替，这样
	 * 可以用变量来创造条件还原到分词list中。--质量高，影响很多场景的分词速度
	 * 
	 * 我采用途径-2的逻辑 尝试下。先构造一个_IMV_SQI_SS_Q_ list 变量，用来平衡
	 * _IMV_SQI_SS_Q map 如果条件成熟再剔除 _IMV_SQI_SS_Q 逻辑即可。
	 * 
	 * 于是用 filterString 中 加特殊符号 来标识数字 ,ok 稍后就提取出来作为input变量
	 * 来全局操作。看了下结果算是OK，但是又遇到了新的问题，因为数字的map 在之后会进行map
	 * 的combination，那么这里会出现伪指令。于是检查下，将WorkVerbalMap函数中的
	 * setHumanTalkAfterNewBusinessTest 的末尾先注释掉。
	 * 
	 * 思考--出现 +1+直+0+纠纷+ 这里 -1直- 因为是笛卡尔关系加上RNN的距离位置权值精确
	 * 分析模式，不会影响指令句识别。
	 * 
	 * 思考--关于复杂指令句 与 语言句 的 处理中， 如何有效地快速地分开识别。
	 * 
	 * 关键字 CommandClass command_V = new CommandClass(); 处--笔记
	 * Sonar--S106协议 修改，这是我第二个sonar纠正处。 去system 改为 log4j。
	 * 
	 * 我的华瑞集系统没有需要日志的地方，可以全部把system.out注释掉，不要删除切记。logger
	 * 又有很多级别。 大家的工程需要日志Q就去写个资源文件去配置。不需要就别管。
	 * 
	 * 注意我这个版本log4j不支持 common 的logger.setLevel,要util才行，坑不坑先不管，
	 * 我只是展示下用个fatal其他全部注释掉。
	 * 
	 * --罗瑶光
	 * */
	
	public static void main(String[] args) {
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		// 词性初始化
		IMV_SQI pos = commonTestInition.NE.app_S._A.getPosCnToCn();
		TimeCheck t = new TimeCheck();
		// 等待分词的语句
		String ss = new String("北京西站浏阳东站上海南站-1234 566778 900-"
			+ "全部开源，到现在，和无数群体，技术社团正面交锋7年，一直0纠纷，罗"
			+ "瑶光先生认为，一件作品，一个事物，如果有价值，就应该像教材一样在"
			+ "真实的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的东"
			+ "西，才是货真价实的，罗瑶光的个人著作权作品都是互联网，大数据产业"
			+ "领域基础作品，2018年后，在60余互联网app上发布德塔开源的作品，罗"
			+ "瑶光先生认为开源作品对同行呈现包容性。同时对垄断产业有约束性。");
		/*
		 * 用commandV来处理混合中文，看看效果。
		 * */
		CommandClass command_V = new CommandClass();
		commonTestInition.NE.app_S.workVerbalMap.command_V = command_V;
		commonTestInition.NE.app_S.currentTinmap = new TinMap();
		command_V.command = ss.toString();
		command_V.initSixActions(commonTestInition.NE);
		command_V.initArabicNumber();
		String commandSwap = E_pl_XA_E.doHumanTalkSwap(
			commonTestInition.NE, command_V);

		S_logger.Log.logger.info("" + "-展示分词识别---" + command_V._IMV_SQI_SS_.size());
		S_logger.Log.logger.info("" + "-展示数字提取识别---" + command_V._IMV_SQI_SS_Q
			.size());
		/*
		 * 之后我函数中所有的用来处理log和状态的变量都加temp后缀，方便统一识别和剔除。
		 * --罗瑶光
		 * */
		Iterator<String> iterators_IMV_SQI_SS = command_V._IMV_SQI_SS_
			.iterator();
		Iterator<String> iterators_IMV_SQI_SS_Q = command_V._IMV_SQI_SS_Q
			.keySet().iterator();
		String iterators_IMV_SQI_SS_Temp = "";
		String iterators_IMV_SQI_SS_Q_Temp = "";
		while (iterators_IMV_SQI_SS.hasNext()) {
			iterators_IMV_SQI_SS_Temp += "+" + iterators_IMV_SQI_SS
				.next();
		}
		while (iterators_IMV_SQI_SS_Q.hasNext()) {
			iterators_IMV_SQI_SS_Q_Temp += "+"
				+ iterators_IMV_SQI_SS_Q.next();
		}

		S_logger.Log.logger.info("" + "-展示原文--------->" + ss);
		S_logger.Log.logger.info("" + "-展示分词识别------>" + iterators_IMV_SQI_SS_Temp);
		S_logger.Log.logger.info("" + "-展示数字提取识别-->" + iterators_IMV_SQI_SS_Q_Temp);
		// 关闭
		commonTestInition.endEnvironment();
	}
}
//输出 2025-10-06-周一-09-11-
/*
 * 注意我官网是2021年前的老版本，一直没碰，等死机后再换这最新的，因为一直没死机，所以就再等等。
 * 信息: -展示原文--------->北京西站浏阳东站上海南站-1234 566778 900-全部开源，到现在，和无数
 * 群体，技术社团正面交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一个事物，如果有价值，就应该像
 * 教材一样在真实的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的东西，才是货真价实的，
 * 罗瑶光的个人著作权作品都是互联网，大数据产业领域基础作品，2018年后，在60余互联网app上发布德塔
 * 开源的作品，罗瑶光先生认为开源作品对同行呈现包容性。同时对垄断产业有约束性。
 * 
10月 28, 2025 4:58:55 下午 test.java.InterfaceTest.chineseParser.DemoEX2 main
信息: -展示分词识别------>+北京+西+站+浏阳+东+站+上海+南+站+-+1234+ +566778+ +900+-+全部+
开源+，+到+现在+，+和+无数+群体+，+技术+社团+正面+交锋+7+年+，+1+直+0+纠纷+，+罗瑶光+先生+认为+
，+1+件+作品+，+1+个+事+物+，+如果+有+价值+，+就+应该+像+教材+1+样+在+真实+的+环境+中+实践+测试
+和+论证+，+能+经得起+所有+人+长年累月+不断+地+挑剔+的+东西+，+才是+货真价实+的+，+罗瑶光+的+个人
+著作权+作品+都是+互联网+，+大+数据+产业+领域+基础+作品+，+2018+年后+，+在+60+余+互联网+app+上
+发布+德塔+开源+的+作品+，+罗瑶光+先生+认为+开源+作品+对+同行+呈现+包容+性+。+同时+对+垄断+产业
+有+约束+性+。+ + 
10月 28, 2025 4:58:55 下午 test.java.InterfaceTest.chineseParser.DemoEX2 main
信息: -展示数字提取识别-->+1234+566778+900+7+1+0+2018+60
 * 
 * 
 * 
信息: -展示原文--------->在输出的数据表中仅展示从第零行到第三十行的数据罗瑶光先生从2018年10月开始，所有个人著作权作品，
-1234 566778 900-全部开源，到现在，和无数群体，技术社团正面交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一个事物，如果
有价值，就应该像教材一样在真实的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的东西，才是货真价实的，罗瑶光的个人
著作权作品都是互联网，大数据产业领域基础作品，2018年后，在60余互联网app上发布德塔开源的作品，罗瑶光先生认为开源作品对同行
呈现包容性。同时对垄断产业有约束性。

10月 06, 2025 9:05:46 上午 test.java.InterfaceTest.chineseParser.DemoEX main
信息: -展示分词识别------>+在+输出+的+数据+表+中+仅+展示+从+第+行+到+第+行+的+数据+罗瑶光+先生+从+年月+开始+，+所有+
个人+著作权+作品+，+-+ +-+全部+开源+，+到+现在+，+和+无数+群体+，+技术+社团+正面+交锋+年+，+直+纠纷+，+罗瑶光+先生+
认为+，+件+作品+，+个+事+物+，+如果+有+价值+，+就+应该+像+教材+样+在+真实+的+环境+中+实践+测试+和+论证+，+能+经得起+
所有+人+长年累月+不断+地+挑剔+的+东西+，+才是+货真价实+的+，+罗瑶光+的+个人+著作权+作品+都是+互联网+，+大+数据+产业+
领域+基础+作品+，+年后+，+在+余+互联网+app+上+发布+德塔+开源+的+作品+，+罗瑶光+先生+认为+开源+作品+对+同行+呈现+包容+
性+。+同时+对+垄断+产业+有+约束+性+。+ + 

10月 06, 2025 9:05:46 上午 test.java.InterfaceTest.chineseParser.DemoEX main
信息: -展示数字提取识别-->+566778+1+0+30+2018+1234+7+900+60+10

end cost: 1 ms
*/
/*
10月 07, 2025 3:17:35 下午 test.java.InterfaceTest.chineseParser.DemoEX main
信息: -展示原文--------->在输出的数据表中仅展示从第零行到第三十行的数据罗瑶光先生从2018年10月开始，所有个人著作权作品，
-1234 566778 900-全部开源，到现在，和无数群体，技术社团正面交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一个事物，如
果有价值，就应该像教材一样在真实的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的东西，才是货真价实的，罗瑶光的
个人著作权作品都是互联网，大数据产业领域基础作品，2018年后，在60余互联网app上发布德塔开源的作品，罗瑶光先生认为开源作品
对同行呈现包容性。同时对垄断产业有约束性。
10月 07, 2025 3:17:35 下午 test.java.InterfaceTest.chineseParser.DemoEX main
信息: -展示分词识别------>+在+输出+的+数据+表+中+仅+展示+从+第+0+行+到+第+30+行+的+数据+罗瑶光+先生+从+2018+年+10+月
+开始+，+所有+个人+著作权+作品+，+-+1234+ +566778+ +900+-+全部+开源+，+到+现在+，+和+无数+群体+，+技术+社团+正面
+交锋+7+年+，+1+直+0+纠纷+，+罗瑶光+先生+认为+，+1+件+作品+，+1+个+事+物+，+如果+有+价值+，+就+应该+像+教材+1+样+在
+真实+的+环境+中+实践+测试+和+论证+，+能+经得起+所有+人+长年累月+不断+地+挑剔+的+东西+，+才是+货真价实+的+，+罗瑶光+的
+个人+著作权+作品+都是+互联网+，+大+数据+产业+领域+基础+作品+，+2018+年后+，+在+60+余+互联网+app+上+发布+德塔+开源+的
+作品+，+罗瑶光+先生+认为+开源+作品+对+同行+呈现+包容+性+。+同时+对+垄断+产业+有+约束+性+。+ + 

10月 07, 2025 3:17:35 下午 test.java.InterfaceTest.chineseParser.DemoEX main
信息: -展示数字提取识别-->+0+30+2018+10+1234+566778+900+7+1+60
*/