package E;

import C_A.OCI.ME.nlp.C.Nlp_C_X_A_doPOSAndEMMCheck;
import ME.VPC.M.app.App;
import M_V.ME.word.forest.utils.Util_X_ContainsKey;
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

public class Nlp_CE_X_A_doPOSAndEMMCheck extends Nlp_CE_X_A_doSlangPartAndPOSCheck
    implements Nlp_C_X_A_doPOSAndEMMCheck {
    public int ofThree(int countLength, List<String> outputList, StringBuilder stringBuilder
        , StringBuilder[] prefixWord, int charPosition, StringBuilder textInputString) {
        String inputString = stringBuilder.toString();
        if (S_Maps.CiThree.containsKey(inputString)) {
            prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, prefixWord[S_Pos.INT_ZERO].length());
            prefixWord[S_Pos.INT_ZERO].append(inputString);
            outputList.add(inputString);
            return countLength;
        }
        String[] strings = new String[S_Pos.INT_FOUR];
        strings[S_Pos.INT_ZERO] = String.valueOf(inputString.charAt(S_Pos.INT_ZERO));
        strings[S_Pos.INT_ONE] = String.valueOf(inputString.charAt(S_Pos.INT_ZERO))
            + inputString.charAt(S_Pos.INT_ONE);
        strings[S_Pos.INT_TWO] = String.valueOf(inputString.charAt(S_Pos.INT_ONE))
            + inputString.charAt(S_Pos.INT_TWO);
        strings[S_Pos.INT_THREE] = String.valueOf(inputString.charAt(S_Pos.INT_TWO));
        if (null == prefixWord[S_Pos.INT_ZERO]) {
            if (S_Maps.CiThree.containsKey(inputString)) {
                prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, prefixWord[S_Pos.INT_ZERO].length());
                prefixWord[S_Pos.INT_ZERO].append(inputString);
                outputList.add(inputString);
                return countLength;
            }
            StringBuilder stringsBuilder = new StringBuilder();
            countLength = forTwoChar(--countLength, outputList
                , stringsBuilder.append(strings[S_Pos.INT_ONE])
                , prefixWord, charPosition, textInputString);
            return countLength;
        }
        if (!S_Maps.CiOne.containsKey(strings[S_Pos.INT_ZERO])) {
            StringBuilder stringsBuilder = new StringBuilder();
            stringsBuilder.append(strings[S_Pos.INT_ONE]);
            countLength = forTwoChar(--countLength, outputList, stringsBuilder
                , prefixWord, charPosition, textInputString);
            return countLength;
        }
        if (S_Maps.lianCi.containsKey(strings[S_Pos.INT_THREE])) {
            countLength = pos_X_P.P_LianCiPostFixOfThree(
                outputList, countLength, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.lianCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_LianCiOfThree(outputList
                , countLength, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.jieCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_JieCiOfThree(outputList
                , countLength, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.zhuCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_ZhuCiOfThree(outputList
                , countLength, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.liangCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_LiangCiOfThree(outputList
                , countLength, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.mingCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_MingCiOfThree(outputList
                , countLength, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.shiTaiCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_ShiTaiCiOfThree(outputList
                , countLength, strings, prefixWord);
            return countLength;
        }
        boolean A = S_Maps.dongCi.containsKey(strings[S_Pos.INT_ZERO]);
        boolean B = S_Maps.fuCi.containsKey(strings[S_Pos.INT_ZERO]);//later do
        if (A || B) {//later do
            boolean C = S_Maps.zhuCi.containsKey(prefixWord[S_Pos.INT_ZERO].toString());
            if (C) {
                boolean D = S_Maps.liangCi.containsKey(strings[S_Pos.INT_TWO]);
                boolean E = S_Maps.jieCi.containsKey(strings[S_Pos.INT_TWO]);
                if (D || E) {
                    countLength = pos_X_P.charOfThree(countLength, outputList, strings, prefixWord);
                    return countLength;
                }
            }
            boolean F = S_Maps.fuCi.containsKey(strings[S_Pos.INT_TWO]);
            boolean G = S_Maps.mingCi.containsKey(strings[S_Pos.INT_TWO]);
            boolean H = S_Maps.daiCi.containsKey(strings[S_Pos.INT_TWO]);
            if (F || G || H) {
                countLength = pos_X_P.charOfThree(countLength, outputList
                    , strings, prefixWord);
                return countLength;
            }
        }
        if (B) {
            countLength = pos_X_P.P_FuCiOfThree(outputList
                , countLength, strings, prefixWord);
            return countLength;
        }
        if (S_Maps.CiTwo.containsKey(strings[S_Pos.INT_ONE])) {
            StringBuilder stringsBuilder = new StringBuilder();
            stringsBuilder.append(strings[S_Pos.INT_ONE]);
            countLength = forTwoChar(--countLength, outputList, stringsBuilder
                , prefixWord, charPosition, textInputString);
            return countLength;
        }
        outputList.add(strings[S_Pos.INT_ZERO]);
        prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, prefixWord[S_Pos.INT_ZERO].length());
        prefixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
        return S_Pos.INT_ONE;
    }

    public int ofThreeForMap(int countLength, IMV_SIQ_SS outputList
        , StringBuilder stringBuilder, StringBuilder[] prefixWord, App NE) {
        String inputString = stringBuilder.toString();
        if (wordsForest.containsKey(inputString)) {
            Util_X_ContainsKey._E(outputList, inputString, prefixWord, NE);
            return countLength;
        }
        String[] strings = new String[S_Pos.INT_FOUR];
        strings[S_Pos.INT_ZERO] = String.valueOf(inputString.charAt(S_Pos.INT_ZERO));
        strings[S_Pos.INT_ONE] = String.valueOf(inputString.charAt(S_Pos.INT_ZERO))
            + inputString.charAt(S_Pos.INT_ONE);
        strings[S_Pos.INT_TWO] = String.valueOf(inputString.charAt(S_Pos.INT_ONE)
            + inputString.charAt(S_Pos.INT_TWO));
        strings[S_Pos.INT_THREE] = String.valueOf(inputString.charAt(S_Pos.INT_TWO));
        if (null == prefixWord[S_Pos.INT_ZERO]) {
            if (wordsForest.containsKey(inputString)) {
                Util_X_ContainsKey._E(outputList, inputString, prefixWord, NE);
                return countLength;
            }
            StringBuilder stringsBuilder = new StringBuilder();
            countLength = forTwoCharForMap(--countLength, outputList
                , stringsBuilder.append(strings[S_Pos.INT_ONE]), prefixWord, NE);
            return countLength;
        }
        if (!wordsForest.containsKey(strings[S_Pos.INT_ZERO])) {
            StringBuilder stringsBuilder = new StringBuilder();
            countLength = forTwoCharForMap(--countLength, outputList
                , stringsBuilder.append(strings[S_Pos.INT_ONE]), prefixWord, NE);
            return countLength;
        }
        if (S_Maps.zhuCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_ZhuCiOfThreeForMap(outputList, countLength, strings, prefixWord, NE);
            return countLength;
        }
        if (S_Maps.liangCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_LiangCiOfThreeForMap(outputList, countLength, strings, prefixWord, NE);
            return countLength;
        }
        if (S_Maps.jieCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_JieCiOfThreeForMap(outputList, countLength, strings, prefixWord, NE);
            return countLength;
        }
        if (S_Maps.lianCi.containsKey(strings[S_Pos.INT_ZERO])) {
            countLength = pos_X_P.P_LianCiOfThreeForMap(outputList, countLength, strings, prefixWord, NE);
            return countLength;
        }
        StringBuilder stringsBuilder = new StringBuilder();
        countLength = forTwoCharForMap(--countLength, outputList
            , stringsBuilder.append(strings[S_Pos.INT_ONE]), prefixWord, NE);
        return countLength;
    }
}
//@Override
//public int forMap(int countLength, Map<String, WordFrequency> outputList, Map<String, String> wordsForest,
//		StringBuilder stringBuilder, StringBuilder[] prefixWord, X_P posUtils) {
//	// TODO Auto-generated method stub
//	return 0;
//}
