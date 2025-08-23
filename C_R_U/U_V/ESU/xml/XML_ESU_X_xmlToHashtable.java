package U_V.ESU.xml;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import java.lang.reflect.Type;
import java.util.Hashtable;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class XML_ESU_X_xmlToHashtable {
    public Hashtable<String, Object> _E(String xmlString, Gson gson) {
        JSONObject jSONObject = XML.toJSONObject(xmlString);
        return gson.fromJson(jSONObject.toString()
                , (Type) new Hashtable<String, Object>());
    }
}
