package U_V.ESU.csv;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("static-access")
//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CSV_ESU {
    @SuppressWarnings("resource")
    public static Object[][] xlsOrCsvFileToObjectMartix(String filePath
            , int pageSheetIndex) {
        FileInputStream fileInputStream = null;
        Object[][] output = new Object[0][];
        try {
            fileInputStream = new FileInputStream(filePath);
            POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem(fileInputStream);
            HSSFWorkbook hSSFWorkbook = new HSSFWorkbook(pOIFSFileSystem);
            HSSFSheet hSSFSheet = hSSFWorkbook.getSheetAt(Integer
                    .valueOf(pageSheetIndex));
            HSSFRow hSSFRow = hSSFSheet.getRow(0);
            output = new String[hSSFSheet.getPhysicalNumberOfRows()]
                    [hSSFRow.getLastCellNum()];
            for (int i = 0; i < hSSFSheet.getPhysicalNumberOfRows(); i++) {//ROW
                if (null != (hSSFRow = hSSFSheet.getRow(i))) {
                    for (int j = 0; j < hSSFRow.getLastCellNum(); j++) {//CULUMN
                        HSSFCell hSSFCell = hSSFRow.getCell(j);
                        if (CellType.STRING == hSSFCell.getCellType()) {
                            output[i][j] = hSSFCell.getStringCellValue();
                        }
                        if (CellType.BOOLEAN == hSSFCell.getCellType()) {
                            output[i][j] = hSSFCell.getBooleanCellValue();
                        }
                        if (CellType.NUMERIC == hSSFCell.getCellType()) {
                            //	output[i][j]= hSSFCell.getRichStringCellValue();
                            if (DateUtil.isCellDateFormatted(hSSFCell)) {
                                output[i][j] = hSSFCell.getDateCellValue();
                            } else {
                                output[i][j] = hSSFCell.getNumericCellValue();
                            }
                        }
                        if (CellType.ERROR == hSSFCell.getCellType()) {
                            output[i][j] = hSSFCell.getErrorCellValue();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    @SuppressWarnings("resource")
    public static List<Object[]> xlsOrCsvFileToListObject(String filePath
            , int pageSheetIndex) {
        List<Object[]> list = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem(fileInputStream);
            HSSFWorkbook hSSFWorkbook = new HSSFWorkbook(pOIFSFileSystem);
            HSSFSheet hSSFSheet = hSSFWorkbook.getSheetAt(Integer
                    .valueOf(pageSheetIndex));
            HSSFRow hSSFRow = hSSFSheet.getRow(0);
            list = new ArrayList<>();
            for (int i = 0; i < hSSFSheet.getPhysicalNumberOfRows(); i++) {//ROW
                Object[] objectRow = new String[hSSFRow.getLastCellNum()];
                if (null != (hSSFRow = hSSFSheet.getRow(i))) {
                    for (int j = 0; j < hSSFRow.getLastCellNum(); j++) {//CULUMN
                        HSSFCell hSSFCell = hSSFRow.getCell(j);
                        if (CellType.STRING == hSSFCell.getCellType()) {
                            objectRow[j] = hSSFCell.getStringCellValue();
                        }
                        if (CellType.BOOLEAN == hSSFCell.getCellType()) {
                            objectRow[j] = hSSFCell.getBooleanCellValue();
                        }
                        if (CellType.NUMERIC == hSSFCell.getCellType()) {
                            objectRow[j] = hSSFCell.getRichStringCellValue();
                        }
                        if (CellType.ERROR == hSSFCell.getCellType()) {
                            objectRow[j] = hSSFCell.getErrorCellValue();
                        }
                    }
                }
                list.add(objectRow);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    @SuppressWarnings("resource")
    public static List<Object[]> xlsOrCsvFileToRangedListObject(String filePath
            , int pageSheetIndex, Map<Integer, Boolean> rows
            , Map<Integer, Boolean> culumns) {
        List<Object[]> list = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem(fileInputStream);
            HSSFWorkbook hSSFWorkbook = new HSSFWorkbook(pOIFSFileSystem);
            HSSFSheet hSSFSheet = hSSFWorkbook
                    .getSheetAt(Integer.valueOf(pageSheetIndex));
            HSSFRow hSSFRow = hSSFSheet.getRow(0);
            list = new ArrayList<>();
            for (int i = 0; i < hSSFSheet.getPhysicalNumberOfRows()
                    && rows.containsKey(i); i++) {//ROW
                Object[] objectRow = new String[hSSFRow.getLastCellNum()];
                if (null != (hSSFRow = hSSFSheet.getRow(i))) {
                    for (int j = 0; j < hSSFRow.getLastCellNum()
                            && culumns.containsKey(j); j++) {//CULUMN
                        HSSFCell hSSFCell = hSSFRow.getCell(j);
                        if (CellType.STRING == hSSFCell.getCellType()) {
                            objectRow[j] = hSSFCell.getStringCellValue();
                        }
                        if (CellType.BOOLEAN == hSSFCell.getCellType()) {
                            objectRow[j] = hSSFCell.getBooleanCellValue();
                        }
                        if (CellType.NUMERIC == hSSFCell.getCellType()) {
                            if (DateUtil.isCellDateFormatted(hSSFCell)) {
                                objectRow[j] = hSSFCell.getDateCellValue();
                            } else {
                                objectRow[j] = hSSFCell.getNumericCellValue();
                            }
                        }
                        if (CellType.ERROR == hSSFCell.getCellType()) {
                            objectRow[j] = hSSFCell.getErrorCellValue();
                        }
                    }
                }
                list.add(objectRow);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    @SuppressWarnings("resource")
    public static Object[][] xlsOrCsvFileToRangedObjectMartix(String filePath
            , int pageSheetIndex, Map<Integer, Boolean> rows
            , Map<Integer, Boolean> culumns) {
        Object[][] output = new Object[0][];
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            POIFSFileSystem pOIFSFileSystem = new POIFSFileSystem(fileInputStream);
            HSSFWorkbook hSSFWorkbook = new HSSFWorkbook(pOIFSFileSystem);
            HSSFSheet hSSFSheet = hSSFWorkbook
                    .getSheetAt(Integer.valueOf(pageSheetIndex));
            HSSFRow hSSFRow = hSSFSheet.getRow(0);
            output = new String[hSSFSheet.getPhysicalNumberOfRows()]
                    [hSSFRow.getLastCellNum()];
            for (int i = 0; i < hSSFSheet.getPhysicalNumberOfRows()
                    && rows.containsKey(i); i++) {//ROW
                if (null != (hSSFRow = hSSFSheet.getRow(i))) {
                    for (int j = 0; j < hSSFRow.getLastCellNum()
                            && culumns.containsKey(j); j++) {//CULUMN
                        HSSFCell hSSFCell = hSSFRow.getCell(j);
                        if (CellType.STRING == hSSFCell.getCellType()) {
                            output[i][j] = hSSFCell.getStringCellValue();
                        }
                        if (CellType.BOOLEAN == hSSFCell.getCellType()) {
                            output[i][j] = hSSFCell.getBooleanCellValue();
                        }
                        if (CellType.NUMERIC == hSSFCell.getCellType()) {
                            if (DateUtil.isCellDateFormatted(hSSFCell)) {
                                output[i][j] = hSSFCell.getDateCellValue();
                            } else {
                                output[i][j] = hSSFCell.getNumericCellValue();
                            }
                        }
                        if (CellType.ERROR == hSSFCell.getCellType()) {
                            output[i][j] = hSSFCell.getErrorCellValue();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }
}
