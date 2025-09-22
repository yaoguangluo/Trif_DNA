package Q_V.OSV.VCQ.standard;

import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_E;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210506
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class DictionaryPLSQLStandardDB {
    public List<String> txtToList() {
        List<String> dic_list = new ArrayList<>();
        return dic_list;
    }

    public static IMV_SIQ bootORMReadDBInCommonWay(String tabKey) {
        IMV_SIQ map = null;
        try {
            PLORM_C orm = new PLORM_E();
            map = orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
                .withTableSelect(tabKey).withCondition("or")
                .let("ID").lessThanAndEqualTo("3000")
                .checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
                .checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
                .finalE(true).returnAsMap();
            //map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }

    public static IMV_SIQ bootORMReadDBByRangeRowID(String rootPath, String baseName
        , boolean unTest, String tabKey, String RangeRowIDCount) {
        IMV_SIQ map = null;
        try {
            PLORM_C orm = new PLORM_E();
            map = orm.startAtRootDir(rootPath).withBaseName(baseName)
                .withTableSelect(tabKey).withCondition("or")
                .let("ID").lessThanAndEqualTo(RangeRowIDCount)
                .checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
                .checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
                .finalE(unTest).returnAsMap();
            //map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }

    //下面这些例子, 本人只是给大家一些更多的参考而已.
    public static IMV_SIQ bootORMReadDBByLessThanAndEqualTo(String rootPath
        , String baseName, String conditionSubject, String conditionObject
        , boolean unTest, String tabKey) {
        IMV_SIQ map = null;
        try {
            PLORM_C orm = new PLORM_E();
            map = orm.startAtRootDir(rootPath).withBaseName(baseName)
                .withTableSelect(tabKey).withCondition("or")
                .let(conditionSubject).lessThanAndEqualTo(conditionObject)
                .checkAndFixPlsqlGrammarErrors()//准备完善plsql orm语言 的语法检查函数 和修复函数。
                .checkAndFixSystemEnvironmentErrors()//准备完善plsql orm语言 的系统环境检查函数和修复函数。
                .finalE(unTest).returnAsMap();
            //map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }

    public static IMV_SIQ bootPLSQLReadDBInCommonWay(String tabKey) {
        IMV_SIQ map = null;
        try {
            String plsql = "setRoot:C:/DetaDB1;" +
                "baseName:ZYY;" +
                "tableName:" + tabKey + ":select;" +
                "condition:or:ID|<=|3000;";
            map = M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }
}
