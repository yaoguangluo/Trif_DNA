package U_V.OEU.LYG4DQS4D;

import A_V.ASQ.PSU.test.TimeCheck;

//第二代罗瑶光小高峰平均高峰过滤快排思想设计中。耦合边缘路径快速排序
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Quick_Luoyaoguang_1D{
	public int[] sort(int [] a) {	
		int lp= 0;
		int rp= a.length-1;
		quick(a, lp, rp);
		return a;
	}

	private void quick(int[] a, int lp, int rp) {
		if(lp >= rp) {
			return;
		}
		int reglp=lp;
		int regrp=rp;
		while(reglp < rp) {
			PeakFilter(a, reglp++, regrp);
		}
		while(regrp > reglp) {
			PeakFilter(a, reglp, regrp--);
		}
		int pos= reglp;
		quick(a, lp, pos-1);
		quick(a, pos, rp);
	}

	private void PeakFilter(int[] a, int lp, int rp){
		if(a[lp]<=a[rp]) {
			return;
		}
		int temp= a[rp];
		a[rp]= a[lp];
		a[lp]= temp;
	}

	public static void main(String []argv) {
		int[] a= new  int[10000];
		for(int i= 0; i < 10000; i++) {
			a[i]= (int) (Math.random()*10);
		}
		TimeCheck t=new TimeCheck();
		t.begin();
		new Quick_Luoyaoguang_1D().sort(a);
		//new Quick_6D_luoyaoguang_Sort().sort(a);
		t.end();
		t.duration();
//		for(int i:a) {
//			//20230106-System.out.println(i);
//		}
	}
}
