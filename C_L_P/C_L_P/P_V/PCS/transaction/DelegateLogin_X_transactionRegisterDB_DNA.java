package P_V.PCS.transaction;

import E_A.OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import M_V.MSU.sessionValidation.X_sessionInitByTokenPDICertsDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import S_A.SVQ.stable.S_Token;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.TokenCerts;
import U_A.PEU.P.md5.Usr;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;
import VPC.transaction.DelegateDB_X_LoginDB_DNA;
import org.json.JSONObject;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DelegateLogin_X_transactionRegisterDB_DNA {
    //注册函数也用dna设计先分开来。
    @SuppressWarnings("unused")
    public static IMV_SIQ transactionRegisterDB_DNA(String uEmail, String uEmailEnsure
        , String uName, String uPassword, String uPassWDEnsure, String uAddress
        , String uPhone, String uWeChat, String uQq, String uAge, String uSex) {
        Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
        if (usr.getuEmail() != null) {
            IMV_SIQ out = new IMV_SIQ();
            out.put("loginInfo", "unsuccess");
            out.put("returnResult", "unsuccess");
            return out;
        }
        JSONObject jsobj = new JSONObject();
        jsobj.put("u_email", uEmail);
        jsobj.put("u_name", uName);
        //用dna代替
        //jsobj.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
        //模拟加个测试账号: 313699483@QQ.COM, 密码: Fengyue1985!
        String id = uEmail;
        String idString = String_ESU_X_charsetSwap._E(id, "UTF8", "UTF8");
        String idEncoder = String_ESU_X_stringToURIencode._E(idString, "UTF8");
        String password = uPassword;
        //加密
        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(password, false, null);
        U_A.PEU.P.dna.Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
        String passwordString = String_ESU_X_charsetSwap._E(token.getmPassword(), "UTF8", "UTF8");//pde
        String passwordEncoder = String_ESU_X_stringToURIencode._E(passwordString, "UTF8");
        //20230106-System.out.println("pds--1>"+ tokenCerts.getPds());

        jsobj.put("u_password", token.getmPassword());//pde
        jsobj.put("u_address", uAddress);
        jsobj.put("u_phone", uPhone);
        jsobj.put("u_weChat", uWeChat);
        jsobj.put("u_qq", uQq);
        jsobj.put("u_age", uAge);
        jsobj.put("u_sex", uSex);
        jsobj.put("u_id", "random");
        LoginServiceImpl.IU_RowByTablePath("backend", "usr", jsobj);
        usr = LoginServiceImpl.findUsrByUEmail(uEmail);
        JSONObject jsobjToken = new JSONObject();
        jsobjToken.put("u_id", usr.getuId());
        jsobjToken.put("u_level", "low");

        String de = token.getUpdsde(); //对应PDS 概率钥匙加密
        String ds = token.getUpdsds(); //对应PDS 概率钥匙加密
        String ie = token.getUpdsie(); //对应PDS 概率钥匙加密
        String is = token.getUpdsis(); //对应PDS 概率钥匙加密
        String lock = tokenCerts.getPdnLock() + S_Token.ETL_SYMBOL_SMILL
            + de + S_Token.ETL_SYMBOL_SMILL + ds + S_Token.ETL_SYMBOL_SMILL
            + ie + S_Token.ETL_SYMBOL_SMILL + is;//对应非对称的筛子模拟上锁

        jsobjToken.put("baseName", "backend");
        jsobjToken.put("u_key", lock);
        jsobjToken.put("u_password", token.getmPassword());
        //			jsobjToken.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
        LoginServiceImpl.IU_RowByTablePath("backend", "usrToken", jsobjToken);
        return DelegateDB_X_LoginDB_DNA.transactionLoginDB_DNA(uEmail, uPassword);
    }
}
