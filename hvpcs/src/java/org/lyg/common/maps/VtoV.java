/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */
//refer java jdk xml json demo
package org.lyg.common.maps;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */
public class VtoV{
//	public static JSONObject XmlToJsonObject(String response ){
//		JSONObject responseJson = XML.toJSONObject(response);
//		return responseJson;
//	}

	public static Map<String, Object> JsonObjectToMap(JSONObject response ){
		Gson gson = new Gson();
		Type type = new TypeToken<Map<String, Object>>(){}.getType();
		Map<String, Object> responseMap =gson.fromJson(response.toString(), type);
		return responseMap;
	}

	public static String MapToJsonString(Map<String, Object> response ){
		Gson gson = new Gson();
		return gson.toJson(response);
	}
	
	public static String ListToJsonString(List<Object> response ){
		Gson gson = new Gson();
		return gson.toJson(response);
	}
	
	public static String ObjectToJsonString(Object response ){
		Gson gson = new Gson();
		return gson.toJson(response);
	}

//	public static Map<String, Object> XmlToMap(String response){
//		JSONObject responseJson = XML.toJSONObject(response);
//		Gson gson = new Gson();
//		Type type = new TypeToken<Map<String, Object>>(){}.getType();
//		Map<String, Object> responseMap =gson.fromJson(responseJson.toString(), type);
//		return responseMap;
//	}

//	public static String MapToXml(Map<String, Object> response){
//		Gson gson = new Gson();
//		String json = gson.toJson(response);
//		JSONObject jsonObj = new JSONObject(json);
//		String xml = XML.toString(jsonObj);
//		return xml;	
//	}

	public static List<Object> JsonArrayToList(JSONArray jobj) {
		List<Object> output = new ArrayList<>();
		for(int i=0; i<jobj.length(); i++){		
			Object obj = jobj.get(i);
			if(obj instanceof JSONObject){
				output.add(JsonObjectToMap(jobj.getJSONObject(i)));
			}else if(obj instanceof String){
				output.add(String.valueOf(obj));
			}else if(obj instanceof JSONArray){
				output.add(JsonArrayToList(jobj.getJSONArray(i)));
			}
		}
		return output;	
	}
}