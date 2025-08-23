package E_A.org.tinos.deta.hooks.main;

import java.util.Iterator;
/*
int检查:1656230807051:java.lang.ArrayIndexOutOfBoundsException: 5
int检查:1656230807051:org.tinos.deta.hooks.main.Test.main(Test.java:33)
0.232188915763744:1656230807052:java.lang.Throwable: >_<!
0.232188915763744:1656230807052:org.tinos.deta.hooks.main.Test.main(Test.java:40)
0.23698309286561858:1656230807052:>_<!!!
错误次数:10
错误标记:int检查
异常发生的时间:
1656230807051
1656230807051
1656230807051
1656230807051
1656230807051
1656230807051
1656230807051
1656230807051
1656230807051
1656230807051
java.lang.ArrayIndexOutOfBoundsException: 5
org.tinos.deta.hooks.main.Test.main(Test.java:33)
*/
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Test{
	//例子
	public static void main(String[] argv) {
		Hook_E hook= new Hook_E();
		for(int i=0; i< 10; i++) {
			try {
				int[] a= new int[3];
				a[5]= 10;
			}catch(Exception e) {
				//hook.hookException(e);
				//测试下
				hook.hookFrequentException("int检查", System.currentTimeMillis(), e);
			}
		}
		Throwable throwable= new Throwable(">_<!");
		hook.hookThrowable(throwable);
		//
		hook.hookThrowable(">_<!!!");
		//list输出
		Iterator<String> iterator= hook.exceptionList.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			//20230106-//20230106-System.out.println(iterator.next());
		}
		//map输出
		Iterator<String> mapKeyIterator= hook.exceptionMap.keySet().iterator();
		while(mapKeyIterator.hasNext()) {
			ExceptInformation exceptInformation= hook.exceptionMap.get(mapKeyIterator.next());
			//20230106-System.out.println("错误次数:"+ exceptInformation.exceptionCount);
			//20230106-System.out.println("错误标记:"+ exceptInformation.exceptionSession);
			//20230106-System.out.println("异常发生的时间:");
			Iterator<Long> iteratorLong= exceptInformation.exceptionTimes.iterator();
			while(iteratorLong.hasNext()) {
				//20230106-System.out.println(iteratorLong.next());
			}
			hook.showException(exceptInformation.getException());
		}
	}
}
