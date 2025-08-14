package U_V.OEU.LYG4DQS4D;

import U_A.PEU.P.time.*;

//第二代罗瑶光小高峰平均高峰过滤快排思想设计中。高峰均值优化快速排序
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Quick_Luoyaoguang_2D{
	static int n=150000;
	public int[] sort(int [] a) {	
		int lp= 0;
		int rp= a.length-1;
		quick(a, lp, rp);
		return a;
	}

	private void quick(int[] a, int lp, int rp) {
		if(lp > rp) {
			return;
		}
		int reglp= lp;
		int regrp= rp;
		boolean peak= true;
		while(reglp < regrp) {
			boolean oldPeck= peak;
			if(a[reglp] > a[regrp]) {
				int temp= a[regrp];
				a[regrp]= a[reglp];
				a[reglp]= temp;
				peak= !peak;
			}
			if(oldPeck==true && oldPeck== peak) {
				reglp++;
			}
			if(oldPeck==false && oldPeck== peak) {
				regrp--;
			}
		}
		if(lp < reglp-1) {
			quick(a, lp, reglp-1) ;
		}
		if(rp > reglp) {
			quick(a, reglp, rp) ;
		}
	}

	public static void main(String []argv) {
		int[] a= new int[n];	
		for(int i= 0; i < n; i++) {
			a[i]= (int) (Math.random()*100000);
			//20230106-System.out.print(a[i]);
		}
		//20230106-System.out.print("");
		TimeCheck t=new TimeCheck();
		t.begin();
		new Quick_Luoyaoguang_2D().sort(a);
	//	new Quick_6D_luoyaoguang_Sort().sort(a);
		t.end();
		t.duration();
	}
}
