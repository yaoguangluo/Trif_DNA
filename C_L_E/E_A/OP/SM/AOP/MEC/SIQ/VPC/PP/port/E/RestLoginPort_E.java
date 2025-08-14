package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestLoginPort_E {
    public static IMV_SIQ logout(String uEmail, String uToken) {
        IMV_SIQ output = new IMV_SIQ();
        output.put("userEmail", "friend");
        output.put("userToken", "123456");
        return output;
    }

    public static IMV_SIQ change(String uEmail, String uChange
            , String uChangeEnsure, String uToken,
                                             String uPassword) {
        return null;
    }

    public static IMV_SIQ find(String uEmail) {
        return null;
    }

    public static IMV_SIQ checkStatus(String token) {
        IMV_SIQ output = new IMV_SIQ();
        String checkStatus = LoginService_E.checkTokenStatusAndGetLevel(token, "level"
            , output);
        if (checkStatus.contains("invalid")) {
            output.put("loginInfo", "unsuccess");
            output.put("returnResult", checkStatus);
            return output;
        }
        output.put("loginInfo", "success");
        output.put("returnResult", checkStatus);
        return output;
    }
}
//	public static IMV_SIQ login(String uEmail, String uPassword)  {
//		IMV_SIQ map= TransactionDelegate.transactionLogin(uEmail, uPassword);
//		return map;
//	}

//	public static IMV_SIQ register(String uEmail, String uEmailEnsure
//			, String uName, String uPassword,
//			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat,
//			String uQq, String uAge, String uSex)  {
//		IMV_SIQ output= TransactionDelegate.transactionRegister(uEmail
//				, uEmailEnsure, uName, uPassword,
//				uPassWDEnsure, uAddress, uPhone, uWeChat,
//				uQq, uAge, uSex);
//		return output;
//	}