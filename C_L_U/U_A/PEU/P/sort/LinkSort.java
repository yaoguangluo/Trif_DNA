package U_A.PEU.P.sort;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
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
class node {
	public node next;
	public int value;
}
public class LinkSort{
	public node heap; 
	public node first;
	public int[] sort(int [] a) {
		for(int i=0;i<a.length;i++){
			lyg(a[i]);
		}
		for(int i=0;i<a.length;i++){
			a[i]=first.value;
			if(first.next!=null)
				first=first.next;
		}
		return a;
	}

	private void lyg(int i) {
		
		if(heap==null){
			heap=new node();
			heap.value=i;
			first=heap;
			return;
		}
		heap=first;
		if(i<=heap.value){
			node temp=new node();
			temp.value=i;
			temp.next=heap;
			first=temp;
			return;
		}
		while(heap.next!=null){
			if(i>=heap.value&&i<=heap.next.value){
				node temp=new node();
				temp.value=i;
				temp.next=heap.next;
				heap.next=temp;
				return;
			}
			heap=heap.next;
		}
		node temp=new node();
		heap.next=temp;
		temp.value=i;
		return;
	}
}
