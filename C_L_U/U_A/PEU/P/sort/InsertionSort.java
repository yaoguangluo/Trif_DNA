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
public class InsertionSort{
	public int[] sort(int [] array) {
		int j;
		for(int i=1;i<array.length;i++){
			j=i;
			while(j>=1){
				if(array[j]<array[j-1]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				j-=1;
			}	
		}
		return array;
	}

	public int[] sort(int [] array, int n) {
		int j;
		for(int i=1;i<n;i++){
			j=i;
			while(j>=1){
				if(array[j]<array[j-1]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				j-=1;
			}	
		}
		return array;
	}
}
