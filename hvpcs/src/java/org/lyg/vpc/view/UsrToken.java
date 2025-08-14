/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */package src.java.org.lyg.vpc.view;

public class UsrToken {
	public String getuLevel() {
		return uLevel;
	}
	public void setuLevel(String uLevel) {
		this.uLevel = uLevel;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getuKey() {
		return uKey;
	}
	public void setuKey(String uKey) {
		this.uKey = uKey;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuToken() {
		return uToken;
	}
	public void setuToken(String uToken) {
		this.uToken = uToken;
	}
	public long getuTime() {
		return uTime;
	}
	public void setuTime(long uTime) {
		this.uTime = uTime;
	}
	private Integer uId;
	private String uKey;
	private String uPassword;
	private String uToken;
	private String uLevel;
	private long uTime;
}