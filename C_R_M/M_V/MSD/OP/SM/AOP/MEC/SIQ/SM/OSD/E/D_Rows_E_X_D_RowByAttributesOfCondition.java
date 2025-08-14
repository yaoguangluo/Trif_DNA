package M_V.MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E;

import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows.Q_Rows_E_X_selectRowsByAttributesOfCondition;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;

import java.io.File;
import java.util.List;
import java.util.Objects;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class D_Rows_E_X_D_RowByAttributesOfCondition {
    @SuppressWarnings({"unchecked"})
    public static void _E(IMV_SIQ object, boolean mod) {
        if (!object.containsKey("baseName") || !object.containsKey("tableName")) {
            return;
        }
        //get base
        String DBPath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath")).getValue().toString()
            + "/" + object.get("baseName").toString();
        File DBPathFile = new File(DBPath);
        if (!DBPathFile.isDirectory()) {
            return;
        }
        //make table dir
        String tablePath = DBPath + "/" + object.get("tableName").toString();
        List<IMV_SIQ> obj
            = (List<IMV_SIQ>) Q_Rows_E_X_selectRowsByAttributesOfCondition._E(object);
        for (IMV_SIQ row : obj) {
            IMV_SIQ rowValue = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
            IMV_SIQ indexCell = (IMV_SIQ) rowValue.get("Index");
            String indexValue = indexCell.get("culumnValue").toString();
            D_Rows_E_X_D_RowByTablePathAndIndex._E(tablePath, indexValue, mod);
        }
    }
}
//41
//delete buffer also
//			DetaDBBufferCache_M.db.getBase(object.get("baseName")
//.toString()).getTable(object.get("tableName")
//					.toString()).removeRow(indexValue);