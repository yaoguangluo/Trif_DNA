package U_A.PEU.P.sort;
import java.util.ArrayList;

import java.util.List;
//import parserProcessor.timeCheck;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 rohini 印度基督大学 ，数据结构，算法导论
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class LYGSort{
	public List<Double> array= new ArrayList<Double>();
	public void sort(double [] a) {
		array.add(a[0]);
		if(a[1] > a[0]) {
			array.add(1, a[1]);
		}else {
			array.add(0, a[1]);
		}
		if(a[2] < a[0]) {
			array.add(0, a[2]);
		}else if(a[2] > a[1]) {
			array.add(2, a[2]);
		}else {
			array.add(1, a[2]);
		}
		for(int i= 3; i < a.length; i++) {
			bsa(a[i], 0, array.size() - 1);
		}
	}
	
	private void bsa(double a, int l, int r) {
		int m= (l + r) >> 1;
		if(m != l) {
			if(a <= array.get(m)){
				bsa(a, l, m);
			}else {
				bsa(a, m, r);
			}
		} else if(m== l){
			if(a <= array.get(m)){
				array.add(l, a);
			}else if(a > array.get(m) && a <= array.get(r) ){
				array.add(l+1, a);
			}else {
				array.add(l+2, a);
			}		
		} 
	}
	
	public static void main(String agrs[]) {
		int c=99999;
		double [] a= new double[c];
		java.util.Random r=new java.util.Random(); 
		for(int i=0;i<c;i++) {
			a[i]=r.nextDouble();
		}
		LYGSort lyg= new LYGSort();
		//timeCheck t= new timeCheck();
		//	t.begin();
		lyg.sort(a);
		//	t.end();
	}
}
