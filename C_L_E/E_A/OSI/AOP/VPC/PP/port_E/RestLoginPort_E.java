package E_A.OSI.AOP.VPC.PP.port_E;

import E_A.OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import S_A.pheromone.IMV_SQI;
import VPC.transaction.DelegateDB_X_Login;
import VPC.transaction.DelegateDB_X_LoginDB_DNA;
import VPC.transaction.DelegateDB_X_Register;
import VPC.transaction.DelegateDB_X_RegisterDB_DNA;
import org.json.JSONException;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class RestLoginPort_E {//implements RestLoginPort {

    public static IMV_SQI login(String uEmail, String uPassword) {
        IMV_SQI map = DelegateDB_X_Login.transactionLogin(uEmail, uPassword);
        return map;
    }

    //分离出来方便之后继承 几天用dna代替登陆, 准备研发和测试
    public static IMV_SQI loginDB(String uEmail, String uPassword) {
        IMV_SQI map = DelegateDB_X_LoginDB_DNA.transactionLoginDB_DNA(uEmail, uPassword);
        return map;
    }

    public static IMV_SQI logout(String uEmail, String uToken) {
        IMV_SQI output = new IMV_SQI();
        output.put("userEmail", "friend");
        output.put("userToken", "123456");
        return output;
    }

    public static IMV_SQI register(String uEmail, String uName, String uPassword) {
        IMV_SQI output = DelegateDB_X_Register.transactionRegister(uEmail, uName, uPassword);
        return output;
    }

    //分离出来方便之后继承 几天用dna代替登陆, 准备研发和测试
    public static IMV_SQI registerDB(String uEmail, String uEmailEnsure
        , String uName, String uPassword, String uPassWDEnsure, String uAddress
        , String uPhone, String uWeChat, String uQq, String uAge, String uSex) {
        IMV_SQI output = DelegateDB_X_RegisterDB_DNA.transactionRegisterDB_DNA(uEmail
            , uEmailEnsure, uName, uPassword, uPassWDEnsure, uAddress, uPhone, uWeChat,
            uQq, uAge, uSex);
        return output;
    }

    public static IMV_SQI change(String uEmail, String uChange
        , String uChangeEnsure, String uToken, String uPassword) {
        return null;
    }

    public static IMV_SQI find(String uEmail) {
        return null;
    }

    //合并db20210730 罗瑶光 因为改了 元基标识, 先用MD5的调试好, 然后整包之后换DNA
    public static IMV_SQI checkStatus(String token) throws NumberFormatException
        , JSONException, Exception {
        IMV_SQI output = new IMV_SQI();
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
//	public static IMV_SQI register(String uEmail, String uEmailEnsure, String uName
//		, String uPassword, String uPassWDEnsure, String uAddress, String uPhone
//		, String uWeChat, String uQq, String uAge, String uSex) {
//		IMV_SQI output = DelegateDB_X_Register.transactionRegister(uEmail, uName, uPassword);
////		IMV_SQI output= DelegateDB_X_Register.transactionRegister(uEmail
////			, uEmailEnsure, uName, uPassword, uPassWDEnsure, uAddress, uPhone, uWeChat,
////			uQq, uAge, uSex);
//		return output;
//	}