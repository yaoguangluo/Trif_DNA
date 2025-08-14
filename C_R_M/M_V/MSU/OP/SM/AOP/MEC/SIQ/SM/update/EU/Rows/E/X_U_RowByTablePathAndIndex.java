package M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E;

import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import S_A.pheromone.IMV_SIQ;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_U_RowByTablePathAndIndex {
    public static IMV_SIQ _E(String tablePath, String pageIndex,
                             JSONObject jaculumnOfUpdateRow) {
        String[] sets = tablePath.split("/");
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
                    Iterator<String> it = jaculumnOfUpdateRow.keys();
                    while (it.hasNext()) {
                        String culumnName = it.next();
                        String culumnValue = jaculumnOfUpdateRow.getString(culumnName);
                        String needCreatCulumnPath = DBTableRowIndexPath + "/" + culumnName;
                        File needCreatCulumn = new File(needCreatCulumnPath);
                        needCreatCulumn.delete();
                        needCreatCulumn.mkdir();
                        File needCreatCulumnFile = new File(needCreatCulumnPath + "/value.lyg");
                        needCreatCulumnFile.delete();
                        FileWriter fw;
                        try {
                            fw = new FileWriter(needCreatCulumnPath + "/value.lyg", true);
                            fw.write(null == culumnValue ? "" : culumnValue);
                            fw.close();
                            //fix buffer refresh
                            Cell cell = new Cell();
                            cell.I_CellValue(null == culumnValue ? "" : culumnValue);
                            DetaDBBufferCache_M.db.getBase(sets[sets.length - 2])
                                .getTable(sets[sets.length - 1]).getRow("row"
                                    + pageIndex).putCell(culumnName, cell);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        IMV_SIQ output = new IMV_SIQ();
        output.put("totalPages", rowInsertIndex);
        return output;
    }


}
