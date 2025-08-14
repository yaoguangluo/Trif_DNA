package M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E;

import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
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
public class IU_Rows_E_X_IU_RowByBaseName {
    public static IMV_SIQ insertRowByBaseName(String baseName, String tableName
        , JSONObject jsobj, boolean mod) {
        IMV_SIQ output = new IMV_SIQ();
        String tablePath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath")).getValue().toString();
        tablePath += "/" + baseName + "/" + tableName;
        File fileDBTable = new File(tablePath);
        if (fileDBTable.isDirectory()) {
            String DBTableRowsPath = tablePath + "/rows";
            Row row = new Row();
            IMV_SIQ cells = new IMV_SIQ();
            row.I_Cells(cells);
            File fileDBTableRowsPath = new File(DBTableRowsPath);
            if (fileDBTableRowsPath.isDirectory()) {
                int rowInsertIndex = Objects.requireNonNull(fileDBTableRowsPath.list()).length;
                output.put("totalPages", rowInsertIndex);
                String DBTableRowIndexPath = DBTableRowsPath + "/row" + rowInsertIndex;
                File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
                if (!readDBTableRowIndexFile.exists()) {
                    readDBTableRowIndexFile.mkdir();
                    Iterator<String> it = jsobj.keys();
                    while (it.hasNext()) {
                        String culumnName = it.next();
                        String culumnValue = jsobj.get(culumnName).toString();
                        if (culumnValue.equalsIgnoreCase("random")) {
                            culumnValue = "" + rowInsertIndex;
                        }
                        String needCreatCulumnPath = DBTableRowIndexPath + "/" + culumnName;
                        File needCreatCulumn = new File(needCreatCulumnPath);
                        if (!needCreatCulumn.exists()) {
                            if (mod) {
                                needCreatCulumn.mkdir();
                            }
                        }
                        File needCreatCulumnPathFile = new File(needCreatCulumnPath + "/value.lyg");
                        if (needCreatCulumnPathFile.exists() && !needCreatCulumnPathFile.canWrite()) {
                            try {
                                throw new Exception();
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                        if (mod) {
                            FileWriter fileWriter;
                            try {
                                fileWriter = new FileWriter(needCreatCulumnPath + "/value.lyg", true);
                                fileWriter.write(culumnValue);
                                fileWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        //add buffer
                        Cell cell = new Cell();
                        cell.I_CellValue(culumnValue);
                        if (mod) {
                            row.putCell(culumnName, cell);
                        }
                    }
                    String needCreatCulumnPath = DBTableRowIndexPath + "/is_delete_0";
                    File needCreatCulumn = new File(needCreatCulumnPath);
                    if (!needCreatCulumn.exists()) {
                        if (mod) {
                            needCreatCulumn.mkdir();
                        }
                    }
                }
                Table table = DetaDBBufferCache_M.db.getBase(baseName).getTable(tableName);
                if (mod) {
                    table.putRow("row" + rowInsertIndex, row);
                }
            }
        }
        return output;
    }
}
