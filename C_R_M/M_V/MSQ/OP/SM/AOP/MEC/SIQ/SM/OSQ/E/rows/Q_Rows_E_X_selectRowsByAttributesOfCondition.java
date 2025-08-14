package M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows;

import M_V.ME.ConditionPLSQL_.X_Cache;
import M_V.ME.ConditionPLSQL_.X_Map;
import M_V.ME.ConditionPLSQL_.X_Table;
import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Spec;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;

import java.io.File;
import java.util.ArrayList;
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
public class Q_Rows_E_X_selectRowsByAttributesOfCondition {
    //因为数据id的补充, 今天开始进行相应的debug验证  罗瑶光20210405
    public static Object _E(IMV_SIQ object) {
        if (!object.containsKey("recordRows")) {
            Map<String, Boolean> recordRows = new IMV_SIQ();
            object.put("recordRows", recordRows);
        }
        Spec spec = new Spec();
        spec.I_CulumnTypes(new IMV_SIQ());
        String objectType = "";
        List<IMV_SIQ> output = new ArrayList<>();
        //锁定数据库
        String DBPath = Cache_M.getCacheInfo("DBPath").getValue().toString() + "/"
                + object.get("baseName").toString();
        //锁定表
        File fileDBPath = new File(DBPath);
        if (fileDBPath.isDirectory()) {
            String DBTablePath = DBPath + "/" + object.get("tableName").toString();
            File fileDBTable = new File(DBTablePath);
            if (fileDBTable.isDirectory()) {
                String DBTableCulumnPath = DBTablePath + "/spec";
                File fileDBTableCulumn = new File(DBTableCulumnPath);
                if (fileDBTableCulumn.isDirectory()) {
                    //读取列数据格式
                    String[] fileList = fileDBTableCulumn.list();
                    for (int i = 0; i < fileList.length; i++) {
                        File readDBTableSpecCulumnFile = new File(DBTableCulumnPath + "/"
                                + fileList[0] + "/value.lyg");
                        DetaBufferedReader reader = new DetaBufferedReader(DetaFileReader.E(readDBTableSpecCulumnFile));
                        String tempString = null;
                        while ((tempString = reader.readDetaLine()) != null) {
                            objectType = tempString;
                        }
                        reader.closeDeta();
                        spec.I_CulumnType(fileList[i], objectType);
                    }
                    List<String[]> conditionValues = (List<String[]>) object.get(S_ShellETL.SHELL_ETL_CONDITION);
                    Iterator<String[]> iterator = conditionValues.iterator();
                    while (iterator.hasNext()) {
                        boolean overMap = output.size() == 0 ? false : true;
                        String[] conditionValueArray = iterator.next();
                        String type = conditionValueArray[1];
                        boolean andMap = type.equalsIgnoreCase("and") ? true : false;
                        for (int i = 2; i < conditionValueArray.length; i++) {
                            String[] sets = conditionValueArray[i].split("\\|");
                            if (overMap && andMap) {
                                X_Map.P_Map(sets, output, DBTablePath);//1
                            } else if (DetaDBBufferCache_M.dbCache) {
                                X_Cache.P_Cache(sets, output, object.get("tableName").toString()
                                        , object.get("baseName").toString(), object);//1
                            } else {
                                //DMA的表格导入, 我等下同样进行验算, 2年的编写过程全部朔源. 20210405 让猫腻 无死角.
                                X_Table.P_Table(sets, output, DBTablePath, object);//1
                            }
                        }
                    }
                }
            }
        }
        return output;
    }
}
