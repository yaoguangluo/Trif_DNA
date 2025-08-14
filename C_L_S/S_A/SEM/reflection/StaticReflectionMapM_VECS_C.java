package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapM_VECS_E;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticReflectionMapM_VECS_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    @SuppressWarnings("unchecked")
    public static void callFunction(CallFunctionKey callFunctionKey
        , StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C
        , IMV_SIQ output, App NE) {
        String[] 传参因子 = (String[]) output.get("传参因子");
        int 因子 = 0;
        Object map = null;
        if (callFunctionKey.contains("updateRowsByAttributesOfJoinCondition", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinCondition(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowsByAttributesOfJoinCondition");
        }
        if (callFunctionKey.contains("updateRowsByAttributesOfJoinAggregation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinAggregation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowsByAttributesOfJoinAggregation");
        }
        if (callFunctionKey.contains("updateRowsByAttributesOfJoinGetCulumns", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinGetCulumns(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowsByAttributesOfJoinGetCulumns");
        }
        if (callFunctionKey.contains("updateRowsByAttributesOfJoinRelation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinRelation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowsByAttributesOfJoinRelation");
        }//, "updateRowsByAttributesOfJoinRelation");
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinCondition", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinCondition(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "selectRowsByAttributesOfJoinCondition");
        }//, "selectRowsByAttributesOfJoinCondition");
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinAggregation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinAggregation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "selectRowsByAttributesOfJoinAggregation");
        }//, "selectRowsByAttributesOfJoinAggregation");
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinGetCulumns", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinGetCulumns(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "selectRowsByAttributesOfJoinGetCulumns");
        }//, "selectRowsByAttributesOfJoinGetCulumns");
        if (callFunctionKey.contains("selectRowsByAttributesOfJoinRelation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinRelation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "selectRowsByAttributesOfJoinRelation");
        }//, "selectRowsByAttributesOfJoinRelation");
        if (callFunctionKey.contains("insertRowByTablePathAndIndex", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.insertRowByTablePathAndIndex(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "insertRowByTablePathAndIndex");
        }//, "insertRowByTablePathAndIndex");
        if (callFunctionKey.contains("insertRowByBaseName", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.insertRowByBaseName(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "insertRowByBaseName");
        }//, "insertRowByBaseName");
        if (callFunctionKey.contains("IU_RowByAttributes", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.IU_RowByAttributes(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "IU_RowByAttributes");
        }//, "IU_RowByAttributes");
        if (callFunctionKey.contains("I_Table", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.I_Table(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "I_Table");
        }//, "I_Table");
        if (callFunctionKey.contains("deleteRowByTablePathAndIndex", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.deleteRowByTablePathAndIndex(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "deleteRowByTablePathAndIndex");
        }//, "deleteRowByTablePathAndIndex");
        if (callFunctionKey.contains("D_RowByAttributesOfCondition", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.D_RowByAttributesOfCondition(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "D_RowByAttributesOfCondition");
        }//, "D_RowByAttributesOfCondition");
        if (callFunctionKey.contains("updateRowByTablePathAndIndex", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowByTablePathAndIndex(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowByTablePathAndIndex");
        }//, "updateRowByTablePathAndIndex");
        if (callFunctionKey.contains("updateRowByTablePathAndAttribute", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowByTablePathAndAttribute(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowByTablePathAndAttribute");
        }//, "updateRowByTablePathAndAttribute");
        if (callFunctionKey.contains("updateRowsByRecordConditions", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByRecordConditions(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowByTablePathAndAttribute");
        }//, "updateRowsByRecordConditions");
        if (callFunctionKey.contains("updateRowsByAttributesOfCondition", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByAttributesOfCondition(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowsByAttributesOfCondition");
        }//, "updateRowsByAttributesOfCondition");
        if (callFunctionKey.contains("updateRowsByAttributesOfAggregation", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByAttributesOfAggregation(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowsByAttributesOfAggregation");
        }//, "updateRowsByAttributesOfAggregation");
        if (callFunctionKey.contains("updateRowsByAttributesOfGetCulumns", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.updateRowsByAttributesOfGetCulumns(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "updateRowsByAttributesOfGetCulumns");
        }//, "updateRowsByAttributesOfGetCulumns");
        if (callFunctionKey.contains("E_PLSQL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.E_PLSQL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "E_PLSQL");
        }//, "E_PLSQL");
        if (callFunctionKey.contains("E_PLORM", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.E_PLORM(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "E_PLORM");
        }//, "E_PLORM");
        if (callFunctionKey.contains("P_AggregationLimitMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_AggregationLimitMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_AggregationLimitMap");
        }//, "P_AggregationLimitMap");
        if (callFunctionKey.contains("P_Cache", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_Cache(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Cache");
        }//, "P_Cache");
        if (callFunctionKey.contains("P_kernel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_kernel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_kernel");
        }//, "P_kernel");
        if (callFunctionKey.contains("rowToRowMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.rowToRowMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "rowToRowMap");
        }//, "rowToRowMap");
        if (callFunctionKey.contains("P_Map", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_Map(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Map");
        }//, "P_Map");
        if (callFunctionKey.contains("P_Table", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_Table(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Table");
        }//, "P_Table");
        if (callFunctionKey.contains("getCulumnsMapWithAs", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.getCulumnsMapWithAs(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCulumnsMapWithAs");
        }//, "getCulumnsMapWithAs");
        if (callFunctionKey.contains("getCulumnsMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.getCulumnsMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCulumnsMap");
        }//, "getCulumnsMap");
        if (callFunctionKey.contains("P_GetCulumnsMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.P_GetCulumnsMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_GetCulumnsMap");
        }//, "P_GetCulumnsMap");
        if (callFunctionKey.contains("P_AndMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_AndMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_AndMap");
        }//, "P_AndMap");
        if (callFunctionKey.contains("P_OrMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_OrMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_OrMap");
        }//, "P_OrMap");
        if (callFunctionKey.contains("P_SetRoot", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_SetRoot(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_SetRoot");
        }//, "P_SetRoot");
        if (callFunctionKey.contains("P_BaseName", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_BaseName(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_BaseName");
        }//, "P_BaseName");
//        if (callFunctionKey.contains("P_TableName", NE)) {
//            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
//            if (inputValues.getBoolean("find")) {
//                staticFunctionMapM_VECS_C.P_TableName(NE);
//            }//稍后因子 object化。
//            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
//                , "P_TableName");
//        }//, "P_TableName");
        if (callFunctionKey.contains("P_ListNeedStart", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_ListNeedStart(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_ListNeedStart");
        }//, "P_ListNeedStart");
        if (callFunctionKey.contains("P_Join", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_Join(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Join");
        }//, "P_Join");
        if (callFunctionKey.contains("P_E", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_E(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_E");
        }//, "P_E");
        if (callFunctionKey.contains("P_Check", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_Check(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Check");
        }//, "P_Check");
        if (callFunctionKey.contains("wordsForestNotContainsKey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.wordsForestNotContainsKey(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "wordsForestNotContainsKey");
        }//, "wordsForestNotContainsKey");
        if (callFunctionKey.contains("prefixWordEqualZero", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.prefixWordEqualZero(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "prefixWordEqualZero");
        }//, "prefixWordEqualZero");
        if (callFunctionKey.contains("wordsForestContainsKey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.wordsForestContainsKey(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "wordsForestContainsKey");
        }//, "wordsForestContainsKey");
        if (callFunctionKey.contains("WordFrequencyFindCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.WordFrequencyFindCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "WordFrequencyFindCheck");
        }//, "WordFrequencyFindCheck");
        if (callFunctionKey.contains("WordFrequencyCompareCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.WordFrequencyCompareCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "WordFrequencyCompareCheck");
        }//, "WordFrequencyCompareCheck");
        if (callFunctionKey.contains("sessionCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionCheck");
        }//, "sessionCheck");
        if (callFunctionKey.contains("sessionTokenUpdateByDNA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionTokenUpdateByDNA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionTokenUpdateByDNA");
        }//, "sessionTokenUpdateByDNA");
        if (callFunctionKey.contains("sessionTokenCertsInitWithHumanWordsByDNA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionTokenUpdateByDNA");
        }//, "sessionTokenCertsInitWithHumanWordsByDNA");
        if (callFunctionKey.contains("sessionTokenCertsInitWithHumanWordsByDNA_ETL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA_ETL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionTokenCertsInitWithHumanWordsByDNA_ETL");
        }//, "sessionTokenCertsInitWithHumanWordsByDNA_ETL");
        if (callFunctionKey.contains("sessionInitByTokenPDICertsDNA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionInitByTokenPDICertsDNA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionInitByTokenPDICertsDNA");
        }//, "sessionInitByTokenPDICertsDNA");
        if (callFunctionKey.contains("sessionInitByTokenCertsDNA", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionInitByTokenCertsDNA(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionInitByTokenCertsDNA");
        }//, "sessionInitByTokenCertsDNA");
        if (callFunctionKey.contains("sessionCheckWithOrderPDSKey", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionCheckWithOrderPDSKey(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionCheckWithOrderPDSKey");
        }//, "sessionCheckWithOrderPDSKey");
        if (callFunctionKey.contains("sessionCheckWithPostPDSKey", NE)) {
            //这接口惹毛我了, 有时间我会写个文本阅读函数, 智能替换字符串。
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.sessionCheckWithPostPDSKey(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "sessionCheckWithPostPDSKey");
        }//, "sessionCheckWithPostPDSKey");
        if (callFunctionKey.contains("arrayIntCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayIntCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayIntCheck");
        }//, "arrayIntCheck");
        if (callFunctionKey.contains("arrayIntFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayIntFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayIntFix");
        }//, "arrayIntFix");
        if (callFunctionKey.contains("arrayLongCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayLongCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayLongCheck");
        }//, "arrayLongCheck");
        if (callFunctionKey.contains("arrayLongFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayLongFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayLongFix");
        }//, "arrayLongFix");
        if (callFunctionKey.contains("arrayDoubleCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayDoubleCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayDoubleCheck");
        }//, "arrayDoubleCheck");
        if (callFunctionKey.contains("arrayDoubleFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayDoubleFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayDoubleFix");
        }//, "arrayDoubleFix");
        if (callFunctionKey.contains("arrayFloatCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayFloatCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayFloatCheck");
        }//, "arrayFloatCheck");
        if (callFunctionKey.contains("arrayFloatFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.arrayFloatFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "arrayFloatFix");
        }//, "arrayFloatFix");
        if (callFunctionKey.contains("currentSystemTimeCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.currentSystemTimeCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "currentSystemTimeCheck");
        }//, "currentSystemTimeCheck");
        if (callFunctionKey.contains("currentSystemTimeToUTC", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.currentSystemTimeToUTC(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "currentSystemTimeToUTC");
        }//, "currentSystemTimeToUTC");
//		if(callFunctionKey.contains("getTranslator")){
//			IMV_SIQ inputValues= StaticFunctionMap.preValues(output, 传参因子);
//			if(inputValues.getBoolean("find")) {
//				map= staticFunctionMapM_VECS_C.getTranslator(NE);
//			}
//			StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
//					, callFunctionKey);
//		}//, "getTranslator");
        if (callFunctionKey.contains("ListSetsCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.ListSetsCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "ListSetsCheck");
        }//, "ListSetsCheck");
        if (callFunctionKey.contains("ListSetsFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.ListSetsFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "ListSetsFix");
        }//, "ListSetsFix");
        if (callFunctionKey.contains("matrixCheck", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.matrixCheck(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixCheck");
        }//, "matrixCheck");
        if (callFunctionKey.contains("matrixFix", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.matrixFix(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "matrixFix");
        }//, "matrixFix");
        if (callFunctionKey.contains("checkNULL", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.checkNULL(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "checkNULL");
        }//, "checkNULL");
        if (callFunctionKey.contains("getCfxButton", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.getCfxButton(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getCfxButton");
        }//, "getCfxButton");
        if (callFunctionKey.contains("DetaButton", NE)) {
            //同名函数做变量区分之后 全部该object++自适应
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.DetaButton(NE);
            } else {
                if (inputValues.containsKey("string")) {//传参pca以后设计下。
                    map = staticFunctionMapM_VECS_C.DetaButton(NE);
                    inputValues.put("find", true);
                }
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DetaButton");
        }
        //, "DetaButton");
        if (callFunctionKey.contains("YLJShowButton", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.YLJShowButton(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "YLJShowButton");
        }//, "YLJShowButton");
        if (callFunctionKey.contains("DetaIndexLabel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.DetaIndexLabel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DetaIndexLabel");
        }//, "DetaIndexLabel");
        if (callFunctionKey.contains("DetaLabel", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.DetaLabel(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DetaLabel");
        }//, "DetaLabel");
        if (callFunctionKey.contains("DetaSlider", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.DetaSlider(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DetaSlider");
        }//, "DetaSlider");
        if (callFunctionKey.contains("DetabbedPane", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.DetabbedPane(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "DetabbedPane");
        }//, "DetabbedPane");
        if (callFunctionKey.contains("getColorTableRender", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.getColorTableRender(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "getColorTableRender");
        }//, "getColorTableRender");
        if (callFunctionKey.contains("CfxTextArea", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.CfxTextArea(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "CfxTextArea");
        }//, "CfxTextArea");
        if (callFunctionKey.contains("CfxTextField", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.CfxTextField(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "CfxTextField");
        }//, "CfxTextField");
        if (callFunctionKey.contains("CfxTextPane", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                map = staticFunctionMapM_VECS_C.CfxTextPane(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "CfxTextPane");
        }//, "CfxTextPane");
        if (callFunctionKey.contains("forwardToRestMap", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.forwardToRestMap(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "forwardToRestMap");
        }//, "forwardToRestMap");
        if (callFunctionKey.contains("P_Rest", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_Rest(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_Rest");
        }//, "P_Rest");
        if (callFunctionKey.contains("P_RestDB", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P_RestDB(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_RestDB");
        }//, "P_RestDB");
        if (callFunctionKey.contains("P_", NE)) {
            IMV_SIQ inputValues = StaticFunctionMap.preValues(output, 传参因子);
            if (inputValues.getBoolean("find")) {
                staticFunctionMapM_VECS_C.P(NE);
            }
            StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
                , "P_");
        }//, "P");
    }
}
