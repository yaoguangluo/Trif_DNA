package C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SQI;
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public interface EmotionMap{
	void IV_MotivationMap(App NE) ;
	void IV_PositiveMap(App NE) ;
	void IV_NegativeMap(App NE) ;
	void IV_TrendingMap(App NE) ;
	void IV_PredictionMap(App NE) ;
	void IV_DistinctionMap(App NE) ;
	public IMV_SQI getPositiveMap();
	public void I_PositiveMap(IMV_SQI positiveMap);
	public IMV_SQI getNegativeMap();
	public void I_NegativeMap(IMV_SQI negativeMap);
	public IMV_SQI getMotivationMap() ;
	public void I_MotivationMap(IMV_SQI motivationMap);
	public IMV_SQI getTrendingMap() ;
	public void I_TrendingMap(IMV_SQI trendingMap);
	public IMV_SQI getPredictionMap() ;
	public void I_PredictionMap(IMV_SQI predictionMap);
	public IMV_SQI getDistinctionMap() ;
	public void I_DistinctionMap(IMV_SQI distinctionMap);
}
