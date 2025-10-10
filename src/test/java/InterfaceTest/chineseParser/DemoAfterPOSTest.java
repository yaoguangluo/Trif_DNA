package test.java.InterfaceTest.chineseParser;
/*
 * 因2018年莫名回国，这7年被无数本地白道黑道包围式各种伎俩套罗瑶光先生之前的工作
 * 经验，罗瑶光既尴尬又无奈这环境，于是跟业界敞开心扉，直接摊牌，在eclipse的超市
 * 里下了sonar api，罗瑶光先生今天第一次应用sonar于华瑞集，大家睁大眼睛，小生献丑了～。
 * 
 * chineseParser 修改为chinese.Parser------rule S120 sonar协议规范修改。
 * 当年罗瑶光在佛森英**就是搞这个3个月。那就一切尽在不言中，开干。因国内屏蔽了谷歌，
 * 最近罗瑶光把安卓手机设置里的google引擎关闭了，问题集又少了一大半。心情舒畅，就
 * 继续编码。 
 *  
 * --罗瑶光 20251001
 * */

import A_V.ASQ.PSU.test.TimeCheck;
import S_A.pheromone.IMV_SQI;
import S_A.pheromone.IMV_SQI_SS;
import S_logger.Log;
import test.java.interfaces.test.CommonTestInition;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
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
 * 中文UTF8字符 德塔分词后 邻近单字 进行 POS组词测试 增加TinShell 精确度
 * --隐患-语料库表含有未知类词性。需先确定单字的词性。
 * --适用于分词后太多单字的古文 进行单字关联 词句组合 分析
 * --价值，测试出连词分词函数 Pos_X_P_LianCi 文件第76行 缺失 3行源码。
 * 就这么简单？no no no 我知道还有其他问题，--稍后-- 罗瑶光。
 */
public class DemoAfterPOSTest {
	public IMV_SQI_SS noun = new IMV_SQI_SS();
	public IMV_SQI_SS verb = new IMV_SQI_SS();
	public IMV_SQI_SS adj = new IMV_SQI_SS();
	public IMV_SQI_SS adv = new IMV_SQI_SS();

	public static void main(String[] argv) throws IOException {
		DemoAfterPOSTest demoAfterPOSTest = new DemoAfterPOSTest();
		demoAfterPOSTest.main();
	}

	@Test
	void main() throws IOException {
		// 初始化
		CommonTestInition commonTestInition = new CommonTestInition();
		commonTestInition.initEnvironment("去弹窗组件流测试");
		// 准备计算
		// 词性初始化
		IMV_SQI pos = commonTestInition.NE.app_S._A.getPosCnToCn();
		List<String> sets = new ArrayList<>();
		TimeCheck t = new TimeCheck();
		// 等待分词的语句
		String ss = "罗瑶光先生从2018年10月开始，所有个人著作权作品，全部开源，到现在，和"
			+ "无数群体，技术社团正面地交锋7年，一直0纠纷，罗瑶光先生认为，一件作品，一"
			+ "个事物，如果有价值，就应该像教材一样在真实的环境中不断地实践测试和论证，"
			+ "能经得起所有人长年累月地不断地挑剔的东西，才是货真价实的，罗瑶光的个人著"
			+ "作权作品都是互联网，大数据产业领域基础作品，2018年后，在60余互联网app上"
			+ "发布德塔开源的作品，罗瑶光先生认为开源作品对同行呈现包容性。同时对垄断的" 
			+ "产业有约束性。";
		// String ss = "在，和无数群体，";
		// DemoEX demoEX = new DemoEX();
		StringBuilder sb = new StringBuilder(ss);
		// 分词
		// 执行分词
		t.begin();
		sets = commonTestInition.NE.app_S._A.parserMixedString(sb);
		t.end();
		S_logger.Log.logger.info("" + "");
		S_logger.Log.logger.info("" + "--分词后数据--");
		S_logger.Log.logger.info("" + "");
		String stringTemp = "";
		for (int i = 0; i < sets.size(); i++) {
			stringTemp += "-" + sets.get(i);
		}
		S_logger.Log.logger.info("" + stringTemp);
		S_logger.Log.logger.info("" + "");
		// 词性归纳
		List<String> setsInput = testPOS(sets, pos);
		S_logger.Log.logger.info("" + "");
		S_logger.Log.logger.info("" + "--分词后数据 词性简单归纳--");
		S_logger.Log.logger.info("" + "");
		stringTemp = "";
		for (int i = 0; i < setsInput.size(); i++) {
			stringTemp += "=" + setsInput.get(i);
		}
		S_logger.Log.logger.info("" + stringTemp);
		S_logger.Log.logger.info("" + "");
		S_logger.Log.logger.info("" + "--分词后数据 词性简单组合归纳--");
		S_logger.Log.logger.info("" + "");
		// 词性归纳 简单地探索可组合字词
		List<String> setsAfterInput = testAfterPOS(setsInput, pos);
		S_logger.Log.logger.info("" + "");
		stringTemp = "";
		for (int i = 0; i < setsAfterInput.size(); i++) {
			stringTemp += "+" + setsAfterInput.get(i);
		}
		S_logger.Log.logger.info("" + stringTemp);
		S_logger.Log.logger.info("" + "");
		// 词性归纳 上面辅助应用于提高POS类计算前精确度
		// new DemoPOSTest().testPOS(setsAfterInput, pos);
		// 关闭
		commonTestInition.endEnvironment();
	}

