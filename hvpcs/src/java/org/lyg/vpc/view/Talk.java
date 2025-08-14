
	/*
	 * 著作权人, 作者 罗瑶光, 浏阳
	 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
	 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
	 * 15116110525-
	 * 430181198505250014, G24402609, EB0581342
	 * 204925063, 389418686, F2406501, 0626136
	 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
	 * */package src.java.org.lyg.vpc.view;

public class Talk {
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isRead() {
		return isRead;
	}
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	private String object;
    private String message;
    private boolean isRead;
    private long time;
}