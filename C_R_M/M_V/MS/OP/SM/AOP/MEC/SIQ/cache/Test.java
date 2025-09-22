/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package M_V.MS.OP.SM.AOP.MEC.SIQ.cache;

import U_A.PEU.P.cache.Cache;
import U_A.PEU.P.cache.Cache_M;

public class Test {
	public static void main(String[] args) { 
		// Cache_M.putCache("abc", new Cache());
		Cache c= new Cache();
		c.I_Value("good");
		Cache_M.putCache("result", c);
		//20230106-System.out.println(Cache_M.getCacheInfo("result").getValue().toString()); 
	} 
}
