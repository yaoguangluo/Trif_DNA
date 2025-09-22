package U_A.PEU.P.sort;

/*
 * 作者 罗瑶光, 浏阳
 * 授课 rohini 印度基督大学 ，数据结构，算法导论
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Quick_3D_Sort{
	public int[] sort(int [] a) {
		int pos[]=new int[1];
		int lp=0;
		int rp=a.length-1;
		if(lp<rp)
		{partition(a, lp, rp, pos);
		quick2d(a, lp, pos[0]-1);
		quick2d(a, pos[0]+1, rp);}
		return a;
	}
	
	public int[] sort(int [] a, int n) {
		int pos[]=new int[1];
		int lp=0;
		int rp=n-1;
		if(lp<rp)
		{partition(a, lp, rp, pos);
		quick2d(a, lp, pos[0]-1);
		quick2d(a, pos[0]+1, rp);}
		return a;
	}
	
	private void quick2d(int[] a, int lp, int rp) {
		
		int pos[]=new int[1];
		if(lp<rp)
		{partition(a, lp, rp, pos);
		quick2d(a, lp, pos[0]-1);
		quick2d(a, pos[0]+1, rp);}
	}
	
	private void partition(int[] a, int lp, int rp, int[]pos) {
		
		int x, lp1, rp1, temp;
		x=a[lp];rp1=rp;lp1=lp;
		while(lp1<rp1)
		{while((a[lp1]<=x)&&(lp1<rp)) lp1++;
		while(a[rp1]>x)rp1--;
		if(lp1<rp1)
		{temp=a[rp1];a[rp1]=a[lp1];a[lp1]=temp;}}
		a[lp]=a[rp1];
		a[rp1]=x;
		pos[0]=rp1;
	}
}
