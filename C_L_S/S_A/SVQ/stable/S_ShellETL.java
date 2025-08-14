package S_A.SVQ.stable;

import S_A.pheromone.IMV_SIQ;

import java.util.Map;

//S_Token.ETL_SYMBOL_SMILL
//集合下shell 计算符号
//我思考了下如果用中文设计变量, 一旦出现乱码, 那么中文变量对应中文字符串都是乱码, 不好修复, 于是用英文做变量先。
//罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class S_ShellETL{
	//稍后合并 
	public static final String SHELL_ETL_FINISH= "完成";
	public static final String SHELL_ETL_CONFIG= "配置生成";
	public static final String SHELL_ETL_DID_CONFIG= "configured" ; //configured
	public static final String SHELL_ETL_MID_SHELL= "midShell";
	public static final String SHELL_ETL_DOWN_SHELL= "downShell";
	public static final String SHELL_ETL_TIN_SHELL_ETL= "TinShellETL";
	public static final String SHELL_ETL_JOIN_BASE_NAME= "joinBaseName";
	public static final String SHELL_ETL_SLASH= "/";
	public static final String SHELL_ETL_CONDITION= "condition";
	public static final String SHELL_ETL_CULUMNNAME= "culumnName";
	public static final String SHELL_ETL_ROWVALUE= "rowValue";
	public static final String SHELL_ETL_SMALL= "<";
	public static final String SHELL_ETL_LESS_THAN= "-lt";//作者思维 这个缩写写法来自 linux 的 c shell
	public static final String SHELL_ETL_LESS_AND_EQUAL_TO= "<=";
	public static final String SHELL_ETL_LESS_AND_EQUAL_TO_R= "=<";
	public static final String SHELL_ETL_LESS_THAN_AND_EQUAL_TO= "-lte";//作者思维 这个缩写写法来自 linux 的 c shell
	public static final String SHELL_ETL_DOUBLE_EQUALS= "==";
	public static final String SHELL_ETL_SIMPLE_EUQALS= "=";
	public static final String SHELL_ETL_TRIPAL_EQUALS= "===";//作者思维 这个缩写写法来自 javascript的 全等于
	public static final String SHELL_ETL_GREATER_AND_EQUAL_TO= ">=";
	public static final String SHELL_ETL_GREATER_AND_EQUAL_TO_R= "=>";
	public static final String SHELL_ETL_GREATER_THAN_AND_EQUAL_TO= "-gte";//作者思维 这个缩写写法来自 linux 的 c shell
	public static final String SHELL_ETL_GREATER= ">";
	public static final String SHELL_ETL_GREATER_THAN= "-gt";//作者思维 这个缩写写法来自 linux 的 c shell
	public static final String SHELL_ETL_STRING_LENGTH_GREATER_THAN= "字符串长度大于";
	public static final String SHELL_ETL_STRING_LENGTH_LESS_THAN= "字符串长度小于";
	public static final String SHELL_ETL_NOT_EUQAL_TO= "!=";
	public static final String SHELL_ETL_NOT_EUQAL_TO_R= "=!";
	public static final String SHELL_ETL_CONTANS= "包含";
	public static final String SHELL_ETL_FILTER_BY= "过滤掉";
	public static final String SHELL_ETL_DOES_NOT_CONTANS= "不包含";
	public static final String SHELL_ETL_EQUAL= "equal";
	public static final String SHELL_ETL_DOES_NOT_EQUALS= "!equal";
	public static final String SHELL_ETL_IN= "in"; //作者思维 这个单词来自relational SQL 的 in
	public static final String SHELL_ETL_COMDOT= ", ";
	public static final String SHELL_ETL_NOT_IN= "!in";
	
	public static Map<String, String> storeValue= new IMV_SIQ();
}
