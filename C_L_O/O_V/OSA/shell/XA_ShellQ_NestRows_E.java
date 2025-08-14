package O_V.OSA.shell;

import A_V.E.RatioMap_E;
import ME.VPC.M.app.App;
import plshell.P_CO_XA_X_Cache;
import plshell.P_CO_XA_X_Map;
import O_V.OSM.shell.P_AO_pl_XA;
import O_V.OSM.shell.P_I_CulumnsPL_XA;
import O_V.OSM.shell.P_RelationPL_XA;
import S_A.SVQ.stable.S_ShellETL;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
public class XA_ShellQ_NestRows_E {
    public static Object selectRowsByAttributesOfNestCondition(IMV_SIQ object, App NE) {
        if (!object.containsKey("recordRows")) {
            Map<String, Boolean> recordRows = new IMV_SIQ();
            object.put("recordRows", recordRows);
        }

        List<IMV_SIQ> output = new ArrayList<>();
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
                    P_CO_XA_X_Map.P_Map(sets, output, object.get("nestTableName").toString(), object, NE);
                } else {
                    P_CO_XA_X_Cache.P_Cache(sets, output
                        , object.get("nestTableName").toString()
                        , object, type, NE);
                }//DMA delete
            }
        }
        return output;
    }

    public static Object selectRowsByAttributesOfNestAggregation(
        IMV_SIQ object, EmotionSample emotionSample
        , RatioMap_E ratioMap, App NE) {
        if (!object.containsKey("joinObj")) {
            return new ArrayList<>();
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
        List<String[]> aggregationValues = (List<String[]>) object.get("aggregation");
        Iterator<String[]> iterator = aggregationValues.iterator();
        while (iterator.hasNext()) {
            boolean overMap = obj.size() == 0 ? false : true;
            String[] aggregationValueArray = iterator.next();
            String type = aggregationValueArray[1];
            boolean limitMap = type.equalsIgnoreCase("limit") ? true : false;
            for (int i = 2; i < aggregationValueArray.length; i++) {
                String[] sets = aggregationValueArray[i].split("\\|");
                if (limitMap) {
                    P_AO_pl_XA.P_AggregationLimitMap(sets, obj, emotionSample, ratioMap, NE);
                }
                //基于sort key 前序treeMap 之后排序功能设计
                //基于sort key 后序treeMap
            }
        }
        return obj;
    }

    public static Object selectRowsByAttributesOfNestGetCulumns(IMV_SIQ object) {
        if (!object.containsKey("joinObj")) {
            return new ArrayList<>();
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("joinObj")));
        List<String[]> getCulumnsValues = (List<String[]>) object.get("getCulumns");
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

    public static Object selectRowsByAttributesOfNestRelation(IMV_SIQ object) {
        if (!object.containsKey("obj") || !object.containsKey("joinObj")) {
            return new ArrayList<>();
        }
        Map<String, Boolean> findinNewObj = new IMV_SIQ();
        List<IMV_SIQ> newObj = new ArrayList<IMV_SIQ>();
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
        List<IMV_SIQ> joinObj = ((List<IMV_SIQ>) (object.get("joinObj")));
        List<String[]> relationValues = (List<String[]>) object.get("relation");
        Iterator<String[]> iterator = relationValues.iterator();
        while (iterator.hasNext()) {
            boolean overObjMap = obj.size() == 0 ? false : true;
            boolean overJoinObjMap = joinObj.size() == 0 ? false : true;
            String[] getRelationValueArray = iterator.next();
            String type = getRelationValueArray[1];
            boolean andMap = type.equalsIgnoreCase("and") ? true : false;
            for (int i = 2; i < getRelationValueArray.length; i++) {
                String[] sets = getRelationValueArray[i].split("\\|");
                if (overObjMap && overJoinObjMap && andMap && i > 2) {
                    P_RelationPL_XA.P_AndMap(sets, obj, joinObj, object, newObj);
                } else {
                    P_RelationPL_XA.P_OrMap(sets, obj, joinObj, object
                        , newObj, findinNewObj);
                }
            }
        }
        return newObj;
    }
}
