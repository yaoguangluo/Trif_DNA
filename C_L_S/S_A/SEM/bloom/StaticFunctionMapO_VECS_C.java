package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import S_A.pheromone.IMV_SIQ;

import java.io.IOException;
import java.util.List;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapO_VECS_C {
	public static IMV_SIQ annotationMap = new IMV_SIQ();

	public void SortStringDemo(App NE);

	// TransactionDelegate {逻辑型 应用接口略。
	public IMV_SIQ transactionLogin(App NE);

	public IMV_SIQ transactionRegister(App NE);

	// 养疗经读表函数
	// DBReadMode{
	public void aCommonReadWay(App NE);

	public void readDBInTXTWay(App NE);

	public void readDBInBaseWay(App NE);

	public void readDBInWebWay(App NE);

	public O_V.OPM.ESU.admin.PLSQLSectionPanel PLSQLSectionPanel(App NE);

	public O_V.OPM.ESU.admin.VPCSRestPanel VPCSRestPanel(App NE);

	public O_V.OPM.ESU.admin.YouBiaoSectionPanel YouBiaoSectionPanel(App NE);

	// plsearchShell
	public O_V.OSA.shell.PL_XA_C PL_XA_C(App NE);

	// XA_ShellQ_JoinRows_E {
	public Object selectRowsByAttributesOfJoinCondition(App NE);

	public Object selectRowsByAttributesOfJoinAggregation(App NE);

	public Object selectRowsByAttributesOfJoinGetCulumns(App NE);

	public Object selectRowsByAttributesOfJoinRelation(App NE);

	// XA_ShellQ_NestRows_E {
	public Object selectRowsByAttributesOfNestCondition(App NE);

	public Object selectRowsByAttributesOfNestAggregation(App NE);

	public Object selectRowsByAttributesOfNestGetCulumns(App NE);

	public Object selectRowsByAttributesOfNestRelation(App NE);

	// XA_ShellQ_Rows_E {
	public List<IMV_SIQ> selectRowsByAttribute(App NE);

	public void XA_ShellQ_Rows_E_main(App NE);

	// 今天看了下发现我的数据库 没有分页, 以后会设计一个文件夹最大为3000 rows
	// 一页, 先不管了, shell 用不到sheets逻辑。
	// 罗瑶光20210927
	public IMV_SIQ selectRowsByTablePath(App NE);

	// db替换shell中 20210927
	public Object selectRowsByAttributesOfCondition(App NE);

	// 20210927 注释下 稍后替换
	// 先设计成 plsearch 语法和 plsql 语法通用, 方便我之后的plorm 统一一种方式扩展
	// pladmin
	public List<IMV_SIQ> selectRowsByAttributesOfAggregation(App NE);

	public Object selectRowsByAttributesOfGetCulumns(App NE);

	// PLETL命令一多, 之后准备分出去
	// 罗瑶光 20211010
	public Object selectRowsByAttributesOfPLETL(App NE);

	public Object selectRowsByAttributesOfPLTCP(App NE);

	// XA_ShellTables{
	// 先把接口做足, 罗瑶光20210925
	// 将表变成表映射
	public boolean addNewSearchShellTable(App NE);

	// 按sonar方式重复函数分离
	public Object[] getNewSearchShellTableSpecFromDefaultTableModel(App NE);

	// 按sonar方式重复函数分离
	public Object[][] getNewSearchShellTableDataFromDefaultTableModel(App NE);

	// 设计个row的结合表map内存结构 用于shell的表头搜索。
	// public Row[]
	// getNewSearchShellTableRowsFromDefaultTableModel(App NE);

	// 设计个row的结合表map内存结构 用于shell的表头搜索。
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(App NE);

	// 将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。
	// public boolean addNewSearchShellTable(App NE);

	// 将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。 object data 稍后准备 用
	// _S_ 元基替换。
	public boolean addNewSearchShellTableWithObjectData(App NE);

	// shell映射封装
	// public boolean addNewSearchShellTable(App NE);

	// Reflection map 表头方式存储
	// 将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。 object data 稍后准备 用
	// _S_ 元基替换。
	public boolean addNewSearchShellTableWithObjectDataReflectionDBRows(App NE);

	// Reflection map 表头方式存储
	// shell映射封装
	public boolean addNewSearchShellTableReflectionDBRows(App NE);

	// 然后所有养疗经的jtable表全部基于这个文件函数 进行shell 封装。与数据库的内存映射分离。
	public boolean addInitSearchShellTable(App NE);

	// PLETL_C{
	public boolean doNeroFlow(App NE);

	// ReadChinese extends Thread implements Runnable{
	public O_V.OSI.AOP.neo.tts.ReadChinese ReadChinese(App NE);

	// RestMedicinePort_E {
	public App kernel(App NE);

	public IMV_SIQ getMedicineBookFeedbackZY(App NE);

	public IMV_SIQ getMedicineBookFeedbackXY(App NE);

	public IMV_SIQ getMedicineBookFeedbackZT(App NE);

	public IMV_SIQ getMedicineBookFeedbackXT(App NE);

	public IMV_SIQ getMedicineBookFeedbackYT(App NE);

	public IMV_SIQ getMedicineBookFeedback(App NE);

	public Object doSearch(App NE);

	// VPC extends ServerVPC_Standard {
	// 逐步分离出来, 方便vpcs 之后继承。
	public String forwardDB(App NE);

	public String forwardVPC(App NE);

	// VPCBackEnd {
	// public static RestLoginPort restLoginPort;
	public String forwardVPCBackEnd(App NE);

	// VPCYangliaojing {
	public String forwardVPCYangliaojing(App NE);

	public String getCode(App NE);

	public String getFilePath(App NE);

	// OSI.AOP.VPC.server 启动例子
	// PL ETL shell
	// E_pl_XA_E {
	// public IMV_SIQ E_pl_XA(App NE);

	public IMV_SIQ E_pl_XA(App NE) throws InterruptedException, IOException;

	// P_AO_pl_XA {
	public void P_AggregationLimitMap(App NE);

	// 分出去
	// public void P_PletlLimitMap(App NE);

	// P_AO_PLETL {
	public void P_PletlLimitMap(App NE) throws InstantiationException;

	// P_AO_PLTCP {
	public void P_PltcpLimitMap(App NE);

	// P_CO_pl_XA_X_Cache extends P_CO_pl_XA_XCDX {
	public void P_Cache(App NE);

	// P_CO_pl_XA_X_Kernel extends P_CO_pl_XA_XCDX {
	// 比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
	// 这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了,
	// 时间点大概在2019年1月后, 我先调通下, 之后朔源.
	// 准备验算下20210406 罗瑶光
	public void P_kernel(App NE);

	// P_kernel等比复制过来的search shell组件, 我要替换的是数据库储值,
	// jtable表做output
	// 把jtable数据表的数据 变成数据库的db映射, 传入参数是dma的每一行文件的集合,
	// DefaultTableModel 的 Object[][] huaRuiJiJtable 对应
	// DBTablePath
	// readDBTableRowIndexFile对应 row id
	// huaRuiJiJtableCulumns 对应 culumn
	// jtable 太上层, 用它的spec 速度会很慢。所以用object[][] 先
	// 罗瑶光 20210924
	// 出现一个问题, 我的table db是非线性map 结构, 自带表头key, 而data 是矩阵,
	// 下面逻辑要全部改掉
	public void P_kernel_search(App NE);

	// P_CO_pl_XA_X_Map extends P_CO_pl_XA_XCDX {
	// 以后优化成统一对象输出, 不需要再转换。2019-1-15 tin
	public IMV_SIQ rowToRowMap(App NE);

	// 将rowToRowMap 进行逆向 RowMapToRow 一来验证, 2来找最小计算模型,
	// 方便下一步表格编译计算。
	// 罗瑶光202109302339
	public Row rowMapToRow(App NE);

	// 猫腻哥 把我pmap的output 都改了, 今天一查问题全出来了。20210927, 问题已找到
	// , 不是web 被改模式, 上传commit的时候, 本地被改了,
	// 懒得管, 把P_Map 改成 shellP_Map
	public void P_Map(App NE);

	// P_I_CulumnsPL_XA {
	public Object getCulumnsMapWithAs(App NE);

	public Object getCulumnsMap(App NE);

	public Object P_GetCulumnsMap(App NE);

	// P_RelationPL_XA {
	public void P_AndMap(App NE);

	public void P_OrMap(App NE);

	// Pl_XA_Command_E {
	public void P_SetRoot(App NE);

	public void P_BaseName(App NE);

	public void P_TableName(App NE);

	public void P_YLJOperation(App NE);

	public void P_ListNeedStart(App NE);

	public void P_Join(App NE);

	public void P_E(App NE) throws InterruptedException, IOException;
	// 处理机中心, 别急, 准备验证 罗瑶光

	// plsql函数执行指令 正在检查中 罗瑶光 20210405
	public void P_Check(App NE) throws InterruptedException, IOException;

	public void P_StoreValues(App NE);

	// 之后准备设计成工厂类 或者 单例类 bean
	public void P_fileOperations(App NE);

	// ShellReplace {
	public void replaceString(App NE);

	// 稍后设计成map来存储这些String条件变量。
	public void replaceStringWithFileName(App NE);

	// 稍后变线程
	public void start(App NE);

	// 文件名对应筛选
	// public void replaceStringWithFileName(App NE);

	// 文件后缀筛选
	public void replaceStringWithFileType(App NE);

	// 文件大小筛选
	public void replaceStringWithFileSize(App NE);

	// 文件大小筛选
	public void replaceStringWithFileLines(App NE);

	public void mainShellReplace(App NE);

	// 设计一种简单的log模式先。
	public void replaceStringWithLogRecording(App NE);
}
