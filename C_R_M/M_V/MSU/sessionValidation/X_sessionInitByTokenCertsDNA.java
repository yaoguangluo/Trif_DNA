package M_V.MSU.sessionValidation;

import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenCerts;
import U_A.PEU.P.dna.TokenUtil;

import java.util.Date;
//DNA加密设计 罗瑶光
//DNA加密思想 罗瑶光
//Refer <DNA元基编码>罗瑶光 罗荣武, <PDE肽展公式>: 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class X_sessionInitByTokenCertsDNA{
	  
	//序列初始生成
	public static Token _E(TokenCerts tokenCerts) {
		String key= "";
		String[] lock= new String[12];
		lock[0]= "A"; lock[3]= "O"; lock[6]= "P"; lock[9]= "M";
		lock[1]= "V"; lock[4]= "E"; lock[7]= "C"; lock[10]= "S";
		lock[2]= "I"; lock[5]= "D"; lock[8]= "U"; lock[11]= "Q";
		//还可以加 TXH, 安全级别更高.
		for(int loop= 0; loop< 4; loop++) {
			int i= (int)(Math.random()* 12)% 12;
			key+= lock[i];
		}
		Token sessiontoken= new Token();//大家注意这个password 是元基, 明文要转化下.
		String dnaPassword= TokenUtil.getFirstDNAPassword(key
				, tokenCerts.getPdnPassword(), sessiontoken);
		sessiontoken.I_uEmail("313699483@qq.com");
		sessiontoken.I_uKey(key);
		//下面注意这个时间要和ETC的时区进行时区计算.进行统一.
		//我准备将下面这个时间稍后也同样肽加密, 不然别人改时间一样能用.
		//如果是服务器端的缓存有时间失效设置, 那就可以不考虑.
		sessiontoken.I_uTime(new Date().getTime());
		//token.setmPassword(mPassword);
		sessiontoken.I_mPassword(dnaPassword);
		return sessiontoken;
	}
}
