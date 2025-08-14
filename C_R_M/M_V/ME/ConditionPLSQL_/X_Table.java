package M_V.ME.ConditionPLSQL_;

import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings({"unused", "unchecked"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_Table extends X_ {
    //plsql引擎函数获取表开始检查 罗瑶光 20210405
    //奇怪了 这是一个没有读 缓存的plsql引擎, 我准备对比下history
    //object 指令堆栈
    //output 数据行
    public static void P_Table(String[] sets, List<IMV_SIQ> output
        , String DBTablePath, IMV_SIQ object) {
        String DBTableRowsPath = DBTablePath + "/rows";
        File fileDBTableRowsPath = new File(DBTableRowsPath);
        if (fileDBTableRowsPath.isDirectory()) {
            String[] rowList = fileDBTableRowsPath.list();
            int count = 0;
            assert rowList != null;
            for (String row : rowList) {
                count++;
                IMV_SIQ rowMap = new IMV_SIQ();
                String DBTableRowIndexPath = DBTablePath + "/rows/" + row;
                File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
                if (readDBTableRowIndexFile.isDirectory()) {
                    String isDelete = DBTableRowIndexPath + "/is_delete_1";
                    File isDeleteFile = new File(isDelete);
                    if (isDeleteFile.exists()) {
                        continue;
                    }
                    String DBTableRowIndexCulumnPath = DBTableRowIndexPath + "/" + sets[0];
                    File readDBTableRowIndexCulumnFile = new File(DBTableRowIndexCulumnPath);
                    if (readDBTableRowIndexCulumnFile.isDirectory()) {
                        DetaBufferedReader reader = new DetaBufferedReader
                            (DetaFileReader.E(readDBTableRowIndexCulumnFile + "/" + "value.lyg"));
                        String temp = "";
                        String tempString;
                        while ((tempString = reader.readDetaLine()) != null) {
                            temp += tempString;
                        }
                        reader.closeDeta();
                        if (temp.isEmpty()) {
                            //增加一行id为空检查, 大家记得给 数据库的id加点值, 我lyg的都是空文件.
                            continue;
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SMALL)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_THAN)) {
                            if (new BigDecimal(temp).doubleValue()
                                < new BigDecimal(sets[2]).doubleValue()) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO_R)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_THAN_AND_EQUAL_TO)) {
                            if (new BigDecimal(temp).doubleValue()
                                <= new BigDecimal(sets[2]).doubleValue()) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOUBLE_EQUALS)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SIMPLE_EUQALS)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
                            if (new BigDecimal(temp).doubleValue()
                                == new BigDecimal(sets[2]).doubleValue()) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO_R)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_THAN_AND_EQUAL_TO)) {
                            if (new BigDecimal(temp).doubleValue()
                                >= new BigDecimal(sets[2]).doubleValue()) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_THAN)) {
                            if (new BigDecimal(temp).doubleValue()
                                > new BigDecimal(sets[2]).doubleValue()) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO)
                            || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO_R)) {
                            if (new BigDecimal(temp).doubleValue()
                                != new BigDecimal(sets[2]).doubleValue()) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_EQUAL)) {
                            if (temp.equalsIgnoreCase(sets[2])) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOES_NOT_EQUALS)) {
                            if (!temp.equalsIgnoreCase(sets[2])) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase((S_ShellETL.SHELL_ETL_IN))) {
                            String set = ", " + sets[2] + ", ";
                            if (set.contains(", " + temp + ", ")) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                        if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_IN)) {
                            String set = ", " + sets[2] + ", ";
                            if (!set.contains(", " + temp + ", ")) {
                                if (!((Map<Integer, Boolean>) (object.get("recordRows"))).containsKey(count)) {
                                    Row bufferRow = new Row();
                                    bufferRow.I_Cells(new ConcurrentHashMap<>());
                                    X_Kernel.P_kernel(
                                        readDBTableRowIndexFile,
                                        output, bufferRow, rowMap);
                                    output.add(X_Map.rowToRowMap(bufferRow));
                                    Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object.get("recordRows");
                                    recordRows.put(count, true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

//我会将手里硬盘数据2年的数据等会全部验算
