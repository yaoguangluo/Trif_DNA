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
public class Heap_2D_Sort {
	int[] sort(int[] data){
		int startIndex= getParentIndex(data.length - 1);
		for (int i= startIndex; i >= 0; i--) {
			maxHeapify(data, data.length, i);
		}
		heapSort(data);
		return data;
	}
	private void maxHeapify(int[] data, int heapSize, int index){
		int left= getChildLeftIndex(index);
		int right= getChildRightIndex(index);

		int largest= index;
		if (left < heapSize && data[index] < data[left]) {
			largest= left;
		}
		if (right < heapSize && data[largest] < data[right]) {
			largest= right;
		}
		if (largest != index) {
			int temp= data[index];
			data[index]= data[largest];
			data[largest]= temp;
			maxHeapify(data, heapSize, largest);
		}
	}
	private void heapSort(int[] data){
		for (int i= data.length - 1; i > 0; i--) {
			int temp= data[0];
			data[0]= data[i];
			data[i]= temp;
			maxHeapify(data, i, 0);
		}
	}
	private int getParentIndex(int current){
		return (current - 1) >> 1;
	}

	private int getChildLeftIndex(int current){
		return (current << 1) + 1;
	}

	private int getChildRightIndex(int current){
		return (current << 1) + 2;
	}
}
