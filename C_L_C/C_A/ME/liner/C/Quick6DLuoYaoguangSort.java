package C_A.ME.liner.C;

import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public interface Quick6DLuoYaoguangSort {
	void quick6DLuoYaoGuangSortWordFrequency(List<WordFrequency> list, int leftPosition
		, int rightPosition);
	int partitionList(List<WordFrequency> list, int leftPosition, int rightPosition);
	List<WordFrequency> frequencyWordMapToList(IMV_SIQ_SS map);
	void quick6DLuoYaoGuangSortWordFrequency(IMV_SIQ_S_ map, int leftPosition
		, int rightPosition);
	int partition(IMV_SIQ_S_ map, int leftPosition, int rightPosition);
	IMV_SIQ_S_ frequencyWordMapToMap(IMV_SIQ_SS map);
}
