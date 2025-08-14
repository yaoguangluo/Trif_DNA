package M_V.MSU.sessionValidation;

import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenCerts;

//DNA加密设计 罗瑶光
//DNA加密思想 罗瑶光
//Refer <DNA元基编码>罗瑶光 罗荣武, <PDE肽展公式>: 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_sessionCheck {
    //序列检查, 用于并发条件下又没有缓存服务器额情况下.
    //用户注意, FullDNATokenPDI 是我目的用来做DNA搜索的, 在dna加密这里也可以用, 但是, 如果要用
    //, 请谨慎修改.
    public static boolean _E(Token token, TokenCerts tokenCerts) {
        boolean infix = X_sessionCheckWithOrderPDSKey._E(token, tokenCerts);
        boolean postfix = X_sessionCheckWithPostPDSKey._E(token, tokenCerts);
        return infix && postfix;
    }
}
