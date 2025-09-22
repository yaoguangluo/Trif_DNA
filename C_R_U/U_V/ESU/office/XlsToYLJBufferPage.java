package U_V.ESU.office;

import M_V.MPI.xls.commonXLS.CommonXlsPage_X_S_s;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Base;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.DB;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Spec;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.pheromone.IMV_SIQ;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

public class XlsToYLJBufferPage {
    public static void main(String[] argv) {
        //init
        int cellPhoneColumn = 6;
        boolean hasSpec = false;
        @SuppressWarnings("unused")
        Object[][] db = new XlsToYLJBufferPage().readNonObjectXls(null, cellPhoneColumn, hasSpec);
        //System.out.println(db.toString());
    }

    public Object[][] readNonObjectXls(CommonXlsPage_X_S_s commonXlsPage_X_S_s
        , int cellPhoneColumn, boolean hasSpec) {
        Object[][] output = null;
        DB db = new DB();
        IMV_SIQ bases = new IMV_SIQ();
        db.I_Bases(bases);
        //read
        if (null != commonXlsPage_X_S_s.xlsFilePath
            && commonXlsPage_X_S_s.xlsFilePath.contains(".xls")) {
        } else {
            FileDialog filedialog = new FileDialog(new Frame(), "filechoose", FileDialog.LOAD);
            filedialog.setVisible(true);
            commonXlsPage_X_S_s.xlsFilePath = filedialog.getDirectory() + filedialog.getFile();
        }
        //System.out.println("1--"+ filepath);
        if (commonXlsPage_X_S_s.xlsFilePath.contains(".xlsx")) {
            output = XlsxToYLJBufferPage.readNonObjectXlsxWithPath(commonXlsPage_X_S_s
                , db, commonXlsPage_X_S_s.xlsFilePath, cellPhoneColumn, hasSpec);
        } else if (commonXlsPage_X_S_s.xlsFilePath.contains(".xls")) {
            output = readNonObjectXlsWithPath(commonXlsPage_X_S_s
                , db, commonXlsPage_X_S_s.xlsFilePath, cellPhoneColumn, hasSpec);
        }
        return output;
    }

    public Object[][] readNonObjectXlsWithPath(CommonXlsPage_X_S_s commonXlsPage_X_S_s
        , DB db, String filepath, int cellPhoneColumn, boolean hasSpec) {
        Object[][] output = null;
        FileInputStream fis;
        try {
            fis = new FileInputStream(filepath);
            POIFSFileSystem fs = new POIFSFileSystem(fis);
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            String[] str = new String[wb.getNumberOfSheets()];
            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                str[i] = Integer.toString(i);
            }
            String baseName = "XlsImages";
            Base baseBuffer = new Base();
            IMV_SIQ tables = new IMV_SIQ();
            baseBuffer.I_Tables(tables);
            //table name
            for (int sheetNumber = 0; sheetNumber < wb.getNumberOfSheets(); sheetNumber++) {
                HSSFSheet sheet = wb.getSheetAt(sheetNumber);
                String tableName = sheet.getSheetName();
                Table tableBuffer = new Table();
                int startRow = 0;
                Spec spec = new Spec();
                String[] specNames = null;
                //spec name
                if (hasSpec) {
                    HSSFRow row = sheet.getRow(0);
                    int rowSize = row.getLastCellNum();
                    specNames = new String[row.getLastCellNum()];
                    IMV_SIQ culumnTypes = new IMV_SIQ();
                    spec.I_CulumnTypes(culumnTypes);
                    for (int cellNumber = 0; cellNumber < rowSize; cellNumber++) {
                        HSSFCell cellInputTemp = row.getCell(cellNumber);
                        //column
                        if (null != cellInputTemp) {
                            if (cellInputTemp.getCellType().equals(CellType.STRING)) {
                                //
                                specNames[cellNumber] = cellInputTemp.getStringCellValue();
                                spec.I_CulumnType(cellInputTemp.getStringCellValue(), "String");
                                commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                                //System.out.println(cellInputTemp.getStringCellValue());
                            } else if (cellInputTemp.getCellType().equals(CellType.NUMERIC)) {
                                if (DateUtil.isCellDateFormatted(cellInputTemp)) {
                                    specNames[cellNumber] = ""
                                        + cellInputTemp.getDateCellValue().getTime();
                                    spec.I_CulumnType(""
                                        + cellInputTemp.getDateCellValue().getTime(), "StringWithDateLong");
                                    //System.out.println(cellInputTemp.getDateCellValue());
                                } else {
                                    BigDecimal big
                                        = BigDecimal.valueOf(cellInputTemp.getNumericCellValue());
                                    if (cellNumber == cellPhoneColumn) {
                                        //
                                        specNames[cellNumber] = "" + big;
                                        spec.I_CulumnType("" + big, "StringWithLong");
                                        //System.out.println(big.toString());
                                    } else {
                                        //
                                        specNames[cellNumber] = "" + big.doubleValue();
                                        //specNames[cellNumber]=new String(cellInputTemp.toString());
                                        spec.I_CulumnType("" + big.doubleValue(), "DoubleString");
                                        //System.out.println(cellInputTemp.toString());
                                    }
                                }
                                commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                            } else {
                                //
                                specNames[cellNumber] = cellInputTemp.toString();
                                spec.I_CulumnType(cellInputTemp.toString(), "String");
                                commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                                //System.out.println(cellInputTemp.toString());
                            }
                        } else {
                            //
                            specNames[cellNumber] = "" + cellNumber;
                            spec.I_CulumnType("" + cellNumber, "String");
                            commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                            //System.out.println("");
                        }

                    }
                    startRow = 1;
                    tableBuffer.I_Spec(spec);
                }
                //row
                IMV_SIQ rows = new IMV_SIQ();
                tableBuffer.I_Rows(rows);
                output = new Object[sheet.getPhysicalNumberOfRows() - startRow][20];//max 20
                //loop
                for (int rowNumber = startRow; rowNumber < sheet.getPhysicalNumberOfRows(); rowNumber++) {
                    HSSFRow row = sheet.getRow(rowNumber);
                    int rowSize = row.getLastCellNum();
                    Row rowBuffer = new Row();
                    IMV_SIQ cells = new IMV_SIQ();
                    rowBuffer.I_Cells(cells);
                    for (int cellNumber = 0; cellNumber < rowSize; cellNumber++) {
                        HSSFCell cellInputTemp = row.getCell(cellNumber);
                        Cell cellBuffer = new Cell();
                        //column
                        if (null != cellInputTemp) {
                            cellBuffer.I_CellValue(cellInputTemp.getRichStringCellValue());
                            output[rowNumber - startRow][cellNumber] = cellInputTemp.getStringCellValue();
                        } else {
                            //
                            cellBuffer.I_CellValue("");
                            output[rowNumber - startRow][cellNumber] = "";
                            //System.out.println("");
                        }
                        if (hasSpec) {
                            rowBuffer.putCell(specNames[cellNumber], cellBuffer);
                        } else {
                            rowBuffer.putCell("column:" + cellNumber, cellBuffer);
                        }
                    }
                    tableBuffer.putRow("row:" + rowNumber, rowBuffer);
                }
                baseBuffer.putTable(tableName, tableBuffer);
            }
            db.putBase(baseName, baseBuffer);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}