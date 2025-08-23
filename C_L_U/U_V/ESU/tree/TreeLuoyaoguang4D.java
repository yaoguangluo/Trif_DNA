package U_V.ESU.tree;
//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class TreeLuoyaoguang4D{
	@SuppressWarnings("unused")
	private static void sort(Node head, String[] testValue, int scale) {
		for(int i= 0; i< testValue.length; i++) {
			I_Node(head, testValue[i], scale);
		}
	}

	private static void I_Node(Node head, String testValue, int scale) {
		Node temp= head;
		if(null== temp.value) {
			temp.value= testValue;
		}else {
			for(int i= 0; i< scale- 1; i++) {
				if(temp.value.toLowerCase().charAt(i)
						< testValue.toLowerCase().charAt(i)) {
					boolean find= true;
					for(int p= 0; p< scale; p++) {
						if(temp.value.charAt(p)!= testValue.charAt(p)) {
							find= false;
						}
					}
					if(find) {
						if(temp.left!= null) {
							I_Node(head.left, testValue, scale);
						}else {
							temp.left= new Node();
							temp.left.value= testValue;
						}
					}
				}else {
					boolean find= true;
					for(int p= 0; p< scale; p++) {
						if(temp.value.charAt(p)!= testValue.charAt(p)) {
							find= false;
						}
					}
					if(find) {
						if(temp.left!= null) {
							I_Node(head.left, testValue, scale);
						}else {
							temp.left= new Node();
							temp.left.value= testValue;
						}
					}
				}
			}
		}
	}	
}

class Node{
	String value;
	public Node left;
	public Node right;
}
