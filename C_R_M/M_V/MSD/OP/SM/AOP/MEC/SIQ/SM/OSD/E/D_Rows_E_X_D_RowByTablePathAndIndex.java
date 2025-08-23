package M_V.MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E;

import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.pheromone.IMV_SIQ;

import java.io.File;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class D_Rows_E_X_D_RowByTablePathAndIndex {
    public static IMV_SIQ _E(String tablePath, String pageIndex
        , boolean mod) {
        int rowInsertIndex = Integer.parseInt(pageIndex);
        File fileDBTable = new File(tablePath);
        if (fileDBTable.isDirectory()) {
            String DBTableRowsPath = tablePath + "/rows";
            File fileDBTableRowsPath = new File(DBTableRowsPath);
            if (fileDBTableRowsPath.isDirectory()) {
                String DBTableRowIndexPath = DBTableRowsPath + "/row" + rowInsertIndex;
                File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
                if (readDBTableRowIndexFile.exists()) {
                    readDBTableRowIndexFile.mkdir();
                    String needCreatCulumnPath0 = DBTableRowIndexPath + "/is_delete_0";
                    File needCreatCulumn0 = new File(needCreatCulumnPath0);
                    if (mod) {
                        needCreatCulumn0.delete();
                    }
                    String needCreatCulumnPath = DBTableRowIndexPath + "/is_delete_1";
                    File needCreatCulumn = new File(needCreatCulumnPath);
                    if (mod) {
                        needCreatCulumn.mkdir();
                    }
                }
            }
        }
        IMV_SIQ output = new IMV_SIQ();
        output.put("totalPages", rowInsertIndex);
        String[] sets = tablePath.split("/");
        String baseName = sets[sets.length - 2];
        String tableName = sets[sets.length - 1];
        String indexName = "row" + pageIndex;
        Table table = DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);
        if (mod) {
            table.D_Row(indexName);
        }
        return output;
    }
}