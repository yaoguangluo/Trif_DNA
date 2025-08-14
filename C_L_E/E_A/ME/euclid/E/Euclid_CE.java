package E_A.ME.euclid.E;

import C_A.ME.euclid.C.Euclid_C;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Euclid_CE implements Euclid_C {
    @SuppressWarnings({S_Pos.RAW_TYPES, S_Pos.UNCHECKED})
    public Map<Integer, Map> mCogsEuclid(Map<Long, FMHMMNode> HashMap) {
        Map<Integer, Map> HashMapRoot = new IMV_SIQ();
        Iterator<Long> iter = HashMap.keySet().iterator();
        while (iter.hasNext()) {
            Long keyValue = iter.next();
            Integer charOfKeyValueToInteger = Integer.valueOf(S_Pos.EMPTY_STRING + keyValue);
            int range = (charOfKeyValueToInteger >> S_Pos.INT_SIX);
            int rangeHigh = range >> S_Pos.INT_FOUR;
            if (!HashMapRoot.containsKey(rangeHigh)) {
                Map<Long, FMHMMNode> innerHashMap = new IMV_SIQ();
                innerHashMap.put(keyValue, HashMap.get(keyValue));
                Map<Integer, Map> root = new IMV_SIQ();
                root.put(range, innerHashMap);
                HashMapRoot.put(rangeHigh, root);
                continue;
            }
            Map<Integer, Map> root = HashMapRoot.get(rangeHigh);
            if (!root.containsKey(range)) {
                Map<Long, FMHMMNode> innerHashMap = new IMV_SIQ();
                innerHashMap.put(keyValue, HashMap.get(keyValue));
                root.put(range, innerHashMap);
                HashMapRoot.put(rangeHigh, root);
                continue;
            }
            Map<Long, FMHMMNode> innerHashMap = root.get(range);
            innerHashMap.put(keyValue, HashMap.get(keyValue));
            root.put(range, innerHashMap);
            HashMapRoot.put(rangeHigh, root);
        }
        return HashMapRoot;
    }
}
