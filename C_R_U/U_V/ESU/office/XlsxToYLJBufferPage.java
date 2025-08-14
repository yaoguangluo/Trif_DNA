package U_V.ESU.office;

import M_V.MPI.xls.commonXLS.CommonXlsPage_X_S_s;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Base;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.DB;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Spec;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.pheromone.IMV_SIQ;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.FileInputStream;
import java.math.BigDecimal;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class XlsxToYLJBufferPage {
    public void main(String[] argv) {
        //init
        int cellPhoneColumn = 6;
        boolean hasSpec = false;
        @SuppressWarnings("unused")
        Object[][] db = new XlsxToYLJBufferPage().readNonObjectXlsx(null
            , cellPhoneColumn, hasSpec);
        //System.out.println(db.toString());
    }

    public static String[] doHasSpec(XSSFSheet sheet, CommonXlsPage_X_S_s commonXlsPage_X_S_s
        , Spec spec, int cellPhoneColumn, Table tableBuffer) {
        XSSFRow row = sheet.getRow(0);
        int rowSize = row.getLastCellNum();
        commonXlsPage_X_S_s.columnTitle = new Object[rowSize];
        String[] specNames = new String[row.getLastCellNum()];
        IMV_SIQ culumnTypes = new IMV_SIQ();
        spec.I_CulumnTypes(culumnTypes);
        for (int cellNumber = 0; cellNumber < rowSize; cellNumber++) {
            XSSFCell cellInputTemp = row.getCell(cellNumber);
            //column
            if (null != cellInputTemp) {
                if (cellInputTemp.getCellType().equals(CellType.STRING)) {
                    specNames[cellNumber] = cellInputTemp.getStringCellValue();
                    spec.I_CulumnType(cellInputTemp.getStringCellValue(), "String");
                    commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                    //System.out.println(cellInputTemp.getStringCellValue());
                } else if (cellInputTemp.getCellType().equals(CellType.NUMERIC)) {
                    if (DateUtil.isCellDateFormatted(cellInputTemp)) {
                        specNames[cellNumber] = "" + cellInputTemp
                            .getDateCellValue().getTime();
                        spec.I_CulumnType(""
                                + cellInputTemp.getDateCellValue().getTime()
                            , "StringWithDateLong");
                        //System.out.println(cellInputTemp.getDateCellValue());
                    } else {
                        BigDecimal big = BigDecimal.valueOf(cellInputTemp.getNumericCellValue());
                        if (cellNumber == cellPhoneColumn) {
                            specNames[cellNumber] = "" + big;
                            spec.I_CulumnType("" + big, "StringWithLong");
                            //System.out.println(big.toString());
                        } else {
                            specNames[cellNumber] = "" + big.doubleValue();
                            //specNames[cellNumber]=new String(cellInputTemp.toString());
                            spec.I_CulumnType("" + big.doubleValue(), "DoubleString");
                            //System.out.println(cellInputTemp.toString());
                        }
                    }
                    commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                } else {
                    specNames[cellNumber] = cellInputTemp.toString();
                    spec.I_CulumnType(cellInputTemp.toString(), "String");
                    commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                    //System.out.println(cellInputTemp.toString());
                }
            } else {
                specNames[cellNumber] = "" + cellNumber;
                spec.I_CulumnType("" + cellNumber, "String");
                commonXlsPage_X_S_s.columnTitle[cellNumber] = specNames[cellNumber];
                //System.out.println("");
            }
        }
        tableBuffer.I_Spec(spec);
        return specNames;
    }

    public static Object[][] readNonObjectXlsxWithPath(CommonXlsPage_X_S_s commonXlsPage_X_S_s
        , DB db, String filepath, int cellPhoneColumn, boolean hasSpec) {
        Object[][] output = null;
        try {
            FileInputStream fis = new FileInputStream(filepath);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            String[] str = new String[wb.getNumberOfSheets()];
            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                str[i] = Integer.toString(i);
            }
            String baseName = "XlsImges";
            Base baseBuffer = new Base();
            IMV_SIQ tables = new IMV_SIQ();
            baseBuffer.I_Tables(tables);
            //table name
            for (int sheetNumber = 0; sheetNumber < wb.getNumberOfSheets(); sheetNumber++) {
                XSSFSheet sheet = wb.getSheetAt(sheetNumber);
                String tableName = sheet.getSheetName();
                Table tableBuffer = new Table();
                int startRow = 0;
                Spec spec = new Spec();
                String[] specNames = null;
                //spec name
                if (hasSpec) {
                    specNames = doHasSpec(sheet, commonXlsPage_X_S_s, spec, cellPhoneColumn
                        , tableBuffer);
                    startRow = 1;
                }
                //row
                IMV_SIQ rows = new IMV_SIQ();
                tableBuffer.I_Rows(rows);
                output = new Object[sheet.getPhysicalNumberOfRows() - startRow][20];//max 20
                if (hasSpec) {
                    output = new Object[sheet.getPhysicalNumberOfRows()
                        - startRow][commonXlsPage_X_S_s.columnTitle.length];//max 20
                }
                //loop later。。
                for (int rowNumber = startRow; rowNumber < sheet.getPhysicalNumberOfRows(); rowNumber++) {
                    XSSFRow row = sheet.getRow(rowNumber);
                    int rowSize = row.getLastCellNum();
                    Row rowBuffer = new Row();
                    IMV_SIQ cells = new IMV_SIQ();
                    rowBuffer.I_Cells(cells);
                    for (int cellNumber = 0; cellNumber < rowSize; cellNumber++) {
                        XSSFCell cellInputTemp = row.getCell(cellNumber);
                        Cell cellBuffer = new Cell();
                        //column
                        if (null != cellInputTemp) {
                            if (cellInputTemp.getCellType().equals(CellType.STRING)) {
                                cellBuffer.I_CellValue(cellInputTemp.getStringCellValue());
                                output[rowNumber - startRow][cellNumber] = cellInputTemp.getStringCellValue();
                                //System.out.println(cellInputTemp.getStringCellValue());
                            } else if (cellInputTemp.getCellType().equals(CellType.NUMERIC)) {
                                if (DateUtil.isCellDateFormatted(cellInputTemp)) {
                                    //yi lv mo ren current millseconds
                                    cellBuffer.I_CellValue(cellInputTemp.getDateCellValue().getTime());
                                    output[rowNumber - startRow][cellNumber]
                                        = cellInputTemp.getDateCellValue().getTime();
                                    //System.out.println(cellInputTemp.getDateCellValue());
                                } else {
                                    BigDecimal big = BigDecimal.valueOf(cellInputTemp.getNumericCellValue());
                                    cellBuffer.I_CellValue(big.toString());
                                    output[rowNumber - startRow][cellNumber] = big.toString();
                                }
                            } else {
                                cellBuffer.I_CellValue(cellInputTemp.toString());
                                output[rowNumber - startRow][cellNumber] = cellInputTemp.toString();
                                //System.out.println(cellInputTemp.toString());
                            }
                        } else {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    public Object[][] readNonObjectXlsx(CommonXlsPage_X_S_s commonXlsPage_X_S_s
        , int cellPhoneColumn, boolean hasSpec) {
        DB db = new DB();
        IMV_SIQ bases = new IMV_SIQ();
        db.I_Bases(bases);
        //read
        //read
        if (null != commonXlsPage_X_S_s.xlsFilePath
            && commonXlsPage_X_S_s.xlsFilePath.contains(".xls")) {
        } else {
            FileDialog filedialog = new FileDialog(new Frame(), "filechoose", FileDialog.LOAD);
            filedialog.setVisible(true);
            commonXlsPage_X_S_s.xlsFilePath = filedialog.getDirectory() + filedialog.getFile();
        }
        return readNonObjectXlsxWithPath(commonXlsPage_X_S_s, db
            , commonXlsPage_X_S_s.xlsFilePath, cellPhoneColumn, hasSpec);
    }
}