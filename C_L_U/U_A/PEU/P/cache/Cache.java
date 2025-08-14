package U_A.PEU.P.cache;
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Cache {
	private String key;
	private Object value;
	private long timeOut;
	private boolean expired;
	public Cache() {
		super();
	}

	public Cache(String key, Object value, long timeOut, boolean expired) {
		this.key= key;
		this.value= value;
		this.timeOut= timeOut;
		this.expired= expired;
	}

	public String getKey() {
		return key;
	}

	public long getTimeOut() {
		return timeOut;
	}

	public Object getValue() {
		return value;
	}

	public void I_Key(String string) {
		key= string;
	}

	public void I_TimeOut(long l) {
		timeOut= l;
	}

	public void I_Value(Object object) {
		value= object;
	}

	public boolean isExpired() {
		return expired;
	}

	public void I_Expired(boolean b) {
		expired= b;
	}
} 
