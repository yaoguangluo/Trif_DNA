package M_V.ME.RelationPLSQL_;

import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SQI;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings({ "unused", "unchecked" })
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用） 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342 204925063,
 * 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 */
public class X_P_OrMap {
	public static void _E(String[] sets, List<IMV_SQI> obj,
			List<IMV_SQI> joinObj, IMV_SQI object, List<IMV_SQI> newObj,
			Map<String, Boolean> findinNewObj) {
		Iterator<IMV_SQI> iterator = obj.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			int objRowId = count++;
			IMV_SQI objRow = iterator.next();
			IMV_SQI row = (IMV_SQI) objRow.get(S_ShellETL.SHELL_ETL_ROWVALUE);
			Iterator<IMV_SQI> iteratorJoin = joinObj.iterator();
			int countJoin = 0;
			while (iteratorJoin.hasNext()) {
				int objJoinRowId = countJoin++;
				IMV_SQI objJoinRow = iteratorJoin.next();
				IMV_SQI joinRow = (IMV_SQI) objJoinRow
						.get(S_ShellETL.SHELL_ETL_ROWVALUE);
				IMV_SQI cell = (IMV_SQI) row.get(sets[0]);
				IMV_SQI cellJoin = (IMV_SQI) joinRow.get(sets[2]);
				if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOUBLE_EQUALS)
						|| sets[1].equalsIgnoreCase(
								S_ShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
					if (new BigDecimal(cell.get("culumnValue").toString())
							.doubleValue() == new BigDecimal(
									cellJoin.get("culumnValue").toString())
									.doubleValue()) {
						if (!findinNewObj
								.containsKey(objRowId + ":" + objJoinRowId)) {
							IMV_SQI newObjRow = new IMV_SQI();
							IMV_SQI newRow = new IMV_SQI();
							newRow.putAll((Map<? extends String, ?>) objJoinRow
									.get(S_ShellETL.SHELL_ETL_ROWVALUE));
							newRow.putAll((Map<? extends String, ?>) objRow
									.get(S_ShellETL.SHELL_ETL_ROWVALUE));
							newObjRow.put(S_ShellETL.SHELL_ETL_ROWVALUE,
									newRow);
							newObj.add(newObjRow);
							findinNewObj.put(objRowId + ":" + objJoinRowId,
									true);
						}
					}
				}
				if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_EQUAL)) {
					if (cell.get("culumnValue").toString()
							.equals(cellJoin.get("culumnValue").toString())) {
						if (!findinNewObj
								.containsKey(objRowId + ":" + objJoinRowId)) {
							IMV_SQI newObjRow = new IMV_SQI();
							IMV_SQI newRow = new IMV_SQI();
							newRow.putAll((Map<? extends String, ?>) objJoinRow
									.get(S_ShellETL.SHELL_ETL_ROWVALUE));
							newRow.putAll((Map<? extends String, ?>) objRow
									.get(S_ShellETL.SHELL_ETL_ROWVALUE));
							newObjRow.put(S_ShellETL.SHELL_ETL_ROWVALUE,
									newRow);
							newObj.add(newObjRow);
							findinNewObj.put(objRowId + ":" + objJoinRowId,
									true);
						}
					}
				}
			}
		}
	}
}
