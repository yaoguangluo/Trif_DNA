package C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public interface EmotionMap{
	void IV_MotivationMap(App NE) ;
	void IV_PositiveMap(App NE) ;
	void IV_NegativeMap(App NE) ;
	void IV_TrendingMap(App NE) ;
	void IV_PredictionMap(App NE) ;
	void IV_DistinctionMap(App NE) ;
	public IMV_SIQ getPositiveMap();
	public void I_PositiveMap(IMV_SIQ positiveMap);
	public IMV_SIQ getNegativeMap();
	public void I_NegativeMap(IMV_SIQ negativeMap);
	public IMV_SIQ getMotivationMap() ;
	public void I_MotivationMap(IMV_SIQ motivationMap);
	public IMV_SIQ getTrendingMap() ;
	public void I_TrendingMap(IMV_SIQ trendingMap);
	public IMV_SIQ getPredictionMap() ;
	public void I_PredictionMap(IMV_SIQ predictionMap);
	public IMV_SIQ getDistinctionMap() ;
	public void I_DistinctionMap(IMV_SIQ distinctionMap);
}
