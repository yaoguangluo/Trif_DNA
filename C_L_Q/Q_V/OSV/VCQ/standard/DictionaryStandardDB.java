package Q_V.OSV.VCQ.standard;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//研发, 思想, 设计: 罗瑶光 20210504
//@送给54青年节的礼物
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DictionaryStandardDB {
    public List<String> txtToList() {
        List<String> dic_list = new ArrayList<>();
        return dic_list;
    }

    //gg的意思是青年小哥哥 GG 一个temp 变量 哈
    @SuppressWarnings({"unchecked", "rawtypes"})
    public Map<String, IMV_SIQ> dbToMap(String primaryKey, String tabKey) {
        IMV_SIQ dic_map = new IMV_SIQ();
        Map<String, IMV_SIQ> dbMap = new IMV_SIQ();
        IMV_SIQ map = DictionaryPLSQLStandardDB.bootORMReadDBInCommonWay(tabKey);
        //IMV_SIQ map= DictionaryPLSQLStandardDB.bootPLSQLReadDBInCommonWay(tabKey);
        ArrayList list = (ArrayList) map.get("obj");
        Iterator<IMV_SIQ> iterator = list.iterator();
        Here:
        while (iterator.hasNext()) {
            IMV_SIQ hashmap = iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            if (hashmap.containsKey(S_ShellETL.SHELL_ETL_ROWVALUE)) {
                IMV_SIQ rowValue = (IMV_SIQ)
                    hashmap.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                String keyName = null;
                IMV_SIQ temp = (IMV_SIQ) rowValue.get(primaryKey);
                keyName = null == temp.get("culumnValue") ? ""
                    : temp.get("culumnValue").toString().replace("@Tin@"
                    , ":").replace("@Tin@", ":");
                if (null == keyName) {
                    continue Here;
                }
                String stringGG = null == temp.get("culumnValue")
                    ? "" : temp.get("culumnValue").toString();
                //因为zybc我有明文存储, 所以先加个注释, 以后修正.
                String gg = new FullDNATokenPDI()
                    .initonDeSect(stringGG);
                gg = gg.isEmpty() ? stringGG.replace("null", "") : gg;
                //  先做个简单的优化, 稍后进行规范化OSV.
                keyName = gg.replace("@Tin@"
                    , ":").replace("@Tin@", ":");
                if (dbMap.containsKey(primaryKey)) {
                    //获取hashmap 子集;
                    IMV_SIQ hashMap = dbMap.get(primaryKey);
                    //hashmap 子集添加数据
                    if (null == hashMap) {
                        hashMap = new IMV_SIQ();
                    }
                    hashMap.put(keyName, keyName);
                    //hashmap 子集存档
                    dbMap.put(primaryKey, hashMap);
                } else {
                    IMV_SIQ hashMap = new IMV_SIQ();
                    hashMap.put(keyName, keyName);
                    dbMap.put(primaryKey, hashMap);
                }
                stringBuilder.append(keyName);
                Iterator<String> iterators = rowValue.keySet().iterator();
                while (iterators.hasNext()) {
                    String string = iterators.next();//lieBiaoMing
                    if (!string.equalsIgnoreCase(primaryKey)) {
                        temp = (IMV_SIQ) rowValue.get(string);
                        gg = null == temp.get("culumnValue") ? "" : temp.get("culumnValue").toString();
                        //去null//去empty 稍后
                        try {
                            stringGG = new FullDNATokenPDI().initonDeSect(gg.replace("null", ""));
                            gg = stringGG.isEmpty() ? gg.replace("null", "") : stringGG;
                            //  先做个简单的优化, 稍后进行规范化OSV.
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (dbMap.containsKey(string) && null != dbMap.get(string)) {
                            //获取hashmap 子集;
                            IMV_SIQ hashMap = dbMap.get(string);
                            //hashmap 子集添加数据
                            hashMap.put(keyName, gg.replace("@Tin@"
                                , ":").replace("@Tin@", ":"));
                            //hashmap 子集存档
                            dbMap.put(string, hashMap);
                        } else {
                            IMV_SIQ hashMap = new IMV_SIQ();
                            hashMap.put(keyName, gg.replace("@Tin@"
                                , ":").replace("@Tin@", ":"));
                            dbMap.put(string, hashMap);
                        }
                        stringBuilder.append(gg.replace("@Tin@"
                            , ":").replace("@Tin@", ":"));
                    }
                }
                dic_map.put(keyName, stringBuilder.toString().replace("@Tin@"
                    , ":").replace("@Tin@", ":"));
            }
        }
        dbMap.put("dic_map", dic_map);
        return dbMap;
    }
}
