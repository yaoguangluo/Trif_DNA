//package VPC.transaction;
//
//import E_A.OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
//import S_A.pheromone.IMV_SIQ;
//import U_A.PEU.P.dna.StringUtil;
//import U_A.PEU.P.dna.Token;
//import U_A.PEU.P.dna.TokenUtil;
//import U_A.PEU.P.md5.Usr;
//import U_A.PEU.P.md5.UsrToken;
//import com.google.gson.Gson;
//
//
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class DelegateDB_X_LoginDB {
//    //新增数据库合并的login 和register
//    //今天准备准被换下DNAPassword, 罗瑶光20210731
//    public static IMV_SIQ transactionLoginDB(String uEmail, String uPassword) {
//        Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
//        UsrToken usrToken = LoginServiceImpl.findUsrTokenByUId(usr.getuId());
//        String password = TokenUtil.getSecondMD5Password(uPassword);
//        if (!password.equals(usrToken.getuPassword())) {
//            IMV_SIQ out = new IMV_SIQ();
//            out.putString("loginInfo", "unsuccess");
//            out.putString("returnResult", "unsuccess");
//            return out;
//        }
//        Token token = TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
//        String json = new Gson().toJson(token);
//        String jsonToken = StringUtil.encode(json);
//        LoginServiceImpl.U_UsrTokenByUId(usr.getuId(), token.getuKey()
//            , password, token.getuTime() / 1000);
//        IMV_SIQ out = new IMV_SIQ();
//        out.putString("userToken", jsonToken);
//        out.putString("userEmail", uEmail);
//        out.putString("loginInfo", "success");
//        return out;
//    }
//}
