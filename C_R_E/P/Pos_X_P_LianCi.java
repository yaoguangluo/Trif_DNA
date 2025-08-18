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

// Pos_X_P_LianCi 76 行 缺失3行函数，我知道2019年为什么婆婆 要我相亲，又学货车了，
// 刚好2019年当年检查和准备写到这3行检查的时候打断了我的跟进思维。我要做的是严防能
// 轻易靠近我的本地亲戚。特别是严防无继承关系的直系亲戚。间接说明我写代码有人帮？要不是
// 最近我开始写地毯式商业测试，全源码覆盖和使用测试，除了面对本地人无尽滋扰，7年了无一人告知我。。。
// 同时我也清楚了，我当年数十万字的复制网上的文字进行数月的分词测试，都没有碰到这个组合条件，检测这个问题出来，
// 说明浏览器的显示return到我电脑终端的时候也早就过滤了这个 -和- 的三字 问题，花钱买拆开机无敌
// 哈哈 面对这种问题我要做的是地毯式功能测试即可。稍后做整体 含null功能测试。间接说明，mock等api
// 是一种整体的规范式编码测试，只是对于需要专业类结果导向的功能测试趋近无效。 --罗瑶光

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
        outputList.add(strings[S_Pos.INT_ZERO]);//奇怪我3三字的连词关于单字没匹配这行函数缺失了？2025
        fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO, fixWord[S_Pos.INT_ZERO].length());
        fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
        return countLength - S_Pos.INT_THREE;
    }
//奇怪没做为什么要减去？
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
