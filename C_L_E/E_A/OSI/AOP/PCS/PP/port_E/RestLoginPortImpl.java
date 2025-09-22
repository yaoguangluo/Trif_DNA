package E_A.OSI.AOP.PCS.PP.port_E;

import DSU.V.VtoV;
import P_V.PCS.transaction.DelegateLogin_X_transactionLogin;
import P_V.PCS.transaction.DelegateLogin_X_transactionRegisterDB_DNA;
import S_A.pheromone.IMV_SIQ;
import VPC.DetaDB.DetaDBUtil_X_DBRequest;
import org.json.JSONObject;

import java.net.URLEncoder;
@SuppressWarnings("unused")
//@RestController
//@Slf4j
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestLoginPortImpl{// implements RestLoginPort {
	public static IMV_SIQ login(String uEmail, String uPassword) {
		IMV_SIQ map= DelegateLogin_X_transactionLogin
				.transactionLogin(uEmail, uPassword);
		return map;
	}

	public static IMV_SIQ logout(String uEmail, String uToken)
			 {
		IMV_SIQ output= new IMV_SIQ();
		output.put("userEmail", "friend");
		output.put("userToken", "123456");
		return output;
	}

	public static IMV_SIQ register(String uEmail, String uEmailEnsure
			, String uName, String uPassword, String uPassWDEnsure, String uAddress
		, String uPhone, String uWeChat, String uQq, String uAge, String uSex)  {
		IMV_SIQ output
		= DelegateLogin_X_transactionRegisterDB_DNA.transactionRegisterDB_DNA(uEmail
				, uEmailEnsure, uName, uPassword,
				uPassWDEnsure, uAddress, uPhone, uWeChat,
				uQq, uAge, uSex);
		return output;
	}

	public static IMV_SIQ change(String uEmail, String uChange
			, String uChangeEnsure, String uToken, String uPassword) {
		return null;
	}

	public static IMV_SIQ find(String uEmail)  {
		return null;
	}

	@SuppressWarnings("deprecation")
	public static IMV_SIQ checkStatus(String token)  {
		String json= DetaDBUtil_X_DBRequest._E("/checkStatus?token="
	+ URLEncoder.encode(token));
		IMV_SIQ output= null;
		boolean jsonCheck= true;
		if(null== json){
			output= new IMV_SIQ();
			output.put("loginInfo", "unsuccess");
			jsonCheck= false;
		}
		if(json.contains("unsuccess")){
			output= VtoV.JsonObjectToMap(new JSONObject(json));
			jsonCheck= false;
		}
		if(jsonCheck){
			output= VtoV.JsonObjectToMap(new JSONObject(json));
			return output;
		}
		output= new IMV_SIQ();
		output.put("loginInfo", "unsuccess");
		return output;
	}
}
