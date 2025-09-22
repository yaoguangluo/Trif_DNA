package E_A.OSI.AOP.VPC.PP.port_E;

import E_A.OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import S_A.pheromone.IMV_SIQ;
import VPC.transaction.DelegateDB_X_Login;
import VPC.transaction.DelegateDB_X_LoginDB_DNA;
import VPC.transaction.DelegateDB_X_Register;
import VPC.transaction.DelegateDB_X_RegisterDB_DNA;
import org.json.JSONException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestLoginPort_E {//implements RestLoginPort {

    public static IMV_SIQ login(String uEmail, String uPassword) {
        IMV_SIQ map = DelegateDB_X_Login.transactionLogin(uEmail, uPassword);
        return map;
    }

    //分离出来方便之后继承 几天用dna代替登陆, 准备研发和测试
    public static IMV_SIQ loginDB(String uEmail, String uPassword) {
        IMV_SIQ map = DelegateDB_X_LoginDB_DNA.transactionLoginDB_DNA(uEmail, uPassword);
        return map;
    }

    public static IMV_SIQ logout(String uEmail, String uToken) {
        IMV_SIQ output = new IMV_SIQ();
        output.put("userEmail", "friend");
        output.put("userToken", "123456");
        return output;
    }

    public static IMV_SIQ register(String uEmail, String uName, String uPassword) {
        IMV_SIQ output = DelegateDB_X_Register.transactionRegister(uEmail, uName, uPassword);
        return output;
    }

    //分离出来方便之后继承 几天用dna代替登陆, 准备研发和测试
    public static IMV_SIQ registerDB(String uEmail, String uEmailEnsure
        , String uName, String uPassword, String uPassWDEnsure, String uAddress
        , String uPhone, String uWeChat, String uQq, String uAge, String uSex) {
        IMV_SIQ output = DelegateDB_X_RegisterDB_DNA.transactionRegisterDB_DNA(uEmail
            , uEmailEnsure, uName, uPassword, uPassWDEnsure, uAddress, uPhone, uWeChat,
            uQq, uAge, uSex);
        return output;
    }

    public static IMV_SIQ change(String uEmail, String uChange
        , String uChangeEnsure, String uToken, String uPassword) {
        return null;
    }

    public static IMV_SIQ find(String uEmail) {
        return null;
    }

    //合并db20210730 罗瑶光 因为改了 元基标识, 先用MD5的调试好, 然后整包之后换DNA
    public static IMV_SIQ checkStatus(String token) throws NumberFormatException
        , JSONException, Exception {
        IMV_SIQ output = new IMV_SIQ();
        String checkStatus = LoginServiceImpl.checkTokenStatusAndGetLevel(token, "level", output);
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
//	public static IMV_SIQ register(String uEmail, String uEmailEnsure, String uName
//		, String uPassword, String uPassWDEnsure, String uAddress, String uPhone
//		, String uWeChat, String uQq, String uAge, String uSex) {
//		IMV_SIQ output = DelegateDB_X_Register.transactionRegister(uEmail, uName, uPassword);
////		IMV_SIQ output= DelegateDB_X_Register.transactionRegister(uEmail
////			, uEmailEnsure, uName, uPassword, uPassWDEnsure, uAddress, uPhone, uWeChat,
////			uQq, uAge, uSex);
//		return output;
//	}