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
public class BinarySort{
	public int[] sort(int [] a) {
		int ps= 0;
		int pb= 0;
		int fs=0;
		int fb=0;
		int e=a.length;
		for(int i=0;i<e;i++, e--){
			int s=a[i];
			int b=a[i];
			for(int j=i;j<e;j++){
				if(s>a[j]){
					s=a[j];
					ps=j;
					fs=1;
				}
				if(b<a[j]){
					b=a[j];
					pb=j;
					fb=1;
				}
			}
			if(fs==1){
				fs=0;
				int temp=a[i];
				a[i]=s;
				a[ps]=temp;
			}
			if(fb==1){
				int temp=a[e-1];
				a[e-1]=b;
				a[pb]=temp;
			}
		}
		return a;
	}
}
