package VPC.transaction;

import A_I.MPE.MAQPVDCOISIV.pdi.TokenPDI;
import E_A.OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import M_V.MSU.sessionValidation.X_sessionInitByTokenPDICertsDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import S_A.SVQ.stable.S_Token;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.StringUtil;
import U_A.PEU.P.dna.TokenCerts;
import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;
import com.google.gson.Gson;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DelegateDB_X_LoginDB_DNA {
    //不在老函数里面改, 重命名一个新的DNA开头 罗瑶光
    //数据库token的存根是pde, token是pds
    //token验证是输入pds, 比对的pde
    //这个函数设计完后我就设计register, 注册一个pde存根, 这样就可以验证这个登陆函数了。
    //罗瑶光 20210731
    public static IMV_SIQ transactionLoginDB_DNA(String uEmail, String uPassword) {
        Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
        UsrToken usrToken = LoginServiceImpl.findUsrTokenByUId(usr.getuId());
        //DNA SESSION 替换
        //老表的 getuKey 就是dna的getPdnLock, 我要做的就是把pds4个概率钥匙也合并。
        //先定个格式为 >_< 分开 如 lock>_<de>_<ds>_<ie>_<is, split就好处理了。
        String[] MD5dice_DNA = usrToken.getuKey().split(S_Token.ETL_SYMBOL_SMILL);
        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(uPassword
            , true, MD5dice_DNA[0]);
        TokenPDI pDE_RNA_Formular = new TokenPDI();
        TokenPDI pDE_RNA_Formular1 = new TokenPDI();
        pDE_RNA_Formular1.pdedeKey = MD5dice_DNA[1];
        pDE_RNA_Formular1.pdedsKey = MD5dice_DNA[2];
        pDE_RNA_Formular1.pdeieKey = MD5dice_DNA[3];
        pDE_RNA_Formular1.pdeisKey = MD5dice_DNA[4];

        pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword()
            , pDE_RNA_Formular1, true);
        //20230106-System.out.println("pds--3>"+ pDE_RNA_Formular1.pds);
        //
        if (!pDE_RNA_Formular1.pde.equals(usrToken.getuPassword())) {
            IMV_SIQ out = new IMV_SIQ();
            out.putString("loginInfo", "unsuccess");
            out.putString("returnResult", "unsuccess");
            return out;
        }

        tokenCerts
            = X_sessionTokenCertsInitWithHumanWordsByDNA._E(uPassword, false, null);
        U_A.PEU.P.dna.Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
        String passwordString = String_ESU_X_charsetSwap._E(token.getmPassword(), "UTF8"
            , "UTF8");
        String passwordEncoder = String_ESU_X_stringToURIencode._E(passwordString, "UTF8");
        //20230106-System.out.println("pds--1>"+ token.getmPasswordPDS());
        String de = token.getUpdsde(); //对应PDS 概率钥匙加密
        String ds = token.getUpdsds(); //对应PDS 概率钥匙加密
        String ie = token.getUpdsie(); //对应PDS 概率钥匙加密
        String is = token.getUpdsis(); //对应PDS 概率钥匙加密
        String lock = tokenCerts.getPdnLock() + S_Token.ETL_SYMBOL_SMILL + de
            + S_Token.ETL_SYMBOL_SMILL + ds + S_Token.ETL_SYMBOL_SMILL + ie
            + S_Token.ETL_SYMBOL_SMILL + is;//对应非对称的筛子模拟上锁

        //Token token= TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
        //去掉概率钥匙密码PDE, 仅仅时间 pds 和 id 即可
        token.I_Updsie("");
        token.I_Updsis("");
        token.I_Updsde("");
        token.I_Updsds("");
        token.I_uKey("");
        token.I_mPassword("");

        //// 仅仅含有时间, EMAIL 和 pds 3个
        token.I_uEmail(uEmail);
        String json = new Gson().toJson(token);
        String jsonToken = StringUtil.encode(json);
        LoginServiceImpl.U_UsrTokenByUId(usr.getuId(), lock, passwordEncoder
            , token.getuTime() / 1000);
        IMV_SIQ out = new IMV_SIQ();
        out.putObject("userToken", jsonToken);// 仅仅含有时间, EMAIL 和 pds 3个
        out.putObject("userEmail", uEmail);
        out.putString("loginInfo", "success");
        return out;
    }
}
