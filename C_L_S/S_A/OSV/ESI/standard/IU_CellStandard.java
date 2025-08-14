package S_A.OSV.ESI.standard;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_E;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210510
//插入一行完整的数据.
//我没有测试, 现在养疗经还用不到, 优先级稍后.
//稍后会考虑不完整的插入情况 赋值empty 或null.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class IU_CellStandard {
    public List<String> txtToList() {
        List<String> dic_list = new ArrayList<>();
        return dic_list;
    }

    public static IMV_SIQ InsertCellORM(String rootPath, String baseName
        , String tabKey, IMV_SIQ rowCells, Boolean initonEncrypt) {
        Iterator<String> iterators = rowCells.keySet().iterator();
        IMV_SIQ map = null;
        try {
            PLORM_C orm = new PLORM_E();
            orm = orm.startAtRootDir(rootPath)
                .withBaseName(baseName)
                .withTableInsert(tabKey);
            while (iterators.hasNext()) {
                String string = iterators.next();
                if (initonEncrypt) {
                    orm = orm.withCulumnValue(string
                        , new FullDNATokenPDI().initonSect
                            (rowCells.getString(string).replace(":", "@Tin@")));
                } else {
                    orm = orm.withCulumnValue(string, rowCells.getString(string).replace(":"
                        , "@Tin@"));
                    //我稍后会思考: 符号怎么进行实体化, 省的要变通配符代替.
                }
            }
            orm.checkAndFixPlsqlGrammarErrors()
                //准备完善plsql orm语言 的语法检查函数 和修复函数。
                .checkAndFixSystemEnvironmentErrors()
                //准备完善plsql orm语言 的系统环境检查函数和修复函数。
                .finalE(true);
            //map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }

    public static IMV_SIQ InsertCellPLSQL(String rootPath, String baseName
        , String tabKey
        , IMV_SIQ rowCells, Boolean initonEncrypt) {
        Iterator<String> iterators = rowCells.keySet().iterator();
        IMV_SIQ map = null;
        try {
            String plsql = "setRoot:" + rootPath + ";";
            plsql += "baseName:" + baseName + ";";
            plsql += "tableName:" + tabKey + ":insert;";
            while (iterators.hasNext()) {
                String string = iterators.next();
                if (initonEncrypt) {
                    plsql += "culumnValue:" + string + ":"
                        + new FullDNATokenPDI().initonSect
                        (rowCells.getString(string).replace(":", "@Tin@")) + ";";
                } else {
                    plsql += "culumnValue:" + string + ":"
                        + rowCells.getString(string).replace(":", "@Tin@") + ";";
                }
            }
            map = M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }
}
