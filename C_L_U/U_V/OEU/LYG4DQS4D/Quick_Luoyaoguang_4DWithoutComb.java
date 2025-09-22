package U_V.OEU.LYG4DQS4D;

//第三代罗瑶光小高峰平均高峰过滤快排思想设计中。小高峰高峰过滤快速排序
//同频函数减少
//同频算子减少
//同频变量减少
@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Quick_Luoyaoguang_4DWithoutComb{
	public int[] sort(int[] a) {
		quick2ds(a, 0, a.length-1);
		return a;
	}

	private void quick2ds(int[] a, int lp, int rp) {
		if(lp < rp){
			int pos= partition(a, lp, rp);
			quick2ds(a, lp, pos-1);
			quick2ds(a, pos+1, rp);
		}
	}

	private int partition(int[] a, int lp, int rp) {
		int x= a[lp]< a[rp]? a[lp]: a[rp];
		int lp1=lp;
		while(lp1<rp){
			while(a[lp1]<=x &&lp1<rp ) {
				lp1++;
			}
			while(a[rp]>x){
				rp--;
			}
			if(lp1<rp){
				int temp=a[rp];
				a[rp]=a[lp1];a[lp1]=temp;
			}
		}
		a[lp]=a[rp];a[rp]=x;
		return rp;
	}
}
