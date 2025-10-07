package VPC.transaction;

import DSU.V.VtoV;
import S_A.pheromone.IMV_SQI;
import VPC.DetaFrontEnd.DetaFrontEndUtil_X_backEndRequest;
import org.json.JSONObject;

import java.net.URLEncoder;


/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class DelegateDB_X_Register {
    @SuppressWarnings("deprecation")
    public static IMV_SQI transactionRegister(String uEmail, String uName, String uPassword) {
        String response = DetaFrontEndUtil_X_backEndRequest._E("register?uEmail="
            + URLEncoder.encode(uEmail)
            + "&uName=" + URLEncoder.encode(uName)
            + "&uPassword=" + URLEncoder.encode(uPassword));
        return VtoV.JsonObjectToMap
            (new JSONObject(response));
    }
//    public static IMV_SQI transactionRegister(String uEmail, String uEmailEnsure
//        , String uName, String uPassword, String uPassWDEnsure, String uAddress
//        , String uPhone, String uWeChat, String uQq, String uAge, String uSex) {
//        String response = DetaFrontEndUtil_X_backEndRequest._E("register?uEmail="
//            + URLEncoder.encode(uEmail)
//            + "&uName=" + URLEncoder.encode(uName)
//            + "&uPassword=" + URLEncoder.encode(uPassword));
//        IMV_SQI out = D_V.PCS.VQS.DSU.V.VtoV.JsonObjectToMap
//            (new JSONObject(response));
//        return out;
//    }
}
