package M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E;

import M_V.ME.ConditionPLSQL_.X_Cache;
import M_V.ME.ConditionPLSQL_.X_Map;
import M_V.ME.ConditionPLSQL_.X_Table;
import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Spec;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@SuppressWarnings({"unused", "unchecked"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_U_RowsByAttributesOfJoinCondition {
    public static Object _E(IMV_SIQ object, boolean mod) {
        if (!object.containsKey("recordRows")) {
            Map<String, Boolean> recordRows = new IMV_SIQ();
            object.put("recordRows", recordRows);
        }
        Spec spec = new Spec();
        spec.I_CulumnTypes(new IMV_SIQ());
        String objectType = "";
        List<IMV_SIQ> output = new ArrayList<>();
        //锁定数据库
        String DBPath = Objects.requireNonNull(Cache_M.getCacheInfo("DBPath")).getValue().toString() + "/"
            + object.get(S_ShellETL.SHELL_ETL_JOIN_BASE_NAME).toString();
        //锁定表
        File fileDBPath = new File(DBPath);
        if (fileDBPath.isDirectory()) {
            String DBTablePath = DBPath + "/" + object.get("joinTableName").toString();
            File fileDBTable = new File(DBTablePath);
            if (fileDBTable.isDirectory()) {
                String DBTableCulumnPath = DBTablePath + "/spec";
                File fileDBTableCulumn = new File(DBTableCulumnPath);
                if (fileDBTableCulumn.isDirectory()) {
                    //读取列数据格式
                    String[] fileList = fileDBTableCulumn.list();
                    assert fileList != null;
                    for (String s : Objects.requireNonNull(fileList)) {
                        File readDBTableSpecCulumnFile = new File(DBTableCulumnPath + "/"
                            + fileList[0] + "/value.lyg");
                        DetaBufferedReader reader
                            = new DetaBufferedReader(DetaFileReader.E(readDBTableSpecCulumnFile));
                        String tempString;
                        while ((tempString = reader.readDetaLine()) != null) {
                            objectType = tempString;
                        }
                        reader.closeDeta();
                        spec.I_CulumnType(s, objectType);
                    }
                    List<String[]> conditionValues
                        = (List<String[]>) object.get(S_ShellETL.SHELL_ETL_CONDITION);
                    for (String[] conditionValue : conditionValues) {
                        boolean overMap = output.size() != 0;
                        String type = conditionValue[1];
                        boolean andMap = type.equalsIgnoreCase("and");
                        for (int i = 2; i < conditionValue.length; i++) {
                            String[] sets = conditionValue[i].split("\\|");
                            if (overMap && andMap) {
                                X_Map.P_Map(sets, output, DBTablePath);
                            } else if (DetaDBBufferCache_M.dbCache) {
                                X_Cache.P_Cache(sets
                                    , output, object.get("joinTableName").toString()
                                    , object.get(S_ShellETL.SHELL_ETL_JOIN_BASE_NAME).toString(), object);
                            } else {
                                X_Table.P_Table(sets, output, DBTablePath, object);
                            }
                        }
                    }
                }
            }
        }
        return output;
    }
}
