package U_V.ESU.array;

import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;

import java.util.Map;

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Double_ESU {
    public static Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray
        (double[] score, String[] nameScore) {
        Map<Double, Map<String, Boolean>> map = new IMV_SIQ();
        for (int i = 0; i < score.length; i++) {
            Map<String, Boolean> maps;
            if (map.containsKey(score[i])) {
                maps = map.get(score[i]);
            } else {
                maps = new IMV_SIQ();
            }
            //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
            if (maps.containsKey(nameScore[i].toString())) {
                //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
                maps.put(nameScore[i].toString() + S_Common.STRING_EMPTY + maps.size() + 1, true);
            } else {
                maps.put(nameScore[i].toString(), true);
            }
            map.put(score[i], maps);
        }
        return map;
    }

    public static Map<Integer, Map<String, Boolean>> getMapFromIntStringArray
        (int[] score, String[] nameScore) {
        Map<Integer, Map<String, Boolean>> map = new IMV_SIQ();
        for (int i = 0; i < score.length; i++) {
            Map<String, Boolean> maps;
            if (map.containsKey(score[i])) {
                //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
                maps = map.get(score[i]);
            } else {
                maps = new IMV_SIQ();
            }
            //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
            if (maps.containsKey(nameScore[i].toString())) {
                //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
                maps.put(nameScore[i].toString() + S_Common.STRING_EMPTY + maps.size() + 1, true);
            } else {
                maps.put(nameScore[i].toString(), true);
            }
            map.put(score[i], maps);
        }
        return map;
    }

    //稍后并到int array 新文件中
    public static Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao
    (int[] score, String[] nameScore) {
        Map<Integer, Map<String, Boolean>> map = new IMV_SIQ();
        for (int i = 0; i < score.length; i++) {
            Map<String, Boolean> maps;
            if (map.containsKey(score[i])) {
                //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
                maps = map.get(score[i]);
            } else {
                maps = new IMV_SIQ();
            }
            //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
            if (maps.containsKey(nameScore[i].toString())) {
                //因为合并药材文件有相同名字所以用数字叠加模式。进行书籍分开
                maps.put(nameScore[i].toString() + S_Common.STRING_EMPTY + maps.size() + 1, true);
            } else {
                maps.put(nameScore[i].toString(), true);
            }
            map.put(score[i], maps);
        }
        return map;
    }
}
