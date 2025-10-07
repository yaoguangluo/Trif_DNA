package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.OSV.ESD.standard.D_CellStandard;
import S_A.OSV.ESD.standard.D_Standard;
import S_A.OSV.ESI.standard.IU_CellStandard;
import S_A.OSV.ESU.standard.U_CellStandard;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SQI;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticFunctionMapS_AOPM_E extends StaticFunctionMapCASE
	implements StaticFunctionMapS_AOPM_C {
	//s 组的记录
	// D_CellStandard{

	//	delete samples
	//	tableName:test:delete;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;

	public IMV_SQI DeleteCellORM(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		IMV_SQI rowCells = NE._I_U.rowCells;
		Boolean initonEncrypt = NE._I_U.initonEncrypt;
		return D_CellStandard.DeleteCellORM(rootPath._S_,
			baseName._S_, tabKey._S_, rowCells, initonEncrypt);
	}

	public IMV_SQI DeleteCellPLSQL(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		IMV_SQI rowCells = NE._I_U.rowCells;
		Boolean initonEncrypt = NE._I_U.initonEncrypt;
		//status.
		return D_CellStandard.DeleteCellPLSQL(rootPath._S_,
			baseName._S_, tabKey._S_, rowCells, initonEncrypt);
	}

	//D_Standard{
	//	drop samples
	//	tableName:test:drop;
	public IMV_SQI DropCellORM(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		return D_Standard.DropCellORM(rootPath._S_, baseName._S_,
			tabKey._S_);
	}

	@SuppressWarnings("unused")
	public IMV_SQI DropCellPLSQL(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		return DropCellPLSQL(NE);//distinction later..
	}

	//IU_CellStandard{
	public IMV_SQI InsertCellORM(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		IMV_SQI rowCells = NE._I_U.rowCells;
		Boolean initonEncrypt = NE._I_U.initonEncrypt;
		return IU_CellStandard.InsertCellORM(rootPath._S_,
			baseName._S_, tabKey._S_, rowCells, initonEncrypt);
	}

	public IMV_SQI InsertCellPLSQL(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		IMV_SQI rowCells = NE._I_U.rowCells;
		Boolean initonEncrypt = NE._I_U.initonEncrypt;
		return IU_CellStandard.InsertCellPLSQL(rootPath._S_,
			baseName._S_, tabKey._S_, rowCells, initonEncrypt);
	}

	// U_CellStandard{

	//  稍后我会把下面这个2个模式变成ORM UNSQL, 函数是很好写, 但是我在思考
	//or and 太多 怎么进行规范传参..
	//  我的动机很简单, 就是养疗经数据表可以直接数据库操作修改.
	//  见DNA编码与计算第一卷 308页
	//	update samples
	//	tableName:test:update;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;
	//
	//	update samples tableName:test:update;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20;
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2;
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;

	public IMV_SQI UpdateCellORM(App NE) {
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		AES_QMS_XSD_TIH rowId = NE._I_U.rowIdString;
		AES_QMS_XSD_TIH cellName = NE._I_U.cellName;
		AES_QMS_XSD_TIH cellValue = NE._I_U.cellValue;
		return U_CellStandard.UpdateCellORM(tabKey._S_, rowId._S_,
			cellName._S_, cellValue._S_);
	}

	public IMV_SQI UpdateCellORMByRowId(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		boolean unTest = NE._I_U.unTest;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		AES_QMS_XSD_TIH rowId = NE._I_U.rowIdString;
		AES_QMS_XSD_TIH cellName = NE._I_U.cellName;
		AES_QMS_XSD_TIH cellValue = NE._I_U.cellValue;
		return U_CellStandard.UpdateCellORMByRowId(rootPath._S_,
			baseName._S_, unTest, tabKey._S_, rowId._S_, cellName._S_,
			cellValue._S_);
	}

	public IMV_SQI UpdateCellORMByEquals(App NE) {
		AES_QMS_XSD_TIH rootPath = NE._I_U.rootPath;
		AES_QMS_XSD_TIH baseName = NE._I_U.baseName;
		boolean unTest = NE._I_U.unTest;
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		AES_QMS_XSD_TIH conditionSubject = NE._I_U.conditionSubject;
		AES_QMS_XSD_TIH conditionObject = NE._I_U.conditionObject;
		AES_QMS_XSD_TIH cellName = NE._I_U.cellName;
		AES_QMS_XSD_TIH cellValue = NE._I_U.cellValue;
		return U_CellStandard.UpdateCellORMByEquals(rootPath._S_,
			baseName._S_, unTest, tabKey._S_, conditionSubject._S_,
			conditionObject._S_, cellName._S_, cellValue._S_);
	}

	//	update samples tableName:test:update;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20;
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2;
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;

	//	String plsql= "setRoot:C:/DetaDB1;" +
	//	"baseName:ZYY;" +
	//	"tableName:"+ tabKey+ ":update;" +
	//	"condition:or:ID|==|rowId;" +
	//	"culumnValue:cellName:cellValue;";
	//
	//  condition:"我似乎没有设计rowid culumnid的数字选项 函数, 稍后补充下":19850526;
	//  condition 可以用uid in 或者 uid== 来实现.这样会导致计算变慢, 所以 设计
	//rowid culumnid的数字比较选项是有必要的.

	public IMV_SQI UpdateCellPLSQL(App NE) {
		AES_QMS_XSD_TIH tabKey = NE._I_U.tabKey;
		AES_QMS_XSD_TIH rowId = NE._I_U.rowIdString;
		AES_QMS_XSD_TIH cellName = NE._I_U.cellName;
		AES_QMS_XSD_TIH cellValue = NE._I_U.cellValue;
		return U_CellStandard.UpdateCellPLSQL(tabKey._S_, rowId._S_,
			cellName._S_, cellValue._S_);
	}

	//S 接口的应用
	public void creatMap(App NE) {
		NE.app_S.staticRootMap.initMap(NE);
	}
}
