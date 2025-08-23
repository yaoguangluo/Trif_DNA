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
public class Quick_Luoyaoguang_5D{
	public int[] sort(int[] a) {
		quick2ds(a, 0, a.length-1, 0);
		return a;
	}

	private void quick2ds(int[] a, int lp, int rp, int d) {
		if(lp< rp){
			int c= rp - lp; if(!(c > 7|| d>80)){ int j;
			for(int i= 1 + lp; i <= lp + c; i++){
				j= i;while(j>=1+lp){
					if(a[j]<a[j-1]){
						int temp=a[j];a[j]=a[j-1];a[j-1]=temp;
					}
					j--;
				}
			}	
			return;
			}
			int pos= partition(a, lp, rp);
			quick2ds(a, lp, pos-1, d+1);
			quick2ds(a, pos+1, rp, d+1);
		}
	}
	////左右比对法开始
////思想: 快速排序4d思想, 罗瑶光小高峰过滤思想
////作者+ 著作权人： 罗瑶光, 浏阳,
	private int partition(int[] a, int lp, int rp) {
		int x= a[lp]>= a[rp]? a[rp]: a[lp];
		int lp1= lp;
		while(lp1< rp){//我总觉得这里可以进行一种积分算法优化, 我一直在思考, 别让那么快想到。
//			while(a[lp1]<= x&& lp1< rp) {
//				lp1++;
//			}
			while(!(a[lp1]>x|| lp1>= rp)) {
				lp1++;
			} //今天想到了一些优化,
			while(a[rp]>x){
				rp--;
			}
			if(lp1<rp){
				int temp=a[rp];a[rp]=a[lp1];a[lp1]=temp;
			}
		}
		a[lp]=a[rp];a[rp]=x;
		return rp;
	}
	
	public String[][] sort(String[][] a) {
		quick2dsString(a, 0, a.length-1);
		return a;
	}

	private void quick2dsString(String[][] a, int lp, int rp) {
		if(lp < rp){
			int c= rp - lp; if(c < 7){ int j;
			for(int i= 1 + lp; i <= lp + c; i++){
				j= i;while(j>=1+lp){
					if(Double.valueOf(a[j][1])<Double.valueOf(a[j-1][1])){
						String []temp=a[j];
						a[j]=a[j-1];
						a[j-1]=temp;
					}
					j--;
				}
			}	
			return;
			}
			int pos= partitionString(a, lp, rp);
			quick2dsString(a, lp, pos- 1);
			quick2dsString(a, pos+ 1, rp);
		}
	}

	private int partitionString(String[][] a, int lp, int rp) {
		String[] x= a[lp]; 
		int lp1= lp;
		if(Double.valueOf(x[1])>= Double.valueOf(a[rp][1])){
			x= a[rp];
		}
		while(lp1< rp){
			while((Double.valueOf(a[lp1][1])<= Double.valueOf(x[1]))&& (lp1< rp)){
				lp1 ++;
			} 
			while(Double.valueOf(a[rp][1])> Double.valueOf(x[1])){
				rp --;
			}
			if(lp1<rp){
				String[] temp= a[rp].clone();
				a[rp]= a[lp1].clone();
				a[lp1]= temp.clone();
			}
		}
		a[lp]=a[rp].clone();a[rp]=x;
		return rp;
	}
}
