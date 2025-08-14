package U_A.PEU.P.sort;
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
public class MergeSort{
	public int[] sort(int [] array) {
		int mid;
		int l=0;
		int h=array.length-1;
		if(l<h)
		{mid=(l+h)/2;
		sort(array, l, mid);
		sort(array, mid+1, h);
		merge(array, l, mid, h);}
		return array;}

	private void sort(int[] array, int l, int h) {
		int mid;
		if(l<h)
		{mid=(l+h)/2;
		sort(array, l, mid);
		sort(array, mid+1, h);
		merge(array, l, mid, h);}}
	private void merge(int[] a, int l, int mid, int h) {
		
		int i, j, k;
		int c[]=new int[a.length];
		i=l;
		k=l;
		j=mid+1;
		while((i<=mid)&&(j<=h))
		{if(a[i]<a[j]){c[k]=a[i];k++;i++;}
		else{c[k]=a[j];k++;j++;}}
		while(i<=mid)
		{c[k]=a[i];k++;i++;}
		while(j<=h)
		{c[k]=a[j];k++;j++;}
		for(i=l;i<k;i++)
		{a[i]=c[i];}}}
