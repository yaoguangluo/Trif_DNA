package E_A.ME.liner.E;

import C_A.ME.liner.C.Quick6DLuoYaoguangSort;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;
import S_A.pheromone.IMV_SIQ_S_;

import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Quick6DLuoYaoguangSort3DMap_E implements Quick6DLuoYaoguangSort {
    @Override
    public void quick6DLuoYaoGuangSortWordFrequency(IMV_SIQ_S_ map
        , int leftPosition, int rightPosition) {
        if (leftPosition < rightPosition) {
            int c = rightPosition - leftPosition + S_Pos.INT_ONE;
            if (c < S_Pos.INT_FOUR) {
                int j;
                for (int i = S_Pos.INT_ONE + leftPosition; i < leftPosition + c; i++) {
                    j = i;
                    while (j >= S_Pos.INT_ONE + leftPosition) {
                        if (map.getW(j).get_frequency()
                            < map.getW(j - S_Pos.INT_ONE).get_frequency()) {
                            WordFrequency wordFrequency = map.getW(j);
                            map.put(j, map.get(j - S_Pos.INT_ONE));
                            map.put(j - S_Pos.INT_ONE, wordFrequency);
                        }
                        j--;
                    }
                }
                return;
            }
            int pos = partition(map, leftPosition, rightPosition);
            quick6DLuoYaoGuangSortWordFrequency(map, leftPosition, pos - S_Pos.INT_ONE);
            quick6DLuoYaoGuangSortWordFrequency(map, ++pos, rightPosition);
        }
    }

    @Override
    public int partition(IMV_SIQ_S_ map, int leftPosition, int rightPosition) {
        int leftPositionNew = leftPosition;
        WordFrequency wordFrequencyX = map.getW(leftPosition);
        WordFrequency wordFrequencyY = map.getW(rightPosition);
        wordFrequencyY = wordFrequencyX.get_frequency() <= wordFrequencyY.get_frequency()
            ? wordFrequencyX : wordFrequencyY;
        while (leftPositionNew < rightPosition) {
            while (!(map.getW(leftPositionNew++).get_frequency() > wordFrequencyY.get_frequency()
                || leftPositionNew > rightPosition)) {
            }
            while (map.getW(rightPosition--).get_frequency() > wordFrequencyY.get_frequency()) {
            }
            if (--leftPositionNew < ++rightPosition) {
                WordFrequency wordFrequency = map.getW(rightPosition);
                map.put(rightPosition, map.get(leftPositionNew));
                map.put(leftPositionNew, wordFrequency);
            }
        }
        map.put(leftPosition, map.get(rightPosition));
        map.put(rightPosition, wordFrequencyY);
        return rightPosition;
    }

    @SuppressWarnings(S_Pos.RAW_TYPES)
    public IMV_SIQ_S_ frequencyWordMapToMap(IMV_SIQ_SS map) {
        IMV_SIQ_S_ listMap = new IMV_SIQ_S_();
        Iterator iterator = map.keySet().iterator();
        int c = S_Pos.INT_ZERO;
        while (iterator.hasNext()) {
            listMap.put(c++, map.get(iterator.next()));
        }
        return listMap;
    }

    public void quick6DLuoYaoGuangSortWordFrequency(List<WordFrequency> list
        , int leftPosition, int rightPosition) {
    }

    public int partitionList(List<WordFrequency> list, int leftPosition, int rightPosition) {
        return S_Pos.INT_ZERO;
    }

    public List<WordFrequency> frequencyWordMapToList(IMV_SIQ_SS map) {
        return null;
    }
}
