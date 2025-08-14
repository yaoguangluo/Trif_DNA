package P;

import C_A.OCI.ME.pos.CP.X_P_LianCi;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

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

public class Pos_X_P_LianCi extends Pos_X_P_JieCi implements X_P_LianCi {
    public int P_LianCiPostFixOfThree(List<String> outputList, int countLength,
                                      String[] strings, StringBuilder[] prefixWord) {
        if (S_Maps.lianCi.containsKey(strings[S_Pos.INT_TWO])) {
            countLength = charOfThree(countLength, outputList, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
            countLength = twoCharOfThree(countLength, outputList, strings, prefixWord);
            return countLength;
        }
        return countLength;
    }

    public int P_LianCiOfThree(List<String> outputList, int countLength
        , String[] strings, StringBuilder[] fixWord) {
        if (outputList.size() == S_Pos.INT_ZERO) {
            didNotFindFirstChar(outputList, strings, fixWord);
            return countLength;
        }
        if (wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            && (S_Maps.mingCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.fuCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.daiCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.weiCi.containsKey(fixWord[S_Pos.INT_ZERO].toString()))) {
            countLength = charOfThree(countLength, outputList, strings, fixWord);
            return countLength;
        }
        if (wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            && (S_Maps.zhuCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.shengLueCi.containsKey(fixWord[S_Pos.INT_ZERO].toString()))) {
            for (int BackPosition = S_Pos.INT_ZERO; BackPosition
                < fixWord[S_Pos.INT_ONE].length(); BackPosition++) {
                int[] nestCountInputStringLength = new int[S_Pos.INT_ONE];
                int result = loopCheckBackFix(fixWord, BackPosition
                    , countLength, outputList, strings, nestCountInputStringLength);
                if (result == S_Pos.INT_RIGHT) {
                    return nestCountInputStringLength[S_Pos.INT_ZERO];
                }
            }
            if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
                outputList.add(strings[S_Pos.INT_ONE]);
                fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
                return countLength - S_Pos.INT_ONE;
            }
            return countLength - S_Pos.INT_THREE;
        }
        if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
            outputList.add(strings[S_Pos.INT_ONE]);
            fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
            return countLength - S_Pos.INT_ONE;
        }
        return countLength - S_Pos.INT_THREE;
    }

    public int P_LianCiOfThreeForMap(IMV_SIQ_SS outputList
        , int countLength, String[] strings, StringBuilder[] fixWord, App NE) {
        if (outputList.size() == S_Pos.INT_ZERO) {
            didNotFindFirstCharForMap(outputList, strings, fixWord, NE);
            return countLength;
        }
        if (wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            && (S_Maps.mingCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.daiCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.weiCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.dongCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.fuCi.containsKey(fixWord[S_Pos.INT_ZERO].toString()))) {
            countLength = charOfThreeForMap(countLength, outputList, strings, fixWord, NE);
            return countLength;
        }
        if (wordsForest.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            && (S_Maps.zhuCi.containsKey(fixWord[S_Pos.INT_ZERO].toString())
            || S_Maps.shengLueCi.containsKey(fixWord[S_Pos.INT_ZERO].toString()))) {
            for (int BackPosition = S_Pos.INT_ZERO
                 ; BackPosition < fixWord[S_Pos.INT_ONE].length(); BackPosition++) {
                int[] nestCountInputStringLength = new int[S_Pos.INT_ONE];
                int result = loopCheckBackFixForMap(fixWord, BackPosition
                    , countLength, outputList, strings, nestCountInputStringLength, NE);
                if (result == S_Pos.INT_RIGHT) {
                    return nestCountInputStringLength[S_Pos.INT_ZERO];
                }
            }
            countLength -= S_Pos.INT_THREE;
            if (wordsForest.containsKey(strings[S_Pos.INT_ONE])) {
                WordFrequency wordFrequency;
                if (outputList.containsKey(strings[S_Pos.INT_ONE])) {
                    wordFrequency = outputList.getW(strings[S_Pos.INT_ONE]);
                    wordFrequency.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
                } else {
                    wordFrequency = new WordFrequency(1.0, strings[S_Pos.INT_ONE]);
                }
                wordFrequency.positions.add(NE._I_U.parserCharPosition);
                outputList.put(strings[S_Pos.INT_ONE], wordFrequency);
                fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
                fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ONE]);
                countLength += S_Pos.INT_TWO;
            }
            return countLength;
        }
        countLength -= S_Pos.INT_THREE;
        if (wordsForest.containsKey(strings[S_Pos.INT_ONE])) {
            WordFrequency wordFrequency;
            if (outputList.containsKey(strings[S_Pos.INT_ONE])) {
                wordFrequency = outputList.getW(strings[S_Pos.INT_ONE]);
                wordFrequency.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
            } else {
                wordFrequency = new WordFrequency(1.0, strings[S_Pos.INT_ONE]);
            }
            wordFrequency.positions.add(NE._I_U.parserCharPosition);
            outputList.put(strings[S_Pos.INT_ONE], wordFrequency);
            fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
            countLength += S_Pos.INT_TWO;
        }
        return countLength;
    }
}
//114 //					WordFrequency wordFrequency= new WordFrequency();
////					wordFrequency.I_frequency(1.0);
////					wordFrequency.I_Word(strings[S_Pos.INT_ONE]);

//130 //				WordFrequency wordFrequency= new WordFrequency();
////				wordFrequency.I_frequency(1.0);
////				wordFrequency.I_Word(strings[S_Pos.INT_ONE]);