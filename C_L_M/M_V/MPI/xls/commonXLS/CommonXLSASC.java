package M_V.MPI.xls.commonXLS;

import java.util.Map;

//import stringSearch.SortStringSearch;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CommonXLSASC{
	public static Map<String, int[][]> createXlSASC(Object[][] tableData_old
			, int[] identifyColumns, Map<String, int[][]> subASCmap, String nameFile) {
//		for(int i= 0; i< tableData_old.length; i++) {
//			String rowString= new String();
//			SortStringSearch stringSearch= new SortStringSearch();
//			for(int j= 0; j< tableData_old[0].length; j++) { 
//				rowString+= tableData_old[i][j]
//				= (null== tableData_old[i][j]? "": tableData_old[i][j]);
//			}
//			stringSearch.init(rowString, "");
//			int[][] pa= new int[2][stringSearch.isascii.length];
//			pa[0]=stringSearch.ispos;
//			pa[1]=stringSearch.isascii;
//			String trcl=new String(nameFile+ "_"+ i);
//			System.out.println(trcl);
//			subASCmap.put(trcl, pa.clone());
//		}		
		return subASCmap;
	}
}