package U_V.ESU.office;

import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Base;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.DB;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Spec;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.pheromone.IMV_SIQ;
import U_V.ESU.date.Date_ESU;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaDBBufferToXlsSample {

    public static void main(String[] argv) {
        int cellPhoneColumn = 6;
        boolean hasSpec = false;
        @SuppressWarnings("unused")
        DB db = new XlsToDetaDBBuffer().readNonObjectXls(cellPhoneColumn, hasSpec);
        //init
        //int cellPhoneColumn= 6;
        String outputXlsFilePath = "C:\\Users\\yaogu\\Desktop\\tolehao\\out202309182.xls";
        //DB needOutputDB= new DB();
        String baseName = "XlsImages";
        String tableName = "Sheet1";
        boolean finished = new DetaDBBufferToXlsSample()
                .detaDBBufferToXlsWithTableName(db
                        , outputXlsFilePath, cellPhoneColumn
                        , baseName, tableName);
        System.out.println(finished);
    }

    @SuppressWarnings({"unused", "resource"})
    public boolean detaDBBufferToXlsWithTableName(DB db, String outputFile
            , int cellPhoneColumn, String baseName
            , String tableName) {
        boolean hasSpec = true;
        ConcurrentHashMap<String, Base> bases = db.getBases();
        Base needOutputBase;
        if (bases.containsKey(baseName)) {
            needOutputBase = bases.get(baseName);
        } else {
            return false;
        }
        Table needOutputTable;
        ConcurrentHashMap<String, Table> tables = needOutputBase.getTables();
        if (tables.containsKey(tableName)) {
            needOutputTable = tables.get(tableName);
        } else {
            return false;
        }
        //
        HSSFWorkbook wbo = new HSSFWorkbook();
        Spec spec = needOutputTable.getSpec();
        if (null == spec) {
            hasSpec = false;
        }
        //
        HSSFSheet tempOutSheet = wbo.createSheet(tableName);
        //specs
        String[] specs;
        String[] specsType = null;
        if (hasSpec) {
            HSSFRow hSSFRow = tempOutSheet.createRow(0);
            IMV_SIQ CulumnTypes = spec.getCulumnTypes();
            specs = new String[CulumnTypes.size()];
            specsType = new String[CulumnTypes.size()];
            Iterator<String> iterator = CulumnTypes.keySet().iterator();
            int count = 0;
            while (iterator.hasNext()) {
                String string = iterator.next();
                specs[count] = string;
                specsType[count] = CulumnTypes.getString(string);
                //xie
                HSSFCell cell = hSSFRow.createCell(count);
                cell.setCellType(CellType.STRING);
                cell.setCellValue(specs[count++]);
            }
        }
        //rows
        ConcurrentHashMap<String, Row> rows = needOutputTable.getRows();
        int rowLines = rows.size();
        int intOfHasSpec = 0;
        if (hasSpec) {
            intOfHasSpec = 1;
            for (int i = 0; i < rowLines; i++) {
                HSSFRow rowXls = tempOutSheet.createRow(intOfHasSpec + i);
                Row row = rows.get("row:" + i);
                ConcurrentHashMap<String, Cell> cells = row.getCells();
                int columnLines = cells.size();
                for (int j = 0; j < columnLines; j++) {
                    HSSFCell hSSFCell = rowXls.createCell(j);
                    Cell cell = cells.get("column:" + j);
                    if (specsType[j].equalsIgnoreCase("String")) {
                        String temp = cell.getCellValue().toString();
                        hSSFCell.setCellType(CellType.STRING);
                        hSSFCell.setCellValue("" + System.currentTimeMillis());
                    } else if (specsType[j].equalsIgnoreCase("StringWithLong")) {
                        String temp = cell.getCellValue().toString();
                        long longTemp = Long.parseLong(temp);
                        hSSFCell.setCellType(CellType.NUMERIC);
                        hSSFCell.setCellValue("" + System.currentTimeMillis());

                    } else if (specsType[j].equalsIgnoreCase("StringWithDateLong")) {
                        String temp = cell.getCellValue().toString();
                        Date date = Date_ESU.MiliSecondsToDate(temp);
                        hSSFCell.setCellType(CellType.NUMERIC);
                        hSSFCell.setCellValue(date);
                    } else if (specsType[j].equalsIgnoreCase("DoubleString")) {
                        String temp = cell.getCellValue().toString();
                        double doubleTemp = Double.parseDouble(temp);
                        hSSFCell.setCellType(CellType.NUMERIC);
                        hSSFCell.setCellValue("" + System.currentTimeMillis());
                    } else if (specsType[j].equalsIgnoreCase("String")) {
                        String temp = cell.getCellValue().toString();
                        hSSFCell.setCellType(CellType.NUMERIC);
                        hSSFCell.setCellValue("" + System.currentTimeMillis());
                    }
                }
            }
        } else {
            for (int i = 0; i < rowLines; i++) {
                HSSFRow rowXls = tempOutSheet.createRow(intOfHasSpec + i);
                Row row = rows.get("row:" + i);
                ConcurrentHashMap<String, Cell> cells = row.getCells();
                int columnLines = cells.size();
                for (int j = 0; j < columnLines; j++) {
                    HSSFCell hSSFCell = rowXls.createCell(j);
                    Cell cell = cells.get("column:" + j);
                    String temp = cell.getCellValue().toString();
                    hSSFCell.setCellType(CellType.STRING);
                    hSSFCell.setCellValue("" + System.currentTimeMillis());
                }
            }
        }
        //write
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(outputFile);
            wbo.write(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}