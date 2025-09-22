package O_V.OSA.shell;

import ME.VPC.M.app.App;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import S_A.pheromone.IMV_SIQ;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//这个函数我将 txt 和 db 表文件 到jtable 进行映射成object[][] 表。jtable 太上层, 我准备设计成VPCS 结构, 把jtable的 object[][]标记脱离出来,
//映射函数框架完成, 稍后开始应用, 先在 控制台做个shell命令输入框, 然后开始修改 之前plsql orm 对应的 searchShell 计算文件
//罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class XA_ShellTables {
    public static Map<String, XA_ShellTable> searchShellTables = new IMV_SIQ();

    //先把接口做足, 罗瑶光20210925
    //将表变成表映射
    public static boolean addNewSearchShellTable(String tableName, JTable jtable, App NE) {
        //..
        TableModel defaultTableModel = jtable.getModel();
        addNewSearchShellTable(tableName, (DefaultTableModel) defaultTableModel, NE);
        return true;
    }

    //按sonar方式重复函数分离
    public static Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) {
        //..
        Object[] jtableSpec = new Object[defaultTableModel.getColumnCount()];
        for (int i = 0; i < defaultTableModel.getColumnCount(); i++) {
            jtableSpec[i] = defaultTableModel.getColumnName(i);
        }
        return jtableSpec;
    }

    //按sonar方式重复函数分离
    public static Object[][] getNewSearchShellTableDataFromDefaultTableModel(DefaultTableModel defaultTableModel) {
        //..
        Object[][] jtableData = new Object[defaultTableModel.getColumnCount()][defaultTableModel.getRowCount()];
        for (int i = 0; i < defaultTableModel.getColumnCount(); i++) {
            for (int j = 0; j < defaultTableModel.getRowCount(); j++) {
                jtableData[i][j] = defaultTableModel.getValueAt(i, j);
            }
        }
        return jtableData;
    }

    //设计个row的结合表map内存结构 用于shell的表头搜索。
    public static Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, DefaultTableModel defaultTableModel) {
        //..
        Row[] rows = new Row[defaultTableModel.getRowCount()];
        for (int i = 0; i < defaultTableModel.getColumnCount(); i++) {
            rows[i] = new Row();
            for (int j = 0; j < defaultTableModel.getRowCount(); j++) {
                Cell cell = new Cell();
                cell.I_CellValue(defaultTableModel.getValueAt(i, j));
                rows[i].putCell("" + spec[i], cell);
            }
        }
        return rows;
    }

    //设计个row的结合表map内存结构 用于shell的表头搜索。
    public static Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, Object[][] tableData) {
        //..
        Row[] rows = new Row[tableData.length];
        for (int i = 0; i < tableData.length; i++) {
            rows[i] = new Row();
            rows[i].I_Cells(new ConcurrentHashMap<String, Cell>());//init
            for (int j = 0; j < tableData[0].length; j++) {
                Cell cell = new Cell();
                cell.I_CellValue(tableData[i][j]);
                rows[i].putCell("" + spec[j], cell);
            }
        }
        return rows;
    }

    //将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。
    public static boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel, App NE) {
        //..
        Object[] jtableSpec = getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
        Object[][] jtableData = getNewSearchShellTableDataFromDefaultTableModel(defaultTableModel);
        addNewSearchShellTable(tableName, jtableData, jtableSpec, NE);
        return true;
    }

    //将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
    public static boolean addNewSearchShellTableWithObjectData(String tableName
        , DefaultTableModel defaultTableModel, Object[][] defaultTableData, App NE) {
        //..
        Object[] jtableSpec = getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
        addNewSearchShellTable(tableName, defaultTableData, jtableSpec, NE);
        return true;
    }

    //pletl在xls读取的时候之后也进行load later
    //shell映射封装
    public static boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData
        , Object[] defaultTableDataSpec, App NE) {
        //*/
        NE.app_S.tableNameMap.put(tableName, true);
        //*/
        XA_ShellTable searchShellTable = new XA_ShellTable();
        searchShellTable.setHuaRuiJiJtableCulumns(defaultTableDataSpec);
        searchShellTable.setHuaRuiJiJtableRows(getNewSearchShellTableRowsFromDefaultTableModel(
            defaultTableDataSpec, defaultTableData));
        searchShellTable.setHuaRuiJiJtable(defaultTableData);
        searchShellTable.setHuaRuiJiJtableName(tableName);
        searchShellTables.put(tableName, searchShellTable);
        return true;
    }

    //Reflection map 表头方式存储
    //将表映射变成shell映射, 接口VPCS 多样化, 稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
    public static boolean addNewSearchShellTableWithObjectDataReflectionDBRows(String tableName
        , DefaultTableModel defaultTableModel, Object[][] defaultTableData) {
        //..
        Object[] jtableSpec = getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
        //defaultTableModel TO ROWS
        Row[] rows = getNewSearchShellTableRowsFromDefaultTableModel(jtableSpec, defaultTableModel);
        addNewSearchShellTableReflectionDBRows(tableName, rows, jtableSpec);
        return true;
    }

    //Reflection map 表头方式存储
    //shell映射封装
    public static boolean addNewSearchShellTableReflectionDBRows(String tableName
        , Row[] rows, Object[] defaultTableDataSpec) {
        //..
        XA_ShellTable searchShellTable = new XA_ShellTable();
        searchShellTable.setHuaRuiJiJtableCulumns(defaultTableDataSpec);
        searchShellTable.setHuaRuiJiJtableRows(rows);
        searchShellTable.setHuaRuiJiJtableName(tableName);
        searchShellTables.put(tableName, searchShellTable);
        return true;
    }

    //然后所有养疗经的jtable表全部基于这个文件函数 进行shell 封装。与数据库的内存映射分离。
    public static boolean addInitSearchShellTable(App app) {//later duplicate
        //把养疗经的表都在这里初始化映射成 SearchShellTables 内存先。
        if (null != app.app_S.xynkPage) {
            addNewSearchShellTable("西医内科", app.app_S.xynkPage.tableData_old, app.app_S.xynkPage.columnTitle, app);
        }
        if (null != app.app_S.zynkxPage) {
            addNewSearchShellTable("中医方剂", app.app_S.zynkxPage.tableData_old, app.app_S.zynkxPage.columnTitle, app);
        }
        if (null != app.app_S.zyzdxPage) {
            addNewSearchShellTable("中医诊断", app.app_S.zyzdxPage.tableData_old, app.app_S.zyzdxPage.columnTitle, app);
        }
        if (null != app.app_S.fyydPage) {
            addNewSearchShellTable("古籍", app.app_S.fyydPage.tableData_old, app.app_S.fyydPage.columnTitle, app);
        }
        if (null != app.app_S.fqzPage) {
            addNewSearchShellTable("中医生殖", app.app_S.fqzPage.tableData_old, app.app_S.fqzPage.columnTitle, app);
        }
        if (null != app.app_S.fckxPage) {
            addNewSearchShellTable("妇产科学", app.app_S.fckxPage.tableData_old, app.app_S.fckxPage.columnTitle, app);
        }
        if (null != app.app_S.jzkxPage) {
            addNewSearchShellTable("急诊科学", app.app_S.jzkxPage.tableData_old, app.app_S.jzkxPage.columnTitle, app);
        }
        if (null != app.app_S.wkxPage) {
            addNewSearchShellTable("西医外科", app.app_S.wkxPage.tableData_old, app.app_S.wkxPage.columnTitle, app);
        }
        if (null != app.app_S.wskxPage) {
            addNewSearchShellTable("中医外伤", app.app_S.wskxPage.tableData_old, app.app_S.wskxPage.columnTitle, app);
        }
        if (null != app.app_S.xyscPage) {
            addNewSearchShellTable("西药手册", app.app_S.xyscPage.tableData_old, app.app_S.xyscPage.columnTitle, app);
        }
        if (null != app.app_S.tableData_old) {
            addNewSearchShellTable("药食同源", app.app_S.tableData_old, app.app_S.columnTitle, app);
        }
        //addNewSearchShellTable("哈里森", app.app_S.cecil.tableData_old, app.app_S.cecil.columnTitle);
        //上面是主页面,
        //节点添加导入的数据表页面 我稍后也会做个 扩充函数。
        return true;
    }
}
