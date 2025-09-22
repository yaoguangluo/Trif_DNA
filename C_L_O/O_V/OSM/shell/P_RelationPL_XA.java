package O_V.OSM.shell;

import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
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
public class P_RelationPL_XA {
    public static void P_AndMap(String[] sets, List<IMV_SIQ> obj
        , List<IMV_SIQ> joinObj
        , IMV_SIQ object, List<IMV_SIQ> newObj) {
        List<IMV_SIQ> newObjTemp = new ArrayList<>();//later..
        Iterator<IMV_SIQ> iterator = newObj.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            int objRowId = count++;
            IMV_SIQ objRow = iterator.next();
            if (objRow.containsKey(sets[0]) && objRow.containsKey(sets[2])) {
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOUBLE_EQUALS)
                    || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
                    if (new BigDecimal(objRow.get(sets[0]).toString()).doubleValue()
                        == new BigDecimal(objRow.get(sets[2]).toString()).doubleValue()) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO)
                    || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO_R)
                    || sets[1].equalsIgnoreCase("<>") || sets[1].equalsIgnoreCase("><")) {
                    if (new BigDecimal(objRow.get(sets[0]).toString()).doubleValue()
                        != new BigDecimal(objRow.get(sets[2]).toString()).doubleValue()) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO)
                    || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO_R)) {
                    if (new BigDecimal(objRow.get(sets[0]).toString()).doubleValue()
                        >= new BigDecimal(objRow.get(sets[2]).toString()).doubleValue()) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER)) {
                    if (new BigDecimal(objRow.get(sets[0]).toString()).doubleValue()
                        > new BigDecimal(objRow.get(sets[2]).toString()).doubleValue()) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SMALL)) {
                    if (new BigDecimal(objRow.get(sets[0]).toString()).doubleValue()
                        < new BigDecimal(objRow.get(sets[2]).toString()).doubleValue()) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)
                    || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)) {
                    if (new BigDecimal(objRow.get(sets[0]).toString()).doubleValue()
                        <= new BigDecimal(objRow.get(sets[2]).toString()).doubleValue()) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_EQUAL)) {
                    if (objRow.get(sets[0]).toString().equals(objRow.get(sets[2]).toString())) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOES_NOT_EQUALS)
                    || sets[1].equalsIgnoreCase("equal!")) {
                    if (!objRow.get(sets[0]).toString().equals(objRow.get(sets[2]).toString())) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase((S_ShellETL.SHELL_ETL_IN))) {
                    String set = ", " + objRow.get(sets[2]).toString() + ", ";
                    if (set.contains(objRow.get(sets[0]).toString())) {
                        newObjTemp.add(objRow);
                    }
                }
                if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_IN)) {
                    String set = ", " + objRow.get(sets[2]).toString() + ", ";
                    if (!set.contains(objRow.get(sets[0]).toString())) {
                        newObjTemp.add(objRow);
                    }
                }
            }
        }
    }

    public static void P_OrMap(String[] sets, List<IMV_SIQ> obj
        , List<IMV_SIQ> joinObj
        , IMV_SIQ object, List<IMV_SIQ> newObj
        , Map<String, Boolean> findinNewObj) {
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
                            newRow.putAll((Map<? extends String
                                , ? extends Object>) objJoinRow.get(S_ShellETL.SHELL_ETL_ROWVALUE));
                            newRow.putAll((Map<? extends String
                                , ? extends Object>) objRow.get(S_ShellETL.SHELL_ETL_ROWVALUE));
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
                                , ? extends Object>) objJoinRow.get(S_ShellETL.SHELL_ETL_ROWVALUE));
                            newRow.putAll((Map<? extends String
                                , ? extends Object>) objRow.get(S_ShellETL.SHELL_ETL_ROWVALUE));
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
