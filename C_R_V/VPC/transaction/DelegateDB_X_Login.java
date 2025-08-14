package VPC.transaction;

import M_V.MSU.sessionValidation.X_sessionInitByTokenPDICertsDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import S_A.SVQ.stable.S_Token;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.TokenCerts;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;
import VPC.DetaFrontEnd.DetaFrontEndUtil_X_backEndRequest;
import org.json.JSONObject;

import java.net.URLEncoder;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DelegateDB_X_Login {
    @SuppressWarnings("deprecation")
    public static IMV_SIQ transactionLogin(String uEmail, String uPassword) {
        String response = DetaFrontEndUtil_X_backEndRequest._E("login?uEmail="
            + URLEncoder.encode(uEmail) + "&uPassword=" + URLEncoder.encode(uPassword));
        return DSU.V.VtoV.JsonObjectToMap
            (new JSONObject(response));
    }


    //打印一个pde和 lock 出来, dma 改数据库进行测试下是否登陆验证
    @SuppressWarnings("unused")
    public static void main(String[] ARGS) {
        String id = "313699483@QQ.COM";
        String idString = String_ESU_X_charsetSwap._E(id, "UTF8", "UTF8");
        String idEncoder = String_ESU_X_stringToURIencode._E(idString, "UTF8");
        String password = "Fengyue1985!";
        //加密
        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(password
            , false, null);
        U_A.PEU.P.dna.Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
        String passwordString = String_ESU_X_charsetSwap._E(token.getmPassword()
            , "UTF8", "UTF8");
        String passwordEncoder = String_ESU_X_stringToURIencode._E(passwordString
            , "UTF8");

        String de = token.getUpdsde(); //对应PDS 概率钥匙加密
        String ds = token.getUpdsds(); //对应PDS 概率钥匙加密
        String ie = token.getUpdsie(); //对应PDS 概率钥匙加密
        String is = token.getUpdsis(); //对应PDS 概率钥匙加密
        String lock = tokenCerts.getPdnLock() + S_Token.ETL_SYMBOL_SMILL + de
            + S_Token.ETL_SYMBOL_SMILL + ds + S_Token.ETL_SYMBOL_SMILL + ie
            + S_Token.ETL_SYMBOL_SMILL + is;//对应非对称的筛子模拟上锁
        //20230106-System.out.println("lock--1>"+ lock);

    }
}
//20230106-System.out.println("pds--1>"+ tokenCerts.getPds());
//20230106-System.out.println("pde--1>"+ token.getmPassword());