package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.factory.E.LoginDAO_E;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.StringUtil;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenUtil;
import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;
import org.json.JSONObject;

import java.util.Date;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LoginService_E {

    public static Usr findUsrByUEmail(String uEmail) {
        Usr usr = LoginDAO_E.selectUsrByUEmail(uEmail);
        return usr;
    }

    public static UsrToken findUsrTokenByUId(Integer uId) {
        UsrToken usrToken = LoginDAO_E.selectUsrTokenByUId(uId);
        return usrToken;
    }

    public static void U_UsrTokenByUId(Integer uId, String key
        , String uPassword, long uTime) {
        LoginDAO_E.U_UsrTokenByUId(uId, key, uPassword, uTime);
    }

    public static void IU_RowByTablePath(String baseName, String tableName
        , JSONObject jsobj) {
        LoginDAO_E.IU_RowByTablePath(baseName, tableName, jsobj);
    }

    public static String checkTokenStatus(String token, String level) {
        if (null == token) {
            return "invalid 秘钥丢失请重新登陆。";
        }
        String json = StringUtil.decode(token);
        JSONObject js;
        try {
            js = new JSONObject(json);
        } catch (Exception e) {
            return "invalid 秘钥错误请重新登陆。";
        }
        long uTime = js.getLong("uTime");
        String uPassword = js.getString("mPassword");
        String uEmail = js.getString("uEmail");
        Usr usr = findUsrByUEmail(uEmail);
        UsrToken usrToken = findUsrTokenByUId(usr.getuId());

        //下面用DNA 替换了下, 之后进行组件测试.
        String key = "";
        String[] lock = new String[12];
        lock[0] = "A";
        lock[3] = "O";
        lock[6] = "P";
        lock[9] = "M";
        lock[1] = "V";
        lock[4] = "E";
        lock[7] = "C";
        lock[10] = "S";
        lock[2] = "I";
        lock[5] = "D";
        lock[8] = "U";
        lock[11] = "Q";
        for (int loop = 0; loop < 4; loop++) {
            int i = (int) (Math.random() * 12) % 12;
            key += lock[i];
        }
        Token sessiontoken = new Token();
        js.put("uKey", key);
        String dnaPassword = TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword()
            , sessiontoken);
        sessiontoken.I_uEmail(usr.getuEmail());
        sessiontoken.I_uKey(key);
        sessiontoken.I_uTime(new Date().getTime());
        //token.I_mPassword(mPassword);
        sessiontoken.I_mPassword(dnaPassword);

        //String password= TokenUtil.getFirstMD5Password(js.getString("uKey")
        // usrToken.getuPassword());
        //if (!uPassword.equals(password)) {
        if (!uPassword.equals(dnaPassword)) {
            return "invalid 密码错误。";
        }
        long nowTime = new Date().getTime();
        if (uTime + 600000 < nowTime) {
            return "invalid 10分钟超时, 请重新登陆。";
        }

        if (level.contains("level")) {
            String uLevel = usrToken.getuLevel();
            if (!uLevel.contains("high")) {
                return "invalid 权限不够";
            }
        }
        return "valid";
    }

    public static String checkRightsStatus(String inEmail, String inPassword
        , String level) {
        if (null == inEmail) {
            return "invalid 秘钥丢失请重新登陆。";
        }
        return "valid";
    }

    //因为集成了老版本前端, 先MD5跑一下
    public static String checkRightsStatusMD5(String inEmail, String inPassword
        , String level) {
        if (null == inEmail) {
            return "invalid ";
        }
        //String uPassword= inPassword;
        String uEmail = inEmail;
        Usr usr = findUsrByUEmail(uEmail);
        //UsrToken usrToken= this.findUsrTokenByUId(usr.getuId());
        String password = TokenUtil.getSecondMD5Password(inPassword);
        if (!usr.getuPassword().equals(password)) {
            return "invalid ";
        }
        return "valid";
    }


    public static String checkTokenStatusAndGetLevel(String token, String level
        , IMV_SIQ output) {
        if (null == token || token.equalsIgnoreCase("undefined")) {
            return "invalid 秘钥丢失请重新登陆。";
        }
        String json = StringUtil.decode(token);
        JSONObject js;
        try {
            js = new JSONObject(json);
        } catch (Exception e) {
            return "invalid 秘钥错误请重新登陆。";
        }
        long uTime = js.getLong("uTime");
        String uPassword = js.getString("mPassword");
        String uEmail = js.getString("uEmail");
        Usr usr = findUsrByUEmail(uEmail);
        UsrToken usrToken = findUsrTokenByUId(usr.getuId());
        //String password= TokenUtil.getFirstMD5Password(js.getString("uKey")
        //		, usrToken.getuPassword());


        //下面用DNA 替换了下, 之后进行组件测试.
        String key = "";
        String[] lock = new String[12];
        lock[0] = "A";
        lock[3] = "O";
        lock[6] = "P";
        lock[9] = "M";
        lock[1] = "V";
        lock[4] = "E";
        lock[7] = "C";
        lock[10] = "S";
        lock[2] = "I";
        lock[5] = "D";
        lock[8] = "U";
        lock[11] = "Q";
        for (int loop = 0; loop < 4; loop++) {
            int i = (int) (Math.random() * 12) % 12;
            key += lock[i];
        }
        Token sessiontoken = new Token();
        js.put("uKey", key);
        String dnaPassword = TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword()
            , sessiontoken);
        sessiontoken.I_uEmail(usr.getuEmail());
        sessiontoken.I_uKey(key);
        sessiontoken.I_uTime(new Date().getTime());
        //token.I_mPassword(mPassword);
        sessiontoken.I_mPassword(dnaPassword);


        //if (!uPassword.equals(password)) {
        if (!uPassword.equals(dnaPassword)) {
            return "invalid 密码错误。";
        }
        long nowTime = new Date().getTime();
        if (uTime + 600000 < nowTime) {
            return "invalid 10分钟超时, 请重新登陆。";
        }

        if (level.contains("level")) {
            String uLevel = usrToken.getuLevel();
            if (!uLevel.contains("high")) {
                return "invalid 权限不够";
            }
        }
        output.put("usrName", "咨询专家" + usr.getuId());
        return "valid" + usrToken.getuLevel();
    }

    //之后跑通 register 和login 后 整体进行check。优先级靠后 罗瑶光 20210801
    public static String checkRightsStatusDNA(String inEmail, String INpassword
        , String string) {
        if (null == inEmail) {
            return "invalid ";
        }
        return "valid";
    }
}

