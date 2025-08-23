package S_A.OSV.ESU.standard;

import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_E;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210507
//选中一个cell 进行改变
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class U_CellStandard {
    public List<String> txtToList() {
        List<String> dic_list = new ArrayList<>();
        return dic_list;
    }

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

    public static IMV_SIQ UpdateCellORM(String tabKey, String rowId
        , String cellName
        , String cellValue) {
        IMV_SIQ map = null;
        try {
            PLORM_C orm = new PLORM_E();
            orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
                .withTableUpdate(tabKey).withCondition("or")
                .let("ID").equalTo(rowId)
                .checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
                .checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
                .withCulumnValue(cellName, cellValue)
                .finalE(true);
            //map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }

    public static IMV_SIQ UpdateCellORMByRowId(String rootPath
        , String baseName, boolean unTest
        , String tabKey, String rowId, String cellName, String cellValue) {
        IMV_SIQ map = null;
        try {
            PLORM_C orm = new PLORM_E();
            orm.startAtRootDir(rootPath).withBaseName(baseName)
                .withTableUpdate(tabKey).withCondition("or")
                .let("ID").equalTo(rowId)
                .checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
                .checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
                .withCulumnValue(cellName, cellValue)
                .finalE(unTest);
            //map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }

    public static IMV_SIQ UpdateCellORMByEquals(String rootPath
        , String baseName
        , boolean unTest, String tabKey, String conditionSubject
        , String conditionObject
        , String cellName, String cellValue) {
        IMV_SIQ map = null;
        try {
            PLORM_C orm = new PLORM_E();
            orm.startAtRootDir(rootPath).withBaseName(baseName)
                .withTableUpdate(tabKey).withCondition("or")
                .let(conditionSubject).equalTo(conditionObject)
                .checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
                .checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
                .withCulumnValue(cellName, cellValue)
                .finalE(unTest);
            //map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
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
    //  condition 可以用uid in 或者 uid== 来实现.这样会导致计算变慢, 所以 设计rowid culumnid的数字比较选项是有必要的.

    public static IMV_SIQ UpdateCellPLSQL(String tabKey, String rowId
        , String cellName
        , String cellValue) {
        IMV_SIQ map = null;
        try {
            String plsql = "setRoot:C:/DetaDB1;" +
                "baseName:ZYY;" +
                "tableName:" + tabKey + ":update;" +
                "condition:or:ID|==|" + rowId + ";" +
                "culumnValue:" + cellName + ":" + cellValue + ";";
            map = M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }
}
