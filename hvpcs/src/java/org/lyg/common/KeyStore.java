/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */package src.java.org.lyg.common;
public class KeyStore{
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public long getExpDate() {
		return expDate;
	}
	public void setExpDate(long expDate) {
		this.expDate = expDate;
	}
	public long getGid() {
		return gid;
	}
	public void setGid(long gid) {
		this.gid = gid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long code;
	public long expDate;
	public long gid;
	public String email;
}