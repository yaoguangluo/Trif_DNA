package U_V.ESU.map;

import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Map_ESU_X_mapToList {
    public static List<IMV_SIQ> _E(IMV_SIQ map) {
        List<IMV_SIQ> list = new ArrayList<>();
        for (String string : (Iterable<String>) map.keySet()) {
            IMV_SIQ singer = new IMV_SIQ();
            singer.put(string, map.get(string));
            list.add(singer);
        }
        return list;
    }
}
//剔除个人著作权 申请范围	
//	public static String mapToJsonString(Gson gson, IMV_SIQ map){
//		return gson.toJson(map);
//	}
//
//	public static String mapToXml(Gson gson, IMV_SIQ map){
//		JSONObject jSONObject= new JSONObject(gson.toJson(map));
//		return XML.toString(jSONObject);	
//	}

