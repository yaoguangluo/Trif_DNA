package O_V.OPM.ESU.admin;
import ME.VPC.S.ne.App_S;
import ME.VPC.M.app.App;
import ME.VPC.V.dictionary.ZhongYaoDictionary;
import ME.VPC.V.db.ZhongYaoDictionaryFromDB;
import Q_V.OSV.VCQ.standard.DictionaryStandardDB;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.combination.ObjectCombination;

import java.util.List;
import java.util.Map;

//作者 罗瑶光
//准备设计一个 数据库读取frequency 方案函数, 之后数据编辑页都走这个函数.
//先做单例类集合, 稍后逐渐分出继承子类.
//这个例子为中医药材集合.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DBReadMode {

    public static void aCommonReadWay(App_S app, App NE) {
        //1首先如果有配置, 按配置来读表
        //1.1输出结果有txt配置选勾读txt
        if (app.bootDBInTXTWay) {
            //...
            readDBInTXTWay(app, NE);
            return;
        }
        //有数据表配置选勾就读数据表
        if (app.bootDBInBaseWay) {
            //...
            readDBInBaseWay(app, NE);
            return;
        }
        //有web接口请求配置选勾就读web上的rest请求数据
        if (app.bootDBInWebWay) {
            readDBInWebWay(app, NE);
            //...
            return;
        }

        //2如果没有配置就按流水线读表
        //2.1 有txt先读txt
        readDBInTXTWay(app, NE);
        //2.2 有数据表就读读数据表
        readDBInBaseWay(app, NE);
        //2.3 有web接口请求就读web上的rest请求数据
        readDBInWebWay(app, NE);
        //2.4 输出结果.
    }

    public static void readDBInTXTWay(App_S app, App NE) {
        ZhongYaoDictionary d = new ZhongYaoDictionary();
        List<String> dic_list = d.txtToList();
        try {
            if(null== app){
                return;//fatal trif
            }
            if(null== dic_list){
                return;//fatal trif
            }
            app.dic_map = d.listToMap(dic_list, NE);
            app.dic_yw = app.dic_map;
            app.dic_index = new ZhongYaoDictionaryFromDB().mapToIndex(app.dic_map);
            ObjectCombination.mapCombinationTrif(app.dic_li, d.mapToMap_li(app.dic_map), d.mapToMap_yw(app.dic_map));
            System.out.println("----------");
            ObjectCombination.mapCombination(app.dic_hai, d.mapToMap_hai(app.dic_map));
            ObjectCombination.mapCombination(app.dic_xz, d.mapToMap_xz(app.dic_map));
            ObjectCombination.mapCombination(app.dic_ya, d.mapToMap_ya(app.dic_map));
            ObjectCombination.mapCombination(app.dic_jm, d.mapToMap_jm(app.dic_map));
            ObjectCombination.mapCombination(app.dic_xw, d.mapToMap_xw(app.dic_map));
            ObjectCombination.mapCombination(app.dic_cy, d.mapToMap_cy(app.dic_map));
            ObjectCombination.mapCombination(app.dic_jj, d.mapToMap_jj(app.dic_map));
            ObjectCombination.mapCombination(app.dic_zf, d.mapToMap_zf(app.dic_map));
            ObjectCombination.mapCombination(app.dic_cj, d.mapToMap_cj(app.dic_map));
            ObjectCombination.mapCombination(app.dic_yl, d.mapToMap_yl(app.dic_map, app.dic_xw, app.dic_li, app.dic_xz, app.dic_jm));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readDBInBaseWay(App_S app, App NE) {
        //...
        //db
        //测试下刚写的标准读表函数.
        DictionaryStandardDB d = new DictionaryStandardDB();
        String primaryKey = "中药名称";
        String tabKey = "zybc";
        //以后设计 uniq forenkey等.
        Map<String, IMV_SIQ> map = d.dbToMap(primaryKey, tabKey);
        ObjectCombination.mapCombination(app.dic_index, map.get("中药名称"));
        ObjectCombination.mapCombination(app.dic_yw, map.get("笔记原文"));
        ObjectCombination.mapCombination(app.dic_li, map.get("功效"));
        System.out.println("---------------");
        //因为我不是学医的，所以坚决不碰医学资料。null空用原文笔记替代。稍后写常见匹配提取正则
//        String object = app.dic_li.getString("功效");
//        object=object.replace(".", "").replace("。", "");
//        if (4 > object.length()) {
//            //todo later
//            ObjectCombination.mapCombination(app.dic_li, map.get("笔记原文"));
//            //todo
//        }
        //
        ObjectCombination.mapCombination(app.dic_xz, map.get("中医馆药理"));
        ObjectCombination.mapCombination(app.dic_ya, map.get("愚按"));
        ObjectCombination.mapCombination(app.dic_jm, map.get("经脉"));
        ObjectCombination.mapCombination(app.dic_xw, map.get("性味"));
        ObjectCombination.mapCombination(app.dic_cy, map.get("崇源"));
        ObjectCombination.mapCombination(app.dic_jj, map.get("经解"));
        ObjectCombination.mapCombination(app.dic_zf, map.get("搭配"));
        ObjectCombination.mapCombination(app.dic_hai, map.get("风险规避"));
        ObjectCombination.mapCombination(app.dic_cj, map.get("常见药"));
        ObjectCombination.mapCombination(app.dic_yl, map.get("用量"));
        ObjectCombination.mapCombination(app.dic_map, map.get("dic_map"));
    }

    public static void readDBInWebWay(App_S app, App NE) {
        //...
    }
}
