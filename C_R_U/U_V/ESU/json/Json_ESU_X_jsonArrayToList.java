package U_V.ESU.json;

import S_A.pheromone.IMV_SIQ;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;

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

public class Json_ESU_X_jsonArrayToList{
	public static List<Object> _E(JSONArray jSONArray) {
		List<Object> list= new ArrayList<>();
		for(int i= 0; i< jSONArray.length(); i++){		
			Object object= jSONArray.get(i);
			if(object instanceof JSONObject){
				list.add(new Gson().fromJson(jSONArray.getJSONObject(i).toString()
						, new TypeToken<IMV_SIQ>(){}.getType()));
			}else if(object instanceof String){
				list.add(String.valueOf(object));
			}else if(object instanceof JSONArray){
				list.add(_E(jSONArray.getJSONArray(i)));
			}
		}
		return list;	
	}
}

//  剔除个人著作权 申请范围	
//	public static IMV_SIQ jsonObjectToMap(Gson gson
//			, JSONObject jSONObject){
//		return gson.fromJson(jSONObject.toString()
//				, new TypeToken<IMV_SIQ>(){}.getType());
//	}