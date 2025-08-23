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
public class ShellSort{
	public int[] sort(int [] a) {
		for(int i=(a.length-1)/2;i>0;i/=2){
			for(int ii=i;ii<a.length;ii++){
				int iii=ii-i;
				while(iii>=0){
					if(a[iii+i]<a[iii]){
						int temp=a[iii+i];
						a[iii+i]=a[iii];
						a[iii]=temp;
					}
					iii=iii-i;
				}
			}
		}
		return a;
	}
}
