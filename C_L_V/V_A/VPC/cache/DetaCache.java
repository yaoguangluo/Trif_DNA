package V_A.VPC.cache;
//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaCache {

	public String getValue() {
		return value;
	}

	public void I_Value(String value) {
		this.value= value;
	}

	public Object getObject() {
		return object;
	}

	public void I_Object(Object object) {
		this.object= object;
	}

	public long getTimeOut() {
		return timeOut;
	}

	public void I_TimeOut(long timeOut) {
		this.timeOut= timeOut;
	}

	private String value;
	private Object object;
	private long timeOut;
	public DetaCache() {
		super();
	}

	public DetaCache(String value, Object object, long timeOut) {
		this.value= value;
		this.object= object;
		this.timeOut= timeOut;
	}
} 
