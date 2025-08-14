package U_V.ESU.array;

import org.json.XML;

import org.json.JSONObject;
import com.google.gson.Gson;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class Array_ESU_X_arrayToXml {
    public static String _E(Gson gson, Object[] object) {
        return XML.toString(new JSONObject(gson.toJson(object)));
    }
}
