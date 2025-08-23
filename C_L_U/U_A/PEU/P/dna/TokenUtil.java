package U_A.PEU.P.dna;

import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
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
public class TokenUtil {
    //把楼上的web代码合并养料经的元基版代码, 先调通下MD5 token的流水, 稍后换 dna的流水
    //, 罗瑶光20210730
    public static Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken) {
        String key = String.valueOf(Double.valueOf(Math.random() * 10000000));
        String mPassword = TokenUtil.getFirstMD5Password(key, usrToken.getuPassword());
        Token token = new Token();
        token.I_uEmail(usr.getuEmail());
        token.I_uKey(key);
        token.I_uTime(new Date().getTime());
        token.I_mPassword(mPassword);
        return token;
    }

    public static String getSecondMD5Password(String uPassword) {
        try {
            return StringUtil.EncoderByMd5("Author:Yaoguang Luo"
					, uPassword, 8);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getFirstMD5Password(String key, String uPassword) {
        try {
            return StringUtil.EncoderByMd5(key, uPassword, 8);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    //等下把上面的3个MD5涉及的工程所有文件 整体替换为 下面的DNA加密
    //罗瑶光
    public static String getFirstDNAPassword(String key, String uPassword, Token token) {
        return StringUtil.EncoderByDNA(key, uPassword, token);
    }

    public static Token getNewTokenFromUsrAndUsrTokenByDNA(Usr usr, UsrToken usrToken) {
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
        Token token = new Token();
        String dnaPassword = TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword()
                , token);
        token.I_uEmail(usr.getuEmail());
        token.I_uKey(key);
        token.I_uTime(new Date().getTime());
        //token.I_mPassword(mPassword);
        token.I_mPassword(dnaPassword);
        return token;
    }
}
