package O_V.OSM.shell;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import S_A.SixActionMap.WorkVerbaMap;
import S_A.pheromone.IMV_SIQ;
/*
 * Thinking， should I make a English version about this presentation？
 * COZ I logged in GitHub just now and checked the traffic history，
 * in amazing where I saw so much unique IPs from the world-wides. 
 * Thinking.. what does the feeling about those IPs, when they saw 
 * a complex and discrete Chinese annotations and explanations. 
 * 
 * Hens I may do something in a right way. On the way. and by the way
 * continue a Chinese minding now. 
 * 
 * -- YaoguangLuo  
 * 
 * */
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

/*
 * 看到这些变量在增加，我在思考，计算数据的关系很多思绪可以从关系方式数据库的范式定义
 * 中寻找答案，所以年轻人一定要把数据库原理这门课学好。WorkVerbaMap在华瑞集中的逻辑
 * 决策是1:1的关系，而命令句和map的关系是 M:1 的关系。而里面的单句延伸是1:M的关系，
 * 延伸的属性和指令集是 M:N 关系。指令集的计算逻辑是sigma范式，指令集的推导笛卡尔关系。
 * 关于这六层关系要进行计算优化，自然要用到梯度微积分。所以年轻人高等数学和计算机统计
 * 要学好。将这6层关系化简后，形成的BPM和UML是不是要更近管理维护？所以离散数学也要学好。
 * 
 * --罗瑶光
 * 
 * */
public class CommandClass {
	// 工作机
	public WorkVerbaMap workVerbaMap;
	// 单句的命令
	public String command;
	// 单句的延伸
	public String commandAcknowledge;

	// 单句的多种延伸 
	public String[] acknowledge;
	public String[] acknowledgeSwap;
	// 单句的变换延伸
	public String commandSwap;
	// 单句的分解延伸
	public List<String> commandLists;
	//
	public String[] stringSets;
	public Map<String, String[]> stringSetsMap = new HashMap<>();
	// 单句的预处理
	public List<String> _IMV_SIQ_SS_ = new ArrayList<>();
	/*
	 * 稍后这些关于当前的命令句对应的workVerbaMap中需要clear的对象都走这个类，
	 * 免得以后修改或者增加条件，不谨慎漏了几个clear。我认为这是一种计算关系的优 化方式，属于聚类优化计算逻辑。
	 * 
	 * 随着条件越来越多，之后会统一组合优化这个map关系，然后剔除掉一些成员变量。
	 * --trif later
	 * 
	 * --罗瑶光
	 * 
	 */
	public IMV_SIQ_SS _IMV_SIQ_SS = new IMV_SIQ_SS();
	public IMV_SIQ_S_ _IMV_SIQ_S_ = new IMV_SIQ_S_();
	public IMV_SIQ cartesianRootMap = new IMV_SIQ();
	public IMV_SIQ cartesianRootWithScaleMap = new IMV_SIQ();
	public IMV_SIQ cartesianRootRelationMap = new IMV_SIQ();
	public IMV_SIQ cartesianWorkActionsRights = new IMV_SIQ();
	public IMV_SIQ cartesianWorkActionsPositions = new IMV_SIQ();
	public IMV_SIQ cartesianWorkActions_pos = new IMV_SIQ();
	public IMV_SIQ normalizationalWorkActionsRights = new IMV_SIQ();
	public IMV_SIQ normalizationalWorkActionsPositions = new IMV_SIQ();
	public IMV_SIQ complementedWorkActionsRights = new IMV_SIQ();
	public IMV_SIQ complementedWorkActionsPositions = new IMV_SIQ();
	public IMV_SIQ unknown_map = new IMV_SIQ();

}