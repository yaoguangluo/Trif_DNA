package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.xlsReaderNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AOU_AOQ_VES;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
//import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;

import S_A.SVQ.stable.S_ShellETL;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//作者 + 著作权人： 罗瑶光, 浏阳
/*
* 著作权人, 作者 罗瑶光, 浏阳
* yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
* 15116110525-
* 430181198505250014, G24402609, EB0581342
* 204925063, 389418686, F2406501, 0626136
* 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
* */
@SuppressWarnings("serial")
public class XlsReaderOSU_MSQ_AOI_AOD_AOU_AOQ_VES extends OSU_AOU_AOQ_VES {

	private FileDialog filedialog;
	@SuppressWarnings("rawtypes")
	private JComboBox jcb;
	HSSFWorkbook wb;
	HSSFDataFormat fo;
	public XlsReaderOSU_MSQ_AOI_AOD_AOU_AOQ_VES(final XlsReaderOSU_MSQ_OPE_OPC_ECI _SQ__OPE_OPC_ECI) {
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel=new Panel();
		panel.setLayout(null);	
		panel.setBackground(Color.white);
		JButton readfile= new JButton("Read File");
		readfile.setBounds(0, 0, 100, 30);
		readfile.addActionListener(new ActionListener(){
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public void actionPerformed(ActionEvent arg0) {
				filedialog=new FileDialog(new Frame(), "filechoose", FileDialog.LOAD);
				filedialog.setVisible(true);
				_SQ__OPE_OPC_ECI.filepath=filedialog.getDirectory()+filedialog.getFile();
				System.out.println(_SQ__OPE_OPC_ECI.filepath);     
				FileInputStream fis= null;
				try {
					fis= new FileInputStream(_SQ__OPE_OPC_ECI.filepath);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
				POIFSFileSystem fs= null;
				try {
					fs= new POIFSFileSystem(fis);
				} catch (IOException e) {
					e.printStackTrace();
				} 
				wb= null;
				try {
					wb= new HSSFWorkbook(fs);
				} catch (IOException e) {
					e.printStackTrace();
				}
				String [] str=new String [wb.getNumberOfSheets()];
				for(int i=0;i<wb.getNumberOfSheets();i++){
					str[i]=new String(Integer.toString(i));
				}
				JButton choose=new JButton("Index choose");
				choose.setBounds(155, 0, 200, 30);
				choose.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0){
						HSSFSheet sheet= wb.getSheetAt(Integer.valueOf(jcb.getSelectedIndex())); 		 
						System.out.println(jcb.getSelectedIndex());
						HSSFRow row= sheet.getRow(0);   
						String[][] content= new String[sheet.getPhysicalNumberOfRows()][row.getLastCellNum()];
						String[] spec=new String[row.getLastCellNum()];
						if (row != null) {
							HSSFCell cell= null;
							for(int j=0;j<row.getLastCellNum();j++){
								cell= row.getCell(j);
								if(cell.getCellType().equals(CellType.STRING)){
									System.out.println(cell.getStringCellValue());
									spec[j]=new String("String"); 
								}
								if(cell.getCellType().equals(CellType.NUMERIC)){
									spec[j]=new String("RichString"); 
//									if(HSSFDateUtil.isCellDateFormatted(cell)){
//										System.out.println(cell.getDateCellValue());
//										spec[j]=new String("Date"); 
//									}else{
//										System.out.println(cell.getNumericCellValue());
//										spec[j]=new String("Number"); 
//									}
								}
							}
						}
						for (int i= 0; i < sheet.getPhysicalNumberOfRows(); i++) {
							row= sheet.getRow(i); 
							if (row != null) {
								HSSFCell cell= null;
								for(int j=0;j<row.getLastCellNum();j++){
									cell= row.getCell(j);
									if(cell.getCellType().equals(CellType.STRING)){
										System.out.println(cell.getStringCellValue());
										content[i][j]=new String(cell.getStringCellValue());
									}
									if(cell.getCellType().equals(CellType.NUMERIC)){
										content[i][j]=new String(cell.getRichStringCellValue().toString());
//										if(HSSFDateUtil.isCellDateFormatted(cell)){
//											System.out.println(cell.getDateCellValue().toString());
//											content[i][j]=new String(cell.getDateCellValue().toString());
//										}
//										else{
//											System.out.println(cell.getNumericCellValue());
//											content[i][j]=new String(Double.toString(cell.getNumericCellValue()));
//										}
									}
								}
							}
						}		
						_SQ__OPE_OPC_ECI.toptablein= new JTable(content, spec);
						_SQ__OPE_OPC_ECI.toptablein.setBounds(0, 100, 400, 400);
						_SQ__OPE_OPC_ECI.toptablein.setVisible(true);
						panel.add(_SQ__OPE_OPC_ECI.toptablein);					}}
						);
				panel.add(choose);
				jcb= new JComboBox(str);
				jcb.setBounds(105, 0, 150, 30);
				panel.add(jcb);   
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close= false;
	}
	public void config(){
		System.out.println(S_ShellETL.SHELL_ETL_DID_CONFIG);       
	}
}
