package E_A.OSI.AOP.PCS.PP.factory_E;

import DSU.V.VtoV;

import O_V.OSI.AOP.PCS.view.UsrFull;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;
import VPC.DetaDB.DetaDBUtil_X_DBRequest;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.List;
//import org.springframework.stereotype.Service;
@SuppressWarnings({"unused", "deprecation"})
//@Service
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LoginDAOImpl{// implements LoginDAO{
	@SuppressWarnings("unchecked")
	public static Usr selectUsrByUId(Integer uId)  {
		String json= DetaDBUtil_X_DBRequest._E("/selectRowsByAttribute?baseName="
			+ "backend" + "&tableName=" + "usr" + "&culumnName=" + URLEncoder.encode("u_id")
				+ "&value=" + uId + "&email=" + URLEncoder.encode("313699483@qq.com") 
				+ "&password=" + URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");
		IMV_SIQ map= (IMV_SIQ) VtoV.JsonObjectToMap(new JSONObject(json));
		List<IMV_SIQ> list= (List<IMV_SIQ>) map.get("obj");
		Usr usr= new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")!=null?list.get(0)
					.get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")
					!=null?list.get(0).get("u_age").toString():"0"));
			usr.I_uClass(list.get(0).get("u_class")
					!=null?list.get(0).get("u_class").toString():"");
			usr.I_uEmail(list.get(0).get("u_email").toString());
			usr.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usr.I_uName(list.get(0).get("u_name").toString());
			usr.I_uPhone(list.get(0).get("u_phone")
					!=null?list.get(0).get("u_phone").toString():"");
			usr.I_uQq(list.get(0).get("u_qq")
					!=null?list.get(0).get("u_qq").toString():"");
			usr.I_uSex(list.get(0).get("u_sex")
					!=null?list.get(0).get("u_sex").toString():"");
			usr.I_uWeChat(list.get(0).get("u_weChat")
					!=null?list.get(0).get("u_weChat").toString():"");
		}
		return usr;
	}

	@SuppressWarnings("unchecked")
	public static UsrToken selectUsrTokenByUId(Integer uId)  {
		String json= DetaDBUtil_X_DBRequest._E("/selectRowsByAttribute?baseName=" + "backend" 
				+ "&tableName=" + "usrToken" + "&culumnName=" + "u_id" + "&value=" + uId + "&email=" 
				+ URLEncoder.encode("313699483@qq.com") + "&password=" 
				+ URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");		
		IMV_SIQ map= (IMV_SIQ) VtoV.JsonObjectToMap(new JSONObject(json));
		List<IMV_SIQ> list= (List<IMV_SIQ>) map.get("obj");
		UsrToken usrToken= new UsrToken();
		if(list.size() > 0) {	
			usrToken.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usrToken.I_uKey(list.get(0).get("u_key")!=null?list.get(0).get("u_key").toString():"");
			usrToken.I_uPassword(list.get(0).get("u_password").toString());
			usrToken.I_uTime(Integer.valueOf(list.get(0).get("u_time")
					!=null?list.get(0).get("u_time").toString():"0"));
			usrToken.I_uLevel(list.get(0).get("u_level")
					!=null?list.get(0).get("u_level").toString():"");
		}
		return usrToken;
	}

	public static UsrFull selectUsrFullByUId(Integer uId) {
		
		return null;
	}

	@SuppressWarnings("unchecked")
	public static Usr selectUsrByUEmail(String uEmail)  {
		String json= DetaDBUtil_X_DBRequest._E("/selectRowsByAttribute?baseName=" + "backend" 
				+ "&tableName=" + "usr" + "&culumnName=" + URLEncoder.encode("u_email") + "&value=" 
				+ URLEncoder.encode(uEmail) + "&email=" + URLEncoder.encode("313699483@qq.com") 
				+ "&password=" + URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");
		IMV_SIQ map= (IMV_SIQ) VtoV.JsonObjectToMap(new JSONObject(json));
		List<IMV_SIQ> list= (List<IMV_SIQ>) map.get("obj");
		Usr usr= new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")
					!=null?list.get(0).get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")
					!=null?list.get(0).get("u_age").toString():"0"));
			usr.I_uClass(list.get(0).get("u_class")
					!=null?list.get(0).get("u_class").toString():"");
			usr.I_uEmail(list.get(0).get("u_email").toString());
			usr.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usr.I_uName(list.get(0).get("u_name").toString());
			usr.I_uPhone(list.get(0).get("u_phone")
					!=null?list.get(0).get("u_phone").toString():"");
			usr.I_uQq(list.get(0).get("u_qq")
					!=null?list.get(0).get("u_qq").toString():"");
			usr.I_uSex(list.get(0).get("u_sex")
					!=null?list.get(0).get("u_sex").toString():"");
			usr.I_uWeChat(list.get(0).get("u_weChat")
					!=null?list.get(0).get("u_weChat").toString():"");
		}
		return usr;
	}

	public static void U_UsrByUId(Integer uId, String uName, String uAge, String uSex, String uPhone, String uAddress,
			String uWeChat, String uClass, String uEmail, String uQq)  {
		JSONObject jobj= new JSONObject();
		jobj.put("u_id", uId);
		jobj.put("u_name", uName);
		jobj.put("u_age", uAge);
		jobj.put("u_sex", uSex);
		jobj.put("u_phone", uPhone);
		jobj.put("u_address", uAddress);
		jobj.put("u_weChat", uWeChat);
		jobj.put("u_class", uClass);
		jobj.put("u_email", uEmail);
		jobj.put("u_qq", uQq);
		String json= DetaDBUtil_X_DBRequest._E("/updateRowByTablePathAndAttribute?baseName=" 
				+ "backend" + "&tableName=" + "usr" + "&culumnName=" + URLEncoder.encode("u_email") 
				+ "&value=" + URLEncoder.encode(uEmail) + "&email=" + URLEncoder.encode("313699483@qq.com") 
				+ "&password=" + URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");		
	}

	public static void U_UsrTokenByUId(Integer uId, String uKey, String uPassword
			, long uTime)  {
		JSONObject jobj= new JSONObject();
		jobj.put("u_id", uId);
		jobj.put("u_key", uKey);
		jobj.put("u_password", uPassword);
		jobj.put("u_time", uTime);
		//		String json= DetaDBUtil_X_DBRequest.DBRequest("/updateRowByTablePathAndAttribute?baseName=" 
		//+ "backend" + "&tableName=" 
		//				+ "usrToken" + "&culumnName=" + URLEncoder.encode("u_id") + "&value=" 
		//+ uId + "&email=" 
		//				+ URLEncoder.encode("313699483@qq.com") + "&password=" 
		//+ URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");	

		//2年没碰被黑客和流氓软件篡改了, 今天用新的替换掉 罗瑶光 20210801
		String json= DetaDBUtil_X_DBRequest._E("/updateRowByTablePathAndAttribute?baseName=" 
				+ "backend" + "&tableName=" + "usrToken" + 
				"&culumnName=" + URLEncoder.encode("u_id") + 
				"&value=" + uId + 
				"&key=" + uKey + 
				"&tokenDNA=" + uPassword + 
				"&email=" + URLEncoder.encode("313699483@qq.com") + //写操作密码用途
				"&password=" + URLEncoder.encode("Fengyue1985!") +  //写操作密码用途
				"&auth=" + "0");		
	}

	public static void IU_Usr(String uName, String uAge, String uSex, String uPhone, String uAddress, String uWeChat,
			String uClass, String uEmail, String uQq) {
		

	}

	public static void IU_Usroken(Integer uId, String uKey, String uPassword, long uTime) {
		

	}

	public static void IU_RowByTablePath(String baseName, String tableName
			, JSONObject culumnOfNewRow)  {
		String json= DetaDBUtil_X_DBRequest._E("/insertRowByBaseName?baseName=" + baseName 
				+ "&tableName=" + tableName + "&culumnOfNewRow=" + culumnOfNewRow.toString() 
				+ "&email="+ URLEncoder.encode(culumnOfNewRow.get("u_id").toString()) 
				+ "&password=" + URLEncoder.encode(culumnOfNewRow.get("u_password").toString()) 
				+ "&auth=" + "0");		
	}
}
