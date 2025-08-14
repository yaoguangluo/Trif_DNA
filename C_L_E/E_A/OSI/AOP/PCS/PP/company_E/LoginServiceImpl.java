package E_A.OSI.AOP.PCS.PP.company_E;

import E_A.OSI.AOP.PCS.PP.factory_E.LoginDAOImpl;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.StringUtil;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenUtil;
import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;
import org.json.JSONObject;

import java.util.Date;

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
public class LoginServiceImpl {// implements LoginService {

	public static Usr findUsrByUEmail(String uEmail)  {
		Usr usr= LoginDAOImpl.selectUsrByUEmail(uEmail);
		return usr;
	}

	public static UsrToken findUsrTokenByUId(Integer uId)  {
		UsrToken usrToken= LoginDAOImpl.selectUsrTokenByUId(uId);
		return usrToken;
	}

	public static void U_UsrTokenByUId(Integer uId, String key, String uPassword
			, long uTime)  {
		LoginDAOImpl.U_UsrTokenByUId(uId, key, uPassword, uTime);
	}

	public static void IU_RowByTablePath(String baseName, String tableName
			, JSONObject jsobj)  {
		LoginDAOImpl.IU_RowByTablePath(baseName, tableName, jsobj);
	}

	public static String checkStatus(String token, String level)  {
		if (null== token) {
			return "invalid ..";
		}
		String json= StringUtil.decode(token);
		JSONObject js;
		try {
			js= new JSONObject(json);
		}catch(Exception e) {
			return "invalid ..";
		}
		long uTime= js.getLong("uTime");
		String uPassword= js.getString("mPassword");
		String uEmail= js.getString("uEmail");
		
		Usr usr= findUsrByUEmail(uEmail);
		UsrToken usrToken= findUsrTokenByUId(usr.getuId());
		//String password= TokenUtil.getFirstMD5Password(js.getString("uKey")
		//, usrToken.getuPassword());
		
		//下面用DNA 替换了下, 之后进行组件测试.
		//大家注意, 这里的ukey是 筛子加密方式, 加密后 仅仅密码一个输出而且相同的筛子加密结果不变,
		//我的dna加密更换后, 会产生可还原的 肽key, 这个肽key, 同样需要备份, 到数据库,
		//因为我的dna加密有两种, 一种的生成肽key加密的方式, 一种是按已经生成的肽key还原.
		//不然会加密后密文有变化.
		//现在养疗经还没有用到这函数, 优先级靠后, 先说明下. 罗瑶光
		//我准备这样画蛇添足模拟, 我将后端请求, 加个session认证, 匹配通过就后端计算取值,
		//不通过, 就重新认证. 我也是服了我自己.
		//在tcp.http包下面设计这个SESSION功能 模拟用这个片段.
		
		String key= "";
		String[] lock= new String[12];
        lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9] = "M";
        lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
        lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";
        for(int loop= 0; loop< 4; loop++) {
        	int i= (int)(Math.random()* 12)% 12;
            key+= lock[i];
        }
        Token sessiontoken= new Token();
        js.put("uKey", key);
		String dnaPassword= TokenUtil.getFirstDNAPassword(key
				, usrToken.getuPassword(), sessiontoken);
		sessiontoken.I_uEmail(usr.getuEmail());
		sessiontoken.I_uKey(key);
		//sessiontoken.
		sessiontoken.I_uTime(new Date().getTime());
		//token.I_mPassword(mPassword);
		sessiontoken.I_mPassword(dnaPassword);
		//return sessiontoken
		//if (!uPassword.equals(password)) {
		if (!uPassword.equals(dnaPassword)) {
			return "invalid ..";
		}
		long nowTime= new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid 10..";
		}
		
		if(level.contains("level")) {
			String uLevel= usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid ..";
			}
		}
		return "valid";
	}
	
	
	public static String checkTokenStatusAndGetLevel(String token
			, String level, IMV_SIQ output)  {
		if (null== token || token.equalsIgnoreCase("undefined")) {
			return "invalid ..";
		}
		String json= StringUtil.decode(token);
		JSONObject js;
		try {
			js= new JSONObject(json);
		}catch(Exception e) {
			return "invalid ..";
		}
		long uTime= js.getLong("uTime");
		String uPassword= js.getString("mPassword");
		String uEmail= js.getString("uEmail");
		Usr usr= findUsrByUEmail(uEmail);
		UsrToken usrToken= findUsrTokenByUId(usr.getuId());
		String password= TokenUtil.getFirstMD5Password(js.getString("uKey")
				, usrToken.getuPassword());
		if (!uPassword.equals(password)) {
			return "invalid ..";
		}
		long nowTime= new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid ..";
		}

		if(level.contains("level")) {
			String uLevel= usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid .";
			}
		}
		output.put("usrName", "." + usr.getuId());
		return "valid" + usrToken.getuLevel();
	}
}
