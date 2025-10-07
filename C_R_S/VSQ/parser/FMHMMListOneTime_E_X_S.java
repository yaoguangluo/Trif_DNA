package VSQ.parser;

import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.pheromone.IMV_SQI;

import java.util.List;
import java.util.Map;

//I will build a collection class for managing this maps. at the next version.
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class FMHMMListOneTime_E_X_S {
    public Map<Long, FMHMMNode> linkedHashMap;
    public IMV_SQI enToCn;
    public IMV_SQI fullCnToPy;
    public List<String> listCn;
    public IMV_SQI cnToEn;
    public IMV_SQI studyPos;
    public IMV_SQI posCnToCn;
    public IMV_SQI posEnToEn;
    public IMV_SQI posEnToCn;
    public IMV_SQI fullEnToCn;
    public IMV_SQI fullCnToEn;
    public IMV_SQI fullCnToFn;
    public IMV_SQI fullCnToKo;
    public IMV_SQI fullCnToJp;
    public IMV_SQI fullCnToSp;
    public IMV_SQI fullCnToAb;
    public IMV_SQI fullCnToGm;
    public IMV_SQI fullCnToRs;
    public IMV_SQI fullCnToTt;
    public IMV_SQI fullPositive;
    public IMV_SQI fullNegative;
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