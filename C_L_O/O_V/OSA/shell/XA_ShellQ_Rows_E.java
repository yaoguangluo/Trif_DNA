package O_V.OSA.shell;

import A_V.E.RatioMap_E;
import ME.VPC.M.app.App;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import plshell.P_CO_XA_X_Cache;
import plshell.P_CO_XA_X_Map;
import O_V.OSM.shell.P_AO_PLETL;
import O_V.OSM.shell.P_AO_PLTCP;
import O_V.OSM.shell.P_AO_pl_XA;
import O_V.OSM.shell.P_I_CulumnsPL_XA;
import S_A.SVQ.stable.S_ShellETL;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;
import S_I.OSI.PSO.regex.DoSplit;
import U_V.ESU.list.List_ESU_X_stringlistToStringArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//整体 plsql 替换成 plsearch, 稍后测试验证 罗瑶光20210927
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

public class XA_ShellQ_Rows_E {
    public static List<IMV_SIQ> selectRowsByAttribute(String currentDB
        , String tableName, String culmnName, Object value) {
        if (value == null) {
            value = "";
        }
        String objectType = "";
        List<IMV_SIQ> output = new ArrayList<>();
        XA_ShellTable table = XA_ShellTables.searchShellTables.get(tableName);
        //稍后把下面的 Table 替换成 SearchShellTable 即可。
        for (int i = 0; i < table.huaRuiJiJtableRows.length; i++) {
            //Object[] row= table.huaRuiJiJtable[count];
            //还是要变成map, 不然 命令的 key值查询 只能forloop, 效率减低
            Row row = table.huaRuiJiJtableRows[i];
            if (row.getCell(culmnName).equals(value)) {
                output.add(P_CO_XA_X_Map.rowToRowMap(row));
            }
        }
        return output;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        new XA_ShellQ_Rows_E().selectRowsByAttribute("backend", "login"
            , "usr_name", "yaoguangluo");
        // deletefile("D:/file");
        //20230106-System.out.println("ok");
    }

    //今天看了下发现我的数据库 没有分页, 以后会设计一个文件夹最大为3000 rows
    //一页, 先不管了, shell 用不到sheets逻辑。
    //罗瑶光20210927
    public static IMV_SIQ selectRowsByTablePath(String tablePath, String pageBegin
        , String pageEnd, String direction) {
        IMV_SIQ output = new IMV_SIQ();
        XA_ShellTable table = XA_ShellTables.searchShellTables.get(tablePath);
        output.put("tablePath", tablePath);
        int rowBeginIndex = Integer.valueOf(pageBegin);
        int rowEndIndex = Integer.valueOf(pageEnd);
        int totalPages = (rowEndIndex - rowBeginIndex) / 15; //稍后优化, 多加了一个功能。
        int totalRows = table.huaRuiJiJtableRows.length;
        List<Object> rowMapList = new ArrayList<>();
        int operationRowIndex = direction.contains("next") ? rowEndIndex++ : --rowBeginIndex;
        IMV_SIQ culumnMaps = new IMV_SIQ();
        Here:
        for (int i = operationRowIndex; i < operationRowIndex + 15; i++) {
            IMV_SIQ rowMap = new IMV_SIQ();
            if (i >= table.huaRuiJiJtableRows.length) {
                continue Here;
            }
            Row row = table.huaRuiJiJtableRows[i];
            Iterator<String> iterator = row.getCells().keySet().iterator();
            while (iterator.hasNext()) {
                String culumnName = iterator.next();
                IMV_SIQ culumnMap = new IMV_SIQ();
                culumnMap.put(S_ShellETL.SHELL_ETL_CULUMNNAME, culumnName);
                culumnMap.put("culumnValue", row.getCells().get(culumnName));
                culumnMaps.put(culumnName, culumnMap);
            }
            rowMap.put(S_ShellETL.SHELL_ETL_ROWVALUE, culumnMaps);
            if (direction.contains("next")) {
                rowMap.put("rowIndex", rowEndIndex - 1);
                rowMapList.add(rowMap);
            } else {
                rowMap.put("rowIndex", rowBeginIndex);
                rowMapList.add(0, rowMap);
            }
        }
        if (direction.contains("next")) {//有next, 就
            output.put("pageBegin", Integer.valueOf(pageEnd));
            output.put("pageEnd", rowEndIndex);
            output.put("totalPages", totalRows);
        } else {
            output.put("pageBegin", rowBeginIndex);
            output.put("pageEnd", Integer.valueOf(pageBegin));
            output.put("totalPages", totalRows);
        }
        output.put("obj", rowMapList);
        List<Object> spec = new ArrayList<>();
        IMV_SIQ row = (IMV_SIQ) rowMapList.get(0);
        IMV_SIQ culumns = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);

