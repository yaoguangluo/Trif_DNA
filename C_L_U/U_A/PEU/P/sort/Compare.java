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
public class Compare{
	public int getMiddle(int[] list, int low, int high) {
		//int tmp= list[low]<list[low]?list[low]:list[low];    //数组的第一个作为中轴
		int tmp= list[low];    //数组的第一个作为中轴
		while (low < high) {
			while (!(low >= high || list[high] < tmp)) {
			//while (low < high && list[high] >= tmp) {
				high--;
			}
			list[low]= list[high];   //比中轴小的记录移到低端
			while (!(low >= high || list[low] > tmp)) {
				//	while (low < high && list[low] <= tmp) {
				low++;
			}
			list[high]= list[low];   //比中轴大的记录移到高端
		}
		list[low]= tmp;              //中轴记录到尾
		return low;                   //返回中轴的位置
	}

	public void _quickSort(int[] a, int lp, int rp) {
		if(lp < rp){
			int c= rp - lp; if(c < 7){ int j;
			for(int i= 1 + lp; i <= lp + c; i++){
				j= i;while(j>=1+lp){
					if(a[j]<a[j-1]){
						int temp=a[j];a[j]=a[j-1];a[j-1]=temp;
					}
					j--;
				}
			}	
			return;
			}
			int pos= getMiddle(a, lp, rp);
			_quickSort(a, lp, pos-1);
			_quickSort(a, pos+1, rp);
		}
	}

	public int[] quick(int[] str) {
		if (str.length > 0) {    //查看数组是否为空
			_quickSort(str, 0, str.length - 1);
		}
		return str;
	}	
}
