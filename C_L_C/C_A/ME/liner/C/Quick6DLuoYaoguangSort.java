package C_A.ME.liner.C;

import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SQI_SS;
import S_A.pheromone.IMV_SQI_S_;

import java.util.List;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */

public interface Quick6DLuoYaoguangSort {
	void quick6DLuoYaoGuangSortWordFrequency(List<WordFrequency> list, int leftPosition
		, int rightPosition);
	int partitionList(List<WordFrequency> list, int leftPosition, int rightPosition);
	List<WordFrequency> frequencyWordMapToList(IMV_SQI_SS map);
	void quick6DLuoYaoGuangSortWordFrequency(IMV_SQI_S_ map, int leftPosition
		, int rightPosition);
	int partition(IMV_SQI_S_ map, int leftPosition, int rightPosition);
	IMV_SQI_S_ frequencyWordMapToMap(IMV_SQI_SS map);
}
