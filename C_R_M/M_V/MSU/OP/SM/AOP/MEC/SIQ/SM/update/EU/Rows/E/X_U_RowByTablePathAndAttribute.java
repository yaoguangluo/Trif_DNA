package M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E;

import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import S_A.pheromone.IMV_SIQ;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class X_U_RowByTablePathAndAttribute {
    public static IMV_SIQ _E(String tablePath
        , String culumnName, String culumnValue,
                             JSONObject jobj) {
        String[] sets = tablePath.split("/");
        File fileDBTable = new File(tablePath);
        if (fileDBTable.isDirectory()) {
            String DBTableRowsPath = tablePath + "/rows";
            File fileDBTableRowsPath = new File(DBTableRowsPath);
            if (fileDBTableRowsPath.isDirectory()) {
                for (int i = 0; i < Objects.requireNonNull(fileDBTableRowsPath.list()).length; i++) {
                    String DBTableRowIndexPath = DBTableRowsPath + "/row" + i;
                    File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
                    if (readDBTableRowIndexFile.exists()) {
                        readDBTableRowIndexFile.mkdir();
                        File check = new File(DBTableRowIndexPath + "/"
													+ culumnName + "/value.lyg");
                        if (!check.exists()) {
                            continue;
                        }
                        DetaBufferedReader reader = new DetaBufferedReader(DetaFileReader.E(check));
                        String temp = "";
                        String tempString;
                        while ((tempString = reader.readDetaLine()) != null) {
                            temp += tempString;
                        }
                        reader.closeDeta();
                        if (!temp.equalsIgnoreCase(culumnValue)) {
                            continue;
                        }
                        Iterator<String> it = jobj.keys();
                        while (it.hasNext()) {
                            String culumnNameOfjs = it.next();
                            String culumnValueOfjs = jobj.get(culumnNameOfjs).toString();
                            String needCreatCulumnPath = DBTableRowIndexPath + "/" + culumnNameOfjs;
                            File needCreatCulumn = new File(needCreatCulumnPath);
                            needCreatCulumn.delete();
                            needCreatCulumn.mkdir();
                            File needCreatCulumnFile = new File(needCreatCulumnPath + "/value.lyg");
                            needCreatCulumnFile.delete();
                            FileWriter fileWriter;
                            try {
                                fileWriter = new FileWriter(needCreatCulumnPath
																	+ "/value.lyg", true);
                                fileWriter.write(null == culumnValueOfjs ? "" : culumnValueOfjs);
                                fileWriter.close();
                                //fix buffer refresh
                                Cell cell = new Cell();
                                cell.I_CellValue(null == culumnValueOfjs ? "" : culumnValueOfjs);
                                DetaDBBufferCache_M.db.getBase(sets[sets.length - 2])
                                    .getTable(sets[sets.length - 1]).getRow("row" + i)
                                    .putCell(culumnNameOfjs, cell);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        return new IMV_SIQ();
    }
}
