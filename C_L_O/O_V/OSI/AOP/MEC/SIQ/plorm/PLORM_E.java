package O_V.OSI.AOP.MEC.SIQ.plorm;

import M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PLORM_E implements PLORM_C{
	private String PLSQL= "";
	private String[] PLSQLArray;
	private IMV_SIQ map;
	public String getPLSQL() {
		return PLSQL;
	}

	public void I_PLSQL(String pLSQL) {
		PLSQL= pLSQL;
	}

	public PLORM_E startAtRootDir(String rootAddress) {
		PLSQL= Const.SET_ROOT+ Const.COLON+ rootAddress
				+ Const.SEMICOLON;
		return this;
	}
	
	public PLORM_E withBaseName(String baseName) {
		PLSQL+= Const.SEMICOLON+ Const.BASE_NAME+ Const.COLON
				+ baseName;
		return this;
	}
	//
	public PLORM_E withTableSelect (String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.SELECT;
		return this;
	}

	public PLORM_E withTableCreate(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.CREATE;
		return this; 
	}
	
	public PLORM_C withTableDrop(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.DROP;
		return this; 
	}
	
	public PLORM_E withTableDelete(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.DELETE;
		return this; 
	}
	
	public PLORM_E withTableInsert(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.INSERT;
		return this; 
	}
	
	public PLORM_E withTableUpdate(String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.UPDATE;
		return this; 
	}
	
	public PLORM_E withCondition(String conditionType) {
		PLSQL+= Const.SEMICOLON+ Const.CONDITION+ Const.COLON
				+ conditionType;
		return this;
	}

	public PLORM_E let(String leftSet) {
		PLSQL+= Const.COLON+ leftSet;
		return this;
	}

	public PLORM_E lessThanAndEqualTo(String compareSet) {
		PLSQL+= Const.LESS_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORM_E equalTo(String compareSet) {
		PLSQL+= Const.EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORM_E lessThan(String compareSet) {
		PLSQL+= Const.LESS_THAN+ compareSet;
		return this;
	}
	
	public PLORM_E greatThan(String compareSet) {
		PLSQL+= Const.GREAT_THAN+ compareSet;
		return this;
	}
	
	public PLORM_E greatThanAndEqualTo(String compareSet) {
		PLSQL+= Const.GREAT_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORM_E notEqualTo(String compareSet) {
		PLSQL+= Const.NOT_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PLORM_E in(String compareSet) {
		PLSQL+= Const.IN+ compareSet;
		return this;
	}
	
	public PLORM_E notIn(String compareSet) {
		PLSQL+= Const.NOT_IN+ compareSet;
		return this;
	}
	
	public PLORM_E equals(String compareSet) {
		PLSQL+= Const.EQUALS+ compareSet;
		return this;
	}
	
	public PLORM_E notEquals(String compareSet) {
		PLSQL+= Const.NOT_EQUALS+ compareSet;
		return this;
	}
	
	public PLORM_E innerJoinWithTable(String baseName, String tableName) {
		PLSQL+= Const.SEMICOLON+ Const.JOIN+ Const.COLON+ baseName
				+ Const.COLON+ tableName;
		return this;
	}
	
	public PLORM_E withRelation(String relationType) {
		PLSQL+= Const.SEMICOLON+ Const.RELATION+ Const.COLON
				+ relationType;
		return this;
	}
	
	public PLORM_E as(String compareSet) {
		PLSQL+= Const.AS+ compareSet;
		return this;
	}
	
	public PLORM_E upTo(String compareSet) {
		PLSQL+= Const.UP_TO+ compareSet;
		return this;
	}
	
	public PLORM_E withAggregation(String aggregationType) {
		PLSQL+= Const.SEMICOLON+ Const.WITH_AGGREGATION
				+ Const.COLON+ aggregationType;
		return this;
	}
	
	public PLORM_E getCulumns() {
		PLSQL+= Const.SEMICOLON+ Const.GET_CULUMNS;
		return this;
	}
	
	public PLORM_E changeCulumnName(String newCulumnName, String oldCulumnName) {
		PLSQL+= Const.SEMICOLON+ Const.CHANGES_CULUMN_NAME+ Const.COLON
				+ newCulumnName+ Const.COLON+ oldCulumnName;
		return this;
	}
	
	public PLORM_E withCulumnName(String culumnName, String dataType) {
		PLSQL+= Const.SEMICOLON+ Const.CULUMN_NAME+ Const.COLON+ culumnName
				+ Const.COLON+ dataType;
		return this;
	}
	
	public PLORM_E withCulumnValue(String culumnName, String culumnValue) {
		PLSQL+= Const.SEMICOLON+ Const.CULUMN_VALUE+ Const.COLON+ culumnName
				+ Const.COLON+ culumnValue;
		return this;
	}

	public PLORM_C exec(boolean b)  {
		map= E_PLSQL_E.E_PLORM(this, true);
		return this;
	}

	@Override
	public PLORM_C checkErrors(String string) {
		return this;
	}

	@Override
	public PLORM_C fixErrors(String string) {
		return this;
	}

	@Override
	public PLORM_C finalE(boolean b)  {
		map= E_PLSQL_E.E_PLORM(this, true);
		return this;
	}

	@Override
	public IMV_SIQ returnAsMap() {
		return this.map;
	}

	@Override
	public PLORM_C checkAndFixPlsqlGrammarErrors() {
		//string to array
		this.PLSQLArray= PLSQL.split(Const.SEMICOLON);
		//条件检查 1 过滤  2 修改 3 语义检测
		//1 
		for(int i= 1; i< PLSQLArray.length; i++) {
			//1.1 过滤相同句型
			//1.2 过滤无效字符
			//1.3 过滤攻击代码
			if(PLSQLArray[i].equalsIgnoreCase(PLSQLArray[i- 1])) {
				PLSQLArray[i]= "";
			}
			PLSQLArray[i]= PLSQLArray[i].replaceAll(">+", ">");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("<+", "<");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\!+", "!");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\~+", "~");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\@+", "@");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\&&+", "&&");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\|\\|+", "||");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\[+", "[");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\]+", "]");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\:+", ":");
			PLSQLArray[i]= PLSQLArray[i].replaceAll("\\s+", "");
		}
		//2
		//2.1 修改错误比较符号
		//2.2 修改错误语法关键字
		//2.3 修改错误标注符号
		
		//3
		//3.1 检测是否有关键字前后句段混乱
		//3.2 检测是否有关键字 格式 倒置
		//3.3 检测是否有关键字 句型 倒置
		
		//rerturn
		String string= "";
		for(int i= 0; i< PLSQLArray.length; i++) {
			string+= PLSQLArray[i]+ Const.SEMICOLON;
		}
		PLSQL= string;
		return this;
	}

	@Override
	public PLORM_C checkAndFixSystemEnvironmentErrors() {
		return this;
	}
}