        Iterator<String> it = culumns.keySet().iterator();
        while (it.hasNext()) {
            spec.add(((IMV_SIQ) culumns.get(it.next())).get(S_ShellETL.SHELL_ETL_CULUMNNAME).toString());
        }
        output.put("spec", spec);
        return output;
    }


    //db替换shell中 20210927
    public static Object selectRowsByAttributesOfCondition(IMV_SIQ object, App NE) {
        if (!object.containsKey("recordRows")) {
            Map<String, Boolean> recordRows = new IMV_SIQ();
            object.put("recordRows", recordRows);
        }
        List<IMV_SIQ> output = new ArrayList<>();
        //SearchShellTable table= SearchShellTables.searchShellTables.get(object.get("tableName").toString());
        List<String[]> conditionValues = (List<String[]>) object.get("条件为");//条件计算
        Iterator<String[]> iterator = conditionValues.iterator();
        while (iterator.hasNext()) {
            String[] conditionValueArray = iterator.next();
            String type = conditionValueArray[1];
            boolean andMap = type.equalsIgnoreCase("和") ? true : false;
            boolean orMap = type.equalsIgnoreCase("或") ? true : false;
            for (int i = 2; i < conditionValueArray.length; i++) {
                List<String> lists = DoSplit.splitRegex(conditionValueArray[i]
                    , "\\|", "\\", "\\");
                String[] sets = List_ESU_X_stringlistToStringArray._E(lists);
                //1 先检查是否有record row
                boolean hasOutputMap = output.size() == 0 ? false : true;
                ConcurrentHashMap<Integer, Object> map = (ConcurrentHashMap<Integer
                    , Object>) object.get("recordRows");
                boolean hasRecordMap = map.isEmpty() ? false : true;
                if ((hasOutputMap || hasRecordMap) && andMap) {
                    //再增加一个条件 是不是第一次 执行条件为*/
                    //罗瑶光 20211015*/
                    P_CO_XA_X_Map.P_Map(sets, output, object.get("获取表名").toString()
                        .replace("临时", ""), object, NE);
                } else {
                    P_CO_XA_X_Cache.P_Cache(sets, output, object.get("获取表名").toString()
                        .replace("临时", ""), object, type, NE);
                }//shell脚本去掉DMA
                //P_ConditionPLSearch_X_Cache.P_Cache(sets, output, object.get("获取表名").toString()
                //		, object, type);//1
            }
        }

        return output;
    }

    //20210927 注释下 稍后替换
    //先设计成 plsearch 语法和 plsql 语法通用, 方便我之后的plorm 统一一种方式扩展 pladmin
    public static List<IMV_SIQ> selectRowsByAttributesOfAggregation(
        IMV_SIQ object, EmotionSample emotionSample
        , RatioMap_E ratioMap, App NE) {
        if (!object.containsKey("obj")) {
            return new ArrayList<>();
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
        List<String[]> aggregationValues = (List<String[]>) object.get("操作");
        Iterator<String[]> iterator = aggregationValues.iterator();
        while (iterator.hasNext()) {
            boolean overMap = obj.size() == 0 ? false : true;
            String[] aggregationValueArray = iterator.next();
            String type = aggregationValueArray[1];
            boolean limitMap = type.equalsIgnoreCase("行至") ? true : false;
            boolean otherMap = type.equalsIgnoreCase("") ? true : false;
            for (int i = 1; i < aggregationValueArray.length; i++) {
                List<String> lists = DoSplit.splitRegex(aggregationValueArray[i]
                    , "\\|", "\\", "\\");
                String[] sets = List_ESU_X_stringlistToStringArray._E(lists);
//String[] sets= aggregationValueArray[i].split("\\|");
                if (limitMap || !otherMap) {
                    P_AO_pl_XA.P_AggregationLimitMap(sets, obj, emotionSample, ratioMap, NE);
                }
                //基于sort key 前序treeMap 之后排序功能设计
                //基于sort key 后序treeMap
            }
        }
        return obj;
    }

    public static Object selectRowsByAttributesOfGetCulumns(IMV_SIQ object) {
        if (!object.containsKey("obj")) {
            return new ArrayList<>();
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
        List<String[]> getCulumnsValues = (List<String[]>) object.get("获取列名");//later
        Iterator<String[]> iterator = getCulumnsValues.iterator();
        while (iterator.hasNext()) {
            boolean overMap = obj.size() == 0 ? false : true;
            String[] getCulumnsValueArray = iterator.next();
            if (overMap) {
                P_I_CulumnsPL_XA.P_GetCulumnsMap(obj, getCulumnsValueArray);
            }
        }
        return obj;
    }

    //PLETL命令一多, 之后准备分出去
    //罗瑶光 20211010
    public static Object selectRowsByAttributesOfPLETL(IMV_SIQ object) {
        if (!object.containsKey("obj")) {
            return new ArrayList<>();
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
        List<String[]> aggregationValues = (List<String[]>) object.get("PLETL");
        Iterator<String[]> iterator = aggregationValues.iterator();
        while (iterator.hasNext()) {
            boolean overMap = obj.size() == 0 ? false : true;
            String[] aggregationValueArray = iterator.next();
            String type = aggregationValueArray[1];
            boolean limitMap = type.equalsIgnoreCase("行至") ? true : false;
            boolean otherMap = type.equalsIgnoreCase("") ? true : false;
            for (int i = 1; i < aggregationValueArray.length; i++) {
                List<String> lists = DoSplit.splitRegex(aggregationValueArray[i]
                    , "\\|", "\\", "\\");
                String[] sets = List_ESU_X_stringlistToStringArray._E(lists);
//				String[] sets= aggregationValueArray[i].split("\\|");
                if (limitMap || !otherMap) {
                    P_AO_PLETL.P_PletlLimitMap(sets, obj, object);
                }
                //基于sort key 前序treeMap 之后排序功能设计
                //基于sort key 后序treeMap
            }
        }
        return obj;
    }

    public static Object selectRowsByAttributesOfPLTCP(IMV_SIQ object) {
        if (!object.containsKey("obj")) {
            return new ArrayList<>();
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
        List<String[]> aggregationValues = (List<String[]>) object.get("PLTCP");
        Iterator<String[]> iterator = aggregationValues.iterator();
        while (iterator.hasNext()) {
            boolean overMap = obj.size() == 0 ? false : true;
            String[] aggregationValueArray = iterator.next();
            String type = aggregationValueArray[1];
            boolean limitMap = type.equalsIgnoreCase("行至") ? true : false;
            boolean otherMap = type.equalsIgnoreCase("") ? true : false;
            for (int i = 1; i < aggregationValueArray.length; i++) {
                List<String> lists = DoSplit.splitRegex(aggregationValueArray[i]
                    , "\\|", "\\", "\\");
                String[] sets = List_ESU_X_stringlistToStringArray._E(lists);
                //String[] sets= aggregationValueArray[i].split("\\|");
                if (limitMap || !otherMap) {
                    P_AO_PLTCP.P_PltcpLimitMap(sets, obj, object);
                }
                //基于sort key 前序treeMap 之后排序功能设计
                //基于sort key 后序treeMap
            }
        }
        return obj;
    }
}
//146
//String[] sets= conditionValueArray[i].split("\\|");
//if(andMap) {//这里map 和cache一样了, 稍后会准备将cache 进行本地缓存化, 保证养疗经的并发版本。
//	P_ConditionPLSearch_X_Map.P_Map(sets, output, object.get("获取表名").toString());//1
//}else{//把这里的P_Cache 逻辑改成 or map 罗瑶光 20211004
//	P_ConditionPLSearch_X_Cache.P_Cache(sets, output, object.get("获取表名").toString()
//		, object);//1
//}//shell脚本去掉DMA

//and 条件, output 有值
//and 条件, output 无值
//or 条件, output 有值
//or 条件, output 有值