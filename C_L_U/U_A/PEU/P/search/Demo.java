package U_A.PEU.P.search;

import U_A.PEU.P.sort.*;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Demo{
	public static void main(String args[]) {
        //init array
		boolean find=false;
		//timeCheck check=new timeCheck();
		//check.begin();
		int []array=arrayInit(); 
		//array=new Quick_2D_Sort().sort(array);
		//leaf root=new BTreeSort().root(array);
		Leaf root=new TTreeSort().root(array);
		//leaf root=new OTreeSort().root(array);

		//check.begin();
		
		      //find=new RandomSearch().search(array, 2);
		     // find=new BinarySearch().search(array, 2);
			 // find=new LinerSearch().search(array, 2);
		//	find=new PreorderTreeSearch().search(root, 2);
			//find=new DepthTreeSearch().search(root, 20000);
			find=new BreadthTreeSearch().search(root, 20000);
	//	check.end();
	    print(find); 
	}
	
	private static void print(boolean find) {
    if( find== true) {//20230106-System.out.println("find");
 
    }
    else {//20230106-System.out.println("not find");
    }
	}
	private static int[] arrayInit() {	
		int[] array=new int[999999];
		java.util.Random r=new java.util.Random(); 
		for(int i=999999, j=0;i>0;i--, j++){
			array[j]=r.nextInt(999999);
			////20230106-System.out.println(array[j]);
		}
		
		return array;
	}
}
