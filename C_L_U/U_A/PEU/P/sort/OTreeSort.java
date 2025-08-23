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
public class OTreeSort{
	public Leaf root;
	public Leaf heap;
	int c;
	int a1[];
	public int[] sort(int [] a) {
		//make tree
		c=0;
		a1=new int[a.length];
		if(root== null){
			root=new Leaf();
			root.value[0]=a[0];
			root.hasO1=1;
		}
		for(int i=1;i<a.length;i++){
			heap=root;
			I_leaf(a[i]);
		}
		Q_(root);
		return a1;
	}

	public Leaf root(int[] a) {
		c=0;
		a1=new int[a.length];
		if(root== null){
			root=new Leaf();
			root.value[0]=a[0];
			root.hasO1=1;
		}
		for(int i=1;i<a.length;i++){
			heap=root;
			I_leaf(a[i]);
		}
		
		return root;
	}

	private void Q_(Leaf temp) {
		
		if(temp!=null){
			Q_(temp.O1);	
			if(temp.hasO1==1){
				a1[c]=temp.value[0];
				c+=1;
			}
			Q_(temp.O2);
			if(temp.hasO2==1){
				a1[c]=temp.value[1];
				c+=1;
			}
			Q_(temp.O3);
			if(temp.hasO3==1){
				a1[c]=temp.value[2];
				c+=1;
			}
			Q_(temp.O4);
			if(temp.hasO4==1){
				a1[c]=temp.value[3];
				c+=1;
			}
			Q_(temp.O5);
			if(temp.hasO5==1){
				a1[c]=temp.value[4];
				c+=1;
			}
			Q_(temp.O6);
			if(temp.hasO6==1){
				a1[c]=temp.value[5];
				c+=1;
			}
			Q_(temp.O7);
			if(temp.hasO7==1){
				a1[c]=temp.value[6];
				c+=1;
			}
			Q_(temp.O8);
		}	
	}
	
	private void I_leaf(int i){
		int count=heap.hasO1+heap.hasO2+heap.hasO3+heap.hasO4+heap.hasO5+heap.hasO6+heap.hasO7;
		if(count<7){
			if(count==1){
				heap.hasO2=1;
			}
			if(count==2){
				heap.hasO3=1;
			}
			if(count==3){
				heap.hasO4=1;
			}
			if(count==4){
				heap.hasO5=1;
			}
			if(count==5){
				heap.hasO6=1;
			}
			if(count==6){
				heap.hasO7=1;
			}
			heap.value[count]=i;
			heap.value=new InsertionSort().sort(heap.value, count+1);
			return;		
		}else{
			if(i<=heap.value[0]){
				if(heap.O1==null){
					heap.O1=new Leaf();
					heap.O1.value[0]=i;
					heap.O1.hasO1=1;
					return;
				}else{
					heap=heap.O1;
					I_leaf(i);
				}
			}
			else if(i>heap.value[0] && i<=heap.value[1]){
				if(heap.O2==null){
					heap.O2=new Leaf();
					heap.O2.value[0]=i;
					heap.O2.hasO1=1;
					return;
				}else{
					heap=heap.O2;
					I_leaf(i);
				}
			}	 
			else if(i>heap.value[1] && i<=heap.value[2]){
				if(heap.O3==null){
					heap.O3=new Leaf();
					heap.O3.value[0]=i;
					heap.O3.hasO1=1;
					return;
				}else{
					heap=heap.O3;
					I_leaf(i);
				}
			}	
			else if(i>heap.value[2] && i<=heap.value[3]){
				if(heap.O4==null){
					heap.O4=new Leaf();
					heap.O4.value[0]=i;
					heap.O4.hasO1=1;
					return;
				}else{
					heap=heap.O4;
					I_leaf(i);
				}
			}
			else if(i>heap.value[3] && i<=heap.value[4]){
				if(heap.O5==null){
					heap.O5=new Leaf();
					heap.O5.value[0]=i;
					heap.O5.hasO1=1;
					return;
				}else{
					heap=heap.O5;
					I_leaf(i);
				}
			}
			else if(i>heap.value[4] && i<=heap.value[5]){
				if(heap.O6==null){
					heap.O6=new Leaf();
					heap.O6.value[0]=i;
					heap.O6.hasO1=1;
					return;
				}else{
					heap=heap.O6;
					I_leaf(i);
				}

			}
			else if(i>heap.value[5] && i<=heap.value[6]){
				if(heap.O7==null){
					heap.O7=new Leaf();
					heap.O7.value[0]=i;
					heap.O7.hasO1=1;
					return;
				}else{
					heap=heap.O7;
					I_leaf(i);
				}
			}
			else{
				if(heap.O8==null){
					heap.O8=new Leaf();
					heap.O8.value[0]=i;
					heap.O8.hasO1=1;
					return;
				}else{
					heap=heap.O8;
					I_leaf(i);
				}	
			}
		}
	}
}
