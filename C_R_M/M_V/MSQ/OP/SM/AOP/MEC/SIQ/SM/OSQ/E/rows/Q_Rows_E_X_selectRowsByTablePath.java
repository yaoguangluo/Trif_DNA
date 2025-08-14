package M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows;

import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import exception.file.O.DetaFileInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
public class Q_Rows_E_X_selectRowsByTablePath {
    public static IMV_SIQ _E(String tablePath, String pageBegin
            , String pageEnd, String direction) {
        IMV_SIQ output = new IMV_SIQ();
        try {
            int totalPages = 0;
            output.put("tablePath", tablePath);
            int rowBeginIndex = Integer.parseInt(pageBegin);
            int rowEndIndex = Integer.parseInt(pageEnd);
            String objectType = "";
            List<Object> rowMapList = new ArrayList<>();
            File fileDBTable = new File(tablePath);
            if (fileDBTable.isDirectory()) {
                String DBTableRowsPath = tablePath + "/rows";
                File fileDBTableRowsPath = new File(DBTableRowsPath);
                if (fileDBTableRowsPath.isDirectory()) {
                    File[] files = fileDBTableRowsPath.listFiles();
                    assert files != null;
                    totalPages = files.length;
                    int i = 0;
                    int index = 0;
                    while (i < 15) {
                        String DBTableRowIndexPath = DBTableRowsPath + "/row"
                            + (direction.contains("next") ? rowEndIndex++ : --rowBeginIndex);
                        File readDBTableRowIndexFile = new File(DBTableRowIndexPath);
                        if (!readDBTableRowIndexFile.exists()) {
                            break;
                        }
                        File deleteTest = new File(DBTableRowIndexPath + "/is_delete_1");
                        if (deleteTest.exists()) {
                            continue;
                        }
                        i++;
                        IMV_SIQ rowMap = new IMV_SIQ();
                        String[] readDBTableRowCulumnsIndexFile = readDBTableRowIndexFile.list();
                        IMV_SIQ culumnMaps = new IMV_SIQ();
                        assert readDBTableRowCulumnsIndexFile != null;
                        for (String readDBTableRowCulumnIndexFile : readDBTableRowCulumnsIndexFile) {
                            if (readDBTableRowCulumnIndexFile.contains("is_delete")) {
                                continue;
                            }
                            IMV_SIQ culumnMap = new IMV_SIQ();
                            String DBTableRowIndexCulumnPath = DBTableRowIndexPath
                                + "/" + readDBTableRowCulumnIndexFile;
                            File readDBTableRowIndexCulumnFile = new File(DBTableRowIndexCulumnPath);
                            if (readDBTableRowIndexCulumnFile.exists()) {
                                String temp = "";
                                FileInputStream fis = DetaFileInputStream.E(
                                    new File(DBTableRowIndexCulumnPath
                                        + "/value.lyg"));
                                BufferedInputStream bis = new BufferedInputStream(fis);
                                byte[] buffer = new byte[1024];
                                int cnt;
                                while ((cnt = bis.read(buffer)) != -1) {
                                    temp += new String(buffer, 0, cnt);
                                }
                                fis.close();
                                bis.close();
                                culumnMap.put(S_ShellETL.SHELL_ETL_CULUMNNAME, readDBTableRowCulumnIndexFile);
                                culumnMap.put("culumnValue", temp);
                                culumnMaps.put(readDBTableRowCulumnIndexFile, culumnMap);
                            }
                        }
                        rowMap.put(S_ShellETL.SHELL_ETL_ROWVALUE, culumnMaps);
                        if (direction.contains("next")) {
                            rowMap.put("rowIndex", rowEndIndex - 1);
                            rowMapList.add(rowMap);
                        } else {
                            rowMap.put("rowIndex", rowBeginIndex);
                            rowMapList.add(0, rowMap);
                        }
                    }
                }
            }
            if (direction.contains("next")) {
                output.put("pageBegin", Integer.valueOf(pageEnd));
                output.put("pageEnd", rowEndIndex);
                output.put("totalPages", totalPages);
            } else {
                output.put("pageBegin", rowBeginIndex);
                output.put("pageEnd", Integer.valueOf(pageBegin));
                output.put("totalPages", totalPages);
            }
            output.put("obj", rowMapList);
            List<Object> spec = new ArrayList<>();
            IMV_SIQ row = (IMV_SIQ) rowMapList.get(0);
            IMV_SIQ culumns = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
            for (String s : (Iterable<String>) culumns.keySet()) {
                spec.add(((IMV_SIQ) culumns.get(s))
                    .get(S_ShellETL.SHELL_ETL_CULUMNNAME).toString());
            }
            output.put("spec", spec);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}
