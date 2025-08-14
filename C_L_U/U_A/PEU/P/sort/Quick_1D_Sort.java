package U_A.PEU.P.sort;
/*
 *  作者 罗瑶光, 浏阳
 * 授课 rohini 印度基督大学 ，数据结构，算法导论
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Quick_1D_Sort{
	public int[] sort(int [] a) {	
		int lp=0;
		int rp=a.length-1;
		while(lp<rp)
			quick(a, lp++, rp);
		return a;
	}

	private void quick(int[] a, int lp, int rp) {
		// TODO Auto-generated method st
		while(lp<rp){
			if(a[lp]>a[rp]){
				int temp=a[lp];
				a[lp]=a[rp];
				a[rp]=temp;
			}
			rp-=1;
		}
	}
}
