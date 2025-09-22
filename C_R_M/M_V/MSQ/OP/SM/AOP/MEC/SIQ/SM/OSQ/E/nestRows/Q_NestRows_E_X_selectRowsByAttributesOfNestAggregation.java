package M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.nestRows;

import M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.P_AggregationPLSQL;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "unused", "unchecked" })
/*
 * 著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用） 15116110525-
 * 430181198505250014, G24402609, EB0581342 204925063,
 * 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路
 * 208号 阳光家园别墅小区 第十栋别墅
 */
public class Q_NestRows_E_X_selectRowsByAttributesOfNestAggregation {
	public static Object _E(IMV_SIQ object) {
		if (!object.containsKey("joinObj")) {
			return new ArrayList<>();
		}
		List<IMV_SIQ> obj = ((List<IMV_SIQ>) (object.get("obj")));
		List<String[]> aggregationValues = (List<String[]>) object
				.get("aggregation");
		for (String[] aggregationValue : aggregationValues) {
			boolean overMap = obj.size() != 0;
			String type = aggregationValue[1];
			boolean limitMap = type.equalsIgnoreCase("limit");
			for (int i = 2; i < aggregationValue.length; i++) {
				String[] sets = aggregationValue[i].split("\\|");
				if (limitMap) {
					P_AggregationPLSQL.P_AggregationLimitMap(sets, obj);
				}
				// 基于sort key 前序treeMap 之后排序功能设计
				// 基于sort key 后序treeMap
			}
		}
		return obj;
	}
}
