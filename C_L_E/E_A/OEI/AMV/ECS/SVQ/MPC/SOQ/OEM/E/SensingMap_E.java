package E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E;

import C_A.OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import C_A.ME.analysis.C.BinaryForest_A;
import S_A.pheromone.IMV_SIQ;

import java.util.Iterator;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class SensingMap_E implements SensingMap {
    private IMV_SIQ lenovoMap;

    @Override
    public IMV_SIQ getLenovoMap() {
        return this.lenovoMap;
    }

    @Override
    public void IV_LenovoMap(BinaryForest_A _A) {
        lenovoMap = new IMV_SIQ();
        IMV_SIQ CnToEnMap = _A.getFullCnToEn();
        IMV_SIQ EnToCnMap = _A.getEnToCn();
        Iterator<String> iterator = CnToEnMap.keySet().iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (!CnToEnMap.containsKey(word)) {
                continue;
            }
            if (!EnToCnMap.containsKey(CnToEnMap.get(word))) {
                lenovoMap.put(word, word);
                continue;
            }
            lenovoMap.put(word, EnToCnMap.get(CnToEnMap.get(word)));
        }
    }
}
