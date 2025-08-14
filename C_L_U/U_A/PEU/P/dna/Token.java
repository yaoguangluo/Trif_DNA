package U_A.PEU.P.dna;
//MD5的token也是罗瑶光先生设计的, 这里分出来到 dna processor, 备注下
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Token {
	public String getuEmail() {
		return uEmail;
	}
	public void I_uEmail(String uEmail) {
		this.uEmail= uEmail;
	}
	public String getuKey() {
		return uKey;
	}
	public void I_uKey(String uKey) {
		this.uKey= uKey;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void I_mPassword(String mPassword) {
		this.mPassword= mPassword;
	}
	public long getuTime() {
		return uTime;
	}
	public void I_uTime(long uTime) {
		this.uTime= uTime;
	}
	public String getUpdsie() {
		return updsie;
	}
	public void I_Updsie(String updsie) {
		this.updsie= updsie;
	}
	public String getUpdsis() {
		return updsis;
	}
	public void I_Updsis(String updsis) {
		this.updsis= updsis;
	}
	public String getUpdsde() {
		return updsde;
	}
	public void I_Updsde(String updsde) {
		this.updsde= updsde;
	}
	public String getUpdsds() {
		return updsds;
	}
	public void I_Updsds(String updsds) {
		this.updsds= updsds;
	}
	public String getmPasswordPDS() {
		return mPasswordPDS;
	}
	public void I_mPasswordPDS(String mPasswordPDS) {
		this.mPasswordPDS= mPasswordPDS;
	}
	private String uEmail;
	private String uKey;
	private String updsie;
	private String updsis;
	private String updsde;
	private String updsds;
	private String mPassword;
	private String mPasswordPDS;
	private long uTime;
}
