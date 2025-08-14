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
public class BTreeSort
{
	public Leaf root;
	public Leaf heap;
	int c;
	int a1[];
	public int[] sort(int [] a) {
		//make tree
		c=0;
		a1=new int[a.length];
		if(root==null){
			root=new Leaf();
			root.value[0]=a[0];
			root.hasO1=1;
		}
		for(int i=1;i<a.length;i++){
			heap=root;
			I_leaf(a[i]);
		}
		heap=root;
		Q_(heap);
		return a1;
	}
	private void Q_(Leaf temp) {
		
		if(temp!=null){
			Q_(temp.O1);
			a1[c]=temp.value[0];
			c+=1;
			Q_(temp.O2);
		}	
	}
	private void I_leaf(int i) {
		if(i<=heap.value[0]){
			if(heap.O1==null){
				heap.O1=new Leaf();
				heap=heap.O1;
				heap.value[0]=i;
				root.hasO1=1;
				return;
			}
			else{
				heap=heap.O1;
				I_leaf(i);
			}
		}
		else{
			if(heap.O2==null){
				heap.O2=new Leaf();
				heap=heap.O2;
				heap.value[0]=i;
				root.hasO1=1;
				return;
			}else{
				heap=heap.O2;
				I_leaf(i);
			}	
		}	 
	}
	public Leaf root(int[] a) {
		if(root==null){
			root=new Leaf();
			root.value[0]=a[0];
			root.hasO1=1;
		}for(int i=1;i<a.length;i++){
			heap=root;
			I_leaf(a[i]);
		}
		
		return root;
	}
}
