package DetaSrc.org.deta.boot.server;

import java.util.HashMap;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class dsd{
	@SuppressWarnings("unused")
	public static void main(String[] argv) {
		String[] s= new String[] {"A", "O", "P", "M", "V", "E", "C", "S", "I", "D", "U", "Q"};
		String[] s1= new String[] {"����", "����", "����", "����", "�Ӿ�", "ִ��", "����", "��̬", "����", "ɾ��", "�ı�", "����"};
		Map<String, String> map= new HashMap<>();
		String AOPM= "AOPM";
		String VECS= "VECS";
		String IDUQ= "IDUQ";
		Map<String, String> mapL= new HashMap<>();
//		System.out.flush();System.out.println("��Ԫ��");
//		for(int i=0;i<12;i++) {
//			for(int j=0;j<12;j++) {
//				for(int k=0;k<12;k++) {
//					if(s[i].equalsIgnoreCase(s[j])||s[i].equalsIgnoreCase(s[k]) 
//		||s[j].equalsIgnoreCase(s[k])) {
//						if(!mapL.containsKey(s[i]+s[j]+s[k])) {
//							System.out.flush();System.out.println(s[i]+s[j]+s[k]+"   "+s1[i]+s1[j]+s1[k] );
//							mapL.put(s[i]+s[j]+s[k], "");
//						}
//						if(!mapL.containsKey(s[i]+s[k]+s[j])) {
//							System.out.flush();System.out.println(s[i]+s[k]+s[j]+"   "+s1[i]+s1[k]+s1[j] );
//							mapL.put(s[i]+s[k]+s[j], "");
//						}
//						if(!mapL.containsKey(s[j]+s[k]+s[i])) {
//							System.out.flush();System.out.println(s[j]+s[k]+s[i]+"   "+s1[j]+s1[k]+s1[i] );
//							mapL.put(s[j]+s[k]+s[i], "");
//						}
//						if(!mapL.containsKey(s[j]+s[i]+s[k])) {
//							System.out.flush();System.out.println(s[j]+s[i]+s[k]+"   "+s1[j]+s1[i]+s1[k] );
//							mapL.put(s[j]+s[i]+s[k], "");
//						}
//						if(!mapL.containsKey(s[k]+s[i]+s[j])) {
//							System.out.flush();System.out.println(s[k]+s[i]+s[j]+"   "+s1[k]+s1[i]+s1[j] );
//							mapL.put(s[k]+s[i]+s[j], "");
//						}
//						if(!mapL.containsKey(s[k]+s[j]+s[i])) {
//							System.out.flush();System.out.println(s[k]+s[j]+s[i]+"   "+s1[k]+s1[j]+s1[i] );
//							mapL.put(s[k]+s[j]+s[i], "");
//						}
//					}
//					
//				}
//			}
//		}
		System.out.flush();System.out.println("ͬԪ��");
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				for(int k=0;k<12;k++) {
					if(AOPM.contains(s[i]) && AOPM.contains(s[j])&& AOPM.contains(s[k])) {
						if(!mapL.containsKey(s[i]+s[j]+s[k])) {
						System.out.flush();System.out.println(s[i]+s[j]+s[k]+"   "+s1[i]+s1[j]+s1[k] );
						mapL.put(s[i]+s[j]+s[k], "");
					}
					if(!mapL.containsKey(s[i]+s[k]+s[j])) {
						System.out.flush();System.out.println(s[i]+s[k]+s[j]+"   "+s1[i]+s1[k]+s1[j] );
						mapL.put(s[i]+s[k]+s[j], "");
					}
					if(!mapL.containsKey(s[j]+s[k]+s[i])) {
						System.out.flush();System.out.println(s[j]+s[k]+s[i]+"   "+s1[j]+s1[k]+s1[i] );
						mapL.put(s[j]+s[k]+s[i], "");
					}
					if(!mapL.containsKey(s[j]+s[i]+s[k])) {
						System.out.flush();System.out.println(s[j]+s[i]+s[k]+"   "+s1[j]+s1[i]+s1[k] );
						mapL.put(s[j]+s[i]+s[k], "");
					}
					if(!mapL.containsKey(s[k]+s[i]+s[j])) {
						System.out.flush();System.out.println(s[k]+s[i]+s[j]+"   "+s1[k]+s1[i]+s1[j] );
						mapL.put(s[k]+s[i]+s[j], "");
					}
					if(!mapL.containsKey(s[k]+s[j]+s[i])) {
						System.out.flush();System.out.println(s[k]+s[j]+s[i]+"   "+s1[k]+s1[j]+s1[i] );
						mapL.put(s[k]+s[j]+s[i], "");
					}
					}
					if(VECS.contains(s[i]) && VECS.contains(s[j])&& VECS.contains(s[k])) {
						if(!mapL.containsKey(s[i]+s[j]+s[k])) {
						System.out.flush();System.out.println(s[i]+s[j]+s[k]+"   "+s1[i]+s1[j]+s1[k] );
						mapL.put(s[i]+s[j]+s[k], "");
					}
					if(!mapL.containsKey(s[i]+s[k]+s[j])) {
						System.out.flush();System.out.println(s[i]+s[k]+s[j]+"   "+s1[i]+s1[k]+s1[j] );
						mapL.put(s[i]+s[k]+s[j], "");
					}
					if(!mapL.containsKey(s[j]+s[k]+s[i])) {
						System.out.flush();System.out.println(s[j]+s[k]+s[i]+"   "+s1[j]+s1[k]+s1[i] );
						mapL.put(s[j]+s[k]+s[i], "");
					}
					if(!mapL.containsKey(s[j]+s[i]+s[k])) {
						System.out.flush();System.out.println(s[j]+s[i]+s[k]+"   "+s1[j]+s1[i]+s1[k] );
						mapL.put(s[j]+s[i]+s[k], "");
					}
					if(!mapL.containsKey(s[k]+s[i]+s[j])) {
						System.out.flush();System.out.println(s[k]+s[i]+s[j]+"   "+s1[k]+s1[i]+s1[j] );
						mapL.put(s[k]+s[i]+s[j], "");
					}
					if(!mapL.containsKey(s[k]+s[j]+s[i])) {
						System.out.flush();System.out.println(s[k]+s[j]+s[i]+"   "+s1[k]+s1[j]+s1[i] );
						mapL.put(s[k]+s[j]+s[i], "");
					}
					}
					if(IDUQ.contains(s[i]) && IDUQ.contains(s[j])&& IDUQ.contains(s[k])) {
						if(!mapL.containsKey(s[i]+s[j]+s[k])) {
						System.out.flush();System.out.println(s[i]+s[j]+s[k]+"   "+s1[i]+s1[j]+s1[k] );
						mapL.put(s[i]+s[j]+s[k], "");
					}
					if(!mapL.containsKey(s[i]+s[k]+s[j])) {
						System.out.flush();System.out.println(s[i]+s[k]+s[j]+"   "+s1[i]+s1[k]+s1[j] );
						mapL.put(s[i]+s[k]+s[j], "");
					}
					if(!mapL.containsKey(s[j]+s[k]+s[i])) {
						System.out.flush();System.out.println(s[j]+s[k]+s[i]+"   "+s1[j]+s1[k]+s1[i] );
						mapL.put(s[j]+s[k]+s[i], "");
					}
					if(!mapL.containsKey(s[j]+s[i]+s[k])) {
						System.out.flush();System.out.println(s[j]+s[i]+s[k]+"   "+s1[j]+s1[i]+s1[k] );
						mapL.put(s[j]+s[i]+s[k], "");
					}
					if(!mapL.containsKey(s[k]+s[i]+s[j])) {
						System.out.flush();System.out.println(s[k]+s[i]+s[j]+"   "+s1[k]+s1[i]+s1[j] );
						mapL.put(s[k]+s[i]+s[j], "");
					}
					if(!mapL.containsKey(s[k]+s[j]+s[i])) {
						System.out.flush();System.out.println(s[k]+s[j]+s[i]+"   "+s1[k]+s1[j]+s1[i] );
						mapL.put(s[k]+s[j]+s[i], "");
					}
					}
				}
			}
		}
	}
}

 