	/*
	 * 关键字 if (3 <= strings[0].length() + connect.length() 处 --笔记
	 * 关于名词做副词的用法，如 -正面-地-，这种组合，因为地字有明确标识副词性结构
	 * 助词，所以在跟进语言处理仅仅需要一个检查-正面-前面是否有副词名词或者主语，
	 * 和地字后面是不是副词或者动词，就能比较准确地判断正面在这里是不是一个名词作
	 * 副词用的语法。所以间接说明，POS逻辑可以进行拓扑分解细化分层计算。我这里保持
	 * 严谨，仅组合 2 字词先。
	 * 
	 * 适用于双字 三字 四字 五字 六字 七字 八字的一次条件计算组合。增加准确度
	 * 
	 * --罗瑶光
	 */
	public List<String> testAfterPOS(List<String> sets, IMV_SQI pos) {
		List<String> setsOutput = new ArrayList<>();
		String connectsTemp = "";
		// 单字组合,支持4字最大关联
		for (int i = 0; i < sets.size(); i++) {
			int reg = 0;
			String string = sets.get(i);
			String[] strings = string.split("/");
			String connect = "";
			for (int j = 1; j < 2; j++) {
				if (i + j >= sets.size()) {
					continue;
				}
				String stringNext = sets.get(i + j);
				String[] stringsNext = stringNext.split("/");
				if (!(strings.length > 1 && stringsNext.length > 1
					&& strings[1].equals(stringsNext[1]))) {
					// 避免跳跃加载。
					break;
				}
				if (3 <= strings[0].length() + connect.length()
					+ stringsNext[0].length()) {
					break;
				}
				connect += stringsNext[0];// 仅组合单字且不超过4位
				reg += 1;
			}
			if (0 == reg) {
				// 没有关联就加原变量
				setsOutput.add(string);
				//S_logger.Log.logger.info("" + string + "----");
				connectsTemp += string + "----";
			} else {
				String stringConnect = strings[0] + connect + "/"
					+ strings[1];
				setsOutput.add(stringConnect);
				//S_logger.Log.logger.info("" + stringConnect + "----");
				connectsTemp += stringConnect + "----";
				i += reg;
			}
		}
		S_logger.Log.logger.info("" + connectsTemp);
		return setsOutput;
	}

	/*
	 * 这个函数主要展示罗瑶光先生对嵌套过多的 if 进行优化，优化流程和2019年的
	 * deta parser 的if 条件非门优化return 思绪一致。因为罗瑶光先生在 英** 也做
	 * 过条件优化，当时罗先生采用 提取法将多个if中的几个if进行提取出来包装成新函数
	 * 进行return。
	 * 
	 * 而在这个函数，罗先生采用离散迪.摩根律进行非门return。进行区别。公示给大家看
	 * 避免被一些大公司和个别社会人的团体非议。见182行, 191行和204行等。
	 * 
	 * --罗瑶光
	 * 
	 * */

