package M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E;

import M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.P_AggregationPLSQL;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_U_RowsByAttributesOfAggregation {
    public static List<IMV_SIQ> _E(
        IMV_SIQ object, boolean mod) {
        if (!object.containsKey("obj")) {
            return new ArrayList<>();
        }
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("updateObj")));
        List<String[]> aggregationValues = (List<String[]>) object.get("aggregation");
        for (String[] aggregationValueArray : aggregationValues) {
            //	boolean overMap= obj.size()== 0? false: true;
            String type = aggregationValueArray[1];
            boolean limitMap = type.equalsIgnoreCase("limit");
            for (int i = 2; i < aggregationValueArray.length; i++) {
                String[] sets = aggregationValueArray[i].split("\\|");
                //String DBPath= Cache_M.getCacheInfo("DBPath").getValue().toString()
                //+ "/" + object.get("baseName").toString();
                //String dBTablePath= DBPath + "/" + object.get("tableName").toString();
                if (limitMap) {
                    P_AggregationPLSQL.P_AggregationLimitMap(sets, obj);
                }
                //基于sort key 前序treeMap 之后排序功能设计
                //基于sort key 后序treeMap
            }
        }
        return obj;
    }

}
