package U_A.PEU.P.dna;
//MD5替换DNA已经开始, 准备设计个记录单例类.
//可以用lombok 也可以直接public setter getter
//罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class TokenCerts {
	public String getPassword() {
		return password;
	}
	public void I_Password(String password) {
		this.password= password;
	}
	public String getPdnKey() {
		return pdnKey;
	}
	public void I_PdnKey(String pdnKey) {
		this.pdnKey= pdnKey;
	}
	public String getPdnLock() {
		return pdnLock;
	}
	public void I_PdnLock(String pdnLock) {
		this.pdnLock= pdnLock;
	}
	public String getPdnPassword() {
		return pdnPassword;
	}
	public void I_PdnPassword(String pdnPassword) {
		this.pdnPassword= pdnPassword;
	}
	public String getPds() {
		return pds;
	}
	public void I_Pds(String pds) {
		this.pds= pds;
	}
	private String password;
	private String pds;
	private String pdnKey;
	private String pdnLock;
	private String pdnPassword;
}
