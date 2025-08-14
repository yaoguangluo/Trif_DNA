package S_A.OSV.ESD.standard;

import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

//import OSI.AOP.MEC.SIQ.plorm.PLORMImpl;
//import OSI.AOP.MEC.SIQ.plorm.PLORMInterf;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//OSV PLSQL 研发, 思想, 设计: 罗瑶光 20210511
//表删除操作的例子.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class D_CellStandard {
    public List<String> txtToList() {
        List<String> dic_list = new ArrayList<>();
        return dic_list;
    }

    //	delete samples
    //	tableName:test:delete;
    //	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
    //	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
    //避免函数执行, 先注释
    public static IMV_SIQ DeleteCellORM(String rootPath, String baseName
        , String tabKey
        , IMV_SIQ rowCells, Boolean initonEncrypt) {
        //  PLORMInterf orm= new PLORMImpl();
        //	orm= orm.startAtRootDir(rootPath)
        //			.withBaseName(baseName)
        //			.withTableInsert(tabKey);
        //  condition 不好规范, 稍后. 建议写针对性delete语句
        //	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
        //	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
        return null;
    }

    public static IMV_SIQ DeleteCellPLSQL(String rootPath, String baseName
        , String tabKey, IMV_SIQ rowCells, Boolean initonEncrypt) {
        IMV_SIQ map = null;
        try {
            //	String plsql= "setRoot:"+ rootPath+ ";";
            //	plsql+= "baseName:"+ baseName+ ";";
            //	plsql+= "tableName:"+ tabKey+ ":delete;";
            //  condition 不好规范, 稍后. 建议写针对性delete语句
            //	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
            //	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
            //	map= OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.E_PLSQLImp.E_PLSQL(plsql, true);
        } catch (Exception e1) {
            //准备写回滚
            e1.printStackTrace();
        }
        return map;
    }
}
