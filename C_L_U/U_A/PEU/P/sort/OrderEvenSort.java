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
public class OrderEvenSort{
	public int[] sort(int [] array) {
		boolean sorted= false;
		while(!sorted){
			sorted=true;
			for(int i= 1; i < array.length-1; i += 2) {
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
					sorted= false;
				}
			}

			for(int i= 0; i < array.length-1; i += 2){
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
					sorted= false;
				}
			}
		}



		return array;
	}

	private void swap(int[] array, int i, int j) {
		
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
