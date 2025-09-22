package U_A.PEU.P.sort;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 rohini 印度基督大学 ，算法导论
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Heap_1D_Sort{
	int a[], s;
	public int[] sort(int [] array) {	
		a=new int[array.length+1];
		s=array.length;
		for(int i=1;i<a.length;i++)
			a[i]=array[i-1];
		find(1);
		while(s>1){
			int t=a[1];a[1]=a[s];a[s]=t;
			s-=1;
			find(1);	
		}
		for(int i=1;i<a.length;i++)
			array[i-1]=a[i];
		return array;
	}
	private void find(int i) {
		int il=2*i, ir=2*i+1, t;
		if(il<=s&&ir<=s)
		{find(il);find(ir);}
		else if(il<=s&&ir>s)
		{find(il);}
		else if(ir<=s&&il>s)
		{find(ir);}
		if(il<=s)
			if((a[il]>a[i]))
			{t=a[i];a[i]=a[il];a[il]=t;find(il);}
		if(ir<=s)
			if((a[ir]>a[i]))
			{t=a[i];a[i]=a[ir];a[ir]=t;find(ir);}	
	}
}
