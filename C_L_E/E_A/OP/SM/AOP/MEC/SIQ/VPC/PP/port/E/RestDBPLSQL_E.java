package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import C_A.OSI.AOP.MS.VPC.S.hall.DatabaseLog_H;
import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.StringUtil;
import org.json.JSONObject;

//import U_A.PEU.P.md5.*;
//
//baseName:backend;
//tableName:usr:update;
//condition:or:u_id|<|200;
//culumnValue:u_email:77777;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings({ "unchecked", "resource", "unused" })
public class RestDBPLSQL_E {
	public static IMV_SIQ restDBPLSQLImpl(String token, String email,
			String password, String auth, String plsql, String mod) {
		IMV_SIQ output = new IMV_SIQ();
		String who = "";
		// security monitor
		if (token != null && !token.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkTokenStatus(token,
					"common");
			if (checkStatus.contains("invalid") && (auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
			String json = StringUtil.decode(token);
			JSONObject js = new JSONObject(json);
			who = js.getString("uEmail");
		} else if (email != null && !email.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkRightsStatus(email,
					password, "DB");
			if (checkStatus.contains("invalid")) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
			who = email;
		} else {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		// write monior
		if (plsql.contains("update") || plsql.contains("insert")
				|| plsql.contains("delete") || plsql.contains("drop")
				|| plsql.contains("change") || plsql.contains("create")) {
			DatabaseLog_H.writeLogFile(System.currentTimeMillis(), who, plsql);
			try {
				E_PLSQL_E.E_PLSQL(plsql, false);
			} catch (Exception e) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", "invalid plsql");
				return output;
			}
			if (null != mod && mod.equalsIgnoreCase("true")) {
				output = E_PLSQL_E.E_PLSQL(plsql, true);
			}
		} else {
			output = E_PLSQL_E.E_PLSQL(plsql, true);
		}
		return output;
	}
}
