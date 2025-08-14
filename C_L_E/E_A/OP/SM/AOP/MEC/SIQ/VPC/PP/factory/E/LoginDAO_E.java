package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.factory.E;

import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E_X_IU_RowByBaseName;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows.Q_Rows_E_X_selectRowsByAttribute;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowByTablePathAndAttribute;
import O_V.OP.SM.AOP.MEC.SIQ.VPC.view.UsrFull;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;
import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;
import org.json.JSONObject;

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
public class LoginDAO_E {
	public static Usr selectUsrByUId(Integer uId)  {
		List<IMV_SIQ> list= Q_Rows_E_X_selectRowsByAttribute._E("backend", "usr"
				, "u_id", "" + uId);
		Usr usr= new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")
					!=null?list.get(0).get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")
					!=null?list.get(0).get("u_age").toString():"0"));
			usr.I_uClass(list.get(0).get("u_class")!=null?list.get(0).get("u_class").toString():"");
			usr.I_uEmail(list.get(0).get("u_email").toString());
			usr.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usr.I_uName(list.get(0).get("u_name").toString());
			usr.I_uPhone(list.get(0).get("u_phone")!=null?list.get(0).get("u_phone").toString():"");
			usr.I_uQq(list.get(0).get("u_qq")!=null?list.get(0).get("u_qq").toString():"");
			usr.I_uSex(list.get(0).get("u_sex")!=null?list.get(0).get("u_sex").toString():"");
			usr.I_uWeChat(list.get(0).get("u_weChat")
					!=null?list.get(0).get("u_weChat").toString():"");
		}
		return usr;
	}

	public static UsrToken selectUsrTokenByUId(Integer uId)  {
		List<IMV_SIQ> list 
		= Q_Rows_E_X_selectRowsByAttribute._E("backend", "usrToken", "u_id"
				, S_Common.STRING_EMPTY+ uId);
		UsrToken usrToken= new UsrToken();
		if(list.size() > 0) {	
			usrToken.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usrToken.I_uKey(list.get(0).get("u_key")
					!= null?list.get(0).get("u_key").toString():"");
			usrToken.I_uPassword(list.get(0).get("u_password").toString());
			usrToken.I_uTime(Integer.valueOf(list.get(0).get("u_time")
					!= null?list.get(0).get("u_time").toString():"0"));
			usrToken.I_uLevel(list.get(0).get("u_level")
					!= null?list.get(0).get("u_level").toString():"");
		}
		return usrToken;
	}

	public static UsrFull selectUsrFullByUId(Integer uId) {
		return null;
	}

	public static Usr selectUsrByUEmail(String uEmail)  {
		List<IMV_SIQ> list= Q_Rows_E_X_selectRowsByAttribute._E("backend", "usr"
				, "u_email", uEmail);
		Usr usr= new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")
					!= null?list.get(0).get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")
					!= null?list.get(0).get("u_age").toString():"0"));
			usr.I_uClass(list.get(0).get("u_class")
					!= null?list.get(0).get("u_class").toString():"");
			usr.I_uEmail(list.get(0).get("u_email").toString());
			usr.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usr.I_uName(list.get(0).get("u_name").toString());
			usr.I_uPhone(list.get(0).get("u_phone")
					!= null?list.get(0).get("u_phone").toString():"");
			usr.I_uQq(list.get(0).get("u_qq")
					!= null?list.get(0).get("u_qq").toString():"");
			usr.I_uSex(list.get(0).get("u_sex")
					!= null?list.get(0).get("u_sex").toString():"");
			usr.I_uWeChat(list.get(0).get("u_weChat")
					!= null?list.get(0).get("u_weChat").toString():"");
			usr.I_uPassword(list.get(0).get("u_password")
					!= null?list.get(0).get("u_password").toString():"");
		}
		return usr;
	}

	public static void U_UsrByUId(Integer uId, String uName, String uAge
			, String uSex, String uPhone, String uAddress,
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
		X_U_RowByTablePathAndAttribute._E(Cache_M.getCacheInfo("DBPath")
				.getValue()+"/backend/usr"
				, "u_id", "" + uId, jobj);
	}

	public static void U_UsrTokenByUId(Integer uId, String uKey, String uPassword
			, long uTime)  {
		JSONObject jobj= new JSONObject();
		jobj.put("u_id", uId);
		jobj.put("u_key", uKey);
		jobj.put("u_password", uPassword);
		jobj.put("u_time", uTime);
		X_U_RowByTablePathAndAttribute._E(Cache_M.getCacheInfo("DBPath")
				.getValue()+"/backend/usrToken"
				, "u_id", "" + uId, jobj);
	}

	public static void IU_Usr(String uName, String uAge, String uSex, String uPhone
			, String uAddress, String uWeChat, String uClass, String uEmail, String uQq) {
	}

	public static void IU_Usroken(Integer uId, String uKey, String uPassword, long uTime) {
	}

	public static void IU_RowByTablePath(String baseName, String tableName
			, JSONObject jsobj)  {
		IU_Rows_E_X_IU_RowByBaseName.insertRowByBaseName(baseName, tableName, jsobj, true);
	}
}
