package E_A.org.tinos.deta.hooks.main;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//用于异常的并发循环登记。
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class ExceptInformation{
	public long exceptionCount= 0;//问题发生的次数
	public String exceptionFile= new String();//问题发生在哪个文件
	public String exceptionSession= new String();//问题的登记编号记录
	public List<Long> exceptionTimes= new CopyOnWriteArrayList<>();//问题的发生时间
	public String throwableString= new String();
	private Exception exception;
	public void putException(Exception inputException) {
		this.exception= inputException;
	}
	public Exception getException() {
		return this.exception;
	}
	//...
}