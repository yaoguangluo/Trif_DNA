package U_V.ESU.office;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaYLJBufferToXls {
    public static void main(String[] argv) {
        //	int cellPhoneColumn= 6;
        //boolean hasSpec= false;
        //DB db= new XlsToDetaDBBuffer().readNonObjectXls(cellPhoneColumn, hasSpec);
    }

    @SuppressWarnings("resource")
    public boolean detaYLJBufferToXlsWithTableName(Object[] needOutputSpecData
            , Object[][] needOutputData, String filepath, String tableName
            , String fileType) {
        String xlsPath = filepath + tableName + fileType;
        XSSFWorkbook wbo = new XSSFWorkbook();
        XSSFSheet tempOutSheet = wbo.createSheet(tableName);
        int realLine = 0;
        XSSFRow rowSpecXls = tempOutSheet.createRow(realLine++);
        for (int i = 0; i < needOutputSpecData.length; i++) {
            XSSFCell xSSFCell = rowSpecXls.createCell(i);
            xSSFCell.setCellValue(needOutputSpecData[i].toString());
            xSSFCell.setCellType(CellType.STRING);
        }

        //rows
        for (int i = 0; i < needOutputData.length; i++) {
            XSSFRow rowXls = tempOutSheet.createRow(realLine++);
            for (int j = 0; j < needOutputData[i].length; j++) {
                XSSFCell xSSFCell = rowXls.createCell(j);
                Object cell = needOutputData[i][j];
                if (null != cell) {
                    String string = cell.toString();
                    if (string.length() < 15001) {//zuo 1
                        xSSFCell.setCellValue(string);
                        xSSFCell.setCellType(CellType.STRING);
                    } else {
                        int k = 0;
                        realLine = realLine - 1;
                        String temp = string.substring(15000 * k, 15000 * (k + 1));
                        xSSFCell.setCellValue(temp);
                        xSSFCell.setCellType(CellType.STRING);
                        k = 1;
                        while (15000 * k < string.length()) {
                            if (15000 * (k + 1) < string.length()) {
                                temp = string.substring(15000 * k, 15000 * (k + 1));
                            } else {
                                temp = string.substring(15000 * k, string.length());
                            }
                            XSSFRow rowComplesXls = tempOutSheet.createRow(realLine + k);
                            XSSFCell xSSFCellID = rowComplesXls.createCell(0);
                            xSSFCellID.setCellValue(needOutputData[i][0].toString());
                            xSSFCellID.setCellType(CellType.STRING);
                            XSSFCell xSSFCellName = rowComplesXls.createCell(2);
                            xSSFCellName.setCellValue(needOutputData[i][2].toString() + "_" + k);
                            xSSFCellName.setCellType(CellType.STRING);
                            //complements
                            XSSFCell xSSFComplesCell = rowComplesXls.createCell(j);
                            xSSFComplesCell.setCellValue(temp);
                            xSSFComplesCell.setCellType(CellType.STRING);
                            k++;
                        }
                        realLine += k;
                    }
                    //System.out.println(string.length());
                } else {
                    String string = "";
                    xSSFCell.setCellValue(string);
                    xSSFCell.setCellType(CellType.STRING);
                }
            }
        }
        //write
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(xlsPath);
            wbo.write(fos);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
//public void addComplementLine(int realLine, String string
//		, XSSFSheet tempOutSheet, Object[][] needOutputData, int i, int j) {
//	XSSFRow rowXls= tempOutSheet.createRow(realLine);
//	//id
//	XSSFCell xSSFCellID= rowXls.createCell(0);
//	xSSFCellID.setCellValue(needOutputData[i][0].toString());
//	xSSFCellID.setCellType(CellType.STRING);
//	
//	//complements
//	XSSFCell xSSFCell= rowXls.createCell(j);
//	String temp= string.toString();
//	System.out.println(string.length());
//	xSSFCell.setCellValue(temp);
//	xSSFCell.setCellType(CellType.STRING);
//
//}