//	public static String checkRightsStatus(String inEmail, String inPassword
//			, String level)  {
//		if (null== inEmail) {
//			return "invalid 秘钥丢失请重新登陆。";
//		}
//		//String uPassword= inPassword;
//		String uEmail= inEmail;
//		Usr usr= findUsrByUEmail(uEmail);
//		//UsrToken usrToken= this.findUsrTokenByUId(usr.getuId());
//
//
//
//		//下面用DNA 替换了下, 之后进行组件测试.
//		String key= "";
//		String[] lock= new String[12];
//		lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9] = "M";
//		lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
//		lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";
//		for(int loop= 0; loop< 4; loop++) {
//			int i= (int)(Math.random()* 12)% 12;
//			key+= lock[i];
//		}
//		Token sessiontoken= new Token();
//		String dnaPassword= TokenUtil.getFirstDNAPassword(key, inPassword, sessiontoken);
//		sessiontoken.I_uEmail(usr.getuEmail());
//		sessiontoken.I_uKey(key);
//		sessiontoken.I_uTime(new Date().getTime());
//		//token.I_mPassword(mPassword);
//		sessiontoken.I_mPassword(dnaPassword);
//
//
//		//String password= TokenUtil.getSecondMD5Password(inPassword);
//		//if (!usr.getuPassword().equals(password)) {
//		if (!usr.getuPassword().equals(dnaPassword)) {
//			return "invalid 密码错误。";
//		}
//		return "valid";
//	}

//String uPassword= inPassword;
//String uEmail= inEmail;
//Usr usr= findUsrByUEmail(uEmail);
//UsrToken usrToken= this.findUsrTokenByUId(usr.getuId());
//	String password= TokenUtil.getSecondMD5Password(INpassword);
//	if (!usr.getuPassword().equals(password)) {
//		return "invalid ";
//	}

//String uPassword= inPassword;
//	String uEmail= inEmail;
//	Usr usr= findUsrByUEmail(uEmail);
//	UsrToken usrToken= findUsrTokenByUId(usr.getuId());
//			//下面用DNA 替换了下, 之后进行组件测试.
//			String key= "";
//			String[] lock= new String[12];
//			lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9] = "M";
//			lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
//			lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";
//			for(int loop= 0; loop< 4; loop++) {
//				int i= (int)(Math.random()* 12)% 12;
//				key+= lock[i];
//			}
//			Token sessiontoken= new Token();
//			String dnaPassword= TokenUtil.getFirstDNAPassword(key, inPassword, sessiontoken);
//			sessiontoken.I_uEmail(usr.getuEmail());
//			sessiontoken.I_uKey(key);
//			sessiontoken.I_uTime(new Date().getTime());
//			//token.I_mPassword(mPassword);
//			sessiontoken.I_mPassword(dnaPassword);
//String password= TokenUtil.getSecondMD5Password(inPassword);
//			if (!usr.getuPassword().equals(usrToken.getuPassword())) {
//			//if (!usr.getuPassword().equals(dnaPassword)) {
//				return "invalid 密码错误。";
//			}