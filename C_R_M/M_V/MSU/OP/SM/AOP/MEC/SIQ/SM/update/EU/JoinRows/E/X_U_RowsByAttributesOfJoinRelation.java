package M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E;

import M_V.ME.RelationPLSQL_.X_P_AndMap;
import M_V.ME.RelationPLSQL_.X_P_OrMap;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
public class X_U_RowsByAttributesOfJoinRelation {
    public static Object _E(IMV_SIQ object, boolean mod) {
        if (!object.containsKey("updateObj") || !object.containsKey("updateJoinObj")) {
            return new ArrayList<>();
        }
        Map<String, Boolean> findinNewObj = new IMV_SIQ();
        List<IMV_SIQ> newObj = new ArrayList<>();
        List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("updateObj")));
        List<IMV_SIQ> joinObj = ((List<IMV_SIQ>) (object.get("updateJoinObj")));
        List<String[]> relationValues = (List<String[]>) object.get("relation");
        for (String[] relationValue : relationValues) {
            boolean overObjMap = obj.size() != 0;
            boolean overJoinObjMap = joinObj.size() != 0;
            String type = relationValue[1];
            boolean andMap = type.equalsIgnoreCase("and");
            for (int i = 2; i < relationValue.length; i++) {
                String[] sets = relationValue[i].split("\\|");
                if (overObjMap && overJoinObjMap && andMap && i > 2) {
                    X_P_AndMap._E(sets, obj, joinObj, object, newObj);//1
                } else {
                    X_P_OrMap._E(sets, obj, joinObj, object, newObj, findinNewObj);
                }
            }
        }
        return newObj;
    }
}