	/*
	 * 关键字 if (!(wordPOS.contains("未知") || wordPOS.contains("形") 处 --描述
	 * 早期20000词汇因为是通过2018年FNLP直接loop花2分钟生成的，里面副词出现了整体性
	 * 问题，到现在2025年，这7年没有一个人告知我这个问题，我的自己工程又从来没有用过这副词
	 * 的逻辑，所以一直没碰，现在商业化测试呢，我罗瑶光就还是给出一个解决方案。就是所有出现
	 * 形容词和副词的词汇，就看他下一个词汇是 动词还是名词，动词就改副，名词就改形容词。即可
	 * 。或者统一语料库后缀形副词。我选择前者。这个词性属性不影响分词引擎。
	 * 
	 * 关键字 if (wordNext.equals("地")) { 处 --笔记
	 * Sonar-S1854协议 在wordPOS处无效。提示重复 = 定义。我思考了下这里不是无效的问题，
	 * 是没有用到wordPOS变量。加了句setsOutput.add(word + "/" + wordPOS);就好了，
	 * 所以sonar要修正这个提示错误。
	 * 
	 * --罗瑶光
	 * */
	@SuppressWarnings("unused")
	public List<String> testPOS(List<String> sets, IMV_SQI pos) {
		List<String> setsOutput = new ArrayList<>();
		int charPosition = 0;
		// 结果归纳
		// 1 名词 动词 形容词归纳
		S_logger.Log.logger.info("" + "-展示词性-");
		for (int j = 0; j < 1; j++) {
			for (int i = 0; i < sets.size(); i++) {
				String string = sets.get(i);
				if (string.replaceAll("\\s+", "").equals("")) {
					charPosition += string.length();
					continue;
				}
				String word = sets.get(i);
				Object wordObjectPOS = pos.get(string);
				if (null == wordObjectPOS) {
					String wordsPOS = word + "/" + "NULL";
					String wordsPOSs = wordsPOS + "----";
					S_logger.Log.logger.info("" + wordsPOSs);
					setsOutput.add(wordsPOS);
					continue;
				}
				String wordPOS = wordObjectPOS.toString();
				if (!(wordPOS.contains("未知") || wordPOS.contains("形")
					|| wordPOS.contains("副"))) {
					setsOutput.add(word + "/" + wordPOS);
					charPosition += string.length();
					continue;
				}
				if (i + 1 >= sets.size()) {
					setsOutput.add(word + "/" + wordPOS);
					charPosition += string.length();
					continue;
				}
				String wordNext = sets.get(i + 1);
				Object wordNextObjectPOS = pos.get(wordNext);
				if (null == wordNextObjectPOS) {
					setsOutput.add(word + "/" + wordPOS);
					charPosition += string.length();
					continue;
				}
				String wordNextPOS = wordNextObjectPOS.toString();
				if (wordNext.equals("地")) {
					wordPOS = "形谓词作副词";
				} else if (wordNext.equals("的")) {
					wordPOS = "形谓词作形容词";
				} else if (wordNextPOS.contains("动词")) {
					wordPOS = "形谓词作副词";
				} else if (wordNextPOS.contains("名词")) {
					wordPOS = "形谓词作形容词";
				}
				setsOutput.add(word + "/" + wordPOS);
				charPosition += string.length();
			}
		}
		return setsOutput;
	}
}
//输出观测 --发现量词含有形容词的属性，形容多少，程度等。
//Connected to the target VM, address: '127.0.0.1:50692', transport: 'socket'
//*环境初始化*
//*卷积环境 init*
//*PDE环境 init*
//*排序环境 init*
//*语料库表环境 init*
//*CNN type init*
//*ANN RNN DNN init*
//*六元催化 map*
//*花孢环境 init*
//*略先 init*
//*词性环境 init*
//*分词引擎 init*
//*自然语言环境 init*
//*其他枝叶 register*
//--分词后数据--
//
//-罗瑶光-先生-从-2018-年-10-月-开始-，-所有-个人-著作权-作品-，-全部-开源-，-到-现在-
//，-和-无数-群体-，-技术-社团-正面-地-交锋-7-年-，-一直-0-纠纷-，-罗瑶光-先生-认为-，
//-一件-作品-，-一个-事-物-，-如果-有-价值-，-就-应该-像-教材-一样-在-真实-的-环境-中-
//不断-地-实践-测试-和-论证-，-能-经得起-所有-人-长年累月-地-不断-地-挑剔-的-东西-，
//-才是-货真价实-的-，-罗瑶光-的-个人-著作权-作品-都是-互联网-，-大-数据-产业-领域-基础-
//作品-，-2018-年后-，-在-60-余-互联网-app-上-发布-德塔-开源-的-作品-，-罗瑶光-先生-
//认为-开源-作品-对-同行-呈现-包容-性-。-同时-对-垄断-的-产业-有-约束-性-。- -
//-展示词性-
//2018/NULL----
//
//2018/NULL----60/NULL----
//--分词后数据 词性简单归纳--
//
//=罗瑶光/人物名词=先生/名词=从/介词=2018/NULL=年/量词=10/数词=月/名词=开始/动词=，/标点=所有/名词=
//个人/名词=著作权/名词=作品/名词=，/标点=全部/副词=开源/未知=，/标点=到/动词=现在/时态词=，/标点
//=和/并列连词=无数/数词=群体/未知=，/标点=技术/名词=社团/名词=正面/名词=地/名词副词性结构助词=
//交锋/形谓词作形容词=7/名词=年/量词=，/标点=一直/形谓词作形容词=0/名词=纠纷/名词=，/标点=罗瑶光/人物名词=
//先生/名词=认为/动词=，/标点=一件/形谓词作形容词=作品/名词=，/标点=一个/量词=事/名词=物/名词=
//，/标点=如果/从属连词=有/动词=价值/名词=，/标点=就/副词=应该/情态词=像/形谓词作形容词=教材/名词=
//一样/形谓词=在/介词=真实/形谓词作形容词=的/结构助词=环境/名词=中/定名词=不断/形谓词作副词=
//地/形谓词作形容词=实践/名词=测试/动词=和/并列连词=论证/名词=，/标点=能/情态词=经得起/形谓词作形容词=
//所有/名词=人/名词=长年累月/名词=地/名词副词性结构助词=不断/形谓词作副词=地/形谓词作副词=挑剔/动词=
//的/结构助词=东西/名词=，/标点=才是/副词=货真价实/形谓词作形容词=的/结构助词=，/标点=罗瑶光/人物名词
//=的/结构助词=个人/名词=著作权/名词=作品/名词=都是/形谓词作形容词=互联网/名词=，/标点=
//大/形谓词作形容词=数据/名词=产业/名词=领域/名词=基础/名词=作品/名词=，/标点=2018/NULL=年后/未知=
//，/标点=在/介词=60/NULL=余/实体名=互联网/名词=app/实体名=上/名词=发布/动词=德塔/名词=
//开源/形谓词作形容词=的/结构助词=作品/名词=，/标点=罗瑶光/人物名词=先生/名词=认为/动词=开源/形谓词作形容词=
//作品/名词=对/介词=同行/名词=呈现/动词=包容/动词=性/名词=。/标点=同时/连词=对/介词=垄断/动词=
//的/结构助词=产业/名词=有/动词=约束/名词=性/名词=。/标点
//--分词后数据 词性简单组合归纳--
//
//
//+罗瑶光/人物名词+先生/名词+从/介词+2018/NULL+年/量词+10/数词+月/名词+开始/动词+，/标点+所有/名词+
// 个人/名词+著作权/名词+作品/名词+，/标点+全部/副词+开源/未知+，/标点+到/动词+现在/时态词+，/标点+
// 和/并列连词+无数/数词+群体/未知+，/标点+技术/名词+社团/名词+正面/名词+地/名词副词性结构助词+
// 交锋/形谓词作形容词+7/名词+年/量词+，/标点+一直/形谓词作形容词+0/名词+纠纷/名词+，/标点+
// 罗瑶光/人物名词+先生/名词+认为/动词+，/标点+一件/形谓词作形容词+作品/名词+，/标点+一个/量词+
// 事物/名词+，/标点+如果/从属连词+有/动词+价值/名词+，/标点+就/副词+应该/情态词+像/形谓词作形容词+
// 教材/名词+一样/形谓词+在/介词+真实/形谓词作形容词+的/结构助词+环境/名词+中/定名词+不断/形谓词作副词+
// 地/形谓词作形容词+实践/名词+测试/动词+和/并列连词+论证/名词+，/标点+能/情态词+经得起/形谓词作形容词+
// 所有/名词+人/名词+长年累月/名词+地/名词副词性结构助词+不断/形谓词作副词+地/形谓词作副词+挑剔/动词+
// 的/结构助词+东西/名词+，/标点+才是/副词+货真价实/形谓词作形容词+的/结构助词+，/标点+罗瑶光/人物名词+
// 的/结构助词+个人/名词+著作权/名词+作品/名词+都是/形谓词作形容词+互联网/名词+，/标点+大/形谓词作形容词+
// 数据/名词+产业/名词+领域/名词+基础/名词+作品/名词+，/标点+2018/NULL+年后/未知+，/标点+在/介词+
// 60/NULL+余/实体名+互联网/名词+app/实体名+上/名词+发布/动词+德塔/名词+开源/形谓词作形容词+
// 的/结构助词+作品/名词+，/标点+罗瑶光/人物名词+先生/名词+认为/动词+开源/形谓词作形容词+作品/名词+
// 对/介词+同行/名词+呈现/动词+包容/动词+性/名词+。/标点+同时/连词+对/介词+垄断/动词+的/结构助词+
// 产业/名词+有/动词+约束/名词+性/名词+。/标点
//Disconnected from the target VM, address: '127.0.0.1:50728', transport: 'socket'
//
//
