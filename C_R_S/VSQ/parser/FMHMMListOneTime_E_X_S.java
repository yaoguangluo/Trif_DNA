package VSQ.parser;

import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.pheromone.IMV_SIQ;

import java.util.List;
import java.util.Map;

//I will build a collection class for managing this maps. at the next version.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class FMHMMListOneTime_E_X_S {
    public Map<Long, FMHMMNode> linkedHashMap;
    public IMV_SIQ enToCn;
    public IMV_SIQ fullCnToPy;
    public List<String> listCn;
    public IMV_SIQ cnToEn;
    public IMV_SIQ studyPos;
    public IMV_SIQ posCnToCn;
    public IMV_SIQ posEnToEn;
    public IMV_SIQ posEnToCn;
    public IMV_SIQ fullEnToCn;
    public IMV_SIQ fullCnToEn;
    public IMV_SIQ fullCnToFn;
    public IMV_SIQ fullCnToKo;
    public IMV_SIQ fullCnToJp;
    public IMV_SIQ fullCnToSp;
    public IMV_SIQ fullCnToAb;
    public IMV_SIQ fullCnToGm;
    public IMV_SIQ fullCnToRs;
    public IMV_SIQ fullCnToTt;
    public IMV_SIQ fullPositive;
    public IMV_SIQ fullNegative;
    public List<String> listEn;
    public List<String> listFn;
    public List<String> listKo;
    public List<String> listJp;
    public List<String> listSp;
    public List<String> listGm;
    public List<String> listRs;
    public List<String> listAb;
    public List<String> listPy;
    public List<String> listTt;
}
//public Map<Long, FMHMMPOS> POSHashMap;