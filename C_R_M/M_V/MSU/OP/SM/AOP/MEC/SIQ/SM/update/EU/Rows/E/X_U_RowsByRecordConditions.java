package M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E;

import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("unchecked")
/*
 * 著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用） 15116110525-
 * 430181198505250014, G24402609, EB0581342 204925063,
 * 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅
 */
public class X_U_RowsByRecordConditions {
	public static Object _E(IMV_SIQ object, boolean mod) {
		String DBPath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath"))
				.getValue().toString() + "/"
				+ object.get("baseName").toString();
		String DBtablePath = DBPath + "/" + object.get("tableName").toString();
		String DBTableRowsPath = DBtablePath + "/rows";
		List<IMV_SIQ> updateObj = (List<IMV_SIQ>) object.get("updateObj");
		Iterator<IMV_SIQ> updateObjIterator = updateObj.iterator();
		List<String[]> culumnValues = (List<String[]>) object
				.get("culumnValue");
		Iterator<String[]> culumnValuesIterator = culumnValues.iterator();
		while (updateObjIterator.hasNext()) {
			IMV_SIQ objRow = updateObjIterator.next();
			IMV_SIQ objCells = (IMV_SIQ) objRow
					.get(S_ShellETL.SHELL_ETL_ROWVALUE);
			IMV_SIQ onjCell = (IMV_SIQ) objCells.get("Index");
			String rowIndex = "row";
			rowIndex += onjCell.get("culumnValue").toString();
			while (culumnValuesIterator.hasNext()) {
				String[] culumns = culumnValuesIterator.next();
				String filePath = DBTableRowsPath + "/" + rowIndex + "/"
						+ culumns[1] + "/value.lyg";
				File currentCellChange = new File(filePath);
				if (currentCellChange.exists()) {
					if (mod) {
						currentCellChange.delete();
						FileWriter fileWriter;
						try {
							fileWriter = new FileWriter(filePath, true);
							fileWriter.write(culumns[2]);
							fileWriter.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					Cell cell = new Cell();
					cell.I_CellValue(culumns[2]);
					Row row = DetaDBBufferCache_M.db
							.getBase(object.get("baseName").toString())
							.getTable(object.get("tableName").toString())
							.getRow(rowIndex);
					if (mod) {
						row.putCell(culumns[1], cell);
					}
				}
			}
		}
		return object;
	}
}
