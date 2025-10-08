package U_A.PEU.P.time;
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class TimeCheck{
	public long before;
	public long now;
	public void begin(){
		////20230106-S_logger.Log.logger.info("" + "start: " + (new Date()));
		before= System.currentTimeMillis();
	}
	public void end(){
		now= System.currentTimeMillis();
	}
	@SuppressWarnings("unused")
	public void duration(){
		long du=now-before;
		//20230106-S_logger.Log.logger.info("" + "耗时: " + du + " 毫秒");
	}
}
