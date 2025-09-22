package U_A.PEU.P.nlp;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public interface StopSymbol_UTF8{
	//REFER http://www.fhdq.net/
	//为了避免踩编码界多年的巨坑, 因为不支持UTF8-UTF8混合字符乱码产生重编译bug,
	//我把//www.fhdq.net/ 换了成电脑键盘的ascii 标准符号。
	//用户感兴趣自己添加,
	//作者罗瑶光。
	public static final String symbol="！@#￥%……&*（）——+}{“：？》《·1234567890-=】"
			+ "【‘；/。, `~!@#$%^&*()_+}{\":?></., ';][=-'";
} 
	
