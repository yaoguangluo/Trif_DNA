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
public class Quick_2D_Sort{
	public int[] sort(int [] a) {
		int v=(int) Math.log(a.length);
		for(int i=0;i<v*3;i++)
			sort(a, 0, a.length-1);
		return a;	
	}

	private void sort(int[] a, int l, int r) {
		int m=(l+r)/2;
		quick(a, l, r);
		if(m>l)
		{
			sort(a, l, m);
			sort(a, m, r);
		}
	}

	private void quick(int[] a, int l, int r) {
		while(l<r){	
			if(a[l]>a[r]){
				int temp=a[l];
				a[l]=a[r];
				a[r]=temp;  
			}
			l++;
			r--;
		}	
	}
}
