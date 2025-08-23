//package U_V.OEU.LYG4DQS4D;
////左右比对法开始
////思想: 快速排序4d思想, 罗瑶光小高峰过滤思想
////作者+ 著作权人： 罗瑶光, 浏阳,
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class Quick_5D_Sort{
//	public int[] sort(int [] a) {
//		quick2d(a, 0, a.length-1);
//		return a;
//	}
//
//	private void quick2d(int[] a, int lp, int rp) {
//
//		int pos[]=new int[1];
//		if(lp<rp)
//		{partition(a, lp, rp, pos);
//		quick2d(a, lp, pos[0]-1);
//		quick2d(a, pos[0]+1, rp);}
//	}
//
//	@SuppressWarnings("unused")
//	private void partition(int[] a, int lp, int rp, int[]pos) {
//
//		int x, lp1, rp1, temp;x=a[lp];rp1=rp;lp1=lp;int y=a[rp];
//		if(x<y){//左右比对法开始
//			while(lp1<rp1){
//				while((a[lp1]<=x)&&(lp1<rp1)) lp1++;
//				while(a[rp1]>x)rp1--;
//				if(lp1<rp1){
//					temp=a[rp1];
//					a[rp1]=a[lp1];
//					a[lp1]=temp;
//				}
//			}
//			a[lp]=a[rp1];
//			a[rp1]=x;
//		}else{//左右比对法开始
//			while(lp1<rp1){
//				while((a[lp1]<=y)&&(lp1<rp1)) lp1++;
//				while(a[rp1]>y)rp1--;
//				if(lp1<rp1){
//					temp=a[rp1];
//					a[rp1]=a[lp1];
//					a[lp1]=temp;
//				}
//			}
//			a[lp]=a[rp1];
//			a[rp1]=y;
//		}
//		pos[0]=rp1;
//	}
//}
