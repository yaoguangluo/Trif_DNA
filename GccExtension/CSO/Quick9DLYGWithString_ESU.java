package CSO;

//作者 罗瑶光
//改成 map形式。
//思考了下如果有1000万字符串和数字排序, 如果字符串平均都是几十个字, 那么就有5个G的字符串排序,
//系统内存条 被欺负的杠杠的, 所以还是用map统计, 只int排序。
//我把string 的相关操作 注视掉了, 相当于TopSort4D思想 排int。 不多解释了。 备份下
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Quick9DLYGWithString_ESU {
	public int[] sort(int[]a, String[]sa) {
		processDouble(a, 0, a.length - 1, sa, 0);
		return a;
	}

	//增加了deep
	private void processDouble(int[] array, int leftPoint, int rightPoint, String[] sa
			, int deep) {
		int c= rightPoint- leftPoint+ 1;
		if(!(c< 7|| deep> 70)) {
			int pos= partition(array, leftPoint, rightPoint, sa);
			if(leftPoint< pos- 1) {
				processDouble(array, leftPoint, pos- 1, sa, deep+ 1);
			}
			if(pos+ 1< rightPoint) {
				processDouble(array, pos+ 1, rightPoint, sa, deep+ 1);
			}
			return;
		}
		int i= leftPoint;
		for(int j= i+ 1; j< leftPoint+ c; j= i++){
			while(j> leftPoint){
				if(array[j]< array[--j]){
					int temp= array[j+ 1];
					array[j+ 1]= array[j];
					array[j]= temp;
					String stemp= new String(sa[j+ 1].toString());
					sa[j+ 1]= sa[j].toString();
					sa[j]= stemp.toString();
				}
			}
		}	
	}

	//换了最新第四代TopSort 思想, 罗瑶光
	//莫急, 稍后我会同样用map 把这里的同int数 进行过滤掉。 罗瑶光20210722
	//最新的极速排序16代 在养疗经的海量排序中 集成优化。因为是从小到大排序, 所以这里也要符号修正。
	private int partition(int[] array, int leftPoint, int rightPoint, String[] sa) {
		int x= array[leftPoint]<= array[rightPoint]? array[leftPoint]: array[rightPoint];
		String xString= array[leftPoint]<= array[rightPoint]
				? sa[leftPoint].toString(): sa[rightPoint].toString();
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){
			while(!(array[leftPointReflection]> x|| leftPointReflection++ >= rightPoint)) {}
			while(array[rightPoint--]> x) {}
			if(leftPointReflection< ++rightPoint){
				int temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
				String stemp= new String(sa[rightPoint].toString());
				sa[rightPoint]= sa[leftPointReflection].toString();
				sa[leftPointReflection]= stemp.toString();
			}
		}
		array[leftPoint]= array[rightPoint];
		sa[leftPoint]= sa[rightPoint].toString();
		array[rightPoint]= x;
		sa[rightPoint]= xString.toString();
		return rightPoint;
	}
}
