package U_V.ESU.hash;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Hash_ESU {
    public static String hashTableToJson(Gson gson
        , Hashtable<String, Object> hashtable) {
        return gson.toJson(hashtable);
    }

    public static String hashTableToXml(Gson gson
        , Hashtable<String, Object> hashtable) {
        JSONObject jSONObject = new JSONObject(gson.toJson(hashtable));
        return XML.toString(jSONObject);
    }

    public static List<Object> hashTableToList(Gson gson
        , Hashtable<String, Object> hashtable) {
        List<Object> list = new ArrayList<>();
        Iterator<String> iterator = hashtable.keySet().iterator();
        while (iterator.hasNext()) {
            list.add(hashtable.get(iterator.next()));
        }
        return list;
    }

    public static Object[] hashTableToObjectArray(Gson gson
        , Hashtable<String, Object> hashtable) {
        List<Object> list = new ArrayList<>();
        Iterator<String> iterator = hashtable.keySet().iterator();
        while (iterator.hasNext()) {
            list.add(hashtable.get(iterator.next()));
        }
        return list.toArray();
    }
}
