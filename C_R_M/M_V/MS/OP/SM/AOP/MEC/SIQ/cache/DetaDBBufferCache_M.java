/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package M_V.MS.OP.SM.AOP.MEC.SIQ.cache;

import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Base;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.DB;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Spec;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;

import java.io.File;
import java.util.Objects;

@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaDBBufferCache_M {
    public static DB db = new DB();
    public static boolean dbCache = false;

    private DetaDBBufferCache_M() {
        super();
    }

    public static void reflection() {
        IMV_SIQ bases = new IMV_SIQ();
        db.I_Bases(bases);
        //1获取db路径；//later null op20250422
        String dBPath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath")).getValue().toString();
        File fileDBPath = new File(dBPath);
        if (fileDBPath.isDirectory()) {
            String[] baseNames = fileDBPath.list();
            assert baseNames != null;
            for (String baseName : baseNames) {
                loopBases(db, dBPath, baseName);
            }
        }
        dbCache = true;
    }

    private static void loopBases(DB db, String dBPath, String baseName) {
        Base base = new Base();
        IMV_SIQ tables = new IMV_SIQ();
        base.I_Tables(tables);
        String dBasePath = dBPath + "/" + baseName;
        //get base
        File fileDBasePath = new File(dBasePath);
        if (fileDBasePath.isDirectory()) {
            IMV_SIQ tableMap = new IMV_SIQ();
            //get tables
            String[] tableNames = fileDBasePath.list();
            assert tableNames != null;
            for (String tableName : tableNames) {
                loopTables(base, dBasePath, tableName);
            }
        }
        db.putBase(baseName, base);
    }

    private static void loopTables(Base base, String dBasePath, String tableName) {
        Table table = new Table();
        String tablePath = dBasePath + "/" + tableName;
        File fileTablePath = new File(tablePath);
        if (fileTablePath.isDirectory()) {
            String specPath = tablePath + "/spec";
            String rowsPath = tablePath + "/rows";
            loopSpec(table, specPath);
            loopRows(table, rowsPath);
        }
        base.putTable(tableName, table);
    }

    private static void loopSpec(Table table, String specPath) {
        Spec spec = new Spec();
        IMV_SIQ culumnTypes = new IMV_SIQ();
        spec.I_CulumnTypes(culumnTypes);
        File fileSpecPath = new File(specPath);
        if (fileSpecPath.isDirectory()) {
            String[] specs = fileSpecPath.list();
            assert specs != null;
            for (String s : specs) {
                String specCulumnPath = specPath + "/" + s;
                String specCulumnValuePath = specCulumnPath + "/value.lyg";
                //if get
                DetaBufferedReader reader = new DetaBufferedReader(DetaFileReader
                    .E(specCulumnPath + "/" + "value.lyg"));
                String temp = "";
                String tempString;
                while ((tempString = reader.readDetaLine()) != null) {
                    temp += tempString;
                }
                reader.closeDeta();
                spec.I_CulumnType(s, temp);
            }
        }
        table.I_Spec(spec);
    }

    private static void loopRows(Table table, String rowsPath) {
        IMV_SIQ rows = new IMV_SIQ();
        table.I_Rows(rows);
        File fileRowsPath = new File(rowsPath);
        if (fileRowsPath.isDirectory()) {
            String[] rowIndex = fileRowsPath.list();
            assert rowIndex != null;
            for (String index : rowIndex) {
                loopRow(table, fileRowsPath, index);
            }
        }
    }

    private static void loopRow(Table table, File fileRowsPath, String rowIndex) {
        Row row = new Row();
        IMV_SIQ cells = new IMV_SIQ();
        row.I_Cells(cells);
        String rowIndexPath = fileRowsPath + "/" + rowIndex;
        File fileRowPath = new File(rowIndexPath);
        if (fileRowPath.isDirectory()) {
            String[] culumns = fileRowPath.list();
            assert culumns != null;
            for (String culumn : culumns) {
                String rowCulumnPath = rowIndexPath + "/" + culumn;
                String rowCulumnValuePath = rowCulumnPath + "/value.lyg";
                //if get
                if (!culumn.contains("is_delete")) {
                    DetaBufferedReader reader = null;
                    try {
                        reader = new DetaBufferedReader(DetaFileReader.E(rowCulumnValuePath));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String temp = "";
                    String tempString;
                    while (true) {
                        assert reader != null;
                        if ((tempString = reader.readDetaLine()) == null) break;
                        temp += tempString;
                    }
                    reader.closeDeta();
                    Cell cell = new Cell();
                    cell.I_CellValue(temp);
                    row.putCell(culumn, cell);
                } else {
                    Cell cell = new Cell();
                    cell.I_CellValue("");
                    row.putCell(culumn, cell);
                }
            }
        }
        table.putRow(rowIndex, row);
    }
} 
