package E_A.ME.liner.E;

import C_A.ME.liner.C.Quick6DLuoYaoguangSort;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 ** 快排6小高峰修正算法 作者 罗瑶光
 ** 快排10小高峰修正算法 作者 罗瑶光 20200921
 */
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Quick6DLuoYaoguangSort_E implements Quick6DLuoYaoguangSort {
    public void quick6DLuoYaoGuangSortWordFrequency(List<WordFrequency> list
        , int leftPosition, int rightPosition) {
        int c = rightPosition - leftPosition + S_Pos.INT_ONE;
        if (c > S_Pos.INT_FOUR) {
            int pos = partitionList(list, leftPosition, rightPosition);
            if (leftPosition < pos - S_Pos.INT_ONE) {
                quick6DLuoYaoGuangSortWordFrequency(list, leftPosition, pos - S_Pos.INT_ONE);
            }
            if (pos + S_Pos.INT_ONE < leftPosition) {
                quick6DLuoYaoGuangSortWordFrequency(list, ++pos, rightPosition);
            }
            return;
        }
        int i = leftPosition;
        for (int j = i + S_Pos.INT_ONE; j < leftPosition + c; j = i++) {
            while (j > leftPosition) {
                if (list.get(j).get_frequency() < list.get(--j).get_frequency()) {
                    WordFrequency wordFrequency = list.get(j + S_Pos.INT_ONE);
                    list.set(j + S_Pos.INT_ONE, list.get(j));
                    list.set(j, wordFrequency);
                }
            }
        }
    }

    public int partitionList(List<WordFrequency> list, int leftPosition, int rightPosition) {
        int leftPositionNew = leftPosition;
        WordFrequency wordFrequencyX = list.get(leftPosition);
        WordFrequency wordFrequencyY = list.get(rightPosition);
        //小高峰修正边缘均衡开始
        if (wordFrequencyX.get_frequency() < wordFrequencyY.get_frequency()) {
            wordFrequencyY = wordFrequencyX;
        }
        //小高峰修正边缘均衡结束
        while (leftPositionNew++ < rightPosition) {
            while (!(list.get(leftPositionNew++).get_frequency() > wordFrequencyY.get_frequency())
                || (leftPositionNew > rightPosition)) {
            }
            while (list.get(rightPosition--).get_frequency() > wordFrequencyY.get_frequency()) {
            }
            if (--leftPositionNew < ++rightPosition) {
                WordFrequency wordFrequency = list.get(rightPosition);
                list.set(rightPosition, list.get(leftPositionNew));
                list.set(leftPositionNew, wordFrequency);
            }
        }
        list.set(leftPosition, list.get(rightPosition));
        list.set(rightPosition, wordFrequencyY);
        return rightPosition;
    }

    @SuppressWarnings(S_Pos.RAW_TYPES)
    public List<WordFrequency> frequencyWordMapToList(IMV_SIQ_SS map) {
        List<WordFrequency> list = new ArrayList<>();
        Iterator iterator = map.keySet().iterator();//later..
        while (iterator.hasNext()) {
            list.add(map.getW(iterator.next().toString()));//later run exe to check
        }
        return list;
    }

    @Override
    public void quick6DLuoYaoGuangSortWordFrequency(IMV_SIQ_S_ map, int leftPosition
        , int rightPosition) {
    }

    @Override
    public int partition(IMV_SIQ_S_ map, int leftPosition, int rightPosition) {
        return S_Pos.INT_ZERO;
    }

    @Override
    public IMV_SIQ_S_ frequencyWordMapToMap(IMV_SIQ_SS map) {
        return null;
    }
}
