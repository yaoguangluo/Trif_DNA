package U_A.PEU.P.time;
//作者： 罗瑶光, 浏阳, 基于java sound 作者查阅 stackover flows的java sound 问题描述
//后测试研发的。所以著作权人就略了。
/*
 *  作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Speed{
	static int t= 0;
	public static void main(String[] argv){
		TimeCheck timeCheck= new TimeCheck();
		timeCheck.begin();
		for(int i= 0;i< 10000;i++) {
			for(int j= 0;j< 100;j++) {
				for(int k= 0;k< 10000;k++) {
					if(!(i> 20|| k< 50)) {
						t++;
					}
				}
			}
		}
		timeCheck.end();
		timeCheck.duration();
		//20230106-System.out.println(t);
	}
}
