package M_V.ME.RelationPLSQL_;

import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"unused", "unchecked"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_P_OrMap {
    public static void _E(String[] sets, List<IMV_SIQ> obj, List<IMV_SIQ> joinObj
        , IMV_SIQ object, List<IMV_SIQ> newObj, Map<String, Boolean> findinNewObj) {
        Iterator<IMV_SIQ> iterator = obj.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            int objRowId = count++;
            IMV_SIQ objRow = iterator.next();
            IMV_SIQ row = (IMV_SIQ) objRow.get(S_ShellETL.SHELL_ETL_ROWVALUE);
            Iterator<IMV_SIQ> iteratorJoin = joinObj.iterator();
            int countJoin = 0;
            while (iteratorJoin.hasNext()) {
                int objJoinRowId = countJoin++;
                IMV_SIQ objJoinRow = iteratorJoin.next();
                IMV_SIQ joinRow = (IMV_SIQ) objJoinRow.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                IMV_SIQ cell = (IMV_SIQ) row.get(sets[0]);
                IMV_SIQ cellJoin = (IMV_SIQ) joinRow.get(sets[2]);
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOUBLE_EQUALS)
                    || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
                    if (new BigDecimal(cell.get("culumnValue").toString()).doubleValue()
                        == new BigDecimal(cellJoin.get("culumnValue").toString()).doubleValue()) {
                        if (!findinNewObj.containsKey(objRowId + ":" + objJoinRowId)) {
                            IMV_SIQ newObjRow = new IMV_SIQ();
                            IMV_SIQ newRow = new IMV_SIQ();
                            newRow.putAll((Map<? extends String, ?>) objJoinRow
                                .get(S_ShellETL.SHELL_ETL_ROWVALUE));
                            newRow.putAll((Map<? extends String, ?>) objRow
                                .get(S_ShellETL.SHELL_ETL_ROWVALUE));
                            newObjRow.put(S_ShellETL.SHELL_ETL_ROWVALUE, newRow);
                            newObj.add(newObjRow);
                            findinNewObj.put(objRowId + ":" + objJoinRowId, true);
                        }
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_EQUAL)) {
                    if (cell.get("culumnValue").toString().equals(cellJoin.get("culumnValue").toString())) {
                        if (!findinNewObj.containsKey(objRowId + ":" + objJoinRowId)) {
                            IMV_SIQ newObjRow = new IMV_SIQ();
                            IMV_SIQ newRow = new IMV_SIQ();
                            newRow.putAll((Map<? extends String
                                , ?>) objJoinRow.get(S_ShellETL.SHELL_ETL_ROWVALUE));
                            newRow.putAll((Map<? extends String
                                , ?>) objRow.get(S_ShellETL.SHELL_ETL_ROWVALUE));
                            newObjRow.put(S_ShellETL.SHELL_ETL_ROWVALUE, newRow);
                            newObj.add(newObjRow);
                            findinNewObj.put(objRowId + ":" + objJoinRowId, true);
                        }
                    }
                }
            }
        }
    }
}
