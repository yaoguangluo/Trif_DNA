/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */package src.java.org.lyg.cache;

public class test {
	public static void main(String[] args) { 
		// CacheManager.putCache("abc", new Cache());
		Cache c= new Cache();
		c.setValue("good");
		CacheManager.putCache("result", c);
		System.out.flush();System.out.println(CacheManager.getCacheInfo("result").getValue().toString()); 
	} 
}