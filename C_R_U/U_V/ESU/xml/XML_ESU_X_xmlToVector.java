package U_V.ESU.xml;

import S_A.pheromone.IMV_SIQ;
import U_V.ESU.json.Json_ESU_X_jsonArrayToList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.util.Vector;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class XML_ESU_X_xmlToVector {
    public static Vector<Object> _E(String string, String key) {
        JSONArray jSONArray = XML.toJSONObject(string).getJSONArray(key);
        Vector<Object> vector = new Vector<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object object = jSONArray.get(i);
            if (object instanceof JSONObject) {
                vector.add(new Gson().fromJson(jSONArray.getJSONObject(i).toString()
                        , new TypeToken<IMV_SIQ>() {
                        }.getType()));
            } else if (object instanceof String) {
                vector.add(String.valueOf(object));
            } else if (object instanceof JSONArray) {
                vector.add(Json_ESU_X_jsonArrayToList._E(jSONArray.getJSONArray(i)));
            }
        }
        return vector;
    }
}
// //  剔除个人著作权 申请范围
//    //	public static IMV_SIQ xmlToMap(Gson gson, String string){
//    //		return gson.fromJson(XML.toJSONObject(string).toString()
//    //				, new TypeToken<IMV_SIQ>(){}.getType());
//    //	}