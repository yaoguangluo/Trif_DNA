package S_A.OSV.ESD.standard;

import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_E;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;


//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210511
//表剔除操作的例子.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class D_Standard {
    public List<String> txtToList() {
        List<String> dic_list = new ArrayList<>();
        return dic_list;
    }

    //	drop samples
    //	tableName:test:drop;

    public static IMV_SIQ DropCellORM(String rootPath, String baseName
        , String tabKey) {
        PLORM_C orm = new PLORM_E();
        orm = orm.startAtRootDir(rootPath)
            .withBaseName(baseName)
            .withTableDrop(tabKey)
            .checkAndFixPlsqlGrammarErrors()
            //准备完善plsql orm语言 的语法检查函数 和修复函数。
            .checkAndFixSystemEnvironmentErrors()
            //准备完善plsql orm语言 的系统环境检查函数和修复函数。
            .finalE(true);
        return null;
    }

    public static IMV_SIQ DropCellPLSQL(String rootPath, String baseName
        , String tabKey) {
        IMV_SIQ map = null;
        try {
            String plsql = "setRoot:" + rootPath + ";";
            plsql += "baseName:" + baseName + ";";
            plsql += "tableName:" + tabKey + ":drop;";
            map = M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }
}
