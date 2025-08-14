package M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E;

import S_A.pheromone.IMV_SIQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"unused"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class P_AggregationPLSQL {
    public static void P_AggregationLimitMap(String[] sets
        , List<IMV_SIQ> output) {
        List<IMV_SIQ> outputTemp = new ArrayList<>();
        Iterator<IMV_SIQ> iterator = output.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            int rowid = count++;
            IMV_SIQ row = iterator.next();
            IMV_SIQ rowMap = new IMV_SIQ();
            if (sets[1].equalsIgnoreCase("~")) {
                if (rowid >= new BigDecimal(sets[0]).doubleValue() && rowid
                    <= new BigDecimal(sets[2]).doubleValue()) {
                    outputTemp.add(row);
                }
            }
        }
        output.clear();
        output.addAll(outputTemp);
    }
}
