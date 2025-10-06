package test.java.InterfaceTest.chineseParser;

import A_V.ASQ.PSU.test.TimeCheck;
import O_V.OSM.shell.CommandClass;
import O_V.OSM.shell.E_pl_XA_E;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;
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
public class DemoEX {
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
	public static void main(String[] args) {
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		// 词性初始化
		IMV_SIQ pos = commonTestInition.NE.app_S._A.getPosCnToCn();
		TimeCheck t = new TimeCheck();
		// 等待分词的语句
		String ss = new String("在输出的数据表中仅展示从第零行到第三十行的数据"
			+ "罗瑶光先生从2018年10月开始，所有个人著作权作品，-1234 566778 900-"
			+ "全部开源，到现在，和无数群体，技术社团正面交锋7年，一直0纠纷，罗"
			+ "瑶光先生认为，一件作品，一个事物，如果有价值，就应该像教材一样在"
			+ "真实的环境中实践测试和论证，能经得起所有人长年累月不断地挑剔的东"
			+ "西，才是货真价实的，罗瑶光的个人著作权作品都是互联网，大数据产业"
			+ "领域基础作品，2018年后，在60余互联网app上发布德塔开源的作品，罗"
			+ "瑶光先生认为开源作品对同行呈现包容性。同时对垄断产业有约束性。");
		/*
		 * Sonar--S106协议 修改，这是我第二个sonar纠正处。 去system 改为 log4j。
		 * 
		 * 我的华瑞集系统没有需要日志的地方，可以全部把system.out注释掉，不要删除切记。
		 * logger又有很多级别。 大家的工程需要日志Q就去写个资源文件去配置。不需要就别管。
		 * 
		 * 注意我这个版本log4j不支持 common 的logger.setLevel,要util才行，坑不坑先不管，
		 * 我只是展示下用个fatal其他全部注释掉。
		 * 
		 * --罗瑶光
		 * */

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

		Log.logger.info("-展示分词识别---" + command_V._IMV_SIQ_SS_.size());
		Log.logger.info("-展示数字提取识别---" + command_V._IMV_SIQ_SS_Q
			.size());
		/*
		 * 之后我函数中所有的用来处理log和状态的变量都加temp后缀，方便统一识别和剔除。
		 * --罗瑶光
		 * */
		Iterator<String> iterators_IMV_SIQ_SS = command_V._IMV_SIQ_SS_
			.iterator();
		Iterator<String> iterators_IMV_SIQ_SS_Q = command_V._IMV_SIQ_SS_Q
			.keySet().iterator();
		String iterators_IMV_SIQ_SS_Temp = "";
		String iterators_IMV_SIQ_SS_Q_Temp = "";
		while (iterators_IMV_SIQ_SS.hasNext()) {
			iterators_IMV_SIQ_SS_Temp += "+" + iterators_IMV_SIQ_SS
				.next();
		}
		while (iterators_IMV_SIQ_SS_Q.hasNext()) {
			iterators_IMV_SIQ_SS_Q_Temp += "+"
				+ iterators_IMV_SIQ_SS_Q.next();
		}

		Log.logger.info("-展示原文--------->" + ss);
		Log.logger.info("-展示分词识别------>" + iterators_IMV_SIQ_SS_Temp);
		Log.logger.info("-展示数字提取识别-->" + iterators_IMV_SIQ_SS_Q_Temp);
		// 关闭
		commonTestInition.endEnvironment();
	}
}
//输出 2025-10-06-周一-09-11-
/*
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
*/