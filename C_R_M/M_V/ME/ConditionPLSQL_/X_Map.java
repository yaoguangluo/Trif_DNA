package M_V.ME.ConditionPLSQL_;

import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings({ "unused", "unchecked"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_Map extends X_ {
	//以后优化成统一对象输出, 不需要再转换。2019-1-15 tin
	public static IMV_SIQ rowToRowMap(Row row) {
		IMV_SIQ culumnMaps= new IMV_SIQ();
		IMV_SIQ rowMap= new IMV_SIQ();
		for (String cellName : row.getCells().keySet()) {
			if (!cellName.contains("is_delete")) {
				Cell cell = row.getCell(cellName);
				IMV_SIQ culumnMap = new IMV_SIQ();
				culumnMap.put(S_ShellETL.SHELL_ETL_CULUMNNAME, cellName);
				culumnMap.put("culumnValue", cell.getCellValue().toString());
				culumnMaps.put(cellName, culumnMap);
			}
		}
		rowMap.put(S_ShellETL.SHELL_ETL_ROWVALUE, culumnMaps);
		return rowMap;
	}

	public static void P_Map(String[] sets, List<IMV_SIQ> output, String dBTablePath) {
		List<IMV_SIQ> outputTemp= new ArrayList<>();
		Iterator<IMV_SIQ> iterator= output.iterator();
		int rowid= 0;
		while(iterator.hasNext()) {
			IMV_SIQ row= iterator.next();
			IMV_SIQ rowMap= new IMV_SIQ();
			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SMALL)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_THAN)) {
				String rowCellFromString 
				= ((IMV_SIQ)(((IMV_SIQ)(row
						.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() 
						< new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO_R)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_THAN_AND_EQUAL_TO)) {
				String rowCellFromString= ((Map<String
						, Object>)(((IMV_SIQ)(row
								.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() 
						<=  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOUBLE_EQUALS)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SIMPLE_EUQALS)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
				String rowCellFromString= ((IMV_SIQ)(((Map
						<String, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() 
						==  new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO_R) 
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_THAN_AND_EQUAL_TO)) {
				String rowCellFromString= ((IMV_SIQ)(((Map
						<String, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() 
						>= new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_THAN)) {
				String rowCellFromString= ((IMV_SIQ)(((Map
						<String, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() 
						> new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}
			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO)
					||sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO_R)) {
				String rowCellFromString= ((IMV_SIQ)(((Map<String
						, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(new BigDecimal(rowCellFromString).doubleValue() 
						!= new BigDecimal(sets[2]).doubleValue()) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_EQUAL)) {
				String rowCellFromString= ((IMV_SIQ)(((Map
						<String, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOES_NOT_EQUALS)) {
				String rowCellFromString= ((IMV_SIQ)(((Map
						<String, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				if(!rowCellFromString.equalsIgnoreCase(sets[2])) {
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase((S_ShellETL.SHELL_ETL_IN))) {
				String rowCellFromString= ((IMV_SIQ)(((Map
						<String, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				String set= ", " + sets[2] + ", ";
				if(set.contains(", " + rowCellFromString + ", ")){
					outputTemp.add(row);
				}	
			}

			if(sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_IN)) {
				String rowCellFromString= ((IMV_SIQ)(((Map
						<String, Object>)(row.get(S_ShellETL.SHELL_ETL_ROWVALUE)))
						.get(sets[0]))).get("culumnValue").toString();
				String set= ", " + sets[2] + ", ";
				if(!set.contains(", " + rowCellFromString + ", ")){
					outputTemp.add(row);
				}	
			}
		}
		output.clear();
		output.addAll(outputTemp);
	}
}
