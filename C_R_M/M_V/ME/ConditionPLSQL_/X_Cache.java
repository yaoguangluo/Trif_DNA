package M_V.ME.ConditionPLSQL_;

import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings({ "unused", "unchecked" })
/*
 * 著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 
 * 15116110525- 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道
 * 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 */
public class X_Cache extends X_ {
	public static void P_Cache(String[] sets, List<IMV_SIQ> output,
			String tableName, String baseName, IMV_SIQ object) {
		Table table = DetaDBBufferCache_M.db.getBase(baseName)
				.getTable(tableName);
		Iterator<String> iterator = table.getRows().keySet().iterator();
		int rowindex = 0;
		while (iterator.hasNext()) {
			int count = rowindex++;
			String rowIndex = iterator.next();
			Row row = table.getRow(rowIndex);
			Cell cell = new Cell();
			cell.I_CellValue(rowIndex.replace("row", ""));
			row.putCell("Index", cell);
			if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SMALL) || sets[1]
					.equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_THAN)) {
				double rowCellFromBigDecimal = new BigDecimal(
						row.getCell(sets[0]).getCellValue().toString())
						.doubleValue();
				if (rowCellFromBigDecimal < new BigDecimal(sets[2])
						.doubleValue() && row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO_R)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_LESS_THAN_AND_EQUAL_TO)) {
				String set = sets[0];
				Cell setCell = row.getCell(set);
				String cellString = setCell.getCellValue().toString();
				cellString = cellString.isEmpty() ? "0" : cellString;
				double rowCellFromBigDecimal = new BigDecimal(cellString)
						.doubleValue();
				if (rowCellFromBigDecimal <= new BigDecimal(sets[2])
						.doubleValue() && row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOUBLE_EQUALS)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_SIMPLE_EUQALS)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
				double rowCellFromBigDecimal = new BigDecimal(
						row.getCell(sets[0]).getCellValue().toString())
						.doubleValue();
				if (rowCellFromBigDecimal == new BigDecimal(sets[2])
						.doubleValue() && row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1]
					.equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO_R)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_GREATER_THAN_AND_EQUAL_TO)) {
				double rowCellFromBigDecimal = new BigDecimal(
						row.getCell(sets[0]).getCellValue().toString())
						.doubleValue();
				if (rowCellFromBigDecimal >= new BigDecimal(sets[2])
						.doubleValue() && row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_GREATER_THAN)) {
				double rowCellFromBigDecimal = new BigDecimal(
						row.getCell(sets[0]).getCellValue().toString())
						.doubleValue();
				if (rowCellFromBigDecimal > new BigDecimal(sets[2])
						.doubleValue() && row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO)
					|| sets[1].equalsIgnoreCase(
							S_ShellETL.SHELL_ETL_NOT_EUQAL_TO_R)) {
				double rowCellFromBigDecimal = new BigDecimal(
						row.getCell(sets[0]).getCellValue().toString())
						.doubleValue();
				if (rowCellFromBigDecimal != new BigDecimal(sets[2])
						.doubleValue() && row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_EQUAL)
					&& row.containsCell("is_delete_0")) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue()
						.toString();
				if (rowCellFromString.equalsIgnoreCase(sets[2])) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1]
					.equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOES_NOT_EQUALS)) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue()
						.toString();
				if (!rowCellFromString.equalsIgnoreCase(sets[2])
						&& row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}

			if (sets[1].equalsIgnoreCase((S_ShellETL.SHELL_ETL_IN))) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue()
						.toString();
				String set = ", " + sets[2] + ", ";
				if (set.contains(", " + rowCellFromString + ", ")
						&& row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
			if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_IN)) {
				String rowCellFromString = row.getCell(sets[0]).getCellValue()
						.toString();
				String set = ", " + sets[2] + ", ";
				if (!set.contains(", " + rowCellFromString + ", ")
						&& row.containsCell("is_delete_0")) {
					if (!((Map<Integer, Boolean>) (object.get("recordRows")))
							.containsKey(count)) {
						output.add(X_Map.rowToRowMap(row));
						Map<Integer, Boolean> recordRows = (Map<Integer, Boolean>) object
								.get("recordRows");
						recordRows.put(count, true);
					}
				}
			}
		}
	}
}
