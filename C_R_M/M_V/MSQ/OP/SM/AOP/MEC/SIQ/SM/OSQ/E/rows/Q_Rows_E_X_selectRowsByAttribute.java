package M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressWarnings({"unused"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Q_Rows_E_X_selectRowsByAttribute {
    public static List<IMV_SIQ> _E(String currentDB
            , String tableName, String culmnName, Object value) {
        if (value == null) {
            value = "";
        }
        String objectType = "";
        List<IMV_SIQ> output = new ArrayList<>();
        //锁定数据库
        String DBPath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath")).getValue().toString() + "/" + currentDB;
        //锁定表
        File fileDBPath = new File(DBPath);
        if (fileDBPath.isDirectory()) {
            String DBTablePath = DBPath + "/" + tableName;
            File fileDBTable = new File(DBTablePath);
            if (fileDBTable.isDirectory()) {
                String DBTableCulumnPath = DBTablePath + "/spec/" + culmnName;
                File fileDBTableCulumn = new File(DBTableCulumnPath);
                if (fileDBTableCulumn.isDirectory()) {
                    //读取列数据格式
                    String[] fileList = fileDBTableCulumn.list();
                    assert fileList != null;
                    File readDBTableSpecCulumnFile = new File(DBTableCulumnPath + "/"
                            + fileList[0]);
                    DetaBufferedReader reader
                            = new DetaBufferedReader(DetaFileReader.E(readDBTableSpecCulumnFile));
                    String tempString;
                    while ((tempString = reader.readDetaLine()) != null) {
                        objectType = tempString;
                    }
                    reader.closeDeta();
                    if (objectType.contains("string")) {
                        String DBTableRowsPath = DBTablePath + "/rows";
                        File fileDBTableRowsPath = new File(DBTableRowsPath);
                        if (fileDBTableRowsPath.isDirectory()) {
                            String[] rowList = fileDBTableRowsPath.list();
                            assert rowList != null;
                            for (String row : rowList) {
                                IMV_SIQ rowMap = new IMV_SIQ();
                                String DBTableRowIndexPath = DBTablePath + "/rows/" + row;
                                File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
                                if (readDBTableRowIndexFile.isDirectory()) {
                                    String isDelete = DBTableRowIndexPath + "/is_delete_1";
                                    File isDeleteFile = new File(isDelete);
                                    if (isDeleteFile.exists()) {
                                        continue;
                                    }
                                    String DBTableRowIndexCulumnPath = DBTableRowIndexPath + "/" + culmnName;
                                    File readDBTableRowIndexCulumnFile = new File(DBTableRowIndexCulumnPath);
                                    if (readDBTableRowIndexCulumnFile.isDirectory()) {
                                        reader = new DetaBufferedReader(DetaFileReader.E(readDBTableRowIndexCulumnFile
                                            + "/" + "value.lyg"));
                                        String temp = "";
                                        while ((tempString = reader.readDetaLine()) != null) {
                                            temp += tempString;
                                        }
                                        reader.closeDeta();
                                        if (temp.equalsIgnoreCase(value.toString())) {
                                            String[] culumnList = readDBTableRowIndexFile.list();
                                            assert culumnList != null;
                                            for (String culumn : culumnList) {
                                                if (culumn.contains("is_delete")) {
                                                    continue;
                                                }
                                                String DBTableCulumnIndexPath = DBTableRowIndexPath + "/" + culumn;
                                                File readDBTableCulumnIndexPathFile
                                                    = new File(DBTableCulumnIndexPath);
                                                if (readDBTableRowIndexCulumnFile.isDirectory()) {
                                                    reader = new DetaBufferedReader(
                                                        DetaFileReader.E(readDBTableCulumnIndexPathFile
                                                            + "/" + "value.lyg"));
                                                    temp = "";
                                                    while ((tempString = reader.readDetaLine()) != null) {
                                                        temp += tempString;
                                                    }
                                                    reader.closeDeta();
                                                    rowMap.put(culumn, temp);
                                                } else {
                                                    rowMap.put(culumn, null);
                                                }
                                            }
                                            output.add(rowMap);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Q_Rows_E_X_selectRowsByAttribute._E("backend", "login"
                , "usr_name", "yaoguangluo");
    }
}
//118
// deletefile("D:/file");
//20230106-System.out.println("ok");