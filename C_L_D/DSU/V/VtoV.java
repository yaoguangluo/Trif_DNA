package DSU.V;

import S_A.pheromone.IMV_SIQ;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONObject;

import java.lang.reflect.Type;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class VtoV{
	public static IMV_SIQ JsonObjectToMap(JSONObject response){
		Gson gson= new Gson();
		Type type= new TypeToken<IMV_SIQ>(){}.getType();
		IMV_SIQ responseMap= gson.fromJson(response.toString(), type);
		return responseMap;
	}

	public static String ObjectToJsonString(Object response ){
		Gson gson= new Gson();
		return gson.toJson(response);
	}
}
//VPCS VtoV整合在这里是为了避嫌.
//逐步剔除著作权范围代码, 大家可以看到, 这些注释掉的函数已经说明了我的整个工程 就
//没有任何XML的应用. 具体见Deta 的 data swap包.
//除了两个 JsonObjectToMap 和 ObjectToJsonString(用到 谷歌 的Guson 官方开源
//DEMO 原函数) 就没有用到过走四方 时候的VToV(保留着词汇是因为VtoV是我罗瑶光命名的。)函数,
//2019~2020 data swap 著作权申请文档很清晰了.
//罗瑶光
//	public JSONObject XmlToJsonObject(String response ){
//	JSONObject responseJson= XML.toJSONObject(response);
//	return responseJson;
//}
//	public String MapToJsonString(IMV_SIQ response ){
//		Gson gson= new Gson();
//		return gson.toJson(response);
//	}

//	public String ListToJsonString(List<Object> response ){
//		Gson gson= new Gson();
//		return gson.toJson(response);
//

//	public IMV_SIQ XmlToMap(String response){
//		JSONObject responseJson= XML.toJSONObject(response);
//		Gson gson= new Gson();
//		Type type= new TypeToken<IMV_SIQ>(){}.getType();
//		IMV_SIQ responseMap=gson.fromJson(responseJson.toString(), type);
//		return responseMap;
//	}

//	public String MapToXml(IMV_SIQ response){
//		Gson gson= new Gson();
//		String json= gson.toJson(response);
//		JSONObject jsonObj= new JSONObject(json);
//		String xml= XML.toString(jsonObj);
//		return xml;
//	}

//	public List<Object> JsonArrayToList(JSONArray jobj) {
//		List<Object> output= new ArrayList<>();
//		for(int i=0; i<jobj.length(); i++){
//			Object obj= jobj.get(i);
//			if(obj instanceof JSONObject){
//				output.add(JsonObjectToMap(jobj.getJSONObject(i)));
//			}else if(obj instanceof String){
//				output.add(String.valueOf(obj));
//			}else if(obj instanceof JSONArray){
//				output.add(JsonArrayToList(jobj.getJSONArray(i)));
//			}
//		}
//		return output;
//	}

//	public Object StringListToJsonString(List<String> sets) {
//		Gson gson= new Gson();
//		return gson.toJson(sets);
//	}
