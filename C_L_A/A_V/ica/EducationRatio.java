package A_V.ica;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;
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
public class EducationRatio {

    public double[] getEducationKernel(String text, CogsBinaryForest_AE _AE, App NE) {
        CogsBinaryForest_AE _A = _AE;
        IMV_SIQ pos = _A.getPosCnToCn();
        List<String> sets = _A.parserMixedString(text);
        IMV_SIQ_S_ map = _A.getWordFrequencyByReturnSortMap(sets, NE);
        double[] output = new double[S_Pos.INT_SEVEN];
        output[S_Pos.INT_ZERO] = (double) (sets.size());
        Iterator<Integer> iterator = map.keySet().iterator();
        Here:
        while (iterator.hasNext()) {
            WordFrequency wordFrequency = map.getW(iterator.next());
            if (!pos.containsKey(wordFrequency.get_word())) {
                continue Here;
            }
            if (pos.getString(wordFrequency.get_word()).contains(S_Pos.NLP_ZI_MING)) {
                output[S_Pos.INT_ONE] += S_Pos.INT_ONE;
                continue Here;
            }
            if (pos.getString(wordFrequency.get_word()).contains(S_Pos.NLP_ZI_DONG)) {
                output[S_Pos.INT_TWO] += S_Pos.INT_ONE;
                continue Here;
            }
            if (pos.getString(wordFrequency.get_word()).contains(S_Pos.NLP_ZI_WEI)) {
                output[S_Pos.INT_FOUR] += S_Pos.INT_ONE;
                continue Here;
            }
            if (pos.getString(wordFrequency.get_word()).contains(S_Pos.NLP_ZI_XING)) {
                output[S_Pos.INT_THREE] += S_Pos.INT_ONE;
                continue Here;
            }
            if (pos.getString(wordFrequency.get_word()).contains(S_Pos.NLP_ZI_FU)) {
                output[S_Pos.INT_FIVE] += S_Pos.INT_ONE;
                continue Here;
            }
            if (pos.getString(wordFrequency.get_word()).contains(S_Pos.NLP_ZI_JIE)) {
                output[S_Pos.INT_SIX] += S_Pos.INT_ONE;
            }
        }
        return output;
    }

    public double[] getEducationRatioKernel(double[] input) {
        double[] output = new double[input.length];
        for (int i = S_Pos.INT_ZERO; i < input.length; i++) {
            output[i] = input[i] / input[S_Pos.INT_ZERO];
        }
        return output;
    }
}
